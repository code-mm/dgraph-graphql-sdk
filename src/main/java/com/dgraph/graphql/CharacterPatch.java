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

public class CharacterPatch implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> portrayedInFilms = Input.undefined();

    private Input<List<FilmRef>> portrayedInFilmsDubbed = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public CharacterPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CharacterPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<FilmRef> getPortrayedInFilms() {
        return portrayedInFilms.getValue();
    }

    public Input<List<FilmRef>> getPortrayedInFilmsInput() {
        return portrayedInFilms;
    }

    public CharacterPatch setPortrayedInFilms(List<FilmRef> portrayedInFilms) {
        this.portrayedInFilms = Input.optional(portrayedInFilms);
        return this;
    }

    public CharacterPatch setPortrayedInFilmsInput(Input<List<FilmRef>> portrayedInFilms) {
        if (portrayedInFilms == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.portrayedInFilms = portrayedInFilms;
        return this;
    }

    public List<FilmRef> getPortrayedInFilmsDubbed() {
        return portrayedInFilmsDubbed.getValue();
    }

    public Input<List<FilmRef>> getPortrayedInFilmsDubbedInput() {
        return portrayedInFilmsDubbed;
    }

    public CharacterPatch setPortrayedInFilmsDubbed(List<FilmRef> portrayedInFilmsDubbed) {
        this.portrayedInFilmsDubbed = Input.optional(portrayedInFilmsDubbed);
        return this;
    }

    public CharacterPatch setPortrayedInFilmsDubbedInput(Input<List<FilmRef>> portrayedInFilmsDubbed) {
        if (portrayedInFilmsDubbed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.portrayedInFilmsDubbed = portrayedInFilmsDubbed;
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

        if (this.portrayedInFilms.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("portrayed_in_films:");
            if (portrayedInFilms.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : portrayedInFilms.getValue()) {
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

        if (this.portrayedInFilmsDubbed.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("portrayed_in_films_dubbed:");
            if (portrayedInFilmsDubbed.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : portrayedInFilmsDubbed.getValue()) {
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
