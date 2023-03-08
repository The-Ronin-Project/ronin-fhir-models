
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
 * The details of a healthcare service available at a location.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "providedBy",
    "category",
    "type",
    "specialty",
    "location",
    "name",
    "_name",
    "comment",
    "_comment",
    "extraDetails",
    "_extraDetails",
    "photo",
    "telecom",
    "coverageArea",
    "serviceProvisionCode",
    "eligibility",
    "program",
    "characteristic",
    "communication",
    "referralMethod",
    "appointmentRequired",
    "_appointmentRequired",
    "availableTime",
    "notAvailable",
    "availabilityExceptions",
    "_availabilityExceptions",
    "endpoint"
})
@Generated("jsonschema2pojo")
public class HealthcareService
    extends DomainResource
{

    /**
     * This is a HealthcareService resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a HealthcareService resource")
    private String resourceType;
    /**
     * External identifiers for this item.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("External identifiers for this item.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean active;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _active;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("providedBy")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference providedBy;
    /**
     * Identifies the broad category of service being performed or delivered.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Identifies the broad category of service being performed or delivered.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * The specific type of service that may be delivered or performed.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The specific type of service that may be delivered or performed.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * Collection of specialties handled by the service site. This is more of a medical term.
     * 
     */
    @JsonProperty("specialty")
    @JsonPropertyDescription("Collection of specialties handled by the service site. This is more of a medical term.")
    private List<CodeableConcept> specialty = new ArrayList<CodeableConcept>();
    /**
     * The location(s) where this healthcare service may be provided.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location(s) where this healthcare service may be provided.")
    private List<Reference> location = new ArrayList<Reference>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String comment;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _comment;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("extraDetails")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String extraDetails;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_extraDetails")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _extraDetails;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("photo")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment photo;
    /**
     * List of contacts related to this specific healthcare service.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("List of contacts related to this specific healthcare service.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * The location(s) that this service is available to (not where the service is provided).
     * 
     */
    @JsonProperty("coverageArea")
    @JsonPropertyDescription("The location(s) that this service is available to (not where the service is provided).")
    private List<Reference> coverageArea = new ArrayList<Reference>();
    /**
     * The code(s) that detail the conditions under which the healthcare service is available/offered.
     * 
     */
    @JsonProperty("serviceProvisionCode")
    @JsonPropertyDescription("The code(s) that detail the conditions under which the healthcare service is available/offered.")
    private List<CodeableConcept> serviceProvisionCode = new ArrayList<CodeableConcept>();
    /**
     * Does this service have specific eligibility requirements that need to be met in order to use the service?
     * 
     */
    @JsonProperty("eligibility")
    @JsonPropertyDescription("Does this service have specific eligibility requirements that need to be met in order to use the service?")
    private List<HealthcareService_Eligibility> eligibility = new ArrayList<HealthcareService_Eligibility>();
    /**
     * Programs that this service is applicable to.
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Programs that this service is applicable to.")
    private List<CodeableConcept> program = new ArrayList<CodeableConcept>();
    /**
     * Collection of characteristics (attributes).
     * 
     */
    @JsonProperty("characteristic")
    @JsonPropertyDescription("Collection of characteristics (attributes).")
    private List<CodeableConcept> characteristic = new ArrayList<CodeableConcept>();
    /**
     * Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.
     * 
     */
    @JsonProperty("communication")
    @JsonPropertyDescription("Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.")
    private List<CodeableConcept> communication = new ArrayList<CodeableConcept>();
    /**
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
     * 
     */
    @JsonProperty("referralMethod")
    @JsonPropertyDescription("Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.")
    private List<CodeableConcept> referralMethod = new ArrayList<CodeableConcept>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("appointmentRequired")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean appointmentRequired;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_appointmentRequired")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _appointmentRequired;
    /**
     * A collection of times that the Service Site is available.
     * 
     */
    @JsonProperty("availableTime")
    @JsonPropertyDescription("A collection of times that the Service Site is available.")
    private List<HealthcareService_AvailableTime> availableTime = new ArrayList<HealthcareService_AvailableTime>();
    /**
     * The HealthcareService is not available during this period of time due to the provided reason.
     * 
     */
    @JsonProperty("notAvailable")
    @JsonPropertyDescription("The HealthcareService is not available during this period of time due to the provided reason.")
    private List<HealthcareService_NotAvailable> notAvailable = new ArrayList<HealthcareService_NotAvailable>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("availabilityExceptions")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String availabilityExceptions;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availabilityExceptions")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _availabilityExceptions;
    /**
     * Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a HealthcareService resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a HealthcareService resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * External identifiers for this item.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * External identifiers for this item.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    public Element get_active() {
        return _active;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    public void set_active(Element _active) {
        this._active = _active;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("providedBy")
    public Reference getProvidedBy() {
        return providedBy;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("providedBy")
    public void setProvidedBy(Reference providedBy) {
        this.providedBy = providedBy;
    }

    /**
     * Identifies the broad category of service being performed or delivered.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * Identifies the broad category of service being performed or delivered.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * The specific type of service that may be delivered or performed.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * The specific type of service that may be delivered or performed.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * Collection of specialties handled by the service site. This is more of a medical term.
     * 
     */
    @JsonProperty("specialty")
    public List<CodeableConcept> getSpecialty() {
        return specialty;
    }

    /**
     * Collection of specialties handled by the service site. This is more of a medical term.
     * 
     */
    @JsonProperty("specialty")
    public void setSpecialty(List<CodeableConcept> specialty) {
        this.specialty = specialty;
    }

    /**
     * The location(s) where this healthcare service may be provided.
     * 
     */
    @JsonProperty("location")
    public List<Reference> getLocation() {
        return location;
    }

    /**
     * The location(s) where this healthcare service may be provided.
     * 
     */
    @JsonProperty("location")
    public void setLocation(List<Reference> location) {
        this.location = location;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public Element get_comment() {
        return _comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public void set_comment(Element _comment) {
        this._comment = _comment;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("extraDetails")
    public String getExtraDetails() {
        return extraDetails;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("extraDetails")
    public void setExtraDetails(String extraDetails) {
        this.extraDetails = extraDetails;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_extraDetails")
    public Element get_extraDetails() {
        return _extraDetails;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_extraDetails")
    public void set_extraDetails(Element _extraDetails) {
        this._extraDetails = _extraDetails;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("photo")
    public Attachment getPhoto() {
        return photo;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("photo")
    public void setPhoto(Attachment photo) {
        this.photo = photo;
    }

    /**
     * List of contacts related to this specific healthcare service.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * List of contacts related to this specific healthcare service.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * The location(s) that this service is available to (not where the service is provided).
     * 
     */
    @JsonProperty("coverageArea")
    public List<Reference> getCoverageArea() {
        return coverageArea;
    }

    /**
     * The location(s) that this service is available to (not where the service is provided).
     * 
     */
    @JsonProperty("coverageArea")
    public void setCoverageArea(List<Reference> coverageArea) {
        this.coverageArea = coverageArea;
    }

    /**
     * The code(s) that detail the conditions under which the healthcare service is available/offered.
     * 
     */
    @JsonProperty("serviceProvisionCode")
    public List<CodeableConcept> getServiceProvisionCode() {
        return serviceProvisionCode;
    }

    /**
     * The code(s) that detail the conditions under which the healthcare service is available/offered.
     * 
     */
    @JsonProperty("serviceProvisionCode")
    public void setServiceProvisionCode(List<CodeableConcept> serviceProvisionCode) {
        this.serviceProvisionCode = serviceProvisionCode;
    }

    /**
     * Does this service have specific eligibility requirements that need to be met in order to use the service?
     * 
     */
    @JsonProperty("eligibility")
    public List<HealthcareService_Eligibility> getEligibility() {
        return eligibility;
    }

    /**
     * Does this service have specific eligibility requirements that need to be met in order to use the service?
     * 
     */
    @JsonProperty("eligibility")
    public void setEligibility(List<HealthcareService_Eligibility> eligibility) {
        this.eligibility = eligibility;
    }

    /**
     * Programs that this service is applicable to.
     * 
     */
    @JsonProperty("program")
    public List<CodeableConcept> getProgram() {
        return program;
    }

    /**
     * Programs that this service is applicable to.
     * 
     */
    @JsonProperty("program")
    public void setProgram(List<CodeableConcept> program) {
        this.program = program;
    }

    /**
     * Collection of characteristics (attributes).
     * 
     */
    @JsonProperty("characteristic")
    public List<CodeableConcept> getCharacteristic() {
        return characteristic;
    }

    /**
     * Collection of characteristics (attributes).
     * 
     */
    @JsonProperty("characteristic")
    public void setCharacteristic(List<CodeableConcept> characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.
     * 
     */
    @JsonProperty("communication")
    public List<CodeableConcept> getCommunication() {
        return communication;
    }

    /**
     * Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.
     * 
     */
    @JsonProperty("communication")
    public void setCommunication(List<CodeableConcept> communication) {
        this.communication = communication;
    }

    /**
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
     * 
     */
    @JsonProperty("referralMethod")
    public List<CodeableConcept> getReferralMethod() {
        return referralMethod;
    }

    /**
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
     * 
     */
    @JsonProperty("referralMethod")
    public void setReferralMethod(List<CodeableConcept> referralMethod) {
        this.referralMethod = referralMethod;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("appointmentRequired")
    public Boolean getAppointmentRequired() {
        return appointmentRequired;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("appointmentRequired")
    public void setAppointmentRequired(Boolean appointmentRequired) {
        this.appointmentRequired = appointmentRequired;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_appointmentRequired")
    public Element get_appointmentRequired() {
        return _appointmentRequired;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_appointmentRequired")
    public void set_appointmentRequired(Element _appointmentRequired) {
        this._appointmentRequired = _appointmentRequired;
    }

    /**
     * A collection of times that the Service Site is available.
     * 
     */
    @JsonProperty("availableTime")
    public List<HealthcareService_AvailableTime> getAvailableTime() {
        return availableTime;
    }

    /**
     * A collection of times that the Service Site is available.
     * 
     */
    @JsonProperty("availableTime")
    public void setAvailableTime(List<HealthcareService_AvailableTime> availableTime) {
        this.availableTime = availableTime;
    }

    /**
     * The HealthcareService is not available during this period of time due to the provided reason.
     * 
     */
    @JsonProperty("notAvailable")
    public List<HealthcareService_NotAvailable> getNotAvailable() {
        return notAvailable;
    }

    /**
     * The HealthcareService is not available during this period of time due to the provided reason.
     * 
     */
    @JsonProperty("notAvailable")
    public void setNotAvailable(List<HealthcareService_NotAvailable> notAvailable) {
        this.notAvailable = notAvailable;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("availabilityExceptions")
    public String getAvailabilityExceptions() {
        return availabilityExceptions;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("availabilityExceptions")
    public void setAvailabilityExceptions(String availabilityExceptions) {
        this.availabilityExceptions = availabilityExceptions;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availabilityExceptions")
    public Element get_availabilityExceptions() {
        return _availabilityExceptions;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availabilityExceptions")
    public void set_availabilityExceptions(Element _availabilityExceptions) {
        this._availabilityExceptions = _availabilityExceptions;
    }

    /**
     * Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(List<Reference> endpoint) {
        this.endpoint = endpoint;
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
        sb.append(HealthcareService.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("_active");
        sb.append('=');
        sb.append(((this._active == null)?"<null>":this._active));
        sb.append(',');
        sb.append("providedBy");
        sb.append('=');
        sb.append(((this.providedBy == null)?"<null>":this.providedBy));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("specialty");
        sb.append('=');
        sb.append(((this.specialty == null)?"<null>":this.specialty));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
        sb.append(',');
        sb.append("extraDetails");
        sb.append('=');
        sb.append(((this.extraDetails == null)?"<null>":this.extraDetails));
        sb.append(',');
        sb.append("_extraDetails");
        sb.append('=');
        sb.append(((this._extraDetails == null)?"<null>":this._extraDetails));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("telecom");
        sb.append('=');
        sb.append(((this.telecom == null)?"<null>":this.telecom));
        sb.append(',');
        sb.append("coverageArea");
        sb.append('=');
        sb.append(((this.coverageArea == null)?"<null>":this.coverageArea));
        sb.append(',');
        sb.append("serviceProvisionCode");
        sb.append('=');
        sb.append(((this.serviceProvisionCode == null)?"<null>":this.serviceProvisionCode));
        sb.append(',');
        sb.append("eligibility");
        sb.append('=');
        sb.append(((this.eligibility == null)?"<null>":this.eligibility));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("characteristic");
        sb.append('=');
        sb.append(((this.characteristic == null)?"<null>":this.characteristic));
        sb.append(',');
        sb.append("communication");
        sb.append('=');
        sb.append(((this.communication == null)?"<null>":this.communication));
        sb.append(',');
        sb.append("referralMethod");
        sb.append('=');
        sb.append(((this.referralMethod == null)?"<null>":this.referralMethod));
        sb.append(',');
        sb.append("appointmentRequired");
        sb.append('=');
        sb.append(((this.appointmentRequired == null)?"<null>":this.appointmentRequired));
        sb.append(',');
        sb.append("_appointmentRequired");
        sb.append('=');
        sb.append(((this._appointmentRequired == null)?"<null>":this._appointmentRequired));
        sb.append(',');
        sb.append("availableTime");
        sb.append('=');
        sb.append(((this.availableTime == null)?"<null>":this.availableTime));
        sb.append(',');
        sb.append("notAvailable");
        sb.append('=');
        sb.append(((this.notAvailable == null)?"<null>":this.notAvailable));
        sb.append(',');
        sb.append("availabilityExceptions");
        sb.append('=');
        sb.append(((this.availabilityExceptions == null)?"<null>":this.availabilityExceptions));
        sb.append(',');
        sb.append("_availabilityExceptions");
        sb.append('=');
        sb.append(((this._availabilityExceptions == null)?"<null>":this._availabilityExceptions));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
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
        result = ((result* 31)+((this.serviceProvisionCode == null)? 0 :this.serviceProvisionCode.hashCode()));
        result = ((result* 31)+((this.specialty == null)? 0 :this.specialty.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.eligibility == null)? 0 :this.eligibility.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.characteristic == null)? 0 :this.characteristic.hashCode()));
        result = ((result* 31)+((this.notAvailable == null)? 0 :this.notAvailable.hashCode()));
        result = ((result* 31)+((this.availableTime == null)? 0 :this.availableTime.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this._appointmentRequired == null)? 0 :this._appointmentRequired.hashCode()));
        result = ((result* 31)+((this.communication == null)? 0 :this.communication.hashCode()));
        result = ((result* 31)+((this.referralMethod == null)? 0 :this.referralMethod.hashCode()));
        result = ((result* 31)+((this.providedBy == null)? 0 :this.providedBy.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.appointmentRequired == null)? 0 :this.appointmentRequired.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this._availabilityExceptions == null)? 0 :this._availabilityExceptions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.extraDetails == null)? 0 :this.extraDetails.hashCode()));
        result = ((result* 31)+((this._extraDetails == null)? 0 :this._extraDetails.hashCode()));
        result = ((result* 31)+((this.availabilityExceptions == null)? 0 :this.availabilityExceptions.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.coverageArea == null)? 0 :this.coverageArea.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealthcareService) == false) {
            return false;
        }
        HealthcareService rhs = ((HealthcareService) other);
        return ((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.serviceProvisionCode == rhs.serviceProvisionCode)||((this.serviceProvisionCode!= null)&&this.serviceProvisionCode.equals(rhs.serviceProvisionCode))))&&((this.specialty == rhs.specialty)||((this.specialty!= null)&&this.specialty.equals(rhs.specialty))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.eligibility == rhs.eligibility)||((this.eligibility!= null)&&this.eligibility.equals(rhs.eligibility))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.characteristic == rhs.characteristic)||((this.characteristic!= null)&&this.characteristic.equals(rhs.characteristic))))&&((this.notAvailable == rhs.notAvailable)||((this.notAvailable!= null)&&this.notAvailable.equals(rhs.notAvailable))))&&((this.availableTime == rhs.availableTime)||((this.availableTime!= null)&&this.availableTime.equals(rhs.availableTime))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this._appointmentRequired == rhs._appointmentRequired)||((this._appointmentRequired!= null)&&this._appointmentRequired.equals(rhs._appointmentRequired))))&&((this.communication == rhs.communication)||((this.communication!= null)&&this.communication.equals(rhs.communication))))&&((this.referralMethod == rhs.referralMethod)||((this.referralMethod!= null)&&this.referralMethod.equals(rhs.referralMethod))))&&((this.providedBy == rhs.providedBy)||((this.providedBy!= null)&&this.providedBy.equals(rhs.providedBy))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.appointmentRequired == rhs.appointmentRequired)||((this.appointmentRequired!= null)&&this.appointmentRequired.equals(rhs.appointmentRequired))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this._availabilityExceptions == rhs._availabilityExceptions)||((this._availabilityExceptions!= null)&&this._availabilityExceptions.equals(rhs._availabilityExceptions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.extraDetails == rhs.extraDetails)||((this.extraDetails!= null)&&this.extraDetails.equals(rhs.extraDetails))))&&((this._extraDetails == rhs._extraDetails)||((this._extraDetails!= null)&&this._extraDetails.equals(rhs._extraDetails))))&&((this.availabilityExceptions == rhs.availabilityExceptions)||((this.availabilityExceptions!= null)&&this.availabilityExceptions.equals(rhs.availabilityExceptions))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.coverageArea == rhs.coverageArea)||((this.coverageArea!= null)&&this.coverageArea.equals(rhs.coverageArea))));
    }

}
