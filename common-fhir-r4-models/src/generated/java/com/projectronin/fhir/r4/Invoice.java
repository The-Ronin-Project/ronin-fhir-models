
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
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "cancelledReason",
    "_cancelledReason",
    "type",
    "subject",
    "recipient",
    "date",
    "_date",
    "participant",
    "issuer",
    "account",
    "lineItem",
    "totalPriceComponent",
    "totalNet",
    "totalGross",
    "paymentTerms",
    "_paymentTerms",
    "note"
})
@Generated("jsonschema2pojo")
public class Invoice
    extends DomainResource
{

    /**
     * This is a Invoice resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Invoice resource")
    private String resourceType;
    /**
     * Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The current state of the Invoice.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current state of the Invoice.")
    private Invoice.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cancelledReason")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String cancelledReason;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cancelledReason")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _cancelledReason;
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
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recipient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference recipient;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String date;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _date;
    /**
     * Indicates who or what performed or participated in the charged service.
     * 
     */
    @JsonProperty("participant")
    @JsonPropertyDescription("Indicates who or what performed or participated in the charged service.")
    private List<Invoice_Participant> participant = new ArrayList<Invoice_Participant>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("issuer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference issuer;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("account")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference account;
    /**
     * Each line item represents one charge for goods and services rendered. Details such as date, code and amount are found in the referenced ChargeItem resource.
     * 
     */
    @JsonProperty("lineItem")
    @JsonPropertyDescription("Each line item represents one charge for goods and services rendered. Details such as date, code and amount are found in the referenced ChargeItem resource.")
    private List<Invoice_LineItem> lineItem = new ArrayList<Invoice_LineItem>();
    /**
     * The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions.  The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.
     * 
     */
    @JsonProperty("totalPriceComponent")
    @JsonPropertyDescription("The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions.  The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.")
    private List<Invoice_PriceComponent> totalPriceComponent = new ArrayList<Invoice_PriceComponent>();
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("totalNet")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money totalNet;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("totalGross")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money totalGross;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("paymentTerms")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String paymentTerms;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paymentTerms")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _paymentTerms;
    /**
     * Comments made about the invoice by the issuer, subject, or other participants.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the invoice by the issuer, subject, or other participants.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Invoice resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Invoice resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The current state of the Invoice.
     * 
     */
    @JsonProperty("status")
    public Invoice.Status getStatus() {
        return status;
    }

    /**
     * The current state of the Invoice.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Invoice.Status status) {
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cancelledReason")
    public String getCancelledReason() {
        return cancelledReason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("cancelledReason")
    public void setCancelledReason(String cancelledReason) {
        this.cancelledReason = cancelledReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cancelledReason")
    public Element get_cancelledReason() {
        return _cancelledReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cancelledReason")
    public void set_cancelledReason(Element _cancelledReason) {
        this._cancelledReason = _cancelledReason;
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
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recipient")
    public Reference getRecipient() {
        return recipient;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recipient")
    public void setRecipient(Reference recipient) {
        this.recipient = recipient;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public Element get_date() {
        return _date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public void set_date(Element _date) {
        this._date = _date;
    }

    /**
     * Indicates who or what performed or participated in the charged service.
     * 
     */
    @JsonProperty("participant")
    public List<Invoice_Participant> getParticipant() {
        return participant;
    }

    /**
     * Indicates who or what performed or participated in the charged service.
     * 
     */
    @JsonProperty("participant")
    public void setParticipant(List<Invoice_Participant> participant) {
        this.participant = participant;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("issuer")
    public Reference getIssuer() {
        return issuer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("issuer")
    public void setIssuer(Reference issuer) {
        this.issuer = issuer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("account")
    public Reference getAccount() {
        return account;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("account")
    public void setAccount(Reference account) {
        this.account = account;
    }

    /**
     * Each line item represents one charge for goods and services rendered. Details such as date, code and amount are found in the referenced ChargeItem resource.
     * 
     */
    @JsonProperty("lineItem")
    public List<Invoice_LineItem> getLineItem() {
        return lineItem;
    }

    /**
     * Each line item represents one charge for goods and services rendered. Details such as date, code and amount are found in the referenced ChargeItem resource.
     * 
     */
    @JsonProperty("lineItem")
    public void setLineItem(List<Invoice_LineItem> lineItem) {
        this.lineItem = lineItem;
    }

    /**
     * The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions.  The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.
     * 
     */
    @JsonProperty("totalPriceComponent")
    public List<Invoice_PriceComponent> getTotalPriceComponent() {
        return totalPriceComponent;
    }

    /**
     * The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions.  The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.
     * 
     */
    @JsonProperty("totalPriceComponent")
    public void setTotalPriceComponent(List<Invoice_PriceComponent> totalPriceComponent) {
        this.totalPriceComponent = totalPriceComponent;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("totalNet")
    public Money getTotalNet() {
        return totalNet;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("totalNet")
    public void setTotalNet(Money totalNet) {
        this.totalNet = totalNet;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("totalGross")
    public Money getTotalGross() {
        return totalGross;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("totalGross")
    public void setTotalGross(Money totalGross) {
        this.totalGross = totalGross;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("paymentTerms")
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("paymentTerms")
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paymentTerms")
    public Element get_paymentTerms() {
        return _paymentTerms;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paymentTerms")
    public void set_paymentTerms(Element _paymentTerms) {
        this._paymentTerms = _paymentTerms;
    }

    /**
     * Comments made about the invoice by the issuer, subject, or other participants.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the invoice by the issuer, subject, or other participants.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
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
        sb.append(Invoice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("cancelledReason");
        sb.append('=');
        sb.append(((this.cancelledReason == null)?"<null>":this.cancelledReason));
        sb.append(',');
        sb.append("_cancelledReason");
        sb.append('=');
        sb.append(((this._cancelledReason == null)?"<null>":this._cancelledReason));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("recipient");
        sb.append('=');
        sb.append(((this.recipient == null)?"<null>":this.recipient));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("participant");
        sb.append('=');
        sb.append(((this.participant == null)?"<null>":this.participant));
        sb.append(',');
        sb.append("issuer");
        sb.append('=');
        sb.append(((this.issuer == null)?"<null>":this.issuer));
        sb.append(',');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
        sb.append(',');
        sb.append("lineItem");
        sb.append('=');
        sb.append(((this.lineItem == null)?"<null>":this.lineItem));
        sb.append(',');
        sb.append("totalPriceComponent");
        sb.append('=');
        sb.append(((this.totalPriceComponent == null)?"<null>":this.totalPriceComponent));
        sb.append(',');
        sb.append("totalNet");
        sb.append('=');
        sb.append(((this.totalNet == null)?"<null>":this.totalNet));
        sb.append(',');
        sb.append("totalGross");
        sb.append('=');
        sb.append(((this.totalGross == null)?"<null>":this.totalGross));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("_paymentTerms");
        sb.append('=');
        sb.append(((this._paymentTerms == null)?"<null>":this._paymentTerms));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.totalGross == null)? 0 :this.totalGross.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.totalPriceComponent == null)? 0 :this.totalPriceComponent.hashCode()));
        result = ((result* 31)+((this.participant == null)? 0 :this.participant.hashCode()));
        result = ((result* 31)+((this.issuer == null)? 0 :this.issuer.hashCode()));
        result = ((result* 31)+((this.totalNet == null)? 0 :this.totalNet.hashCode()));
        result = ((result* 31)+((this.lineItem == null)? 0 :this.lineItem.hashCode()));
        result = ((result* 31)+((this.recipient == null)? 0 :this.recipient.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cancelledReason == null)? 0 :this.cancelledReason.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        result = ((result* 31)+((this._paymentTerms == null)? 0 :this._paymentTerms.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this._cancelledReason == null)? 0 :this._cancelledReason.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Invoice) == false) {
            return false;
        }
        Invoice rhs = ((Invoice) other);
        return ((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.totalGross == rhs.totalGross)||((this.totalGross!= null)&&this.totalGross.equals(rhs.totalGross))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.totalPriceComponent == rhs.totalPriceComponent)||((this.totalPriceComponent!= null)&&this.totalPriceComponent.equals(rhs.totalPriceComponent))))&&((this.participant == rhs.participant)||((this.participant!= null)&&this.participant.equals(rhs.participant))))&&((this.issuer == rhs.issuer)||((this.issuer!= null)&&this.issuer.equals(rhs.issuer))))&&((this.totalNet == rhs.totalNet)||((this.totalNet!= null)&&this.totalNet.equals(rhs.totalNet))))&&((this.lineItem == rhs.lineItem)||((this.lineItem!= null)&&this.lineItem.equals(rhs.lineItem))))&&((this.recipient == rhs.recipient)||((this.recipient!= null)&&this.recipient.equals(rhs.recipient))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cancelledReason == rhs.cancelledReason)||((this.cancelledReason!= null)&&this.cancelledReason.equals(rhs.cancelledReason))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))))&&((this._paymentTerms == rhs._paymentTerms)||((this._paymentTerms!= null)&&this._paymentTerms.equals(rhs._paymentTerms))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this._cancelledReason == rhs._cancelledReason)||((this._cancelledReason!= null)&&this._cancelledReason.equals(rhs._cancelledReason))));
    }


    /**
     * The current state of the Invoice.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ISSUED("issued"),
        BALANCED("balanced"),
        CANCELLED("cancelled"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, Invoice.Status> CONSTANTS = new HashMap<String, Invoice.Status>();

        static {
            for (Invoice.Status c: values()) {
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
        public static Invoice.Status fromValue(String value) {
            Invoice.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
