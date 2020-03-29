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

public class FestivalPatch implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<DateTime> dateFounded = Input.undefined();

    private Input<List<FestivalFocusRef>> focus = Input.undefined();

    private Input<List<FestivalEventRef>> individualFestivals = Input.undefined();

    private Input<List<LocationRef>> location = Input.undefined();

    private Input<List<FestivalSponsorshipRef>> sponsoringOrganization = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public FestivalPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public FestivalPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public DateTime getDateFounded() {
        return dateFounded.getValue();
    }

    public Input<DateTime> getDateFoundedInput() {
        return dateFounded;
    }

    public FestivalPatch setDateFounded(DateTime dateFounded) {
        this.dateFounded = Input.optional(dateFounded);
        return this;
    }

    public FestivalPatch setDateFoundedInput(Input<DateTime> dateFounded) {
        if (dateFounded == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateFounded = dateFounded;
        return this;
    }

    public List<FestivalFocusRef> getFocus() {
        return focus.getValue();
    }

    public Input<List<FestivalFocusRef>> getFocusInput() {
        return focus;
    }

    public FestivalPatch setFocus(List<FestivalFocusRef> focus) {
        this.focus = Input.optional(focus);
        return this;
    }

    public FestivalPatch setFocusInput(Input<List<FestivalFocusRef>> focus) {
        if (focus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.focus = focus;
        return this;
    }

    public List<FestivalEventRef> getIndividualFestivals() {
        return individualFestivals.getValue();
    }

    public Input<List<FestivalEventRef>> getIndividualFestivalsInput() {
        return individualFestivals;
    }

    public FestivalPatch setIndividualFestivals(List<FestivalEventRef> individualFestivals) {
        this.individualFestivals = Input.optional(individualFestivals);
        return this;
    }

    public FestivalPatch setIndividualFestivalsInput(Input<List<FestivalEventRef>> individualFestivals) {
        if (individualFestivals == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.individualFestivals = individualFestivals;
        return this;
    }

    public List<LocationRef> getLocation() {
        return location.getValue();
    }

    public Input<List<LocationRef>> getLocationInput() {
        return location;
    }

    public FestivalPatch setLocation(List<LocationRef> location) {
        this.location = Input.optional(location);
        return this;
    }

    public FestivalPatch setLocationInput(Input<List<LocationRef>> location) {
        if (location == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.location = location;
        return this;
    }

    public List<FestivalSponsorshipRef> getSponsoringOrganization() {
        return sponsoringOrganization.getValue();
    }

    public Input<List<FestivalSponsorshipRef>> getSponsoringOrganizationInput() {
        return sponsoringOrganization;
    }

    public FestivalPatch setSponsoringOrganization(List<FestivalSponsorshipRef> sponsoringOrganization) {
        this.sponsoringOrganization = Input.optional(sponsoringOrganization);
        return this;
    }

    public FestivalPatch setSponsoringOrganizationInput(Input<List<FestivalSponsorshipRef>> sponsoringOrganization) {
        if (sponsoringOrganization == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sponsoringOrganization = sponsoringOrganization;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.dateFounded.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("date_founded:");
            if (dateFounded.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateFounded.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.focus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("focus:");
            if (focus.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FestivalFocusRef item1 : focus.getValue()) {
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

        if (this.individualFestivals.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("individual_festivals:");
            if (individualFestivals.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FestivalEventRef item1 : individualFestivals.getValue()) {
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

        if (this.location.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("location:");
            if (location.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocationRef item1 : location.getValue()) {
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

        if (this.sponsoringOrganization.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sponsoring_organization:");
            if (sponsoringOrganization.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FestivalSponsorshipRef item1 : sponsoringOrganization.getValue()) {
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
