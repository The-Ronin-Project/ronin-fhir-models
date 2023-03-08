
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes a comparison of an immunization event against published recommendations to determine if the administration is &quot;valid&quot; in relation to those  recommendations.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "patient",
    "date",
    "_date",
    "authority",
    "targetDisease",
    "immunizationEvent",
    "doseStatus",
    "doseStatusReason",
    "description",
    "_description",
    "series",
    "_series",
    "doseNumberPositiveInt",
    "_doseNumberPositiveInt",
    "doseNumberString",
    "_doseNumberString",
    "seriesDosesPositiveInt",
    "_seriesDosesPositiveInt",
    "seriesDosesString",
    "_seriesDosesString"
})
@Generated("jsonschema2pojo")
public class ImmunizationEvaluation
    extends DomainResource
{

    /**
     * This is a ImmunizationEvaluation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ImmunizationEvaluation resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this immunization evaluation record.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this immunization evaluation record.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String date;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _date;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authority")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference authority;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("targetDisease")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept targetDisease;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("immunizationEvent")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference immunizationEvent;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("doseStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept doseStatus;
    /**
     * Provides an explanation as to why the vaccine administration event is valid or not relative to the published recommendations.
     * 
     */
    @JsonProperty("doseStatusReason")
    @JsonPropertyDescription("Provides an explanation as to why the vaccine administration event is valid or not relative to the published recommendations.")
    private List<CodeableConcept> doseStatusReason = new ArrayList<CodeableConcept>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("series")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String series;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_series")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _series;
    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    @JsonPropertyDescription("Nominal position in a series.")
    private Double doseNumberPositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberPositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doseNumberPositiveInt;
    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberString")
    @JsonPropertyDescription("Nominal position in a series.")
    private String doseNumberString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doseNumberString;
    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesPositiveInt")
    @JsonPropertyDescription("The recommended number of doses to achieve immunity.")
    private Double seriesDosesPositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesPositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _seriesDosesPositiveInt;
    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesString")
    @JsonPropertyDescription("The recommended number of doses to achieve immunity.")
    private String seriesDosesString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _seriesDosesString;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ImmunizationEvaluation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ImmunizationEvaluation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this immunization evaluation record.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this immunization evaluation record.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public Element get_date() {
        return _date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public void set_date(Element _date) {
        this._date = _date;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authority")
    public Reference getAuthority() {
        return authority;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authority")
    public void setAuthority(Reference authority) {
        this.authority = authority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("targetDisease")
    public CodeableConcept getTargetDisease() {
        return targetDisease;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("targetDisease")
    public void setTargetDisease(CodeableConcept targetDisease) {
        this.targetDisease = targetDisease;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("immunizationEvent")
    public Reference getImmunizationEvent() {
        return immunizationEvent;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("immunizationEvent")
    public void setImmunizationEvent(Reference immunizationEvent) {
        this.immunizationEvent = immunizationEvent;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("doseStatus")
    public CodeableConcept getDoseStatus() {
        return doseStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("doseStatus")
    public void setDoseStatus(CodeableConcept doseStatus) {
        this.doseStatus = doseStatus;
    }

    /**
     * Provides an explanation as to why the vaccine administration event is valid or not relative to the published recommendations.
     * 
     */
    @JsonProperty("doseStatusReason")
    public List<CodeableConcept> getDoseStatusReason() {
        return doseStatusReason;
    }

    /**
     * Provides an explanation as to why the vaccine administration event is valid or not relative to the published recommendations.
     * 
     */
    @JsonProperty("doseStatusReason")
    public void setDoseStatusReason(List<CodeableConcept> doseStatusReason) {
        this.doseStatusReason = doseStatusReason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("series")
    public String getSeries() {
        return series;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("series")
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_series")
    public Element get_series() {
        return _series;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_series")
    public void set_series(Element _series) {
        this._series = _series;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    public Double getDoseNumberPositiveInt() {
        return doseNumberPositiveInt;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    public void setDoseNumberPositiveInt(Double doseNumberPositiveInt) {
        this.doseNumberPositiveInt = doseNumberPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberPositiveInt")
    public Element get_doseNumberPositiveInt() {
        return _doseNumberPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberPositiveInt")
    public void set_doseNumberPositiveInt(Element _doseNumberPositiveInt) {
        this._doseNumberPositiveInt = _doseNumberPositiveInt;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberString")
    public String getDoseNumberString() {
        return doseNumberString;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberString")
    public void setDoseNumberString(String doseNumberString) {
        this.doseNumberString = doseNumberString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberString")
    public Element get_doseNumberString() {
        return _doseNumberString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberString")
    public void set_doseNumberString(Element _doseNumberString) {
        this._doseNumberString = _doseNumberString;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesPositiveInt")
    public Double getSeriesDosesPositiveInt() {
        return seriesDosesPositiveInt;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesPositiveInt")
    public void setSeriesDosesPositiveInt(Double seriesDosesPositiveInt) {
        this.seriesDosesPositiveInt = seriesDosesPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesPositiveInt")
    public Element get_seriesDosesPositiveInt() {
        return _seriesDosesPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesPositiveInt")
    public void set_seriesDosesPositiveInt(Element _seriesDosesPositiveInt) {
        this._seriesDosesPositiveInt = _seriesDosesPositiveInt;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesString")
    public String getSeriesDosesString() {
        return seriesDosesString;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesString")
    public void setSeriesDosesString(String seriesDosesString) {
        this.seriesDosesString = seriesDosesString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesString")
    public Element get_seriesDosesString() {
        return _seriesDosesString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesString")
    public void set_seriesDosesString(Element _seriesDosesString) {
        this._seriesDosesString = _seriesDosesString;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImmunizationEvaluation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("authority");
        sb.append('=');
        sb.append(((this.authority == null)?"<null>":this.authority));
        sb.append(',');
        sb.append("targetDisease");
        sb.append('=');
        sb.append(((this.targetDisease == null)?"<null>":this.targetDisease));
        sb.append(',');
        sb.append("immunizationEvent");
        sb.append('=');
        sb.append(((this.immunizationEvent == null)?"<null>":this.immunizationEvent));
        sb.append(',');
        sb.append("doseStatus");
        sb.append('=');
        sb.append(((this.doseStatus == null)?"<null>":this.doseStatus));
        sb.append(',');
        sb.append("doseStatusReason");
        sb.append('=');
        sb.append(((this.doseStatusReason == null)?"<null>":this.doseStatusReason));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("_series");
        sb.append('=');
        sb.append(((this._series == null)?"<null>":this._series));
        sb.append(',');
        sb.append("doseNumberPositiveInt");
        sb.append('=');
        sb.append(((this.doseNumberPositiveInt == null)?"<null>":this.doseNumberPositiveInt));
        sb.append(',');
        sb.append("_doseNumberPositiveInt");
        sb.append('=');
        sb.append(((this._doseNumberPositiveInt == null)?"<null>":this._doseNumberPositiveInt));
        sb.append(',');
        sb.append("doseNumberString");
        sb.append('=');
        sb.append(((this.doseNumberString == null)?"<null>":this.doseNumberString));
        sb.append(',');
        sb.append("_doseNumberString");
        sb.append('=');
        sb.append(((this._doseNumberString == null)?"<null>":this._doseNumberString));
        sb.append(',');
        sb.append("seriesDosesPositiveInt");
        sb.append('=');
        sb.append(((this.seriesDosesPositiveInt == null)?"<null>":this.seriesDosesPositiveInt));
        sb.append(',');
        sb.append("_seriesDosesPositiveInt");
        sb.append('=');
        sb.append(((this._seriesDosesPositiveInt == null)?"<null>":this._seriesDosesPositiveInt));
        sb.append(',');
        sb.append("seriesDosesString");
        sb.append('=');
        sb.append(((this.seriesDosesString == null)?"<null>":this.seriesDosesString));
        sb.append(',');
        sb.append("_seriesDosesString");
        sb.append('=');
        sb.append(((this._seriesDosesString == null)?"<null>":this._seriesDosesString));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._seriesDosesString == null)? 0 :this._seriesDosesString.hashCode()));
        result = ((result* 31)+((this.immunizationEvent == null)? 0 :this.immunizationEvent.hashCode()));
        result = ((result* 31)+((this.doseNumberString == null)? 0 :this.doseNumberString.hashCode()));
        result = ((result* 31)+((this.doseStatusReason == null)? 0 :this.doseStatusReason.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this._doseNumberPositiveInt == null)? 0 :this._doseNumberPositiveInt.hashCode()));
        result = ((result* 31)+((this.targetDisease == null)? 0 :this.targetDisease.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.seriesDosesPositiveInt == null)? 0 :this.seriesDosesPositiveInt.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.doseStatus == null)? 0 :this.doseStatus.hashCode()));
        result = ((result* 31)+((this._series == null)? 0 :this._series.hashCode()));
        result = ((result* 31)+((this.seriesDosesString == null)? 0 :this.seriesDosesString.hashCode()));
        result = ((result* 31)+((this._seriesDosesPositiveInt == null)? 0 :this._seriesDosesPositiveInt.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this.authority == null)? 0 :this.authority.hashCode()));
        result = ((result* 31)+((this.doseNumberPositiveInt == null)? 0 :this.doseNumberPositiveInt.hashCode()));
        result = ((result* 31)+((this._doseNumberString == null)? 0 :this._doseNumberString.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImmunizationEvaluation) == false) {
            return false;
        }
        ImmunizationEvaluation rhs = ((ImmunizationEvaluation) other);
        return (((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._seriesDosesString == rhs._seriesDosesString)||((this._seriesDosesString!= null)&&this._seriesDosesString.equals(rhs._seriesDosesString))))&&((this.immunizationEvent == rhs.immunizationEvent)||((this.immunizationEvent!= null)&&this.immunizationEvent.equals(rhs.immunizationEvent))))&&((this.doseNumberString == rhs.doseNumberString)||((this.doseNumberString!= null)&&this.doseNumberString.equals(rhs.doseNumberString))))&&((this.doseStatusReason == rhs.doseStatusReason)||((this.doseStatusReason!= null)&&this.doseStatusReason.equals(rhs.doseStatusReason))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this._doseNumberPositiveInt == rhs._doseNumberPositiveInt)||((this._doseNumberPositiveInt!= null)&&this._doseNumberPositiveInt.equals(rhs._doseNumberPositiveInt))))&&((this.targetDisease == rhs.targetDisease)||((this.targetDisease!= null)&&this.targetDisease.equals(rhs.targetDisease))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.seriesDosesPositiveInt == rhs.seriesDosesPositiveInt)||((this.seriesDosesPositiveInt!= null)&&this.seriesDosesPositiveInt.equals(rhs.seriesDosesPositiveInt))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.doseStatus == rhs.doseStatus)||((this.doseStatus!= null)&&this.doseStatus.equals(rhs.doseStatus))))&&((this._series == rhs._series)||((this._series!= null)&&this._series.equals(rhs._series))))&&((this.seriesDosesString == rhs.seriesDosesString)||((this.seriesDosesString!= null)&&this.seriesDosesString.equals(rhs.seriesDosesString))))&&((this._seriesDosesPositiveInt == rhs._seriesDosesPositiveInt)||((this._seriesDosesPositiveInt!= null)&&this._seriesDosesPositiveInt.equals(rhs._seriesDosesPositiveInt))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this.authority == rhs.authority)||((this.authority!= null)&&this.authority.equals(rhs.authority))))&&((this.doseNumberPositiveInt == rhs.doseNumberPositiveInt)||((this.doseNumberPositiveInt!= null)&&this.doseNumberPositiveInt.equals(rhs.doseNumberPositiveInt))))&&((this._doseNumberString == rhs._doseNumberString)||((this._doseNumberString!= null)&&this._doseNumberString.equals(rhs._doseNumberString))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
