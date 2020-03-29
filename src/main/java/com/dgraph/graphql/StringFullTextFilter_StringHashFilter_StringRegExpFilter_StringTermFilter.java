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

public class StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter implements Serializable {
    private Input<String> alloftext = Input.undefined();

    private Input<String> anyoftext = Input.undefined();

    private Input<String> eq = Input.undefined();

    private Input<String> regexp = Input.undefined();

    private Input<String> allofterms = Input.undefined();

    private Input<String> anyofterms = Input.undefined();

    public String getAlloftext() {
        return alloftext.getValue();
    }

    public Input<String> getAlloftextInput() {
        return alloftext;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAlloftext(String alloftext) {
        this.alloftext = Input.optional(alloftext);
        return this;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAlloftextInput(Input<String> alloftext) {
        if (alloftext == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alloftext = alloftext;
        return this;
    }

    public String getAnyoftext() {
        return anyoftext.getValue();
    }

    public Input<String> getAnyoftextInput() {
        return anyoftext;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAnyoftext(String anyoftext) {
        this.anyoftext = Input.optional(anyoftext);
        return this;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAnyoftextInput(Input<String> anyoftext) {
        if (anyoftext == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anyoftext = anyoftext;
        return this;
    }

    public String getEq() {
        return eq.getValue();
    }

    public Input<String> getEqInput() {
        return eq;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setEq(String eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setEqInput(Input<String> eq) {
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

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setRegexp(String regexp) {
        this.regexp = Input.optional(regexp);
        return this;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setRegexpInput(Input<String> regexp) {
        if (regexp == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regexp = regexp;
        return this;
    }

    public String getAllofterms() {
        return allofterms.getValue();
    }

    public Input<String> getAlloftermsInput() {
        return allofterms;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAllofterms(String allofterms) {
        this.allofterms = Input.optional(allofterms);
        return this;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAlloftermsInput(Input<String> allofterms) {
        if (allofterms == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.allofterms = allofterms;
        return this;
    }

    public String getAnyofterms() {
        return anyofterms.getValue();
    }

    public Input<String> getAnyoftermsInput() {
        return anyofterms;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAnyofterms(String anyofterms) {
        this.anyofterms = Input.optional(anyofterms);
        return this;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter setAnyoftermsInput(Input<String> anyofterms) {
        if (anyofterms == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anyofterms = anyofterms;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.alloftext.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alloftext:");
            if (alloftext.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alloftext.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.anyoftext.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("anyoftext:");
            if (anyoftext.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, anyoftext.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.allofterms.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("allofterms:");
            if (allofterms.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, allofterms.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.anyofterms.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("anyofterms:");
            if (anyofterms.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, anyofterms.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
