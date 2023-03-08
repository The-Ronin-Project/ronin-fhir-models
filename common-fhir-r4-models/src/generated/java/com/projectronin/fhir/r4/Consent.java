
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
 * A record of a healthcare consumer&rsquo;s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "scope",
    "category",
    "patient",
    "dateTime",
    "_dateTime",
    "performer",
    "organization",
    "sourceAttachment",
    "sourceReference",
    "policy",
    "policyRule",
    "verification",
    "provision"
})
@Generated("jsonschema2pojo")
public class Consent
    extends DomainResource
{

    /**
     * This is a Consent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Consent resource")
    private String resourceType;
    /**
     * Unique identifier for this copy of the Consent Statement.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique identifier for this copy of the Consent Statement.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Indicates the current state of this consent.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Indicates the current state of this consent.")
    private Consent.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept scope;
    /**
     * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateTime")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String dateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dateTime;
    /**
     * Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.")
    private List<Reference> performer = new ArrayList<Reference>();
    /**
     * The organization that manages the consent, and the framework within which it is executed.
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("The organization that manages the consent, and the framework within which it is executed.")
    private List<Reference> organization = new ArrayList<Reference>();
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("sourceAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment sourceAttachment;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourceReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference sourceReference;
    /**
     * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
     * 
     */
    @JsonProperty("policy")
    @JsonPropertyDescription("The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.")
    private List<Consent_Policy> policy = new ArrayList<Consent_Policy>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("policyRule")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept policyRule;
    /**
     * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
     * 
     */
    @JsonProperty("verification")
    @JsonPropertyDescription("Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.")
    private List<Consent_Verification> verification = new ArrayList<Consent_Verification>();
    /**
     * A record of a healthcare consumer&rsquo;s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
     * 
     */
    @JsonProperty("provision")
    @JsonPropertyDescription("A record of a healthcare consumer\u2019s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.")
    private Consent_Provision provision;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Consent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Consent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique identifier for this copy of the Consent Statement.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique identifier for this copy of the Consent Statement.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Indicates the current state of this consent.
     * 
     */
    @JsonProperty("status")
    public Consent.Status getStatus() {
        return status;
    }

    /**
     * Indicates the current state of this consent.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Consent.Status status) {
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
     * (Required)
     * 
     */
    @JsonProperty("scope")
    public CodeableConcept getScope() {
        return scope;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("scope")
    public void setScope(CodeableConcept scope) {
        this.scope = scope;
    }

    /**
     * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateTime")
    public String getDateTime() {
        return dateTime;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateTime")
    public Element get_dateTime() {
        return _dateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateTime")
    public void set_dateTime(Element _dateTime) {
        this._dateTime = _dateTime;
    }

    /**
     * Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
     * 
     */
    @JsonProperty("performer")
    public List<Reference> getPerformer() {
        return performer;
    }

    /**
     * Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<Reference> performer) {
        this.performer = performer;
    }

    /**
     * The organization that manages the consent, and the framework within which it is executed.
     * 
     */
    @JsonProperty("organization")
    public List<Reference> getOrganization() {
        return organization;
    }

    /**
     * The organization that manages the consent, and the framework within which it is executed.
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(List<Reference> organization) {
        this.organization = organization;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("sourceAttachment")
    public Attachment getSourceAttachment() {
        return sourceAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("sourceAttachment")
    public void setSourceAttachment(Attachment sourceAttachment) {
        this.sourceAttachment = sourceAttachment;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourceReference")
    public Reference getSourceReference() {
        return sourceReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourceReference")
    public void setSourceReference(Reference sourceReference) {
        this.sourceReference = sourceReference;
    }

    /**
     * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
     * 
     */
    @JsonProperty("policy")
    public List<Consent_Policy> getPolicy() {
        return policy;
    }

    /**
     * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
     * 
     */
    @JsonProperty("policy")
    public void setPolicy(List<Consent_Policy> policy) {
        this.policy = policy;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("policyRule")
    public CodeableConcept getPolicyRule() {
        return policyRule;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("policyRule")
    public void setPolicyRule(CodeableConcept policyRule) {
        this.policyRule = policyRule;
    }

    /**
     * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
     * 
     */
    @JsonProperty("verification")
    public List<Consent_Verification> getVerification() {
        return verification;
    }

    /**
     * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
     * 
     */
    @JsonProperty("verification")
    public void setVerification(List<Consent_Verification> verification) {
        this.verification = verification;
    }

    /**
     * A record of a healthcare consumer&rsquo;s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
     * 
     */
    @JsonProperty("provision")
    public Consent_Provision getProvision() {
        return provision;
    }

    /**
     * A record of a healthcare consumer&rsquo;s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
     * 
     */
    @JsonProperty("provision")
    public void setProvision(Consent_Provision provision) {
        this.provision = provision;
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
        sb.append(Consent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("dateTime");
        sb.append('=');
        sb.append(((this.dateTime == null)?"<null>":this.dateTime));
        sb.append(',');
        sb.append("_dateTime");
        sb.append('=');
        sb.append(((this._dateTime == null)?"<null>":this._dateTime));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("sourceAttachment");
        sb.append('=');
        sb.append(((this.sourceAttachment == null)?"<null>":this.sourceAttachment));
        sb.append(',');
        sb.append("sourceReference");
        sb.append('=');
        sb.append(((this.sourceReference == null)?"<null>":this.sourceReference));
        sb.append(',');
        sb.append("policy");
        sb.append('=');
        sb.append(((this.policy == null)?"<null>":this.policy));
        sb.append(',');
        sb.append("policyRule");
        sb.append('=');
        sb.append(((this.policyRule == null)?"<null>":this.policyRule));
        sb.append(',');
        sb.append("verification");
        sb.append('=');
        sb.append(((this.verification == null)?"<null>":this.verification));
        sb.append(',');
        sb.append("provision");
        sb.append('=');
        sb.append(((this.provision == null)?"<null>":this.provision));
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
        result = ((result* 31)+((this.dateTime == null)? 0 :this.dateTime.hashCode()));
        result = ((result* 31)+((this.sourceReference == null)? 0 :this.sourceReference.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.sourceAttachment == null)? 0 :this.sourceAttachment.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.policyRule == null)? 0 :this.policyRule.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.provision == null)? 0 :this.provision.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this._dateTime == null)? 0 :this._dateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.verification == null)? 0 :this.verification.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.policy == null)? 0 :this.policy.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Consent) == false) {
            return false;
        }
        Consent rhs = ((Consent) other);
        return ((((((((((((((((((super.equals(rhs)&&((this.dateTime == rhs.dateTime)||((this.dateTime!= null)&&this.dateTime.equals(rhs.dateTime))))&&((this.sourceReference == rhs.sourceReference)||((this.sourceReference!= null)&&this.sourceReference.equals(rhs.sourceReference))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.sourceAttachment == rhs.sourceAttachment)||((this.sourceAttachment!= null)&&this.sourceAttachment.equals(rhs.sourceAttachment))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.policyRule == rhs.policyRule)||((this.policyRule!= null)&&this.policyRule.equals(rhs.policyRule))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.provision == rhs.provision)||((this.provision!= null)&&this.provision.equals(rhs.provision))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this._dateTime == rhs._dateTime)||((this._dateTime!= null)&&this._dateTime.equals(rhs._dateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.verification == rhs.verification)||((this.verification!= null)&&this.verification.equals(rhs.verification))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.policy == rhs.policy)||((this.policy!= null)&&this.policy.equals(rhs.policy))));
    }


    /**
     * Indicates the current state of this consent.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        PROPOSED("proposed"),
        ACTIVE("active"),
        REJECTED("rejected"),
        INACTIVE("inactive"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, Consent.Status> CONSTANTS = new HashMap<String, Consent.Status>();

        static {
            for (Consent.Status c: values()) {
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
        public static Consent.Status fromValue(String value) {
            Consent.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
