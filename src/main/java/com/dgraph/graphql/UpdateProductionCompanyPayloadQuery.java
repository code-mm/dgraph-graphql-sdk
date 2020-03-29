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
public class UpdateProductionCompanyPayloadQuery extends Query<UpdateProductionCompanyPayloadQuery> {
    UpdateProductionCompanyPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ProductioncompanyArguments extends Arguments {
        ProductioncompanyArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProductioncompanyArguments filter(ProductionCompanyFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductioncompanyArguments order(ProductionCompanyOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductioncompanyArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProductioncompanyArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductioncompanyArgumentsDefinition {
        void define(ProductioncompanyArguments args);
    }

    /**
    * 
    */
    public UpdateProductionCompanyPayloadQuery productioncompany(ProductionCompanyQueryDefinition queryDef) {
        return productioncompany(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateProductionCompanyPayloadQuery productioncompany(ProductioncompanyArgumentsDefinition argsDef, ProductionCompanyQueryDefinition queryDef) {
        startField("productioncompany");

        ProductioncompanyArguments args = new ProductioncompanyArguments(_queryBuilder);
        argsDef.define(args);
        ProductioncompanyArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductionCompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
