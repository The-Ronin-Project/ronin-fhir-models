
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    "resourceType",
    "identifier",
    "type",
    "_type",
    "coordinateSystem",
    "_coordinateSystem",
    "patient",
    "specimen",
    "device",
    "performer",
    "quantity",
    "referenceSeq",
    "variant",
    "observedSeq",
    "_observedSeq",
    "quality",
    "readCoverage",
    "_readCoverage",
    "repository",
    "pointer",
    "structureVariant"
})
@Generated("jsonschema2pojo")
public class MolecularSequence
    extends DomainResource
{

    /**
     * This is a MolecularSequence resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MolecularSequence resource")
    private String resourceType;
    /**
     * A unique identifier for this particular sequence instance. This is a FHIR-defined id.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier for this particular sequence instance. This is a FHIR-defined id.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Amino Acid Sequence/ DNA Sequence / RNA Sequence.")
    private MolecularSequence.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A whole number
     * 
     */
    @JsonProperty("coordinateSystem")
    @JsonPropertyDescription("A whole number")
    private Double coordinateSystem;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_coordinateSystem")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _coordinateSystem;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("specimen")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference specimen;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference device;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference performer;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("referenceSeq")
    @JsonPropertyDescription("Raw data describing a biological sequence.")
    private MolecularSequence_ReferenceSeq referenceSeq;
    /**
     * The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
     * 
     */
    @JsonProperty("variant")
    @JsonPropertyDescription("The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.")
    private List<MolecularSequence_Variant> variant = new ArrayList<MolecularSequence_Variant>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("observedSeq")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String observedSeq;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_observedSeq")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _observedSeq;
    /**
     * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
     * 
     */
    @JsonProperty("quality")
    @JsonPropertyDescription("An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).")
    private List<MolecularSequence_Quality> quality = new ArrayList<MolecularSequence_Quality>();
    /**
     * A whole number
     * 
     */
    @JsonProperty("readCoverage")
    @JsonPropertyDescription("A whole number")
    private Double readCoverage;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readCoverage")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _readCoverage;
    /**
     * Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
     * 
     */
    @JsonProperty("repository")
    @JsonPropertyDescription("Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.")
    private List<MolecularSequence_Repository> repository = new ArrayList<MolecularSequence_Repository>();
    /**
     * Pointer to next atomic sequence which at most contains one variant.
     * 
     */
    @JsonProperty("pointer")
    @JsonPropertyDescription("Pointer to next atomic sequence which at most contains one variant.")
    private List<Reference> pointer = new ArrayList<Reference>();
    /**
     * Information about chromosome structure variation.
     * 
     */
    @JsonProperty("structureVariant")
    @JsonPropertyDescription("Information about chromosome structure variation.")
    private List<MolecularSequence_StructureVariant> structureVariant = new ArrayList<MolecularSequence_StructureVariant>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MolecularSequence resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MolecularSequence resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier for this particular sequence instance. This is a FHIR-defined id.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier for this particular sequence instance. This is a FHIR-defined id.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     * 
     */
    @JsonProperty("type")
    public MolecularSequence.Type getType() {
        return type;
    }

    /**
     * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     * 
     */
    @JsonProperty("type")
    public void setType(MolecularSequence.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("coordinateSystem")
    public Double getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("coordinateSystem")
    public void setCoordinateSystem(Double coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_coordinateSystem")
    public Element get_coordinateSystem() {
        return _coordinateSystem;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_coordinateSystem")
    public void set_coordinateSystem(Element _coordinateSystem) {
        this._coordinateSystem = _coordinateSystem;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("specimen")
    public Reference getSpecimen() {
        return specimen;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("specimen")
    public void setSpecimen(Reference specimen) {
        this.specimen = specimen;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    public Reference getDevice() {
        return device;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    public void setDevice(Reference device) {
        this.device = device;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public Reference getPerformer() {
        return performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(Reference performer) {
        this.performer = performer;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("referenceSeq")
    public MolecularSequence_ReferenceSeq getReferenceSeq() {
        return referenceSeq;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("referenceSeq")
    public void setReferenceSeq(MolecularSequence_ReferenceSeq referenceSeq) {
        this.referenceSeq = referenceSeq;
    }

    /**
     * The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
     * 
     */
    @JsonProperty("variant")
    public List<MolecularSequence_Variant> getVariant() {
        return variant;
    }

    /**
     * The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
     * 
     */
    @JsonProperty("variant")
    public void setVariant(List<MolecularSequence_Variant> variant) {
        this.variant = variant;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("observedSeq")
    public String getObservedSeq() {
        return observedSeq;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("observedSeq")
    public void setObservedSeq(String observedSeq) {
        this.observedSeq = observedSeq;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_observedSeq")
    public Element get_observedSeq() {
        return _observedSeq;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_observedSeq")
    public void set_observedSeq(Element _observedSeq) {
        this._observedSeq = _observedSeq;
    }

    /**
     * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
     * 
     */
    @JsonProperty("quality")
    public List<MolecularSequence_Quality> getQuality() {
        return quality;
    }

    /**
     * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
     * 
     */
    @JsonProperty("quality")
    public void setQuality(List<MolecularSequence_Quality> quality) {
        this.quality = quality;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("readCoverage")
    public Double getReadCoverage() {
        return readCoverage;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("readCoverage")
    public void setReadCoverage(Double readCoverage) {
        this.readCoverage = readCoverage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readCoverage")
    public Element get_readCoverage() {
        return _readCoverage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readCoverage")
    public void set_readCoverage(Element _readCoverage) {
        this._readCoverage = _readCoverage;
    }

    /**
     * Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
     * 
     */
    @JsonProperty("repository")
    public List<MolecularSequence_Repository> getRepository() {
        return repository;
    }

    /**
     * Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
     * 
     */
    @JsonProperty("repository")
    public void setRepository(List<MolecularSequence_Repository> repository) {
        this.repository = repository;
    }

    /**
     * Pointer to next atomic sequence which at most contains one variant.
     * 
     */
    @JsonProperty("pointer")
    public List<Reference> getPointer() {
        return pointer;
    }

    /**
     * Pointer to next atomic sequence which at most contains one variant.
     * 
     */
    @JsonProperty("pointer")
    public void setPointer(List<Reference> pointer) {
        this.pointer = pointer;
    }

    /**
     * Information about chromosome structure variation.
     * 
     */
    @JsonProperty("structureVariant")
    public List<MolecularSequence_StructureVariant> getStructureVariant() {
        return structureVariant;
    }

    /**
     * Information about chromosome structure variation.
     * 
     */
    @JsonProperty("structureVariant")
    public void setStructureVariant(List<MolecularSequence_StructureVariant> structureVariant) {
        this.structureVariant = structureVariant;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MolecularSequence.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("coordinateSystem");
        sb.append('=');
        sb.append(((this.coordinateSystem == null)?"<null>":this.coordinateSystem));
        sb.append(',');
        sb.append("_coordinateSystem");
        sb.append('=');
        sb.append(((this._coordinateSystem == null)?"<null>":this._coordinateSystem));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("specimen");
        sb.append('=');
        sb.append(((this.specimen == null)?"<null>":this.specimen));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("referenceSeq");
        sb.append('=');
        sb.append(((this.referenceSeq == null)?"<null>":this.referenceSeq));
        sb.append(',');
        sb.append("variant");
        sb.append('=');
        sb.append(((this.variant == null)?"<null>":this.variant));
        sb.append(',');
        sb.append("observedSeq");
        sb.append('=');
        sb.append(((this.observedSeq == null)?"<null>":this.observedSeq));
        sb.append(',');
        sb.append("_observedSeq");
        sb.append('=');
        sb.append(((this._observedSeq == null)?"<null>":this._observedSeq));
        sb.append(',');
        sb.append("quality");
        sb.append('=');
        sb.append(((this.quality == null)?"<null>":this.quality));
        sb.append(',');
        sb.append("readCoverage");
        sb.append('=');
        sb.append(((this.readCoverage == null)?"<null>":this.readCoverage));
        sb.append(',');
        sb.append("_readCoverage");
        sb.append('=');
        sb.append(((this._readCoverage == null)?"<null>":this._readCoverage));
        sb.append(',');
        sb.append("repository");
        sb.append('=');
        sb.append(((this.repository == null)?"<null>":this.repository));
        sb.append(',');
        sb.append("pointer");
        sb.append('=');
        sb.append(((this.pointer == null)?"<null>":this.pointer));
        sb.append(',');
        sb.append("structureVariant");
        sb.append('=');
        sb.append(((this.structureVariant == null)?"<null>":this.structureVariant));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this._coordinateSystem == null)? 0 :this._coordinateSystem.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.pointer == null)? 0 :this.pointer.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.observedSeq == null)? 0 :this.observedSeq.hashCode()));
        result = ((result* 31)+((this.repository == null)? 0 :this.repository.hashCode()));
        result = ((result* 31)+((this.quality == null)? 0 :this.quality.hashCode()));
        result = ((result* 31)+((this.structureVariant == null)? 0 :this.structureVariant.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.readCoverage == null)? 0 :this.readCoverage.hashCode()));
        result = ((result* 31)+((this.specimen == null)? 0 :this.specimen.hashCode()));
        result = ((result* 31)+((this.variant == null)? 0 :this.variant.hashCode()));
        result = ((result* 31)+((this._readCoverage == null)? 0 :this._readCoverage.hashCode()));
        result = ((result* 31)+((this.coordinateSystem == null)? 0 :this.coordinateSystem.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.referenceSeq == null)? 0 :this.referenceSeq.hashCode()));
        result = ((result* 31)+((this._observedSeq == null)? 0 :this._observedSeq.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MolecularSequence) == false) {
            return false;
        }
        MolecularSequence rhs = ((MolecularSequence) other);
        return ((((((((((((((((((((((super.equals(rhs)&&((this._coordinateSystem == rhs._coordinateSystem)||((this._coordinateSystem!= null)&&this._coordinateSystem.equals(rhs._coordinateSystem))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.pointer == rhs.pointer)||((this.pointer!= null)&&this.pointer.equals(rhs.pointer))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.observedSeq == rhs.observedSeq)||((this.observedSeq!= null)&&this.observedSeq.equals(rhs.observedSeq))))&&((this.repository == rhs.repository)||((this.repository!= null)&&this.repository.equals(rhs.repository))))&&((this.quality == rhs.quality)||((this.quality!= null)&&this.quality.equals(rhs.quality))))&&((this.structureVariant == rhs.structureVariant)||((this.structureVariant!= null)&&this.structureVariant.equals(rhs.structureVariant))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.readCoverage == rhs.readCoverage)||((this.readCoverage!= null)&&this.readCoverage.equals(rhs.readCoverage))))&&((this.specimen == rhs.specimen)||((this.specimen!= null)&&this.specimen.equals(rhs.specimen))))&&((this.variant == rhs.variant)||((this.variant!= null)&&this.variant.equals(rhs.variant))))&&((this._readCoverage == rhs._readCoverage)||((this._readCoverage!= null)&&this._readCoverage.equals(rhs._readCoverage))))&&((this.coordinateSystem == rhs.coordinateSystem)||((this.coordinateSystem!= null)&&this.coordinateSystem.equals(rhs.coordinateSystem))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.referenceSeq == rhs.referenceSeq)||((this.referenceSeq!= null)&&this.referenceSeq.equals(rhs.referenceSeq))))&&((this._observedSeq == rhs._observedSeq)||((this._observedSeq!= null)&&this._observedSeq.equals(rhs._observedSeq))));
    }


    /**
     * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        AA("aa"),
        DNA("dna"),
        RNA("rna");
        private final String value;
        private final static Map<String, MolecularSequence.Type> CONSTANTS = new HashMap<String, MolecularSequence.Type>();

        static {
            for (MolecularSequence.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static MolecularSequence.Type fromValue(String value) {
            MolecularSequence.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
