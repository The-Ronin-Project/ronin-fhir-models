
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
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "period",
    "practitioner",
    "organization",
    "code",
    "specialty",
    "location",
    "healthcareService",
    "telecom",
    "availableTime",
    "notAvailable",
    "availabilityExceptions",
    "_availabilityExceptions",
    "endpoint"
})
@Generated("jsonschema2pojo")
public class PractitionerRole
    extends DomainResource
{

    /**
     * This is a PractitionerRole resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a PractitionerRole resource")
    private String resourceType;
    /**
     * Business Identifiers that are specific to a role/location.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business Identifiers that are specific to a role/location.")
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("practitioner")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference practitioner;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference organization;
    /**
     * Roles which this practitioner is authorized to perform for the organization.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Roles which this practitioner is authorized to perform for the organization.")
    private List<CodeableConcept> code = new ArrayList<CodeableConcept>();
    /**
     * Specific specialty of the practitioner.
     * 
     */
    @JsonProperty("specialty")
    @JsonPropertyDescription("Specific specialty of the practitioner.")
    private List<CodeableConcept> specialty = new ArrayList<CodeableConcept>();
    /**
     * The location(s) at which this practitioner provides care.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location(s) at which this practitioner provides care.")
    private List<Reference> location = new ArrayList<Reference>();
    /**
     * The list of healthcare services that this worker provides for this role's Organization/Location(s).
     * 
     */
    @JsonProperty("healthcareService")
    @JsonPropertyDescription("The list of healthcare services that this worker provides for this role's Organization/Location(s).")
    private List<Reference> healthcareService = new ArrayList<Reference>();
    /**
     * Contact details that are specific to the role/location/service.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("Contact details that are specific to the role/location/service.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.
     * 
     */
    @JsonProperty("availableTime")
    @JsonPropertyDescription("A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.")
    private List<PractitionerRole_AvailableTime> availableTime = new ArrayList<PractitionerRole_AvailableTime>();
    /**
     * The practitioner is not available or performing this role during this period of time due to the provided reason.
     * 
     */
    @JsonProperty("notAvailable")
    @JsonPropertyDescription("The practitioner is not available or performing this role during this period of time due to the provided reason.")
    private List<PractitionerRole_NotAvailable> notAvailable = new ArrayList<PractitionerRole_NotAvailable>();
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
     * Technical endpoints providing access to services operated for the practitioner with this role.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("Technical endpoints providing access to services operated for the practitioner with this role.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a PractitionerRole resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a PractitionerRole resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business Identifiers that are specific to a role/location.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business Identifiers that are specific to a role/location.
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
     * 
     */
    @JsonProperty("practitioner")
    public Reference getPractitioner() {
        return practitioner;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("practitioner")
    public void setPractitioner(Reference practitioner) {
        this.practitioner = practitioner;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    public Reference getOrganization() {
        return organization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(Reference organization) {
        this.organization = organization;
    }

    /**
     * Roles which this practitioner is authorized to perform for the organization.
     * 
     */
    @JsonProperty("code")
    public List<CodeableConcept> getCode() {
        return code;
    }

    /**
     * Roles which this practitioner is authorized to perform for the organization.
     * 
     */
    @JsonProperty("code")
    public void setCode(List<CodeableConcept> code) {
        this.code = code;
    }

    /**
     * Specific specialty of the practitioner.
     * 
     */
    @JsonProperty("specialty")
    public List<CodeableConcept> getSpecialty() {
        return specialty;
    }

    /**
     * Specific specialty of the practitioner.
     * 
     */
    @JsonProperty("specialty")
    public void setSpecialty(List<CodeableConcept> specialty) {
        this.specialty = specialty;
    }

    /**
     * The location(s) at which this practitioner provides care.
     * 
     */
    @JsonProperty("location")
    public List<Reference> getLocation() {
        return location;
    }

    /**
     * The location(s) at which this practitioner provides care.
     * 
     */
    @JsonProperty("location")
    public void setLocation(List<Reference> location) {
        this.location = location;
    }

    /**
     * The list of healthcare services that this worker provides for this role's Organization/Location(s).
     * 
     */
    @JsonProperty("healthcareService")
    public List<Reference> getHealthcareService() {
        return healthcareService;
    }

    /**
     * The list of healthcare services that this worker provides for this role's Organization/Location(s).
     * 
     */
    @JsonProperty("healthcareService")
    public void setHealthcareService(List<Reference> healthcareService) {
        this.healthcareService = healthcareService;
    }

    /**
     * Contact details that are specific to the role/location/service.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * Contact details that are specific to the role/location/service.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.
     * 
     */
    @JsonProperty("availableTime")
    public List<PractitionerRole_AvailableTime> getAvailableTime() {
        return availableTime;
    }

    /**
     * A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.
     * 
     */
    @JsonProperty("availableTime")
    public void setAvailableTime(List<PractitionerRole_AvailableTime> availableTime) {
        this.availableTime = availableTime;
    }

    /**
     * The practitioner is not available or performing this role during this period of time due to the provided reason.
     * 
     */
    @JsonProperty("notAvailable")
    public List<PractitionerRole_NotAvailable> getNotAvailable() {
        return notAvailable;
    }

    /**
     * The practitioner is not available or performing this role during this period of time due to the provided reason.
     * 
     */
    @JsonProperty("notAvailable")
    public void setNotAvailable(List<PractitionerRole_NotAvailable> notAvailable) {
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
     * Technical endpoints providing access to services operated for the practitioner with this role.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * Technical endpoints providing access to services operated for the practitioner with this role.
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
        sb.append(PractitionerRole.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("practitioner");
        sb.append('=');
        sb.append(((this.practitioner == null)?"<null>":this.practitioner));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("specialty");
        sb.append('=');
        sb.append(((this.specialty == null)?"<null>":this.specialty));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("healthcareService");
        sb.append('=');
        sb.append(((this.healthcareService == null)?"<null>":this.healthcareService));
        sb.append(',');
        sb.append("telecom");
        sb.append('=');
        sb.append(((this.telecom == null)?"<null>":this.telecom));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.specialty == null)? 0 :this.specialty.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.practitioner == null)? 0 :this.practitioner.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.notAvailable == null)? 0 :this.notAvailable.hashCode()));
        result = ((result* 31)+((this.availableTime == null)? 0 :this.availableTime.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this.healthcareService == null)? 0 :this.healthcareService.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this._availabilityExceptions == null)? 0 :this._availabilityExceptions.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.availabilityExceptions == null)? 0 :this.availabilityExceptions.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PractitionerRole) == false) {
            return false;
        }
        PractitionerRole rhs = ((PractitionerRole) other);
        return ((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.specialty == rhs.specialty)||((this.specialty!= null)&&this.specialty.equals(rhs.specialty))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.practitioner == rhs.practitioner)||((this.practitioner!= null)&&this.practitioner.equals(rhs.practitioner))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.notAvailable == rhs.notAvailable)||((this.notAvailable!= null)&&this.notAvailable.equals(rhs.notAvailable))))&&((this.availableTime == rhs.availableTime)||((this.availableTime!= null)&&this.availableTime.equals(rhs.availableTime))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this.healthcareService == rhs.healthcareService)||((this.healthcareService!= null)&&this.healthcareService.equals(rhs.healthcareService))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this._availabilityExceptions == rhs._availabilityExceptions)||((this._availabilityExceptions!= null)&&this._availabilityExceptions.equals(rhs._availabilityExceptions))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.availabilityExceptions == rhs.availabilityExceptions)||((this.availabilityExceptions!= null)&&this.availabilityExceptions.equals(rhs.availabilityExceptions))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
