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
public class UpdateSongPerformerPayload extends AbstractResponse<UpdateSongPerformerPayload> {
    public UpdateSongPerformerPayload() {
    }

    public UpdateSongPerformerPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "songperformer": {
                    List<SongPerformer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SongPerformer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SongPerformer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SongPerformer(jsonAsObject(element1, key));
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
        return "UpdateSongPerformerPayload";
    }

    /**
    * 
    */

    public List<SongPerformer> getSongperformer() {
        return (List<SongPerformer>) get("songperformer");
    }

    public UpdateSongPerformerPayload setSongperformer(List<SongPerformer> arg) {
        optimisticData.put(getKey("songperformer"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "songperformer": return true;

            default: return false;
        }
    }
}

