
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "allowedUnsignedInt",
    "_allowedUnsignedInt",
    "allowedString",
    "_allowedString",
    "allowedMoney",
    "usedUnsignedInt",
    "_usedUnsignedInt",
    "usedMoney"
})
@Generated("jsonschema2pojo")
public class ExplanationOfBenefit_Financial {

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
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * The quantity of the benefit which is permitted under the coverage.
     * 
     */
    @JsonProperty("allowedUnsignedInt")
    @JsonPropertyDescription("The quantity of the benefit which is permitted under the coverage.")
    private Double allowedUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allowedUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _allowedUnsignedInt;
    /**
     * The quantity of the benefit which is permitted under the coverage.
     * 
     */
    @JsonProperty("allowedString")
    @JsonPropertyDescription("The quantity of the benefit which is permitted under the coverage.")
    private String allowedString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allowedString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _allowedString;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("allowedMoney")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money allowedMoney;
    /**
     * The quantity of the benefit which have been consumed to date.
     * 
     */
    @JsonProperty("usedUnsignedInt")
    @JsonPropertyDescription("The quantity of the benefit which have been consumed to date.")
    private Double usedUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_usedUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _usedUnsignedInt;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("usedMoney")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money usedMoney;

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
     * (Required)
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * The quantity of the benefit which is permitted under the coverage.
     * 
     */
    @JsonProperty("allowedUnsignedInt")
    public Double getAllowedUnsignedInt() {
        return allowedUnsignedInt;
    }

    /**
     * The quantity of the benefit which is permitted under the coverage.
     * 
     */
    @JsonProperty("allowedUnsignedInt")
    public void setAllowedUnsignedInt(Double allowedUnsignedInt) {
        this.allowedUnsignedInt = allowedUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allowedUnsignedInt")
    public Element get_allowedUnsignedInt() {
        return _allowedUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allowedUnsignedInt")
    public void set_allowedUnsignedInt(Element _allowedUnsignedInt) {
        this._allowedUnsignedInt = _allowedUnsignedInt;
    }

    /**
     * The quantity of the benefit which is permitted under the coverage.
     * 
     */
    @JsonProperty("allowedString")
    public String getAllowedString() {
        return allowedString;
    }

    /**
     * The quantity of the benefit which is permitted under the coverage.
     * 
     */
    @JsonProperty("allowedString")
    public void setAllowedString(String allowedString) {
        this.allowedString = allowedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allowedString")
    public Element get_allowedString() {
        return _allowedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allowedString")
    public void set_allowedString(Element _allowedString) {
        this._allowedString = _allowedString;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("allowedMoney")
    public Money getAllowedMoney() {
        return allowedMoney;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("allowedMoney")
    public void setAllowedMoney(Money allowedMoney) {
        this.allowedMoney = allowedMoney;
    }

    /**
     * The quantity of the benefit which have been consumed to date.
     * 
     */
    @JsonProperty("usedUnsignedInt")
    public Double getUsedUnsignedInt() {
        return usedUnsignedInt;
    }

    /**
     * The quantity of the benefit which have been consumed to date.
     * 
     */
    @JsonProperty("usedUnsignedInt")
    public void setUsedUnsignedInt(Double usedUnsignedInt) {
        this.usedUnsignedInt = usedUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_usedUnsignedInt")
    public Element get_usedUnsignedInt() {
        return _usedUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_usedUnsignedInt")
    public void set_usedUnsignedInt(Element _usedUnsignedInt) {
        this._usedUnsignedInt = _usedUnsignedInt;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("usedMoney")
    public Money getUsedMoney() {
        return usedMoney;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("usedMoney")
    public void setUsedMoney(Money usedMoney) {
        this.usedMoney = usedMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExplanationOfBenefit_Financial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("allowedUnsignedInt");
        sb.append('=');
        sb.append(((this.allowedUnsignedInt == null)?"<null>":this.allowedUnsignedInt));
        sb.append(',');
        sb.append("_allowedUnsignedInt");
        sb.append('=');
        sb.append(((this._allowedUnsignedInt == null)?"<null>":this._allowedUnsignedInt));
        sb.append(',');
        sb.append("allowedString");
        sb.append('=');
        sb.append(((this.allowedString == null)?"<null>":this.allowedString));
        sb.append(',');
        sb.append("_allowedString");
        sb.append('=');
        sb.append(((this._allowedString == null)?"<null>":this._allowedString));
        sb.append(',');
        sb.append("allowedMoney");
        sb.append('=');
        sb.append(((this.allowedMoney == null)?"<null>":this.allowedMoney));
        sb.append(',');
        sb.append("usedUnsignedInt");
        sb.append('=');
        sb.append(((this.usedUnsignedInt == null)?"<null>":this.usedUnsignedInt));
        sb.append(',');
        sb.append("_usedUnsignedInt");
        sb.append('=');
        sb.append(((this._usedUnsignedInt == null)?"<null>":this._usedUnsignedInt));
        sb.append(',');
        sb.append("usedMoney");
        sb.append('=');
        sb.append(((this.usedMoney == null)?"<null>":this.usedMoney));
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
        result = ((result* 31)+((this.allowedMoney == null)? 0 :this.allowedMoney.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._allowedString == null)? 0 :this._allowedString.hashCode()));
        result = ((result* 31)+((this._usedUnsignedInt == null)? 0 :this._usedUnsignedInt.hashCode()));
        result = ((result* 31)+((this._allowedUnsignedInt == null)? 0 :this._allowedUnsignedInt.hashCode()));
        result = ((result* 31)+((this.allowedString == null)? 0 :this.allowedString.hashCode()));
        result = ((result* 31)+((this.allowedUnsignedInt == null)? 0 :this.allowedUnsignedInt.hashCode()));
        result = ((result* 31)+((this.usedUnsignedInt == null)? 0 :this.usedUnsignedInt.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.usedMoney == null)? 0 :this.usedMoney.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExplanationOfBenefit_Financial) == false) {
            return false;
        }
        ExplanationOfBenefit_Financial rhs = ((ExplanationOfBenefit_Financial) other);
        return (((((((((((((this.allowedMoney == rhs.allowedMoney)||((this.allowedMoney!= null)&&this.allowedMoney.equals(rhs.allowedMoney)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._allowedString == rhs._allowedString)||((this._allowedString!= null)&&this._allowedString.equals(rhs._allowedString))))&&((this._usedUnsignedInt == rhs._usedUnsignedInt)||((this._usedUnsignedInt!= null)&&this._usedUnsignedInt.equals(rhs._usedUnsignedInt))))&&((this._allowedUnsignedInt == rhs._allowedUnsignedInt)||((this._allowedUnsignedInt!= null)&&this._allowedUnsignedInt.equals(rhs._allowedUnsignedInt))))&&((this.allowedString == rhs.allowedString)||((this.allowedString!= null)&&this.allowedString.equals(rhs.allowedString))))&&((this.allowedUnsignedInt == rhs.allowedUnsignedInt)||((this.allowedUnsignedInt!= null)&&this.allowedUnsignedInt.equals(rhs.allowedUnsignedInt))))&&((this.usedUnsignedInt == rhs.usedUnsignedInt)||((this.usedUnsignedInt!= null)&&this.usedUnsignedInt.equals(rhs.usedUnsignedInt))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.usedMoney == rhs.usedMoney)||((this.usedMoney!= null)&&this.usedMoney.equals(rhs.usedMoney))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
