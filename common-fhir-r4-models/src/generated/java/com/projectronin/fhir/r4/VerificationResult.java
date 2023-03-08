
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
 * Describes validation requirements, source(s), status and dates for one or more elements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "target",
    "targetLocation",
    "_targetLocation",
    "need",
    "status",
    "_status",
    "statusDate",
    "_statusDate",
    "validationType",
    "validationProcess",
    "frequency",
    "lastPerformed",
    "_lastPerformed",
    "nextScheduled",
    "_nextScheduled",
    "failureAction",
    "primarySource",
    "attestation",
    "validator"
})
@Generated("jsonschema2pojo")
public class VerificationResult
    extends DomainResource
{

    /**
     * This is a VerificationResult resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a VerificationResult resource")
    private String resourceType;
    /**
     * A resource that was validated.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("A resource that was validated.")
    private List<Reference> target = new ArrayList<Reference>();
    /**
     * The fhirpath location(s) within the resource that was validated.
     * 
     */
    @JsonProperty("targetLocation")
    @JsonPropertyDescription("The fhirpath location(s) within the resource that was validated.")
    private List<String> targetLocation = new ArrayList<String>();
    /**
     * Extensions for targetLocation
     * 
     */
    @JsonProperty("_targetLocation")
    @JsonPropertyDescription("Extensions for targetLocation")
    private List<Element> _targetLocation = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("need")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept need;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String statusDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _statusDate;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("validationType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept validationType;
    /**
     * The primary process by which the target is validated (edit check; value set; primary source; multiple sources; standalone; in context).
     * 
     */
    @JsonProperty("validationProcess")
    @JsonPropertyDescription("The primary process by which the target is validated (edit check; value set; primary source; multiple sources; standalone; in context).")
    private List<CodeableConcept> validationProcess = new ArrayList<CodeableConcept>();
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("frequency")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing frequency;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastPerformed")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String lastPerformed;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastPerformed")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lastPerformed;
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("nextScheduled")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String nextScheduled;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nextScheduled")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _nextScheduled;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("failureAction")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept failureAction;
    /**
     * Information about the primary source(s) involved in validation.
     * 
     */
    @JsonProperty("primarySource")
    @JsonPropertyDescription("Information about the primary source(s) involved in validation.")
    private List<VerificationResult_PrimarySource> primarySource = new ArrayList<VerificationResult_PrimarySource>();
    /**
     * Describes validation requirements, source(s), status and dates for one or more elements.
     * 
     */
    @JsonProperty("attestation")
    @JsonPropertyDescription("Describes validation requirements, source(s), status and dates for one or more elements.")
    private VerificationResult_Attestation attestation;
    /**
     * Information about the entity validating information.
     * 
     */
    @JsonProperty("validator")
    @JsonPropertyDescription("Information about the entity validating information.")
    private List<VerificationResult_Validator> validator = new ArrayList<VerificationResult_Validator>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a VerificationResult resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a VerificationResult resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A resource that was validated.
     * 
     */
    @JsonProperty("target")
    public List<Reference> getTarget() {
        return target;
    }

    /**
     * A resource that was validated.
     * 
     */
    @JsonProperty("target")
    public void setTarget(List<Reference> target) {
        this.target = target;
    }

    /**
     * The fhirpath location(s) within the resource that was validated.
     * 
     */
    @JsonProperty("targetLocation")
    public List<String> getTargetLocation() {
        return targetLocation;
    }

    /**
     * The fhirpath location(s) within the resource that was validated.
     * 
     */
    @JsonProperty("targetLocation")
    public void setTargetLocation(List<String> targetLocation) {
        this.targetLocation = targetLocation;
    }

    /**
     * Extensions for targetLocation
     * 
     */
    @JsonProperty("_targetLocation")
    public List<Element> get_targetLocation() {
        return _targetLocation;
    }

    /**
     * Extensions for targetLocation
     * 
     */
    @JsonProperty("_targetLocation")
    public void set_targetLocation(List<Element> _targetLocation) {
        this._targetLocation = _targetLocation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("need")
    public CodeableConcept getNeed() {
        return need;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("need")
    public void setNeed(CodeableConcept need) {
        this.need = need;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    public String getStatusDate() {
        return statusDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("validationType")
    public CodeableConcept getValidationType() {
        return validationType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("validationType")
    public void setValidationType(CodeableConcept validationType) {
        this.validationType = validationType;
    }

    /**
     * The primary process by which the target is validated (edit check; value set; primary source; multiple sources; standalone; in context).
     * 
     */
    @JsonProperty("validationProcess")
    public List<CodeableConcept> getValidationProcess() {
        return validationProcess;
    }

    /**
     * The primary process by which the target is validated (edit check; value set; primary source; multiple sources; standalone; in context).
     * 
     */
    @JsonProperty("validationProcess")
    public void setValidationProcess(List<CodeableConcept> validationProcess) {
        this.validationProcess = validationProcess;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("frequency")
    public Timing getFrequency() {
        return frequency;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("frequency")
    public void setFrequency(Timing frequency) {
        this.frequency = frequency;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastPerformed")
    public String getLastPerformed() {
        return lastPerformed;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastPerformed")
    public void setLastPerformed(String lastPerformed) {
        this.lastPerformed = lastPerformed;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastPerformed")
    public Element get_lastPerformed() {
        return _lastPerformed;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastPerformed")
    public void set_lastPerformed(Element _lastPerformed) {
        this._lastPerformed = _lastPerformed;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("nextScheduled")
    public String getNextScheduled() {
        return nextScheduled;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("nextScheduled")
    public void setNextScheduled(String nextScheduled) {
        this.nextScheduled = nextScheduled;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nextScheduled")
    public Element get_nextScheduled() {
        return _nextScheduled;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nextScheduled")
    public void set_nextScheduled(Element _nextScheduled) {
        this._nextScheduled = _nextScheduled;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("failureAction")
    public CodeableConcept getFailureAction() {
        return failureAction;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("failureAction")
    public void setFailureAction(CodeableConcept failureAction) {
        this.failureAction = failureAction;
    }

    /**
     * Information about the primary source(s) involved in validation.
     * 
     */
    @JsonProperty("primarySource")
    public List<VerificationResult_PrimarySource> getPrimarySource() {
        return primarySource;
    }

    /**
     * Information about the primary source(s) involved in validation.
     * 
     */
    @JsonProperty("primarySource")
    public void setPrimarySource(List<VerificationResult_PrimarySource> primarySource) {
        this.primarySource = primarySource;
    }

    /**
     * Describes validation requirements, source(s), status and dates for one or more elements.
     * 
     */
    @JsonProperty("attestation")
    public VerificationResult_Attestation getAttestation() {
        return attestation;
    }

    /**
     * Describes validation requirements, source(s), status and dates for one or more elements.
     * 
     */
    @JsonProperty("attestation")
    public void setAttestation(VerificationResult_Attestation attestation) {
        this.attestation = attestation;
    }

    /**
     * Information about the entity validating information.
     * 
     */
    @JsonProperty("validator")
    public List<VerificationResult_Validator> getValidator() {
        return validator;
    }

    /**
     * Information about the entity validating information.
     * 
     */
    @JsonProperty("validator")
    public void setValidator(List<VerificationResult_Validator> validator) {
        this.validator = validator;
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
        sb.append(VerificationResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("targetLocation");
        sb.append('=');
        sb.append(((this.targetLocation == null)?"<null>":this.targetLocation));
        sb.append(',');
        sb.append("_targetLocation");
        sb.append('=');
        sb.append(((this._targetLocation == null)?"<null>":this._targetLocation));
        sb.append(',');
        sb.append("need");
        sb.append('=');
        sb.append(((this.need == null)?"<null>":this.need));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("_statusDate");
        sb.append('=');
        sb.append(((this._statusDate == null)?"<null>":this._statusDate));
        sb.append(',');
        sb.append("validationType");
        sb.append('=');
        sb.append(((this.validationType == null)?"<null>":this.validationType));
        sb.append(',');
        sb.append("validationProcess");
        sb.append('=');
        sb.append(((this.validationProcess == null)?"<null>":this.validationProcess));
        sb.append(',');
        sb.append("frequency");
        sb.append('=');
        sb.append(((this.frequency == null)?"<null>":this.frequency));
        sb.append(',');
        sb.append("lastPerformed");
        sb.append('=');
        sb.append(((this.lastPerformed == null)?"<null>":this.lastPerformed));
        sb.append(',');
        sb.append("_lastPerformed");
        sb.append('=');
        sb.append(((this._lastPerformed == null)?"<null>":this._lastPerformed));
        sb.append(',');
        sb.append("nextScheduled");
        sb.append('=');
        sb.append(((this.nextScheduled == null)?"<null>":this.nextScheduled));
        sb.append(',');
        sb.append("_nextScheduled");
        sb.append('=');
        sb.append(((this._nextScheduled == null)?"<null>":this._nextScheduled));
        sb.append(',');
        sb.append("failureAction");
        sb.append('=');
        sb.append(((this.failureAction == null)?"<null>":this.failureAction));
        sb.append(',');
        sb.append("primarySource");
        sb.append('=');
        sb.append(((this.primarySource == null)?"<null>":this.primarySource));
        sb.append(',');
        sb.append("attestation");
        sb.append('=');
        sb.append(((this.attestation == null)?"<null>":this.attestation));
        sb.append(',');
        sb.append("validator");
        sb.append('=');
        sb.append(((this.validator == null)?"<null>":this.validator));
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
        result = ((result* 31)+((this.nextScheduled == null)? 0 :this.nextScheduled.hashCode()));
        result = ((result* 31)+((this.primarySource == null)? 0 :this.primarySource.hashCode()));
        result = ((result* 31)+((this.failureAction == null)? 0 :this.failureAction.hashCode()));
        result = ((result* 31)+((this.attestation == null)? 0 :this.attestation.hashCode()));
        result = ((result* 31)+((this.need == null)? 0 :this.need.hashCode()));
        result = ((result* 31)+((this.validationType == null)? 0 :this.validationType.hashCode()));
        result = ((result* 31)+((this.validator == null)? 0 :this.validator.hashCode()));
        result = ((result* 31)+((this.targetLocation == null)? 0 :this.targetLocation.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._lastPerformed == null)? 0 :this._lastPerformed.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this.frequency == null)? 0 :this.frequency.hashCode()));
        result = ((result* 31)+((this._nextScheduled == null)? 0 :this._nextScheduled.hashCode()));
        result = ((result* 31)+((this._targetLocation == null)? 0 :this._targetLocation.hashCode()));
        result = ((result* 31)+((this.lastPerformed == null)? 0 :this.lastPerformed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.validationProcess == null)? 0 :this.validationProcess.hashCode()));
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
        if ((other instanceof VerificationResult) == false) {
            return false;
        }
        VerificationResult rhs = ((VerificationResult) other);
        return (((((((((((((((((((((super.equals(rhs)&&((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate))))&&((this._statusDate == rhs._statusDate)||((this._statusDate!= null)&&this._statusDate.equals(rhs._statusDate))))&&((this.nextScheduled == rhs.nextScheduled)||((this.nextScheduled!= null)&&this.nextScheduled.equals(rhs.nextScheduled))))&&((this.primarySource == rhs.primarySource)||((this.primarySource!= null)&&this.primarySource.equals(rhs.primarySource))))&&((this.failureAction == rhs.failureAction)||((this.failureAction!= null)&&this.failureAction.equals(rhs.failureAction))))&&((this.attestation == rhs.attestation)||((this.attestation!= null)&&this.attestation.equals(rhs.attestation))))&&((this.need == rhs.need)||((this.need!= null)&&this.need.equals(rhs.need))))&&((this.validationType == rhs.validationType)||((this.validationType!= null)&&this.validationType.equals(rhs.validationType))))&&((this.validator == rhs.validator)||((this.validator!= null)&&this.validator.equals(rhs.validator))))&&((this.targetLocation == rhs.targetLocation)||((this.targetLocation!= null)&&this.targetLocation.equals(rhs.targetLocation))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._lastPerformed == rhs._lastPerformed)||((this._lastPerformed!= null)&&this._lastPerformed.equals(rhs._lastPerformed))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this.frequency == rhs.frequency)||((this.frequency!= null)&&this.frequency.equals(rhs.frequency))))&&((this._nextScheduled == rhs._nextScheduled)||((this._nextScheduled!= null)&&this._nextScheduled.equals(rhs._nextScheduled))))&&((this._targetLocation == rhs._targetLocation)||((this._targetLocation!= null)&&this._targetLocation.equals(rhs._targetLocation))))&&((this.lastPerformed == rhs.lastPerformed)||((this.lastPerformed!= null)&&this.lastPerformed.equals(rhs.lastPerformed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.validationProcess == rhs.validationProcess)||((this.validationProcess!= null)&&this.validationProcess.equals(rhs.validationProcess))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
