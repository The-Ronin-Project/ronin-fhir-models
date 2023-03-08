
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
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "type",
    "name",
    "_name",
    "subject",
    "servicePeriod",
    "coverage",
    "owner",
    "description",
    "_description",
    "guarantor",
    "partOf"
})
@Generated("jsonschema2pojo")
public class Account
    extends DomainResource
{

    /**
     * This is a Account resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Account resource")
    private String resourceType;
    /**
     * Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Indicates whether the account is presently used/usable or not.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Indicates whether the account is presently used/usable or not.")
    private Account.Status status;
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
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
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
     * Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.")
    private List<Reference> subject = new ArrayList<Reference>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period servicePeriod;
    /**
     * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
     * 
     */
    @JsonProperty("coverage")
    @JsonPropertyDescription("The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.")
    private List<Account_Coverage> coverage = new ArrayList<Account_Coverage>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference owner;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * The parties responsible for balancing the account if other payment options fall short.
     * 
     */
    @JsonProperty("guarantor")
    @JsonPropertyDescription("The parties responsible for balancing the account if other payment options fall short.")
    private List<Account_Guarantor> guarantor = new ArrayList<Account_Guarantor>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference partOf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Account resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Account resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Indicates whether the account is presently used/usable or not.
     * 
     */
    @JsonProperty("status")
    public Account.Status getStatus() {
        return status;
    }

    /**
     * Indicates whether the account is presently used/usable or not.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Account.Status status) {
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
     * Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.
     * 
     */
    @JsonProperty("subject")
    public List<Reference> getSubject() {
        return subject;
    }

    /**
     * Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(List<Reference> subject) {
        this.subject = subject;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicePeriod")
    public Period getServicePeriod() {
        return servicePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicePeriod")
    public void setServicePeriod(Period servicePeriod) {
        this.servicePeriod = servicePeriod;
    }

    /**
     * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
     * 
     */
    @JsonProperty("coverage")
    public List<Account_Coverage> getCoverage() {
        return coverage;
    }

    /**
     * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
     * 
     */
    @JsonProperty("coverage")
    public void setCoverage(List<Account_Coverage> coverage) {
        this.coverage = coverage;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    public Reference getOwner() {
        return owner;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Reference owner) {
        this.owner = owner;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * The parties responsible for balancing the account if other payment options fall short.
     * 
     */
    @JsonProperty("guarantor")
    public List<Account_Guarantor> getGuarantor() {
        return guarantor;
    }

    /**
     * The parties responsible for balancing the account if other payment options fall short.
     * 
     */
    @JsonProperty("guarantor")
    public void setGuarantor(List<Account_Guarantor> guarantor) {
        this.guarantor = guarantor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    public Reference getPartOf() {
        return partOf;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(Reference partOf) {
        this.partOf = partOf;
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
        sb.append(Account.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("servicePeriod");
        sb.append('=');
        sb.append(((this.servicePeriod == null)?"<null>":this.servicePeriod));
        sb.append(',');
        sb.append("coverage");
        sb.append('=');
        sb.append(((this.coverage == null)?"<null>":this.coverage));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("guarantor");
        sb.append('=');
        sb.append(((this.guarantor == null)?"<null>":this.guarantor));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
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
        result = ((result* 31)+((this.coverage == null)? 0 :this.coverage.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.guarantor == null)? 0 :this.guarantor.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.servicePeriod == null)? 0 :this.servicePeriod.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
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
        if ((other instanceof Account) == false) {
            return false;
        }
        Account rhs = ((Account) other);
        return ((((((((((((((((super.equals(rhs)&&((this.coverage == rhs.coverage)||((this.coverage!= null)&&this.coverage.equals(rhs.coverage))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.guarantor == rhs.guarantor)||((this.guarantor!= null)&&this.guarantor.equals(rhs.guarantor))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.servicePeriod == rhs.servicePeriod)||((this.servicePeriod!= null)&&this.servicePeriod.equals(rhs.servicePeriod))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Indicates whether the account is presently used/usable or not.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive"),
        ENTERED_IN_ERROR("entered-in-error"),
        ON_HOLD("on-hold"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Account.Status> CONSTANTS = new HashMap<String, Account.Status>();

        static {
            for (Account.Status c: values()) {
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
        public static Account.Status fromValue(String value) {
            Account.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
