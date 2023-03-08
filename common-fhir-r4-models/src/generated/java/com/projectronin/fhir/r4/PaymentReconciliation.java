
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
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "period",
    "created",
    "_created",
    "paymentIssuer",
    "request",
    "requestor",
    "outcome",
    "_outcome",
    "disposition",
    "_disposition",
    "paymentDate",
    "_paymentDate",
    "paymentAmount",
    "paymentIdentifier",
    "detail",
    "formCode",
    "processNote"
})
@Generated("jsonschema2pojo")
public class PaymentReconciliation
    extends DomainResource
{

    /**
     * This is a PaymentReconciliation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a PaymentReconciliation resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this payment reconciliation.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this payment reconciliation.")
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
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
    @JsonProperty("paymentIssuer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference paymentIssuer;
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
    @JsonProperty("requestor")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requestor;
    /**
     * The outcome of a request for a reconciliation.
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("The outcome of a request for a reconciliation.")
    private PaymentReconciliation.Outcome outcome;
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
    @JsonProperty("disposition")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String disposition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _disposition;
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
     * An amount of economic utility in some recognized currency.
     * (Required)
     * 
     */
    @JsonProperty("paymentAmount")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money paymentAmount;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("paymentIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier paymentIdentifier;
    /**
     * Distribution of the payment amount for a previously acknowledged payable.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Distribution of the payment amount for a previously acknowledged payable.")
    private List<PaymentReconciliation_Detail> detail = new ArrayList<PaymentReconciliation_Detail>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("formCode")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept formCode;
    /**
     * A note that describes or explains the processing in a human readable form.
     * 
     */
    @JsonProperty("processNote")
    @JsonPropertyDescription("A note that describes or explains the processing in a human readable form.")
    private List<PaymentReconciliation_ProcessNote> processNote = new ArrayList<PaymentReconciliation_ProcessNote>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a PaymentReconciliation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a PaymentReconciliation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this payment reconciliation.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this payment reconciliation.
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
    @JsonProperty("paymentIssuer")
    public Reference getPaymentIssuer() {
        return paymentIssuer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("paymentIssuer")
    public void setPaymentIssuer(Reference paymentIssuer) {
        this.paymentIssuer = paymentIssuer;
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
    @JsonProperty("requestor")
    public Reference getRequestor() {
        return requestor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestor")
    public void setRequestor(Reference requestor) {
        this.requestor = requestor;
    }

    /**
     * The outcome of a request for a reconciliation.
     * 
     */
    @JsonProperty("outcome")
    public PaymentReconciliation.Outcome getOutcome() {
        return outcome;
    }

    /**
     * The outcome of a request for a reconciliation.
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(PaymentReconciliation.Outcome outcome) {
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
    @JsonProperty("disposition")
    public String getDisposition() {
        return disposition;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public Element get_disposition() {
        return _disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public void set_disposition(Element _disposition) {
        this._disposition = _disposition;
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
     * An amount of economic utility in some recognized currency.
     * (Required)
     * 
     */
    @JsonProperty("paymentAmount")
    public Money getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * (Required)
     * 
     */
    @JsonProperty("paymentAmount")
    public void setPaymentAmount(Money paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("paymentIdentifier")
    public Identifier getPaymentIdentifier() {
        return paymentIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("paymentIdentifier")
    public void setPaymentIdentifier(Identifier paymentIdentifier) {
        this.paymentIdentifier = paymentIdentifier;
    }

    /**
     * Distribution of the payment amount for a previously acknowledged payable.
     * 
     */
    @JsonProperty("detail")
    public List<PaymentReconciliation_Detail> getDetail() {
        return detail;
    }

    /**
     * Distribution of the payment amount for a previously acknowledged payable.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(List<PaymentReconciliation_Detail> detail) {
        this.detail = detail;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("formCode")
    public CodeableConcept getFormCode() {
        return formCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("formCode")
    public void setFormCode(CodeableConcept formCode) {
        this.formCode = formCode;
    }

    /**
     * A note that describes or explains the processing in a human readable form.
     * 
     */
    @JsonProperty("processNote")
    public List<PaymentReconciliation_ProcessNote> getProcessNote() {
        return processNote;
    }

    /**
     * A note that describes or explains the processing in a human readable form.
     * 
     */
    @JsonProperty("processNote")
    public void setProcessNote(List<PaymentReconciliation_ProcessNote> processNote) {
        this.processNote = processNote;
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
        sb.append(PaymentReconciliation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("paymentIssuer");
        sb.append('=');
        sb.append(((this.paymentIssuer == null)?"<null>":this.paymentIssuer));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("requestor");
        sb.append('=');
        sb.append(((this.requestor == null)?"<null>":this.requestor));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("_outcome");
        sb.append('=');
        sb.append(((this._outcome == null)?"<null>":this._outcome));
        sb.append(',');
        sb.append("disposition");
        sb.append('=');
        sb.append(((this.disposition == null)?"<null>":this.disposition));
        sb.append(',');
        sb.append("_disposition");
        sb.append('=');
        sb.append(((this._disposition == null)?"<null>":this._disposition));
        sb.append(',');
        sb.append("paymentDate");
        sb.append('=');
        sb.append(((this.paymentDate == null)?"<null>":this.paymentDate));
        sb.append(',');
        sb.append("_paymentDate");
        sb.append('=');
        sb.append(((this._paymentDate == null)?"<null>":this._paymentDate));
        sb.append(',');
        sb.append("paymentAmount");
        sb.append('=');
        sb.append(((this.paymentAmount == null)?"<null>":this.paymentAmount));
        sb.append(',');
        sb.append("paymentIdentifier");
        sb.append('=');
        sb.append(((this.paymentIdentifier == null)?"<null>":this.paymentIdentifier));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("formCode");
        sb.append('=');
        sb.append(((this.formCode == null)?"<null>":this.formCode));
        sb.append(',');
        sb.append("processNote");
        sb.append('=');
        sb.append(((this.processNote == null)?"<null>":this.processNote));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.formCode == null)? 0 :this.formCode.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this._outcome == null)? 0 :this._outcome.hashCode()));
        result = ((result* 31)+((this._disposition == null)? 0 :this._disposition.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.paymentAmount == null)? 0 :this.paymentAmount.hashCode()));
        result = ((result* 31)+((this.requestor == null)? 0 :this.requestor.hashCode()));
        result = ((result* 31)+((this.processNote == null)? 0 :this.processNote.hashCode()));
        result = ((result* 31)+((this.paymentIssuer == null)? 0 :this.paymentIssuer.hashCode()));
        result = ((result* 31)+((this.disposition == null)? 0 :this.disposition.hashCode()));
        result = ((result* 31)+((this.paymentIdentifier == null)? 0 :this.paymentIdentifier.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentDate == null)? 0 :this.paymentDate.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
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
        if ((other instanceof PaymentReconciliation) == false) {
            return false;
        }
        PaymentReconciliation rhs = ((PaymentReconciliation) other);
        return ((((((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this._paymentDate == rhs._paymentDate)||((this._paymentDate!= null)&&this._paymentDate.equals(rhs._paymentDate))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.formCode == rhs.formCode)||((this.formCode!= null)&&this.formCode.equals(rhs.formCode))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this._outcome == rhs._outcome)||((this._outcome!= null)&&this._outcome.equals(rhs._outcome))))&&((this._disposition == rhs._disposition)||((this._disposition!= null)&&this._disposition.equals(rhs._disposition))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.paymentAmount == rhs.paymentAmount)||((this.paymentAmount!= null)&&this.paymentAmount.equals(rhs.paymentAmount))))&&((this.requestor == rhs.requestor)||((this.requestor!= null)&&this.requestor.equals(rhs.requestor))))&&((this.processNote == rhs.processNote)||((this.processNote!= null)&&this.processNote.equals(rhs.processNote))))&&((this.paymentIssuer == rhs.paymentIssuer)||((this.paymentIssuer!= null)&&this.paymentIssuer.equals(rhs.paymentIssuer))))&&((this.disposition == rhs.disposition)||((this.disposition!= null)&&this.disposition.equals(rhs.disposition))))&&((this.paymentIdentifier == rhs.paymentIdentifier)||((this.paymentIdentifier!= null)&&this.paymentIdentifier.equals(rhs.paymentIdentifier))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentDate == rhs.paymentDate)||((this.paymentDate!= null)&&this.paymentDate.equals(rhs.paymentDate))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The outcome of a request for a reconciliation.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Outcome {

        QUEUED("queued"),
        COMPLETE("complete"),
        ERROR("error"),
        PARTIAL("partial");
        private final String value;
        private final static Map<String, PaymentReconciliation.Outcome> CONSTANTS = new HashMap<String, PaymentReconciliation.Outcome>();

        static {
            for (PaymentReconciliation.Outcome c: values()) {
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
        public static PaymentReconciliation.Outcome fromValue(String value) {
            PaymentReconciliation.Outcome constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
