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
public class SongPerformerQuery extends Query<SongPerformerQuery> {
    SongPerformerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public SongPerformerQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public SongPerformerQuery name() {
        startField("name");

        return this;
    }

    public class SongsArguments extends Arguments {
        SongsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SongsArguments filter(SongFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongsArguments order(SongOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SongsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SongsArgumentsDefinition {
        void define(SongsArguments args);
    }

    /**
    * 
    */
    public SongPerformerQuery songs(SongQueryDefinition queryDef) {
        return songs(args -> {}, queryDef);
    }

    /**
    * 
    */
    public SongPerformerQuery songs(SongsArgumentsDefinition argsDef, SongQueryDefinition queryDef) {
        startField("songs");

        SongsArguments args = new SongsArguments(_queryBuilder);
        argsDef.define(args);
        SongsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SongQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
