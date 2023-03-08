
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
 * Describe the undesirable effects of the medicinal product.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "subject",
    "symptomConditionEffect",
    "classification",
    "frequencyOfOccurrence",
    "population"
})
@Generated("jsonschema2pojo")
public class MedicinalProductUndesirableEffect
    extends DomainResource
{

    /**
     * This is a MedicinalProductUndesirableEffect resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductUndesirableEffect resource")
    private String resourceType;
    /**
     * The medication for which this is an indication.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The medication for which this is an indication.")
    private List<Reference> subject = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("symptomConditionEffect")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept symptomConditionEffect;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept classification;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("frequencyOfOccurrence")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept frequencyOfOccurrence;
    /**
     * The population group to which this applies.
     * 
     */
    @JsonProperty("population")
    @JsonPropertyDescription("The population group to which this applies.")
    private List<Population> population = new ArrayList<Population>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicinalProductUndesirableEffect resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductUndesirableEffect resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The medication for which this is an indication.
     * 
     */
    @JsonProperty("subject")
    public List<Reference> getSubject() {
        return subject;
    }

    /**
     * The medication for which this is an indication.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(List<Reference> subject) {
        this.subject = subject;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("symptomConditionEffect")
    public CodeableConcept getSymptomConditionEffect() {
        return symptomConditionEffect;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("symptomConditionEffect")
    public void setSymptomConditionEffect(CodeableConcept symptomConditionEffect) {
        this.symptomConditionEffect = symptomConditionEffect;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("classification")
    public CodeableConcept getClassification() {
        return classification;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("classification")
    public void setClassification(CodeableConcept classification) {
        this.classification = classification;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("frequencyOfOccurrence")
    public CodeableConcept getFrequencyOfOccurrence() {
        return frequencyOfOccurrence;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("frequencyOfOccurrence")
    public void setFrequencyOfOccurrence(CodeableConcept frequencyOfOccurrence) {
        this.frequencyOfOccurrence = frequencyOfOccurrence;
    }

    /**
     * The population group to which this applies.
     * 
     */
    @JsonProperty("population")
    public List<Population> getPopulation() {
        return population;
    }

    /**
     * The population group to which this applies.
     * 
     */
    @JsonProperty("population")
    public void setPopulation(List<Population> population) {
        this.population = population;
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
        sb.append(MedicinalProductUndesirableEffect.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("symptomConditionEffect");
        sb.append('=');
        sb.append(((this.symptomConditionEffect == null)?"<null>":this.symptomConditionEffect));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("frequencyOfOccurrence");
        sb.append('=');
        sb.append(((this.frequencyOfOccurrence == null)?"<null>":this.frequencyOfOccurrence));
        sb.append(',');
        sb.append("population");
        sb.append('=');
        sb.append(((this.population == null)?"<null>":this.population));
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
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.symptomConditionEffect == null)? 0 :this.symptomConditionEffect.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.frequencyOfOccurrence == null)? 0 :this.frequencyOfOccurrence.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.population == null)? 0 :this.population.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductUndesirableEffect) == false) {
            return false;
        }
        MedicinalProductUndesirableEffect rhs = ((MedicinalProductUndesirableEffect) other);
        return (((((((super.equals(rhs)&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.symptomConditionEffect == rhs.symptomConditionEffect)||((this.symptomConditionEffect!= null)&&this.symptomConditionEffect.equals(rhs.symptomConditionEffect))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this.frequencyOfOccurrence == rhs.frequencyOfOccurrence)||((this.frequencyOfOccurrence!= null)&&this.frequencyOfOccurrence.equals(rhs.frequencyOfOccurrence))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.population == rhs.population)||((this.population!= null)&&this.population.equals(rhs.population))));
    }

}
