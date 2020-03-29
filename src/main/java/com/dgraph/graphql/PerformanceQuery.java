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
public class PerformanceQuery extends Query<PerformanceQuery> {
    PerformanceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public PerformanceQuery id() {
        startField("id");

        return this;
    }

    public class ActorArguments extends Arguments {
        ActorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ActorArguments filter(ActorFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ActorArguments order(ActorOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ActorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ActorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ActorArgumentsDefinition {
        void define(ActorArguments args);
    }

    /**
    * 
    */
    public PerformanceQuery actor(ActorQueryDefinition queryDef) {
        return actor(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PerformanceQuery actor(ActorArgumentsDefinition argsDef, ActorQueryDefinition queryDef) {
        startField("actor");

        ActorArguments args = new ActorArguments(_queryBuilder);
        argsDef.define(args);
        ActorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ActorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CharacterArguments extends Arguments {
        CharacterArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CharacterArguments filter(CharacterFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CharacterArguments order(CharacterOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CharacterArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CharacterArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CharacterArgumentsDefinition {
        void define(CharacterArguments args);
    }

    /**
    * 
    */
    public PerformanceQuery character(CharacterQueryDefinition queryDef) {
        return character(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PerformanceQuery character(CharacterArgumentsDefinition argsDef, CharacterQueryDefinition queryDef) {
        startField("character");

        CharacterArguments args = new CharacterArguments(_queryBuilder);
        argsDef.define(args);
        CharacterArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CharacterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public PerformanceQuery characterNote() {
        startField("character_note");

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
    public PerformanceQuery films(FilmQueryDefinition queryDef) {
        return films(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PerformanceQuery films(FilmsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("films");

        FilmsArguments args = new FilmsArguments(_queryBuilder);
        argsDef.define(args);
        FilmsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SpecialPerformanceTypeArguments extends Arguments {
        SpecialPerformanceTypeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SpecialPerformanceTypeArguments filter(SpecialPerformanceTypeFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SpecialPerformanceTypeArguments order(SpecialPerformanceTypeOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SpecialPerformanceTypeArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SpecialPerformanceTypeArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SpecialPerformanceTypeArgumentsDefinition {
        void define(SpecialPerformanceTypeArguments args);
    }

    /**
    * 
    */
    public PerformanceQuery specialPerformanceType(SpecialPerformanceTypeQueryDefinition queryDef) {
        return specialPerformanceType(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PerformanceQuery specialPerformanceType(SpecialPerformanceTypeArgumentsDefinition argsDef, SpecialPerformanceTypeQueryDefinition queryDef) {
        startField("special_performance_type");

        SpecialPerformanceTypeArguments args = new SpecialPerformanceTypeArguments(_queryBuilder);
        argsDef.define(args);
        SpecialPerformanceTypeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SpecialPerformanceTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppearancesArguments extends Arguments {
        AppearancesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AppearancesArguments filter(PersonalAppearanceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AppearancesArguments order(PersonalAppearanceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AppearancesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public AppearancesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AppearancesArgumentsDefinition {
        void define(AppearancesArguments args);
    }

    /**
    * 
    */
    public PerformanceQuery appearances(PersonalAppearanceQueryDefinition queryDef) {
        return appearances(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PerformanceQuery appearances(AppearancesArgumentsDefinition argsDef, PersonalAppearanceQueryDefinition queryDef) {
        startField("appearances");

        AppearancesArguments args = new AppearancesArguments(_queryBuilder);
        argsDef.define(args);
        AppearancesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonalAppearanceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
