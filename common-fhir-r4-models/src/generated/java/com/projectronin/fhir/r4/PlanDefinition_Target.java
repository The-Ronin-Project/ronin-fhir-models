
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "measure",
    "detailQuantity",
    "detailRange",
    "detailCodeableConcept",
    "due"
})
@Generated("jsonschema2pojo")
public class PlanDefinition_Target {

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
    @JsonProperty("measure")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept measure;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("detailQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity detailQuantity;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("detailRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range detailRange;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("detailCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept detailCodeableConcept;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("due")
    @JsonPropertyDescription("A length of time.")
    private Duration due;

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
    @JsonProperty("measure")
    public CodeableConcept getMeasure() {
        return measure;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(CodeableConcept measure) {
        this.measure = measure;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("detailQuantity")
    public Quantity getDetailQuantity() {
        return detailQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("detailQuantity")
    public void setDetailQuantity(Quantity detailQuantity) {
        this.detailQuantity = detailQuantity;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("detailRange")
    public Range getDetailRange() {
        return detailRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("detailRange")
    public void setDetailRange(Range detailRange) {
        this.detailRange = detailRange;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("detailCodeableConcept")
    public CodeableConcept getDetailCodeableConcept() {
        return detailCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("detailCodeableConcept")
    public void setDetailCodeableConcept(CodeableConcept detailCodeableConcept) {
        this.detailCodeableConcept = detailCodeableConcept;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("due")
    public Duration getDue() {
        return due;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("due")
    public void setDue(Duration due) {
        this.due = due;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlanDefinition_Target.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
        sb.append(',');
        sb.append("detailQuantity");
        sb.append('=');
        sb.append(((this.detailQuantity == null)?"<null>":this.detailQuantity));
        sb.append(',');
        sb.append("detailRange");
        sb.append('=');
        sb.append(((this.detailRange == null)?"<null>":this.detailRange));
        sb.append(',');
        sb.append("detailCodeableConcept");
        sb.append('=');
        sb.append(((this.detailCodeableConcept == null)?"<null>":this.detailCodeableConcept));
        sb.append(',');
        sb.append("due");
        sb.append('=');
        sb.append(((this.due == null)?"<null>":this.due));
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
        result = ((result* 31)+((this.detailRange == null)? 0 :this.detailRange.hashCode()));
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        result = ((result* 31)+((this.due == null)? 0 :this.due.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.detailQuantity == null)? 0 :this.detailQuantity.hashCode()));
        result = ((result* 31)+((this.detailCodeableConcept == null)? 0 :this.detailCodeableConcept.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlanDefinition_Target) == false) {
            return false;
        }
        PlanDefinition_Target rhs = ((PlanDefinition_Target) other);
        return (((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.detailRange == rhs.detailRange)||((this.detailRange!= null)&&this.detailRange.equals(rhs.detailRange))))&&((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure))))&&((this.due == rhs.due)||((this.due!= null)&&this.due.equals(rhs.due))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.detailQuantity == rhs.detailQuantity)||((this.detailQuantity!= null)&&this.detailQuantity.equals(rhs.detailQuantity))))&&((this.detailCodeableConcept == rhs.detailCodeableConcept)||((this.detailCodeableConcept!= null)&&this.detailCodeableConcept.equals(rhs.detailCodeableConcept))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
