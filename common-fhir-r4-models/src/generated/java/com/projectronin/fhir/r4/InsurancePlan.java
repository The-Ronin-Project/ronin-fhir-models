
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
 * Details of a Health Insurance product/plan provided by an organization.
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
    "alias",
    "_alias",
    "period",
    "ownedBy",
    "administeredBy",
    "coverageArea",
    "contact",
    "endpoint",
    "network",
    "coverage",
    "plan"
})
@Generated("jsonschema2pojo")
public class InsurancePlan
    extends DomainResource
{

    /**
     * This is a InsurancePlan resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a InsurancePlan resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The current state of the health insurance product.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current state of the health insurance product.")
    private InsurancePlan.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * The kind of health insurance product.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The kind of health insurance product.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
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
     * A list of alternate names that the product is known as, or was known as in the past.
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("A list of alternate names that the product is known as, or was known as in the past.")
    private List<String> alias = new ArrayList<String>();
    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    @JsonPropertyDescription("Extensions for alias")
    private List<Element> _alias = new ArrayList<Element>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("ownedBy")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference ownedBy;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("administeredBy")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference administeredBy;
    /**
     * The geographic region in which a health insurance product's benefits apply.
     * 
     */
    @JsonProperty("coverageArea")
    @JsonPropertyDescription("The geographic region in which a health insurance product's benefits apply.")
    private List<Reference> coverageArea = new ArrayList<Reference>();
    /**
     * The contact for the health insurance product for a certain purpose.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("The contact for the health insurance product for a certain purpose.")
    private List<InsurancePlan_Contact> contact = new ArrayList<InsurancePlan_Contact>();
    /**
     * The technical endpoints providing access to services operated for the health insurance product.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("The technical endpoints providing access to services operated for the health insurance product.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    /**
     * Reference to the network included in the health insurance product.
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("Reference to the network included in the health insurance product.")
    private List<Reference> network = new ArrayList<Reference>();
    /**
     * Details about the coverage offered by the insurance product.
     * 
     */
    @JsonProperty("coverage")
    @JsonPropertyDescription("Details about the coverage offered by the insurance product.")
    private List<InsurancePlan_Coverage> coverage = new ArrayList<InsurancePlan_Coverage>();
    /**
     * Details about an insurance plan.
     * 
     */
    @JsonProperty("plan")
    @JsonPropertyDescription("Details about an insurance plan.")
    private List<InsurancePlan_Plan> plan = new ArrayList<InsurancePlan_Plan>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a InsurancePlan resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a InsurancePlan resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The current state of the health insurance product.
     * 
     */
    @JsonProperty("status")
    public InsurancePlan.Status getStatus() {
        return status;
    }

    /**
     * The current state of the health insurance product.
     * 
     */
    @JsonProperty("status")
    public void setStatus(InsurancePlan.Status status) {
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
     * The kind of health insurance product.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * The kind of health insurance product.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
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
     * A list of alternate names that the product is known as, or was known as in the past.
     * 
     */
    @JsonProperty("alias")
    public List<String> getAlias() {
        return alias;
    }

    /**
     * A list of alternate names that the product is known as, or was known as in the past.
     * 
     */
    @JsonProperty("alias")
    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public List<Element> get_alias() {
        return _alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public void set_alias(List<Element> _alias) {
        this._alias = _alias;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("ownedBy")
    public Reference getOwnedBy() {
        return ownedBy;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("ownedBy")
    public void setOwnedBy(Reference ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("administeredBy")
    public Reference getAdministeredBy() {
        return administeredBy;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("administeredBy")
    public void setAdministeredBy(Reference administeredBy) {
        this.administeredBy = administeredBy;
    }

    /**
     * The geographic region in which a health insurance product's benefits apply.
     * 
     */
    @JsonProperty("coverageArea")
    public List<Reference> getCoverageArea() {
        return coverageArea;
    }

    /**
     * The geographic region in which a health insurance product's benefits apply.
     * 
     */
    @JsonProperty("coverageArea")
    public void setCoverageArea(List<Reference> coverageArea) {
        this.coverageArea = coverageArea;
    }

    /**
     * The contact for the health insurance product for a certain purpose.
     * 
     */
    @JsonProperty("contact")
    public List<InsurancePlan_Contact> getContact() {
        return contact;
    }

    /**
     * The contact for the health insurance product for a certain purpose.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<InsurancePlan_Contact> contact) {
        this.contact = contact;
    }

    /**
     * The technical endpoints providing access to services operated for the health insurance product.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * The technical endpoints providing access to services operated for the health insurance product.
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(List<Reference> endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Reference to the network included in the health insurance product.
     * 
     */
    @JsonProperty("network")
    public List<Reference> getNetwork() {
        return network;
    }

    /**
     * Reference to the network included in the health insurance product.
     * 
     */
    @JsonProperty("network")
    public void setNetwork(List<Reference> network) {
        this.network = network;
    }

    /**
     * Details about the coverage offered by the insurance product.
     * 
     */
    @JsonProperty("coverage")
    public List<InsurancePlan_Coverage> getCoverage() {
        return coverage;
    }

    /**
     * Details about the coverage offered by the insurance product.
     * 
     */
    @JsonProperty("coverage")
    public void setCoverage(List<InsurancePlan_Coverage> coverage) {
        this.coverage = coverage;
    }

    /**
     * Details about an insurance plan.
     * 
     */
    @JsonProperty("plan")
    public List<InsurancePlan_Plan> getPlan() {
        return plan;
    }

    /**
     * Details about an insurance plan.
     * 
     */
    @JsonProperty("plan")
    public void setPlan(List<InsurancePlan_Plan> plan) {
        this.plan = plan;
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
        sb.append(InsurancePlan.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("_alias");
        sb.append('=');
        sb.append(((this._alias == null)?"<null>":this._alias));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("ownedBy");
        sb.append('=');
        sb.append(((this.ownedBy == null)?"<null>":this.ownedBy));
        sb.append(',');
        sb.append("administeredBy");
        sb.append('=');
        sb.append(((this.administeredBy == null)?"<null>":this.administeredBy));
        sb.append(',');
        sb.append("coverageArea");
        sb.append('=');
        sb.append(((this.coverageArea == null)?"<null>":this.coverageArea));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
        sb.append(',');
        sb.append("coverage");
        sb.append('=');
        sb.append(((this.coverage == null)?"<null>":this.coverage));
        sb.append(',');
        sb.append("plan");
        sb.append('=');
        sb.append(((this.plan == null)?"<null>":this.plan));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.administeredBy == null)? 0 :this.administeredBy.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this._alias == null)? 0 :this._alias.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ownedBy == null)? 0 :this.ownedBy.hashCode()));
        result = ((result* 31)+((this.plan == null)? 0 :this.plan.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.coverageArea == null)? 0 :this.coverageArea.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InsurancePlan) == false) {
            return false;
        }
        InsurancePlan rhs = ((InsurancePlan) other);
        return (((((((((((((((((((super.equals(rhs)&&((this.coverage == rhs.coverage)||((this.coverage!= null)&&this.coverage.equals(rhs.coverage))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.administeredBy == rhs.administeredBy)||((this.administeredBy!= null)&&this.administeredBy.equals(rhs.administeredBy))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this._alias == rhs._alias)||((this._alias!= null)&&this._alias.equals(rhs._alias))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ownedBy == rhs.ownedBy)||((this.ownedBy!= null)&&this.ownedBy.equals(rhs.ownedBy))))&&((this.plan == rhs.plan)||((this.plan!= null)&&this.plan.equals(rhs.plan))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.coverageArea == rhs.coverageArea)||((this.coverageArea!= null)&&this.coverageArea.equals(rhs.coverageArea))));
    }


    /**
     * The current state of the health insurance product.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, InsurancePlan.Status> CONSTANTS = new HashMap<String, InsurancePlan.Status>();

        static {
            for (InsurancePlan.Status c: values()) {
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
        public static InsurancePlan.Status fromValue(String value) {
            InsurancePlan.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
