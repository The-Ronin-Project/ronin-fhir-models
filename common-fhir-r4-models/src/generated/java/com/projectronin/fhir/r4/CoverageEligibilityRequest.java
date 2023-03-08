
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
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "priority",
    "purpose",
    "_purpose",
    "patient",
    "servicedDate",
    "_servicedDate",
    "servicedPeriod",
    "created",
    "_created",
    "enterer",
    "provider",
    "insurer",
    "facility",
    "supportingInfo",
    "insurance",
    "item"
})
@Generated("jsonschema2pojo")
public class CoverageEligibilityRequest
    extends DomainResource
{

    /**
     * This is a CoverageEligibilityRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a CoverageEligibilityRequest resource")
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept priority;
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
    @JsonProperty("enterer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference enterer;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference provider;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference insurer;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("facility")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference facility;
    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    @JsonPropertyDescription("Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.")
    private List<CoverageEligibilityRequest_SupportingInfo> supportingInfo = new ArrayList<CoverageEligibilityRequest_SupportingInfo>();
    /**
     * Financial instruments for reimbursement for the health care products and services.
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Financial instruments for reimbursement for the health care products and services.")
    private List<CoverageEligibilityRequest_Insurance> insurance = new ArrayList<CoverageEligibilityRequest_Insurance>();
    /**
     * Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.")
    private List<CoverageEligibilityRequest_Item> item = new ArrayList<CoverageEligibilityRequest_Item>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a CoverageEligibilityRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a CoverageEligibilityRequest resource
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
    @JsonProperty("enterer")
    public Reference getEnterer() {
        return enterer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    public void setEnterer(Reference enterer) {
        this.enterer = enterer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public Reference getProvider() {
        return provider;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
        this.provider = provider;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("facility")
    public Reference getFacility() {
        return facility;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("facility")
    public void setFacility(Reference facility) {
        this.facility = facility;
    }

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    public List<CoverageEligibilityRequest_SupportingInfo> getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(List<CoverageEligibilityRequest_SupportingInfo> supportingInfo) {
        this.supportingInfo = supportingInfo;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services.
     * 
     */
    @JsonProperty("insurance")
    public List<CoverageEligibilityRequest_Insurance> getInsurance() {
        return insurance;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services.
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<CoverageEligibilityRequest_Insurance> insurance) {
        this.insurance = insurance;
    }

    /**
     * Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.
     * 
     */
    @JsonProperty("item")
    public List<CoverageEligibilityRequest_Item> getItem() {
        return item;
    }

    /**
     * Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<CoverageEligibilityRequest_Item> item) {
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
        sb.append(CoverageEligibilityRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        sb.append("enterer");
        sb.append('=');
        sb.append(((this.enterer == null)?"<null>":this.enterer));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("insurer");
        sb.append('=');
        sb.append(((this.insurer == null)?"<null>":this.insurer));
        sb.append(',');
        sb.append("facility");
        sb.append('=');
        sb.append(((this.facility == null)?"<null>":this.facility));
        sb.append(',');
        sb.append("supportingInfo");
        sb.append('=');
        sb.append(((this.supportingInfo == null)?"<null>":this.supportingInfo));
        sb.append(',');
        sb.append("insurance");
        sb.append('=');
        sb.append(((this.insurance == null)?"<null>":this.insurance));
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
        result = ((result* 31)+((this.insurance == null)? 0 :this.insurance.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.servicedPeriod == null)? 0 :this.servicedPeriod.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.supportingInfo == null)? 0 :this.supportingInfo.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.insurer == null)? 0 :this.insurer.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.enterer == null)? 0 :this.enterer.hashCode()));
        result = ((result* 31)+((this._servicedDate == null)? 0 :this._servicedDate.hashCode()));
        result = ((result* 31)+((this.servicedDate == null)? 0 :this.servicedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.facility == null)? 0 :this.facility.hashCode()));
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
        if ((other instanceof CoverageEligibilityRequest) == false) {
            return false;
        }
        CoverageEligibilityRequest rhs = ((CoverageEligibilityRequest) other);
        return (((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.servicedPeriod == rhs.servicedPeriod)||((this.servicedPeriod!= null)&&this.servicedPeriod.equals(rhs.servicedPeriod))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.supportingInfo == rhs.supportingInfo)||((this.supportingInfo!= null)&&this.supportingInfo.equals(rhs.supportingInfo))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.insurer == rhs.insurer)||((this.insurer!= null)&&this.insurer.equals(rhs.insurer))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.enterer == rhs.enterer)||((this.enterer!= null)&&this.enterer.equals(rhs.enterer))))&&((this._servicedDate == rhs._servicedDate)||((this._servicedDate!= null)&&this._servicedDate.equals(rhs._servicedDate))))&&((this.servicedDate == rhs.servicedDate)||((this.servicedDate!= null)&&this.servicedDate.equals(rhs.servicedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.facility == rhs.facility)||((this.facility!= null)&&this.facility.equals(rhs.facility))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
