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

public class UpdateCutInput implements Serializable {
    private CutFilter filter;

    private Input<CutPatch> set = Input.undefined();

    private Input<CutPatch> remove = Input.undefined();

    public UpdateCutInput(CutFilter filter) {
        this.filter = filter;
    }

    public CutFilter getFilter() {
        return filter;
    }

    public UpdateCutInput setFilter(CutFilter filter) {
        this.filter = filter;
        return this;
    }

    public CutPatch getSet() {
        return set.getValue();
    }

    public Input<CutPatch> getSetInput() {
        return set;
    }

    public UpdateCutInput setSet(CutPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateCutInput setSetInput(Input<CutPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public CutPatch getRemove() {
        return remove.getValue();
    }

    public Input<CutPatch> getRemoveInput() {
        return remove;
    }

    public UpdateCutInput setRemove(CutPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateCutInput setRemoveInput(Input<CutPatch> remove) {
        if (remove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remove = remove;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("filter:");
        filter.appendTo(_queryBuilder);

        if (this.set.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("set:");
            if (set.getValue() != null) {
                set.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remove:");
            if (remove.getValue() != null) {
                remove.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
