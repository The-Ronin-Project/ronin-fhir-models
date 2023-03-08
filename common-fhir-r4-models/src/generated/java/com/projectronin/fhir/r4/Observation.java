
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
 * Measurements and simple assertions made about a patient, device or other subject.
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
    "category",
    "code",
    "subject",
    "focus",
    "encounter",
    "effectiveDateTime",
    "_effectiveDateTime",
    "effectivePeriod",
    "effectiveTiming",
    "effectiveInstant",
    "_effectiveInstant",
    "issued",
    "_issued",
    "performer",
    "valueQuantity",
    "valueCodeableConcept",
    "valueString",
    "_valueString",
    "valueBoolean",
    "_valueBoolean",
    "valueInteger",
    "_valueInteger",
    "valueRange",
    "valueRatio",
    "valueSampledData",
    "valueTime",
    "_valueTime",
    "valueDateTime",
    "_valueDateTime",
    "valuePeriod",
    "dataAbsentReason",
    "interpretation",
    "note",
    "bodySite",
    "method",
    "specimen",
    "device",
    "referenceRange",
    "hasMember",
    "derivedFrom",
    "component"
})
@Generated("jsonschema2pojo")
public class Observation
    extends DomainResource
{

    /**
     * This is a Observation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Observation resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this observation.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this observation.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * A larger event of which this particular Observation is a component or step.  For example,  an observation as part of a procedure.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A larger event of which this particular Observation is a component or step.  For example,  an observation as part of a procedure.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * The status of the result value.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the result value.")
    private Observation.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A code that classifies the general type of observation being made.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A code that classifies the general type of observation being made.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.
     * 
     */
    @JsonProperty("focus")
    @JsonPropertyDescription("The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.")
    private List<Reference> focus = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the &quot;physiologically relevant time&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveDateTime")
    @JsonPropertyDescription("The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.")
    private String effectiveDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _effectiveDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("effectivePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period effectivePeriod;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("effectiveTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing effectiveTiming;
    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the &quot;physiologically relevant time&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveInstant")
    @JsonPropertyDescription("The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.")
    private String effectiveInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _effectiveInstant;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("issued")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String issued;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _issued;
    /**
     * Who was responsible for asserting the observed value as &quot;true&quot;.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Who was responsible for asserting the observed value as \"true\".")
    private List<Reference> performer = new ArrayList<Reference>();
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity valueQuantity;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept valueCodeableConcept;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueBoolean")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private Boolean valueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBoolean;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueInteger")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private Double valueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInteger;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range valueRange;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio valueRatio;
    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    @JsonPropertyDescription("A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.")
    private SampledData valueSampledData;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueTime")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private String valueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueTime;
    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueDateTime")
    @JsonPropertyDescription("The information determined as a result of making the observation, if the information has a simple value.")
    private String valueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period valuePeriod;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dataAbsentReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept dataAbsentReason;
    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     * 
     */
    @JsonProperty("interpretation")
    @JsonPropertyDescription("A categorical assessment of an observation value.  For example, high, low, normal.")
    private List<CodeableConcept> interpretation = new ArrayList<CodeableConcept>();
    /**
     * Comments about the observation or the results.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments about the observation or the results.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept bodySite;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept method;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("specimen")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference specimen;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference device;
    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an &quot;OR&quot;.   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.
     * 
     */
    @JsonProperty("referenceRange")
    @JsonPropertyDescription("Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an \"OR\".   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.")
    private List<Observation_ReferenceRange> referenceRange = new ArrayList<Observation_ReferenceRange>();
    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     * 
     */
    @JsonProperty("hasMember")
    @JsonPropertyDescription("This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.")
    private List<Reference> hasMember = new ArrayList<Reference>();
    /**
     * The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.
     * 
     */
    @JsonProperty("derivedFrom")
    @JsonPropertyDescription("The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.")
    private List<Reference> derivedFrom = new ArrayList<Reference>();
    /**
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * 
     */
    @JsonProperty("component")
    @JsonPropertyDescription("Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.")
    private List<Observation_Component> component = new ArrayList<Observation_Component>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Observation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Observation resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this observation.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this observation.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A larger event of which this particular Observation is a component or step.  For example,  an observation as part of a procedure.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * A larger event of which this particular Observation is a component or step.  For example,  an observation as part of a procedure.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * The status of the result value.
     * 
     */
    @JsonProperty("status")
    public Observation.Status getStatus() {
        return status;
    }

    /**
     * The status of the result value.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Observation.Status status) {
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
     * A code that classifies the general type of observation being made.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A code that classifies the general type of observation being made.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
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
     * The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.
     * 
     */
    @JsonProperty("focus")
    public List<Reference> getFocus() {
        return focus;
    }

    /**
     * The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.
     * 
     */
    @JsonProperty("focus")
    public void setFocus(List<Reference> focus) {
        this.focus = focus;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(Reference encounter) {
        this.encounter = encounter;
    }

    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the &quot;physiologically relevant time&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveDateTime")
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the &quot;physiologically relevant time&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(String effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveDateTime")
    public Element get_effectiveDateTime() {
        return _effectiveDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveDateTime")
    public void set_effectiveDateTime(Element _effectiveDateTime) {
        this._effectiveDateTime = _effectiveDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("effectivePeriod")
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Period effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("effectiveTiming")
    public Timing getEffectiveTiming() {
        return effectiveTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("effectiveTiming")
    public void setEffectiveTiming(Timing effectiveTiming) {
        this.effectiveTiming = effectiveTiming;
    }

    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the &quot;physiologically relevant time&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveInstant")
    public String getEffectiveInstant() {
        return effectiveInstant;
    }

    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the &quot;physiologically relevant time&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveInstant")
    public void setEffectiveInstant(String effectiveInstant) {
        this.effectiveInstant = effectiveInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveInstant")
    public Element get_effectiveInstant() {
        return _effectiveInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_effectiveInstant")
    public void set_effectiveInstant(Element _effectiveInstant) {
        this._effectiveInstant = _effectiveInstant;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("issued")
    public String getIssued() {
        return issued;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("issued")
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public Element get_issued() {
        return _issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public void set_issued(Element _issued) {
        this._issued = _issued;
    }

    /**
     * Who was responsible for asserting the observed value as &quot;true&quot;.
     * 
     */
    @JsonProperty("performer")
    public List<Reference> getPerformer() {
        return performer;
    }

    /**
     * Who was responsible for asserting the observed value as &quot;true&quot;.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<Reference> performer) {
        this.performer = performer;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Quantity valueQuantity) {
        this.valueQuantity = valueQuantity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
        this.valueCodeableConcept = valueCodeableConcept;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueString")
    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    public Element get_valueString() {
        return _valueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    public void set_valueString(Element _valueString) {
        this._valueString = _valueString;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    public Element get_valueBoolean() {
        return _valueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    public void set_valueBoolean(Element _valueBoolean) {
        this._valueBoolean = _valueBoolean;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueInteger")
    public Double getValueInteger() {
        return valueInteger;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueInteger")
    public void setValueInteger(Double valueInteger) {
        this.valueInteger = valueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    public Element get_valueInteger() {
        return _valueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    public void set_valueInteger(Element _valueInteger) {
        this._valueInteger = _valueInteger;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    public void setValueRange(Range valueRange) {
        this.valueRange = valueRange;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    public void setValueRatio(Ratio valueRatio) {
        this.valueRatio = valueRatio;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    public void setValueSampledData(SampledData valueSampledData) {
        this.valueSampledData = valueSampledData;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueTime")
    public String getValueTime() {
        return valueTime;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueTime")
    public void setValueTime(String valueTime) {
        this.valueTime = valueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    public Element get_valueTime() {
        return _valueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    public void set_valueTime(Element _valueTime) {
        this._valueTime = _valueTime;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueDateTime")
    public String getValueDateTime() {
        return valueDateTime;
    }

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     * 
     */
    @JsonProperty("valueDateTime")
    public void setValueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    public Element get_valueDateTime() {
        return _valueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    public void set_valueDateTime(Element _valueDateTime) {
        this._valueDateTime = _valueDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Period valuePeriod) {
        this.valuePeriod = valuePeriod;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dataAbsentReason")
    public CodeableConcept getDataAbsentReason() {
        return dataAbsentReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(CodeableConcept dataAbsentReason) {
        this.dataAbsentReason = dataAbsentReason;
    }

    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     * 
     */
    @JsonProperty("interpretation")
    public List<CodeableConcept> getInterpretation() {
        return interpretation;
    }

    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     * 
     */
    @JsonProperty("interpretation")
    public void setInterpretation(List<CodeableConcept> interpretation) {
        this.interpretation = interpretation;
    }

    /**
     * Comments about the observation or the results.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments about the observation or the results.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public void setMethod(CodeableConcept method) {
        this.method = method;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("specimen")
    public Reference getSpecimen() {
        return specimen;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("specimen")
    public void setSpecimen(Reference specimen) {
        this.specimen = specimen;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    public Reference getDevice() {
        return device;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    public void setDevice(Reference device) {
        this.device = device;
    }

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an &quot;OR&quot;.   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.
     * 
     */
    @JsonProperty("referenceRange")
    public List<Observation_ReferenceRange> getReferenceRange() {
        return referenceRange;
    }

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an &quot;OR&quot;.   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.
     * 
     */
    @JsonProperty("referenceRange")
    public void setReferenceRange(List<Observation_ReferenceRange> referenceRange) {
        this.referenceRange = referenceRange;
    }

    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     * 
     */
    @JsonProperty("hasMember")
    public List<Reference> getHasMember() {
        return hasMember;
    }

    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     * 
     */
    @JsonProperty("hasMember")
    public void setHasMember(List<Reference> hasMember) {
        this.hasMember = hasMember;
    }

    /**
     * The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.
     * 
     */
    @JsonProperty("derivedFrom")
    public List<Reference> getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.
     * 
     */
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(List<Reference> derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    /**
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * 
     */
    @JsonProperty("component")
    public List<Observation_Component> getComponent() {
        return component;
    }

    /**
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * 
     */
    @JsonProperty("component")
    public void setComponent(List<Observation_Component> component) {
        this.component = component;
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
        sb.append(Observation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("focus");
        sb.append('=');
        sb.append(((this.focus == null)?"<null>":this.focus));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("effectiveDateTime");
        sb.append('=');
        sb.append(((this.effectiveDateTime == null)?"<null>":this.effectiveDateTime));
        sb.append(',');
        sb.append("_effectiveDateTime");
        sb.append('=');
        sb.append(((this._effectiveDateTime == null)?"<null>":this._effectiveDateTime));
        sb.append(',');
        sb.append("effectivePeriod");
        sb.append('=');
        sb.append(((this.effectivePeriod == null)?"<null>":this.effectivePeriod));
        sb.append(',');
        sb.append("effectiveTiming");
        sb.append('=');
        sb.append(((this.effectiveTiming == null)?"<null>":this.effectiveTiming));
        sb.append(',');
        sb.append("effectiveInstant");
        sb.append('=');
        sb.append(((this.effectiveInstant == null)?"<null>":this.effectiveInstant));
        sb.append(',');
        sb.append("_effectiveInstant");
        sb.append('=');
        sb.append(((this._effectiveInstant == null)?"<null>":this._effectiveInstant));
        sb.append(',');
        sb.append("issued");
        sb.append('=');
        sb.append(((this.issued == null)?"<null>":this.issued));
        sb.append(',');
        sb.append("_issued");
        sb.append('=');
        sb.append(((this._issued == null)?"<null>":this._issued));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("valueQuantity");
        sb.append('=');
        sb.append(((this.valueQuantity == null)?"<null>":this.valueQuantity));
        sb.append(',');
        sb.append("valueCodeableConcept");
        sb.append('=');
        sb.append(((this.valueCodeableConcept == null)?"<null>":this.valueCodeableConcept));
        sb.append(',');
        sb.append("valueString");
        sb.append('=');
        sb.append(((this.valueString == null)?"<null>":this.valueString));
        sb.append(',');
        sb.append("_valueString");
        sb.append('=');
        sb.append(((this._valueString == null)?"<null>":this._valueString));
        sb.append(',');
        sb.append("valueBoolean");
        sb.append('=');
        sb.append(((this.valueBoolean == null)?"<null>":this.valueBoolean));
        sb.append(',');
        sb.append("_valueBoolean");
        sb.append('=');
        sb.append(((this._valueBoolean == null)?"<null>":this._valueBoolean));
        sb.append(',');
        sb.append("valueInteger");
        sb.append('=');
        sb.append(((this.valueInteger == null)?"<null>":this.valueInteger));
        sb.append(',');
        sb.append("_valueInteger");
        sb.append('=');
        sb.append(((this._valueInteger == null)?"<null>":this._valueInteger));
        sb.append(',');
        sb.append("valueRange");
        sb.append('=');
        sb.append(((this.valueRange == null)?"<null>":this.valueRange));
        sb.append(',');
        sb.append("valueRatio");
        sb.append('=');
        sb.append(((this.valueRatio == null)?"<null>":this.valueRatio));
        sb.append(',');
        sb.append("valueSampledData");
        sb.append('=');
        sb.append(((this.valueSampledData == null)?"<null>":this.valueSampledData));
        sb.append(',');
        sb.append("valueTime");
        sb.append('=');
        sb.append(((this.valueTime == null)?"<null>":this.valueTime));
        sb.append(',');
        sb.append("_valueTime");
        sb.append('=');
        sb.append(((this._valueTime == null)?"<null>":this._valueTime));
        sb.append(',');
        sb.append("valueDateTime");
        sb.append('=');
        sb.append(((this.valueDateTime == null)?"<null>":this.valueDateTime));
        sb.append(',');
        sb.append("_valueDateTime");
        sb.append('=');
        sb.append(((this._valueDateTime == null)?"<null>":this._valueDateTime));
        sb.append(',');
        sb.append("valuePeriod");
        sb.append('=');
        sb.append(((this.valuePeriod == null)?"<null>":this.valuePeriod));
        sb.append(',');
        sb.append("dataAbsentReason");
        sb.append('=');
        sb.append(((this.dataAbsentReason == null)?"<null>":this.dataAbsentReason));
        sb.append(',');
        sb.append("interpretation");
        sb.append('=');
        sb.append(((this.interpretation == null)?"<null>":this.interpretation));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("specimen");
        sb.append('=');
        sb.append(((this.specimen == null)?"<null>":this.specimen));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        sb.append("referenceRange");
        sb.append('=');
        sb.append(((this.referenceRange == null)?"<null>":this.referenceRange));
        sb.append(',');
        sb.append("hasMember");
        sb.append('=');
        sb.append(((this.hasMember == null)?"<null>":this.hasMember));
        sb.append(',');
        sb.append("derivedFrom");
        sb.append('=');
        sb.append(((this.derivedFrom == null)?"<null>":this.derivedFrom));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
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
        result = ((result* 31)+((this.valueBoolean == null)? 0 :this.valueBoolean.hashCode()));
        result = ((result* 31)+((this._valueBoolean == null)? 0 :this._valueBoolean.hashCode()));
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.dataAbsentReason == null)? 0 :this.dataAbsentReason.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.valueTime == null)? 0 :this.valueTime.hashCode()));
        result = ((result* 31)+((this._valueTime == null)? 0 :this._valueTime.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.valueRange == null)? 0 :this.valueRange.hashCode()));
        result = ((result* 31)+((this.focus == null)? 0 :this.focus.hashCode()));
        result = ((result* 31)+((this.valueCodeableConcept == null)? 0 :this.valueCodeableConcept.hashCode()));
        result = ((result* 31)+((this.valueRatio == null)? 0 :this.valueRatio.hashCode()));
        result = ((result* 31)+((this._effectiveInstant == null)? 0 :this._effectiveInstant.hashCode()));
        result = ((result* 31)+((this.specimen == null)? 0 :this.specimen.hashCode()));
        result = ((result* 31)+((this.derivedFrom == null)? 0 :this.derivedFrom.hashCode()));
        result = ((result* 31)+((this._effectiveDateTime == null)? 0 :this._effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.valueDateTime == null)? 0 :this.valueDateTime.hashCode()));
        result = ((result* 31)+((this.issued == null)? 0 :this.issued.hashCode()));
        result = ((result* 31)+((this.valueInteger == null)? 0 :this.valueInteger.hashCode()));
        result = ((result* 31)+((this._valueInteger == null)? 0 :this._valueInteger.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.valueQuantity == null)? 0 :this.valueQuantity.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._valueString == null)? 0 :this._valueString.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this.effectiveTiming == null)? 0 :this.effectiveTiming.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.hasMember == null)? 0 :this.hasMember.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._issued == null)? 0 :this._issued.hashCode()));
        result = ((result* 31)+((this._valueDateTime == null)? 0 :this._valueDateTime.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.referenceRange == null)? 0 :this.referenceRange.hashCode()));
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this.effectiveDateTime == null)? 0 :this.effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.interpretation == null)? 0 :this.interpretation.hashCode()));
        result = ((result* 31)+((this.valueSampledData == null)? 0 :this.valueSampledData.hashCode()));
        result = ((result* 31)+((this.valuePeriod == null)? 0 :this.valuePeriod.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
        result = ((result* 31)+((this.effectiveInstant == null)? 0 :this.effectiveInstant.hashCode()));
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
        if ((other instanceof Observation) == false) {
            return false;
        }
        Observation rhs = ((Observation) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.valueBoolean == rhs.valueBoolean)||((this.valueBoolean!= null)&&this.valueBoolean.equals(rhs.valueBoolean))))&&((this._valueBoolean == rhs._valueBoolean)||((this._valueBoolean!= null)&&this._valueBoolean.equals(rhs._valueBoolean))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.dataAbsentReason == rhs.dataAbsentReason)||((this.dataAbsentReason!= null)&&this.dataAbsentReason.equals(rhs.dataAbsentReason))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.valueTime == rhs.valueTime)||((this.valueTime!= null)&&this.valueTime.equals(rhs.valueTime))))&&((this._valueTime == rhs._valueTime)||((this._valueTime!= null)&&this._valueTime.equals(rhs._valueTime))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.valueRange == rhs.valueRange)||((this.valueRange!= null)&&this.valueRange.equals(rhs.valueRange))))&&((this.focus == rhs.focus)||((this.focus!= null)&&this.focus.equals(rhs.focus))))&&((this.valueCodeableConcept == rhs.valueCodeableConcept)||((this.valueCodeableConcept!= null)&&this.valueCodeableConcept.equals(rhs.valueCodeableConcept))))&&((this.valueRatio == rhs.valueRatio)||((this.valueRatio!= null)&&this.valueRatio.equals(rhs.valueRatio))))&&((this._effectiveInstant == rhs._effectiveInstant)||((this._effectiveInstant!= null)&&this._effectiveInstant.equals(rhs._effectiveInstant))))&&((this.specimen == rhs.specimen)||((this.specimen!= null)&&this.specimen.equals(rhs.specimen))))&&((this.derivedFrom == rhs.derivedFrom)||((this.derivedFrom!= null)&&this.derivedFrom.equals(rhs.derivedFrom))))&&((this._effectiveDateTime == rhs._effectiveDateTime)||((this._effectiveDateTime!= null)&&this._effectiveDateTime.equals(rhs._effectiveDateTime))))&&((this.valueDateTime == rhs.valueDateTime)||((this.valueDateTime!= null)&&this.valueDateTime.equals(rhs.valueDateTime))))&&((this.issued == rhs.issued)||((this.issued!= null)&&this.issued.equals(rhs.issued))))&&((this.valueInteger == rhs.valueInteger)||((this.valueInteger!= null)&&this.valueInteger.equals(rhs.valueInteger))))&&((this._valueInteger == rhs._valueInteger)||((this._valueInteger!= null)&&this._valueInteger.equals(rhs._valueInteger))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.valueQuantity == rhs.valueQuantity)||((this.valueQuantity!= null)&&this.valueQuantity.equals(rhs.valueQuantity))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this.effectiveTiming == rhs.effectiveTiming)||((this.effectiveTiming!= null)&&this.effectiveTiming.equals(rhs.effectiveTiming))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.hasMember == rhs.hasMember)||((this.hasMember!= null)&&this.hasMember.equals(rhs.hasMember))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._issued == rhs._issued)||((this._issued!= null)&&this._issued.equals(rhs._issued))))&&((this._valueDateTime == rhs._valueDateTime)||((this._valueDateTime!= null)&&this._valueDateTime.equals(rhs._valueDateTime))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.referenceRange == rhs.referenceRange)||((this.referenceRange!= null)&&this.referenceRange.equals(rhs.referenceRange))))&&((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this.effectiveDateTime == rhs.effectiveDateTime)||((this.effectiveDateTime!= null)&&this.effectiveDateTime.equals(rhs.effectiveDateTime))))&&((this.interpretation == rhs.interpretation)||((this.interpretation!= null)&&this.interpretation.equals(rhs.interpretation))))&&((this.valueSampledData == rhs.valueSampledData)||((this.valueSampledData!= null)&&this.valueSampledData.equals(rhs.valueSampledData))))&&((this.valuePeriod == rhs.valuePeriod)||((this.valuePeriod!= null)&&this.valuePeriod.equals(rhs.valuePeriod))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device))))&&((this.effectiveInstant == rhs.effectiveInstant)||((this.effectiveInstant!= null)&&this.effectiveInstant.equals(rhs.effectiveInstant))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The status of the result value.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        REGISTERED("registered"),
        PRELIMINARY("preliminary"),
        FINAL("final"),
        AMENDED("amended"),
        CORRECTED("corrected"),
        CANCELLED("cancelled"),
        ENTERED_IN_ERROR("entered-in-error"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Observation.Status> CONSTANTS = new HashMap<String, Observation.Status>();

        static {
            for (Observation.Status c: values()) {
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
        public static Observation.Status fromValue(String value) {
            Observation.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
