
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A slot of time on a schedule that may be available for booking appointments.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "serviceCategory",
    "serviceType",
    "specialty",
    "appointmentType",
    "schedule",
    "status",
    "_status",
    "start",
    "_start",
    "end",
    "_end",
    "overbooked",
    "_overbooked",
    "comment",
    "_comment"
})
@Generated("jsonschema2pojo")
public class Slot
    extends DomainResource
{

    /**
     * This is a Slot resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Slot resource")
    private String resourceType;
    /**
     * External Ids for this item.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("External Ids for this item.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A broad categorization of the service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceCategory")
    @JsonPropertyDescription("A broad categorization of the service that is to be performed during this appointment.")
    private List<CodeableConcept> serviceCategory = new ArrayList<CodeableConcept>();
    /**
     * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.")
    private List<CodeableConcept> serviceType = new ArrayList<CodeableConcept>();
    /**
     * The specialty of a practitioner that would be required to perform the service requested in this appointment.
     * 
     */
    @JsonProperty("specialty")
    @JsonPropertyDescription("The specialty of a practitioner that would be required to perform the service requested in this appointment.")
    private List<CodeableConcept> specialty = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("appointmentType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept appointmentType;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("schedule")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference schedule;
    /**
     * busy | free | busy-unavailable | busy-tentative | entered-in-error.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("busy | free | busy-unavailable | busy-tentative | entered-in-error.")
    private Slot.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String start;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _start;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("end")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String end;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _end;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("overbooked")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean overbooked;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_overbooked")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _overbooked;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String comment;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Slot resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Slot resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * External Ids for this item.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * External Ids for this item.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A broad categorization of the service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceCategory")
    public List<CodeableConcept> getServiceCategory() {
        return serviceCategory;
    }

    /**
     * A broad categorization of the service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceCategory")
    public void setServiceCategory(List<CodeableConcept> serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    /**
     * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
     * 
     */
    @JsonProperty("serviceType")
    public List<CodeableConcept> getServiceType() {
        return serviceType;
    }

    /**
     * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(List<CodeableConcept> serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * The specialty of a practitioner that would be required to perform the service requested in this appointment.
     * 
     */
    @JsonProperty("specialty")
    public List<CodeableConcept> getSpecialty() {
        return specialty;
    }

    /**
     * The specialty of a practitioner that would be required to perform the service requested in this appointment.
     * 
     */
    @JsonProperty("specialty")
    public void setSpecialty(List<CodeableConcept> specialty) {
        this.specialty = specialty;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("appointmentType")
    public CodeableConcept getAppointmentType() {
        return appointmentType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("appointmentType")
    public void setAppointmentType(CodeableConcept appointmentType) {
        this.appointmentType = appointmentType;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("schedule")
    public Reference getSchedule() {
        return schedule;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("schedule")
    public void setSchedule(Reference schedule) {
        this.schedule = schedule;
    }

    /**
     * busy | free | busy-unavailable | busy-tentative | entered-in-error.
     * 
     */
    @JsonProperty("status")
    public Slot.Status getStatus() {
        return status;
    }

    /**
     * busy | free | busy-unavailable | busy-tentative | entered-in-error.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Slot.Status status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    public Element get_start() {
        return _start;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    public void set_start(Element _start) {
        this._start = _start;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    public Element get_end() {
        return _end;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    public void set_end(Element _end) {
        this._end = _end;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("overbooked")
    public Boolean getOverbooked() {
        return overbooked;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("overbooked")
    public void setOverbooked(Boolean overbooked) {
        this.overbooked = overbooked;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_overbooked")
    public Element get_overbooked() {
        return _overbooked;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_overbooked")
    public void set_overbooked(Element _overbooked) {
        this._overbooked = _overbooked;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public Element get_comment() {
        return _comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public void set_comment(Element _comment) {
        this._comment = _comment;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Slot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("serviceCategory");
        sb.append('=');
        sb.append(((this.serviceCategory == null)?"<null>":this.serviceCategory));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("specialty");
        sb.append('=');
        sb.append(((this.specialty == null)?"<null>":this.specialty));
        sb.append(',');
        sb.append("appointmentType");
        sb.append('=');
        sb.append(((this.appointmentType == null)?"<null>":this.appointmentType));
        sb.append(',');
        sb.append("schedule");
        sb.append('=');
        sb.append(((this.schedule == null)?"<null>":this.schedule));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("_start");
        sb.append('=');
        sb.append(((this._start == null)?"<null>":this._start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        sb.append("_end");
        sb.append('=');
        sb.append(((this._end == null)?"<null>":this._end));
        sb.append(',');
        sb.append("overbooked");
        sb.append('=');
        sb.append(((this.overbooked == null)?"<null>":this.overbooked));
        sb.append(',');
        sb.append("_overbooked");
        sb.append('=');
        sb.append(((this._overbooked == null)?"<null>":this._overbooked));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.appointmentType == null)? 0 :this.appointmentType.hashCode()));
        result = ((result* 31)+((this.specialty == null)? 0 :this.specialty.hashCode()));
        result = ((result* 31)+((this._start == null)? 0 :this._start.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.serviceCategory == null)? 0 :this.serviceCategory.hashCode()));
        result = ((result* 31)+((this._end == null)? 0 :this._end.hashCode()));
        result = ((result* 31)+((this.schedule == null)? 0 :this.schedule.hashCode()));
        result = ((result* 31)+((this._overbooked == null)? 0 :this._overbooked.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this.overbooked == null)? 0 :this.overbooked.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Slot) == false) {
            return false;
        }
        Slot rhs = ((Slot) other);
        return ((((((((((((((((((super.equals(rhs)&&((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.appointmentType == rhs.appointmentType)||((this.appointmentType!= null)&&this.appointmentType.equals(rhs.appointmentType))))&&((this.specialty == rhs.specialty)||((this.specialty!= null)&&this.specialty.equals(rhs.specialty))))&&((this._start == rhs._start)||((this._start!= null)&&this._start.equals(rhs._start))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.serviceCategory == rhs.serviceCategory)||((this.serviceCategory!= null)&&this.serviceCategory.equals(rhs.serviceCategory))))&&((this._end == rhs._end)||((this._end!= null)&&this._end.equals(rhs._end))))&&((this.schedule == rhs.schedule)||((this.schedule!= null)&&this.schedule.equals(rhs.schedule))))&&((this._overbooked == rhs._overbooked)||((this._overbooked!= null)&&this._overbooked.equals(rhs._overbooked))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this.overbooked == rhs.overbooked)||((this.overbooked!= null)&&this.overbooked.equals(rhs.overbooked))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * busy | free | busy-unavailable | busy-tentative | entered-in-error.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        BUSY("busy"),
        FREE("free"),
        BUSY_UNAVAILABLE("busy-unavailable"),
        BUSY_TENTATIVE("busy-tentative"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, Slot.Status> CONSTANTS = new HashMap<String, Slot.Status>();

        static {
            for (Slot.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static Slot.Status fromValue(String value) {
            Slot.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
