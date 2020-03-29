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

public class AddActorInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<PerformanceRef>> performances = Input.undefined();

    private Input<List<FilmRef>> dubbingPerformances = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AddActorInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AddActorInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<PerformanceRef> getPerformances() {
        return performances.getValue();
    }

    public Input<List<PerformanceRef>> getPerformancesInput() {
        return performances;
    }

    public AddActorInput setPerformances(List<PerformanceRef> performances) {
        this.performances = Input.optional(performances);
        return this;
    }

    public AddActorInput setPerformancesInput(Input<List<PerformanceRef>> performances) {
        if (performances == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.performances = performances;
        return this;
    }

    public List<FilmRef> getDubbingPerformances() {
        return dubbingPerformances.getValue();
    }

    public Input<List<FilmRef>> getDubbingPerformancesInput() {
        return dubbingPerformances;
    }

    public AddActorInput setDubbingPerformances(List<FilmRef> dubbingPerformances) {
        this.dubbingPerformances = Input.optional(dubbingPerformances);
        return this;
    }

    public AddActorInput setDubbingPerformancesInput(Input<List<FilmRef>> dubbingPerformances) {
        if (dubbingPerformances == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dubbingPerformances = dubbingPerformances;
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

        if (this.performances.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("performances:");
            if (performances.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PerformanceRef item1 : performances.getValue()) {
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

        if (this.dubbingPerformances.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dubbing_performances:");
            if (dubbingPerformances.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : dubbingPerformances.getValue()) {
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
