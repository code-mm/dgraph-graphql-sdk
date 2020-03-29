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

public class UpdateFestivalEventInput implements Serializable {
    private FestivalEventFilter filter;

    private Input<FestivalEventPatch> set = Input.undefined();

    private Input<FestivalEventPatch> remove = Input.undefined();

    public UpdateFestivalEventInput(FestivalEventFilter filter) {
        this.filter = filter;
    }

    public FestivalEventFilter getFilter() {
        return filter;
    }

    public UpdateFestivalEventInput setFilter(FestivalEventFilter filter) {
        this.filter = filter;
        return this;
    }

    public FestivalEventPatch getSet() {
        return set.getValue();
    }

    public Input<FestivalEventPatch> getSetInput() {
        return set;
    }

    public UpdateFestivalEventInput setSet(FestivalEventPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateFestivalEventInput setSetInput(Input<FestivalEventPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public FestivalEventPatch getRemove() {
        return remove.getValue();
    }

    public Input<FestivalEventPatch> getRemoveInput() {
        return remove;
    }

    public UpdateFestivalEventInput setRemove(FestivalEventPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateFestivalEventInput setRemoveInput(Input<FestivalEventPatch> remove) {
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
