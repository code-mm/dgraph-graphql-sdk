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
public class AddDistributorPayloadQuery extends Query<AddDistributorPayloadQuery> {
    AddDistributorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class DistributorArguments extends Arguments {
        DistributorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DistributorArguments filter(DistributorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DistributorArguments order(DistributorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DistributorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DistributorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DistributorArgumentsDefinition {
        void define(DistributorArguments args);
    }

    /**
    * 
    */
    public AddDistributorPayloadQuery distributor(DistributorQueryDefinition queryDef) {
        return distributor(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddDistributorPayloadQuery distributor(DistributorArgumentsDefinition argsDef, DistributorQueryDefinition queryDef) {
        startField("distributor");

        DistributorArguments args = new DistributorArguments(_queryBuilder);
        argsDef.define(args);
        DistributorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DistributorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
