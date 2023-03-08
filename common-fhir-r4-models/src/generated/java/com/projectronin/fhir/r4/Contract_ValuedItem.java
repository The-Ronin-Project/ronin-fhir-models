
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "entityCodeableConcept",
    "entityReference",
    "identifier",
    "effectiveTime",
    "_effectiveTime",
    "quantity",
    "unitPrice",
    "factor",
    "_factor",
    "points",
    "_points",
    "net",
    "payment",
    "_payment",
    "paymentDate",
    "_paymentDate",
    "responsible",
    "recipient",
    "linkId",
    "_linkId",
    "securityLabelNumber",
    "_securityLabelNumber"
})
@Generated("jsonschema2pojo")
public class Contract_ValuedItem {

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
    @JsonProperty("entityCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept entityCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("entityReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference entityReference;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("effectiveTime")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String effectiveTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _effectiveTime;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money unitPrice;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double factor;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _factor;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("points")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double points;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_points")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _points;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money net;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String payment;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_payment")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _payment;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("paymentDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
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
    @JsonProperty("responsible")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference responsible;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recipient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference recipient;
    /**
     * Id  of the clause or question text related to the context of this valuedItem in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    @JsonPropertyDescription("Id  of the clause or question text related to the context of this valuedItem in the referenced form or QuestionnaireResponse.")
    private List<String> linkId = new ArrayList<String>();
    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    @JsonPropertyDescription("Extensions for linkId")
    private List<Element> _linkId = new ArrayList<Element>();
    /**
     * A set of security labels that define which terms are controlled by this condition.
     * 
     */
    @JsonProperty("securityLabelNumber")
    @JsonPropertyDescription("A set of security labels that define which terms are controlled by this condition.")
    private List<Double> securityLabelNumber = new ArrayList<Double>();
    /**
     * Extensions for securityLabelNumber
     * 
     */
    @JsonProperty("_securityLabelNumber")
    @JsonPropertyDescription("Extensions for securityLabelNumber")
    private List<Element> _securityLabelNumber = new ArrayList<Element>();

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
    @JsonProperty("entityCodeableConcept")
    public CodeableConcept getEntityCodeableConcept() {
        return entityCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("entityCodeableConcept")
    public void setEntityCodeableConcept(CodeableConcept entityCodeableConcept) {
        this.entityCodeableConcept = entityCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("entityReference")
    public Reference getEntityReference() {
        return entityReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("entityReference")
    public void setEntityReference(Reference entityReference) {
        this.entityReference = entityReference;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("effectiveTime")
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("effectiveTime")
    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveTime")
    public Element get_effectiveTime() {
        return _effectiveTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveTime")
    public void set_effectiveTime(Element _effectiveTime) {
        this._effectiveTime = _effectiveTime;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(Money unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public Double getFactor() {
        return factor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public void setFactor(Double factor) {
        this.factor = factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public Element get_factor() {
        return _factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public void set_factor(Element _factor) {
        this._factor = _factor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("points")
    public Double getPoints() {
        return points;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("points")
    public void setPoints(Double points) {
        this.points = points;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_points")
    public Element get_points() {
        return _points;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_points")
    public void set_points(Element _points) {
        this._points = _points;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    public Money getNet() {
        return net;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    public void setNet(Money net) {
        this.net = net;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("payment")
    public String getPayment() {
        return payment;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("payment")
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_payment")
    public Element get_payment() {
        return _payment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_payment")
    public void set_payment(Element _payment) {
        this._payment = _payment;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("paymentDate")
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
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
    @JsonProperty("responsible")
    public Reference getResponsible() {
        return responsible;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("responsible")
    public void setResponsible(Reference responsible) {
        this.responsible = responsible;
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
     * Id  of the clause or question text related to the context of this valuedItem in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    public List<String> getLinkId() {
        return linkId;
    }

    /**
     * Id  of the clause or question text related to the context of this valuedItem in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    public void setLinkId(List<String> linkId) {
        this.linkId = linkId;
    }

    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    public List<Element> get_linkId() {
        return _linkId;
    }

    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    public void set_linkId(List<Element> _linkId) {
        this._linkId = _linkId;
    }

    /**
     * A set of security labels that define which terms are controlled by this condition.
     * 
     */
    @JsonProperty("securityLabelNumber")
    public List<Double> getSecurityLabelNumber() {
        return securityLabelNumber;
    }

    /**
     * A set of security labels that define which terms are controlled by this condition.
     * 
     */
    @JsonProperty("securityLabelNumber")
    public void setSecurityLabelNumber(List<Double> securityLabelNumber) {
        this.securityLabelNumber = securityLabelNumber;
    }

    /**
     * Extensions for securityLabelNumber
     * 
     */
    @JsonProperty("_securityLabelNumber")
    public List<Element> get_securityLabelNumber() {
        return _securityLabelNumber;
    }

    /**
     * Extensions for securityLabelNumber
     * 
     */
    @JsonProperty("_securityLabelNumber")
    public void set_securityLabelNumber(List<Element> _securityLabelNumber) {
        this._securityLabelNumber = _securityLabelNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contract_ValuedItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("entityCodeableConcept");
        sb.append('=');
        sb.append(((this.entityCodeableConcept == null)?"<null>":this.entityCodeableConcept));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("effectiveTime");
        sb.append('=');
        sb.append(((this.effectiveTime == null)?"<null>":this.effectiveTime));
        sb.append(',');
        sb.append("_effectiveTime");
        sb.append('=');
        sb.append(((this._effectiveTime == null)?"<null>":this._effectiveTime));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("factor");
        sb.append('=');
        sb.append(((this.factor == null)?"<null>":this.factor));
        sb.append(',');
        sb.append("_factor");
        sb.append('=');
        sb.append(((this._factor == null)?"<null>":this._factor));
        sb.append(',');
        sb.append("points");
        sb.append('=');
        sb.append(((this.points == null)?"<null>":this.points));
        sb.append(',');
        sb.append("_points");
        sb.append('=');
        sb.append(((this._points == null)?"<null>":this._points));
        sb.append(',');
        sb.append("net");
        sb.append('=');
        sb.append(((this.net == null)?"<null>":this.net));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("_payment");
        sb.append('=');
        sb.append(((this._payment == null)?"<null>":this._payment));
        sb.append(',');
        sb.append("paymentDate");
        sb.append('=');
        sb.append(((this.paymentDate == null)?"<null>":this.paymentDate));
        sb.append(',');
        sb.append("_paymentDate");
        sb.append('=');
        sb.append(((this._paymentDate == null)?"<null>":this._paymentDate));
        sb.append(',');
        sb.append("responsible");
        sb.append('=');
        sb.append(((this.responsible == null)?"<null>":this.responsible));
        sb.append(',');
        sb.append("recipient");
        sb.append('=');
        sb.append(((this.recipient == null)?"<null>":this.recipient));
        sb.append(',');
        sb.append("linkId");
        sb.append('=');
        sb.append(((this.linkId == null)?"<null>":this.linkId));
        sb.append(',');
        sb.append("_linkId");
        sb.append('=');
        sb.append(((this._linkId == null)?"<null>":this._linkId));
        sb.append(',');
        sb.append("securityLabelNumber");
        sb.append('=');
        sb.append(((this.securityLabelNumber == null)?"<null>":this.securityLabelNumber));
        sb.append(',');
        sb.append("_securityLabelNumber");
        sb.append('=');
        sb.append(((this._securityLabelNumber == null)?"<null>":this._securityLabelNumber));
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
        result = ((result* 31)+((this._paymentDate == null)? 0 :this._paymentDate.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.effectiveTime == null)? 0 :this.effectiveTime.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.points == null)? 0 :this.points.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.responsible == null)? 0 :this.responsible.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._securityLabelNumber == null)? 0 :this._securityLabelNumber.hashCode()));
        result = ((result* 31)+((this.factor == null)? 0 :this.factor.hashCode()));
        result = ((result* 31)+((this.net == null)? 0 :this.net.hashCode()));
        result = ((result* 31)+((this._points == null)? 0 :this._points.hashCode()));
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._linkId == null)? 0 :this._linkId.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.entityCodeableConcept == null)? 0 :this.entityCodeableConcept.hashCode()));
        result = ((result* 31)+((this.securityLabelNumber == null)? 0 :this.securityLabelNumber.hashCode()));
        result = ((result* 31)+((this._payment == null)? 0 :this._payment.hashCode()));
        result = ((result* 31)+((this._factor == null)? 0 :this._factor.hashCode()));
        result = ((result* 31)+((this.linkId == null)? 0 :this.linkId.hashCode()));
        result = ((result* 31)+((this._effectiveTime == null)? 0 :this._effectiveTime.hashCode()));
        result = ((result* 31)+((this.recipient == null)? 0 :this.recipient.hashCode()));
        result = ((result* 31)+((this.paymentDate == null)? 0 :this.paymentDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract_ValuedItem) == false) {
            return false;
        }
        Contract_ValuedItem rhs = ((Contract_ValuedItem) other);
        return ((((((((((((((((((((((((((this._paymentDate == rhs._paymentDate)||((this._paymentDate!= null)&&this._paymentDate.equals(rhs._paymentDate)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.effectiveTime == rhs.effectiveTime)||((this.effectiveTime!= null)&&this.effectiveTime.equals(rhs.effectiveTime))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.points == rhs.points)||((this.points!= null)&&this.points.equals(rhs.points))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.responsible == rhs.responsible)||((this.responsible!= null)&&this.responsible.equals(rhs.responsible))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._securityLabelNumber == rhs._securityLabelNumber)||((this._securityLabelNumber!= null)&&this._securityLabelNumber.equals(rhs._securityLabelNumber))))&&((this.factor == rhs.factor)||((this.factor!= null)&&this.factor.equals(rhs.factor))))&&((this.net == rhs.net)||((this.net!= null)&&this.net.equals(rhs.net))))&&((this._points == rhs._points)||((this._points!= null)&&this._points.equals(rhs._points))))&&((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._linkId == rhs._linkId)||((this._linkId!= null)&&this._linkId.equals(rhs._linkId))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.entityCodeableConcept == rhs.entityCodeableConcept)||((this.entityCodeableConcept!= null)&&this.entityCodeableConcept.equals(rhs.entityCodeableConcept))))&&((this.securityLabelNumber == rhs.securityLabelNumber)||((this.securityLabelNumber!= null)&&this.securityLabelNumber.equals(rhs.securityLabelNumber))))&&((this._payment == rhs._payment)||((this._payment!= null)&&this._payment.equals(rhs._payment))))&&((this._factor == rhs._factor)||((this._factor!= null)&&this._factor.equals(rhs._factor))))&&((this.linkId == rhs.linkId)||((this.linkId!= null)&&this.linkId.equals(rhs.linkId))))&&((this._effectiveTime == rhs._effectiveTime)||((this._effectiveTime!= null)&&this._effectiveTime.equals(rhs._effectiveTime))))&&((this.recipient == rhs.recipient)||((this.recipient!= null)&&this.recipient.equals(rhs.recipient))))&&((this.paymentDate == rhs.paymentDate)||((this.paymentDate!= null)&&this.paymentDate.equals(rhs.paymentDate))));
    }

}
