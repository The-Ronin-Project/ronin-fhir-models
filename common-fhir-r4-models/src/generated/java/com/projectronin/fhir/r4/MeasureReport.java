
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "type",
    "_type",
    "measure",
    "subject",
    "date",
    "_date",
    "reporter",
    "period",
    "improvementNotation",
    "group",
    "evaluatedResource"
})
@Generated("jsonschema2pojo")
public class MeasureReport
    extends DomainResource
{

    /**
     * This is a MeasureReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MeasureReport resource")
    private String resourceType;
    /**
     * A formal identifier that is used to identify this MeasureReport when it is represented in other formats or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A formal identifier that is used to identify this MeasureReport when it is represented in other formats or referenced in a specification, model, design or an instance.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The MeasureReport status. No data will be available until the MeasureReport status is complete.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The MeasureReport status. No data will be available until the MeasureReport status is complete.")
    private MeasureReport.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * The type of measure report. This may be an individual report, which provides the score for the measure for an individual member of the population; a subject-listing, which returns the list of members that meet the various criteria in the measure; a summary report, which returns a population count for each of the criteria in the measure; or a data-collection, which enables the MeasureReport to be used to exchange the data-of-interest for a quality measure.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of measure report. This may be an individual report, which provides the score for the measure for an individual member of the population; a subject-listing, which returns the list of members that meet the various criteria in the measure; a summary report, which returns a population count for each of the criteria in the measure; or a data-collection, which enables the MeasureReport to be used to exchange the data-of-interest for a quality measure.")
    private MeasureReport.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("measure")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String measure;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
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
    @JsonProperty("reporter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference reporter;
    /**
     * A time period defined by a start and end date and optionally time.
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("improvementNotation")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept improvementNotation;
    /**
     * The results of the calculation, one for each population group in the measure.
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("The results of the calculation, one for each population group in the measure.")
    private List<MeasureReport_Group> group = new ArrayList<MeasureReport_Group>();
    /**
     * A reference to a Bundle containing the Resources that were used in the calculation of this measure.
     * 
     */
    @JsonProperty("evaluatedResource")
    @JsonPropertyDescription("A reference to a Bundle containing the Resources that were used in the calculation of this measure.")
    private List<Reference> evaluatedResource = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MeasureReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MeasureReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A formal identifier that is used to identify this MeasureReport when it is represented in other formats or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A formal identifier that is used to identify this MeasureReport when it is represented in other formats or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The MeasureReport status. No data will be available until the MeasureReport status is complete.
     * 
     */
    @JsonProperty("status")
    public MeasureReport.Status getStatus() {
        return status;
    }

    /**
     * The MeasureReport status. No data will be available until the MeasureReport status is complete.
     * 
     */
    @JsonProperty("status")
    public void setStatus(MeasureReport.Status status) {
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
     * The type of measure report. This may be an individual report, which provides the score for the measure for an individual member of the population; a subject-listing, which returns the list of members that meet the various criteria in the measure; a summary report, which returns a population count for each of the criteria in the measure; or a data-collection, which enables the MeasureReport to be used to exchange the data-of-interest for a quality measure.
     * 
     */
    @JsonProperty("type")
    public MeasureReport.Type getType() {
        return type;
    }

    /**
     * The type of measure report. This may be an individual report, which provides the score for the measure for an individual member of the population; a subject-listing, which returns the list of members that meet the various criteria in the measure; a summary report, which returns a population count for each of the criteria in the measure; or a data-collection, which enables the MeasureReport to be used to exchange the data-of-interest for a quality measure.
     * 
     */
    @JsonProperty("type")
    public void setType(MeasureReport.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("measure")
    public String getMeasure() {
        return measure;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(String measure) {
        this.measure = measure;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
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
    @JsonProperty("reporter")
    public Reference getReporter() {
        return reporter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reporter")
    public void setReporter(Reference reporter) {
        this.reporter = reporter;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("improvementNotation")
    public CodeableConcept getImprovementNotation() {
        return improvementNotation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("improvementNotation")
    public void setImprovementNotation(CodeableConcept improvementNotation) {
        this.improvementNotation = improvementNotation;
    }

    /**
     * The results of the calculation, one for each population group in the measure.
     * 
     */
    @JsonProperty("group")
    public List<MeasureReport_Group> getGroup() {
        return group;
    }

    /**
     * The results of the calculation, one for each population group in the measure.
     * 
     */
    @JsonProperty("group")
    public void setGroup(List<MeasureReport_Group> group) {
        this.group = group;
    }

    /**
     * A reference to a Bundle containing the Resources that were used in the calculation of this measure.
     * 
     */
    @JsonProperty("evaluatedResource")
    public List<Reference> getEvaluatedResource() {
        return evaluatedResource;
    }

    /**
     * A reference to a Bundle containing the Resources that were used in the calculation of this measure.
     * 
     */
    @JsonProperty("evaluatedResource")
    public void setEvaluatedResource(List<Reference> evaluatedResource) {
        this.evaluatedResource = evaluatedResource;
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
        sb.append(MeasureReport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("reporter");
        sb.append('=');
        sb.append(((this.reporter == null)?"<null>":this.reporter));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("improvementNotation");
        sb.append('=');
        sb.append(((this.improvementNotation == null)?"<null>":this.improvementNotation));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("evaluatedResource");
        sb.append('=');
        sb.append(((this.evaluatedResource == null)?"<null>":this.evaluatedResource));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.reporter == null)? 0 :this.reporter.hashCode()));
        result = ((result* 31)+((this.improvementNotation == null)? 0 :this.improvementNotation.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        result = ((result* 31)+((this.evaluatedResource == null)? 0 :this.evaluatedResource.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeasureReport) == false) {
            return false;
        }
        MeasureReport rhs = ((MeasureReport) other);
        return ((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.reporter == rhs.reporter)||((this.reporter!= null)&&this.reporter.equals(rhs.reporter))))&&((this.improvementNotation == rhs.improvementNotation)||((this.improvementNotation!= null)&&this.improvementNotation.equals(rhs.improvementNotation))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure))))&&((this.evaluatedResource == rhs.evaluatedResource)||((this.evaluatedResource!= null)&&this.evaluatedResource.equals(rhs.evaluatedResource))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }


    /**
     * The MeasureReport status. No data will be available until the MeasureReport status is complete.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        COMPLETE("complete"),
        PENDING("pending"),
        ERROR("error");
        private final String value;
        private final static Map<String, MeasureReport.Status> CONSTANTS = new HashMap<String, MeasureReport.Status>();

        static {
            for (MeasureReport.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MeasureReport.Status fromValue(String value) {
            MeasureReport.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The type of measure report. This may be an individual report, which provides the score for the measure for an individual member of the population; a subject-listing, which returns the list of members that meet the various criteria in the measure; a summary report, which returns a population count for each of the criteria in the measure; or a data-collection, which enables the MeasureReport to be used to exchange the data-of-interest for a quality measure.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        INDIVIDUAL("individual"),
        SUBJECT_LIST("subject-list"),
        SUMMARY("summary"),
        DATA_COLLECTION("data-collection");
        private final String value;
        private final static Map<String, MeasureReport.Type> CONSTANTS = new HashMap<String, MeasureReport.Type>();

        static {
            for (MeasureReport.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MeasureReport.Type fromValue(String value) {
            MeasureReport.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
