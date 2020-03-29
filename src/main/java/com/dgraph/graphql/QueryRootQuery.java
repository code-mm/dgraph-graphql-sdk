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
public class QueryRootQuery extends Query<QueryRootQuery> {
    QueryRootQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public QueryRootQuery getProduct(ID productId, ProductQueryDefinition queryDef) {
        startField("getProduct");

        _queryBuilder.append("(productID:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryProductArguments extends Arguments {
        QueryProductArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryProductArguments filter(ProductFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductArguments order(ProductOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryProductArgumentsDefinition {
        void define(QueryProductArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryProduct(ProductQueryDefinition queryDef) {
        return queryProduct(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryProduct(QueryProductArgumentsDefinition argsDef, ProductQueryDefinition queryDef) {
        startField("queryProduct");

        QueryProductArguments args = new QueryProductArguments(_queryBuilder);
        argsDef.define(args);
        QueryProductArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getCustomer(String username, CustomerQueryDefinition queryDef) {
        startField("getCustomer");

        _queryBuilder.append("(username:");
        Query.appendQuotedString(_queryBuilder, username.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryCustomerArguments extends Arguments {
        QueryCustomerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryCustomerArguments filter(CustomerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCustomerArguments order(CustomerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCustomerArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCustomerArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryCustomerArgumentsDefinition {
        void define(QueryCustomerArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryCustomer(CustomerQueryDefinition queryDef) {
        return queryCustomer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryCustomer(QueryCustomerArgumentsDefinition argsDef, CustomerQueryDefinition queryDef) {
        startField("queryCustomer");

        QueryCustomerArguments args = new QueryCustomerArguments(_queryBuilder);
        argsDef.define(args);
        QueryCustomerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getReview(ID id, ReviewQueryDefinition queryDef) {
        startField("getReview");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryReviewArguments extends Arguments {
        QueryReviewArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryReviewArguments filter(ReviewFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReviewArguments order(ReviewOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReviewArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReviewArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryReviewArgumentsDefinition {
        void define(QueryReviewArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryReview(ReviewQueryDefinition queryDef) {
        return queryReview(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryReview(QueryReviewArgumentsDefinition argsDef, ReviewQueryDefinition queryDef) {
        startField("queryReview");

        QueryReviewArguments args = new QueryReviewArguments(_queryBuilder);
        argsDef.define(args);
        QueryReviewArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
