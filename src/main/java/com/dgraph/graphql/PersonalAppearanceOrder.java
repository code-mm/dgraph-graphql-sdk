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

public class PersonalAppearanceOrder implements Serializable {
    private Input<PersonalAppearanceOrderable> asc = Input.undefined();

    private Input<PersonalAppearanceOrderable> desc = Input.undefined();

    private Input<PersonalAppearanceOrder> then = Input.undefined();

    public PersonalAppearanceOrderable getAsc() {
        return asc.getValue();
    }

    public Input<PersonalAppearanceOrderable> getAscInput() {
        return asc;
    }

    public PersonalAppearanceOrder setAsc(PersonalAppearanceOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public PersonalAppearanceOrder setAscInput(Input<PersonalAppearanceOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public PersonalAppearanceOrderable getDesc() {
        return desc.getValue();
    }

    public Input<PersonalAppearanceOrderable> getDescInput() {
        return desc;
    }

    public PersonalAppearanceOrder setDesc(PersonalAppearanceOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public PersonalAppearanceOrder setDescInput(Input<PersonalAppearanceOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public PersonalAppearanceOrder getThen() {
        return then.getValue();
    }

    public Input<PersonalAppearanceOrder> getThenInput() {
        return then;
    }

    public PersonalAppearanceOrder setThen(PersonalAppearanceOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public PersonalAppearanceOrder setThenInput(Input<PersonalAppearanceOrder> then) {
        if (then == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.then = then;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.asc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("asc:");
            if (asc.getValue() != null) {
                _queryBuilder.append(asc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.desc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("desc:");
            if (desc.getValue() != null) {
                _queryBuilder.append(desc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.then.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("then:");
            if (then.getValue() != null) {
                then.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
