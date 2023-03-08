
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
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.
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
    "partOf",
    "inResponseTo",
    "status",
    "_status",
    "statusReason",
    "category",
    "priority",
    "_priority",
    "medium",
    "subject",
    "topic",
    "about",
    "encounter",
    "sent",
    "_sent",
    "received",
    "_received",
    "recipient",
    "sender",
    "reasonCode",
    "reasonReference",
    "payload",
    "note"
})
@Generated("jsonschema2pojo")
public class Communication
    extends DomainResource
{

    /**
     * This is a Communication resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Communication resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this communication by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this communication by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * An order, proposal or plan fulfilled in whole or in part by this Communication.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("An order, proposal or plan fulfilled in whole or in part by this Communication.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * Part of this action.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("Part of this action.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * Prior communication that this communication is in response to.
     * 
     */
    @JsonProperty("inResponseTo")
    @JsonPropertyDescription("Prior communication that this communication is in response to.")
    private List<Reference> inResponseTo = new ArrayList<Reference>();
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
     * The type of message conveyed such as alert, notification, reminder, instruction, etc.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The type of message conveyed such as alert, notification, reminder, instruction, etc.")
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept topic;
    /**
     * Other resources that pertain to this communication and to which this communication should be associated.
     * 
     */
    @JsonProperty("about")
    @JsonPropertyDescription("Other resources that pertain to this communication and to which this communication should be associated.")
    private List<Reference> about = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("sent")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String sent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sent;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("received")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String received;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_received")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _received;
    /**
     * The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).
     * 
     */
    @JsonProperty("recipient")
    @JsonPropertyDescription("The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).")
    private List<Reference> recipient = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sender")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference sender;
    /**
     * The reason or justification for the communication.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("The reason or justification for the communication.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource whose existence justifies this communication.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource whose existence justifies this communication.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Text, attachment(s), or resource(s) that was communicated to the recipient.
     * 
     */
    @JsonProperty("payload")
    @JsonPropertyDescription("Text, attachment(s), or resource(s) that was communicated to the recipient.")
    private List<Communication_Payload> payload = new ArrayList<Communication_Payload>();
    /**
     * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Additional notes or commentary about the communication by the sender, receiver or other interested parties.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Communication resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Communication resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this communication by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this communication by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
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
     * An order, proposal or plan fulfilled in whole or in part by this Communication.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * An order, proposal or plan fulfilled in whole or in part by this Communication.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * Part of this action.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * Part of this action.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * Prior communication that this communication is in response to.
     * 
     */
    @JsonProperty("inResponseTo")
    public List<Reference> getInResponseTo() {
        return inResponseTo;
    }

    /**
     * Prior communication that this communication is in response to.
     * 
     */
    @JsonProperty("inResponseTo")
    public void setInResponseTo(List<Reference> inResponseTo) {
        this.inResponseTo = inResponseTo;
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
     * The type of message conveyed such as alert, notification, reminder, instruction, etc.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * The type of message conveyed such as alert, notification, reminder, instruction, etc.
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topic")
    public CodeableConcept getTopic() {
        return topic;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topic")
    public void setTopic(CodeableConcept topic) {
        this.topic = topic;
    }

    /**
     * Other resources that pertain to this communication and to which this communication should be associated.
     * 
     */
    @JsonProperty("about")
    public List<Reference> getAbout() {
        return about;
    }

    /**
     * Other resources that pertain to this communication and to which this communication should be associated.
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("sent")
    public String getSent() {
        return sent;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("sent")
    public void setSent(String sent) {
        this.sent = sent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sent")
    public Element get_sent() {
        return _sent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sent")
    public void set_sent(Element _sent) {
        this._sent = _sent;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("received")
    public String getReceived() {
        return received;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("received")
    public void setReceived(String received) {
        this.received = received;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_received")
    public Element get_received() {
        return _received;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_received")
    public void set_received(Element _received) {
        this._received = _received;
    }

    /**
     * The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).
     * 
     */
    @JsonProperty("recipient")
    public List<Reference> getRecipient() {
        return recipient;
    }

    /**
     * The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).
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
     * The reason or justification for the communication.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * The reason or justification for the communication.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource whose existence justifies this communication.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource whose existence justifies this communication.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Text, attachment(s), or resource(s) that was communicated to the recipient.
     * 
     */
    @JsonProperty("payload")
    public List<Communication_Payload> getPayload() {
        return payload;
    }

    /**
     * Text, attachment(s), or resource(s) that was communicated to the recipient.
     * 
     */
    @JsonProperty("payload")
    public void setPayload(List<Communication_Payload> payload) {
        this.payload = payload;
    }

    /**
     * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
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
        sb.append(Communication.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("inResponseTo");
        sb.append('=');
        sb.append(((this.inResponseTo == null)?"<null>":this.inResponseTo));
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
        sb.append("medium");
        sb.append('=');
        sb.append(((this.medium == null)?"<null>":this.medium));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("topic");
        sb.append('=');
        sb.append(((this.topic == null)?"<null>":this.topic));
        sb.append(',');
        sb.append("about");
        sb.append('=');
        sb.append(((this.about == null)?"<null>":this.about));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("sent");
        sb.append('=');
        sb.append(((this.sent == null)?"<null>":this.sent));
        sb.append(',');
        sb.append("_sent");
        sb.append('=');
        sb.append(((this._sent == null)?"<null>":this._sent));
        sb.append(',');
        sb.append("received");
        sb.append('=');
        sb.append(((this.received == null)?"<null>":this.received));
        sb.append(',');
        sb.append("_received");
        sb.append('=');
        sb.append(((this._received == null)?"<null>":this._received));
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
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this._sent == null)? 0 :this._sent.hashCode()));
        result = ((result* 31)+((this.about == null)? 0 :this.about.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.medium == null)? 0 :this.medium.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.inResponseTo == null)? 0 :this.inResponseTo.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.received == null)? 0 :this.received.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.sent == null)? 0 :this.sent.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this._received == null)? 0 :this._received.hashCode()));
        result = ((result* 31)+((this.sender == null)? 0 :this.sender.hashCode()));
        result = ((result* 31)+((this.recipient == null)? 0 :this.recipient.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof Communication) == false) {
            return false;
        }
        Communication rhs = ((Communication) other);
        return ((((((((((((((((((((((((((((((super.equals(rhs)&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this._sent == rhs._sent)||((this._sent!= null)&&this._sent.equals(rhs._sent))))&&((this.about == rhs.about)||((this.about!= null)&&this.about.equals(rhs.about))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.medium == rhs.medium)||((this.medium!= null)&&this.medium.equals(rhs.medium))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this.inResponseTo == rhs.inResponseTo)||((this.inResponseTo!= null)&&this.inResponseTo.equals(rhs.inResponseTo))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.received == rhs.received)||((this.received!= null)&&this.received.equals(rhs.received))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.sent == rhs.sent)||((this.sent!= null)&&this.sent.equals(rhs.sent))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this._received == rhs._received)||((this._received!= null)&&this._received.equals(rhs._received))))&&((this.sender == rhs.sender)||((this.sender!= null)&&this.sender.equals(rhs.sender))))&&((this.recipient == rhs.recipient)||((this.recipient!= null)&&this.recipient.equals(rhs.recipient))))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
