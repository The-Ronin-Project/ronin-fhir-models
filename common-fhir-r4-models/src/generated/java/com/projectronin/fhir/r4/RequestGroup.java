
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
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as &quot;give this medication after that one&quot;.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "instantiatesCanonical",
    "_instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "basedOn",
    "replaces",
    "groupIdentifier",
    "status",
    "_status",
    "intent",
    "_intent",
    "priority",
    "_priority",
    "code",
    "subject",
    "encounter",
    "authoredOn",
    "_authoredOn",
    "author",
    "reasonCode",
    "reasonReference",
    "note",
    "action"
})
@Generated("jsonschema2pojo")
public class RequestGroup
    extends DomainResource
{

    /**
     * This is a RequestGroup resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a RequestGroup resource")
    private String resourceType;
    /**
     * Allows a service to provide a unique, business identifier for the request.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Allows a service to provide a unique, business identifier for the request.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * Extensions for instantiatesCanonical
     * 
     */
    @JsonProperty("_instantiatesCanonical")
    @JsonPropertyDescription("Extensions for instantiatesCanonical")
    private List<Element> _instantiatesCanonical = new ArrayList<Element>();
    /**
     * A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this request.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A plan, proposal or order that is fulfilled in whole or in part by this request.")
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
     * A reference from one resource to another.
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
    @JsonProperty("author")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference author;
    /**
     * Describes the reason for the request group in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Describes the reason for the request group in coded or textual form.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource whose existence justifies this request group.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource whose existence justifies this request group.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Provides a mechanism to communicate additional information about the response.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Provides a mechanism to communicate additional information about the response.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * The actions, if any, produced by the evaluation of the artifact.
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("The actions, if any, produced by the evaluation of the artifact.")
    private List<RequestGroup_Action> action = new ArrayList<RequestGroup_Action>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a RequestGroup resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a RequestGroup resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Allows a service to provide a unique, business identifier for the request.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Allows a service to provide a unique, business identifier for the request.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
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
     * A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
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
     * A plan, proposal or order that is fulfilled in whole or in part by this request.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this request.
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
    @JsonProperty("author")
    public Reference getAuthor() {
        return author;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Reference author) {
        this.author = author;
    }

    /**
     * Describes the reason for the request group in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Describes the reason for the request group in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource whose existence justifies this request group.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource whose existence justifies this request group.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Provides a mechanism to communicate additional information about the response.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Provides a mechanism to communicate additional information about the response.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * The actions, if any, produced by the evaluation of the artifact.
     * 
     */
    @JsonProperty("action")
    public List<RequestGroup_Action> getAction() {
        return action;
    }

    /**
     * The actions, if any, produced by the evaluation of the artifact.
     * 
     */
    @JsonProperty("action")
    public void setAction(List<RequestGroup_Action> action) {
        this.action = action;
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
        sb.append(RequestGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("authoredOn");
        sb.append('=');
        sb.append(((this.authoredOn == null)?"<null>":this.authoredOn));
        sb.append(',');
        sb.append("_authoredOn");
        sb.append('=');
        sb.append(((this._authoredOn == null)?"<null>":this._authoredOn));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
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
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._instantiatesCanonical == null)? 0 :this._instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this._intent == null)? 0 :this._intent.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._authoredOn == null)? 0 :this._authoredOn.hashCode()));
        result = ((result* 31)+((this.authoredOn == null)? 0 :this.authoredOn.hashCode()));
        result = ((result* 31)+((this.replaces == null)? 0 :this.replaces.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.intent == null)? 0 :this.intent.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof RequestGroup) == false) {
            return false;
        }
        RequestGroup rhs = ((RequestGroup) other);
        return ((((((((((((((((((((((((((super.equals(rhs)&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._instantiatesCanonical == rhs._instantiatesCanonical)||((this._instantiatesCanonical!= null)&&this._instantiatesCanonical.equals(rhs._instantiatesCanonical))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this._intent == rhs._intent)||((this._intent!= null)&&this._intent.equals(rhs._intent))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._authoredOn == rhs._authoredOn)||((this._authoredOn!= null)&&this._authoredOn.equals(rhs._authoredOn))))&&((this.authoredOn == rhs.authoredOn)||((this.authoredOn!= null)&&this.authoredOn.equals(rhs.authoredOn))))&&((this.replaces == rhs.replaces)||((this.replaces!= null)&&this.replaces.equals(rhs.replaces))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.intent == rhs.intent)||((this.intent!= null)&&this.intent.equals(rhs.intent))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.groupIdentifier == rhs.groupIdentifier)||((this.groupIdentifier!= null)&&this.groupIdentifier.equals(rhs.groupIdentifier))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
