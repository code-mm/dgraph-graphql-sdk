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

public class RatingRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<List<LocationRef>> country = Input.undefined();

    private Input<Integer> minimumAccompaniedAge = Input.undefined();

    private Input<Integer> minimumUnaccompaniedAge = Input.undefined();

    private Input<List<RatingSystemRef>> ratingSystem = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public RatingRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public RatingRef setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public RatingRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public RatingRef setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<LocationRef> getCountry() {
        return country.getValue();
    }

    public Input<List<LocationRef>> getCountryInput() {
        return country;
    }

    public RatingRef setCountry(List<LocationRef> country) {
        this.country = Input.optional(country);
        return this;
    }

    public RatingRef setCountryInput(Input<List<LocationRef>> country) {
        if (country == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.country = country;
        return this;
    }

    public Integer getMinimumAccompaniedAge() {
        return minimumAccompaniedAge.getValue();
    }

    public Input<Integer> getMinimumAccompaniedAgeInput() {
        return minimumAccompaniedAge;
    }

    public RatingRef setMinimumAccompaniedAge(Integer minimumAccompaniedAge) {
        this.minimumAccompaniedAge = Input.optional(minimumAccompaniedAge);
        return this;
    }

    public RatingRef setMinimumAccompaniedAgeInput(Input<Integer> minimumAccompaniedAge) {
        if (minimumAccompaniedAge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.minimumAccompaniedAge = minimumAccompaniedAge;
        return this;
    }

    public Integer getMinimumUnaccompaniedAge() {
        return minimumUnaccompaniedAge.getValue();
    }

    public Input<Integer> getMinimumUnaccompaniedAgeInput() {
        return minimumUnaccompaniedAge;
    }

    public RatingRef setMinimumUnaccompaniedAge(Integer minimumUnaccompaniedAge) {
        this.minimumUnaccompaniedAge = Input.optional(minimumUnaccompaniedAge);
        return this;
    }

    public RatingRef setMinimumUnaccompaniedAgeInput(Input<Integer> minimumUnaccompaniedAge) {
        if (minimumUnaccompaniedAge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.minimumUnaccompaniedAge = minimumUnaccompaniedAge;
        return this;
    }

    public List<RatingSystemRef> getRatingSystem() {
        return ratingSystem.getValue();
    }

    public Input<List<RatingSystemRef>> getRatingSystemInput() {
        return ratingSystem;
    }

    public RatingRef setRatingSystem(List<RatingSystemRef> ratingSystem) {
        this.ratingSystem = Input.optional(ratingSystem);
        return this;
    }

    public RatingRef setRatingSystemInput(Input<List<RatingSystemRef>> ratingSystem) {
        if (ratingSystem == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ratingSystem = ratingSystem;
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
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.country.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country:");
            if (country.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocationRef item1 : country.getValue()) {
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

        if (this.minimumAccompaniedAge.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("minimum_accompanied_age:");
            if (minimumAccompaniedAge.getValue() != null) {
                _queryBuilder.append(minimumAccompaniedAge.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.minimumUnaccompaniedAge.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("minimum_unaccompanied_age:");
            if (minimumUnaccompaniedAge.getValue() != null) {
                _queryBuilder.append(minimumUnaccompaniedAge.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ratingSystem.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("rating_system:");
            if (ratingSystem.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RatingSystemRef item1 : ratingSystem.getValue()) {
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
