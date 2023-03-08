
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
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "sequenceType",
    "numberOfSubunits",
    "_numberOfSubunits",
    "disulfideLinkage",
    "_disulfideLinkage",
    "subunit"
})
@Generated("jsonschema2pojo")
public class SubstanceProtein
    extends DomainResource
{

    /**
     * This is a SubstanceProtein resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SubstanceProtein resource")
    private String resourceType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sequenceType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept sequenceType;
    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfSubunits")
    @JsonPropertyDescription("A whole number")
    private Double numberOfSubunits;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfSubunits")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfSubunits;
    /**
     * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage positions shall actually contain the amino acid Cysteine at the respective positions.
     * 
     */
    @JsonProperty("disulfideLinkage")
    @JsonPropertyDescription("The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage positions shall actually contain the amino acid Cysteine at the respective positions.")
    private List<String> disulfideLinkage = new ArrayList<String>();
    /**
     * Extensions for disulfideLinkage
     * 
     */
    @JsonProperty("_disulfideLinkage")
    @JsonPropertyDescription("Extensions for disulfideLinkage")
    private List<Element> _disulfideLinkage = new ArrayList<Element>();
    /**
     * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
     * 
     */
    @JsonProperty("subunit")
    @JsonPropertyDescription("This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.")
    private List<SubstanceProtein_Subunit> subunit = new ArrayList<SubstanceProtein_Subunit>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SubstanceProtein resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SubstanceProtein resource
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
    @JsonProperty("sequenceType")
    public CodeableConcept getSequenceType() {
        return sequenceType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sequenceType")
    public void setSequenceType(CodeableConcept sequenceType) {
        this.sequenceType = sequenceType;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfSubunits")
    public Double getNumberOfSubunits() {
        return numberOfSubunits;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfSubunits")
    public void setNumberOfSubunits(Double numberOfSubunits) {
        this.numberOfSubunits = numberOfSubunits;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfSubunits")
    public Element get_numberOfSubunits() {
        return _numberOfSubunits;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfSubunits")
    public void set_numberOfSubunits(Element _numberOfSubunits) {
        this._numberOfSubunits = _numberOfSubunits;
    }

    /**
     * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage positions shall actually contain the amino acid Cysteine at the respective positions.
     * 
     */
    @JsonProperty("disulfideLinkage")
    public List<String> getDisulfideLinkage() {
        return disulfideLinkage;
    }

    /**
     * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage positions shall actually contain the amino acid Cysteine at the respective positions.
     * 
     */
    @JsonProperty("disulfideLinkage")
    public void setDisulfideLinkage(List<String> disulfideLinkage) {
        this.disulfideLinkage = disulfideLinkage;
    }

    /**
     * Extensions for disulfideLinkage
     * 
     */
    @JsonProperty("_disulfideLinkage")
    public List<Element> get_disulfideLinkage() {
        return _disulfideLinkage;
    }

    /**
     * Extensions for disulfideLinkage
     * 
     */
    @JsonProperty("_disulfideLinkage")
    public void set_disulfideLinkage(List<Element> _disulfideLinkage) {
        this._disulfideLinkage = _disulfideLinkage;
    }

    /**
     * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
     * 
     */
    @JsonProperty("subunit")
    public List<SubstanceProtein_Subunit> getSubunit() {
        return subunit;
    }

    /**
     * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
     * 
     */
    @JsonProperty("subunit")
    public void setSubunit(List<SubstanceProtein_Subunit> subunit) {
        this.subunit = subunit;
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
        sb.append(SubstanceProtein.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("sequenceType");
        sb.append('=');
        sb.append(((this.sequenceType == null)?"<null>":this.sequenceType));
        sb.append(',');
        sb.append("numberOfSubunits");
        sb.append('=');
        sb.append(((this.numberOfSubunits == null)?"<null>":this.numberOfSubunits));
        sb.append(',');
        sb.append("_numberOfSubunits");
        sb.append('=');
        sb.append(((this._numberOfSubunits == null)?"<null>":this._numberOfSubunits));
        sb.append(',');
        sb.append("disulfideLinkage");
        sb.append('=');
        sb.append(((this.disulfideLinkage == null)?"<null>":this.disulfideLinkage));
        sb.append(',');
        sb.append("_disulfideLinkage");
        sb.append('=');
        sb.append(((this._disulfideLinkage == null)?"<null>":this._disulfideLinkage));
        sb.append(',');
        sb.append("subunit");
        sb.append('=');
        sb.append(((this.subunit == null)?"<null>":this.subunit));
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
        result = ((result* 31)+((this._disulfideLinkage == null)? 0 :this._disulfideLinkage.hashCode()));
        result = ((result* 31)+((this._numberOfSubunits == null)? 0 :this._numberOfSubunits.hashCode()));
        result = ((result* 31)+((this.disulfideLinkage == null)? 0 :this.disulfideLinkage.hashCode()));
        result = ((result* 31)+((this.subunit == null)? 0 :this.subunit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.numberOfSubunits == null)? 0 :this.numberOfSubunits.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.sequenceType == null)? 0 :this.sequenceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceProtein) == false) {
            return false;
        }
        SubstanceProtein rhs = ((SubstanceProtein) other);
        return ((((((((super.equals(rhs)&&((this._disulfideLinkage == rhs._disulfideLinkage)||((this._disulfideLinkage!= null)&&this._disulfideLinkage.equals(rhs._disulfideLinkage))))&&((this._numberOfSubunits == rhs._numberOfSubunits)||((this._numberOfSubunits!= null)&&this._numberOfSubunits.equals(rhs._numberOfSubunits))))&&((this.disulfideLinkage == rhs.disulfideLinkage)||((this.disulfideLinkage!= null)&&this.disulfideLinkage.equals(rhs.disulfideLinkage))))&&((this.subunit == rhs.subunit)||((this.subunit!= null)&&this.subunit.equals(rhs.subunit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.numberOfSubunits == rhs.numberOfSubunits)||((this.numberOfSubunits!= null)&&this.numberOfSubunits.equals(rhs.numberOfSubunits))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.sequenceType == rhs.sequenceType)||((this.sequenceType!= null)&&this.sequenceType.equals(rhs.sequenceType))));
    }

}
