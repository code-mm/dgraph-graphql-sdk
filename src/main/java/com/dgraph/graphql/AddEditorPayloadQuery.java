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
public class AddEditorPayloadQuery extends Query<AddEditorPayloadQuery> {
    AddEditorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class EditorArguments extends Arguments {
        EditorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public EditorArguments filter(EditorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EditorArguments order(EditorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EditorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public EditorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EditorArgumentsDefinition {
        void define(EditorArguments args);
    }

    /**
    * 
    */
    public AddEditorPayloadQuery editor(EditorQueryDefinition queryDef) {
        return editor(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddEditorPayloadQuery editor(EditorArgumentsDefinition argsDef, EditorQueryDefinition queryDef) {
        startField("editor");

        EditorArguments args = new EditorArguments(_queryBuilder);
        argsDef.define(args);
        EditorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EditorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
