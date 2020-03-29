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
public class UpdateProductionDesignerPayloadQuery extends Query<UpdateProductionDesignerPayloadQuery> {
    UpdateProductionDesignerPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ProductiondesignerArguments extends Arguments {
        ProductiondesignerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProductiondesignerArguments filter(ProductionDesignerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductiondesignerArguments order(ProductionDesignerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductiondesignerArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProductiondesignerArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductiondesignerArgumentsDefinition {
        void define(ProductiondesignerArguments args);
    }

    /**
    * 
    */
    public UpdateProductionDesignerPayloadQuery productiondesigner(ProductionDesignerQueryDefinition queryDef) {
        return productiondesigner(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateProductionDesignerPayloadQuery productiondesigner(ProductiondesignerArgumentsDefinition argsDef, ProductionDesignerQueryDefinition queryDef) {
        startField("productiondesigner");

        ProductiondesignerArguments args = new ProductiondesignerArguments(_queryBuilder);
        argsDef.define(args);
        ProductiondesignerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductionDesignerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
