
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
 * The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "subject",
    "disease",
    "diseaseStatus",
    "comorbidity",
    "therapeuticIndication",
    "otherTherapy",
    "population"
})
@Generated("jsonschema2pojo")
public class MedicinalProductContraindication
    extends DomainResource
{

    /**
     * This is a MedicinalProductContraindication resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductContraindication resource")
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
    @JsonProperty("disease")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept disease;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("diseaseStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept diseaseStatus;
    /**
     * A comorbidity (concurrent condition) or coinfection.
     * 
     */
    @JsonProperty("comorbidity")
    @JsonPropertyDescription("A comorbidity (concurrent condition) or coinfection.")
    private List<CodeableConcept> comorbidity = new ArrayList<CodeableConcept>();
    /**
     * Information about the use of the medicinal product in relation to other therapies as part of the indication.
     * 
     */
    @JsonProperty("therapeuticIndication")
    @JsonPropertyDescription("Information about the use of the medicinal product in relation to other therapies as part of the indication.")
    private List<Reference> therapeuticIndication = new ArrayList<Reference>();
    /**
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * 
     */
    @JsonProperty("otherTherapy")
    @JsonPropertyDescription("Information about the use of the medicinal product in relation to other therapies described as part of the indication.")
    private List<MedicinalProductContraindication_OtherTherapy> otherTherapy = new ArrayList<MedicinalProductContraindication_OtherTherapy>();
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
     * This is a MedicinalProductContraindication resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductContraindication resource
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
    @JsonProperty("disease")
    public CodeableConcept getDisease() {
        return disease;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("disease")
    public void setDisease(CodeableConcept disease) {
        this.disease = disease;
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
     * A comorbidity (concurrent condition) or coinfection.
     * 
     */
    @JsonProperty("comorbidity")
    public List<CodeableConcept> getComorbidity() {
        return comorbidity;
    }

    /**
     * A comorbidity (concurrent condition) or coinfection.
     * 
     */
    @JsonProperty("comorbidity")
    public void setComorbidity(List<CodeableConcept> comorbidity) {
        this.comorbidity = comorbidity;
    }

    /**
     * Information about the use of the medicinal product in relation to other therapies as part of the indication.
     * 
     */
    @JsonProperty("therapeuticIndication")
    public List<Reference> getTherapeuticIndication() {
        return therapeuticIndication;
    }

    /**
     * Information about the use of the medicinal product in relation to other therapies as part of the indication.
     * 
     */
    @JsonProperty("therapeuticIndication")
    public void setTherapeuticIndication(List<Reference> therapeuticIndication) {
        this.therapeuticIndication = therapeuticIndication;
    }

    /**
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * 
     */
    @JsonProperty("otherTherapy")
    public List<MedicinalProductContraindication_OtherTherapy> getOtherTherapy() {
        return otherTherapy;
    }

    /**
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * 
     */
    @JsonProperty("otherTherapy")
    public void setOtherTherapy(List<MedicinalProductContraindication_OtherTherapy> otherTherapy) {
        this.otherTherapy = otherTherapy;
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
        sb.append(MedicinalProductContraindication.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("disease");
        sb.append('=');
        sb.append(((this.disease == null)?"<null>":this.disease));
        sb.append(',');
        sb.append("diseaseStatus");
        sb.append('=');
        sb.append(((this.diseaseStatus == null)?"<null>":this.diseaseStatus));
        sb.append(',');
        sb.append("comorbidity");
        sb.append('=');
        sb.append(((this.comorbidity == null)?"<null>":this.comorbidity));
        sb.append(',');
        sb.append("therapeuticIndication");
        sb.append('=');
        sb.append(((this.therapeuticIndication == null)?"<null>":this.therapeuticIndication));
        sb.append(',');
        sb.append("otherTherapy");
        sb.append('=');
        sb.append(((this.otherTherapy == null)?"<null>":this.otherTherapy));
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
        result = ((result* 31)+((this.otherTherapy == null)? 0 :this.otherTherapy.hashCode()));
        result = ((result* 31)+((this.disease == null)? 0 :this.disease.hashCode()));
        result = ((result* 31)+((this.comorbidity == null)? 0 :this.comorbidity.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.therapeuticIndication == null)? 0 :this.therapeuticIndication.hashCode()));
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
        if ((other instanceof MedicinalProductContraindication) == false) {
            return false;
        }
        MedicinalProductContraindication rhs = ((MedicinalProductContraindication) other);
        return (((((((((super.equals(rhs)&&((this.diseaseStatus == rhs.diseaseStatus)||((this.diseaseStatus!= null)&&this.diseaseStatus.equals(rhs.diseaseStatus))))&&((this.otherTherapy == rhs.otherTherapy)||((this.otherTherapy!= null)&&this.otherTherapy.equals(rhs.otherTherapy))))&&((this.disease == rhs.disease)||((this.disease!= null)&&this.disease.equals(rhs.disease))))&&((this.comorbidity == rhs.comorbidity)||((this.comorbidity!= null)&&this.comorbidity.equals(rhs.comorbidity))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.therapeuticIndication == rhs.therapeuticIndication)||((this.therapeuticIndication!= null)&&this.therapeuticIndication.equals(rhs.therapeuticIndication))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.population == rhs.population)||((this.population!= null)&&this.population.equals(rhs.population))));
    }

}
