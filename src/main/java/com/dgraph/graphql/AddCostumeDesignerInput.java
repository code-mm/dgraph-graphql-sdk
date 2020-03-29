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

public class AddCostumeDesignerInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> costumeDesignForFilm = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AddCostumeDesignerInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AddCostumeDesignerInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<FilmRef> getCostumeDesignForFilm() {
        return costumeDesignForFilm.getValue();
    }

    public Input<List<FilmRef>> getCostumeDesignForFilmInput() {
        return costumeDesignForFilm;
    }

    public AddCostumeDesignerInput setCostumeDesignForFilm(List<FilmRef> costumeDesignForFilm) {
        this.costumeDesignForFilm = Input.optional(costumeDesignForFilm);
        return this;
    }

    public AddCostumeDesignerInput setCostumeDesignForFilmInput(Input<List<FilmRef>> costumeDesignForFilm) {
        if (costumeDesignForFilm == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.costumeDesignForFilm = costumeDesignForFilm;
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

        if (this.costumeDesignForFilm.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("costume_design_for_film:");
            if (costumeDesignForFilm.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : costumeDesignForFilm.getValue()) {
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
