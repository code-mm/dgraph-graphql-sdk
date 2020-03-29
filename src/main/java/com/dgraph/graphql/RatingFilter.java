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

public class RatingFilter implements Serializable {
    private Input<List<ID>> id = Input.undefined();

    private Input<StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter> name = Input.undefined();

    private Input<RatingFilter> and = Input.undefined();

    private Input<RatingFilter> or = Input.undefined();

    private Input<RatingFilter> not = Input.undefined();

    public List<ID> getId() {
        return id.getValue();
    }

    public Input<List<ID>> getIdInput() {
        return id;
    }

    public RatingFilter setId(List<ID> id) {
        this.id = Input.optional(id);
        return this;
    }

    public RatingFilter setIdInput(Input<List<ID>> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter getName() {
        return name.getValue();
    }

    public Input<StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter> getNameInput() {
        return name;
    }

    public RatingFilter setName(StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter name) {
        this.name = Input.optional(name);
        return this;
    }

    public RatingFilter setNameInput(Input<StringFullTextFilter_StringHashFilter_StringRegExpFilter_StringTermFilter> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public RatingFilter getAnd() {
        return and.getValue();
    }

    public Input<RatingFilter> getAndInput() {
        return and;
    }

    public RatingFilter setAnd(RatingFilter and) {
        this.and = Input.optional(and);
        return this;
    }

    public RatingFilter setAndInput(Input<RatingFilter> and) {
        if (and == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.and = and;
        return this;
    }

    public RatingFilter getOr() {
        return or.getValue();
    }

    public Input<RatingFilter> getOrInput() {
        return or;
    }

    public RatingFilter setOr(RatingFilter or) {
        this.or = Input.optional(or);
        return this;
    }

    public RatingFilter setOrInput(Input<RatingFilter> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public RatingFilter getNot() {
        return not.getValue();
    }

    public Input<RatingFilter> getNotInput() {
        return not;
    }

    public RatingFilter setNot(RatingFilter not) {
        this.not = Input.optional(not);
        return this;
    }

    public RatingFilter setNotInput(Input<RatingFilter> not) {
        if (not == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.not = not;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : id.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
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
