
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
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "statusReason",
    "intent",
    "_intent",
    "category",
    "priority",
    "_priority",
    "doNotPerform",
    "_doNotPerform",
    "reportedBoolean",
    "_reportedBoolean",
    "reportedReference",
    "medicationCodeableConcept",
    "medicationReference",
    "subject",
    "encounter",
    "supportingInformation",
    "authoredOn",
    "_authoredOn",
    "requester",
    "performer",
    "performerType",
    "recorder",
    "reasonCode",
    "reasonReference",
    "instantiatesCanonical",
    "_instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "basedOn",
    "groupIdentifier",
    "courseOfTherapyType",
    "insurance",
    "note",
    "dosageInstruction",
    "dispenseRequest",
    "substitution",
    "priorPrescription",
    "detectedIssue",
    "eventHistory"
})
@Generated("jsonschema2pojo")
public class MedicationRequest
    extends DomainResource
{

    /**
     * This is a MedicationRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicationRequest resource")
    private String resourceType;
    /**
     * Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String status;
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
    @JsonProperty("statusReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept statusReason;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String intent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _intent;
    /**
     * Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String priority;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _priority;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean doNotPerform;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doNotPerform;
    /**
     * Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.
     * 
     */
    @JsonProperty("reportedBoolean")
    @JsonPropertyDescription("Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.")
    private Boolean reportedBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reportedBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _reportedBoolean;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reportedReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference reportedReference;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("medicationCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept medicationCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("medicationReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference medicationReference;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * Include additional information (for example, patient height and weight) that supports the ordering of the medication.
     * 
     */
    @JsonProperty("supportingInformation")
    @JsonPropertyDescription("Include additional information (for example, patient height and weight) that supports the ordering of the medication.")
    private List<Reference> supportingInformation = new ArrayList<Reference>();
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String authoredOn;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _authoredOn;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requester;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference performer;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept performerType;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recorder")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference recorder;
    /**
     * The reason or the indication for ordering or not ordering the medication.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("The reason or the indication for ordering or not ordering the medication.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Condition or observation that supports why the medication was ordered.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Condition or observation that supports why the medication was ordered.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * Extensions for instantiatesCanonical
     * 
     */
    @JsonProperty("_instantiatesCanonical")
    @JsonPropertyDescription("Extensions for instantiatesCanonical")
    private List<Element> _instantiatesCanonical = new ArrayList<Element>();
    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * A plan or request that is fulfilled in whole or in part by this medication request.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A plan or request that is fulfilled in whole or in part by this medication request.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("groupIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier groupIdentifier;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("courseOfTherapyType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept courseOfTherapyType;
    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.")
    private List<Reference> insurance = new ArrayList<Reference>();
    /**
     * Extra information about the prescription that could not be conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Extra information about the prescription that could not be conveyed by the other attributes.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Indicates how the medication is to be used by the patient.
     * 
     */
    @JsonProperty("dosageInstruction")
    @JsonPropertyDescription("Indicates how the medication is to be used by the patient.")
    private List<Dosage> dosageInstruction = new ArrayList<Dosage>();
    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("dispenseRequest")
    @JsonPropertyDescription("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.")
    private MedicationRequest_DispenseRequest dispenseRequest;
    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("substitution")
    @JsonPropertyDescription("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.")
    private MedicationRequest_Substitution substitution;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("priorPrescription")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference priorPrescription;
    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
     * 
     */
    @JsonProperty("detectedIssue")
    @JsonPropertyDescription("Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.")
    private List<Reference> detectedIssue = new ArrayList<Reference>();
    /**
     * Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
     * 
     */
    @JsonProperty("eventHistory")
    @JsonPropertyDescription("Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.")
    private List<Reference> eventHistory = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicationRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicationRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
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
    @JsonProperty("statusReason")
    public CodeableConcept getStatusReason() {
        return statusReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(CodeableConcept statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public Element get_intent() {
        return _intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public void set_intent(Element _intent) {
        this._intent = _intent;
    }

    /**
     * Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    public Boolean getDoNotPerform() {
        return doNotPerform;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Boolean doNotPerform) {
        this.doNotPerform = doNotPerform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    public Element get_doNotPerform() {
        return _doNotPerform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    public void set_doNotPerform(Element _doNotPerform) {
        this._doNotPerform = _doNotPerform;
    }

    /**
     * Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.
     * 
     */
    @JsonProperty("reportedBoolean")
    public Boolean getReportedBoolean() {
        return reportedBoolean;
    }

    /**
     * Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.
     * 
     */
    @JsonProperty("reportedBoolean")
    public void setReportedBoolean(Boolean reportedBoolean) {
        this.reportedBoolean = reportedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reportedBoolean")
    public Element get_reportedBoolean() {
        return _reportedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reportedBoolean")
    public void set_reportedBoolean(Element _reportedBoolean) {
        this._reportedBoolean = _reportedBoolean;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reportedReference")
    public Reference getReportedReference() {
        return reportedReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reportedReference")
    public void setReportedReference(Reference reportedReference) {
        this.reportedReference = reportedReference;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("medicationCodeableConcept")
    public CodeableConcept getMedicationCodeableConcept() {
        return medicationCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(CodeableConcept medicationCodeableConcept) {
        this.medicationCodeableConcept = medicationCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("medicationReference")
    public Reference getMedicationReference() {
        return medicationReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("medicationReference")
    public void setMedicationReference(Reference medicationReference) {
        this.medicationReference = medicationReference;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(Reference encounter) {
        this.encounter = encounter;
    }

    /**
     * Include additional information (for example, patient height and weight) that supports the ordering of the medication.
     * 
     */
    @JsonProperty("supportingInformation")
    public List<Reference> getSupportingInformation() {
        return supportingInformation;
    }

    /**
     * Include additional information (for example, patient height and weight) that supports the ordering of the medication.
     * 
     */
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(List<Reference> supportingInformation) {
        this.supportingInformation = supportingInformation;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    public String getAuthoredOn() {
        return authoredOn;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    public void setAuthoredOn(String authoredOn) {
        this.authoredOn = authoredOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    public Element get_authoredOn() {
        return _authoredOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    public void set_authoredOn(Element _authoredOn) {
        this._authoredOn = _authoredOn;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    public Reference getRequester() {
        return requester;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    public void setRequester(Reference requester) {
        this.requester = requester;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public Reference getPerformer() {
        return performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(Reference performer) {
        this.performer = performer;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerType")
    public CodeableConcept getPerformerType() {
        return performerType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerType")
    public void setPerformerType(CodeableConcept performerType) {
        this.performerType = performerType;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recorder")
    public Reference getRecorder() {
        return recorder;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recorder")
    public void setRecorder(Reference recorder) {
        this.recorder = recorder;
    }

    /**
     * The reason or the indication for ordering or not ordering the medication.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * The reason or the indication for ordering or not ordering the medication.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Condition or observation that supports why the medication was ordered.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Condition or observation that supports why the medication was ordered.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * Extensions for instantiatesCanonical
     * 
     */
    @JsonProperty("_instantiatesCanonical")
    public List<Element> get_instantiatesCanonical() {
        return _instantiatesCanonical;
    }

    /**
     * Extensions for instantiatesCanonical
     * 
     */
    @JsonProperty("_instantiatesCanonical")
    public void set_instantiatesCanonical(List<Element> _instantiatesCanonical) {
        this._instantiatesCanonical = _instantiatesCanonical;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.
     * 
     */
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(List<String> instantiatesUri) {
        this.instantiatesUri = instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public List<Element> get_instantiatesUri() {
        return _instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public void set_instantiatesUri(List<Element> _instantiatesUri) {
        this._instantiatesUri = _instantiatesUri;
    }

    /**
     * A plan or request that is fulfilled in whole or in part by this medication request.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A plan or request that is fulfilled in whole or in part by this medication request.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("groupIdentifier")
    public Identifier getGroupIdentifier() {
        return groupIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("groupIdentifier")
    public void setGroupIdentifier(Identifier groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("courseOfTherapyType")
    public CodeableConcept getCourseOfTherapyType() {
        return courseOfTherapyType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("courseOfTherapyType")
    public void setCourseOfTherapyType(CodeableConcept courseOfTherapyType) {
        this.courseOfTherapyType = courseOfTherapyType;
    }

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.
     * 
     */
    @JsonProperty("insurance")
    public List<Reference> getInsurance() {
        return insurance;
    }

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<Reference> insurance) {
        this.insurance = insurance;
    }

    /**
     * Extra information about the prescription that could not be conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Extra information about the prescription that could not be conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Indicates how the medication is to be used by the patient.
     * 
     */
    @JsonProperty("dosageInstruction")
    public List<Dosage> getDosageInstruction() {
        return dosageInstruction;
    }

    /**
     * Indicates how the medication is to be used by the patient.
     * 
     */
    @JsonProperty("dosageInstruction")
    public void setDosageInstruction(List<Dosage> dosageInstruction) {
        this.dosageInstruction = dosageInstruction;
    }

    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("dispenseRequest")
    public MedicationRequest_DispenseRequest getDispenseRequest() {
        return dispenseRequest;
    }

    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("dispenseRequest")
    public void setDispenseRequest(MedicationRequest_DispenseRequest dispenseRequest) {
        this.dispenseRequest = dispenseRequest;
    }

    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("substitution")
    public MedicationRequest_Substitution getSubstitution() {
        return substitution;
    }

    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("substitution")
    public void setSubstitution(MedicationRequest_Substitution substitution) {
        this.substitution = substitution;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("priorPrescription")
    public Reference getPriorPrescription() {
        return priorPrescription;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("priorPrescription")
    public void setPriorPrescription(Reference priorPrescription) {
        this.priorPrescription = priorPrescription;
    }

    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
     * 
     */
    @JsonProperty("detectedIssue")
    public List<Reference> getDetectedIssue() {
        return detectedIssue;
    }

    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
     * 
     */
    @JsonProperty("detectedIssue")
    public void setDetectedIssue(List<Reference> detectedIssue) {
        this.detectedIssue = detectedIssue;
    }

    /**
     * Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
     * 
     */
    @JsonProperty("eventHistory")
    public List<Reference> getEventHistory() {
        return eventHistory;
    }

    /**
     * Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
     * 
     */
    @JsonProperty("eventHistory")
    public void setEventHistory(List<Reference> eventHistory) {
        this.eventHistory = eventHistory;
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
        sb.append(MedicationRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("intent");
        sb.append('=');
        sb.append(((this.intent == null)?"<null>":this.intent));
        sb.append(',');
        sb.append("_intent");
        sb.append('=');
        sb.append(((this._intent == null)?"<null>":this._intent));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("_priority");
        sb.append('=');
        sb.append(((this._priority == null)?"<null>":this._priority));
        sb.append(',');
        sb.append("doNotPerform");
        sb.append('=');
        sb.append(((this.doNotPerform == null)?"<null>":this.doNotPerform));
        sb.append(',');
        sb.append("_doNotPerform");
        sb.append('=');
        sb.append(((this._doNotPerform == null)?"<null>":this._doNotPerform));
        sb.append(',');
        sb.append("reportedBoolean");
        sb.append('=');
        sb.append(((this.reportedBoolean == null)?"<null>":this.reportedBoolean));
        sb.append(',');
        sb.append("_reportedBoolean");
        sb.append('=');
        sb.append(((this._reportedBoolean == null)?"<null>":this._reportedBoolean));
        sb.append(',');
        sb.append("reportedReference");
        sb.append('=');
        sb.append(((this.reportedReference == null)?"<null>":this.reportedReference));
        sb.append(',');
        sb.append("medicationCodeableConcept");
        sb.append('=');
        sb.append(((this.medicationCodeableConcept == null)?"<null>":this.medicationCodeableConcept));
        sb.append(',');
        sb.append("medicationReference");
        sb.append('=');
        sb.append(((this.medicationReference == null)?"<null>":this.medicationReference));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("supportingInformation");
        sb.append('=');
        sb.append(((this.supportingInformation == null)?"<null>":this.supportingInformation));
        sb.append(',');
        sb.append("authoredOn");
        sb.append('=');
        sb.append(((this.authoredOn == null)?"<null>":this.authoredOn));
        sb.append(',');
        sb.append("_authoredOn");
        sb.append('=');
        sb.append(((this._authoredOn == null)?"<null>":this._authoredOn));
        sb.append(',');
        sb.append("requester");
        sb.append('=');
        sb.append(((this.requester == null)?"<null>":this.requester));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("performerType");
        sb.append('=');
        sb.append(((this.performerType == null)?"<null>":this.performerType));
        sb.append(',');
        sb.append("recorder");
        sb.append('=');
        sb.append(((this.recorder == null)?"<null>":this.recorder));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("instantiatesCanonical");
        sb.append('=');
        sb.append(((this.instantiatesCanonical == null)?"<null>":this.instantiatesCanonical));
        sb.append(',');
        sb.append("_instantiatesCanonical");
        sb.append('=');
        sb.append(((this._instantiatesCanonical == null)?"<null>":this._instantiatesCanonical));
        sb.append(',');
        sb.append("instantiatesUri");
        sb.append('=');
        sb.append(((this.instantiatesUri == null)?"<null>":this.instantiatesUri));
        sb.append(',');
        sb.append("_instantiatesUri");
        sb.append('=');
        sb.append(((this._instantiatesUri == null)?"<null>":this._instantiatesUri));
        sb.append(',');
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("groupIdentifier");
        sb.append('=');
        sb.append(((this.groupIdentifier == null)?"<null>":this.groupIdentifier));
        sb.append(',');
        sb.append("courseOfTherapyType");
        sb.append('=');
        sb.append(((this.courseOfTherapyType == null)?"<null>":this.courseOfTherapyType));
        sb.append(',');
        sb.append("insurance");
        sb.append('=');
        sb.append(((this.insurance == null)?"<null>":this.insurance));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("dosageInstruction");
        sb.append('=');
        sb.append(((this.dosageInstruction == null)?"<null>":this.dosageInstruction));
        sb.append(',');
        sb.append("dispenseRequest");
        sb.append('=');
        sb.append(((this.dispenseRequest == null)?"<null>":this.dispenseRequest));
        sb.append(',');
        sb.append("substitution");
        sb.append('=');
        sb.append(((this.substitution == null)?"<null>":this.substitution));
        sb.append(',');
        sb.append("priorPrescription");
        sb.append('=');
        sb.append(((this.priorPrescription == null)?"<null>":this.priorPrescription));
        sb.append(',');
        sb.append("detectedIssue");
        sb.append('=');
        sb.append(((this.detectedIssue == null)?"<null>":this.detectedIssue));
        sb.append(',');
        sb.append("eventHistory");
        sb.append('=');
        sb.append(((this.eventHistory == null)?"<null>":this.eventHistory));
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
        result = ((result* 31)+((this.insurance == null)? 0 :this.insurance.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.substitution == null)? 0 :this.substitution.hashCode()));
        result = ((result* 31)+((this._instantiatesCanonical == null)? 0 :this._instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.courseOfTherapyType == null)? 0 :this.courseOfTherapyType.hashCode()));
        result = ((result* 31)+((this.priorPrescription == null)? 0 :this.priorPrescription.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this._reportedBoolean == null)? 0 :this._reportedBoolean.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.medicationReference == null)? 0 :this.medicationReference.hashCode()));
        result = ((result* 31)+((this.reportedReference == null)? 0 :this.reportedReference.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.dispenseRequest == null)? 0 :this.dispenseRequest.hashCode()));
        result = ((result* 31)+((this._intent == null)? 0 :this._intent.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.doNotPerform == null)? 0 :this.doNotPerform.hashCode()));
        result = ((result* 31)+((this._doNotPerform == null)? 0 :this._doNotPerform.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.requester == null)? 0 :this.requester.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._authoredOn == null)? 0 :this._authoredOn.hashCode()));
        result = ((result* 31)+((this.reportedBoolean == null)? 0 :this.reportedBoolean.hashCode()));
        result = ((result* 31)+((this.recorder == null)? 0 :this.recorder.hashCode()));
        result = ((result* 31)+((this.authoredOn == null)? 0 :this.authoredOn.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.detectedIssue == null)? 0 :this.detectedIssue.hashCode()));
        result = ((result* 31)+((this.supportingInformation == null)? 0 :this.supportingInformation.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.medicationCodeableConcept == null)? 0 :this.medicationCodeableConcept.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this.intent == null)? 0 :this.intent.hashCode()));
        result = ((result* 31)+((this.performerType == null)? 0 :this.performerType.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.dosageInstruction == null)? 0 :this.dosageInstruction.hashCode()));
        result = ((result* 31)+((this.eventHistory == null)? 0 :this.eventHistory.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.groupIdentifier == null)? 0 :this.groupIdentifier.hashCode()));
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
        if ((other instanceof MedicationRequest) == false) {
            return false;
        }
        MedicationRequest rhs = ((MedicationRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.substitution == rhs.substitution)||((this.substitution!= null)&&this.substitution.equals(rhs.substitution))))&&((this._instantiatesCanonical == rhs._instantiatesCanonical)||((this._instantiatesCanonical!= null)&&this._instantiatesCanonical.equals(rhs._instantiatesCanonical))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.courseOfTherapyType == rhs.courseOfTherapyType)||((this.courseOfTherapyType!= null)&&this.courseOfTherapyType.equals(rhs.courseOfTherapyType))))&&((this.priorPrescription == rhs.priorPrescription)||((this.priorPrescription!= null)&&this.priorPrescription.equals(rhs.priorPrescription))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this._reportedBoolean == rhs._reportedBoolean)||((this._reportedBoolean!= null)&&this._reportedBoolean.equals(rhs._reportedBoolean))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.medicationReference == rhs.medicationReference)||((this.medicationReference!= null)&&this.medicationReference.equals(rhs.medicationReference))))&&((this.reportedReference == rhs.reportedReference)||((this.reportedReference!= null)&&this.reportedReference.equals(rhs.reportedReference))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.dispenseRequest == rhs.dispenseRequest)||((this.dispenseRequest!= null)&&this.dispenseRequest.equals(rhs.dispenseRequest))))&&((this._intent == rhs._intent)||((this._intent!= null)&&this._intent.equals(rhs._intent))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.doNotPerform == rhs.doNotPerform)||((this.doNotPerform!= null)&&this.doNotPerform.equals(rhs.doNotPerform))))&&((this._doNotPerform == rhs._doNotPerform)||((this._doNotPerform!= null)&&this._doNotPerform.equals(rhs._doNotPerform))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.requester == rhs.requester)||((this.requester!= null)&&this.requester.equals(rhs.requester))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._authoredOn == rhs._authoredOn)||((this._authoredOn!= null)&&this._authoredOn.equals(rhs._authoredOn))))&&((this.reportedBoolean == rhs.reportedBoolean)||((this.reportedBoolean!= null)&&this.reportedBoolean.equals(rhs.reportedBoolean))))&&((this.recorder == rhs.recorder)||((this.recorder!= null)&&this.recorder.equals(rhs.recorder))))&&((this.authoredOn == rhs.authoredOn)||((this.authoredOn!= null)&&this.authoredOn.equals(rhs.authoredOn))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.detectedIssue == rhs.detectedIssue)||((this.detectedIssue!= null)&&this.detectedIssue.equals(rhs.detectedIssue))))&&((this.supportingInformation == rhs.supportingInformation)||((this.supportingInformation!= null)&&this.supportingInformation.equals(rhs.supportingInformation))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.medicationCodeableConcept == rhs.medicationCodeableConcept)||((this.medicationCodeableConcept!= null)&&this.medicationCodeableConcept.equals(rhs.medicationCodeableConcept))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this.intent == rhs.intent)||((this.intent!= null)&&this.intent.equals(rhs.intent))))&&((this.performerType == rhs.performerType)||((this.performerType!= null)&&this.performerType.equals(rhs.performerType))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.dosageInstruction == rhs.dosageInstruction)||((this.dosageInstruction!= null)&&this.dosageInstruction.equals(rhs.dosageInstruction))))&&((this.eventHistory == rhs.eventHistory)||((this.eventHistory!= null)&&this.eventHistory.equals(rhs.eventHistory))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.groupIdentifier == rhs.groupIdentifier)||((this.groupIdentifier!= null)&&this.groupIdentifier.equals(rhs.groupIdentifier))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
