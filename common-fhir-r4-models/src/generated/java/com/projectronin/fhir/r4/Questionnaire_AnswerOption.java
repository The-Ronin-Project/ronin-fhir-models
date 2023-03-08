
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "valueInteger",
    "_valueInteger",
    "valueDate",
    "_valueDate",
    "valueTime",
    "_valueTime",
    "valueString",
    "_valueString",
    "valueCoding",
    "valueReference",
    "initialSelected",
    "_initialSelected"
})
@Generated("jsonschema2pojo")
public class Questionnaire_AnswerOption {

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
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueInteger")
    @JsonPropertyDescription("A potential answer that's allowed as the answer to this question.")
    private Double valueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInteger;
    /**
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueDate")
    @JsonPropertyDescription("A potential answer that's allowed as the answer to this question.")
    private String valueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDate;
    /**
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueTime")
    @JsonPropertyDescription("A potential answer that's allowed as the answer to this question.")
    private String valueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueTime;
    /**
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("A potential answer that's allowed as the answer to this question.")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding valueCoding;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference valueReference;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("initialSelected")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean initialSelected;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initialSelected")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _initialSelected;

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
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueInteger")
    public Double getValueInteger() {
        return valueInteger;
    }

    /**
     * A potential answer that's allowed as the answer to this question.
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
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueDate")
    public String getValueDate() {
        return valueDate;
    }

    /**
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueDate")
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDate")
    public Element get_valueDate() {
        return _valueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDate")
    public void set_valueDate(Element _valueDate) {
        this._valueDate = _valueDate;
    }

    /**
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueTime")
    public String getValueTime() {
        return valueTime;
    }

    /**
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueTime")
    public void setValueTime(String valueTime) {
        this.valueTime = valueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    public Element get_valueTime() {
        return _valueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    public void set_valueTime(Element _valueTime) {
        this._valueTime = _valueTime;
    }

    /**
     * A potential answer that's allowed as the answer to this question.
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * A potential answer that's allowed as the answer to this question.
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    public Reference getValueReference() {
        return valueReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    public void setValueReference(Reference valueReference) {
        this.valueReference = valueReference;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("initialSelected")
    public Boolean getInitialSelected() {
        return initialSelected;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("initialSelected")
    public void setInitialSelected(Boolean initialSelected) {
        this.initialSelected = initialSelected;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initialSelected")
    public Element get_initialSelected() {
        return _initialSelected;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initialSelected")
    public void set_initialSelected(Element _initialSelected) {
        this._initialSelected = _initialSelected;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Questionnaire_AnswerOption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("valueInteger");
        sb.append('=');
        sb.append(((this.valueInteger == null)?"<null>":this.valueInteger));
        sb.append(',');
        sb.append("_valueInteger");
        sb.append('=');
        sb.append(((this._valueInteger == null)?"<null>":this._valueInteger));
        sb.append(',');
        sb.append("valueDate");
        sb.append('=');
        sb.append(((this.valueDate == null)?"<null>":this.valueDate));
        sb.append(',');
        sb.append("_valueDate");
        sb.append('=');
        sb.append(((this._valueDate == null)?"<null>":this._valueDate));
        sb.append(',');
        sb.append("valueTime");
        sb.append('=');
        sb.append(((this.valueTime == null)?"<null>":this.valueTime));
        sb.append(',');
        sb.append("_valueTime");
        sb.append('=');
        sb.append(((this._valueTime == null)?"<null>":this._valueTime));
        sb.append(',');
        sb.append("valueString");
        sb.append('=');
        sb.append(((this.valueString == null)?"<null>":this.valueString));
        sb.append(',');
        sb.append("_valueString");
        sb.append('=');
        sb.append(((this._valueString == null)?"<null>":this._valueString));
        sb.append(',');
        sb.append("valueCoding");
        sb.append('=');
        sb.append(((this.valueCoding == null)?"<null>":this.valueCoding));
        sb.append(',');
        sb.append("valueReference");
        sb.append('=');
        sb.append(((this.valueReference == null)?"<null>":this.valueReference));
        sb.append(',');
        sb.append("initialSelected");
        sb.append('=');
        sb.append(((this.initialSelected == null)?"<null>":this.initialSelected));
        sb.append(',');
        sb.append("_initialSelected");
        sb.append('=');
        sb.append(((this._initialSelected == null)?"<null>":this._initialSelected));
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
        result = ((result* 31)+((this._valueString == null)? 0 :this._valueString.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.valueTime == null)? 0 :this.valueTime.hashCode()));
        result = ((result* 31)+((this._valueTime == null)? 0 :this._valueTime.hashCode()));
        result = ((result* 31)+((this.valueReference == null)? 0 :this.valueReference.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._initialSelected == null)? 0 :this._initialSelected.hashCode()));
        result = ((result* 31)+((this.valueDate == null)? 0 :this.valueDate.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this._valueDate == null)? 0 :this._valueDate.hashCode()));
        result = ((result* 31)+((this.initialSelected == null)? 0 :this.initialSelected.hashCode()));
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
        if ((other instanceof Questionnaire_AnswerOption) == false) {
            return false;
        }
        Questionnaire_AnswerOption rhs = ((Questionnaire_AnswerOption) other);
        return ((((((((((((((((this.valueCoding == rhs.valueCoding)||((this.valueCoding!= null)&&this.valueCoding.equals(rhs.valueCoding)))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.valueTime == rhs.valueTime)||((this.valueTime!= null)&&this.valueTime.equals(rhs.valueTime))))&&((this._valueTime == rhs._valueTime)||((this._valueTime!= null)&&this._valueTime.equals(rhs._valueTime))))&&((this.valueReference == rhs.valueReference)||((this.valueReference!= null)&&this.valueReference.equals(rhs.valueReference))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._initialSelected == rhs._initialSelected)||((this._initialSelected!= null)&&this._initialSelected.equals(rhs._initialSelected))))&&((this.valueDate == rhs.valueDate)||((this.valueDate!= null)&&this.valueDate.equals(rhs.valueDate))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this._valueDate == rhs._valueDate)||((this._valueDate!= null)&&this._valueDate.equals(rhs._valueDate))))&&((this.initialSelected == rhs.initialSelected)||((this.initialSelected!= null)&&this.initialSelected.equals(rhs.initialSelected))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.valueInteger == rhs.valueInteger)||((this.valueInteger!= null)&&this.valueInteger.equals(rhs.valueInteger))))&&((this._valueInteger == rhs._valueInteger)||((this._valueInteger!= null)&&this._valueInteger.equals(rhs._valueInteger))));
    }

}
