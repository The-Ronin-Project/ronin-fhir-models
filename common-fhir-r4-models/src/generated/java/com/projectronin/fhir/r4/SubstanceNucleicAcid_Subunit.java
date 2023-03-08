
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5&rsquo;-3&rsquo; direction.
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
    "fivePrime",
    "threePrime",
    "linkage",
    "sugar"
})
@Generated("jsonschema2pojo")
public class SubstanceNucleicAcid_Subunit {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fivePrime")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept fivePrime;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("threePrime")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept threePrime;
    /**
     * The linkages between sugar residues will also be captured.
     * 
     */
    @JsonProperty("linkage")
    @JsonPropertyDescription("The linkages between sugar residues will also be captured.")
    private List<SubstanceNucleicAcid_Linkage> linkage = new ArrayList<SubstanceNucleicAcid_Linkage>();
    /**
     *  5.3.6.8.1 Sugar ID (Mandatory).
     * 
     */
    @JsonProperty("sugar")
    @JsonPropertyDescription("5.3.6.8.1 Sugar ID (Mandatory).")
    private List<SubstanceNucleicAcid_Sugar> sugar = new ArrayList<SubstanceNucleicAcid_Sugar>();

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fivePrime")
    public CodeableConcept getFivePrime() {
        return fivePrime;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fivePrime")
    public void setFivePrime(CodeableConcept fivePrime) {
        this.fivePrime = fivePrime;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("threePrime")
    public CodeableConcept getThreePrime() {
        return threePrime;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("threePrime")
    public void setThreePrime(CodeableConcept threePrime) {
        this.threePrime = threePrime;
    }

    /**
     * The linkages between sugar residues will also be captured.
     * 
     */
    @JsonProperty("linkage")
    public List<SubstanceNucleicAcid_Linkage> getLinkage() {
        return linkage;
    }

    /**
     * The linkages between sugar residues will also be captured.
     * 
     */
    @JsonProperty("linkage")
    public void setLinkage(List<SubstanceNucleicAcid_Linkage> linkage) {
        this.linkage = linkage;
    }

    /**
     *  5.3.6.8.1 Sugar ID (Mandatory).
     * 
     */
    @JsonProperty("sugar")
    public List<SubstanceNucleicAcid_Sugar> getSugar() {
        return sugar;
    }

    /**
     *  5.3.6.8.1 Sugar ID (Mandatory).
     * 
     */
    @JsonProperty("sugar")
    public void setSugar(List<SubstanceNucleicAcid_Sugar> sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceNucleicAcid_Subunit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("fivePrime");
        sb.append('=');
        sb.append(((this.fivePrime == null)?"<null>":this.fivePrime));
        sb.append(',');
        sb.append("threePrime");
        sb.append('=');
        sb.append(((this.threePrime == null)?"<null>":this.threePrime));
        sb.append(',');
        sb.append("linkage");
        sb.append('=');
        sb.append(((this.linkage == null)?"<null>":this.linkage));
        sb.append(',');
        sb.append("sugar");
        sb.append('=');
        sb.append(((this.sugar == null)?"<null>":this.sugar));
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
        result = ((result* 31)+((this.threePrime == null)? 0 :this.threePrime.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.subunit == null)? 0 :this.subunit.hashCode()));
        result = ((result* 31)+((this.linkage == null)? 0 :this.linkage.hashCode()));
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this.fivePrime == null)? 0 :this.fivePrime.hashCode()));
        result = ((result* 31)+((this._subunit == null)? 0 :this._subunit.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._length == null)? 0 :this._length.hashCode()));
        result = ((result* 31)+((this.sugar == null)? 0 :this.sugar.hashCode()));
        result = ((result* 31)+((this.sequenceAttachment == null)? 0 :this.sequenceAttachment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceNucleicAcid_Subunit) == false) {
            return false;
        }
        SubstanceNucleicAcid_Subunit rhs = ((SubstanceNucleicAcid_Subunit) other);
        return (((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.threePrime == rhs.threePrime)||((this.threePrime!= null)&&this.threePrime.equals(rhs.threePrime))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.subunit == rhs.subunit)||((this.subunit!= null)&&this.subunit.equals(rhs.subunit))))&&((this.linkage == rhs.linkage)||((this.linkage!= null)&&this.linkage.equals(rhs.linkage))))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this.fivePrime == rhs.fivePrime)||((this.fivePrime!= null)&&this.fivePrime.equals(rhs.fivePrime))))&&((this._subunit == rhs._subunit)||((this._subunit!= null)&&this._subunit.equals(rhs._subunit))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._length == rhs._length)||((this._length!= null)&&this._length.equals(rhs._length))))&&((this.sugar == rhs.sugar)||((this.sugar!= null)&&this.sugar.equals(rhs.sugar))))&&((this.sequenceAttachment == rhs.sequenceAttachment)||((this.sequenceAttachment!= null)&&this.sequenceAttachment.equals(rhs.sequenceAttachment))));
    }

}
