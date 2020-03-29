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
public class ActorQuery extends Query<ActorQuery> {
    ActorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public ActorQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public ActorQuery name() {
        startField("name");

        return this;
    }

    public class PerformancesArguments extends Arguments {
        PerformancesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PerformancesArguments filter(PerformanceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformancesArguments order(PerformanceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PerformancesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PerformancesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PerformancesArgumentsDefinition {
        void define(PerformancesArguments args);
    }

    /**
    * 
    */
    public ActorQuery performances(PerformanceQueryDefinition queryDef) {
        return performances(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ActorQuery performances(PerformancesArgumentsDefinition argsDef, PerformanceQueryDefinition queryDef) {
        startField("performances");

        PerformancesArguments args = new PerformancesArguments(_queryBuilder);
        argsDef.define(args);
        PerformancesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PerformanceQuery(_queryBuilder));
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
        public DubbingPerformancesArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DubbingPerformancesArguments order(FilmOrder value) {
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
    public ActorQuery dubbingPerformances(FilmQueryDefinition queryDef) {
        return dubbingPerformances(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ActorQuery dubbingPerformances(DubbingPerformancesArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("dubbing_performances");

        DubbingPerformancesArguments args = new DubbingPerformancesArguments(_queryBuilder);
        argsDef.define(args);
        DubbingPerformancesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
