
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "_code",
    "valueCode",
    "_valueCode",
    "valueCoding",
    "valueString",
    "_valueString",
    "valueInteger",
    "_valueInteger",
    "valueBoolean",
    "_valueBoolean",
    "valueDateTime",
    "_valueDateTime",
    "valueDecimal",
    "_valueDecimal"
})
@Generated("jsonschema2pojo")
public class CodeSystem_Property1 {

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
    @JsonProperty("code")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueCode")
    @JsonPropertyDescription("The value of this property.")
    private String valueCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueCode;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding valueCoding;
    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("The value of this property.")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueInteger")
    @JsonPropertyDescription("The value of this property.")
    private Double valueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInteger;
    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueBoolean")
    @JsonPropertyDescription("The value of this property.")
    private Boolean valueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBoolean;
    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueDateTime")
    @JsonPropertyDescription("The value of this property.")
    private String valueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDateTime;
    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueDecimal")
    @JsonPropertyDescription("The value of this property.")
    private Double valueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDecimal;

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
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public Element get_code() {
        return _code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public void set_code(Element _code) {
        this._code = _code;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueCode")
    public String getValueCode() {
        return valueCode;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueCode")
    public void setValueCode(String valueCode) {
        this.valueCode = valueCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCode")
    public Element get_valueCode() {
        return _valueCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCode")
    public void set_valueCode(Element _valueCode) {
        this._valueCode = _valueCode;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    public void setValueCoding(Coding valueCoding) {
        this.valueCoding = valueCoding;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueString")
    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    public Element get_valueString() {
        return _valueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    public void set_valueString(Element _valueString) {
        this._valueString = _valueString;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueInteger")
    public Double getValueInteger() {
        return valueInteger;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueInteger")
    public void setValueInteger(Double valueInteger) {
        this.valueInteger = valueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    public Element get_valueInteger() {
        return _valueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    public void set_valueInteger(Element _valueInteger) {
        this._valueInteger = _valueInteger;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    public Element get_valueBoolean() {
        return _valueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    public void set_valueBoolean(Element _valueBoolean) {
        this._valueBoolean = _valueBoolean;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueDateTime")
    public String getValueDateTime() {
        return valueDateTime;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueDateTime")
    public void setValueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    public Element get_valueDateTime() {
        return _valueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    public void set_valueDateTime(Element _valueDateTime) {
        this._valueDateTime = _valueDateTime;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueDecimal")
    public Double getValueDecimal() {
        return valueDecimal;
    }

    /**
     * The value of this property.
     * 
     */
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Double valueDecimal) {
        this.valueDecimal = valueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    public Element get_valueDecimal() {
        return _valueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    public void set_valueDecimal(Element _valueDecimal) {
        this._valueDecimal = _valueDecimal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CodeSystem_Property1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("valueCode");
        sb.append('=');
        sb.append(((this.valueCode == null)?"<null>":this.valueCode));
        sb.append(',');
        sb.append("_valueCode");
        sb.append('=');
        sb.append(((this._valueCode == null)?"<null>":this._valueCode));
        sb.append(',');
        sb.append("valueCoding");
        sb.append('=');
        sb.append(((this.valueCoding == null)?"<null>":this.valueCoding));
        sb.append(',');
        sb.append("valueString");
        sb.append('=');
        sb.append(((this.valueString == null)?"<null>":this.valueString));
        sb.append(',');
        sb.append("_valueString");
        sb.append('=');
        sb.append(((this._valueString == null)?"<null>":this._valueString));
        sb.append(',');
        sb.append("valueInteger");
        sb.append('=');
        sb.append(((this.valueInteger == null)?"<null>":this.valueInteger));
        sb.append(',');
        sb.append("_valueInteger");
        sb.append('=');
        sb.append(((this._valueInteger == null)?"<null>":this._valueInteger));
        sb.append(',');
        sb.append("valueBoolean");
        sb.append('=');
        sb.append(((this.valueBoolean == null)?"<null>":this.valueBoolean));
        sb.append(',');
        sb.append("_valueBoolean");
        sb.append('=');
        sb.append(((this._valueBoolean == null)?"<null>":this._valueBoolean));
        sb.append(',');
        sb.append("valueDateTime");
        sb.append('=');
        sb.append(((this.valueDateTime == null)?"<null>":this.valueDateTime));
        sb.append(',');
        sb.append("_valueDateTime");
        sb.append('=');
        sb.append(((this._valueDateTime == null)?"<null>":this._valueDateTime));
        sb.append(',');
        sb.append("valueDecimal");
        sb.append('=');
        sb.append(((this.valueDecimal == null)?"<null>":this.valueDecimal));
        sb.append(',');
        sb.append("_valueDecimal");
        sb.append('=');
        sb.append(((this._valueDecimal == null)?"<null>":this._valueDecimal));
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
        result = ((result* 31)+((this.valueCoding == null)? 0 :this.valueCoding.hashCode()));
        result = ((result* 31)+((this.valueBoolean == null)? 0 :this.valueBoolean.hashCode()));
        result = ((result* 31)+((this._valueBoolean == null)? 0 :this._valueBoolean.hashCode()));
        result = ((result* 31)+((this._valueString == null)? 0 :this._valueString.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.valueDecimal == null)? 0 :this.valueDecimal.hashCode()));
        result = ((result* 31)+((this.valueCode == null)? 0 :this.valueCode.hashCode()));
        result = ((result* 31)+((this._valueCode == null)? 0 :this._valueCode.hashCode()));
        result = ((result* 31)+((this._valueDateTime == null)? 0 :this._valueDateTime.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this._valueDecimal == null)? 0 :this._valueDecimal.hashCode()));
        result = ((result* 31)+((this.valueDateTime == null)? 0 :this.valueDateTime.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.valueInteger == null)? 0 :this.valueInteger.hashCode()));
        result = ((result* 31)+((this._valueInteger == null)? 0 :this._valueInteger.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeSystem_Property1) == false) {
            return false;
        }
        CodeSystem_Property1 rhs = ((CodeSystem_Property1) other);
        return (((((((((((((((((((this.valueCoding == rhs.valueCoding)||((this.valueCoding!= null)&&this.valueCoding.equals(rhs.valueCoding)))&&((this.valueBoolean == rhs.valueBoolean)||((this.valueBoolean!= null)&&this.valueBoolean.equals(rhs.valueBoolean))))&&((this._valueBoolean == rhs._valueBoolean)||((this._valueBoolean!= null)&&this._valueBoolean.equals(rhs._valueBoolean))))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.valueDecimal == rhs.valueDecimal)||((this.valueDecimal!= null)&&this.valueDecimal.equals(rhs.valueDecimal))))&&((this.valueCode == rhs.valueCode)||((this.valueCode!= null)&&this.valueCode.equals(rhs.valueCode))))&&((this._valueCode == rhs._valueCode)||((this._valueCode!= null)&&this._valueCode.equals(rhs._valueCode))))&&((this._valueDateTime == rhs._valueDateTime)||((this._valueDateTime!= null)&&this._valueDateTime.equals(rhs._valueDateTime))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this._valueDecimal == rhs._valueDecimal)||((this._valueDecimal!= null)&&this._valueDecimal.equals(rhs._valueDecimal))))&&((this.valueDateTime == rhs.valueDateTime)||((this.valueDateTime!= null)&&this.valueDateTime.equals(rhs.valueDateTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.valueInteger == rhs.valueInteger)||((this.valueInteger!= null)&&this.valueInteger.equals(rhs.valueInteger))))&&((this._valueInteger == rhs._valueInteger)||((this._valueInteger!= null)&&this._valueInteger.equals(rhs._valueInteger))));
    }

}
