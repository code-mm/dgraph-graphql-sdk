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
public class Rating extends AbstractResponse<Rating> {
    public Rating() {
    }

    public Rating(JsonObject fields) throws SchemaViolationError {
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

                case "country": {
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

                case "minimum_accompanied_age": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minimum_unaccompanied_age": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rating_system": {
                    List<RatingSystem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<RatingSystem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            RatingSystem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new RatingSystem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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
        return "Rating";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Rating setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Rating setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Location> getCountry() {
        return (List<Location>) get("country");
    }

    public Rating setCountry(List<Location> arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * 
    */

    public Integer getMinimumAccompaniedAge() {
        return (Integer) get("minimum_accompanied_age");
    }

    public Rating setMinimumAccompaniedAge(Integer arg) {
        optimisticData.put(getKey("minimum_accompanied_age"), arg);
        return this;
    }

    /**
    * 
    */

    public Integer getMinimumUnaccompaniedAge() {
        return (Integer) get("minimum_unaccompanied_age");
    }

    public Rating setMinimumUnaccompaniedAge(Integer arg) {
        optimisticData.put(getKey("minimum_unaccompanied_age"), arg);
        return this;
    }

    /**
    * 
    */

    public List<RatingSystem> getRatingSystem() {
        return (List<RatingSystem>) get("rating_system");
    }

    public Rating setRatingSystem(List<RatingSystem> arg) {
        optimisticData.put(getKey("rating_system"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Film> getFilms() {
        return (List<Film>) get("films");
    }

    public Rating setFilms(List<Film> arg) {
        optimisticData.put(getKey("films"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "country": return true;

            case "minimum_accompanied_age": return false;

            case "minimum_unaccompanied_age": return false;

            case "rating_system": return true;

            case "films": return true;

            default: return false;
        }
    }
}

