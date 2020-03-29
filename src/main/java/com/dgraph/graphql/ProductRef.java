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

public class ProductRef implements Serializable {
    private Input<ID> productId = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<List<ReviewRef>> reviews = Input.undefined();

    public ID getProductId() {
        return productId.getValue();
    }

    public Input<ID> getProductIdInput() {
        return productId;
    }

    public ProductRef setProductId(ID productId) {
        this.productId = Input.optional(productId);
        return this;
    }

    public ProductRef setProductIdInput(Input<ID> productId) {
        if (productId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productId = productId;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public ProductRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProductRef setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<ReviewRef> getReviews() {
        return reviews.getValue();
    }

    public Input<List<ReviewRef>> getReviewsInput() {
        return reviews;
    }

    public ProductRef setReviews(List<ReviewRef> reviews) {
        this.reviews = Input.optional(reviews);
        return this;
    }

    public ProductRef setReviewsInput(Input<List<ReviewRef>> reviews) {
        if (reviews == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reviews = reviews;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.productId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productID:");
            if (productId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, productId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.reviews.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reviews:");
            if (reviews.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReviewRef item1 : reviews.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
