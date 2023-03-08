
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called &quot;ClinicalImpression&quot; rather than &quot;ClinicalAssessment&quot; to avoid confusion with the recording of assessment tools such as Apgar score.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "itemCodeableConcept",
    "itemReference",
    "basis",
    "_basis"
})
@Generated("jsonschema2pojo")
public class ClinicalImpression_Finding {

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
    @JsonProperty("itemCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept itemCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference itemReference;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("basis")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String basis;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_basis")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _basis;

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
    @JsonProperty("itemCodeableConcept")
    public CodeableConcept getItemCodeableConcept() {
        return itemCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
        this.itemCodeableConcept = itemCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    public Reference getItemReference() {
        return itemReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    public void setItemReference(Reference itemReference) {
        this.itemReference = itemReference;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("basis")
    public String getBasis() {
        return basis;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("basis")
    public void setBasis(String basis) {
        this.basis = basis;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_basis")
    public Element get_basis() {
        return _basis;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_basis")
    public void set_basis(Element _basis) {
        this._basis = _basis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClinicalImpression_Finding.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("itemCodeableConcept");
        sb.append('=');
        sb.append(((this.itemCodeableConcept == null)?"<null>":this.itemCodeableConcept));
        sb.append(',');
        sb.append("itemReference");
        sb.append('=');
        sb.append(((this.itemReference == null)?"<null>":this.itemReference));
        sb.append(',');
        sb.append("basis");
        sb.append('=');
        sb.append(((this.basis == null)?"<null>":this.basis));
        sb.append(',');
        sb.append("_basis");
        sb.append('=');
        sb.append(((this._basis == null)?"<null>":this._basis));
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
        result = ((result* 31)+((this._basis == null)? 0 :this._basis.hashCode()));
        result = ((result* 31)+((this.itemReference == null)? 0 :this.itemReference.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.itemCodeableConcept == null)? 0 :this.itemCodeableConcept.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.basis == null)? 0 :this.basis.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClinicalImpression_Finding) == false) {
            return false;
        }
        ClinicalImpression_Finding rhs = ((ClinicalImpression_Finding) other);
        return ((((((((this._basis == rhs._basis)||((this._basis!= null)&&this._basis.equals(rhs._basis)))&&((this.itemReference == rhs.itemReference)||((this.itemReference!= null)&&this.itemReference.equals(rhs.itemReference))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.itemCodeableConcept == rhs.itemCodeableConcept)||((this.itemCodeableConcept!= null)&&this.itemCodeableConcept.equals(rhs.itemCodeableConcept))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.basis == rhs.basis)||((this.basis!= null)&&this.basis.equals(rhs.basis))));
    }

}