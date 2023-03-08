
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "appointment",
    "start",
    "_start",
    "end",
    "_end",
    "participantType",
    "actor",
    "participantStatus",
    "_participantStatus",
    "comment",
    "_comment"
})
@Generated("jsonschema2pojo")
public class AppointmentResponse
    extends DomainResource
{

    /**
     * This is a AppointmentResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a AppointmentResponse resource")
    private String resourceType;
    /**
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("appointment")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference appointment;
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
     * Role of participant in the appointment.
     * 
     */
    @JsonProperty("participantType")
    @JsonPropertyDescription("Role of participant in the appointment.")
    private List<CodeableConcept> participantType = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("actor")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference actor;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("participantStatus")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String participantStatus;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantStatus")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _participantStatus;
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
     * This is a AppointmentResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a AppointmentResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("appointment")
    public Reference getAppointment() {
        return appointment;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("appointment")
    public void setAppointment(Reference appointment) {
        this.appointment = appointment;
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
     * Role of participant in the appointment.
     * 
     */
    @JsonProperty("participantType")
    public List<CodeableConcept> getParticipantType() {
        return participantType;
    }

    /**
     * Role of participant in the appointment.
     * 
     */
    @JsonProperty("participantType")
    public void setParticipantType(List<CodeableConcept> participantType) {
        this.participantType = participantType;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("actor")
    public Reference getActor() {
        return actor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("actor")
    public void setActor(Reference actor) {
        this.actor = actor;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("participantStatus")
    public String getParticipantStatus() {
        return participantStatus;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("participantStatus")
    public void setParticipantStatus(String participantStatus) {
        this.participantStatus = participantStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantStatus")
    public Element get_participantStatus() {
        return _participantStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantStatus")
    public void set_participantStatus(Element _participantStatus) {
        this._participantStatus = _participantStatus;
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
        sb.append(AppointmentResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("appointment");
        sb.append('=');
        sb.append(((this.appointment == null)?"<null>":this.appointment));
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
        sb.append("participantType");
        sb.append('=');
        sb.append(((this.participantType == null)?"<null>":this.participantType));
        sb.append(',');
        sb.append("actor");
        sb.append('=');
        sb.append(((this.actor == null)?"<null>":this.actor));
        sb.append(',');
        sb.append("participantStatus");
        sb.append('=');
        sb.append(((this.participantStatus == null)?"<null>":this.participantStatus));
        sb.append(',');
        sb.append("_participantStatus");
        sb.append('=');
        sb.append(((this._participantStatus == null)?"<null>":this._participantStatus));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._start == null)? 0 :this._start.hashCode()));
        result = ((result* 31)+((this._participantStatus == null)? 0 :this._participantStatus.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.participantType == null)? 0 :this.participantType.hashCode()));
        result = ((result* 31)+((this.appointment == null)? 0 :this.appointment.hashCode()));
        result = ((result* 31)+((this._end == null)? 0 :this._end.hashCode()));
        result = ((result* 31)+((this.actor == null)? 0 :this.actor.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.participantStatus == null)? 0 :this.participantStatus.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppointmentResponse) == false) {
            return false;
        }
        AppointmentResponse rhs = ((AppointmentResponse) other);
        return ((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._start == rhs._start)||((this._start!= null)&&this._start.equals(rhs._start))))&&((this._participantStatus == rhs._participantStatus)||((this._participantStatus!= null)&&this._participantStatus.equals(rhs._participantStatus))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this.participantType == rhs.participantType)||((this.participantType!= null)&&this.participantType.equals(rhs.participantType))))&&((this.appointment == rhs.appointment)||((this.appointment!= null)&&this.appointment.equals(rhs.appointment))))&&((this._end == rhs._end)||((this._end!= null)&&this._end.equals(rhs._end))))&&((this.actor == rhs.actor)||((this.actor!= null)&&this.actor.equals(rhs.actor))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.participantStatus == rhs.participantStatus)||((this.participantStatus!= null)&&this.participantStatus.equals(rhs.participantStatus))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
