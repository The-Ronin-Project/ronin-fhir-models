
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "type",
    "status",
    "domain",
    "description",
    "_description",
    "source",
    "comment",
    "_comment",
    "moiety",
    "property",
    "referenceInformation",
    "structure",
    "code",
    "name",
    "molecularWeight",
    "relationship",
    "nucleicAcid",
    "polymer",
    "protein",
    "sourceMaterial"
})
@Generated("jsonschema2pojo")
public class SubstanceSpecification
    extends DomainResource
{

    /**
     * This is a SubstanceSpecification resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SubstanceSpecification resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept domain;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Supporting literature.")
    private List<Reference> source = new ArrayList<Reference>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String comment;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _comment;
    /**
     * Moiety, for structural modifications.
     * 
     */
    @JsonProperty("moiety")
    @JsonPropertyDescription("Moiety, for structural modifications.")
    private List<SubstanceSpecification_Moiety> moiety = new ArrayList<SubstanceSpecification_Moiety>();
    /**
     * General specifications for this substance, including how it is related to other substances.
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("General specifications for this substance, including how it is related to other substances.")
    private List<SubstanceSpecification_Property> property = new ArrayList<SubstanceSpecification_Property>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referenceInformation")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference referenceInformation;
    /**
     * The detailed description of a substance, typically at a level beyond what is used for prescribing.
     * 
     */
    @JsonProperty("structure")
    @JsonPropertyDescription("The detailed description of a substance, typically at a level beyond what is used for prescribing.")
    private SubstanceSpecification_Structure structure;
    /**
     * Codes associated with the substance.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Codes associated with the substance.")
    private List<SubstanceSpecification_Code> code = new ArrayList<SubstanceSpecification_Code>();
    /**
     * Names applicable to this substance.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Names applicable to this substance.")
    private List<SubstanceSpecification_Name> name = new ArrayList<SubstanceSpecification_Name>();
    /**
     * The molecular weight or weight range (for proteins, polymers or nucleic acids).
     * 
     */
    @JsonProperty("molecularWeight")
    @JsonPropertyDescription("The molecular weight or weight range (for proteins, polymers or nucleic acids).")
    private List<SubstanceSpecification_MolecularWeight> molecularWeight = new ArrayList<SubstanceSpecification_MolecularWeight>();
    /**
     * A link between this substance and another, with details of the relationship.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("A link between this substance and another, with details of the relationship.")
    private List<SubstanceSpecification_Relationship> relationship = new ArrayList<SubstanceSpecification_Relationship>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("nucleicAcid")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference nucleicAcid;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("polymer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference polymer;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("protein")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference protein;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourceMaterial")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference sourceMaterial;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SubstanceSpecification resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SubstanceSpecification resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    public CodeableConcept getStatus() {
        return status;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CodeableConcept status) {
        this.status = status;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("domain")
    public CodeableConcept getDomain() {
        return domain;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(CodeableConcept domain) {
        this.domain = domain;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    public List<Reference> getSource() {
        return source;
    }

    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    public void setSource(List<Reference> source) {
        this.source = source;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public Element get_comment() {
        return _comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public void set_comment(Element _comment) {
        this._comment = _comment;
    }

    /**
     * Moiety, for structural modifications.
     * 
     */
    @JsonProperty("moiety")
    public List<SubstanceSpecification_Moiety> getMoiety() {
        return moiety;
    }

    /**
     * Moiety, for structural modifications.
     * 
     */
    @JsonProperty("moiety")
    public void setMoiety(List<SubstanceSpecification_Moiety> moiety) {
        this.moiety = moiety;
    }

    /**
     * General specifications for this substance, including how it is related to other substances.
     * 
     */
    @JsonProperty("property")
    public List<SubstanceSpecification_Property> getProperty() {
        return property;
    }

    /**
     * General specifications for this substance, including how it is related to other substances.
     * 
     */
    @JsonProperty("property")
    public void setProperty(List<SubstanceSpecification_Property> property) {
        this.property = property;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referenceInformation")
    public Reference getReferenceInformation() {
        return referenceInformation;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referenceInformation")
    public void setReferenceInformation(Reference referenceInformation) {
        this.referenceInformation = referenceInformation;
    }

    /**
     * The detailed description of a substance, typically at a level beyond what is used for prescribing.
     * 
     */
    @JsonProperty("structure")
    public SubstanceSpecification_Structure getStructure() {
        return structure;
    }

    /**
     * The detailed description of a substance, typically at a level beyond what is used for prescribing.
     * 
     */
    @JsonProperty("structure")
    public void setStructure(SubstanceSpecification_Structure structure) {
        this.structure = structure;
    }

    /**
     * Codes associated with the substance.
     * 
     */
    @JsonProperty("code")
    public List<SubstanceSpecification_Code> getCode() {
        return code;
    }

    /**
     * Codes associated with the substance.
     * 
     */
    @JsonProperty("code")
    public void setCode(List<SubstanceSpecification_Code> code) {
        this.code = code;
    }

    /**
     * Names applicable to this substance.
     * 
     */
    @JsonProperty("name")
    public List<SubstanceSpecification_Name> getName() {
        return name;
    }

    /**
     * Names applicable to this substance.
     * 
     */
    @JsonProperty("name")
    public void setName(List<SubstanceSpecification_Name> name) {
        this.name = name;
    }

    /**
     * The molecular weight or weight range (for proteins, polymers or nucleic acids).
     * 
     */
    @JsonProperty("molecularWeight")
    public List<SubstanceSpecification_MolecularWeight> getMolecularWeight() {
        return molecularWeight;
    }

    /**
     * The molecular weight or weight range (for proteins, polymers or nucleic acids).
     * 
     */
    @JsonProperty("molecularWeight")
    public void setMolecularWeight(List<SubstanceSpecification_MolecularWeight> molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    /**
     * A link between this substance and another, with details of the relationship.
     * 
     */
    @JsonProperty("relationship")
    public List<SubstanceSpecification_Relationship> getRelationship() {
        return relationship;
    }

    /**
     * A link between this substance and another, with details of the relationship.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(List<SubstanceSpecification_Relationship> relationship) {
        this.relationship = relationship;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("nucleicAcid")
    public Reference getNucleicAcid() {
        return nucleicAcid;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("nucleicAcid")
    public void setNucleicAcid(Reference nucleicAcid) {
        this.nucleicAcid = nucleicAcid;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("polymer")
    public Reference getPolymer() {
        return polymer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("polymer")
    public void setPolymer(Reference polymer) {
        this.polymer = polymer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("protein")
    public Reference getProtein() {
        return protein;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("protein")
    public void setProtein(Reference protein) {
        this.protein = protein;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourceMaterial")
    public Reference getSourceMaterial() {
        return sourceMaterial;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourceMaterial")
    public void setSourceMaterial(Reference sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
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
        sb.append(SubstanceSpecification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
        sb.append(',');
        sb.append("moiety");
        sb.append('=');
        sb.append(((this.moiety == null)?"<null>":this.moiety));
        sb.append(',');
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("referenceInformation");
        sb.append('=');
        sb.append(((this.referenceInformation == null)?"<null>":this.referenceInformation));
        sb.append(',');
        sb.append("structure");
        sb.append('=');
        sb.append(((this.structure == null)?"<null>":this.structure));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("molecularWeight");
        sb.append('=');
        sb.append(((this.molecularWeight == null)?"<null>":this.molecularWeight));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("nucleicAcid");
        sb.append('=');
        sb.append(((this.nucleicAcid == null)?"<null>":this.nucleicAcid));
        sb.append(',');
        sb.append("polymer");
        sb.append('=');
        sb.append(((this.polymer == null)?"<null>":this.polymer));
        sb.append(',');
        sb.append("protein");
        sb.append('=');
        sb.append(((this.protein == null)?"<null>":this.protein));
        sb.append(',');
        sb.append("sourceMaterial");
        sb.append('=');
        sb.append(((this.sourceMaterial == null)?"<null>":this.sourceMaterial));
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
        result = ((result* 31)+((this.polymer == null)? 0 :this.polymer.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.referenceInformation == null)? 0 :this.referenceInformation.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.molecularWeight == null)? 0 :this.molecularWeight.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.moiety == null)? 0 :this.moiety.hashCode()));
        result = ((result* 31)+((this.structure == null)? 0 :this.structure.hashCode()));
        result = ((result* 31)+((this.sourceMaterial == null)? 0 :this.sourceMaterial.hashCode()));
        result = ((result* 31)+((this.nucleicAcid == null)? 0 :this.nucleicAcid.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.protein == null)? 0 :this.protein.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSpecification) == false) {
            return false;
        }
        SubstanceSpecification rhs = ((SubstanceSpecification) other);
        return (((((((((((((((((((((((super.equals(rhs)&&((this.polymer == rhs.polymer)||((this.polymer!= null)&&this.polymer.equals(rhs.polymer))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.referenceInformation == rhs.referenceInformation)||((this.referenceInformation!= null)&&this.referenceInformation.equals(rhs.referenceInformation))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.molecularWeight == rhs.molecularWeight)||((this.molecularWeight!= null)&&this.molecularWeight.equals(rhs.molecularWeight))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.moiety == rhs.moiety)||((this.moiety!= null)&&this.moiety.equals(rhs.moiety))))&&((this.structure == rhs.structure)||((this.structure!= null)&&this.structure.equals(rhs.structure))))&&((this.sourceMaterial == rhs.sourceMaterial)||((this.sourceMaterial!= null)&&this.sourceMaterial.equals(rhs.sourceMaterial))))&&((this.nucleicAcid == rhs.nucleicAcid)||((this.nucleicAcid!= null)&&this.nucleicAcid.equals(rhs.nucleicAcid))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.protein == rhs.protein)||((this.protein!= null)&&this.protein.equals(rhs.protein))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
