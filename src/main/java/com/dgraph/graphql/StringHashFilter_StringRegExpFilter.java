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

public class StringHashFilter_StringRegExpFilter implements Serializable {
    private Input<String> eq = Input.undefined();

    private Input<String> regexp = Input.undefined();

    public String getEq() {
        return eq.getValue();
    }

    public Input<String> getEqInput() {
        return eq;
    }

    public StringHashFilter_StringRegExpFilter setEq(String eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    public StringHashFilter_StringRegExpFilter setEqInput(Input<String> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    public String getRegexp() {
        return regexp.getValue();
    }

    public Input<String> getRegexpInput() {
        return regexp;
    }

    public StringHashFilter_StringRegExpFilter setRegexp(String regexp) {
        this.regexp = Input.optional(regexp);
        return this;
    }

    public StringHashFilter_StringRegExpFilter setRegexpInput(Input<String> regexp) {
        if (regexp == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regexp = regexp;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.eq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("eq:");
            if (eq.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, eq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regexp.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("regexp:");
            if (regexp.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, regexp.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
