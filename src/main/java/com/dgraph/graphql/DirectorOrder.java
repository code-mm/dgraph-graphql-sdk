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

public class DirectorOrder implements Serializable {
    private Input<DirectorOrderable> asc = Input.undefined();

    private Input<DirectorOrderable> desc = Input.undefined();

    private Input<DirectorOrder> then = Input.undefined();

    public DirectorOrderable getAsc() {
        return asc.getValue();
    }

    public Input<DirectorOrderable> getAscInput() {
        return asc;
    }

    public DirectorOrder setAsc(DirectorOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public DirectorOrder setAscInput(Input<DirectorOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public DirectorOrderable getDesc() {
        return desc.getValue();
    }

    public Input<DirectorOrderable> getDescInput() {
        return desc;
    }

    public DirectorOrder setDesc(DirectorOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public DirectorOrder setDescInput(Input<DirectorOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public DirectorOrder getThen() {
        return then.getValue();
    }

    public Input<DirectorOrder> getThenInput() {
        return then;
    }

    public DirectorOrder setThen(DirectorOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public DirectorOrder setThenInput(Input<DirectorOrder> then) {
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