
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
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "purpose",
    "_purpose",
    "patient",
    "servicedDate",
    "_servicedDate",
    "servicedPeriod",
    "created",
    "_created",
    "requestor",
    "request",
    "outcome",
    "_outcome",
    "disposition",
    "_disposition",
    "insurer",
    "insurance",
    "preAuthRef",
    "_preAuthRef",
    "form",
    "error"
})
@Generated("jsonschema2pojo")
public class CoverageEligibilityResponse
    extends DomainResource
{

    /**
     * This is a CoverageEligibilityResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a CoverageEligibilityResponse resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this coverage eligiblity request.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this coverage eligiblity request.")
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
     * Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.
     * 
     */
    @JsonProperty("purpose")
    @JsonPropertyDescription("Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.")
    private List<CoverageEligibilityPurpose> purpose = new ArrayList<CoverageEligibilityPurpose>();
    /**
     * Extensions for purpose
     * 
     */
    @JsonProperty("_purpose")
    @JsonPropertyDescription("Extensions for purpose")
    private List<Element> _purpose = new ArrayList<Element>();
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * The date or dates when the enclosed suite of services were performed or completed.
     * 
     */
    @JsonProperty("servicedDate")
    @JsonPropertyDescription("The date or dates when the enclosed suite of services were performed or completed.")
    private String servicedDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_servicedDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _servicedDate;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicedPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period servicedPeriod;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String created;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _created;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestor")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requestor;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference request;
    /**
     * The outcome of the request processing.
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("The outcome of the request processing.")
    private CoverageEligibilityResponse.Outcome outcome;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _outcome;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String disposition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _disposition;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference insurer;
    /**
     * Financial instruments for reimbursement for the health care products and services.
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Financial instruments for reimbursement for the health care products and services.")
    private List<CoverageEligibilityResponse_Insurance> insurance = new ArrayList<CoverageEligibilityResponse_Insurance>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preAuthRef")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String preAuthRef;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preAuthRef")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _preAuthRef;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("form")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept form;
    /**
     * Errors encountered during the processing of the request.
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("Errors encountered during the processing of the request.")
    private List<CoverageEligibilityResponse_Error> error = new ArrayList<CoverageEligibilityResponse_Error>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a CoverageEligibilityResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a CoverageEligibilityResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this coverage eligiblity request.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this coverage eligiblity request.
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
     * Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.
     * 
     */
    @JsonProperty("purpose")
    public List<CoverageEligibilityPurpose> getPurpose() {
        return purpose;
    }

    /**
     * Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(List<CoverageEligibilityPurpose> purpose) {
        this.purpose = purpose;
    }

    /**
     * Extensions for purpose
     * 
     */
    @JsonProperty("_purpose")
    public List<Element> get_purpose() {
        return _purpose;
    }

    /**
     * Extensions for purpose
     * 
     */
    @JsonProperty("_purpose")
    public void set_purpose(List<Element> _purpose) {
        this._purpose = _purpose;
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
     * The date or dates when the enclosed suite of services were performed or completed.
     * 
     */
    @JsonProperty("servicedDate")
    public String getServicedDate() {
        return servicedDate;
    }

    /**
     * The date or dates when the enclosed suite of services were performed or completed.
     * 
     */
    @JsonProperty("servicedDate")
    public void setServicedDate(String servicedDate) {
        this.servicedDate = servicedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_servicedDate")
    public Element get_servicedDate() {
        return _servicedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_servicedDate")
    public void set_servicedDate(Element _servicedDate) {
        this._servicedDate = _servicedDate;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicedPeriod")
    public Period getServicedPeriod() {
        return servicedPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Period servicedPeriod) {
        this.servicedPeriod = servicedPeriod;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public Element get_created() {
        return _created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public void set_created(Element _created) {
        this._created = _created;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestor")
    public Reference getRequestor() {
        return requestor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestor")
    public void setRequestor(Reference requestor) {
        this.requestor = requestor;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("request")
    public Reference getRequest() {
        return request;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("request")
    public void setRequest(Reference request) {
        this.request = request;
    }

    /**
     * The outcome of the request processing.
     * 
     */
    @JsonProperty("outcome")
    public CoverageEligibilityResponse.Outcome getOutcome() {
        return outcome;
    }

    /**
     * The outcome of the request processing.
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(CoverageEligibilityResponse.Outcome outcome) {
        this.outcome = outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public Element get_outcome() {
        return _outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public void set_outcome(Element _outcome) {
        this._outcome = _outcome;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    public String getDisposition() {
        return disposition;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public Element get_disposition() {
        return _disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public void set_disposition(Element _disposition) {
        this._disposition = _disposition;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    public Reference getInsurer() {
        return insurer;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    public void setInsurer(Reference insurer) {
        this.insurer = insurer;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services.
     * 
     */
    @JsonProperty("insurance")
    public List<CoverageEligibilityResponse_Insurance> getInsurance() {
        return insurance;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services.
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<CoverageEligibilityResponse_Insurance> insurance) {
        this.insurance = insurance;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preAuthRef")
    public String getPreAuthRef() {
        return preAuthRef;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(String preAuthRef) {
        this.preAuthRef = preAuthRef;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preAuthRef")
    public Element get_preAuthRef() {
        return _preAuthRef;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preAuthRef")
    public void set_preAuthRef(Element _preAuthRef) {
        this._preAuthRef = _preAuthRef;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("form")
    public CodeableConcept getForm() {
        return form;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("form")
    public void setForm(CodeableConcept form) {
        this.form = form;
    }

    /**
     * Errors encountered during the processing of the request.
     * 
     */
    @JsonProperty("error")
    public List<CoverageEligibilityResponse_Error> getError() {
        return error;
    }

    /**
     * Errors encountered during the processing of the request.
     * 
     */
    @JsonProperty("error")
    public void setError(List<CoverageEligibilityResponse_Error> error) {
        this.error = error;
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
        sb.append(CoverageEligibilityResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("_purpose");
        sb.append('=');
        sb.append(((this._purpose == null)?"<null>":this._purpose));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("servicedDate");
        sb.append('=');
        sb.append(((this.servicedDate == null)?"<null>":this.servicedDate));
        sb.append(',');
        sb.append("_servicedDate");
        sb.append('=');
        sb.append(((this._servicedDate == null)?"<null>":this._servicedDate));
        sb.append(',');
        sb.append("servicedPeriod");
        sb.append('=');
        sb.append(((this.servicedPeriod == null)?"<null>":this.servicedPeriod));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("requestor");
        sb.append('=');
        sb.append(((this.requestor == null)?"<null>":this.requestor));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("_outcome");
        sb.append('=');
        sb.append(((this._outcome == null)?"<null>":this._outcome));
        sb.append(',');
        sb.append("disposition");
        sb.append('=');
        sb.append(((this.disposition == null)?"<null>":this.disposition));
        sb.append(',');
        sb.append("_disposition");
        sb.append('=');
        sb.append(((this._disposition == null)?"<null>":this._disposition));
        sb.append(',');
        sb.append("insurer");
        sb.append('=');
        sb.append(((this.insurer == null)?"<null>":this.insurer));
        sb.append(',');
        sb.append("insurance");
        sb.append('=');
        sb.append(((this.insurance == null)?"<null>":this.insurance));
        sb.append(',');
        sb.append("preAuthRef");
        sb.append('=');
        sb.append(((this.preAuthRef == null)?"<null>":this.preAuthRef));
        sb.append(',');
        sb.append("_preAuthRef");
        sb.append('=');
        sb.append(((this._preAuthRef == null)?"<null>":this._preAuthRef));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
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
        result = ((result* 31)+((this.insurance == null)? 0 :this.insurance.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this._outcome == null)? 0 :this._outcome.hashCode()));
        result = ((result* 31)+((this.preAuthRef == null)? 0 :this.preAuthRef.hashCode()));
        result = ((result* 31)+((this._disposition == null)? 0 :this._disposition.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.servicedPeriod == null)? 0 :this.servicedPeriod.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.insurer == null)? 0 :this.insurer.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.requestor == null)? 0 :this.requestor.hashCode()));
        result = ((result* 31)+((this.disposition == null)? 0 :this.disposition.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this._preAuthRef == null)? 0 :this._preAuthRef.hashCode()));
        result = ((result* 31)+((this._servicedDate == null)? 0 :this._servicedDate.hashCode()));
        result = ((result* 31)+((this.servicedDate == null)? 0 :this.servicedDate.hashCode()));
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
        if ((other instanceof CoverageEligibilityResponse) == false) {
            return false;
        }
        CoverageEligibilityResponse rhs = ((CoverageEligibilityResponse) other);
        return (((((((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this._outcome == rhs._outcome)||((this._outcome!= null)&&this._outcome.equals(rhs._outcome))))&&((this.preAuthRef == rhs.preAuthRef)||((this.preAuthRef!= null)&&this.preAuthRef.equals(rhs.preAuthRef))))&&((this._disposition == rhs._disposition)||((this._disposition!= null)&&this._disposition.equals(rhs._disposition))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.servicedPeriod == rhs.servicedPeriod)||((this.servicedPeriod!= null)&&this.servicedPeriod.equals(rhs.servicedPeriod))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.insurer == rhs.insurer)||((this.insurer!= null)&&this.insurer.equals(rhs.insurer))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.requestor == rhs.requestor)||((this.requestor!= null)&&this.requestor.equals(rhs.requestor))))&&((this.disposition == rhs.disposition)||((this.disposition!= null)&&this.disposition.equals(rhs.disposition))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this._preAuthRef == rhs._preAuthRef)||((this._preAuthRef!= null)&&this._preAuthRef.equals(rhs._preAuthRef))))&&((this._servicedDate == rhs._servicedDate)||((this._servicedDate!= null)&&this._servicedDate.equals(rhs._servicedDate))))&&((this.servicedDate == rhs.servicedDate)||((this.servicedDate!= null)&&this.servicedDate.equals(rhs.servicedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The outcome of the request processing.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Outcome {

        QUEUED("queued"),
        COMPLETE("complete"),
        ERROR("error"),
        PARTIAL("partial");
        private final String value;
        private final static Map<String, CoverageEligibilityResponse.Outcome> CONSTANTS = new HashMap<String, CoverageEligibilityResponse.Outcome>();

        static {
            for (CoverageEligibilityResponse.Outcome c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Outcome(String value) {
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
        public static CoverageEligibilityResponse.Outcome fromValue(String value) {
            CoverageEligibilityResponse.Outcome constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
