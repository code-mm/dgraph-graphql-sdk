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

public class ReviewRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<ProductRef> about = Input.undefined();

    private Input<CustomerRef> by = Input.undefined();

    private Input<String> comment = Input.undefined();

    private Input<Integer> rating = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ReviewRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ReviewRef setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public ProductRef getAbout() {
        return about.getValue();
    }

    public Input<ProductRef> getAboutInput() {
        return about;
    }

    public ReviewRef setAbout(ProductRef about) {
        this.about = Input.optional(about);
        return this;
    }

    public ReviewRef setAboutInput(Input<ProductRef> about) {
        if (about == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.about = about;
        return this;
    }

    public CustomerRef getBy() {
        return by.getValue();
    }

    public Input<CustomerRef> getByInput() {
        return by;
    }

    public ReviewRef setBy(CustomerRef by) {
        this.by = Input.optional(by);
        return this;
    }

    public ReviewRef setByInput(Input<CustomerRef> by) {
        if (by == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.by = by;
        return this;
    }

    public String getComment() {
        return comment.getValue();
    }

    public Input<String> getCommentInput() {
        return comment;
    }

    public ReviewRef setComment(String comment) {
        this.comment = Input.optional(comment);
        return this;
    }

    public ReviewRef setCommentInput(Input<String> comment) {
        if (comment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.comment = comment;
        return this;
    }

    public Integer getRating() {
        return rating.getValue();
    }

    public Input<Integer> getRatingInput() {
        return rating;
    }

    public ReviewRef setRating(Integer rating) {
        this.rating = Input.optional(rating);
        return this;
    }

    public ReviewRef setRatingInput(Input<Integer> rating) {
        if (rating == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.rating = rating;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.about.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("about:");
            if (about.getValue() != null) {
                about.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.by.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("by:");
            if (by.getValue() != null) {
                by.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.comment.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("comment:");
            if (comment.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, comment.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.rating.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("rating:");
            if (rating.getValue() != null) {
                _queryBuilder.append(rating.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
