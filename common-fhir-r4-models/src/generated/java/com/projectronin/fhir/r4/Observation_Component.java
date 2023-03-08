
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Measurements and simple assertions made about a patient, device or other subject.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "valueQuantity",
    "valueCodeableConcept",
    "valueString",
    "_valueString",
    "valueBoolean",
    "_valueBoolean",
    "valueInteger",
    "_valueInteger",
    "valueRange",
    "valueRatio",
    "valueSampledData",
    "valueTime",
    "_valueTime",
    "valueDateTime",
    "_valueDateTime",
    "valuePeriod",
    "dataAbsentReason",
    "interpretation",
    "referenceRange"
})
@Generated("jsonschema2pojo")
public class Observation_Component {

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
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity valueQuantity;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept valueCodeableConcept;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueBoolean")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private Boolean valueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBoolean;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueInteger")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private Double valueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInteger;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range valueRange;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio valueRatio;
    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    @JsonPropertyDescription("A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.")
    private SampledData valueSampledData;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueTime")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private String valueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueTime;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueDateTime")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private String valueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period valuePeriod;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dataAbsentReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept dataAbsentReason;
    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     * 
     */
    @JsonProperty("interpretation")
    @JsonPropertyDescription("A categorical assessment of an observation value.  For example, high, low, normal.")
    private List<CodeableConcept> interpretation = new ArrayList<CodeableConcept>();
    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.
     * 
     */
    @JsonProperty("referenceRange")
    @JsonPropertyDescription("Guidance on how to interpret the value by comparison to a normal or recommended range.")
    private List<Observation_ReferenceRange> referenceRange = new ArrayList<Observation_ReferenceRange>();

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
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
        this.valueCodeableConcept = valueCodeableConcept;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
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
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
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
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueInteger")
    public Double getValueInteger() {
        return valueInteger;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
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
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    public void setValueRange(Range valueRange) {
        this.valueRange = valueRange;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    public void setValueRatio(Ratio valueRatio) {
        this.valueRatio = valueRatio;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    public void setValueSampledData(SampledData valueSampledData) {
        this.valueSampledData = valueSampledData;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueTime")
    public String getValueTime() {
        return valueTime;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
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
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueDateTime")
    public String getValueDateTime() {
        return valueDateTime;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Period valuePeriod) {
        this.valuePeriod = valuePeriod;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dataAbsentReason")
    public CodeableConcept getDataAbsentReason() {
        return dataAbsentReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(CodeableConcept dataAbsentReason) {
        this.dataAbsentReason = dataAbsentReason;
    }

    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     * 
     */
    @JsonProperty("interpretation")
    public List<CodeableConcept> getInterpretation() {
        return interpretation;
    }

    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     * 
     */
    @JsonProperty("interpretation")
    public void setInterpretation(List<CodeableConcept> interpretation) {
        this.interpretation = interpretation;
    }

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.
     * 
     */
    @JsonProperty("referenceRange")
    public List<Observation_ReferenceRange> getReferenceRange() {
        return referenceRange;
    }

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.
     * 
     */
    @JsonProperty("referenceRange")
    public void setReferenceRange(List<Observation_ReferenceRange> referenceRange) {
        this.referenceRange = referenceRange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Observation_Component.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("valueQuantity");
        sb.append('=');
        sb.append(((this.valueQuantity == null)?"<null>":this.valueQuantity));
        sb.append(',');
        sb.append("valueCodeableConcept");
        sb.append('=');
        sb.append(((this.valueCodeableConcept == null)?"<null>":this.valueCodeableConcept));
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
        sb.append("valueRange");
        sb.append('=');
        sb.append(((this.valueRange == null)?"<null>":this.valueRange));
        sb.append(',');
        sb.append("valueRatio");
        sb.append('=');
        sb.append(((this.valueRatio == null)?"<null>":this.valueRatio));
        sb.append(',');
        sb.append("valueSampledData");
        sb.append('=');
        sb.append(((this.valueSampledData == null)?"<null>":this.valueSampledData));
        sb.append(',');
        sb.append("valueTime");
        sb.append('=');
        sb.append(((this.valueTime == null)?"<null>":this.valueTime));
        sb.append(',');
        sb.append("_valueTime");
        sb.append('=');
        sb.append(((this._valueTime == null)?"<null>":this._valueTime));
        sb.append(',');
        sb.append("valueDateTime");
        sb.append('=');
        sb.append(((this.valueDateTime == null)?"<null>":this.valueDateTime));
        sb.append(',');
        sb.append("_valueDateTime");
        sb.append('=');
        sb.append(((this._valueDateTime == null)?"<null>":this._valueDateTime));
        sb.append(',');
        sb.append("valuePeriod");
        sb.append('=');
        sb.append(((this.valuePeriod == null)?"<null>":this.valuePeriod));
        sb.append(',');
        sb.append("dataAbsentReason");
        sb.append('=');
        sb.append(((this.dataAbsentReason == null)?"<null>":this.dataAbsentReason));
        sb.append(',');
        sb.append("interpretation");
        sb.append('=');
        sb.append(((this.interpretation == null)?"<null>":this.interpretation));
        sb.append(',');
        sb.append("referenceRange");
        sb.append('=');
        sb.append(((this.referenceRange == null)?"<null>":this.referenceRange));
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
        result = ((result* 31)+((this.dataAbsentReason == null)? 0 :this.dataAbsentReason.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.valueTime == null)? 0 :this.valueTime.hashCode()));
        result = ((result* 31)+((this._valueTime == null)? 0 :this._valueTime.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.valueRange == null)? 0 :this.valueRange.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._valueDateTime == null)? 0 :this._valueDateTime.hashCode()));
        result = ((result* 31)+((this.valueCodeableConcept == null)? 0 :this.valueCodeableConcept.hashCode()));
        result = ((result* 31)+((this.valueRatio == null)? 0 :this.valueRatio.hashCode()));
        result = ((result* 31)+((this.referenceRange == null)? 0 :this.referenceRange.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this.interpretation == null)? 0 :this.interpretation.hashCode()));
        result = ((result* 31)+((this.valueSampledData == null)? 0 :this.valueSampledData.hashCode()));
        result = ((result* 31)+((this.valuePeriod == null)? 0 :this.valuePeriod.hashCode()));
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
        if ((other instanceof Observation_Component) == false) {
            return false;
        }
        Observation_Component rhs = ((Observation_Component) other);
        return ((((((((((((((((((((((((this.valueBoolean == rhs.valueBoolean)||((this.valueBoolean!= null)&&this.valueBoolean.equals(rhs.valueBoolean)))&&((this._valueBoolean == rhs._valueBoolean)||((this._valueBoolean!= null)&&this._valueBoolean.equals(rhs._valueBoolean))))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.dataAbsentReason == rhs.dataAbsentReason)||((this.dataAbsentReason!= null)&&this.dataAbsentReason.equals(rhs.dataAbsentReason))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.valueTime == rhs.valueTime)||((this.valueTime!= null)&&this.valueTime.equals(rhs.valueTime))))&&((this._valueTime == rhs._valueTime)||((this._valueTime!= null)&&this._valueTime.equals(rhs._valueTime))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.valueRange == rhs.valueRange)||((this.valueRange!= null)&&this.valueRange.equals(rhs.valueRange))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._valueDateTime == rhs._valueDateTime)||((this._valueDateTime!= null)&&this._valueDateTime.equals(rhs._valueDateTime))))&&((this.valueCodeableConcept == rhs.valueCodeableConcept)||((this.valueCodeableConcept!= null)&&this.valueCodeableConcept.equals(rhs.valueCodeableConcept))))&&((this.valueRatio == rhs.valueRatio)||((this.valueRatio!= null)&&this.valueRatio.equals(rhs.valueRatio))))&&((this.referenceRange == rhs.referenceRange)||((this.referenceRange!= null)&&this.referenceRange.equals(rhs.referenceRange))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this.interpretation == rhs.interpretation)||((this.interpretation!= null)&&this.interpretation.equals(rhs.interpretation))))&&((this.valueSampledData == rhs.valueSampledData)||((this.valueSampledData!= null)&&this.valueSampledData.equals(rhs.valueSampledData))))&&((this.valuePeriod == rhs.valuePeriod)||((this.valuePeriod!= null)&&this.valuePeriod.equals(rhs.valuePeriod))))&&((this.valueDateTime == rhs.valueDateTime)||((this.valueDateTime!= null)&&this.valueDateTime.equals(rhs.valueDateTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.valueInteger == rhs.valueInteger)||((this.valueInteger!= null)&&this.valueInteger.equals(rhs.valueInteger))))&&((this._valueInteger == rhs._valueInteger)||((this._valueInteger!= null)&&this._valueInteger.equals(rhs._valueInteger))))&&((this.valueQuantity == rhs.valueQuantity)||((this.valueQuantity!= null)&&this.valueQuantity.equals(rhs.valueQuantity))));
    }

}
