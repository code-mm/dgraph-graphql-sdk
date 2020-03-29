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
public class AddRegionalReleaseDatePayloadQuery extends Query<AddRegionalReleaseDatePayloadQuery> {
    AddRegionalReleaseDatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class RegionalreleasedateArguments extends Arguments {
        RegionalreleasedateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RegionalreleasedateArguments filter(RegionalReleaseDateFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RegionalreleasedateArguments order(RegionalReleaseDateOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RegionalreleasedateArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RegionalreleasedateArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RegionalreleasedateArgumentsDefinition {
        void define(RegionalreleasedateArguments args);
    }

    /**
    * 
    */
    public AddRegionalReleaseDatePayloadQuery regionalreleasedate(RegionalReleaseDateQueryDefinition queryDef) {
        return regionalreleasedate(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddRegionalReleaseDatePayloadQuery regionalreleasedate(RegionalreleasedateArgumentsDefinition argsDef, RegionalReleaseDateQueryDefinition queryDef) {
        startField("regionalreleasedate");

        RegionalreleasedateArguments args = new RegionalreleasedateArguments(_queryBuilder);
        argsDef.define(args);
        RegionalreleasedateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RegionalReleaseDateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
