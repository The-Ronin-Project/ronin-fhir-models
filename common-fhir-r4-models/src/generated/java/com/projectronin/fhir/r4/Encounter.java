
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
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "statusHistory",
    "class",
    "classHistory",
    "type",
    "serviceType",
    "priority",
    "subject",
    "episodeOfCare",
    "basedOn",
    "participant",
    "appointment",
    "period",
    "length",
    "reasonCode",
    "reasonReference",
    "diagnosis",
    "account",
    "hospitalization",
    "location",
    "serviceProvider",
    "partOf"
})
@Generated("jsonschema2pojo")
public class Encounter
    extends DomainResource
{

    /**
     * This is a Encounter resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Encounter resource")
    private String resourceType;
    /**
     * Identifier(s) by which this encounter is known.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier(s) by which this encounter is known.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("planned | arrived | triaged | in-progress | onleave | finished | cancelled +.")
    private Encounter.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
     * 
     */
    @JsonProperty("statusHistory")
    @JsonPropertyDescription("The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.")
    private List<Encounter_StatusHistory> statusHistory = new ArrayList<Encounter_StatusHistory>();
    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("class")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding _class;
    /**
     * The class history permits the tracking of the encounters transitions without needing to go  through the resource history.  This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
     * 
     */
    @JsonProperty("classHistory")
    @JsonPropertyDescription("The class history permits the tracking of the encounters transitions without needing to go  through the resource history.  This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.")
    private List<Encounter_ClassHistory> classHistory = new ArrayList<Encounter_ClassHistory>();
    /**
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept serviceType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept priority;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
     * 
     */
    @JsonProperty("episodeOfCare")
    @JsonPropertyDescription("Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).")
    private List<Reference> episodeOfCare = new ArrayList<Reference>();
    /**
     * The request this encounter satisfies (e.g. incoming referral or procedure request).
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("The request this encounter satisfies (e.g. incoming referral or procedure request).")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * The list of people responsible for providing the service.
     * 
     */
    @JsonProperty("participant")
    @JsonPropertyDescription("The list of people responsible for providing the service.")
    private List<Encounter_Participant> participant = new ArrayList<Encounter_Participant>();
    /**
     * The appointment that scheduled this encounter.
     * 
     */
    @JsonProperty("appointment")
    @JsonPropertyDescription("The appointment that scheduled this encounter.")
    private List<Reference> appointment = new ArrayList<Reference>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("A length of time.")
    private Duration length;
    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * The list of diagnosis relevant to this encounter.
     * 
     */
    @JsonProperty("diagnosis")
    @JsonPropertyDescription("The list of diagnosis relevant to this encounter.")
    private List<Encounter_Diagnosis> diagnosis = new ArrayList<Encounter_Diagnosis>();
    /**
     * The set of accounts that may be used for billing for this Encounter.
     * 
     */
    @JsonProperty("account")
    @JsonPropertyDescription("The set of accounts that may be used for billing for this Encounter.")
    private List<Reference> account = new ArrayList<Reference>();
    /**
     * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
     * 
     */
    @JsonProperty("hospitalization")
    @JsonPropertyDescription("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.")
    private Encounter_Hospitalization hospitalization;
    /**
     * List of locations where  the patient has been during this encounter.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("List of locations where  the patient has been during this encounter.")
    private List<Encounter_Location> location = new ArrayList<Encounter_Location>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("serviceProvider")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference serviceProvider;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference partOf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Encounter resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Encounter resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifier(s) by which this encounter is known.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifier(s) by which this encounter is known.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
     * 
     */
    @JsonProperty("status")
    public Encounter.Status getStatus() {
        return status;
    }

    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Encounter.Status status) {
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
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
     * 
     */
    @JsonProperty("statusHistory")
    public List<Encounter_StatusHistory> getStatusHistory() {
        return statusHistory;
    }

    /**
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
     * 
     */
    @JsonProperty("statusHistory")
    public void setStatusHistory(List<Encounter_StatusHistory> statusHistory) {
        this.statusHistory = statusHistory;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("class")
    public Coding getClass_() {
        return _class;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("class")
    public void setClass_(Coding _class) {
        this._class = _class;
    }

    /**
     * The class history permits the tracking of the encounters transitions without needing to go  through the resource history.  This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
     * 
     */
    @JsonProperty("classHistory")
    public List<Encounter_ClassHistory> getClassHistory() {
        return classHistory;
    }

    /**
     * The class history permits the tracking of the encounters transitions without needing to go  through the resource history.  This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
     * 
     */
    @JsonProperty("classHistory")
    public void setClassHistory(List<Encounter_ClassHistory> classHistory) {
        this.classHistory = classHistory;
    }

    /**
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("serviceType")
    public CodeableConcept getServiceType() {
        return serviceType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(CodeableConcept serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(CodeableConcept priority) {
        this.priority = priority;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
     * 
     */
    @JsonProperty("episodeOfCare")
    public List<Reference> getEpisodeOfCare() {
        return episodeOfCare;
    }

    /**
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
     * 
     */
    @JsonProperty("episodeOfCare")
    public void setEpisodeOfCare(List<Reference> episodeOfCare) {
        this.episodeOfCare = episodeOfCare;
    }

    /**
     * The request this encounter satisfies (e.g. incoming referral or procedure request).
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * The request this encounter satisfies (e.g. incoming referral or procedure request).
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * The list of people responsible for providing the service.
     * 
     */
    @JsonProperty("participant")
    public List<Encounter_Participant> getParticipant() {
        return participant;
    }

    /**
     * The list of people responsible for providing the service.
     * 
     */
    @JsonProperty("participant")
    public void setParticipant(List<Encounter_Participant> participant) {
        this.participant = participant;
    }

    /**
     * The appointment that scheduled this encounter.
     * 
     */
    @JsonProperty("appointment")
    public List<Reference> getAppointment() {
        return appointment;
    }

    /**
     * The appointment that scheduled this encounter.
     * 
     */
    @JsonProperty("appointment")
    public void setAppointment(List<Reference> appointment) {
        this.appointment = appointment;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("length")
    public Duration getLength() {
        return length;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("length")
    public void setLength(Duration length) {
        this.length = length;
    }

    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * The list of diagnosis relevant to this encounter.
     * 
     */
    @JsonProperty("diagnosis")
    public List<Encounter_Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    /**
     * The list of diagnosis relevant to this encounter.
     * 
     */
    @JsonProperty("diagnosis")
    public void setDiagnosis(List<Encounter_Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * The set of accounts that may be used for billing for this Encounter.
     * 
     */
    @JsonProperty("account")
    public List<Reference> getAccount() {
        return account;
    }

    /**
     * The set of accounts that may be used for billing for this Encounter.
     * 
     */
    @JsonProperty("account")
    public void setAccount(List<Reference> account) {
        this.account = account;
    }

    /**
     * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
     * 
     */
    @JsonProperty("hospitalization")
    public Encounter_Hospitalization getHospitalization() {
        return hospitalization;
    }

    /**
     * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
     * 
     */
    @JsonProperty("hospitalization")
    public void setHospitalization(Encounter_Hospitalization hospitalization) {
        this.hospitalization = hospitalization;
    }

    /**
     * List of locations where  the patient has been during this encounter.
     * 
     */
    @JsonProperty("location")
    public List<Encounter_Location> getLocation() {
        return location;
    }

    /**
     * List of locations where  the patient has been during this encounter.
     * 
     */
    @JsonProperty("location")
    public void setLocation(List<Encounter_Location> location) {
        this.location = location;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("serviceProvider")
    public Reference getServiceProvider() {
        return serviceProvider;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("serviceProvider")
    public void setServiceProvider(Reference serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    public Reference getPartOf() {
        return partOf;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(Reference partOf) {
        this.partOf = partOf;
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
        sb.append(Encounter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("statusHistory");
        sb.append('=');
        sb.append(((this.statusHistory == null)?"<null>":this.statusHistory));
        sb.append(',');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("classHistory");
        sb.append('=');
        sb.append(((this.classHistory == null)?"<null>":this.classHistory));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("episodeOfCare");
        sb.append('=');
        sb.append(((this.episodeOfCare == null)?"<null>":this.episodeOfCare));
        sb.append(',');
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("participant");
        sb.append('=');
        sb.append(((this.participant == null)?"<null>":this.participant));
        sb.append(',');
        sb.append("appointment");
        sb.append('=');
        sb.append(((this.appointment == null)?"<null>":this.appointment));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("diagnosis");
        sb.append('=');
        sb.append(((this.diagnosis == null)?"<null>":this.diagnosis));
        sb.append(',');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
        sb.append(',');
        sb.append("hospitalization");
        sb.append('=');
        sb.append(((this.hospitalization == null)?"<null>":this.hospitalization));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("serviceProvider");
        sb.append('=');
        sb.append(((this.serviceProvider == null)?"<null>":this.serviceProvider));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.appointment == null)? 0 :this.appointment.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.participant == null)? 0 :this.participant.hashCode()));
        result = ((result* 31)+((this.episodeOfCare == null)? 0 :this.episodeOfCare.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.classHistory == null)? 0 :this.classHistory.hashCode()));
        result = ((result* 31)+((this.hospitalization == null)? 0 :this.hospitalization.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.diagnosis == null)? 0 :this.diagnosis.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.statusHistory == null)? 0 :this.statusHistory.hashCode()));
        result = ((result* 31)+((this.serviceProvider == null)? 0 :this.serviceProvider.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
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
        if ((other instanceof Encounter) == false) {
            return false;
        }
        Encounter rhs = ((Encounter) other);
        return ((((((((((((((((((((((((((super.equals(rhs)&&((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.appointment == rhs.appointment)||((this.appointment!= null)&&this.appointment.equals(rhs.appointment))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.participant == rhs.participant)||((this.participant!= null)&&this.participant.equals(rhs.participant))))&&((this.episodeOfCare == rhs.episodeOfCare)||((this.episodeOfCare!= null)&&this.episodeOfCare.equals(rhs.episodeOfCare))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.classHistory == rhs.classHistory)||((this.classHistory!= null)&&this.classHistory.equals(rhs.classHistory))))&&((this.hospitalization == rhs.hospitalization)||((this.hospitalization!= null)&&this.hospitalization.equals(rhs.hospitalization))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.diagnosis == rhs.diagnosis)||((this.diagnosis!= null)&&this.diagnosis.equals(rhs.diagnosis))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.statusHistory == rhs.statusHistory)||((this.statusHistory!= null)&&this.statusHistory.equals(rhs.statusHistory))))&&((this.serviceProvider == rhs.serviceProvider)||((this.serviceProvider!= null)&&this.serviceProvider.equals(rhs.serviceProvider))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PLANNED("planned"),
        ARRIVED("arrived"),
        TRIAGED("triaged"),
        IN_PROGRESS("in-progress"),
        ONLEAVE("onleave"),
        FINISHED("finished"),
        CANCELLED("cancelled"),
        ENTERED_IN_ERROR("entered-in-error"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Encounter.Status> CONSTANTS = new HashMap<String, Encounter.Status>();

        static {
            for (Encounter.Status c: values()) {
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
        public static Encounter.Status fromValue(String value) {
            Encounter.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
