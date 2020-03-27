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
public class ReviewQuery extends Query<ReviewQuery> {
    ReviewQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public ReviewQuery id() {
        startField("id");

        return this;
    }

    public class AboutArguments extends Arguments {
        AboutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AboutArguments filter(ProductFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AboutArgumentsDefinition {
        void define(AboutArguments args);
    }

    /**
    * 
    */
    public ReviewQuery about(ProductQueryDefinition queryDef) {
        return about(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ReviewQuery about(AboutArgumentsDefinition argsDef, ProductQueryDefinition queryDef) {
        startField("about");

        AboutArguments args = new AboutArguments(_queryBuilder);
        argsDef.define(args);
        AboutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ByArguments extends Arguments {
        ByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ByArguments filter(CustomerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ByArgumentsDefinition {
        void define(ByArguments args);
    }

    /**
    * 
    */
    public ReviewQuery by(CustomerQueryDefinition queryDef) {
        return by(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ReviewQuery by(ByArgumentsDefinition argsDef, CustomerQueryDefinition queryDef) {
        startField("by");

        ByArguments args = new ByArguments(_queryBuilder);
        argsDef.define(args);
        ByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public ReviewQuery comment() {
        startField("comment");

        return this;
    }

    /**
    * 
    */
    public ReviewQuery rating() {
        startField("rating");

        return this;
    }
}
