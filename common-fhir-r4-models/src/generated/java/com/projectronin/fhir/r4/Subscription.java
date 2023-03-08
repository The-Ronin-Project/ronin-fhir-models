
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
 * The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined &quot;channel&quot; so that another system can take an appropriate action.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "status",
    "_status",
    "contact",
    "end",
    "_end",
    "reason",
    "_reason",
    "criteria",
    "_criteria",
    "error",
    "_error",
    "channel"
})
@Generated("jsonschema2pojo")
public class Subscription
    extends DomainResource
{

    /**
     * This is a Subscription resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Subscription resource")
    private String resourceType;
    /**
     * The status of the subscription, which marks the server state for managing the subscription.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the subscription, which marks the server state for managing the subscription.")
    private Subscription.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.")
    private List<ContactPoint> contact = new ArrayList<ContactPoint>();
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String reason;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reason")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _reason;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("criteria")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String criteria;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_criteria")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _criteria;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String error;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_error")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _error;
    /**
     * The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined &quot;channel&quot; so that another system can take an appropriate action.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    @JsonPropertyDescription("The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system can take an appropriate action.")
    private Subscription_Channel channel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Subscription resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Subscription resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The status of the subscription, which marks the server state for managing the subscription.
     * 
     */
    @JsonProperty("status")
    public Subscription.Status getStatus() {
        return status;
    }

    /**
     * The status of the subscription, which marks the server state for managing the subscription.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Subscription.Status status) {
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
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     * 
     */
    @JsonProperty("contact")
    public List<ContactPoint> getContact() {
        return contact;
    }

    /**
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<ContactPoint> contact) {
        this.contact = contact;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reason")
    public Element get_reason() {
        return _reason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reason")
    public void set_reason(Element _reason) {
        this._reason = _reason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("criteria")
    public String getCriteria() {
        return criteria;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("criteria")
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_criteria")
    public Element get_criteria() {
        return _criteria;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_criteria")
    public void set_criteria(Element _criteria) {
        this._criteria = _criteria;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_error")
    public Element get_error() {
        return _error;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_error")
    public void set_error(Element _error) {
        this._error = _error;
    }

    /**
     * The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined &quot;channel&quot; so that another system can take an appropriate action.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public Subscription_Channel getChannel() {
        return channel;
    }

    /**
     * The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined &quot;channel&quot; so that another system can take an appropriate action.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public void setChannel(Subscription_Channel channel) {
        this.channel = channel;
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
        sb.append(Subscription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        sb.append("_end");
        sb.append('=');
        sb.append(((this._end == null)?"<null>":this._end));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("_reason");
        sb.append('=');
        sb.append(((this._reason == null)?"<null>":this._reason));
        sb.append(',');
        sb.append("criteria");
        sb.append('=');
        sb.append(((this.criteria == null)?"<null>":this.criteria));
        sb.append(',');
        sb.append("_criteria");
        sb.append('=');
        sb.append(((this._criteria == null)?"<null>":this._criteria));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("_error");
        sb.append('=');
        sb.append(((this._error == null)?"<null>":this._error));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this._criteria == null)? 0 :this._criteria.hashCode()));
        result = ((result* 31)+((this.criteria == null)? 0 :this.criteria.hashCode()));
        result = ((result* 31)+((this._error == null)? 0 :this._error.hashCode()));
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this._end == null)? 0 :this._end.hashCode()));
        result = ((result* 31)+((this._reason == null)? 0 :this._reason.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof Subscription) == false) {
            return false;
        }
        Subscription rhs = ((Subscription) other);
        return ((((((((((((((super.equals(rhs)&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this._criteria == rhs._criteria)||((this._criteria!= null)&&this._criteria.equals(rhs._criteria))))&&((this.criteria == rhs.criteria)||((this.criteria!= null)&&this.criteria.equals(rhs.criteria))))&&((this._error == rhs._error)||((this._error!= null)&&this._error.equals(rhs._error))))&&((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this._end == rhs._end)||((this._end!= null)&&this._end.equals(rhs._end))))&&((this._reason == rhs._reason)||((this._reason!= null)&&this._reason.equals(rhs._reason))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The status of the subscription, which marks the server state for managing the subscription.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        REQUESTED("requested"),
        ACTIVE("active"),
        ERROR("error"),
        OFF("off");
        private final String value;
        private final static Map<String, Subscription.Status> CONSTANTS = new HashMap<String, Subscription.Status>();

        static {
            for (Subscription.Status c: values()) {
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
        public static Subscription.Status fromValue(String value) {
            Subscription.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
