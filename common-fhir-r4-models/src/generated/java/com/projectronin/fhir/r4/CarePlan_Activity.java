
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "outcomeCodeableConcept",
    "outcomeReference",
    "progress",
    "reference",
    "detail"
})
@Generated("jsonschema2pojo")
public class CarePlan_Activity {

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
     * Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
     * 
     */
    @JsonProperty("outcomeCodeableConcept")
    @JsonPropertyDescription("Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).")
    private List<CodeableConcept> outcomeCodeableConcept = new ArrayList<CodeableConcept>();
    /**
     * Details of the outcome or action resulting from the activity.  The reference to an &quot;event&quot; resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a &ldquo;request&rdquo; resource).
     * 
     */
    @JsonProperty("outcomeReference")
    @JsonPropertyDescription("Details of the outcome or action resulting from the activity.  The reference to an \"event\" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a \u201crequest\u201d resource).")
    private List<Reference> outcomeReference = new ArrayList<Reference>();
    /**
     * Notes about the adherence/status/progress of the activity.
     * 
     */
    @JsonProperty("progress")
    @JsonPropertyDescription("Notes about the adherence/status/progress of the activity.")
    private List<Annotation> progress = new ArrayList<Annotation>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference reference;
    /**
     * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.")
    private CarePlan_Detail detail;

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
     * Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
     * 
     */
    @JsonProperty("outcomeCodeableConcept")
    public List<CodeableConcept> getOutcomeCodeableConcept() {
        return outcomeCodeableConcept;
    }

    /**
     * Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
     * 
     */
    @JsonProperty("outcomeCodeableConcept")
    public void setOutcomeCodeableConcept(List<CodeableConcept> outcomeCodeableConcept) {
        this.outcomeCodeableConcept = outcomeCodeableConcept;
    }

    /**
     * Details of the outcome or action resulting from the activity.  The reference to an &quot;event&quot; resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a &ldquo;request&rdquo; resource).
     * 
     */
    @JsonProperty("outcomeReference")
    public List<Reference> getOutcomeReference() {
        return outcomeReference;
    }

    /**
     * Details of the outcome or action resulting from the activity.  The reference to an &quot;event&quot; resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a &ldquo;request&rdquo; resource).
     * 
     */
    @JsonProperty("outcomeReference")
    public void setOutcomeReference(List<Reference> outcomeReference) {
        this.outcomeReference = outcomeReference;
    }

    /**
     * Notes about the adherence/status/progress of the activity.
     * 
     */
    @JsonProperty("progress")
    public List<Annotation> getProgress() {
        return progress;
    }

    /**
     * Notes about the adherence/status/progress of the activity.
     * 
     */
    @JsonProperty("progress")
    public void setProgress(List<Annotation> progress) {
        this.progress = progress;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reference")
    public Reference getReference() {
        return reference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reference")
    public void setReference(Reference reference) {
        this.reference = reference;
    }

    /**
     * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
     * 
     */
    @JsonProperty("detail")
    public CarePlan_Detail getDetail() {
        return detail;
    }

    /**
     * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(CarePlan_Detail detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CarePlan_Activity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("outcomeCodeableConcept");
        sb.append('=');
        sb.append(((this.outcomeCodeableConcept == null)?"<null>":this.outcomeCodeableConcept));
        sb.append(',');
        sb.append("outcomeReference");
        sb.append('=');
        sb.append(((this.outcomeReference == null)?"<null>":this.outcomeReference));
        sb.append(',');
        sb.append("progress");
        sb.append('=');
        sb.append(((this.progress == null)?"<null>":this.progress));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.outcomeCodeableConcept == null)? 0 :this.outcomeCodeableConcept.hashCode()));
        result = ((result* 31)+((this.outcomeReference == null)? 0 :this.outcomeReference.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.progress == null)? 0 :this.progress.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarePlan_Activity) == false) {
            return false;
        }
        CarePlan_Activity rhs = ((CarePlan_Activity) other);
        return (((((((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.outcomeCodeableConcept == rhs.outcomeCodeableConcept)||((this.outcomeCodeableConcept!= null)&&this.outcomeCodeableConcept.equals(rhs.outcomeCodeableConcept))))&&((this.outcomeReference == rhs.outcomeReference)||((this.outcomeReference!= null)&&this.outcomeReference.equals(rhs.outcomeReference))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.progress == rhs.progress)||((this.progress!= null)&&this.progress.equals(rhs.progress))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }

}
