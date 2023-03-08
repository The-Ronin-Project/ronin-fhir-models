
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
 * A container for slots of time that may be available for booking appointments.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "serviceCategory",
    "serviceType",
    "specialty",
    "actor",
    "planningHorizon",
    "comment",
    "_comment"
})
@Generated("jsonschema2pojo")
public class Schedule
    extends DomainResource
{

    /**
     * This is a Schedule resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Schedule resource")
    private String resourceType;
    /**
     * External Ids for this item.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("External Ids for this item.")
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
     * A broad categorization of the service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceCategory")
    @JsonPropertyDescription("A broad categorization of the service that is to be performed during this appointment.")
    private List<CodeableConcept> serviceCategory = new ArrayList<CodeableConcept>();
    /**
     * The specific service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("The specific service that is to be performed during this appointment.")
    private List<CodeableConcept> serviceType = new ArrayList<CodeableConcept>();
    /**
     * The specialty of a practitioner that would be required to perform the service requested in this appointment.
     * 
     */
    @JsonProperty("specialty")
    @JsonPropertyDescription("The specialty of a practitioner that would be required to perform the service requested in this appointment.")
    private List<CodeableConcept> specialty = new ArrayList<CodeableConcept>();
    /**
     * Slots that reference this schedule resource provide the availability details to these referenced resource(s).
     * (Required)
     * 
     */
    @JsonProperty("actor")
    @JsonPropertyDescription("Slots that reference this schedule resource provide the availability details to these referenced resource(s).")
    private List<Reference> actor = new ArrayList<Reference>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("planningHorizon")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period planningHorizon;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Schedule resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Schedule resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * External Ids for this item.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * External Ids for this item.
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
     * A broad categorization of the service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceCategory")
    public List<CodeableConcept> getServiceCategory() {
        return serviceCategory;
    }

    /**
     * A broad categorization of the service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceCategory")
    public void setServiceCategory(List<CodeableConcept> serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    /**
     * The specific service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceType")
    public List<CodeableConcept> getServiceType() {
        return serviceType;
    }

    /**
     * The specific service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(List<CodeableConcept> serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * The specialty of a practitioner that would be required to perform the service requested in this appointment.
     * 
     */
    @JsonProperty("specialty")
    public List<CodeableConcept> getSpecialty() {
        return specialty;
    }

    /**
     * The specialty of a practitioner that would be required to perform the service requested in this appointment.
     * 
     */
    @JsonProperty("specialty")
    public void setSpecialty(List<CodeableConcept> specialty) {
        this.specialty = specialty;
    }

    /**
     * Slots that reference this schedule resource provide the availability details to these referenced resource(s).
     * (Required)
     * 
     */
    @JsonProperty("actor")
    public List<Reference> getActor() {
        return actor;
    }

    /**
     * Slots that reference this schedule resource provide the availability details to these referenced resource(s).
     * (Required)
     * 
     */
    @JsonProperty("actor")
    public void setActor(List<Reference> actor) {
        this.actor = actor;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("planningHorizon")
    public Period getPlanningHorizon() {
        return planningHorizon;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("planningHorizon")
    public void setPlanningHorizon(Period planningHorizon) {
        this.planningHorizon = planningHorizon;
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
        sb.append(Schedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("serviceCategory");
        sb.append('=');
        sb.append(((this.serviceCategory == null)?"<null>":this.serviceCategory));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("specialty");
        sb.append('=');
        sb.append(((this.specialty == null)?"<null>":this.specialty));
        sb.append(',');
        sb.append("actor");
        sb.append('=');
        sb.append(((this.actor == null)?"<null>":this.actor));
        sb.append(',');
        sb.append("planningHorizon");
        sb.append('=');
        sb.append(((this.planningHorizon == null)?"<null>":this.planningHorizon));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.actor == null)? 0 :this.actor.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.specialty == null)? 0 :this.specialty.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.serviceCategory == null)? 0 :this.serviceCategory.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.planningHorizon == null)? 0 :this.planningHorizon.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schedule) == false) {
            return false;
        }
        Schedule rhs = ((Schedule) other);
        return ((((((((((((super.equals(rhs)&&((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType))))&&((this.actor == rhs.actor)||((this.actor!= null)&&this.actor.equals(rhs.actor))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.specialty == rhs.specialty)||((this.specialty!= null)&&this.specialty.equals(rhs.specialty))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.serviceCategory == rhs.serviceCategory)||((this.serviceCategory!= null)&&this.serviceCategory.equals(rhs.serviceCategory))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.planningHorizon == rhs.planningHorizon)||((this.planningHorizon!= null)&&this.planningHorizon.equals(rhs.planningHorizon))));
    }

}
