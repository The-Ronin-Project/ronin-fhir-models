
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
    "dosage",
    "indicationCodeableConcept",
    "indicationReference",
    "patientCharacteristics"
})
@Generated("jsonschema2pojo")
public class MedicationKnowledge_AdministrationGuidelines {

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
     * Dosage for the medication for the specific guidelines.
     * 
     */
    @JsonProperty("dosage")
    @JsonPropertyDescription("Dosage for the medication for the specific guidelines.")
    private List<MedicationKnowledge_Dosage> dosage = new ArrayList<MedicationKnowledge_Dosage>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("indicationCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept indicationCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("indicationReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference indicationReference;
    /**
     * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
     * 
     */
    @JsonProperty("patientCharacteristics")
    @JsonPropertyDescription("Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).")
    private List<MedicationKnowledge_PatientCharacteristics> patientCharacteristics = new ArrayList<MedicationKnowledge_PatientCharacteristics>();

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
     * Dosage for the medication for the specific guidelines.
     * 
     */
    @JsonProperty("dosage")
    public List<MedicationKnowledge_Dosage> getDosage() {
        return dosage;
    }

    /**
     * Dosage for the medication for the specific guidelines.
     * 
     */
    @JsonProperty("dosage")
    public void setDosage(List<MedicationKnowledge_Dosage> dosage) {
        this.dosage = dosage;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("indicationCodeableConcept")
    public CodeableConcept getIndicationCodeableConcept() {
        return indicationCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("indicationCodeableConcept")
    public void setIndicationCodeableConcept(CodeableConcept indicationCodeableConcept) {
        this.indicationCodeableConcept = indicationCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("indicationReference")
    public Reference getIndicationReference() {
        return indicationReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("indicationReference")
    public void setIndicationReference(Reference indicationReference) {
        this.indicationReference = indicationReference;
    }

    /**
     * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
     * 
     */
    @JsonProperty("patientCharacteristics")
    public List<MedicationKnowledge_PatientCharacteristics> getPatientCharacteristics() {
        return patientCharacteristics;
    }

    /**
     * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
     * 
     */
    @JsonProperty("patientCharacteristics")
    public void setPatientCharacteristics(List<MedicationKnowledge_PatientCharacteristics> patientCharacteristics) {
        this.patientCharacteristics = patientCharacteristics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicationKnowledge_AdministrationGuidelines.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("dosage");
        sb.append('=');
        sb.append(((this.dosage == null)?"<null>":this.dosage));
        sb.append(',');
        sb.append("indicationCodeableConcept");
        sb.append('=');
        sb.append(((this.indicationCodeableConcept == null)?"<null>":this.indicationCodeableConcept));
        sb.append(',');
        sb.append("indicationReference");
        sb.append('=');
        sb.append(((this.indicationReference == null)?"<null>":this.indicationReference));
        sb.append(',');
        sb.append("patientCharacteristics");
        sb.append('=');
        sb.append(((this.patientCharacteristics == null)?"<null>":this.patientCharacteristics));
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
        result = ((result* 31)+((this.dosage == null)? 0 :this.dosage.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.indicationReference == null)? 0 :this.indicationReference.hashCode()));
        result = ((result* 31)+((this.patientCharacteristics == null)? 0 :this.patientCharacteristics.hashCode()));
        result = ((result* 31)+((this.indicationCodeableConcept == null)? 0 :this.indicationCodeableConcept.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicationKnowledge_AdministrationGuidelines) == false) {
            return false;
        }
        MedicationKnowledge_AdministrationGuidelines rhs = ((MedicationKnowledge_AdministrationGuidelines) other);
        return ((((((((this.dosage == rhs.dosage)||((this.dosage!= null)&&this.dosage.equals(rhs.dosage)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.indicationReference == rhs.indicationReference)||((this.indicationReference!= null)&&this.indicationReference.equals(rhs.indicationReference))))&&((this.patientCharacteristics == rhs.patientCharacteristics)||((this.patientCharacteristics!= null)&&this.patientCharacteristics.equals(rhs.patientCharacteristics))))&&((this.indicationCodeableConcept == rhs.indicationCodeableConcept)||((this.indicationCodeableConcept!= null)&&this.indicationCodeableConcept.equals(rhs.indicationCodeableConcept))));
    }

}
