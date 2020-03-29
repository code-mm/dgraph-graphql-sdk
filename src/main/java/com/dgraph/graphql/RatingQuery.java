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
public class RatingQuery extends Query<RatingQuery> {
    RatingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public RatingQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public RatingQuery name() {
        startField("name");

        return this;
    }

    public class CountryArguments extends Arguments {
        CountryArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CountryArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CountryArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CountryArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CountryArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CountryArgumentsDefinition {
        void define(CountryArguments args);
    }

    /**
    * 
    */
    public RatingQuery country(LocationQueryDefinition queryDef) {
        return country(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RatingQuery country(CountryArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("country");

        CountryArguments args = new CountryArguments(_queryBuilder);
        argsDef.define(args);
        CountryArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RatingQuery minimumAccompaniedAge() {
        startField("minimum_accompanied_age");

        return this;
    }

    /**
    * 
    */
    public RatingQuery minimumUnaccompaniedAge() {
        startField("minimum_unaccompanied_age");

        return this;
    }

    public class RatingSystemArguments extends Arguments {
        RatingSystemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RatingSystemArguments filter(RatingSystemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingSystemArguments order(RatingSystemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingSystemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RatingSystemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RatingSystemArgumentsDefinition {
        void define(RatingSystemArguments args);
    }

    /**
    * 
    */
    public RatingQuery ratingSystem(RatingSystemQueryDefinition queryDef) {
        return ratingSystem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RatingQuery ratingSystem(RatingSystemArgumentsDefinition argsDef, RatingSystemQueryDefinition queryDef) {
        startField("rating_system");

        RatingSystemArguments args = new RatingSystemArguments(_queryBuilder);
        argsDef.define(args);
        RatingSystemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RatingSystemQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public RatingQuery films(FilmQueryDefinition queryDef) {
        return films(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RatingQuery films(FilmsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("films");

        FilmsArguments args = new FilmsArguments(_queryBuilder);
        argsDef.define(args);
        FilmsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
