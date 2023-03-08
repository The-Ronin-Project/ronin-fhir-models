
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about a medication that is used to support knowledge.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "areaUnderCurve",
    "lethalDose50",
    "halfLifePeriod"
})
@Generated("jsonschema2pojo")
public class MedicationKnowledge_Kinetics {

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
     * The drug concentration measured at certain discrete points in time.
     * 
     */
    @JsonProperty("areaUnderCurve")
    @JsonPropertyDescription("The drug concentration measured at certain discrete points in time.")
    private List<Quantity> areaUnderCurve = new ArrayList<Quantity>();
    /**
     * The median lethal dose of a drug.
     * 
     */
    @JsonProperty("lethalDose50")
    @JsonPropertyDescription("The median lethal dose of a drug.")
    private List<Quantity> lethalDose50 = new ArrayList<Quantity>();
    /**
     * A length of time.
     * 
     */
    @JsonProperty("halfLifePeriod")
    @JsonPropertyDescription("A length of time.")
    private Duration halfLifePeriod;

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
     * The drug concentration measured at certain discrete points in time.
     * 
     */
    @JsonProperty("areaUnderCurve")
    public List<Quantity> getAreaUnderCurve() {
        return areaUnderCurve;
    }

    /**
     * The drug concentration measured at certain discrete points in time.
     * 
     */
    @JsonProperty("areaUnderCurve")
    public void setAreaUnderCurve(List<Quantity> areaUnderCurve) {
        this.areaUnderCurve = areaUnderCurve;
    }

    /**
     * The median lethal dose of a drug.
     * 
     */
    @JsonProperty("lethalDose50")
    public List<Quantity> getLethalDose50() {
        return lethalDose50;
    }

    /**
     * The median lethal dose of a drug.
     * 
     */
    @JsonProperty("lethalDose50")
    public void setLethalDose50(List<Quantity> lethalDose50) {
        this.lethalDose50 = lethalDose50;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("halfLifePeriod")
    public Duration getHalfLifePeriod() {
        return halfLifePeriod;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("halfLifePeriod")
    public void setHalfLifePeriod(Duration halfLifePeriod) {
        this.halfLifePeriod = halfLifePeriod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicationKnowledge_Kinetics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("areaUnderCurve");
        sb.append('=');
        sb.append(((this.areaUnderCurve == null)?"<null>":this.areaUnderCurve));
        sb.append(',');
        sb.append("lethalDose50");
        sb.append('=');
        sb.append(((this.lethalDose50 == null)?"<null>":this.lethalDose50));
        sb.append(',');
        sb.append("halfLifePeriod");
        sb.append('=');
        sb.append(((this.halfLifePeriod == null)?"<null>":this.halfLifePeriod));
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
        result = ((result* 31)+((this.areaUnderCurve == null)? 0 :this.areaUnderCurve.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.halfLifePeriod == null)? 0 :this.halfLifePeriod.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.lethalDose50 == null)? 0 :this.lethalDose50 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicationKnowledge_Kinetics) == false) {
            return false;
        }
        MedicationKnowledge_Kinetics rhs = ((MedicationKnowledge_Kinetics) other);
        return (((((((this.areaUnderCurve == rhs.areaUnderCurve)||((this.areaUnderCurve!= null)&&this.areaUnderCurve.equals(rhs.areaUnderCurve)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.halfLifePeriod == rhs.halfLifePeriod)||((this.halfLifePeriod!= null)&&this.halfLifePeriod.equals(rhs.halfLifePeriod))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.lethalDose50 == rhs.lethalDose50)||((this.lethalDose50 != null)&&this.lethalDose50 .equals(rhs.lethalDose50))));
    }

}
