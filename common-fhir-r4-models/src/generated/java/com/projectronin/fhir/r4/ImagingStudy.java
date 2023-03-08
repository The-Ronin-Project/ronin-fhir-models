
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
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "modality",
    "subject",
    "encounter",
    "started",
    "_started",
    "basedOn",
    "referrer",
    "interpreter",
    "endpoint",
    "numberOfSeries",
    "_numberOfSeries",
    "numberOfInstances",
    "_numberOfInstances",
    "procedureReference",
    "procedureCode",
    "location",
    "reasonCode",
    "reasonReference",
    "note",
    "description",
    "_description",
    "series"
})
@Generated("jsonschema2pojo")
public class ImagingStudy
    extends DomainResource
{

    /**
     * This is a ImagingStudy resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ImagingStudy resource")
    private String resourceType;
    /**
     * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The current state of the ImagingStudy.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current state of the ImagingStudy.")
    private ImagingStudy.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
     * 
     */
    @JsonProperty("modality")
    @JsonPropertyDescription("A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).")
    private List<Coding> modality = new ArrayList<Coding>();
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
    @JsonProperty("started")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String started;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_started")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _started;
    /**
     * A list of the diagnostic requests that resulted in this imaging study being performed.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A list of the diagnostic requests that resulted in this imaging study being performed.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referrer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference referrer;
    /**
     * Who read the study and interpreted the images or other content.
     * 
     */
    @JsonProperty("interpreter")
    @JsonPropertyDescription("Who read the study and interpreted the images or other content.")
    private List<Reference> interpreter = new ArrayList<Reference>();
    /**
     * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.connectionType.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.connectionType.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfSeries")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double numberOfSeries;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfSeries")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfSeries;
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfInstances")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double numberOfInstances;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfInstances")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfInstances;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("procedureReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference procedureReference;
    /**
     * The code for the performed procedure type.
     * 
     */
    @JsonProperty("procedureCode")
    @JsonPropertyDescription("The code for the performed procedure type.")
    private List<CodeableConcept> procedureCode = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * Description of clinical condition indicating why the ImagingStudy was requested.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Description of clinical condition indicating why the ImagingStudy was requested.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource whose existence justifies this Study.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource whose existence justifies this Study.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.")
    private List<Annotation> note = new ArrayList<Annotation>();
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
     * Each study has one or more series of images or other content.
     * 
     */
    @JsonProperty("series")
    @JsonPropertyDescription("Each study has one or more series of images or other content.")
    private List<ImagingStudy_Series> series = new ArrayList<ImagingStudy_Series>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ImagingStudy resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ImagingStudy resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The current state of the ImagingStudy.
     * 
     */
    @JsonProperty("status")
    public ImagingStudy.Status getStatus() {
        return status;
    }

    /**
     * The current state of the ImagingStudy.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ImagingStudy.Status status) {
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
     * A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
     * 
     */
    @JsonProperty("modality")
    public List<Coding> getModality() {
        return modality;
    }

    /**
     * A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
     * 
     */
    @JsonProperty("modality")
    public void setModality(List<Coding> modality) {
        this.modality = modality;
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
    @JsonProperty("started")
    public String getStarted() {
        return started;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("started")
    public void setStarted(String started) {
        this.started = started;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_started")
    public Element get_started() {
        return _started;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_started")
    public void set_started(Element _started) {
        this._started = _started;
    }

    /**
     * A list of the diagnostic requests that resulted in this imaging study being performed.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A list of the diagnostic requests that resulted in this imaging study being performed.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referrer")
    public Reference getReferrer() {
        return referrer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referrer")
    public void setReferrer(Reference referrer) {
        this.referrer = referrer;
    }

    /**
     * Who read the study and interpreted the images or other content.
     * 
     */
    @JsonProperty("interpreter")
    public List<Reference> getInterpreter() {
        return interpreter;
    }

    /**
     * Who read the study and interpreted the images or other content.
     * 
     */
    @JsonProperty("interpreter")
    public void setInterpreter(List<Reference> interpreter) {
        this.interpreter = interpreter;
    }

    /**
     * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.connectionType.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.connectionType.
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(List<Reference> endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfSeries")
    public Double getNumberOfSeries() {
        return numberOfSeries;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfSeries")
    public void setNumberOfSeries(Double numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfSeries")
    public Element get_numberOfSeries() {
        return _numberOfSeries;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfSeries")
    public void set_numberOfSeries(Element _numberOfSeries) {
        this._numberOfSeries = _numberOfSeries;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfInstances")
    public Double getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfInstances")
    public void setNumberOfInstances(Double numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfInstances")
    public Element get_numberOfInstances() {
        return _numberOfInstances;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfInstances")
    public void set_numberOfInstances(Element _numberOfInstances) {
        this._numberOfInstances = _numberOfInstances;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("procedureReference")
    public Reference getProcedureReference() {
        return procedureReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("procedureReference")
    public void setProcedureReference(Reference procedureReference) {
        this.procedureReference = procedureReference;
    }

    /**
     * The code for the performed procedure type.
     * 
     */
    @JsonProperty("procedureCode")
    public List<CodeableConcept> getProcedureCode() {
        return procedureCode;
    }

    /**
     * The code for the performed procedure type.
     * 
     */
    @JsonProperty("procedureCode")
    public void setProcedureCode(List<CodeableConcept> procedureCode) {
        this.procedureCode = procedureCode;
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
     * Description of clinical condition indicating why the ImagingStudy was requested.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Description of clinical condition indicating why the ImagingStudy was requested.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource whose existence justifies this Study.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource whose existence justifies this Study.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
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
     * Each study has one or more series of images or other content.
     * 
     */
    @JsonProperty("series")
    public List<ImagingStudy_Series> getSeries() {
        return series;
    }

    /**
     * Each study has one or more series of images or other content.
     * 
     */
    @JsonProperty("series")
    public void setSeries(List<ImagingStudy_Series> series) {
        this.series = series;
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
        sb.append(ImagingStudy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("modality");
        sb.append('=');
        sb.append(((this.modality == null)?"<null>":this.modality));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("started");
        sb.append('=');
        sb.append(((this.started == null)?"<null>":this.started));
        sb.append(',');
        sb.append("_started");
        sb.append('=');
        sb.append(((this._started == null)?"<null>":this._started));
        sb.append(',');
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("referrer");
        sb.append('=');
        sb.append(((this.referrer == null)?"<null>":this.referrer));
        sb.append(',');
        sb.append("interpreter");
        sb.append('=');
        sb.append(((this.interpreter == null)?"<null>":this.interpreter));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("numberOfSeries");
        sb.append('=');
        sb.append(((this.numberOfSeries == null)?"<null>":this.numberOfSeries));
        sb.append(',');
        sb.append("_numberOfSeries");
        sb.append('=');
        sb.append(((this._numberOfSeries == null)?"<null>":this._numberOfSeries));
        sb.append(',');
        sb.append("numberOfInstances");
        sb.append('=');
        sb.append(((this.numberOfInstances == null)?"<null>":this.numberOfInstances));
        sb.append(',');
        sb.append("_numberOfInstances");
        sb.append('=');
        sb.append(((this._numberOfInstances == null)?"<null>":this._numberOfInstances));
        sb.append(',');
        sb.append("procedureReference");
        sb.append('=');
        sb.append(((this.procedureReference == null)?"<null>":this.procedureReference));
        sb.append(',');
        sb.append("procedureCode");
        sb.append('=');
        sb.append(((this.procedureCode == null)?"<null>":this.procedureCode));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
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
        result = ((result* 31)+((this.modality == null)? 0 :this.modality.hashCode()));
        result = ((result* 31)+((this.procedureCode == null)? 0 :this.procedureCode.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this.numberOfInstances == null)? 0 :this.numberOfInstances.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.numberOfSeries == null)? 0 :this.numberOfSeries.hashCode()));
        result = ((result* 31)+((this.started == null)? 0 :this.started.hashCode()));
        result = ((result* 31)+((this.interpreter == null)? 0 :this.interpreter.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._numberOfSeries == null)? 0 :this._numberOfSeries.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._numberOfInstances == null)? 0 :this._numberOfInstances.hashCode()));
        result = ((result* 31)+((this.referrer == null)? 0 :this.referrer.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this.procedureReference == null)? 0 :this.procedureReference.hashCode()));
        result = ((result* 31)+((this._started == null)? 0 :this._started.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
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
        if ((other instanceof ImagingStudy) == false) {
            return false;
        }
        ImagingStudy rhs = ((ImagingStudy) other);
        return (((((((((((((((((((((((((((super.equals(rhs)&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.modality == rhs.modality)||((this.modality!= null)&&this.modality.equals(rhs.modality))))&&((this.procedureCode == rhs.procedureCode)||((this.procedureCode!= null)&&this.procedureCode.equals(rhs.procedureCode))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this.numberOfInstances == rhs.numberOfInstances)||((this.numberOfInstances!= null)&&this.numberOfInstances.equals(rhs.numberOfInstances))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.numberOfSeries == rhs.numberOfSeries)||((this.numberOfSeries!= null)&&this.numberOfSeries.equals(rhs.numberOfSeries))))&&((this.started == rhs.started)||((this.started!= null)&&this.started.equals(rhs.started))))&&((this.interpreter == rhs.interpreter)||((this.interpreter!= null)&&this.interpreter.equals(rhs.interpreter))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._numberOfSeries == rhs._numberOfSeries)||((this._numberOfSeries!= null)&&this._numberOfSeries.equals(rhs._numberOfSeries))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._numberOfInstances == rhs._numberOfInstances)||((this._numberOfInstances!= null)&&this._numberOfInstances.equals(rhs._numberOfInstances))))&&((this.referrer == rhs.referrer)||((this.referrer!= null)&&this.referrer.equals(rhs.referrer))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this.procedureReference == rhs.procedureReference)||((this.procedureReference!= null)&&this.procedureReference.equals(rhs.procedureReference))))&&((this._started == rhs._started)||((this._started!= null)&&this._started.equals(rhs._started))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The current state of the ImagingStudy.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        REGISTERED("registered"),
        AVAILABLE("available"),
        CANCELLED("cancelled"),
        ENTERED_IN_ERROR("entered-in-error"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, ImagingStudy.Status> CONSTANTS = new HashMap<String, ImagingStudy.Status>();

        static {
            for (ImagingStudy.Status c: values()) {
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
        public static ImagingStudy.Status fromValue(String value) {
            ImagingStudy.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
