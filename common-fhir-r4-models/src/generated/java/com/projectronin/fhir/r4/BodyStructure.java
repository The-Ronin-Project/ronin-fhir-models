
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
 * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "morphology",
    "location",
    "locationQualifier",
    "description",
    "_description",
    "image",
    "patient"
})
@Generated("jsonschema2pojo")
public class BodyStructure
    extends DomainResource
{

    /**
     * This is a BodyStructure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a BodyStructure resource")
    private String resourceType;
    /**
     * Identifier for this instance of the anatomical structure.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier for this instance of the anatomical structure.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean active;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _active;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("morphology")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept morphology;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept location;
    /**
     * Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
     * 
     */
    @JsonProperty("locationQualifier")
    @JsonPropertyDescription("Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.")
    private List<CodeableConcept> locationQualifier = new ArrayList<CodeableConcept>();
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
     * Image or images used to identify a location.
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Image or images used to identify a location.")
    private List<Attachment> image = new ArrayList<Attachment>();
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a BodyStructure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a BodyStructure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifier for this instance of the anatomical structure.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifier for this instance of the anatomical structure.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    public Element get_active() {
        return _active;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    public void set_active(Element _active) {
        this._active = _active;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("morphology")
    public CodeableConcept getMorphology() {
        return morphology;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("morphology")
    public void setMorphology(CodeableConcept morphology) {
        this.morphology = morphology;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("location")
    public CodeableConcept getLocation() {
        return location;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("location")
    public void setLocation(CodeableConcept location) {
        this.location = location;
    }

    /**
     * Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
     * 
     */
    @JsonProperty("locationQualifier")
    public List<CodeableConcept> getLocationQualifier() {
        return locationQualifier;
    }

    /**
     * Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
     * 
     */
    @JsonProperty("locationQualifier")
    public void setLocationQualifier(List<CodeableConcept> locationQualifier) {
        this.locationQualifier = locationQualifier;
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
     * Image or images used to identify a location.
     * 
     */
    @JsonProperty("image")
    public List<Attachment> getImage() {
        return image;
    }

    /**
     * Image or images used to identify a location.
     * 
     */
    @JsonProperty("image")
    public void setImage(List<Attachment> image) {
        this.image = image;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
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
        sb.append(BodyStructure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("_active");
        sb.append('=');
        sb.append(((this._active == null)?"<null>":this._active));
        sb.append(',');
        sb.append("morphology");
        sb.append('=');
        sb.append(((this.morphology == null)?"<null>":this.morphology));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("locationQualifier");
        sb.append('=');
        sb.append(((this.locationQualifier == null)?"<null>":this.locationQualifier));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.morphology == null)? 0 :this.morphology.hashCode()));
        result = ((result* 31)+((this.locationQualifier == null)? 0 :this.locationQualifier.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BodyStructure) == false) {
            return false;
        }
        BodyStructure rhs = ((BodyStructure) other);
        return ((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.morphology == rhs.morphology)||((this.morphology!= null)&&this.morphology.equals(rhs.morphology))))&&((this.locationQualifier == rhs.locationQualifier)||((this.locationQualifier!= null)&&this.locationQualifier.equals(rhs.locationQualifier))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
