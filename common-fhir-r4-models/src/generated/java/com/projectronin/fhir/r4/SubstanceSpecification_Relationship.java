
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
    "substanceReference",
    "substanceCodeableConcept",
    "relationship",
    "isDefining",
    "_isDefining",
    "amountQuantity",
    "amountRange",
    "amountRatio",
    "amountString",
    "_amountString",
    "amountRatioLowLimit",
    "amountType",
    "source"
})
@Generated("jsonschema2pojo")
public class SubstanceSpecification_Relationship {

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("substanceReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference substanceReference;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("substanceCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept substanceCodeableConcept;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept relationship;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDefining")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean isDefining;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDefining")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isDefining;
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
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("amountRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio amountRatio;
    /**
     * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.
     * 
     */
    @JsonProperty("amountString")
    @JsonPropertyDescription("A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.")
    private String amountString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_amountString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _amountString;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("amountRatioLowLimit")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio amountRatioLowLimit;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("amountType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept amountType;
    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Supporting literature.")
    private List<Reference> source = new ArrayList<Reference>();

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("substanceReference")
    public Reference getSubstanceReference() {
        return substanceReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("substanceReference")
    public void setSubstanceReference(Reference substanceReference) {
        this.substanceReference = substanceReference;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("substanceCodeableConcept")
    public CodeableConcept getSubstanceCodeableConcept() {
        return substanceCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("substanceCodeableConcept")
    public void setSubstanceCodeableConcept(CodeableConcept substanceCodeableConcept) {
        this.substanceCodeableConcept = substanceCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("relationship")
    public CodeableConcept getRelationship() {
        return relationship;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(CodeableConcept relationship) {
        this.relationship = relationship;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDefining")
    public Boolean getIsDefining() {
        return isDefining;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDefining")
    public void setIsDefining(Boolean isDefining) {
        this.isDefining = isDefining;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDefining")
    public Element get_isDefining() {
        return _isDefining;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDefining")
    public void set_isDefining(Element _isDefining) {
        this._isDefining = _isDefining;
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
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("amountRatio")
    public Ratio getAmountRatio() {
        return amountRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("amountRatio")
    public void setAmountRatio(Ratio amountRatio) {
        this.amountRatio = amountRatio;
    }

    /**
     * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.
     * 
     */
    @JsonProperty("amountString")
    public String getAmountString() {
        return amountString;
    }

    /**
     * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.
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
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("amountRatioLowLimit")
    public Ratio getAmountRatioLowLimit() {
        return amountRatioLowLimit;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("amountRatioLowLimit")
    public void setAmountRatioLowLimit(Ratio amountRatioLowLimit) {
        this.amountRatioLowLimit = amountRatioLowLimit;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceSpecification_Relationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("substanceReference");
        sb.append('=');
        sb.append(((this.substanceReference == null)?"<null>":this.substanceReference));
        sb.append(',');
        sb.append("substanceCodeableConcept");
        sb.append('=');
        sb.append(((this.substanceCodeableConcept == null)?"<null>":this.substanceCodeableConcept));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("isDefining");
        sb.append('=');
        sb.append(((this.isDefining == null)?"<null>":this.isDefining));
        sb.append(',');
        sb.append("_isDefining");
        sb.append('=');
        sb.append(((this._isDefining == null)?"<null>":this._isDefining));
        sb.append(',');
        sb.append("amountQuantity");
        sb.append('=');
        sb.append(((this.amountQuantity == null)?"<null>":this.amountQuantity));
        sb.append(',');
        sb.append("amountRange");
        sb.append('=');
        sb.append(((this.amountRange == null)?"<null>":this.amountRange));
        sb.append(',');
        sb.append("amountRatio");
        sb.append('=');
        sb.append(((this.amountRatio == null)?"<null>":this.amountRatio));
        sb.append(',');
        sb.append("amountString");
        sb.append('=');
        sb.append(((this.amountString == null)?"<null>":this.amountString));
        sb.append(',');
        sb.append("_amountString");
        sb.append('=');
        sb.append(((this._amountString == null)?"<null>":this._amountString));
        sb.append(',');
        sb.append("amountRatioLowLimit");
        sb.append('=');
        sb.append(((this.amountRatioLowLimit == null)?"<null>":this.amountRatioLowLimit));
        sb.append(',');
        sb.append("amountType");
        sb.append('=');
        sb.append(((this.amountType == null)?"<null>":this.amountType));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.amountRatio == null)? 0 :this.amountRatio.hashCode()));
        result = ((result* 31)+((this.amountType == null)? 0 :this.amountType.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.substanceCodeableConcept == null)? 0 :this.substanceCodeableConcept.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._isDefining == null)? 0 :this._isDefining.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.amountRatioLowLimit == null)? 0 :this.amountRatioLowLimit.hashCode()));
        result = ((result* 31)+((this.isDefining == null)? 0 :this.isDefining.hashCode()));
        result = ((result* 31)+((this.amountQuantity == null)? 0 :this.amountQuantity.hashCode()));
        result = ((result* 31)+((this._amountString == null)? 0 :this._amountString.hashCode()));
        result = ((result* 31)+((this.amountString == null)? 0 :this.amountString.hashCode()));
        result = ((result* 31)+((this.amountRange == null)? 0 :this.amountRange.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this.substanceReference == null)? 0 :this.substanceReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSpecification_Relationship) == false) {
            return false;
        }
        SubstanceSpecification_Relationship rhs = ((SubstanceSpecification_Relationship) other);
        return (((((((((((((((((this.amountRatio == rhs.amountRatio)||((this.amountRatio!= null)&&this.amountRatio.equals(rhs.amountRatio)))&&((this.amountType == rhs.amountType)||((this.amountType!= null)&&this.amountType.equals(rhs.amountType))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.substanceCodeableConcept == rhs.substanceCodeableConcept)||((this.substanceCodeableConcept!= null)&&this.substanceCodeableConcept.equals(rhs.substanceCodeableConcept))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._isDefining == rhs._isDefining)||((this._isDefining!= null)&&this._isDefining.equals(rhs._isDefining))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.amountRatioLowLimit == rhs.amountRatioLowLimit)||((this.amountRatioLowLimit!= null)&&this.amountRatioLowLimit.equals(rhs.amountRatioLowLimit))))&&((this.isDefining == rhs.isDefining)||((this.isDefining!= null)&&this.isDefining.equals(rhs.isDefining))))&&((this.amountQuantity == rhs.amountQuantity)||((this.amountQuantity!= null)&&this.amountQuantity.equals(rhs.amountQuantity))))&&((this._amountString == rhs._amountString)||((this._amountString!= null)&&this._amountString.equals(rhs._amountString))))&&((this.amountString == rhs.amountString)||((this.amountString!= null)&&this.amountString.equals(rhs.amountString))))&&((this.amountRange == rhs.amountRange)||((this.amountRange!= null)&&this.amountRange.equals(rhs.amountRange))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.substanceReference == rhs.substanceReference)||((this.substanceReference!= null)&&this.substanceReference.equals(rhs.substanceReference))));
    }

}
