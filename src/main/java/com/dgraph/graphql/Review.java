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
public class Review extends AbstractResponse<Review> {
    public Review() {
    }

    public Review(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "about": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "by": {
                    responseData.put(key, new Customer(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "comment": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rating": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "Review";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Review setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * 
    */

    public Product getAbout() {
        return (Product) get("about");
    }

    public Review setAbout(Product arg) {
        optimisticData.put(getKey("about"), arg);
        return this;
    }

    /**
    * 
    */

    public Customer getBy() {
        return (Customer) get("by");
    }

    public Review setBy(Customer arg) {
        optimisticData.put(getKey("by"), arg);
        return this;
    }

    /**
    * 
    */

    public String getComment() {
        return (String) get("comment");
    }

    public Review setComment(String arg) {
        optimisticData.put(getKey("comment"), arg);
        return this;
    }

    /**
    * 
    */

    public Integer getRating() {
        return (Integer) get("rating");
    }

    public Review setRating(Integer arg) {
        optimisticData.put(getKey("rating"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "about": return true;

            case "by": return true;

            case "comment": return false;

            case "rating": return false;

            default: return false;
        }
    }
}

