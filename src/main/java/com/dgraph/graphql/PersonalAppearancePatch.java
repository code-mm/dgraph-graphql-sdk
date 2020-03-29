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

public class PersonalAppearancePatch implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> films = Input.undefined();

    private Input<List<PersonOrEntityAppearingInFilmRef>> person = Input.undefined();

    private Input<List<PersonalAppearanceTypeRef>> typeOfAppearance = Input.undefined();

    private Input<List<PersonalAppearanceTypeRef>> appearances = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public PersonalAppearancePatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public PersonalAppearancePatch setNameInput(Input<String> name) {
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

    public PersonalAppearancePatch setFilms(List<FilmRef> films) {
        this.films = Input.optional(films);
        return this;
    }

    public PersonalAppearancePatch setFilmsInput(Input<List<FilmRef>> films) {
        if (films == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.films = films;
        return this;
    }

    public List<PersonOrEntityAppearingInFilmRef> getPerson() {
        return person.getValue();
    }

    public Input<List<PersonOrEntityAppearingInFilmRef>> getPersonInput() {
        return person;
    }

    public PersonalAppearancePatch setPerson(List<PersonOrEntityAppearingInFilmRef> person) {
        this.person = Input.optional(person);
        return this;
    }

    public PersonalAppearancePatch setPersonInput(Input<List<PersonOrEntityAppearingInFilmRef>> person) {
        if (person == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.person = person;
        return this;
    }

    public List<PersonalAppearanceTypeRef> getTypeOfAppearance() {
        return typeOfAppearance.getValue();
    }

    public Input<List<PersonalAppearanceTypeRef>> getTypeOfAppearanceInput() {
        return typeOfAppearance;
    }

    public PersonalAppearancePatch setTypeOfAppearance(List<PersonalAppearanceTypeRef> typeOfAppearance) {
        this.typeOfAppearance = Input.optional(typeOfAppearance);
        return this;
    }

    public PersonalAppearancePatch setTypeOfAppearanceInput(Input<List<PersonalAppearanceTypeRef>> typeOfAppearance) {
        if (typeOfAppearance == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.typeOfAppearance = typeOfAppearance;
        return this;
    }

    public List<PersonalAppearanceTypeRef> getAppearances() {
        return appearances.getValue();
    }

    public Input<List<PersonalAppearanceTypeRef>> getAppearancesInput() {
        return appearances;
    }

    public PersonalAppearancePatch setAppearances(List<PersonalAppearanceTypeRef> appearances) {
        this.appearances = Input.optional(appearances);
        return this;
    }

    public PersonalAppearancePatch setAppearancesInput(Input<List<PersonalAppearanceTypeRef>> appearances) {
        if (appearances == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appearances = appearances;
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

        if (this.person.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("person:");
            if (person.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PersonOrEntityAppearingInFilmRef item1 : person.getValue()) {
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

        if (this.typeOfAppearance.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type_of_appearance:");
            if (typeOfAppearance.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PersonalAppearanceTypeRef item1 : typeOfAppearance.getValue()) {
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

        if (this.appearances.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appearances:");
            if (appearances.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PersonalAppearanceTypeRef item1 : appearances.getValue()) {
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
