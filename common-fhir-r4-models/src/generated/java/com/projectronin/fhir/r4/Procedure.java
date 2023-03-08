
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
 * An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "basedOn",
    "partOf",
    "status",
    "_status",
    "statusReason",
    "category",
    "code",
    "subject",
    "encounter",
    "performedDateTime",
    "_performedDateTime",
    "performedPeriod",
    "performedString",
    "_performedString",
    "performedAge",
    "performedRange",
    "recorder",
    "asserter",
    "performer",
    "location",
    "reasonCode",
    "reasonReference",
    "bodySite",
    "outcome",
    "report",
    "complication",
    "complicationDetail",
    "followUp",
    "note",
    "focalDevice",
    "usedReference",
    "usedCode"
})
@Generated("jsonschema2pojo")
public class Procedure
    extends DomainResource
{

    /**
     * This is a Procedure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Procedure resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is updated and is propagated from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is updated and is propagated from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * A reference to a resource that contains details of the request for this procedure.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A reference to a resource that contains details of the request for this procedure.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * A larger event of which this particular procedure is a component or step.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A larger event of which this particular procedure is a component or step.")
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
    @JsonProperty("statusReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept statusReason;
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
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
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
     * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * 
     */
    @JsonProperty("performedDateTime")
    @JsonPropertyDescription("Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.")
    private String performedDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_performedDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _performedDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("performedPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period performedPeriod;
    /**
     * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * 
     */
    @JsonProperty("performedString")
    @JsonPropertyDescription("Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.")
    private String performedString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_performedString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _performedString;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("performedAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age performedAge;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("performedRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range performedRange;
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
     * Limited to &quot;real&quot; people rather than equipment.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Limited to \"real\" people rather than equipment.")
    private List<Procedure_Performer> performer = new ArrayList<Procedure_Performer>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as text.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as text.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * The justification of why the procedure was performed.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("The justification of why the procedure was performed.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.")
    private List<CodeableConcept> bodySite = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept outcome;
    /**
     * This could be a histology result, pathology report, surgical report, etc.
     * 
     */
    @JsonProperty("report")
    @JsonPropertyDescription("This could be a histology result, pathology report, surgical report, etc.")
    private List<Reference> report = new ArrayList<Reference>();
    /**
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
     * 
     */
    @JsonProperty("complication")
    @JsonPropertyDescription("Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.")
    private List<CodeableConcept> complication = new ArrayList<CodeableConcept>();
    /**
     * Any complications that occurred during the procedure, or in the immediate post-performance period.
     * 
     */
    @JsonProperty("complicationDetail")
    @JsonPropertyDescription("Any complications that occurred during the procedure, or in the immediate post-performance period.")
    private List<Reference> complicationDetail = new ArrayList<Reference>();
    /**
     * If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.
     * 
     */
    @JsonProperty("followUp")
    @JsonPropertyDescription("If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.")
    private List<CodeableConcept> followUp = new ArrayList<CodeableConcept>();
    /**
     * Any other notes and comments about the procedure.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Any other notes and comments about the procedure.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * 
     */
    @JsonProperty("focalDevice")
    @JsonPropertyDescription("A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.")
    private List<Procedure_FocalDevice> focalDevice = new ArrayList<Procedure_FocalDevice>();
    /**
     * Identifies medications, devices and any other substance used as part of the procedure.
     * 
     */
    @JsonProperty("usedReference")
    @JsonPropertyDescription("Identifies medications, devices and any other substance used as part of the procedure.")
    private List<Reference> usedReference = new ArrayList<Reference>();
    /**
     * Identifies coded items that were used as part of the procedure.
     * 
     */
    @JsonProperty("usedCode")
    @JsonPropertyDescription("Identifies coded items that were used as part of the procedure.")
    private List<CodeableConcept> usedCode = new ArrayList<CodeableConcept>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Procedure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Procedure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is updated and is propagated from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is updated and is propagated from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
     * 
     */
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(List<String> instantiatesUri) {
        this.instantiatesUri = instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public List<Element> get_instantiatesUri() {
        return _instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public void set_instantiatesUri(List<Element> _instantiatesUri) {
        this._instantiatesUri = _instantiatesUri;
    }

    /**
     * A reference to a resource that contains details of the request for this procedure.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A reference to a resource that contains details of the request for this procedure.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A larger event of which this particular procedure is a component or step.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * A larger event of which this particular procedure is a component or step.
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
     * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * 
     */
    @JsonProperty("performedDateTime")
    public String getPerformedDateTime() {
        return performedDateTime;
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * 
     */
    @JsonProperty("performedDateTime")
    public void setPerformedDateTime(String performedDateTime) {
        this.performedDateTime = performedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_performedDateTime")
    public Element get_performedDateTime() {
        return _performedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_performedDateTime")
    public void set_performedDateTime(Element _performedDateTime) {
        this._performedDateTime = _performedDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("performedPeriod")
    public Period getPerformedPeriod() {
        return performedPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("performedPeriod")
    public void setPerformedPeriod(Period performedPeriod) {
        this.performedPeriod = performedPeriod;
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * 
     */
    @JsonProperty("performedString")
    public String getPerformedString() {
        return performedString;
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * 
     */
    @JsonProperty("performedString")
    public void setPerformedString(String performedString) {
        this.performedString = performedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_performedString")
    public Element get_performedString() {
        return _performedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_performedString")
    public void set_performedString(Element _performedString) {
        this._performedString = _performedString;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("performedAge")
    public Age getPerformedAge() {
        return performedAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("performedAge")
    public void setPerformedAge(Age performedAge) {
        this.performedAge = performedAge;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("performedRange")
    public Range getPerformedRange() {
        return performedRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("performedRange")
    public void setPerformedRange(Range performedRange) {
        this.performedRange = performedRange;
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
     * Limited to &quot;real&quot; people rather than equipment.
     * 
     */
    @JsonProperty("performer")
    public List<Procedure_Performer> getPerformer() {
        return performer;
    }

    /**
     * Limited to &quot;real&quot; people rather than equipment.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<Procedure_Performer> performer) {
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
     * The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as text.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as text.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * The justification of why the procedure was performed.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * The justification of why the procedure was performed.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
     * 
     */
    @JsonProperty("bodySite")
    public List<CodeableConcept> getBodySite() {
        return bodySite;
    }

    /**
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(List<CodeableConcept> bodySite) {
        this.bodySite = bodySite;
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
     * This could be a histology result, pathology report, surgical report, etc.
     * 
     */
    @JsonProperty("report")
    public List<Reference> getReport() {
        return report;
    }

    /**
     * This could be a histology result, pathology report, surgical report, etc.
     * 
     */
    @JsonProperty("report")
    public void setReport(List<Reference> report) {
        this.report = report;
    }

    /**
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
     * 
     */
    @JsonProperty("complication")
    public List<CodeableConcept> getComplication() {
        return complication;
    }

    /**
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
     * 
     */
    @JsonProperty("complication")
    public void setComplication(List<CodeableConcept> complication) {
        this.complication = complication;
    }

    /**
     * Any complications that occurred during the procedure, or in the immediate post-performance period.
     * 
     */
    @JsonProperty("complicationDetail")
    public List<Reference> getComplicationDetail() {
        return complicationDetail;
    }

    /**
     * Any complications that occurred during the procedure, or in the immediate post-performance period.
     * 
     */
    @JsonProperty("complicationDetail")
    public void setComplicationDetail(List<Reference> complicationDetail) {
        this.complicationDetail = complicationDetail;
    }

    /**
     * If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.
     * 
     */
    @JsonProperty("followUp")
    public List<CodeableConcept> getFollowUp() {
        return followUp;
    }

    /**
     * If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.
     * 
     */
    @JsonProperty("followUp")
    public void setFollowUp(List<CodeableConcept> followUp) {
        this.followUp = followUp;
    }

    /**
     * Any other notes and comments about the procedure.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Any other notes and comments about the procedure.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * 
     */
    @JsonProperty("focalDevice")
    public List<Procedure_FocalDevice> getFocalDevice() {
        return focalDevice;
    }

    /**
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * 
     */
    @JsonProperty("focalDevice")
    public void setFocalDevice(List<Procedure_FocalDevice> focalDevice) {
        this.focalDevice = focalDevice;
    }

    /**
     * Identifies medications, devices and any other substance used as part of the procedure.
     * 
     */
    @JsonProperty("usedReference")
    public List<Reference> getUsedReference() {
        return usedReference;
    }

    /**
     * Identifies medications, devices and any other substance used as part of the procedure.
     * 
     */
    @JsonProperty("usedReference")
    public void setUsedReference(List<Reference> usedReference) {
        this.usedReference = usedReference;
    }

    /**
     * Identifies coded items that were used as part of the procedure.
     * 
     */
    @JsonProperty("usedCode")
    public List<CodeableConcept> getUsedCode() {
        return usedCode;
    }

    /**
     * Identifies coded items that were used as part of the procedure.
     * 
     */
    @JsonProperty("usedCode")
    public void setUsedCode(List<CodeableConcept> usedCode) {
        this.usedCode = usedCode;
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
        sb.append(Procedure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("instantiatesCanonical");
        sb.append('=');
        sb.append(((this.instantiatesCanonical == null)?"<null>":this.instantiatesCanonical));
        sb.append(',');
        sb.append("instantiatesUri");
        sb.append('=');
        sb.append(((this.instantiatesUri == null)?"<null>":this.instantiatesUri));
        sb.append(',');
        sb.append("_instantiatesUri");
        sb.append('=');
        sb.append(((this._instantiatesUri == null)?"<null>":this._instantiatesUri));
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
        sb.append("performedDateTime");
        sb.append('=');
        sb.append(((this.performedDateTime == null)?"<null>":this.performedDateTime));
        sb.append(',');
        sb.append("_performedDateTime");
        sb.append('=');
        sb.append(((this._performedDateTime == null)?"<null>":this._performedDateTime));
        sb.append(',');
        sb.append("performedPeriod");
        sb.append('=');
        sb.append(((this.performedPeriod == null)?"<null>":this.performedPeriod));
        sb.append(',');
        sb.append("performedString");
        sb.append('=');
        sb.append(((this.performedString == null)?"<null>":this.performedString));
        sb.append(',');
        sb.append("_performedString");
        sb.append('=');
        sb.append(((this._performedString == null)?"<null>":this._performedString));
        sb.append(',');
        sb.append("performedAge");
        sb.append('=');
        sb.append(((this.performedAge == null)?"<null>":this.performedAge));
        sb.append(',');
        sb.append("performedRange");
        sb.append('=');
        sb.append(((this.performedRange == null)?"<null>":this.performedRange));
        sb.append(',');
        sb.append("recorder");
        sb.append('=');
        sb.append(((this.recorder == null)?"<null>":this.recorder));
        sb.append(',');
        sb.append("asserter");
        sb.append('=');
        sb.append(((this.asserter == null)?"<null>":this.asserter));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
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
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("report");
        sb.append('=');
        sb.append(((this.report == null)?"<null>":this.report));
        sb.append(',');
        sb.append("complication");
        sb.append('=');
        sb.append(((this.complication == null)?"<null>":this.complication));
        sb.append(',');
        sb.append("complicationDetail");
        sb.append('=');
        sb.append(((this.complicationDetail == null)?"<null>":this.complicationDetail));
        sb.append(',');
        sb.append("followUp");
        sb.append('=');
        sb.append(((this.followUp == null)?"<null>":this.followUp));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("focalDevice");
        sb.append('=');
        sb.append(((this.focalDevice == null)?"<null>":this.focalDevice));
        sb.append(',');
        sb.append("usedReference");
        sb.append('=');
        sb.append(((this.usedReference == null)?"<null>":this.usedReference));
        sb.append(',');
        sb.append("usedCode");
        sb.append('=');
        sb.append(((this.usedCode == null)?"<null>":this.usedCode));
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
        result = ((result* 31)+((this.complication == null)? 0 :this.complication.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.performedRange == null)? 0 :this.performedRange.hashCode()));
        result = ((result* 31)+((this.performedAge == null)? 0 :this.performedAge.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.performedPeriod == null)? 0 :this.performedPeriod.hashCode()));
        result = ((result* 31)+((this.performedString == null)? 0 :this.performedString.hashCode()));
        result = ((result* 31)+((this.followUp == null)? 0 :this.followUp.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.usedCode == null)? 0 :this.usedCode.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.performedDateTime == null)? 0 :this.performedDateTime.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.recorder == null)? 0 :this.recorder.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.complicationDetail == null)? 0 :this.complicationDetail.hashCode()));
        result = ((result* 31)+((this.usedReference == null)? 0 :this.usedReference.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.focalDevice == null)? 0 :this.focalDevice.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._performedString == null)? 0 :this._performedString.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.asserter == null)? 0 :this.asserter.hashCode()));
        result = ((result* 31)+((this._performedDateTime == null)? 0 :this._performedDateTime.hashCode()));
        result = ((result* 31)+((this.report == null)? 0 :this.report.hashCode()));
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
        if ((other instanceof Procedure) == false) {
            return false;
        }
        Procedure rhs = ((Procedure) other);
        return ((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.complication == rhs.complication)||((this.complication!= null)&&this.complication.equals(rhs.complication))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.performedRange == rhs.performedRange)||((this.performedRange!= null)&&this.performedRange.equals(rhs.performedRange))))&&((this.performedAge == rhs.performedAge)||((this.performedAge!= null)&&this.performedAge.equals(rhs.performedAge))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.performedPeriod == rhs.performedPeriod)||((this.performedPeriod!= null)&&this.performedPeriod.equals(rhs.performedPeriod))))&&((this.performedString == rhs.performedString)||((this.performedString!= null)&&this.performedString.equals(rhs.performedString))))&&((this.followUp == rhs.followUp)||((this.followUp!= null)&&this.followUp.equals(rhs.followUp))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.usedCode == rhs.usedCode)||((this.usedCode!= null)&&this.usedCode.equals(rhs.usedCode))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.performedDateTime == rhs.performedDateTime)||((this.performedDateTime!= null)&&this.performedDateTime.equals(rhs.performedDateTime))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.recorder == rhs.recorder)||((this.recorder!= null)&&this.recorder.equals(rhs.recorder))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.complicationDetail == rhs.complicationDetail)||((this.complicationDetail!= null)&&this.complicationDetail.equals(rhs.complicationDetail))))&&((this.usedReference == rhs.usedReference)||((this.usedReference!= null)&&this.usedReference.equals(rhs.usedReference))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.focalDevice == rhs.focalDevice)||((this.focalDevice!= null)&&this.focalDevice.equals(rhs.focalDevice))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._performedString == rhs._performedString)||((this._performedString!= null)&&this._performedString.equals(rhs._performedString))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.asserter == rhs.asserter)||((this.asserter!= null)&&this.asserter.equals(rhs.asserter))))&&((this._performedDateTime == rhs._performedDateTime)||((this._performedDateTime!= null)&&this._performedDateTime.equals(rhs._performedDateTime))))&&((this.report == rhs.report)||((this.report!= null)&&this.report.equals(rhs.report))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
