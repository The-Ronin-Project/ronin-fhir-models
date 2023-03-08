
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined &quot;channel&quot; so that another system can take an appropriate action.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "_type",
    "endpoint",
    "_endpoint",
    "payload",
    "_payload",
    "header",
    "_header"
})
@Generated("jsonschema2pojo")
public class Subscription_Channel {

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
     * The type of channel to send notifications on.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of channel to send notifications on.")
    private Subscription_Channel.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("A URI that is a literal reference")
    private String endpoint;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_endpoint")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _endpoint;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("payload")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String payload;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_payload")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _payload;
    /**
     * Additional headers / information to send as part of the notification.
     * 
     */
    @JsonProperty("header")
    @JsonPropertyDescription("Additional headers / information to send as part of the notification.")
    private List<String> header = new ArrayList<String>();
    /**
     * Extensions for header
     * 
     */
    @JsonProperty("_header")
    @JsonPropertyDescription("Extensions for header")
    private List<Element> _header = new ArrayList<Element>();

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
     * The type of channel to send notifications on.
     * 
     */
    @JsonProperty("type")
    public Subscription_Channel.Type getType() {
        return type;
    }

    /**
     * The type of channel to send notifications on.
     * 
     */
    @JsonProperty("type")
    public void setType(Subscription_Channel.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_endpoint")
    public Element get_endpoint() {
        return _endpoint;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_endpoint")
    public void set_endpoint(Element _endpoint) {
        this._endpoint = _endpoint;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("payload")
    public String getPayload() {
        return payload;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_payload")
    public Element get_payload() {
        return _payload;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_payload")
    public void set_payload(Element _payload) {
        this._payload = _payload;
    }

    /**
     * Additional headers / information to send as part of the notification.
     * 
     */
    @JsonProperty("header")
    public List<String> getHeader() {
        return header;
    }

    /**
     * Additional headers / information to send as part of the notification.
     * 
     */
    @JsonProperty("header")
    public void setHeader(List<String> header) {
        this.header = header;
    }

    /**
     * Extensions for header
     * 
     */
    @JsonProperty("_header")
    public List<Element> get_header() {
        return _header;
    }

    /**
     * Extensions for header
     * 
     */
    @JsonProperty("_header")
    public void set_header(List<Element> _header) {
        this._header = _header;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Subscription_Channel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("_endpoint");
        sb.append('=');
        sb.append(((this._endpoint == null)?"<null>":this._endpoint));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        sb.append("_payload");
        sb.append('=');
        sb.append(((this._payload == null)?"<null>":this._payload));
        sb.append(',');
        sb.append("header");
        sb.append('=');
        sb.append(((this.header == null)?"<null>":this.header));
        sb.append(',');
        sb.append("_header");
        sb.append('=');
        sb.append(((this._header == null)?"<null>":this._header));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this._payload == null)? 0 :this._payload.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this._endpoint == null)? 0 :this._endpoint.hashCode()));
        result = ((result* 31)+((this._header == null)? 0 :this._header.hashCode()));
        result = ((result* 31)+((this.header == null)? 0 :this.header.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subscription_Channel) == false) {
            return false;
        }
        Subscription_Channel rhs = ((Subscription_Channel) other);
        return ((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this._payload == rhs._payload)||((this._payload!= null)&&this._payload.equals(rhs._payload))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this._endpoint == rhs._endpoint)||((this._endpoint!= null)&&this._endpoint.equals(rhs._endpoint))))&&((this._header == rhs._header)||((this._header!= null)&&this._header.equals(rhs._header))))&&((this.header == rhs.header)||((this.header!= null)&&this.header.equals(rhs.header))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * The type of channel to send notifications on.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        REST_HOOK("rest-hook"),
        WEBSOCKET("websocket"),
        EMAIL("email"),
        SMS("sms"),
        MESSAGE("message");
        private final String value;
        private final static Map<String, Subscription_Channel.Type> CONSTANTS = new HashMap<String, Subscription_Channel.Type>();

        static {
            for (Subscription_Channel.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Subscription_Channel.Type fromValue(String value) {
            Subscription_Channel.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
