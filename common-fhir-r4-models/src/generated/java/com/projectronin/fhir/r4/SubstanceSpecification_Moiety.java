
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
    "role",
    "identifier",
    "name",
    "_name",
    "stereochemistry",
    "opticalActivity",
    "molecularFormula",
    "_molecularFormula",
    "amountQuantity",
    "amountString",
    "_amountString"
})
@Generated("jsonschema2pojo")
public class SubstanceSpecification_Moiety {

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
    @JsonProperty("role")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept role;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amountQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity amountQuantity;
    /**
     * Quantitative value for this moiety.
     * 
     */
    @JsonProperty("amountString")
    @JsonPropertyDescription("Quantitative value for this moiety.")
    private String amountString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _amountString;

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
    @JsonProperty("role")
    public CodeableConcept getRole() {
        return role;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("role")
    public void setRole(CodeableConcept role) {
        this.role = role;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amountQuantity")
    public Quantity getAmountQuantity() {
        return amountQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amountQuantity")
    public void setAmountQuantity(Quantity amountQuantity) {
        this.amountQuantity = amountQuantity;
    }

    /**
     * Quantitative value for this moiety.
     * 
     */
    @JsonProperty("amountString")
    public String getAmountString() {
        return amountString;
    }

    /**
     * Quantitative value for this moiety.
     * 
     */
    @JsonProperty("amountString")
    public void setAmountString(String amountString) {
        this.amountString = amountString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountString")
    public Element get_amountString() {
        return _amountString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountString")
    public void set_amountString(Element _amountString) {
        this._amountString = _amountString;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceSpecification_Moiety.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
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
        sb.append("amountQuantity");
        sb.append('=');
        sb.append(((this.amountQuantity == null)?"<null>":this.amountQuantity));
        sb.append(',');
        sb.append("amountString");
        sb.append('=');
        sb.append(((this.amountString == null)?"<null>":this.amountString));
        sb.append(',');
        sb.append("_amountString");
        sb.append('=');
        sb.append(((this._amountString == null)?"<null>":this._amountString));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.amountQuantity == null)? 0 :this.amountQuantity.hashCode()));
        result = ((result* 31)+((this._amountString == null)? 0 :this._amountString.hashCode()));
        result = ((result* 31)+((this.amountString == null)? 0 :this.amountString.hashCode()));
        result = ((result* 31)+((this.opticalActivity == null)? 0 :this.opticalActivity.hashCode()));
        result = ((result* 31)+((this.molecularFormula == null)? 0 :this.molecularFormula.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.stereochemistry == null)? 0 :this.stereochemistry.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._molecularFormula == null)? 0 :this._molecularFormula.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSpecification_Moiety) == false) {
            return false;
        }
        SubstanceSpecification_Moiety rhs = ((SubstanceSpecification_Moiety) other);
        return (((((((((((((((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.amountQuantity == rhs.amountQuantity)||((this.amountQuantity!= null)&&this.amountQuantity.equals(rhs.amountQuantity))))&&((this._amountString == rhs._amountString)||((this._amountString!= null)&&this._amountString.equals(rhs._amountString))))&&((this.amountString == rhs.amountString)||((this.amountString!= null)&&this.amountString.equals(rhs.amountString))))&&((this.opticalActivity == rhs.opticalActivity)||((this.opticalActivity!= null)&&this.opticalActivity.equals(rhs.opticalActivity))))&&((this.molecularFormula == rhs.molecularFormula)||((this.molecularFormula!= null)&&this.molecularFormula.equals(rhs.molecularFormula))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.stereochemistry == rhs.stereochemistry)||((this.stereochemistry!= null)&&this.stereochemistry.equals(rhs.stereochemistry))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._molecularFormula == rhs._molecularFormula)||((this._molecularFormula!= null)&&this._molecularFormula.equals(rhs._molecularFormula))));
    }

}
