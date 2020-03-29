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
public class UpdatePersonalAppearancePayload extends AbstractResponse<UpdatePersonalAppearancePayload> {
    public UpdatePersonalAppearancePayload() {
    }

    public UpdatePersonalAppearancePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "personalappearance": {
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
        return "UpdatePersonalAppearancePayload";
    }

    /**
    * 
    */

    public List<PersonalAppearance> getPersonalappearance() {
        return (List<PersonalAppearance>) get("personalappearance");
    }

    public UpdatePersonalAppearancePayload setPersonalappearance(List<PersonalAppearance> arg) {
        optimisticData.put(getKey("personalappearance"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "personalappearance": return true;

            default: return false;
        }
    }
}

