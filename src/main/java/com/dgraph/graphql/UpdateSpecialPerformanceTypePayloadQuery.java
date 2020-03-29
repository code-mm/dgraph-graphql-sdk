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
public class UpdateSpecialPerformanceTypePayloadQuery extends Query<UpdateSpecialPerformanceTypePayloadQuery> {
    UpdateSpecialPerformanceTypePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class SpecialperformancetypeArguments extends Arguments {
        SpecialperformancetypeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SpecialperformancetypeArguments filter(SpecialPerformanceTypeFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SpecialperformancetypeArguments order(SpecialPerformanceTypeOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SpecialperformancetypeArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SpecialperformancetypeArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SpecialperformancetypeArgumentsDefinition {
        void define(SpecialperformancetypeArguments args);
    }

    /**
    * 
    */
    public UpdateSpecialPerformanceTypePayloadQuery specialperformancetype(SpecialPerformanceTypeQueryDefinition queryDef) {
        return specialperformancetype(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateSpecialPerformanceTypePayloadQuery specialperformancetype(SpecialperformancetypeArgumentsDefinition argsDef, SpecialPerformanceTypeQueryDefinition queryDef) {
        startField("specialperformancetype");

        SpecialperformancetypeArguments args = new SpecialperformancetypeArguments(_queryBuilder);
        argsDef.define(args);
        SpecialperformancetypeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SpecialPerformanceTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
