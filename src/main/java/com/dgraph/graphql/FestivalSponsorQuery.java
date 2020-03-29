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
public class FestivalSponsorQuery extends Query<FestivalSponsorQuery> {
    FestivalSponsorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public FestivalSponsorQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public FestivalSponsorQuery name() {
        startField("name");

        return this;
    }

    public class FestivalsArguments extends Arguments {
        FestivalsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FestivalsArguments filter(FestivalFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsArguments order(FestivalOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FestivalsArgumentsDefinition {
        void define(FestivalsArguments args);
    }

    /**
    * 
    */
    public FestivalSponsorQuery festivals(FestivalQueryDefinition queryDef) {
        return festivals(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FestivalSponsorQuery festivals(FestivalsArgumentsDefinition argsDef, FestivalQueryDefinition queryDef) {
        startField("festivals");

        FestivalsArguments args = new FestivalsArguments(_queryBuilder);
        argsDef.define(args);
        FestivalsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
