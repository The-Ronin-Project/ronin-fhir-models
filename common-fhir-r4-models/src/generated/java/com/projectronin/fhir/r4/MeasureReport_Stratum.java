
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "value",
    "component",
    "population",
    "measureScore"
})
@Generated("jsonschema2pojo")
public class MeasureReport_Stratum {

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
    @JsonProperty("value")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept value;
    /**
     * A stratifier component value.
     * 
     */
    @JsonProperty("component")
    @JsonPropertyDescription("A stratifier component value.")
    private List<MeasureReport_Component> component = new ArrayList<MeasureReport_Component>();
    /**
     * The populations that make up the stratum, one for each type of population appropriate to the measure.
     * 
     */
    @JsonProperty("population")
    @JsonPropertyDescription("The populations that make up the stratum, one for each type of population appropriate to the measure.")
    private List<MeasureReport_Population1> population = new ArrayList<MeasureReport_Population1>();
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("measureScore")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity measureScore;

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
    @JsonProperty("value")
    public CodeableConcept getValue() {
        return value;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("value")
    public void setValue(CodeableConcept value) {
        this.value = value;
    }

    /**
     * A stratifier component value.
     * 
     */
    @JsonProperty("component")
    public List<MeasureReport_Component> getComponent() {
        return component;
    }

    /**
     * A stratifier component value.
     * 
     */
    @JsonProperty("component")
    public void setComponent(List<MeasureReport_Component> component) {
        this.component = component;
    }

    /**
     * The populations that make up the stratum, one for each type of population appropriate to the measure.
     * 
     */
    @JsonProperty("population")
    public List<MeasureReport_Population1> getPopulation() {
        return population;
    }

    /**
     * The populations that make up the stratum, one for each type of population appropriate to the measure.
     * 
     */
    @JsonProperty("population")
    public void setPopulation(List<MeasureReport_Population1> population) {
        this.population = population;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("measureScore")
    public Quantity getMeasureScore() {
        return measureScore;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("measureScore")
    public void setMeasureScore(Quantity measureScore) {
        this.measureScore = measureScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MeasureReport_Stratum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
        sb.append(',');
        sb.append("population");
        sb.append('=');
        sb.append(((this.population == null)?"<null>":this.population));
        sb.append(',');
        sb.append("measureScore");
        sb.append('=');
        sb.append(((this.measureScore == null)?"<null>":this.measureScore));
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
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.measureScore == null)? 0 :this.measureScore.hashCode()));
        result = ((result* 31)+((this.population == null)? 0 :this.population.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeasureReport_Stratum) == false) {
            return false;
        }
        MeasureReport_Stratum rhs = ((MeasureReport_Stratum) other);
        return ((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.measureScore == rhs.measureScore)||((this.measureScore!= null)&&this.measureScore.equals(rhs.measureScore))))&&((this.population == rhs.population)||((this.population!= null)&&this.population.equals(rhs.population))));
    }

}