
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
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "instantiates",
    "_instantiates",
    "partOf",
    "status",
    "_status",
    "statusReason",
    "category",
    "medicationCodeableConcept",
    "medicationReference",
    "subject",
    "context",
    "supportingInformation",
    "effectiveDateTime",
    "_effectiveDateTime",
    "effectivePeriod",
    "performer",
    "reasonCode",
    "reasonReference",
    "request",
    "device",
    "note",
    "dosage",
    "eventHistory"
})
@Generated("jsonschema2pojo")
public class MedicationAdministration
    extends DomainResource
{

    /**
     * This is a MedicationAdministration resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicationAdministration resource")
    private String resourceType;
    /**
     * Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.
     * 
     */
    @JsonProperty("instantiates")
    @JsonPropertyDescription("A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.")
    private List<String> instantiates = new ArrayList<String>();
    /**
     * Extensions for instantiates
     * 
     */
    @JsonProperty("_instantiates")
    @JsonPropertyDescription("Extensions for instantiates")
    private List<Element> _instantiates = new ArrayList<Element>();
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
     * A code indicating why the administration was not performed.
     * 
     */
    @JsonProperty("statusReason")
    @JsonPropertyDescription("A code indicating why the administration was not performed.")
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
     * Additional information (for example, patient height and weight) that supports the administration of the medication.
     * 
     */
    @JsonProperty("supportingInformation")
    @JsonPropertyDescription("Additional information (for example, patient height and weight) that supports the administration of the medication.")
    private List<Reference> supportingInformation = new ArrayList<Reference>();
    /**
     * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
     * 
     */
    @JsonProperty("effectiveDateTime")
    @JsonPropertyDescription("A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.")
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
     * Indicates who or what performed the medication administration and how they were involved.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Indicates who or what performed the medication administration and how they were involved.")
    private List<MedicationAdministration_Performer> performer = new ArrayList<MedicationAdministration_Performer>();
    /**
     * A code indicating why the medication was given.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("A code indicating why the medication was given.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Condition or observation that supports why the medication was administered.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Condition or observation that supports why the medication was administered.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference request;
    /**
     * The device used in administering the medication to the patient.  For example, a particular infusion pump.
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("The device used in administering the medication to the patient.  For example, a particular infusion pump.")
    private List<Reference> device = new ArrayList<Reference>();
    /**
     * Extra information about the medication administration that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Extra information about the medication administration that is not conveyed by the other attributes.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
     * 
     */
    @JsonProperty("dosage")
    @JsonPropertyDescription("Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.")
    private MedicationAdministration_Dosage dosage;
    /**
     * A summary of the events of interest that have occurred, such as when the administration was verified.
     * 
     */
    @JsonProperty("eventHistory")
    @JsonPropertyDescription("A summary of the events of interest that have occurred, such as when the administration was verified.")
    private List<Reference> eventHistory = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicationAdministration resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicationAdministration resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.
     * 
     */
    @JsonProperty("instantiates")
    public List<String> getInstantiates() {
        return instantiates;
    }

    /**
     * A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.
     * 
     */
    @JsonProperty("instantiates")
    public void setInstantiates(List<String> instantiates) {
        this.instantiates = instantiates;
    }

    /**
     * Extensions for instantiates
     * 
     */
    @JsonProperty("_instantiates")
    public List<Element> get_instantiates() {
        return _instantiates;
    }

    /**
     * Extensions for instantiates
     * 
     */
    @JsonProperty("_instantiates")
    public void set_instantiates(List<Element> _instantiates) {
        this._instantiates = _instantiates;
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
     * A code indicating why the administration was not performed.
     * 
     */
    @JsonProperty("statusReason")
    public List<CodeableConcept> getStatusReason() {
        return statusReason;
    }

    /**
     * A code indicating why the administration was not performed.
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
     * Additional information (for example, patient height and weight) that supports the administration of the medication.
     * 
     */
    @JsonProperty("supportingInformation")
    public List<Reference> getSupportingInformation() {
        return supportingInformation;
    }

    /**
     * Additional information (for example, patient height and weight) that supports the administration of the medication.
     * 
     */
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(List<Reference> supportingInformation) {
        this.supportingInformation = supportingInformation;
    }

    /**
     * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
     * 
     */
    @JsonProperty("effectiveDateTime")
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
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
     * Indicates who or what performed the medication administration and how they were involved.
     * 
     */
    @JsonProperty("performer")
    public List<MedicationAdministration_Performer> getPerformer() {
        return performer;
    }

    /**
     * Indicates who or what performed the medication administration and how they were involved.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<MedicationAdministration_Performer> performer) {
        this.performer = performer;
    }

    /**
     * A code indicating why the medication was given.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * A code indicating why the medication was given.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Condition or observation that supports why the medication was administered.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Condition or observation that supports why the medication was administered.
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
     * The device used in administering the medication to the patient.  For example, a particular infusion pump.
     * 
     */
    @JsonProperty("device")
    public List<Reference> getDevice() {
        return device;
    }

    /**
     * The device used in administering the medication to the patient.  For example, a particular infusion pump.
     * 
     */
    @JsonProperty("device")
    public void setDevice(List<Reference> device) {
        this.device = device;
    }

    /**
     * Extra information about the medication administration that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Extra information about the medication administration that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
     * 
     */
    @JsonProperty("dosage")
    public MedicationAdministration_Dosage getDosage() {
        return dosage;
    }

    /**
     * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
     * 
     */
    @JsonProperty("dosage")
    public void setDosage(MedicationAdministration_Dosage dosage) {
        this.dosage = dosage;
    }

    /**
     * A summary of the events of interest that have occurred, such as when the administration was verified.
     * 
     */
    @JsonProperty("eventHistory")
    public List<Reference> getEventHistory() {
        return eventHistory;
    }

    /**
     * A summary of the events of interest that have occurred, such as when the administration was verified.
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
        sb.append(MedicationAdministration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("instantiates");
        sb.append('=');
        sb.append(((this.instantiates == null)?"<null>":this.instantiates));
        sb.append(',');
        sb.append("_instantiates");
        sb.append('=');
        sb.append(((this._instantiates == null)?"<null>":this._instantiates));
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
        sb.append("supportingInformation");
        sb.append('=');
        sb.append(((this.supportingInformation == null)?"<null>":this.supportingInformation));
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
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("dosage");
        sb.append('=');
        sb.append(((this.dosage == null)?"<null>":this.dosage));
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
        result = ((result* 31)+((this._instantiates == null)? 0 :this._instantiates.hashCode()));
        result = ((result* 31)+((this.instantiates == null)? 0 :this.instantiates.hashCode()));
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.dosage == null)? 0 :this.dosage.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.medicationReference == null)? 0 :this.medicationReference.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this._effectiveDateTime == null)? 0 :this._effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this.supportingInformation == null)? 0 :this.supportingInformation.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.medicationCodeableConcept == null)? 0 :this.medicationCodeableConcept.hashCode()));
        result = ((result* 31)+((this.effectiveDateTime == null)? 0 :this.effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.eventHistory == null)? 0 :this.eventHistory.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
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
        if ((other instanceof MedicationAdministration) == false) {
            return false;
        }
        MedicationAdministration rhs = ((MedicationAdministration) other);
        return ((((((((((((((((((((((((((super.equals(rhs)&&((this._instantiates == rhs._instantiates)||((this._instantiates!= null)&&this._instantiates.equals(rhs._instantiates))))&&((this.instantiates == rhs.instantiates)||((this.instantiates!= null)&&this.instantiates.equals(rhs.instantiates))))&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.dosage == rhs.dosage)||((this.dosage!= null)&&this.dosage.equals(rhs.dosage))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.medicationReference == rhs.medicationReference)||((this.medicationReference!= null)&&this.medicationReference.equals(rhs.medicationReference))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this._effectiveDateTime == rhs._effectiveDateTime)||((this._effectiveDateTime!= null)&&this._effectiveDateTime.equals(rhs._effectiveDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this.supportingInformation == rhs.supportingInformation)||((this.supportingInformation!= null)&&this.supportingInformation.equals(rhs.supportingInformation))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.medicationCodeableConcept == rhs.medicationCodeableConcept)||((this.medicationCodeableConcept!= null)&&this.medicationCodeableConcept.equals(rhs.medicationCodeableConcept))))&&((this.effectiveDateTime == rhs.effectiveDateTime)||((this.effectiveDateTime!= null)&&this.effectiveDateTime.equals(rhs.effectiveDateTime))))&&((this.eventHistory == rhs.eventHistory)||((this.eventHistory!= null)&&this.eventHistory.equals(rhs.eventHistory))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
