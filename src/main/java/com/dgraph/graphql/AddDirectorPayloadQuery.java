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
public class AddDirectorPayloadQuery extends Query<AddDirectorPayloadQuery> {
    AddDirectorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class DirectorArguments extends Arguments {
        DirectorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DirectorArguments filter(DirectorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DirectorArguments order(DirectorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DirectorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DirectorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DirectorArgumentsDefinition {
        void define(DirectorArguments args);
    }

    /**
    * 
    */
    public AddDirectorPayloadQuery director(DirectorQueryDefinition queryDef) {
        return director(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddDirectorPayloadQuery director(DirectorArgumentsDefinition argsDef, DirectorQueryDefinition queryDef) {
        startField("director");

        DirectorArguments args = new DirectorArguments(_queryBuilder);
        argsDef.define(args);
        DirectorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DirectorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
