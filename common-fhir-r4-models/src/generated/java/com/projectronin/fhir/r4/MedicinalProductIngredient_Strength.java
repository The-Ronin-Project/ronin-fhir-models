
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An ingredient of a manufactured item or pharmaceutical product.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "presentation",
    "presentationLowLimit",
    "concentration",
    "concentrationLowLimit",
    "measurementPoint",
    "_measurementPoint",
    "country",
    "referenceStrength"
})
@Generated("jsonschema2pojo")
public class MedicinalProductIngredient_Strength {

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
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * (Required)
     * 
     */
    @JsonProperty("presentation")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio presentation;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("presentationLowLimit")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio presentationLowLimit;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("concentration")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio concentration;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("concentrationLowLimit")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio concentrationLowLimit;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("measurementPoint")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String measurementPoint;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_measurementPoint")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _measurementPoint;
    /**
     * The country or countries for which the strength range applies.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country or countries for which the strength range applies.")
    private List<CodeableConcept> country = new ArrayList<CodeableConcept>();
    /**
     * Strength expressed in terms of a reference substance.
     * 
     */
    @JsonProperty("referenceStrength")
    @JsonPropertyDescription("Strength expressed in terms of a reference substance.")
    private List<MedicinalProductIngredient_ReferenceStrength> referenceStrength = new ArrayList<MedicinalProductIngredient_ReferenceStrength>();

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
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * (Required)
     * 
     */
    @JsonProperty("presentation")
    public Ratio getPresentation() {
        return presentation;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * (Required)
     * 
     */
    @JsonProperty("presentation")
    public void setPresentation(Ratio presentation) {
        this.presentation = presentation;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("presentationLowLimit")
    public Ratio getPresentationLowLimit() {
        return presentationLowLimit;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("presentationLowLimit")
    public void setPresentationLowLimit(Ratio presentationLowLimit) {
        this.presentationLowLimit = presentationLowLimit;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("concentration")
    public Ratio getConcentration() {
        return concentration;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("concentration")
    public void setConcentration(Ratio concentration) {
        this.concentration = concentration;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("concentrationLowLimit")
    public Ratio getConcentrationLowLimit() {
        return concentrationLowLimit;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("concentrationLowLimit")
    public void setConcentrationLowLimit(Ratio concentrationLowLimit) {
        this.concentrationLowLimit = concentrationLowLimit;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("measurementPoint")
    public String getMeasurementPoint() {
        return measurementPoint;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("measurementPoint")
    public void setMeasurementPoint(String measurementPoint) {
        this.measurementPoint = measurementPoint;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_measurementPoint")
    public Element get_measurementPoint() {
        return _measurementPoint;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_measurementPoint")
    public void set_measurementPoint(Element _measurementPoint) {
        this._measurementPoint = _measurementPoint;
    }

    /**
     * The country or countries for which the strength range applies.
     * 
     */
    @JsonProperty("country")
    public List<CodeableConcept> getCountry() {
        return country;
    }

    /**
     * The country or countries for which the strength range applies.
     * 
     */
    @JsonProperty("country")
    public void setCountry(List<CodeableConcept> country) {
        this.country = country;
    }

    /**
     * Strength expressed in terms of a reference substance.
     * 
     */
    @JsonProperty("referenceStrength")
    public List<MedicinalProductIngredient_ReferenceStrength> getReferenceStrength() {
        return referenceStrength;
    }

    /**
     * Strength expressed in terms of a reference substance.
     * 
     */
    @JsonProperty("referenceStrength")
    public void setReferenceStrength(List<MedicinalProductIngredient_ReferenceStrength> referenceStrength) {
        this.referenceStrength = referenceStrength;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicinalProductIngredient_Strength.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("presentation");
        sb.append('=');
        sb.append(((this.presentation == null)?"<null>":this.presentation));
        sb.append(',');
        sb.append("presentationLowLimit");
        sb.append('=');
        sb.append(((this.presentationLowLimit == null)?"<null>":this.presentationLowLimit));
        sb.append(',');
        sb.append("concentration");
        sb.append('=');
        sb.append(((this.concentration == null)?"<null>":this.concentration));
        sb.append(',');
        sb.append("concentrationLowLimit");
        sb.append('=');
        sb.append(((this.concentrationLowLimit == null)?"<null>":this.concentrationLowLimit));
        sb.append(',');
        sb.append("measurementPoint");
        sb.append('=');
        sb.append(((this.measurementPoint == null)?"<null>":this.measurementPoint));
        sb.append(',');
        sb.append("_measurementPoint");
        sb.append('=');
        sb.append(((this._measurementPoint == null)?"<null>":this._measurementPoint));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("referenceStrength");
        sb.append('=');
        sb.append(((this.referenceStrength == null)?"<null>":this.referenceStrength));
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
        result = ((result* 31)+((this.presentation == null)? 0 :this.presentation.hashCode()));
        result = ((result* 31)+((this.concentrationLowLimit == null)? 0 :this.concentrationLowLimit.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._measurementPoint == null)? 0 :this._measurementPoint.hashCode()));
        result = ((result* 31)+((this.referenceStrength == null)? 0 :this.referenceStrength.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.concentration == null)? 0 :this.concentration.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.presentationLowLimit == null)? 0 :this.presentationLowLimit.hashCode()));
        result = ((result* 31)+((this.measurementPoint == null)? 0 :this.measurementPoint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductIngredient_Strength) == false) {
            return false;
        }
        MedicinalProductIngredient_Strength rhs = ((MedicinalProductIngredient_Strength) other);
        return ((((((((((((this.presentation == rhs.presentation)||((this.presentation!= null)&&this.presentation.equals(rhs.presentation)))&&((this.concentrationLowLimit == rhs.concentrationLowLimit)||((this.concentrationLowLimit!= null)&&this.concentrationLowLimit.equals(rhs.concentrationLowLimit))))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._measurementPoint == rhs._measurementPoint)||((this._measurementPoint!= null)&&this._measurementPoint.equals(rhs._measurementPoint))))&&((this.referenceStrength == rhs.referenceStrength)||((this.referenceStrength!= null)&&this.referenceStrength.equals(rhs.referenceStrength))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.concentration == rhs.concentration)||((this.concentration!= null)&&this.concentration.equals(rhs.concentration))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.presentationLowLimit == rhs.presentationLowLimit)||((this.presentationLowLimit!= null)&&this.presentationLowLimit.equals(rhs.presentationLowLimit))))&&((this.measurementPoint == rhs.measurementPoint)||((this.measurementPoint!= null)&&this.measurementPoint.equals(rhs.measurementPoint))));
    }

}
