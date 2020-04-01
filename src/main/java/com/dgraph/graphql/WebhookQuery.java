// Generated from graphql_java_gen gem

package com.dgraph.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 网络钩子是“用户定义的HTTP回调”。[2]网络钩子通常被某些事件激活，比如将代码推送到源[3]或评论博客。[4]当此事件发生时，原网站将向为网络钩子配置的URL发送HTTP请求。用户可配置它们引发网
* 页上的事件以调用另一个网站的行为。Webhooks allow external services to be notified when certain events happen.
*/
public class WebhookQuery extends Query<WebhookQuery> {
    WebhookQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public WebhookQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public WebhookQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public WebhookQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public WebhookQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public WebhookQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public WebhookQuery description() {
        startField("description");

        return this;
    }

    /**
    * 回调url
    */
    public WebhookQuery payloadUrl() {
        startField("payloadUrl");

        return this;
    }

    /**
    * 回调提交的数据内容类型如application/json
    */
    public WebhookQuery contentType() {
        startField("contentType");

        return this;
    }

    /**
    * 使用payloadUrl的安全token
    */
    public WebhookQuery secret() {
        startField("secret");

        return this;
    }

    public class CreatorArguments extends Arguments {
        CreatorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CreatorArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreatorArgumentsDefinition {
        void define(CreatorArguments args);
    }

    /**
    * 【作者】 该 CreativeWork 的创作者/作者。
    */
    public WebhookQuery creator(UserQueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    * 【作者】 该 CreativeWork 的创作者/作者。
    */
    public WebhookQuery creator(CreatorArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 【创建日期】 创作出CreativeWork的日期。 The date on which the CreativeWork was created or the item was added to a
    * DataFeed. dateCreated    DateTime or Date or DataFeedItem or CreativeWork
    */
    public WebhookQuery dateCreated() {
        startField("dateCreated");

        return this;
    }

    public class ClientArguments extends Arguments {
        ClientArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ClientArguments filter(SoftwareApplicationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ClientArgumentsDefinition {
        void define(ClientArguments args);
    }

    /**
    * 调用此webhook的客户端
    */
    public WebhookQuery client(SoftwareApplicationQueryDefinition queryDef) {
        return client(args -> {}, queryDef);
    }

    /**
    * 调用此webhook的客户端
    */
    public WebhookQuery client(ClientArgumentsDefinition argsDef, SoftwareApplicationQueryDefinition queryDef) {
        startField("client");

        ClientArguments args = new ClientArguments(_queryBuilder);
        argsDef.define(args);
        ClientArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SoftwareApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
