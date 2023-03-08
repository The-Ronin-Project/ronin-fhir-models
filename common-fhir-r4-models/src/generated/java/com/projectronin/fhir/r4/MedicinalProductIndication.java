
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
 * Indication for the Medicinal Product.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "subject",
    "diseaseSymptomProcedure",
    "diseaseStatus",
    "comorbidity",
    "intendedEffect",
    "duration",
    "otherTherapy",
    "undesirableEffect",
    "population"
})
@Generated("jsonschema2pojo")
public class MedicinalProductIndication
    extends DomainResource
{

    /**
     * This is a MedicinalProductIndication resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductIndication resource")
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
    @JsonProperty("diseaseSymptomProcedure")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept diseaseSymptomProcedure;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("diseaseStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept diseaseStatus;
    /**
     * Comorbidity (concurrent condition) or co-infection as part of the indication.
     * 
     */
    @JsonProperty("comorbidity")
    @JsonPropertyDescription("Comorbidity (concurrent condition) or co-infection as part of the indication.")
    private List<CodeableConcept> comorbidity = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("intendedEffect")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept intendedEffect;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity duration;
    /**
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * 
     */
    @JsonProperty("otherTherapy")
    @JsonPropertyDescription("Information about the use of the medicinal product in relation to other therapies described as part of the indication.")
    private List<MedicinalProductIndication_OtherTherapy> otherTherapy = new ArrayList<MedicinalProductIndication_OtherTherapy>();
    /**
     * Describe the undesirable effects of the medicinal product.
     * 
     */
    @JsonProperty("undesirableEffect")
    @JsonPropertyDescription("Describe the undesirable effects of the medicinal product.")
    private List<Reference> undesirableEffect = new ArrayList<Reference>();
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
     * This is a MedicinalProductIndication resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductIndication resource
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
    @JsonProperty("diseaseSymptomProcedure")
    public CodeableConcept getDiseaseSymptomProcedure() {
        return diseaseSymptomProcedure;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("diseaseSymptomProcedure")
    public void setDiseaseSymptomProcedure(CodeableConcept diseaseSymptomProcedure) {
        this.diseaseSymptomProcedure = diseaseSymptomProcedure;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("diseaseStatus")
    public CodeableConcept getDiseaseStatus() {
        return diseaseStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("diseaseStatus")
    public void setDiseaseStatus(CodeableConcept diseaseStatus) {
        this.diseaseStatus = diseaseStatus;
    }

    /**
     * Comorbidity (concurrent condition) or co-infection as part of the indication.
     * 
     */
    @JsonProperty("comorbidity")
    public List<CodeableConcept> getComorbidity() {
        return comorbidity;
    }

    /**
     * Comorbidity (concurrent condition) or co-infection as part of the indication.
     * 
     */
    @JsonProperty("comorbidity")
    public void setComorbidity(List<CodeableConcept> comorbidity) {
        this.comorbidity = comorbidity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("intendedEffect")
    public CodeableConcept getIntendedEffect() {
        return intendedEffect;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("intendedEffect")
    public void setIntendedEffect(CodeableConcept intendedEffect) {
        this.intendedEffect = intendedEffect;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("duration")
    public Quantity getDuration() {
        return duration;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Quantity duration) {
        this.duration = duration;
    }

    /**
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * 
     */
    @JsonProperty("otherTherapy")
    public List<MedicinalProductIndication_OtherTherapy> getOtherTherapy() {
        return otherTherapy;
    }

    /**
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * 
     */
    @JsonProperty("otherTherapy")
    public void setOtherTherapy(List<MedicinalProductIndication_OtherTherapy> otherTherapy) {
        this.otherTherapy = otherTherapy;
    }

    /**
     * Describe the undesirable effects of the medicinal product.
     * 
     */
    @JsonProperty("undesirableEffect")
    public List<Reference> getUndesirableEffect() {
        return undesirableEffect;
    }

    /**
     * Describe the undesirable effects of the medicinal product.
     * 
     */
    @JsonProperty("undesirableEffect")
    public void setUndesirableEffect(List<Reference> undesirableEffect) {
        this.undesirableEffect = undesirableEffect;
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
        sb.append(MedicinalProductIndication.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("diseaseSymptomProcedure");
        sb.append('=');
        sb.append(((this.diseaseSymptomProcedure == null)?"<null>":this.diseaseSymptomProcedure));
        sb.append(',');
        sb.append("diseaseStatus");
        sb.append('=');
        sb.append(((this.diseaseStatus == null)?"<null>":this.diseaseStatus));
        sb.append(',');
        sb.append("comorbidity");
        sb.append('=');
        sb.append(((this.comorbidity == null)?"<null>":this.comorbidity));
        sb.append(',');
        sb.append("intendedEffect");
        sb.append('=');
        sb.append(((this.intendedEffect == null)?"<null>":this.intendedEffect));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("otherTherapy");
        sb.append('=');
        sb.append(((this.otherTherapy == null)?"<null>":this.otherTherapy));
        sb.append(',');
        sb.append("undesirableEffect");
        sb.append('=');
        sb.append(((this.undesirableEffect == null)?"<null>":this.undesirableEffect));
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
        result = ((result* 31)+((this.diseaseStatus == null)? 0 :this.diseaseStatus.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.undesirableEffect == null)? 0 :this.undesirableEffect.hashCode()));
        result = ((result* 31)+((this.otherTherapy == null)? 0 :this.otherTherapy.hashCode()));
        result = ((result* 31)+((this.comorbidity == null)? 0 :this.comorbidity.hashCode()));
        result = ((result* 31)+((this.intendedEffect == null)? 0 :this.intendedEffect.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.diseaseSymptomProcedure == null)? 0 :this.diseaseSymptomProcedure.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof MedicinalProductIndication) == false) {
            return false;
        }
        MedicinalProductIndication rhs = ((MedicinalProductIndication) other);
        return (((((((((((super.equals(rhs)&&((this.diseaseStatus == rhs.diseaseStatus)||((this.diseaseStatus!= null)&&this.diseaseStatus.equals(rhs.diseaseStatus))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.undesirableEffect == rhs.undesirableEffect)||((this.undesirableEffect!= null)&&this.undesirableEffect.equals(rhs.undesirableEffect))))&&((this.otherTherapy == rhs.otherTherapy)||((this.otherTherapy!= null)&&this.otherTherapy.equals(rhs.otherTherapy))))&&((this.comorbidity == rhs.comorbidity)||((this.comorbidity!= null)&&this.comorbidity.equals(rhs.comorbidity))))&&((this.intendedEffect == rhs.intendedEffect)||((this.intendedEffect!= null)&&this.intendedEffect.equals(rhs.intendedEffect))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.diseaseSymptomProcedure == rhs.diseaseSymptomProcedure)||((this.diseaseSymptomProcedure!= null)&&this.diseaseSymptomProcedure.equals(rhs.diseaseSymptomProcedure))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.population == rhs.population)||((this.population!= null)&&this.population.equals(rhs.population))));
    }

}
