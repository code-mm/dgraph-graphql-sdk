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
public class AddCompanyPayloadQuery extends Query<AddCompanyPayloadQuery> {
    AddCompanyPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CompanyArguments extends Arguments {
        CompanyArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CompanyArguments filter(CompanyFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CompanyArguments order(CompanyOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CompanyArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CompanyArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CompanyArgumentsDefinition {
        void define(CompanyArguments args);
    }

    /**
    * 
    */
    public AddCompanyPayloadQuery company(CompanyQueryDefinition queryDef) {
        return company(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCompanyPayloadQuery company(CompanyArgumentsDefinition argsDef, CompanyQueryDefinition queryDef) {
        startField("company");

        CompanyArguments args = new CompanyArguments(_queryBuilder);
        argsDef.define(args);
        CompanyArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
