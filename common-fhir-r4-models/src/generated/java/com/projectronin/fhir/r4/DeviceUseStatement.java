
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
 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "basedOn",
    "status",
    "_status",
    "subject",
    "derivedFrom",
    "timingTiming",
    "timingPeriod",
    "timingDateTime",
    "_timingDateTime",
    "recordedOn",
    "_recordedOn",
    "source",
    "device",
    "reasonCode",
    "reasonReference",
    "bodySite",
    "note"
})
@Generated("jsonschema2pojo")
public class DeviceUseStatement
    extends DomainResource
{

    /**
     * This is a DeviceUseStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a DeviceUseStatement resource")
    private String resourceType;
    /**
     * An external identifier for this statement such as an IRI.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An external identifier for this statement such as an IRI.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this DeviceUseStatement.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A plan, proposal or order that is fulfilled in whole or in part by this DeviceUseStatement.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.")
    private DeviceUseStatement.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * Allows linking the DeviceUseStatement to the underlying Request, or to other information that supports or is used to derive the DeviceUseStatement.
     * 
     */
    @JsonProperty("derivedFrom")
    @JsonPropertyDescription("Allows linking the DeviceUseStatement to the underlying Request, or to other information that supports or is used to derive the DeviceUseStatement.")
    private List<Reference> derivedFrom = new ArrayList<Reference>();
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing timingTiming;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period timingPeriod;
    /**
     * How often the device was used.
     * 
     */
    @JsonProperty("timingDateTime")
    @JsonPropertyDescription("How often the device was used.")
    private String timingDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timingDateTime;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recordedOn")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String recordedOn;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recordedOn")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _recordedOn;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference source;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference device;
    /**
     * Reason or justification for the use of the device.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Reason or justification for the use of the device.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource whose existence justifies this DeviceUseStatement.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource whose existence justifies this DeviceUseStatement.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept bodySite;
    /**
     * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a DeviceUseStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a DeviceUseStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An external identifier for this statement such as an IRI.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * An external identifier for this statement such as an IRI.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this DeviceUseStatement.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this DeviceUseStatement.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
     * 
     */
    @JsonProperty("status")
    public DeviceUseStatement.Status getStatus() {
        return status;
    }

    /**
     * A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
     * 
     */
    @JsonProperty("status")
    public void setStatus(DeviceUseStatement.Status status) {
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
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * Allows linking the DeviceUseStatement to the underlying Request, or to other information that supports or is used to derive the DeviceUseStatement.
     * 
     */
    @JsonProperty("derivedFrom")
    public List<Reference> getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * Allows linking the DeviceUseStatement to the underlying Request, or to other information that supports or is used to derive the DeviceUseStatement.
     * 
     */
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(List<Reference> derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public Timing getTimingTiming() {
        return timingTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public void setTimingTiming(Timing timingTiming) {
        this.timingTiming = timingTiming;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Period timingPeriod) {
        this.timingPeriod = timingPeriod;
    }

    /**
     * How often the device was used.
     * 
     */
    @JsonProperty("timingDateTime")
    public String getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * How often the device was used.
     * 
     */
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(String timingDateTime) {
        this.timingDateTime = timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public Element get_timingDateTime() {
        return _timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public void set_timingDateTime(Element _timingDateTime) {
        this._timingDateTime = _timingDateTime;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recordedOn")
    public String getRecordedOn() {
        return recordedOn;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recordedOn")
    public void setRecordedOn(String recordedOn) {
        this.recordedOn = recordedOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recordedOn")
    public Element get_recordedOn() {
        return _recordedOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recordedOn")
    public void set_recordedOn(Element _recordedOn) {
        this._recordedOn = _recordedOn;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public Reference getSource() {
        return source;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public void setSource(Reference source) {
        this.source = source;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("device")
    public Reference getDevice() {
        return device;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("device")
    public void setDevice(Reference device) {
        this.device = device;
    }

    /**
     * Reason or justification for the use of the device.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Reason or justification for the use of the device.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource whose existence justifies this DeviceUseStatement.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource whose existence justifies this DeviceUseStatement.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(CodeableConcept bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
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
        sb.append(DeviceUseStatement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("derivedFrom");
        sb.append('=');
        sb.append(((this.derivedFrom == null)?"<null>":this.derivedFrom));
        sb.append(',');
        sb.append("timingTiming");
        sb.append('=');
        sb.append(((this.timingTiming == null)?"<null>":this.timingTiming));
        sb.append(',');
        sb.append("timingPeriod");
        sb.append('=');
        sb.append(((this.timingPeriod == null)?"<null>":this.timingPeriod));
        sb.append(',');
        sb.append("timingDateTime");
        sb.append('=');
        sb.append(((this.timingDateTime == null)?"<null>":this.timingDateTime));
        sb.append(',');
        sb.append("_timingDateTime");
        sb.append('=');
        sb.append(((this._timingDateTime == null)?"<null>":this._timingDateTime));
        sb.append(',');
        sb.append("recordedOn");
        sb.append('=');
        sb.append(((this.recordedOn == null)?"<null>":this.recordedOn));
        sb.append(',');
        sb.append("_recordedOn");
        sb.append('=');
        sb.append(((this._recordedOn == null)?"<null>":this._recordedOn));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.timingTiming == null)? 0 :this.timingTiming.hashCode()));
        result = ((result* 31)+((this._timingDateTime == null)? 0 :this._timingDateTime.hashCode()));
        result = ((result* 31)+((this.timingPeriod == null)? 0 :this.timingPeriod.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.derivedFrom == null)? 0 :this.derivedFrom.hashCode()));
        result = ((result* 31)+((this.recordedOn == null)? 0 :this.recordedOn.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._recordedOn == null)? 0 :this._recordedOn.hashCode()));
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.timingDateTime == null)? 0 :this.timingDateTime.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceUseStatement) == false) {
            return false;
        }
        DeviceUseStatement rhs = ((DeviceUseStatement) other);
        return ((((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.timingTiming == rhs.timingTiming)||((this.timingTiming!= null)&&this.timingTiming.equals(rhs.timingTiming))))&&((this._timingDateTime == rhs._timingDateTime)||((this._timingDateTime!= null)&&this._timingDateTime.equals(rhs._timingDateTime))))&&((this.timingPeriod == rhs.timingPeriod)||((this.timingPeriod!= null)&&this.timingPeriod.equals(rhs.timingPeriod))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.derivedFrom == rhs.derivedFrom)||((this.derivedFrom!= null)&&this.derivedFrom.equals(rhs.derivedFrom))))&&((this.recordedOn == rhs.recordedOn)||((this.recordedOn!= null)&&this.recordedOn.equals(rhs.recordedOn))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._recordedOn == rhs._recordedOn)||((this._recordedOn!= null)&&this._recordedOn.equals(rhs._recordedOn))))&&((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.timingDateTime == rhs.timingDateTime)||((this.timingDateTime!= null)&&this.timingDateTime.equals(rhs.timingDateTime))));
    }


    /**
     * A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        COMPLETED("completed"),
        ENTERED_IN_ERROR("entered-in-error"),
        INTENDED("intended"),
        STOPPED("stopped"),
        ON_HOLD("on-hold");
        private final String value;
        private final static Map<String, DeviceUseStatement.Status> CONSTANTS = new HashMap<String, DeviceUseStatement.Status>();

        static {
            for (DeviceUseStatement.Status c: values()) {
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
        public static DeviceUseStatement.Status fromValue(String value) {
            DeviceUseStatement.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
