
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "longitude",
    "_longitude",
    "latitude",
    "_latitude",
    "altitude",
    "_altitude"
})
@Generated("jsonschema2pojo")
public class Location_Position {

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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("longitude")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double longitude;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_longitude")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _longitude;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("latitude")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double latitude;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_latitude")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _latitude;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("altitude")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double altitude;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_altitude")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _altitude;

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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_longitude")
    public Element get_longitude() {
        return _longitude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_longitude")
    public void set_longitude(Element _longitude) {
        this._longitude = _longitude;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_latitude")
    public Element get_latitude() {
        return _latitude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_latitude")
    public void set_latitude(Element _latitude) {
        this._latitude = _latitude;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("altitude")
    public Double getAltitude() {
        return altitude;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("altitude")
    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_altitude")
    public Element get_altitude() {
        return _altitude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_altitude")
    public void set_altitude(Element _altitude) {
        this._altitude = _altitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Location_Position.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("_longitude");
        sb.append('=');
        sb.append(((this._longitude == null)?"<null>":this._longitude));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("_latitude");
        sb.append('=');
        sb.append(((this._latitude == null)?"<null>":this._latitude));
        sb.append(',');
        sb.append("altitude");
        sb.append('=');
        sb.append(((this.altitude == null)?"<null>":this.altitude));
        sb.append(',');
        sb.append("_altitude");
        sb.append('=');
        sb.append(((this._altitude == null)?"<null>":this._altitude));
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
        result = ((result* 31)+((this._longitude == null)? 0 :this._longitude.hashCode()));
        result = ((result* 31)+((this.altitude == null)? 0 :this.altitude.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this._altitude == null)? 0 :this._altitude.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._latitude == null)? 0 :this._latitude.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location_Position) == false) {
            return false;
        }
        Location_Position rhs = ((Location_Position) other);
        return ((((((((((this._longitude == rhs._longitude)||((this._longitude!= null)&&this._longitude.equals(rhs._longitude)))&&((this.altitude == rhs.altitude)||((this.altitude!= null)&&this.altitude.equals(rhs.altitude))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this._altitude == rhs._altitude)||((this._altitude!= null)&&this._altitude.equals(rhs._altitude))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._latitude == rhs._latitude)||((this._latitude!= null)&&this._latitude.equals(rhs._latitude))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

}
