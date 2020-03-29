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
public class FestivalSponsorshipQuery extends Query<FestivalSponsorshipQuery> {
    FestivalSponsorshipQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public FestivalSponsorshipQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public FestivalSponsorshipQuery name() {
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
        public FestivalsArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsArguments order(FilmOrder value) {
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
    public FestivalSponsorshipQuery festivals(FilmQueryDefinition queryDef) {
        return festivals(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FestivalSponsorshipQuery festivals(FestivalsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("festivals");

        FestivalsArguments args = new FestivalsArguments(_queryBuilder);
        argsDef.define(args);
        FestivalsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
