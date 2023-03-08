
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A pharmaceutical product described in terms of its composition and dose form.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "firstDose",
    "maxSingleDose",
    "maxDosePerDay",
    "maxDosePerTreatmentPeriod",
    "maxTreatmentPeriod",
    "targetSpecies"
})
@Generated("jsonschema2pojo")
public class MedicinalProductPharmaceutical_RouteOfAdministration {

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
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("firstDose")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity firstDose;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxSingleDose")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity maxSingleDose;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerDay")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity maxDosePerDay;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("maxDosePerTreatmentPeriod")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio maxDosePerTreatmentPeriod;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("maxTreatmentPeriod")
    @JsonPropertyDescription("A length of time.")
    private Duration maxTreatmentPeriod;
    /**
     * A species for which this route applies.
     * 
     */
    @JsonProperty("targetSpecies")
    @JsonPropertyDescription("A species for which this route applies.")
    private List<MedicinalProductPharmaceutical_TargetSpecies> targetSpecies = new ArrayList<MedicinalProductPharmaceutical_TargetSpecies>();

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
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("firstDose")
    public Quantity getFirstDose() {
        return firstDose;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("firstDose")
    public void setFirstDose(Quantity firstDose) {
        this.firstDose = firstDose;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxSingleDose")
    public Quantity getMaxSingleDose() {
        return maxSingleDose;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxSingleDose")
    public void setMaxSingleDose(Quantity maxSingleDose) {
        this.maxSingleDose = maxSingleDose;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerDay")
    public Quantity getMaxDosePerDay() {
        return maxDosePerDay;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerDay")
    public void setMaxDosePerDay(Quantity maxDosePerDay) {
        this.maxDosePerDay = maxDosePerDay;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("maxDosePerTreatmentPeriod")
    public Ratio getMaxDosePerTreatmentPeriod() {
        return maxDosePerTreatmentPeriod;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("maxDosePerTreatmentPeriod")
    public void setMaxDosePerTreatmentPeriod(Ratio maxDosePerTreatmentPeriod) {
        this.maxDosePerTreatmentPeriod = maxDosePerTreatmentPeriod;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("maxTreatmentPeriod")
    public Duration getMaxTreatmentPeriod() {
        return maxTreatmentPeriod;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("maxTreatmentPeriod")
    public void setMaxTreatmentPeriod(Duration maxTreatmentPeriod) {
        this.maxTreatmentPeriod = maxTreatmentPeriod;
    }

    /**
     * A species for which this route applies.
     * 
     */
    @JsonProperty("targetSpecies")
    public List<MedicinalProductPharmaceutical_TargetSpecies> getTargetSpecies() {
        return targetSpecies;
    }

    /**
     * A species for which this route applies.
     * 
     */
    @JsonProperty("targetSpecies")
    public void setTargetSpecies(List<MedicinalProductPharmaceutical_TargetSpecies> targetSpecies) {
        this.targetSpecies = targetSpecies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicinalProductPharmaceutical_RouteOfAdministration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("firstDose");
        sb.append('=');
        sb.append(((this.firstDose == null)?"<null>":this.firstDose));
        sb.append(',');
        sb.append("maxSingleDose");
        sb.append('=');
        sb.append(((this.maxSingleDose == null)?"<null>":this.maxSingleDose));
        sb.append(',');
        sb.append("maxDosePerDay");
        sb.append('=');
        sb.append(((this.maxDosePerDay == null)?"<null>":this.maxDosePerDay));
        sb.append(',');
        sb.append("maxDosePerTreatmentPeriod");
        sb.append('=');
        sb.append(((this.maxDosePerTreatmentPeriod == null)?"<null>":this.maxDosePerTreatmentPeriod));
        sb.append(',');
        sb.append("maxTreatmentPeriod");
        sb.append('=');
        sb.append(((this.maxTreatmentPeriod == null)?"<null>":this.maxTreatmentPeriod));
        sb.append(',');
        sb.append("targetSpecies");
        sb.append('=');
        sb.append(((this.targetSpecies == null)?"<null>":this.targetSpecies));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.maxSingleDose == null)? 0 :this.maxSingleDose.hashCode()));
        result = ((result* 31)+((this.maxTreatmentPeriod == null)? 0 :this.maxTreatmentPeriod.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.targetSpecies == null)? 0 :this.targetSpecies.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.firstDose == null)? 0 :this.firstDose.hashCode()));
        result = ((result* 31)+((this.maxDosePerDay == null)? 0 :this.maxDosePerDay.hashCode()));
        result = ((result* 31)+((this.maxDosePerTreatmentPeriod == null)? 0 :this.maxDosePerTreatmentPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductPharmaceutical_RouteOfAdministration) == false) {
            return false;
        }
        MedicinalProductPharmaceutical_RouteOfAdministration rhs = ((MedicinalProductPharmaceutical_RouteOfAdministration) other);
        return (((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.maxSingleDose == rhs.maxSingleDose)||((this.maxSingleDose!= null)&&this.maxSingleDose.equals(rhs.maxSingleDose))))&&((this.maxTreatmentPeriod == rhs.maxTreatmentPeriod)||((this.maxTreatmentPeriod!= null)&&this.maxTreatmentPeriod.equals(rhs.maxTreatmentPeriod))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.targetSpecies == rhs.targetSpecies)||((this.targetSpecies!= null)&&this.targetSpecies.equals(rhs.targetSpecies))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.firstDose == rhs.firstDose)||((this.firstDose!= null)&&this.firstDose.equals(rhs.firstDose))))&&((this.maxDosePerDay == rhs.maxDosePerDay)||((this.maxDosePerDay!= null)&&this.maxDosePerDay.equals(rhs.maxDosePerDay))))&&((this.maxDosePerTreatmentPeriod == rhs.maxDosePerTreatmentPeriod)||((this.maxDosePerTreatmentPeriod!= null)&&this.maxDosePerTreatmentPeriod.equals(rhs.maxDosePerTreatmentPeriod))));
    }

}
