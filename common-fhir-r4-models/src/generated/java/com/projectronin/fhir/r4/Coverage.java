
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
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "type",
    "policyHolder",
    "subscriber",
    "subscriberId",
    "_subscriberId",
    "beneficiary",
    "dependent",
    "_dependent",
    "relationship",
    "period",
    "payor",
    "class",
    "order",
    "_order",
    "network",
    "_network",
    "costToBeneficiary",
    "subrogation",
    "_subrogation",
    "contract"
})
@Generated("jsonschema2pojo")
public class Coverage
    extends DomainResource
{

    /**
     * This is a Coverage resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Coverage resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this coverage.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this coverage.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String status;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("policyHolder")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference policyHolder;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subscriber")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subscriber;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("subscriberId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String subscriberId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subscriberId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _subscriberId;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("beneficiary")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference beneficiary;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("dependent")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String dependent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dependent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dependent;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept relationship;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.
     * (Required)
     * 
     */
    @JsonProperty("payor")
    @JsonPropertyDescription("The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.")
    private List<Reference> payor = new ArrayList<Reference>();
    /**
     * A suite of underwriter specific classifiers.
     * 
     */
    @JsonProperty("class")
    @JsonPropertyDescription("A suite of underwriter specific classifiers.")
    private List<Coverage_Class> _class = new ArrayList<Coverage_Class>();
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double order;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_order")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _order;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String network;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_network")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _network;
    /**
     * A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.
     * 
     */
    @JsonProperty("costToBeneficiary")
    @JsonPropertyDescription("A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.")
    private List<Coverage_CostToBeneficiary> costToBeneficiary = new ArrayList<Coverage_CostToBeneficiary>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("subrogation")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean subrogation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subrogation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _subrogation;
    /**
     * The policy(s) which constitute this insurance coverage.
     * 
     */
    @JsonProperty("contract")
    @JsonPropertyDescription("The policy(s) which constitute this insurance coverage.")
    private List<Reference> contract = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Coverage resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Coverage resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this coverage.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this coverage.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("policyHolder")
    public Reference getPolicyHolder() {
        return policyHolder;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("policyHolder")
    public void setPolicyHolder(Reference policyHolder) {
        this.policyHolder = policyHolder;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subscriber")
    public Reference getSubscriber() {
        return subscriber;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subscriber")
    public void setSubscriber(Reference subscriber) {
        this.subscriber = subscriber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("subscriberId")
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("subscriberId")
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subscriberId")
    public Element get_subscriberId() {
        return _subscriberId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subscriberId")
    public void set_subscriberId(Element _subscriberId) {
        this._subscriberId = _subscriberId;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("beneficiary")
    public Reference getBeneficiary() {
        return beneficiary;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("beneficiary")
    public void setBeneficiary(Reference beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("dependent")
    public String getDependent() {
        return dependent;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("dependent")
    public void setDependent(String dependent) {
        this.dependent = dependent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dependent")
    public Element get_dependent() {
        return _dependent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dependent")
    public void set_dependent(Element _dependent) {
        this._dependent = _dependent;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("relationship")
    public CodeableConcept getRelationship() {
        return relationship;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(CodeableConcept relationship) {
        this.relationship = relationship;
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
     * The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.
     * (Required)
     * 
     */
    @JsonProperty("payor")
    public List<Reference> getPayor() {
        return payor;
    }

    /**
     * The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.
     * (Required)
     * 
     */
    @JsonProperty("payor")
    public void setPayor(List<Reference> payor) {
        this.payor = payor;
    }

    /**
     * A suite of underwriter specific classifiers.
     * 
     */
    @JsonProperty("class")
    public List<Coverage_Class> getClass_() {
        return _class;
    }

    /**
     * A suite of underwriter specific classifiers.
     * 
     */
    @JsonProperty("class")
    public void setClass_(List<Coverage_Class> _class) {
        this._class = _class;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("order")
    public Double getOrder() {
        return order;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("order")
    public void setOrder(Double order) {
        this.order = order;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_order")
    public Element get_order() {
        return _order;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_order")
    public void set_order(Element _order) {
        this._order = _order;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_network")
    public Element get_network() {
        return _network;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_network")
    public void set_network(Element _network) {
        this._network = _network;
    }

    /**
     * A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.
     * 
     */
    @JsonProperty("costToBeneficiary")
    public List<Coverage_CostToBeneficiary> getCostToBeneficiary() {
        return costToBeneficiary;
    }

    /**
     * A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.
     * 
     */
    @JsonProperty("costToBeneficiary")
    public void setCostToBeneficiary(List<Coverage_CostToBeneficiary> costToBeneficiary) {
        this.costToBeneficiary = costToBeneficiary;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("subrogation")
    public Boolean getSubrogation() {
        return subrogation;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("subrogation")
    public void setSubrogation(Boolean subrogation) {
        this.subrogation = subrogation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subrogation")
    public Element get_subrogation() {
        return _subrogation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subrogation")
    public void set_subrogation(Element _subrogation) {
        this._subrogation = _subrogation;
    }

    /**
     * The policy(s) which constitute this insurance coverage.
     * 
     */
    @JsonProperty("contract")
    public List<Reference> getContract() {
        return contract;
    }

    /**
     * The policy(s) which constitute this insurance coverage.
     * 
     */
    @JsonProperty("contract")
    public void setContract(List<Reference> contract) {
        this.contract = contract;
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
        sb.append(Coverage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("policyHolder");
        sb.append('=');
        sb.append(((this.policyHolder == null)?"<null>":this.policyHolder));
        sb.append(',');
        sb.append("subscriber");
        sb.append('=');
        sb.append(((this.subscriber == null)?"<null>":this.subscriber));
        sb.append(',');
        sb.append("subscriberId");
        sb.append('=');
        sb.append(((this.subscriberId == null)?"<null>":this.subscriberId));
        sb.append(',');
        sb.append("_subscriberId");
        sb.append('=');
        sb.append(((this._subscriberId == null)?"<null>":this._subscriberId));
        sb.append(',');
        sb.append("beneficiary");
        sb.append('=');
        sb.append(((this.beneficiary == null)?"<null>":this.beneficiary));
        sb.append(',');
        sb.append("dependent");
        sb.append('=');
        sb.append(((this.dependent == null)?"<null>":this.dependent));
        sb.append(',');
        sb.append("_dependent");
        sb.append('=');
        sb.append(((this._dependent == null)?"<null>":this._dependent));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("payor");
        sb.append('=');
        sb.append(((this.payor == null)?"<null>":this.payor));
        sb.append(',');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("_order");
        sb.append('=');
        sb.append(((this._order == null)?"<null>":this._order));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
        sb.append(',');
        sb.append("_network");
        sb.append('=');
        sb.append(((this._network == null)?"<null>":this._network));
        sb.append(',');
        sb.append("costToBeneficiary");
        sb.append('=');
        sb.append(((this.costToBeneficiary == null)?"<null>":this.costToBeneficiary));
        sb.append(',');
        sb.append("subrogation");
        sb.append('=');
        sb.append(((this.subrogation == null)?"<null>":this.subrogation));
        sb.append(',');
        sb.append("_subrogation");
        sb.append('=');
        sb.append(((this._subrogation == null)?"<null>":this._subrogation));
        sb.append(',');
        sb.append("contract");
        sb.append('=');
        sb.append(((this.contract == null)?"<null>":this.contract));
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
        result = ((result* 31)+((this.subrogation == null)? 0 :this.subrogation.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.payor == null)? 0 :this.payor.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this.dependent == null)? 0 :this.dependent.hashCode()));
        result = ((result* 31)+((this._network == null)? 0 :this._network.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._order == null)? 0 :this._order.hashCode()));
        result = ((result* 31)+((this.costToBeneficiary == null)? 0 :this.costToBeneficiary.hashCode()));
        result = ((result* 31)+((this.subscriber == null)? 0 :this.subscriber.hashCode()));
        result = ((result* 31)+((this._dependent == null)? 0 :this._dependent.hashCode()));
        result = ((result* 31)+((this.contract == null)? 0 :this.contract.hashCode()));
        result = ((result* 31)+((this.subscriberId == null)? 0 :this.subscriberId.hashCode()));
        result = ((result* 31)+((this._subscriberId == null)? 0 :this._subscriberId.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.beneficiary == null)? 0 :this.beneficiary.hashCode()));
        result = ((result* 31)+((this._subrogation == null)? 0 :this._subrogation.hashCode()));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.policyHolder == null)? 0 :this.policyHolder.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coverage) == false) {
            return false;
        }
        Coverage rhs = ((Coverage) other);
        return (((((((((((((((((((((((((super.equals(rhs)&&((this.subrogation == rhs.subrogation)||((this.subrogation!= null)&&this.subrogation.equals(rhs.subrogation))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.payor == rhs.payor)||((this.payor!= null)&&this.payor.equals(rhs.payor))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.dependent == rhs.dependent)||((this.dependent!= null)&&this.dependent.equals(rhs.dependent))))&&((this._network == rhs._network)||((this._network!= null)&&this._network.equals(rhs._network))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._order == rhs._order)||((this._order!= null)&&this._order.equals(rhs._order))))&&((this.costToBeneficiary == rhs.costToBeneficiary)||((this.costToBeneficiary!= null)&&this.costToBeneficiary.equals(rhs.costToBeneficiary))))&&((this.subscriber == rhs.subscriber)||((this.subscriber!= null)&&this.subscriber.equals(rhs.subscriber))))&&((this._dependent == rhs._dependent)||((this._dependent!= null)&&this._dependent.equals(rhs._dependent))))&&((this.contract == rhs.contract)||((this.contract!= null)&&this.contract.equals(rhs.contract))))&&((this.subscriberId == rhs.subscriberId)||((this.subscriberId!= null)&&this.subscriberId.equals(rhs.subscriberId))))&&((this._subscriberId == rhs._subscriberId)||((this._subscriberId!= null)&&this._subscriberId.equals(rhs._subscriberId))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.beneficiary == rhs.beneficiary)||((this.beneficiary!= null)&&this.beneficiary.equals(rhs.beneficiary))))&&((this._subrogation == rhs._subrogation)||((this._subrogation!= null)&&this._subrogation.equals(rhs._subrogation))))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.policyHolder == rhs.policyHolder)||((this.policyHolder!= null)&&this.policyHolder.equals(rhs.policyHolder))));
    }

}
