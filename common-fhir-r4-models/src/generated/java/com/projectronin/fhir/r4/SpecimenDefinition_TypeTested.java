
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A kind of specimen with associated set of requirements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "isDerived",
    "_isDerived",
    "type",
    "preference",
    "_preference",
    "container",
    "requirement",
    "_requirement",
    "retentionTime",
    "rejectionCriterion",
    "handling"
})
@Generated("jsonschema2pojo")
public class SpecimenDefinition_TypeTested {

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDerived")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean isDerived;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDerived")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isDerived;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * The preference for this type of conditioned specimen.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("The preference for this type of conditioned specimen.")
    private SpecimenDefinition_TypeTested.Preference preference;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preference")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _preference;
    /**
     * A kind of specimen with associated set of requirements.
     * 
     */
    @JsonProperty("container")
    @JsonPropertyDescription("A kind of specimen with associated set of requirements.")
    private SpecimenDefinition_Container container;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requirement")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String requirement;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirement")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requirement;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("retentionTime")
    @JsonPropertyDescription("A length of time.")
    private Duration retentionTime;
    /**
     * Criterion for rejection of the specimen in its container by the laboratory.
     * 
     */
    @JsonProperty("rejectionCriterion")
    @JsonPropertyDescription("Criterion for rejection of the specimen in its container by the laboratory.")
    private List<CodeableConcept> rejectionCriterion = new ArrayList<CodeableConcept>();
    /**
     * Set of instructions for preservation/transport of the specimen at a defined temperature interval, prior the testing process.
     * 
     */
    @JsonProperty("handling")
    @JsonPropertyDescription("Set of instructions for preservation/transport of the specimen at a defined temperature interval, prior the testing process.")
    private List<SpecimenDefinition_Handling> handling = new ArrayList<SpecimenDefinition_Handling>();

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDerived")
    public Boolean getIsDerived() {
        return isDerived;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDerived")
    public void setIsDerived(Boolean isDerived) {
        this.isDerived = isDerived;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDerived")
    public Element get_isDerived() {
        return _isDerived;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDerived")
    public void set_isDerived(Element _isDerived) {
        this._isDerived = _isDerived;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * The preference for this type of conditioned specimen.
     * 
     */
    @JsonProperty("preference")
    public SpecimenDefinition_TypeTested.Preference getPreference() {
        return preference;
    }

    /**
     * The preference for this type of conditioned specimen.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(SpecimenDefinition_TypeTested.Preference preference) {
        this.preference = preference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preference")
    public Element get_preference() {
        return _preference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preference")
    public void set_preference(Element _preference) {
        this._preference = _preference;
    }

    /**
     * A kind of specimen with associated set of requirements.
     * 
     */
    @JsonProperty("container")
    public SpecimenDefinition_Container getContainer() {
        return container;
    }

    /**
     * A kind of specimen with associated set of requirements.
     * 
     */
    @JsonProperty("container")
    public void setContainer(SpecimenDefinition_Container container) {
        this.container = container;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requirement")
    public String getRequirement() {
        return requirement;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requirement")
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirement")
    public Element get_requirement() {
        return _requirement;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirement")
    public void set_requirement(Element _requirement) {
        this._requirement = _requirement;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("retentionTime")
    public Duration getRetentionTime() {
        return retentionTime;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("retentionTime")
    public void setRetentionTime(Duration retentionTime) {
        this.retentionTime = retentionTime;
    }

    /**
     * Criterion for rejection of the specimen in its container by the laboratory.
     * 
     */
    @JsonProperty("rejectionCriterion")
    public List<CodeableConcept> getRejectionCriterion() {
        return rejectionCriterion;
    }

    /**
     * Criterion for rejection of the specimen in its container by the laboratory.
     * 
     */
    @JsonProperty("rejectionCriterion")
    public void setRejectionCriterion(List<CodeableConcept> rejectionCriterion) {
        this.rejectionCriterion = rejectionCriterion;
    }

    /**
     * Set of instructions for preservation/transport of the specimen at a defined temperature interval, prior the testing process.
     * 
     */
    @JsonProperty("handling")
    public List<SpecimenDefinition_Handling> getHandling() {
        return handling;
    }

    /**
     * Set of instructions for preservation/transport of the specimen at a defined temperature interval, prior the testing process.
     * 
     */
    @JsonProperty("handling")
    public void setHandling(List<SpecimenDefinition_Handling> handling) {
        this.handling = handling;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpecimenDefinition_TypeTested.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("isDerived");
        sb.append('=');
        sb.append(((this.isDerived == null)?"<null>":this.isDerived));
        sb.append(',');
        sb.append("_isDerived");
        sb.append('=');
        sb.append(((this._isDerived == null)?"<null>":this._isDerived));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("_preference");
        sb.append('=');
        sb.append(((this._preference == null)?"<null>":this._preference));
        sb.append(',');
        sb.append("container");
        sb.append('=');
        sb.append(((this.container == null)?"<null>":this.container));
        sb.append(',');
        sb.append("requirement");
        sb.append('=');
        sb.append(((this.requirement == null)?"<null>":this.requirement));
        sb.append(',');
        sb.append("_requirement");
        sb.append('=');
        sb.append(((this._requirement == null)?"<null>":this._requirement));
        sb.append(',');
        sb.append("retentionTime");
        sb.append('=');
        sb.append(((this.retentionTime == null)?"<null>":this.retentionTime));
        sb.append(',');
        sb.append("rejectionCriterion");
        sb.append('=');
        sb.append(((this.rejectionCriterion == null)?"<null>":this.rejectionCriterion));
        sb.append(',');
        sb.append("handling");
        sb.append('=');
        sb.append(((this.handling == null)?"<null>":this.handling));
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
        result = ((result* 31)+((this.container == null)? 0 :this.container.hashCode()));
        result = ((result* 31)+((this._preference == null)? 0 :this._preference.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.isDerived == null)? 0 :this.isDerived.hashCode()));
        result = ((result* 31)+((this._isDerived == null)? 0 :this._isDerived.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.rejectionCriterion == null)? 0 :this.rejectionCriterion.hashCode()));
        result = ((result* 31)+((this.requirement == null)? 0 :this.requirement.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.retentionTime == null)? 0 :this.retentionTime.hashCode()));
        result = ((result* 31)+((this._requirement == null)? 0 :this._requirement.hashCode()));
        result = ((result* 31)+((this.handling == null)? 0 :this.handling.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecimenDefinition_TypeTested) == false) {
            return false;
        }
        SpecimenDefinition_TypeTested rhs = ((SpecimenDefinition_TypeTested) other);
        return (((((((((((((((this.container == rhs.container)||((this.container!= null)&&this.container.equals(rhs.container)))&&((this._preference == rhs._preference)||((this._preference!= null)&&this._preference.equals(rhs._preference))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.isDerived == rhs.isDerived)||((this.isDerived!= null)&&this.isDerived.equals(rhs.isDerived))))&&((this._isDerived == rhs._isDerived)||((this._isDerived!= null)&&this._isDerived.equals(rhs._isDerived))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.rejectionCriterion == rhs.rejectionCriterion)||((this.rejectionCriterion!= null)&&this.rejectionCriterion.equals(rhs.rejectionCriterion))))&&((this.requirement == rhs.requirement)||((this.requirement!= null)&&this.requirement.equals(rhs.requirement))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.retentionTime == rhs.retentionTime)||((this.retentionTime!= null)&&this.retentionTime.equals(rhs.retentionTime))))&&((this._requirement == rhs._requirement)||((this._requirement!= null)&&this._requirement.equals(rhs._requirement))))&&((this.handling == rhs.handling)||((this.handling!= null)&&this.handling.equals(rhs.handling))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }


    /**
     * The preference for this type of conditioned specimen.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Preference {

        PREFERRED("preferred"),
        ALTERNATE("alternate");
        private final String value;
        private final static Map<String, SpecimenDefinition_TypeTested.Preference> CONSTANTS = new HashMap<String, SpecimenDefinition_TypeTested.Preference>();

        static {
            for (SpecimenDefinition_TypeTested.Preference c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Preference(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SpecimenDefinition_TypeTested.Preference fromValue(String value) {
            SpecimenDefinition_TypeTested.Preference constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
