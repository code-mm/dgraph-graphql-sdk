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
public class Film extends AbstractResponse<Film> {
    public Film() {
    }

    public Film(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "apple_movietrailer_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "art_direction_by": {
                    List<ArtDirector> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ArtDirector> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ArtDirector optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ArtDirector(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "casting_director": {
                    List<CastingDirector> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CastingDirector> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CastingDirector optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CastingDirector(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cinematography": {
                    List<Cinematographer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Cinematographer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Cinematographer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Cinematographer(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collections": {
                    List<Collection> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Collection> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Collection optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Collection(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "costume_design_by": {
                    List<CostumeDesigner> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CostumeDesigner> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CostumeDesigner optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CostumeDesigner(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country": {
                    List<Location> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Location> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Location optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Location(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "directed_by": {
                    List<Director> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Director> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Director optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Director(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "distributors": {
                    List<Distributor> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Distributor> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Distributor optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Distributor(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dubbing_performances": {
                    List<Actor> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Actor> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Actor optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Actor(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "edited_by": {
                    List<Editor> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Editor> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Editor optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Editor(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "executive_produced_by": {
                    List<Producer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Producer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Producer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Producer(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fandango_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "featured_locations": {
                    List<Location> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Location> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Location optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Location(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "featured_song": {
                    List<Song> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Song> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Song optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Song(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "festivals": {
                    List<Festival> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Festival> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Festival optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Festival(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "format": {
                    List<Format> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Format> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Format optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Format(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "genre": {
                    List<Genre> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Genre> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Genre optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Genre(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "initial_release_date": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locations": {
                    List<Location> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Location> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Location optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Location(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metacritic_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "music": {
                    List<MusicContributor> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MusicContributor> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MusicContributor optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new MusicContributor(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "netflix_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "personal_appearances": {
                    List<PersonalAppearance> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PersonalAppearance> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PersonalAppearance optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PersonalAppearance(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prequel": {
                    List<Film> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Film> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Film optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Film(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "produced_by": {
                    List<Producer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Producer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Producer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Producer(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "production_companies": {
                    List<ProductionCompany> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductionCompany> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductionCompany optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ProductionCompany(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "production_design_by": {
                    List<ProductionDesigner> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductionDesigner> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductionDesigner optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ProductionDesigner(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rating": {
                    List<Rating> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Rating> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Rating optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Rating(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "release_date_s": {
                    List<RegionalReleaseDate> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<RegionalReleaseDate> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            RegionalReleaseDate optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new RegionalReleaseDate(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rottentomatoes_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sequel": {
                    List<Film> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Film> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Film optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Film(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "series": {
                    List<Series> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Series> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Series optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Series(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "set_decoration_by": {
                    List<SetDecorator> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SetDecorator> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SetDecorator optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SetDecorator(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "songs": {
                    List<Song> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Song> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Song optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Song(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "starring": {
                    List<Performance> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Performance> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Performance optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Performance(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "story_by": {
                    List<StoryContributor> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<StoryContributor> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            StoryContributor optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new StoryContributor(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subjects": {
                    List<Subject> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Subject> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Subject optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Subject(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tagline": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "traileraddict_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "written_by": {
                    List<Writer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Writer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Writer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Writer(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Film";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Film setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAppleMovietrailerId() {
        return (String) get("apple_movietrailer_id");
    }

    public Film setAppleMovietrailerId(String arg) {
        optimisticData.put(getKey("apple_movietrailer_id"), arg);
        return this;
    }

    /**
    * 
    */

    public List<ArtDirector> getArtDirectionBy() {
        return (List<ArtDirector>) get("art_direction_by");
    }

    public Film setArtDirectionBy(List<ArtDirector> arg) {
        optimisticData.put(getKey("art_direction_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<CastingDirector> getCastingDirector() {
        return (List<CastingDirector>) get("casting_director");
    }

    public Film setCastingDirector(List<CastingDirector> arg) {
        optimisticData.put(getKey("casting_director"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Cinematographer> getCinematography() {
        return (List<Cinematographer>) get("cinematography");
    }

    public Film setCinematography(List<Cinematographer> arg) {
        optimisticData.put(getKey("cinematography"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Collection> getCollections() {
        return (List<Collection>) get("collections");
    }

    public Film setCollections(List<Collection> arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    /**
    * 
    */

    public List<CostumeDesigner> getCostumeDesignBy() {
        return (List<CostumeDesigner>) get("costume_design_by");
    }

    public Film setCostumeDesignBy(List<CostumeDesigner> arg) {
        optimisticData.put(getKey("costume_design_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Location> getCountry() {
        return (List<Location>) get("country");
    }

    public Film setCountry(List<Location> arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Director> getDirectedBy() {
        return (List<Director>) get("directed_by");
    }

    public Film setDirectedBy(List<Director> arg) {
        optimisticData.put(getKey("directed_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Distributor> getDistributors() {
        return (List<Distributor>) get("distributors");
    }

    public Film setDistributors(List<Distributor> arg) {
        optimisticData.put(getKey("distributors"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Actor> getDubbingPerformances() {
        return (List<Actor>) get("dubbing_performances");
    }

    public Film setDubbingPerformances(List<Actor> arg) {
        optimisticData.put(getKey("dubbing_performances"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Editor> getEditedBy() {
        return (List<Editor>) get("edited_by");
    }

    public Film setEditedBy(List<Editor> arg) {
        optimisticData.put(getKey("edited_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Producer> getExecutiveProducedBy() {
        return (List<Producer>) get("executive_produced_by");
    }

    public Film setExecutiveProducedBy(List<Producer> arg) {
        optimisticData.put(getKey("executive_produced_by"), arg);
        return this;
    }

    /**
    * 
    */

    public String getFandangoId() {
        return (String) get("fandango_id");
    }

    public Film setFandangoId(String arg) {
        optimisticData.put(getKey("fandango_id"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Location> getFeaturedLocations() {
        return (List<Location>) get("featured_locations");
    }

    public Film setFeaturedLocations(List<Location> arg) {
        optimisticData.put(getKey("featured_locations"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Song> getFeaturedSong() {
        return (List<Song>) get("featured_song");
    }

    public Film setFeaturedSong(List<Song> arg) {
        optimisticData.put(getKey("featured_song"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Festival> getFestivals() {
        return (List<Festival>) get("festivals");
    }

    public Film setFestivals(List<Festival> arg) {
        optimisticData.put(getKey("festivals"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Format> getFormat() {
        return (List<Format>) get("format");
    }

    public Film setFormat(List<Format> arg) {
        optimisticData.put(getKey("format"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Genre> getGenre() {
        return (List<Genre>) get("genre");
    }

    public Film setGenre(List<Genre> arg) {
        optimisticData.put(getKey("genre"), arg);
        return this;
    }

    /**
    * 
    */

    public DateTime getInitialReleaseDate() {
        return (DateTime) get("initial_release_date");
    }

    public Film setInitialReleaseDate(DateTime arg) {
        optimisticData.put(getKey("initial_release_date"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Location> getLocations() {
        return (List<Location>) get("locations");
    }

    public Film setLocations(List<Location> arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    /**
    * 
    */

    public String getMetacriticId() {
        return (String) get("metacritic_id");
    }

    public Film setMetacriticId(String arg) {
        optimisticData.put(getKey("metacritic_id"), arg);
        return this;
    }

    /**
    * 
    */

    public List<MusicContributor> getMusic() {
        return (List<MusicContributor>) get("music");
    }

    public Film setMusic(List<MusicContributor> arg) {
        optimisticData.put(getKey("music"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Film setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getNetflixId() {
        return (String) get("netflix_id");
    }

    public Film setNetflixId(String arg) {
        optimisticData.put(getKey("netflix_id"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PersonalAppearance> getPersonalAppearances() {
        return (List<PersonalAppearance>) get("personal_appearances");
    }

    public Film setPersonalAppearances(List<PersonalAppearance> arg) {
        optimisticData.put(getKey("personal_appearances"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Film> getPrequel() {
        return (List<Film>) get("prequel");
    }

    public Film setPrequel(List<Film> arg) {
        optimisticData.put(getKey("prequel"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Producer> getProducedBy() {
        return (List<Producer>) get("produced_by");
    }

    public Film setProducedBy(List<Producer> arg) {
        optimisticData.put(getKey("produced_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<ProductionCompany> getProductionCompanies() {
        return (List<ProductionCompany>) get("production_companies");
    }

    public Film setProductionCompanies(List<ProductionCompany> arg) {
        optimisticData.put(getKey("production_companies"), arg);
        return this;
    }

    /**
    * 
    */

    public List<ProductionDesigner> getProductionDesignBy() {
        return (List<ProductionDesigner>) get("production_design_by");
    }

    public Film setProductionDesignBy(List<ProductionDesigner> arg) {
        optimisticData.put(getKey("production_design_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Rating> getRating() {
        return (List<Rating>) get("rating");
    }

    public Film setRating(List<Rating> arg) {
        optimisticData.put(getKey("rating"), arg);
        return this;
    }

    /**
    * 
    */

    public List<RegionalReleaseDate> getReleaseDateS() {
        return (List<RegionalReleaseDate>) get("release_date_s");
    }

    public Film setReleaseDateS(List<RegionalReleaseDate> arg) {
        optimisticData.put(getKey("release_date_s"), arg);
        return this;
    }

    /**
    * 
    */

    public String getRottentomatoesId() {
        return (String) get("rottentomatoes_id");
    }

    public Film setRottentomatoesId(String arg) {
        optimisticData.put(getKey("rottentomatoes_id"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Film> getSequel() {
        return (List<Film>) get("sequel");
    }

    public Film setSequel(List<Film> arg) {
        optimisticData.put(getKey("sequel"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Series> getSeries() {
        return (List<Series>) get("series");
    }

    public Film setSeries(List<Series> arg) {
        optimisticData.put(getKey("series"), arg);
        return this;
    }

    /**
    * 
    */

    public List<SetDecorator> getSetDecorationBy() {
        return (List<SetDecorator>) get("set_decoration_by");
    }

    public Film setSetDecorationBy(List<SetDecorator> arg) {
        optimisticData.put(getKey("set_decoration_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Song> getSongs() {
        return (List<Song>) get("songs");
    }

    public Film setSongs(List<Song> arg) {
        optimisticData.put(getKey("songs"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Performance> getStarring() {
        return (List<Performance>) get("starring");
    }

    public Film setStarring(List<Performance> arg) {
        optimisticData.put(getKey("starring"), arg);
        return this;
    }

    /**
    * 
    */

    public List<StoryContributor> getStoryBy() {
        return (List<StoryContributor>) get("story_by");
    }

    public Film setStoryBy(List<StoryContributor> arg) {
        optimisticData.put(getKey("story_by"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Subject> getSubjects() {
        return (List<Subject>) get("subjects");
    }

    public Film setSubjects(List<Subject> arg) {
        optimisticData.put(getKey("subjects"), arg);
        return this;
    }

    /**
    * 
    */

    public String getTagline() {
        return (String) get("tagline");
    }

    public Film setTagline(String arg) {
        optimisticData.put(getKey("tagline"), arg);
        return this;
    }

    /**
    * 
    */

    public String getTraileraddictId() {
        return (String) get("traileraddict_id");
    }

    public Film setTraileraddictId(String arg) {
        optimisticData.put(getKey("traileraddict_id"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Writer> getWrittenBy() {
        return (List<Writer>) get("written_by");
    }

    public Film setWrittenBy(List<Writer> arg) {
        optimisticData.put(getKey("written_by"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "apple_movietrailer_id": return false;

            case "art_direction_by": return true;

            case "casting_director": return true;

            case "cinematography": return true;

            case "collections": return true;

            case "costume_design_by": return true;

            case "country": return true;

            case "directed_by": return true;

            case "distributors": return true;

            case "dubbing_performances": return true;

            case "edited_by": return true;

            case "executive_produced_by": return true;

            case "fandango_id": return false;

            case "featured_locations": return true;

            case "featured_song": return true;

            case "festivals": return true;

            case "format": return true;

            case "genre": return true;

            case "initial_release_date": return false;

            case "locations": return true;

            case "metacritic_id": return false;

            case "music": return true;

            case "name": return false;

            case "netflix_id": return false;

            case "personal_appearances": return true;

            case "prequel": return true;

            case "produced_by": return true;

            case "production_companies": return true;

            case "production_design_by": return true;

            case "rating": return true;

            case "release_date_s": return true;

            case "rottentomatoes_id": return false;

            case "sequel": return true;

            case "series": return true;

            case "set_decoration_by": return true;

            case "songs": return true;

            case "starring": return true;

            case "story_by": return true;

            case "subjects": return true;

            case "tagline": return false;

            case "traileraddict_id": return false;

            case "written_by": return true;

            default: return false;
        }
    }
}

