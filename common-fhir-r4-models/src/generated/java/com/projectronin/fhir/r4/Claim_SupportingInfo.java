
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "sequence",
    "_sequence",
    "category",
    "code",
    "timingDate",
    "_timingDate",
    "timingPeriod",
    "valueBoolean",
    "_valueBoolean",
    "valueString",
    "_valueString",
    "valueQuantity",
    "valueAttachment",
    "valueReference",
    "reason"
})
@Generated("jsonschema2pojo")
public class Claim_SupportingInfo {

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double sequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sequence;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
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
     * The date when or period to which this information refers.
     * 
     */
    @JsonProperty("timingDate")
    @JsonPropertyDescription("The date when or period to which this information refers.")
    private String timingDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timingDate;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period timingPeriod;
    /**
     * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
     * 
     */
    @JsonProperty("valueBoolean")
    @JsonPropertyDescription("Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.")
    private Boolean valueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBoolean;
    /**
     * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity valueQuantity;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("valueAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment valueAttachment;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference valueReference;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept reason;

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    public Double getSequence() {
        return sequence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public Element get_sequence() {
        return _sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public void set_sequence(Element _sequence) {
        this._sequence = _sequence;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
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
     * The date when or period to which this information refers.
     * 
     */
    @JsonProperty("timingDate")
    public String getTimingDate() {
        return timingDate;
    }

    /**
     * The date when or period to which this information refers.
     * 
     */
    @JsonProperty("timingDate")
    public void setTimingDate(String timingDate) {
        this.timingDate = timingDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDate")
    public Element get_timingDate() {
        return _timingDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDate")
    public void set_timingDate(Element _timingDate) {
        this._timingDate = _timingDate;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Period timingPeriod) {
        this.timingPeriod = timingPeriod;
    }

    /**
     * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
     * 
     */
    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
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
     * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reason")
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reason")
    public void setReason(CodeableConcept reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Claim_SupportingInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("sequence");
        sb.append('=');
        sb.append(((this.sequence == null)?"<null>":this.sequence));
        sb.append(',');
        sb.append("_sequence");
        sb.append('=');
        sb.append(((this._sequence == null)?"<null>":this._sequence));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("timingDate");
        sb.append('=');
        sb.append(((this.timingDate == null)?"<null>":this.timingDate));
        sb.append(',');
        sb.append("_timingDate");
        sb.append('=');
        sb.append(((this._timingDate == null)?"<null>":this._timingDate));
        sb.append(',');
        sb.append("timingPeriod");
        sb.append('=');
        sb.append(((this.timingPeriod == null)?"<null>":this.timingPeriod));
        sb.append(',');
        sb.append("valueBoolean");
        sb.append('=');
        sb.append(((this.valueBoolean == null)?"<null>":this.valueBoolean));
        sb.append(',');
        sb.append("_valueBoolean");
        sb.append('=');
        sb.append(((this._valueBoolean == null)?"<null>":this._valueBoolean));
        sb.append(',');
        sb.append("valueString");
        sb.append('=');
        sb.append(((this.valueString == null)?"<null>":this.valueString));
        sb.append(',');
        sb.append("_valueString");
        sb.append('=');
        sb.append(((this._valueString == null)?"<null>":this._valueString));
        sb.append(',');
        sb.append("valueQuantity");
        sb.append('=');
        sb.append(((this.valueQuantity == null)?"<null>":this.valueQuantity));
        sb.append(',');
        sb.append("valueAttachment");
        sb.append('=');
        sb.append(((this.valueAttachment == null)?"<null>":this.valueAttachment));
        sb.append(',');
        sb.append("valueReference");
        sb.append('=');
        sb.append(((this.valueReference == null)?"<null>":this.valueReference));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.valueReference == null)? 0 :this.valueReference.hashCode()));
        result = ((result* 31)+((this.timingPeriod == null)? 0 :this.timingPeriod.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.timingDate == null)? 0 :this.timingDate.hashCode()));
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this._timingDate == null)? 0 :this._timingDate.hashCode()));
        result = ((result* 31)+((this.valueAttachment == null)? 0 :this.valueAttachment.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.valueQuantity == null)? 0 :this.valueQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Claim_SupportingInfo) == false) {
            return false;
        }
        Claim_SupportingInfo rhs = ((Claim_SupportingInfo) other);
        return (((((((((((((((((((this.valueBoolean == rhs.valueBoolean)||((this.valueBoolean!= null)&&this.valueBoolean.equals(rhs.valueBoolean)))&&((this._valueBoolean == rhs._valueBoolean)||((this._valueBoolean!= null)&&this._valueBoolean.equals(rhs._valueBoolean))))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.valueReference == rhs.valueReference)||((this.valueReference!= null)&&this.valueReference.equals(rhs.valueReference))))&&((this.timingPeriod == rhs.timingPeriod)||((this.timingPeriod!= null)&&this.timingPeriod.equals(rhs.timingPeriod))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.timingDate == rhs.timingDate)||((this.timingDate!= null)&&this.timingDate.equals(rhs.timingDate))))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this._timingDate == rhs._timingDate)||((this._timingDate!= null)&&this._timingDate.equals(rhs._timingDate))))&&((this.valueAttachment == rhs.valueAttachment)||((this.valueAttachment!= null)&&this.valueAttachment.equals(rhs.valueAttachment))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.valueQuantity == rhs.valueQuantity)||((this.valueQuantity!= null)&&this.valueQuantity.equals(rhs.valueQuantity))));
    }

}
