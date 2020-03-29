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
public enum CutOrderable {
    /**
    * 
    */
    NAME,

    /**
    * 
    */
    NOTE,

    /**
    * 
    */
    RUNTIME,

    UNKNOWN_VALUE;

    public static CutOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "name": {
                return NAME;
            }

            case "note": {
                return NOTE;
            }

            case "runtime": {
                return RUNTIME;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NAME: {
                return "name";
            }

            case NOTE: {
                return "note";
            }

            case RUNTIME: {
                return "runtime";
            }

            default: {
                return "";
            }
        }
    }
}

