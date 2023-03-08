
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
 * A record of a request for a medication, substance or device used in the healthcare setting.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "category",
    "priority",
    "_priority",
    "itemCodeableConcept",
    "itemReference",
    "quantity",
    "parameter",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrencePeriod",
    "occurrenceTiming",
    "authoredOn",
    "_authoredOn",
    "requester",
    "supplier",
    "reasonCode",
    "reasonReference",
    "deliverFrom",
    "deliverTo"
})
@Generated("jsonschema2pojo")
public class SupplyRequest
    extends DomainResource
{

    /**
     * This is a SupplyRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SupplyRequest resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this SupplyRequest by the author and/or other systems. These identifiers remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this SupplyRequest by the author and/or other systems. These identifiers remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Status of the supply request.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the supply request.")
    private SupplyRequest.Status status;
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
    @JsonProperty("category")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept category;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String priority;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _priority;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("itemCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept itemCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference itemReference;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * Specific parameters for the ordered item.  For example, the size of the indicated item.
     * 
     */
    @JsonProperty("parameter")
    @JsonPropertyDescription("Specific parameters for the ordered item.  For example, the size of the indicated item.")
    private List<SupplyRequest_Parameter> parameter = new ArrayList<SupplyRequest_Parameter>();
    /**
     * When the request should be fulfilled.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("When the request should be fulfilled.")
    private String occurrenceDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurrenceDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period occurrencePeriod;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("occurrenceTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing occurrenceTiming;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String authoredOn;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _authoredOn;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requester;
    /**
     * Who is intended to fulfill the request.
     * 
     */
    @JsonProperty("supplier")
    @JsonPropertyDescription("Who is intended to fulfill the request.")
    private List<Reference> supplier = new ArrayList<Reference>();
    /**
     * The reason why the supply item was requested.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("The reason why the supply item was requested.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * The reason why the supply item was requested.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("The reason why the supply item was requested.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("deliverFrom")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference deliverFrom;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("deliverTo")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference deliverTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SupplyRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SupplyRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this SupplyRequest by the author and/or other systems. These identifiers remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this SupplyRequest by the author and/or other systems. These identifiers remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Status of the supply request.
     * 
     */
    @JsonProperty("status")
    public SupplyRequest.Status getStatus() {
        return status;
    }

    /**
     * Status of the supply request.
     * 
     */
    @JsonProperty("status")
    public void setStatus(SupplyRequest.Status status) {
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
    @JsonProperty("category")
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
        this.category = category;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public Element get_priority() {
        return _priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public void set_priority(Element _priority) {
        this._priority = _priority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("itemCodeableConcept")
    public CodeableConcept getItemCodeableConcept() {
        return itemCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
        this.itemCodeableConcept = itemCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    public Reference getItemReference() {
        return itemReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("itemReference")
    public void setItemReference(Reference itemReference) {
        this.itemReference = itemReference;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Specific parameters for the ordered item.  For example, the size of the indicated item.
     * 
     */
    @JsonProperty("parameter")
    public List<SupplyRequest_Parameter> getParameter() {
        return parameter;
    }

    /**
     * Specific parameters for the ordered item.  For example, the size of the indicated item.
     * 
     */
    @JsonProperty("parameter")
    public void setParameter(List<SupplyRequest_Parameter> parameter) {
        this.parameter = parameter;
    }

    /**
     * When the request should be fulfilled.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * When the request should be fulfilled.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public Element get_occurrenceDateTime() {
        return _occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public void set_occurrenceDateTime(Element _occurrenceDateTime) {
        this._occurrenceDateTime = _occurrenceDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public Period getOccurrencePeriod() {
        return occurrencePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Period occurrencePeriod) {
        this.occurrencePeriod = occurrencePeriod;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("occurrenceTiming")
    public Timing getOccurrenceTiming() {
        return occurrenceTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Timing occurrenceTiming) {
        this.occurrenceTiming = occurrenceTiming;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    public String getAuthoredOn() {
        return authoredOn;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    public void setAuthoredOn(String authoredOn) {
        this.authoredOn = authoredOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    public Element get_authoredOn() {
        return _authoredOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    public void set_authoredOn(Element _authoredOn) {
        this._authoredOn = _authoredOn;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    public Reference getRequester() {
        return requester;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    public void setRequester(Reference requester) {
        this.requester = requester;
    }

    /**
     * Who is intended to fulfill the request.
     * 
     */
    @JsonProperty("supplier")
    public List<Reference> getSupplier() {
        return supplier;
    }

    /**
     * Who is intended to fulfill the request.
     * 
     */
    @JsonProperty("supplier")
    public void setSupplier(List<Reference> supplier) {
        this.supplier = supplier;
    }

    /**
     * The reason why the supply item was requested.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * The reason why the supply item was requested.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * The reason why the supply item was requested.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * The reason why the supply item was requested.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("deliverFrom")
    public Reference getDeliverFrom() {
        return deliverFrom;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("deliverFrom")
    public void setDeliverFrom(Reference deliverFrom) {
        this.deliverFrom = deliverFrom;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("deliverTo")
    public Reference getDeliverTo() {
        return deliverTo;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("deliverTo")
    public void setDeliverTo(Reference deliverTo) {
        this.deliverTo = deliverTo;
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
        sb.append(SupplyRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("_priority");
        sb.append('=');
        sb.append(((this._priority == null)?"<null>":this._priority));
        sb.append(',');
        sb.append("itemCodeableConcept");
        sb.append('=');
        sb.append(((this.itemCodeableConcept == null)?"<null>":this.itemCodeableConcept));
        sb.append(',');
        sb.append("itemReference");
        sb.append('=');
        sb.append(((this.itemReference == null)?"<null>":this.itemReference));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("parameter");
        sb.append('=');
        sb.append(((this.parameter == null)?"<null>":this.parameter));
        sb.append(',');
        sb.append("occurrenceDateTime");
        sb.append('=');
        sb.append(((this.occurrenceDateTime == null)?"<null>":this.occurrenceDateTime));
        sb.append(',');
        sb.append("_occurrenceDateTime");
        sb.append('=');
        sb.append(((this._occurrenceDateTime == null)?"<null>":this._occurrenceDateTime));
        sb.append(',');
        sb.append("occurrencePeriod");
        sb.append('=');
        sb.append(((this.occurrencePeriod == null)?"<null>":this.occurrencePeriod));
        sb.append(',');
        sb.append("occurrenceTiming");
        sb.append('=');
        sb.append(((this.occurrenceTiming == null)?"<null>":this.occurrenceTiming));
        sb.append(',');
        sb.append("authoredOn");
        sb.append('=');
        sb.append(((this.authoredOn == null)?"<null>":this.authoredOn));
        sb.append(',');
        sb.append("_authoredOn");
        sb.append('=');
        sb.append(((this._authoredOn == null)?"<null>":this._authoredOn));
        sb.append(',');
        sb.append("requester");
        sb.append('=');
        sb.append(((this.requester == null)?"<null>":this.requester));
        sb.append(',');
        sb.append("supplier");
        sb.append('=');
        sb.append(((this.supplier == null)?"<null>":this.supplier));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("deliverFrom");
        sb.append('=');
        sb.append(((this.deliverFrom == null)?"<null>":this.deliverFrom));
        sb.append(',');
        sb.append("deliverTo");
        sb.append('=');
        sb.append(((this.deliverTo == null)?"<null>":this.deliverTo));
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
        result = ((result* 31)+((this.requester == null)? 0 :this.requester.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._authoredOn == null)? 0 :this._authoredOn.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.authoredOn == null)? 0 :this.authoredOn.hashCode()));
        result = ((result* 31)+((this.deliverFrom == null)? 0 :this.deliverFrom.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.occurrenceTiming == null)? 0 :this.occurrenceTiming.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.deliverTo == null)? 0 :this.deliverTo.hashCode()));
        result = ((result* 31)+((this.itemReference == null)? 0 :this.itemReference.hashCode()));
        result = ((result* 31)+((this.occurrencePeriod == null)? 0 :this.occurrencePeriod.hashCode()));
        result = ((result* 31)+((this.itemCodeableConcept == null)? 0 :this.itemCodeableConcept.hashCode()));
        result = ((result* 31)+((this.parameter == null)? 0 :this.parameter.hashCode()));
        result = ((result* 31)+((this.supplier == null)? 0 :this.supplier.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
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
        if ((other instanceof SupplyRequest) == false) {
            return false;
        }
        SupplyRequest rhs = ((SupplyRequest) other);
        return ((((((((((((((((((((((((super.equals(rhs)&&((this.requester == rhs.requester)||((this.requester!= null)&&this.requester.equals(rhs.requester))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._authoredOn == rhs._authoredOn)||((this._authoredOn!= null)&&this._authoredOn.equals(rhs._authoredOn))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.authoredOn == rhs.authoredOn)||((this.authoredOn!= null)&&this.authoredOn.equals(rhs.authoredOn))))&&((this.deliverFrom == rhs.deliverFrom)||((this.deliverFrom!= null)&&this.deliverFrom.equals(rhs.deliverFrom))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.occurrenceTiming == rhs.occurrenceTiming)||((this.occurrenceTiming!= null)&&this.occurrenceTiming.equals(rhs.occurrenceTiming))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.deliverTo == rhs.deliverTo)||((this.deliverTo!= null)&&this.deliverTo.equals(rhs.deliverTo))))&&((this.itemReference == rhs.itemReference)||((this.itemReference!= null)&&this.itemReference.equals(rhs.itemReference))))&&((this.occurrencePeriod == rhs.occurrencePeriod)||((this.occurrencePeriod!= null)&&this.occurrencePeriod.equals(rhs.occurrencePeriod))))&&((this.itemCodeableConcept == rhs.itemCodeableConcept)||((this.itemCodeableConcept!= null)&&this.itemCodeableConcept.equals(rhs.itemCodeableConcept))))&&((this.parameter == rhs.parameter)||((this.parameter!= null)&&this.parameter.equals(rhs.parameter))))&&((this.supplier == rhs.supplier)||((this.supplier!= null)&&this.supplier.equals(rhs.supplier))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status of the supply request.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        SUSPENDED("suspended"),
        CANCELLED("cancelled"),
        COMPLETED("completed"),
        ENTERED_IN_ERROR("entered-in-error"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, SupplyRequest.Status> CONSTANTS = new HashMap<String, SupplyRequest.Status>();

        static {
            for (SupplyRequest.Status c: values()) {
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
        public static SupplyRequest.Status fromValue(String value) {
            SupplyRequest.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
