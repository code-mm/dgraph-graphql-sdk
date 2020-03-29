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
* 
*/
public class AddCollectionPayloadQuery extends Query<AddCollectionPayloadQuery> {
    AddCollectionPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CollectionArguments extends Arguments {
        CollectionArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CollectionArguments filter(CollectionFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CollectionArguments order(CollectionOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CollectionArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CollectionArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CollectionArgumentsDefinition {
        void define(CollectionArguments args);
    }

    /**
    * 
    */
    public AddCollectionPayloadQuery collection(CollectionQueryDefinition queryDef) {
        return collection(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCollectionPayloadQuery collection(CollectionArgumentsDefinition argsDef, CollectionQueryDefinition queryDef) {
        startField("collection");

        CollectionArguments args = new CollectionArguments(_queryBuilder);
        argsDef.define(args);
        CollectionArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
