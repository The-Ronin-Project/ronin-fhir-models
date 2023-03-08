
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "_code",
    "profile",
    "min",
    "_min",
    "max",
    "_max"
})
@Generated("jsonschema2pojo")
public class MessageDefinition_Focus {

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String profile;
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("min")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double min;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _min;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String max;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _max;

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public Element get_code() {
        return _code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public void set_code(Element _code) {
        this._code = _code;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public Element get_min() {
        return _min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public void set_min(Element _min) {
        this._min = _min;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public Element get_max() {
        return _max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public void set_max(Element _max) {
        this._max = _max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MessageDefinition_Focus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
        sb.append(',');
        sb.append("_min");
        sb.append('=');
        sb.append(((this._min == null)?"<null>":this._min));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("_max");
        sb.append('=');
        sb.append(((this._max == null)?"<null>":this._max));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this._max == null)? 0 :this._max.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._min == null)? 0 :this._min.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessageDefinition_Focus) == false) {
            return false;
        }
        MessageDefinition_Focus rhs = ((MessageDefinition_Focus) other);
        return (((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this._max == rhs._max)||((this._max!= null)&&this._max.equals(rhs._max))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._min == rhs._min)||((this._min!= null)&&this._min.equals(rhs._min))));
    }

}
