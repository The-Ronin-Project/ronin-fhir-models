
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
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "connectionType",
    "name",
    "_name",
    "managingOrganization",
    "contact",
    "period",
    "payloadType",
    "payloadMimeType",
    "_payloadMimeType",
    "address",
    "_address",
    "header",
    "_header"
})
@Generated("jsonschema2pojo")
public class Endpoint
    extends DomainResource
{

    /**
     * This is a Endpoint resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Endpoint resource")
    private String resourceType;
    /**
     * Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier for the organization that is used to identify the endpoint across multiple disparate systems.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * active | suspended | error | off | test.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("active | suspended | error | off | test.")
    private Endpoint.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("connectionType")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding connectionType;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference managingOrganization;
    /**
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.")
    private List<ContactPoint> contact = new ArrayList<ContactPoint>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * The payload type describes the acceptable content that can be communicated on the endpoint.
     * (Required)
     * 
     */
    @JsonProperty("payloadType")
    @JsonPropertyDescription("The payload type describes the acceptable content that can be communicated on the endpoint.")
    private List<CodeableConcept> payloadType = new ArrayList<CodeableConcept>();
    /**
     * The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).
     * 
     */
    @JsonProperty("payloadMimeType")
    @JsonPropertyDescription("The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).")
    private List<String> payloadMimeType = new ArrayList<String>();
    /**
     * Extensions for payloadMimeType
     * 
     */
    @JsonProperty("_payloadMimeType")
    @JsonPropertyDescription("Extensions for payloadMimeType")
    private List<Element> _payloadMimeType = new ArrayList<Element>();
    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("A URI that is a literal reference")
    private String address;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_address")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _address;
    /**
     * Additional headers / information to send as part of the notification.
     * 
     */
    @JsonProperty("header")
    @JsonPropertyDescription("Additional headers / information to send as part of the notification.")
    private List<String> header = new ArrayList<String>();
    /**
     * Extensions for header
     * 
     */
    @JsonProperty("_header")
    @JsonPropertyDescription("Extensions for header")
    private List<Element> _header = new ArrayList<Element>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Endpoint resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Endpoint resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * active | suspended | error | off | test.
     * 
     */
    @JsonProperty("status")
    public Endpoint.Status getStatus() {
        return status;
    }

    /**
     * active | suspended | error | off | test.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Endpoint.Status status) {
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
     * (Required)
     * 
     */
    @JsonProperty("connectionType")
    public Coding getConnectionType() {
        return connectionType;
    }

    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("connectionType")
    public void setConnectionType(Coding connectionType) {
        this.connectionType = connectionType;
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
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     * 
     */
    @JsonProperty("contact")
    public List<ContactPoint> getContact() {
        return contact;
    }

    /**
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<ContactPoint> contact) {
        this.contact = contact;
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
     * The payload type describes the acceptable content that can be communicated on the endpoint.
     * (Required)
     * 
     */
    @JsonProperty("payloadType")
    public List<CodeableConcept> getPayloadType() {
        return payloadType;
    }

    /**
     * The payload type describes the acceptable content that can be communicated on the endpoint.
     * (Required)
     * 
     */
    @JsonProperty("payloadType")
    public void setPayloadType(List<CodeableConcept> payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).
     * 
     */
    @JsonProperty("payloadMimeType")
    public List<String> getPayloadMimeType() {
        return payloadMimeType;
    }

    /**
     * The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).
     * 
     */
    @JsonProperty("payloadMimeType")
    public void setPayloadMimeType(List<String> payloadMimeType) {
        this.payloadMimeType = payloadMimeType;
    }

    /**
     * Extensions for payloadMimeType
     * 
     */
    @JsonProperty("_payloadMimeType")
    public List<Element> get_payloadMimeType() {
        return _payloadMimeType;
    }

    /**
     * Extensions for payloadMimeType
     * 
     */
    @JsonProperty("_payloadMimeType")
    public void set_payloadMimeType(List<Element> _payloadMimeType) {
        this._payloadMimeType = _payloadMimeType;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_address")
    public Element get_address() {
        return _address;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_address")
    public void set_address(Element _address) {
        this._address = _address;
    }

    /**
     * Additional headers / information to send as part of the notification.
     * 
     */
    @JsonProperty("header")
    public List<String> getHeader() {
        return header;
    }

    /**
     * Additional headers / information to send as part of the notification.
     * 
     */
    @JsonProperty("header")
    public void setHeader(List<String> header) {
        this.header = header;
    }

    /**
     * Extensions for header
     * 
     */
    @JsonProperty("_header")
    public List<Element> get_header() {
        return _header;
    }

    /**
     * Extensions for header
     * 
     */
    @JsonProperty("_header")
    public void set_header(List<Element> _header) {
        this._header = _header;
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
        sb.append(Endpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("connectionType");
        sb.append('=');
        sb.append(((this.connectionType == null)?"<null>":this.connectionType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("managingOrganization");
        sb.append('=');
        sb.append(((this.managingOrganization == null)?"<null>":this.managingOrganization));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("payloadType");
        sb.append('=');
        sb.append(((this.payloadType == null)?"<null>":this.payloadType));
        sb.append(',');
        sb.append("payloadMimeType");
        sb.append('=');
        sb.append(((this.payloadMimeType == null)?"<null>":this.payloadMimeType));
        sb.append(',');
        sb.append("_payloadMimeType");
        sb.append('=');
        sb.append(((this._payloadMimeType == null)?"<null>":this._payloadMimeType));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("_address");
        sb.append('=');
        sb.append(((this._address == null)?"<null>":this._address));
        sb.append(',');
        sb.append("header");
        sb.append('=');
        sb.append(((this.header == null)?"<null>":this.header));
        sb.append(',');
        sb.append("_header");
        sb.append('=');
        sb.append(((this._header == null)?"<null>":this._header));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._header == null)? 0 :this._header.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.connectionType == null)? 0 :this.connectionType.hashCode()));
        result = ((result* 31)+((this._address == null)? 0 :this._address.hashCode()));
        result = ((result* 31)+((this.managingOrganization == null)? 0 :this.managingOrganization.hashCode()));
        result = ((result* 31)+((this.payloadType == null)? 0 :this.payloadType.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.header == null)? 0 :this.header.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.payloadMimeType == null)? 0 :this.payloadMimeType.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this._payloadMimeType == null)? 0 :this._payloadMimeType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endpoint) == false) {
            return false;
        }
        Endpoint rhs = ((Endpoint) other);
        return ((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._header == rhs._header)||((this._header!= null)&&this._header.equals(rhs._header))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.connectionType == rhs.connectionType)||((this.connectionType!= null)&&this.connectionType.equals(rhs.connectionType))))&&((this._address == rhs._address)||((this._address!= null)&&this._address.equals(rhs._address))))&&((this.managingOrganization == rhs.managingOrganization)||((this.managingOrganization!= null)&&this.managingOrganization.equals(rhs.managingOrganization))))&&((this.payloadType == rhs.payloadType)||((this.payloadType!= null)&&this.payloadType.equals(rhs.payloadType))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.header == rhs.header)||((this.header!= null)&&this.header.equals(rhs.header))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.payloadMimeType == rhs.payloadMimeType)||((this.payloadMimeType!= null)&&this.payloadMimeType.equals(rhs.payloadMimeType))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this._payloadMimeType == rhs._payloadMimeType)||((this._payloadMimeType!= null)&&this._payloadMimeType.equals(rhs._payloadMimeType))));
    }


    /**
     * active | suspended | error | off | test.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        SUSPENDED("suspended"),
        ERROR("error"),
        OFF("off"),
        ENTERED_IN_ERROR("entered-in-error"),
        TEST("test");
        private final String value;
        private final static Map<String, Endpoint.Status> CONSTANTS = new HashMap<String, Endpoint.Status>();

        static {
            for (Endpoint.Status c: values()) {
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
        public static Endpoint.Status fromValue(String value) {
            Endpoint.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
