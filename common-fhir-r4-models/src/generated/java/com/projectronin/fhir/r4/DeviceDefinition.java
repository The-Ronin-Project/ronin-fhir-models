
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
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "udiDeviceIdentifier",
    "manufacturerString",
    "_manufacturerString",
    "manufacturerReference",
    "deviceName",
    "modelNumber",
    "_modelNumber",
    "type",
    "specialization",
    "version",
    "_version",
    "safety",
    "shelfLifeStorage",
    "physicalCharacteristics",
    "languageCode",
    "capability",
    "property",
    "owner",
    "contact",
    "url",
    "_url",
    "onlineInformation",
    "_onlineInformation",
    "note",
    "quantity",
    "parentDevice",
    "material"
})
@Generated("jsonschema2pojo")
public class DeviceDefinition
    extends DomainResource
{

    /**
     * This is a DeviceDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a DeviceDefinition resource")
    private String resourceType;
    /**
     * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     * 
     */
    @JsonProperty("udiDeviceIdentifier")
    @JsonPropertyDescription("Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.")
    private List<DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier = new ArrayList<DeviceDefinition_UdiDeviceIdentifier>();
    /**
     * A name of the manufacturer.
     * 
     */
    @JsonProperty("manufacturerString")
    @JsonPropertyDescription("A name of the manufacturer.")
    private String manufacturerString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufacturerString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _manufacturerString;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturerReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference manufacturerReference;
    /**
     * A name given to the device to identify it.
     * 
     */
    @JsonProperty("deviceName")
    @JsonPropertyDescription("A name given to the device to identify it.")
    private List<DeviceDefinition_DeviceName> deviceName = new ArrayList<DeviceDefinition_DeviceName>();
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
    private List<DeviceDefinition_Specialization> specialization = new ArrayList<DeviceDefinition_Specialization>();
    /**
     * The available versions of the device, e.g., software versions.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("The available versions of the device, e.g., software versions.")
    private List<String> version = new ArrayList<String>();
    /**
     * Extensions for version
     * 
     */
    @JsonProperty("_version")
    @JsonPropertyDescription("Extensions for version")
    private List<Element> _version = new ArrayList<Element>();
    /**
     * Safety characteristics of the device.
     * 
     */
    @JsonProperty("safety")
    @JsonPropertyDescription("Safety characteristics of the device.")
    private List<CodeableConcept> safety = new ArrayList<CodeableConcept>();
    /**
     * Shelf Life and storage information.
     * 
     */
    @JsonProperty("shelfLifeStorage")
    @JsonPropertyDescription("Shelf Life and storage information.")
    private List<ProductShelfLife> shelfLifeStorage = new ArrayList<ProductShelfLife>();
    /**
     * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
     * 
     */
    @JsonProperty("physicalCharacteristics")
    @JsonPropertyDescription("The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.")
    private ProdCharacteristic physicalCharacteristics;
    /**
     * Language code for the human-readable text strings produced by the device (all supported).
     * 
     */
    @JsonProperty("languageCode")
    @JsonPropertyDescription("Language code for the human-readable text strings produced by the device (all supported).")
    private List<CodeableConcept> languageCode = new ArrayList<CodeableConcept>();
    /**
     * Device capabilities.
     * 
     */
    @JsonProperty("capability")
    @JsonPropertyDescription("Device capabilities.")
    private List<DeviceDefinition_Capability> capability = new ArrayList<DeviceDefinition_Capability>();
    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.")
    private List<DeviceDefinition_Property> property = new ArrayList<DeviceDefinition_Property>();
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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("onlineInformation")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String onlineInformation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onlineInformation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _onlineInformation;
    /**
     * Descriptive information, usage information or implantation information that is not captured in an existing element.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Descriptive information, usage information or implantation information that is not captured in an existing element.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parentDevice")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference parentDevice;
    /**
     * A substance used to create the material(s) of which the device is made.
     * 
     */
    @JsonProperty("material")
    @JsonPropertyDescription("A substance used to create the material(s) of which the device is made.")
    private List<DeviceDefinition_Material> material = new ArrayList<DeviceDefinition_Material>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a DeviceDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a DeviceDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     * 
     */
    @JsonProperty("udiDeviceIdentifier")
    public List<DeviceDefinition_UdiDeviceIdentifier> getUdiDeviceIdentifier() {
        return udiDeviceIdentifier;
    }

    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     * 
     */
    @JsonProperty("udiDeviceIdentifier")
    public void setUdiDeviceIdentifier(List<DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier) {
        this.udiDeviceIdentifier = udiDeviceIdentifier;
    }

    /**
     * A name of the manufacturer.
     * 
     */
    @JsonProperty("manufacturerString")
    public String getManufacturerString() {
        return manufacturerString;
    }

    /**
     * A name of the manufacturer.
     * 
     */
    @JsonProperty("manufacturerString")
    public void setManufacturerString(String manufacturerString) {
        this.manufacturerString = manufacturerString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufacturerString")
    public Element get_manufacturerString() {
        return _manufacturerString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_manufacturerString")
    public void set_manufacturerString(Element _manufacturerString) {
        this._manufacturerString = _manufacturerString;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturerReference")
    public Reference getManufacturerReference() {
        return manufacturerReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturerReference")
    public void setManufacturerReference(Reference manufacturerReference) {
        this.manufacturerReference = manufacturerReference;
    }

    /**
     * A name given to the device to identify it.
     * 
     */
    @JsonProperty("deviceName")
    public List<DeviceDefinition_DeviceName> getDeviceName() {
        return deviceName;
    }

    /**
     * A name given to the device to identify it.
     * 
     */
    @JsonProperty("deviceName")
    public void setDeviceName(List<DeviceDefinition_DeviceName> deviceName) {
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
    public List<DeviceDefinition_Specialization> getSpecialization() {
        return specialization;
    }

    /**
     * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
     * 
     */
    @JsonProperty("specialization")
    public void setSpecialization(List<DeviceDefinition_Specialization> specialization) {
        this.specialization = specialization;
    }

    /**
     * The available versions of the device, e.g., software versions.
     * 
     */
    @JsonProperty("version")
    public List<String> getVersion() {
        return version;
    }

    /**
     * The available versions of the device, e.g., software versions.
     * 
     */
    @JsonProperty("version")
    public void setVersion(List<String> version) {
        this.version = version;
    }

    /**
     * Extensions for version
     * 
     */
    @JsonProperty("_version")
    public List<Element> get_version() {
        return _version;
    }

    /**
     * Extensions for version
     * 
     */
    @JsonProperty("_version")
    public void set_version(List<Element> _version) {
        this._version = _version;
    }

    /**
     * Safety characteristics of the device.
     * 
     */
    @JsonProperty("safety")
    public List<CodeableConcept> getSafety() {
        return safety;
    }

    /**
     * Safety characteristics of the device.
     * 
     */
    @JsonProperty("safety")
    public void setSafety(List<CodeableConcept> safety) {
        this.safety = safety;
    }

    /**
     * Shelf Life and storage information.
     * 
     */
    @JsonProperty("shelfLifeStorage")
    public List<ProductShelfLife> getShelfLifeStorage() {
        return shelfLifeStorage;
    }

    /**
     * Shelf Life and storage information.
     * 
     */
    @JsonProperty("shelfLifeStorage")
    public void setShelfLifeStorage(List<ProductShelfLife> shelfLifeStorage) {
        this.shelfLifeStorage = shelfLifeStorage;
    }

    /**
     * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
     * 
     */
    @JsonProperty("physicalCharacteristics")
    public ProdCharacteristic getPhysicalCharacteristics() {
        return physicalCharacteristics;
    }

    /**
     * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
     * 
     */
    @JsonProperty("physicalCharacteristics")
    public void setPhysicalCharacteristics(ProdCharacteristic physicalCharacteristics) {
        this.physicalCharacteristics = physicalCharacteristics;
    }

    /**
     * Language code for the human-readable text strings produced by the device (all supported).
     * 
     */
    @JsonProperty("languageCode")
    public List<CodeableConcept> getLanguageCode() {
        return languageCode;
    }

    /**
     * Language code for the human-readable text strings produced by the device (all supported).
     * 
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(List<CodeableConcept> languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Device capabilities.
     * 
     */
    @JsonProperty("capability")
    public List<DeviceDefinition_Capability> getCapability() {
        return capability;
    }

    /**
     * Device capabilities.
     * 
     */
    @JsonProperty("capability")
    public void setCapability(List<DeviceDefinition_Capability> capability) {
        this.capability = capability;
    }

    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     * 
     */
    @JsonProperty("property")
    public List<DeviceDefinition_Property> getProperty() {
        return property;
    }

    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     * 
     */
    @JsonProperty("property")
    public void setProperty(List<DeviceDefinition_Property> property) {
        this.property = property;
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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("onlineInformation")
    public String getOnlineInformation() {
        return onlineInformation;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("onlineInformation")
    public void setOnlineInformation(String onlineInformation) {
        this.onlineInformation = onlineInformation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onlineInformation")
    public Element get_onlineInformation() {
        return _onlineInformation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onlineInformation")
    public void set_onlineInformation(Element _onlineInformation) {
        this._onlineInformation = _onlineInformation;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parentDevice")
    public Reference getParentDevice() {
        return parentDevice;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parentDevice")
    public void setParentDevice(Reference parentDevice) {
        this.parentDevice = parentDevice;
    }

    /**
     * A substance used to create the material(s) of which the device is made.
     * 
     */
    @JsonProperty("material")
    public List<DeviceDefinition_Material> getMaterial() {
        return material;
    }

    /**
     * A substance used to create the material(s) of which the device is made.
     * 
     */
    @JsonProperty("material")
    public void setMaterial(List<DeviceDefinition_Material> material) {
        this.material = material;
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
        sb.append(DeviceDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("udiDeviceIdentifier");
        sb.append('=');
        sb.append(((this.udiDeviceIdentifier == null)?"<null>":this.udiDeviceIdentifier));
        sb.append(',');
        sb.append("manufacturerString");
        sb.append('=');
        sb.append(((this.manufacturerString == null)?"<null>":this.manufacturerString));
        sb.append(',');
        sb.append("_manufacturerString");
        sb.append('=');
        sb.append(((this._manufacturerString == null)?"<null>":this._manufacturerString));
        sb.append(',');
        sb.append("manufacturerReference");
        sb.append('=');
        sb.append(((this.manufacturerReference == null)?"<null>":this.manufacturerReference));
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
        sb.append("_version");
        sb.append('=');
        sb.append(((this._version == null)?"<null>":this._version));
        sb.append(',');
        sb.append("safety");
        sb.append('=');
        sb.append(((this.safety == null)?"<null>":this.safety));
        sb.append(',');
        sb.append("shelfLifeStorage");
        sb.append('=');
        sb.append(((this.shelfLifeStorage == null)?"<null>":this.shelfLifeStorage));
        sb.append(',');
        sb.append("physicalCharacteristics");
        sb.append('=');
        sb.append(((this.physicalCharacteristics == null)?"<null>":this.physicalCharacteristics));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
        sb.append(',');
        sb.append("capability");
        sb.append('=');
        sb.append(((this.capability == null)?"<null>":this.capability));
        sb.append(',');
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("onlineInformation");
        sb.append('=');
        sb.append(((this.onlineInformation == null)?"<null>":this.onlineInformation));
        sb.append(',');
        sb.append("_onlineInformation");
        sb.append('=');
        sb.append(((this._onlineInformation == null)?"<null>":this._onlineInformation));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("parentDevice");
        sb.append('=');
        sb.append(((this.parentDevice == null)?"<null>":this.parentDevice));
        sb.append(',');
        sb.append("material");
        sb.append('=');
        sb.append(((this.material == null)?"<null>":this.material));
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
        result = ((result* 31)+((this._manufacturerString == null)? 0 :this._manufacturerString.hashCode()));
        result = ((result* 31)+((this._modelNumber == null)? 0 :this._modelNumber.hashCode()));
        result = ((result* 31)+((this.physicalCharacteristics == null)? 0 :this.physicalCharacteristics.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.deviceName == null)? 0 :this.deviceName.hashCode()));
        result = ((result* 31)+((this.capability == null)? 0 :this.capability.hashCode()));
        result = ((result* 31)+((this.shelfLifeStorage == null)? 0 :this.shelfLifeStorage.hashCode()));
        result = ((result* 31)+((this.safety == null)? 0 :this.safety.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this.parentDevice == null)? 0 :this.parentDevice.hashCode()));
        result = ((result* 31)+((this.onlineInformation == null)? 0 :this.onlineInformation.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.manufacturerReference == null)? 0 :this.manufacturerReference.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.manufacturerString == null)? 0 :this.manufacturerString.hashCode()));
        result = ((result* 31)+((this.languageCode == null)? 0 :this.languageCode.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.udiDeviceIdentifier == null)? 0 :this.udiDeviceIdentifier.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.material == null)? 0 :this.material.hashCode()));
        result = ((result* 31)+((this.specialization == null)? 0 :this.specialization.hashCode()));
        result = ((result* 31)+((this._onlineInformation == null)? 0 :this._onlineInformation.hashCode()));
        result = ((result* 31)+((this.modelNumber == null)? 0 :this.modelNumber.hashCode()));
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
        if ((other instanceof DeviceDefinition) == false) {
            return false;
        }
        DeviceDefinition rhs = ((DeviceDefinition) other);
        return ((((((((((((((((((((((((((((((super.equals(rhs)&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this._manufacturerString == rhs._manufacturerString)||((this._manufacturerString!= null)&&this._manufacturerString.equals(rhs._manufacturerString))))&&((this._modelNumber == rhs._modelNumber)||((this._modelNumber!= null)&&this._modelNumber.equals(rhs._modelNumber))))&&((this.physicalCharacteristics == rhs.physicalCharacteristics)||((this.physicalCharacteristics!= null)&&this.physicalCharacteristics.equals(rhs.physicalCharacteristics))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.deviceName == rhs.deviceName)||((this.deviceName!= null)&&this.deviceName.equals(rhs.deviceName))))&&((this.capability == rhs.capability)||((this.capability!= null)&&this.capability.equals(rhs.capability))))&&((this.shelfLifeStorage == rhs.shelfLifeStorage)||((this.shelfLifeStorage!= null)&&this.shelfLifeStorage.equals(rhs.shelfLifeStorage))))&&((this.safety == rhs.safety)||((this.safety!= null)&&this.safety.equals(rhs.safety))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this.parentDevice == rhs.parentDevice)||((this.parentDevice!= null)&&this.parentDevice.equals(rhs.parentDevice))))&&((this.onlineInformation == rhs.onlineInformation)||((this.onlineInformation!= null)&&this.onlineInformation.equals(rhs.onlineInformation))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.manufacturerReference == rhs.manufacturerReference)||((this.manufacturerReference!= null)&&this.manufacturerReference.equals(rhs.manufacturerReference))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.manufacturerString == rhs.manufacturerString)||((this.manufacturerString!= null)&&this.manufacturerString.equals(rhs.manufacturerString))))&&((this.languageCode == rhs.languageCode)||((this.languageCode!= null)&&this.languageCode.equals(rhs.languageCode))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.udiDeviceIdentifier == rhs.udiDeviceIdentifier)||((this.udiDeviceIdentifier!= null)&&this.udiDeviceIdentifier.equals(rhs.udiDeviceIdentifier))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.material == rhs.material)||((this.material!= null)&&this.material.equals(rhs.material))))&&((this.specialization == rhs.specialization)||((this.specialization!= null)&&this.specialization.equals(rhs.specialization))))&&((this._onlineInformation == rhs._onlineInformation)||((this._onlineInformation!= null)&&this._onlineInformation.equals(rhs._onlineInformation))))&&((this.modelNumber == rhs.modelNumber)||((this.modelNumber!= null)&&this.modelNumber.equals(rhs.modelNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
