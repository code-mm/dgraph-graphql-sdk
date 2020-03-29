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
public class FestivalQuery extends Query<FestivalQuery> {
    FestivalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public FestivalQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public FestivalQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public FestivalQuery dateFounded() {
        startField("date_founded");

        return this;
    }

    public class FocusArguments extends Arguments {
        FocusArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FocusArguments filter(FestivalFocusFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FocusArguments order(FestivalFocusOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FocusArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FocusArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FocusArgumentsDefinition {
        void define(FocusArguments args);
    }

    /**
    * 
    */
    public FestivalQuery focus(FestivalFocusQueryDefinition queryDef) {
        return focus(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FestivalQuery focus(FocusArgumentsDefinition argsDef, FestivalFocusQueryDefinition queryDef) {
        startField("focus");

        FocusArguments args = new FocusArguments(_queryBuilder);
        argsDef.define(args);
        FocusArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalFocusQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class IndividualFestivalsArguments extends Arguments {
        IndividualFestivalsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IndividualFestivalsArguments filter(FestivalEventFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IndividualFestivalsArguments order(FestivalEventOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IndividualFestivalsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public IndividualFestivalsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IndividualFestivalsArgumentsDefinition {
        void define(IndividualFestivalsArguments args);
    }

    /**
    * 
    */
    public FestivalQuery individualFestivals(FestivalEventQueryDefinition queryDef) {
        return individualFestivals(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FestivalQuery individualFestivals(IndividualFestivalsArgumentsDefinition argsDef, FestivalEventQueryDefinition queryDef) {
        startField("individual_festivals");

        IndividualFestivalsArguments args = new IndividualFestivalsArguments(_queryBuilder);
        argsDef.define(args);
        IndividualFestivalsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationArguments extends Arguments {
        LocationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public LocationArguments filter(LocationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public LocationArguments order(LocationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public LocationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public LocationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationArgumentsDefinition {
        void define(LocationArguments args);
    }

    /**
    * 
    */
    public FestivalQuery location(LocationQueryDefinition queryDef) {
        return location(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FestivalQuery location(LocationArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("location");

        LocationArguments args = new LocationArguments(_queryBuilder);
        argsDef.define(args);
        LocationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SponsoringOrganizationArguments extends Arguments {
        SponsoringOrganizationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SponsoringOrganizationArguments filter(FestivalSponsorshipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SponsoringOrganizationArguments order(FestivalSponsorshipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SponsoringOrganizationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SponsoringOrganizationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SponsoringOrganizationArgumentsDefinition {
        void define(SponsoringOrganizationArguments args);
    }

    /**
    * 
    */
    public FestivalQuery sponsoringOrganization(FestivalSponsorshipQueryDefinition queryDef) {
        return sponsoringOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FestivalQuery sponsoringOrganization(SponsoringOrganizationArgumentsDefinition argsDef, FestivalSponsorshipQueryDefinition queryDef) {
        startField("sponsoring_organization");

        SponsoringOrganizationArguments args = new SponsoringOrganizationArguments(_queryBuilder);
        argsDef.define(args);
        SponsoringOrganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalSponsorshipQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
