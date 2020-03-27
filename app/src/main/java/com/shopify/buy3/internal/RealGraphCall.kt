/*
 *   The MIT License (MIT)
 *
 *   Copyright (c) 2015 Shopify Inc.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */
package com.shopify.buy3.internal

import android.os.Handler

import androidx.annotation.VisibleForTesting
import com.dgraph.graphql.*
import com.shopify.buy3.GraphCall
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.GraphCallResultCallback
import com.shopify.buy3.GraphError
import com.shopify.buy3.GraphResponse
import com.shopify.buy3.HttpCachePolicy
import com.shopify.buy3.MutationGraphCall
import com.shopify.buy3.QueryGraphCall
import com.shopify.buy3.RetryHandler
import com.shopify.buy3.internal.cache.HTTP_CACHE_KEY_HEADER
import com.shopify.buy3.internal.cache.HttpCache
import com.shopify.graphql.support.AbstractResponse
import com.shopify.graphql.support.Query
import okhttp3.Call
import okhttp3.HttpUrl
import okhttp3.MediaType
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.Future
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

private const val ACCEPT_HEADER_NAME = "Accept"
private const val ACCEPT_HEADER = "application/json"
private val GRAPHQL_MEDIA_TYPE = MediaType.parse("application/graphql; charset=utf-8")
//private val GRAPHQL_MEDIA_TYPE = MediaType.parse("application/json")

internal class RealQueryGraphCall(
    query: QueryRootQuery,
    serverUrl: HttpUrl,
    httpCallFactory: Call.Factory,
    dispatcher: ScheduledExecutorService,
    httpCachePolicy: HttpCachePolicy,
    httpCache: HttpCache?
) : RealGraphCall<QueryRoot>(
    operation = query,
    serverUrl = serverUrl,
    httpCallFactory = httpCallFactory,
    httpResponseParser = HttpResponseParser<QueryRoot> { QueryRoot(it.data) },
    dispatcher = dispatcher,
    httpCachePolicy = httpCachePolicy,
    httpCache = httpCache
), QueryGraphCall {

    public override fun clone(): GraphCall<QueryRoot> {
        return RealQueryGraphCall(
            query = operation as QueryRootQuery,
            serverUrl = serverUrl,
            httpCallFactory = httpCallFactory,
            dispatcher = dispatcher,
            httpCachePolicy = httpCachePolicy,
            httpCache = httpCache
        )
    }

    @Synchronized
    override fun cachePolicy(httpCachePolicy: HttpCachePolicy): QueryGraphCall {
        if (executed) throw IllegalStateException("Already Executed")
        return RealQueryGraphCall(
            query = operation as QueryRootQuery,
            serverUrl = serverUrl,
            httpCallFactory = httpCallFactory,
            dispatcher = dispatcher,
            httpCachePolicy = httpCachePolicy,
            httpCache = httpCache
        )
    }

    override fun enqueue(callback: GraphCallResultCallback<QueryRoot>): QueryGraphCall {
        return super.enqueue(callback) as QueryGraphCall
    }

    override fun enqueue(
        callbackHandler: Handler?,
        callback: GraphCallResultCallback<QueryRoot>
    ): QueryGraphCall {
        return super.enqueue(
            callbackHandler = callbackHandler,
            callback = callback
        ) as QueryGraphCall
    }

    override fun enqueue(
        callbackHandler: Handler?,
        retryHandler: RetryHandler<QueryRoot>,
        callback: GraphCallResultCallback<QueryRoot>
    ): QueryGraphCall {
        return super.enqueue(
            callbackHandler = callbackHandler,
            retryHandler = retryHandler,
            callback = callback
        ) as QueryGraphCall
    }
}

internal class RealMutationGraphCall(
    mutation: MutationQuery,
    serverUrl: HttpUrl,
    httpCallFactory: Call.Factory,
    dispatcher: ScheduledExecutorService
) : RealGraphCall<Mutation>(
    operation = mutation,
    serverUrl = serverUrl,
    httpCallFactory = httpCallFactory,
    httpResponseParser = HttpResponseParser<Mutation> { Mutation(it.data) },
    dispatcher = dispatcher,
    httpCachePolicy = HttpCachePolicy.Default.NETWORK_ONLY,
    httpCache = null
), MutationGraphCall {

    public override fun clone(): GraphCall<Mutation> {
        return RealMutationGraphCall(
            mutation = operation as MutationQuery,
            serverUrl = serverUrl,
            httpCallFactory = httpCallFactory,
            dispatcher = dispatcher
        )
    }

    override fun enqueue(callback: GraphCallResultCallback<Mutation>): MutationGraphCall {
        return super.enqueue(callback) as MutationGraphCall
    }

    override fun enqueue(
        callbackHandler: Handler?,
        callback: GraphCallResultCallback<Mutation>
    ): MutationGraphCall {
        return super.enqueue(
            callbackHandler = callbackHandler,
            callback = callback
        ) as MutationGraphCall
    }

    override fun enqueue(
        callbackHandler: Handler?,
        retryHandler: RetryHandler<Mutation>,
        callback: GraphCallResultCallback<Mutation>
    ): MutationGraphCall {
        return super.enqueue(
            callbackHandler = callbackHandler,
            retryHandler = retryHandler,
            callback = callback
        ) as MutationGraphCall
    }
}

internal abstract class RealGraphCall<T : AbstractResponse<T>> protected constructor(
    protected val operation: Query<*>,
    protected val serverUrl: HttpUrl,
    protected val httpCallFactory: Call.Factory,
    protected val httpResponseParser: HttpResponseParser<T>,
    protected val dispatcher: ScheduledExecutorService,
    @VisibleForTesting internal val httpCachePolicy: HttpCachePolicy,
    protected val httpCache: HttpCache?
) : GraphCall<T>, Cloneable {
    protected var executed = false
    protected var canceled = false
    private var retryableGraphCall: RetryableGraphHttpCall<T>? = null

    override val isCanceled: Boolean
        get() = canceled

    @Synchronized
    override fun cancel() {
        if (canceled) return

        canceled = true
        retryableGraphCall = retryableGraphCall?.cancel().let { null }
    }

    override fun enqueue(callback: GraphCallResultCallback<T>): GraphCall<T> {
        return enqueue(callbackHandler = null, callback = callback)
    }

    override fun enqueue(
        callbackHandler: Handler?,
        callback: GraphCallResultCallback<T>
    ): GraphCall<T> {
        return enqueue(callbackHandler, RetryHandler.noRetry(), callback)
    }

    @Synchronized
    override fun enqueue(
        callbackHandler: Handler?,
        retryHandler: RetryHandler<T>,
        callback: GraphCallResultCallback<T>
    ): GraphCall<T> {
        executed = if (!executed) true else throw IllegalStateException("Already Executed")
        dispatcher.execute {
            enqueueInternal(
                callbackHandler = callbackHandler,
                retryHandler = retryHandler,
                callback = callback
            )
        }
        return this
    }

    @Synchronized
    private fun enqueueInternal(
        callbackHandler: Handler?,
        retryHandler: RetryHandler<T>,
        callback: GraphCallResultCallback<T>
    ) {
        if (canceled) {
            val action = { callback(GraphCallResult.Failure(GraphError.CallCanceledError())) }
            callbackHandler?.post(action) ?: action()
            return
        }

        retryableGraphCall = RetryableGraphHttpCall(
            httpCall = httpCallFactory.newGraphQLHttpCall(
                operation = operation,
                httpCache = httpCache,
                httpCachePolicy = httpCachePolicy,
                serverUrl = serverUrl
            ),
            httpResponseParser = httpResponseParser,
            httpCache = httpCache,
            retryHandler = retryHandler,
            dispatcher = dispatcher,
            callbackHandler = callbackHandler,
            resultCallback = callback
        ).also { it.enqueue() }
    }
}

internal fun Call.Factory.newGraphQLHttpCall(
    operation: Query<*>,
    httpCache: HttpCache?,
    serverUrl: HttpUrl,
    httpCachePolicy: HttpCachePolicy
): Call {

    // val body = RequestBody.create(GRAPHQL_MEDIA_TYPE, operation.toString())


    var str = operation.toString()

    var bodyString: String? = null;

    //bodyString =     "{\"query\":\""+operation.toString()+"\"}";
//    if(str.startsWith("mutation"))
//    {
//        bodyString=str;
//    }else{
//
//
//    }

    var jobj = JSONObject()
    jobj.put("query", operation.toString());

    println("bodyString : " + jobj.toString());

    val body = RequestBody.create(GRAPHQL_MEDIA_TYPE, jobj.toString())
    //val cacheKey = httpCache?.let { body.cacheKey } ?: ""
    val cacheExpireTimeout =
        (httpCachePolicy as? HttpCachePolicy.ExpirePolicy)?.expireTimeoutMs?.takeIf { it > 0 }
            ?: Long.MAX_VALUE
    return newCall(
        Request.Builder()
            .url(serverUrl)
            .post(body)
            // 此处可以添加 头信息
            .build()
    )
}

private class RetryableGraphHttpCall<T : AbstractResponse<T>>(
    httpCall: Call,
    private val httpResponseParser: HttpResponseParser<T>,
    private val httpCache: HttpCache?,
    private val retryHandler: RetryHandler<T>,
    private val dispatcher: ScheduledExecutorService,
    private val callbackHandler: Handler?,
    resultCallback: GraphCallResultCallback<T>
) {
    private var canceled = false
    private val resultCallbackRef = AtomicReference(resultCallback)
    private var activeHttpCall: Call = httpCall
    private var retryFuture: Future<*>? = null

    @Synchronized
    fun enqueue() {
        if (canceled) return

        activeHttpCall = activeHttpCall.clone().also {
            it.enqueue(
                GraphHttpResultCallback(
                    httpResponseParser = httpResponseParser,
                    httpCache = httpCache
                ) { result ->
                    if (retryHandler.retry(result)) {
                        retry(retryHandler.nextRetryDelayMs, TimeUnit.MILLISECONDS)
                    } else {
                        result.dispatch()
                    }
                })
        }
    }

    @Synchronized
    private fun retry(delay: Long, timeUnit: TimeUnit) {
        if (canceled) return

        retryFuture = dispatcher.schedule({ enqueue() }, delay, timeUnit)
    }

    private fun GraphCallResult<T>.dispatch() {
        resultCallbackRef.getAndSet(null)?.also { callback ->
            callbackHandler?.post { callback(this) } ?: callback(this)
        }
    }

    @Synchronized
    fun cancel() {
        if (canceled) return

        canceled = true
        activeHttpCall.cancel()
        retryFuture = retryFuture?.cancel(true).let { null }
        GraphCallResult.Failure(GraphError.CallCanceledError()).dispatch()
    }
}

private class GraphHttpResultCallback<T : AbstractResponse<T>> constructor(
    private val httpResponseParser: HttpResponseParser<T>,
    private val httpCache: HttpCache?,
    private val resultCallback: GraphCallResultCallback<T>
) : okhttp3.Callback {

    override fun onFailure(call: Call, e: IOException) {
        resultCallback(
            GraphCallResult.Failure(
                GraphError.NetworkError(
                    "Failed to execute GraphQL http request",
                    e
                )
            )
        )
    }

    @Throws(IOException::class)
    override fun onResponse(call: Call, response: Response) {


//        println("hahahha "+ response.body().string())
        val graphResponse = try {
            response.parse()
        } catch (e: GraphError) {
            if (e is GraphError.ParseError) {
                httpCache?.purge(response.request())
            }
            resultCallback(GraphCallResult.Failure(e))
            return
        }

        if (graphResponse.hasErrors) {
            httpCache?.purge(response.request())
        }

        resultCallback(GraphCallResult.Success(graphResponse))
    }

    fun cancel() {
        resultCallback(GraphCallResult.Failure(GraphError.CallCanceledError()))
    }

    private fun Response.parse(): GraphResponse<T> {
        return use { httpResponseParser.parse(it) }
    }

    private fun HttpCache.purge(httpRequest: Request) {
        httpRequest.header(HTTP_CACHE_KEY_HEADER)?.let { cacheKey ->
            removeQuietly(cacheKey)
        }
    }
}

