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
public class AddSongPerformerPayloadQuery extends Query<AddSongPerformerPayloadQuery> {
    AddSongPerformerPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class SongperformerArguments extends Arguments {
        SongperformerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SongperformerArguments filter(SongPerformerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongperformerArguments order(SongPerformerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongperformerArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SongperformerArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SongperformerArgumentsDefinition {
        void define(SongperformerArguments args);
    }

    /**
    * 
    */
    public AddSongPerformerPayloadQuery songperformer(SongPerformerQueryDefinition queryDef) {
        return songperformer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddSongPerformerPayloadQuery songperformer(SongperformerArgumentsDefinition argsDef, SongPerformerQueryDefinition queryDef) {
        startField("songperformer");

        SongperformerArguments args = new SongperformerArguments(_queryBuilder);
        argsDef.define(args);
        SongperformerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SongPerformerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
