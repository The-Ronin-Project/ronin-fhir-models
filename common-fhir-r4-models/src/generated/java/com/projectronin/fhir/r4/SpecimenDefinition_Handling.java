
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
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
    "id",
    "extension",
    "modifierExtension",
    "temperatureQualifier",
    "temperatureRange",
    "maxDuration",
    "instruction",
    "_instruction"
})
@Generated("jsonschema2pojo")
public class SpecimenDefinition_Handling {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("temperatureQualifier")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept temperatureQualifier;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("temperatureRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range temperatureRange;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("maxDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration maxDuration;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("instruction")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String instruction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instruction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _instruction;

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("temperatureQualifier")
    public CodeableConcept getTemperatureQualifier() {
        return temperatureQualifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("temperatureQualifier")
    public void setTemperatureQualifier(CodeableConcept temperatureQualifier) {
        this.temperatureQualifier = temperatureQualifier;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("temperatureRange")
    public Range getTemperatureRange() {
        return temperatureRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("temperatureRange")
    public void setTemperatureRange(Range temperatureRange) {
        this.temperatureRange = temperatureRange;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("maxDuration")
    public Duration getMaxDuration() {
        return maxDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("maxDuration")
    public void setMaxDuration(Duration maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("instruction")
    public String getInstruction() {
        return instruction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("instruction")
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instruction")
    public Element get_instruction() {
        return _instruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instruction")
    public void set_instruction(Element _instruction) {
        this._instruction = _instruction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpecimenDefinition_Handling.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("temperatureQualifier");
        sb.append('=');
        sb.append(((this.temperatureQualifier == null)?"<null>":this.temperatureQualifier));
        sb.append(',');
        sb.append("temperatureRange");
        sb.append('=');
        sb.append(((this.temperatureRange == null)?"<null>":this.temperatureRange));
        sb.append(',');
        sb.append("maxDuration");
        sb.append('=');
        sb.append(((this.maxDuration == null)?"<null>":this.maxDuration));
        sb.append(',');
        sb.append("instruction");
        sb.append('=');
        sb.append(((this.instruction == null)?"<null>":this.instruction));
        sb.append(',');
        sb.append("_instruction");
        sb.append('=');
        sb.append(((this._instruction == null)?"<null>":this._instruction));
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
        result = ((result* 31)+((this.temperatureRange == null)? 0 :this.temperatureRange.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.instruction == null)? 0 :this.instruction.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._instruction == null)? 0 :this._instruction.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.temperatureQualifier == null)? 0 :this.temperatureQualifier.hashCode()));
        result = ((result* 31)+((this.maxDuration == null)? 0 :this.maxDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecimenDefinition_Handling) == false) {
            return false;
        }
        SpecimenDefinition_Handling rhs = ((SpecimenDefinition_Handling) other);
        return (((((((((this.temperatureRange == rhs.temperatureRange)||((this.temperatureRange!= null)&&this.temperatureRange.equals(rhs.temperatureRange)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.instruction == rhs.instruction)||((this.instruction!= null)&&this.instruction.equals(rhs.instruction))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._instruction == rhs._instruction)||((this._instruction!= null)&&this._instruction.equals(rhs._instruction))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.temperatureQualifier == rhs.temperatureQualifier)||((this.temperatureQualifier!= null)&&this.temperatureQualifier.equals(rhs.temperatureQualifier))))&&((this.maxDuration == rhs.maxDuration)||((this.maxDuration!= null)&&this.maxDuration.equals(rhs.maxDuration))));
    }

}
