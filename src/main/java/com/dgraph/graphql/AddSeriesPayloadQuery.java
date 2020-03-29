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
public class AddSeriesPayloadQuery extends Query<AddSeriesPayloadQuery> {
    AddSeriesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class SeriesArguments extends Arguments {
        SeriesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SeriesArguments filter(SeriesFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SeriesArguments order(SeriesOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SeriesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SeriesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SeriesArgumentsDefinition {
        void define(SeriesArguments args);
    }

    /**
    * 
    */
    public AddSeriesPayloadQuery series(SeriesQueryDefinition queryDef) {
        return series(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddSeriesPayloadQuery series(SeriesArgumentsDefinition argsDef, SeriesQueryDefinition queryDef) {
        startField("series");

        SeriesArguments args = new SeriesArguments(_queryBuilder);
        argsDef.define(args);
        SeriesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SeriesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
