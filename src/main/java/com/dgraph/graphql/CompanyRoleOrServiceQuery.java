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
public class CompanyRoleOrServiceQuery extends Query<CompanyRoleOrServiceQuery> {
    CompanyRoleOrServiceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public CompanyRoleOrServiceQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public CompanyRoleOrServiceQuery name() {
        startField("name");

        return this;
    }

    public class CompaniesPerformingThisRoleOrServiceArguments extends Arguments {
        CompaniesPerformingThisRoleOrServiceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CompaniesPerformingThisRoleOrServiceArguments filter(CompanyFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CompaniesPerformingThisRoleOrServiceArguments order(CompanyOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CompaniesPerformingThisRoleOrServiceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CompaniesPerformingThisRoleOrServiceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CompaniesPerformingThisRoleOrServiceArgumentsDefinition {
        void define(CompaniesPerformingThisRoleOrServiceArguments args);
    }

    /**
    * 
    */
    public CompanyRoleOrServiceQuery companiesPerformingThisRoleOrService(CompanyQueryDefinition queryDef) {
        return companiesPerformingThisRoleOrService(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CompanyRoleOrServiceQuery companiesPerformingThisRoleOrService(CompaniesPerformingThisRoleOrServiceArgumentsDefinition argsDef, CompanyQueryDefinition queryDef) {
        startField("companies_performing_this_role_or_service");

        CompaniesPerformingThisRoleOrServiceArguments args = new CompaniesPerformingThisRoleOrServiceArguments(_queryBuilder);
        argsDef.define(args);
        CompaniesPerformingThisRoleOrServiceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
