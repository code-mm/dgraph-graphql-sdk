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
public class StoryContributorQuery extends Query<StoryContributorQuery> {
    StoryContributorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public StoryContributorQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public StoryContributorQuery name() {
        startField("name");

        return this;
    }

    public class StoryCreditsArguments extends Arguments {
        StoryCreditsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public StoryCreditsArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoryCreditsArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoryCreditsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public StoryCreditsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StoryCreditsArgumentsDefinition {
        void define(StoryCreditsArguments args);
    }

    /**
    * 
    */
    public StoryContributorQuery storyCredits(FilmQueryDefinition queryDef) {
        return storyCredits(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoryContributorQuery storyCredits(StoryCreditsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("story_credits");

        StoryCreditsArguments args = new StoryCreditsArguments(_queryBuilder);
        argsDef.define(args);
        StoryCreditsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
