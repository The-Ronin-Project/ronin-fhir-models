
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Todo.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "numberOfUnits",
    "_numberOfUnits",
    "averageMolecularFormula",
    "_averageMolecularFormula",
    "repeatUnitAmountType",
    "repeatUnit"
})
@Generated("jsonschema2pojo")
public class SubstancePolymer_Repeat {

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
     * A whole number
     * 
     */
    @JsonProperty("numberOfUnits")
    @JsonPropertyDescription("A whole number")
    private Double numberOfUnits;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfUnits")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfUnits;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("averageMolecularFormula")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String averageMolecularFormula;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_averageMolecularFormula")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _averageMolecularFormula;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("repeatUnitAmountType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept repeatUnitAmountType;
    /**
     * Todo.
     * 
     */
    @JsonProperty("repeatUnit")
    @JsonPropertyDescription("Todo.")
    private List<SubstancePolymer_RepeatUnit> repeatUnit = new ArrayList<SubstancePolymer_RepeatUnit>();

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
     * A whole number
     * 
     */
    @JsonProperty("numberOfUnits")
    public Double getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfUnits")
    public void setNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfUnits")
    public Element get_numberOfUnits() {
        return _numberOfUnits;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfUnits")
    public void set_numberOfUnits(Element _numberOfUnits) {
        this._numberOfUnits = _numberOfUnits;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("averageMolecularFormula")
    public String getAverageMolecularFormula() {
        return averageMolecularFormula;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("averageMolecularFormula")
    public void setAverageMolecularFormula(String averageMolecularFormula) {
        this.averageMolecularFormula = averageMolecularFormula;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_averageMolecularFormula")
    public Element get_averageMolecularFormula() {
        return _averageMolecularFormula;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_averageMolecularFormula")
    public void set_averageMolecularFormula(Element _averageMolecularFormula) {
        this._averageMolecularFormula = _averageMolecularFormula;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("repeatUnitAmountType")
    public CodeableConcept getRepeatUnitAmountType() {
        return repeatUnitAmountType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("repeatUnitAmountType")
    public void setRepeatUnitAmountType(CodeableConcept repeatUnitAmountType) {
        this.repeatUnitAmountType = repeatUnitAmountType;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("repeatUnit")
    public List<SubstancePolymer_RepeatUnit> getRepeatUnit() {
        return repeatUnit;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("repeatUnit")
    public void setRepeatUnit(List<SubstancePolymer_RepeatUnit> repeatUnit) {
        this.repeatUnit = repeatUnit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstancePolymer_Repeat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("numberOfUnits");
        sb.append('=');
        sb.append(((this.numberOfUnits == null)?"<null>":this.numberOfUnits));
        sb.append(',');
        sb.append("_numberOfUnits");
        sb.append('=');
        sb.append(((this._numberOfUnits == null)?"<null>":this._numberOfUnits));
        sb.append(',');
        sb.append("averageMolecularFormula");
        sb.append('=');
        sb.append(((this.averageMolecularFormula == null)?"<null>":this.averageMolecularFormula));
        sb.append(',');
        sb.append("_averageMolecularFormula");
        sb.append('=');
        sb.append(((this._averageMolecularFormula == null)?"<null>":this._averageMolecularFormula));
        sb.append(',');
        sb.append("repeatUnitAmountType");
        sb.append('=');
        sb.append(((this.repeatUnitAmountType == null)?"<null>":this.repeatUnitAmountType));
        sb.append(',');
        sb.append("repeatUnit");
        sb.append('=');
        sb.append(((this.repeatUnit == null)?"<null>":this.repeatUnit));
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
        result = ((result* 31)+((this.repeatUnit == null)? 0 :this.repeatUnit.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        result = ((result* 31)+((this.repeatUnitAmountType == null)? 0 :this.repeatUnitAmountType.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.averageMolecularFormula == null)? 0 :this.averageMolecularFormula.hashCode()));
        result = ((result* 31)+((this._numberOfUnits == null)? 0 :this._numberOfUnits.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._averageMolecularFormula == null)? 0 :this._averageMolecularFormula.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstancePolymer_Repeat) == false) {
            return false;
        }
        SubstancePolymer_Repeat rhs = ((SubstancePolymer_Repeat) other);
        return ((((((((((this.repeatUnit == rhs.repeatUnit)||((this.repeatUnit!= null)&&this.repeatUnit.equals(rhs.repeatUnit)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))))&&((this.repeatUnitAmountType == rhs.repeatUnitAmountType)||((this.repeatUnitAmountType!= null)&&this.repeatUnitAmountType.equals(rhs.repeatUnitAmountType))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.averageMolecularFormula == rhs.averageMolecularFormula)||((this.averageMolecularFormula!= null)&&this.averageMolecularFormula.equals(rhs.averageMolecularFormula))))&&((this._numberOfUnits == rhs._numberOfUnits)||((this._numberOfUnits!= null)&&this._numberOfUnits.equals(rhs._numberOfUnits))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._averageMolecularFormula == rhs._averageMolecularFormula)||((this._averageMolecularFormula!= null)&&this._averageMolecularFormula.equals(rhs._averageMolecularFormula))));
    }

}
