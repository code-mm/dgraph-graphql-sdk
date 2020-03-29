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
public class FilmQuery extends Query<FilmQuery> {
    FilmQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public FilmQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public FilmQuery appleMovietrailerId() {
        startField("apple_movietrailer_id");

        return this;
    }

    public class ArtDirectionByArguments extends Arguments {
        ArtDirectionByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ArtDirectionByArguments filter(ArtDirectorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ArtDirectionByArguments order(ArtDirectorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ArtDirectionByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ArtDirectionByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ArtDirectionByArgumentsDefinition {
        void define(ArtDirectionByArguments args);
    }

    /**
    * 
    */
    public FilmQuery artDirectionBy(ArtDirectorQueryDefinition queryDef) {
        return artDirectionBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery artDirectionBy(ArtDirectionByArgumentsDefinition argsDef, ArtDirectorQueryDefinition queryDef) {
        startField("art_direction_by");

        ArtDirectionByArguments args = new ArtDirectionByArguments(_queryBuilder);
        argsDef.define(args);
        ArtDirectionByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ArtDirectorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CastingDirectorArguments extends Arguments {
        CastingDirectorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CastingDirectorArguments filter(CastingDirectorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CastingDirectorArguments order(CastingDirectorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CastingDirectorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CastingDirectorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CastingDirectorArgumentsDefinition {
        void define(CastingDirectorArguments args);
    }

    /**
    * 
    */
    public FilmQuery castingDirector(CastingDirectorQueryDefinition queryDef) {
        return castingDirector(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery castingDirector(CastingDirectorArgumentsDefinition argsDef, CastingDirectorQueryDefinition queryDef) {
        startField("casting_director");

        CastingDirectorArguments args = new CastingDirectorArguments(_queryBuilder);
        argsDef.define(args);
        CastingDirectorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CastingDirectorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CinematographyArguments extends Arguments {
        CinematographyArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CinematographyArguments filter(CinematographerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CinematographyArguments order(CinematographerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CinematographyArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CinematographyArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CinematographyArgumentsDefinition {
        void define(CinematographyArguments args);
    }

    /**
    * 
    */
    public FilmQuery cinematography(CinematographerQueryDefinition queryDef) {
        return cinematography(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery cinematography(CinematographyArgumentsDefinition argsDef, CinematographerQueryDefinition queryDef) {
        startField("cinematography");

        CinematographyArguments args = new CinematographyArguments(_queryBuilder);
        argsDef.define(args);
        CinematographyArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CinematographerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CollectionsArguments extends Arguments {
        CollectionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CollectionsArguments filter(CollectionFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CollectionsArguments order(CollectionOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CollectionsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CollectionsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CollectionsArgumentsDefinition {
        void define(CollectionsArguments args);
    }

    /**
    * 
    */
    public FilmQuery collections(CollectionQueryDefinition queryDef) {
        return collections(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery collections(CollectionsArgumentsDefinition argsDef, CollectionQueryDefinition queryDef) {
        startField("collections");

        CollectionsArguments args = new CollectionsArguments(_queryBuilder);
        argsDef.define(args);
        CollectionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CostumeDesignByArguments extends Arguments {
        CostumeDesignByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CostumeDesignByArguments filter(CostumeDesignerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CostumeDesignByArguments order(CostumeDesignerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CostumeDesignByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CostumeDesignByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CostumeDesignByArgumentsDefinition {
        void define(CostumeDesignByArguments args);
    }

    /**
    * 
    */
    public FilmQuery costumeDesignBy(CostumeDesignerQueryDefinition queryDef) {
        return costumeDesignBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery costumeDesignBy(CostumeDesignByArgumentsDefinition argsDef, CostumeDesignerQueryDefinition queryDef) {
        startField("costume_design_by");

        CostumeDesignByArguments args = new CostumeDesignByArguments(_queryBuilder);
        argsDef.define(args);
        CostumeDesignByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CostumeDesignerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CountryArguments extends Arguments {
        CountryArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CountryArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CountryArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CountryArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CountryArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CountryArgumentsDefinition {
        void define(CountryArguments args);
    }

    /**
    * 
    */
    public FilmQuery country(LocationQueryDefinition queryDef) {
        return country(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery country(CountryArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("country");

        CountryArguments args = new CountryArguments(_queryBuilder);
        argsDef.define(args);
        CountryArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DirectedByArguments extends Arguments {
        DirectedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DirectedByArguments filter(DirectorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DirectedByArguments order(DirectorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DirectedByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DirectedByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DirectedByArgumentsDefinition {
        void define(DirectedByArguments args);
    }

    /**
    * 
    */
    public FilmQuery directedBy(DirectorQueryDefinition queryDef) {
        return directedBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery directedBy(DirectedByArgumentsDefinition argsDef, DirectorQueryDefinition queryDef) {
        startField("directed_by");

        DirectedByArguments args = new DirectedByArguments(_queryBuilder);
        argsDef.define(args);
        DirectedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DirectorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DistributorsArguments extends Arguments {
        DistributorsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DistributorsArguments filter(DistributorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DistributorsArguments order(DistributorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DistributorsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DistributorsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DistributorsArgumentsDefinition {
        void define(DistributorsArguments args);
    }

    /**
    * 
    */
    public FilmQuery distributors(DistributorQueryDefinition queryDef) {
        return distributors(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery distributors(DistributorsArgumentsDefinition argsDef, DistributorQueryDefinition queryDef) {
        startField("distributors");

        DistributorsArguments args = new DistributorsArguments(_queryBuilder);
        argsDef.define(args);
        DistributorsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DistributorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DubbingPerformancesArguments extends Arguments {
        DubbingPerformancesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DubbingPerformancesArguments filter(ActorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DubbingPerformancesArguments order(ActorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DubbingPerformancesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DubbingPerformancesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DubbingPerformancesArgumentsDefinition {
        void define(DubbingPerformancesArguments args);
    }

    /**
    * 
    */
    public FilmQuery dubbingPerformances(ActorQueryDefinition queryDef) {
        return dubbingPerformances(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery dubbingPerformances(DubbingPerformancesArgumentsDefinition argsDef, ActorQueryDefinition queryDef) {
        startField("dubbing_performances");

        DubbingPerformancesArguments args = new DubbingPerformancesArguments(_queryBuilder);
        argsDef.define(args);
        DubbingPerformancesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ActorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class EditedByArguments extends Arguments {
        EditedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public EditedByArguments filter(EditorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EditedByArguments order(EditorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EditedByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public EditedByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EditedByArgumentsDefinition {
        void define(EditedByArguments args);
    }

    /**
    * 
    */
    public FilmQuery editedBy(EditorQueryDefinition queryDef) {
        return editedBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery editedBy(EditedByArgumentsDefinition argsDef, EditorQueryDefinition queryDef) {
        startField("edited_by");

        EditedByArguments args = new EditedByArguments(_queryBuilder);
        argsDef.define(args);
        EditedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EditorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ExecutiveProducedByArguments extends Arguments {
        ExecutiveProducedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ExecutiveProducedByArguments filter(ProducerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ExecutiveProducedByArguments order(ProducerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ExecutiveProducedByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ExecutiveProducedByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ExecutiveProducedByArgumentsDefinition {
        void define(ExecutiveProducedByArguments args);
    }

    /**
    * 
    */
    public FilmQuery executiveProducedBy(ProducerQueryDefinition queryDef) {
        return executiveProducedBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery executiveProducedBy(ExecutiveProducedByArgumentsDefinition argsDef, ProducerQueryDefinition queryDef) {
        startField("executive_produced_by");

        ExecutiveProducedByArguments args = new ExecutiveProducedByArguments(_queryBuilder);
        argsDef.define(args);
        ExecutiveProducedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProducerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FilmQuery fandangoId() {
        startField("fandango_id");

        return this;
    }

    public class FeaturedLocationsArguments extends Arguments {
        FeaturedLocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FeaturedLocationsArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedLocationsArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedLocationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedLocationsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FeaturedLocationsArgumentsDefinition {
        void define(FeaturedLocationsArguments args);
    }

    /**
    * 
    */
    public FilmQuery featuredLocations(LocationQueryDefinition queryDef) {
        return featuredLocations(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery featuredLocations(FeaturedLocationsArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("featured_locations");

        FeaturedLocationsArguments args = new FeaturedLocationsArguments(_queryBuilder);
        argsDef.define(args);
        FeaturedLocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FeaturedSongArguments extends Arguments {
        FeaturedSongArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FeaturedSongArguments filter(SongFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedSongArguments order(SongOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedSongArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FeaturedSongArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FeaturedSongArgumentsDefinition {
        void define(FeaturedSongArguments args);
    }

    /**
    * 
    */
    public FilmQuery featuredSong(SongQueryDefinition queryDef) {
        return featuredSong(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery featuredSong(FeaturedSongArgumentsDefinition argsDef, SongQueryDefinition queryDef) {
        startField("featured_song");

        FeaturedSongArguments args = new FeaturedSongArguments(_queryBuilder);
        argsDef.define(args);
        FeaturedSongArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SongQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FestivalsArguments extends Arguments {
        FestivalsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FestivalsArguments filter(FestivalFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsArguments order(FestivalOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FestivalsArgumentsDefinition {
        void define(FestivalsArguments args);
    }

    /**
    * 
    */
    public FilmQuery festivals(FestivalQueryDefinition queryDef) {
        return festivals(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery festivals(FestivalsArgumentsDefinition argsDef, FestivalQueryDefinition queryDef) {
        startField("festivals");

        FestivalsArguments args = new FestivalsArguments(_queryBuilder);
        argsDef.define(args);
        FestivalsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FormatArguments extends Arguments {
        FormatArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FormatArguments filter(FormatFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FormatArguments order(FormatOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FormatArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FormatArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FormatArgumentsDefinition {
        void define(FormatArguments args);
    }

    /**
    * 
    */
    public FilmQuery format(FormatQueryDefinition queryDef) {
        return format(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery format(FormatArgumentsDefinition argsDef, FormatQueryDefinition queryDef) {
        startField("format");

        FormatArguments args = new FormatArguments(_queryBuilder);
        argsDef.define(args);
        FormatArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FormatQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class GenreArguments extends Arguments {
        GenreArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public GenreArguments filter(GenreFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GenreArguments order(GenreOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GenreArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public GenreArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface GenreArgumentsDefinition {
        void define(GenreArguments args);
    }

    /**
    * 
    */
    public FilmQuery genre(GenreQueryDefinition queryDef) {
        return genre(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery genre(GenreArgumentsDefinition argsDef, GenreQueryDefinition queryDef) {
        startField("genre");

        GenreArguments args = new GenreArguments(_queryBuilder);
        argsDef.define(args);
        GenreArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GenreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FilmQuery initialReleaseDate() {
        startField("initial_release_date");

        return this;
    }

    public class LocationsArguments extends Arguments {
        LocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public LocationsArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public LocationsArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public LocationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public LocationsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationsArgumentsDefinition {
        void define(LocationsArguments args);
    }

    /**
    * 
    */
    public FilmQuery locations(LocationQueryDefinition queryDef) {
        return locations(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery locations(LocationsArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("locations");

        LocationsArguments args = new LocationsArguments(_queryBuilder);
        argsDef.define(args);
        LocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FilmQuery metacriticId() {
        startField("metacritic_id");

        return this;
    }

    public class MusicArguments extends Arguments {
        MusicArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public MusicArguments filter(MusicContributorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MusicArguments order(MusicContributorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MusicArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public MusicArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MusicArgumentsDefinition {
        void define(MusicArguments args);
    }

    /**
    * 
    */
    public FilmQuery music(MusicContributorQueryDefinition queryDef) {
        return music(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery music(MusicArgumentsDefinition argsDef, MusicContributorQueryDefinition queryDef) {
        startField("music");

        MusicArguments args = new MusicArguments(_queryBuilder);
        argsDef.define(args);
        MusicArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MusicContributorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FilmQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public FilmQuery netflixId() {
        startField("netflix_id");

        return this;
    }

    public class PersonalAppearancesArguments extends Arguments {
        PersonalAppearancesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonalAppearancesArguments filter(PersonalAppearanceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalAppearancesArguments order(PersonalAppearanceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalAppearancesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PersonalAppearancesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PersonalAppearancesArgumentsDefinition {
        void define(PersonalAppearancesArguments args);
    }

    /**
    * 
    */
    public FilmQuery personalAppearances(PersonalAppearanceQueryDefinition queryDef) {
        return personalAppearances(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery personalAppearances(PersonalAppearancesArgumentsDefinition argsDef, PersonalAppearanceQueryDefinition queryDef) {
        startField("personal_appearances");

        PersonalAppearancesArguments args = new PersonalAppearancesArguments(_queryBuilder);
        argsDef.define(args);
        PersonalAppearancesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonalAppearanceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PrequelArguments extends Arguments {
        PrequelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PrequelArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PrequelArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PrequelArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PrequelArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PrequelArgumentsDefinition {
        void define(PrequelArguments args);
    }

    /**
    * 
    */
    public FilmQuery prequel(FilmQueryDefinition queryDef) {
        return prequel(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery prequel(PrequelArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("prequel");

        PrequelArguments args = new PrequelArguments(_queryBuilder);
        argsDef.define(args);
        PrequelArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProducedByArguments extends Arguments {
        ProducedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProducedByArguments filter(ProducerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProducedByArguments order(ProducerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProducedByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProducedByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProducedByArgumentsDefinition {
        void define(ProducedByArguments args);
    }

    /**
    * 
    */
    public FilmQuery producedBy(ProducerQueryDefinition queryDef) {
        return producedBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery producedBy(ProducedByArgumentsDefinition argsDef, ProducerQueryDefinition queryDef) {
        startField("produced_by");

        ProducedByArguments args = new ProducedByArguments(_queryBuilder);
        argsDef.define(args);
        ProducedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProducerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductionCompaniesArguments extends Arguments {
        ProductionCompaniesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProductionCompaniesArguments filter(ProductionCompanyFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductionCompaniesArguments order(ProductionCompanyOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductionCompaniesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProductionCompaniesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductionCompaniesArgumentsDefinition {
        void define(ProductionCompaniesArguments args);
    }

    /**
    * 
    */
    public FilmQuery productionCompanies(ProductionCompanyQueryDefinition queryDef) {
        return productionCompanies(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery productionCompanies(ProductionCompaniesArgumentsDefinition argsDef, ProductionCompanyQueryDefinition queryDef) {
        startField("production_companies");

        ProductionCompaniesArguments args = new ProductionCompaniesArguments(_queryBuilder);
        argsDef.define(args);
        ProductionCompaniesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductionCompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductionDesignByArguments extends Arguments {
        ProductionDesignByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProductionDesignByArguments filter(ProductionDesignerFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductionDesignByArguments order(ProductionDesignerOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductionDesignByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProductionDesignByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductionDesignByArgumentsDefinition {
        void define(ProductionDesignByArguments args);
    }

    /**
    * 
    */
    public FilmQuery productionDesignBy(ProductionDesignerQueryDefinition queryDef) {
        return productionDesignBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery productionDesignBy(ProductionDesignByArgumentsDefinition argsDef, ProductionDesignerQueryDefinition queryDef) {
        startField("production_design_by");

        ProductionDesignByArguments args = new ProductionDesignByArguments(_queryBuilder);
        argsDef.define(args);
        ProductionDesignByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductionDesignerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RatingArguments extends Arguments {
        RatingArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RatingArguments filter(RatingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingArguments order(RatingOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RatingArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RatingArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RatingArgumentsDefinition {
        void define(RatingArguments args);
    }

    /**
    * 
    */
    public FilmQuery rating(RatingQueryDefinition queryDef) {
        return rating(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery rating(RatingArgumentsDefinition argsDef, RatingQueryDefinition queryDef) {
        startField("rating");

        RatingArguments args = new RatingArguments(_queryBuilder);
        argsDef.define(args);
        RatingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RatingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReleaseDateSArguments extends Arguments {
        ReleaseDateSArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ReleaseDateSArguments filter(RegionalReleaseDateFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReleaseDateSArguments order(RegionalReleaseDateOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReleaseDateSArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ReleaseDateSArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReleaseDateSArgumentsDefinition {
        void define(ReleaseDateSArguments args);
    }

    /**
    * 
    */
    public FilmQuery releaseDateS(RegionalReleaseDateQueryDefinition queryDef) {
        return releaseDateS(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery releaseDateS(ReleaseDateSArgumentsDefinition argsDef, RegionalReleaseDateQueryDefinition queryDef) {
        startField("release_date_s");

        ReleaseDateSArguments args = new ReleaseDateSArguments(_queryBuilder);
        argsDef.define(args);
        ReleaseDateSArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RegionalReleaseDateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FilmQuery rottentomatoesId() {
        startField("rottentomatoes_id");

        return this;
    }

    public class SequelArguments extends Arguments {
        SequelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SequelArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SequelArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SequelArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SequelArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SequelArgumentsDefinition {
        void define(SequelArguments args);
    }

    /**
    * 
    */
    public FilmQuery sequel(FilmQueryDefinition queryDef) {
        return sequel(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery sequel(SequelArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("sequel");

        SequelArguments args = new SequelArguments(_queryBuilder);
        argsDef.define(args);
        SequelArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SeriesArguments extends Arguments {
        SeriesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SeriesArguments filter(SeriesFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SeriesArguments order(SeriesOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SeriesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SeriesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SeriesArgumentsDefinition {
        void define(SeriesArguments args);
    }

    /**
    * 
    */
    public FilmQuery series(SeriesQueryDefinition queryDef) {
        return series(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery series(SeriesArgumentsDefinition argsDef, SeriesQueryDefinition queryDef) {
        startField("series");

        SeriesArguments args = new SeriesArguments(_queryBuilder);
        argsDef.define(args);
        SeriesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SeriesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetDecorationByArguments extends Arguments {
        SetDecorationByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SetDecorationByArguments filter(SetDecoratorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SetDecorationByArguments order(SetDecoratorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SetDecorationByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SetDecorationByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SetDecorationByArgumentsDefinition {
        void define(SetDecorationByArguments args);
    }

    /**
    * 
    */
    public FilmQuery setDecorationBy(SetDecoratorQueryDefinition queryDef) {
        return setDecorationBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery setDecorationBy(SetDecorationByArgumentsDefinition argsDef, SetDecoratorQueryDefinition queryDef) {
        startField("set_decoration_by");

        SetDecorationByArguments args = new SetDecorationByArguments(_queryBuilder);
        argsDef.define(args);
        SetDecorationByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetDecoratorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SongsArguments extends Arguments {
        SongsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SongsArguments filter(SongFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongsArguments order(SongOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SongsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SongsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SongsArgumentsDefinition {
        void define(SongsArguments args);
    }

    /**
    * 
    */
    public FilmQuery songs(SongQueryDefinition queryDef) {
        return songs(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery songs(SongsArgumentsDefinition argsDef, SongQueryDefinition queryDef) {
        startField("songs");

        SongsArguments args = new SongsArguments(_queryBuilder);
        argsDef.define(args);
        SongsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SongQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StarringArguments extends Arguments {
        StarringArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public StarringArguments filter(PerformanceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StarringArguments order(PerformanceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StarringArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public StarringArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StarringArgumentsDefinition {
        void define(StarringArguments args);
    }

    /**
    * 
    */
    public FilmQuery starring(PerformanceQueryDefinition queryDef) {
        return starring(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery starring(StarringArgumentsDefinition argsDef, PerformanceQueryDefinition queryDef) {
        startField("starring");

        StarringArguments args = new StarringArguments(_queryBuilder);
        argsDef.define(args);
        StarringArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PerformanceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StoryByArguments extends Arguments {
        StoryByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public StoryByArguments filter(StoryContributorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoryByArguments order(StoryContributorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoryByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public StoryByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StoryByArgumentsDefinition {
        void define(StoryByArguments args);
    }

    /**
    * 
    */
    public FilmQuery storyBy(StoryContributorQueryDefinition queryDef) {
        return storyBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery storyBy(StoryByArgumentsDefinition argsDef, StoryContributorQueryDefinition queryDef) {
        startField("story_by");

        StoryByArguments args = new StoryByArguments(_queryBuilder);
        argsDef.define(args);
        StoryByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoryContributorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubjectsArguments extends Arguments {
        SubjectsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SubjectsArguments filter(SubjectFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubjectsArguments order(SubjectOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubjectsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SubjectsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubjectsArgumentsDefinition {
        void define(SubjectsArguments args);
    }

    /**
    * 
    */
    public FilmQuery subjects(SubjectQueryDefinition queryDef) {
        return subjects(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery subjects(SubjectsArgumentsDefinition argsDef, SubjectQueryDefinition queryDef) {
        startField("subjects");

        SubjectsArguments args = new SubjectsArguments(_queryBuilder);
        argsDef.define(args);
        SubjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FilmQuery tagline() {
        startField("tagline");

        return this;
    }

    /**
    * 
    */
    public FilmQuery traileraddictId() {
        startField("traileraddict_id");

        return this;
    }

    public class WrittenByArguments extends Arguments {
        WrittenByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public WrittenByArguments filter(WriterFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WrittenByArguments order(WriterOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WrittenByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public WrittenByArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WrittenByArgumentsDefinition {
        void define(WrittenByArguments args);
    }

    /**
    * 
    */
    public FilmQuery writtenBy(WriterQueryDefinition queryDef) {
        return writtenBy(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FilmQuery writtenBy(WrittenByArgumentsDefinition argsDef, WriterQueryDefinition queryDef) {
        startField("written_by");

        WrittenByArguments args = new WrittenByArguments(_queryBuilder);
        argsDef.define(args);
        WrittenByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WriterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
