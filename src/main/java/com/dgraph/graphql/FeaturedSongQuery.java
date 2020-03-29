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
public class FeaturedSongQuery extends Query<FeaturedSongQuery> {
    FeaturedSongQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public FeaturedSongQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public FeaturedSongQuery name() {
        startField("name");

        return this;
    }

    public class FeaturedInFilmArguments extends Arguments {
        FeaturedInFilmArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FeaturedInFilmArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedInFilmArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedInFilmArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedInFilmArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FeaturedInFilmArgumentsDefinition {
        void define(FeaturedInFilmArguments args);
    }

    /**
    * 
    */
    public FeaturedSongQuery featuredInFilm(FilmQueryDefinition queryDef) {
        return featuredInFilm(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FeaturedSongQuery featuredInFilm(FeaturedInFilmArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("featured_in_film");

        FeaturedInFilmArguments args = new FeaturedInFilmArguments(_queryBuilder);
        argsDef.define(args);
        FeaturedInFilmArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PerformedByArguments extends Arguments {
        PerformedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PerformedByArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformedByArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformedByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PerformedByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PerformedByArgumentsDefinition {
        void define(PerformedByArguments args);
    }

    /**
    * 
    */
    public FeaturedSongQuery performedBy(FilmQueryDefinition queryDef) {
        return performedBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FeaturedSongQuery performedBy(PerformedByArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("performed_by");

        PerformedByArguments args = new PerformedByArguments(_queryBuilder);
        argsDef.define(args);
        PerformedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
