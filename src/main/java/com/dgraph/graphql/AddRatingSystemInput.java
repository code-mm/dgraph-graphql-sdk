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

public class AddRatingSystemInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<RatingRef>> ratings = Input.undefined();

    private Input<List<LocationRef>> jurisdiction = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AddRatingSystemInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AddRatingSystemInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<RatingRef> getRatings() {
        return ratings.getValue();
    }

    public Input<List<RatingRef>> getRatingsInput() {
        return ratings;
    }

    public AddRatingSystemInput setRatings(List<RatingRef> ratings) {
        this.ratings = Input.optional(ratings);
        return this;
    }

    public AddRatingSystemInput setRatingsInput(Input<List<RatingRef>> ratings) {
        if (ratings == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ratings = ratings;
        return this;
    }

    public List<LocationRef> getJurisdiction() {
        return jurisdiction.getValue();
    }

    public Input<List<LocationRef>> getJurisdictionInput() {
        return jurisdiction;
    }

    public AddRatingSystemInput setJurisdiction(List<LocationRef> jurisdiction) {
        this.jurisdiction = Input.optional(jurisdiction);
        return this;
    }

    public AddRatingSystemInput setJurisdictionInput(Input<List<LocationRef>> jurisdiction) {
        if (jurisdiction == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.jurisdiction = jurisdiction;
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

        if (this.ratings.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ratings:");
            if (ratings.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RatingRef item1 : ratings.getValue()) {
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

        if (this.jurisdiction.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("jurisdiction:");
            if (jurisdiction.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocationRef item1 : jurisdiction.getValue()) {
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
