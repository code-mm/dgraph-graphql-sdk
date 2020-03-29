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

public class UpdateMusicContributorInput implements Serializable {
    private MusicContributorFilter filter;

    private Input<MusicContributorPatch> set = Input.undefined();

    private Input<MusicContributorPatch> remove = Input.undefined();

    public UpdateMusicContributorInput(MusicContributorFilter filter) {
        this.filter = filter;
    }

    public MusicContributorFilter getFilter() {
        return filter;
    }

    public UpdateMusicContributorInput setFilter(MusicContributorFilter filter) {
        this.filter = filter;
        return this;
    }

    public MusicContributorPatch getSet() {
        return set.getValue();
    }

    public Input<MusicContributorPatch> getSetInput() {
        return set;
    }

    public UpdateMusicContributorInput setSet(MusicContributorPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateMusicContributorInput setSetInput(Input<MusicContributorPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public MusicContributorPatch getRemove() {
        return remove.getValue();
    }

    public Input<MusicContributorPatch> getRemoveInput() {
        return remove;
    }

    public UpdateMusicContributorInput setRemove(MusicContributorPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateMusicContributorInput setRemoveInput(Input<MusicContributorPatch> remove) {
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
