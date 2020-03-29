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
public class AddPersonalAppearancePayloadQuery extends Query<AddPersonalAppearancePayloadQuery> {
    AddPersonalAppearancePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PersonalappearanceArguments extends Arguments {
        PersonalappearanceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonalappearanceArguments filter(PersonalAppearanceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalappearanceArguments order(PersonalAppearanceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalappearanceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalappearanceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PersonalappearanceArgumentsDefinition {
        void define(PersonalappearanceArguments args);
    }

    /**
    * 
    */
    public AddPersonalAppearancePayloadQuery personalappearance(PersonalAppearanceQueryDefinition queryDef) {
        return personalappearance(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddPersonalAppearancePayloadQuery personalappearance(PersonalappearanceArgumentsDefinition argsDef, PersonalAppearanceQueryDefinition queryDef) {
        startField("personalappearance");

        PersonalappearanceArguments args = new PersonalappearanceArguments(_queryBuilder);
        argsDef.define(args);
        PersonalappearanceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonalAppearanceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
