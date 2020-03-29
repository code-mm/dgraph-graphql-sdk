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
public class UpdateSongPayloadQuery extends Query<UpdateSongPayloadQuery> {
    UpdateSongPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class SongArguments extends Arguments {
        SongArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SongArguments filter(SongFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongArguments order(SongOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SongArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SongArgumentsDefinition {
        void define(SongArguments args);
    }

    /**
    * 
    */
    public UpdateSongPayloadQuery song(SongQueryDefinition queryDef) {
        return song(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateSongPayloadQuery song(SongArgumentsDefinition argsDef, SongQueryDefinition queryDef) {
        startField("song");

        SongArguments args = new SongArguments(_queryBuilder);
        argsDef.define(args);
        SongArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SongQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
