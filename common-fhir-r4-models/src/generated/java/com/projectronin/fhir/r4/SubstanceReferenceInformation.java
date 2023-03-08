
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
 * Todo.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "comment",
    "_comment",
    "gene",
    "geneElement",
    "classification",
    "target"
})
@Generated("jsonschema2pojo")
public class SubstanceReferenceInformation
    extends DomainResource
{

    /**
     * This is a SubstanceReferenceInformation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SubstanceReferenceInformation resource")
    private String resourceType;
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
     * Todo.
     * 
     */
    @JsonProperty("gene")
    @JsonPropertyDescription("Todo.")
    private List<SubstanceReferenceInformation_Gene> gene = new ArrayList<SubstanceReferenceInformation_Gene>();
    /**
     * Todo.
     * 
     */
    @JsonProperty("geneElement")
    @JsonPropertyDescription("Todo.")
    private List<SubstanceReferenceInformation_GeneElement> geneElement = new ArrayList<SubstanceReferenceInformation_GeneElement>();
    /**
     * Todo.
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("Todo.")
    private List<SubstanceReferenceInformation_Classification> classification = new ArrayList<SubstanceReferenceInformation_Classification>();
    /**
     * Todo.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Todo.")
    private List<SubstanceReferenceInformation_Target> target = new ArrayList<SubstanceReferenceInformation_Target>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SubstanceReferenceInformation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SubstanceReferenceInformation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
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
     * Todo.
     * 
     */
    @JsonProperty("gene")
    public List<SubstanceReferenceInformation_Gene> getGene() {
        return gene;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("gene")
    public void setGene(List<SubstanceReferenceInformation_Gene> gene) {
        this.gene = gene;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("geneElement")
    public List<SubstanceReferenceInformation_GeneElement> getGeneElement() {
        return geneElement;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("geneElement")
    public void setGeneElement(List<SubstanceReferenceInformation_GeneElement> geneElement) {
        this.geneElement = geneElement;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("classification")
    public List<SubstanceReferenceInformation_Classification> getClassification() {
        return classification;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("classification")
    public void setClassification(List<SubstanceReferenceInformation_Classification> classification) {
        this.classification = classification;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("target")
    public List<SubstanceReferenceInformation_Target> getTarget() {
        return target;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("target")
    public void setTarget(List<SubstanceReferenceInformation_Target> target) {
        this.target = target;
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
        sb.append(SubstanceReferenceInformation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
        sb.append(',');
        sb.append("gene");
        sb.append('=');
        sb.append(((this.gene == null)?"<null>":this.gene));
        sb.append(',');
        sb.append("geneElement");
        sb.append('=');
        sb.append(((this.geneElement == null)?"<null>":this.geneElement));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
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
        result = ((result* 31)+((this.geneElement == null)? 0 :this.geneElement.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this.gene == null)? 0 :this.gene.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceReferenceInformation) == false) {
            return false;
        }
        SubstanceReferenceInformation rhs = ((SubstanceReferenceInformation) other);
        return ((((((((super.equals(rhs)&&((this.geneElement == rhs.geneElement)||((this.geneElement!= null)&&this.geneElement.equals(rhs.geneElement))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this.gene == rhs.gene)||((this.gene!= null)&&this.gene.equals(rhs.gene))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }

}
