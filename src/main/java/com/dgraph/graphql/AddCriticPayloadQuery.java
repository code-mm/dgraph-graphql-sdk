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
public class AddCriticPayloadQuery extends Query<AddCriticPayloadQuery> {
    AddCriticPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CriticArguments extends Arguments {
        CriticArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CriticArguments filter(CriticFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CriticArguments order(CriticOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CriticArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CriticArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CriticArgumentsDefinition {
        void define(CriticArguments args);
    }

    /**
    * 
    */
    public AddCriticPayloadQuery critic(CriticQueryDefinition queryDef) {
        return critic(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCriticPayloadQuery critic(CriticArgumentsDefinition argsDef, CriticQueryDefinition queryDef) {
        startField("critic");

        CriticArguments args = new CriticArguments(_queryBuilder);
        argsDef.define(args);
        CriticArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CriticQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
