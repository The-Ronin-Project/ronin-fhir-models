
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
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called &quot;ClinicalImpression&quot; rather than &quot;ClinicalAssessment&quot; to avoid confusion with the recording of assessment tools such as Apgar score.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "statusReason",
    "code",
    "description",
    "_description",
    "subject",
    "encounter",
    "effectiveDateTime",
    "_effectiveDateTime",
    "effectivePeriod",
    "date",
    "_date",
    "assessor",
    "previous",
    "problem",
    "investigation",
    "protocol",
    "_protocol",
    "summary",
    "_summary",
    "finding",
    "prognosisCodeableConcept",
    "prognosisReference",
    "supportingInfo",
    "note"
})
@Generated("jsonschema2pojo")
public class ClinicalImpression
    extends DomainResource
{

    /**
     * This is a ClinicalImpression resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ClinicalImpression resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this clinical impression by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this clinical impression by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
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
    @JsonProperty("statusReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept statusReason;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
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
     * The point in time or period over which the subject was assessed.
     * 
     */
    @JsonProperty("effectiveDateTime")
    @JsonPropertyDescription("The point in time or period over which the subject was assessed.")
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("assessor")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference assessor;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("previous")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference previous;
    /**
     * A list of the relevant problems/conditions for a patient.
     * 
     */
    @JsonProperty("problem")
    @JsonPropertyDescription("A list of the relevant problems/conditions for a patient.")
    private List<Reference> problem = new ArrayList<Reference>();
    /**
     * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
     * 
     */
    @JsonProperty("investigation")
    @JsonPropertyDescription("One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.")
    private List<ClinicalImpression_Investigation> investigation = new ArrayList<ClinicalImpression_Investigation>();
    /**
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     * 
     */
    @JsonProperty("protocol")
    @JsonPropertyDescription("Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.")
    private List<String> protocol = new ArrayList<String>();
    /**
     * Extensions for protocol
     * 
     */
    @JsonProperty("_protocol")
    @JsonPropertyDescription("Extensions for protocol")
    private List<Element> _protocol = new ArrayList<Element>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String summary;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_summary")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _summary;
    /**
     * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
     * 
     */
    @JsonProperty("finding")
    @JsonPropertyDescription("Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.")
    private List<ClinicalImpression_Finding> finding = new ArrayList<ClinicalImpression_Finding>();
    /**
     * Estimate of likely outcome.
     * 
     */
    @JsonProperty("prognosisCodeableConcept")
    @JsonPropertyDescription("Estimate of likely outcome.")
    private List<CodeableConcept> prognosisCodeableConcept = new ArrayList<CodeableConcept>();
    /**
     * RiskAssessment expressing likely outcome.
     * 
     */
    @JsonProperty("prognosisReference")
    @JsonPropertyDescription("RiskAssessment expressing likely outcome.")
    private List<Reference> prognosisReference = new ArrayList<Reference>();
    /**
     * Information supporting the clinical impression.
     * 
     */
    @JsonProperty("supportingInfo")
    @JsonPropertyDescription("Information supporting the clinical impression.")
    private List<Reference> supportingInfo = new ArrayList<Reference>();
    /**
     * Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ClinicalImpression resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ClinicalImpression resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this clinical impression by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this clinical impression by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
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
    @JsonProperty("statusReason")
    public CodeableConcept getStatusReason() {
        return statusReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(CodeableConcept statusReason) {
        this.statusReason = statusReason;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
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
     * The point in time or period over which the subject was assessed.
     * 
     */
    @JsonProperty("effectiveDateTime")
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * The point in time or period over which the subject was assessed.
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("assessor")
    public Reference getAssessor() {
        return assessor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("assessor")
    public void setAssessor(Reference assessor) {
        this.assessor = assessor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("previous")
    public Reference getPrevious() {
        return previous;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("previous")
    public void setPrevious(Reference previous) {
        this.previous = previous;
    }

    /**
     * A list of the relevant problems/conditions for a patient.
     * 
     */
    @JsonProperty("problem")
    public List<Reference> getProblem() {
        return problem;
    }

    /**
     * A list of the relevant problems/conditions for a patient.
     * 
     */
    @JsonProperty("problem")
    public void setProblem(List<Reference> problem) {
        this.problem = problem;
    }

    /**
     * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
     * 
     */
    @JsonProperty("investigation")
    public List<ClinicalImpression_Investigation> getInvestigation() {
        return investigation;
    }

    /**
     * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
     * 
     */
    @JsonProperty("investigation")
    public void setInvestigation(List<ClinicalImpression_Investigation> investigation) {
        this.investigation = investigation;
    }

    /**
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     * 
     */
    @JsonProperty("protocol")
    public List<String> getProtocol() {
        return protocol;
    }

    /**
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     * 
     */
    @JsonProperty("protocol")
    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    /**
     * Extensions for protocol
     * 
     */
    @JsonProperty("_protocol")
    public List<Element> get_protocol() {
        return _protocol;
    }

    /**
     * Extensions for protocol
     * 
     */
    @JsonProperty("_protocol")
    public void set_protocol(List<Element> _protocol) {
        this._protocol = _protocol;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_summary")
    public Element get_summary() {
        return _summary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_summary")
    public void set_summary(Element _summary) {
        this._summary = _summary;
    }

    /**
     * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
     * 
     */
    @JsonProperty("finding")
    public List<ClinicalImpression_Finding> getFinding() {
        return finding;
    }

    /**
     * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
     * 
     */
    @JsonProperty("finding")
    public void setFinding(List<ClinicalImpression_Finding> finding) {
        this.finding = finding;
    }

    /**
     * Estimate of likely outcome.
     * 
     */
    @JsonProperty("prognosisCodeableConcept")
    public List<CodeableConcept> getPrognosisCodeableConcept() {
        return prognosisCodeableConcept;
    }

    /**
     * Estimate of likely outcome.
     * 
     */
    @JsonProperty("prognosisCodeableConcept")
    public void setPrognosisCodeableConcept(List<CodeableConcept> prognosisCodeableConcept) {
        this.prognosisCodeableConcept = prognosisCodeableConcept;
    }

    /**
     * RiskAssessment expressing likely outcome.
     * 
     */
    @JsonProperty("prognosisReference")
    public List<Reference> getPrognosisReference() {
        return prognosisReference;
    }

    /**
     * RiskAssessment expressing likely outcome.
     * 
     */
    @JsonProperty("prognosisReference")
    public void setPrognosisReference(List<Reference> prognosisReference) {
        this.prognosisReference = prognosisReference;
    }

    /**
     * Information supporting the clinical impression.
     * 
     */
    @JsonProperty("supportingInfo")
    public List<Reference> getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Information supporting the clinical impression.
     * 
     */
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(List<Reference> supportingInfo) {
        this.supportingInfo = supportingInfo;
    }

    /**
     * Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
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
        sb.append(ClinicalImpression.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
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
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("assessor");
        sb.append('=');
        sb.append(((this.assessor == null)?"<null>":this.assessor));
        sb.append(',');
        sb.append("previous");
        sb.append('=');
        sb.append(((this.previous == null)?"<null>":this.previous));
        sb.append(',');
        sb.append("problem");
        sb.append('=');
        sb.append(((this.problem == null)?"<null>":this.problem));
        sb.append(',');
        sb.append("investigation");
        sb.append('=');
        sb.append(((this.investigation == null)?"<null>":this.investigation));
        sb.append(',');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null)?"<null>":this.protocol));
        sb.append(',');
        sb.append("_protocol");
        sb.append('=');
        sb.append(((this._protocol == null)?"<null>":this._protocol));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("_summary");
        sb.append('=');
        sb.append(((this._summary == null)?"<null>":this._summary));
        sb.append(',');
        sb.append("finding");
        sb.append('=');
        sb.append(((this.finding == null)?"<null>":this.finding));
        sb.append(',');
        sb.append("prognosisCodeableConcept");
        sb.append('=');
        sb.append(((this.prognosisCodeableConcept == null)?"<null>":this.prognosisCodeableConcept));
        sb.append(',');
        sb.append("prognosisReference");
        sb.append('=');
        sb.append(((this.prognosisReference == null)?"<null>":this.prognosisReference));
        sb.append(',');
        sb.append("supportingInfo");
        sb.append('=');
        sb.append(((this.supportingInfo == null)?"<null>":this.supportingInfo));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.assessor == null)? 0 :this.assessor.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.prognosisReference == null)? 0 :this.prognosisReference.hashCode()));
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.problem == null)? 0 :this.problem.hashCode()));
        result = ((result* 31)+((this.supportingInfo == null)? 0 :this.supportingInfo.hashCode()));
        result = ((result* 31)+((this._protocol == null)? 0 :this._protocol.hashCode()));
        result = ((result* 31)+((this._effectiveDateTime == null)? 0 :this._effectiveDateTime.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.previous == null)? 0 :this.previous.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.finding == null)? 0 :this.finding.hashCode()));
        result = ((result* 31)+((this.prognosisCodeableConcept == null)? 0 :this.prognosisCodeableConcept.hashCode()));
        result = ((result* 31)+((this._summary == null)? 0 :this._summary.hashCode()));
        result = ((result* 31)+((this.effectiveDateTime == null)? 0 :this.effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.investigation == null)? 0 :this.investigation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof ClinicalImpression) == false) {
            return false;
        }
        ClinicalImpression rhs = ((ClinicalImpression) other);
        return (((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.assessor == rhs.assessor)||((this.assessor!= null)&&this.assessor.equals(rhs.assessor))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.prognosisReference == rhs.prognosisReference)||((this.prognosisReference!= null)&&this.prognosisReference.equals(rhs.prognosisReference))))&&((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.problem == rhs.problem)||((this.problem!= null)&&this.problem.equals(rhs.problem))))&&((this.supportingInfo == rhs.supportingInfo)||((this.supportingInfo!= null)&&this.supportingInfo.equals(rhs.supportingInfo))))&&((this._protocol == rhs._protocol)||((this._protocol!= null)&&this._protocol.equals(rhs._protocol))))&&((this._effectiveDateTime == rhs._effectiveDateTime)||((this._effectiveDateTime!= null)&&this._effectiveDateTime.equals(rhs._effectiveDateTime))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.previous == rhs.previous)||((this.previous!= null)&&this.previous.equals(rhs.previous))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.finding == rhs.finding)||((this.finding!= null)&&this.finding.equals(rhs.finding))))&&((this.prognosisCodeableConcept == rhs.prognosisCodeableConcept)||((this.prognosisCodeableConcept!= null)&&this.prognosisCodeableConcept.equals(rhs.prognosisCodeableConcept))))&&((this._summary == rhs._summary)||((this._summary!= null)&&this._summary.equals(rhs._summary))))&&((this.effectiveDateTime == rhs.effectiveDateTime)||((this.effectiveDateTime!= null)&&this.effectiveDateTime.equals(rhs.effectiveDateTime))))&&((this.investigation == rhs.investigation)||((this.investigation!= null)&&this.investigation.equals(rhs.investigation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
