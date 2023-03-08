
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
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "cancelationReason",
    "serviceCategory",
    "serviceType",
    "specialty",
    "appointmentType",
    "reasonCode",
    "reasonReference",
    "priority",
    "_priority",
    "description",
    "_description",
    "supportingInformation",
    "start",
    "_start",
    "end",
    "_end",
    "minutesDuration",
    "_minutesDuration",
    "slot",
    "created",
    "_created",
    "comment",
    "_comment",
    "patientInstruction",
    "_patientInstruction",
    "basedOn",
    "participant",
    "requestedPeriod"
})
@Generated("jsonschema2pojo")
public class Appointment
    extends DomainResource
{

    /**
     * This is a Appointment resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Appointment resource")
    private String resourceType;
    /**
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.")
    private Appointment.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("cancelationReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept cancelationReason;
    /**
     * A broad categorization of the service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceCategory")
    @JsonPropertyDescription("A broad categorization of the service that is to be performed during this appointment.")
    private List<CodeableConcept> serviceCategory = new ArrayList<CodeableConcept>();
    /**
     * The specific service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("The specific service that is to be performed during this appointment.")
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
     * The coded reason that this appointment is being scheduled. This is more clinical than administrative.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("The coded reason that this appointment is being scheduled. This is more clinical than administrative.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double priority;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _priority;
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
     * Additional information to support the appointment provided when making the appointment.
     * 
     */
    @JsonProperty("supportingInformation")
    @JsonPropertyDescription("Additional information to support the appointment provided when making the appointment.")
    private List<Reference> supportingInformation = new ArrayList<Reference>();
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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("minutesDuration")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double minutesDuration;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minutesDuration")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minutesDuration;
    /**
     * The slots from the participants' schedules that will be filled by the appointment.
     * 
     */
    @JsonProperty("slot")
    @JsonPropertyDescription("The slots from the participants' schedules that will be filled by the appointment.")
    private List<Reference> slot = new ArrayList<Reference>();
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String created;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _created;
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
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String patientInstruction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patientInstruction;
    /**
     * The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * List of participants involved in the appointment.
     * (Required)
     * 
     */
    @JsonProperty("participant")
    @JsonPropertyDescription("List of participants involved in the appointment.")
    private List<Appointment_Participant> participant = new ArrayList<Appointment_Participant>();
    /**
     * A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within.
     * 
     * The duration (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.
     * 
     */
    @JsonProperty("requestedPeriod")
    @JsonPropertyDescription("A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within.\n\nThe duration (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.")
    private List<Period> requestedPeriod = new ArrayList<Period>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Appointment resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Appointment resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     * 
     */
    @JsonProperty("status")
    public Appointment.Status getStatus() {
        return status;
    }

    /**
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Appointment.Status status) {
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("cancelationReason")
    public CodeableConcept getCancelationReason() {
        return cancelationReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("cancelationReason")
    public void setCancelationReason(CodeableConcept cancelationReason) {
        this.cancelationReason = cancelationReason;
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
     * The specific service that is to be performed during this appointment.
     * 
     */
    @JsonProperty("serviceType")
    public List<CodeableConcept> getServiceType() {
        return serviceType;
    }

    /**
     * The specific service that is to be performed during this appointment.
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
     * The coded reason that this appointment is being scheduled. This is more clinical than administrative.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * The coded reason that this appointment is being scheduled. This is more clinical than administrative.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public Element get_priority() {
        return _priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public void set_priority(Element _priority) {
        this._priority = _priority;
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
     * Additional information to support the appointment provided when making the appointment.
     * 
     */
    @JsonProperty("supportingInformation")
    public List<Reference> getSupportingInformation() {
        return supportingInformation;
    }

    /**
     * Additional information to support the appointment provided when making the appointment.
     * 
     */
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(List<Reference> supportingInformation) {
        this.supportingInformation = supportingInformation;
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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("minutesDuration")
    public Double getMinutesDuration() {
        return minutesDuration;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("minutesDuration")
    public void setMinutesDuration(Double minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minutesDuration")
    public Element get_minutesDuration() {
        return _minutesDuration;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minutesDuration")
    public void set_minutesDuration(Element _minutesDuration) {
        this._minutesDuration = _minutesDuration;
    }

    /**
     * The slots from the participants' schedules that will be filled by the appointment.
     * 
     */
    @JsonProperty("slot")
    public List<Reference> getSlot() {
        return slot;
    }

    /**
     * The slots from the participants' schedules that will be filled by the appointment.
     * 
     */
    @JsonProperty("slot")
    public void setSlot(List<Reference> slot) {
        this.slot = slot;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public Element get_created() {
        return _created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public void set_created(Element _created) {
        this._created = _created;
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

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    public String getPatientInstruction() {
        return patientInstruction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    public void setPatientInstruction(String patientInstruction) {
        this.patientInstruction = patientInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    public Element get_patientInstruction() {
        return _patientInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    public void set_patientInstruction(Element _patientInstruction) {
        this._patientInstruction = _patientInstruction;
    }

    /**
     * The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * List of participants involved in the appointment.
     * (Required)
     * 
     */
    @JsonProperty("participant")
    public List<Appointment_Participant> getParticipant() {
        return participant;
    }

    /**
     * List of participants involved in the appointment.
     * (Required)
     * 
     */
    @JsonProperty("participant")
    public void setParticipant(List<Appointment_Participant> participant) {
        this.participant = participant;
    }

    /**
     * A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within.
     * 
     * The duration (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.
     * 
     */
    @JsonProperty("requestedPeriod")
    public List<Period> getRequestedPeriod() {
        return requestedPeriod;
    }

    /**
     * A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within.
     * 
     * The duration (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.
     * 
     */
    @JsonProperty("requestedPeriod")
    public void setRequestedPeriod(List<Period> requestedPeriod) {
        this.requestedPeriod = requestedPeriod;
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
        sb.append(Appointment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("cancelationReason");
        sb.append('=');
        sb.append(((this.cancelationReason == null)?"<null>":this.cancelationReason));
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
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("_priority");
        sb.append('=');
        sb.append(((this._priority == null)?"<null>":this._priority));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("supportingInformation");
        sb.append('=');
        sb.append(((this.supportingInformation == null)?"<null>":this.supportingInformation));
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
        sb.append("minutesDuration");
        sb.append('=');
        sb.append(((this.minutesDuration == null)?"<null>":this.minutesDuration));
        sb.append(',');
        sb.append("_minutesDuration");
        sb.append('=');
        sb.append(((this._minutesDuration == null)?"<null>":this._minutesDuration));
        sb.append(',');
        sb.append("slot");
        sb.append('=');
        sb.append(((this.slot == null)?"<null>":this.slot));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
        sb.append(',');
        sb.append("patientInstruction");
        sb.append('=');
        sb.append(((this.patientInstruction == null)?"<null>":this.patientInstruction));
        sb.append(',');
        sb.append("_patientInstruction");
        sb.append('=');
        sb.append(((this._patientInstruction == null)?"<null>":this._patientInstruction));
        sb.append(',');
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("participant");
        sb.append('=');
        sb.append(((this.participant == null)?"<null>":this.participant));
        sb.append(',');
        sb.append("requestedPeriod");
        sb.append('=');
        sb.append(((this.requestedPeriod == null)?"<null>":this.requestedPeriod));
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
        result = ((result* 31)+((this.specialty == null)? 0 :this.specialty.hashCode()));
        result = ((result* 31)+((this._start == null)? 0 :this._start.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.requestedPeriod == null)? 0 :this.requestedPeriod.hashCode()));
        result = ((result* 31)+((this.minutesDuration == null)? 0 :this.minutesDuration.hashCode()));
        result = ((result* 31)+((this.slot == null)? 0 :this.slot.hashCode()));
        result = ((result* 31)+((this.serviceCategory == null)? 0 :this.serviceCategory.hashCode()));
        result = ((result* 31)+((this.participant == null)? 0 :this.participant.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this._patientInstruction == null)? 0 :this._patientInstruction.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.appointmentType == null)? 0 :this.appointmentType.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.supportingInformation == null)? 0 :this.supportingInformation.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this._minutesDuration == null)? 0 :this._minutesDuration.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this._end == null)? 0 :this._end.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.cancelationReason == null)? 0 :this.cancelationReason.hashCode()));
        result = ((result* 31)+((this.patientInstruction == null)? 0 :this.patientInstruction.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Appointment) == false) {
            return false;
        }
        Appointment rhs = ((Appointment) other);
        return (((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType))))&&((this.specialty == rhs.specialty)||((this.specialty!= null)&&this.specialty.equals(rhs.specialty))))&&((this._start == rhs._start)||((this._start!= null)&&this._start.equals(rhs._start))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.requestedPeriod == rhs.requestedPeriod)||((this.requestedPeriod!= null)&&this.requestedPeriod.equals(rhs.requestedPeriod))))&&((this.minutesDuration == rhs.minutesDuration)||((this.minutesDuration!= null)&&this.minutesDuration.equals(rhs.minutesDuration))))&&((this.slot == rhs.slot)||((this.slot!= null)&&this.slot.equals(rhs.slot))))&&((this.serviceCategory == rhs.serviceCategory)||((this.serviceCategory!= null)&&this.serviceCategory.equals(rhs.serviceCategory))))&&((this.participant == rhs.participant)||((this.participant!= null)&&this.participant.equals(rhs.participant))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this._patientInstruction == rhs._patientInstruction)||((this._patientInstruction!= null)&&this._patientInstruction.equals(rhs._patientInstruction))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.appointmentType == rhs.appointmentType)||((this.appointmentType!= null)&&this.appointmentType.equals(rhs.appointmentType))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.supportingInformation == rhs.supportingInformation)||((this.supportingInformation!= null)&&this.supportingInformation.equals(rhs.supportingInformation))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this._minutesDuration == rhs._minutesDuration)||((this._minutesDuration!= null)&&this._minutesDuration.equals(rhs._minutesDuration))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this._end == rhs._end)||((this._end!= null)&&this._end.equals(rhs._end))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.cancelationReason == rhs.cancelationReason)||((this.cancelationReason!= null)&&this.cancelationReason.equals(rhs.cancelationReason))))&&((this.patientInstruction == rhs.patientInstruction)||((this.patientInstruction!= null)&&this.patientInstruction.equals(rhs.patientInstruction))));
    }


    /**
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PROPOSED("proposed"),
        PENDING("pending"),
        BOOKED("booked"),
        ARRIVED("arrived"),
        FULFILLED("fulfilled"),
        CANCELLED("cancelled"),
        NOSHOW("noshow"),
        ENTERED_IN_ERROR("entered-in-error"),
        CHECKED_IN("checked-in"),
        WAITLIST("waitlist");
        private final String value;
        private final static Map<String, Appointment.Status> CONSTANTS = new HashMap<String, Appointment.Status>();

        static {
            for (Appointment.Status c: values()) {
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
        public static Appointment.Status fromValue(String value) {
            Appointment.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
