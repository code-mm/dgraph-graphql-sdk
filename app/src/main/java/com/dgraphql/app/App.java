package com.dgraphql.app;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.multidex.MultiDex;


import com.dgraph.graphql.*;

import com.shopify.buy3.GraphClient;
import com.shopify.buy3.HttpCachePolicy;
import com.shopify.buy3.MutationGraphCall;
import com.shopify.buy3.QueryGraphCall;
import com.shopify.graphql.support.ID;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Unit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;


public class App extends Application {

    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();


        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC))
                .build();


        GraphClient graphClient = GraphClient.Companion.build(this, "https://api.github.com/graphql", "Basic bWh3ODI4QHNpbmEuY29tOm1ody4yMDE3",
                builder -> {
                    builder.setHttpClient(httpClient);
                    builder.httpCache(getCacheDir(), config -> {
                        config.setCacheMaxSizeBytes(1024 * 1024 * 10);
                        config.setDefaultCachePolicy(HttpCachePolicy.Default.CACHE_FIRST.expireAfter(20, TimeUnit.MINUTES));
                        return Unit.INSTANCE;
                    });
                    return Unit.INSTANCE;
                }, null);


        QueryRootQuery query = Operations.query(new QueryRootQueryDefinition() {
            @Override
            public void define(QueryRootQuery _queryBuilder) {

                _queryBuilder.queryProduct(new ProductQueryDefinition() {
                    @Override
                    public void define(ProductQuery _queryBuilder) {
                        _queryBuilder.name();
                    }
                });
            }
        });


        QueryGraphCall queryGraphCall = graphClient.queryGraph(query);


        RxUtil.rxGraphQueryCall(queryGraphCall)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<QueryRoot>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(QueryRoot queryRoot) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        Log.e(TAG, "onError: " + e.getMessage());
                    }
                });


        MutationQuery hahahha = Operations.mutation(new MutationQueryDefinition() {
            @Override
            public void define(MutationQuery _queryBuilder) {
                AddProductInput addProductInput = new AddProductInput();
                addProductInput.setName("哈哈哈");
                ArrayList<AddProductInput> productInputs = new ArrayList<>();
                productInputs.add(addProductInput);
                _queryBuilder.addProduct(productInputs, new AddProductPayloadQueryDefinition() {
                    @Override
                    public void define(AddProductPayloadQuery _queryBuilder) {
                        _queryBuilder.numUids();
                    }
                });
            }
        });


        MutationGraphCall mutationGraphCall = graphClient.mutateGraph(hahahha);

        RxUtil.rxGraphMutationCall(mutationGraphCall)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new SingleObserver<Mutation>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(Mutation mutation) {


                    }

                    @Override
                    public void onError(Throwable e) {

                        Log.e(TAG, "onError: " + e.getMessage());

                    }
                });

        ;

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
