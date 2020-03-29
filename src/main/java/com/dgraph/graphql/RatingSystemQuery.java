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
public class RatingSystemQuery extends Query<RatingSystemQuery> {
    RatingSystemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public RatingSystemQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public RatingSystemQuery name() {
        startField("name");

        return this;
    }

    public class RatingsArguments extends Arguments {
        RatingsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RatingsArguments filter(RatingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingsArguments order(RatingOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RatingsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RatingsArgumentsDefinition {
        void define(RatingsArguments args);
    }

    /**
    * 
    */
    public RatingSystemQuery ratings(RatingQueryDefinition queryDef) {
        return ratings(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RatingSystemQuery ratings(RatingsArgumentsDefinition argsDef, RatingQueryDefinition queryDef) {
        startField("ratings");

        RatingsArguments args = new RatingsArguments(_queryBuilder);
        argsDef.define(args);
        RatingsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RatingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class JurisdictionArguments extends Arguments {
        JurisdictionArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public JurisdictionArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public JurisdictionArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public JurisdictionArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public JurisdictionArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface JurisdictionArgumentsDefinition {
        void define(JurisdictionArguments args);
    }

    /**
    * 
    */
    public RatingSystemQuery jurisdiction(LocationQueryDefinition queryDef) {
        return jurisdiction(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RatingSystemQuery jurisdiction(JurisdictionArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("jurisdiction");

        JurisdictionArguments args = new JurisdictionArguments(_queryBuilder);
        argsDef.define(args);
        JurisdictionArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
