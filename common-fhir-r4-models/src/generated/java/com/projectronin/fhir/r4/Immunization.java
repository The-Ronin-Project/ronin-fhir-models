
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
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "statusReason",
    "vaccineCode",
    "patient",
    "encounter",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrenceString",
    "_occurrenceString",
    "recorded",
    "_recorded",
    "primarySource",
    "_primarySource",
    "reportOrigin",
    "location",
    "manufacturer",
    "lotNumber",
    "_lotNumber",
    "expirationDate",
    "_expirationDate",
    "site",
    "route",
    "doseQuantity",
    "performer",
    "note",
    "reasonCode",
    "reasonReference",
    "isSubpotent",
    "_isSubpotent",
    "subpotentReason",
    "education",
    "programEligibility",
    "fundingSource",
    "reaction",
    "protocolApplied"
})
@Generated("jsonschema2pojo")
public class Immunization
    extends DomainResource
{

    /**
     * This is a Immunization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Immunization resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this immunization record.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this immunization record.")
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
     * (Required)
     * 
     */
    @JsonProperty("vaccineCode")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept vaccineCode;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * Date vaccine administered or was to be administered.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("Date vaccine administered or was to be administered.")
    private String occurrenceDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurrenceDateTime;
    /**
     * Date vaccine administered or was to be administered.
     * 
     */
    @JsonProperty("occurrenceString")
    @JsonPropertyDescription("Date vaccine administered or was to be administered.")
    private String occurrenceString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurrenceString;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recorded")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String recorded;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recorded")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _recorded;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("primarySource")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean primarySource;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_primarySource")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _primarySource;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reportOrigin")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept reportOrigin;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference manufacturer;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("lotNumber")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String lotNumber;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lotNumber")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lotNumber;
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String expirationDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expirationDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _expirationDate;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept site;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("route")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept route;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("doseQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity doseQuantity;
    /**
     * Indicates who performed the immunization event.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Indicates who performed the immunization event.")
    private List<Immunization_Performer> performer = new ArrayList<Immunization_Performer>();
    /**
     * Extra information about the immunization that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Extra information about the immunization that is not conveyed by the other attributes.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Reasons why the vaccine was administered.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Reasons why the vaccine was administered.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Condition, Observation or DiagnosticReport that supports why the immunization was administered.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Condition, Observation or DiagnosticReport that supports why the immunization was administered.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isSubpotent")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean isSubpotent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isSubpotent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isSubpotent;
    /**
     * Reason why a dose is considered to be subpotent.
     * 
     */
    @JsonProperty("subpotentReason")
    @JsonPropertyDescription("Reason why a dose is considered to be subpotent.")
    private List<CodeableConcept> subpotentReason = new ArrayList<CodeableConcept>();
    /**
     * Educational material presented to the patient (or guardian) at the time of vaccine administration.
     * 
     */
    @JsonProperty("education")
    @JsonPropertyDescription("Educational material presented to the patient (or guardian) at the time of vaccine administration.")
    private List<Immunization_Education> education = new ArrayList<Immunization_Education>();
    /**
     * Indicates a patient's eligibility for a funding program.
     * 
     */
    @JsonProperty("programEligibility")
    @JsonPropertyDescription("Indicates a patient's eligibility for a funding program.")
    private List<CodeableConcept> programEligibility = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundingSource")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept fundingSource;
    /**
     * Categorical data indicating that an adverse event is associated in time to an immunization.
     * 
     */
    @JsonProperty("reaction")
    @JsonPropertyDescription("Categorical data indicating that an adverse event is associated in time to an immunization.")
    private List<Immunization_Reaction> reaction = new ArrayList<Immunization_Reaction>();
    /**
     * The protocol (set of recommendations) being followed by the provider who administered the dose.
     * 
     */
    @JsonProperty("protocolApplied")
    @JsonPropertyDescription("The protocol (set of recommendations) being followed by the provider who administered the dose.")
    private List<Immunization_ProtocolApplied> protocolApplied = new ArrayList<Immunization_ProtocolApplied>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Immunization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Immunization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this immunization record.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this immunization record.
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
     * (Required)
     * 
     */
    @JsonProperty("vaccineCode")
    public CodeableConcept getVaccineCode() {
        return vaccineCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("vaccineCode")
    public void setVaccineCode(CodeableConcept vaccineCode) {
        this.vaccineCode = vaccineCode;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
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
     * Date vaccine administered or was to be administered.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * Date vaccine administered or was to be administered.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public Element get_occurrenceDateTime() {
        return _occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public void set_occurrenceDateTime(Element _occurrenceDateTime) {
        this._occurrenceDateTime = _occurrenceDateTime;
    }

    /**
     * Date vaccine administered or was to be administered.
     * 
     */
    @JsonProperty("occurrenceString")
    public String getOccurrenceString() {
        return occurrenceString;
    }

    /**
     * Date vaccine administered or was to be administered.
     * 
     */
    @JsonProperty("occurrenceString")
    public void setOccurrenceString(String occurrenceString) {
        this.occurrenceString = occurrenceString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceString")
    public Element get_occurrenceString() {
        return _occurrenceString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceString")
    public void set_occurrenceString(Element _occurrenceString) {
        this._occurrenceString = _occurrenceString;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recorded")
    public String getRecorded() {
        return recorded;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("recorded")
    public void setRecorded(String recorded) {
        this.recorded = recorded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recorded")
    public Element get_recorded() {
        return _recorded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recorded")
    public void set_recorded(Element _recorded) {
        this._recorded = _recorded;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("primarySource")
    public Boolean getPrimarySource() {
        return primarySource;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("primarySource")
    public void setPrimarySource(Boolean primarySource) {
        this.primarySource = primarySource;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_primarySource")
    public Element get_primarySource() {
        return _primarySource;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_primarySource")
    public void set_primarySource(Element _primarySource) {
        this._primarySource = _primarySource;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reportOrigin")
    public CodeableConcept getReportOrigin() {
        return reportOrigin;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reportOrigin")
    public void setReportOrigin(CodeableConcept reportOrigin) {
        this.reportOrigin = reportOrigin;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturer")
    public Reference getManufacturer() {
        return manufacturer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(Reference manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("lotNumber")
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("lotNumber")
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lotNumber")
    public Element get_lotNumber() {
        return _lotNumber;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lotNumber")
    public void set_lotNumber(Element _lotNumber) {
        this._lotNumber = _lotNumber;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("expirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expirationDate")
    public Element get_expirationDate() {
        return _expirationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expirationDate")
    public void set_expirationDate(Element _expirationDate) {
        this._expirationDate = _expirationDate;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("site")
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("site")
    public void setSite(CodeableConcept site) {
        this.site = site;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("route")
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("route")
    public void setRoute(CodeableConcept route) {
        this.route = route;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("doseQuantity")
    public Quantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("doseQuantity")
    public void setDoseQuantity(Quantity doseQuantity) {
        this.doseQuantity = doseQuantity;
    }

    /**
     * Indicates who performed the immunization event.
     * 
     */
    @JsonProperty("performer")
    public List<Immunization_Performer> getPerformer() {
        return performer;
    }

    /**
     * Indicates who performed the immunization event.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<Immunization_Performer> performer) {
        this.performer = performer;
    }

    /**
     * Extra information about the immunization that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Extra information about the immunization that is not conveyed by the other attributes.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Reasons why the vaccine was administered.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Reasons why the vaccine was administered.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Condition, Observation or DiagnosticReport that supports why the immunization was administered.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Condition, Observation or DiagnosticReport that supports why the immunization was administered.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isSubpotent")
    public Boolean getIsSubpotent() {
        return isSubpotent;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isSubpotent")
    public void setIsSubpotent(Boolean isSubpotent) {
        this.isSubpotent = isSubpotent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isSubpotent")
    public Element get_isSubpotent() {
        return _isSubpotent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isSubpotent")
    public void set_isSubpotent(Element _isSubpotent) {
        this._isSubpotent = _isSubpotent;
    }

    /**
     * Reason why a dose is considered to be subpotent.
     * 
     */
    @JsonProperty("subpotentReason")
    public List<CodeableConcept> getSubpotentReason() {
        return subpotentReason;
    }

    /**
     * Reason why a dose is considered to be subpotent.
     * 
     */
    @JsonProperty("subpotentReason")
    public void setSubpotentReason(List<CodeableConcept> subpotentReason) {
        this.subpotentReason = subpotentReason;
    }

    /**
     * Educational material presented to the patient (or guardian) at the time of vaccine administration.
     * 
     */
    @JsonProperty("education")
    public List<Immunization_Education> getEducation() {
        return education;
    }

    /**
     * Educational material presented to the patient (or guardian) at the time of vaccine administration.
     * 
     */
    @JsonProperty("education")
    public void setEducation(List<Immunization_Education> education) {
        this.education = education;
    }

    /**
     * Indicates a patient's eligibility for a funding program.
     * 
     */
    @JsonProperty("programEligibility")
    public List<CodeableConcept> getProgramEligibility() {
        return programEligibility;
    }

    /**
     * Indicates a patient's eligibility for a funding program.
     * 
     */
    @JsonProperty("programEligibility")
    public void setProgramEligibility(List<CodeableConcept> programEligibility) {
        this.programEligibility = programEligibility;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundingSource")
    public CodeableConcept getFundingSource() {
        return fundingSource;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundingSource")
    public void setFundingSource(CodeableConcept fundingSource) {
        this.fundingSource = fundingSource;
    }

    /**
     * Categorical data indicating that an adverse event is associated in time to an immunization.
     * 
     */
    @JsonProperty("reaction")
    public List<Immunization_Reaction> getReaction() {
        return reaction;
    }

    /**
     * Categorical data indicating that an adverse event is associated in time to an immunization.
     * 
     */
    @JsonProperty("reaction")
    public void setReaction(List<Immunization_Reaction> reaction) {
        this.reaction = reaction;
    }

    /**
     * The protocol (set of recommendations) being followed by the provider who administered the dose.
     * 
     */
    @JsonProperty("protocolApplied")
    public List<Immunization_ProtocolApplied> getProtocolApplied() {
        return protocolApplied;
    }

    /**
     * The protocol (set of recommendations) being followed by the provider who administered the dose.
     * 
     */
    @JsonProperty("protocolApplied")
    public void setProtocolApplied(List<Immunization_ProtocolApplied> protocolApplied) {
        this.protocolApplied = protocolApplied;
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
        sb.append(Immunization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("vaccineCode");
        sb.append('=');
        sb.append(((this.vaccineCode == null)?"<null>":this.vaccineCode));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("occurrenceDateTime");
        sb.append('=');
        sb.append(((this.occurrenceDateTime == null)?"<null>":this.occurrenceDateTime));
        sb.append(',');
        sb.append("_occurrenceDateTime");
        sb.append('=');
        sb.append(((this._occurrenceDateTime == null)?"<null>":this._occurrenceDateTime));
        sb.append(',');
        sb.append("occurrenceString");
        sb.append('=');
        sb.append(((this.occurrenceString == null)?"<null>":this.occurrenceString));
        sb.append(',');
        sb.append("_occurrenceString");
        sb.append('=');
        sb.append(((this._occurrenceString == null)?"<null>":this._occurrenceString));
        sb.append(',');
        sb.append("recorded");
        sb.append('=');
        sb.append(((this.recorded == null)?"<null>":this.recorded));
        sb.append(',');
        sb.append("_recorded");
        sb.append('=');
        sb.append(((this._recorded == null)?"<null>":this._recorded));
        sb.append(',');
        sb.append("primarySource");
        sb.append('=');
        sb.append(((this.primarySource == null)?"<null>":this.primarySource));
        sb.append(',');
        sb.append("_primarySource");
        sb.append('=');
        sb.append(((this._primarySource == null)?"<null>":this._primarySource));
        sb.append(',');
        sb.append("reportOrigin");
        sb.append('=');
        sb.append(((this.reportOrigin == null)?"<null>":this.reportOrigin));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("lotNumber");
        sb.append('=');
        sb.append(((this.lotNumber == null)?"<null>":this.lotNumber));
        sb.append(',');
        sb.append("_lotNumber");
        sb.append('=');
        sb.append(((this._lotNumber == null)?"<null>":this._lotNumber));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("_expirationDate");
        sb.append('=');
        sb.append(((this._expirationDate == null)?"<null>":this._expirationDate));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null)?"<null>":this.route));
        sb.append(',');
        sb.append("doseQuantity");
        sb.append('=');
        sb.append(((this.doseQuantity == null)?"<null>":this.doseQuantity));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("isSubpotent");
        sb.append('=');
        sb.append(((this.isSubpotent == null)?"<null>":this.isSubpotent));
        sb.append(',');
        sb.append("_isSubpotent");
        sb.append('=');
        sb.append(((this._isSubpotent == null)?"<null>":this._isSubpotent));
        sb.append(',');
        sb.append("subpotentReason");
        sb.append('=');
        sb.append(((this.subpotentReason == null)?"<null>":this.subpotentReason));
        sb.append(',');
        sb.append("education");
        sb.append('=');
        sb.append(((this.education == null)?"<null>":this.education));
        sb.append(',');
        sb.append("programEligibility");
        sb.append('=');
        sb.append(((this.programEligibility == null)?"<null>":this.programEligibility));
        sb.append(',');
        sb.append("fundingSource");
        sb.append('=');
        sb.append(((this.fundingSource == null)?"<null>":this.fundingSource));
        sb.append(',');
        sb.append("reaction");
        sb.append('=');
        sb.append(((this.reaction == null)?"<null>":this.reaction));
        sb.append(',');
        sb.append("protocolApplied");
        sb.append('=');
        sb.append(((this.protocolApplied == null)?"<null>":this.protocolApplied));
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
        result = ((result* 31)+((this.primarySource == null)? 0 :this.primarySource.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.education == null)? 0 :this.education.hashCode()));
        result = ((result* 31)+((this.doseQuantity == null)? 0 :this.doseQuantity.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this._isSubpotent == null)? 0 :this._isSubpotent.hashCode()));
        result = ((result* 31)+((this._recorded == null)? 0 :this._recorded.hashCode()));
        result = ((result* 31)+((this.manufacturer == null)? 0 :this.manufacturer.hashCode()));
        result = ((result* 31)+((this.programEligibility == null)? 0 :this.programEligibility.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this._expirationDate == null)? 0 :this._expirationDate.hashCode()));
        result = ((result* 31)+((this.isSubpotent == null)? 0 :this.isSubpotent.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.vaccineCode == null)? 0 :this.vaccineCode.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._occurrenceString == null)? 0 :this._occurrenceString.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.reaction == null)? 0 :this.reaction.hashCode()));
        result = ((result* 31)+((this.subpotentReason == null)? 0 :this.subpotentReason.hashCode()));
        result = ((result* 31)+((this._lotNumber == null)? 0 :this._lotNumber.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.lotNumber == null)? 0 :this.lotNumber.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.recorded == null)? 0 :this.recorded.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.route == null)? 0 :this.route.hashCode()));
        result = ((result* 31)+((this._primarySource == null)? 0 :this._primarySource.hashCode()));
        result = ((result* 31)+((this.protocolApplied == null)? 0 :this.protocolApplied.hashCode()));
        result = ((result* 31)+((this.reportOrigin == null)? 0 :this.reportOrigin.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.occurrenceString == null)? 0 :this.occurrenceString.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fundingSource == null)? 0 :this.fundingSource.hashCode()));
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
        if ((other instanceof Immunization) == false) {
            return false;
        }
        Immunization rhs = ((Immunization) other);
        return (((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.primarySource == rhs.primarySource)||((this.primarySource!= null)&&this.primarySource.equals(rhs.primarySource))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.education == rhs.education)||((this.education!= null)&&this.education.equals(rhs.education))))&&((this.doseQuantity == rhs.doseQuantity)||((this.doseQuantity!= null)&&this.doseQuantity.equals(rhs.doseQuantity))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this._isSubpotent == rhs._isSubpotent)||((this._isSubpotent!= null)&&this._isSubpotent.equals(rhs._isSubpotent))))&&((this._recorded == rhs._recorded)||((this._recorded!= null)&&this._recorded.equals(rhs._recorded))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))))&&((this.programEligibility == rhs.programEligibility)||((this.programEligibility!= null)&&this.programEligibility.equals(rhs.programEligibility))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this._expirationDate == rhs._expirationDate)||((this._expirationDate!= null)&&this._expirationDate.equals(rhs._expirationDate))))&&((this.isSubpotent == rhs.isSubpotent)||((this.isSubpotent!= null)&&this.isSubpotent.equals(rhs.isSubpotent))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.vaccineCode == rhs.vaccineCode)||((this.vaccineCode!= null)&&this.vaccineCode.equals(rhs.vaccineCode))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._occurrenceString == rhs._occurrenceString)||((this._occurrenceString!= null)&&this._occurrenceString.equals(rhs._occurrenceString))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.reaction == rhs.reaction)||((this.reaction!= null)&&this.reaction.equals(rhs.reaction))))&&((this.subpotentReason == rhs.subpotentReason)||((this.subpotentReason!= null)&&this.subpotentReason.equals(rhs.subpotentReason))))&&((this._lotNumber == rhs._lotNumber)||((this._lotNumber!= null)&&this._lotNumber.equals(rhs._lotNumber))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.lotNumber == rhs.lotNumber)||((this.lotNumber!= null)&&this.lotNumber.equals(rhs.lotNumber))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.recorded == rhs.recorded)||((this.recorded!= null)&&this.recorded.equals(rhs.recorded))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.route == rhs.route)||((this.route!= null)&&this.route.equals(rhs.route))))&&((this._primarySource == rhs._primarySource)||((this._primarySource!= null)&&this._primarySource.equals(rhs._primarySource))))&&((this.protocolApplied == rhs.protocolApplied)||((this.protocolApplied!= null)&&this.protocolApplied.equals(rhs.protocolApplied))))&&((this.reportOrigin == rhs.reportOrigin)||((this.reportOrigin!= null)&&this.reportOrigin.equals(rhs.reportOrigin))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this.occurrenceString == rhs.occurrenceString)||((this.occurrenceString!= null)&&this.occurrenceString.equals(rhs.occurrenceString))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fundingSource == rhs.fundingSource)||((this.fundingSource!= null)&&this.fundingSource.equals(rhs.fundingSource))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
