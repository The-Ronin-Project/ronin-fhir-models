
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
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "eventCoding",
    "eventUri",
    "_eventUri",
    "destination",
    "sender",
    "enterer",
    "author",
    "source",
    "responsible",
    "reason",
    "response",
    "focus",
    "definition"
})
@Generated("jsonschema2pojo")
public class MessageHeader
    extends DomainResource
{

    /**
     * This is a MessageHeader resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MessageHeader resource")
    private String resourceType;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("eventCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding eventCoding;
    /**
     * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value &quot;http://terminology.hl7.org/CodeSystem/message-events&quot;.  Alternatively uri to the EventDefinition.
     * 
     */
    @JsonProperty("eventUri")
    @JsonPropertyDescription("Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \"http://terminology.hl7.org/CodeSystem/message-events\".  Alternatively uri to the EventDefinition.")
    private String eventUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_eventUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _eventUri;
    /**
     * The destination application which the message is intended for.
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("The destination application which the message is intended for.")
    private List<MessageHeader_Destination> destination = new ArrayList<MessageHeader_Destination>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sender")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference sender;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference enterer;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference author;
    /**
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.")
    private MessageHeader_Source source;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("responsible")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference responsible;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept reason;
    /**
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.")
    private MessageHeader_Response response;
    /**
     * The actual data of the message - a reference to the root/focus class of the event.
     * 
     */
    @JsonProperty("focus")
    @JsonPropertyDescription("The actual data of the message - a reference to the root/focus class of the event.")
    private List<Reference> focus = new ArrayList<Reference>();
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("definition")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String definition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MessageHeader resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MessageHeader resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("eventCoding")
    public Coding getEventCoding() {
        return eventCoding;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("eventCoding")
    public void setEventCoding(Coding eventCoding) {
        this.eventCoding = eventCoding;
    }

    /**
     * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value &quot;http://terminology.hl7.org/CodeSystem/message-events&quot;.  Alternatively uri to the EventDefinition.
     * 
     */
    @JsonProperty("eventUri")
    public String getEventUri() {
        return eventUri;
    }

    /**
     * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value &quot;http://terminology.hl7.org/CodeSystem/message-events&quot;.  Alternatively uri to the EventDefinition.
     * 
     */
    @JsonProperty("eventUri")
    public void setEventUri(String eventUri) {
        this.eventUri = eventUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_eventUri")
    public Element get_eventUri() {
        return _eventUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_eventUri")
    public void set_eventUri(Element _eventUri) {
        this._eventUri = _eventUri;
    }

    /**
     * The destination application which the message is intended for.
     * 
     */
    @JsonProperty("destination")
    public List<MessageHeader_Destination> getDestination() {
        return destination;
    }

    /**
     * The destination application which the message is intended for.
     * 
     */
    @JsonProperty("destination")
    public void setDestination(List<MessageHeader_Destination> destination) {
        this.destination = destination;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    public Reference getEnterer() {
        return enterer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    public void setEnterer(Reference enterer) {
        this.enterer = enterer;
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
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public MessageHeader_Source getSource() {
        return source;
    }

    /**
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(MessageHeader_Source source) {
        this.source = source;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("responsible")
    public Reference getResponsible() {
        return responsible;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("responsible")
    public void setResponsible(Reference responsible) {
        this.responsible = responsible;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reason")
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reason")
    public void setReason(CodeableConcept reason) {
        this.reason = reason;
    }

    /**
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     * 
     */
    @JsonProperty("response")
    public MessageHeader_Response getResponse() {
        return response;
    }

    /**
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     * 
     */
    @JsonProperty("response")
    public void setResponse(MessageHeader_Response response) {
        this.response = response;
    }

    /**
     * The actual data of the message - a reference to the root/focus class of the event.
     * 
     */
    @JsonProperty("focus")
    public List<Reference> getFocus() {
        return focus;
    }

    /**
     * The actual data of the message - a reference to the root/focus class of the event.
     * 
     */
    @JsonProperty("focus")
    public void setFocus(List<Reference> focus) {
        this.focus = focus;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
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
        sb.append(MessageHeader.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("eventCoding");
        sb.append('=');
        sb.append(((this.eventCoding == null)?"<null>":this.eventCoding));
        sb.append(',');
        sb.append("eventUri");
        sb.append('=');
        sb.append(((this.eventUri == null)?"<null>":this.eventUri));
        sb.append(',');
        sb.append("_eventUri");
        sb.append('=');
        sb.append(((this._eventUri == null)?"<null>":this._eventUri));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("sender");
        sb.append('=');
        sb.append(((this.sender == null)?"<null>":this.sender));
        sb.append(',');
        sb.append("enterer");
        sb.append('=');
        sb.append(((this.enterer == null)?"<null>":this.enterer));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("responsible");
        sb.append('=');
        sb.append(((this.responsible == null)?"<null>":this.responsible));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("focus");
        sb.append('=');
        sb.append(((this.focus == null)?"<null>":this.focus));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
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
        result = ((result* 31)+((this.eventUri == null)? 0 :this.eventUri.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this._eventUri == null)? 0 :this._eventUri.hashCode()));
        result = ((result* 31)+((this.focus == null)? 0 :this.focus.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.eventCoding == null)? 0 :this.eventCoding.hashCode()));
        result = ((result* 31)+((this.sender == null)? 0 :this.sender.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.responsible == null)? 0 :this.responsible.hashCode()));
        result = ((result* 31)+((this.enterer == null)? 0 :this.enterer.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
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
        if ((other instanceof MessageHeader) == false) {
            return false;
        }
        MessageHeader rhs = ((MessageHeader) other);
        return (((((((((((((((super.equals(rhs)&&((this.eventUri == rhs.eventUri)||((this.eventUri!= null)&&this.eventUri.equals(rhs.eventUri))))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this._eventUri == rhs._eventUri)||((this._eventUri!= null)&&this._eventUri.equals(rhs._eventUri))))&&((this.focus == rhs.focus)||((this.focus!= null)&&this.focus.equals(rhs.focus))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.eventCoding == rhs.eventCoding)||((this.eventCoding!= null)&&this.eventCoding.equals(rhs.eventCoding))))&&((this.sender == rhs.sender)||((this.sender!= null)&&this.sender.equals(rhs.sender))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this.responsible == rhs.responsible)||((this.responsible!= null)&&this.responsible.equals(rhs.responsible))))&&((this.enterer == rhs.enterer)||((this.enterer!= null)&&this.enterer.equals(rhs.enterer))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
