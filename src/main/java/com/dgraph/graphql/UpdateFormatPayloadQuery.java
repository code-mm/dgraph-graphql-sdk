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
public class UpdateFormatPayloadQuery extends Query<UpdateFormatPayloadQuery> {
    UpdateFormatPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FormatArguments extends Arguments {
        FormatArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FormatArguments filter(FormatFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FormatArguments order(FormatOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FormatArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FormatArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FormatArgumentsDefinition {
        void define(FormatArguments args);
    }

    /**
    * 
    */
    public UpdateFormatPayloadQuery format(FormatQueryDefinition queryDef) {
        return format(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateFormatPayloadQuery format(FormatArgumentsDefinition argsDef, FormatQueryDefinition queryDef) {
        startField("format");

        FormatArguments args = new FormatArguments(_queryBuilder);
        argsDef.define(args);
        FormatArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FormatQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
