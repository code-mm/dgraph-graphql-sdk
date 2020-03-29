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
public class UpdateCutTypePayloadQuery extends Query<UpdateCutTypePayloadQuery> {
    UpdateCutTypePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CuttypeArguments extends Arguments {
        CuttypeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CuttypeArguments filter(CutTypeFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CuttypeArguments order(CutTypeOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CuttypeArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CuttypeArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CuttypeArgumentsDefinition {
        void define(CuttypeArguments args);
    }

    /**
    * 
    */
    public UpdateCutTypePayloadQuery cuttype(CutTypeQueryDefinition queryDef) {
        return cuttype(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCutTypePayloadQuery cuttype(CuttypeArgumentsDefinition argsDef, CutTypeQueryDefinition queryDef) {
        startField("cuttype");

        CuttypeArguments args = new CuttypeArguments(_queryBuilder);
        argsDef.define(args);
        CuttypeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CutTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
