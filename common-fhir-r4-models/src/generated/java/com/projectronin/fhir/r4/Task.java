
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
 * A task to be performed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "basedOn",
    "groupIdentifier",
    "partOf",
    "status",
    "_status",
    "statusReason",
    "businessStatus",
    "intent",
    "_intent",
    "priority",
    "_priority",
    "code",
    "description",
    "_description",
    "focus",
    "for",
    "encounter",
    "executionPeriod",
    "authoredOn",
    "_authoredOn",
    "lastModified",
    "_lastModified",
    "requester",
    "performerType",
    "owner",
    "location",
    "reasonCode",
    "reasonReference",
    "insurance",
    "note",
    "relevantHistory",
    "restriction",
    "input",
    "output"
})
@Generated("jsonschema2pojo")
public class Task
    extends DomainResource
{

    /**
     * This is a Task resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Task resource")
    private String resourceType;
    /**
     * The business identifier for this task.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("The business identifier for this task.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String instantiatesCanonical;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String instantiatesUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _instantiatesUri;
    /**
     * BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a &quot;request&quot; resource such as a ServiceRequest, MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the &quot;request&quot; resource the task is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ServiceRequest, MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen from a patient.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("groupIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier groupIdentifier;
    /**
     * Task that this particular task is part of.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("Task that this particular task is part of.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * The current status of the task.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current status of the task.")
    private Task.Status status;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("businessStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept businessStatus;
    /**
     * Indicates the &quot;level&quot; of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     * 
     */
    @JsonProperty("intent")
    @JsonPropertyDescription("Indicates the \"level\" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.")
    private Task.Intent intent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _intent;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("focus")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference focus;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("for")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference _for;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("executionPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period executionPeriod;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastModified")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String lastModified;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastModified")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lastModified;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requester;
    /**
     * The kind of participant that should perform the task.
     * 
     */
    @JsonProperty("performerType")
    @JsonPropertyDescription("The kind of participant that should perform the task.")
    private List<CodeableConcept> performerType = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference owner;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept reasonCode;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference reasonReference;
    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.")
    private List<Reference> insurance = new ArrayList<Reference>();
    /**
     * Free-text information captured about the task as it progresses.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Free-text information captured about the task as it progresses.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
     * 
     */
    @JsonProperty("relevantHistory")
    @JsonPropertyDescription("Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.")
    private List<Reference> relevantHistory = new ArrayList<Reference>();
    /**
     * A task to be performed.
     * 
     */
    @JsonProperty("restriction")
    @JsonPropertyDescription("A task to be performed.")
    private Task_Restriction restriction;
    /**
     * Additional information that may be needed in the execution of the task.
     * 
     */
    @JsonProperty("input")
    @JsonPropertyDescription("Additional information that may be needed in the execution of the task.")
    private List<Task_Input> input = new ArrayList<Task_Input>();
    /**
     * Outputs produced by the Task.
     * 
     */
    @JsonProperty("output")
    @JsonPropertyDescription("Outputs produced by the Task.")
    private List<Task_Output> output = new ArrayList<Task_Output>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Task resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Task resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The business identifier for this task.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * The business identifier for this task.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public String getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(String instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("instantiatesUri")
    public String getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(String instantiatesUri) {
        this.instantiatesUri = instantiatesUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instantiatesUri")
    public Element get_instantiatesUri() {
        return _instantiatesUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instantiatesUri")
    public void set_instantiatesUri(Element _instantiatesUri) {
        this._instantiatesUri = _instantiatesUri;
    }

    /**
     * BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a &quot;request&quot; resource such as a ServiceRequest, MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the &quot;request&quot; resource the task is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a &quot;request&quot; resource such as a ServiceRequest, MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the &quot;request&quot; resource the task is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
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
     * Task that this particular task is part of.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * Task that this particular task is part of.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * The current status of the task.
     * 
     */
    @JsonProperty("status")
    public Task.Status getStatus() {
        return status;
    }

    /**
     * The current status of the task.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Task.Status status) {
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("businessStatus")
    public CodeableConcept getBusinessStatus() {
        return businessStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("businessStatus")
    public void setBusinessStatus(CodeableConcept businessStatus) {
        this.businessStatus = businessStatus;
    }

    /**
     * Indicates the &quot;level&quot; of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     * 
     */
    @JsonProperty("intent")
    public Task.Intent getIntent() {
        return intent;
    }

    /**
     * Indicates the &quot;level&quot; of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     * 
     */
    @JsonProperty("intent")
    public void setIntent(Task.Intent intent) {
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("focus")
    public Reference getFocus() {
        return focus;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("focus")
    public void setFocus(Reference focus) {
        this.focus = focus;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("for")
    public Reference getFor() {
        return _for;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("for")
    public void setFor(Reference _for) {
        this._for = _for;
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("executionPeriod")
    public Period getExecutionPeriod() {
        return executionPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("executionPeriod")
    public void setExecutionPeriod(Period executionPeriod) {
        this.executionPeriod = executionPeriod;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastModified")
    public Element get_lastModified() {
        return _lastModified;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastModified")
    public void set_lastModified(Element _lastModified) {
        this._lastModified = _lastModified;
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
     * The kind of participant that should perform the task.
     * 
     */
    @JsonProperty("performerType")
    public List<CodeableConcept> getPerformerType() {
        return performerType;
    }

    /**
     * The kind of participant that should perform the task.
     * 
     */
    @JsonProperty("performerType")
    public void setPerformerType(List<CodeableConcept> performerType) {
        this.performerType = performerType;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    public Reference getOwner() {
        return owner;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Reference owner) {
        this.owner = owner;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public Reference getLocation() {
        return location;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public void setLocation(Reference location) {
        this.location = location;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reasonCode")
    public CodeableConcept getReasonCode() {
        return reasonCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(CodeableConcept reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reasonReference")
    public Reference getReasonReference() {
        return reasonReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(Reference reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.
     * 
     */
    @JsonProperty("insurance")
    public List<Reference> getInsurance() {
        return insurance;
    }

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<Reference> insurance) {
        this.insurance = insurance;
    }

    /**
     * Free-text information captured about the task as it progresses.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Free-text information captured about the task as it progresses.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
     * 
     */
    @JsonProperty("relevantHistory")
    public List<Reference> getRelevantHistory() {
        return relevantHistory;
    }

    /**
     * Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
     * 
     */
    @JsonProperty("relevantHistory")
    public void setRelevantHistory(List<Reference> relevantHistory) {
        this.relevantHistory = relevantHistory;
    }

    /**
     * A task to be performed.
     * 
     */
    @JsonProperty("restriction")
    public Task_Restriction getRestriction() {
        return restriction;
    }

    /**
     * A task to be performed.
     * 
     */
    @JsonProperty("restriction")
    public void setRestriction(Task_Restriction restriction) {
        this.restriction = restriction;
    }

    /**
     * Additional information that may be needed in the execution of the task.
     * 
     */
    @JsonProperty("input")
    public List<Task_Input> getInput() {
        return input;
    }

    /**
     * Additional information that may be needed in the execution of the task.
     * 
     */
    @JsonProperty("input")
    public void setInput(List<Task_Input> input) {
        this.input = input;
    }

    /**
     * Outputs produced by the Task.
     * 
     */
    @JsonProperty("output")
    public List<Task_Output> getOutput() {
        return output;
    }

    /**
     * Outputs produced by the Task.
     * 
     */
    @JsonProperty("output")
    public void setOutput(List<Task_Output> output) {
        this.output = output;
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
        sb.append(Task.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("instantiatesCanonical");
        sb.append('=');
        sb.append(((this.instantiatesCanonical == null)?"<null>":this.instantiatesCanonical));
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
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
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
        sb.append("businessStatus");
        sb.append('=');
        sb.append(((this.businessStatus == null)?"<null>":this.businessStatus));
        sb.append(',');
        sb.append("intent");
        sb.append('=');
        sb.append(((this.intent == null)?"<null>":this.intent));
        sb.append(',');
        sb.append("_intent");
        sb.append('=');
        sb.append(((this._intent == null)?"<null>":this._intent));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("_priority");
        sb.append('=');
        sb.append(((this._priority == null)?"<null>":this._priority));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("focus");
        sb.append('=');
        sb.append(((this.focus == null)?"<null>":this.focus));
        sb.append(',');
        sb.append("_for");
        sb.append('=');
        sb.append(((this._for == null)?"<null>":this._for));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("executionPeriod");
        sb.append('=');
        sb.append(((this.executionPeriod == null)?"<null>":this.executionPeriod));
        sb.append(',');
        sb.append("authoredOn");
        sb.append('=');
        sb.append(((this.authoredOn == null)?"<null>":this.authoredOn));
        sb.append(',');
        sb.append("_authoredOn");
        sb.append('=');
        sb.append(((this._authoredOn == null)?"<null>":this._authoredOn));
        sb.append(',');
        sb.append("lastModified");
        sb.append('=');
        sb.append(((this.lastModified == null)?"<null>":this.lastModified));
        sb.append(',');
        sb.append("_lastModified");
        sb.append('=');
        sb.append(((this._lastModified == null)?"<null>":this._lastModified));
        sb.append(',');
        sb.append("requester");
        sb.append('=');
        sb.append(((this.requester == null)?"<null>":this.requester));
        sb.append(',');
        sb.append("performerType");
        sb.append('=');
        sb.append(((this.performerType == null)?"<null>":this.performerType));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("insurance");
        sb.append('=');
        sb.append(((this.insurance == null)?"<null>":this.insurance));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("relevantHistory");
        sb.append('=');
        sb.append(((this.relevantHistory == null)?"<null>":this.relevantHistory));
        sb.append(',');
        sb.append("restriction");
        sb.append('=');
        sb.append(((this.restriction == null)?"<null>":this.restriction));
        sb.append(',');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
        sb.append(',');
        sb.append("output");
        sb.append('=');
        sb.append(((this.output == null)?"<null>":this.output));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.focus == null)? 0 :this.focus.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.relevantHistory == null)? 0 :this.relevantHistory.hashCode()));
        result = ((result* 31)+((this.output == null)? 0 :this.output.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this._intent == null)? 0 :this._intent.hashCode()));
        result = ((result* 31)+((this.executionPeriod == null)? 0 :this.executionPeriod.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.requester == null)? 0 :this.requester.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._authoredOn == null)? 0 :this._authoredOn.hashCode()));
        result = ((result* 31)+((this.authoredOn == null)? 0 :this.authoredOn.hashCode()));
        result = ((result* 31)+((this._for == null)? 0 :this._for.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.businessStatus == null)? 0 :this.businessStatus.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.intent == null)? 0 :this.intent.hashCode()));
        result = ((result* 31)+((this.performerType == null)? 0 :this.performerType.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        result = ((result* 31)+((this.restriction == null)? 0 :this.restriction.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.lastModified == null)? 0 :this.lastModified.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.groupIdentifier == null)? 0 :this.groupIdentifier.hashCode()));
        result = ((result* 31)+((this._lastModified == null)? 0 :this._lastModified.hashCode()));
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
        if ((other instanceof Task) == false) {
            return false;
        }
        Task rhs = ((Task) other);
        return ((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.focus == rhs.focus)||((this.focus!= null)&&this.focus.equals(rhs.focus))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.relevantHistory == rhs.relevantHistory)||((this.relevantHistory!= null)&&this.relevantHistory.equals(rhs.relevantHistory))))&&((this.output == rhs.output)||((this.output!= null)&&this.output.equals(rhs.output))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this._intent == rhs._intent)||((this._intent!= null)&&this._intent.equals(rhs._intent))))&&((this.executionPeriod == rhs.executionPeriod)||((this.executionPeriod!= null)&&this.executionPeriod.equals(rhs.executionPeriod))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.requester == rhs.requester)||((this.requester!= null)&&this.requester.equals(rhs.requester))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._authoredOn == rhs._authoredOn)||((this._authoredOn!= null)&&this._authoredOn.equals(rhs._authoredOn))))&&((this.authoredOn == rhs.authoredOn)||((this.authoredOn!= null)&&this.authoredOn.equals(rhs.authoredOn))))&&((this._for == rhs._for)||((this._for!= null)&&this._for.equals(rhs._for))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.businessStatus == rhs.businessStatus)||((this.businessStatus!= null)&&this.businessStatus.equals(rhs.businessStatus))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.intent == rhs.intent)||((this.intent!= null)&&this.intent.equals(rhs.intent))))&&((this.performerType == rhs.performerType)||((this.performerType!= null)&&this.performerType.equals(rhs.performerType))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input))))&&((this.restriction == rhs.restriction)||((this.restriction!= null)&&this.restriction.equals(rhs.restriction))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.lastModified == rhs.lastModified)||((this.lastModified!= null)&&this.lastModified.equals(rhs.lastModified))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.groupIdentifier == rhs.groupIdentifier)||((this.groupIdentifier!= null)&&this.groupIdentifier.equals(rhs.groupIdentifier))))&&((this._lastModified == rhs._lastModified)||((this._lastModified!= null)&&this._lastModified.equals(rhs._lastModified))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Indicates the &quot;level&quot; of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Intent {

        UNKNOWN("unknown"),
        PROPOSAL("proposal"),
        PLAN("plan"),
        ORDER("order"),
        ORIGINAL_ORDER("original-order"),
        REFLEX_ORDER("reflex-order"),
        FILLER_ORDER("filler-order"),
        INSTANCE_ORDER("instance-order"),
        OPTION("option");
        private final String value;
        private final static Map<String, Task.Intent> CONSTANTS = new HashMap<String, Task.Intent>();

        static {
            for (Task.Intent c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Intent(String value) {
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
        public static Task.Intent fromValue(String value) {
            Task.Intent constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The current status of the task.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        REQUESTED("requested"),
        RECEIVED("received"),
        ACCEPTED("accepted"),
        REJECTED("rejected"),
        READY("ready"),
        CANCELLED("cancelled"),
        IN_PROGRESS("in-progress"),
        ON_HOLD("on-hold"),
        FAILED("failed"),
        COMPLETED("completed"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, Task.Status> CONSTANTS = new HashMap<String, Task.Status>();

        static {
            for (Task.Status c: values()) {
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
        public static Task.Status fromValue(String value) {
            Task.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
