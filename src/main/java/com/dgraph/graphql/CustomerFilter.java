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

public class CustomerFilter implements Serializable {
    private Input<StringHashFilter_StringRegExpFilter> username = Input.undefined();

    private Input<CustomerFilter> and = Input.undefined();

    private Input<CustomerFilter> or = Input.undefined();

    private Input<CustomerFilter> not = Input.undefined();

    public StringHashFilter_StringRegExpFilter getUsername() {
        return username.getValue();
    }

    public Input<StringHashFilter_StringRegExpFilter> getUsernameInput() {
        return username;
    }

    public CustomerFilter setUsername(StringHashFilter_StringRegExpFilter username) {
        this.username = Input.optional(username);
        return this;
    }

    public CustomerFilter setUsernameInput(Input<StringHashFilter_StringRegExpFilter> username) {
        if (username == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.username = username;
        return this;
    }

    public CustomerFilter getAnd() {
        return and.getValue();
    }

    public Input<CustomerFilter> getAndInput() {
        return and;
    }

    public CustomerFilter setAnd(CustomerFilter and) {
        this.and = Input.optional(and);
        return this;
    }

    public CustomerFilter setAndInput(Input<CustomerFilter> and) {
        if (and == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.and = and;
        return this;
    }

    public CustomerFilter getOr() {
        return or.getValue();
    }

    public Input<CustomerFilter> getOrInput() {
        return or;
    }

    public CustomerFilter setOr(CustomerFilter or) {
        this.or = Input.optional(or);
        return this;
    }

    public CustomerFilter setOrInput(Input<CustomerFilter> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public CustomerFilter getNot() {
        return not.getValue();
    }

    public Input<CustomerFilter> getNotInput() {
        return not;
    }

    public CustomerFilter setNot(CustomerFilter not) {
        this.not = Input.optional(not);
        return this;
    }

    public CustomerFilter setNotInput(Input<CustomerFilter> not) {
        if (not == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.not = not;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.username.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("username:");
            if (username.getValue() != null) {
                username.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.and.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("and:");
            if (and.getValue() != null) {
                and.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.or.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("or:");
            if (or.getValue() != null) {
                or.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.not.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("not:");
            if (not.getValue() != null) {
                not.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
