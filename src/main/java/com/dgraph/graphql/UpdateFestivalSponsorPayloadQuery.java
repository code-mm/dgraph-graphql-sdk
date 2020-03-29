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
public class UpdateFestivalSponsorPayloadQuery extends Query<UpdateFestivalSponsorPayloadQuery> {
    UpdateFestivalSponsorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FestivalsponsorArguments extends Arguments {
        FestivalsponsorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FestivalsponsorArguments filter(FestivalSponsorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsponsorArguments order(FestivalSponsorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsponsorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsponsorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FestivalsponsorArgumentsDefinition {
        void define(FestivalsponsorArguments args);
    }

    /**
    * 
    */
    public UpdateFestivalSponsorPayloadQuery festivalsponsor(FestivalSponsorQueryDefinition queryDef) {
        return festivalsponsor(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateFestivalSponsorPayloadQuery festivalsponsor(FestivalsponsorArgumentsDefinition argsDef, FestivalSponsorQueryDefinition queryDef) {
        startField("festivalsponsor");

        FestivalsponsorArguments args = new FestivalsponsorArguments(_queryBuilder);
        argsDef.define(args);
        FestivalsponsorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalSponsorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
