
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
 * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "operationalStatus",
    "name",
    "_name",
    "alias",
    "_alias",
    "description",
    "_description",
    "mode",
    "_mode",
    "type",
    "telecom",
    "address",
    "physicalType",
    "position",
    "managingOrganization",
    "partOf",
    "hoursOfOperation",
    "availabilityExceptions",
    "_availabilityExceptions",
    "endpoint"
})
@Generated("jsonschema2pojo")
public class Location
    extends DomainResource
{

    /**
     * This is a Location resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Location resource")
    private String resourceType;
    /**
     * Unique code or number identifying the location to its users.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique code or number identifying the location to its users.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.")
    private Location.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("operationalStatus")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding operationalStatus;
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
     * A list of alternate names that the location is known as, or was known as, in the past.
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("A list of alternate names that the location is known as, or was known as, in the past.")
    private List<String> alias = new ArrayList<String>();
    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    @JsonPropertyDescription("Extensions for alias")
    private List<Element> _alias = new ArrayList<Element>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * Indicates whether a resource instance represents a specific location or a class of locations.
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("Indicates whether a resource instance represents a specific location or a class of locations.")
    private Location.Mode mode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _mode;
    /**
     * Indicates the type of function performed at the location.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicates the type of function performed at the location.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.")
    private Address address;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("physicalType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept physicalType;
    /**
     * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.")
    private Location_Position position;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference managingOrganization;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference partOf;
    /**
     * What days/times during a week is this location usually open.
     * 
     */
    @JsonProperty("hoursOfOperation")
    @JsonPropertyDescription("What days/times during a week is this location usually open.")
    private List<Location_HoursOfOperation> hoursOfOperation = new ArrayList<Location_HoursOfOperation>();
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
     * Technical endpoints providing access to services operated for the location.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("Technical endpoints providing access to services operated for the location.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Location resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Location resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique code or number identifying the location to its users.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique code or number identifying the location to its users.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
     * 
     */
    @JsonProperty("status")
    public Location.Status getStatus() {
        return status;
    }

    /**
     * The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Location.Status status) {
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
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("operationalStatus")
    public Coding getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("operationalStatus")
    public void setOperationalStatus(Coding operationalStatus) {
        this.operationalStatus = operationalStatus;
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
     * A list of alternate names that the location is known as, or was known as, in the past.
     * 
     */
    @JsonProperty("alias")
    public List<String> getAlias() {
        return alias;
    }

    /**
     * A list of alternate names that the location is known as, or was known as, in the past.
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * Indicates whether a resource instance represents a specific location or a class of locations.
     * 
     */
    @JsonProperty("mode")
    public Location.Mode getMode() {
        return mode;
    }

    /**
     * Indicates whether a resource instance represents a specific location or a class of locations.
     * 
     */
    @JsonProperty("mode")
    public void setMode(Location.Mode mode) {
        this.mode = mode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    public Element get_mode() {
        return _mode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    public void set_mode(Element _mode) {
        this._mode = _mode;
    }

    /**
     * Indicates the type of function performed at the location.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * Indicates the type of function performed at the location.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("physicalType")
    public CodeableConcept getPhysicalType() {
        return physicalType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("physicalType")
    public void setPhysicalType(CodeableConcept physicalType) {
        this.physicalType = physicalType;
    }

    /**
     * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
     * 
     */
    @JsonProperty("position")
    public Location_Position getPosition() {
        return position;
    }

    /**
     * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
     * 
     */
    @JsonProperty("position")
    public void setPosition(Location_Position position) {
        this.position = position;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    public Reference getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Reference managingOrganization) {
        this.managingOrganization = managingOrganization;
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
     * What days/times during a week is this location usually open.
     * 
     */
    @JsonProperty("hoursOfOperation")
    public List<Location_HoursOfOperation> getHoursOfOperation() {
        return hoursOfOperation;
    }

    /**
     * What days/times during a week is this location usually open.
     * 
     */
    @JsonProperty("hoursOfOperation")
    public void setHoursOfOperation(List<Location_HoursOfOperation> hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
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
     * Technical endpoints providing access to services operated for the location.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * Technical endpoints providing access to services operated for the location.
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
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("operationalStatus");
        sb.append('=');
        sb.append(((this.operationalStatus == null)?"<null>":this.operationalStatus));
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("_mode");
        sb.append('=');
        sb.append(((this._mode == null)?"<null>":this._mode));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("telecom");
        sb.append('=');
        sb.append(((this.telecom == null)?"<null>":this.telecom));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("physicalType");
        sb.append('=');
        sb.append(((this.physicalType == null)?"<null>":this.physicalType));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("managingOrganization");
        sb.append('=');
        sb.append(((this.managingOrganization == null)?"<null>":this.managingOrganization));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("hoursOfOperation");
        sb.append('=');
        sb.append(((this.hoursOfOperation == null)?"<null>":this.hoursOfOperation));
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
        result = ((result* 31)+((this.operationalStatus == null)? 0 :this.operationalStatus.hashCode()));
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.hoursOfOperation == null)? 0 :this.hoursOfOperation.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.physicalType == null)? 0 :this.physicalType.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._mode == null)? 0 :this._mode.hashCode()));
        result = ((result* 31)+((this.managingOrganization == null)? 0 :this.managingOrganization.hashCode()));
        result = ((result* 31)+((this._alias == null)? 0 :this._alias.hashCode()));
        result = ((result* 31)+((this._availabilityExceptions == null)? 0 :this._availabilityExceptions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.availabilityExceptions == null)? 0 :this.availabilityExceptions.hashCode()));
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
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return (((((((((((((((((((((((((super.equals(rhs)&&((this.operationalStatus == rhs.operationalStatus)||((this.operationalStatus!= null)&&this.operationalStatus.equals(rhs.operationalStatus))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.hoursOfOperation == rhs.hoursOfOperation)||((this.hoursOfOperation!= null)&&this.hoursOfOperation.equals(rhs.hoursOfOperation))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.physicalType == rhs.physicalType)||((this.physicalType!= null)&&this.physicalType.equals(rhs.physicalType))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._mode == rhs._mode)||((this._mode!= null)&&this._mode.equals(rhs._mode))))&&((this.managingOrganization == rhs.managingOrganization)||((this.managingOrganization!= null)&&this.managingOrganization.equals(rhs.managingOrganization))))&&((this._alias == rhs._alias)||((this._alias!= null)&&this._alias.equals(rhs._alias))))&&((this._availabilityExceptions == rhs._availabilityExceptions)||((this._availabilityExceptions!= null)&&this._availabilityExceptions.equals(rhs._availabilityExceptions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.availabilityExceptions == rhs.availabilityExceptions)||((this.availabilityExceptions!= null)&&this.availabilityExceptions.equals(rhs.availabilityExceptions))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Indicates whether a resource instance represents a specific location or a class of locations.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Mode {

        INSTANCE("instance"),
        KIND("kind");
        private final String value;
        private final static Map<String, Location.Mode> CONSTANTS = new HashMap<String, Location.Mode>();

        static {
            for (Location.Mode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Mode(String value) {
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
        public static Location.Mode fromValue(String value) {
            Location.Mode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        SUSPENDED("suspended"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, Location.Status> CONSTANTS = new HashMap<String, Location.Status>();

        static {
            for (Location.Status c: values()) {
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
        public static Location.Status fromValue(String value) {
            Location.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
