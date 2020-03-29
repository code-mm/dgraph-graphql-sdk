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
public class AddCustomerPayloadQuery extends Query<AddCustomerPayloadQuery> {
    AddCustomerPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CustomerArguments extends Arguments {
        CustomerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CustomerArguments filter(CustomerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CustomerArguments order(CustomerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CustomerArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CustomerArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomerArgumentsDefinition {
        void define(CustomerArguments args);
    }

    /**
    * 
    */
    public AddCustomerPayloadQuery customer(CustomerQueryDefinition queryDef) {
        return customer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCustomerPayloadQuery customer(CustomerArgumentsDefinition argsDef, CustomerQueryDefinition queryDef) {
        startField("customer");

        CustomerArguments args = new CustomerArguments(_queryBuilder);
        argsDef.define(args);
        CustomerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddCustomerPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
