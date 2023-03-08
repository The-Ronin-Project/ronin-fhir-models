
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
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5&rsquo;-3&rsquo; direction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "sequenceType",
    "numberOfSubunits",
    "_numberOfSubunits",
    "areaOfHybridisation",
    "_areaOfHybridisation",
    "oligoNucleotideType",
    "subunit"
})
@Generated("jsonschema2pojo")
public class SubstanceNucleicAcid
    extends DomainResource
{

    /**
     * This is a SubstanceNucleicAcid resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SubstanceNucleicAcid resource")
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("areaOfHybridisation")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String areaOfHybridisation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_areaOfHybridisation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _areaOfHybridisation;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("oligoNucleotideType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept oligoNucleotideType;
    /**
     * Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight; subunits that have identical sequences will be repeated multiple times.
     * 
     */
    @JsonProperty("subunit")
    @JsonPropertyDescription("Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight; subunits that have identical sequences will be repeated multiple times.")
    private List<SubstanceNucleicAcid_Subunit> subunit = new ArrayList<SubstanceNucleicAcid_Subunit>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SubstanceNucleicAcid resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SubstanceNucleicAcid resource
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("areaOfHybridisation")
    public String getAreaOfHybridisation() {
        return areaOfHybridisation;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("areaOfHybridisation")
    public void setAreaOfHybridisation(String areaOfHybridisation) {
        this.areaOfHybridisation = areaOfHybridisation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_areaOfHybridisation")
    public Element get_areaOfHybridisation() {
        return _areaOfHybridisation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_areaOfHybridisation")
    public void set_areaOfHybridisation(Element _areaOfHybridisation) {
        this._areaOfHybridisation = _areaOfHybridisation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("oligoNucleotideType")
    public CodeableConcept getOligoNucleotideType() {
        return oligoNucleotideType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("oligoNucleotideType")
    public void setOligoNucleotideType(CodeableConcept oligoNucleotideType) {
        this.oligoNucleotideType = oligoNucleotideType;
    }

    /**
     * Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight; subunits that have identical sequences will be repeated multiple times.
     * 
     */
    @JsonProperty("subunit")
    public List<SubstanceNucleicAcid_Subunit> getSubunit() {
        return subunit;
    }

    /**
     * Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight; subunits that have identical sequences will be repeated multiple times.
     * 
     */
    @JsonProperty("subunit")
    public void setSubunit(List<SubstanceNucleicAcid_Subunit> subunit) {
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
        sb.append(SubstanceNucleicAcid.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("areaOfHybridisation");
        sb.append('=');
        sb.append(((this.areaOfHybridisation == null)?"<null>":this.areaOfHybridisation));
        sb.append(',');
        sb.append("_areaOfHybridisation");
        sb.append('=');
        sb.append(((this._areaOfHybridisation == null)?"<null>":this._areaOfHybridisation));
        sb.append(',');
        sb.append("oligoNucleotideType");
        sb.append('=');
        sb.append(((this.oligoNucleotideType == null)?"<null>":this.oligoNucleotideType));
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
        result = ((result* 31)+((this._numberOfSubunits == null)? 0 :this._numberOfSubunits.hashCode()));
        result = ((result* 31)+((this.oligoNucleotideType == null)? 0 :this.oligoNucleotideType.hashCode()));
        result = ((result* 31)+((this.subunit == null)? 0 :this.subunit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.numberOfSubunits == null)? 0 :this.numberOfSubunits.hashCode()));
        result = ((result* 31)+((this.areaOfHybridisation == null)? 0 :this.areaOfHybridisation.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.sequenceType == null)? 0 :this.sequenceType.hashCode()));
        result = ((result* 31)+((this._areaOfHybridisation == null)? 0 :this._areaOfHybridisation.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceNucleicAcid) == false) {
            return false;
        }
        SubstanceNucleicAcid rhs = ((SubstanceNucleicAcid) other);
        return (((((((((super.equals(rhs)&&((this._numberOfSubunits == rhs._numberOfSubunits)||((this._numberOfSubunits!= null)&&this._numberOfSubunits.equals(rhs._numberOfSubunits))))&&((this.oligoNucleotideType == rhs.oligoNucleotideType)||((this.oligoNucleotideType!= null)&&this.oligoNucleotideType.equals(rhs.oligoNucleotideType))))&&((this.subunit == rhs.subunit)||((this.subunit!= null)&&this.subunit.equals(rhs.subunit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.numberOfSubunits == rhs.numberOfSubunits)||((this.numberOfSubunits!= null)&&this.numberOfSubunits.equals(rhs.numberOfSubunits))))&&((this.areaOfHybridisation == rhs.areaOfHybridisation)||((this.areaOfHybridisation!= null)&&this.areaOfHybridisation.equals(rhs.areaOfHybridisation))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.sequenceType == rhs.sequenceType)||((this.sequenceType!= null)&&this.sequenceType.equals(rhs.sequenceType))))&&((this._areaOfHybridisation == rhs._areaOfHybridisation)||((this._areaOfHybridisation!= null)&&this._areaOfHybridisation.equals(rhs._areaOfHybridisation))));
    }

}
