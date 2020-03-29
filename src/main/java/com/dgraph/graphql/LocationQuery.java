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
public class LocationQuery extends Query<LocationQuery> {
    LocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public LocationQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public LocationQuery name() {
        startField("name");

        return this;
    }

    public class FilmsArguments extends Arguments {
        FilmsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FilmsArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FilmsArgumentsDefinition {
        void define(FilmsArguments args);
    }

    /**
    * 
    */
    public LocationQuery films(FilmQueryDefinition queryDef) {
        return films(args -> {}, queryDef);
    }

    /**
    * 
    */
    public LocationQuery films(FilmsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("films");

        FilmsArguments args = new FilmsArguments(_queryBuilder);
        argsDef.define(args);
        FilmsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FeaturedInFilmsArguments extends Arguments {
        FeaturedInFilmsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FeaturedInFilmsArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedInFilmsArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedInFilmsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedInFilmsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FeaturedInFilmsArgumentsDefinition {
        void define(FeaturedInFilmsArguments args);
    }

    /**
    * 
    */
    public LocationQuery featuredInFilms(FilmQueryDefinition queryDef) {
        return featuredInFilms(args -> {}, queryDef);
    }

    /**
    * 
    */
    public LocationQuery featuredInFilms(FeaturedInFilmsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("featured_in_films");

        FeaturedInFilmsArguments args = new FeaturedInFilmsArguments(_queryBuilder);
        argsDef.define(args);
        FeaturedInFilmsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
