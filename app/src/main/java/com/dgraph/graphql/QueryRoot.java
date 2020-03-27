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
public class QueryRoot extends AbstractResponse<QueryRoot> {
    public QueryRoot() {
    }

    public QueryRoot(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "getProduct": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryProduct": {
                    List<Product> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Product> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Product optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Product(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getCustomer": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryCustomer": {
                    List<Customer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Customer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Customer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Customer(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getReview": {
                    Review optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Review(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryReview": {
                    List<Review> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Review> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Review optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Review(jsonAsObject(element1, key));
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
        return "QueryRoot";
    }

    /**
    * 
    */

    public Product getGetProduct() {
        return (Product) get("getProduct");
    }

    public QueryRoot setGetProduct(Product arg) {
        optimisticData.put(getKey("getProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Product> getQueryProduct() {
        return (List<Product>) get("queryProduct");
    }

    public QueryRoot setQueryProduct(List<Product> arg) {
        optimisticData.put(getKey("queryProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public Customer getGetCustomer() {
        return (Customer) get("getCustomer");
    }

    public QueryRoot setGetCustomer(Customer arg) {
        optimisticData.put(getKey("getCustomer"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Customer> getQueryCustomer() {
        return (List<Customer>) get("queryCustomer");
    }

    public QueryRoot setQueryCustomer(List<Customer> arg) {
        optimisticData.put(getKey("queryCustomer"), arg);
        return this;
    }

    /**
    * 
    */

    public Review getGetReview() {
        return (Review) get("getReview");
    }

    public QueryRoot setGetReview(Review arg) {
        optimisticData.put(getKey("getReview"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Review> getQueryReview() {
        return (List<Review>) get("queryReview");
    }

    public QueryRoot setQueryReview(List<Review> arg) {
        optimisticData.put(getKey("queryReview"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "getProduct": return true;

            case "queryProduct": return true;

            case "getCustomer": return true;

            case "queryCustomer": return true;

            case "getReview": return true;

            case "queryReview": return true;

            default: return false;
        }
    }
}

