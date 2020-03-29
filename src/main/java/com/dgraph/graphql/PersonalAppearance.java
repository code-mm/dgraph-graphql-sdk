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
public class PersonalAppearance extends AbstractResponse<PersonalAppearance> {
    public PersonalAppearance() {
    }

    public PersonalAppearance(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
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

                case "person": {
                    List<PersonOrEntityAppearingInFilm> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PersonOrEntityAppearingInFilm> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PersonOrEntityAppearingInFilm optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PersonOrEntityAppearingInFilm(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type_of_appearance": {
                    List<PersonalAppearanceType> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PersonalAppearanceType> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PersonalAppearanceType optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PersonalAppearanceType(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appearances": {
                    List<PersonalAppearanceType> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PersonalAppearanceType> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PersonalAppearanceType optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PersonalAppearanceType(jsonAsObject(element1, key));
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
        return "PersonalAppearance";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public PersonalAppearance setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public PersonalAppearance setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Film> getFilms() {
        return (List<Film>) get("films");
    }

    public PersonalAppearance setFilms(List<Film> arg) {
        optimisticData.put(getKey("films"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PersonOrEntityAppearingInFilm> getPerson() {
        return (List<PersonOrEntityAppearingInFilm>) get("person");
    }

    public PersonalAppearance setPerson(List<PersonOrEntityAppearingInFilm> arg) {
        optimisticData.put(getKey("person"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PersonalAppearanceType> getTypeOfAppearance() {
        return (List<PersonalAppearanceType>) get("type_of_appearance");
    }

    public PersonalAppearance setTypeOfAppearance(List<PersonalAppearanceType> arg) {
        optimisticData.put(getKey("type_of_appearance"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PersonalAppearanceType> getAppearances() {
        return (List<PersonalAppearanceType>) get("appearances");
    }

    public PersonalAppearance setAppearances(List<PersonalAppearanceType> arg) {
        optimisticData.put(getKey("appearances"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "films": return true;

            case "person": return true;

            case "type_of_appearance": return true;

            case "appearances": return true;

            default: return false;
        }
    }
}

