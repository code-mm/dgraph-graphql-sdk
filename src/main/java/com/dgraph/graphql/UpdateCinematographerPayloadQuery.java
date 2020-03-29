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
public class UpdateCinematographerPayloadQuery extends Query<UpdateCinematographerPayloadQuery> {
    UpdateCinematographerPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CinematographerArguments extends Arguments {
        CinematographerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CinematographerArguments filter(CinematographerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CinematographerArguments order(CinematographerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CinematographerArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CinematographerArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CinematographerArgumentsDefinition {
        void define(CinematographerArguments args);
    }

    /**
    * 
    */
    public UpdateCinematographerPayloadQuery cinematographer(CinematographerQueryDefinition queryDef) {
        return cinematographer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCinematographerPayloadQuery cinematographer(CinematographerArgumentsDefinition argsDef, CinematographerQueryDefinition queryDef) {
        startField("cinematographer");

        CinematographerArguments args = new CinematographerArguments(_queryBuilder);
        argsDef.define(args);
        CinematographerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CinematographerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
