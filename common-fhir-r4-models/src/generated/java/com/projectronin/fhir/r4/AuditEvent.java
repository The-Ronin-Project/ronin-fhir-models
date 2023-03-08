
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
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "type",
    "subtype",
    "action",
    "_action",
    "period",
    "recorded",
    "_recorded",
    "outcome",
    "_outcome",
    "outcomeDesc",
    "_outcomeDesc",
    "purposeOfEvent",
    "agent",
    "source",
    "entity"
})
@Generated("jsonschema2pojo")
public class AuditEvent
    extends DomainResource
{

    /**
     * This is a AuditEvent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a AuditEvent resource")
    private String resourceType;
    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding type;
    /**
     * Identifier for the category of event.
     * 
     */
    @JsonProperty("subtype")
    @JsonPropertyDescription("Identifier for the category of event.")
    private List<Coding> subtype = new ArrayList<Coding>();
    /**
     * Indicator for type of action performed during the event that generated the audit.
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("Indicator for type of action performed during the event that generated the audit.")
    private AuditEvent.Action action;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_action")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _action;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("recorded")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String recorded;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recorded")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _recorded;
    /**
     * Indicates whether the event succeeded or failed.
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("Indicates whether the event succeeded or failed.")
    private AuditEvent.Outcome outcome;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _outcome;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("outcomeDesc")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String outcomeDesc;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcomeDesc")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _outcomeDesc;
    /**
     * The purposeOfUse (reason) that was used during the event being recorded.
     * 
     */
    @JsonProperty("purposeOfEvent")
    @JsonPropertyDescription("The purposeOfUse (reason) that was used during the event being recorded.")
    private List<CodeableConcept> purposeOfEvent = new ArrayList<CodeableConcept>();
    /**
     * An actor taking an active role in the event or activity that is logged.
     * (Required)
     * 
     */
    @JsonProperty("agent")
    @JsonPropertyDescription("An actor taking an active role in the event or activity that is logged.")
    private List<AuditEvent_Agent> agent = new ArrayList<AuditEvent_Agent>();
    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.")
    private AuditEvent_Source source;
    /**
     * Specific instances of data or objects that have been accessed.
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("Specific instances of data or objects that have been accessed.")
    private List<AuditEvent_Entity> entity = new ArrayList<AuditEvent_Entity>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a AuditEvent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a AuditEvent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Coding getType() {
        return type;
    }

    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Coding type) {
        this.type = type;
    }

    /**
     * Identifier for the category of event.
     * 
     */
    @JsonProperty("subtype")
    public List<Coding> getSubtype() {
        return subtype;
    }

    /**
     * Identifier for the category of event.
     * 
     */
    @JsonProperty("subtype")
    public void setSubtype(List<Coding> subtype) {
        this.subtype = subtype;
    }

    /**
     * Indicator for type of action performed during the event that generated the audit.
     * 
     */
    @JsonProperty("action")
    public AuditEvent.Action getAction() {
        return action;
    }

    /**
     * Indicator for type of action performed during the event that generated the audit.
     * 
     */
    @JsonProperty("action")
    public void setAction(AuditEvent.Action action) {
        this.action = action;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_action")
    public Element get_action() {
        return _action;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_action")
    public void set_action(Element _action) {
        this._action = _action;
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
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("recorded")
    public String getRecorded() {
        return recorded;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("recorded")
    public void setRecorded(String recorded) {
        this.recorded = recorded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recorded")
    public Element get_recorded() {
        return _recorded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recorded")
    public void set_recorded(Element _recorded) {
        this._recorded = _recorded;
    }

    /**
     * Indicates whether the event succeeded or failed.
     * 
     */
    @JsonProperty("outcome")
    public AuditEvent.Outcome getOutcome() {
        return outcome;
    }

    /**
     * Indicates whether the event succeeded or failed.
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(AuditEvent.Outcome outcome) {
        this.outcome = outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public Element get_outcome() {
        return _outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public void set_outcome(Element _outcome) {
        this._outcome = _outcome;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("outcomeDesc")
    public String getOutcomeDesc() {
        return outcomeDesc;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("outcomeDesc")
    public void setOutcomeDesc(String outcomeDesc) {
        this.outcomeDesc = outcomeDesc;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcomeDesc")
    public Element get_outcomeDesc() {
        return _outcomeDesc;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcomeDesc")
    public void set_outcomeDesc(Element _outcomeDesc) {
        this._outcomeDesc = _outcomeDesc;
    }

    /**
     * The purposeOfUse (reason) that was used during the event being recorded.
     * 
     */
    @JsonProperty("purposeOfEvent")
    public List<CodeableConcept> getPurposeOfEvent() {
        return purposeOfEvent;
    }

    /**
     * The purposeOfUse (reason) that was used during the event being recorded.
     * 
     */
    @JsonProperty("purposeOfEvent")
    public void setPurposeOfEvent(List<CodeableConcept> purposeOfEvent) {
        this.purposeOfEvent = purposeOfEvent;
    }

    /**
     * An actor taking an active role in the event or activity that is logged.
     * (Required)
     * 
     */
    @JsonProperty("agent")
    public List<AuditEvent_Agent> getAgent() {
        return agent;
    }

    /**
     * An actor taking an active role in the event or activity that is logged.
     * (Required)
     * 
     */
    @JsonProperty("agent")
    public void setAgent(List<AuditEvent_Agent> agent) {
        this.agent = agent;
    }

    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public AuditEvent_Source getSource() {
        return source;
    }

    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(AuditEvent_Source source) {
        this.source = source;
    }

    /**
     * Specific instances of data or objects that have been accessed.
     * 
     */
    @JsonProperty("entity")
    public List<AuditEvent_Entity> getEntity() {
        return entity;
    }

    /**
     * Specific instances of data or objects that have been accessed.
     * 
     */
    @JsonProperty("entity")
    public void setEntity(List<AuditEvent_Entity> entity) {
        this.entity = entity;
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
        sb.append(AuditEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("subtype");
        sb.append('=');
        sb.append(((this.subtype == null)?"<null>":this.subtype));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("_action");
        sb.append('=');
        sb.append(((this._action == null)?"<null>":this._action));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("recorded");
        sb.append('=');
        sb.append(((this.recorded == null)?"<null>":this.recorded));
        sb.append(',');
        sb.append("_recorded");
        sb.append('=');
        sb.append(((this._recorded == null)?"<null>":this._recorded));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("_outcome");
        sb.append('=');
        sb.append(((this._outcome == null)?"<null>":this._outcome));
        sb.append(',');
        sb.append("outcomeDesc");
        sb.append('=');
        sb.append(((this.outcomeDesc == null)?"<null>":this.outcomeDesc));
        sb.append(',');
        sb.append("_outcomeDesc");
        sb.append('=');
        sb.append(((this._outcomeDesc == null)?"<null>":this._outcomeDesc));
        sb.append(',');
        sb.append("purposeOfEvent");
        sb.append('=');
        sb.append(((this.purposeOfEvent == null)?"<null>":this.purposeOfEvent));
        sb.append(',');
        sb.append("agent");
        sb.append('=');
        sb.append(((this.agent == null)?"<null>":this.agent));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.agent == null)? 0 :this.agent.hashCode()));
        result = ((result* 31)+((this._outcomeDesc == null)? 0 :this._outcomeDesc.hashCode()));
        result = ((result* 31)+((this._outcome == null)? 0 :this._outcome.hashCode()));
        result = ((result* 31)+((this._action == null)? 0 :this._action.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.recorded == null)? 0 :this.recorded.hashCode()));
        result = ((result* 31)+((this._recorded == null)? 0 :this._recorded.hashCode()));
        result = ((result* 31)+((this.subtype == null)? 0 :this.subtype.hashCode()));
        result = ((result* 31)+((this.outcomeDesc == null)? 0 :this.outcomeDesc.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.purposeOfEvent == null)? 0 :this.purposeOfEvent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuditEvent) == false) {
            return false;
        }
        AuditEvent rhs = ((AuditEvent) other);
        return (((((((((((((((((super.equals(rhs)&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.agent == rhs.agent)||((this.agent!= null)&&this.agent.equals(rhs.agent))))&&((this._outcomeDesc == rhs._outcomeDesc)||((this._outcomeDesc!= null)&&this._outcomeDesc.equals(rhs._outcomeDesc))))&&((this._outcome == rhs._outcome)||((this._outcome!= null)&&this._outcome.equals(rhs._outcome))))&&((this._action == rhs._action)||((this._action!= null)&&this._action.equals(rhs._action))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.recorded == rhs.recorded)||((this.recorded!= null)&&this.recorded.equals(rhs.recorded))))&&((this._recorded == rhs._recorded)||((this._recorded!= null)&&this._recorded.equals(rhs._recorded))))&&((this.subtype == rhs.subtype)||((this.subtype!= null)&&this.subtype.equals(rhs.subtype))))&&((this.outcomeDesc == rhs.outcomeDesc)||((this.outcomeDesc!= null)&&this.outcomeDesc.equals(rhs.outcomeDesc))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.purposeOfEvent == rhs.purposeOfEvent)||((this.purposeOfEvent!= null)&&this.purposeOfEvent.equals(rhs.purposeOfEvent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * Indicator for type of action performed during the event that generated the audit.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Action {

        C("C"),
        R("R"),
        U("U"),
        D("D"),
        E("E");
        private final String value;
        private final static Map<String, AuditEvent.Action> CONSTANTS = new HashMap<String, AuditEvent.Action>();

        static {
            for (AuditEvent.Action c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Action(String value) {
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
        public static AuditEvent.Action fromValue(String value) {
            AuditEvent.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Indicates whether the event succeeded or failed.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Outcome {

        _0("0"),
        _4("4"),
        _8("8"),
        _12("12");
        private final String value;
        private final static Map<String, AuditEvent.Outcome> CONSTANTS = new HashMap<String, AuditEvent.Outcome>();

        static {
            for (AuditEvent.Outcome c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Outcome(String value) {
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
        public static AuditEvent.Outcome fromValue(String value) {
            AuditEvent.Outcome constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
