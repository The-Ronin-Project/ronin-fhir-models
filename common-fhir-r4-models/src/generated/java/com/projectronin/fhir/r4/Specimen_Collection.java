
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sample to be used for analysis.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "collector",
    "collectedDateTime",
    "_collectedDateTime",
    "collectedPeriod",
    "duration",
    "quantity",
    "method",
    "bodySite",
    "fastingStatusCodeableConcept",
    "fastingStatusDuration"
})
@Generated("jsonschema2pojo")
public class Specimen_Collection {

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
     * 
     */
    @JsonProperty("collector")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference collector;
    /**
     * Time when specimen was collected from subject - the physiologically relevant time.
     * 
     */
    @JsonProperty("collectedDateTime")
    @JsonPropertyDescription("Time when specimen was collected from subject - the physiologically relevant time.")
    private String collectedDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_collectedDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _collectedDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("collectedPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period collectedPeriod;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("A length of time.")
    private Duration duration;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept method;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept bodySite;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fastingStatusCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept fastingStatusCodeableConcept;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("fastingStatusDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration fastingStatusDuration;

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
     * 
     */
    @JsonProperty("collector")
    public Reference getCollector() {
        return collector;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("collector")
    public void setCollector(Reference collector) {
        this.collector = collector;
    }

    /**
     * Time when specimen was collected from subject - the physiologically relevant time.
     * 
     */
    @JsonProperty("collectedDateTime")
    public String getCollectedDateTime() {
        return collectedDateTime;
    }

    /**
     * Time when specimen was collected from subject - the physiologically relevant time.
     * 
     */
    @JsonProperty("collectedDateTime")
    public void setCollectedDateTime(String collectedDateTime) {
        this.collectedDateTime = collectedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_collectedDateTime")
    public Element get_collectedDateTime() {
        return _collectedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_collectedDateTime")
    public void set_collectedDateTime(Element _collectedDateTime) {
        this._collectedDateTime = _collectedDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("collectedPeriod")
    public Period getCollectedPeriod() {
        return collectedPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("collectedPeriod")
    public void setCollectedPeriod(Period collectedPeriod) {
        this.collectedPeriod = collectedPeriod;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("duration")
    public Duration getDuration() {
        return duration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public void setMethod(CodeableConcept method) {
        this.method = method;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(CodeableConcept bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fastingStatusCodeableConcept")
    public CodeableConcept getFastingStatusCodeableConcept() {
        return fastingStatusCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fastingStatusCodeableConcept")
    public void setFastingStatusCodeableConcept(CodeableConcept fastingStatusCodeableConcept) {
        this.fastingStatusCodeableConcept = fastingStatusCodeableConcept;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("fastingStatusDuration")
    public Duration getFastingStatusDuration() {
        return fastingStatusDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("fastingStatusDuration")
    public void setFastingStatusDuration(Duration fastingStatusDuration) {
        this.fastingStatusDuration = fastingStatusDuration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Specimen_Collection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("collector");
        sb.append('=');
        sb.append(((this.collector == null)?"<null>":this.collector));
        sb.append(',');
        sb.append("collectedDateTime");
        sb.append('=');
        sb.append(((this.collectedDateTime == null)?"<null>":this.collectedDateTime));
        sb.append(',');
        sb.append("_collectedDateTime");
        sb.append('=');
        sb.append(((this._collectedDateTime == null)?"<null>":this._collectedDateTime));
        sb.append(',');
        sb.append("collectedPeriod");
        sb.append('=');
        sb.append(((this.collectedPeriod == null)?"<null>":this.collectedPeriod));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("fastingStatusCodeableConcept");
        sb.append('=');
        sb.append(((this.fastingStatusCodeableConcept == null)?"<null>":this.fastingStatusCodeableConcept));
        sb.append(',');
        sb.append("fastingStatusDuration");
        sb.append('=');
        sb.append(((this.fastingStatusDuration == null)?"<null>":this.fastingStatusDuration));
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
        result = ((result* 31)+((this._collectedDateTime == null)? 0 :this._collectedDateTime.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.fastingStatusDuration == null)? 0 :this.fastingStatusDuration.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.collectedPeriod == null)? 0 :this.collectedPeriod.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.collectedDateTime == null)? 0 :this.collectedDateTime.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.fastingStatusCodeableConcept == null)? 0 :this.fastingStatusCodeableConcept.hashCode()));
        result = ((result* 31)+((this.collector == null)? 0 :this.collector.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Specimen_Collection) == false) {
            return false;
        }
        Specimen_Collection rhs = ((Specimen_Collection) other);
        return ((((((((((((((this._collectedDateTime == rhs._collectedDateTime)||((this._collectedDateTime!= null)&&this._collectedDateTime.equals(rhs._collectedDateTime)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.fastingStatusDuration == rhs.fastingStatusDuration)||((this.fastingStatusDuration!= null)&&this.fastingStatusDuration.equals(rhs.fastingStatusDuration))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.collectedPeriod == rhs.collectedPeriod)||((this.collectedPeriod!= null)&&this.collectedPeriod.equals(rhs.collectedPeriod))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.collectedDateTime == rhs.collectedDateTime)||((this.collectedDateTime!= null)&&this.collectedDateTime.equals(rhs.collectedDateTime))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.fastingStatusCodeableConcept == rhs.fastingStatusCodeableConcept)||((this.fastingStatusCodeableConcept!= null)&&this.fastingStatusCodeableConcept.equals(rhs.fastingStatusCodeableConcept))))&&((this.collector == rhs.collector)||((this.collector!= null)&&this.collector.equals(rhs.collector))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
