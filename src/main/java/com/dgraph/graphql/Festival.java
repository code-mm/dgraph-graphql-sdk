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
public class Festival extends AbstractResponse<Festival> {
    public Festival() {
    }

    public Festival(JsonObject fields) throws SchemaViolationError {
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

                case "date_founded": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "focus": {
                    List<FestivalFocus> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<FestivalFocus> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            FestivalFocus optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new FestivalFocus(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "individual_festivals": {
                    List<FestivalEvent> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<FestivalEvent> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            FestivalEvent optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new FestivalEvent(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "location": {
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

                case "sponsoring_organization": {
                    List<FestivalSponsorship> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<FestivalSponsorship> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            FestivalSponsorship optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new FestivalSponsorship(jsonAsObject(element1, key));
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
        return "Festival";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Festival setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Festival setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public DateTime getDateFounded() {
        return (DateTime) get("date_founded");
    }

    public Festival setDateFounded(DateTime arg) {
        optimisticData.put(getKey("date_founded"), arg);
        return this;
    }

    /**
    * 
    */

    public List<FestivalFocus> getFocus() {
        return (List<FestivalFocus>) get("focus");
    }

    public Festival setFocus(List<FestivalFocus> arg) {
        optimisticData.put(getKey("focus"), arg);
        return this;
    }

    /**
    * 
    */

    public List<FestivalEvent> getIndividualFestivals() {
        return (List<FestivalEvent>) get("individual_festivals");
    }

    public Festival setIndividualFestivals(List<FestivalEvent> arg) {
        optimisticData.put(getKey("individual_festivals"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Location> getLocation() {
        return (List<Location>) get("location");
    }

    public Festival setLocation(List<Location> arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * 
    */

    public List<FestivalSponsorship> getSponsoringOrganization() {
        return (List<FestivalSponsorship>) get("sponsoring_organization");
    }

    public Festival setSponsoringOrganization(List<FestivalSponsorship> arg) {
        optimisticData.put(getKey("sponsoring_organization"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "date_founded": return false;

            case "focus": return true;

            case "individual_festivals": return true;

            case "location": return true;

            case "sponsoring_organization": return true;

            default: return false;
        }
    }
}

