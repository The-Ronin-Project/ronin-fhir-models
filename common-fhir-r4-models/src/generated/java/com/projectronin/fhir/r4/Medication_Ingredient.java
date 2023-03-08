
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "itemCodeableConcept",
    "itemReference",
    "isActive",
    "_isActive",
    "strength"
})
@Generated("jsonschema2pojo")
public class Medication_Ingredient {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("itemCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept itemCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference itemReference;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isActive")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean isActive;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isActive")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isActive;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("strength")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio strength;

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("itemCodeableConcept")
    public CodeableConcept getItemCodeableConcept() {
        return itemCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
        this.itemCodeableConcept = itemCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    public Reference getItemReference() {
        return itemReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    public void setItemReference(Reference itemReference) {
        this.itemReference = itemReference;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isActive")
    public Element get_isActive() {
        return _isActive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isActive")
    public void set_isActive(Element _isActive) {
        this._isActive = _isActive;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("strength")
    public Ratio getStrength() {
        return strength;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("strength")
    public void setStrength(Ratio strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Medication_Ingredient.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("itemCodeableConcept");
        sb.append('=');
        sb.append(((this.itemCodeableConcept == null)?"<null>":this.itemCodeableConcept));
        sb.append(',');
        sb.append("itemReference");
        sb.append('=');
        sb.append(((this.itemReference == null)?"<null>":this.itemReference));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("_isActive");
        sb.append('=');
        sb.append(((this._isActive == null)?"<null>":this._isActive));
        sb.append(',');
        sb.append("strength");
        sb.append('=');
        sb.append(((this.strength == null)?"<null>":this.strength));
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
        result = ((result* 31)+((this.itemReference == null)? 0 :this.itemReference.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.strength == null)? 0 :this.strength.hashCode()));
        result = ((result* 31)+((this.itemCodeableConcept == null)? 0 :this.itemCodeableConcept.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this._isActive == null)? 0 :this._isActive.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Medication_Ingredient) == false) {
            return false;
        }
        Medication_Ingredient rhs = ((Medication_Ingredient) other);
        return (((((((((this.itemReference == rhs.itemReference)||((this.itemReference!= null)&&this.itemReference.equals(rhs.itemReference)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.strength == rhs.strength)||((this.strength!= null)&&this.strength.equals(rhs.strength))))&&((this.itemCodeableConcept == rhs.itemCodeableConcept)||((this.itemCodeableConcept!= null)&&this.itemCodeableConcept.equals(rhs.itemCodeableConcept))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.isActive == rhs.isActive)||((this.isActive!= null)&&this.isActive.equals(rhs.isActive))))&&((this._isActive == rhs._isActive)||((this._isActive!= null)&&this._isActive.equals(rhs._isActive))));
    }

}
