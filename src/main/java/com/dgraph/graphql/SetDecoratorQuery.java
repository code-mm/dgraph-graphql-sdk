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
public class SetDecoratorQuery extends Query<SetDecoratorQuery> {
    SetDecoratorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public SetDecoratorQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public SetDecoratorQuery name() {
        startField("name");

        return this;
    }

    public class SetsDesignedArguments extends Arguments {
        SetsDesignedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SetsDesignedArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SetsDesignedArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SetsDesignedArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SetsDesignedArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SetsDesignedArgumentsDefinition {
        void define(SetsDesignedArguments args);
    }

    /**
    * 
    */
    public SetDecoratorQuery setsDesigned(FilmQueryDefinition queryDef) {
        return setsDesigned(args -> {}, queryDef);
    }

    /**
    * 
    */
    public SetDecoratorQuery setsDesigned(SetsDesignedArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("sets_designed");

        SetsDesignedArguments args = new SetsDesignedArguments(_queryBuilder);
        argsDef.define(args);
        SetsDesignedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
