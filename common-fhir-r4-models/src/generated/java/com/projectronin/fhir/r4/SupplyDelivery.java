
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
 * Record of delivery of what is supplied.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "basedOn",
    "partOf",
    "status",
    "_status",
    "patient",
    "type",
    "suppliedItem",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrencePeriod",
    "occurrenceTiming",
    "supplier",
    "destination",
    "receiver"
})
@Generated("jsonschema2pojo")
public class SupplyDelivery
    extends DomainResource
{

    /**
     * This is a SupplyDelivery resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SupplyDelivery resource")
    private String resourceType;
    /**
     * Identifier for the supply delivery event that is used to identify it across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier for the supply delivery event that is used to identify it across multiple disparate systems.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this event.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A plan, proposal or order that is fulfilled in whole or in part by this event.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * A larger event of which this particular event is a component or step.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A larger event of which this particular event is a component or step.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * A code specifying the state of the dispense event.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A code specifying the state of the dispense event.")
    private SupplyDelivery.Status status;
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
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * Record of delivery of what is supplied.
     * 
     */
    @JsonProperty("suppliedItem")
    @JsonPropertyDescription("Record of delivery of what is supplied.")
    private SupplyDelivery_SuppliedItem suppliedItem;
    /**
     * The date or time(s) the activity occurred.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("The date or time(s) the activity occurred.")
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("supplier")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference supplier;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference destination;
    /**
     * Identifies the person who picked up the Supply.
     * 
     */
    @JsonProperty("receiver")
    @JsonPropertyDescription("Identifies the person who picked up the Supply.")
    private List<Reference> receiver = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SupplyDelivery resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SupplyDelivery resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifier for the supply delivery event that is used to identify it across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifier for the supply delivery event that is used to identify it across multiple disparate systems.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this event.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this event.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A larger event of which this particular event is a component or step.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * A larger event of which this particular event is a component or step.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * A code specifying the state of the dispense event.
     * 
     */
    @JsonProperty("status")
    public SupplyDelivery.Status getStatus() {
        return status;
    }

    /**
     * A code specifying the state of the dispense event.
     * 
     */
    @JsonProperty("status")
    public void setStatus(SupplyDelivery.Status status) {
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
     * Record of delivery of what is supplied.
     * 
     */
    @JsonProperty("suppliedItem")
    public SupplyDelivery_SuppliedItem getSuppliedItem() {
        return suppliedItem;
    }

    /**
     * Record of delivery of what is supplied.
     * 
     */
    @JsonProperty("suppliedItem")
    public void setSuppliedItem(SupplyDelivery_SuppliedItem suppliedItem) {
        this.suppliedItem = suppliedItem;
    }

    /**
     * The date or time(s) the activity occurred.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * The date or time(s) the activity occurred.
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("supplier")
    public Reference getSupplier() {
        return supplier;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("supplier")
    public void setSupplier(Reference supplier) {
        this.supplier = supplier;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("destination")
    public Reference getDestination() {
        return destination;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("destination")
    public void setDestination(Reference destination) {
        this.destination = destination;
    }

    /**
     * Identifies the person who picked up the Supply.
     * 
     */
    @JsonProperty("receiver")
    public List<Reference> getReceiver() {
        return receiver;
    }

    /**
     * Identifies the person who picked up the Supply.
     * 
     */
    @JsonProperty("receiver")
    public void setReceiver(List<Reference> receiver) {
        this.receiver = receiver;
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
        sb.append(SupplyDelivery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("suppliedItem");
        sb.append('=');
        sb.append(((this.suppliedItem == null)?"<null>":this.suppliedItem));
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
        sb.append("supplier");
        sb.append('=');
        sb.append(((this.supplier == null)?"<null>":this.supplier));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("receiver");
        sb.append('=');
        sb.append(((this.receiver == null)?"<null>":this.receiver));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.receiver == null)? 0 :this.receiver.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.occurrenceTiming == null)? 0 :this.occurrenceTiming.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.occurrencePeriod == null)? 0 :this.occurrencePeriod.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.supplier == null)? 0 :this.supplier.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.suppliedItem == null)? 0 :this.suppliedItem.hashCode()));
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
        if ((other instanceof SupplyDelivery) == false) {
            return false;
        }
        SupplyDelivery rhs = ((SupplyDelivery) other);
        return (((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.receiver == rhs.receiver)||((this.receiver!= null)&&this.receiver.equals(rhs.receiver))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.occurrenceTiming == rhs.occurrenceTiming)||((this.occurrenceTiming!= null)&&this.occurrenceTiming.equals(rhs.occurrenceTiming))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.occurrencePeriod == rhs.occurrencePeriod)||((this.occurrencePeriod!= null)&&this.occurrencePeriod.equals(rhs.occurrencePeriod))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.supplier == rhs.supplier)||((this.supplier!= null)&&this.supplier.equals(rhs.supplier))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.suppliedItem == rhs.suppliedItem)||((this.suppliedItem!= null)&&this.suppliedItem.equals(rhs.suppliedItem))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * A code specifying the state of the dispense event.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        IN_PROGRESS("in-progress"),
        COMPLETED("completed"),
        ABANDONED("abandoned"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, SupplyDelivery.Status> CONSTANTS = new HashMap<String, SupplyDelivery.Status>();

        static {
            for (SupplyDelivery.Status c: values()) {
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
        public static SupplyDelivery.Status fromValue(String value) {
            SupplyDelivery.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
