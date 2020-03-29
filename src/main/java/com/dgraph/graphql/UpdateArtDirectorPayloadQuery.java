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
public class UpdateArtDirectorPayloadQuery extends Query<UpdateArtDirectorPayloadQuery> {
    UpdateArtDirectorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ArtdirectorArguments extends Arguments {
        ArtdirectorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ArtdirectorArguments filter(ArtDirectorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ArtdirectorArguments order(ArtDirectorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ArtdirectorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ArtdirectorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ArtdirectorArgumentsDefinition {
        void define(ArtdirectorArguments args);
    }

    /**
    * 
    */
    public UpdateArtDirectorPayloadQuery artdirector(ArtDirectorQueryDefinition queryDef) {
        return artdirector(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateArtDirectorPayloadQuery artdirector(ArtdirectorArgumentsDefinition argsDef, ArtDirectorQueryDefinition queryDef) {
        startField("artdirector");

        ArtdirectorArguments args = new ArtdirectorArguments(_queryBuilder);
        argsDef.define(args);
        ArtdirectorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ArtDirectorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
