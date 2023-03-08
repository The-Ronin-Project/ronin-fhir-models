
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "preAdmissionIdentifier",
    "origin",
    "admitSource",
    "reAdmission",
    "dietPreference",
    "specialCourtesy",
    "specialArrangement",
    "destination",
    "dischargeDisposition"
})
@Generated("jsonschema2pojo")
public class Encounter_Hospitalization {

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
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("preAdmissionIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier preAdmissionIdentifier;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference origin;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("admitSource")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept admitSource;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reAdmission")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept reAdmission;
    /**
     * Diet preferences reported by the patient.
     * 
     */
    @JsonProperty("dietPreference")
    @JsonPropertyDescription("Diet preferences reported by the patient.")
    private List<CodeableConcept> dietPreference = new ArrayList<CodeableConcept>();
    /**
     * Special courtesies (VIP, board member).
     * 
     */
    @JsonProperty("specialCourtesy")
    @JsonPropertyDescription("Special courtesies (VIP, board member).")
    private List<CodeableConcept> specialCourtesy = new ArrayList<CodeableConcept>();
    /**
     * Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.
     * 
     */
    @JsonProperty("specialArrangement")
    @JsonPropertyDescription("Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.")
    private List<CodeableConcept> specialArrangement = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference destination;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dischargeDisposition")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept dischargeDisposition;

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
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("preAdmissionIdentifier")
    public Identifier getPreAdmissionIdentifier() {
        return preAdmissionIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("preAdmissionIdentifier")
    public void setPreAdmissionIdentifier(Identifier preAdmissionIdentifier) {
        this.preAdmissionIdentifier = preAdmissionIdentifier;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("origin")
    public Reference getOrigin() {
        return origin;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(Reference origin) {
        this.origin = origin;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("admitSource")
    public CodeableConcept getAdmitSource() {
        return admitSource;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("admitSource")
    public void setAdmitSource(CodeableConcept admitSource) {
        this.admitSource = admitSource;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reAdmission")
    public CodeableConcept getReAdmission() {
        return reAdmission;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reAdmission")
    public void setReAdmission(CodeableConcept reAdmission) {
        this.reAdmission = reAdmission;
    }

    /**
     * Diet preferences reported by the patient.
     * 
     */
    @JsonProperty("dietPreference")
    public List<CodeableConcept> getDietPreference() {
        return dietPreference;
    }

    /**
     * Diet preferences reported by the patient.
     * 
     */
    @JsonProperty("dietPreference")
    public void setDietPreference(List<CodeableConcept> dietPreference) {
        this.dietPreference = dietPreference;
    }

    /**
     * Special courtesies (VIP, board member).
     * 
     */
    @JsonProperty("specialCourtesy")
    public List<CodeableConcept> getSpecialCourtesy() {
        return specialCourtesy;
    }

    /**
     * Special courtesies (VIP, board member).
     * 
     */
    @JsonProperty("specialCourtesy")
    public void setSpecialCourtesy(List<CodeableConcept> specialCourtesy) {
        this.specialCourtesy = specialCourtesy;
    }

    /**
     * Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.
     * 
     */
    @JsonProperty("specialArrangement")
    public List<CodeableConcept> getSpecialArrangement() {
        return specialArrangement;
    }

    /**
     * Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.
     * 
     */
    @JsonProperty("specialArrangement")
    public void setSpecialArrangement(List<CodeableConcept> specialArrangement) {
        this.specialArrangement = specialArrangement;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("destination")
    public Reference getDestination() {
        return destination;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("destination")
    public void setDestination(Reference destination) {
        this.destination = destination;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dischargeDisposition")
    public CodeableConcept getDischargeDisposition() {
        return dischargeDisposition;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dischargeDisposition")
    public void setDischargeDisposition(CodeableConcept dischargeDisposition) {
        this.dischargeDisposition = dischargeDisposition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Encounter_Hospitalization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("preAdmissionIdentifier");
        sb.append('=');
        sb.append(((this.preAdmissionIdentifier == null)?"<null>":this.preAdmissionIdentifier));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("admitSource");
        sb.append('=');
        sb.append(((this.admitSource == null)?"<null>":this.admitSource));
        sb.append(',');
        sb.append("reAdmission");
        sb.append('=');
        sb.append(((this.reAdmission == null)?"<null>":this.reAdmission));
        sb.append(',');
        sb.append("dietPreference");
        sb.append('=');
        sb.append(((this.dietPreference == null)?"<null>":this.dietPreference));
        sb.append(',');
        sb.append("specialCourtesy");
        sb.append('=');
        sb.append(((this.specialCourtesy == null)?"<null>":this.specialCourtesy));
        sb.append(',');
        sb.append("specialArrangement");
        sb.append('=');
        sb.append(((this.specialArrangement == null)?"<null>":this.specialArrangement));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("dischargeDisposition");
        sb.append('=');
        sb.append(((this.dischargeDisposition == null)?"<null>":this.dischargeDisposition));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.specialArrangement == null)? 0 :this.specialArrangement.hashCode()));
        result = ((result* 31)+((this.reAdmission == null)? 0 :this.reAdmission.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.dietPreference == null)? 0 :this.dietPreference.hashCode()));
        result = ((result* 31)+((this.preAdmissionIdentifier == null)? 0 :this.preAdmissionIdentifier.hashCode()));
        result = ((result* 31)+((this.specialCourtesy == null)? 0 :this.specialCourtesy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.dischargeDisposition == null)? 0 :this.dischargeDisposition.hashCode()));
        result = ((result* 31)+((this.admitSource == null)? 0 :this.admitSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Encounter_Hospitalization) == false) {
            return false;
        }
        Encounter_Hospitalization rhs = ((Encounter_Hospitalization) other);
        return (((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.specialArrangement == rhs.specialArrangement)||((this.specialArrangement!= null)&&this.specialArrangement.equals(rhs.specialArrangement))))&&((this.reAdmission == rhs.reAdmission)||((this.reAdmission!= null)&&this.reAdmission.equals(rhs.reAdmission))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.dietPreference == rhs.dietPreference)||((this.dietPreference!= null)&&this.dietPreference.equals(rhs.dietPreference))))&&((this.preAdmissionIdentifier == rhs.preAdmissionIdentifier)||((this.preAdmissionIdentifier!= null)&&this.preAdmissionIdentifier.equals(rhs.preAdmissionIdentifier))))&&((this.specialCourtesy == rhs.specialCourtesy)||((this.specialCourtesy!= null)&&this.specialCourtesy.equals(rhs.specialCourtesy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.dischargeDisposition == rhs.dischargeDisposition)||((this.dischargeDisposition!= null)&&this.dischargeDisposition.equals(rhs.dischargeDisposition))))&&((this.admitSource == rhs.admitSource)||((this.admitSource!= null)&&this.admitSource.equals(rhs.admitSource))));
    }

}
