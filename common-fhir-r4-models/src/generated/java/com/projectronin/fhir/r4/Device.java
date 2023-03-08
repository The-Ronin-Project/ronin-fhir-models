
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
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "definition",
    "udiCarrier",
    "status",
    "_status",
    "statusReason",
    "distinctIdentifier",
    "_distinctIdentifier",
    "manufacturer",
    "_manufacturer",
    "manufactureDate",
    "_manufactureDate",
    "expirationDate",
    "_expirationDate",
    "lotNumber",
    "_lotNumber",
    "serialNumber",
    "_serialNumber",
    "deviceName",
    "modelNumber",
    "_modelNumber",
    "partNumber",
    "_partNumber",
    "type",
    "specialization",
    "version",
    "property",
    "patient",
    "owner",
    "contact",
    "location",
    "url",
    "_url",
    "note",
    "safety",
    "parent"
})
@Generated("jsonschema2pojo")
public class Device
    extends DomainResource
{

    /**
     * This is a Device resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Device resource")
    private String resourceType;
    /**
     * Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique instance identifiers assigned to a device by manufacturers other organizations or owners.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definition")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference definition;
    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     * 
     */
    @JsonProperty("udiCarrier")
    @JsonPropertyDescription("Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.")
    private List<Device_UdiCarrier> udiCarrier = new ArrayList<Device_UdiCarrier>();
    /**
     * Status of the Device availability.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the Device availability.")
    private Device.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * Reason for the dtatus of the Device availability.
     * 
     */
    @JsonProperty("statusReason")
    @JsonPropertyDescription("Reason for the dtatus of the Device availability.")
    private List<CodeableConcept> statusReason = new ArrayList<CodeableConcept>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("distinctIdentifier")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String distinctIdentifier;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_distinctIdentifier")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _distinctIdentifier;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String manufacturer;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufacturer")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _manufacturer;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("manufactureDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String manufactureDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufactureDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _manufactureDate;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String expirationDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expirationDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _expirationDate;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("lotNumber")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String lotNumber;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lotNumber")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lotNumber;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("serialNumber")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String serialNumber;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_serialNumber")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _serialNumber;
    /**
     * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
     * 
     */
    @JsonProperty("deviceName")
    @JsonPropertyDescription("This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.")
    private List<Device_DeviceName> deviceName = new ArrayList<Device_DeviceName>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("modelNumber")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String modelNumber;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_modelNumber")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _modelNumber;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("partNumber")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String partNumber;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_partNumber")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _partNumber;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
     * 
     */
    @JsonProperty("specialization")
    @JsonPropertyDescription("The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.")
    private List<Device_Specialization> specialization = new ArrayList<Device_Specialization>();
    /**
     * The actual design of the device or software version running on the device.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("The actual design of the device or software version running on the device.")
    private List<Device_Version> version = new ArrayList<Device_Version>();
    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.")
    private List<Device_Property> property = new ArrayList<Device_Property>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference owner;
    /**
     * Contact details for an organization or a particular human that is responsible for the device.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Contact details for an organization or a particular human that is responsible for the device.")
    private List<ContactPoint> contact = new ArrayList<ContactPoint>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String url;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _url;
    /**
     * Descriptive information, usage information or implantation information that is not captured in an existing element.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Descriptive information, usage information or implantation information that is not captured in an existing element.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Provides additional safety characteristics about a medical device.  For example devices containing latex.
     * 
     */
    @JsonProperty("safety")
    @JsonPropertyDescription("Provides additional safety characteristics about a medical device.  For example devices containing latex.")
    private List<CodeableConcept> safety = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference parent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Device resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Device resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definition")
    public Reference getDefinition() {
        return definition;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definition")
    public void setDefinition(Reference definition) {
        this.definition = definition;
    }

    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     * 
     */
    @JsonProperty("udiCarrier")
    public List<Device_UdiCarrier> getUdiCarrier() {
        return udiCarrier;
    }

    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     * 
     */
    @JsonProperty("udiCarrier")
    public void setUdiCarrier(List<Device_UdiCarrier> udiCarrier) {
        this.udiCarrier = udiCarrier;
    }

    /**
     * Status of the Device availability.
     * 
     */
    @JsonProperty("status")
    public Device.Status getStatus() {
        return status;
    }

    /**
     * Status of the Device availability.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Device.Status status) {
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
     * Reason for the dtatus of the Device availability.
     * 
     */
    @JsonProperty("statusReason")
    public List<CodeableConcept> getStatusReason() {
        return statusReason;
    }

    /**
     * Reason for the dtatus of the Device availability.
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(List<CodeableConcept> statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("distinctIdentifier")
    public String getDistinctIdentifier() {
        return distinctIdentifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("distinctIdentifier")
    public void setDistinctIdentifier(String distinctIdentifier) {
        this.distinctIdentifier = distinctIdentifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_distinctIdentifier")
    public Element get_distinctIdentifier() {
        return _distinctIdentifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_distinctIdentifier")
    public void set_distinctIdentifier(Element _distinctIdentifier) {
        this._distinctIdentifier = _distinctIdentifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufacturer")
    public Element get_manufacturer() {
        return _manufacturer;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufacturer")
    public void set_manufacturer(Element _manufacturer) {
        this._manufacturer = _manufacturer;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("manufactureDate")
    public String getManufactureDate() {
        return manufactureDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("manufactureDate")
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufactureDate")
    public Element get_manufactureDate() {
        return _manufactureDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufactureDate")
    public void set_manufactureDate(Element _manufactureDate) {
        this._manufactureDate = _manufactureDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("expirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expirationDate")
    public Element get_expirationDate() {
        return _expirationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expirationDate")
    public void set_expirationDate(Element _expirationDate) {
        this._expirationDate = _expirationDate;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("lotNumber")
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("lotNumber")
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lotNumber")
    public Element get_lotNumber() {
        return _lotNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lotNumber")
    public void set_lotNumber(Element _lotNumber) {
        this._lotNumber = _lotNumber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_serialNumber")
    public Element get_serialNumber() {
        return _serialNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_serialNumber")
    public void set_serialNumber(Element _serialNumber) {
        this._serialNumber = _serialNumber;
    }

    /**
     * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
     * 
     */
    @JsonProperty("deviceName")
    public List<Device_DeviceName> getDeviceName() {
        return deviceName;
    }

    /**
     * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
     * 
     */
    @JsonProperty("deviceName")
    public void setDeviceName(List<Device_DeviceName> deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("modelNumber")
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("modelNumber")
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_modelNumber")
    public Element get_modelNumber() {
        return _modelNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_modelNumber")
    public void set_modelNumber(Element _modelNumber) {
        this._modelNumber = _modelNumber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("partNumber")
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("partNumber")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_partNumber")
    public Element get_partNumber() {
        return _partNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_partNumber")
    public void set_partNumber(Element _partNumber) {
        this._partNumber = _partNumber;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
     * 
     */
    @JsonProperty("specialization")
    public List<Device_Specialization> getSpecialization() {
        return specialization;
    }

    /**
     * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
     * 
     */
    @JsonProperty("specialization")
    public void setSpecialization(List<Device_Specialization> specialization) {
        this.specialization = specialization;
    }

    /**
     * The actual design of the device or software version running on the device.
     * 
     */
    @JsonProperty("version")
    public List<Device_Version> getVersion() {
        return version;
    }

    /**
     * The actual design of the device or software version running on the device.
     * 
     */
    @JsonProperty("version")
    public void setVersion(List<Device_Version> version) {
        this.version = version;
    }

    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     * 
     */
    @JsonProperty("property")
    public List<Device_Property> getProperty() {
        return property;
    }

    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     * 
     */
    @JsonProperty("property")
    public void setProperty(List<Device_Property> property) {
        this.property = property;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    public Reference getOwner() {
        return owner;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Reference owner) {
        this.owner = owner;
    }

    /**
     * Contact details for an organization or a particular human that is responsible for the device.
     * 
     */
    @JsonProperty("contact")
    public List<ContactPoint> getContact() {
        return contact;
    }

    /**
     * Contact details for an organization or a particular human that is responsible for the device.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<ContactPoint> contact) {
        this.contact = contact;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public Reference getLocation() {
        return location;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public void setLocation(Reference location) {
        this.location = location;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public Element get_url() {
        return _url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public void set_url(Element _url) {
        this._url = _url;
    }

    /**
     * Descriptive information, usage information or implantation information that is not captured in an existing element.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Descriptive information, usage information or implantation information that is not captured in an existing element.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Provides additional safety characteristics about a medical device.  For example devices containing latex.
     * 
     */
    @JsonProperty("safety")
    public List<CodeableConcept> getSafety() {
        return safety;
    }

    /**
     * Provides additional safety characteristics about a medical device.  For example devices containing latex.
     * 
     */
    @JsonProperty("safety")
    public void setSafety(List<CodeableConcept> safety) {
        this.safety = safety;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    public Reference getParent() {
        return parent;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    public void setParent(Reference parent) {
        this.parent = parent;
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
        sb.append(Device.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("udiCarrier");
        sb.append('=');
        sb.append(((this.udiCarrier == null)?"<null>":this.udiCarrier));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("distinctIdentifier");
        sb.append('=');
        sb.append(((this.distinctIdentifier == null)?"<null>":this.distinctIdentifier));
        sb.append(',');
        sb.append("_distinctIdentifier");
        sb.append('=');
        sb.append(((this._distinctIdentifier == null)?"<null>":this._distinctIdentifier));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("_manufacturer");
        sb.append('=');
        sb.append(((this._manufacturer == null)?"<null>":this._manufacturer));
        sb.append(',');
        sb.append("manufactureDate");
        sb.append('=');
        sb.append(((this.manufactureDate == null)?"<null>":this.manufactureDate));
        sb.append(',');
        sb.append("_manufactureDate");
        sb.append('=');
        sb.append(((this._manufactureDate == null)?"<null>":this._manufactureDate));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("_expirationDate");
        sb.append('=');
        sb.append(((this._expirationDate == null)?"<null>":this._expirationDate));
        sb.append(',');
        sb.append("lotNumber");
        sb.append('=');
        sb.append(((this.lotNumber == null)?"<null>":this.lotNumber));
        sb.append(',');
        sb.append("_lotNumber");
        sb.append('=');
        sb.append(((this._lotNumber == null)?"<null>":this._lotNumber));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null)?"<null>":this.serialNumber));
        sb.append(',');
        sb.append("_serialNumber");
        sb.append('=');
        sb.append(((this._serialNumber == null)?"<null>":this._serialNumber));
        sb.append(',');
        sb.append("deviceName");
        sb.append('=');
        sb.append(((this.deviceName == null)?"<null>":this.deviceName));
        sb.append(',');
        sb.append("modelNumber");
        sb.append('=');
        sb.append(((this.modelNumber == null)?"<null>":this.modelNumber));
        sb.append(',');
        sb.append("_modelNumber");
        sb.append('=');
        sb.append(((this._modelNumber == null)?"<null>":this._modelNumber));
        sb.append(',');
        sb.append("partNumber");
        sb.append('=');
        sb.append(((this.partNumber == null)?"<null>":this.partNumber));
        sb.append(',');
        sb.append("_partNumber");
        sb.append('=');
        sb.append(((this._partNumber == null)?"<null>":this._partNumber));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("specialization");
        sb.append('=');
        sb.append(((this.specialization == null)?"<null>":this.specialization));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("safety");
        sb.append('=');
        sb.append(((this.safety == null)?"<null>":this.safety));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this._modelNumber == null)? 0 :this._modelNumber.hashCode()));
        result = ((result* 31)+((this.distinctIdentifier == null)? 0 :this.distinctIdentifier.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._manufacturer == null)? 0 :this._manufacturer.hashCode()));
        result = ((result* 31)+((this.deviceName == null)? 0 :this.deviceName.hashCode()));
        result = ((result* 31)+((this.manufacturer == null)? 0 :this.manufacturer.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this._expirationDate == null)? 0 :this._expirationDate.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.safety == null)? 0 :this.safety.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this.manufactureDate == null)? 0 :this.manufactureDate.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._serialNumber == null)? 0 :this._serialNumber.hashCode()));
        result = ((result* 31)+((this.serialNumber == null)? 0 :this.serialNumber.hashCode()));
        result = ((result* 31)+((this._manufactureDate == null)? 0 :this._manufactureDate.hashCode()));
        result = ((result* 31)+((this._lotNumber == null)? 0 :this._lotNumber.hashCode()));
        result = ((result* 31)+((this.lotNumber == null)? 0 :this.lotNumber.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._distinctIdentifier == null)? 0 :this._distinctIdentifier.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.udiCarrier == null)? 0 :this.udiCarrier.hashCode()));
        result = ((result* 31)+((this.specialization == null)? 0 :this.specialization.hashCode()));
        result = ((result* 31)+((this.modelNumber == null)? 0 :this.modelNumber.hashCode()));
        result = ((result* 31)+((this.partNumber == null)? 0 :this.partNumber.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this._partNumber == null)? 0 :this._partNumber.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device) == false) {
            return false;
        }
        Device rhs = ((Device) other);
        return ((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this._modelNumber == rhs._modelNumber)||((this._modelNumber!= null)&&this._modelNumber.equals(rhs._modelNumber))))&&((this.distinctIdentifier == rhs.distinctIdentifier)||((this.distinctIdentifier!= null)&&this.distinctIdentifier.equals(rhs.distinctIdentifier))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._manufacturer == rhs._manufacturer)||((this._manufacturer!= null)&&this._manufacturer.equals(rhs._manufacturer))))&&((this.deviceName == rhs.deviceName)||((this.deviceName!= null)&&this.deviceName.equals(rhs.deviceName))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this._expirationDate == rhs._expirationDate)||((this._expirationDate!= null)&&this._expirationDate.equals(rhs._expirationDate))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.safety == rhs.safety)||((this.safety!= null)&&this.safety.equals(rhs.safety))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this.manufactureDate == rhs.manufactureDate)||((this.manufactureDate!= null)&&this.manufactureDate.equals(rhs.manufactureDate))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._serialNumber == rhs._serialNumber)||((this._serialNumber!= null)&&this._serialNumber.equals(rhs._serialNumber))))&&((this.serialNumber == rhs.serialNumber)||((this.serialNumber!= null)&&this.serialNumber.equals(rhs.serialNumber))))&&((this._manufactureDate == rhs._manufactureDate)||((this._manufactureDate!= null)&&this._manufactureDate.equals(rhs._manufactureDate))))&&((this._lotNumber == rhs._lotNumber)||((this._lotNumber!= null)&&this._lotNumber.equals(rhs._lotNumber))))&&((this.lotNumber == rhs.lotNumber)||((this.lotNumber!= null)&&this.lotNumber.equals(rhs.lotNumber))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._distinctIdentifier == rhs._distinctIdentifier)||((this._distinctIdentifier!= null)&&this._distinctIdentifier.equals(rhs._distinctIdentifier))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.udiCarrier == rhs.udiCarrier)||((this.udiCarrier!= null)&&this.udiCarrier.equals(rhs.udiCarrier))))&&((this.specialization == rhs.specialization)||((this.specialization!= null)&&this.specialization.equals(rhs.specialization))))&&((this.modelNumber == rhs.modelNumber)||((this.modelNumber!= null)&&this.modelNumber.equals(rhs.modelNumber))))&&((this.partNumber == rhs.partNumber)||((this.partNumber!= null)&&this.partNumber.equals(rhs.partNumber))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this._partNumber == rhs._partNumber)||((this._partNumber!= null)&&this._partNumber.equals(rhs._partNumber))));
    }


    /**
     * Status of the Device availability.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive"),
        ENTERED_IN_ERROR("entered-in-error"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Device.Status> CONSTANTS = new HashMap<String, Device.Status>();

        static {
            for (Device.Status c: values()) {
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
        public static Device.Status fromValue(String value) {
            Device.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
