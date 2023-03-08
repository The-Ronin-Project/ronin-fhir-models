
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "measure",
    "detailQuantity",
    "detailRange",
    "detailCodeableConcept",
    "detailString",
    "_detailString",
    "detailBoolean",
    "_detailBoolean",
    "detailInteger",
    "_detailInteger",
    "detailRatio",
    "dueDate",
    "_dueDate",
    "dueDuration"
})
@Generated("jsonschema2pojo")
public class Goal_Target {

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
    @JsonProperty("measure")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept measure;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("detailQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity detailQuantity;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("detailRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range detailRange;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("detailCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept detailCodeableConcept;
    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailString")
    @JsonPropertyDescription("The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.")
    private String detailString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _detailString;
    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailBoolean")
    @JsonPropertyDescription("The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.")
    private Boolean detailBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _detailBoolean;
    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailInteger")
    @JsonPropertyDescription("The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.")
    private Double detailInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _detailInteger;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("detailRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio detailRatio;
    /**
     * Indicates either the date or the duration after start by which the goal should be met.
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Indicates either the date or the duration after start by which the goal should be met.")
    private String dueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dueDate;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("dueDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration dueDuration;

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
    @JsonProperty("measure")
    public CodeableConcept getMeasure() {
        return measure;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(CodeableConcept measure) {
        this.measure = measure;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("detailQuantity")
    public Quantity getDetailQuantity() {
        return detailQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("detailQuantity")
    public void setDetailQuantity(Quantity detailQuantity) {
        this.detailQuantity = detailQuantity;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("detailRange")
    public Range getDetailRange() {
        return detailRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("detailRange")
    public void setDetailRange(Range detailRange) {
        this.detailRange = detailRange;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("detailCodeableConcept")
    public CodeableConcept getDetailCodeableConcept() {
        return detailCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("detailCodeableConcept")
    public void setDetailCodeableConcept(CodeableConcept detailCodeableConcept) {
        this.detailCodeableConcept = detailCodeableConcept;
    }

    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailString")
    public String getDetailString() {
        return detailString;
    }

    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailString")
    public void setDetailString(String detailString) {
        this.detailString = detailString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailString")
    public Element get_detailString() {
        return _detailString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailString")
    public void set_detailString(Element _detailString) {
        this._detailString = _detailString;
    }

    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailBoolean")
    public Boolean getDetailBoolean() {
        return detailBoolean;
    }

    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailBoolean")
    public void setDetailBoolean(Boolean detailBoolean) {
        this.detailBoolean = detailBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailBoolean")
    public Element get_detailBoolean() {
        return _detailBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailBoolean")
    public void set_detailBoolean(Element _detailBoolean) {
        this._detailBoolean = _detailBoolean;
    }

    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailInteger")
    public Double getDetailInteger() {
        return detailInteger;
    }

    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
     * 
     */
    @JsonProperty("detailInteger")
    public void setDetailInteger(Double detailInteger) {
        this.detailInteger = detailInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailInteger")
    public Element get_detailInteger() {
        return _detailInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailInteger")
    public void set_detailInteger(Element _detailInteger) {
        this._detailInteger = _detailInteger;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("detailRatio")
    public Ratio getDetailRatio() {
        return detailRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("detailRatio")
    public void setDetailRatio(Ratio detailRatio) {
        this.detailRatio = detailRatio;
    }

    /**
     * Indicates either the date or the duration after start by which the goal should be met.
     * 
     */
    @JsonProperty("dueDate")
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Indicates either the date or the duration after start by which the goal should be met.
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dueDate")
    public Element get_dueDate() {
        return _dueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dueDate")
    public void set_dueDate(Element _dueDate) {
        this._dueDate = _dueDate;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("dueDuration")
    public Duration getDueDuration() {
        return dueDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("dueDuration")
    public void setDueDuration(Duration dueDuration) {
        this.dueDuration = dueDuration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Goal_Target.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
        sb.append(',');
        sb.append("detailQuantity");
        sb.append('=');
        sb.append(((this.detailQuantity == null)?"<null>":this.detailQuantity));
        sb.append(',');
        sb.append("detailRange");
        sb.append('=');
        sb.append(((this.detailRange == null)?"<null>":this.detailRange));
        sb.append(',');
        sb.append("detailCodeableConcept");
        sb.append('=');
        sb.append(((this.detailCodeableConcept == null)?"<null>":this.detailCodeableConcept));
        sb.append(',');
        sb.append("detailString");
        sb.append('=');
        sb.append(((this.detailString == null)?"<null>":this.detailString));
        sb.append(',');
        sb.append("_detailString");
        sb.append('=');
        sb.append(((this._detailString == null)?"<null>":this._detailString));
        sb.append(',');
        sb.append("detailBoolean");
        sb.append('=');
        sb.append(((this.detailBoolean == null)?"<null>":this.detailBoolean));
        sb.append(',');
        sb.append("_detailBoolean");
        sb.append('=');
        sb.append(((this._detailBoolean == null)?"<null>":this._detailBoolean));
        sb.append(',');
        sb.append("detailInteger");
        sb.append('=');
        sb.append(((this.detailInteger == null)?"<null>":this.detailInteger));
        sb.append(',');
        sb.append("_detailInteger");
        sb.append('=');
        sb.append(((this._detailInteger == null)?"<null>":this._detailInteger));
        sb.append(',');
        sb.append("detailRatio");
        sb.append('=');
        sb.append(((this.detailRatio == null)?"<null>":this.detailRatio));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("_dueDate");
        sb.append('=');
        sb.append(((this._dueDate == null)?"<null>":this._dueDate));
        sb.append(',');
        sb.append("dueDuration");
        sb.append('=');
        sb.append(((this.dueDuration == null)?"<null>":this.dueDuration));
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
        result = ((result* 31)+((this.detailRange == null)? 0 :this.detailRange.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.detailQuantity == null)? 0 :this.detailQuantity.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this._detailInteger == null)? 0 :this._detailInteger.hashCode()));
        result = ((result* 31)+((this.detailString == null)? 0 :this.detailString.hashCode()));
        result = ((result* 31)+((this.detailBoolean == null)? 0 :this.detailBoolean.hashCode()));
        result = ((result* 31)+((this._detailString == null)? 0 :this._detailString.hashCode()));
        result = ((result* 31)+((this.dueDuration == null)? 0 :this.dueDuration.hashCode()));
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        result = ((result* 31)+((this._detailBoolean == null)? 0 :this._detailBoolean.hashCode()));
        result = ((result* 31)+((this.detailRatio == null)? 0 :this.detailRatio.hashCode()));
        result = ((result* 31)+((this.detailInteger == null)? 0 :this.detailInteger.hashCode()));
        result = ((result* 31)+((this._dueDate == null)? 0 :this._dueDate.hashCode()));
        result = ((result* 31)+((this.detailCodeableConcept == null)? 0 :this.detailCodeableConcept.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Goal_Target) == false) {
            return false;
        }
        Goal_Target rhs = ((Goal_Target) other);
        return ((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.detailRange == rhs.detailRange)||((this.detailRange!= null)&&this.detailRange.equals(rhs.detailRange))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.detailQuantity == rhs.detailQuantity)||((this.detailQuantity!= null)&&this.detailQuantity.equals(rhs.detailQuantity))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this._detailInteger == rhs._detailInteger)||((this._detailInteger!= null)&&this._detailInteger.equals(rhs._detailInteger))))&&((this.detailString == rhs.detailString)||((this.detailString!= null)&&this.detailString.equals(rhs.detailString))))&&((this.detailBoolean == rhs.detailBoolean)||((this.detailBoolean!= null)&&this.detailBoolean.equals(rhs.detailBoolean))))&&((this._detailString == rhs._detailString)||((this._detailString!= null)&&this._detailString.equals(rhs._detailString))))&&((this.dueDuration == rhs.dueDuration)||((this.dueDuration!= null)&&this.dueDuration.equals(rhs.dueDuration))))&&((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure))))&&((this._detailBoolean == rhs._detailBoolean)||((this._detailBoolean!= null)&&this._detailBoolean.equals(rhs._detailBoolean))))&&((this.detailRatio == rhs.detailRatio)||((this.detailRatio!= null)&&this.detailRatio.equals(rhs.detailRatio))))&&((this.detailInteger == rhs.detailInteger)||((this.detailInteger!= null)&&this.detailInteger.equals(rhs.detailInteger))))&&((this._dueDate == rhs._dueDate)||((this._dueDate!= null)&&this._dueDate.equals(rhs._dueDate))))&&((this.detailCodeableConcept == rhs.detailCodeableConcept)||((this.detailCodeableConcept!= null)&&this.detailCodeableConcept.equals(rhs.detailCodeableConcept))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
