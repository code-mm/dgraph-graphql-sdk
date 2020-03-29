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
public enum RatingOrderable {
    /**
    * 
    */
    MINIMUM_ACCOMPANIED_AGE,

    /**
    * 
    */
    MINIMUM_UNACCOMPANIED_AGE,

    /**
    * 
    */
    NAME,

    UNKNOWN_VALUE;

    public static RatingOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "minimum_accompanied_age": {
                return MINIMUM_ACCOMPANIED_AGE;
            }

            case "minimum_unaccompanied_age": {
                return MINIMUM_UNACCOMPANIED_AGE;
            }

            case "name": {
                return NAME;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MINIMUM_ACCOMPANIED_AGE: {
                return "minimum_accompanied_age";
            }

            case MINIMUM_UNACCOMPANIED_AGE: {
                return "minimum_unaccompanied_age";
            }

            case NAME: {
                return "name";
            }

            default: {
                return "";
            }
        }
    }
}

