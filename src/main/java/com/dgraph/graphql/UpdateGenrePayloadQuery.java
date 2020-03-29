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
public class UpdateGenrePayloadQuery extends Query<UpdateGenrePayloadQuery> {
    UpdateGenrePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class GenreArguments extends Arguments {
        GenreArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public GenreArguments filter(GenreFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GenreArguments order(GenreOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GenreArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public GenreArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface GenreArgumentsDefinition {
        void define(GenreArguments args);
    }

    /**
    * 
    */
    public UpdateGenrePayloadQuery genre(GenreQueryDefinition queryDef) {
        return genre(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateGenrePayloadQuery genre(GenreArgumentsDefinition argsDef, GenreQueryDefinition queryDef) {
        startField("genre");

        GenreArguments args = new GenreArguments(_queryBuilder);
        argsDef.define(args);
        GenreArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GenreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
