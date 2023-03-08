
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
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "property",
    "_property",
    "op",
    "_op",
    "value",
    "_value"
})
@Generated("jsonschema2pojo")
public class ValueSet_Filter {

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String property;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_property")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _property;
    /**
     * The kind of operation to perform as a part of the filter criteria.
     * 
     */
    @JsonProperty("op")
    @JsonPropertyDescription("The kind of operation to perform as a part of the filter criteria.")
    private ValueSet_Filter.Op op;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_op")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _op;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String value;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _value;

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("property")
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_property")
    public Element get_property() {
        return _property;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_property")
    public void set_property(Element _property) {
        this._property = _property;
    }

    /**
     * The kind of operation to perform as a part of the filter criteria.
     * 
     */
    @JsonProperty("op")
    public ValueSet_Filter.Op getOp() {
        return op;
    }

    /**
     * The kind of operation to perform as a part of the filter criteria.
     * 
     */
    @JsonProperty("op")
    public void setOp(ValueSet_Filter.Op op) {
        this.op = op;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_op")
    public Element get_op() {
        return _op;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_op")
    public void set_op(Element _op) {
        this._op = _op;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public Element get_value() {
        return _value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public void set_value(Element _value) {
        this._value = _value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValueSet_Filter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("_property");
        sb.append('=');
        sb.append(((this._property == null)?"<null>":this._property));
        sb.append(',');
        sb.append("op");
        sb.append('=');
        sb.append(((this.op == null)?"<null>":this.op));
        sb.append(',');
        sb.append("_op");
        sb.append('=');
        sb.append(((this._op == null)?"<null>":this._op));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("_value");
        sb.append('=');
        sb.append(((this._value == null)?"<null>":this._value));
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
        result = ((result* 31)+((this.op == null)? 0 :this.op.hashCode()));
        result = ((result* 31)+((this._op == null)? 0 :this._op.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._property == null)? 0 :this._property.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this._value == null)? 0 :this._value.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueSet_Filter) == false) {
            return false;
        }
        ValueSet_Filter rhs = ((ValueSet_Filter) other);
        return ((((((((((this.op == rhs.op)||((this.op!= null)&&this.op.equals(rhs.op)))&&((this._op == rhs._op)||((this._op!= null)&&this._op.equals(rhs._op))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._property == rhs._property)||((this._property!= null)&&this._property.equals(rhs._property))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this._value == rhs._value)||((this._value!= null)&&this._value.equals(rhs._value))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }


    /**
     * The kind of operation to perform as a part of the filter criteria.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Op {

        EQUAL("="),
        IS_A("is-a"),
        DESCENDENT_OF("descendent-of"),
        IS_NOT_A("is-not-a"),
        REGEX("regex"),
        IN("in"),
        NOT_IN("not-in"),
        GENERALIZES("generalizes"),
        EXISTS("exists");
        private final String value;
        private final static Map<String, ValueSet_Filter.Op> CONSTANTS = new HashMap<String, ValueSet_Filter.Op>();

        static {
            for (ValueSet_Filter.Op c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Op(String value) {
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
        public static ValueSet_Filter.Op fromValue(String value) {
            ValueSet_Filter.Op constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
