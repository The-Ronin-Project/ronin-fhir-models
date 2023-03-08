
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
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "basedOn",
    "status",
    "_status",
    "category",
    "code",
    "subject",
    "encounter",
    "effectiveDateTime",
    "_effectiveDateTime",
    "effectivePeriod",
    "issued",
    "_issued",
    "performer",
    "resultsInterpreter",
    "specimen",
    "result",
    "imagingStudy",
    "media",
    "conclusion",
    "_conclusion",
    "conclusionCode",
    "presentedForm"
})
@Generated("jsonschema2pojo")
public class DiagnosticReport
    extends DomainResource
{

    /**
     * This is a DiagnosticReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a DiagnosticReport resource")
    private String resourceType;
    /**
     * Identifiers assigned to this report by the performer or other systems.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers assigned to this report by the performer or other systems.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Details concerning a service requested.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("Details concerning a service requested.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * The status of the diagnostic report.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the diagnostic report.")
    private DiagnosticReport.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.")
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveDateTime")
    @JsonPropertyDescription("The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.")
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
     * The diagnostic service that is responsible for issuing the report.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("The diagnostic service that is responsible for issuing the report.")
    private List<Reference> performer = new ArrayList<Reference>();
    /**
     * The practitioner or organization that is responsible for the report's conclusions and interpretations.
     * 
     */
    @JsonProperty("resultsInterpreter")
    @JsonPropertyDescription("The practitioner or organization that is responsible for the report's conclusions and interpretations.")
    private List<Reference> resultsInterpreter = new ArrayList<Reference>();
    /**
     * Details about the specimens on which this diagnostic report is based.
     * 
     */
    @JsonProperty("specimen")
    @JsonPropertyDescription("Details about the specimens on which this diagnostic report is based.")
    private List<Reference> specimen = new ArrayList<Reference>();
    /**
     * [Observations](observation.html)  that are part of this diagnostic report.
     * 
     */
    @JsonProperty("result")
    @JsonPropertyDescription("[Observations](observation.html)  that are part of this diagnostic report.")
    private List<Reference> result = new ArrayList<Reference>();
    /**
     * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
     * 
     */
    @JsonProperty("imagingStudy")
    @JsonPropertyDescription("One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.")
    private List<Reference> imagingStudy = new ArrayList<Reference>();
    /**
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * 
     */
    @JsonProperty("media")
    @JsonPropertyDescription("A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).")
    private List<DiagnosticReport_Media> media = new ArrayList<DiagnosticReport_Media>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("conclusion")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String conclusion;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conclusion")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _conclusion;
    /**
     * One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.
     * 
     */
    @JsonProperty("conclusionCode")
    @JsonPropertyDescription("One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.")
    private List<CodeableConcept> conclusionCode = new ArrayList<CodeableConcept>();
    /**
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     * 
     */
    @JsonProperty("presentedForm")
    @JsonPropertyDescription("Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.")
    private List<Attachment> presentedForm = new ArrayList<Attachment>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a DiagnosticReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a DiagnosticReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers assigned to this report by the performer or other systems.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers assigned to this report by the performer or other systems.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Details concerning a service requested.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * Details concerning a service requested.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * The status of the diagnostic report.
     * 
     */
    @JsonProperty("status")
    public DiagnosticReport.Status getStatus() {
        return status;
    }

    /**
     * The status of the diagnostic report.
     * 
     */
    @JsonProperty("status")
    public void setStatus(DiagnosticReport.Status status) {
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
     * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
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
     * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
     * 
     */
    @JsonProperty("effectiveDateTime")
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
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
     * The diagnostic service that is responsible for issuing the report.
     * 
     */
    @JsonProperty("performer")
    public List<Reference> getPerformer() {
        return performer;
    }

    /**
     * The diagnostic service that is responsible for issuing the report.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<Reference> performer) {
        this.performer = performer;
    }

    /**
     * The practitioner or organization that is responsible for the report's conclusions and interpretations.
     * 
     */
    @JsonProperty("resultsInterpreter")
    public List<Reference> getResultsInterpreter() {
        return resultsInterpreter;
    }

    /**
     * The practitioner or organization that is responsible for the report's conclusions and interpretations.
     * 
     */
    @JsonProperty("resultsInterpreter")
    public void setResultsInterpreter(List<Reference> resultsInterpreter) {
        this.resultsInterpreter = resultsInterpreter;
    }

    /**
     * Details about the specimens on which this diagnostic report is based.
     * 
     */
    @JsonProperty("specimen")
    public List<Reference> getSpecimen() {
        return specimen;
    }

    /**
     * Details about the specimens on which this diagnostic report is based.
     * 
     */
    @JsonProperty("specimen")
    public void setSpecimen(List<Reference> specimen) {
        this.specimen = specimen;
    }

    /**
     * [Observations](observation.html)  that are part of this diagnostic report.
     * 
     */
    @JsonProperty("result")
    public List<Reference> getResult() {
        return result;
    }

    /**
     * [Observations](observation.html)  that are part of this diagnostic report.
     * 
     */
    @JsonProperty("result")
    public void setResult(List<Reference> result) {
        this.result = result;
    }

    /**
     * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
     * 
     */
    @JsonProperty("imagingStudy")
    public List<Reference> getImagingStudy() {
        return imagingStudy;
    }

    /**
     * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
     * 
     */
    @JsonProperty("imagingStudy")
    public void setImagingStudy(List<Reference> imagingStudy) {
        this.imagingStudy = imagingStudy;
    }

    /**
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * 
     */
    @JsonProperty("media")
    public List<DiagnosticReport_Media> getMedia() {
        return media;
    }

    /**
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * 
     */
    @JsonProperty("media")
    public void setMedia(List<DiagnosticReport_Media> media) {
        this.media = media;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("conclusion")
    public String getConclusion() {
        return conclusion;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("conclusion")
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conclusion")
    public Element get_conclusion() {
        return _conclusion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conclusion")
    public void set_conclusion(Element _conclusion) {
        this._conclusion = _conclusion;
    }

    /**
     * One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.
     * 
     */
    @JsonProperty("conclusionCode")
    public List<CodeableConcept> getConclusionCode() {
        return conclusionCode;
    }

    /**
     * One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.
     * 
     */
    @JsonProperty("conclusionCode")
    public void setConclusionCode(List<CodeableConcept> conclusionCode) {
        this.conclusionCode = conclusionCode;
    }

    /**
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     * 
     */
    @JsonProperty("presentedForm")
    public List<Attachment> getPresentedForm() {
        return presentedForm;
    }

    /**
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     * 
     */
    @JsonProperty("presentedForm")
    public void setPresentedForm(List<Attachment> presentedForm) {
        this.presentedForm = presentedForm;
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
        sb.append(DiagnosticReport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("resultsInterpreter");
        sb.append('=');
        sb.append(((this.resultsInterpreter == null)?"<null>":this.resultsInterpreter));
        sb.append(',');
        sb.append("specimen");
        sb.append('=');
        sb.append(((this.specimen == null)?"<null>":this.specimen));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("imagingStudy");
        sb.append('=');
        sb.append(((this.imagingStudy == null)?"<null>":this.imagingStudy));
        sb.append(',');
        sb.append("media");
        sb.append('=');
        sb.append(((this.media == null)?"<null>":this.media));
        sb.append(',');
        sb.append("conclusion");
        sb.append('=');
        sb.append(((this.conclusion == null)?"<null>":this.conclusion));
        sb.append(',');
        sb.append("_conclusion");
        sb.append('=');
        sb.append(((this._conclusion == null)?"<null>":this._conclusion));
        sb.append(',');
        sb.append("conclusionCode");
        sb.append('=');
        sb.append(((this.conclusionCode == null)?"<null>":this.conclusionCode));
        sb.append(',');
        sb.append("presentedForm");
        sb.append('=');
        sb.append(((this.presentedForm == null)?"<null>":this.presentedForm));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.presentedForm == null)? 0 :this.presentedForm.hashCode()));
        result = ((result* 31)+((this.media == null)? 0 :this.media.hashCode()));
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.conclusion == null)? 0 :this.conclusion.hashCode()));
        result = ((result* 31)+((this._conclusion == null)? 0 :this._conclusion.hashCode()));
        result = ((result* 31)+((this.specimen == null)? 0 :this.specimen.hashCode()));
        result = ((result* 31)+((this._effectiveDateTime == null)? 0 :this._effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.issued == null)? 0 :this.issued.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this.resultsInterpreter == null)? 0 :this.resultsInterpreter.hashCode()));
        result = ((result* 31)+((this.conclusionCode == null)? 0 :this.conclusionCode.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._issued == null)? 0 :this._issued.hashCode()));
        result = ((result* 31)+((this.effectiveDateTime == null)? 0 :this.effectiveDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.imagingStudy == null)? 0 :this.imagingStudy.hashCode()));
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
        if ((other instanceof DiagnosticReport) == false) {
            return false;
        }
        DiagnosticReport rhs = ((DiagnosticReport) other);
        return (((((((((((((((((((((((((super.equals(rhs)&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.presentedForm == rhs.presentedForm)||((this.presentedForm!= null)&&this.presentedForm.equals(rhs.presentedForm))))&&((this.media == rhs.media)||((this.media!= null)&&this.media.equals(rhs.media))))&&((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result))))&&((this.conclusion == rhs.conclusion)||((this.conclusion!= null)&&this.conclusion.equals(rhs.conclusion))))&&((this._conclusion == rhs._conclusion)||((this._conclusion!= null)&&this._conclusion.equals(rhs._conclusion))))&&((this.specimen == rhs.specimen)||((this.specimen!= null)&&this.specimen.equals(rhs.specimen))))&&((this._effectiveDateTime == rhs._effectiveDateTime)||((this._effectiveDateTime!= null)&&this._effectiveDateTime.equals(rhs._effectiveDateTime))))&&((this.issued == rhs.issued)||((this.issued!= null)&&this.issued.equals(rhs.issued))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this.resultsInterpreter == rhs.resultsInterpreter)||((this.resultsInterpreter!= null)&&this.resultsInterpreter.equals(rhs.resultsInterpreter))))&&((this.conclusionCode == rhs.conclusionCode)||((this.conclusionCode!= null)&&this.conclusionCode.equals(rhs.conclusionCode))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._issued == rhs._issued)||((this._issued!= null)&&this._issued.equals(rhs._issued))))&&((this.effectiveDateTime == rhs.effectiveDateTime)||((this.effectiveDateTime!= null)&&this.effectiveDateTime.equals(rhs.effectiveDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.imagingStudy == rhs.imagingStudy)||((this.imagingStudy!= null)&&this.imagingStudy.equals(rhs.imagingStudy))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The status of the diagnostic report.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        REGISTERED("registered"),
        PARTIAL("partial"),
        PRELIMINARY("preliminary"),
        FINAL("final"),
        AMENDED("amended"),
        CORRECTED("corrected"),
        APPENDED("appended"),
        CANCELLED("cancelled"),
        ENTERED_IN_ERROR("entered-in-error"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, DiagnosticReport.Status> CONSTANTS = new HashMap<String, DiagnosticReport.Status>();

        static {
            for (DiagnosticReport.Status c: values()) {
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
        public static DiagnosticReport.Status fromValue(String value) {
            DiagnosticReport.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
