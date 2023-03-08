
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
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "lifecycleStatus",
    "_lifecycleStatus",
    "achievementStatus",
    "category",
    "priority",
    "description",
    "subject",
    "startDate",
    "_startDate",
    "startCodeableConcept",
    "target",
    "statusDate",
    "_statusDate",
    "statusReason",
    "_statusReason",
    "expressedBy",
    "addresses",
    "note",
    "outcomeCode",
    "outcomeReference"
})
@Generated("jsonschema2pojo")
public class Goal
    extends DomainResource
{

    /**
     * This is a Goal resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Goal resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The state of the goal throughout its lifecycle.
     * 
     */
    @JsonProperty("lifecycleStatus")
    @JsonPropertyDescription("The state of the goal throughout its lifecycle.")
    private Goal.LifecycleStatus lifecycleStatus;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lifecycleStatus")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lifecycleStatus;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("achievementStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept achievementStatus;
    /**
     * Indicates a category the goal falls within.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Indicates a category the goal falls within.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept priority;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept description;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * The date or event after which the goal should begin being pursued.
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("The date or event after which the goal should begin being pursued.")
    private String startDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_startDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _startDate;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("startCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept startCodeableConcept;
    /**
     * Indicates what should be done by when.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Indicates what should be done by when.")
    private List<Goal_Target> target = new ArrayList<Goal_Target>();
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String statusDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _statusDate;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("statusReason")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String statusReason;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusReason")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _statusReason;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("expressedBy")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference expressedBy;
    /**
     * The identified conditions and other health record elements that are intended to be addressed by the goal.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The identified conditions and other health record elements that are intended to be addressed by the goal.")
    private List<Reference> addresses = new ArrayList<Reference>();
    /**
     * Any comments related to the goal.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Any comments related to the goal.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Identifies the change (or lack of change) at the point when the status of the goal is assessed.
     * 
     */
    @JsonProperty("outcomeCode")
    @JsonPropertyDescription("Identifies the change (or lack of change) at the point when the status of the goal is assessed.")
    private List<CodeableConcept> outcomeCode = new ArrayList<CodeableConcept>();
    /**
     * Details of what's changed (or not changed).
     * 
     */
    @JsonProperty("outcomeReference")
    @JsonPropertyDescription("Details of what's changed (or not changed).")
    private List<Reference> outcomeReference = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Goal resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Goal resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The state of the goal throughout its lifecycle.
     * 
     */
    @JsonProperty("lifecycleStatus")
    public Goal.LifecycleStatus getLifecycleStatus() {
        return lifecycleStatus;
    }

    /**
     * The state of the goal throughout its lifecycle.
     * 
     */
    @JsonProperty("lifecycleStatus")
    public void setLifecycleStatus(Goal.LifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lifecycleStatus")
    public Element get_lifecycleStatus() {
        return _lifecycleStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lifecycleStatus")
    public void set_lifecycleStatus(Element _lifecycleStatus) {
        this._lifecycleStatus = _lifecycleStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("achievementStatus")
    public CodeableConcept getAchievementStatus() {
        return achievementStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("achievementStatus")
    public void setAchievementStatus(CodeableConcept achievementStatus) {
        this.achievementStatus = achievementStatus;
    }

    /**
     * Indicates a category the goal falls within.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * Indicates a category the goal falls within.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(CodeableConcept priority) {
        this.priority = priority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public CodeableConcept getDescription() {
        return description;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(CodeableConcept description) {
        this.description = description;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * The date or event after which the goal should begin being pursued.
     * 
     */
    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * The date or event after which the goal should begin being pursued.
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_startDate")
    public Element get_startDate() {
        return _startDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_startDate")
    public void set_startDate(Element _startDate) {
        this._startDate = _startDate;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("startCodeableConcept")
    public CodeableConcept getStartCodeableConcept() {
        return startCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("startCodeableConcept")
    public void setStartCodeableConcept(CodeableConcept startCodeableConcept) {
        this.startCodeableConcept = startCodeableConcept;
    }

    /**
     * Indicates what should be done by when.
     * 
     */
    @JsonProperty("target")
    public List<Goal_Target> getTarget() {
        return target;
    }

    /**
     * Indicates what should be done by when.
     * 
     */
    @JsonProperty("target")
    public void setTarget(List<Goal_Target> target) {
        this.target = target;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    public String getStatusDate() {
        return statusDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusDate")
    public Element get_statusDate() {
        return _statusDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusDate")
    public void set_statusDate(Element _statusDate) {
        this._statusDate = _statusDate;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("statusReason")
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusReason")
    public Element get_statusReason() {
        return _statusReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusReason")
    public void set_statusReason(Element _statusReason) {
        this._statusReason = _statusReason;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("expressedBy")
    public Reference getExpressedBy() {
        return expressedBy;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("expressedBy")
    public void setExpressedBy(Reference expressedBy) {
        this.expressedBy = expressedBy;
    }

    /**
     * The identified conditions and other health record elements that are intended to be addressed by the goal.
     * 
     */
    @JsonProperty("addresses")
    public List<Reference> getAddresses() {
        return addresses;
    }

    /**
     * The identified conditions and other health record elements that are intended to be addressed by the goal.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Reference> addresses) {
        this.addresses = addresses;
    }

    /**
     * Any comments related to the goal.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Any comments related to the goal.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Identifies the change (or lack of change) at the point when the status of the goal is assessed.
     * 
     */
    @JsonProperty("outcomeCode")
    public List<CodeableConcept> getOutcomeCode() {
        return outcomeCode;
    }

    /**
     * Identifies the change (or lack of change) at the point when the status of the goal is assessed.
     * 
     */
    @JsonProperty("outcomeCode")
    public void setOutcomeCode(List<CodeableConcept> outcomeCode) {
        this.outcomeCode = outcomeCode;
    }

    /**
     * Details of what's changed (or not changed).
     * 
     */
    @JsonProperty("outcomeReference")
    public List<Reference> getOutcomeReference() {
        return outcomeReference;
    }

    /**
     * Details of what's changed (or not changed).
     * 
     */
    @JsonProperty("outcomeReference")
    public void setOutcomeReference(List<Reference> outcomeReference) {
        this.outcomeReference = outcomeReference;
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
        sb.append(Goal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("lifecycleStatus");
        sb.append('=');
        sb.append(((this.lifecycleStatus == null)?"<null>":this.lifecycleStatus));
        sb.append(',');
        sb.append("_lifecycleStatus");
        sb.append('=');
        sb.append(((this._lifecycleStatus == null)?"<null>":this._lifecycleStatus));
        sb.append(',');
        sb.append("achievementStatus");
        sb.append('=');
        sb.append(((this.achievementStatus == null)?"<null>":this.achievementStatus));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("_startDate");
        sb.append('=');
        sb.append(((this._startDate == null)?"<null>":this._startDate));
        sb.append(',');
        sb.append("startCodeableConcept");
        sb.append('=');
        sb.append(((this.startCodeableConcept == null)?"<null>":this.startCodeableConcept));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("_statusDate");
        sb.append('=');
        sb.append(((this._statusDate == null)?"<null>":this._statusDate));
        sb.append(',');
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("_statusReason");
        sb.append('=');
        sb.append(((this._statusReason == null)?"<null>":this._statusReason));
        sb.append(',');
        sb.append("expressedBy");
        sb.append('=');
        sb.append(((this.expressedBy == null)?"<null>":this.expressedBy));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("outcomeCode");
        sb.append('=');
        sb.append(((this.outcomeCode == null)?"<null>":this.outcomeCode));
        sb.append(',');
        sb.append("outcomeReference");
        sb.append('=');
        sb.append(((this.outcomeReference == null)?"<null>":this.outcomeReference));
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
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this._statusDate == null)? 0 :this._statusDate.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.lifecycleStatus == null)? 0 :this.lifecycleStatus.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.outcomeReference == null)? 0 :this.outcomeReference.hashCode()));
        result = ((result* 31)+((this._lifecycleStatus == null)? 0 :this._lifecycleStatus.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.outcomeCode == null)? 0 :this.outcomeCode.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this._statusReason == null)? 0 :this._statusReason.hashCode()));
        result = ((result* 31)+((this.expressedBy == null)? 0 :this.expressedBy.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.startCodeableConcept == null)? 0 :this.startCodeableConcept.hashCode()));
        result = ((result* 31)+((this.achievementStatus == null)? 0 :this.achievementStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this._startDate == null)? 0 :this._startDate.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Goal) == false) {
            return false;
        }
        Goal rhs = ((Goal) other);
        return (((((((((((((((((((((((super.equals(rhs)&&((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate))))&&((this._statusDate == rhs._statusDate)||((this._statusDate!= null)&&this._statusDate.equals(rhs._statusDate))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.lifecycleStatus == rhs.lifecycleStatus)||((this.lifecycleStatus!= null)&&this.lifecycleStatus.equals(rhs.lifecycleStatus))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.outcomeReference == rhs.outcomeReference)||((this.outcomeReference!= null)&&this.outcomeReference.equals(rhs.outcomeReference))))&&((this._lifecycleStatus == rhs._lifecycleStatus)||((this._lifecycleStatus!= null)&&this._lifecycleStatus.equals(rhs._lifecycleStatus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.outcomeCode == rhs.outcomeCode)||((this.outcomeCode!= null)&&this.outcomeCode.equals(rhs.outcomeCode))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this._statusReason == rhs._statusReason)||((this._statusReason!= null)&&this._statusReason.equals(rhs._statusReason))))&&((this.expressedBy == rhs.expressedBy)||((this.expressedBy!= null)&&this.expressedBy.equals(rhs.expressedBy))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.startCodeableConcept == rhs.startCodeableConcept)||((this.startCodeableConcept!= null)&&this.startCodeableConcept.equals(rhs.startCodeableConcept))))&&((this.achievementStatus == rhs.achievementStatus)||((this.achievementStatus!= null)&&this.achievementStatus.equals(rhs.achievementStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this._startDate == rhs._startDate)||((this._startDate!= null)&&this._startDate.equals(rhs._startDate))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * The state of the goal throughout its lifecycle.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum LifecycleStatus {

        PROPOSED("proposed"),
        PLANNED("planned"),
        ACCEPTED("accepted"),
        ACTIVE("active"),
        ON_HOLD("on-hold"),
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        ENTERED_IN_ERROR("entered-in-error"),
        REJECTED("rejected");
        private final String value;
        private final static Map<String, Goal.LifecycleStatus> CONSTANTS = new HashMap<String, Goal.LifecycleStatus>();

        static {
            for (Goal.LifecycleStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        LifecycleStatus(String value) {
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
        public static Goal.LifecycleStatus fromValue(String value) {
            Goal.LifecycleStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
