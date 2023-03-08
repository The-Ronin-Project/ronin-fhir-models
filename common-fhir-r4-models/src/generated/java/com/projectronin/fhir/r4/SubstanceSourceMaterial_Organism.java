
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "family",
    "genus",
    "species",
    "intraspecificType",
    "intraspecificDescription",
    "_intraspecificDescription",
    "author",
    "hybrid",
    "organismGeneral"
})
@Generated("jsonschema2pojo")
public class SubstanceSourceMaterial_Organism {

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
    @JsonProperty("family")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept family;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("genus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept genus;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("species")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept species;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("intraspecificType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept intraspecificType;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("intraspecificDescription")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String intraspecificDescription;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intraspecificDescription")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _intraspecificDescription;
    /**
     *  4.9.13.6.1 Author type (Conditional).
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("4.9.13.6.1 Author type (Conditional).")
    private List<SubstanceSourceMaterial_Author> author = new ArrayList<SubstanceSourceMaterial_Author>();
    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("hybrid")
    @JsonPropertyDescription("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.")
    private SubstanceSourceMaterial_Hybrid hybrid;
    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("organismGeneral")
    @JsonPropertyDescription("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.")
    private SubstanceSourceMaterial_OrganismGeneral organismGeneral;

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
    @JsonProperty("family")
    public CodeableConcept getFamily() {
        return family;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("family")
    public void setFamily(CodeableConcept family) {
        this.family = family;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("genus")
    public CodeableConcept getGenus() {
        return genus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("genus")
    public void setGenus(CodeableConcept genus) {
        this.genus = genus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("species")
    public CodeableConcept getSpecies() {
        return species;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("species")
    public void setSpecies(CodeableConcept species) {
        this.species = species;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("intraspecificType")
    public CodeableConcept getIntraspecificType() {
        return intraspecificType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("intraspecificType")
    public void setIntraspecificType(CodeableConcept intraspecificType) {
        this.intraspecificType = intraspecificType;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("intraspecificDescription")
    public String getIntraspecificDescription() {
        return intraspecificDescription;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("intraspecificDescription")
    public void setIntraspecificDescription(String intraspecificDescription) {
        this.intraspecificDescription = intraspecificDescription;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intraspecificDescription")
    public Element get_intraspecificDescription() {
        return _intraspecificDescription;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intraspecificDescription")
    public void set_intraspecificDescription(Element _intraspecificDescription) {
        this._intraspecificDescription = _intraspecificDescription;
    }

    /**
     *  4.9.13.6.1 Author type (Conditional).
     * 
     */
    @JsonProperty("author")
    public List<SubstanceSourceMaterial_Author> getAuthor() {
        return author;
    }

    /**
     *  4.9.13.6.1 Author type (Conditional).
     * 
     */
    @JsonProperty("author")
    public void setAuthor(List<SubstanceSourceMaterial_Author> author) {
        this.author = author;
    }

    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("hybrid")
    public SubstanceSourceMaterial_Hybrid getHybrid() {
        return hybrid;
    }

    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("hybrid")
    public void setHybrid(SubstanceSourceMaterial_Hybrid hybrid) {
        this.hybrid = hybrid;
    }

    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("organismGeneral")
    public SubstanceSourceMaterial_OrganismGeneral getOrganismGeneral() {
        return organismGeneral;
    }

    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("organismGeneral")
    public void setOrganismGeneral(SubstanceSourceMaterial_OrganismGeneral organismGeneral) {
        this.organismGeneral = organismGeneral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceSourceMaterial_Organism.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("family");
        sb.append('=');
        sb.append(((this.family == null)?"<null>":this.family));
        sb.append(',');
        sb.append("genus");
        sb.append('=');
        sb.append(((this.genus == null)?"<null>":this.genus));
        sb.append(',');
        sb.append("species");
        sb.append('=');
        sb.append(((this.species == null)?"<null>":this.species));
        sb.append(',');
        sb.append("intraspecificType");
        sb.append('=');
        sb.append(((this.intraspecificType == null)?"<null>":this.intraspecificType));
        sb.append(',');
        sb.append("intraspecificDescription");
        sb.append('=');
        sb.append(((this.intraspecificDescription == null)?"<null>":this.intraspecificDescription));
        sb.append(',');
        sb.append("_intraspecificDescription");
        sb.append('=');
        sb.append(((this._intraspecificDescription == null)?"<null>":this._intraspecificDescription));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("hybrid");
        sb.append('=');
        sb.append(((this.hybrid == null)?"<null>":this.hybrid));
        sb.append(',');
        sb.append("organismGeneral");
        sb.append('=');
        sb.append(((this.organismGeneral == null)?"<null>":this.organismGeneral));
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
        result = ((result* 31)+((this.intraspecificType == null)? 0 :this.intraspecificType.hashCode()));
        result = ((result* 31)+((this.hybrid == null)? 0 :this.hybrid.hashCode()));
        result = ((result* 31)+((this._intraspecificDescription == null)? 0 :this._intraspecificDescription.hashCode()));
        result = ((result* 31)+((this.genus == null)? 0 :this.genus.hashCode()));
        result = ((result* 31)+((this.species == null)? 0 :this.species.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.organismGeneral == null)? 0 :this.organismGeneral.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.family == null)? 0 :this.family.hashCode()));
        result = ((result* 31)+((this.intraspecificDescription == null)? 0 :this.intraspecificDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSourceMaterial_Organism) == false) {
            return false;
        }
        SubstanceSourceMaterial_Organism rhs = ((SubstanceSourceMaterial_Organism) other);
        return (((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.intraspecificType == rhs.intraspecificType)||((this.intraspecificType!= null)&&this.intraspecificType.equals(rhs.intraspecificType))))&&((this.hybrid == rhs.hybrid)||((this.hybrid!= null)&&this.hybrid.equals(rhs.hybrid))))&&((this._intraspecificDescription == rhs._intraspecificDescription)||((this._intraspecificDescription!= null)&&this._intraspecificDescription.equals(rhs._intraspecificDescription))))&&((this.genus == rhs.genus)||((this.genus!= null)&&this.genus.equals(rhs.genus))))&&((this.species == rhs.species)||((this.species!= null)&&this.species.equals(rhs.species))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.organismGeneral == rhs.organismGeneral)||((this.organismGeneral!= null)&&this.organismGeneral.equals(rhs.organismGeneral))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.family == rhs.family)||((this.family!= null)&&this.family.equals(rhs.family))))&&((this.intraspecificDescription == rhs.intraspecificDescription)||((this.intraspecificDescription!= null)&&this.intraspecificDescription.equals(rhs.intraspecificDescription))));
    }

}
