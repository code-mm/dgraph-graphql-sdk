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
public class UpdateCutPayloadQuery extends Query<UpdateCutPayloadQuery> {
    UpdateCutPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CutArguments extends Arguments {
        CutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CutArguments filter(CutFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CutArguments order(CutOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CutArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CutArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CutArgumentsDefinition {
        void define(CutArguments args);
    }

    /**
    * 
    */
    public UpdateCutPayloadQuery cut(CutQueryDefinition queryDef) {
        return cut(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCutPayloadQuery cut(CutArgumentsDefinition argsDef, CutQueryDefinition queryDef) {
        startField("cut");

        CutArguments args = new CutArguments(_queryBuilder);
        argsDef.define(args);
        CutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
