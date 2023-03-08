
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "description",
    "_description",
    "type",
    "value",
    "_value",
    "unitOfMeasure",
    "denominatorCount",
    "_denominatorCount",
    "numeratorCount",
    "_numeratorCount",
    "precisionEstimate"
})
@Generated("jsonschema2pojo")
public class RiskEvidenceSynthesis_RiskEstimate {

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
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double value;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _value;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfMeasure")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept unitOfMeasure;
    /**
     * A whole number
     * 
     */
    @JsonProperty("denominatorCount")
    @JsonPropertyDescription("A whole number")
    private Double denominatorCount;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_denominatorCount")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _denominatorCount;
    /**
     * A whole number
     * 
     */
    @JsonProperty("numeratorCount")
    @JsonPropertyDescription("A whole number")
    private Double numeratorCount;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numeratorCount")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numeratorCount;
    /**
     * A description of the precision of the estimate for the effect.
     * 
     */
    @JsonProperty("precisionEstimate")
    @JsonPropertyDescription("A description of the precision of the estimate for the effect.")
    private List<RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate = new ArrayList<RiskEvidenceSynthesis_PrecisionEstimate>();

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
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public Element get_value() {
        return _value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public void set_value(Element _value) {
        this._value = _value;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfMeasure")
    public CodeableConcept getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(CodeableConcept unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("denominatorCount")
    public Double getDenominatorCount() {
        return denominatorCount;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("denominatorCount")
    public void setDenominatorCount(Double denominatorCount) {
        this.denominatorCount = denominatorCount;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_denominatorCount")
    public Element get_denominatorCount() {
        return _denominatorCount;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_denominatorCount")
    public void set_denominatorCount(Element _denominatorCount) {
        this._denominatorCount = _denominatorCount;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numeratorCount")
    public Double getNumeratorCount() {
        return numeratorCount;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numeratorCount")
    public void setNumeratorCount(Double numeratorCount) {
        this.numeratorCount = numeratorCount;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numeratorCount")
    public Element get_numeratorCount() {
        return _numeratorCount;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numeratorCount")
    public void set_numeratorCount(Element _numeratorCount) {
        this._numeratorCount = _numeratorCount;
    }

    /**
     * A description of the precision of the estimate for the effect.
     * 
     */
    @JsonProperty("precisionEstimate")
    public List<RiskEvidenceSynthesis_PrecisionEstimate> getPrecisionEstimate() {
        return precisionEstimate;
    }

    /**
     * A description of the precision of the estimate for the effect.
     * 
     */
    @JsonProperty("precisionEstimate")
    public void setPrecisionEstimate(List<RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate) {
        this.precisionEstimate = precisionEstimate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RiskEvidenceSynthesis_RiskEstimate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("_value");
        sb.append('=');
        sb.append(((this._value == null)?"<null>":this._value));
        sb.append(',');
        sb.append("unitOfMeasure");
        sb.append('=');
        sb.append(((this.unitOfMeasure == null)?"<null>":this.unitOfMeasure));
        sb.append(',');
        sb.append("denominatorCount");
        sb.append('=');
        sb.append(((this.denominatorCount == null)?"<null>":this.denominatorCount));
        sb.append(',');
        sb.append("_denominatorCount");
        sb.append('=');
        sb.append(((this._denominatorCount == null)?"<null>":this._denominatorCount));
        sb.append(',');
        sb.append("numeratorCount");
        sb.append('=');
        sb.append(((this.numeratorCount == null)?"<null>":this.numeratorCount));
        sb.append(',');
        sb.append("_numeratorCount");
        sb.append('=');
        sb.append(((this._numeratorCount == null)?"<null>":this._numeratorCount));
        sb.append(',');
        sb.append("precisionEstimate");
        sb.append('=');
        sb.append(((this.precisionEstimate == null)?"<null>":this.precisionEstimate));
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
        result = ((result* 31)+((this._numeratorCount == null)? 0 :this._numeratorCount.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.unitOfMeasure == null)? 0 :this.unitOfMeasure.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._denominatorCount == null)? 0 :this._denominatorCount.hashCode()));
        result = ((result* 31)+((this.numeratorCount == null)? 0 :this.numeratorCount.hashCode()));
        result = ((result* 31)+((this.denominatorCount == null)? 0 :this.denominatorCount.hashCode()));
        result = ((result* 31)+((this.precisionEstimate == null)? 0 :this.precisionEstimate.hashCode()));
        result = ((result* 31)+((this._value == null)? 0 :this._value.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskEvidenceSynthesis_RiskEstimate) == false) {
            return false;
        }
        RiskEvidenceSynthesis_RiskEstimate rhs = ((RiskEvidenceSynthesis_RiskEstimate) other);
        return (((((((((((((((this._numeratorCount == rhs._numeratorCount)||((this._numeratorCount!= null)&&this._numeratorCount.equals(rhs._numeratorCount)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.unitOfMeasure == rhs.unitOfMeasure)||((this.unitOfMeasure!= null)&&this.unitOfMeasure.equals(rhs.unitOfMeasure))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._denominatorCount == rhs._denominatorCount)||((this._denominatorCount!= null)&&this._denominatorCount.equals(rhs._denominatorCount))))&&((this.numeratorCount == rhs.numeratorCount)||((this.numeratorCount!= null)&&this.numeratorCount.equals(rhs.numeratorCount))))&&((this.denominatorCount == rhs.denominatorCount)||((this.denominatorCount!= null)&&this.denominatorCount.equals(rhs.denominatorCount))))&&((this.precisionEstimate == rhs.precisionEstimate)||((this.precisionEstimate!= null)&&this.precisionEstimate.equals(rhs.precisionEstimate))))&&((this._value == rhs._value)||((this._value!= null)&&this._value.equals(rhs._value))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
