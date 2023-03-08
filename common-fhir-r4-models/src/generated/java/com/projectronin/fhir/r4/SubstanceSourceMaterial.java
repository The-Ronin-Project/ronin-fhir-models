
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
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "sourceMaterialClass",
    "sourceMaterialType",
    "sourceMaterialState",
    "organismId",
    "organismName",
    "_organismName",
    "parentSubstanceId",
    "parentSubstanceName",
    "_parentSubstanceName",
    "countryOfOrigin",
    "geographicalLocation",
    "_geographicalLocation",
    "developmentStage",
    "fractionDescription",
    "organism",
    "partDescription"
})
@Generated("jsonschema2pojo")
public class SubstanceSourceMaterial
    extends DomainResource
{

    /**
     * This is a SubstanceSourceMaterial resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SubstanceSourceMaterial resource")
    private String resourceType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialClass")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept sourceMaterialClass;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept sourceMaterialType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialState")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept sourceMaterialState;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("organismId")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier organismId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("organismName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String organismName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_organismName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _organismName;
    /**
     * The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
     * 
     */
    @JsonProperty("parentSubstanceId")
    @JsonPropertyDescription("The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).")
    private List<Identifier> parentSubstanceId = new ArrayList<Identifier>();
    /**
     * The parent substance of the Herbal Drug, or Herbal preparation.
     * 
     */
    @JsonProperty("parentSubstanceName")
    @JsonPropertyDescription("The parent substance of the Herbal Drug, or Herbal preparation.")
    private List<String> parentSubstanceName = new ArrayList<String>();
    /**
     * Extensions for parentSubstanceName
     * 
     */
    @JsonProperty("_parentSubstanceName")
    @JsonPropertyDescription("Extensions for parentSubstanceName")
    private List<Element> _parentSubstanceName = new ArrayList<Element>();
    /**
     * The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in accordance with the Plasma Master File. For &ldquo;Plasma-derived substances&rdquo; the attribute country of origin provides information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
     * 
     */
    @JsonProperty("countryOfOrigin")
    @JsonPropertyDescription("The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in accordance with the Plasma Master File. For \u201cPlasma-derived substances\u201d the attribute country of origin provides information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.")
    private List<CodeableConcept> countryOfOrigin = new ArrayList<CodeableConcept>();
    /**
     * The place/region where the plant is harvested or the places/regions where the animal source material has its habitat.
     * 
     */
    @JsonProperty("geographicalLocation")
    @JsonPropertyDescription("The place/region where the plant is harvested or the places/regions where the animal source material has its habitat.")
    private List<String> geographicalLocation = new ArrayList<String>();
    /**
     * Extensions for geographicalLocation
     * 
     */
    @JsonProperty("_geographicalLocation")
    @JsonPropertyDescription("Extensions for geographicalLocation")
    private List<Element> _geographicalLocation = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("developmentStage")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept developmentStage;
    /**
     * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.
     * 
     */
    @JsonProperty("fractionDescription")
    @JsonPropertyDescription("Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.")
    private List<SubstanceSourceMaterial_FractionDescription> fractionDescription = new ArrayList<SubstanceSourceMaterial_FractionDescription>();
    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("organism")
    @JsonPropertyDescription("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.")
    private SubstanceSourceMaterial_Organism organism;
    /**
     * To do.
     * 
     */
    @JsonProperty("partDescription")
    @JsonPropertyDescription("To do.")
    private List<SubstanceSourceMaterial_PartDescription> partDescription = new ArrayList<SubstanceSourceMaterial_PartDescription>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SubstanceSourceMaterial resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SubstanceSourceMaterial resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialClass")
    public CodeableConcept getSourceMaterialClass() {
        return sourceMaterialClass;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialClass")
    public void setSourceMaterialClass(CodeableConcept sourceMaterialClass) {
        this.sourceMaterialClass = sourceMaterialClass;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialType")
    public CodeableConcept getSourceMaterialType() {
        return sourceMaterialType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialType")
    public void setSourceMaterialType(CodeableConcept sourceMaterialType) {
        this.sourceMaterialType = sourceMaterialType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialState")
    public CodeableConcept getSourceMaterialState() {
        return sourceMaterialState;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sourceMaterialState")
    public void setSourceMaterialState(CodeableConcept sourceMaterialState) {
        this.sourceMaterialState = sourceMaterialState;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("organismId")
    public Identifier getOrganismId() {
        return organismId;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("organismId")
    public void setOrganismId(Identifier organismId) {
        this.organismId = organismId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("organismName")
    public String getOrganismName() {
        return organismName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("organismName")
    public void setOrganismName(String organismName) {
        this.organismName = organismName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_organismName")
    public Element get_organismName() {
        return _organismName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_organismName")
    public void set_organismName(Element _organismName) {
        this._organismName = _organismName;
    }

    /**
     * The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
     * 
     */
    @JsonProperty("parentSubstanceId")
    public List<Identifier> getParentSubstanceId() {
        return parentSubstanceId;
    }

    /**
     * The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
     * 
     */
    @JsonProperty("parentSubstanceId")
    public void setParentSubstanceId(List<Identifier> parentSubstanceId) {
        this.parentSubstanceId = parentSubstanceId;
    }

    /**
     * The parent substance of the Herbal Drug, or Herbal preparation.
     * 
     */
    @JsonProperty("parentSubstanceName")
    public List<String> getParentSubstanceName() {
        return parentSubstanceName;
    }

    /**
     * The parent substance of the Herbal Drug, or Herbal preparation.
     * 
     */
    @JsonProperty("parentSubstanceName")
    public void setParentSubstanceName(List<String> parentSubstanceName) {
        this.parentSubstanceName = parentSubstanceName;
    }

    /**
     * Extensions for parentSubstanceName
     * 
     */
    @JsonProperty("_parentSubstanceName")
    public List<Element> get_parentSubstanceName() {
        return _parentSubstanceName;
    }

    /**
     * Extensions for parentSubstanceName
     * 
     */
    @JsonProperty("_parentSubstanceName")
    public void set_parentSubstanceName(List<Element> _parentSubstanceName) {
        this._parentSubstanceName = _parentSubstanceName;
    }

    /**
     * The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in accordance with the Plasma Master File. For &ldquo;Plasma-derived substances&rdquo; the attribute country of origin provides information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
     * 
     */
    @JsonProperty("countryOfOrigin")
    public List<CodeableConcept> getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in accordance with the Plasma Master File. For &ldquo;Plasma-derived substances&rdquo; the attribute country of origin provides information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
     * 
     */
    @JsonProperty("countryOfOrigin")
    public void setCountryOfOrigin(List<CodeableConcept> countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * The place/region where the plant is harvested or the places/regions where the animal source material has its habitat.
     * 
     */
    @JsonProperty("geographicalLocation")
    public List<String> getGeographicalLocation() {
        return geographicalLocation;
    }

    /**
     * The place/region where the plant is harvested or the places/regions where the animal source material has its habitat.
     * 
     */
    @JsonProperty("geographicalLocation")
    public void setGeographicalLocation(List<String> geographicalLocation) {
        this.geographicalLocation = geographicalLocation;
    }

    /**
     * Extensions for geographicalLocation
     * 
     */
    @JsonProperty("_geographicalLocation")
    public List<Element> get_geographicalLocation() {
        return _geographicalLocation;
    }

    /**
     * Extensions for geographicalLocation
     * 
     */
    @JsonProperty("_geographicalLocation")
    public void set_geographicalLocation(List<Element> _geographicalLocation) {
        this._geographicalLocation = _geographicalLocation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("developmentStage")
    public CodeableConcept getDevelopmentStage() {
        return developmentStage;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("developmentStage")
    public void setDevelopmentStage(CodeableConcept developmentStage) {
        this.developmentStage = developmentStage;
    }

    /**
     * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.
     * 
     */
    @JsonProperty("fractionDescription")
    public List<SubstanceSourceMaterial_FractionDescription> getFractionDescription() {
        return fractionDescription;
    }

    /**
     * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.
     * 
     */
    @JsonProperty("fractionDescription")
    public void setFractionDescription(List<SubstanceSourceMaterial_FractionDescription> fractionDescription) {
        this.fractionDescription = fractionDescription;
    }

    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("organism")
    public SubstanceSourceMaterial_Organism getOrganism() {
        return organism;
    }

    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     * 
     */
    @JsonProperty("organism")
    public void setOrganism(SubstanceSourceMaterial_Organism organism) {
        this.organism = organism;
    }

    /**
     * To do.
     * 
     */
    @JsonProperty("partDescription")
    public List<SubstanceSourceMaterial_PartDescription> getPartDescription() {
        return partDescription;
    }

    /**
     * To do.
     * 
     */
    @JsonProperty("partDescription")
    public void setPartDescription(List<SubstanceSourceMaterial_PartDescription> partDescription) {
        this.partDescription = partDescription;
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
        sb.append(SubstanceSourceMaterial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("sourceMaterialClass");
        sb.append('=');
        sb.append(((this.sourceMaterialClass == null)?"<null>":this.sourceMaterialClass));
        sb.append(',');
        sb.append("sourceMaterialType");
        sb.append('=');
        sb.append(((this.sourceMaterialType == null)?"<null>":this.sourceMaterialType));
        sb.append(',');
        sb.append("sourceMaterialState");
        sb.append('=');
        sb.append(((this.sourceMaterialState == null)?"<null>":this.sourceMaterialState));
        sb.append(',');
        sb.append("organismId");
        sb.append('=');
        sb.append(((this.organismId == null)?"<null>":this.organismId));
        sb.append(',');
        sb.append("organismName");
        sb.append('=');
        sb.append(((this.organismName == null)?"<null>":this.organismName));
        sb.append(',');
        sb.append("_organismName");
        sb.append('=');
        sb.append(((this._organismName == null)?"<null>":this._organismName));
        sb.append(',');
        sb.append("parentSubstanceId");
        sb.append('=');
        sb.append(((this.parentSubstanceId == null)?"<null>":this.parentSubstanceId));
        sb.append(',');
        sb.append("parentSubstanceName");
        sb.append('=');
        sb.append(((this.parentSubstanceName == null)?"<null>":this.parentSubstanceName));
        sb.append(',');
        sb.append("_parentSubstanceName");
        sb.append('=');
        sb.append(((this._parentSubstanceName == null)?"<null>":this._parentSubstanceName));
        sb.append(',');
        sb.append("countryOfOrigin");
        sb.append('=');
        sb.append(((this.countryOfOrigin == null)?"<null>":this.countryOfOrigin));
        sb.append(',');
        sb.append("geographicalLocation");
        sb.append('=');
        sb.append(((this.geographicalLocation == null)?"<null>":this.geographicalLocation));
        sb.append(',');
        sb.append("_geographicalLocation");
        sb.append('=');
        sb.append(((this._geographicalLocation == null)?"<null>":this._geographicalLocation));
        sb.append(',');
        sb.append("developmentStage");
        sb.append('=');
        sb.append(((this.developmentStage == null)?"<null>":this.developmentStage));
        sb.append(',');
        sb.append("fractionDescription");
        sb.append('=');
        sb.append(((this.fractionDescription == null)?"<null>":this.fractionDescription));
        sb.append(',');
        sb.append("organism");
        sb.append('=');
        sb.append(((this.organism == null)?"<null>":this.organism));
        sb.append(',');
        sb.append("partDescription");
        sb.append('=');
        sb.append(((this.partDescription == null)?"<null>":this.partDescription));
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
        result = ((result* 31)+((this._geographicalLocation == null)? 0 :this._geographicalLocation.hashCode()));
        result = ((result* 31)+((this.geographicalLocation == null)? 0 :this.geographicalLocation.hashCode()));
        result = ((result* 31)+((this.organism == null)? 0 :this.organism.hashCode()));
        result = ((result* 31)+((this._parentSubstanceName == null)? 0 :this._parentSubstanceName.hashCode()));
        result = ((result* 31)+((this.sourceMaterialType == null)? 0 :this.sourceMaterialType.hashCode()));
        result = ((result* 31)+((this.organismId == null)? 0 :this.organismId.hashCode()));
        result = ((result* 31)+((this.parentSubstanceName == null)? 0 :this.parentSubstanceName.hashCode()));
        result = ((result* 31)+((this.developmentStage == null)? 0 :this.developmentStage.hashCode()));
        result = ((result* 31)+((this._organismName == null)? 0 :this._organismName.hashCode()));
        result = ((result* 31)+((this.organismName == null)? 0 :this.organismName.hashCode()));
        result = ((result* 31)+((this.partDescription == null)? 0 :this.partDescription.hashCode()));
        result = ((result* 31)+((this.sourceMaterialClass == null)? 0 :this.sourceMaterialClass.hashCode()));
        result = ((result* 31)+((this.sourceMaterialState == null)? 0 :this.sourceMaterialState.hashCode()));
        result = ((result* 31)+((this.countryOfOrigin == null)? 0 :this.countryOfOrigin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parentSubstanceId == null)? 0 :this.parentSubstanceId.hashCode()));
        result = ((result* 31)+((this.fractionDescription == null)? 0 :this.fractionDescription.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSourceMaterial) == false) {
            return false;
        }
        SubstanceSourceMaterial rhs = ((SubstanceSourceMaterial) other);
        return ((((((((((((((((((super.equals(rhs)&&((this._geographicalLocation == rhs._geographicalLocation)||((this._geographicalLocation!= null)&&this._geographicalLocation.equals(rhs._geographicalLocation))))&&((this.geographicalLocation == rhs.geographicalLocation)||((this.geographicalLocation!= null)&&this.geographicalLocation.equals(rhs.geographicalLocation))))&&((this.organism == rhs.organism)||((this.organism!= null)&&this.organism.equals(rhs.organism))))&&((this._parentSubstanceName == rhs._parentSubstanceName)||((this._parentSubstanceName!= null)&&this._parentSubstanceName.equals(rhs._parentSubstanceName))))&&((this.sourceMaterialType == rhs.sourceMaterialType)||((this.sourceMaterialType!= null)&&this.sourceMaterialType.equals(rhs.sourceMaterialType))))&&((this.organismId == rhs.organismId)||((this.organismId!= null)&&this.organismId.equals(rhs.organismId))))&&((this.parentSubstanceName == rhs.parentSubstanceName)||((this.parentSubstanceName!= null)&&this.parentSubstanceName.equals(rhs.parentSubstanceName))))&&((this.developmentStage == rhs.developmentStage)||((this.developmentStage!= null)&&this.developmentStage.equals(rhs.developmentStage))))&&((this._organismName == rhs._organismName)||((this._organismName!= null)&&this._organismName.equals(rhs._organismName))))&&((this.organismName == rhs.organismName)||((this.organismName!= null)&&this.organismName.equals(rhs.organismName))))&&((this.partDescription == rhs.partDescription)||((this.partDescription!= null)&&this.partDescription.equals(rhs.partDescription))))&&((this.sourceMaterialClass == rhs.sourceMaterialClass)||((this.sourceMaterialClass!= null)&&this.sourceMaterialClass.equals(rhs.sourceMaterialClass))))&&((this.sourceMaterialState == rhs.sourceMaterialState)||((this.sourceMaterialState!= null)&&this.sourceMaterialState.equals(rhs.sourceMaterialState))))&&((this.countryOfOrigin == rhs.countryOfOrigin)||((this.countryOfOrigin!= null)&&this.countryOfOrigin.equals(rhs.countryOfOrigin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parentSubstanceId == rhs.parentSubstanceId)||((this.parentSubstanceId!= null)&&this.parentSubstanceId.equals(rhs.parentSubstanceId))))&&((this.fractionDescription == rhs.fractionDescription)||((this.fractionDescription!= null)&&this.fractionDescription.equals(rhs.fractionDescription))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
