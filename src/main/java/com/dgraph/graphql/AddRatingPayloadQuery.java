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
public class AddRatingPayloadQuery extends Query<AddRatingPayloadQuery> {
    AddRatingPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class RatingArguments extends Arguments {
        RatingArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RatingArguments filter(RatingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingArguments order(RatingOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RatingArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RatingArgumentsDefinition {
        void define(RatingArguments args);
    }

    /**
    * 
    */
    public AddRatingPayloadQuery rating(RatingQueryDefinition queryDef) {
        return rating(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddRatingPayloadQuery rating(RatingArgumentsDefinition argsDef, RatingQueryDefinition queryDef) {
        startField("rating");

        RatingArguments args = new RatingArguments(_queryBuilder);
        argsDef.define(args);
        RatingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RatingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
