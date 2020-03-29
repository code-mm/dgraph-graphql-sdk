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
public class RegionalReleaseDateQuery extends Query<RegionalReleaseDateQuery> {
    RegionalReleaseDateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public RegionalReleaseDateQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public RegionalReleaseDateQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public RegionalReleaseDateQuery releaseDate() {
        startField("release_date");

        return this;
    }

    public class ReleaseRegionArguments extends Arguments {
        ReleaseRegionArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ReleaseRegionArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReleaseRegionArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReleaseRegionArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ReleaseRegionArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReleaseRegionArgumentsDefinition {
        void define(ReleaseRegionArguments args);
    }

    /**
    * 
    */
    public RegionalReleaseDateQuery releaseRegion(LocationQueryDefinition queryDef) {
        return releaseRegion(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RegionalReleaseDateQuery releaseRegion(ReleaseRegionArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("release_region");

        ReleaseRegionArguments args = new ReleaseRegionArguments(_queryBuilder);
        argsDef.define(args);
        ReleaseRegionArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
