## 依赖项目

https://github.com/Shopify/graphql_java_gen

##  Query 应该修改为 QueryRoot
    https://app.shopify.com/services/graphql/introspection/storefront?api_client_api_key=4a6c829ec3cb12ef9004bf8ed27adf12&api_version=2020-01


## dgraph 文档

https://graphql.dgraph.io/docs/quick-start/

## docker 安装 dgraph

docker run -p 8080:8080 -it -v /mnt/dgraph:/dgraph dgraph/standalone:v2.0.0-rc1

## Rect 工具

https://play.dgraph.io/


## 下载 schema.json

    gradlew :downloadApolloSchema -Pcom.apollographql.apollo.endpoint=https://play.dgraph.io/graphql -Pcom.apollographql.apollo.schema=src/main/graphql/schema.json


## 进入 schema.json 的目录

    cd app/src/main/graphql

## 使用下面命令修改Query 为 QueryRoot

    java -jar schema-utils.jar schema.json
