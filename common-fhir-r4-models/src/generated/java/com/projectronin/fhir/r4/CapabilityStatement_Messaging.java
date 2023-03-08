
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "endpoint",
    "reliableCache",
    "_reliableCache",
    "documentation",
    "_documentation",
    "supportedMessage"
})
@Generated("jsonschema2pojo")
public class CapabilityStatement_Messaging {

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String id;
    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
    private List<Extension> extension = new ArrayList<Extension>();
    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).")
    private List<Extension> modifierExtension = new ArrayList<Extension>();
    /**
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("An endpoint (network accessible address) to which messages and/or replies are to be sent.")
    private List<CapabilityStatement_Endpoint> endpoint = new ArrayList<CapabilityStatement_Endpoint>();
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("reliableCache")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double reliableCache;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reliableCache")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _reliableCache;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String documentation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _documentation;
    /**
     * References to message definitions for messages this system can send or receive.
     * 
     */
    @JsonProperty("supportedMessage")
    @JsonPropertyDescription("References to message definitions for messages this system can send or receive.")
    private List<CapabilityStatement_SupportedMessage> supportedMessage = new ArrayList<CapabilityStatement_SupportedMessage>();

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public List<Extension> getExtension() {
        return extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public List<Extension> getModifierExtension() {
        return modifierExtension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public void setModifierExtension(List<Extension> modifierExtension) {
        this.modifierExtension = modifierExtension;
    }

    /**
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * 
     */
    @JsonProperty("endpoint")
    public List<CapabilityStatement_Endpoint> getEndpoint() {
        return endpoint;
    }

    /**
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(List<CapabilityStatement_Endpoint> endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("reliableCache")
    public Double getReliableCache() {
        return reliableCache;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("reliableCache")
    public void setReliableCache(Double reliableCache) {
        this.reliableCache = reliableCache;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reliableCache")
    public Element get_reliableCache() {
        return _reliableCache;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reliableCache")
    public void set_reliableCache(Element _reliableCache) {
        this._reliableCache = _reliableCache;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    public String getDocumentation() {
        return documentation;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    public Element get_documentation() {
        return _documentation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    public void set_documentation(Element _documentation) {
        this._documentation = _documentation;
    }

    /**
     * References to message definitions for messages this system can send or receive.
     * 
     */
    @JsonProperty("supportedMessage")
    public List<CapabilityStatement_SupportedMessage> getSupportedMessage() {
        return supportedMessage;
    }

    /**
     * References to message definitions for messages this system can send or receive.
     * 
     */
    @JsonProperty("supportedMessage")
    public void setSupportedMessage(List<CapabilityStatement_SupportedMessage> supportedMessage) {
        this.supportedMessage = supportedMessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CapabilityStatement_Messaging.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("modifierExtension");
        sb.append('=');
        sb.append(((this.modifierExtension == null)?"<null>":this.modifierExtension));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("reliableCache");
        sb.append('=');
        sb.append(((this.reliableCache == null)?"<null>":this.reliableCache));
        sb.append(',');
        sb.append("_reliableCache");
        sb.append('=');
        sb.append(((this._reliableCache == null)?"<null>":this._reliableCache));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("_documentation");
        sb.append('=');
        sb.append(((this._documentation == null)?"<null>":this._documentation));
        sb.append(',');
        sb.append("supportedMessage");
        sb.append('=');
        sb.append(((this.supportedMessage == null)?"<null>":this.supportedMessage));
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
        result = ((result* 31)+((this._documentation == null)? 0 :this._documentation.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this._reliableCache == null)? 0 :this._reliableCache.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reliableCache == null)? 0 :this.reliableCache.hashCode()));
        result = ((result* 31)+((this.supportedMessage == null)? 0 :this.supportedMessage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapabilityStatement_Messaging) == false) {
            return false;
        }
        CapabilityStatement_Messaging rhs = ((CapabilityStatement_Messaging) other);
        return ((((((((((this._documentation == rhs._documentation)||((this._documentation!= null)&&this._documentation.equals(rhs._documentation)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this._reliableCache == rhs._reliableCache)||((this._reliableCache!= null)&&this._reliableCache.equals(rhs._reliableCache))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reliableCache == rhs.reliableCache)||((this.reliableCache!= null)&&this.reliableCache.equals(rhs.reliableCache))))&&((this.supportedMessage == rhs.supportedMessage)||((this.supportedMessage!= null)&&this.supportedMessage.equals(rhs.supportedMessage))));
    }

}
