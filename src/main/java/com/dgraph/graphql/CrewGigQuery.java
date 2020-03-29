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
public class CrewGigQuery extends Query<CrewGigQuery> {
    CrewGigQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public CrewGigQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public CrewGigQuery name() {
        startField("name");

        return this;
    }

    public class CrewRoleArguments extends Arguments {
        CrewRoleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CrewRoleArguments filter(JobFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewRoleArguments order(JobOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewRoleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CrewRoleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CrewRoleArgumentsDefinition {
        void define(CrewRoleArguments args);
    }

    /**
    * 
    */
    public CrewGigQuery crewRole(JobQueryDefinition queryDef) {
        return crewRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CrewGigQuery crewRole(CrewRoleArgumentsDefinition argsDef, JobQueryDefinition queryDef) {
        startField("crew_role");

        CrewRoleArguments args = new CrewRoleArguments(_queryBuilder);
        argsDef.define(args);
        CrewRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CrewmemberArguments extends Arguments {
        CrewmemberArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CrewmemberArguments filter(CrewMemberFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewmemberArguments order(CrewMemberOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CrewmemberArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CrewmemberArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CrewmemberArgumentsDefinition {
        void define(CrewmemberArguments args);
    }

    /**
    * 
    */
    public CrewGigQuery crewmember(CrewMemberQueryDefinition queryDef) {
        return crewmember(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CrewGigQuery crewmember(CrewmemberArgumentsDefinition argsDef, CrewMemberQueryDefinition queryDef) {
        startField("crewmember");

        CrewmemberArguments args = new CrewmemberArguments(_queryBuilder);
        argsDef.define(args);
        CrewmemberArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CrewMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FilmsArguments extends Arguments {
        FilmsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FilmsArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FilmsArgumentsDefinition {
        void define(FilmsArguments args);
    }

    /**
    * 
    */
    public CrewGigQuery films(FilmQueryDefinition queryDef) {
        return films(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CrewGigQuery films(FilmsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("films");

        FilmsArguments args = new FilmsArguments(_queryBuilder);
        argsDef.define(args);
        FilmsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
