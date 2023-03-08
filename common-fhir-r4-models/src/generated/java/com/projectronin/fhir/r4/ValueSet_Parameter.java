
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "name",
    "_name",
    "valueString",
    "_valueString",
    "valueBoolean",
    "_valueBoolean",
    "valueInteger",
    "_valueInteger",
    "valueDecimal",
    "_valueDecimal",
    "valueUri",
    "_valueUri",
    "valueCode",
    "_valueCode",
    "valueDateTime",
    "_valueDateTime"
})
@Generated("jsonschema2pojo")
public class ValueSet_Parameter {

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
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("The value of the parameter.")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueBoolean")
    @JsonPropertyDescription("The value of the parameter.")
    private Boolean valueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBoolean;
    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueInteger")
    @JsonPropertyDescription("The value of the parameter.")
    private Double valueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInteger;
    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueDecimal")
    @JsonPropertyDescription("The value of the parameter.")
    private Double valueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDecimal;
    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueUri")
    @JsonPropertyDescription("The value of the parameter.")
    private String valueUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueUri;
    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueCode")
    @JsonPropertyDescription("The value of the parameter.")
    private String valueCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueCode;
    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueDateTime")
    @JsonPropertyDescription("The value of the parameter.")
    private String valueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDateTime;

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
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * The value of the parameter.
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
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * The value of the parameter.
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
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueInteger")
    public Double getValueInteger() {
        return valueInteger;
    }

    /**
     * The value of the parameter.
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
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueDecimal")
    public Double getValueDecimal() {
        return valueDecimal;
    }

    /**
     * The value of the parameter.
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

    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueUri")
    public String getValueUri() {
        return valueUri;
    }

    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueUri")
    public void setValueUri(String valueUri) {
        this.valueUri = valueUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUri")
    public Element get_valueUri() {
        return _valueUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUri")
    public void set_valueUri(Element _valueUri) {
        this._valueUri = _valueUri;
    }

    /**
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueCode")
    public String getValueCode() {
        return valueCode;
    }

    /**
     * The value of the parameter.
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
     * The value of the parameter.
     * 
     */
    @JsonProperty("valueDateTime")
    public String getValueDateTime() {
        return valueDateTime;
    }

    /**
     * The value of the parameter.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValueSet_Parameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("valueString");
        sb.append('=');
        sb.append(((this.valueString == null)?"<null>":this.valueString));
        sb.append(',');
        sb.append("_valueString");
        sb.append('=');
        sb.append(((this._valueString == null)?"<null>":this._valueString));
        sb.append(',');
        sb.append("valueBoolean");
        sb.append('=');
        sb.append(((this.valueBoolean == null)?"<null>":this.valueBoolean));
        sb.append(',');
        sb.append("_valueBoolean");
        sb.append('=');
        sb.append(((this._valueBoolean == null)?"<null>":this._valueBoolean));
        sb.append(',');
        sb.append("valueInteger");
        sb.append('=');
        sb.append(((this.valueInteger == null)?"<null>":this.valueInteger));
        sb.append(',');
        sb.append("_valueInteger");
        sb.append('=');
        sb.append(((this._valueInteger == null)?"<null>":this._valueInteger));
        sb.append(',');
        sb.append("valueDecimal");
        sb.append('=');
        sb.append(((this.valueDecimal == null)?"<null>":this.valueDecimal));
        sb.append(',');
        sb.append("_valueDecimal");
        sb.append('=');
        sb.append(((this._valueDecimal == null)?"<null>":this._valueDecimal));
        sb.append(',');
        sb.append("valueUri");
        sb.append('=');
        sb.append(((this.valueUri == null)?"<null>":this.valueUri));
        sb.append(',');
        sb.append("_valueUri");
        sb.append('=');
        sb.append(((this._valueUri == null)?"<null>":this._valueUri));
        sb.append(',');
        sb.append("valueCode");
        sb.append('=');
        sb.append(((this.valueCode == null)?"<null>":this.valueCode));
        sb.append(',');
        sb.append("_valueCode");
        sb.append('=');
        sb.append(((this._valueCode == null)?"<null>":this._valueCode));
        sb.append(',');
        sb.append("valueDateTime");
        sb.append('=');
        sb.append(((this.valueDateTime == null)?"<null>":this.valueDateTime));
        sb.append(',');
        sb.append("_valueDateTime");
        sb.append('=');
        sb.append(((this._valueDateTime == null)?"<null>":this._valueDateTime));
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
        result = ((result* 31)+((this.valueBoolean == null)? 0 :this.valueBoolean.hashCode()));
        result = ((result* 31)+((this._valueBoolean == null)? 0 :this._valueBoolean.hashCode()));
        result = ((result* 31)+((this._valueString == null)? 0 :this._valueString.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.valueDecimal == null)? 0 :this.valueDecimal.hashCode()));
        result = ((result* 31)+((this.valueUri == null)? 0 :this.valueUri.hashCode()));
        result = ((result* 31)+((this.valueCode == null)? 0 :this.valueCode.hashCode()));
        result = ((result* 31)+((this._valueCode == null)? 0 :this._valueCode.hashCode()));
        result = ((result* 31)+((this._valueUri == null)? 0 :this._valueUri.hashCode()));
        result = ((result* 31)+((this._valueDateTime == null)? 0 :this._valueDateTime.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this._valueDecimal == null)? 0 :this._valueDecimal.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
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
        if ((other instanceof ValueSet_Parameter) == false) {
            return false;
        }
        ValueSet_Parameter rhs = ((ValueSet_Parameter) other);
        return ((((((((((((((((((((this.valueBoolean == rhs.valueBoolean)||((this.valueBoolean!= null)&&this.valueBoolean.equals(rhs.valueBoolean)))&&((this._valueBoolean == rhs._valueBoolean)||((this._valueBoolean!= null)&&this._valueBoolean.equals(rhs._valueBoolean))))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.valueDecimal == rhs.valueDecimal)||((this.valueDecimal!= null)&&this.valueDecimal.equals(rhs.valueDecimal))))&&((this.valueUri == rhs.valueUri)||((this.valueUri!= null)&&this.valueUri.equals(rhs.valueUri))))&&((this.valueCode == rhs.valueCode)||((this.valueCode!= null)&&this.valueCode.equals(rhs.valueCode))))&&((this._valueCode == rhs._valueCode)||((this._valueCode!= null)&&this._valueCode.equals(rhs._valueCode))))&&((this._valueUri == rhs._valueUri)||((this._valueUri!= null)&&this._valueUri.equals(rhs._valueUri))))&&((this._valueDateTime == rhs._valueDateTime)||((this._valueDateTime!= null)&&this._valueDateTime.equals(rhs._valueDateTime))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this._valueDecimal == rhs._valueDecimal)||((this._valueDecimal!= null)&&this._valueDecimal.equals(rhs._valueDecimal))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.valueDateTime == rhs.valueDateTime)||((this.valueDateTime!= null)&&this.valueDateTime.equals(rhs.valueDateTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.valueInteger == rhs.valueInteger)||((this.valueInteger!= null)&&this.valueInteger.equals(rhs.valueInteger))))&&((this._valueInteger == rhs._valueInteger)||((this._valueInteger!= null)&&this._valueInteger.equals(rhs._valueInteger))));
    }

}
