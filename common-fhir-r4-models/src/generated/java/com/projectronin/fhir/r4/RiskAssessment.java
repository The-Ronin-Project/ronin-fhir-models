
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
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "basedOn",
    "parent",
    "status",
    "_status",
    "method",
    "code",
    "subject",
    "encounter",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrencePeriod",
    "condition",
    "performer",
    "reasonCode",
    "reasonReference",
    "basis",
    "prediction",
    "mitigation",
    "_mitigation",
    "note"
})
@Generated("jsonschema2pojo")
public class RiskAssessment
    extends DomainResource
{

    /**
     * This is a RiskAssessment resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a RiskAssessment resource")
    private String resourceType;
    /**
     * Business identifier assigned to the risk assessment.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifier assigned to the risk assessment.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference basedOn;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference parent;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept method;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A reference from one resource to another.
     * (Required)
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
     * The date (and possibly time) the risk assessment was performed.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("The date (and possibly time) the risk assessment was performed.")
    private String occurrenceDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurrenceDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period occurrencePeriod;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference condition;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference performer;
    /**
     * The reason the risk assessment was performed.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("The reason the risk assessment was performed.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Resources supporting the reason the risk assessment was performed.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Resources supporting the reason the risk assessment was performed.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).
     * 
     */
    @JsonProperty("basis")
    @JsonPropertyDescription("Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).")
    private List<Reference> basis = new ArrayList<Reference>();
    /**
     * Describes the expected outcome for the subject.
     * 
     */
    @JsonProperty("prediction")
    @JsonPropertyDescription("Describes the expected outcome for the subject.")
    private List<RiskAssessment_Prediction> prediction = new ArrayList<RiskAssessment_Prediction>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("mitigation")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String mitigation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mitigation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _mitigation;
    /**
     * Additional comments about the risk assessment.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Additional comments about the risk assessment.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a RiskAssessment resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a RiskAssessment resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifier assigned to the risk assessment.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifier assigned to the risk assessment.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("basedOn")
    public Reference getBasedOn() {
        return basedOn;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(Reference basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    public Reference getParent() {
        return parent;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    public void setParent(Reference parent) {
        this.parent = parent;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public void setMethod(CodeableConcept method) {
        this.method = method;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
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
     * The date (and possibly time) the risk assessment was performed.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * The date (and possibly time) the risk assessment was performed.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public Element get_occurrenceDateTime() {
        return _occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public void set_occurrenceDateTime(Element _occurrenceDateTime) {
        this._occurrenceDateTime = _occurrenceDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public Period getOccurrencePeriod() {
        return occurrencePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Period occurrencePeriod) {
        this.occurrencePeriod = occurrencePeriod;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("condition")
    public Reference getCondition() {
        return condition;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(Reference condition) {
        this.condition = condition;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public Reference getPerformer() {
        return performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(Reference performer) {
        this.performer = performer;
    }

    /**
     * The reason the risk assessment was performed.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * The reason the risk assessment was performed.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Resources supporting the reason the risk assessment was performed.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Resources supporting the reason the risk assessment was performed.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).
     * 
     */
    @JsonProperty("basis")
    public List<Reference> getBasis() {
        return basis;
    }

    /**
     * Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).
     * 
     */
    @JsonProperty("basis")
    public void setBasis(List<Reference> basis) {
        this.basis = basis;
    }

    /**
     * Describes the expected outcome for the subject.
     * 
     */
    @JsonProperty("prediction")
    public List<RiskAssessment_Prediction> getPrediction() {
        return prediction;
    }

    /**
     * Describes the expected outcome for the subject.
     * 
     */
    @JsonProperty("prediction")
    public void setPrediction(List<RiskAssessment_Prediction> prediction) {
        this.prediction = prediction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("mitigation")
    public String getMitigation() {
        return mitigation;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("mitigation")
    public void setMitigation(String mitigation) {
        this.mitigation = mitigation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mitigation")
    public Element get_mitigation() {
        return _mitigation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mitigation")
    public void set_mitigation(Element _mitigation) {
        this._mitigation = _mitigation;
    }

    /**
     * Additional comments about the risk assessment.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Additional comments about the risk assessment.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
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
        sb.append(RiskAssessment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("occurrenceDateTime");
        sb.append('=');
        sb.append(((this.occurrenceDateTime == null)?"<null>":this.occurrenceDateTime));
        sb.append(',');
        sb.append("_occurrenceDateTime");
        sb.append('=');
        sb.append(((this._occurrenceDateTime == null)?"<null>":this._occurrenceDateTime));
        sb.append(',');
        sb.append("occurrencePeriod");
        sb.append('=');
        sb.append(((this.occurrencePeriod == null)?"<null>":this.occurrencePeriod));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("basis");
        sb.append('=');
        sb.append(((this.basis == null)?"<null>":this.basis));
        sb.append(',');
        sb.append("prediction");
        sb.append('=');
        sb.append(((this.prediction == null)?"<null>":this.prediction));
        sb.append(',');
        sb.append("mitigation");
        sb.append('=');
        sb.append(((this.mitigation == null)?"<null>":this.mitigation));
        sb.append(',');
        sb.append("_mitigation");
        sb.append('=');
        sb.append(((this._mitigation == null)?"<null>":this._mitigation));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.mitigation == null)? 0 :this.mitigation.hashCode()));
        result = ((result* 31)+((this._mitigation == null)? 0 :this._mitigation.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.basis == null)? 0 :this.basis.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.occurrencePeriod == null)? 0 :this.occurrencePeriod.hashCode()));
        result = ((result* 31)+((this.prediction == null)? 0 :this.prediction.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
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
        if ((other instanceof RiskAssessment) == false) {
            return false;
        }
        RiskAssessment rhs = ((RiskAssessment) other);
        return (((((((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.mitigation == rhs.mitigation)||((this.mitigation!= null)&&this.mitigation.equals(rhs.mitigation))))&&((this._mitigation == rhs._mitigation)||((this._mitigation!= null)&&this._mitigation.equals(rhs._mitigation))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.basis == rhs.basis)||((this.basis!= null)&&this.basis.equals(rhs.basis))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.occurrencePeriod == rhs.occurrencePeriod)||((this.occurrencePeriod!= null)&&this.occurrencePeriod.equals(rhs.occurrencePeriod))))&&((this.prediction == rhs.prediction)||((this.prediction!= null)&&this.prediction.equals(rhs.prediction))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
