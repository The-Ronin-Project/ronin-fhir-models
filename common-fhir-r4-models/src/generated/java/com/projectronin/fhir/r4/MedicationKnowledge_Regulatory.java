
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
    "regulatoryAuthority",
    "substitution",
    "schedule",
    "maxDispense"
})
@Generated("jsonschema2pojo")
public class MedicationKnowledge_Regulatory {

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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("regulatoryAuthority")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference regulatoryAuthority;
    /**
     * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
     * 
     */
    @JsonProperty("substitution")
    @JsonPropertyDescription("Specifies if changes are allowed when dispensing a medication from a regulatory perspective.")
    private List<MedicationKnowledge_Substitution> substitution = new ArrayList<MedicationKnowledge_Substitution>();
    /**
     * Specifies the schedule of a medication in jurisdiction.
     * 
     */
    @JsonProperty("schedule")
    @JsonPropertyDescription("Specifies the schedule of a medication in jurisdiction.")
    private List<MedicationKnowledge_Schedule> schedule = new ArrayList<MedicationKnowledge_Schedule>();
    /**
     * Information about a medication that is used to support knowledge.
     * 
     */
    @JsonProperty("maxDispense")
    @JsonPropertyDescription("Information about a medication that is used to support knowledge.")
    private MedicationKnowledge_MaxDispense maxDispense;

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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("regulatoryAuthority")
    public Reference getRegulatoryAuthority() {
        return regulatoryAuthority;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("regulatoryAuthority")
    public void setRegulatoryAuthority(Reference regulatoryAuthority) {
        this.regulatoryAuthority = regulatoryAuthority;
    }

    /**
     * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
     * 
     */
    @JsonProperty("substitution")
    public List<MedicationKnowledge_Substitution> getSubstitution() {
        return substitution;
    }

    /**
     * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
     * 
     */
    @JsonProperty("substitution")
    public void setSubstitution(List<MedicationKnowledge_Substitution> substitution) {
        this.substitution = substitution;
    }

    /**
     * Specifies the schedule of a medication in jurisdiction.
     * 
     */
    @JsonProperty("schedule")
    public List<MedicationKnowledge_Schedule> getSchedule() {
        return schedule;
    }

    /**
     * Specifies the schedule of a medication in jurisdiction.
     * 
     */
    @JsonProperty("schedule")
    public void setSchedule(List<MedicationKnowledge_Schedule> schedule) {
        this.schedule = schedule;
    }

    /**
     * Information about a medication that is used to support knowledge.
     * 
     */
    @JsonProperty("maxDispense")
    public MedicationKnowledge_MaxDispense getMaxDispense() {
        return maxDispense;
    }

    /**
     * Information about a medication that is used to support knowledge.
     * 
     */
    @JsonProperty("maxDispense")
    public void setMaxDispense(MedicationKnowledge_MaxDispense maxDispense) {
        this.maxDispense = maxDispense;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicationKnowledge_Regulatory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("regulatoryAuthority");
        sb.append('=');
        sb.append(((this.regulatoryAuthority == null)?"<null>":this.regulatoryAuthority));
        sb.append(',');
        sb.append("substitution");
        sb.append('=');
        sb.append(((this.substitution == null)?"<null>":this.substitution));
        sb.append(',');
        sb.append("schedule");
        sb.append('=');
        sb.append(((this.schedule == null)?"<null>":this.schedule));
        sb.append(',');
        sb.append("maxDispense");
        sb.append('=');
        sb.append(((this.maxDispense == null)?"<null>":this.maxDispense));
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
        result = ((result* 31)+((this.substitution == null)? 0 :this.substitution.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.maxDispense == null)? 0 :this.maxDispense.hashCode()));
        result = ((result* 31)+((this.regulatoryAuthority == null)? 0 :this.regulatoryAuthority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicationKnowledge_Regulatory) == false) {
            return false;
        }
        MedicationKnowledge_Regulatory rhs = ((MedicationKnowledge_Regulatory) other);
        return ((((((((this.schedule == rhs.schedule)||((this.schedule!= null)&&this.schedule.equals(rhs.schedule)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.substitution == rhs.substitution)||((this.substitution!= null)&&this.substitution.equals(rhs.substitution))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.maxDispense == rhs.maxDispense)||((this.maxDispense!= null)&&this.maxDispense.equals(rhs.maxDispense))))&&((this.regulatoryAuthority == rhs.regulatoryAuthority)||((this.regulatoryAuthority!= null)&&this.regulatoryAuthority.equals(rhs.regulatoryAuthority))));
    }

}
