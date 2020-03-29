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
public class AddCrewGigPayloadQuery extends Query<AddCrewGigPayloadQuery> {
    AddCrewGigPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CrewgigArguments extends Arguments {
        CrewgigArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CrewgigArguments filter(CrewGigFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewgigArguments order(CrewGigOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewgigArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CrewgigArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CrewgigArgumentsDefinition {
        void define(CrewgigArguments args);
    }

    /**
    * 
    */
    public AddCrewGigPayloadQuery crewgig(CrewGigQueryDefinition queryDef) {
        return crewgig(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCrewGigPayloadQuery crewgig(CrewgigArgumentsDefinition argsDef, CrewGigQueryDefinition queryDef) {
        startField("crewgig");

        CrewgigArguments args = new CrewgigArguments(_queryBuilder);
        argsDef.define(args);
        CrewgigArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CrewGigQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
