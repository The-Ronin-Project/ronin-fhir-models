
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "_type",
    "code",
    "factor",
    "_factor",
    "amount"
})
@Generated("jsonschema2pojo")
public class Invoice_PriceComponent {

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
     * This code identifies the type of the component.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("This code identifies the type of the component.")
    private Invoice_PriceComponent.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double factor;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _factor;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money amount;

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
     * This code identifies the type of the component.
     * 
     */
    @JsonProperty("type")
    public Invoice_PriceComponent.Type getType() {
        return type;
    }

    /**
     * This code identifies the type of the component.
     * 
     */
    @JsonProperty("type")
    public void setType(Invoice_PriceComponent.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public Double getFactor() {
        return factor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public void setFactor(Double factor) {
        this.factor = factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public Element get_factor() {
        return _factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public void set_factor(Element _factor) {
        this._factor = _factor;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("amount")
    public Money getAmount() {
        return amount;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Invoice_PriceComponent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("factor");
        sb.append('=');
        sb.append(((this.factor == null)?"<null>":this.factor));
        sb.append(',');
        sb.append("_factor");
        sb.append('=');
        sb.append(((this._factor == null)?"<null>":this._factor));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.factor == null)? 0 :this.factor.hashCode()));
        result = ((result* 31)+((this._factor == null)? 0 :this._factor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Invoice_PriceComponent) == false) {
            return false;
        }
        Invoice_PriceComponent rhs = ((Invoice_PriceComponent) other);
        return ((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.factor == rhs.factor)||((this.factor!= null)&&this.factor.equals(rhs.factor))))&&((this._factor == rhs._factor)||((this._factor!= null)&&this._factor.equals(rhs._factor))));
    }


    /**
     * This code identifies the type of the component.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        BASE("base"),
        SURCHARGE("surcharge"),
        DEDUCTION("deduction"),
        DISCOUNT("discount"),
        TAX("tax"),
        INFORMATIONAL("informational");
        private final String value;
        private final static Map<String, Invoice_PriceComponent.Type> CONSTANTS = new HashMap<String, Invoice_PriceComponent.Type>();

        static {
            for (Invoice_PriceComponent.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Invoice_PriceComponent.Type fromValue(String value) {
            Invoice_PriceComponent.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
