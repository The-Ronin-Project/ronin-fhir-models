
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
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "clinicalStatus",
    "verificationStatus",
    "category",
    "severity",
    "code",
    "bodySite",
    "subject",
    "encounter",
    "onsetDateTime",
    "_onsetDateTime",
    "onsetAge",
    "onsetPeriod",
    "onsetRange",
    "onsetString",
    "_onsetString",
    "abatementDateTime",
    "_abatementDateTime",
    "abatementAge",
    "abatementPeriod",
    "abatementRange",
    "abatementString",
    "_abatementString",
    "recordedDate",
    "_recordedDate",
    "recorder",
    "asserter",
    "stage",
    "evidence",
    "note"
})
@Generated("jsonschema2pojo")
public class Condition
    extends DomainResource
{

    /**
     * This is a Condition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Condition resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("clinicalStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept clinicalStatus;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("verificationStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept verificationStatus;
    /**
     * A category assigned to the condition.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A category assigned to the condition.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
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
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * The anatomical location where this condition manifests itself.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("The anatomical location where this condition manifests itself.")
    private List<CodeableConcept> bodySite = new ArrayList<CodeableConcept>();
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
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     * 
     */
    @JsonProperty("onsetDateTime")
    @JsonPropertyDescription("Estimated or actual date or date-time  the condition began, in the opinion of the clinician.")
    private String onsetDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _onsetDateTime;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("onsetAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age onsetAge;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("onsetPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period onsetPeriod;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("onsetRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range onsetRange;
    /**
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     * 
     */
    @JsonProperty("onsetString")
    @JsonPropertyDescription("Estimated or actual date or date-time  the condition began, in the opinion of the clinician.")
    private String onsetString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _onsetString;
    /**
     * The date or estimated date that the condition resolved or went into remission. This is called &quot;abatement&quot; because of the many overloaded connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions are never really resolved, but they can abate.
     * 
     */
    @JsonProperty("abatementDateTime")
    @JsonPropertyDescription("The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate.")
    private String abatementDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abatementDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _abatementDateTime;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("abatementAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age abatementAge;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("abatementPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period abatementPeriod;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("abatementRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range abatementRange;
    /**
     * The date or estimated date that the condition resolved or went into remission. This is called &quot;abatement&quot; because of the many overloaded connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions are never really resolved, but they can abate.
     * 
     */
    @JsonProperty("abatementString")
    @JsonPropertyDescription("The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate.")
    private String abatementString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abatementString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _abatementString;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("recorder")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference recorder;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("asserter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference asserter;
    /**
     * Clinical stage or grade of a condition. May include formal severity assessments.
     * 
     */
    @JsonProperty("stage")
    @JsonPropertyDescription("Clinical stage or grade of a condition. May include formal severity assessments.")
    private List<Condition_Stage> stage = new ArrayList<Condition_Stage>();
    /**
     * Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.
     * 
     */
    @JsonProperty("evidence")
    @JsonPropertyDescription("Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.")
    private List<Condition_Evidence> evidence = new ArrayList<Condition_Evidence>();
    /**
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Condition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Condition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("clinicalStatus")
    public CodeableConcept getClinicalStatus() {
        return clinicalStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("clinicalStatus")
    public void setClinicalStatus(CodeableConcept clinicalStatus) {
        this.clinicalStatus = clinicalStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("verificationStatus")
    public CodeableConcept getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("verificationStatus")
    public void setVerificationStatus(CodeableConcept verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * A category assigned to the condition.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A category assigned to the condition.
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
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    /**
     * The anatomical location where this condition manifests itself.
     * 
     */
    @JsonProperty("bodySite")
    public List<CodeableConcept> getBodySite() {
        return bodySite;
    }

    /**
     * The anatomical location where this condition manifests itself.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(List<CodeableConcept> bodySite) {
        this.bodySite = bodySite;
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
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     * 
     */
    @JsonProperty("onsetDateTime")
    public String getOnsetDateTime() {
        return onsetDateTime;
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     * 
     */
    @JsonProperty("onsetDateTime")
    public void setOnsetDateTime(String onsetDateTime) {
        this.onsetDateTime = onsetDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetDateTime")
    public Element get_onsetDateTime() {
        return _onsetDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetDateTime")
    public void set_onsetDateTime(Element _onsetDateTime) {
        this._onsetDateTime = _onsetDateTime;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("onsetAge")
    public Age getOnsetAge() {
        return onsetAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("onsetAge")
    public void setOnsetAge(Age onsetAge) {
        this.onsetAge = onsetAge;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("onsetPeriod")
    public Period getOnsetPeriod() {
        return onsetPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("onsetPeriod")
    public void setOnsetPeriod(Period onsetPeriod) {
        this.onsetPeriod = onsetPeriod;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("onsetRange")
    public Range getOnsetRange() {
        return onsetRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("onsetRange")
    public void setOnsetRange(Range onsetRange) {
        this.onsetRange = onsetRange;
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     * 
     */
    @JsonProperty("onsetString")
    public String getOnsetString() {
        return onsetString;
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     * 
     */
    @JsonProperty("onsetString")
    public void setOnsetString(String onsetString) {
        this.onsetString = onsetString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetString")
    public Element get_onsetString() {
        return _onsetString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetString")
    public void set_onsetString(Element _onsetString) {
        this._onsetString = _onsetString;
    }

    /**
     * The date or estimated date that the condition resolved or went into remission. This is called &quot;abatement&quot; because of the many overloaded connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions are never really resolved, but they can abate.
     * 
     */
    @JsonProperty("abatementDateTime")
    public String getAbatementDateTime() {
        return abatementDateTime;
    }

    /**
     * The date or estimated date that the condition resolved or went into remission. This is called &quot;abatement&quot; because of the many overloaded connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions are never really resolved, but they can abate.
     * 
     */
    @JsonProperty("abatementDateTime")
    public void setAbatementDateTime(String abatementDateTime) {
        this.abatementDateTime = abatementDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abatementDateTime")
    public Element get_abatementDateTime() {
        return _abatementDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abatementDateTime")
    public void set_abatementDateTime(Element _abatementDateTime) {
        this._abatementDateTime = _abatementDateTime;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("abatementAge")
    public Age getAbatementAge() {
        return abatementAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("abatementAge")
    public void setAbatementAge(Age abatementAge) {
        this.abatementAge = abatementAge;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("abatementPeriod")
    public Period getAbatementPeriod() {
        return abatementPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("abatementPeriod")
    public void setAbatementPeriod(Period abatementPeriod) {
        this.abatementPeriod = abatementPeriod;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("abatementRange")
    public Range getAbatementRange() {
        return abatementRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("abatementRange")
    public void setAbatementRange(Range abatementRange) {
        this.abatementRange = abatementRange;
    }

    /**
     * The date or estimated date that the condition resolved or went into remission. This is called &quot;abatement&quot; because of the many overloaded connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions are never really resolved, but they can abate.
     * 
     */
    @JsonProperty("abatementString")
    public String getAbatementString() {
        return abatementString;
    }

    /**
     * The date or estimated date that the condition resolved or went into remission. This is called &quot;abatement&quot; because of the many overloaded connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions are never really resolved, but they can abate.
     * 
     */
    @JsonProperty("abatementString")
    public void setAbatementString(String abatementString) {
        this.abatementString = abatementString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abatementString")
    public Element get_abatementString() {
        return _abatementString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abatementString")
    public void set_abatementString(Element _abatementString) {
        this._abatementString = _abatementString;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("asserter")
    public Reference getAsserter() {
        return asserter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("asserter")
    public void setAsserter(Reference asserter) {
        this.asserter = asserter;
    }

    /**
     * Clinical stage or grade of a condition. May include formal severity assessments.
     * 
     */
    @JsonProperty("stage")
    public List<Condition_Stage> getStage() {
        return stage;
    }

    /**
     * Clinical stage or grade of a condition. May include formal severity assessments.
     * 
     */
    @JsonProperty("stage")
    public void setStage(List<Condition_Stage> stage) {
        this.stage = stage;
    }

    /**
     * Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.
     * 
     */
    @JsonProperty("evidence")
    public List<Condition_Evidence> getEvidence() {
        return evidence;
    }

    /**
     * Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.
     * 
     */
    @JsonProperty("evidence")
    public void setEvidence(List<Condition_Evidence> evidence) {
        this.evidence = evidence;
    }

    /**
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
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
        sb.append(Condition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("clinicalStatus");
        sb.append('=');
        sb.append(((this.clinicalStatus == null)?"<null>":this.clinicalStatus));
        sb.append(',');
        sb.append("verificationStatus");
        sb.append('=');
        sb.append(((this.verificationStatus == null)?"<null>":this.verificationStatus));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("onsetDateTime");
        sb.append('=');
        sb.append(((this.onsetDateTime == null)?"<null>":this.onsetDateTime));
        sb.append(',');
        sb.append("_onsetDateTime");
        sb.append('=');
        sb.append(((this._onsetDateTime == null)?"<null>":this._onsetDateTime));
        sb.append(',');
        sb.append("onsetAge");
        sb.append('=');
        sb.append(((this.onsetAge == null)?"<null>":this.onsetAge));
        sb.append(',');
        sb.append("onsetPeriod");
        sb.append('=');
        sb.append(((this.onsetPeriod == null)?"<null>":this.onsetPeriod));
        sb.append(',');
        sb.append("onsetRange");
        sb.append('=');
        sb.append(((this.onsetRange == null)?"<null>":this.onsetRange));
        sb.append(',');
        sb.append("onsetString");
        sb.append('=');
        sb.append(((this.onsetString == null)?"<null>":this.onsetString));
        sb.append(',');
        sb.append("_onsetString");
        sb.append('=');
        sb.append(((this._onsetString == null)?"<null>":this._onsetString));
        sb.append(',');
        sb.append("abatementDateTime");
        sb.append('=');
        sb.append(((this.abatementDateTime == null)?"<null>":this.abatementDateTime));
        sb.append(',');
        sb.append("_abatementDateTime");
        sb.append('=');
        sb.append(((this._abatementDateTime == null)?"<null>":this._abatementDateTime));
        sb.append(',');
        sb.append("abatementAge");
        sb.append('=');
        sb.append(((this.abatementAge == null)?"<null>":this.abatementAge));
        sb.append(',');
        sb.append("abatementPeriod");
        sb.append('=');
        sb.append(((this.abatementPeriod == null)?"<null>":this.abatementPeriod));
        sb.append(',');
        sb.append("abatementRange");
        sb.append('=');
        sb.append(((this.abatementRange == null)?"<null>":this.abatementRange));
        sb.append(',');
        sb.append("abatementString");
        sb.append('=');
        sb.append(((this.abatementString == null)?"<null>":this.abatementString));
        sb.append(',');
        sb.append("_abatementString");
        sb.append('=');
        sb.append(((this._abatementString == null)?"<null>":this._abatementString));
        sb.append(',');
        sb.append("recordedDate");
        sb.append('=');
        sb.append(((this.recordedDate == null)?"<null>":this.recordedDate));
        sb.append(',');
        sb.append("_recordedDate");
        sb.append('=');
        sb.append(((this._recordedDate == null)?"<null>":this._recordedDate));
        sb.append(',');
        sb.append("recorder");
        sb.append('=');
        sb.append(((this.recorder == null)?"<null>":this.recorder));
        sb.append(',');
        sb.append("asserter");
        sb.append('=');
        sb.append(((this.asserter == null)?"<null>":this.asserter));
        sb.append(',');
        sb.append("stage");
        sb.append('=');
        sb.append(((this.stage == null)?"<null>":this.stage));
        sb.append(',');
        sb.append("evidence");
        sb.append('=');
        sb.append(((this.evidence == null)?"<null>":this.evidence));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.evidence == null)? 0 :this.evidence.hashCode()));
        result = ((result* 31)+((this.onsetRange == null)? 0 :this.onsetRange.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.abatementDateTime == null)? 0 :this.abatementDateTime.hashCode()));
        result = ((result* 31)+((this.clinicalStatus == null)? 0 :this.clinicalStatus.hashCode()));
        result = ((result* 31)+((this.onsetDateTime == null)? 0 :this.onsetDateTime.hashCode()));
        result = ((result* 31)+((this.onsetString == null)? 0 :this.onsetString.hashCode()));
        result = ((result* 31)+((this.onsetAge == null)? 0 :this.onsetAge.hashCode()));
        result = ((result* 31)+((this._onsetString == null)? 0 :this._onsetString.hashCode()));
        result = ((result* 31)+((this.abatementPeriod == null)? 0 :this.abatementPeriod.hashCode()));
        result = ((result* 31)+((this.abatementString == null)? 0 :this.abatementString.hashCode()));
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.recorder == null)? 0 :this.recorder.hashCode()));
        result = ((result* 31)+((this.onsetPeriod == null)? 0 :this.onsetPeriod.hashCode()));
        result = ((result* 31)+((this._abatementDateTime == null)? 0 :this._abatementDateTime.hashCode()));
        result = ((result* 31)+((this.verificationStatus == null)? 0 :this.verificationStatus.hashCode()));
        result = ((result* 31)+((this._recordedDate == null)? 0 :this._recordedDate.hashCode()));
        result = ((result* 31)+((this.recordedDate == null)? 0 :this.recordedDate.hashCode()));
        result = ((result* 31)+((this.abatementRange == null)? 0 :this.abatementRange.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.asserter == null)? 0 :this.asserter.hashCode()));
        result = ((result* 31)+((this.stage == null)? 0 :this.stage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.abatementAge == null)? 0 :this.abatementAge.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this._onsetDateTime == null)? 0 :this._onsetDateTime.hashCode()));
        result = ((result* 31)+((this._abatementString == null)? 0 :this._abatementString.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Condition) == false) {
            return false;
        }
        Condition rhs = ((Condition) other);
        return ((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.evidence == rhs.evidence)||((this.evidence!= null)&&this.evidence.equals(rhs.evidence))))&&((this.onsetRange == rhs.onsetRange)||((this.onsetRange!= null)&&this.onsetRange.equals(rhs.onsetRange))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.abatementDateTime == rhs.abatementDateTime)||((this.abatementDateTime!= null)&&this.abatementDateTime.equals(rhs.abatementDateTime))))&&((this.clinicalStatus == rhs.clinicalStatus)||((this.clinicalStatus!= null)&&this.clinicalStatus.equals(rhs.clinicalStatus))))&&((this.onsetDateTime == rhs.onsetDateTime)||((this.onsetDateTime!= null)&&this.onsetDateTime.equals(rhs.onsetDateTime))))&&((this.onsetString == rhs.onsetString)||((this.onsetString!= null)&&this.onsetString.equals(rhs.onsetString))))&&((this.onsetAge == rhs.onsetAge)||((this.onsetAge!= null)&&this.onsetAge.equals(rhs.onsetAge))))&&((this._onsetString == rhs._onsetString)||((this._onsetString!= null)&&this._onsetString.equals(rhs._onsetString))))&&((this.abatementPeriod == rhs.abatementPeriod)||((this.abatementPeriod!= null)&&this.abatementPeriod.equals(rhs.abatementPeriod))))&&((this.abatementString == rhs.abatementString)||((this.abatementString!= null)&&this.abatementString.equals(rhs.abatementString))))&&((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.recorder == rhs.recorder)||((this.recorder!= null)&&this.recorder.equals(rhs.recorder))))&&((this.onsetPeriod == rhs.onsetPeriod)||((this.onsetPeriod!= null)&&this.onsetPeriod.equals(rhs.onsetPeriod))))&&((this._abatementDateTime == rhs._abatementDateTime)||((this._abatementDateTime!= null)&&this._abatementDateTime.equals(rhs._abatementDateTime))))&&((this.verificationStatus == rhs.verificationStatus)||((this.verificationStatus!= null)&&this.verificationStatus.equals(rhs.verificationStatus))))&&((this._recordedDate == rhs._recordedDate)||((this._recordedDate!= null)&&this._recordedDate.equals(rhs._recordedDate))))&&((this.recordedDate == rhs.recordedDate)||((this.recordedDate!= null)&&this.recordedDate.equals(rhs.recordedDate))))&&((this.abatementRange == rhs.abatementRange)||((this.abatementRange!= null)&&this.abatementRange.equals(rhs.abatementRange))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.asserter == rhs.asserter)||((this.asserter!= null)&&this.asserter.equals(rhs.asserter))))&&((this.stage == rhs.stage)||((this.stage!= null)&&this.stage.equals(rhs.stage))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.abatementAge == rhs.abatementAge)||((this.abatementAge!= null)&&this.abatementAge.equals(rhs.abatementAge))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this._onsetDateTime == rhs._onsetDateTime)||((this._onsetDateTime!= null)&&this._onsetDateTime.equals(rhs._onsetDateTime))))&&((this._abatementString == rhs._abatementString)||((this._abatementString!= null)&&this._abatementString.equals(rhs._abatementString))));
    }

}
