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
public class MutationQuery extends Query<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public MutationQuery addProduct(List<AddProductInput> input, AddProductPayloadQueryDefinition queryDef) {
        startField("addProduct");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddProductInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddProductPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateProduct(UpdateProductInput input, UpdateProductPayloadQueryDefinition queryDef) {
        startField("updateProduct");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateProductPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deleteProduct(ProductFilter filter, DeleteProductPayloadQueryDefinition queryDef) {
        startField("deleteProduct");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteProductPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addCustomer(List<AddCustomerInput> input, AddCustomerPayloadQueryDefinition queryDef) {
        startField("addCustomer");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddCustomerInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddCustomerPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateCustomer(UpdateCustomerInput input, UpdateCustomerPayloadQueryDefinition queryDef) {
        startField("updateCustomer");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCustomerPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deleteCustomer(CustomerFilter filter, DeleteCustomerPayloadQueryDefinition queryDef) {
        startField("deleteCustomer");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCustomerPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addReview(List<AddReviewInput> input, AddReviewPayloadQueryDefinition queryDef) {
        startField("addReview");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddReviewInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddReviewPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateReview(UpdateReviewInput input, UpdateReviewPayloadQueryDefinition queryDef) {
        startField("updateReview");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateReviewPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deleteReview(ReviewFilter filter, DeleteReviewPayloadQueryDefinition queryDef) {
        startField("deleteReview");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteReviewPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
