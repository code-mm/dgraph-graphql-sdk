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

public class CustomerRef implements Serializable {
    private Input<String> username = Input.undefined();

    private Input<List<ReviewRef>> reviews = Input.undefined();

    public String getUsername() {
        return username.getValue();
    }

    public Input<String> getUsernameInput() {
        return username;
    }

    public CustomerRef setUsername(String username) {
        this.username = Input.optional(username);
        return this;
    }

    public CustomerRef setUsernameInput(Input<String> username) {
        if (username == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.username = username;
        return this;
    }

    public List<ReviewRef> getReviews() {
        return reviews.getValue();
    }

    public Input<List<ReviewRef>> getReviewsInput() {
        return reviews;
    }

    public CustomerRef setReviews(List<ReviewRef> reviews) {
        this.reviews = Input.optional(reviews);
        return this;
    }

    public CustomerRef setReviewsInput(Input<List<ReviewRef>> reviews) {
        if (reviews == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reviews = reviews;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.username.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("username:");
            if (username.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, username.getValue().toString());
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
