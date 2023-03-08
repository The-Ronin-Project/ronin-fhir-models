
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "lockedDate",
    "_lockedDate",
    "inactive",
    "_inactive",
    "include",
    "exclude"
})
@Generated("jsonschema2pojo")
public class ValueSet_Compose {

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
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lockedDate")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String lockedDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lockedDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lockedDate;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inactive")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean inactive;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inactive")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _inactive;
    /**
     * Include one or more codes from a code system or other value set(s).
     * (Required)
     * 
     */
    @JsonProperty("include")
    @JsonPropertyDescription("Include one or more codes from a code system or other value set(s).")
    private List<ValueSet_Include> include = new ArrayList<ValueSet_Include>();
    /**
     * Exclude one or more codes from the value set based on code system filters and/or other value sets.
     * 
     */
    @JsonProperty("exclude")
    @JsonPropertyDescription("Exclude one or more codes from the value set based on code system filters and/or other value sets.")
    private List<ValueSet_Include> exclude = new ArrayList<ValueSet_Include>();

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
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lockedDate")
    public String getLockedDate() {
        return lockedDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lockedDate")
    public void setLockedDate(String lockedDate) {
        this.lockedDate = lockedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lockedDate")
    public Element get_lockedDate() {
        return _lockedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lockedDate")
    public void set_lockedDate(Element _lockedDate) {
        this._lockedDate = _lockedDate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inactive")
    public Boolean getInactive() {
        return inactive;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inactive")
    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inactive")
    public Element get_inactive() {
        return _inactive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inactive")
    public void set_inactive(Element _inactive) {
        this._inactive = _inactive;
    }

    /**
     * Include one or more codes from a code system or other value set(s).
     * (Required)
     * 
     */
    @JsonProperty("include")
    public List<ValueSet_Include> getInclude() {
        return include;
    }

    /**
     * Include one or more codes from a code system or other value set(s).
     * (Required)
     * 
     */
    @JsonProperty("include")
    public void setInclude(List<ValueSet_Include> include) {
        this.include = include;
    }

    /**
     * Exclude one or more codes from the value set based on code system filters and/or other value sets.
     * 
     */
    @JsonProperty("exclude")
    public List<ValueSet_Include> getExclude() {
        return exclude;
    }

    /**
     * Exclude one or more codes from the value set based on code system filters and/or other value sets.
     * 
     */
    @JsonProperty("exclude")
    public void setExclude(List<ValueSet_Include> exclude) {
        this.exclude = exclude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValueSet_Compose.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("lockedDate");
        sb.append('=');
        sb.append(((this.lockedDate == null)?"<null>":this.lockedDate));
        sb.append(',');
        sb.append("_lockedDate");
        sb.append('=');
        sb.append(((this._lockedDate == null)?"<null>":this._lockedDate));
        sb.append(',');
        sb.append("inactive");
        sb.append('=');
        sb.append(((this.inactive == null)?"<null>":this.inactive));
        sb.append(',');
        sb.append("_inactive");
        sb.append('=');
        sb.append(((this._inactive == null)?"<null>":this._inactive));
        sb.append(',');
        sb.append("include");
        sb.append('=');
        sb.append(((this.include == null)?"<null>":this.include));
        sb.append(',');
        sb.append("exclude");
        sb.append('=');
        sb.append(((this.exclude == null)?"<null>":this.exclude));
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
        result = ((result* 31)+((this.include == null)? 0 :this.include.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.inactive == null)? 0 :this.inactive.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._lockedDate == null)? 0 :this._lockedDate.hashCode()));
        result = ((result* 31)+((this._inactive == null)? 0 :this._inactive.hashCode()));
        result = ((result* 31)+((this.lockedDate == null)? 0 :this.lockedDate.hashCode()));
        result = ((result* 31)+((this.exclude == null)? 0 :this.exclude.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueSet_Compose) == false) {
            return false;
        }
        ValueSet_Compose rhs = ((ValueSet_Compose) other);
        return ((((((((((this.include == rhs.include)||((this.include!= null)&&this.include.equals(rhs.include)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.inactive == rhs.inactive)||((this.inactive!= null)&&this.inactive.equals(rhs.inactive))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._lockedDate == rhs._lockedDate)||((this._lockedDate!= null)&&this._lockedDate.equals(rhs._lockedDate))))&&((this._inactive == rhs._inactive)||((this._inactive!= null)&&this._inactive.equals(rhs._inactive))))&&((this.lockedDate == rhs.lockedDate)||((this.lockedDate!= null)&&this.lockedDate.equals(rhs.lockedDate))))&&((this.exclude == rhs.exclude)||((this.exclude!= null)&&this.exclude.equals(rhs.exclude))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
