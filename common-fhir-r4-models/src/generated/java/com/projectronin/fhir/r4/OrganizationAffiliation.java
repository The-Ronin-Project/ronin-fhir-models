
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
 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "period",
    "organization",
    "participatingOrganization",
    "network",
    "code",
    "specialty",
    "location",
    "healthcareService",
    "telecom",
    "endpoint"
})
@Generated("jsonschema2pojo")
public class OrganizationAffiliation
    extends DomainResource
{

    /**
     * This is a OrganizationAffiliation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a OrganizationAffiliation resource")
    private String resourceType;
    /**
     * Business identifiers that are specific to this role.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers that are specific to this role.")
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
    @JsonProperty("organization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference organization;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("participatingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference participatingOrganization;
    /**
     * Health insurance provider network in which the participatingOrganization provides the role's services (if defined) at the indicated locations (if defined).
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("Health insurance provider network in which the participatingOrganization provides the role's services (if defined) at the indicated locations (if defined).")
    private List<Reference> network = new ArrayList<Reference>();
    /**
     * Definition of the role the participatingOrganization plays in the association.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Definition of the role the participatingOrganization plays in the association.")
    private List<CodeableConcept> code = new ArrayList<CodeableConcept>();
    /**
     * Specific specialty of the participatingOrganization in the context of the role.
     * 
     */
    @JsonProperty("specialty")
    @JsonPropertyDescription("Specific specialty of the participatingOrganization in the context of the role.")
    private List<CodeableConcept> specialty = new ArrayList<CodeableConcept>();
    /**
     * The location(s) at which the role occurs.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location(s) at which the role occurs.")
    private List<Reference> location = new ArrayList<Reference>();
    /**
     * Healthcare services provided through the role.
     * 
     */
    @JsonProperty("healthcareService")
    @JsonPropertyDescription("Healthcare services provided through the role.")
    private List<Reference> healthcareService = new ArrayList<Reference>();
    /**
     * Contact details at the participatingOrganization relevant to this Affiliation.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("Contact details at the participatingOrganization relevant to this Affiliation.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * Technical endpoints providing access to services operated for this role.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("Technical endpoints providing access to services operated for this role.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a OrganizationAffiliation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a OrganizationAffiliation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers that are specific to this role.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers that are specific to this role.
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("participatingOrganization")
    public Reference getParticipatingOrganization() {
        return participatingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("participatingOrganization")
    public void setParticipatingOrganization(Reference participatingOrganization) {
        this.participatingOrganization = participatingOrganization;
    }

    /**
     * Health insurance provider network in which the participatingOrganization provides the role's services (if defined) at the indicated locations (if defined).
     * 
     */
    @JsonProperty("network")
    public List<Reference> getNetwork() {
        return network;
    }

    /**
     * Health insurance provider network in which the participatingOrganization provides the role's services (if defined) at the indicated locations (if defined).
     * 
     */
    @JsonProperty("network")
    public void setNetwork(List<Reference> network) {
        this.network = network;
    }

    /**
     * Definition of the role the participatingOrganization plays in the association.
     * 
     */
    @JsonProperty("code")
    public List<CodeableConcept> getCode() {
        return code;
    }

    /**
     * Definition of the role the participatingOrganization plays in the association.
     * 
     */
    @JsonProperty("code")
    public void setCode(List<CodeableConcept> code) {
        this.code = code;
    }

    /**
     * Specific specialty of the participatingOrganization in the context of the role.
     * 
     */
    @JsonProperty("specialty")
    public List<CodeableConcept> getSpecialty() {
        return specialty;
    }

    /**
     * Specific specialty of the participatingOrganization in the context of the role.
     * 
     */
    @JsonProperty("specialty")
    public void setSpecialty(List<CodeableConcept> specialty) {
        this.specialty = specialty;
    }

    /**
     * The location(s) at which the role occurs.
     * 
     */
    @JsonProperty("location")
    public List<Reference> getLocation() {
        return location;
    }

    /**
     * The location(s) at which the role occurs.
     * 
     */
    @JsonProperty("location")
    public void setLocation(List<Reference> location) {
        this.location = location;
    }

    /**
     * Healthcare services provided through the role.
     * 
     */
    @JsonProperty("healthcareService")
    public List<Reference> getHealthcareService() {
        return healthcareService;
    }

    /**
     * Healthcare services provided through the role.
     * 
     */
    @JsonProperty("healthcareService")
    public void setHealthcareService(List<Reference> healthcareService) {
        this.healthcareService = healthcareService;
    }

    /**
     * Contact details at the participatingOrganization relevant to this Affiliation.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * Contact details at the participatingOrganization relevant to this Affiliation.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * Technical endpoints providing access to services operated for this role.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * Technical endpoints providing access to services operated for this role.
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
        sb.append(OrganizationAffiliation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("participatingOrganization");
        sb.append('=');
        sb.append(((this.participatingOrganization == null)?"<null>":this.participatingOrganization));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
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
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this.healthcareService == null)? 0 :this.healthcareService.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.participatingOrganization == null)? 0 :this.participatingOrganization.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationAffiliation) == false) {
            return false;
        }
        OrganizationAffiliation rhs = ((OrganizationAffiliation) other);
        return (((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.specialty == rhs.specialty)||((this.specialty!= null)&&this.specialty.equals(rhs.specialty))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this.healthcareService == rhs.healthcareService)||((this.healthcareService!= null)&&this.healthcareService.equals(rhs.healthcareService))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.participatingOrganization == rhs.participatingOrganization)||((this.participatingOrganization!= null)&&this.participatingOrganization.equals(rhs.participatingOrganization))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
