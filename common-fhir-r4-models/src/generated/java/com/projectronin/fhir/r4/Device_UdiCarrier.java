
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
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
    "id",
    "extension",
    "modifierExtension",
    "deviceIdentifier",
    "_deviceIdentifier",
    "issuer",
    "_issuer",
    "jurisdiction",
    "_jurisdiction",
    "carrierAIDC",
    "_carrierAIDC",
    "carrierHRF",
    "_carrierHRF",
    "entryType",
    "_entryType"
})
@Generated("jsonschema2pojo")
public class Device_UdiCarrier {

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String id;
    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
    private List<Extension> extension = new ArrayList<Extension>();
    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).")
    private List<Extension> modifierExtension = new ArrayList<Extension>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("deviceIdentifier")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String deviceIdentifier;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deviceIdentifier")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _deviceIdentifier;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("issuer")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String issuer;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issuer")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _issuer;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String jurisdiction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_jurisdiction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _jurisdiction;
    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("carrierAIDC")
    @JsonPropertyDescription("A stream of bytes")
    private String carrierAIDC;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_carrierAIDC")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _carrierAIDC;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("carrierHRF")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String carrierHRF;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_carrierHRF")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _carrierHRF;
    /**
     * A coded entry to indicate how the data was entered.
     * 
     */
    @JsonProperty("entryType")
    @JsonPropertyDescription("A coded entry to indicate how the data was entered.")
    private Device_UdiCarrier.EntryType entryType;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_entryType")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _entryType;

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public List<Extension> getExtension() {
        return extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public List<Extension> getModifierExtension() {
        return modifierExtension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public void setModifierExtension(List<Extension> modifierExtension) {
        this.modifierExtension = modifierExtension;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("deviceIdentifier")
    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("deviceIdentifier")
    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deviceIdentifier")
    public Element get_deviceIdentifier() {
        return _deviceIdentifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deviceIdentifier")
    public void set_deviceIdentifier(Element _deviceIdentifier) {
        this._deviceIdentifier = _deviceIdentifier;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("issuer")
    public String getIssuer() {
        return issuer;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issuer")
    public Element get_issuer() {
        return _issuer;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issuer")
    public void set_issuer(Element _issuer) {
        this._issuer = _issuer;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("jurisdiction")
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("jurisdiction")
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_jurisdiction")
    public Element get_jurisdiction() {
        return _jurisdiction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_jurisdiction")
    public void set_jurisdiction(Element _jurisdiction) {
        this._jurisdiction = _jurisdiction;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("carrierAIDC")
    public String getCarrierAIDC() {
        return carrierAIDC;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("carrierAIDC")
    public void setCarrierAIDC(String carrierAIDC) {
        this.carrierAIDC = carrierAIDC;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_carrierAIDC")
    public Element get_carrierAIDC() {
        return _carrierAIDC;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_carrierAIDC")
    public void set_carrierAIDC(Element _carrierAIDC) {
        this._carrierAIDC = _carrierAIDC;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("carrierHRF")
    public String getCarrierHRF() {
        return carrierHRF;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("carrierHRF")
    public void setCarrierHRF(String carrierHRF) {
        this.carrierHRF = carrierHRF;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_carrierHRF")
    public Element get_carrierHRF() {
        return _carrierHRF;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_carrierHRF")
    public void set_carrierHRF(Element _carrierHRF) {
        this._carrierHRF = _carrierHRF;
    }

    /**
     * A coded entry to indicate how the data was entered.
     * 
     */
    @JsonProperty("entryType")
    public Device_UdiCarrier.EntryType getEntryType() {
        return entryType;
    }

    /**
     * A coded entry to indicate how the data was entered.
     * 
     */
    @JsonProperty("entryType")
    public void setEntryType(Device_UdiCarrier.EntryType entryType) {
        this.entryType = entryType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_entryType")
    public Element get_entryType() {
        return _entryType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_entryType")
    public void set_entryType(Element _entryType) {
        this._entryType = _entryType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Device_UdiCarrier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("modifierExtension");
        sb.append('=');
        sb.append(((this.modifierExtension == null)?"<null>":this.modifierExtension));
        sb.append(',');
        sb.append("deviceIdentifier");
        sb.append('=');
        sb.append(((this.deviceIdentifier == null)?"<null>":this.deviceIdentifier));
        sb.append(',');
        sb.append("_deviceIdentifier");
        sb.append('=');
        sb.append(((this._deviceIdentifier == null)?"<null>":this._deviceIdentifier));
        sb.append(',');
        sb.append("issuer");
        sb.append('=');
        sb.append(((this.issuer == null)?"<null>":this.issuer));
        sb.append(',');
        sb.append("_issuer");
        sb.append('=');
        sb.append(((this._issuer == null)?"<null>":this._issuer));
        sb.append(',');
        sb.append("jurisdiction");
        sb.append('=');
        sb.append(((this.jurisdiction == null)?"<null>":this.jurisdiction));
        sb.append(',');
        sb.append("_jurisdiction");
        sb.append('=');
        sb.append(((this._jurisdiction == null)?"<null>":this._jurisdiction));
        sb.append(',');
        sb.append("carrierAIDC");
        sb.append('=');
        sb.append(((this.carrierAIDC == null)?"<null>":this.carrierAIDC));
        sb.append(',');
        sb.append("_carrierAIDC");
        sb.append('=');
        sb.append(((this._carrierAIDC == null)?"<null>":this._carrierAIDC));
        sb.append(',');
        sb.append("carrierHRF");
        sb.append('=');
        sb.append(((this.carrierHRF == null)?"<null>":this.carrierHRF));
        sb.append(',');
        sb.append("_carrierHRF");
        sb.append('=');
        sb.append(((this._carrierHRF == null)?"<null>":this._carrierHRF));
        sb.append(',');
        sb.append("entryType");
        sb.append('=');
        sb.append(((this.entryType == null)?"<null>":this.entryType));
        sb.append(',');
        sb.append("_entryType");
        sb.append('=');
        sb.append(((this._entryType == null)?"<null>":this._entryType));
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
        result = ((result* 31)+((this.entryType == null)? 0 :this.entryType.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._entryType == null)? 0 :this._entryType.hashCode()));
        result = ((result* 31)+((this._jurisdiction == null)? 0 :this._jurisdiction.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this._deviceIdentifier == null)? 0 :this._deviceIdentifier.hashCode()));
        result = ((result* 31)+((this.issuer == null)? 0 :this.issuer.hashCode()));
        result = ((result* 31)+((this.carrierAIDC == null)? 0 :this.carrierAIDC.hashCode()));
        result = ((result* 31)+((this.deviceIdentifier == null)? 0 :this.deviceIdentifier.hashCode()));
        result = ((result* 31)+((this._carrierHRF == null)? 0 :this._carrierHRF.hashCode()));
        result = ((result* 31)+((this.carrierHRF == null)? 0 :this.carrierHRF.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._carrierAIDC == null)? 0 :this._carrierAIDC.hashCode()));
        result = ((result* 31)+((this._issuer == null)? 0 :this._issuer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device_UdiCarrier) == false) {
            return false;
        }
        Device_UdiCarrier rhs = ((Device_UdiCarrier) other);
        return ((((((((((((((((this.entryType == rhs.entryType)||((this.entryType!= null)&&this.entryType.equals(rhs.entryType)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._entryType == rhs._entryType)||((this._entryType!= null)&&this._entryType.equals(rhs._entryType))))&&((this._jurisdiction == rhs._jurisdiction)||((this._jurisdiction!= null)&&this._jurisdiction.equals(rhs._jurisdiction))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this._deviceIdentifier == rhs._deviceIdentifier)||((this._deviceIdentifier!= null)&&this._deviceIdentifier.equals(rhs._deviceIdentifier))))&&((this.issuer == rhs.issuer)||((this.issuer!= null)&&this.issuer.equals(rhs.issuer))))&&((this.carrierAIDC == rhs.carrierAIDC)||((this.carrierAIDC!= null)&&this.carrierAIDC.equals(rhs.carrierAIDC))))&&((this.deviceIdentifier == rhs.deviceIdentifier)||((this.deviceIdentifier!= null)&&this.deviceIdentifier.equals(rhs.deviceIdentifier))))&&((this._carrierHRF == rhs._carrierHRF)||((this._carrierHRF!= null)&&this._carrierHRF.equals(rhs._carrierHRF))))&&((this.carrierHRF == rhs.carrierHRF)||((this.carrierHRF!= null)&&this.carrierHRF.equals(rhs.carrierHRF))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._carrierAIDC == rhs._carrierAIDC)||((this._carrierAIDC!= null)&&this._carrierAIDC.equals(rhs._carrierAIDC))))&&((this._issuer == rhs._issuer)||((this._issuer!= null)&&this._issuer.equals(rhs._issuer))));
    }


    /**
     * A coded entry to indicate how the data was entered.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EntryType {

        BARCODE("barcode"),
        RFID("rfid"),
        MANUAL("manual"),
        CARD("card"),
        SELF_REPORTED("self-reported"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Device_UdiCarrier.EntryType> CONSTANTS = new HashMap<String, Device_UdiCarrier.EntryType>();

        static {
            for (Device_UdiCarrier.EntryType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EntryType(String value) {
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
        public static Device_UdiCarrier.EntryType fromValue(String value) {
            Device_UdiCarrier.EntryType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}