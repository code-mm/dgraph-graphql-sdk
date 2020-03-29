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
public class CrewMemberQuery extends Query<CrewMemberQuery> {
    CrewMemberQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public CrewMemberQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public CrewMemberQuery name() {
        startField("name");

        return this;
    }

    public class FilmsCrewedArguments extends Arguments {
        FilmsCrewedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FilmsCrewedArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsCrewedArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsCrewedArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsCrewedArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FilmsCrewedArgumentsDefinition {
        void define(FilmsCrewedArguments args);
    }

    /**
    * 
    */
    public CrewMemberQuery filmsCrewed(FilmQueryDefinition queryDef) {
        return filmsCrewed(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CrewMemberQuery filmsCrewed(FilmsCrewedArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("films_crewed");

        FilmsCrewedArguments args = new FilmsCrewedArguments(_queryBuilder);
        argsDef.define(args);
        FilmsCrewedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
