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
public class AddFestivalPayloadQuery extends Query<AddFestivalPayloadQuery> {
    AddFestivalPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FestivalArguments extends Arguments {
        FestivalArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FestivalArguments filter(FestivalFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalArguments order(FestivalOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FestivalArgumentsDefinition {
        void define(FestivalArguments args);
    }

    /**
    * 
    */
    public AddFestivalPayloadQuery festival(FestivalQueryDefinition queryDef) {
        return festival(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddFestivalPayloadQuery festival(FestivalArgumentsDefinition argsDef, FestivalQueryDefinition queryDef) {
        startField("festival");

        FestivalArguments args = new FestivalArguments(_queryBuilder);
        argsDef.define(args);
        FestivalArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
