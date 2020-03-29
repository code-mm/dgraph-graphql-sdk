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
public class AddCastingDirectorPayloadQuery extends Query<AddCastingDirectorPayloadQuery> {
    AddCastingDirectorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CastingdirectorArguments extends Arguments {
        CastingdirectorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CastingdirectorArguments filter(CastingDirectorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CastingdirectorArguments order(CastingDirectorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CastingdirectorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CastingdirectorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CastingdirectorArgumentsDefinition {
        void define(CastingdirectorArguments args);
    }

    /**
    * 
    */
    public AddCastingDirectorPayloadQuery castingdirector(CastingDirectorQueryDefinition queryDef) {
        return castingdirector(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCastingDirectorPayloadQuery castingdirector(CastingdirectorArgumentsDefinition argsDef, CastingDirectorQueryDefinition queryDef) {
        startField("castingdirector");

        CastingdirectorArguments args = new CastingdirectorArguments(_queryBuilder);
        argsDef.define(args);
        CastingdirectorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CastingDirectorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
