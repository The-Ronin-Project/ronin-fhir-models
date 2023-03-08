
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes validation requirements, source(s), status and dates for one or more elements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "who",
    "type",
    "communicationMethod",
    "validationStatus",
    "validationDate",
    "_validationDate",
    "canPushUpdates",
    "pushTypeAvailable"
})
@Generated("jsonschema2pojo")
public class VerificationResult_PrimarySource {

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference who;
    /**
     * Type of primary source (License Board; Primary Education; Continuing Education; Postal Service; Relationship owner; Registration Authority; legal source; issuing source; authoritative source).
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of primary source (License Board; Primary Education; Continuing Education; Postal Service; Relationship owner; Registration Authority; legal source; issuing source; authoritative source).")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * Method for communicating with the primary source (manual; API; Push).
     * 
     */
    @JsonProperty("communicationMethod")
    @JsonPropertyDescription("Method for communicating with the primary source (manual; API; Push).")
    private List<CodeableConcept> communicationMethod = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("validationStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept validationStatus;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("validationDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String validationDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validationDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _validationDate;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("canPushUpdates")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept canPushUpdates;
    /**
     * Type of alerts/updates the primary source can send (specific requested changes; any changes; as defined by source).
     * 
     */
    @JsonProperty("pushTypeAvailable")
    @JsonPropertyDescription("Type of alerts/updates the primary source can send (specific requested changes; any changes; as defined by source).")
    private List<CodeableConcept> pushTypeAvailable = new ArrayList<CodeableConcept>();

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    public Reference getWho() {
        return who;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    public void setWho(Reference who) {
        this.who = who;
    }

    /**
     * Type of primary source (License Board; Primary Education; Continuing Education; Postal Service; Relationship owner; Registration Authority; legal source; issuing source; authoritative source).
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * Type of primary source (License Board; Primary Education; Continuing Education; Postal Service; Relationship owner; Registration Authority; legal source; issuing source; authoritative source).
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * Method for communicating with the primary source (manual; API; Push).
     * 
     */
    @JsonProperty("communicationMethod")
    public List<CodeableConcept> getCommunicationMethod() {
        return communicationMethod;
    }

    /**
     * Method for communicating with the primary source (manual; API; Push).
     * 
     */
    @JsonProperty("communicationMethod")
    public void setCommunicationMethod(List<CodeableConcept> communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("validationStatus")
    public CodeableConcept getValidationStatus() {
        return validationStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("validationStatus")
    public void setValidationStatus(CodeableConcept validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("validationDate")
    public String getValidationDate() {
        return validationDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("validationDate")
    public void setValidationDate(String validationDate) {
        this.validationDate = validationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validationDate")
    public Element get_validationDate() {
        return _validationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validationDate")
    public void set_validationDate(Element _validationDate) {
        this._validationDate = _validationDate;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("canPushUpdates")
    public CodeableConcept getCanPushUpdates() {
        return canPushUpdates;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("canPushUpdates")
    public void setCanPushUpdates(CodeableConcept canPushUpdates) {
        this.canPushUpdates = canPushUpdates;
    }

    /**
     * Type of alerts/updates the primary source can send (specific requested changes; any changes; as defined by source).
     * 
     */
    @JsonProperty("pushTypeAvailable")
    public List<CodeableConcept> getPushTypeAvailable() {
        return pushTypeAvailable;
    }

    /**
     * Type of alerts/updates the primary source can send (specific requested changes; any changes; as defined by source).
     * 
     */
    @JsonProperty("pushTypeAvailable")
    public void setPushTypeAvailable(List<CodeableConcept> pushTypeAvailable) {
        this.pushTypeAvailable = pushTypeAvailable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VerificationResult_PrimarySource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("who");
        sb.append('=');
        sb.append(((this.who == null)?"<null>":this.who));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("communicationMethod");
        sb.append('=');
        sb.append(((this.communicationMethod == null)?"<null>":this.communicationMethod));
        sb.append(',');
        sb.append("validationStatus");
        sb.append('=');
        sb.append(((this.validationStatus == null)?"<null>":this.validationStatus));
        sb.append(',');
        sb.append("validationDate");
        sb.append('=');
        sb.append(((this.validationDate == null)?"<null>":this.validationDate));
        sb.append(',');
        sb.append("_validationDate");
        sb.append('=');
        sb.append(((this._validationDate == null)?"<null>":this._validationDate));
        sb.append(',');
        sb.append("canPushUpdates");
        sb.append('=');
        sb.append(((this.canPushUpdates == null)?"<null>":this.canPushUpdates));
        sb.append(',');
        sb.append("pushTypeAvailable");
        sb.append('=');
        sb.append(((this.pushTypeAvailable == null)?"<null>":this.pushTypeAvailable));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.pushTypeAvailable == null)? 0 :this.pushTypeAvailable.hashCode()));
        result = ((result* 31)+((this.communicationMethod == null)? 0 :this.communicationMethod.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.validationDate == null)? 0 :this.validationDate.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.validationStatus == null)? 0 :this.validationStatus.hashCode()));
        result = ((result* 31)+((this.who == null)? 0 :this.who.hashCode()));
        result = ((result* 31)+((this._validationDate == null)? 0 :this._validationDate.hashCode()));
        result = ((result* 31)+((this.canPushUpdates == null)? 0 :this.canPushUpdates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerificationResult_PrimarySource) == false) {
            return false;
        }
        VerificationResult_PrimarySource rhs = ((VerificationResult_PrimarySource) other);
        return ((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.pushTypeAvailable == rhs.pushTypeAvailable)||((this.pushTypeAvailable!= null)&&this.pushTypeAvailable.equals(rhs.pushTypeAvailable))))&&((this.communicationMethod == rhs.communicationMethod)||((this.communicationMethod!= null)&&this.communicationMethod.equals(rhs.communicationMethod))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.validationDate == rhs.validationDate)||((this.validationDate!= null)&&this.validationDate.equals(rhs.validationDate))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.validationStatus == rhs.validationStatus)||((this.validationStatus!= null)&&this.validationStatus.equals(rhs.validationStatus))))&&((this.who == rhs.who)||((this.who!= null)&&this.who.equals(rhs.who))))&&((this._validationDate == rhs._validationDate)||((this._validationDate!= null)&&this._validationDate.equals(rhs._validationDate))))&&((this.canPushUpdates == rhs.canPushUpdates)||((this.canPushUpdates!= null)&&this.canPushUpdates.equals(rhs.canPushUpdates))));
    }

}
