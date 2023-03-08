
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "outcome",
    "probabilityDecimal",
    "_probabilityDecimal",
    "probabilityRange",
    "qualitativeRisk",
    "relativeRisk",
    "_relativeRisk",
    "whenPeriod",
    "whenRange",
    "rationale",
    "_rationale"
})
@Generated("jsonschema2pojo")
public class RiskAssessment_Prediction {

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
    @JsonProperty("outcome")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept outcome;
    /**
     * Indicates how likely the outcome is (in the specified timeframe).
     * 
     */
    @JsonProperty("probabilityDecimal")
    @JsonPropertyDescription("Indicates how likely the outcome is (in the specified timeframe).")
    private Double probabilityDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_probabilityDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _probabilityDecimal;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("probabilityRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range probabilityRange;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("qualitativeRisk")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept qualitativeRisk;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("relativeRisk")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double relativeRisk;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relativeRisk")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _relativeRisk;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("whenPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period whenPeriod;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("whenRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range whenRange;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("rationale")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String rationale;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rationale")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _rationale;

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
    @JsonProperty("outcome")
    public CodeableConcept getOutcome() {
        return outcome;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(CodeableConcept outcome) {
        this.outcome = outcome;
    }

    /**
     * Indicates how likely the outcome is (in the specified timeframe).
     * 
     */
    @JsonProperty("probabilityDecimal")
    public Double getProbabilityDecimal() {
        return probabilityDecimal;
    }

    /**
     * Indicates how likely the outcome is (in the specified timeframe).
     * 
     */
    @JsonProperty("probabilityDecimal")
    public void setProbabilityDecimal(Double probabilityDecimal) {
        this.probabilityDecimal = probabilityDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_probabilityDecimal")
    public Element get_probabilityDecimal() {
        return _probabilityDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_probabilityDecimal")
    public void set_probabilityDecimal(Element _probabilityDecimal) {
        this._probabilityDecimal = _probabilityDecimal;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("probabilityRange")
    public Range getProbabilityRange() {
        return probabilityRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("probabilityRange")
    public void setProbabilityRange(Range probabilityRange) {
        this.probabilityRange = probabilityRange;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("qualitativeRisk")
    public CodeableConcept getQualitativeRisk() {
        return qualitativeRisk;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("qualitativeRisk")
    public void setQualitativeRisk(CodeableConcept qualitativeRisk) {
        this.qualitativeRisk = qualitativeRisk;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("relativeRisk")
    public Double getRelativeRisk() {
        return relativeRisk;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("relativeRisk")
    public void setRelativeRisk(Double relativeRisk) {
        this.relativeRisk = relativeRisk;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relativeRisk")
    public Element get_relativeRisk() {
        return _relativeRisk;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relativeRisk")
    public void set_relativeRisk(Element _relativeRisk) {
        this._relativeRisk = _relativeRisk;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("whenPeriod")
    public Period getWhenPeriod() {
        return whenPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("whenPeriod")
    public void setWhenPeriod(Period whenPeriod) {
        this.whenPeriod = whenPeriod;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("whenRange")
    public Range getWhenRange() {
        return whenRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("whenRange")
    public void setWhenRange(Range whenRange) {
        this.whenRange = whenRange;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("rationale")
    public String getRationale() {
        return rationale;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("rationale")
    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rationale")
    public Element get_rationale() {
        return _rationale;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rationale")
    public void set_rationale(Element _rationale) {
        this._rationale = _rationale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RiskAssessment_Prediction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("probabilityDecimal");
        sb.append('=');
        sb.append(((this.probabilityDecimal == null)?"<null>":this.probabilityDecimal));
        sb.append(',');
        sb.append("_probabilityDecimal");
        sb.append('=');
        sb.append(((this._probabilityDecimal == null)?"<null>":this._probabilityDecimal));
        sb.append(',');
        sb.append("probabilityRange");
        sb.append('=');
        sb.append(((this.probabilityRange == null)?"<null>":this.probabilityRange));
        sb.append(',');
        sb.append("qualitativeRisk");
        sb.append('=');
        sb.append(((this.qualitativeRisk == null)?"<null>":this.qualitativeRisk));
        sb.append(',');
        sb.append("relativeRisk");
        sb.append('=');
        sb.append(((this.relativeRisk == null)?"<null>":this.relativeRisk));
        sb.append(',');
        sb.append("_relativeRisk");
        sb.append('=');
        sb.append(((this._relativeRisk == null)?"<null>":this._relativeRisk));
        sb.append(',');
        sb.append("whenPeriod");
        sb.append('=');
        sb.append(((this.whenPeriod == null)?"<null>":this.whenPeriod));
        sb.append(',');
        sb.append("whenRange");
        sb.append('=');
        sb.append(((this.whenRange == null)?"<null>":this.whenRange));
        sb.append(',');
        sb.append("rationale");
        sb.append('=');
        sb.append(((this.rationale == null)?"<null>":this.rationale));
        sb.append(',');
        sb.append("_rationale");
        sb.append('=');
        sb.append(((this._rationale == null)?"<null>":this._rationale));
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
        result = ((result* 31)+((this.qualitativeRisk == null)? 0 :this.qualitativeRisk.hashCode()));
        result = ((result* 31)+((this._rationale == null)? 0 :this._rationale.hashCode()));
        result = ((result* 31)+((this.probabilityRange == null)? 0 :this.probabilityRange.hashCode()));
        result = ((result* 31)+((this.whenPeriod == null)? 0 :this.whenPeriod.hashCode()));
        result = ((result* 31)+((this.whenRange == null)? 0 :this.whenRange.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.probabilityDecimal == null)? 0 :this.probabilityDecimal.hashCode()));
        result = ((result* 31)+((this.rationale == null)? 0 :this.rationale.hashCode()));
        result = ((result* 31)+((this.relativeRisk == null)? 0 :this.relativeRisk.hashCode()));
        result = ((result* 31)+((this._probabilityDecimal == null)? 0 :this._probabilityDecimal.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._relativeRisk == null)? 0 :this._relativeRisk.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskAssessment_Prediction) == false) {
            return false;
        }
        RiskAssessment_Prediction rhs = ((RiskAssessment_Prediction) other);
        return (((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.qualitativeRisk == rhs.qualitativeRisk)||((this.qualitativeRisk!= null)&&this.qualitativeRisk.equals(rhs.qualitativeRisk))))&&((this._rationale == rhs._rationale)||((this._rationale!= null)&&this._rationale.equals(rhs._rationale))))&&((this.probabilityRange == rhs.probabilityRange)||((this.probabilityRange!= null)&&this.probabilityRange.equals(rhs.probabilityRange))))&&((this.whenPeriod == rhs.whenPeriod)||((this.whenPeriod!= null)&&this.whenPeriod.equals(rhs.whenPeriod))))&&((this.whenRange == rhs.whenRange)||((this.whenRange!= null)&&this.whenRange.equals(rhs.whenRange))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.probabilityDecimal == rhs.probabilityDecimal)||((this.probabilityDecimal!= null)&&this.probabilityDecimal.equals(rhs.probabilityDecimal))))&&((this.rationale == rhs.rationale)||((this.rationale!= null)&&this.rationale.equals(rhs.rationale))))&&((this.relativeRisk == rhs.relativeRisk)||((this.relativeRisk!= null)&&this.relativeRisk.equals(rhs.relativeRisk))))&&((this._probabilityDecimal == rhs._probabilityDecimal)||((this._probabilityDecimal!= null)&&this._probabilityDecimal.equals(rhs._probabilityDecimal))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._relativeRisk == rhs._relativeRisk)||((this._relativeRisk!= null)&&this._relativeRisk.equals(rhs._relativeRisk))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))));
    }

}
