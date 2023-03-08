
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
 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "request",
    "response",
    "created",
    "_created",
    "provider",
    "payment",
    "paymentDate",
    "_paymentDate",
    "payee",
    "recipient",
    "amount",
    "paymentStatus"
})
@Generated("jsonschema2pojo")
public class PaymentNotice
    extends DomainResource
{

    /**
     * This is a PaymentNotice resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a PaymentNotice resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this payment notice.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this payment notice.")
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference request;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference response;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String created;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _created;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference provider;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference payment;
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("paymentDate")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String paymentDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paymentDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _paymentDate;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("payee")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference payee;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("recipient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference recipient;
    /**
     * An amount of economic utility in some recognized currency.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money amount;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("paymentStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept paymentStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a PaymentNotice resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a PaymentNotice resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this payment notice.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this payment notice.
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    public Reference getRequest() {
        return request;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    public void setRequest(Reference request) {
        this.request = request;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("response")
    public Reference getResponse() {
        return response;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("response")
    public void setResponse(Reference response) {
        this.response = response;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public Element get_created() {
        return _created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public void set_created(Element _created) {
        this._created = _created;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public Reference getProvider() {
        return provider;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
        this.provider = provider;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("payment")
    public Reference getPayment() {
        return payment;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("payment")
    public void setPayment(Reference payment) {
        this.payment = payment;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("paymentDate")
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("paymentDate")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paymentDate")
    public Element get_paymentDate() {
        return _paymentDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paymentDate")
    public void set_paymentDate(Element _paymentDate) {
        this._paymentDate = _paymentDate;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("payee")
    public Reference getPayee() {
        return payee;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("payee")
    public void setPayee(Reference payee) {
        this.payee = payee;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("recipient")
    public Reference getRecipient() {
        return recipient;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("recipient")
    public void setRecipient(Reference recipient) {
        this.recipient = recipient;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Money getAmount() {
        return amount;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("paymentStatus")
    public CodeableConcept getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("paymentStatus")
    public void setPaymentStatus(CodeableConcept paymentStatus) {
        this.paymentStatus = paymentStatus;
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
        sb.append(PaymentNotice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("paymentDate");
        sb.append('=');
        sb.append(((this.paymentDate == null)?"<null>":this.paymentDate));
        sb.append(',');
        sb.append("_paymentDate");
        sb.append('=');
        sb.append(((this._paymentDate == null)?"<null>":this._paymentDate));
        sb.append(',');
        sb.append("payee");
        sb.append('=');
        sb.append(((this.payee == null)?"<null>":this.payee));
        sb.append(',');
        sb.append("recipient");
        sb.append('=');
        sb.append(((this.recipient == null)?"<null>":this.recipient));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("paymentStatus");
        sb.append('=');
        sb.append(((this.paymentStatus == null)?"<null>":this.paymentStatus));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this._paymentDate == null)? 0 :this._paymentDate.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.payee == null)? 0 :this.payee.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.recipient == null)? 0 :this.recipient.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentDate == null)? 0 :this.paymentDate.hashCode()));
        result = ((result* 31)+((this.paymentStatus == null)? 0 :this.paymentStatus.hashCode()));
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
        if ((other instanceof PaymentNotice) == false) {
            return false;
        }
        PaymentNotice rhs = ((PaymentNotice) other);
        return (((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this._paymentDate == rhs._paymentDate)||((this._paymentDate!= null)&&this._paymentDate.equals(rhs._paymentDate))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.payee == rhs.payee)||((this.payee!= null)&&this.payee.equals(rhs.payee))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.recipient == rhs.recipient)||((this.recipient!= null)&&this.recipient.equals(rhs.recipient))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentDate == rhs.paymentDate)||((this.paymentDate!= null)&&this.paymentDate.equals(rhs.paymentDate))))&&((this.paymentStatus == rhs.paymentStatus)||((this.paymentStatus!= null)&&this.paymentStatus.equals(rhs.paymentStatus))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
