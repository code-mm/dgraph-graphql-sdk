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
public class SpecialPerformanceTypeQuery extends Query<SpecialPerformanceTypeQuery> {
    SpecialPerformanceTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public SpecialPerformanceTypeQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public SpecialPerformanceTypeQuery name() {
        startField("name");

        return this;
    }

    public class PerformanceTypeArguments extends Arguments {
        PerformanceTypeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PerformanceTypeArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformanceTypeArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformanceTypeArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PerformanceTypeArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PerformanceTypeArgumentsDefinition {
        void define(PerformanceTypeArguments args);
    }

    /**
    * 
    */
    public SpecialPerformanceTypeQuery performanceType(FilmQueryDefinition queryDef) {
        return performanceType(args -> {}, queryDef);
    }

    /**
    * 
    */
    public SpecialPerformanceTypeQuery performanceType(PerformanceTypeArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("performance_type");

        PerformanceTypeArguments args = new PerformanceTypeArguments(_queryBuilder);
        argsDef.define(args);
        PerformanceTypeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
