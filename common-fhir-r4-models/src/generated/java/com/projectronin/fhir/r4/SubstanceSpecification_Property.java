
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
    "category",
    "code",
    "parameters",
    "_parameters",
    "definingSubstanceReference",
    "definingSubstanceCodeableConcept",
    "amountQuantity",
    "amountString",
    "_amountString"
})
@Generated("jsonschema2pojo")
public class SubstanceSpecification_Property {

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
    @JsonProperty("category")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept category;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("parameters")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String parameters;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_parameters")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _parameters;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definingSubstanceReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference definingSubstanceReference;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("definingSubstanceCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept definingSubstanceCodeableConcept;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amountQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity amountQuantity;
    /**
     * Quantitative value for this property.
     * 
     */
    @JsonProperty("amountString")
    @JsonPropertyDescription("Quantitative value for this property.")
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
    @JsonProperty("category")
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
        this.category = category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("parameters")
    public String getParameters() {
        return parameters;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_parameters")
    public Element get_parameters() {
        return _parameters;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_parameters")
    public void set_parameters(Element _parameters) {
        this._parameters = _parameters;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definingSubstanceReference")
    public Reference getDefiningSubstanceReference() {
        return definingSubstanceReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definingSubstanceReference")
    public void setDefiningSubstanceReference(Reference definingSubstanceReference) {
        this.definingSubstanceReference = definingSubstanceReference;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("definingSubstanceCodeableConcept")
    public CodeableConcept getDefiningSubstanceCodeableConcept() {
        return definingSubstanceCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("definingSubstanceCodeableConcept")
    public void setDefiningSubstanceCodeableConcept(CodeableConcept definingSubstanceCodeableConcept) {
        this.definingSubstanceCodeableConcept = definingSubstanceCodeableConcept;
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
     * Quantitative value for this property.
     * 
     */
    @JsonProperty("amountString")
    public String getAmountString() {
        return amountString;
    }

    /**
     * Quantitative value for this property.
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
        sb.append(SubstanceSpecification_Property.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("_parameters");
        sb.append('=');
        sb.append(((this._parameters == null)?"<null>":this._parameters));
        sb.append(',');
        sb.append("definingSubstanceReference");
        sb.append('=');
        sb.append(((this.definingSubstanceReference == null)?"<null>":this.definingSubstanceReference));
        sb.append(',');
        sb.append("definingSubstanceCodeableConcept");
        sb.append('=');
        sb.append(((this.definingSubstanceCodeableConcept == null)?"<null>":this.definingSubstanceCodeableConcept));
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
        result = ((result* 31)+((this.amountQuantity == null)? 0 :this.amountQuantity.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._amountString == null)? 0 :this._amountString.hashCode()));
        result = ((result* 31)+((this.amountString == null)? 0 :this.amountString.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this._parameters == null)? 0 :this._parameters.hashCode()));
        result = ((result* 31)+((this.definingSubstanceReference == null)? 0 :this.definingSubstanceReference.hashCode()));
        result = ((result* 31)+((this.definingSubstanceCodeableConcept == null)? 0 :this.definingSubstanceCodeableConcept.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSpecification_Property) == false) {
            return false;
        }
        SubstanceSpecification_Property rhs = ((SubstanceSpecification_Property) other);
        return (((((((((((((this.amountQuantity == rhs.amountQuantity)||((this.amountQuantity!= null)&&this.amountQuantity.equals(rhs.amountQuantity)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._amountString == rhs._amountString)||((this._amountString!= null)&&this._amountString.equals(rhs._amountString))))&&((this.amountString == rhs.amountString)||((this.amountString!= null)&&this.amountString.equals(rhs.amountString))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this._parameters == rhs._parameters)||((this._parameters!= null)&&this._parameters.equals(rhs._parameters))))&&((this.definingSubstanceReference == rhs.definingSubstanceReference)||((this.definingSubstanceReference!= null)&&this.definingSubstanceReference.equals(rhs.definingSubstanceReference))))&&((this.definingSubstanceCodeableConcept == rhs.definingSubstanceCodeableConcept)||((this.definingSubstanceCodeableConcept!= null)&&this.definingSubstanceCodeableConcept.equals(rhs.definingSubstanceCodeableConcept))));
    }

}
