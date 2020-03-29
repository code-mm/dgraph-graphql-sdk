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
public class AddPersonOrEntityAppearingInFilmPayloadQuery extends Query<AddPersonOrEntityAppearingInFilmPayloadQuery> {
    AddPersonOrEntityAppearingInFilmPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PersonorentityappearinginfilmArguments extends Arguments {
        PersonorentityappearinginfilmArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonorentityappearinginfilmArguments filter(PersonOrEntityAppearingInFilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonorentityappearinginfilmArguments order(PersonOrEntityAppearingInFilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonorentityappearinginfilmArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PersonorentityappearinginfilmArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PersonorentityappearinginfilmArgumentsDefinition {
        void define(PersonorentityappearinginfilmArguments args);
    }

    /**
    * 
    */
    public AddPersonOrEntityAppearingInFilmPayloadQuery personorentityappearinginfilm(PersonOrEntityAppearingInFilmQueryDefinition queryDef) {
        return personorentityappearinginfilm(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddPersonOrEntityAppearingInFilmPayloadQuery personorentityappearinginfilm(PersonorentityappearinginfilmArgumentsDefinition argsDef, PersonOrEntityAppearingInFilmQueryDefinition queryDef) {
        startField("personorentityappearinginfilm");

        PersonorentityappearinginfilmArguments args = new PersonorentityappearinginfilmArguments(_queryBuilder);
        argsDef.define(args);
        PersonorentityappearinginfilmArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonOrEntityAppearingInFilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
