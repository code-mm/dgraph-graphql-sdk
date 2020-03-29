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
public class UpdateFestivalEventPayloadQuery extends Query<UpdateFestivalEventPayloadQuery> {
    UpdateFestivalEventPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FestivaleventArguments extends Arguments {
        FestivaleventArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FestivaleventArguments filter(FestivalEventFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivaleventArguments order(FestivalEventOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivaleventArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FestivaleventArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FestivaleventArgumentsDefinition {
        void define(FestivaleventArguments args);
    }

    /**
    * 
    */
    public UpdateFestivalEventPayloadQuery festivalevent(FestivalEventQueryDefinition queryDef) {
        return festivalevent(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateFestivalEventPayloadQuery festivalevent(FestivaleventArgumentsDefinition argsDef, FestivalEventQueryDefinition queryDef) {
        startField("festivalevent");

        FestivaleventArguments args = new FestivaleventArguments(_queryBuilder);
        argsDef.define(args);
        FestivaleventArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
