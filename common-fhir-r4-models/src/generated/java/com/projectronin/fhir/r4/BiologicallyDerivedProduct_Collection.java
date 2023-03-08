
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "collector",
    "source",
    "collectedDateTime",
    "_collectedDateTime",
    "collectedPeriod"
})
@Generated("jsonschema2pojo")
public class BiologicallyDerivedProduct_Collection {

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference source;
    /**
     * Time of product collection.
     * 
     */
    @JsonProperty("collectedDateTime")
    @JsonPropertyDescription("Time of product collection.")
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public Reference getSource() {
        return source;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public void setSource(Reference source) {
        this.source = source;
    }

    /**
     * Time of product collection.
     * 
     */
    @JsonProperty("collectedDateTime")
    public String getCollectedDateTime() {
        return collectedDateTime;
    }

    /**
     * Time of product collection.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BiologicallyDerivedProduct_Collection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.collectedPeriod == null)? 0 :this.collectedPeriod.hashCode()));
        result = ((result* 31)+((this.collectedDateTime == null)? 0 :this.collectedDateTime.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.collector == null)? 0 :this.collector.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BiologicallyDerivedProduct_Collection) == false) {
            return false;
        }
        BiologicallyDerivedProduct_Collection rhs = ((BiologicallyDerivedProduct_Collection) other);
        return (((((((((this._collectedDateTime == rhs._collectedDateTime)||((this._collectedDateTime!= null)&&this._collectedDateTime.equals(rhs._collectedDateTime)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.collectedPeriod == rhs.collectedPeriod)||((this.collectedPeriod!= null)&&this.collectedPeriod.equals(rhs.collectedPeriod))))&&((this.collectedDateTime == rhs.collectedDateTime)||((this.collectedDateTime!= null)&&this.collectedDateTime.equals(rhs.collectedDateTime))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.collector == rhs.collector)||((this.collector!= null)&&this.collector.equals(rhs.collector))));
    }

}
