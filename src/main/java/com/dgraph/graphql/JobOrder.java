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

public class JobOrder implements Serializable {
    private Input<JobOrderable> asc = Input.undefined();

    private Input<JobOrderable> desc = Input.undefined();

    private Input<JobOrder> then = Input.undefined();

    public JobOrderable getAsc() {
        return asc.getValue();
    }

    public Input<JobOrderable> getAscInput() {
        return asc;
    }

    public JobOrder setAsc(JobOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public JobOrder setAscInput(Input<JobOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public JobOrderable getDesc() {
        return desc.getValue();
    }

    public Input<JobOrderable> getDescInput() {
        return desc;
    }

    public JobOrder setDesc(JobOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public JobOrder setDescInput(Input<JobOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public JobOrder getThen() {
        return then.getValue();
    }

    public Input<JobOrder> getThenInput() {
        return then;
    }

    public JobOrder setThen(JobOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public JobOrder setThenInput(Input<JobOrder> then) {
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
