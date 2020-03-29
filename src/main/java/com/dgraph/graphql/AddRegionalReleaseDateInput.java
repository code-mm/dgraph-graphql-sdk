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

public class AddRegionalReleaseDateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<DateTime> releaseDate = Input.undefined();

    private Input<List<LocationRef>> releaseRegion = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AddRegionalReleaseDateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AddRegionalReleaseDateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public DateTime getReleaseDate() {
        return releaseDate.getValue();
    }

    public Input<DateTime> getReleaseDateInput() {
        return releaseDate;
    }

    public AddRegionalReleaseDateInput setReleaseDate(DateTime releaseDate) {
        this.releaseDate = Input.optional(releaseDate);
        return this;
    }

    public AddRegionalReleaseDateInput setReleaseDateInput(Input<DateTime> releaseDate) {
        if (releaseDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.releaseDate = releaseDate;
        return this;
    }

    public List<LocationRef> getReleaseRegion() {
        return releaseRegion.getValue();
    }

    public Input<List<LocationRef>> getReleaseRegionInput() {
        return releaseRegion;
    }

    public AddRegionalReleaseDateInput setReleaseRegion(List<LocationRef> releaseRegion) {
        this.releaseRegion = Input.optional(releaseRegion);
        return this;
    }

    public AddRegionalReleaseDateInput setReleaseRegionInput(Input<List<LocationRef>> releaseRegion) {
        if (releaseRegion == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.releaseRegion = releaseRegion;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.releaseDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("release_date:");
            if (releaseDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, releaseDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.releaseRegion.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("release_region:");
            if (releaseRegion.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocationRef item1 : releaseRegion.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
