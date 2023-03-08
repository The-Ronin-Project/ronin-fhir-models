
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
    "itemSequence",
    "_itemSequence",
    "detailSequence",
    "_detailSequence",
    "subDetailSequence",
    "_subDetailSequence",
    "code"
})
@Generated("jsonschema2pojo")
public class ClaimResponse_Error {

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
    @JsonProperty("itemSequence")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double itemSequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_itemSequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _itemSequence;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("detailSequence")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double detailSequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailSequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _detailSequence;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;

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
    @JsonProperty("itemSequence")
    public Double getItemSequence() {
        return itemSequence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("itemSequence")
    public void setItemSequence(Double itemSequence) {
        this.itemSequence = itemSequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_itemSequence")
    public Element get_itemSequence() {
        return _itemSequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_itemSequence")
    public void set_itemSequence(Element _itemSequence) {
        this._itemSequence = _itemSequence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("detailSequence")
    public Double getDetailSequence() {
        return detailSequence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("detailSequence")
    public void setDetailSequence(Double detailSequence) {
        this.detailSequence = detailSequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailSequence")
    public Element get_detailSequence() {
        return _detailSequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detailSequence")
    public void set_detailSequence(Element _detailSequence) {
        this._detailSequence = _detailSequence;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClaimResponse_Error.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("itemSequence");
        sb.append('=');
        sb.append(((this.itemSequence == null)?"<null>":this.itemSequence));
        sb.append(',');
        sb.append("_itemSequence");
        sb.append('=');
        sb.append(((this._itemSequence == null)?"<null>":this._itemSequence));
        sb.append(',');
        sb.append("detailSequence");
        sb.append('=');
        sb.append(((this.detailSequence == null)?"<null>":this.detailSequence));
        sb.append(',');
        sb.append("_detailSequence");
        sb.append('=');
        sb.append(((this._detailSequence == null)?"<null>":this._detailSequence));
        sb.append(',');
        sb.append("subDetailSequence");
        sb.append('=');
        sb.append(((this.subDetailSequence == null)?"<null>":this.subDetailSequence));
        sb.append(',');
        sb.append("_subDetailSequence");
        sb.append('=');
        sb.append(((this._subDetailSequence == null)?"<null>":this._subDetailSequence));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.itemSequence == null)? 0 :this.itemSequence.hashCode()));
        result = ((result* 31)+((this._detailSequence == null)? 0 :this._detailSequence.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.detailSequence == null)? 0 :this.detailSequence.hashCode()));
        result = ((result* 31)+((this._subDetailSequence == null)? 0 :this._subDetailSequence.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._itemSequence == null)? 0 :this._itemSequence.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimResponse_Error) == false) {
            return false;
        }
        ClaimResponse_Error rhs = ((ClaimResponse_Error) other);
        return (((((((((((this.subDetailSequence == rhs.subDetailSequence)||((this.subDetailSequence!= null)&&this.subDetailSequence.equals(rhs.subDetailSequence)))&&((this.itemSequence == rhs.itemSequence)||((this.itemSequence!= null)&&this.itemSequence.equals(rhs.itemSequence))))&&((this._detailSequence == rhs._detailSequence)||((this._detailSequence!= null)&&this._detailSequence.equals(rhs._detailSequence))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.detailSequence == rhs.detailSequence)||((this.detailSequence!= null)&&this.detailSequence.equals(rhs.detailSequence))))&&((this._subDetailSequence == rhs._subDetailSequence)||((this._subDetailSequence!= null)&&this._subDetailSequence.equals(rhs._subDetailSequence))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._itemSequence == rhs._itemSequence)||((this._itemSequence!= null)&&this._itemSequence.equals(rhs._itemSequence))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
