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
public class PersonalAppearanceQuery extends Query<PersonalAppearanceQuery> {
    PersonalAppearanceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public PersonalAppearanceQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public PersonalAppearanceQuery name() {
        startField("name");

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
    public PersonalAppearanceQuery films(FilmQueryDefinition queryDef) {
        return films(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonalAppearanceQuery films(FilmsArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("films");

        FilmsArguments args = new FilmsArguments(_queryBuilder);
        argsDef.define(args);
        FilmsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PersonArguments extends Arguments {
        PersonArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonArguments filter(PersonOrEntityAppearingInFilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonArguments order(PersonOrEntityAppearingInFilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PersonArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PersonArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PersonArgumentsDefinition {
        void define(PersonArguments args);
    }

    /**
    * 
    */
    public PersonalAppearanceQuery person(PersonOrEntityAppearingInFilmQueryDefinition queryDef) {
        return person(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonalAppearanceQuery person(PersonArgumentsDefinition argsDef, PersonOrEntityAppearingInFilmQueryDefinition queryDef) {
        startField("person");

        PersonArguments args = new PersonArguments(_queryBuilder);
        argsDef.define(args);
        PersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonOrEntityAppearingInFilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TypeOfAppearanceArguments extends Arguments {
        TypeOfAppearanceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public TypeOfAppearanceArguments filter(PersonalAppearanceTypeFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TypeOfAppearanceArguments order(PersonalAppearanceTypeOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TypeOfAppearanceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public TypeOfAppearanceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TypeOfAppearanceArgumentsDefinition {
        void define(TypeOfAppearanceArguments args);
    }

    /**
    * 
    */
    public PersonalAppearanceQuery typeOfAppearance(PersonalAppearanceTypeQueryDefinition queryDef) {
        return typeOfAppearance(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonalAppearanceQuery typeOfAppearance(TypeOfAppearanceArgumentsDefinition argsDef, PersonalAppearanceTypeQueryDefinition queryDef) {
        startField("type_of_appearance");

        TypeOfAppearanceArguments args = new TypeOfAppearanceArguments(_queryBuilder);
        argsDef.define(args);
        TypeOfAppearanceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonalAppearanceTypeQuery(_queryBuilder));
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
        public AppearancesArguments filter(PersonalAppearanceTypeFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AppearancesArguments order(PersonalAppearanceTypeOrder value) {
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
    public PersonalAppearanceQuery appearances(PersonalAppearanceTypeQueryDefinition queryDef) {
        return appearances(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonalAppearanceQuery appearances(AppearancesArgumentsDefinition argsDef, PersonalAppearanceTypeQueryDefinition queryDef) {
        startField("appearances");

        AppearancesArguments args = new AppearancesArguments(_queryBuilder);
        argsDef.define(args);
        AppearancesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonalAppearanceTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
