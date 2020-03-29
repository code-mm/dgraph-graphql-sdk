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
public class AddStoryContributorPayloadQuery extends Query<AddStoryContributorPayloadQuery> {
    AddStoryContributorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class StorycontributorArguments extends Arguments {
        StorycontributorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public StorycontributorArguments filter(StoryContributorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StorycontributorArguments order(StoryContributorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StorycontributorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public StorycontributorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StorycontributorArgumentsDefinition {
        void define(StorycontributorArguments args);
    }

    /**
    * 
    */
    public AddStoryContributorPayloadQuery storycontributor(StoryContributorQueryDefinition queryDef) {
        return storycontributor(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddStoryContributorPayloadQuery storycontributor(StorycontributorArgumentsDefinition argsDef, StoryContributorQueryDefinition queryDef) {
        startField("storycontributor");

        StorycontributorArguments args = new StorycontributorArguments(_queryBuilder);
        argsDef.define(args);
        StorycontributorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoryContributorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
