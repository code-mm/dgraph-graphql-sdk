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

public class ProducerRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> films = Input.undefined();

    private Input<List<FilmRef>> filmsExecutiveProduced = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ProducerRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ProducerRef setIdInput(Input<ID> id) {
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

    public ProducerRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProducerRef setNameInput(Input<String> name) {
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

    public ProducerRef setFilms(List<FilmRef> films) {
        this.films = Input.optional(films);
        return this;
    }

    public ProducerRef setFilmsInput(Input<List<FilmRef>> films) {
        if (films == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.films = films;
        return this;
    }

    public List<FilmRef> getFilmsExecutiveProduced() {
        return filmsExecutiveProduced.getValue();
    }

    public Input<List<FilmRef>> getFilmsExecutiveProducedInput() {
        return filmsExecutiveProduced;
    }

    public ProducerRef setFilmsExecutiveProduced(List<FilmRef> filmsExecutiveProduced) {
        this.filmsExecutiveProduced = Input.optional(filmsExecutiveProduced);
        return this;
    }

    public ProducerRef setFilmsExecutiveProducedInput(Input<List<FilmRef>> filmsExecutiveProduced) {
        if (filmsExecutiveProduced == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.filmsExecutiveProduced = filmsExecutiveProduced;
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

        if (this.filmsExecutiveProduced.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("films_executive_produced:");
            if (filmsExecutiveProduced.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : filmsExecutiveProduced.getValue()) {
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