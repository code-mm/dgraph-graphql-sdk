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
public class CharacterQuery extends Query<CharacterQuery> {
    CharacterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public CharacterQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public CharacterQuery name() {
        startField("name");

        return this;
    }

    public class PortrayedInFilmsArguments extends Arguments {
        PortrayedInFilmsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PortrayedInFilmsArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PortrayedInFilmsArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PortrayedInFilmsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PortrayedInFilmsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PortrayedInFilmsArgumentsDefinition {
        void define(PortrayedInFilmsArguments args);
    }

    /**
    * 
    */
    public CharacterQuery portrayedInFilms(FilmQueryDefinition queryDef) {
        return portrayedInFilms(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CharacterQuery portrayedInFilms(PortrayedInFilmsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("portrayed_in_films");

        PortrayedInFilmsArguments args = new PortrayedInFilmsArguments(_queryBuilder);
        argsDef.define(args);
        PortrayedInFilmsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PortrayedInFilmsDubbedArguments extends Arguments {
        PortrayedInFilmsDubbedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PortrayedInFilmsDubbedArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PortrayedInFilmsDubbedArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PortrayedInFilmsDubbedArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PortrayedInFilmsDubbedArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PortrayedInFilmsDubbedArgumentsDefinition {
        void define(PortrayedInFilmsDubbedArguments args);
    }

    /**
    * 
    */
    public CharacterQuery portrayedInFilmsDubbed(FilmQueryDefinition queryDef) {
        return portrayedInFilmsDubbed(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CharacterQuery portrayedInFilmsDubbed(PortrayedInFilmsDubbedArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("portrayed_in_films_dubbed");

        PortrayedInFilmsDubbedArguments args = new PortrayedInFilmsDubbedArguments(_queryBuilder);
        argsDef.define(args);
        PortrayedInFilmsDubbedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
