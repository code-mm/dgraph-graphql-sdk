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
public enum FilmOrderable {
    /**
    * 
    */
    APPLE_MOVIETRAILER_ID,

    /**
    * 
    */
    FANDANGO_ID,

    /**
    * 
    */
    INITIAL_RELEASE_DATE,

    /**
    * 
    */
    METACRITIC_ID,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    NETFLIX_ID,

    /**
    * 
    */
    ROTTENTOMATOES_ID,

    /**
    * 
    */
    TAGLINE,

    /**
    * 
    */
    TRAILERADDICT_ID,

    UNKNOWN_VALUE;

    public static FilmOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "apple_movietrailer_id": {
                return APPLE_MOVIETRAILER_ID;
            }

            case "fandango_id": {
                return FANDANGO_ID;
            }

            case "initial_release_date": {
                return INITIAL_RELEASE_DATE;
            }

            case "metacritic_id": {
                return METACRITIC_ID;
            }

            case "name": {
                return NAME;
            }

            case "netflix_id": {
                return NETFLIX_ID;
            }

            case "rottentomatoes_id": {
                return ROTTENTOMATOES_ID;
            }

            case "tagline": {
                return TAGLINE;
            }

            case "traileraddict_id": {
                return TRAILERADDICT_ID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APPLE_MOVIETRAILER_ID: {
                return "apple_movietrailer_id";
            }

            case FANDANGO_ID: {
                return "fandango_id";
            }

            case INITIAL_RELEASE_DATE: {
                return "initial_release_date";
            }

            case METACRITIC_ID: {
                return "metacritic_id";
            }

            case NAME: {
                return "name";
            }

            case NETFLIX_ID: {
                return "netflix_id";
            }

            case ROTTENTOMATOES_ID: {
                return "rottentomatoes_id";
            }

            case TAGLINE: {
                return "tagline";
            }

            case TRAILERADDICT_ID: {
                return "traileraddict_id";
            }

            default: {
                return "";
            }
        }
    }
}

