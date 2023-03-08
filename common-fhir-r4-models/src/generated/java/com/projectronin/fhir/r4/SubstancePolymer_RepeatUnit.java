
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
    "orientationOfPolymerisation",
    "repeatUnit",
    "_repeatUnit",
    "amount",
    "degreeOfPolymerisation",
    "structuralRepresentation"
})
@Generated("jsonschema2pojo")
public class SubstancePolymer_RepeatUnit {

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
    @JsonProperty("orientationOfPolymerisation")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept orientationOfPolymerisation;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("repeatUnit")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String repeatUnit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repeatUnit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _repeatUnit;
    /**
     * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.")
    private SubstanceAmount amount;
    /**
     * Todo.
     * 
     */
    @JsonProperty("degreeOfPolymerisation")
    @JsonPropertyDescription("Todo.")
    private List<SubstancePolymer_DegreeOfPolymerisation> degreeOfPolymerisation = new ArrayList<SubstancePolymer_DegreeOfPolymerisation>();
    /**
     * Todo.
     * 
     */
    @JsonProperty("structuralRepresentation")
    @JsonPropertyDescription("Todo.")
    private List<SubstancePolymer_StructuralRepresentation> structuralRepresentation = new ArrayList<SubstancePolymer_StructuralRepresentation>();

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
    @JsonProperty("orientationOfPolymerisation")
    public CodeableConcept getOrientationOfPolymerisation() {
        return orientationOfPolymerisation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("orientationOfPolymerisation")
    public void setOrientationOfPolymerisation(CodeableConcept orientationOfPolymerisation) {
        this.orientationOfPolymerisation = orientationOfPolymerisation;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("repeatUnit")
    public String getRepeatUnit() {
        return repeatUnit;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("repeatUnit")
    public void setRepeatUnit(String repeatUnit) {
        this.repeatUnit = repeatUnit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repeatUnit")
    public Element get_repeatUnit() {
        return _repeatUnit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repeatUnit")
    public void set_repeatUnit(Element _repeatUnit) {
        this._repeatUnit = _repeatUnit;
    }

    /**
     * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
     * 
     */
    @JsonProperty("amount")
    public SubstanceAmount getAmount() {
        return amount;
    }

    /**
     * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(SubstanceAmount amount) {
        this.amount = amount;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("degreeOfPolymerisation")
    public List<SubstancePolymer_DegreeOfPolymerisation> getDegreeOfPolymerisation() {
        return degreeOfPolymerisation;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("degreeOfPolymerisation")
    public void setDegreeOfPolymerisation(List<SubstancePolymer_DegreeOfPolymerisation> degreeOfPolymerisation) {
        this.degreeOfPolymerisation = degreeOfPolymerisation;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("structuralRepresentation")
    public List<SubstancePolymer_StructuralRepresentation> getStructuralRepresentation() {
        return structuralRepresentation;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("structuralRepresentation")
    public void setStructuralRepresentation(List<SubstancePolymer_StructuralRepresentation> structuralRepresentation) {
        this.structuralRepresentation = structuralRepresentation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstancePolymer_RepeatUnit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("orientationOfPolymerisation");
        sb.append('=');
        sb.append(((this.orientationOfPolymerisation == null)?"<null>":this.orientationOfPolymerisation));
        sb.append(',');
        sb.append("repeatUnit");
        sb.append('=');
        sb.append(((this.repeatUnit == null)?"<null>":this.repeatUnit));
        sb.append(',');
        sb.append("_repeatUnit");
        sb.append('=');
        sb.append(((this._repeatUnit == null)?"<null>":this._repeatUnit));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("degreeOfPolymerisation");
        sb.append('=');
        sb.append(((this.degreeOfPolymerisation == null)?"<null>":this.degreeOfPolymerisation));
        sb.append(',');
        sb.append("structuralRepresentation");
        sb.append('=');
        sb.append(((this.structuralRepresentation == null)?"<null>":this.structuralRepresentation));
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
        result = ((result* 31)+((this.structuralRepresentation == null)? 0 :this.structuralRepresentation.hashCode()));
        result = ((result* 31)+((this.repeatUnit == null)? 0 :this.repeatUnit.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._repeatUnit == null)? 0 :this._repeatUnit.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.degreeOfPolymerisation == null)? 0 :this.degreeOfPolymerisation.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.orientationOfPolymerisation == null)? 0 :this.orientationOfPolymerisation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstancePolymer_RepeatUnit) == false) {
            return false;
        }
        SubstancePolymer_RepeatUnit rhs = ((SubstancePolymer_RepeatUnit) other);
        return ((((((((((this.structuralRepresentation == rhs.structuralRepresentation)||((this.structuralRepresentation!= null)&&this.structuralRepresentation.equals(rhs.structuralRepresentation)))&&((this.repeatUnit == rhs.repeatUnit)||((this.repeatUnit!= null)&&this.repeatUnit.equals(rhs.repeatUnit))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._repeatUnit == rhs._repeatUnit)||((this._repeatUnit!= null)&&this._repeatUnit.equals(rhs._repeatUnit))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.degreeOfPolymerisation == rhs.degreeOfPolymerisation)||((this.degreeOfPolymerisation!= null)&&this.degreeOfPolymerisation.equals(rhs.degreeOfPolymerisation))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.orientationOfPolymerisation == rhs.orientationOfPolymerisation)||((this.orientationOfPolymerisation!= null)&&this.orientationOfPolymerisation.equals(rhs.orientationOfPolymerisation))));
    }

}
