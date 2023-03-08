
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Raw data describing a biological sequence.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "variantType",
    "exact",
    "_exact",
    "length",
    "_length",
    "outer",
    "inner"
})
@Generated("jsonschema2pojo")
public class MolecularSequence_StructureVariant {

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
    @JsonProperty("variantType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept variantType;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("exact")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean exact;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exact")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _exact;
    /**
     * A whole number
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("A whole number")
    private Double length;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_length")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _length;
    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("outer")
    @JsonPropertyDescription("Raw data describing a biological sequence.")
    private MolecularSequence_Outer outer;
    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("inner")
    @JsonPropertyDescription("Raw data describing a biological sequence.")
    private MolecularSequence_Inner inner;

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
    @JsonProperty("variantType")
    public CodeableConcept getVariantType() {
        return variantType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("variantType")
    public void setVariantType(CodeableConcept variantType) {
        this.variantType = variantType;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("exact")
    public Boolean getExact() {
        return exact;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("exact")
    public void setExact(Boolean exact) {
        this.exact = exact;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exact")
    public Element get_exact() {
        return _exact;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exact")
    public void set_exact(Element _exact) {
        this._exact = _exact;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_length")
    public Element get_length() {
        return _length;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_length")
    public void set_length(Element _length) {
        this._length = _length;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("outer")
    public MolecularSequence_Outer getOuter() {
        return outer;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("outer")
    public void setOuter(MolecularSequence_Outer outer) {
        this.outer = outer;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("inner")
    public MolecularSequence_Inner getInner() {
        return inner;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("inner")
    public void setInner(MolecularSequence_Inner inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MolecularSequence_StructureVariant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("variantType");
        sb.append('=');
        sb.append(((this.variantType == null)?"<null>":this.variantType));
        sb.append(',');
        sb.append("exact");
        sb.append('=');
        sb.append(((this.exact == null)?"<null>":this.exact));
        sb.append(',');
        sb.append("_exact");
        sb.append('=');
        sb.append(((this._exact == null)?"<null>":this._exact));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("_length");
        sb.append('=');
        sb.append(((this._length == null)?"<null>":this._length));
        sb.append(',');
        sb.append("outer");
        sb.append('=');
        sb.append(((this.outer == null)?"<null>":this.outer));
        sb.append(',');
        sb.append("inner");
        sb.append('=');
        sb.append(((this.inner == null)?"<null>":this.inner));
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
        result = ((result* 31)+((this.variantType == null)? 0 :this.variantType.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._exact == null)? 0 :this._exact.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.exact == null)? 0 :this.exact.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.outer == null)? 0 :this.outer.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._length == null)? 0 :this._length.hashCode()));
        result = ((result* 31)+((this.inner == null)? 0 :this.inner.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MolecularSequence_StructureVariant) == false) {
            return false;
        }
        MolecularSequence_StructureVariant rhs = ((MolecularSequence_StructureVariant) other);
        return (((((((((((this.variantType == rhs.variantType)||((this.variantType!= null)&&this.variantType.equals(rhs.variantType)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._exact == rhs._exact)||((this._exact!= null)&&this._exact.equals(rhs._exact))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.exact == rhs.exact)||((this.exact!= null)&&this.exact.equals(rhs.exact))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.outer == rhs.outer)||((this.outer!= null)&&this.outer.equals(rhs.outer))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._length == rhs._length)||((this._length!= null)&&this._length.equals(rhs._length))))&&((this.inner == rhs.inner)||((this.inner!= null)&&this.inner.equals(rhs.inner))));
    }

}
