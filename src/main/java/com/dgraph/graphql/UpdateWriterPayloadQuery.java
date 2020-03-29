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
public class UpdateWriterPayloadQuery extends Query<UpdateWriterPayloadQuery> {
    UpdateWriterPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class WriterArguments extends Arguments {
        WriterArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public WriterArguments filter(WriterFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WriterArguments order(WriterOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WriterArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public WriterArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WriterArgumentsDefinition {
        void define(WriterArguments args);
    }

    /**
    * 
    */
    public UpdateWriterPayloadQuery writer(WriterQueryDefinition queryDef) {
        return writer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateWriterPayloadQuery writer(WriterArgumentsDefinition argsDef, WriterQueryDefinition queryDef) {
        startField("writer");

        WriterArguments args = new WriterArguments(_queryBuilder);
        argsDef.define(args);
        WriterArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WriterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
