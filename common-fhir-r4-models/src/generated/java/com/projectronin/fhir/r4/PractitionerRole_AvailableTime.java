
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "daysOfWeek",
    "_daysOfWeek",
    "allDay",
    "_allDay",
    "availableStartTime",
    "_availableStartTime",
    "availableEndTime",
    "_availableEndTime"
})
@Generated("jsonschema2pojo")
public class PractitionerRole_AvailableTime {

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
     * Indicates which days of the week are available between the start and end Times.
     * 
     */
    @JsonProperty("daysOfWeek")
    @JsonPropertyDescription("Indicates which days of the week are available between the start and end Times.")
    private List<String> daysOfWeek = new ArrayList<String>();
    /**
     * Extensions for daysOfWeek
     * 
     */
    @JsonProperty("_daysOfWeek")
    @JsonPropertyDescription("Extensions for daysOfWeek")
    private List<Element> _daysOfWeek = new ArrayList<Element>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allDay")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean allDay;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allDay")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _allDay;
    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("availableStartTime")
    @JsonPropertyDescription("A time during the day, with no date specified")
    private String availableStartTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availableStartTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _availableStartTime;
    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("availableEndTime")
    @JsonPropertyDescription("A time during the day, with no date specified")
    private String availableEndTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availableEndTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _availableEndTime;

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
     * Indicates which days of the week are available between the start and end Times.
     * 
     */
    @JsonProperty("daysOfWeek")
    public List<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Indicates which days of the week are available between the start and end Times.
     * 
     */
    @JsonProperty("daysOfWeek")
    public void setDaysOfWeek(List<String> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    /**
     * Extensions for daysOfWeek
     * 
     */
    @JsonProperty("_daysOfWeek")
    public List<Element> get_daysOfWeek() {
        return _daysOfWeek;
    }

    /**
     * Extensions for daysOfWeek
     * 
     */
    @JsonProperty("_daysOfWeek")
    public void set_daysOfWeek(List<Element> _daysOfWeek) {
        this._daysOfWeek = _daysOfWeek;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allDay")
    public Boolean getAllDay() {
        return allDay;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allDay")
    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allDay")
    public Element get_allDay() {
        return _allDay;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allDay")
    public void set_allDay(Element _allDay) {
        this._allDay = _allDay;
    }

    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("availableStartTime")
    public String getAvailableStartTime() {
        return availableStartTime;
    }

    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("availableStartTime")
    public void setAvailableStartTime(String availableStartTime) {
        this.availableStartTime = availableStartTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availableStartTime")
    public Element get_availableStartTime() {
        return _availableStartTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availableStartTime")
    public void set_availableStartTime(Element _availableStartTime) {
        this._availableStartTime = _availableStartTime;
    }

    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("availableEndTime")
    public String getAvailableEndTime() {
        return availableEndTime;
    }

    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("availableEndTime")
    public void setAvailableEndTime(String availableEndTime) {
        this.availableEndTime = availableEndTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availableEndTime")
    public Element get_availableEndTime() {
        return _availableEndTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_availableEndTime")
    public void set_availableEndTime(Element _availableEndTime) {
        this._availableEndTime = _availableEndTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PractitionerRole_AvailableTime.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("daysOfWeek");
        sb.append('=');
        sb.append(((this.daysOfWeek == null)?"<null>":this.daysOfWeek));
        sb.append(',');
        sb.append("_daysOfWeek");
        sb.append('=');
        sb.append(((this._daysOfWeek == null)?"<null>":this._daysOfWeek));
        sb.append(',');
        sb.append("allDay");
        sb.append('=');
        sb.append(((this.allDay == null)?"<null>":this.allDay));
        sb.append(',');
        sb.append("_allDay");
        sb.append('=');
        sb.append(((this._allDay == null)?"<null>":this._allDay));
        sb.append(',');
        sb.append("availableStartTime");
        sb.append('=');
        sb.append(((this.availableStartTime == null)?"<null>":this.availableStartTime));
        sb.append(',');
        sb.append("_availableStartTime");
        sb.append('=');
        sb.append(((this._availableStartTime == null)?"<null>":this._availableStartTime));
        sb.append(',');
        sb.append("availableEndTime");
        sb.append('=');
        sb.append(((this.availableEndTime == null)?"<null>":this.availableEndTime));
        sb.append(',');
        sb.append("_availableEndTime");
        sb.append('=');
        sb.append(((this._availableEndTime == null)?"<null>":this._availableEndTime));
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
        result = ((result* 31)+((this._allDay == null)? 0 :this._allDay.hashCode()));
        result = ((result* 31)+((this._availableStartTime == null)? 0 :this._availableStartTime.hashCode()));
        result = ((result* 31)+((this.allDay == null)? 0 :this.allDay.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.availableEndTime == null)? 0 :this.availableEndTime.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.daysOfWeek == null)? 0 :this.daysOfWeek.hashCode()));
        result = ((result* 31)+((this._daysOfWeek == null)? 0 :this._daysOfWeek.hashCode()));
        result = ((result* 31)+((this.availableStartTime == null)? 0 :this.availableStartTime.hashCode()));
        result = ((result* 31)+((this._availableEndTime == null)? 0 :this._availableEndTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PractitionerRole_AvailableTime) == false) {
            return false;
        }
        PractitionerRole_AvailableTime rhs = ((PractitionerRole_AvailableTime) other);
        return ((((((((((((this._allDay == rhs._allDay)||((this._allDay!= null)&&this._allDay.equals(rhs._allDay)))&&((this._availableStartTime == rhs._availableStartTime)||((this._availableStartTime!= null)&&this._availableStartTime.equals(rhs._availableStartTime))))&&((this.allDay == rhs.allDay)||((this.allDay!= null)&&this.allDay.equals(rhs.allDay))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.availableEndTime == rhs.availableEndTime)||((this.availableEndTime!= null)&&this.availableEndTime.equals(rhs.availableEndTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.daysOfWeek == rhs.daysOfWeek)||((this.daysOfWeek!= null)&&this.daysOfWeek.equals(rhs.daysOfWeek))))&&((this._daysOfWeek == rhs._daysOfWeek)||((this._daysOfWeek!= null)&&this._daysOfWeek.equals(rhs._daysOfWeek))))&&((this.availableStartTime == rhs.availableStartTime)||((this.availableStartTime!= null)&&this.availableStartTime.equals(rhs.availableStartTime))))&&((this._availableEndTime == rhs._availableEndTime)||((this._availableEndTime!= null)&&this._availableEndTime.equals(rhs._availableEndTime))));
    }

}
