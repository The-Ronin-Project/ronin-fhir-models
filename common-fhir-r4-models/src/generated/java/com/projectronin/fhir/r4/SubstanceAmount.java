
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "amountQuantity",
    "amountRange",
    "amountString",
    "_amountString",
    "amountType",
    "amountText",
    "_amountText",
    "referenceRange"
})
@Generated("jsonschema2pojo")
public class SubstanceAmount {

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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amountQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity amountQuantity;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("amountRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range amountRange;
    /**
     * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.
     * 
     */
    @JsonProperty("amountString")
    @JsonPropertyDescription("Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.")
    private String amountString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _amountString;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("amountType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept amountType;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("amountText")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String amountText;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountText")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _amountText;
    /**
     * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
     * 
     */
    @JsonProperty("referenceRange")
    @JsonPropertyDescription("Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.")
    private SubstanceAmount_ReferenceRange referenceRange;

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
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("amountRange")
    public Range getAmountRange() {
        return amountRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("amountRange")
    public void setAmountRange(Range amountRange) {
        this.amountRange = amountRange;
    }

    /**
     * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.
     * 
     */
    @JsonProperty("amountString")
    public String getAmountString() {
        return amountString;
    }

    /**
     * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.
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

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("amountType")
    public CodeableConcept getAmountType() {
        return amountType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("amountType")
    public void setAmountType(CodeableConcept amountType) {
        this.amountType = amountType;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("amountText")
    public String getAmountText() {
        return amountText;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("amountText")
    public void setAmountText(String amountText) {
        this.amountText = amountText;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountText")
    public Element get_amountText() {
        return _amountText;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountText")
    public void set_amountText(Element _amountText) {
        this._amountText = _amountText;
    }

    /**
     * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
     * 
     */
    @JsonProperty("referenceRange")
    public SubstanceAmount_ReferenceRange getReferenceRange() {
        return referenceRange;
    }

    /**
     * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
     * 
     */
    @JsonProperty("referenceRange")
    public void setReferenceRange(SubstanceAmount_ReferenceRange referenceRange) {
        this.referenceRange = referenceRange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceAmount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("amountQuantity");
        sb.append('=');
        sb.append(((this.amountQuantity == null)?"<null>":this.amountQuantity));
        sb.append(',');
        sb.append("amountRange");
        sb.append('=');
        sb.append(((this.amountRange == null)?"<null>":this.amountRange));
        sb.append(',');
        sb.append("amountString");
        sb.append('=');
        sb.append(((this.amountString == null)?"<null>":this.amountString));
        sb.append(',');
        sb.append("_amountString");
        sb.append('=');
        sb.append(((this._amountString == null)?"<null>":this._amountString));
        sb.append(',');
        sb.append("amountType");
        sb.append('=');
        sb.append(((this.amountType == null)?"<null>":this.amountType));
        sb.append(',');
        sb.append("amountText");
        sb.append('=');
        sb.append(((this.amountText == null)?"<null>":this.amountText));
        sb.append(',');
        sb.append("_amountText");
        sb.append('=');
        sb.append(((this._amountText == null)?"<null>":this._amountText));
        sb.append(',');
        sb.append("referenceRange");
        sb.append('=');
        sb.append(((this.referenceRange == null)?"<null>":this.referenceRange));
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
        result = ((result* 31)+((this.amountQuantity == null)? 0 :this.amountQuantity.hashCode()));
        result = ((result* 31)+((this.amountType == null)? 0 :this.amountType.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.referenceRange == null)? 0 :this.referenceRange.hashCode()));
        result = ((result* 31)+((this._amountString == null)? 0 :this._amountString.hashCode()));
        result = ((result* 31)+((this._amountText == null)? 0 :this._amountText.hashCode()));
        result = ((result* 31)+((this.amountString == null)? 0 :this.amountString.hashCode()));
        result = ((result* 31)+((this.amountRange == null)? 0 :this.amountRange.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.amountText == null)? 0 :this.amountText.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceAmount) == false) {
            return false;
        }
        SubstanceAmount rhs = ((SubstanceAmount) other);
        return ((((((((((((this.amountQuantity == rhs.amountQuantity)||((this.amountQuantity!= null)&&this.amountQuantity.equals(rhs.amountQuantity)))&&((this.amountType == rhs.amountType)||((this.amountType!= null)&&this.amountType.equals(rhs.amountType))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.referenceRange == rhs.referenceRange)||((this.referenceRange!= null)&&this.referenceRange.equals(rhs.referenceRange))))&&((this._amountString == rhs._amountString)||((this._amountString!= null)&&this._amountString.equals(rhs._amountString))))&&((this._amountText == rhs._amountText)||((this._amountText!= null)&&this._amountText.equals(rhs._amountText))))&&((this.amountString == rhs.amountString)||((this.amountString!= null)&&this.amountString.equals(rhs.amountString))))&&((this.amountRange == rhs.amountRange)||((this.amountRange!= null)&&this.amountRange.equals(rhs.amountRange))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.amountText == rhs.amountText)||((this.amountText!= null)&&this.amountText.equals(rhs.amountText))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
