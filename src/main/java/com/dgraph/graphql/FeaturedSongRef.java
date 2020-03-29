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

public class FeaturedSongRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> featuredInFilm = Input.undefined();

    private Input<List<FilmRef>> performedBy = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public FeaturedSongRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public FeaturedSongRef setIdInput(Input<ID> id) {
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

    public FeaturedSongRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public FeaturedSongRef setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<FilmRef> getFeaturedInFilm() {
        return featuredInFilm.getValue();
    }

    public Input<List<FilmRef>> getFeaturedInFilmInput() {
        return featuredInFilm;
    }

    public FeaturedSongRef setFeaturedInFilm(List<FilmRef> featuredInFilm) {
        this.featuredInFilm = Input.optional(featuredInFilm);
        return this;
    }

    public FeaturedSongRef setFeaturedInFilmInput(Input<List<FilmRef>> featuredInFilm) {
        if (featuredInFilm == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.featuredInFilm = featuredInFilm;
        return this;
    }

    public List<FilmRef> getPerformedBy() {
        return performedBy.getValue();
    }

    public Input<List<FilmRef>> getPerformedByInput() {
        return performedBy;
    }

    public FeaturedSongRef setPerformedBy(List<FilmRef> performedBy) {
        this.performedBy = Input.optional(performedBy);
        return this;
    }

    public FeaturedSongRef setPerformedByInput(Input<List<FilmRef>> performedBy) {
        if (performedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.performedBy = performedBy;
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

        if (this.featuredInFilm.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("featured_in_film:");
            if (featuredInFilm.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : featuredInFilm.getValue()) {
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

        if (this.performedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("performed_by:");
            if (performedBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : performedBy.getValue()) {
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
