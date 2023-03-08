
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "customaryUnit",
    "unit",
    "conversionFactor",
    "_conversionFactor",
    "decimalPrecision",
    "_decimalPrecision"
})
@Generated("jsonschema2pojo")
public class ObservationDefinition_QuantitativeDetails {

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
    @JsonProperty("customaryUnit")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept customaryUnit;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unit")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept unit;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("conversionFactor")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double conversionFactor;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conversionFactor")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _conversionFactor;
    /**
     * A whole number
     * 
     */
    @JsonProperty("decimalPrecision")
    @JsonPropertyDescription("A whole number")
    private Double decimalPrecision;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_decimalPrecision")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _decimalPrecision;

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
    @JsonProperty("customaryUnit")
    public CodeableConcept getCustomaryUnit() {
        return customaryUnit;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("customaryUnit")
    public void setCustomaryUnit(CodeableConcept customaryUnit) {
        this.customaryUnit = customaryUnit;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unit")
    public CodeableConcept getUnit() {
        return unit;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unit")
    public void setUnit(CodeableConcept unit) {
        this.unit = unit;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("conversionFactor")
    public Double getConversionFactor() {
        return conversionFactor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("conversionFactor")
    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conversionFactor")
    public Element get_conversionFactor() {
        return _conversionFactor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conversionFactor")
    public void set_conversionFactor(Element _conversionFactor) {
        this._conversionFactor = _conversionFactor;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("decimalPrecision")
    public Double getDecimalPrecision() {
        return decimalPrecision;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("decimalPrecision")
    public void setDecimalPrecision(Double decimalPrecision) {
        this.decimalPrecision = decimalPrecision;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_decimalPrecision")
    public Element get_decimalPrecision() {
        return _decimalPrecision;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_decimalPrecision")
    public void set_decimalPrecision(Element _decimalPrecision) {
        this._decimalPrecision = _decimalPrecision;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObservationDefinition_QuantitativeDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("customaryUnit");
        sb.append('=');
        sb.append(((this.customaryUnit == null)?"<null>":this.customaryUnit));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("conversionFactor");
        sb.append('=');
        sb.append(((this.conversionFactor == null)?"<null>":this.conversionFactor));
        sb.append(',');
        sb.append("_conversionFactor");
        sb.append('=');
        sb.append(((this._conversionFactor == null)?"<null>":this._conversionFactor));
        sb.append(',');
        sb.append("decimalPrecision");
        sb.append('=');
        sb.append(((this.decimalPrecision == null)?"<null>":this.decimalPrecision));
        sb.append(',');
        sb.append("_decimalPrecision");
        sb.append('=');
        sb.append(((this._decimalPrecision == null)?"<null>":this._decimalPrecision));
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
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this._decimalPrecision == null)? 0 :this._decimalPrecision.hashCode()));
        result = ((result* 31)+((this.conversionFactor == null)? 0 :this.conversionFactor.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._conversionFactor == null)? 0 :this._conversionFactor.hashCode()));
        result = ((result* 31)+((this.customaryUnit == null)? 0 :this.customaryUnit.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.decimalPrecision == null)? 0 :this.decimalPrecision.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObservationDefinition_QuantitativeDetails) == false) {
            return false;
        }
        ObservationDefinition_QuantitativeDetails rhs = ((ObservationDefinition_QuantitativeDetails) other);
        return ((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this._decimalPrecision == rhs._decimalPrecision)||((this._decimalPrecision!= null)&&this._decimalPrecision.equals(rhs._decimalPrecision))))&&((this.conversionFactor == rhs.conversionFactor)||((this.conversionFactor!= null)&&this.conversionFactor.equals(rhs.conversionFactor))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._conversionFactor == rhs._conversionFactor)||((this._conversionFactor!= null)&&this._conversionFactor.equals(rhs._conversionFactor))))&&((this.customaryUnit == rhs.customaryUnit)||((this.customaryUnit!= null)&&this.customaryUnit.equals(rhs.customaryUnit))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.decimalPrecision == rhs.decimalPrecision)||((this.decimalPrecision!= null)&&this.decimalPrecision.equals(rhs.decimalPrecision))));
    }

}
