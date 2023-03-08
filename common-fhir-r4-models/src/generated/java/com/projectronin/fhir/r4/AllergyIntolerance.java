
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
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "clinicalStatus",
    "verificationStatus",
    "type",
    "_type",
    "category",
    "_category",
    "criticality",
    "_criticality",
    "code",
    "patient",
    "encounter",
    "onsetDateTime",
    "_onsetDateTime",
    "onsetAge",
    "onsetPeriod",
    "onsetRange",
    "onsetString",
    "_onsetString",
    "recordedDate",
    "_recordedDate",
    "recorder",
    "asserter",
    "lastOccurrence",
    "_lastOccurrence",
    "note",
    "reaction"
})
@Generated("jsonschema2pojo")
public class AllergyIntolerance
    extends DomainResource
{

    /**
     * This is a AllergyIntolerance resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a AllergyIntolerance resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this AllergyIntolerance by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this AllergyIntolerance by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
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
     * Identification of the underlying physiological mechanism for the reaction risk.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Identification of the underlying physiological mechanism for the reaction risk.")
    private AllergyIntolerance.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * Category of the identified substance.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Category of the identified substance.")
    private List<Category> category = new ArrayList<Category>();
    /**
     * Extensions for category
     * 
     */
    @JsonProperty("_category")
    @JsonPropertyDescription("Extensions for category")
    private List<Element> _category = new ArrayList<Element>();
    /**
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
     * 
     */
    @JsonProperty("criticality")
    @JsonPropertyDescription("Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.")
    private AllergyIntolerance.Criticality criticality;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_criticality")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _criticality;
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
     * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
     * 
     */
    @JsonProperty("onsetDateTime")
    @JsonPropertyDescription("Estimated or actual date,  date-time, or age when allergy or intolerance was identified.")
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
     * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
     * 
     */
    @JsonProperty("onsetString")
    @JsonPropertyDescription("Estimated or actual date,  date-time, or age when allergy or intolerance was identified.")
    private String onsetString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onsetString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _onsetString;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastOccurrence")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String lastOccurrence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastOccurrence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lastOccurrence;
    /**
     * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Details about each adverse reaction event linked to exposure to the identified substance.
     * 
     */
    @JsonProperty("reaction")
    @JsonPropertyDescription("Details about each adverse reaction event linked to exposure to the identified substance.")
    private List<AllergyIntolerance_Reaction> reaction = new ArrayList<AllergyIntolerance_Reaction>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a AllergyIntolerance resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a AllergyIntolerance resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this AllergyIntolerance by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this AllergyIntolerance by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
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
     * Identification of the underlying physiological mechanism for the reaction risk.
     * 
     */
    @JsonProperty("type")
    public AllergyIntolerance.Type getType() {
        return type;
    }

    /**
     * Identification of the underlying physiological mechanism for the reaction risk.
     * 
     */
    @JsonProperty("type")
    public void setType(AllergyIntolerance.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * Category of the identified substance.
     * 
     */
    @JsonProperty("category")
    public List<Category> getCategory() {
        return category;
    }

    /**
     * Category of the identified substance.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<Category> category) {
        this.category = category;
    }

    /**
     * Extensions for category
     * 
     */
    @JsonProperty("_category")
    public List<Element> get_category() {
        return _category;
    }

    /**
     * Extensions for category
     * 
     */
    @JsonProperty("_category")
    public void set_category(List<Element> _category) {
        this._category = _category;
    }

    /**
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
     * 
     */
    @JsonProperty("criticality")
    public AllergyIntolerance.Criticality getCriticality() {
        return criticality;
    }

    /**
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
     * 
     */
    @JsonProperty("criticality")
    public void setCriticality(AllergyIntolerance.Criticality criticality) {
        this.criticality = criticality;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_criticality")
    public Element get_criticality() {
        return _criticality;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_criticality")
    public void set_criticality(Element _criticality) {
        this._criticality = _criticality;
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
     * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
     * 
     */
    @JsonProperty("onsetDateTime")
    public String getOnsetDateTime() {
        return onsetDateTime;
    }

    /**
     * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
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
     * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
     * 
     */
    @JsonProperty("onsetString")
    public String getOnsetString() {
        return onsetString;
    }

    /**
     * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastOccurrence")
    public String getLastOccurrence() {
        return lastOccurrence;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastOccurrence")
    public void setLastOccurrence(String lastOccurrence) {
        this.lastOccurrence = lastOccurrence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastOccurrence")
    public Element get_lastOccurrence() {
        return _lastOccurrence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastOccurrence")
    public void set_lastOccurrence(Element _lastOccurrence) {
        this._lastOccurrence = _lastOccurrence;
    }

    /**
     * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Details about each adverse reaction event linked to exposure to the identified substance.
     * 
     */
    @JsonProperty("reaction")
    public List<AllergyIntolerance_Reaction> getReaction() {
        return reaction;
    }

    /**
     * Details about each adverse reaction event linked to exposure to the identified substance.
     * 
     */
    @JsonProperty("reaction")
    public void setReaction(List<AllergyIntolerance_Reaction> reaction) {
        this.reaction = reaction;
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
        sb.append(AllergyIntolerance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("_category");
        sb.append('=');
        sb.append(((this._category == null)?"<null>":this._category));
        sb.append(',');
        sb.append("criticality");
        sb.append('=');
        sb.append(((this.criticality == null)?"<null>":this.criticality));
        sb.append(',');
        sb.append("_criticality");
        sb.append('=');
        sb.append(((this._criticality == null)?"<null>":this._criticality));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
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
        sb.append("lastOccurrence");
        sb.append('=');
        sb.append(((this.lastOccurrence == null)?"<null>":this.lastOccurrence));
        sb.append(',');
        sb.append("_lastOccurrence");
        sb.append('=');
        sb.append(((this._lastOccurrence == null)?"<null>":this._lastOccurrence));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("reaction");
        sb.append('=');
        sb.append(((this.reaction == null)?"<null>":this.reaction));
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
        result = ((result* 31)+((this.onsetRange == null)? 0 :this.onsetRange.hashCode()));
        result = ((result* 31)+((this.criticality == null)? 0 :this.criticality.hashCode()));
        result = ((result* 31)+((this.clinicalStatus == null)? 0 :this.clinicalStatus.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.onsetDateTime == null)? 0 :this.onsetDateTime.hashCode()));
        result = ((result* 31)+((this.onsetString == null)? 0 :this.onsetString.hashCode()));
        result = ((result* 31)+((this.onsetAge == null)? 0 :this.onsetAge.hashCode()));
        result = ((result* 31)+((this._onsetString == null)? 0 :this._onsetString.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.lastOccurrence == null)? 0 :this.lastOccurrence.hashCode()));
        result = ((result* 31)+((this._lastOccurrence == null)? 0 :this._lastOccurrence.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.recorder == null)? 0 :this.recorder.hashCode()));
        result = ((result* 31)+((this._criticality == null)? 0 :this._criticality.hashCode()));
        result = ((result* 31)+((this.onsetPeriod == null)? 0 :this.onsetPeriod.hashCode()));
        result = ((result* 31)+((this.reaction == null)? 0 :this.reaction.hashCode()));
        result = ((result* 31)+((this.verificationStatus == null)? 0 :this.verificationStatus.hashCode()));
        result = ((result* 31)+((this._recordedDate == null)? 0 :this._recordedDate.hashCode()));
        result = ((result* 31)+((this.recordedDate == null)? 0 :this.recordedDate.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.asserter == null)? 0 :this.asserter.hashCode()));
        result = ((result* 31)+((this._category == null)? 0 :this._category.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this._onsetDateTime == null)? 0 :this._onsetDateTime.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllergyIntolerance) == false) {
            return false;
        }
        AllergyIntolerance rhs = ((AllergyIntolerance) other);
        return (((((((((((((((((((((((((((((super.equals(rhs)&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.onsetRange == rhs.onsetRange)||((this.onsetRange!= null)&&this.onsetRange.equals(rhs.onsetRange))))&&((this.criticality == rhs.criticality)||((this.criticality!= null)&&this.criticality.equals(rhs.criticality))))&&((this.clinicalStatus == rhs.clinicalStatus)||((this.clinicalStatus!= null)&&this.clinicalStatus.equals(rhs.clinicalStatus))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.onsetDateTime == rhs.onsetDateTime)||((this.onsetDateTime!= null)&&this.onsetDateTime.equals(rhs.onsetDateTime))))&&((this.onsetString == rhs.onsetString)||((this.onsetString!= null)&&this.onsetString.equals(rhs.onsetString))))&&((this.onsetAge == rhs.onsetAge)||((this.onsetAge!= null)&&this.onsetAge.equals(rhs.onsetAge))))&&((this._onsetString == rhs._onsetString)||((this._onsetString!= null)&&this._onsetString.equals(rhs._onsetString))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.lastOccurrence == rhs.lastOccurrence)||((this.lastOccurrence!= null)&&this.lastOccurrence.equals(rhs.lastOccurrence))))&&((this._lastOccurrence == rhs._lastOccurrence)||((this._lastOccurrence!= null)&&this._lastOccurrence.equals(rhs._lastOccurrence))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.recorder == rhs.recorder)||((this.recorder!= null)&&this.recorder.equals(rhs.recorder))))&&((this._criticality == rhs._criticality)||((this._criticality!= null)&&this._criticality.equals(rhs._criticality))))&&((this.onsetPeriod == rhs.onsetPeriod)||((this.onsetPeriod!= null)&&this.onsetPeriod.equals(rhs.onsetPeriod))))&&((this.reaction == rhs.reaction)||((this.reaction!= null)&&this.reaction.equals(rhs.reaction))))&&((this.verificationStatus == rhs.verificationStatus)||((this.verificationStatus!= null)&&this.verificationStatus.equals(rhs.verificationStatus))))&&((this._recordedDate == rhs._recordedDate)||((this._recordedDate!= null)&&this._recordedDate.equals(rhs._recordedDate))))&&((this.recordedDate == rhs.recordedDate)||((this.recordedDate!= null)&&this.recordedDate.equals(rhs.recordedDate))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.asserter == rhs.asserter)||((this.asserter!= null)&&this.asserter.equals(rhs.asserter))))&&((this._category == rhs._category)||((this._category!= null)&&this._category.equals(rhs._category))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this._onsetDateTime == rhs._onsetDateTime)||((this._onsetDateTime!= null)&&this._onsetDateTime.equals(rhs._onsetDateTime))));
    }


    /**
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Criticality {

        LOW("low"),
        HIGH("high"),
        UNABLE_TO_ASSESS("unable-to-assess");
        private final String value;
        private final static Map<String, AllergyIntolerance.Criticality> CONSTANTS = new HashMap<String, AllergyIntolerance.Criticality>();

        static {
            for (AllergyIntolerance.Criticality c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Criticality(String value) {
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
        public static AllergyIntolerance.Criticality fromValue(String value) {
            AllergyIntolerance.Criticality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Identification of the underlying physiological mechanism for the reaction risk.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ALLERGY("allergy"),
        INTOLERANCE("intolerance");
        private final String value;
        private final static Map<String, AllergyIntolerance.Type> CONSTANTS = new HashMap<String, AllergyIntolerance.Type>();

        static {
            for (AllergyIntolerance.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static AllergyIntolerance.Type fromValue(String value) {
            AllergyIntolerance.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
