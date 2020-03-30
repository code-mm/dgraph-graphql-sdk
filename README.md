## 依赖项目

   https://github.com/Shopify/graphql_java_gen

##  Query 应该修改为 QueryRoot

https://app.shopify.com/services/graphql/introspection/storefront?api_client_api_key=4a6c829ec3cb12ef9004bf8ed27adf12&api_version=2020-01

## dgraph 文档

https://graphql.dgraph.io/docs/quick-start/

## Rect 工具

https://play.dgraph.io/

## 下载 schema.json

    gradlew :downloadApolloSchema -Pcom.apollographql.apollo.endpoint=http://localhost:8080/graphql -Pcom.apollographql.apollo.schema=src/main/graphql/schema.json

## 进入 schema.json 的目录

    cd app/src/main/graphql

## 使用下面命令修改Query 为 QueryRoot

    java -jar schema-utils.jar schema.json
     
     
     
## bundle

    bundle
     
## 生成

    ruby  update_schema.rb
    
## 上次到maven仓库

    uploadArchives
    
    
## windows 一键操作

    deploy.bat  

