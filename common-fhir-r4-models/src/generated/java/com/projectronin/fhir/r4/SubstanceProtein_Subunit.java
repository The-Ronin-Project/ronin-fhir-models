
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "subunit",
    "_subunit",
    "sequence",
    "_sequence",
    "length",
    "_length",
    "sequenceAttachment",
    "nTerminalModificationId",
    "nTerminalModification",
    "_nTerminalModification",
    "cTerminalModificationId",
    "cTerminalModification",
    "_cTerminalModification"
})
@Generated("jsonschema2pojo")
public class SubstanceProtein_Subunit {

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
    @JsonProperty("subunit")
    @JsonPropertyDescription("A whole number")
    private Double subunit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subunit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _subunit;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sequence")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String sequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sequence;
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
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("sequenceAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment sequenceAttachment;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("nTerminalModificationId")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier nTerminalModificationId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("nTerminalModification")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String nTerminalModification;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nTerminalModification")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _nTerminalModification;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("cTerminalModificationId")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier cTerminalModificationId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cTerminalModification")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String cTerminalModification;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cTerminalModification")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _cTerminalModification;

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
    @JsonProperty("subunit")
    public Double getSubunit() {
        return subunit;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("subunit")
    public void setSubunit(Double subunit) {
        this.subunit = subunit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subunit")
    public Element get_subunit() {
        return _subunit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subunit")
    public void set_subunit(Element _subunit) {
        this._subunit = _subunit;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sequence")
    public String getSequence() {
        return sequence;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sequence")
    public void setSequence(String sequence) {
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
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("sequenceAttachment")
    public Attachment getSequenceAttachment() {
        return sequenceAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("sequenceAttachment")
    public void setSequenceAttachment(Attachment sequenceAttachment) {
        this.sequenceAttachment = sequenceAttachment;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("nTerminalModificationId")
    public Identifier getnTerminalModificationId() {
        return nTerminalModificationId;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("nTerminalModificationId")
    public void setnTerminalModificationId(Identifier nTerminalModificationId) {
        this.nTerminalModificationId = nTerminalModificationId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("nTerminalModification")
    public String getnTerminalModification() {
        return nTerminalModification;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("nTerminalModification")
    public void setnTerminalModification(String nTerminalModification) {
        this.nTerminalModification = nTerminalModification;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nTerminalModification")
    public Element get_nTerminalModification() {
        return _nTerminalModification;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nTerminalModification")
    public void set_nTerminalModification(Element _nTerminalModification) {
        this._nTerminalModification = _nTerminalModification;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("cTerminalModificationId")
    public Identifier getcTerminalModificationId() {
        return cTerminalModificationId;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("cTerminalModificationId")
    public void setcTerminalModificationId(Identifier cTerminalModificationId) {
        this.cTerminalModificationId = cTerminalModificationId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cTerminalModification")
    public String getcTerminalModification() {
        return cTerminalModification;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cTerminalModification")
    public void setcTerminalModification(String cTerminalModification) {
        this.cTerminalModification = cTerminalModification;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cTerminalModification")
    public Element get_cTerminalModification() {
        return _cTerminalModification;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cTerminalModification")
    public void set_cTerminalModification(Element _cTerminalModification) {
        this._cTerminalModification = _cTerminalModification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceProtein_Subunit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("subunit");
        sb.append('=');
        sb.append(((this.subunit == null)?"<null>":this.subunit));
        sb.append(',');
        sb.append("_subunit");
        sb.append('=');
        sb.append(((this._subunit == null)?"<null>":this._subunit));
        sb.append(',');
        sb.append("sequence");
        sb.append('=');
        sb.append(((this.sequence == null)?"<null>":this.sequence));
        sb.append(',');
        sb.append("_sequence");
        sb.append('=');
        sb.append(((this._sequence == null)?"<null>":this._sequence));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("_length");
        sb.append('=');
        sb.append(((this._length == null)?"<null>":this._length));
        sb.append(',');
        sb.append("sequenceAttachment");
        sb.append('=');
        sb.append(((this.sequenceAttachment == null)?"<null>":this.sequenceAttachment));
        sb.append(',');
        sb.append("nTerminalModificationId");
        sb.append('=');
        sb.append(((this.nTerminalModificationId == null)?"<null>":this.nTerminalModificationId));
        sb.append(',');
        sb.append("nTerminalModification");
        sb.append('=');
        sb.append(((this.nTerminalModification == null)?"<null>":this.nTerminalModification));
        sb.append(',');
        sb.append("_nTerminalModification");
        sb.append('=');
        sb.append(((this._nTerminalModification == null)?"<null>":this._nTerminalModification));
        sb.append(',');
        sb.append("cTerminalModificationId");
        sb.append('=');
        sb.append(((this.cTerminalModificationId == null)?"<null>":this.cTerminalModificationId));
        sb.append(',');
        sb.append("cTerminalModification");
        sb.append('=');
        sb.append(((this.cTerminalModification == null)?"<null>":this.cTerminalModification));
        sb.append(',');
        sb.append("_cTerminalModification");
        sb.append('=');
        sb.append(((this._cTerminalModification == null)?"<null>":this._cTerminalModification));
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
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.subunit == null)? 0 :this.subunit.hashCode()));
        result = ((result* 31)+((this.cTerminalModificationId == null)? 0 :this.cTerminalModificationId.hashCode()));
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this._cTerminalModification == null)? 0 :this._cTerminalModification.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this.cTerminalModification == null)? 0 :this.cTerminalModification.hashCode()));
        result = ((result* 31)+((this._nTerminalModification == null)? 0 :this._nTerminalModification.hashCode()));
        result = ((result* 31)+((this.nTerminalModification == null)? 0 :this.nTerminalModification.hashCode()));
        result = ((result* 31)+((this._subunit == null)? 0 :this._subunit.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._length == null)? 0 :this._length.hashCode()));
        result = ((result* 31)+((this.nTerminalModificationId == null)? 0 :this.nTerminalModificationId.hashCode()));
        result = ((result* 31)+((this.sequenceAttachment == null)? 0 :this.sequenceAttachment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceProtein_Subunit) == false) {
            return false;
        }
        SubstanceProtein_Subunit rhs = ((SubstanceProtein_Subunit) other);
        return (((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.subunit == rhs.subunit)||((this.subunit!= null)&&this.subunit.equals(rhs.subunit))))&&((this.cTerminalModificationId == rhs.cTerminalModificationId)||((this.cTerminalModificationId!= null)&&this.cTerminalModificationId.equals(rhs.cTerminalModificationId))))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this._cTerminalModification == rhs._cTerminalModification)||((this._cTerminalModification!= null)&&this._cTerminalModification.equals(rhs._cTerminalModification))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this.cTerminalModification == rhs.cTerminalModification)||((this.cTerminalModification!= null)&&this.cTerminalModification.equals(rhs.cTerminalModification))))&&((this._nTerminalModification == rhs._nTerminalModification)||((this._nTerminalModification!= null)&&this._nTerminalModification.equals(rhs._nTerminalModification))))&&((this.nTerminalModification == rhs.nTerminalModification)||((this.nTerminalModification!= null)&&this.nTerminalModification.equals(rhs.nTerminalModification))))&&((this._subunit == rhs._subunit)||((this._subunit!= null)&&this._subunit.equals(rhs._subunit))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._length == rhs._length)||((this._length!= null)&&this._length.equals(rhs._length))))&&((this.nTerminalModificationId == rhs.nTerminalModificationId)||((this.nTerminalModificationId!= null)&&this.nTerminalModificationId.equals(rhs.nTerminalModificationId))))&&((this.sequenceAttachment == rhs.sequenceAttachment)||((this.sequenceAttachment!= null)&&this.sequenceAttachment.equals(rhs.sequenceAttachment))));
    }

}
