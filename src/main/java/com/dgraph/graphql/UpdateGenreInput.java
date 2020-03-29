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

public class UpdateGenreInput implements Serializable {
    private GenreFilter filter;

    private Input<GenrePatch> set = Input.undefined();

    private Input<GenrePatch> remove = Input.undefined();

    public UpdateGenreInput(GenreFilter filter) {
        this.filter = filter;
    }

    public GenreFilter getFilter() {
        return filter;
    }

    public UpdateGenreInput setFilter(GenreFilter filter) {
        this.filter = filter;
        return this;
    }

    public GenrePatch getSet() {
        return set.getValue();
    }

    public Input<GenrePatch> getSetInput() {
        return set;
    }

    public UpdateGenreInput setSet(GenrePatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateGenreInput setSetInput(Input<GenrePatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public GenrePatch getRemove() {
        return remove.getValue();
    }

    public Input<GenrePatch> getRemoveInput() {
        return remove;
    }

    public UpdateGenreInput setRemove(GenrePatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateGenreInput setRemoveInput(Input<GenrePatch> remove) {
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
