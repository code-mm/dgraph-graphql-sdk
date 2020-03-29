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

public class UpdateSpecialPerformanceTypeInput implements Serializable {
    private SpecialPerformanceTypeFilter filter;

    private Input<SpecialPerformanceTypePatch> set = Input.undefined();

    private Input<SpecialPerformanceTypePatch> remove = Input.undefined();

    public UpdateSpecialPerformanceTypeInput(SpecialPerformanceTypeFilter filter) {
        this.filter = filter;
    }

    public SpecialPerformanceTypeFilter getFilter() {
        return filter;
    }

    public UpdateSpecialPerformanceTypeInput setFilter(SpecialPerformanceTypeFilter filter) {
        this.filter = filter;
        return this;
    }

    public SpecialPerformanceTypePatch getSet() {
        return set.getValue();
    }

    public Input<SpecialPerformanceTypePatch> getSetInput() {
        return set;
    }

    public UpdateSpecialPerformanceTypeInput setSet(SpecialPerformanceTypePatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateSpecialPerformanceTypeInput setSetInput(Input<SpecialPerformanceTypePatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public SpecialPerformanceTypePatch getRemove() {
        return remove.getValue();
    }

    public Input<SpecialPerformanceTypePatch> getRemoveInput() {
        return remove;
    }

    public UpdateSpecialPerformanceTypeInput setRemove(SpecialPerformanceTypePatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateSpecialPerformanceTypeInput setRemoveInput(Input<SpecialPerformanceTypePatch> remove) {
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
