
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
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "target",
    "occurredPeriod",
    "occurredDateTime",
    "_occurredDateTime",
    "recorded",
    "_recorded",
    "policy",
    "_policy",
    "location",
    "reason",
    "activity",
    "agent",
    "entity",
    "signature"
})
@Generated("jsonschema2pojo")
public class Provenance
    extends DomainResource
{

    /**
     * This is a Provenance resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Provenance resource")
    private String resourceType;
    /**
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
     * (Required)
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.")
    private List<Reference> target = new ArrayList<Reference>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurredPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period occurredPeriod;
    /**
     * The period during which the activity occurred.
     * 
     */
    @JsonProperty("occurredDateTime")
    @JsonPropertyDescription("The period during which the activity occurred.")
    private String occurredDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurredDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurredDateTime;
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
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * 
     */
    @JsonProperty("policy")
    @JsonPropertyDescription("Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.")
    private List<String> policy = new ArrayList<String>();
    /**
     * Extensions for policy
     * 
     */
    @JsonProperty("_policy")
    @JsonPropertyDescription("Extensions for policy")
    private List<Element> _policy = new ArrayList<Element>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * The reason that the activity was taking place.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("The reason that the activity was taking place.")
    private List<CodeableConcept> reason = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("activity")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept activity;
    /**
     * An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
     * (Required)
     * 
     */
    @JsonProperty("agent")
    @JsonPropertyDescription("An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.")
    private List<Provenance_Agent> agent = new ArrayList<Provenance_Agent>();
    /**
     * An entity used in this activity.
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("An entity used in this activity.")
    private List<Provenance_Entity> entity = new ArrayList<Provenance_Entity>();
    /**
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     * 
     */
    @JsonProperty("signature")
    @JsonPropertyDescription("A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.")
    private List<Signature> signature = new ArrayList<Signature>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Provenance resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Provenance resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
     * (Required)
     * 
     */
    @JsonProperty("target")
    public List<Reference> getTarget() {
        return target;
    }

    /**
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
     * (Required)
     * 
     */
    @JsonProperty("target")
    public void setTarget(List<Reference> target) {
        this.target = target;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurredPeriod")
    public Period getOccurredPeriod() {
        return occurredPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurredPeriod")
    public void setOccurredPeriod(Period occurredPeriod) {
        this.occurredPeriod = occurredPeriod;
    }

    /**
     * The period during which the activity occurred.
     * 
     */
    @JsonProperty("occurredDateTime")
    public String getOccurredDateTime() {
        return occurredDateTime;
    }

    /**
     * The period during which the activity occurred.
     * 
     */
    @JsonProperty("occurredDateTime")
    public void setOccurredDateTime(String occurredDateTime) {
        this.occurredDateTime = occurredDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurredDateTime")
    public Element get_occurredDateTime() {
        return _occurredDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurredDateTime")
    public void set_occurredDateTime(Element _occurredDateTime) {
        this._occurredDateTime = _occurredDateTime;
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
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * 
     */
    @JsonProperty("policy")
    public List<String> getPolicy() {
        return policy;
    }

    /**
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * 
     */
    @JsonProperty("policy")
    public void setPolicy(List<String> policy) {
        this.policy = policy;
    }

    /**
     * Extensions for policy
     * 
     */
    @JsonProperty("_policy")
    public List<Element> get_policy() {
        return _policy;
    }

    /**
     * Extensions for policy
     * 
     */
    @JsonProperty("_policy")
    public void set_policy(List<Element> _policy) {
        this._policy = _policy;
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
     * The reason that the activity was taking place.
     * 
     */
    @JsonProperty("reason")
    public List<CodeableConcept> getReason() {
        return reason;
    }

    /**
     * The reason that the activity was taking place.
     * 
     */
    @JsonProperty("reason")
    public void setReason(List<CodeableConcept> reason) {
        this.reason = reason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("activity")
    public CodeableConcept getActivity() {
        return activity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("activity")
    public void setActivity(CodeableConcept activity) {
        this.activity = activity;
    }

    /**
     * An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
     * (Required)
     * 
     */
    @JsonProperty("agent")
    public List<Provenance_Agent> getAgent() {
        return agent;
    }

    /**
     * An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
     * (Required)
     * 
     */
    @JsonProperty("agent")
    public void setAgent(List<Provenance_Agent> agent) {
        this.agent = agent;
    }

    /**
     * An entity used in this activity.
     * 
     */
    @JsonProperty("entity")
    public List<Provenance_Entity> getEntity() {
        return entity;
    }

    /**
     * An entity used in this activity.
     * 
     */
    @JsonProperty("entity")
    public void setEntity(List<Provenance_Entity> entity) {
        this.entity = entity;
    }

    /**
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     * 
     */
    @JsonProperty("signature")
    public List<Signature> getSignature() {
        return signature;
    }

    /**
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     * 
     */
    @JsonProperty("signature")
    public void setSignature(List<Signature> signature) {
        this.signature = signature;
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
        sb.append(Provenance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("occurredPeriod");
        sb.append('=');
        sb.append(((this.occurredPeriod == null)?"<null>":this.occurredPeriod));
        sb.append(',');
        sb.append("occurredDateTime");
        sb.append('=');
        sb.append(((this.occurredDateTime == null)?"<null>":this.occurredDateTime));
        sb.append(',');
        sb.append("_occurredDateTime");
        sb.append('=');
        sb.append(((this._occurredDateTime == null)?"<null>":this._occurredDateTime));
        sb.append(',');
        sb.append("recorded");
        sb.append('=');
        sb.append(((this.recorded == null)?"<null>":this.recorded));
        sb.append(',');
        sb.append("_recorded");
        sb.append('=');
        sb.append(((this._recorded == null)?"<null>":this._recorded));
        sb.append(',');
        sb.append("policy");
        sb.append('=');
        sb.append(((this.policy == null)?"<null>":this.policy));
        sb.append(',');
        sb.append("_policy");
        sb.append('=');
        sb.append(((this._policy == null)?"<null>":this._policy));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("activity");
        sb.append('=');
        sb.append(((this.activity == null)?"<null>":this.activity));
        sb.append(',');
        sb.append("agent");
        sb.append('=');
        sb.append(((this.agent == null)?"<null>":this.agent));
        sb.append(',');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
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
        result = ((result* 31)+((this.agent == null)? 0 :this.agent.hashCode()));
        result = ((result* 31)+((this.activity == null)? 0 :this.activity.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.occurredPeriod == null)? 0 :this.occurredPeriod.hashCode()));
        result = ((result* 31)+((this.recorded == null)? 0 :this.recorded.hashCode()));
        result = ((result* 31)+((this._policy == null)? 0 :this._policy.hashCode()));
        result = ((result* 31)+((this._recorded == null)? 0 :this._recorded.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this._occurredDateTime == null)? 0 :this._occurredDateTime.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.occurredDateTime == null)? 0 :this.occurredDateTime.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.policy == null)? 0 :this.policy.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Provenance) == false) {
            return false;
        }
        Provenance rhs = ((Provenance) other);
        return ((((((((((((((((super.equals(rhs)&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.agent == rhs.agent)||((this.agent!= null)&&this.agent.equals(rhs.agent))))&&((this.activity == rhs.activity)||((this.activity!= null)&&this.activity.equals(rhs.activity))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.occurredPeriod == rhs.occurredPeriod)||((this.occurredPeriod!= null)&&this.occurredPeriod.equals(rhs.occurredPeriod))))&&((this.recorded == rhs.recorded)||((this.recorded!= null)&&this.recorded.equals(rhs.recorded))))&&((this._policy == rhs._policy)||((this._policy!= null)&&this._policy.equals(rhs._policy))))&&((this._recorded == rhs._recorded)||((this._recorded!= null)&&this._recorded.equals(rhs._recorded))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this._occurredDateTime == rhs._occurredDateTime)||((this._occurredDateTime!= null)&&this._occurredDateTime.equals(rhs._occurredDateTime))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.occurredDateTime == rhs.occurredDateTime)||((this.occurredDateTime!= null)&&this.occurredDateTime.equals(rhs.occurredDateTime))))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.policy == rhs.policy)||((this.policy!= null)&&this.policy.equals(rhs.policy))));
    }

}
