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
public class Mutation extends AbstractResponse<Mutation> {
    public Mutation() {
    }

    public Mutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addProduct": {
                    AddProductPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddProductPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateProduct": {
                    UpdateProductPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateProductPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteProduct": {
                    DeleteProductPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteProductPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addCustomer": {
                    AddCustomerPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddCustomerPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCustomer": {
                    UpdateCustomerPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCustomerPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCustomer": {
                    DeleteCustomerPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCustomerPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addReview": {
                    AddReviewPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddReviewPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateReview": {
                    UpdateReviewPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateReviewPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteReview": {
                    DeleteReviewPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteReviewPayload(jsonAsObject(field.getValue(), key));
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
        return "Mutation";
    }

    /**
    * 
    */

    public AddProductPayload getAddProduct() {
        return (AddProductPayload) get("addProduct");
    }

    public Mutation setAddProduct(AddProductPayload arg) {
        optimisticData.put(getKey("addProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateProductPayload getUpdateProduct() {
        return (UpdateProductPayload) get("updateProduct");
    }

    public Mutation setUpdateProduct(UpdateProductPayload arg) {
        optimisticData.put(getKey("updateProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteProductPayload getDeleteProduct() {
        return (DeleteProductPayload) get("deleteProduct");
    }

    public Mutation setDeleteProduct(DeleteProductPayload arg) {
        optimisticData.put(getKey("deleteProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public AddCustomerPayload getAddCustomer() {
        return (AddCustomerPayload) get("addCustomer");
    }

    public Mutation setAddCustomer(AddCustomerPayload arg) {
        optimisticData.put(getKey("addCustomer"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateCustomerPayload getUpdateCustomer() {
        return (UpdateCustomerPayload) get("updateCustomer");
    }

    public Mutation setUpdateCustomer(UpdateCustomerPayload arg) {
        optimisticData.put(getKey("updateCustomer"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteCustomerPayload getDeleteCustomer() {
        return (DeleteCustomerPayload) get("deleteCustomer");
    }

    public Mutation setDeleteCustomer(DeleteCustomerPayload arg) {
        optimisticData.put(getKey("deleteCustomer"), arg);
        return this;
    }

    /**
    * 
    */

    public AddReviewPayload getAddReview() {
        return (AddReviewPayload) get("addReview");
    }

    public Mutation setAddReview(AddReviewPayload arg) {
        optimisticData.put(getKey("addReview"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateReviewPayload getUpdateReview() {
        return (UpdateReviewPayload) get("updateReview");
    }

    public Mutation setUpdateReview(UpdateReviewPayload arg) {
        optimisticData.put(getKey("updateReview"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteReviewPayload getDeleteReview() {
        return (DeleteReviewPayload) get("deleteReview");
    }

    public Mutation setDeleteReview(DeleteReviewPayload arg) {
        optimisticData.put(getKey("deleteReview"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addProduct": return true;

            case "updateProduct": return true;

            case "deleteProduct": return true;

            case "addCustomer": return true;

            case "updateCustomer": return true;

            case "deleteCustomer": return true;

            case "addReview": return true;

            case "updateReview": return true;

            case "deleteReview": return true;

            default: return false;
        }
    }
}

