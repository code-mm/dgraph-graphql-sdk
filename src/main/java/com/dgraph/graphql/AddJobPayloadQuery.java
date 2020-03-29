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
public class AddJobPayloadQuery extends Query<AddJobPayloadQuery> {
    AddJobPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class JobArguments extends Arguments {
        JobArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public JobArguments filter(JobFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public JobArguments order(JobOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public JobArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public JobArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface JobArgumentsDefinition {
        void define(JobArguments args);
    }

    /**
    * 
    */
    public AddJobPayloadQuery job(JobQueryDefinition queryDef) {
        return job(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddJobPayloadQuery job(JobArgumentsDefinition argsDef, JobQueryDefinition queryDef) {
        startField("job");

        JobArguments args = new JobArguments(_queryBuilder);
        argsDef.define(args);
        JobArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
