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

public class FilmPatch implements Serializable {
    private Input<String> appleMovietrailerId = Input.undefined();

    private Input<List<ArtDirectorRef>> artDirectionBy = Input.undefined();

    private Input<List<CastingDirectorRef>> castingDirector = Input.undefined();

    private Input<List<CinematographerRef>> cinematography = Input.undefined();

    private Input<List<CollectionRef>> collections = Input.undefined();

    private Input<List<CostumeDesignerRef>> costumeDesignBy = Input.undefined();

    private Input<List<LocationRef>> country = Input.undefined();

    private Input<List<DistributorRef>> distributors = Input.undefined();

    private Input<List<ActorRef>> dubbingPerformances = Input.undefined();

    private Input<List<EditorRef>> editedBy = Input.undefined();

    private Input<List<ProducerRef>> executiveProducedBy = Input.undefined();

    private Input<String> fandangoId = Input.undefined();

    private Input<List<LocationRef>> featuredLocations = Input.undefined();

    private Input<List<SongRef>> featuredSong = Input.undefined();

    private Input<List<FestivalRef>> festivals = Input.undefined();

    private Input<List<FormatRef>> format = Input.undefined();

    private Input<List<GenreRef>> genre = Input.undefined();

    private Input<DateTime> initialReleaseDate = Input.undefined();

    private Input<List<LocationRef>> locations = Input.undefined();

    private Input<String> metacriticId = Input.undefined();

    private Input<List<MusicContributorRef>> music = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> netflixId = Input.undefined();

    private Input<List<PersonalAppearanceRef>> personalAppearances = Input.undefined();

    private Input<List<FilmRef>> prequel = Input.undefined();

    private Input<List<ProducerRef>> producedBy = Input.undefined();

    private Input<List<ProductionCompanyRef>> productionCompanies = Input.undefined();

    private Input<List<ProductionDesignerRef>> productionDesignBy = Input.undefined();

    private Input<List<RatingRef>> rating = Input.undefined();

    private Input<List<RegionalReleaseDateRef>> releaseDateS = Input.undefined();

    private Input<String> rottentomatoesId = Input.undefined();

    private Input<List<FilmRef>> sequel = Input.undefined();

    private Input<List<SeriesRef>> series = Input.undefined();

    private Input<List<SetDecoratorRef>> setDecorationBy = Input.undefined();

    private Input<List<SongRef>> songs = Input.undefined();

    private Input<List<PerformanceRef>> starring = Input.undefined();

    private Input<List<StoryContributorRef>> storyBy = Input.undefined();

    private Input<List<SubjectRef>> subjects = Input.undefined();

    private Input<String> tagline = Input.undefined();

    private Input<String> traileraddictId = Input.undefined();

    private Input<List<WriterRef>> writtenBy = Input.undefined();

    public String getAppleMovietrailerId() {
        return appleMovietrailerId.getValue();
    }

    public Input<String> getAppleMovietrailerIdInput() {
        return appleMovietrailerId;
    }

    public FilmPatch setAppleMovietrailerId(String appleMovietrailerId) {
        this.appleMovietrailerId = Input.optional(appleMovietrailerId);
        return this;
    }

    public FilmPatch setAppleMovietrailerIdInput(Input<String> appleMovietrailerId) {
        if (appleMovietrailerId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appleMovietrailerId = appleMovietrailerId;
        return this;
    }

    public List<ArtDirectorRef> getArtDirectionBy() {
        return artDirectionBy.getValue();
    }

    public Input<List<ArtDirectorRef>> getArtDirectionByInput() {
        return artDirectionBy;
    }

    public FilmPatch setArtDirectionBy(List<ArtDirectorRef> artDirectionBy) {
        this.artDirectionBy = Input.optional(artDirectionBy);
        return this;
    }

    public FilmPatch setArtDirectionByInput(Input<List<ArtDirectorRef>> artDirectionBy) {
        if (artDirectionBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.artDirectionBy = artDirectionBy;
        return this;
    }

    public List<CastingDirectorRef> getCastingDirector() {
        return castingDirector.getValue();
    }

    public Input<List<CastingDirectorRef>> getCastingDirectorInput() {
        return castingDirector;
    }

    public FilmPatch setCastingDirector(List<CastingDirectorRef> castingDirector) {
        this.castingDirector = Input.optional(castingDirector);
        return this;
    }

    public FilmPatch setCastingDirectorInput(Input<List<CastingDirectorRef>> castingDirector) {
        if (castingDirector == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.castingDirector = castingDirector;
        return this;
    }

    public List<CinematographerRef> getCinematography() {
        return cinematography.getValue();
    }

    public Input<List<CinematographerRef>> getCinematographyInput() {
        return cinematography;
    }

    public FilmPatch setCinematography(List<CinematographerRef> cinematography) {
        this.cinematography = Input.optional(cinematography);
        return this;
    }

    public FilmPatch setCinematographyInput(Input<List<CinematographerRef>> cinematography) {
        if (cinematography == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cinematography = cinematography;
        return this;
    }

    public List<CollectionRef> getCollections() {
        return collections.getValue();
    }

    public Input<List<CollectionRef>> getCollectionsInput() {
        return collections;
    }

    public FilmPatch setCollections(List<CollectionRef> collections) {
        this.collections = Input.optional(collections);
        return this;
    }

    public FilmPatch setCollectionsInput(Input<List<CollectionRef>> collections) {
        if (collections == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.collections = collections;
        return this;
    }

    public List<CostumeDesignerRef> getCostumeDesignBy() {
        return costumeDesignBy.getValue();
    }

    public Input<List<CostumeDesignerRef>> getCostumeDesignByInput() {
        return costumeDesignBy;
    }

    public FilmPatch setCostumeDesignBy(List<CostumeDesignerRef> costumeDesignBy) {
        this.costumeDesignBy = Input.optional(costumeDesignBy);
        return this;
    }

    public FilmPatch setCostumeDesignByInput(Input<List<CostumeDesignerRef>> costumeDesignBy) {
        if (costumeDesignBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.costumeDesignBy = costumeDesignBy;
        return this;
    }

    public List<LocationRef> getCountry() {
        return country.getValue();
    }

    public Input<List<LocationRef>> getCountryInput() {
        return country;
    }

    public FilmPatch setCountry(List<LocationRef> country) {
        this.country = Input.optional(country);
        return this;
    }

    public FilmPatch setCountryInput(Input<List<LocationRef>> country) {
        if (country == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.country = country;
        return this;
    }

    public List<DistributorRef> getDistributors() {
        return distributors.getValue();
    }

    public Input<List<DistributorRef>> getDistributorsInput() {
        return distributors;
    }

    public FilmPatch setDistributors(List<DistributorRef> distributors) {
        this.distributors = Input.optional(distributors);
        return this;
    }

    public FilmPatch setDistributorsInput(Input<List<DistributorRef>> distributors) {
        if (distributors == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.distributors = distributors;
        return this;
    }

    public List<ActorRef> getDubbingPerformances() {
        return dubbingPerformances.getValue();
    }

    public Input<List<ActorRef>> getDubbingPerformancesInput() {
        return dubbingPerformances;
    }

    public FilmPatch setDubbingPerformances(List<ActorRef> dubbingPerformances) {
        this.dubbingPerformances = Input.optional(dubbingPerformances);
        return this;
    }

    public FilmPatch setDubbingPerformancesInput(Input<List<ActorRef>> dubbingPerformances) {
        if (dubbingPerformances == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dubbingPerformances = dubbingPerformances;
        return this;
    }

    public List<EditorRef> getEditedBy() {
        return editedBy.getValue();
    }

    public Input<List<EditorRef>> getEditedByInput() {
        return editedBy;
    }

    public FilmPatch setEditedBy(List<EditorRef> editedBy) {
        this.editedBy = Input.optional(editedBy);
        return this;
    }

    public FilmPatch setEditedByInput(Input<List<EditorRef>> editedBy) {
        if (editedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editedBy = editedBy;
        return this;
    }

    public List<ProducerRef> getExecutiveProducedBy() {
        return executiveProducedBy.getValue();
    }

    public Input<List<ProducerRef>> getExecutiveProducedByInput() {
        return executiveProducedBy;
    }

    public FilmPatch setExecutiveProducedBy(List<ProducerRef> executiveProducedBy) {
        this.executiveProducedBy = Input.optional(executiveProducedBy);
        return this;
    }

    public FilmPatch setExecutiveProducedByInput(Input<List<ProducerRef>> executiveProducedBy) {
        if (executiveProducedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.executiveProducedBy = executiveProducedBy;
        return this;
    }

    public String getFandangoId() {
        return fandangoId.getValue();
    }

    public Input<String> getFandangoIdInput() {
        return fandangoId;
    }

    public FilmPatch setFandangoId(String fandangoId) {
        this.fandangoId = Input.optional(fandangoId);
        return this;
    }

    public FilmPatch setFandangoIdInput(Input<String> fandangoId) {
        if (fandangoId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fandangoId = fandangoId;
        return this;
    }

    public List<LocationRef> getFeaturedLocations() {
        return featuredLocations.getValue();
    }

    public Input<List<LocationRef>> getFeaturedLocationsInput() {
        return featuredLocations;
    }

    public FilmPatch setFeaturedLocations(List<LocationRef> featuredLocations) {
        this.featuredLocations = Input.optional(featuredLocations);
        return this;
    }

    public FilmPatch setFeaturedLocationsInput(Input<List<LocationRef>> featuredLocations) {
        if (featuredLocations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.featuredLocations = featuredLocations;
        return this;
    }

    public List<SongRef> getFeaturedSong() {
        return featuredSong.getValue();
    }

    public Input<List<SongRef>> getFeaturedSongInput() {
        return featuredSong;
    }

    public FilmPatch setFeaturedSong(List<SongRef> featuredSong) {
        this.featuredSong = Input.optional(featuredSong);
        return this;
    }

    public FilmPatch setFeaturedSongInput(Input<List<SongRef>> featuredSong) {
        if (featuredSong == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.featuredSong = featuredSong;
        return this;
    }

    public List<FestivalRef> getFestivals() {
        return festivals.getValue();
    }

    public Input<List<FestivalRef>> getFestivalsInput() {
        return festivals;
    }

    public FilmPatch setFestivals(List<FestivalRef> festivals) {
        this.festivals = Input.optional(festivals);
        return this;
    }

    public FilmPatch setFestivalsInput(Input<List<FestivalRef>> festivals) {
        if (festivals == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.festivals = festivals;
        return this;
    }

    public List<FormatRef> getFormat() {
        return format.getValue();
    }

    public Input<List<FormatRef>> getFormatInput() {
        return format;
    }

    public FilmPatch setFormat(List<FormatRef> format) {
        this.format = Input.optional(format);
        return this;
    }

    public FilmPatch setFormatInput(Input<List<FormatRef>> format) {
        if (format == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.format = format;
        return this;
    }

    public List<GenreRef> getGenre() {
        return genre.getValue();
    }

    public Input<List<GenreRef>> getGenreInput() {
        return genre;
    }

    public FilmPatch setGenre(List<GenreRef> genre) {
        this.genre = Input.optional(genre);
        return this;
    }

    public FilmPatch setGenreInput(Input<List<GenreRef>> genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.genre = genre;
        return this;
    }

    public DateTime getInitialReleaseDate() {
        return initialReleaseDate.getValue();
    }

    public Input<DateTime> getInitialReleaseDateInput() {
        return initialReleaseDate;
    }

    public FilmPatch setInitialReleaseDate(DateTime initialReleaseDate) {
        this.initialReleaseDate = Input.optional(initialReleaseDate);
        return this;
    }

    public FilmPatch setInitialReleaseDateInput(Input<DateTime> initialReleaseDate) {
        if (initialReleaseDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.initialReleaseDate = initialReleaseDate;
        return this;
    }

    public List<LocationRef> getLocations() {
        return locations.getValue();
    }

    public Input<List<LocationRef>> getLocationsInput() {
        return locations;
    }

    public FilmPatch setLocations(List<LocationRef> locations) {
        this.locations = Input.optional(locations);
        return this;
    }

    public FilmPatch setLocationsInput(Input<List<LocationRef>> locations) {
        if (locations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locations = locations;
        return this;
    }

    public String getMetacriticId() {
        return metacriticId.getValue();
    }

    public Input<String> getMetacriticIdInput() {
        return metacriticId;
    }

    public FilmPatch setMetacriticId(String metacriticId) {
        this.metacriticId = Input.optional(metacriticId);
        return this;
    }

    public FilmPatch setMetacriticIdInput(Input<String> metacriticId) {
        if (metacriticId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metacriticId = metacriticId;
        return this;
    }

    public List<MusicContributorRef> getMusic() {
        return music.getValue();
    }

    public Input<List<MusicContributorRef>> getMusicInput() {
        return music;
    }

    public FilmPatch setMusic(List<MusicContributorRef> music) {
        this.music = Input.optional(music);
        return this;
    }

    public FilmPatch setMusicInput(Input<List<MusicContributorRef>> music) {
        if (music == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.music = music;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public FilmPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public FilmPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getNetflixId() {
        return netflixId.getValue();
    }

    public Input<String> getNetflixIdInput() {
        return netflixId;
    }

    public FilmPatch setNetflixId(String netflixId) {
        this.netflixId = Input.optional(netflixId);
        return this;
    }

    public FilmPatch setNetflixIdInput(Input<String> netflixId) {
        if (netflixId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.netflixId = netflixId;
        return this;
    }

    public List<PersonalAppearanceRef> getPersonalAppearances() {
        return personalAppearances.getValue();
    }

    public Input<List<PersonalAppearanceRef>> getPersonalAppearancesInput() {
        return personalAppearances;
    }

    public FilmPatch setPersonalAppearances(List<PersonalAppearanceRef> personalAppearances) {
        this.personalAppearances = Input.optional(personalAppearances);
        return this;
    }

    public FilmPatch setPersonalAppearancesInput(Input<List<PersonalAppearanceRef>> personalAppearances) {
        if (personalAppearances == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.personalAppearances = personalAppearances;
        return this;
    }

    public List<FilmRef> getPrequel() {
        return prequel.getValue();
    }

    public Input<List<FilmRef>> getPrequelInput() {
        return prequel;
    }

    public FilmPatch setPrequel(List<FilmRef> prequel) {
        this.prequel = Input.optional(prequel);
        return this;
    }

    public FilmPatch setPrequelInput(Input<List<FilmRef>> prequel) {
        if (prequel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.prequel = prequel;
        return this;
    }

    public List<ProducerRef> getProducedBy() {
        return producedBy.getValue();
    }

    public Input<List<ProducerRef>> getProducedByInput() {
        return producedBy;
    }

    public FilmPatch setProducedBy(List<ProducerRef> producedBy) {
        this.producedBy = Input.optional(producedBy);
        return this;
    }

    public FilmPatch setProducedByInput(Input<List<ProducerRef>> producedBy) {
        if (producedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.producedBy = producedBy;
        return this;
    }

    public List<ProductionCompanyRef> getProductionCompanies() {
        return productionCompanies.getValue();
    }

    public Input<List<ProductionCompanyRef>> getProductionCompaniesInput() {
        return productionCompanies;
    }

    public FilmPatch setProductionCompanies(List<ProductionCompanyRef> productionCompanies) {
        this.productionCompanies = Input.optional(productionCompanies);
        return this;
    }

    public FilmPatch setProductionCompaniesInput(Input<List<ProductionCompanyRef>> productionCompanies) {
        if (productionCompanies == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productionCompanies = productionCompanies;
        return this;
    }

    public List<ProductionDesignerRef> getProductionDesignBy() {
        return productionDesignBy.getValue();
    }

    public Input<List<ProductionDesignerRef>> getProductionDesignByInput() {
        return productionDesignBy;
    }

    public FilmPatch setProductionDesignBy(List<ProductionDesignerRef> productionDesignBy) {
        this.productionDesignBy = Input.optional(productionDesignBy);
        return this;
    }

    public FilmPatch setProductionDesignByInput(Input<List<ProductionDesignerRef>> productionDesignBy) {
        if (productionDesignBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productionDesignBy = productionDesignBy;
        return this;
    }

    public List<RatingRef> getRating() {
        return rating.getValue();
    }

    public Input<List<RatingRef>> getRatingInput() {
        return rating;
    }

    public FilmPatch setRating(List<RatingRef> rating) {
        this.rating = Input.optional(rating);
        return this;
    }

    public FilmPatch setRatingInput(Input<List<RatingRef>> rating) {
        if (rating == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.rating = rating;
        return this;
    }

    public List<RegionalReleaseDateRef> getReleaseDateS() {
        return releaseDateS.getValue();
    }

    public Input<List<RegionalReleaseDateRef>> getReleaseDateSInput() {
        return releaseDateS;
    }

    public FilmPatch setReleaseDateS(List<RegionalReleaseDateRef> releaseDateS) {
        this.releaseDateS = Input.optional(releaseDateS);
        return this;
    }

    public FilmPatch setReleaseDateSInput(Input<List<RegionalReleaseDateRef>> releaseDateS) {
        if (releaseDateS == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.releaseDateS = releaseDateS;
        return this;
    }

    public String getRottentomatoesId() {
        return rottentomatoesId.getValue();
    }

    public Input<String> getRottentomatoesIdInput() {
        return rottentomatoesId;
    }

    public FilmPatch setRottentomatoesId(String rottentomatoesId) {
        this.rottentomatoesId = Input.optional(rottentomatoesId);
        return this;
    }

    public FilmPatch setRottentomatoesIdInput(Input<String> rottentomatoesId) {
        if (rottentomatoesId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.rottentomatoesId = rottentomatoesId;
        return this;
    }

    public List<FilmRef> getSequel() {
        return sequel.getValue();
    }

    public Input<List<FilmRef>> getSequelInput() {
        return sequel;
    }

    public FilmPatch setSequel(List<FilmRef> sequel) {
        this.sequel = Input.optional(sequel);
        return this;
    }

    public FilmPatch setSequelInput(Input<List<FilmRef>> sequel) {
        if (sequel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sequel = sequel;
        return this;
    }

    public List<SeriesRef> getSeries() {
        return series.getValue();
    }

    public Input<List<SeriesRef>> getSeriesInput() {
        return series;
    }

    public FilmPatch setSeries(List<SeriesRef> series) {
        this.series = Input.optional(series);
        return this;
    }

    public FilmPatch setSeriesInput(Input<List<SeriesRef>> series) {
        if (series == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.series = series;
        return this;
    }

    public List<SetDecoratorRef> getSetDecorationBy() {
        return setDecorationBy.getValue();
    }

    public Input<List<SetDecoratorRef>> getSetDecorationByInput() {
        return setDecorationBy;
    }

    public FilmPatch setSetDecorationBy(List<SetDecoratorRef> setDecorationBy) {
        this.setDecorationBy = Input.optional(setDecorationBy);
        return this;
    }

    public FilmPatch setSetDecorationByInput(Input<List<SetDecoratorRef>> setDecorationBy) {
        if (setDecorationBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.setDecorationBy = setDecorationBy;
        return this;
    }

    public List<SongRef> getSongs() {
        return songs.getValue();
    }

    public Input<List<SongRef>> getSongsInput() {
        return songs;
    }

    public FilmPatch setSongs(List<SongRef> songs) {
        this.songs = Input.optional(songs);
        return this;
    }

    public FilmPatch setSongsInput(Input<List<SongRef>> songs) {
        if (songs == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.songs = songs;
        return this;
    }

    public List<PerformanceRef> getStarring() {
        return starring.getValue();
    }

    public Input<List<PerformanceRef>> getStarringInput() {
        return starring;
    }

    public FilmPatch setStarring(List<PerformanceRef> starring) {
        this.starring = Input.optional(starring);
        return this;
    }

    public FilmPatch setStarringInput(Input<List<PerformanceRef>> starring) {
        if (starring == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.starring = starring;
        return this;
    }

    public List<StoryContributorRef> getStoryBy() {
        return storyBy.getValue();
    }

    public Input<List<StoryContributorRef>> getStoryByInput() {
        return storyBy;
    }

    public FilmPatch setStoryBy(List<StoryContributorRef> storyBy) {
        this.storyBy = Input.optional(storyBy);
        return this;
    }

    public FilmPatch setStoryByInput(Input<List<StoryContributorRef>> storyBy) {
        if (storyBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.storyBy = storyBy;
        return this;
    }

    public List<SubjectRef> getSubjects() {
        return subjects.getValue();
    }

    public Input<List<SubjectRef>> getSubjectsInput() {
        return subjects;
    }

    public FilmPatch setSubjects(List<SubjectRef> subjects) {
        this.subjects = Input.optional(subjects);
        return this;
    }

    public FilmPatch setSubjectsInput(Input<List<SubjectRef>> subjects) {
        if (subjects == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.subjects = subjects;
        return this;
    }

    public String getTagline() {
        return tagline.getValue();
    }

    public Input<String> getTaglineInput() {
        return tagline;
    }

    public FilmPatch setTagline(String tagline) {
        this.tagline = Input.optional(tagline);
        return this;
    }

    public FilmPatch setTaglineInput(Input<String> tagline) {
        if (tagline == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tagline = tagline;
        return this;
    }

    public String getTraileraddictId() {
        return traileraddictId.getValue();
    }

    public Input<String> getTraileraddictIdInput() {
        return traileraddictId;
    }

    public FilmPatch setTraileraddictId(String traileraddictId) {
        this.traileraddictId = Input.optional(traileraddictId);
        return this;
    }

    public FilmPatch setTraileraddictIdInput(Input<String> traileraddictId) {
        if (traileraddictId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.traileraddictId = traileraddictId;
        return this;
    }

    public List<WriterRef> getWrittenBy() {
        return writtenBy.getValue();
    }

    public Input<List<WriterRef>> getWrittenByInput() {
        return writtenBy;
    }

    public FilmPatch setWrittenBy(List<WriterRef> writtenBy) {
        this.writtenBy = Input.optional(writtenBy);
        return this;
    }

    public FilmPatch setWrittenByInput(Input<List<WriterRef>> writtenBy) {
        if (writtenBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.writtenBy = writtenBy;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.appleMovietrailerId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("apple_movietrailer_id:");
            if (appleMovietrailerId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, appleMovietrailerId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.artDirectionBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("art_direction_by:");
            if (artDirectionBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ArtDirectorRef item1 : artDirectionBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.castingDirector.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("casting_director:");
            if (castingDirector.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CastingDirectorRef item1 : castingDirector.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cinematography.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cinematography:");
            if (cinematography.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CinematographerRef item1 : cinematography.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.collections.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("collections:");
            if (collections.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CollectionRef item1 : collections.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.costumeDesignBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("costume_design_by:");
            if (costumeDesignBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CostumeDesignerRef item1 : costumeDesignBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.country.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country:");
            if (country.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocationRef item1 : country.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.distributors.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("distributors:");
            if (distributors.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DistributorRef item1 : distributors.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dubbingPerformances.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dubbing_performances:");
            if (dubbingPerformances.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ActorRef item1 : dubbingPerformances.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.editedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("edited_by:");
            if (editedBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (EditorRef item1 : editedBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.executiveProducedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("executive_produced_by:");
            if (executiveProducedBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProducerRef item1 : executiveProducedBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fandangoId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fandango_id:");
            if (fandangoId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, fandangoId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.featuredLocations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("featured_locations:");
            if (featuredLocations.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocationRef item1 : featuredLocations.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.featuredSong.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("featured_song:");
            if (featuredSong.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SongRef item1 : featuredSong.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.festivals.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("festivals:");
            if (festivals.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FestivalRef item1 : festivals.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.format.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("format:");
            if (format.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FormatRef item1 : format.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.genre.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("genre:");
            if (genre.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (GenreRef item1 : genre.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.initialReleaseDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("initial_release_date:");
            if (initialReleaseDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, initialReleaseDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locations:");
            if (locations.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocationRef item1 : locations.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metacriticId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metacritic_id:");
            if (metacriticId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, metacriticId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.music.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("music:");
            if (music.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MusicContributorRef item1 : music.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
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
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.netflixId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("netflix_id:");
            if (netflixId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, netflixId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.personalAppearances.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("personal_appearances:");
            if (personalAppearances.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PersonalAppearanceRef item1 : personalAppearances.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.prequel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("prequel:");
            if (prequel.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : prequel.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.producedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("produced_by:");
            if (producedBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProducerRef item1 : producedBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.productionCompanies.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("production_companies:");
            if (productionCompanies.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductionCompanyRef item1 : productionCompanies.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.productionDesignBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("production_design_by:");
            if (productionDesignBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductionDesignerRef item1 : productionDesignBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.rating.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("rating:");
            if (rating.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RatingRef item1 : rating.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.releaseDateS.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("release_date_s:");
            if (releaseDateS.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RegionalReleaseDateRef item1 : releaseDateS.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.rottentomatoesId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("rottentomatoes_id:");
            if (rottentomatoesId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, rottentomatoesId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sequel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sequel:");
            if (sequel.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : sequel.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.series.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("series:");
            if (series.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SeriesRef item1 : series.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.setDecorationBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("set_decoration_by:");
            if (setDecorationBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SetDecoratorRef item1 : setDecorationBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.songs.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("songs:");
            if (songs.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SongRef item1 : songs.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.starring.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("starring:");
            if (starring.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PerformanceRef item1 : starring.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.storyBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("story_by:");
            if (storyBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (StoryContributorRef item1 : storyBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.subjects.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("subjects:");
            if (subjects.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SubjectRef item1 : subjects.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tagline.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tagline:");
            if (tagline.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, tagline.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.traileraddictId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("traileraddict_id:");
            if (traileraddictId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, traileraddictId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.writtenBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("written_by:");
            if (writtenBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (WriterRef item1 : writtenBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
