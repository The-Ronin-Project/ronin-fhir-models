
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
    "start",
    "_start",
    "end",
    "_end",
    "observedAllele",
    "_observedAllele",
    "referenceAllele",
    "_referenceAllele",
    "cigar",
    "_cigar",
    "variantPointer"
})
@Generated("jsonschema2pojo")
public class MolecularSequence_Variant {

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
     * A whole number
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("A whole number")
    private Double start;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _start;
    /**
     * A whole number
     * 
     */
    @JsonProperty("end")
    @JsonPropertyDescription("A whole number")
    private Double end;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _end;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("observedAllele")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String observedAllele;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_observedAllele")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _observedAllele;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("referenceAllele")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String referenceAllele;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_referenceAllele")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _referenceAllele;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cigar")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String cigar;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cigar")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _cigar;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("variantPointer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference variantPointer;

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
     * A whole number
     * 
     */
    @JsonProperty("start")
    public Double getStart() {
        return start;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("start")
    public void setStart(Double start) {
        this.start = start;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    public Element get_start() {
        return _start;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    public void set_start(Element _start) {
        this._start = _start;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("end")
    public Double getEnd() {
        return end;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("end")
    public void setEnd(Double end) {
        this.end = end;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    public Element get_end() {
        return _end;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    public void set_end(Element _end) {
        this._end = _end;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("observedAllele")
    public String getObservedAllele() {
        return observedAllele;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("observedAllele")
    public void setObservedAllele(String observedAllele) {
        this.observedAllele = observedAllele;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_observedAllele")
    public Element get_observedAllele() {
        return _observedAllele;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_observedAllele")
    public void set_observedAllele(Element _observedAllele) {
        this._observedAllele = _observedAllele;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("referenceAllele")
    public String getReferenceAllele() {
        return referenceAllele;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("referenceAllele")
    public void setReferenceAllele(String referenceAllele) {
        this.referenceAllele = referenceAllele;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_referenceAllele")
    public Element get_referenceAllele() {
        return _referenceAllele;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_referenceAllele")
    public void set_referenceAllele(Element _referenceAllele) {
        this._referenceAllele = _referenceAllele;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cigar")
    public String getCigar() {
        return cigar;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cigar")
    public void setCigar(String cigar) {
        this.cigar = cigar;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cigar")
    public Element get_cigar() {
        return _cigar;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cigar")
    public void set_cigar(Element _cigar) {
        this._cigar = _cigar;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("variantPointer")
    public Reference getVariantPointer() {
        return variantPointer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("variantPointer")
    public void setVariantPointer(Reference variantPointer) {
        this.variantPointer = variantPointer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MolecularSequence_Variant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("_start");
        sb.append('=');
        sb.append(((this._start == null)?"<null>":this._start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        sb.append("_end");
        sb.append('=');
        sb.append(((this._end == null)?"<null>":this._end));
        sb.append(',');
        sb.append("observedAllele");
        sb.append('=');
        sb.append(((this.observedAllele == null)?"<null>":this.observedAllele));
        sb.append(',');
        sb.append("_observedAllele");
        sb.append('=');
        sb.append(((this._observedAllele == null)?"<null>":this._observedAllele));
        sb.append(',');
        sb.append("referenceAllele");
        sb.append('=');
        sb.append(((this.referenceAllele == null)?"<null>":this.referenceAllele));
        sb.append(',');
        sb.append("_referenceAllele");
        sb.append('=');
        sb.append(((this._referenceAllele == null)?"<null>":this._referenceAllele));
        sb.append(',');
        sb.append("cigar");
        sb.append('=');
        sb.append(((this.cigar == null)?"<null>":this.cigar));
        sb.append(',');
        sb.append("_cigar");
        sb.append('=');
        sb.append(((this._cigar == null)?"<null>":this._cigar));
        sb.append(',');
        sb.append("variantPointer");
        sb.append('=');
        sb.append(((this.variantPointer == null)?"<null>":this.variantPointer));
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
        result = ((result* 31)+((this._start == null)? 0 :this._start.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.observedAllele == null)? 0 :this.observedAllele.hashCode()));
        result = ((result* 31)+((this._end == null)? 0 :this._end.hashCode()));
        result = ((result* 31)+((this._cigar == null)? 0 :this._cigar.hashCode()));
        result = ((result* 31)+((this.cigar == null)? 0 :this.cigar.hashCode()));
        result = ((result* 31)+((this._observedAllele == null)? 0 :this._observedAllele.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.referenceAllele == null)? 0 :this.referenceAllele.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._referenceAllele == null)? 0 :this._referenceAllele.hashCode()));
        result = ((result* 31)+((this.variantPointer == null)? 0 :this.variantPointer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MolecularSequence_Variant) == false) {
            return false;
        }
        MolecularSequence_Variant rhs = ((MolecularSequence_Variant) other);
        return (((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._start == rhs._start)||((this._start!= null)&&this._start.equals(rhs._start))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this.observedAllele == rhs.observedAllele)||((this.observedAllele!= null)&&this.observedAllele.equals(rhs.observedAllele))))&&((this._end == rhs._end)||((this._end!= null)&&this._end.equals(rhs._end))))&&((this._cigar == rhs._cigar)||((this._cigar!= null)&&this._cigar.equals(rhs._cigar))))&&((this.cigar == rhs.cigar)||((this.cigar!= null)&&this.cigar.equals(rhs.cigar))))&&((this._observedAllele == rhs._observedAllele)||((this._observedAllele!= null)&&this._observedAllele.equals(rhs._observedAllele))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.referenceAllele == rhs.referenceAllele)||((this.referenceAllele!= null)&&this.referenceAllele.equals(rhs.referenceAllele))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._referenceAllele == rhs._referenceAllele)||((this._referenceAllele!= null)&&this._referenceAllele.equals(rhs._referenceAllele))))&&((this.variantPointer == rhs.variantPointer)||((this.variantPointer!= null)&&this.variantPointer.equals(rhs.variantPointer))));
    }

}
