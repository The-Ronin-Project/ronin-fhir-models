
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
 * A physical entity which is the primary unit of operational and/or administrative interest in a study.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "period",
    "study",
    "individual",
    "assignedArm",
    "_assignedArm",
    "actualArm",
    "_actualArm",
    "consent"
})
@Generated("jsonschema2pojo")
public class ResearchSubject
    extends DomainResource
{

    /**
     * This is a ResearchSubject resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ResearchSubject resource")
    private String resourceType;
    /**
     * Identifiers assigned to this research subject for a study.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers assigned to this research subject for a study.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The current state of the subject.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current state of the subject.")
    private ResearchSubject.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("study")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference study;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("individual")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference individual;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("assignedArm")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String assignedArm;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_assignedArm")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _assignedArm;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("actualArm")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String actualArm;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actualArm")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _actualArm;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("consent")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference consent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ResearchSubject resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ResearchSubject resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers assigned to this research subject for a study.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers assigned to this research subject for a study.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The current state of the subject.
     * 
     */
    @JsonProperty("status")
    public ResearchSubject.Status getStatus() {
        return status;
    }

    /**
     * The current state of the subject.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ResearchSubject.Status status) {
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("study")
    public Reference getStudy() {
        return study;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("study")
    public void setStudy(Reference study) {
        this.study = study;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("individual")
    public Reference getIndividual() {
        return individual;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("individual")
    public void setIndividual(Reference individual) {
        this.individual = individual;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("assignedArm")
    public String getAssignedArm() {
        return assignedArm;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("assignedArm")
    public void setAssignedArm(String assignedArm) {
        this.assignedArm = assignedArm;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_assignedArm")
    public Element get_assignedArm() {
        return _assignedArm;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_assignedArm")
    public void set_assignedArm(Element _assignedArm) {
        this._assignedArm = _assignedArm;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("actualArm")
    public String getActualArm() {
        return actualArm;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("actualArm")
    public void setActualArm(String actualArm) {
        this.actualArm = actualArm;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actualArm")
    public Element get_actualArm() {
        return _actualArm;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actualArm")
    public void set_actualArm(Element _actualArm) {
        this._actualArm = _actualArm;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("consent")
    public Reference getConsent() {
        return consent;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("consent")
    public void setConsent(Reference consent) {
        this.consent = consent;
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
        sb.append(ResearchSubject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("study");
        sb.append('=');
        sb.append(((this.study == null)?"<null>":this.study));
        sb.append(',');
        sb.append("individual");
        sb.append('=');
        sb.append(((this.individual == null)?"<null>":this.individual));
        sb.append(',');
        sb.append("assignedArm");
        sb.append('=');
        sb.append(((this.assignedArm == null)?"<null>":this.assignedArm));
        sb.append(',');
        sb.append("_assignedArm");
        sb.append('=');
        sb.append(((this._assignedArm == null)?"<null>":this._assignedArm));
        sb.append(',');
        sb.append("actualArm");
        sb.append('=');
        sb.append(((this.actualArm == null)?"<null>":this.actualArm));
        sb.append(',');
        sb.append("_actualArm");
        sb.append('=');
        sb.append(((this._actualArm == null)?"<null>":this._actualArm));
        sb.append(',');
        sb.append("consent");
        sb.append('=');
        sb.append(((this.consent == null)?"<null>":this.consent));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.study == null)? 0 :this.study.hashCode()));
        result = ((result* 31)+((this.individual == null)? 0 :this.individual.hashCode()));
        result = ((result* 31)+((this._actualArm == null)? 0 :this._actualArm.hashCode()));
        result = ((result* 31)+((this.actualArm == null)? 0 :this.actualArm.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.consent == null)? 0 :this.consent.hashCode()));
        result = ((result* 31)+((this._assignedArm == null)? 0 :this._assignedArm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.assignedArm == null)? 0 :this.assignedArm.hashCode()));
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
        if ((other instanceof ResearchSubject) == false) {
            return false;
        }
        ResearchSubject rhs = ((ResearchSubject) other);
        return (((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.study == rhs.study)||((this.study!= null)&&this.study.equals(rhs.study))))&&((this.individual == rhs.individual)||((this.individual!= null)&&this.individual.equals(rhs.individual))))&&((this._actualArm == rhs._actualArm)||((this._actualArm!= null)&&this._actualArm.equals(rhs._actualArm))))&&((this.actualArm == rhs.actualArm)||((this.actualArm!= null)&&this.actualArm.equals(rhs.actualArm))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.consent == rhs.consent)||((this.consent!= null)&&this.consent.equals(rhs.consent))))&&((this._assignedArm == rhs._assignedArm)||((this._assignedArm!= null)&&this._assignedArm.equals(rhs._assignedArm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.assignedArm == rhs.assignedArm)||((this.assignedArm!= null)&&this.assignedArm.equals(rhs.assignedArm))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The current state of the subject.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        CANDIDATE("candidate"),
        ELIGIBLE("eligible"),
        FOLLOW_UP("follow-up"),
        INELIGIBLE("ineligible"),
        NOT_REGISTERED("not-registered"),
        OFF_STUDY("off-study"),
        ON_STUDY("on-study"),
        ON_STUDY_INTERVENTION("on-study-intervention"),
        ON_STUDY_OBSERVATION("on-study-observation"),
        PENDING_ON_STUDY("pending-on-study"),
        POTENTIAL_CANDIDATE("potential-candidate"),
        SCREENING("screening"),
        WITHDRAWN("withdrawn");
        private final String value;
        private final static Map<String, ResearchSubject.Status> CONSTANTS = new HashMap<String, ResearchSubject.Status>();

        static {
            for (ResearchSubject.Status c: values()) {
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
        public static ResearchSubject.Status fromValue(String value) {
            ResearchSubject.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
