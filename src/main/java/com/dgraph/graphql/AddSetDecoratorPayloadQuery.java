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
public class AddSetDecoratorPayloadQuery extends Query<AddSetDecoratorPayloadQuery> {
    AddSetDecoratorPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class SetdecoratorArguments extends Arguments {
        SetdecoratorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SetdecoratorArguments filter(SetDecoratorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SetdecoratorArguments order(SetDecoratorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SetdecoratorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SetdecoratorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SetdecoratorArgumentsDefinition {
        void define(SetdecoratorArguments args);
    }

    /**
    * 
    */
    public AddSetDecoratorPayloadQuery setdecorator(SetDecoratorQueryDefinition queryDef) {
        return setdecorator(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddSetDecoratorPayloadQuery setdecorator(SetdecoratorArgumentsDefinition argsDef, SetDecoratorQueryDefinition queryDef) {
        startField("setdecorator");

        SetdecoratorArguments args = new SetdecoratorArguments(_queryBuilder);
        argsDef.define(args);
        SetdecoratorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetDecoratorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
