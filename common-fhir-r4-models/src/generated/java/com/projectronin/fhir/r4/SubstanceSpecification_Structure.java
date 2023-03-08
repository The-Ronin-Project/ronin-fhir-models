
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "stereochemistry",
    "opticalActivity",
    "molecularFormula",
    "_molecularFormula",
    "molecularFormulaByMoiety",
    "_molecularFormulaByMoiety",
    "isotope",
    "molecularWeight",
    "source",
    "representation"
})
@Generated("jsonschema2pojo")
public class SubstanceSpecification_Structure {

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
    @JsonProperty("stereochemistry")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept stereochemistry;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("opticalActivity")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept opticalActivity;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("molecularFormula")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String molecularFormula;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_molecularFormula")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _molecularFormula;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("molecularFormulaByMoiety")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String molecularFormulaByMoiety;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_molecularFormulaByMoiety")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _molecularFormulaByMoiety;
    /**
     * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
     * 
     */
    @JsonProperty("isotope")
    @JsonPropertyDescription("Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.")
    private List<SubstanceSpecification_Isotope> isotope = new ArrayList<SubstanceSpecification_Isotope>();
    /**
     * The detailed description of a substance, typically at a level beyond what is used for prescribing.
     * 
     */
    @JsonProperty("molecularWeight")
    @JsonPropertyDescription("The detailed description of a substance, typically at a level beyond what is used for prescribing.")
    private SubstanceSpecification_MolecularWeight molecularWeight;
    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Supporting literature.")
    private List<Reference> source = new ArrayList<Reference>();
    /**
     * Molecular structural representation.
     * 
     */
    @JsonProperty("representation")
    @JsonPropertyDescription("Molecular structural representation.")
    private List<SubstanceSpecification_Representation> representation = new ArrayList<SubstanceSpecification_Representation>();

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
    @JsonProperty("stereochemistry")
    public CodeableConcept getStereochemistry() {
        return stereochemistry;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("stereochemistry")
    public void setStereochemistry(CodeableConcept stereochemistry) {
        this.stereochemistry = stereochemistry;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("opticalActivity")
    public CodeableConcept getOpticalActivity() {
        return opticalActivity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("opticalActivity")
    public void setOpticalActivity(CodeableConcept opticalActivity) {
        this.opticalActivity = opticalActivity;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("molecularFormula")
    public String getMolecularFormula() {
        return molecularFormula;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("molecularFormula")
    public void setMolecularFormula(String molecularFormula) {
        this.molecularFormula = molecularFormula;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_molecularFormula")
    public Element get_molecularFormula() {
        return _molecularFormula;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_molecularFormula")
    public void set_molecularFormula(Element _molecularFormula) {
        this._molecularFormula = _molecularFormula;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("molecularFormulaByMoiety")
    public String getMolecularFormulaByMoiety() {
        return molecularFormulaByMoiety;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("molecularFormulaByMoiety")
    public void setMolecularFormulaByMoiety(String molecularFormulaByMoiety) {
        this.molecularFormulaByMoiety = molecularFormulaByMoiety;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_molecularFormulaByMoiety")
    public Element get_molecularFormulaByMoiety() {
        return _molecularFormulaByMoiety;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_molecularFormulaByMoiety")
    public void set_molecularFormulaByMoiety(Element _molecularFormulaByMoiety) {
        this._molecularFormulaByMoiety = _molecularFormulaByMoiety;
    }

    /**
     * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
     * 
     */
    @JsonProperty("isotope")
    public List<SubstanceSpecification_Isotope> getIsotope() {
        return isotope;
    }

    /**
     * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
     * 
     */
    @JsonProperty("isotope")
    public void setIsotope(List<SubstanceSpecification_Isotope> isotope) {
        this.isotope = isotope;
    }

    /**
     * The detailed description of a substance, typically at a level beyond what is used for prescribing.
     * 
     */
    @JsonProperty("molecularWeight")
    public SubstanceSpecification_MolecularWeight getMolecularWeight() {
        return molecularWeight;
    }

    /**
     * The detailed description of a substance, typically at a level beyond what is used for prescribing.
     * 
     */
    @JsonProperty("molecularWeight")
    public void setMolecularWeight(SubstanceSpecification_MolecularWeight molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    public List<Reference> getSource() {
        return source;
    }

    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    public void setSource(List<Reference> source) {
        this.source = source;
    }

    /**
     * Molecular structural representation.
     * 
     */
    @JsonProperty("representation")
    public List<SubstanceSpecification_Representation> getRepresentation() {
        return representation;
    }

    /**
     * Molecular structural representation.
     * 
     */
    @JsonProperty("representation")
    public void setRepresentation(List<SubstanceSpecification_Representation> representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceSpecification_Structure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("stereochemistry");
        sb.append('=');
        sb.append(((this.stereochemistry == null)?"<null>":this.stereochemistry));
        sb.append(',');
        sb.append("opticalActivity");
        sb.append('=');
        sb.append(((this.opticalActivity == null)?"<null>":this.opticalActivity));
        sb.append(',');
        sb.append("molecularFormula");
        sb.append('=');
        sb.append(((this.molecularFormula == null)?"<null>":this.molecularFormula));
        sb.append(',');
        sb.append("_molecularFormula");
        sb.append('=');
        sb.append(((this._molecularFormula == null)?"<null>":this._molecularFormula));
        sb.append(',');
        sb.append("molecularFormulaByMoiety");
        sb.append('=');
        sb.append(((this.molecularFormulaByMoiety == null)?"<null>":this.molecularFormulaByMoiety));
        sb.append(',');
        sb.append("_molecularFormulaByMoiety");
        sb.append('=');
        sb.append(((this._molecularFormulaByMoiety == null)?"<null>":this._molecularFormulaByMoiety));
        sb.append(',');
        sb.append("isotope");
        sb.append('=');
        sb.append(((this.isotope == null)?"<null>":this.isotope));
        sb.append(',');
        sb.append("molecularWeight");
        sb.append('=');
        sb.append(((this.molecularWeight == null)?"<null>":this.molecularWeight));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("representation");
        sb.append('=');
        sb.append(((this.representation == null)?"<null>":this.representation));
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
        result = ((result* 31)+((this.molecularWeight == null)? 0 :this.molecularWeight.hashCode()));
        result = ((result* 31)+((this.isotope == null)? 0 :this.isotope.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.representation == null)? 0 :this.representation.hashCode()));
        result = ((result* 31)+((this.opticalActivity == null)? 0 :this.opticalActivity.hashCode()));
        result = ((result* 31)+((this.molecularFormula == null)? 0 :this.molecularFormula.hashCode()));
        result = ((result* 31)+((this.stereochemistry == null)? 0 :this.stereochemistry.hashCode()));
        result = ((result* 31)+((this.molecularFormulaByMoiety == null)? 0 :this.molecularFormulaByMoiety.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._molecularFormulaByMoiety == null)? 0 :this._molecularFormulaByMoiety.hashCode()));
        result = ((result* 31)+((this._molecularFormula == null)? 0 :this._molecularFormula.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSpecification_Structure) == false) {
            return false;
        }
        SubstanceSpecification_Structure rhs = ((SubstanceSpecification_Structure) other);
        return ((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.molecularWeight == rhs.molecularWeight)||((this.molecularWeight!= null)&&this.molecularWeight.equals(rhs.molecularWeight))))&&((this.isotope == rhs.isotope)||((this.isotope!= null)&&this.isotope.equals(rhs.isotope))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.representation == rhs.representation)||((this.representation!= null)&&this.representation.equals(rhs.representation))))&&((this.opticalActivity == rhs.opticalActivity)||((this.opticalActivity!= null)&&this.opticalActivity.equals(rhs.opticalActivity))))&&((this.molecularFormula == rhs.molecularFormula)||((this.molecularFormula!= null)&&this.molecularFormula.equals(rhs.molecularFormula))))&&((this.stereochemistry == rhs.stereochemistry)||((this.stereochemistry!= null)&&this.stereochemistry.equals(rhs.stereochemistry))))&&((this.molecularFormulaByMoiety == rhs.molecularFormulaByMoiety)||((this.molecularFormulaByMoiety!= null)&&this.molecularFormulaByMoiety.equals(rhs.molecularFormulaByMoiety))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._molecularFormulaByMoiety == rhs._molecularFormulaByMoiety)||((this._molecularFormulaByMoiety!= null)&&this._molecularFormulaByMoiety.equals(rhs._molecularFormulaByMoiety))))&&((this._molecularFormula == rhs._molecularFormula)||((this._molecularFormula!= null)&&this._molecularFormula.equals(rhs._molecularFormula))));
    }

}
