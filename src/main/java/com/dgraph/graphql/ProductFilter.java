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

public class ProductFilter implements Serializable {
    private Input<List<ID>> productId = Input.undefined();

    private Input<StringTermFilter> name = Input.undefined();

    private Input<ProductFilter> and = Input.undefined();

    private Input<ProductFilter> or = Input.undefined();

    private Input<ProductFilter> not = Input.undefined();

    public List<ID> getProductId() {
        return productId.getValue();
    }

    public Input<List<ID>> getProductIdInput() {
        return productId;
    }

    public ProductFilter setProductId(List<ID> productId) {
        this.productId = Input.optional(productId);
        return this;
    }

    public ProductFilter setProductIdInput(Input<List<ID>> productId) {
        if (productId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productId = productId;
        return this;
    }

    public StringTermFilter getName() {
        return name.getValue();
    }

    public Input<StringTermFilter> getNameInput() {
        return name;
    }

    public ProductFilter setName(StringTermFilter name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProductFilter setNameInput(Input<StringTermFilter> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public ProductFilter getAnd() {
        return and.getValue();
    }

    public Input<ProductFilter> getAndInput() {
        return and;
    }

    public ProductFilter setAnd(ProductFilter and) {
        this.and = Input.optional(and);
        return this;
    }

    public ProductFilter setAndInput(Input<ProductFilter> and) {
        if (and == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.and = and;
        return this;
    }

    public ProductFilter getOr() {
        return or.getValue();
    }

    public Input<ProductFilter> getOrInput() {
        return or;
    }

    public ProductFilter setOr(ProductFilter or) {
        this.or = Input.optional(or);
        return this;
    }

    public ProductFilter setOrInput(Input<ProductFilter> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public ProductFilter getNot() {
        return not.getValue();
    }

    public Input<ProductFilter> getNotInput() {
        return not;
    }

    public ProductFilter setNot(ProductFilter not) {
        this.not = Input.optional(not);
        return this;
    }

    public ProductFilter setNotInput(Input<ProductFilter> not) {
        if (not == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.not = not;
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
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productId.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.and.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("and:");
            if (and.getValue() != null) {
                and.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.or.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("or:");
            if (or.getValue() != null) {
                or.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.not.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("not:");
            if (not.getValue() != null) {
                not.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
