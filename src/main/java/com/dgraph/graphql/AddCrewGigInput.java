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

public class AddCrewGigInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<JobRef>> crewRole = Input.undefined();

    private Input<List<CrewMemberRef>> crewmember = Input.undefined();

    private Input<List<FilmRef>> films = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AddCrewGigInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AddCrewGigInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<JobRef> getCrewRole() {
        return crewRole.getValue();
    }

    public Input<List<JobRef>> getCrewRoleInput() {
        return crewRole;
    }

    public AddCrewGigInput setCrewRole(List<JobRef> crewRole) {
        this.crewRole = Input.optional(crewRole);
        return this;
    }

    public AddCrewGigInput setCrewRoleInput(Input<List<JobRef>> crewRole) {
        if (crewRole == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.crewRole = crewRole;
        return this;
    }

    public List<CrewMemberRef> getCrewmember() {
        return crewmember.getValue();
    }

    public Input<List<CrewMemberRef>> getCrewmemberInput() {
        return crewmember;
    }

    public AddCrewGigInput setCrewmember(List<CrewMemberRef> crewmember) {
        this.crewmember = Input.optional(crewmember);
        return this;
    }

    public AddCrewGigInput setCrewmemberInput(Input<List<CrewMemberRef>> crewmember) {
        if (crewmember == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.crewmember = crewmember;
        return this;
    }

    public List<FilmRef> getFilms() {
        return films.getValue();
    }

    public Input<List<FilmRef>> getFilmsInput() {
        return films;
    }

    public AddCrewGigInput setFilms(List<FilmRef> films) {
        this.films = Input.optional(films);
        return this;
    }

    public AddCrewGigInput setFilmsInput(Input<List<FilmRef>> films) {
        if (films == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.films = films;
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

        if (this.crewRole.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("crew_role:");
            if (crewRole.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (JobRef item1 : crewRole.getValue()) {
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

        if (this.crewmember.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("crewmember:");
            if (crewmember.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CrewMemberRef item1 : crewmember.getValue()) {
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

        _queryBuilder.append('}');
    }
}
