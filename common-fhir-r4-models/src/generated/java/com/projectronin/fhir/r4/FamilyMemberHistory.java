
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
 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "status",
    "_status",
    "dataAbsentReason",
    "patient",
    "date",
    "_date",
    "name",
    "_name",
    "relationship",
    "sex",
    "bornPeriod",
    "bornDate",
    "_bornDate",
    "bornString",
    "_bornString",
    "ageAge",
    "ageRange",
    "ageString",
    "_ageString",
    "estimatedAge",
    "_estimatedAge",
    "deceasedBoolean",
    "_deceasedBoolean",
    "deceasedAge",
    "deceasedRange",
    "deceasedDate",
    "_deceasedDate",
    "deceasedString",
    "_deceasedString",
    "reasonCode",
    "reasonReference",
    "note",
    "condition"
})
@Generated("jsonschema2pojo")
public class FamilyMemberHistory
    extends DomainResource
{

    /**
     * This is a FamilyMemberHistory resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a FamilyMemberHistory resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this family member history by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this family member history by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * A code specifying the status of the record of the family history of a specific family member.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A code specifying the status of the record of the family history of a specific family member.")
    private FamilyMemberHistory.Status status;
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
    @JsonProperty("dataAbsentReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept dataAbsentReason;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept relationship;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sex")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept sex;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("bornPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period bornPeriod;
    /**
     * The actual or approximate date of birth of the relative.
     * 
     */
    @JsonProperty("bornDate")
    @JsonPropertyDescription("The actual or approximate date of birth of the relative.")
    private String bornDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_bornDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _bornDate;
    /**
     * The actual or approximate date of birth of the relative.
     * 
     */
    @JsonProperty("bornString")
    @JsonPropertyDescription("The actual or approximate date of birth of the relative.")
    private String bornString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_bornString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _bornString;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("ageAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age ageAge;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("ageRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range ageRange;
    /**
     * The age of the relative at the time the family member history is recorded.
     * 
     */
    @JsonProperty("ageString")
    @JsonPropertyDescription("The age of the relative at the time the family member history is recorded.")
    private String ageString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ageString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _ageString;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("estimatedAge")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean estimatedAge;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_estimatedAge")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _estimatedAge;
    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedBoolean")
    @JsonPropertyDescription("Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.")
    private Boolean deceasedBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _deceasedBoolean;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("deceasedAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age deceasedAge;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("deceasedRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range deceasedRange;
    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedDate")
    @JsonPropertyDescription("Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.")
    private String deceasedDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _deceasedDate;
    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedString")
    @JsonPropertyDescription("Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.")
    private String deceasedString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _deceasedString;
    /**
     * Describes why the family member history occurred in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Describes why the family member history occurred in coded or textual form.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.")
    private List<FamilyMemberHistory_Condition> condition = new ArrayList<FamilyMemberHistory_Condition>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a FamilyMemberHistory resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a FamilyMemberHistory resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this family member history by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this family member history by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
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
     * A code specifying the status of the record of the family history of a specific family member.
     * 
     */
    @JsonProperty("status")
    public FamilyMemberHistory.Status getStatus() {
        return status;
    }

    /**
     * A code specifying the status of the record of the family history of a specific family member.
     * 
     */
    @JsonProperty("status")
    public void setStatus(FamilyMemberHistory.Status status) {
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
    @JsonProperty("dataAbsentReason")
    public CodeableConcept getDataAbsentReason() {
        return dataAbsentReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(CodeableConcept dataAbsentReason) {
        this.dataAbsentReason = dataAbsentReason;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("relationship")
    public CodeableConcept getRelationship() {
        return relationship;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(CodeableConcept relationship) {
        this.relationship = relationship;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sex")
    public CodeableConcept getSex() {
        return sex;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("sex")
    public void setSex(CodeableConcept sex) {
        this.sex = sex;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("bornPeriod")
    public Period getBornPeriod() {
        return bornPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("bornPeriod")
    public void setBornPeriod(Period bornPeriod) {
        this.bornPeriod = bornPeriod;
    }

    /**
     * The actual or approximate date of birth of the relative.
     * 
     */
    @JsonProperty("bornDate")
    public String getBornDate() {
        return bornDate;
    }

    /**
     * The actual or approximate date of birth of the relative.
     * 
     */
    @JsonProperty("bornDate")
    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_bornDate")
    public Element get_bornDate() {
        return _bornDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_bornDate")
    public void set_bornDate(Element _bornDate) {
        this._bornDate = _bornDate;
    }

    /**
     * The actual or approximate date of birth of the relative.
     * 
     */
    @JsonProperty("bornString")
    public String getBornString() {
        return bornString;
    }

    /**
     * The actual or approximate date of birth of the relative.
     * 
     */
    @JsonProperty("bornString")
    public void setBornString(String bornString) {
        this.bornString = bornString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_bornString")
    public Element get_bornString() {
        return _bornString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_bornString")
    public void set_bornString(Element _bornString) {
        this._bornString = _bornString;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("ageAge")
    public Age getAgeAge() {
        return ageAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("ageAge")
    public void setAgeAge(Age ageAge) {
        this.ageAge = ageAge;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("ageRange")
    public Range getAgeRange() {
        return ageRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("ageRange")
    public void setAgeRange(Range ageRange) {
        this.ageRange = ageRange;
    }

    /**
     * The age of the relative at the time the family member history is recorded.
     * 
     */
    @JsonProperty("ageString")
    public String getAgeString() {
        return ageString;
    }

    /**
     * The age of the relative at the time the family member history is recorded.
     * 
     */
    @JsonProperty("ageString")
    public void setAgeString(String ageString) {
        this.ageString = ageString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ageString")
    public Element get_ageString() {
        return _ageString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ageString")
    public void set_ageString(Element _ageString) {
        this._ageString = _ageString;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("estimatedAge")
    public Boolean getEstimatedAge() {
        return estimatedAge;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("estimatedAge")
    public void setEstimatedAge(Boolean estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_estimatedAge")
    public Element get_estimatedAge() {
        return _estimatedAge;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_estimatedAge")
    public void set_estimatedAge(Element _estimatedAge) {
        this._estimatedAge = _estimatedAge;
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedBoolean")
    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedBoolean")
    public void setDeceasedBoolean(Boolean deceasedBoolean) {
        this.deceasedBoolean = deceasedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedBoolean")
    public Element get_deceasedBoolean() {
        return _deceasedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedBoolean")
    public void set_deceasedBoolean(Element _deceasedBoolean) {
        this._deceasedBoolean = _deceasedBoolean;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("deceasedAge")
    public Age getDeceasedAge() {
        return deceasedAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("deceasedAge")
    public void setDeceasedAge(Age deceasedAge) {
        this.deceasedAge = deceasedAge;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("deceasedRange")
    public Range getDeceasedRange() {
        return deceasedRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("deceasedRange")
    public void setDeceasedRange(Range deceasedRange) {
        this.deceasedRange = deceasedRange;
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedDate")
    public String getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedDate")
    public void setDeceasedDate(String deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedDate")
    public Element get_deceasedDate() {
        return _deceasedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedDate")
    public void set_deceasedDate(Element _deceasedDate) {
        this._deceasedDate = _deceasedDate;
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedString")
    public String getDeceasedString() {
        return deceasedString;
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     * 
     */
    @JsonProperty("deceasedString")
    public void setDeceasedString(String deceasedString) {
        this.deceasedString = deceasedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedString")
    public Element get_deceasedString() {
        return _deceasedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedString")
    public void set_deceasedString(Element _deceasedString) {
        this._deceasedString = _deceasedString;
    }

    /**
     * Describes why the family member history occurred in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Describes why the family member history occurred in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * 
     */
    @JsonProperty("condition")
    public List<FamilyMemberHistory_Condition> getCondition() {
        return condition;
    }

    /**
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(List<FamilyMemberHistory_Condition> condition) {
        this.condition = condition;
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
        sb.append(FamilyMemberHistory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("dataAbsentReason");
        sb.append('=');
        sb.append(((this.dataAbsentReason == null)?"<null>":this.dataAbsentReason));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("bornPeriod");
        sb.append('=');
        sb.append(((this.bornPeriod == null)?"<null>":this.bornPeriod));
        sb.append(',');
        sb.append("bornDate");
        sb.append('=');
        sb.append(((this.bornDate == null)?"<null>":this.bornDate));
        sb.append(',');
        sb.append("_bornDate");
        sb.append('=');
        sb.append(((this._bornDate == null)?"<null>":this._bornDate));
        sb.append(',');
        sb.append("bornString");
        sb.append('=');
        sb.append(((this.bornString == null)?"<null>":this.bornString));
        sb.append(',');
        sb.append("_bornString");
        sb.append('=');
        sb.append(((this._bornString == null)?"<null>":this._bornString));
        sb.append(',');
        sb.append("ageAge");
        sb.append('=');
        sb.append(((this.ageAge == null)?"<null>":this.ageAge));
        sb.append(',');
        sb.append("ageRange");
        sb.append('=');
        sb.append(((this.ageRange == null)?"<null>":this.ageRange));
        sb.append(',');
        sb.append("ageString");
        sb.append('=');
        sb.append(((this.ageString == null)?"<null>":this.ageString));
        sb.append(',');
        sb.append("_ageString");
        sb.append('=');
        sb.append(((this._ageString == null)?"<null>":this._ageString));
        sb.append(',');
        sb.append("estimatedAge");
        sb.append('=');
        sb.append(((this.estimatedAge == null)?"<null>":this.estimatedAge));
        sb.append(',');
        sb.append("_estimatedAge");
        sb.append('=');
        sb.append(((this._estimatedAge == null)?"<null>":this._estimatedAge));
        sb.append(',');
        sb.append("deceasedBoolean");
        sb.append('=');
        sb.append(((this.deceasedBoolean == null)?"<null>":this.deceasedBoolean));
        sb.append(',');
        sb.append("_deceasedBoolean");
        sb.append('=');
        sb.append(((this._deceasedBoolean == null)?"<null>":this._deceasedBoolean));
        sb.append(',');
        sb.append("deceasedAge");
        sb.append('=');
        sb.append(((this.deceasedAge == null)?"<null>":this.deceasedAge));
        sb.append(',');
        sb.append("deceasedRange");
        sb.append('=');
        sb.append(((this.deceasedRange == null)?"<null>":this.deceasedRange));
        sb.append(',');
        sb.append("deceasedDate");
        sb.append('=');
        sb.append(((this.deceasedDate == null)?"<null>":this.deceasedDate));
        sb.append(',');
        sb.append("_deceasedDate");
        sb.append('=');
        sb.append(((this._deceasedDate == null)?"<null>":this._deceasedDate));
        sb.append(',');
        sb.append("deceasedString");
        sb.append('=');
        sb.append(((this.deceasedString == null)?"<null>":this.deceasedString));
        sb.append(',');
        sb.append("_deceasedString");
        sb.append('=');
        sb.append(((this._deceasedString == null)?"<null>":this._deceasedString));
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
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
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
        result = ((result* 31)+((this.ageRange == null)? 0 :this.ageRange.hashCode()));
        result = ((result* 31)+((this.dataAbsentReason == null)? 0 :this.dataAbsentReason.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._deceasedString == null)? 0 :this._deceasedString.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this._bornString == null)? 0 :this._bornString.hashCode()));
        result = ((result* 31)+((this.bornString == null)? 0 :this.bornString.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.estimatedAge == null)? 0 :this.estimatedAge.hashCode()));
        result = ((result* 31)+((this._bornDate == null)? 0 :this._bornDate.hashCode()));
        result = ((result* 31)+((this._estimatedAge == null)? 0 :this._estimatedAge.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.deceasedRange == null)? 0 :this.deceasedRange.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this._deceasedBoolean == null)? 0 :this._deceasedBoolean.hashCode()));
        result = ((result* 31)+((this.ageAge == null)? 0 :this.ageAge.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.ageString == null)? 0 :this.ageString.hashCode()));
        result = ((result* 31)+((this._ageString == null)? 0 :this._ageString.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.bornDate == null)? 0 :this.bornDate.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.bornPeriod == null)? 0 :this.bornPeriod.hashCode()));
        result = ((result* 31)+((this.deceasedBoolean == null)? 0 :this.deceasedBoolean.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.deceasedString == null)? 0 :this.deceasedString.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.deceasedDate == null)? 0 :this.deceasedDate.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.deceasedAge == null)? 0 :this.deceasedAge.hashCode()));
        result = ((result* 31)+((this._deceasedDate == null)? 0 :this._deceasedDate.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FamilyMemberHistory) == false) {
            return false;
        }
        FamilyMemberHistory rhs = ((FamilyMemberHistory) other);
        return (((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.ageRange == rhs.ageRange)||((this.ageRange!= null)&&this.ageRange.equals(rhs.ageRange))))&&((this.dataAbsentReason == rhs.dataAbsentReason)||((this.dataAbsentReason!= null)&&this.dataAbsentReason.equals(rhs.dataAbsentReason))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._deceasedString == rhs._deceasedString)||((this._deceasedString!= null)&&this._deceasedString.equals(rhs._deceasedString))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this._bornString == rhs._bornString)||((this._bornString!= null)&&this._bornString.equals(rhs._bornString))))&&((this.bornString == rhs.bornString)||((this.bornString!= null)&&this.bornString.equals(rhs.bornString))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.estimatedAge == rhs.estimatedAge)||((this.estimatedAge!= null)&&this.estimatedAge.equals(rhs.estimatedAge))))&&((this._bornDate == rhs._bornDate)||((this._bornDate!= null)&&this._bornDate.equals(rhs._bornDate))))&&((this._estimatedAge == rhs._estimatedAge)||((this._estimatedAge!= null)&&this._estimatedAge.equals(rhs._estimatedAge))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.deceasedRange == rhs.deceasedRange)||((this.deceasedRange!= null)&&this.deceasedRange.equals(rhs.deceasedRange))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this._deceasedBoolean == rhs._deceasedBoolean)||((this._deceasedBoolean!= null)&&this._deceasedBoolean.equals(rhs._deceasedBoolean))))&&((this.ageAge == rhs.ageAge)||((this.ageAge!= null)&&this.ageAge.equals(rhs.ageAge))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.ageString == rhs.ageString)||((this.ageString!= null)&&this.ageString.equals(rhs.ageString))))&&((this._ageString == rhs._ageString)||((this._ageString!= null)&&this._ageString.equals(rhs._ageString))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.bornDate == rhs.bornDate)||((this.bornDate!= null)&&this.bornDate.equals(rhs.bornDate))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.bornPeriod == rhs.bornPeriod)||((this.bornPeriod!= null)&&this.bornPeriod.equals(rhs.bornPeriod))))&&((this.deceasedBoolean == rhs.deceasedBoolean)||((this.deceasedBoolean!= null)&&this.deceasedBoolean.equals(rhs.deceasedBoolean))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.deceasedString == rhs.deceasedString)||((this.deceasedString!= null)&&this.deceasedString.equals(rhs.deceasedString))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.deceasedDate == rhs.deceasedDate)||((this.deceasedDate!= null)&&this.deceasedDate.equals(rhs.deceasedDate))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.deceasedAge == rhs.deceasedAge)||((this.deceasedAge!= null)&&this.deceasedAge.equals(rhs.deceasedAge))))&&((this._deceasedDate == rhs._deceasedDate)||((this._deceasedDate!= null)&&this._deceasedDate.equals(rhs._deceasedDate))));
    }


    /**
     * A code specifying the status of the record of the family history of a specific family member.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PARTIAL("partial"),
        COMPLETED("completed"),
        ENTERED_IN_ERROR("entered-in-error"),
        HEALTH_UNKNOWN("health-unknown");
        private final String value;
        private final static Map<String, FamilyMemberHistory.Status> CONSTANTS = new HashMap<String, FamilyMemberHistory.Status>();

        static {
            for (FamilyMemberHistory.Status c: values()) {
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
        public static FamilyMemberHistory.Status fromValue(String value) {
            FamilyMemberHistory.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
