
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
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "type",
    "name",
    "_name",
    "alias",
    "_alias",
    "telecom",
    "address",
    "partOf",
    "contact",
    "endpoint"
})
@Generated("jsonschema2pojo")
public class Organization
    extends DomainResource
{

    /**
     * This is a Organization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Organization resource")
    private String resourceType;
    /**
     * Identifier for the organization that is used to identify the organization across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier for the organization that is used to identify the organization across multiple disparate systems.")
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
     * The kind(s) of organization that this is.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The kind(s) of organization that this is.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
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
     * A list of alternate names that the organization is known as, or was known as in the past.
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("A list of alternate names that the organization is known as, or was known as in the past.")
    private List<String> alias = new ArrayList<String>();
    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    @JsonPropertyDescription("Extensions for alias")
    private List<Element> _alias = new ArrayList<Element>();
    /**
     * A contact detail for the organization.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("A contact detail for the organization.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * An address for the organization.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("An address for the organization.")
    private List<Address> address = new ArrayList<Address>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference partOf;
    /**
     * Contact for the organization for a certain purpose.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Contact for the organization for a certain purpose.")
    private List<Organization_Contact> contact = new ArrayList<Organization_Contact>();
    /**
     * Technical endpoints providing access to services operated for the organization.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("Technical endpoints providing access to services operated for the organization.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Organization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Organization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifier for the organization that is used to identify the organization across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifier for the organization that is used to identify the organization across multiple disparate systems.
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
     * The kind(s) of organization that this is.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * The kind(s) of organization that this is.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
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
     * A list of alternate names that the organization is known as, or was known as in the past.
     * 
     */
    @JsonProperty("alias")
    public List<String> getAlias() {
        return alias;
    }

    /**
     * A list of alternate names that the organization is known as, or was known as in the past.
     * 
     */
    @JsonProperty("alias")
    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public List<Element> get_alias() {
        return _alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public void set_alias(List<Element> _alias) {
        this._alias = _alias;
    }

    /**
     * A contact detail for the organization.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * A contact detail for the organization.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * An address for the organization.
     * 
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * An address for the organization.
     * 
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    public Reference getPartOf() {
        return partOf;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(Reference partOf) {
        this.partOf = partOf;
    }

    /**
     * Contact for the organization for a certain purpose.
     * 
     */
    @JsonProperty("contact")
    public List<Organization_Contact> getContact() {
        return contact;
    }

    /**
     * Contact for the organization for a certain purpose.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<Organization_Contact> contact) {
        this.contact = contact;
    }

    /**
     * Technical endpoints providing access to services operated for the organization.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * Technical endpoints providing access to services operated for the organization.
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
        sb.append(Organization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("_alias");
        sb.append('=');
        sb.append(((this._alias == null)?"<null>":this._alias));
        sb.append(',');
        sb.append("telecom");
        sb.append('=');
        sb.append(((this.telecom == null)?"<null>":this.telecom));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this._alias == null)? 0 :this._alias.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
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
        if ((other instanceof Organization) == false) {
            return false;
        }
        Organization rhs = ((Organization) other);
        return (((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this._alias == rhs._alias)||((this._alias!= null)&&this._alias.equals(rhs._alias))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
