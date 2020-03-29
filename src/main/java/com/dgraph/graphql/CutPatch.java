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

public class CutPatch implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> films = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<List<LocationRef>> releaseRegion = Input.undefined();

    private Input<Double> runtime = Input.undefined();

    private Input<List<CutTypeRef>> typeOfCut = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public CutPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CutPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<FilmRef> getFilms() {
        return films.getValue();
    }

    public Input<List<FilmRef>> getFilmsInput() {
        return films;
    }

    public CutPatch setFilms(List<FilmRef> films) {
        this.films = Input.optional(films);
        return this;
    }

    public CutPatch setFilmsInput(Input<List<FilmRef>> films) {
        if (films == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.films = films;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public CutPatch setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public CutPatch setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public List<LocationRef> getReleaseRegion() {
        return releaseRegion.getValue();
    }

    public Input<List<LocationRef>> getReleaseRegionInput() {
        return releaseRegion;
    }

    public CutPatch setReleaseRegion(List<LocationRef> releaseRegion) {
        this.releaseRegion = Input.optional(releaseRegion);
        return this;
    }

    public CutPatch setReleaseRegionInput(Input<List<LocationRef>> releaseRegion) {
        if (releaseRegion == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.releaseRegion = releaseRegion;
        return this;
    }

    public Double getRuntime() {
        return runtime.getValue();
    }

    public Input<Double> getRuntimeInput() {
        return runtime;
    }

    public CutPatch setRuntime(Double runtime) {
        this.runtime = Input.optional(runtime);
        return this;
    }

    public CutPatch setRuntimeInput(Input<Double> runtime) {
        if (runtime == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.runtime = runtime;
        return this;
    }

    public List<CutTypeRef> getTypeOfCut() {
        return typeOfCut.getValue();
    }

    public Input<List<CutTypeRef>> getTypeOfCutInput() {
        return typeOfCut;
    }

    public CutPatch setTypeOfCut(List<CutTypeRef> typeOfCut) {
        this.typeOfCut = Input.optional(typeOfCut);
        return this;
    }

    public CutPatch setTypeOfCutInput(Input<List<CutTypeRef>> typeOfCut) {
        if (typeOfCut == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.typeOfCut = typeOfCut;
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

        if (this.films.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("films:");
            if (films.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : films.getValue()) {
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

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
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

        if (this.runtime.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("runtime:");
            if (runtime.getValue() != null) {
                _queryBuilder.append(runtime.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.typeOfCut.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type_of_cut:");
            if (typeOfCut.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CutTypeRef item1 : typeOfCut.getValue()) {
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
