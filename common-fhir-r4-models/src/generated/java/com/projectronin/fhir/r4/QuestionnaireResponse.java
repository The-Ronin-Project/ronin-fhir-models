
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
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "basedOn",
    "partOf",
    "questionnaire",
    "status",
    "_status",
    "subject",
    "encounter",
    "authored",
    "_authored",
    "author",
    "source",
    "item"
})
@Generated("jsonschema2pojo")
public class QuestionnaireResponse
    extends DomainResource
{

    /**
     * This is a QuestionnaireResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a QuestionnaireResponse resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("questionnaire")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String questionnaire;
    /**
     * The position of the questionnaire response within its overall lifecycle.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The position of the questionnaire response within its overall lifecycle.")
    private QuestionnaireResponse.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authored")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String authored;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authored")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _authored;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference author;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference source;
    /**
     * A group or question item from the original questionnaire for which answers are provided.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("A group or question item from the original questionnaire for which answers are provided.")
    private List<QuestionnaireResponse_Item> item = new ArrayList<QuestionnaireResponse_Item>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a QuestionnaireResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a QuestionnaireResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("questionnaire")
    public String getQuestionnaire() {
        return questionnaire;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("questionnaire")
    public void setQuestionnaire(String questionnaire) {
        this.questionnaire = questionnaire;
    }

    /**
     * The position of the questionnaire response within its overall lifecycle.
     * 
     */
    @JsonProperty("status")
    public QuestionnaireResponse.Status getStatus() {
        return status;
    }

    /**
     * The position of the questionnaire response within its overall lifecycle.
     * 
     */
    @JsonProperty("status")
    public void setStatus(QuestionnaireResponse.Status status) {
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(Reference encounter) {
        this.encounter = encounter;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authored")
    public String getAuthored() {
        return authored;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authored")
    public void setAuthored(String authored) {
        this.authored = authored;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authored")
    public Element get_authored() {
        return _authored;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authored")
    public void set_authored(Element _authored) {
        this._authored = _authored;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    public Reference getAuthor() {
        return author;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Reference author) {
        this.author = author;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public Reference getSource() {
        return source;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public void setSource(Reference source) {
        this.source = source;
    }

    /**
     * A group or question item from the original questionnaire for which answers are provided.
     * 
     */
    @JsonProperty("item")
    public List<QuestionnaireResponse_Item> getItem() {
        return item;
    }

    /**
     * A group or question item from the original questionnaire for which answers are provided.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<QuestionnaireResponse_Item> item) {
        this.item = item;
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
        sb.append(QuestionnaireResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("questionnaire");
        sb.append('=');
        sb.append(((this.questionnaire == null)?"<null>":this.questionnaire));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("authored");
        sb.append('=');
        sb.append(((this.authored == null)?"<null>":this.authored));
        sb.append(',');
        sb.append("_authored");
        sb.append('=');
        sb.append(((this._authored == null)?"<null>":this._authored));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
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
        result = ((result* 31)+((this.authored == null)? 0 :this.authored.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.questionnaire == null)? 0 :this.questionnaire.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._authored == null)? 0 :this._authored.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
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
        if ((other instanceof QuestionnaireResponse) == false) {
            return false;
        }
        QuestionnaireResponse rhs = ((QuestionnaireResponse) other);
        return (((((((((((((((super.equals(rhs)&&((this.authored == rhs.authored)||((this.authored!= null)&&this.authored.equals(rhs.authored))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.questionnaire == rhs.questionnaire)||((this.questionnaire!= null)&&this.questionnaire.equals(rhs.questionnaire))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._authored == rhs._authored)||((this._authored!= null)&&this._authored.equals(rhs._authored))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The position of the questionnaire response within its overall lifecycle.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        IN_PROGRESS("in-progress"),
        COMPLETED("completed"),
        AMENDED("amended"),
        ENTERED_IN_ERROR("entered-in-error"),
        STOPPED("stopped");
        private final String value;
        private final static Map<String, QuestionnaireResponse.Status> CONSTANTS = new HashMap<String, QuestionnaireResponse.Status>();

        static {
            for (QuestionnaireResponse.Status c: values()) {
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
        public static QuestionnaireResponse.Status fromValue(String value) {
            QuestionnaireResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
