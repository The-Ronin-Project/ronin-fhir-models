
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A task to be performed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "repetitions",
    "_repetitions",
    "period",
    "recipient"
})
@Generated("jsonschema2pojo")
public class Task_Restriction {

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("repetitions")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double repetitions;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repetitions")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _repetitions;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?
     * 
     */
    @JsonProperty("recipient")
    @JsonPropertyDescription("For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?")
    private List<Reference> recipient = new ArrayList<Reference>();

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("repetitions")
    public Double getRepetitions() {
        return repetitions;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("repetitions")
    public void setRepetitions(Double repetitions) {
        this.repetitions = repetitions;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repetitions")
    public Element get_repetitions() {
        return _repetitions;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repetitions")
    public void set_repetitions(Element _repetitions) {
        this._repetitions = _repetitions;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?
     * 
     */
    @JsonProperty("recipient")
    public List<Reference> getRecipient() {
        return recipient;
    }

    /**
     * For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?
     * 
     */
    @JsonProperty("recipient")
    public void setRecipient(List<Reference> recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Task_Restriction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("repetitions");
        sb.append('=');
        sb.append(((this.repetitions == null)?"<null>":this.repetitions));
        sb.append(',');
        sb.append("_repetitions");
        sb.append('=');
        sb.append(((this._repetitions == null)?"<null>":this._repetitions));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("recipient");
        sb.append('=');
        sb.append(((this.recipient == null)?"<null>":this.recipient));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.recipient == null)? 0 :this.recipient.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._repetitions == null)? 0 :this._repetitions.hashCode()));
        result = ((result* 31)+((this.repetitions == null)? 0 :this.repetitions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Task_Restriction) == false) {
            return false;
        }
        Task_Restriction rhs = ((Task_Restriction) other);
        return ((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.recipient == rhs.recipient)||((this.recipient!= null)&&this.recipient.equals(rhs.recipient))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._repetitions == rhs._repetitions)||((this._repetitions!= null)&&this._repetitions.equals(rhs._repetitions))))&&((this.repetitions == rhs.repetitions)||((this.repetitions!= null)&&this.repetitions.equals(rhs.repetitions))));
    }

}
