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
public class UpdateActorPayloadQuery extends Query<UpdateActorPayloadQuery> {
    UpdateActorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ActorArguments extends Arguments {
        ActorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ActorArguments filter(ActorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ActorArguments order(ActorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ActorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ActorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ActorArgumentsDefinition {
        void define(ActorArguments args);
    }

    /**
    * 
    */
    public UpdateActorPayloadQuery actor(ActorQueryDefinition queryDef) {
        return actor(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateActorPayloadQuery actor(ActorArgumentsDefinition argsDef, ActorQueryDefinition queryDef) {
        startField("actor");

        ActorArguments args = new ActorArguments(_queryBuilder);
        argsDef.define(args);
        ActorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ActorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
