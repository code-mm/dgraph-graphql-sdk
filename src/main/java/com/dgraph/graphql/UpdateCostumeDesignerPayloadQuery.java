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
public class UpdateCostumeDesignerPayloadQuery extends Query<UpdateCostumeDesignerPayloadQuery> {
    UpdateCostumeDesignerPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CostumedesignerArguments extends Arguments {
        CostumedesignerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CostumedesignerArguments filter(CostumeDesignerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CostumedesignerArguments order(CostumeDesignerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CostumedesignerArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CostumedesignerArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CostumedesignerArgumentsDefinition {
        void define(CostumedesignerArguments args);
    }

    /**
    * 
    */
    public UpdateCostumeDesignerPayloadQuery costumedesigner(CostumeDesignerQueryDefinition queryDef) {
        return costumedesigner(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCostumeDesignerPayloadQuery costumedesigner(CostumedesignerArgumentsDefinition argsDef, CostumeDesignerQueryDefinition queryDef) {
        startField("costumedesigner");

        CostumedesignerArguments args = new CostumedesignerArguments(_queryBuilder);
        argsDef.define(args);
        CostumedesignerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CostumeDesignerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
