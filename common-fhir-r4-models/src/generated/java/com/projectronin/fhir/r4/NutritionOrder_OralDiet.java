
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "schedule",
    "nutrient",
    "texture",
    "fluidConsistencyType",
    "instruction",
    "_instruction"
})
@Generated("jsonschema2pojo")
public class NutritionOrder_OralDiet {

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
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.
     * 
     */
    @JsonProperty("schedule")
    @JsonPropertyDescription("The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.")
    private List<Timing> schedule = new ArrayList<Timing>();
    /**
     * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
     * 
     */
    @JsonProperty("nutrient")
    @JsonPropertyDescription("Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.")
    private List<NutritionOrder_Nutrient> nutrient = new ArrayList<NutritionOrder_Nutrient>();
    /**
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * 
     */
    @JsonProperty("texture")
    @JsonPropertyDescription("Class that describes any texture modifications required for the patient to safely consume various types of solid foods.")
    private List<NutritionOrder_Texture> texture = new ArrayList<NutritionOrder_Texture>();
    /**
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     * 
     */
    @JsonProperty("fluidConsistencyType")
    @JsonPropertyDescription("The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.")
    private List<CodeableConcept> fluidConsistencyType = new ArrayList<CodeableConcept>();
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
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.
     * 
     */
    @JsonProperty("schedule")
    public List<Timing> getSchedule() {
        return schedule;
    }

    /**
     * The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.
     * 
     */
    @JsonProperty("schedule")
    public void setSchedule(List<Timing> schedule) {
        this.schedule = schedule;
    }

    /**
     * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
     * 
     */
    @JsonProperty("nutrient")
    public List<NutritionOrder_Nutrient> getNutrient() {
        return nutrient;
    }

    /**
     * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
     * 
     */
    @JsonProperty("nutrient")
    public void setNutrient(List<NutritionOrder_Nutrient> nutrient) {
        this.nutrient = nutrient;
    }

    /**
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * 
     */
    @JsonProperty("texture")
    public List<NutritionOrder_Texture> getTexture() {
        return texture;
    }

    /**
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * 
     */
    @JsonProperty("texture")
    public void setTexture(List<NutritionOrder_Texture> texture) {
        this.texture = texture;
    }

    /**
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     * 
     */
    @JsonProperty("fluidConsistencyType")
    public List<CodeableConcept> getFluidConsistencyType() {
        return fluidConsistencyType;
    }

    /**
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     * 
     */
    @JsonProperty("fluidConsistencyType")
    public void setFluidConsistencyType(List<CodeableConcept> fluidConsistencyType) {
        this.fluidConsistencyType = fluidConsistencyType;
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
        sb.append(NutritionOrder_OralDiet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("schedule");
        sb.append('=');
        sb.append(((this.schedule == null)?"<null>":this.schedule));
        sb.append(',');
        sb.append("nutrient");
        sb.append('=');
        sb.append(((this.nutrient == null)?"<null>":this.nutrient));
        sb.append(',');
        sb.append("texture");
        sb.append('=');
        sb.append(((this.texture == null)?"<null>":this.texture));
        sb.append(',');
        sb.append("fluidConsistencyType");
        sb.append('=');
        sb.append(((this.fluidConsistencyType == null)?"<null>":this.fluidConsistencyType));
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
        result = ((result* 31)+((this.schedule == null)? 0 :this.schedule.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.nutrient == null)? 0 :this.nutrient.hashCode()));
        result = ((result* 31)+((this.texture == null)? 0 :this.texture.hashCode()));
        result = ((result* 31)+((this.instruction == null)? 0 :this.instruction.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._instruction == null)? 0 :this._instruction.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.fluidConsistencyType == null)? 0 :this.fluidConsistencyType.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NutritionOrder_OralDiet) == false) {
            return false;
        }
        NutritionOrder_OralDiet rhs = ((NutritionOrder_OralDiet) other);
        return (((((((((((this.schedule == rhs.schedule)||((this.schedule!= null)&&this.schedule.equals(rhs.schedule)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.nutrient == rhs.nutrient)||((this.nutrient!= null)&&this.nutrient.equals(rhs.nutrient))))&&((this.texture == rhs.texture)||((this.texture!= null)&&this.texture.equals(rhs.texture))))&&((this.instruction == rhs.instruction)||((this.instruction!= null)&&this.instruction.equals(rhs.instruction))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._instruction == rhs._instruction)||((this._instruction!= null)&&this._instruction.equals(rhs._instruction))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.fluidConsistencyType == rhs.fluidConsistencyType)||((this.fluidConsistencyType!= null)&&this.fluidConsistencyType.equals(rhs.fluidConsistencyType))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
