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
public class UpdateCompanyRoleOrServicePayloadQuery extends Query<UpdateCompanyRoleOrServicePayloadQuery> {
    UpdateCompanyRoleOrServicePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CompanyroleorserviceArguments extends Arguments {
        CompanyroleorserviceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CompanyroleorserviceArguments filter(CompanyRoleOrServiceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CompanyroleorserviceArguments order(CompanyRoleOrServiceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CompanyroleorserviceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CompanyroleorserviceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CompanyroleorserviceArgumentsDefinition {
        void define(CompanyroleorserviceArguments args);
    }

    /**
    * 
    */
    public UpdateCompanyRoleOrServicePayloadQuery companyroleorservice(CompanyRoleOrServiceQueryDefinition queryDef) {
        return companyroleorservice(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCompanyRoleOrServicePayloadQuery companyroleorservice(CompanyroleorserviceArgumentsDefinition argsDef, CompanyRoleOrServiceQueryDefinition queryDef) {
        startField("companyroleorservice");

        CompanyroleorserviceArguments args = new CompanyroleorserviceArguments(_queryBuilder);
        argsDef.define(args);
        CompanyroleorserviceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyRoleOrServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
