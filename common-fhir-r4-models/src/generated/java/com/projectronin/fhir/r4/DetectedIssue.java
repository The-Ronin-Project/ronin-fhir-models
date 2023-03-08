
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
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "code",
    "severity",
    "_severity",
    "patient",
    "identifiedDateTime",
    "_identifiedDateTime",
    "identifiedPeriod",
    "author",
    "implicated",
    "evidence",
    "detail",
    "_detail",
    "reference",
    "_reference",
    "mitigation"
})
@Generated("jsonschema2pojo")
public class DetectedIssue
    extends DomainResource
{

    /**
     * This is a DetectedIssue resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a DetectedIssue resource")
    private String resourceType;
    /**
     * Business identifier associated with the detected issue record.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifier associated with the detected issue record.")
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.")
    private DetectedIssue.Severity severity;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _severity;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * The date or period when the detected issue was initially identified.
     * 
     */
    @JsonProperty("identifiedDateTime")
    @JsonPropertyDescription("The date or period when the detected issue was initially identified.")
    private String identifiedDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_identifiedDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _identifiedDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("identifiedPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period identifiedPeriod;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference author;
    /**
     * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
     * 
     */
    @JsonProperty("implicated")
    @JsonPropertyDescription("Indicates the resource representing the current activity or proposed activity that is potentially problematic.")
    private List<Reference> implicated = new ArrayList<Reference>();
    /**
     * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.
     * 
     */
    @JsonProperty("evidence")
    @JsonPropertyDescription("Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.")
    private List<DetectedIssue_Evidence> evidence = new ArrayList<DetectedIssue_Evidence>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String detail;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detail")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _detail;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String reference;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reference")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _reference;
    /**
     * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
     * 
     */
    @JsonProperty("mitigation")
    @JsonPropertyDescription("Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.")
    private List<DetectedIssue_Mitigation> mitigation = new ArrayList<DetectedIssue_Mitigation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a DetectedIssue resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a DetectedIssue resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifier associated with the detected issue record.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifier associated with the detected issue record.
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
     * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     * 
     */
    @JsonProperty("severity")
    public DetectedIssue.Severity getSeverity() {
        return severity;
    }

    /**
     * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(DetectedIssue.Severity severity) {
        this.severity = severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public Element get_severity() {
        return _severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public void set_severity(Element _severity) {
        this._severity = _severity;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
    }

    /**
     * The date or period when the detected issue was initially identified.
     * 
     */
    @JsonProperty("identifiedDateTime")
    public String getIdentifiedDateTime() {
        return identifiedDateTime;
    }

    /**
     * The date or period when the detected issue was initially identified.
     * 
     */
    @JsonProperty("identifiedDateTime")
    public void setIdentifiedDateTime(String identifiedDateTime) {
        this.identifiedDateTime = identifiedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_identifiedDateTime")
    public Element get_identifiedDateTime() {
        return _identifiedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_identifiedDateTime")
    public void set_identifiedDateTime(Element _identifiedDateTime) {
        this._identifiedDateTime = _identifiedDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("identifiedPeriod")
    public Period getIdentifiedPeriod() {
        return identifiedPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("identifiedPeriod")
    public void setIdentifiedPeriod(Period identifiedPeriod) {
        this.identifiedPeriod = identifiedPeriod;
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
     * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
     * 
     */
    @JsonProperty("implicated")
    public List<Reference> getImplicated() {
        return implicated;
    }

    /**
     * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
     * 
     */
    @JsonProperty("implicated")
    public void setImplicated(List<Reference> implicated) {
        this.implicated = implicated;
    }

    /**
     * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.
     * 
     */
    @JsonProperty("evidence")
    public List<DetectedIssue_Evidence> getEvidence() {
        return evidence;
    }

    /**
     * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.
     * 
     */
    @JsonProperty("evidence")
    public void setEvidence(List<DetectedIssue_Evidence> evidence) {
        this.evidence = evidence;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detail")
    public Element get_detail() {
        return _detail;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detail")
    public void set_detail(Element _detail) {
        this._detail = _detail;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reference")
    public Element get_reference() {
        return _reference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reference")
    public void set_reference(Element _reference) {
        this._reference = _reference;
    }

    /**
     * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
     * 
     */
    @JsonProperty("mitigation")
    public List<DetectedIssue_Mitigation> getMitigation() {
        return mitigation;
    }

    /**
     * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
     * 
     */
    @JsonProperty("mitigation")
    public void setMitigation(List<DetectedIssue_Mitigation> mitigation) {
        this.mitigation = mitigation;
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
        sb.append(DetectedIssue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("_severity");
        sb.append('=');
        sb.append(((this._severity == null)?"<null>":this._severity));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("identifiedDateTime");
        sb.append('=');
        sb.append(((this.identifiedDateTime == null)?"<null>":this.identifiedDateTime));
        sb.append(',');
        sb.append("_identifiedDateTime");
        sb.append('=');
        sb.append(((this._identifiedDateTime == null)?"<null>":this._identifiedDateTime));
        sb.append(',');
        sb.append("identifiedPeriod");
        sb.append('=');
        sb.append(((this.identifiedPeriod == null)?"<null>":this.identifiedPeriod));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("implicated");
        sb.append('=');
        sb.append(((this.implicated == null)?"<null>":this.implicated));
        sb.append(',');
        sb.append("evidence");
        sb.append('=');
        sb.append(((this.evidence == null)?"<null>":this.evidence));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("_detail");
        sb.append('=');
        sb.append(((this._detail == null)?"<null>":this._detail));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("_reference");
        sb.append('=');
        sb.append(((this._reference == null)?"<null>":this._reference));
        sb.append(',');
        sb.append("mitigation");
        sb.append('=');
        sb.append(((this.mitigation == null)?"<null>":this.mitigation));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.mitigation == null)? 0 :this.mitigation.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.evidence == null)? 0 :this.evidence.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this._detail == null)? 0 :this._detail.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._identifiedDateTime == null)? 0 :this._identifiedDateTime.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this._reference == null)? 0 :this._reference.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.identifiedDateTime == null)? 0 :this.identifiedDateTime.hashCode()));
        result = ((result* 31)+((this.identifiedPeriod == null)? 0 :this.identifiedPeriod.hashCode()));
        result = ((result* 31)+((this.implicated == null)? 0 :this.implicated.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._severity == null)? 0 :this._severity.hashCode()));
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
        if ((other instanceof DetectedIssue) == false) {
            return false;
        }
        DetectedIssue rhs = ((DetectedIssue) other);
        return ((((((((((((((((((((super.equals(rhs)&&((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.mitigation == rhs.mitigation)||((this.mitigation!= null)&&this.mitigation.equals(rhs.mitigation))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.evidence == rhs.evidence)||((this.evidence!= null)&&this.evidence.equals(rhs.evidence))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this._detail == rhs._detail)||((this._detail!= null)&&this._detail.equals(rhs._detail))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._identifiedDateTime == rhs._identifiedDateTime)||((this._identifiedDateTime!= null)&&this._identifiedDateTime.equals(rhs._identifiedDateTime))))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this._reference == rhs._reference)||((this._reference!= null)&&this._reference.equals(rhs._reference))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.identifiedDateTime == rhs.identifiedDateTime)||((this.identifiedDateTime!= null)&&this.identifiedDateTime.equals(rhs.identifiedDateTime))))&&((this.identifiedPeriod == rhs.identifiedPeriod)||((this.identifiedPeriod!= null)&&this.identifiedPeriod.equals(rhs.identifiedPeriod))))&&((this.implicated == rhs.implicated)||((this.implicated!= null)&&this.implicated.equals(rhs.implicated))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._severity == rhs._severity)||((this._severity!= null)&&this._severity.equals(rhs._severity))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Severity {

        HIGH("high"),
        MODERATE("moderate"),
        LOW("low");
        private final String value;
        private final static Map<String, DetectedIssue.Severity> CONSTANTS = new HashMap<String, DetectedIssue.Severity>();

        static {
            for (DetectedIssue.Severity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Severity(String value) {
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
        public static DetectedIssue.Severity fromValue(String value) {
            DetectedIssue.Severity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
