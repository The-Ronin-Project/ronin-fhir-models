
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
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 
 * 
 * The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
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
    "statusReason",
    "category",
    "medicationCodeableConcept",
    "medicationReference",
    "subject",
    "context",
    "effectiveDateTime",
    "_effectiveDateTime",
    "effectivePeriod",
    "dateAsserted",
    "_dateAsserted",
    "informationSource",
    "derivedFrom",
    "reasonCode",
    "reasonReference",
    "note",
    "dosage"
})
@Generated("jsonschema2pojo")
public class MedicationStatement
    extends DomainResource
{

    /**
     * This is a MedicationStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicationStatement resource")
    private String resourceType;
    /**
     * Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
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
     * Captures the reason for the current state of the MedicationStatement.
     * 
     */
    @JsonProperty("statusReason")
    @JsonPropertyDescription("Captures the reason for the current state of the MedicationStatement.")
    private List<CodeableConcept> statusReason = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept category;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("medicationCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept medicationCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("medicationReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference medicationReference;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference context;
    /**
     * The interval of time during which it is being asserted that the patient is/was/will be taking the medication (or was not taking, when the MedicationStatement.taken element is No).
     * 
     */
    @JsonProperty("effectiveDateTime")
    @JsonPropertyDescription("The interval of time during which it is being asserted that the patient is/was/will be taking the medication (or was not taking, when the MedicationStatement.taken element is No).")
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateAsserted")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String dateAsserted;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateAsserted")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dateAsserted;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("informationSource")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference informationSource;
    /**
     * Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.
     * 
     */
    @JsonProperty("derivedFrom")
    @JsonPropertyDescription("Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.")
    private List<Reference> derivedFrom = new ArrayList<Reference>();
    /**
     * A reason for why the medication is being/was taken.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("A reason for why the medication is being/was taken.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Condition or observation that supports why the medication is being/was taken.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Condition or observation that supports why the medication is being/was taken.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Provides extra information about the medication statement that is not conveyed by the other attributes.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Indicates how the medication is/was or should be taken by the patient.
     * 
     */
    @JsonProperty("dosage")
    @JsonPropertyDescription("Indicates how the medication is/was or should be taken by the patient.")
    private List<Dosage> dosage = new ArrayList<Dosage>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicationStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicationStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
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
     * Captures the reason for the current state of the MedicationStatement.
     * 
     */
    @JsonProperty("statusReason")
    public List<CodeableConcept> getStatusReason() {
        return statusReason;
    }

    /**
     * Captures the reason for the current state of the MedicationStatement.
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(List<CodeableConcept> statusReason) {
        this.statusReason = statusReason;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("medicationCodeableConcept")
    public CodeableConcept getMedicationCodeableConcept() {
        return medicationCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(CodeableConcept medicationCodeableConcept) {
        this.medicationCodeableConcept = medicationCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("medicationReference")
    public Reference getMedicationReference() {
        return medicationReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("medicationReference")
    public void setMedicationReference(Reference medicationReference) {
        this.medicationReference = medicationReference;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("context")
    public Reference getContext() {
        return context;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("context")
    public void setContext(Reference context) {
        this.context = context;
    }

    /**
     * The interval of time during which it is being asserted that the patient is/was/will be taking the medication (or was not taking, when the MedicationStatement.taken element is No).
     * 
     */
    @JsonProperty("effectiveDateTime")
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * The interval of time during which it is being asserted that the patient is/was/will be taking the medication (or was not taking, when the MedicationStatement.taken element is No).
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateAsserted")
    public String getDateAsserted() {
        return dateAsserted;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateAsserted")
    public void setDateAsserted(String dateAsserted) {
        this.dateAsserted = dateAsserted;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateAsserted")
    public Element get_dateAsserted() {
        return _dateAsserted;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateAsserted")
    public void set_dateAsserted(Element _dateAsserted) {
        this._dateAsserted = _dateAsserted;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("informationSource")
    public Reference getInformationSource() {
        return informationSource;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("informationSource")
    public void setInformationSource(Reference informationSource) {
        this.informationSource = informationSource;
    }

    /**
     * Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.
     * 
     */
    @JsonProperty("derivedFrom")
    public List<Reference> getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.
     * 
     */
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(List<Reference> derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    /**
     * A reason for why the medication is being/was taken.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * A reason for why the medication is being/was taken.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Condition or observation that supports why the medication is being/was taken.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Condition or observation that supports why the medication is being/was taken.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Indicates how the medication is/was or should be taken by the patient.
     * 
     */
    @JsonProperty("dosage")
    public List<Dosage> getDosage() {
        return dosage;
    }

    /**
     * Indicates how the medication is/was or should be taken by the patient.
     * 
     */
    @JsonProperty("dosage")
    public void setDosage(List<Dosage> dosage) {
        this.dosage = dosage;
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
        sb.append(MedicationStatement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("medicationCodeableConcept");
        sb.append('=');
        sb.append(((this.medicationCodeableConcept == null)?"<null>":this.medicationCodeableConcept));
        sb.append(',');
        sb.append("medicationReference");
        sb.append('=');
        sb.append(((this.medicationReference == null)?"<null>":this.medicationReference));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
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
        sb.append("dateAsserted");
        sb.append('=');
        sb.append(((this.dateAsserted == null)?"<null>":this.dateAsserted));
        sb.append(',');
        sb.append("_dateAsserted");
        sb.append('=');
        sb.append(((this._dateAsserted == null)?"<null>":this._dateAsserted));
        sb.append(',');
        sb.append("informationSource");
        sb.append('=');
        sb.append(((this.informationSource == null)?"<null>":this.informationSource));
        sb.append(',');
        sb.append("derivedFrom");
        sb.append('=');
        sb.append(((this.derivedFrom == null)?"<null>":this.derivedFrom));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("dosage");
        sb.append('=');
        sb.append(((this.dosage == null)?"<null>":this.dosage));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.dosage == null)? 0 :this.dosage.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.medicationCodeableConcept == null)? 0 :this.medicationCodeableConcept.hashCode()));
        result = ((result* 31)+((this.medicationReference == null)? 0 :this.medicationReference.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.effectiveDateTime == null)? 0 :this.effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.informationSource == null)? 0 :this.informationSource.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.derivedFrom == null)? 0 :this.derivedFrom.hashCode()));
        result = ((result* 31)+((this._effectiveDateTime == null)? 0 :this._effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.dateAsserted == null)? 0 :this.dateAsserted.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this._dateAsserted == null)? 0 :this._dateAsserted.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicationStatement) == false) {
            return false;
        }
        MedicationStatement rhs = ((MedicationStatement) other);
        return ((((((((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.dosage == rhs.dosage)||((this.dosage!= null)&&this.dosage.equals(rhs.dosage))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.medicationCodeableConcept == rhs.medicationCodeableConcept)||((this.medicationCodeableConcept!= null)&&this.medicationCodeableConcept.equals(rhs.medicationCodeableConcept))))&&((this.medicationReference == rhs.medicationReference)||((this.medicationReference!= null)&&this.medicationReference.equals(rhs.medicationReference))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.effectiveDateTime == rhs.effectiveDateTime)||((this.effectiveDateTime!= null)&&this.effectiveDateTime.equals(rhs.effectiveDateTime))))&&((this.informationSource == rhs.informationSource)||((this.informationSource!= null)&&this.informationSource.equals(rhs.informationSource))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.derivedFrom == rhs.derivedFrom)||((this.derivedFrom!= null)&&this.derivedFrom.equals(rhs.derivedFrom))))&&((this._effectiveDateTime == rhs._effectiveDateTime)||((this._effectiveDateTime!= null)&&this._effectiveDateTime.equals(rhs._effectiveDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.dateAsserted == rhs.dateAsserted)||((this.dateAsserted!= null)&&this.dateAsserted.equals(rhs.dateAsserted))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this._dateAsserted == rhs._dateAsserted)||((this._dateAsserted!= null)&&this._dateAsserted.equals(rhs._dateAsserted))));
    }

}
