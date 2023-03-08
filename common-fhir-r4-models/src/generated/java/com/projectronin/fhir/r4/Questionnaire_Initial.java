
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
    "valueBoolean",
    "_valueBoolean",
    "valueDecimal",
    "_valueDecimal",
    "valueInteger",
    "_valueInteger",
    "valueDate",
    "_valueDate",
    "valueDateTime",
    "_valueDateTime",
    "valueTime",
    "_valueTime",
    "valueString",
    "_valueString",
    "valueUri",
    "_valueUri",
    "valueAttachment",
    "valueCoding",
    "valueQuantity",
    "valueReference"
})
@Generated("jsonschema2pojo")
public class Questionnaire_Initial {

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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueBoolean")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private Boolean valueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBoolean;
    /**
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueDecimal")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private Double valueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDecimal;
    /**
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueInteger")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private Double valueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInteger;
    /**
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueDate")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private String valueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDate;
    /**
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueDateTime")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private String valueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDateTime;
    /**
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueTime")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private String valueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueTime;
    /**
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueUri")
    @JsonPropertyDescription("The actual value to for an initial answer.")
    private String valueUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueUri;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("valueAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment valueAttachment;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding valueCoding;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity valueQuantity;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference valueReference;

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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * The actual value to for an initial answer.
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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueDecimal")
    public Double getValueDecimal() {
        return valueDecimal;
    }

    /**
     * The actual value to for an initial answer.
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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueInteger")
    public Double getValueInteger() {
        return valueInteger;
    }

    /**
     * The actual value to for an initial answer.
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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueDate")
    public String getValueDate() {
        return valueDate;
    }

    /**
     * The actual value to for an initial answer.
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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueDateTime")
    public String getValueDateTime() {
        return valueDateTime;
    }

    /**
     * The actual value to for an initial answer.
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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueTime")
    public String getValueTime() {
        return valueTime;
    }

    /**
     * The actual value to for an initial answer.
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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * The actual value to for an initial answer.
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
     * The actual value to for an initial answer.
     * 
     */
    @JsonProperty("valueUri")
    public String getValueUri() {
        return valueUri;
    }

    /**
     * The actual value to for an initial answer.
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
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("valueAttachment")
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Attachment valueAttachment) {
        this.valueAttachment = valueAttachment;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Quantity valueQuantity) {
        this.valueQuantity = valueQuantity;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Questionnaire_Initial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("valueBoolean");
        sb.append('=');
        sb.append(((this.valueBoolean == null)?"<null>":this.valueBoolean));
        sb.append(',');
        sb.append("_valueBoolean");
        sb.append('=');
        sb.append(((this._valueBoolean == null)?"<null>":this._valueBoolean));
        sb.append(',');
        sb.append("valueDecimal");
        sb.append('=');
        sb.append(((this.valueDecimal == null)?"<null>":this.valueDecimal));
        sb.append(',');
        sb.append("_valueDecimal");
        sb.append('=');
        sb.append(((this._valueDecimal == null)?"<null>":this._valueDecimal));
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
        sb.append("valueDateTime");
        sb.append('=');
        sb.append(((this.valueDateTime == null)?"<null>":this.valueDateTime));
        sb.append(',');
        sb.append("_valueDateTime");
        sb.append('=');
        sb.append(((this._valueDateTime == null)?"<null>":this._valueDateTime));
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
        sb.append("valueUri");
        sb.append('=');
        sb.append(((this.valueUri == null)?"<null>":this.valueUri));
        sb.append(',');
        sb.append("_valueUri");
        sb.append('=');
        sb.append(((this._valueUri == null)?"<null>":this._valueUri));
        sb.append(',');
        sb.append("valueAttachment");
        sb.append('=');
        sb.append(((this.valueAttachment == null)?"<null>":this.valueAttachment));
        sb.append(',');
        sb.append("valueCoding");
        sb.append('=');
        sb.append(((this.valueCoding == null)?"<null>":this.valueCoding));
        sb.append(',');
        sb.append("valueQuantity");
        sb.append('=');
        sb.append(((this.valueQuantity == null)?"<null>":this.valueQuantity));
        sb.append(',');
        sb.append("valueReference");
        sb.append('=');
        sb.append(((this.valueReference == null)?"<null>":this.valueReference));
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
        result = ((result* 31)+((this.valueCoding == null)? 0 :this.valueCoding.hashCode()));
        result = ((result* 31)+((this._valueString == null)? 0 :this._valueString.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.valueTime == null)? 0 :this.valueTime.hashCode()));
        result = ((result* 31)+((this._valueTime == null)? 0 :this._valueTime.hashCode()));
        result = ((result* 31)+((this.valueReference == null)? 0 :this.valueReference.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.valueDecimal == null)? 0 :this.valueDecimal.hashCode()));
        result = ((result* 31)+((this.valueUri == null)? 0 :this.valueUri.hashCode()));
        result = ((result* 31)+((this.valueDate == null)? 0 :this.valueDate.hashCode()));
        result = ((result* 31)+((this._valueUri == null)? 0 :this._valueUri.hashCode()));
        result = ((result* 31)+((this._valueDateTime == null)? 0 :this._valueDateTime.hashCode()));
        result = ((result* 31)+((this.valueAttachment == null)? 0 :this.valueAttachment.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this._valueDate == null)? 0 :this._valueDate.hashCode()));
        result = ((result* 31)+((this._valueDecimal == null)? 0 :this._valueDecimal.hashCode()));
        result = ((result* 31)+((this.valueDateTime == null)? 0 :this.valueDateTime.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.valueInteger == null)? 0 :this.valueInteger.hashCode()));
        result = ((result* 31)+((this._valueInteger == null)? 0 :this._valueInteger.hashCode()));
        result = ((result* 31)+((this.valueQuantity == null)? 0 :this.valueQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Questionnaire_Initial) == false) {
            return false;
        }
        Questionnaire_Initial rhs = ((Questionnaire_Initial) other);
        return ((((((((((((((((((((((((this.valueBoolean == rhs.valueBoolean)||((this.valueBoolean!= null)&&this.valueBoolean.equals(rhs.valueBoolean)))&&((this._valueBoolean == rhs._valueBoolean)||((this._valueBoolean!= null)&&this._valueBoolean.equals(rhs._valueBoolean))))&&((this.valueCoding == rhs.valueCoding)||((this.valueCoding!= null)&&this.valueCoding.equals(rhs.valueCoding))))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.valueTime == rhs.valueTime)||((this.valueTime!= null)&&this.valueTime.equals(rhs.valueTime))))&&((this._valueTime == rhs._valueTime)||((this._valueTime!= null)&&this._valueTime.equals(rhs._valueTime))))&&((this.valueReference == rhs.valueReference)||((this.valueReference!= null)&&this.valueReference.equals(rhs.valueReference))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.valueDecimal == rhs.valueDecimal)||((this.valueDecimal!= null)&&this.valueDecimal.equals(rhs.valueDecimal))))&&((this.valueUri == rhs.valueUri)||((this.valueUri!= null)&&this.valueUri.equals(rhs.valueUri))))&&((this.valueDate == rhs.valueDate)||((this.valueDate!= null)&&this.valueDate.equals(rhs.valueDate))))&&((this._valueUri == rhs._valueUri)||((this._valueUri!= null)&&this._valueUri.equals(rhs._valueUri))))&&((this._valueDateTime == rhs._valueDateTime)||((this._valueDateTime!= null)&&this._valueDateTime.equals(rhs._valueDateTime))))&&((this.valueAttachment == rhs.valueAttachment)||((this.valueAttachment!= null)&&this.valueAttachment.equals(rhs.valueAttachment))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this._valueDate == rhs._valueDate)||((this._valueDate!= null)&&this._valueDate.equals(rhs._valueDate))))&&((this._valueDecimal == rhs._valueDecimal)||((this._valueDecimal!= null)&&this._valueDecimal.equals(rhs._valueDecimal))))&&((this.valueDateTime == rhs.valueDateTime)||((this.valueDateTime!= null)&&this.valueDateTime.equals(rhs.valueDateTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.valueInteger == rhs.valueInteger)||((this.valueInteger!= null)&&this.valueInteger.equals(rhs.valueInteger))))&&((this._valueInteger == rhs._valueInteger)||((this._valueInteger!= null)&&this._valueInteger.equals(rhs._valueInteger))))&&((this.valueQuantity == rhs.valueQuantity)||((this.valueQuantity!= null)&&this.valueQuantity.equals(rhs.valueQuantity))));
    }

}
