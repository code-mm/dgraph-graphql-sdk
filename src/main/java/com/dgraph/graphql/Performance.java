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

/**
* 
*/
public class Performance extends AbstractResponse<Performance> {
    public Performance() {
    }

    public Performance(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "actor": {
                    List<Actor> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Actor> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Actor optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Actor(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "character": {
                    List<Character> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Character> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Character optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Character(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "character_note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "films": {
                    List<Film> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Film> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Film optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Film(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "special_performance_type": {
                    List<SpecialPerformanceType> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SpecialPerformanceType> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SpecialPerformanceType optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SpecialPerformanceType(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appearances": {
                    List<PersonalAppearance> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PersonalAppearance> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PersonalAppearance optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PersonalAppearance(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Performance";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Performance setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Actor> getActor() {
        return (List<Actor>) get("actor");
    }

    public Performance setActor(List<Actor> arg) {
        optimisticData.put(getKey("actor"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Character> getCharacter() {
        return (List<Character>) get("character");
    }

    public Performance setCharacter(List<Character> arg) {
        optimisticData.put(getKey("character"), arg);
        return this;
    }

    /**
    * 
    */

    public String getCharacterNote() {
        return (String) get("character_note");
    }

    public Performance setCharacterNote(String arg) {
        optimisticData.put(getKey("character_note"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Film> getFilms() {
        return (List<Film>) get("films");
    }

    public Performance setFilms(List<Film> arg) {
        optimisticData.put(getKey("films"), arg);
        return this;
    }

    /**
    * 
    */

    public List<SpecialPerformanceType> getSpecialPerformanceType() {
        return (List<SpecialPerformanceType>) get("special_performance_type");
    }

    public Performance setSpecialPerformanceType(List<SpecialPerformanceType> arg) {
        optimisticData.put(getKey("special_performance_type"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PersonalAppearance> getAppearances() {
        return (List<PersonalAppearance>) get("appearances");
    }

    public Performance setAppearances(List<PersonalAppearance> arg) {
        optimisticData.put(getKey("appearances"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "actor": return true;

            case "character": return true;

            case "character_note": return false;

            case "films": return true;

            case "special_performance_type": return true;

            case "appearances": return true;

            default: return false;
        }
    }
}

