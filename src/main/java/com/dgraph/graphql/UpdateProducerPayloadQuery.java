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
public class UpdateProducerPayloadQuery extends Query<UpdateProducerPayloadQuery> {
    UpdateProducerPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ProducerArguments extends Arguments {
        ProducerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProducerArguments filter(ProducerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProducerArguments order(ProducerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProducerArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProducerArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProducerArgumentsDefinition {
        void define(ProducerArguments args);
    }

    /**
    * 
    */
    public UpdateProducerPayloadQuery producer(ProducerQueryDefinition queryDef) {
        return producer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateProducerPayloadQuery producer(ProducerArgumentsDefinition argsDef, ProducerQueryDefinition queryDef) {
        startField("producer");

        ProducerArguments args = new ProducerArguments(_queryBuilder);
        argsDef.define(args);
        ProducerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProducerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
