package com.bdlbsc.graphql;
import com.dgraph.graphql.Mutation;
import com.dgraph.graphql.MutationQuery;
import com.dgraph.graphql.QueryRoot;
import com.dgraph.graphql.QueryRootQuery;;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;



public class GraphClient {

    private static final GraphClient client = new GraphClient();

    private HttpResponseParser httpResponseParser;

    public static GraphClient getInstance() {
        return client;
    }

    private GraphClient() {
        httpResponseParser = new HttpResponseParser();
    }

    private String url;

    public void setBaseUrl(String url) {
        this.url = url;
    }

    private Map<String, String> headers;

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }


    private OkHttpClient okHttpClient;

    public void setHttpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
        OkHttpUtils.getInstance().setClient(okHttpClient);
    }

    public Single<QueryRoot> queryGraph(final QueryRootQuery queryRootQuery) {

        return Single.create(new SingleOnSubscribe<QueryRoot>() {
            @Override
            public void subscribe(final SingleEmitter<QueryRoot> singleEmitter) throws Exception {

                String queryString = queryRootQuery.toString();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("query", queryString);

                OkHttpUtils.doRequestBody(headers, url, jsonObject.toString(), new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        singleEmitter.onError(e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        try {
                            QueryRoot root = httpResponseParser.parseQueryRoot(response);
                            singleEmitter.onSuccess(root);
                        } catch (Exception e) {
                            e.printStackTrace();
                            singleEmitter.onError(e);
                        }
                    }
                });
            }
        });
    }


    public Single<Mutation> mutateGraph(MutationQuery mutationQuery) {
        return Single.create(new SingleOnSubscribe<Mutation>() {
            @Override
            public void subscribe(SingleEmitter<Mutation> singleEmitter) throws Exception {

                String queryString = mutationQuery.toString();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("query", queryString);

                OkHttpUtils.doRequestBody(headers, url, jsonObject.toString(), new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        singleEmitter.onError(e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                        try {
                            Mutation mutation = httpResponseParser.parseMutation(response);
                            singleEmitter.onSuccess(mutation);
                        } catch (Exception e) {
                            e.printStackTrace();
                            singleEmitter.onError(e);
                        }
                    }
                });
            }
        });
    }
}
