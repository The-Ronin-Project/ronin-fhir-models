
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Raw data describing a biological sequence.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "chromosome",
    "genomeBuild",
    "_genomeBuild",
    "orientation",
    "_orientation",
    "referenceSeqId",
    "referenceSeqPointer",
    "referenceSeqString",
    "_referenceSeqString",
    "strand",
    "_strand",
    "windowStart",
    "_windowStart",
    "windowEnd",
    "_windowEnd"
})
@Generated("jsonschema2pojo")
public class MolecularSequence_ReferenceSeq {

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
    @JsonProperty("chromosome")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept chromosome;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("genomeBuild")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String genomeBuild;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_genomeBuild")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _genomeBuild;
    /**
     * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the &quot;sense&quot; strand, and the opposite complementary strand is the &quot;antisense&quot; strand.
     * 
     */
    @JsonProperty("orientation")
    @JsonPropertyDescription("A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the \"sense\" strand, and the opposite complementary strand is the \"antisense\" strand.")
    private MolecularSequence_ReferenceSeq.Orientation orientation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orientation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _orientation;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("referenceSeqId")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept referenceSeqId;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referenceSeqPointer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference referenceSeqPointer;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("referenceSeqString")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String referenceSeqString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_referenceSeqString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _referenceSeqString;
    /**
     * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
     * 
     */
    @JsonProperty("strand")
    @JsonPropertyDescription("An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.")
    private MolecularSequence_ReferenceSeq.Strand strand;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_strand")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _strand;
    /**
     * A whole number
     * 
     */
    @JsonProperty("windowStart")
    @JsonPropertyDescription("A whole number")
    private Double windowStart;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_windowStart")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _windowStart;
    /**
     * A whole number
     * 
     */
    @JsonProperty("windowEnd")
    @JsonPropertyDescription("A whole number")
    private Double windowEnd;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_windowEnd")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _windowEnd;

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
    @JsonProperty("chromosome")
    public CodeableConcept getChromosome() {
        return chromosome;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("chromosome")
    public void setChromosome(CodeableConcept chromosome) {
        this.chromosome = chromosome;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("genomeBuild")
    public String getGenomeBuild() {
        return genomeBuild;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("genomeBuild")
    public void setGenomeBuild(String genomeBuild) {
        this.genomeBuild = genomeBuild;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_genomeBuild")
    public Element get_genomeBuild() {
        return _genomeBuild;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_genomeBuild")
    public void set_genomeBuild(Element _genomeBuild) {
        this._genomeBuild = _genomeBuild;
    }

    /**
     * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the &quot;sense&quot; strand, and the opposite complementary strand is the &quot;antisense&quot; strand.
     * 
     */
    @JsonProperty("orientation")
    public MolecularSequence_ReferenceSeq.Orientation getOrientation() {
        return orientation;
    }

    /**
     * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the &quot;sense&quot; strand, and the opposite complementary strand is the &quot;antisense&quot; strand.
     * 
     */
    @JsonProperty("orientation")
    public void setOrientation(MolecularSequence_ReferenceSeq.Orientation orientation) {
        this.orientation = orientation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orientation")
    public Element get_orientation() {
        return _orientation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orientation")
    public void set_orientation(Element _orientation) {
        this._orientation = _orientation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("referenceSeqId")
    public CodeableConcept getReferenceSeqId() {
        return referenceSeqId;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("referenceSeqId")
    public void setReferenceSeqId(CodeableConcept referenceSeqId) {
        this.referenceSeqId = referenceSeqId;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referenceSeqPointer")
    public Reference getReferenceSeqPointer() {
        return referenceSeqPointer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referenceSeqPointer")
    public void setReferenceSeqPointer(Reference referenceSeqPointer) {
        this.referenceSeqPointer = referenceSeqPointer;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("referenceSeqString")
    public String getReferenceSeqString() {
        return referenceSeqString;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("referenceSeqString")
    public void setReferenceSeqString(String referenceSeqString) {
        this.referenceSeqString = referenceSeqString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_referenceSeqString")
    public Element get_referenceSeqString() {
        return _referenceSeqString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_referenceSeqString")
    public void set_referenceSeqString(Element _referenceSeqString) {
        this._referenceSeqString = _referenceSeqString;
    }

    /**
     * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
     * 
     */
    @JsonProperty("strand")
    public MolecularSequence_ReferenceSeq.Strand getStrand() {
        return strand;
    }

    /**
     * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
     * 
     */
    @JsonProperty("strand")
    public void setStrand(MolecularSequence_ReferenceSeq.Strand strand) {
        this.strand = strand;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_strand")
    public Element get_strand() {
        return _strand;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_strand")
    public void set_strand(Element _strand) {
        this._strand = _strand;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("windowStart")
    public Double getWindowStart() {
        return windowStart;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("windowStart")
    public void setWindowStart(Double windowStart) {
        this.windowStart = windowStart;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_windowStart")
    public Element get_windowStart() {
        return _windowStart;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_windowStart")
    public void set_windowStart(Element _windowStart) {
        this._windowStart = _windowStart;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("windowEnd")
    public Double getWindowEnd() {
        return windowEnd;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("windowEnd")
    public void setWindowEnd(Double windowEnd) {
        this.windowEnd = windowEnd;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_windowEnd")
    public Element get_windowEnd() {
        return _windowEnd;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_windowEnd")
    public void set_windowEnd(Element _windowEnd) {
        this._windowEnd = _windowEnd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MolecularSequence_ReferenceSeq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("chromosome");
        sb.append('=');
        sb.append(((this.chromosome == null)?"<null>":this.chromosome));
        sb.append(',');
        sb.append("genomeBuild");
        sb.append('=');
        sb.append(((this.genomeBuild == null)?"<null>":this.genomeBuild));
        sb.append(',');
        sb.append("_genomeBuild");
        sb.append('=');
        sb.append(((this._genomeBuild == null)?"<null>":this._genomeBuild));
        sb.append(',');
        sb.append("orientation");
        sb.append('=');
        sb.append(((this.orientation == null)?"<null>":this.orientation));
        sb.append(',');
        sb.append("_orientation");
        sb.append('=');
        sb.append(((this._orientation == null)?"<null>":this._orientation));
        sb.append(',');
        sb.append("referenceSeqId");
        sb.append('=');
        sb.append(((this.referenceSeqId == null)?"<null>":this.referenceSeqId));
        sb.append(',');
        sb.append("referenceSeqPointer");
        sb.append('=');
        sb.append(((this.referenceSeqPointer == null)?"<null>":this.referenceSeqPointer));
        sb.append(',');
        sb.append("referenceSeqString");
        sb.append('=');
        sb.append(((this.referenceSeqString == null)?"<null>":this.referenceSeqString));
        sb.append(',');
        sb.append("_referenceSeqString");
        sb.append('=');
        sb.append(((this._referenceSeqString == null)?"<null>":this._referenceSeqString));
        sb.append(',');
        sb.append("strand");
        sb.append('=');
        sb.append(((this.strand == null)?"<null>":this.strand));
        sb.append(',');
        sb.append("_strand");
        sb.append('=');
        sb.append(((this._strand == null)?"<null>":this._strand));
        sb.append(',');
        sb.append("windowStart");
        sb.append('=');
        sb.append(((this.windowStart == null)?"<null>":this.windowStart));
        sb.append(',');
        sb.append("_windowStart");
        sb.append('=');
        sb.append(((this._windowStart == null)?"<null>":this._windowStart));
        sb.append(',');
        sb.append("windowEnd");
        sb.append('=');
        sb.append(((this.windowEnd == null)?"<null>":this.windowEnd));
        sb.append(',');
        sb.append("_windowEnd");
        sb.append('=');
        sb.append(((this._windowEnd == null)?"<null>":this._windowEnd));
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
        result = ((result* 31)+((this._strand == null)? 0 :this._strand.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.orientation == null)? 0 :this.orientation.hashCode()));
        result = ((result* 31)+((this.referenceSeqString == null)? 0 :this.referenceSeqString.hashCode()));
        result = ((result* 31)+((this.windowStart == null)? 0 :this.windowStart.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.chromosome == null)? 0 :this.chromosome.hashCode()));
        result = ((result* 31)+((this.referenceSeqPointer == null)? 0 :this.referenceSeqPointer.hashCode()));
        result = ((result* 31)+((this._orientation == null)? 0 :this._orientation.hashCode()));
        result = ((result* 31)+((this.strand == null)? 0 :this.strand.hashCode()));
        result = ((result* 31)+((this._genomeBuild == null)? 0 :this._genomeBuild.hashCode()));
        result = ((result* 31)+((this.genomeBuild == null)? 0 :this.genomeBuild.hashCode()));
        result = ((result* 31)+((this._windowStart == null)? 0 :this._windowStart.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.windowEnd == null)? 0 :this.windowEnd.hashCode()));
        result = ((result* 31)+((this._windowEnd == null)? 0 :this._windowEnd.hashCode()));
        result = ((result* 31)+((this.referenceSeqId == null)? 0 :this.referenceSeqId.hashCode()));
        result = ((result* 31)+((this._referenceSeqString == null)? 0 :this._referenceSeqString.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MolecularSequence_ReferenceSeq) == false) {
            return false;
        }
        MolecularSequence_ReferenceSeq rhs = ((MolecularSequence_ReferenceSeq) other);
        return (((((((((((((((((((this._strand == rhs._strand)||((this._strand!= null)&&this._strand.equals(rhs._strand)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.orientation == rhs.orientation)||((this.orientation!= null)&&this.orientation.equals(rhs.orientation))))&&((this.referenceSeqString == rhs.referenceSeqString)||((this.referenceSeqString!= null)&&this.referenceSeqString.equals(rhs.referenceSeqString))))&&((this.windowStart == rhs.windowStart)||((this.windowStart!= null)&&this.windowStart.equals(rhs.windowStart))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.chromosome == rhs.chromosome)||((this.chromosome!= null)&&this.chromosome.equals(rhs.chromosome))))&&((this.referenceSeqPointer == rhs.referenceSeqPointer)||((this.referenceSeqPointer!= null)&&this.referenceSeqPointer.equals(rhs.referenceSeqPointer))))&&((this._orientation == rhs._orientation)||((this._orientation!= null)&&this._orientation.equals(rhs._orientation))))&&((this.strand == rhs.strand)||((this.strand!= null)&&this.strand.equals(rhs.strand))))&&((this._genomeBuild == rhs._genomeBuild)||((this._genomeBuild!= null)&&this._genomeBuild.equals(rhs._genomeBuild))))&&((this.genomeBuild == rhs.genomeBuild)||((this.genomeBuild!= null)&&this.genomeBuild.equals(rhs.genomeBuild))))&&((this._windowStart == rhs._windowStart)||((this._windowStart!= null)&&this._windowStart.equals(rhs._windowStart))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.windowEnd == rhs.windowEnd)||((this.windowEnd!= null)&&this.windowEnd.equals(rhs.windowEnd))))&&((this._windowEnd == rhs._windowEnd)||((this._windowEnd!= null)&&this._windowEnd.equals(rhs._windowEnd))))&&((this.referenceSeqId == rhs.referenceSeqId)||((this.referenceSeqId!= null)&&this.referenceSeqId.equals(rhs.referenceSeqId))))&&((this._referenceSeqString == rhs._referenceSeqString)||((this._referenceSeqString!= null)&&this._referenceSeqString.equals(rhs._referenceSeqString))));
    }


    /**
     * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the &quot;sense&quot; strand, and the opposite complementary strand is the &quot;antisense&quot; strand.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Orientation {

        SENSE("sense"),
        ANTISENSE("antisense");
        private final String value;
        private final static Map<String, MolecularSequence_ReferenceSeq.Orientation> CONSTANTS = new HashMap<String, MolecularSequence_ReferenceSeq.Orientation>();

        static {
            for (MolecularSequence_ReferenceSeq.Orientation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Orientation(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MolecularSequence_ReferenceSeq.Orientation fromValue(String value) {
            MolecularSequence_ReferenceSeq.Orientation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Strand {

        WATSON("watson"),
        CRICK("crick");
        private final String value;
        private final static Map<String, MolecularSequence_ReferenceSeq.Strand> CONSTANTS = new HashMap<String, MolecularSequence_ReferenceSeq.Strand>();

        static {
            for (MolecularSequence_ReferenceSeq.Strand c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Strand(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MolecularSequence_ReferenceSeq.Strand fromValue(String value) {
            MolecularSequence_ReferenceSeq.Strand constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
