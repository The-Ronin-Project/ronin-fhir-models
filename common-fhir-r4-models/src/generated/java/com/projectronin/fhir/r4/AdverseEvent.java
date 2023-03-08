
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
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "actuality",
    "_actuality",
    "category",
    "event",
    "subject",
    "encounter",
    "date",
    "_date",
    "detected",
    "_detected",
    "recordedDate",
    "_recordedDate",
    "resultingCondition",
    "location",
    "seriousness",
    "severity",
    "outcome",
    "recorder",
    "contributor",
    "suspectEntity",
    "subjectMedicalHistory",
    "referenceDocument",
    "study"
})
@Generated("jsonschema2pojo")
public class AdverseEvent
    extends DomainResource
{

    /**
     * This is a AdverseEvent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a AdverseEvent resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.
     * 
     */
    @JsonProperty("actuality")
    @JsonPropertyDescription("Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.")
    private AdverseEvent.Actuality actuality;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actuality")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _actuality;
    /**
     * The overall type of event, intended for search and filtering purposes.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The overall type of event, intended for search and filtering purposes.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept event;
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
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("detected")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String detected;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detected")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _detected;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recordedDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String recordedDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recordedDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _recordedDate;
    /**
     * Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
     * 
     */
    @JsonProperty("resultingCondition")
    @JsonPropertyDescription("Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).")
    private List<Reference> resultingCondition = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("seriousness")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept seriousness;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept severity;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept outcome;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recorder")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference recorder;
    /**
     * Parties that may or should contribute or have contributed information to the adverse event, which can consist of one or more activities.  Such information includes information leading to the decision to perform the activity and how to perform the activity (e.g. consultant), information that the activity itself seeks to reveal (e.g. informant of clinical history), or information about what activity was performed (e.g. informant witness).
     * 
     */
    @JsonProperty("contributor")
    @JsonPropertyDescription("Parties that may or should contribute or have contributed information to the adverse event, which can consist of one or more activities.  Such information includes information leading to the decision to perform the activity and how to perform the activity (e.g. consultant), information that the activity itself seeks to reveal (e.g. informant of clinical history), or information about what activity was performed (e.g. informant witness).")
    private List<Reference> contributor = new ArrayList<Reference>();
    /**
     * Describes the entity that is suspected to have caused the adverse event.
     * 
     */
    @JsonProperty("suspectEntity")
    @JsonPropertyDescription("Describes the entity that is suspected to have caused the adverse event.")
    private List<AdverseEvent_SuspectEntity> suspectEntity = new ArrayList<AdverseEvent_SuspectEntity>();
    /**
     * AdverseEvent.subjectMedicalHistory.
     * 
     */
    @JsonProperty("subjectMedicalHistory")
    @JsonPropertyDescription("AdverseEvent.subjectMedicalHistory.")
    private List<Reference> subjectMedicalHistory = new ArrayList<Reference>();
    /**
     * AdverseEvent.referenceDocument.
     * 
     */
    @JsonProperty("referenceDocument")
    @JsonPropertyDescription("AdverseEvent.referenceDocument.")
    private List<Reference> referenceDocument = new ArrayList<Reference>();
    /**
     * AdverseEvent.study.
     * 
     */
    @JsonProperty("study")
    @JsonPropertyDescription("AdverseEvent.study.")
    private List<Reference> study = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a AdverseEvent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a AdverseEvent resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
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
     * Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.
     * 
     */
    @JsonProperty("actuality")
    public AdverseEvent.Actuality getActuality() {
        return actuality;
    }

    /**
     * Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.
     * 
     */
    @JsonProperty("actuality")
    public void setActuality(AdverseEvent.Actuality actuality) {
        this.actuality = actuality;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actuality")
    public Element get_actuality() {
        return _actuality;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actuality")
    public void set_actuality(Element _actuality) {
        this._actuality = _actuality;
    }

    /**
     * The overall type of event, intended for search and filtering purposes.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * The overall type of event, intended for search and filtering purposes.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("event")
    public CodeableConcept getEvent() {
        return event;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("event")
    public void setEvent(CodeableConcept event) {
        this.event = event;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("detected")
    public String getDetected() {
        return detected;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("detected")
    public void setDetected(String detected) {
        this.detected = detected;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detected")
    public Element get_detected() {
        return _detected;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_detected")
    public void set_detected(Element _detected) {
        this._detected = _detected;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recordedDate")
    public String getRecordedDate() {
        return recordedDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recordedDate")
    public void setRecordedDate(String recordedDate) {
        this.recordedDate = recordedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recordedDate")
    public Element get_recordedDate() {
        return _recordedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recordedDate")
    public void set_recordedDate(Element _recordedDate) {
        this._recordedDate = _recordedDate;
    }

    /**
     * Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
     * 
     */
    @JsonProperty("resultingCondition")
    public List<Reference> getResultingCondition() {
        return resultingCondition;
    }

    /**
     * Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
     * 
     */
    @JsonProperty("resultingCondition")
    public void setResultingCondition(List<Reference> resultingCondition) {
        this.resultingCondition = resultingCondition;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("seriousness")
    public CodeableConcept getSeriousness() {
        return seriousness;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("seriousness")
    public void setSeriousness(CodeableConcept seriousness) {
        this.seriousness = seriousness;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("severity")
    public CodeableConcept getSeverity() {
        return severity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(CodeableConcept severity) {
        this.severity = severity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    public CodeableConcept getOutcome() {
        return outcome;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(CodeableConcept outcome) {
        this.outcome = outcome;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recorder")
    public Reference getRecorder() {
        return recorder;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recorder")
    public void setRecorder(Reference recorder) {
        this.recorder = recorder;
    }

    /**
     * Parties that may or should contribute or have contributed information to the adverse event, which can consist of one or more activities.  Such information includes information leading to the decision to perform the activity and how to perform the activity (e.g. consultant), information that the activity itself seeks to reveal (e.g. informant of clinical history), or information about what activity was performed (e.g. informant witness).
     * 
     */
    @JsonProperty("contributor")
    public List<Reference> getContributor() {
        return contributor;
    }

    /**
     * Parties that may or should contribute or have contributed information to the adverse event, which can consist of one or more activities.  Such information includes information leading to the decision to perform the activity and how to perform the activity (e.g. consultant), information that the activity itself seeks to reveal (e.g. informant of clinical history), or information about what activity was performed (e.g. informant witness).
     * 
     */
    @JsonProperty("contributor")
    public void setContributor(List<Reference> contributor) {
        this.contributor = contributor;
    }

    /**
     * Describes the entity that is suspected to have caused the adverse event.
     * 
     */
    @JsonProperty("suspectEntity")
    public List<AdverseEvent_SuspectEntity> getSuspectEntity() {
        return suspectEntity;
    }

    /**
     * Describes the entity that is suspected to have caused the adverse event.
     * 
     */
    @JsonProperty("suspectEntity")
    public void setSuspectEntity(List<AdverseEvent_SuspectEntity> suspectEntity) {
        this.suspectEntity = suspectEntity;
    }

    /**
     * AdverseEvent.subjectMedicalHistory.
     * 
     */
    @JsonProperty("subjectMedicalHistory")
    public List<Reference> getSubjectMedicalHistory() {
        return subjectMedicalHistory;
    }

    /**
     * AdverseEvent.subjectMedicalHistory.
     * 
     */
    @JsonProperty("subjectMedicalHistory")
    public void setSubjectMedicalHistory(List<Reference> subjectMedicalHistory) {
        this.subjectMedicalHistory = subjectMedicalHistory;
    }

    /**
     * AdverseEvent.referenceDocument.
     * 
     */
    @JsonProperty("referenceDocument")
    public List<Reference> getReferenceDocument() {
        return referenceDocument;
    }

    /**
     * AdverseEvent.referenceDocument.
     * 
     */
    @JsonProperty("referenceDocument")
    public void setReferenceDocument(List<Reference> referenceDocument) {
        this.referenceDocument = referenceDocument;
    }

    /**
     * AdverseEvent.study.
     * 
     */
    @JsonProperty("study")
    public List<Reference> getStudy() {
        return study;
    }

    /**
     * AdverseEvent.study.
     * 
     */
    @JsonProperty("study")
    public void setStudy(List<Reference> study) {
        this.study = study;
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
        sb.append(AdverseEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("actuality");
        sb.append('=');
        sb.append(((this.actuality == null)?"<null>":this.actuality));
        sb.append(',');
        sb.append("_actuality");
        sb.append('=');
        sb.append(((this._actuality == null)?"<null>":this._actuality));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("detected");
        sb.append('=');
        sb.append(((this.detected == null)?"<null>":this.detected));
        sb.append(',');
        sb.append("_detected");
        sb.append('=');
        sb.append(((this._detected == null)?"<null>":this._detected));
        sb.append(',');
        sb.append("recordedDate");
        sb.append('=');
        sb.append(((this.recordedDate == null)?"<null>":this.recordedDate));
        sb.append(',');
        sb.append("_recordedDate");
        sb.append('=');
        sb.append(((this._recordedDate == null)?"<null>":this._recordedDate));
        sb.append(',');
        sb.append("resultingCondition");
        sb.append('=');
        sb.append(((this.resultingCondition == null)?"<null>":this.resultingCondition));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("seriousness");
        sb.append('=');
        sb.append(((this.seriousness == null)?"<null>":this.seriousness));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("recorder");
        sb.append('=');
        sb.append(((this.recorder == null)?"<null>":this.recorder));
        sb.append(',');
        sb.append("contributor");
        sb.append('=');
        sb.append(((this.contributor == null)?"<null>":this.contributor));
        sb.append(',');
        sb.append("suspectEntity");
        sb.append('=');
        sb.append(((this.suspectEntity == null)?"<null>":this.suspectEntity));
        sb.append(',');
        sb.append("subjectMedicalHistory");
        sb.append('=');
        sb.append(((this.subjectMedicalHistory == null)?"<null>":this.subjectMedicalHistory));
        sb.append(',');
        sb.append("referenceDocument");
        sb.append('=');
        sb.append(((this.referenceDocument == null)?"<null>":this.referenceDocument));
        sb.append(',');
        sb.append("study");
        sb.append('=');
        sb.append(((this.study == null)?"<null>":this.study));
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
        result = ((result* 31)+((this._detected == null)? 0 :this._detected.hashCode()));
        result = ((result* 31)+((this.subjectMedicalHistory == null)? 0 :this.subjectMedicalHistory.hashCode()));
        result = ((result* 31)+((this.study == null)? 0 :this.study.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.contributor == null)? 0 :this.contributor.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.recorder == null)? 0 :this.recorder.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.actuality == null)? 0 :this.actuality.hashCode()));
        result = ((result* 31)+((this._recordedDate == null)? 0 :this._recordedDate.hashCode()));
        result = ((result* 31)+((this._actuality == null)? 0 :this._actuality.hashCode()));
        result = ((result* 31)+((this.recordedDate == null)? 0 :this.recordedDate.hashCode()));
        result = ((result* 31)+((this.referenceDocument == null)? 0 :this.referenceDocument.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.suspectEntity == null)? 0 :this.suspectEntity.hashCode()));
        result = ((result* 31)+((this.resultingCondition == null)? 0 :this.resultingCondition.hashCode()));
        result = ((result* 31)+((this.seriousness == null)? 0 :this.seriousness.hashCode()));
        result = ((result* 31)+((this.detected == null)? 0 :this.detected.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdverseEvent) == false) {
            return false;
        }
        AdverseEvent rhs = ((AdverseEvent) other);
        return ((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this._detected == rhs._detected)||((this._detected!= null)&&this._detected.equals(rhs._detected))))&&((this.subjectMedicalHistory == rhs.subjectMedicalHistory)||((this.subjectMedicalHistory!= null)&&this.subjectMedicalHistory.equals(rhs.subjectMedicalHistory))))&&((this.study == rhs.study)||((this.study!= null)&&this.study.equals(rhs.study))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.contributor == rhs.contributor)||((this.contributor!= null)&&this.contributor.equals(rhs.contributor))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.recorder == rhs.recorder)||((this.recorder!= null)&&this.recorder.equals(rhs.recorder))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.actuality == rhs.actuality)||((this.actuality!= null)&&this.actuality.equals(rhs.actuality))))&&((this._recordedDate == rhs._recordedDate)||((this._recordedDate!= null)&&this._recordedDate.equals(rhs._recordedDate))))&&((this._actuality == rhs._actuality)||((this._actuality!= null)&&this._actuality.equals(rhs._actuality))))&&((this.recordedDate == rhs.recordedDate)||((this.recordedDate!= null)&&this.recordedDate.equals(rhs.recordedDate))))&&((this.referenceDocument == rhs.referenceDocument)||((this.referenceDocument!= null)&&this.referenceDocument.equals(rhs.referenceDocument))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.suspectEntity == rhs.suspectEntity)||((this.suspectEntity!= null)&&this.suspectEntity.equals(rhs.suspectEntity))))&&((this.resultingCondition == rhs.resultingCondition)||((this.resultingCondition!= null)&&this.resultingCondition.equals(rhs.resultingCondition))))&&((this.seriousness == rhs.seriousness)||((this.seriousness!= null)&&this.seriousness.equals(rhs.seriousness))))&&((this.detected == rhs.detected)||((this.detected!= null)&&this.detected.equals(rhs.detected))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Actuality {

        ACTUAL("actual"),
        POTENTIAL("potential");
        private final String value;
        private final static Map<String, AdverseEvent.Actuality> CONSTANTS = new HashMap<String, AdverseEvent.Actuality>();

        static {
            for (AdverseEvent.Actuality c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Actuality(String value) {
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
        public static AdverseEvent.Actuality fromValue(String value) {
            AdverseEvent.Actuality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
