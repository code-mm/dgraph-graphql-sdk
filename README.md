# 环境准备

- 安装ruby (下载地址 https://rubyinstaller.org/downloads/)

# 安装dgraph

- dgraph 文档 https://graphql.dgraph.io/docs/quick-start/

- Rect 工具 https://play.dgraph.io/

# 下载schema.json

- 借助apollographql下载 schema.json

        ./gradlew :downloadApolloSchema -Pcom.apollographql.apollo.endpoint=http://192.168.0.43:8080/graphql -Pcom.apollographql.apollo.schema=src/main/graphql/schema.json
        
  
# windows 一键部署

    deploy.bat  

# 测试项目地址

https://github.com/m-maohuawei/dgraph-graphql-sdk-test.git


## 使用example 

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        GraphClient graphClient = GraphClient.builder().setHttpClient(new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build())
                .setHeaders(headers)
                .setUrl("http://localhost:8080/graphql")
                .build();

        graphClient.mutateGraph(Operations.mutation(mutationQuery -> {
            List<AddProductInput> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                AddProductInput addProductInput = new AddProductInput();
                addProductInput.setName("测试商品" + i);
                list.add(addProductInput);
            }
            mutationQuery.addProduct(list, addProductPayloadQuery -> {
                addProductPayloadQuery
                        .numUids();
                addProductPayloadQuery.product(productQuery -> {
                    productQuery.name();
                    productQuery.productId();
                });
            });
        })).subscribe(new io.reactivex.SingleObserver<Mutation>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(Mutation mutation) {
                List<Product> product = mutation.getAddProduct().getProduct();
                for (Product it : product) {
                    System.out.println("插入成功 : id : " + it.getProductId() + " name : " + it.getName());
                }
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }
        });


        graphClient.queryGraph(Operations.query(queryRootQuery -> queryRootQuery.queryProduct(new ProductQueryDefinition() {
            @Override
            public void define(ProductQuery productQuery) {
                productQuery.name();
                productQuery.productId();
            }
        })))
                .subscribe(new SingleObserver<QueryRoot>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(QueryRoot queryRoot) {
                        List<Product> queryProduct = queryRoot.getQueryProduct();
                        for (Product it : queryProduct) {
                            System.out.println("查询成功 : id : " + it.getProductId() + " name : " + it.getName());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                });
