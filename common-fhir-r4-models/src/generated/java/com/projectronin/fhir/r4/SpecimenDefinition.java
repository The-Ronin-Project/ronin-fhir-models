
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
 * A kind of specimen with associated set of requirements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "typeCollected",
    "patientPreparation",
    "timeAspect",
    "_timeAspect",
    "collection",
    "typeTested"
})
@Generated("jsonschema2pojo")
public class SpecimenDefinition
    extends DomainResource
{

    /**
     * This is a SpecimenDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SpecimenDefinition resource")
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
    @JsonProperty("typeCollected")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept typeCollected;
    /**
     * Preparation of the patient for specimen collection.
     * 
     */
    @JsonProperty("patientPreparation")
    @JsonPropertyDescription("Preparation of the patient for specimen collection.")
    private List<CodeableConcept> patientPreparation = new ArrayList<CodeableConcept>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("timeAspect")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String timeAspect;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timeAspect")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timeAspect;
    /**
     * The action to be performed for collecting the specimen.
     * 
     */
    @JsonProperty("collection")
    @JsonPropertyDescription("The action to be performed for collecting the specimen.")
    private List<CodeableConcept> collection = new ArrayList<CodeableConcept>();
    /**
     * Specimen conditioned in a container as expected by the testing laboratory.
     * 
     */
    @JsonProperty("typeTested")
    @JsonPropertyDescription("Specimen conditioned in a container as expected by the testing laboratory.")
    private List<SpecimenDefinition_TypeTested> typeTested = new ArrayList<SpecimenDefinition_TypeTested>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SpecimenDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SpecimenDefinition resource
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
    @JsonProperty("typeCollected")
    public CodeableConcept getTypeCollected() {
        return typeCollected;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("typeCollected")
    public void setTypeCollected(CodeableConcept typeCollected) {
        this.typeCollected = typeCollected;
    }

    /**
     * Preparation of the patient for specimen collection.
     * 
     */
    @JsonProperty("patientPreparation")
    public List<CodeableConcept> getPatientPreparation() {
        return patientPreparation;
    }

    /**
     * Preparation of the patient for specimen collection.
     * 
     */
    @JsonProperty("patientPreparation")
    public void setPatientPreparation(List<CodeableConcept> patientPreparation) {
        this.patientPreparation = patientPreparation;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("timeAspect")
    public String getTimeAspect() {
        return timeAspect;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("timeAspect")
    public void setTimeAspect(String timeAspect) {
        this.timeAspect = timeAspect;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timeAspect")
    public Element get_timeAspect() {
        return _timeAspect;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timeAspect")
    public void set_timeAspect(Element _timeAspect) {
        this._timeAspect = _timeAspect;
    }

    /**
     * The action to be performed for collecting the specimen.
     * 
     */
    @JsonProperty("collection")
    public List<CodeableConcept> getCollection() {
        return collection;
    }

    /**
     * The action to be performed for collecting the specimen.
     * 
     */
    @JsonProperty("collection")
    public void setCollection(List<CodeableConcept> collection) {
        this.collection = collection;
    }

    /**
     * Specimen conditioned in a container as expected by the testing laboratory.
     * 
     */
    @JsonProperty("typeTested")
    public List<SpecimenDefinition_TypeTested> getTypeTested() {
        return typeTested;
    }

    /**
     * Specimen conditioned in a container as expected by the testing laboratory.
     * 
     */
    @JsonProperty("typeTested")
    public void setTypeTested(List<SpecimenDefinition_TypeTested> typeTested) {
        this.typeTested = typeTested;
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
        sb.append(SpecimenDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("typeCollected");
        sb.append('=');
        sb.append(((this.typeCollected == null)?"<null>":this.typeCollected));
        sb.append(',');
        sb.append("patientPreparation");
        sb.append('=');
        sb.append(((this.patientPreparation == null)?"<null>":this.patientPreparation));
        sb.append(',');
        sb.append("timeAspect");
        sb.append('=');
        sb.append(((this.timeAspect == null)?"<null>":this.timeAspect));
        sb.append(',');
        sb.append("_timeAspect");
        sb.append('=');
        sb.append(((this._timeAspect == null)?"<null>":this._timeAspect));
        sb.append(',');
        sb.append("collection");
        sb.append('=');
        sb.append(((this.collection == null)?"<null>":this.collection));
        sb.append(',');
        sb.append("typeTested");
        sb.append('=');
        sb.append(((this.typeTested == null)?"<null>":this.typeTested));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._timeAspect == null)? 0 :this._timeAspect.hashCode()));
        result = ((result* 31)+((this.patientPreparation == null)? 0 :this.patientPreparation.hashCode()));
        result = ((result* 31)+((this.timeAspect == null)? 0 :this.timeAspect.hashCode()));
        result = ((result* 31)+((this.collection == null)? 0 :this.collection.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.typeCollected == null)? 0 :this.typeCollected.hashCode()));
        result = ((result* 31)+((this.typeTested == null)? 0 :this.typeTested.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecimenDefinition) == false) {
            return false;
        }
        SpecimenDefinition rhs = ((SpecimenDefinition) other);
        return (((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._timeAspect == rhs._timeAspect)||((this._timeAspect!= null)&&this._timeAspect.equals(rhs._timeAspect))))&&((this.patientPreparation == rhs.patientPreparation)||((this.patientPreparation!= null)&&this.patientPreparation.equals(rhs.patientPreparation))))&&((this.timeAspect == rhs.timeAspect)||((this.timeAspect!= null)&&this.timeAspect.equals(rhs.timeAspect))))&&((this.collection == rhs.collection)||((this.collection!= null)&&this.collection.equals(rhs.collection))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.typeCollected == rhs.typeCollected)||((this.typeCollected!= null)&&this.typeCollected.equals(rhs.typeCollected))))&&((this.typeTested == rhs.typeTested)||((this.typeTested!= null)&&this.typeTested.equals(rhs.typeTested))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
