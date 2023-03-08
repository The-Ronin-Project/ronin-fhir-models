
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
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "basedOn",
    "replaces",
    "groupIdentifier",
    "status",
    "_status",
    "statusReason",
    "category",
    "priority",
    "_priority",
    "doNotPerform",
    "_doNotPerform",
    "medium",
    "subject",
    "about",
    "encounter",
    "payload",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrencePeriod",
    "authoredOn",
    "_authoredOn",
    "requester",
    "recipient",
    "sender",
    "reasonCode",
    "reasonReference",
    "note"
})
@Generated("jsonschema2pojo")
public class CommunicationRequest
    extends DomainResource
{

    /**
     * This is a CommunicationRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a CommunicationRequest resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this communication request by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this communication request by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A plan or proposal that is fulfilled in whole or in part by this request.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A plan or proposal that is fulfilled in whole or in part by this request.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * Completed or terminated request(s) whose function is taken by this new request.
     * 
     */
    @JsonProperty("replaces")
    @JsonPropertyDescription("Completed or terminated request(s) whose function is taken by this new request.")
    private List<Reference> replaces = new ArrayList<Reference>();
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("groupIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier groupIdentifier;
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
     * The type of message to be sent such as alert, notification, reminder, instruction, etc.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The type of message to be sent such as alert, notification, reminder, instruction, etc.")
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
     * A channel that was used for this communication (e.g. email, fax).
     * 
     */
    @JsonProperty("medium")
    @JsonPropertyDescription("A channel that was used for this communication (e.g. email, fax).")
    private List<CodeableConcept> medium = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * Other resources that pertain to this communication request and to which this communication request should be associated.
     * 
     */
    @JsonProperty("about")
    @JsonPropertyDescription("Other resources that pertain to this communication request and to which this communication request should be associated.")
    private List<Reference> about = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * Text, attachment(s), or resource(s) to be communicated to the recipient.
     * 
     */
    @JsonProperty("payload")
    @JsonPropertyDescription("Text, attachment(s), or resource(s) to be communicated to the recipient.")
    private List<CommunicationRequest_Payload> payload = new ArrayList<CommunicationRequest_Payload>();
    /**
     * The time when this communication is to occur.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("The time when this communication is to occur.")
    private String occurrenceDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurrenceDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period occurrencePeriod;
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
     * The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication.
     * 
     */
    @JsonProperty("recipient")
    @JsonPropertyDescription("The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication.")
    private List<Reference> recipient = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sender")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference sender;
    /**
     * Describes why the request is being made in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Describes why the request is being made in coded or textual form.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource whose existence justifies this request.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource whose existence justifies this request.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Comments made about the request by the requester, sender, recipient, subject or other participants.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the request by the requester, sender, recipient, subject or other participants.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a CommunicationRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a CommunicationRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this communication request by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this communication request by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A plan or proposal that is fulfilled in whole or in part by this request.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A plan or proposal that is fulfilled in whole or in part by this request.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * Completed or terminated request(s) whose function is taken by this new request.
     * 
     */
    @JsonProperty("replaces")
    public List<Reference> getReplaces() {
        return replaces;
    }

    /**
     * Completed or terminated request(s) whose function is taken by this new request.
     * 
     */
    @JsonProperty("replaces")
    public void setReplaces(List<Reference> replaces) {
        this.replaces = replaces;
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
     * The type of message to be sent such as alert, notification, reminder, instruction, etc.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * The type of message to be sent such as alert, notification, reminder, instruction, etc.
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
     * A channel that was used for this communication (e.g. email, fax).
     * 
     */
    @JsonProperty("medium")
    public List<CodeableConcept> getMedium() {
        return medium;
    }

    /**
     * A channel that was used for this communication (e.g. email, fax).
     * 
     */
    @JsonProperty("medium")
    public void setMedium(List<CodeableConcept> medium) {
        this.medium = medium;
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
     * Other resources that pertain to this communication request and to which this communication request should be associated.
     * 
     */
    @JsonProperty("about")
    public List<Reference> getAbout() {
        return about;
    }

    /**
     * Other resources that pertain to this communication request and to which this communication request should be associated.
     * 
     */
    @JsonProperty("about")
    public void setAbout(List<Reference> about) {
        this.about = about;
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
     * Text, attachment(s), or resource(s) to be communicated to the recipient.
     * 
     */
    @JsonProperty("payload")
    public List<CommunicationRequest_Payload> getPayload() {
        return payload;
    }

    /**
     * Text, attachment(s), or resource(s) to be communicated to the recipient.
     * 
     */
    @JsonProperty("payload")
    public void setPayload(List<CommunicationRequest_Payload> payload) {
        this.payload = payload;
    }

    /**
     * The time when this communication is to occur.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * The time when this communication is to occur.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public Element get_occurrenceDateTime() {
        return _occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public void set_occurrenceDateTime(Element _occurrenceDateTime) {
        this._occurrenceDateTime = _occurrenceDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public Period getOccurrencePeriod() {
        return occurrencePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Period occurrencePeriod) {
        this.occurrencePeriod = occurrencePeriod;
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
     * The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication.
     * 
     */
    @JsonProperty("recipient")
    public List<Reference> getRecipient() {
        return recipient;
    }

    /**
     * The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication.
     * 
     */
    @JsonProperty("recipient")
    public void setRecipient(List<Reference> recipient) {
        this.recipient = recipient;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sender")
    public Reference getSender() {
        return sender;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sender")
    public void setSender(Reference sender) {
        this.sender = sender;
    }

    /**
     * Describes why the request is being made in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Describes why the request is being made in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource whose existence justifies this request.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource whose existence justifies this request.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Comments made about the request by the requester, sender, recipient, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the request by the requester, sender, recipient, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
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
        sb.append(CommunicationRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("replaces");
        sb.append('=');
        sb.append(((this.replaces == null)?"<null>":this.replaces));
        sb.append(',');
        sb.append("groupIdentifier");
        sb.append('=');
        sb.append(((this.groupIdentifier == null)?"<null>":this.groupIdentifier));
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
        sb.append("medium");
        sb.append('=');
        sb.append(((this.medium == null)?"<null>":this.medium));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("about");
        sb.append('=');
        sb.append(((this.about == null)?"<null>":this.about));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        sb.append("occurrenceDateTime");
        sb.append('=');
        sb.append(((this.occurrenceDateTime == null)?"<null>":this.occurrenceDateTime));
        sb.append(',');
        sb.append("_occurrenceDateTime");
        sb.append('=');
        sb.append(((this._occurrenceDateTime == null)?"<null>":this._occurrenceDateTime));
        sb.append(',');
        sb.append("occurrencePeriod");
        sb.append('=');
        sb.append(((this.occurrencePeriod == null)?"<null>":this.occurrencePeriod));
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
        sb.append("recipient");
        sb.append('=');
        sb.append(((this.recipient == null)?"<null>":this.recipient));
        sb.append(',');
        sb.append("sender");
        sb.append('=');
        sb.append(((this.sender == null)?"<null>":this.sender));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.about == null)? 0 :this.about.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.medium == null)? 0 :this.medium.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.doNotPerform == null)? 0 :this.doNotPerform.hashCode()));
        result = ((result* 31)+((this._doNotPerform == null)? 0 :this._doNotPerform.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.requester == null)? 0 :this.requester.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._authoredOn == null)? 0 :this._authoredOn.hashCode()));
        result = ((result* 31)+((this.authoredOn == null)? 0 :this.authoredOn.hashCode()));
        result = ((result* 31)+((this.replaces == null)? 0 :this.replaces.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.occurrencePeriod == null)? 0 :this.occurrencePeriod.hashCode()));
        result = ((result* 31)+((this.sender == null)? 0 :this.sender.hashCode()));
        result = ((result* 31)+((this.recipient == null)? 0 :this.recipient.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.groupIdentifier == null)? 0 :this.groupIdentifier.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
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
        if ((other instanceof CommunicationRequest) == false) {
            return false;
        }
        CommunicationRequest rhs = ((CommunicationRequest) other);
        return ((((((((((((((((((((((((((((((super.equals(rhs)&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.about == rhs.about)||((this.about!= null)&&this.about.equals(rhs.about))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.medium == rhs.medium)||((this.medium!= null)&&this.medium.equals(rhs.medium))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.doNotPerform == rhs.doNotPerform)||((this.doNotPerform!= null)&&this.doNotPerform.equals(rhs.doNotPerform))))&&((this._doNotPerform == rhs._doNotPerform)||((this._doNotPerform!= null)&&this._doNotPerform.equals(rhs._doNotPerform))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.requester == rhs.requester)||((this.requester!= null)&&this.requester.equals(rhs.requester))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._authoredOn == rhs._authoredOn)||((this._authoredOn!= null)&&this._authoredOn.equals(rhs._authoredOn))))&&((this.authoredOn == rhs.authoredOn)||((this.authoredOn!= null)&&this.authoredOn.equals(rhs.authoredOn))))&&((this.replaces == rhs.replaces)||((this.replaces!= null)&&this.replaces.equals(rhs.replaces))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.occurrencePeriod == rhs.occurrencePeriod)||((this.occurrencePeriod!= null)&&this.occurrencePeriod.equals(rhs.occurrencePeriod))))&&((this.sender == rhs.sender)||((this.sender!= null)&&this.sender.equals(rhs.sender))))&&((this.recipient == rhs.recipient)||((this.recipient!= null)&&this.recipient.equals(rhs.recipient))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.groupIdentifier == rhs.groupIdentifier)||((this.groupIdentifier!= null)&&this.groupIdentifier.equals(rhs.groupIdentifier))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
