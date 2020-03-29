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

public class PerformanceRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<ActorRef>> actor = Input.undefined();

    private Input<List<CharacterRef>> character = Input.undefined();

    private Input<String> characterNote = Input.undefined();

    private Input<List<FilmRef>> films = Input.undefined();

    private Input<List<SpecialPerformanceTypeRef>> specialPerformanceType = Input.undefined();

    private Input<List<PersonalAppearanceRef>> appearances = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public PerformanceRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public PerformanceRef setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public List<ActorRef> getActor() {
        return actor.getValue();
    }

    public Input<List<ActorRef>> getActorInput() {
        return actor;
    }

    public PerformanceRef setActor(List<ActorRef> actor) {
        this.actor = Input.optional(actor);
        return this;
    }

    public PerformanceRef setActorInput(Input<List<ActorRef>> actor) {
        if (actor == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.actor = actor;
        return this;
    }

    public List<CharacterRef> getCharacter() {
        return character.getValue();
    }

    public Input<List<CharacterRef>> getCharacterInput() {
        return character;
    }

    public PerformanceRef setCharacter(List<CharacterRef> character) {
        this.character = Input.optional(character);
        return this;
    }

    public PerformanceRef setCharacterInput(Input<List<CharacterRef>> character) {
        if (character == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.character = character;
        return this;
    }

    public String getCharacterNote() {
        return characterNote.getValue();
    }

    public Input<String> getCharacterNoteInput() {
        return characterNote;
    }

    public PerformanceRef setCharacterNote(String characterNote) {
        this.characterNote = Input.optional(characterNote);
        return this;
    }

    public PerformanceRef setCharacterNoteInput(Input<String> characterNote) {
        if (characterNote == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.characterNote = characterNote;
        return this;
    }

    public List<FilmRef> getFilms() {
        return films.getValue();
    }

    public Input<List<FilmRef>> getFilmsInput() {
        return films;
    }

    public PerformanceRef setFilms(List<FilmRef> films) {
        this.films = Input.optional(films);
        return this;
    }

    public PerformanceRef setFilmsInput(Input<List<FilmRef>> films) {
        if (films == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.films = films;
        return this;
    }

    public List<SpecialPerformanceTypeRef> getSpecialPerformanceType() {
        return specialPerformanceType.getValue();
    }

    public Input<List<SpecialPerformanceTypeRef>> getSpecialPerformanceTypeInput() {
        return specialPerformanceType;
    }

    public PerformanceRef setSpecialPerformanceType(List<SpecialPerformanceTypeRef> specialPerformanceType) {
        this.specialPerformanceType = Input.optional(specialPerformanceType);
        return this;
    }

    public PerformanceRef setSpecialPerformanceTypeInput(Input<List<SpecialPerformanceTypeRef>> specialPerformanceType) {
        if (specialPerformanceType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialPerformanceType = specialPerformanceType;
        return this;
    }

    public List<PersonalAppearanceRef> getAppearances() {
        return appearances.getValue();
    }

    public Input<List<PersonalAppearanceRef>> getAppearancesInput() {
        return appearances;
    }

    public PerformanceRef setAppearances(List<PersonalAppearanceRef> appearances) {
        this.appearances = Input.optional(appearances);
        return this;
    }

    public PerformanceRef setAppearancesInput(Input<List<PersonalAppearanceRef>> appearances) {
        if (appearances == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appearances = appearances;
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

        if (this.actor.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("actor:");
            if (actor.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ActorRef item1 : actor.getValue()) {
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

        if (this.character.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("character:");
            if (character.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CharacterRef item1 : character.getValue()) {
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

        if (this.characterNote.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("character_note:");
            if (characterNote.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, characterNote.getValue().toString());
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

        if (this.specialPerformanceType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("special_performance_type:");
            if (specialPerformanceType.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SpecialPerformanceTypeRef item1 : specialPerformanceType.getValue()) {
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
                    for (PersonalAppearanceRef item1 : appearances.getValue()) {
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
