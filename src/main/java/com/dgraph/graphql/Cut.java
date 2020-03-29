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
public class Cut extends AbstractResponse<Cut> {
    public Cut() {
    }

    public Cut(JsonObject fields) throws SchemaViolationError {
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

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "release_region": {
                    List<Location> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Location> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Location optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Location(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "runtime": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type_of_cut": {
                    List<CutType> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CutType> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CutType optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CutType(jsonAsObject(element1, key));
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
        return "Cut";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Cut setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Cut setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Film> getFilms() {
        return (List<Film>) get("films");
    }

    public Cut setFilms(List<Film> arg) {
        optimisticData.put(getKey("films"), arg);
        return this;
    }

    /**
    * 
    */

    public String getNote() {
        return (String) get("note");
    }

    public Cut setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Location> getReleaseRegion() {
        return (List<Location>) get("release_region");
    }

    public Cut setReleaseRegion(List<Location> arg) {
        optimisticData.put(getKey("release_region"), arg);
        return this;
    }

    /**
    * 
    */

    public Double getRuntime() {
        return (Double) get("runtime");
    }

    public Cut setRuntime(Double arg) {
        optimisticData.put(getKey("runtime"), arg);
        return this;
    }

    /**
    * 
    */

    public List<CutType> getTypeOfCut() {
        return (List<CutType>) get("type_of_cut");
    }

    public Cut setTypeOfCut(List<CutType> arg) {
        optimisticData.put(getKey("type_of_cut"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "films": return true;

            case "note": return false;

            case "release_region": return true;

            case "runtime": return false;

            case "type_of_cut": return true;

            default: return false;
        }
    }
}

