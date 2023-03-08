
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
    "target",
    "type",
    "interaction",
    "organism",
    "organismType",
    "amountQuantity",
    "amountRange",
    "amountString",
    "_amountString",
    "amountType",
    "source"
})
@Generated("jsonschema2pojo")
public class SubstanceReferenceInformation_Target {

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
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier target;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("interaction")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept interaction;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("organism")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept organism;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("organismType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept organismType;
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
     * Todo.
     * 
     */
    @JsonProperty("amountString")
    @JsonPropertyDescription("Todo.")
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
     * Todo.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Todo.")
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
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("target")
    public Identifier getTarget() {
        return target;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("target")
    public void setTarget(Identifier target) {
        this.target = target;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("interaction")
    public CodeableConcept getInteraction() {
        return interaction;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("interaction")
    public void setInteraction(CodeableConcept interaction) {
        this.interaction = interaction;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("organism")
    public CodeableConcept getOrganism() {
        return organism;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("organism")
    public void setOrganism(CodeableConcept organism) {
        this.organism = organism;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("organismType")
    public CodeableConcept getOrganismType() {
        return organismType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("organismType")
    public void setOrganismType(CodeableConcept organismType) {
        this.organismType = organismType;
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
     * Todo.
     * 
     */
    @JsonProperty("amountString")
    public String getAmountString() {
        return amountString;
    }

    /**
     * Todo.
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
     * Todo.
     * 
     */
    @JsonProperty("source")
    public List<Reference> getSource() {
        return source;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("source")
    public void setSource(List<Reference> source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceReferenceInformation_Target.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("interaction");
        sb.append('=');
        sb.append(((this.interaction == null)?"<null>":this.interaction));
        sb.append(',');
        sb.append("organism");
        sb.append('=');
        sb.append(((this.organism == null)?"<null>":this.organism));
        sb.append(',');
        sb.append("organismType");
        sb.append('=');
        sb.append(((this.organismType == null)?"<null>":this.organismType));
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
        result = ((result* 31)+((this.amountType == null)? 0 :this.amountType.hashCode()));
        result = ((result* 31)+((this.organismType == null)? 0 :this.organismType.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.organism == null)? 0 :this.organism.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this.amountQuantity == null)? 0 :this.amountQuantity.hashCode()));
        result = ((result* 31)+((this._amountString == null)? 0 :this._amountString.hashCode()));
        result = ((result* 31)+((this.amountString == null)? 0 :this.amountString.hashCode()));
        result = ((result* 31)+((this.amountRange == null)? 0 :this.amountRange.hashCode()));
        result = ((result* 31)+((this.interaction == null)? 0 :this.interaction.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceReferenceInformation_Target) == false) {
            return false;
        }
        SubstanceReferenceInformation_Target rhs = ((SubstanceReferenceInformation_Target) other);
        return (((((((((((((((this.amountType == rhs.amountType)||((this.amountType!= null)&&this.amountType.equals(rhs.amountType)))&&((this.organismType == rhs.organismType)||((this.organismType!= null)&&this.organismType.equals(rhs.organismType))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.organism == rhs.organism)||((this.organism!= null)&&this.organism.equals(rhs.organism))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this.amountQuantity == rhs.amountQuantity)||((this.amountQuantity!= null)&&this.amountQuantity.equals(rhs.amountQuantity))))&&((this._amountString == rhs._amountString)||((this._amountString!= null)&&this._amountString.equals(rhs._amountString))))&&((this.amountString == rhs.amountString)||((this.amountString!= null)&&this.amountString.equals(rhs.amountString))))&&((this.amountRange == rhs.amountRange)||((this.amountRange!= null)&&this.amountRange.equals(rhs.amountRange))))&&((this.interaction == rhs.interaction)||((this.interaction!= null)&&this.interaction.equals(rhs.interaction))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
