
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
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "partOf",
    "status",
    "_status",
    "statusReasonCodeableConcept",
    "statusReasonReference",
    "category",
    "medicationCodeableConcept",
    "medicationReference",
    "subject",
    "context",
    "supportingInformation",
    "performer",
    "location",
    "authorizingPrescription",
    "type",
    "quantity",
    "daysSupply",
    "whenPrepared",
    "_whenPrepared",
    "whenHandedOver",
    "_whenHandedOver",
    "destination",
    "receiver",
    "note",
    "dosageInstruction",
    "substitution",
    "detectedIssue",
    "eventHistory"
})
@Generated("jsonschema2pojo")
public class MedicationDispense
    extends DomainResource
{

    /**
     * This is a MedicationDispense resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicationDispense resource")
    private String resourceType;
    /**
     * Identifiers associated with this Medication Dispense that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers associated with this Medication Dispense that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The procedure that trigger the dispense.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("The procedure that trigger the dispense.")
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("statusReasonCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept statusReasonCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("statusReasonReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference statusReasonReference;
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
     * Additional information that supports the medication being dispensed.
     * 
     */
    @JsonProperty("supportingInformation")
    @JsonPropertyDescription("Additional information that supports the medication being dispensed.")
    private List<Reference> supportingInformation = new ArrayList<Reference>();
    /**
     * Indicates who or what performed the event.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Indicates who or what performed the event.")
    private List<MedicationDispense_Performer> performer = new ArrayList<MedicationDispense_Performer>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * Indicates the medication order that is being dispensed against.
     * 
     */
    @JsonProperty("authorizingPrescription")
    @JsonPropertyDescription("Indicates the medication order that is being dispensed against.")
    private List<Reference> authorizingPrescription = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("daysSupply")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity daysSupply;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("whenPrepared")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String whenPrepared;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_whenPrepared")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _whenPrepared;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("whenHandedOver")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String whenHandedOver;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_whenHandedOver")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _whenHandedOver;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference destination;
    /**
     * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.
     * 
     */
    @JsonProperty("receiver")
    @JsonPropertyDescription("Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.")
    private List<Reference> receiver = new ArrayList<Reference>();
    /**
     * Extra information about the dispense that could not be conveyed in the other attributes.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Extra information about the dispense that could not be conveyed in the other attributes.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Indicates how the medication is to be used by the patient.
     * 
     */
    @JsonProperty("dosageInstruction")
    @JsonPropertyDescription("Indicates how the medication is to be used by the patient.")
    private List<Dosage> dosageInstruction = new ArrayList<Dosage>();
    /**
     * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
     * 
     */
    @JsonProperty("substitution")
    @JsonPropertyDescription("Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.")
    private MedicationDispense_Substitution substitution;
    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. drug-drug interaction, duplicate therapy, dosage alert etc.
     * 
     */
    @JsonProperty("detectedIssue")
    @JsonPropertyDescription("Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. drug-drug interaction, duplicate therapy, dosage alert etc.")
    private List<Reference> detectedIssue = new ArrayList<Reference>();
    /**
     * A summary of the events of interest that have occurred, such as when the dispense was verified.
     * 
     */
    @JsonProperty("eventHistory")
    @JsonPropertyDescription("A summary of the events of interest that have occurred, such as when the dispense was verified.")
    private List<Reference> eventHistory = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicationDispense resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicationDispense resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers associated with this Medication Dispense that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers associated with this Medication Dispense that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The procedure that trigger the dispense.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * The procedure that trigger the dispense.
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("statusReasonCodeableConcept")
    public CodeableConcept getStatusReasonCodeableConcept() {
        return statusReasonCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("statusReasonCodeableConcept")
    public void setStatusReasonCodeableConcept(CodeableConcept statusReasonCodeableConcept) {
        this.statusReasonCodeableConcept = statusReasonCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("statusReasonReference")
    public Reference getStatusReasonReference() {
        return statusReasonReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("statusReasonReference")
    public void setStatusReasonReference(Reference statusReasonReference) {
        this.statusReasonReference = statusReasonReference;
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
     * Additional information that supports the medication being dispensed.
     * 
     */
    @JsonProperty("supportingInformation")
    public List<Reference> getSupportingInformation() {
        return supportingInformation;
    }

    /**
     * Additional information that supports the medication being dispensed.
     * 
     */
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(List<Reference> supportingInformation) {
        this.supportingInformation = supportingInformation;
    }

    /**
     * Indicates who or what performed the event.
     * 
     */
    @JsonProperty("performer")
    public List<MedicationDispense_Performer> getPerformer() {
        return performer;
    }

    /**
     * Indicates who or what performed the event.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<MedicationDispense_Performer> performer) {
        this.performer = performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public Reference getLocation() {
        return location;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public void setLocation(Reference location) {
        this.location = location;
    }

    /**
     * Indicates the medication order that is being dispensed against.
     * 
     */
    @JsonProperty("authorizingPrescription")
    public List<Reference> getAuthorizingPrescription() {
        return authorizingPrescription;
    }

    /**
     * Indicates the medication order that is being dispensed against.
     * 
     */
    @JsonProperty("authorizingPrescription")
    public void setAuthorizingPrescription(List<Reference> authorizingPrescription) {
        this.authorizingPrescription = authorizingPrescription;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("daysSupply")
    public Quantity getDaysSupply() {
        return daysSupply;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("daysSupply")
    public void setDaysSupply(Quantity daysSupply) {
        this.daysSupply = daysSupply;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("whenPrepared")
    public String getWhenPrepared() {
        return whenPrepared;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("whenPrepared")
    public void setWhenPrepared(String whenPrepared) {
        this.whenPrepared = whenPrepared;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_whenPrepared")
    public Element get_whenPrepared() {
        return _whenPrepared;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_whenPrepared")
    public void set_whenPrepared(Element _whenPrepared) {
        this._whenPrepared = _whenPrepared;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("whenHandedOver")
    public String getWhenHandedOver() {
        return whenHandedOver;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("whenHandedOver")
    public void setWhenHandedOver(String whenHandedOver) {
        this.whenHandedOver = whenHandedOver;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_whenHandedOver")
    public Element get_whenHandedOver() {
        return _whenHandedOver;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_whenHandedOver")
    public void set_whenHandedOver(Element _whenHandedOver) {
        this._whenHandedOver = _whenHandedOver;
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
     * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.
     * 
     */
    @JsonProperty("receiver")
    public List<Reference> getReceiver() {
        return receiver;
    }

    /**
     * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.
     * 
     */
    @JsonProperty("receiver")
    public void setReceiver(List<Reference> receiver) {
        this.receiver = receiver;
    }

    /**
     * Extra information about the dispense that could not be conveyed in the other attributes.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Extra information about the dispense that could not be conveyed in the other attributes.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Indicates how the medication is to be used by the patient.
     * 
     */
    @JsonProperty("dosageInstruction")
    public List<Dosage> getDosageInstruction() {
        return dosageInstruction;
    }

    /**
     * Indicates how the medication is to be used by the patient.
     * 
     */
    @JsonProperty("dosageInstruction")
    public void setDosageInstruction(List<Dosage> dosageInstruction) {
        this.dosageInstruction = dosageInstruction;
    }

    /**
     * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
     * 
     */
    @JsonProperty("substitution")
    public MedicationDispense_Substitution getSubstitution() {
        return substitution;
    }

    /**
     * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
     * 
     */
    @JsonProperty("substitution")
    public void setSubstitution(MedicationDispense_Substitution substitution) {
        this.substitution = substitution;
    }

    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. drug-drug interaction, duplicate therapy, dosage alert etc.
     * 
     */
    @JsonProperty("detectedIssue")
    public List<Reference> getDetectedIssue() {
        return detectedIssue;
    }

    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. drug-drug interaction, duplicate therapy, dosage alert etc.
     * 
     */
    @JsonProperty("detectedIssue")
    public void setDetectedIssue(List<Reference> detectedIssue) {
        this.detectedIssue = detectedIssue;
    }

    /**
     * A summary of the events of interest that have occurred, such as when the dispense was verified.
     * 
     */
    @JsonProperty("eventHistory")
    public List<Reference> getEventHistory() {
        return eventHistory;
    }

    /**
     * A summary of the events of interest that have occurred, such as when the dispense was verified.
     * 
     */
    @JsonProperty("eventHistory")
    public void setEventHistory(List<Reference> eventHistory) {
        this.eventHistory = eventHistory;
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
        sb.append(MedicationDispense.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("statusReasonCodeableConcept");
        sb.append('=');
        sb.append(((this.statusReasonCodeableConcept == null)?"<null>":this.statusReasonCodeableConcept));
        sb.append(',');
        sb.append("statusReasonReference");
        sb.append('=');
        sb.append(((this.statusReasonReference == null)?"<null>":this.statusReasonReference));
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
        sb.append("supportingInformation");
        sb.append('=');
        sb.append(((this.supportingInformation == null)?"<null>":this.supportingInformation));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("authorizingPrescription");
        sb.append('=');
        sb.append(((this.authorizingPrescription == null)?"<null>":this.authorizingPrescription));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("daysSupply");
        sb.append('=');
        sb.append(((this.daysSupply == null)?"<null>":this.daysSupply));
        sb.append(',');
        sb.append("whenPrepared");
        sb.append('=');
        sb.append(((this.whenPrepared == null)?"<null>":this.whenPrepared));
        sb.append(',');
        sb.append("_whenPrepared");
        sb.append('=');
        sb.append(((this._whenPrepared == null)?"<null>":this._whenPrepared));
        sb.append(',');
        sb.append("whenHandedOver");
        sb.append('=');
        sb.append(((this.whenHandedOver == null)?"<null>":this.whenHandedOver));
        sb.append(',');
        sb.append("_whenHandedOver");
        sb.append('=');
        sb.append(((this._whenHandedOver == null)?"<null>":this._whenHandedOver));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("receiver");
        sb.append('=');
        sb.append(((this.receiver == null)?"<null>":this.receiver));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("dosageInstruction");
        sb.append('=');
        sb.append(((this.dosageInstruction == null)?"<null>":this.dosageInstruction));
        sb.append(',');
        sb.append("substitution");
        sb.append('=');
        sb.append(((this.substitution == null)?"<null>":this.substitution));
        sb.append(',');
        sb.append("detectedIssue");
        sb.append('=');
        sb.append(((this.detectedIssue == null)?"<null>":this.detectedIssue));
        sb.append(',');
        sb.append("eventHistory");
        sb.append('=');
        sb.append(((this.eventHistory == null)?"<null>":this.eventHistory));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.substitution == null)? 0 :this.substitution.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.statusReasonReference == null)? 0 :this.statusReasonReference.hashCode()));
        result = ((result* 31)+((this.statusReasonCodeableConcept == null)? 0 :this.statusReasonCodeableConcept.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.medicationReference == null)? 0 :this.medicationReference.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this._whenHandedOver == null)? 0 :this._whenHandedOver.hashCode()));
        result = ((result* 31)+((this.authorizingPrescription == null)? 0 :this.authorizingPrescription.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.whenPrepared == null)? 0 :this.whenPrepared.hashCode()));
        result = ((result* 31)+((this.receiver == null)? 0 :this.receiver.hashCode()));
        result = ((result* 31)+((this.detectedIssue == null)? 0 :this.detectedIssue.hashCode()));
        result = ((result* 31)+((this._whenPrepared == null)? 0 :this._whenPrepared.hashCode()));
        result = ((result* 31)+((this.daysSupply == null)? 0 :this.daysSupply.hashCode()));
        result = ((result* 31)+((this.supportingInformation == null)? 0 :this.supportingInformation.hashCode()));
        result = ((result* 31)+((this.whenHandedOver == null)? 0 :this.whenHandedOver.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.medicationCodeableConcept == null)? 0 :this.medicationCodeableConcept.hashCode()));
        result = ((result* 31)+((this.dosageInstruction == null)? 0 :this.dosageInstruction.hashCode()));
        result = ((result* 31)+((this.eventHistory == null)? 0 :this.eventHistory.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
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
        if ((other instanceof MedicationDispense) == false) {
            return false;
        }
        MedicationDispense rhs = ((MedicationDispense) other);
        return (((((((((((((((((((((((((((((((super.equals(rhs)&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.substitution == rhs.substitution)||((this.substitution!= null)&&this.substitution.equals(rhs.substitution))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.statusReasonReference == rhs.statusReasonReference)||((this.statusReasonReference!= null)&&this.statusReasonReference.equals(rhs.statusReasonReference))))&&((this.statusReasonCodeableConcept == rhs.statusReasonCodeableConcept)||((this.statusReasonCodeableConcept!= null)&&this.statusReasonCodeableConcept.equals(rhs.statusReasonCodeableConcept))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.medicationReference == rhs.medicationReference)||((this.medicationReference!= null)&&this.medicationReference.equals(rhs.medicationReference))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this._whenHandedOver == rhs._whenHandedOver)||((this._whenHandedOver!= null)&&this._whenHandedOver.equals(rhs._whenHandedOver))))&&((this.authorizingPrescription == rhs.authorizingPrescription)||((this.authorizingPrescription!= null)&&this.authorizingPrescription.equals(rhs.authorizingPrescription))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.whenPrepared == rhs.whenPrepared)||((this.whenPrepared!= null)&&this.whenPrepared.equals(rhs.whenPrepared))))&&((this.receiver == rhs.receiver)||((this.receiver!= null)&&this.receiver.equals(rhs.receiver))))&&((this.detectedIssue == rhs.detectedIssue)||((this.detectedIssue!= null)&&this.detectedIssue.equals(rhs.detectedIssue))))&&((this._whenPrepared == rhs._whenPrepared)||((this._whenPrepared!= null)&&this._whenPrepared.equals(rhs._whenPrepared))))&&((this.daysSupply == rhs.daysSupply)||((this.daysSupply!= null)&&this.daysSupply.equals(rhs.daysSupply))))&&((this.supportingInformation == rhs.supportingInformation)||((this.supportingInformation!= null)&&this.supportingInformation.equals(rhs.supportingInformation))))&&((this.whenHandedOver == rhs.whenHandedOver)||((this.whenHandedOver!= null)&&this.whenHandedOver.equals(rhs.whenHandedOver))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.medicationCodeableConcept == rhs.medicationCodeableConcept)||((this.medicationCodeableConcept!= null)&&this.medicationCodeableConcept.equals(rhs.medicationCodeableConcept))))&&((this.dosageInstruction == rhs.dosageInstruction)||((this.dosageInstruction!= null)&&this.dosageInstruction.equals(rhs.dosageInstruction))))&&((this.eventHistory == rhs.eventHistory)||((this.eventHistory!= null)&&this.eventHistory.equals(rhs.eventHistory))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
