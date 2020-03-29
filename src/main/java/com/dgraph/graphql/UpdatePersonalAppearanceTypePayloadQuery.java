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
public class UpdatePersonalAppearanceTypePayloadQuery extends Query<UpdatePersonalAppearanceTypePayloadQuery> {
    UpdatePersonalAppearanceTypePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PersonalappearancetypeArguments extends Arguments {
        PersonalappearancetypeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonalappearancetypeArguments filter(PersonalAppearanceTypeFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalappearancetypeArguments order(PersonalAppearanceTypeOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalappearancetypeArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalappearancetypeArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PersonalappearancetypeArgumentsDefinition {
        void define(PersonalappearancetypeArguments args);
    }

    /**
    * 
    */
    public UpdatePersonalAppearanceTypePayloadQuery personalappearancetype(PersonalAppearanceTypeQueryDefinition queryDef) {
        return personalappearancetype(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdatePersonalAppearanceTypePayloadQuery personalappearancetype(PersonalappearancetypeArgumentsDefinition argsDef, PersonalAppearanceTypeQueryDefinition queryDef) {
        startField("personalappearancetype");

        PersonalappearancetypeArguments args = new PersonalappearancetypeArguments(_queryBuilder);
        argsDef.define(args);
        PersonalappearancetypeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonalAppearanceTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}