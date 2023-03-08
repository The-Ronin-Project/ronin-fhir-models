
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "subDetailSequence",
    "_subDetailSequence",
    "noteNumber",
    "_noteNumber",
    "adjudication"
})
@Generated("jsonschema2pojo")
public class ClaimResponse_SubDetail {

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
    @JsonProperty("subDetailSequence")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double subDetailSequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subDetailSequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _subDetailSequence;
    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    @JsonPropertyDescription("The numbers associated with notes below which apply to the adjudication of this item.")
    private List<Double> noteNumber = new ArrayList<Double>();
    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    @JsonPropertyDescription("Extensions for noteNumber")
    private List<Element> _noteNumber = new ArrayList<Element>();
    /**
     * The adjudication results.
     * 
     */
    @JsonProperty("adjudication")
    @JsonPropertyDescription("The adjudication results.")
    private List<ClaimResponse_Adjudication> adjudication = new ArrayList<ClaimResponse_Adjudication>();

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
    @JsonProperty("subDetailSequence")
    public Double getSubDetailSequence() {
        return subDetailSequence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("subDetailSequence")
    public void setSubDetailSequence(Double subDetailSequence) {
        this.subDetailSequence = subDetailSequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subDetailSequence")
    public Element get_subDetailSequence() {
        return _subDetailSequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subDetailSequence")
    public void set_subDetailSequence(Element _subDetailSequence) {
        this._subDetailSequence = _subDetailSequence;
    }

    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    public List<Double> getNoteNumber() {
        return noteNumber;
    }

    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    public void setNoteNumber(List<Double> noteNumber) {
        this.noteNumber = noteNumber;
    }

    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    public List<Element> get_noteNumber() {
        return _noteNumber;
    }

    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    public void set_noteNumber(List<Element> _noteNumber) {
        this._noteNumber = _noteNumber;
    }

    /**
     * The adjudication results.
     * 
     */
    @JsonProperty("adjudication")
    public List<ClaimResponse_Adjudication> getAdjudication() {
        return adjudication;
    }

    /**
     * The adjudication results.
     * 
     */
    @JsonProperty("adjudication")
    public void setAdjudication(List<ClaimResponse_Adjudication> adjudication) {
        this.adjudication = adjudication;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClaimResponse_SubDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("subDetailSequence");
        sb.append('=');
        sb.append(((this.subDetailSequence == null)?"<null>":this.subDetailSequence));
        sb.append(',');
        sb.append("_subDetailSequence");
        sb.append('=');
        sb.append(((this._subDetailSequence == null)?"<null>":this._subDetailSequence));
        sb.append(',');
        sb.append("noteNumber");
        sb.append('=');
        sb.append(((this.noteNumber == null)?"<null>":this.noteNumber));
        sb.append(',');
        sb.append("_noteNumber");
        sb.append('=');
        sb.append(((this._noteNumber == null)?"<null>":this._noteNumber));
        sb.append(',');
        sb.append("adjudication");
        sb.append('=');
        sb.append(((this.adjudication == null)?"<null>":this.adjudication));
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
        result = ((result* 31)+((this.subDetailSequence == null)? 0 :this.subDetailSequence.hashCode()));
        result = ((result* 31)+((this.adjudication == null)? 0 :this.adjudication.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._subDetailSequence == null)? 0 :this._subDetailSequence.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.noteNumber == null)? 0 :this.noteNumber.hashCode()));
        result = ((result* 31)+((this._noteNumber == null)? 0 :this._noteNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimResponse_SubDetail) == false) {
            return false;
        }
        ClaimResponse_SubDetail rhs = ((ClaimResponse_SubDetail) other);
        return (((((((((this.subDetailSequence == rhs.subDetailSequence)||((this.subDetailSequence!= null)&&this.subDetailSequence.equals(rhs.subDetailSequence)))&&((this.adjudication == rhs.adjudication)||((this.adjudication!= null)&&this.adjudication.equals(rhs.adjudication))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._subDetailSequence == rhs._subDetailSequence)||((this._subDetailSequence!= null)&&this._subDetailSequence.equals(rhs._subDetailSequence))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.noteNumber == rhs.noteNumber)||((this.noteNumber!= null)&&this.noteNumber.equals(rhs.noteNumber))))&&((this._noteNumber == rhs._noteNumber)||((this._noteNumber!= null)&&this._noteNumber.equals(rhs._noteNumber))));
    }

}
