
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "outcome",
    "contributedToDeath",
    "_contributedToDeath",
    "onsetAge",
    "onsetRange",
    "onsetPeriod",
    "onsetString",
    "_onsetString",
    "note"
})
@Generated("jsonschema2pojo")
public class FamilyMemberHistory_Condition {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept outcome;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("contributedToDeath")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean contributedToDeath;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contributedToDeath")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _contributedToDeath;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("onsetAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age onsetAge;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("onsetRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range onsetRange;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("onsetPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period onsetPeriod;
    /**
     * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
     * 
     */
    @JsonProperty("onsetString")
    @JsonPropertyDescription("Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.")
    private String onsetString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _onsetString;
    /**
     * An area where general notes can be placed about this specific condition.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("An area where general notes can be placed about this specific condition.")
    private List<Annotation> note = new ArrayList<Annotation>();

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    public CodeableConcept getOutcome() {
        return outcome;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(CodeableConcept outcome) {
        this.outcome = outcome;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("contributedToDeath")
    public Boolean getContributedToDeath() {
        return contributedToDeath;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("contributedToDeath")
    public void setContributedToDeath(Boolean contributedToDeath) {
        this.contributedToDeath = contributedToDeath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contributedToDeath")
    public Element get_contributedToDeath() {
        return _contributedToDeath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contributedToDeath")
    public void set_contributedToDeath(Element _contributedToDeath) {
        this._contributedToDeath = _contributedToDeath;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("onsetAge")
    public Age getOnsetAge() {
        return onsetAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("onsetAge")
    public void setOnsetAge(Age onsetAge) {
        this.onsetAge = onsetAge;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("onsetRange")
    public Range getOnsetRange() {
        return onsetRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("onsetRange")
    public void setOnsetRange(Range onsetRange) {
        this.onsetRange = onsetRange;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("onsetPeriod")
    public Period getOnsetPeriod() {
        return onsetPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("onsetPeriod")
    public void setOnsetPeriod(Period onsetPeriod) {
        this.onsetPeriod = onsetPeriod;
    }

    /**
     * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
     * 
     */
    @JsonProperty("onsetString")
    public String getOnsetString() {
        return onsetString;
    }

    /**
     * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
     * 
     */
    @JsonProperty("onsetString")
    public void setOnsetString(String onsetString) {
        this.onsetString = onsetString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetString")
    public Element get_onsetString() {
        return _onsetString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetString")
    public void set_onsetString(Element _onsetString) {
        this._onsetString = _onsetString;
    }

    /**
     * An area where general notes can be placed about this specific condition.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * An area where general notes can be placed about this specific condition.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FamilyMemberHistory_Condition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("contributedToDeath");
        sb.append('=');
        sb.append(((this.contributedToDeath == null)?"<null>":this.contributedToDeath));
        sb.append(',');
        sb.append("_contributedToDeath");
        sb.append('=');
        sb.append(((this._contributedToDeath == null)?"<null>":this._contributedToDeath));
        sb.append(',');
        sb.append("onsetAge");
        sb.append('=');
        sb.append(((this.onsetAge == null)?"<null>":this.onsetAge));
        sb.append(',');
        sb.append("onsetRange");
        sb.append('=');
        sb.append(((this.onsetRange == null)?"<null>":this.onsetRange));
        sb.append(',');
        sb.append("onsetPeriod");
        sb.append('=');
        sb.append(((this.onsetPeriod == null)?"<null>":this.onsetPeriod));
        sb.append(',');
        sb.append("onsetString");
        sb.append('=');
        sb.append(((this.onsetString == null)?"<null>":this.onsetString));
        sb.append(',');
        sb.append("_onsetString");
        sb.append('=');
        sb.append(((this._onsetString == null)?"<null>":this._onsetString));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.onsetPeriod == null)? 0 :this.onsetPeriod.hashCode()));
        result = ((result* 31)+((this.onsetRange == null)? 0 :this.onsetRange.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._contributedToDeath == null)? 0 :this._contributedToDeath.hashCode()));
        result = ((result* 31)+((this.onsetString == null)? 0 :this.onsetString.hashCode()));
        result = ((result* 31)+((this.onsetAge == null)? 0 :this.onsetAge.hashCode()));
        result = ((result* 31)+((this.contributedToDeath == null)? 0 :this.contributedToDeath.hashCode()));
        result = ((result* 31)+((this._onsetString == null)? 0 :this._onsetString.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FamilyMemberHistory_Condition) == false) {
            return false;
        }
        FamilyMemberHistory_Condition rhs = ((FamilyMemberHistory_Condition) other);
        return ((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.onsetPeriod == rhs.onsetPeriod)||((this.onsetPeriod!= null)&&this.onsetPeriod.equals(rhs.onsetPeriod))))&&((this.onsetRange == rhs.onsetRange)||((this.onsetRange!= null)&&this.onsetRange.equals(rhs.onsetRange))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._contributedToDeath == rhs._contributedToDeath)||((this._contributedToDeath!= null)&&this._contributedToDeath.equals(rhs._contributedToDeath))))&&((this.onsetString == rhs.onsetString)||((this.onsetString!= null)&&this.onsetString.equals(rhs.onsetString))))&&((this.onsetAge == rhs.onsetAge)||((this.onsetAge!= null)&&this.onsetAge.equals(rhs.onsetAge))))&&((this.contributedToDeath == rhs.contributedToDeath)||((this.contributedToDeath!= null)&&this.contributedToDeath.equals(rhs.contributedToDeath))))&&((this._onsetString == rhs._onsetString)||((this._onsetString!= null)&&this._onsetString.equals(rhs._onsetString))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))));
    }

}
