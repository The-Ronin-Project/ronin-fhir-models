
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
    "daysOfWeek",
    "_daysOfWeek",
    "allDay",
    "_allDay",
    "openingTime",
    "_openingTime",
    "closingTime",
    "_closingTime"
})
@Generated("jsonschema2pojo")
public class Location_HoursOfOperation {

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
    @JsonProperty("openingTime")
    @JsonPropertyDescription("A time during the day, with no date specified")
    private String openingTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_openingTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _openingTime;
    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("closingTime")
    @JsonPropertyDescription("A time during the day, with no date specified")
    private String closingTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_closingTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _closingTime;

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
    @JsonProperty("openingTime")
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("openingTime")
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_openingTime")
    public Element get_openingTime() {
        return _openingTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_openingTime")
    public void set_openingTime(Element _openingTime) {
        this._openingTime = _openingTime;
    }

    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("closingTime")
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * A time during the day, with no date specified
     * 
     */
    @JsonProperty("closingTime")
    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_closingTime")
    public Element get_closingTime() {
        return _closingTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_closingTime")
    public void set_closingTime(Element _closingTime) {
        this._closingTime = _closingTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Location_HoursOfOperation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("openingTime");
        sb.append('=');
        sb.append(((this.openingTime == null)?"<null>":this.openingTime));
        sb.append(',');
        sb.append("_openingTime");
        sb.append('=');
        sb.append(((this._openingTime == null)?"<null>":this._openingTime));
        sb.append(',');
        sb.append("closingTime");
        sb.append('=');
        sb.append(((this.closingTime == null)?"<null>":this.closingTime));
        sb.append(',');
        sb.append("_closingTime");
        sb.append('=');
        sb.append(((this._closingTime == null)?"<null>":this._closingTime));
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
        result = ((result* 31)+((this._closingTime == null)? 0 :this._closingTime.hashCode()));
        result = ((result* 31)+((this.allDay == null)? 0 :this.allDay.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.closingTime == null)? 0 :this.closingTime.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.openingTime == null)? 0 :this.openingTime.hashCode()));
        result = ((result* 31)+((this._openingTime == null)? 0 :this._openingTime.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.daysOfWeek == null)? 0 :this.daysOfWeek.hashCode()));
        result = ((result* 31)+((this._daysOfWeek == null)? 0 :this._daysOfWeek.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location_HoursOfOperation) == false) {
            return false;
        }
        Location_HoursOfOperation rhs = ((Location_HoursOfOperation) other);
        return ((((((((((((this._allDay == rhs._allDay)||((this._allDay!= null)&&this._allDay.equals(rhs._allDay)))&&((this._closingTime == rhs._closingTime)||((this._closingTime!= null)&&this._closingTime.equals(rhs._closingTime))))&&((this.allDay == rhs.allDay)||((this.allDay!= null)&&this.allDay.equals(rhs.allDay))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.closingTime == rhs.closingTime)||((this.closingTime!= null)&&this.closingTime.equals(rhs.closingTime))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.openingTime == rhs.openingTime)||((this.openingTime!= null)&&this.openingTime.equals(rhs.openingTime))))&&((this._openingTime == rhs._openingTime)||((this._openingTime!= null)&&this._openingTime.equals(rhs._openingTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.daysOfWeek == rhs.daysOfWeek)||((this.daysOfWeek!= null)&&this.daysOfWeek.equals(rhs.daysOfWeek))))&&((this._daysOfWeek == rhs._daysOfWeek)||((this._daysOfWeek!= null)&&this._daysOfWeek.equals(rhs._daysOfWeek))));
    }

}
