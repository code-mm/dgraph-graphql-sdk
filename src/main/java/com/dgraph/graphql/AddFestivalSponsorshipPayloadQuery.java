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
public class AddFestivalSponsorshipPayloadQuery extends Query<AddFestivalSponsorshipPayloadQuery> {
    AddFestivalSponsorshipPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FestivalsponsorshipArguments extends Arguments {
        FestivalsponsorshipArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FestivalsponsorshipArguments filter(FestivalSponsorshipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsponsorshipArguments order(FestivalSponsorshipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsponsorshipArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsponsorshipArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FestivalsponsorshipArgumentsDefinition {
        void define(FestivalsponsorshipArguments args);
    }

    /**
    * 
    */
    public AddFestivalSponsorshipPayloadQuery festivalsponsorship(FestivalSponsorshipQueryDefinition queryDef) {
        return festivalsponsorship(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddFestivalSponsorshipPayloadQuery festivalsponsorship(FestivalsponsorshipArgumentsDefinition argsDef, FestivalSponsorshipQueryDefinition queryDef) {
        startField("festivalsponsorship");

        FestivalsponsorshipArguments args = new FestivalsponsorshipArguments(_queryBuilder);
        argsDef.define(args);
        FestivalsponsorshipArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalSponsorshipQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
