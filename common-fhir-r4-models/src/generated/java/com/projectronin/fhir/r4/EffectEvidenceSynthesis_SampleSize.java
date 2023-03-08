
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "description",
    "_description",
    "numberOfStudies",
    "_numberOfStudies",
    "numberOfParticipants",
    "_numberOfParticipants"
})
@Generated("jsonschema2pojo")
public class EffectEvidenceSynthesis_SampleSize {

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String id;
    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
    private List<Extension> extension = new ArrayList<Extension>();
    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).")
    private List<Extension> modifierExtension = new ArrayList<Extension>();
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
     * A whole number
     * 
     */
    @JsonProperty("numberOfStudies")
    @JsonPropertyDescription("A whole number")
    private Double numberOfStudies;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfStudies")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfStudies;
    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfParticipants")
    @JsonPropertyDescription("A whole number")
    private Double numberOfParticipants;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfParticipants")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfParticipants;

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public List<Extension> getExtension() {
        return extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public List<Extension> getModifierExtension() {
        return modifierExtension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public void setModifierExtension(List<Extension> modifierExtension) {
        this.modifierExtension = modifierExtension;
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
     * A whole number
     * 
     */
    @JsonProperty("numberOfStudies")
    public Double getNumberOfStudies() {
        return numberOfStudies;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfStudies")
    public void setNumberOfStudies(Double numberOfStudies) {
        this.numberOfStudies = numberOfStudies;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfStudies")
    public Element get_numberOfStudies() {
        return _numberOfStudies;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfStudies")
    public void set_numberOfStudies(Element _numberOfStudies) {
        this._numberOfStudies = _numberOfStudies;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfParticipants")
    public Double getNumberOfParticipants() {
        return numberOfParticipants;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("numberOfParticipants")
    public void setNumberOfParticipants(Double numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfParticipants")
    public Element get_numberOfParticipants() {
        return _numberOfParticipants;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfParticipants")
    public void set_numberOfParticipants(Element _numberOfParticipants) {
        this._numberOfParticipants = _numberOfParticipants;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EffectEvidenceSynthesis_SampleSize.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("modifierExtension");
        sb.append('=');
        sb.append(((this.modifierExtension == null)?"<null>":this.modifierExtension));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("numberOfStudies");
        sb.append('=');
        sb.append(((this.numberOfStudies == null)?"<null>":this.numberOfStudies));
        sb.append(',');
        sb.append("_numberOfStudies");
        sb.append('=');
        sb.append(((this._numberOfStudies == null)?"<null>":this._numberOfStudies));
        sb.append(',');
        sb.append("numberOfParticipants");
        sb.append('=');
        sb.append(((this.numberOfParticipants == null)?"<null>":this.numberOfParticipants));
        sb.append(',');
        sb.append("_numberOfParticipants");
        sb.append('=');
        sb.append(((this._numberOfParticipants == null)?"<null>":this._numberOfParticipants));
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
        result = ((result* 31)+((this.numberOfParticipants == null)? 0 :this.numberOfParticipants.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._numberOfStudies == null)? 0 :this._numberOfStudies.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.numberOfStudies == null)? 0 :this.numberOfStudies.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._numberOfParticipants == null)? 0 :this._numberOfParticipants.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EffectEvidenceSynthesis_SampleSize) == false) {
            return false;
        }
        EffectEvidenceSynthesis_SampleSize rhs = ((EffectEvidenceSynthesis_SampleSize) other);
        return ((((((((((this.numberOfParticipants == rhs.numberOfParticipants)||((this.numberOfParticipants!= null)&&this.numberOfParticipants.equals(rhs.numberOfParticipants)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._numberOfStudies == rhs._numberOfStudies)||((this._numberOfStudies!= null)&&this._numberOfStudies.equals(rhs._numberOfStudies))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.numberOfStudies == rhs.numberOfStudies)||((this.numberOfStudies!= null)&&this.numberOfStudies.equals(rhs.numberOfStudies))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._numberOfParticipants == rhs._numberOfParticipants)||((this._numberOfParticipants!= null)&&this._numberOfParticipants.equals(rhs._numberOfParticipants))));
    }

}
