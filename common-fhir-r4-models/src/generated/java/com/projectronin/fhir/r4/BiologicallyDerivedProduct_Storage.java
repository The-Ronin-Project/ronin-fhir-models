
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


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
    "description",
    "_description",
    "temperature",
    "_temperature",
    "scale",
    "_scale",
    "duration"
})
@Generated("jsonschema2pojo")
public class BiologicallyDerivedProduct_Storage {

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("temperature")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double temperature;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_temperature")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _temperature;
    /**
     * Temperature scale used.
     * 
     */
    @JsonProperty("scale")
    @JsonPropertyDescription("Temperature scale used.")
    private BiologicallyDerivedProduct_Storage.Scale scale;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_scale")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _scale;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period duration;

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("temperature")
    public Double getTemperature() {
        return temperature;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_temperature")
    public Element get_temperature() {
        return _temperature;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_temperature")
    public void set_temperature(Element _temperature) {
        this._temperature = _temperature;
    }

    /**
     * Temperature scale used.
     * 
     */
    @JsonProperty("scale")
    public BiologicallyDerivedProduct_Storage.Scale getScale() {
        return scale;
    }

    /**
     * Temperature scale used.
     * 
     */
    @JsonProperty("scale")
    public void setScale(BiologicallyDerivedProduct_Storage.Scale scale) {
        this.scale = scale;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_scale")
    public Element get_scale() {
        return _scale;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_scale")
    public void set_scale(Element _scale) {
        this._scale = _scale;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("duration")
    public Period getDuration() {
        return duration;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Period duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BiologicallyDerivedProduct_Storage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("_temperature");
        sb.append('=');
        sb.append(((this._temperature == null)?"<null>":this._temperature));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
        sb.append(',');
        sb.append("_scale");
        sb.append('=');
        sb.append(((this._scale == null)?"<null>":this._scale));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
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
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._scale == null)? 0 :this._scale.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._temperature == null)? 0 :this._temperature.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BiologicallyDerivedProduct_Storage) == false) {
            return false;
        }
        BiologicallyDerivedProduct_Storage rhs = ((BiologicallyDerivedProduct_Storage) other);
        return (((((((((((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._scale == rhs._scale)||((this._scale!= null)&&this._scale.equals(rhs._scale))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._temperature == rhs._temperature)||((this._temperature!= null)&&this._temperature.equals(rhs._temperature))));
    }


    /**
     * Temperature scale used.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Scale {

        FARENHEIT("farenheit"),
        CELSIUS("celsius"),
        KELVIN("kelvin");
        private final String value;
        private final static Map<String, BiologicallyDerivedProduct_Storage.Scale> CONSTANTS = new HashMap<String, BiologicallyDerivedProduct_Storage.Scale>();

        static {
            for (BiologicallyDerivedProduct_Storage.Scale c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Scale(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static BiologicallyDerivedProduct_Storage.Scale fromValue(String value) {
            BiologicallyDerivedProduct_Storage.Scale constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
