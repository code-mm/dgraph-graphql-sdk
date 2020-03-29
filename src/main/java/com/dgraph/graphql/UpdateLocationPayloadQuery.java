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
public class UpdateLocationPayloadQuery extends Query<UpdateLocationPayloadQuery> {
    UpdateLocationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class LocationArguments extends Arguments {
        LocationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public LocationArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public LocationArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public LocationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public LocationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationArgumentsDefinition {
        void define(LocationArguments args);
    }

    /**
    * 
    */
    public UpdateLocationPayloadQuery location(LocationQueryDefinition queryDef) {
        return location(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateLocationPayloadQuery location(LocationArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("location");

        LocationArguments args = new LocationArguments(_queryBuilder);
        argsDef.define(args);
        LocationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
