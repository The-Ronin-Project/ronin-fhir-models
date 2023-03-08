
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "role",
    "who",
    "altId",
    "_altId",
    "name",
    "_name",
    "requestor",
    "_requestor",
    "location",
    "policy",
    "_policy",
    "media",
    "network",
    "purposeOfUse"
})
@Generated("jsonschema2pojo")
public class AuditEvent_Agent {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.")
    private List<CodeableConcept> role = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference who;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("altId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String altId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_altId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _altId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("requestor")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean requestor;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestor")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requestor;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     * 
     */
    @JsonProperty("policy")
    @JsonPropertyDescription("The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.")
    private List<String> policy = new ArrayList<String>();
    /**
     * Extensions for policy
     * 
     */
    @JsonProperty("_policy")
    @JsonPropertyDescription("Extensions for policy")
    private List<Element> _policy = new ArrayList<Element>();
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("media")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding media;
    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.")
    private AuditEvent_Network network;
    /**
     * The reason (purpose of use), specific to this agent, that was used during the event being recorded.
     * 
     */
    @JsonProperty("purposeOfUse")
    @JsonPropertyDescription("The reason (purpose of use), specific to this agent, that was used during the event being recorded.")
    private List<CodeableConcept> purposeOfUse = new ArrayList<CodeableConcept>();

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.
     * 
     */
    @JsonProperty("role")
    public List<CodeableConcept> getRole() {
        return role;
    }

    /**
     * The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.
     * 
     */
    @JsonProperty("role")
    public void setRole(List<CodeableConcept> role) {
        this.role = role;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    public Reference getWho() {
        return who;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    public void setWho(Reference who) {
        this.who = who;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("altId")
    public String getAltId() {
        return altId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("altId")
    public void setAltId(String altId) {
        this.altId = altId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_altId")
    public Element get_altId() {
        return _altId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_altId")
    public void set_altId(Element _altId) {
        this._altId = _altId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("requestor")
    public Boolean getRequestor() {
        return requestor;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("requestor")
    public void setRequestor(Boolean requestor) {
        this.requestor = requestor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestor")
    public Element get_requestor() {
        return _requestor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestor")
    public void set_requestor(Element _requestor) {
        this._requestor = _requestor;
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
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     * 
     */
    @JsonProperty("policy")
    public List<String> getPolicy() {
        return policy;
    }

    /**
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
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
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("media")
    public Coding getMedia() {
        return media;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("media")
    public void setMedia(Coding media) {
        this.media = media;
    }

    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     * 
     */
    @JsonProperty("network")
    public AuditEvent_Network getNetwork() {
        return network;
    }

    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     * 
     */
    @JsonProperty("network")
    public void setNetwork(AuditEvent_Network network) {
        this.network = network;
    }

    /**
     * The reason (purpose of use), specific to this agent, that was used during the event being recorded.
     * 
     */
    @JsonProperty("purposeOfUse")
    public List<CodeableConcept> getPurposeOfUse() {
        return purposeOfUse;
    }

    /**
     * The reason (purpose of use), specific to this agent, that was used during the event being recorded.
     * 
     */
    @JsonProperty("purposeOfUse")
    public void setPurposeOfUse(List<CodeableConcept> purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuditEvent_Agent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("who");
        sb.append('=');
        sb.append(((this.who == null)?"<null>":this.who));
        sb.append(',');
        sb.append("altId");
        sb.append('=');
        sb.append(((this.altId == null)?"<null>":this.altId));
        sb.append(',');
        sb.append("_altId");
        sb.append('=');
        sb.append(((this._altId == null)?"<null>":this._altId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("requestor");
        sb.append('=');
        sb.append(((this.requestor == null)?"<null>":this.requestor));
        sb.append(',');
        sb.append("_requestor");
        sb.append('=');
        sb.append(((this._requestor == null)?"<null>":this._requestor));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("policy");
        sb.append('=');
        sb.append(((this.policy == null)?"<null>":this.policy));
        sb.append(',');
        sb.append("_policy");
        sb.append('=');
        sb.append(((this._policy == null)?"<null>":this._policy));
        sb.append(',');
        sb.append("media");
        sb.append('=');
        sb.append(((this.media == null)?"<null>":this.media));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
        sb.append(',');
        sb.append("purposeOfUse");
        sb.append('=');
        sb.append(((this.purposeOfUse == null)?"<null>":this.purposeOfUse));
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
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this._altId == null)? 0 :this._altId.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.purposeOfUse == null)? 0 :this.purposeOfUse.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.media == null)? 0 :this.media.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._policy == null)? 0 :this._policy.hashCode()));
        result = ((result* 31)+((this.altId == null)? 0 :this.altId.hashCode()));
        result = ((result* 31)+((this.requestor == null)? 0 :this.requestor.hashCode()));
        result = ((result* 31)+((this._requestor == null)? 0 :this._requestor.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.who == null)? 0 :this.who.hashCode()));
        result = ((result* 31)+((this.policy == null)? 0 :this.policy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuditEvent_Agent) == false) {
            return false;
        }
        AuditEvent_Agent rhs = ((AuditEvent_Agent) other);
        return (((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this._altId == rhs._altId)||((this._altId!= null)&&this._altId.equals(rhs._altId))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.purposeOfUse == rhs.purposeOfUse)||((this.purposeOfUse!= null)&&this.purposeOfUse.equals(rhs.purposeOfUse))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.media == rhs.media)||((this.media!= null)&&this.media.equals(rhs.media))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._policy == rhs._policy)||((this._policy!= null)&&this._policy.equals(rhs._policy))))&&((this.altId == rhs.altId)||((this.altId!= null)&&this.altId.equals(rhs.altId))))&&((this.requestor == rhs.requestor)||((this.requestor!= null)&&this.requestor.equals(rhs.requestor))))&&((this._requestor == rhs._requestor)||((this._requestor!= null)&&this._requestor.equals(rhs._requestor))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.who == rhs.who)||((this.who!= null)&&this.who.equals(rhs.who))))&&((this.policy == rhs.policy)||((this.policy!= null)&&this.policy.equals(rhs.policy))));
    }

}
