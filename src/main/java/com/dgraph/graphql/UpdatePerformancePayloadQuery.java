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
public class UpdatePerformancePayloadQuery extends Query<UpdatePerformancePayloadQuery> {
    UpdatePerformancePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PerformanceArguments extends Arguments {
        PerformanceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PerformanceArguments filter(PerformanceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformanceArguments order(PerformanceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformanceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PerformanceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PerformanceArgumentsDefinition {
        void define(PerformanceArguments args);
    }

    /**
    * 
    */
    public UpdatePerformancePayloadQuery performance(PerformanceQueryDefinition queryDef) {
        return performance(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdatePerformancePayloadQuery performance(PerformanceArgumentsDefinition argsDef, PerformanceQueryDefinition queryDef) {
        startField("performance");

        PerformanceArguments args = new PerformanceArguments(_queryBuilder);
        argsDef.define(args);
        PerformanceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PerformanceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
