
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
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
    "id",
    "extension",
    "modifierExtension",
    "substance",
    "alternate",
    "_alternate",
    "allergenicIndicator",
    "_allergenicIndicator"
})
@Generated("jsonschema2pojo")
public class DeviceDefinition_Material {

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
     * (Required)
     * 
     */
    @JsonProperty("substance")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept substance;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("alternate")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean alternate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_alternate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _alternate;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allergenicIndicator")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean allergenicIndicator;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allergenicIndicator")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _allergenicIndicator;

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
     * (Required)
     * 
     */
    @JsonProperty("substance")
    public CodeableConcept getSubstance() {
        return substance;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("substance")
    public void setSubstance(CodeableConcept substance) {
        this.substance = substance;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("alternate")
    public Boolean getAlternate() {
        return alternate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("alternate")
    public void setAlternate(Boolean alternate) {
        this.alternate = alternate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_alternate")
    public Element get_alternate() {
        return _alternate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_alternate")
    public void set_alternate(Element _alternate) {
        this._alternate = _alternate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allergenicIndicator")
    public Boolean getAllergenicIndicator() {
        return allergenicIndicator;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allergenicIndicator")
    public void setAllergenicIndicator(Boolean allergenicIndicator) {
        this.allergenicIndicator = allergenicIndicator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allergenicIndicator")
    public Element get_allergenicIndicator() {
        return _allergenicIndicator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allergenicIndicator")
    public void set_allergenicIndicator(Element _allergenicIndicator) {
        this._allergenicIndicator = _allergenicIndicator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeviceDefinition_Material.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("substance");
        sb.append('=');
        sb.append(((this.substance == null)?"<null>":this.substance));
        sb.append(',');
        sb.append("alternate");
        sb.append('=');
        sb.append(((this.alternate == null)?"<null>":this.alternate));
        sb.append(',');
        sb.append("_alternate");
        sb.append('=');
        sb.append(((this._alternate == null)?"<null>":this._alternate));
        sb.append(',');
        sb.append("allergenicIndicator");
        sb.append('=');
        sb.append(((this.allergenicIndicator == null)?"<null>":this.allergenicIndicator));
        sb.append(',');
        sb.append("_allergenicIndicator");
        sb.append('=');
        sb.append(((this._allergenicIndicator == null)?"<null>":this._allergenicIndicator));
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
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.substance == null)? 0 :this.substance.hashCode()));
        result = ((result* 31)+((this.alternate == null)? 0 :this.alternate.hashCode()));
        result = ((result* 31)+((this._allergenicIndicator == null)? 0 :this._allergenicIndicator.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.allergenicIndicator == null)? 0 :this.allergenicIndicator.hashCode()));
        result = ((result* 31)+((this._alternate == null)? 0 :this._alternate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceDefinition_Material) == false) {
            return false;
        }
        DeviceDefinition_Material rhs = ((DeviceDefinition_Material) other);
        return (((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.substance == rhs.substance)||((this.substance!= null)&&this.substance.equals(rhs.substance))))&&((this.alternate == rhs.alternate)||((this.alternate!= null)&&this.alternate.equals(rhs.alternate))))&&((this._allergenicIndicator == rhs._allergenicIndicator)||((this._allergenicIndicator!= null)&&this._allergenicIndicator.equals(rhs._allergenicIndicator))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.allergenicIndicator == rhs.allergenicIndicator)||((this.allergenicIndicator!= null)&&this.allergenicIndicator.equals(rhs.allergenicIndicator))))&&((this._alternate == rhs._alternate)||((this._alternate!= null)&&this._alternate.equals(rhs._alternate))));
    }

}
