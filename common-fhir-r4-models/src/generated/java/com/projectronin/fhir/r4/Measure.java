
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
 * The Measure resource provides the definition of a quality measure.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "url",
    "_url",
    "identifier",
    "version",
    "_version",
    "name",
    "_name",
    "title",
    "_title",
    "subtitle",
    "_subtitle",
    "status",
    "_status",
    "experimental",
    "_experimental",
    "subjectCodeableConcept",
    "subjectReference",
    "date",
    "_date",
    "publisher",
    "_publisher",
    "contact",
    "description",
    "_description",
    "useContext",
    "jurisdiction",
    "purpose",
    "_purpose",
    "usage",
    "_usage",
    "copyright",
    "_copyright",
    "approvalDate",
    "_approvalDate",
    "lastReviewDate",
    "_lastReviewDate",
    "effectivePeriod",
    "topic",
    "author",
    "editor",
    "reviewer",
    "endorser",
    "relatedArtifact",
    "library",
    "disclaimer",
    "_disclaimer",
    "scoring",
    "compositeScoring",
    "type",
    "riskAdjustment",
    "_riskAdjustment",
    "rateAggregation",
    "_rateAggregation",
    "rationale",
    "_rationale",
    "clinicalRecommendationStatement",
    "_clinicalRecommendationStatement",
    "improvementNotation",
    "definition",
    "_definition",
    "guidance",
    "_guidance",
    "group",
    "supplementalData"
})
@Generated("jsonschema2pojo")
public class Measure
    extends DomainResource
{

    /**
     * This is a Measure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Measure resource")
    private String resourceType;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String url;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _url;
    /**
     * A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String version;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_version")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _version;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String title;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _title;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("subtitle")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String subtitle;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subtitle")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _subtitle;
    /**
     * The status of this measure. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this measure. Enables tracking the life-cycle of the content.")
    private Measure.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("experimental")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean experimental;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_experimental")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _experimental;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept subjectCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subjectReference;
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
    @JsonProperty("publisher")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String publisher;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publisher")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _publisher;
    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Contact details to assist a user in finding and communicating with the publisher.")
    private List<ContactDetail> contact = new ArrayList<ContactDetail>();
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate measure instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate measure instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the measure is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the measure is intended to be used.")
    private List<CodeableConcept> jurisdiction = new ArrayList<CodeableConcept>();
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("purpose")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String purpose;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_purpose")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _purpose;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("usage")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String usage;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_usage")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _usage;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("copyright")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String copyright;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_copyright")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _copyright;
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("approvalDate")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String approvalDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_approvalDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _approvalDate;
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastReviewDate")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String lastReviewDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastReviewDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lastReviewDate;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("effectivePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period effectivePeriod;
    /**
     * Descriptive topics related to the content of the measure. Topics provide a high-level categorization grouping types of measures that can be useful for filtering and searching.
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("Descriptive topics related to the content of the measure. Topics provide a high-level categorization grouping types of measures that can be useful for filtering and searching.")
    private List<CodeableConcept> topic = new ArrayList<CodeableConcept>();
    /**
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("An individiual or organization primarily involved in the creation and maintenance of the content.")
    private List<ContactDetail> author = new ArrayList<ContactDetail>();
    /**
     * An individual or organization primarily responsible for internal coherence of the content.
     * 
     */
    @JsonProperty("editor")
    @JsonPropertyDescription("An individual or organization primarily responsible for internal coherence of the content.")
    private List<ContactDetail> editor = new ArrayList<ContactDetail>();
    /**
     * An individual or organization primarily responsible for review of some aspect of the content.
     * 
     */
    @JsonProperty("reviewer")
    @JsonPropertyDescription("An individual or organization primarily responsible for review of some aspect of the content.")
    private List<ContactDetail> reviewer = new ArrayList<ContactDetail>();
    /**
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     * 
     */
    @JsonProperty("endorser")
    @JsonPropertyDescription("An individual or organization responsible for officially endorsing the content for use in some setting.")
    private List<ContactDetail> endorser = new ArrayList<ContactDetail>();
    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("relatedArtifact")
    @JsonPropertyDescription("Related artifacts such as additional documentation, justification, or bibliographic references.")
    private List<RelatedArtifact> relatedArtifact = new ArrayList<RelatedArtifact>();
    /**
     * A reference to a Library resource containing the formal logic used by the measure.
     * 
     */
    @JsonProperty("library")
    @JsonPropertyDescription("A reference to a Library resource containing the formal logic used by the measure.")
    private List<String> library = new ArrayList<String>();
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("disclaimer")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String disclaimer;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disclaimer")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _disclaimer;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scoring")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept scoring;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("compositeScoring")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept compositeScoring;
    /**
     * Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("riskAdjustment")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String riskAdjustment;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_riskAdjustment")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _riskAdjustment;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("rateAggregation")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String rateAggregation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rateAggregation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _rateAggregation;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("rationale")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String rationale;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rationale")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _rationale;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("clinicalRecommendationStatement")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String clinicalRecommendationStatement;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_clinicalRecommendationStatement")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _clinicalRecommendationStatement;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("improvementNotation")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept improvementNotation;
    /**
     * Provides a description of an individual term used within the measure.
     * 
     */
    @JsonProperty("definition")
    @JsonPropertyDescription("Provides a description of an individual term used within the measure.")
    private List<String> definition = new ArrayList<String>();
    /**
     * Extensions for definition
     * 
     */
    @JsonProperty("_definition")
    @JsonPropertyDescription("Extensions for definition")
    private List<Element> _definition = new ArrayList<Element>();
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("guidance")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String guidance;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_guidance")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _guidance;
    /**
     * A group of population criteria for the measure.
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("A group of population criteria for the measure.")
    private List<Measure_Group> group = new ArrayList<Measure_Group>();
    /**
     * The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
     * 
     */
    @JsonProperty("supplementalData")
    @JsonPropertyDescription("The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.")
    private List<Measure_SupplementalData> supplementalData = new ArrayList<Measure_SupplementalData>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Measure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Measure resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public Element get_url() {
        return _url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public void set_url(Element _url) {
        this._url = _url;
    }

    /**
     * A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_version")
    public Element get_version() {
        return _version;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_version")
    public void set_version(Element _version) {
        this._version = _version;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public Element get_title() {
        return _title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public void set_title(Element _title) {
        this._title = _title;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subtitle")
    public Element get_subtitle() {
        return _subtitle;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_subtitle")
    public void set_subtitle(Element _subtitle) {
        this._subtitle = _subtitle;
    }

    /**
     * The status of this measure. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public Measure.Status getStatus() {
        return status;
    }

    /**
     * The status of this measure. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Measure.Status status) {
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("experimental")
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("experimental")
    public void setExperimental(Boolean experimental) {
        this.experimental = experimental;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_experimental")
    public Element get_experimental() {
        return _experimental;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_experimental")
    public void set_experimental(Element _experimental) {
        this._experimental = _experimental;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    public CodeableConcept getSubjectCodeableConcept() {
        return subjectCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
        this.subjectCodeableConcept = subjectCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    public Reference getSubjectReference() {
        return subjectReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    public void setSubjectReference(Reference subjectReference) {
        this.subjectReference = subjectReference;
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
    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publisher")
    public Element get_publisher() {
        return _publisher;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publisher")
    public void set_publisher(Element _publisher) {
        this._publisher = _publisher;
    }

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     * 
     */
    @JsonProperty("contact")
    public List<ContactDetail> getContact() {
        return contact;
    }

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<ContactDetail> contact) {
        this.contact = contact;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate measure instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate measure instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the measure is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the measure is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public void setJurisdiction(List<CodeableConcept> jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_purpose")
    public Element get_purpose() {
        return _purpose;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_purpose")
    public void set_purpose(Element _purpose) {
        this._purpose = _purpose;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("usage")
    public String getUsage() {
        return usage;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("usage")
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_usage")
    public Element get_usage() {
        return _usage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_usage")
    public void set_usage(Element _usage) {
        this._usage = _usage;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_copyright")
    public Element get_copyright() {
        return _copyright;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_copyright")
    public void set_copyright(Element _copyright) {
        this._copyright = _copyright;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("approvalDate")
    public String getApprovalDate() {
        return approvalDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("approvalDate")
    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_approvalDate")
    public Element get_approvalDate() {
        return _approvalDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_approvalDate")
    public void set_approvalDate(Element _approvalDate) {
        this._approvalDate = _approvalDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastReviewDate")
    public String getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(String lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastReviewDate")
    public Element get_lastReviewDate() {
        return _lastReviewDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastReviewDate")
    public void set_lastReviewDate(Element _lastReviewDate) {
        this._lastReviewDate = _lastReviewDate;
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
     * Descriptive topics related to the content of the measure. Topics provide a high-level categorization grouping types of measures that can be useful for filtering and searching.
     * 
     */
    @JsonProperty("topic")
    public List<CodeableConcept> getTopic() {
        return topic;
    }

    /**
     * Descriptive topics related to the content of the measure. Topics provide a high-level categorization grouping types of measures that can be useful for filtering and searching.
     * 
     */
    @JsonProperty("topic")
    public void setTopic(List<CodeableConcept> topic) {
        this.topic = topic;
    }

    /**
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     * 
     */
    @JsonProperty("author")
    public List<ContactDetail> getAuthor() {
        return author;
    }

    /**
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(List<ContactDetail> author) {
        this.author = author;
    }

    /**
     * An individual or organization primarily responsible for internal coherence of the content.
     * 
     */
    @JsonProperty("editor")
    public List<ContactDetail> getEditor() {
        return editor;
    }

    /**
     * An individual or organization primarily responsible for internal coherence of the content.
     * 
     */
    @JsonProperty("editor")
    public void setEditor(List<ContactDetail> editor) {
        this.editor = editor;
    }

    /**
     * An individual or organization primarily responsible for review of some aspect of the content.
     * 
     */
    @JsonProperty("reviewer")
    public List<ContactDetail> getReviewer() {
        return reviewer;
    }

    /**
     * An individual or organization primarily responsible for review of some aspect of the content.
     * 
     */
    @JsonProperty("reviewer")
    public void setReviewer(List<ContactDetail> reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     * 
     */
    @JsonProperty("endorser")
    public List<ContactDetail> getEndorser() {
        return endorser;
    }

    /**
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     * 
     */
    @JsonProperty("endorser")
    public void setEndorser(List<ContactDetail> endorser) {
        this.endorser = endorser;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("relatedArtifact")
    public List<RelatedArtifact> getRelatedArtifact() {
        return relatedArtifact;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(List<RelatedArtifact> relatedArtifact) {
        this.relatedArtifact = relatedArtifact;
    }

    /**
     * A reference to a Library resource containing the formal logic used by the measure.
     * 
     */
    @JsonProperty("library")
    public List<String> getLibrary() {
        return library;
    }

    /**
     * A reference to a Library resource containing the formal logic used by the measure.
     * 
     */
    @JsonProperty("library")
    public void setLibrary(List<String> library) {
        this.library = library;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("disclaimer")
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("disclaimer")
    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disclaimer")
    public Element get_disclaimer() {
        return _disclaimer;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disclaimer")
    public void set_disclaimer(Element _disclaimer) {
        this._disclaimer = _disclaimer;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scoring")
    public CodeableConcept getScoring() {
        return scoring;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scoring")
    public void setScoring(CodeableConcept scoring) {
        this.scoring = scoring;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("compositeScoring")
    public CodeableConcept getCompositeScoring() {
        return compositeScoring;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("compositeScoring")
    public void setCompositeScoring(CodeableConcept compositeScoring) {
        this.compositeScoring = compositeScoring;
    }

    /**
     * Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("riskAdjustment")
    public String getRiskAdjustment() {
        return riskAdjustment;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("riskAdjustment")
    public void setRiskAdjustment(String riskAdjustment) {
        this.riskAdjustment = riskAdjustment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_riskAdjustment")
    public Element get_riskAdjustment() {
        return _riskAdjustment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_riskAdjustment")
    public void set_riskAdjustment(Element _riskAdjustment) {
        this._riskAdjustment = _riskAdjustment;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("rateAggregation")
    public String getRateAggregation() {
        return rateAggregation;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("rateAggregation")
    public void setRateAggregation(String rateAggregation) {
        this.rateAggregation = rateAggregation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rateAggregation")
    public Element get_rateAggregation() {
        return _rateAggregation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rateAggregation")
    public void set_rateAggregation(Element _rateAggregation) {
        this._rateAggregation = _rateAggregation;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("rationale")
    public String getRationale() {
        return rationale;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("rationale")
    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rationale")
    public Element get_rationale() {
        return _rationale;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rationale")
    public void set_rationale(Element _rationale) {
        this._rationale = _rationale;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("clinicalRecommendationStatement")
    public String getClinicalRecommendationStatement() {
        return clinicalRecommendationStatement;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("clinicalRecommendationStatement")
    public void setClinicalRecommendationStatement(String clinicalRecommendationStatement) {
        this.clinicalRecommendationStatement = clinicalRecommendationStatement;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_clinicalRecommendationStatement")
    public Element get_clinicalRecommendationStatement() {
        return _clinicalRecommendationStatement;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_clinicalRecommendationStatement")
    public void set_clinicalRecommendationStatement(Element _clinicalRecommendationStatement) {
        this._clinicalRecommendationStatement = _clinicalRecommendationStatement;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("improvementNotation")
    public CodeableConcept getImprovementNotation() {
        return improvementNotation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("improvementNotation")
    public void setImprovementNotation(CodeableConcept improvementNotation) {
        this.improvementNotation = improvementNotation;
    }

    /**
     * Provides a description of an individual term used within the measure.
     * 
     */
    @JsonProperty("definition")
    public List<String> getDefinition() {
        return definition;
    }

    /**
     * Provides a description of an individual term used within the measure.
     * 
     */
    @JsonProperty("definition")
    public void setDefinition(List<String> definition) {
        this.definition = definition;
    }

    /**
     * Extensions for definition
     * 
     */
    @JsonProperty("_definition")
    public List<Element> get_definition() {
        return _definition;
    }

    /**
     * Extensions for definition
     * 
     */
    @JsonProperty("_definition")
    public void set_definition(List<Element> _definition) {
        this._definition = _definition;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("guidance")
    public String getGuidance() {
        return guidance;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("guidance")
    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_guidance")
    public Element get_guidance() {
        return _guidance;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_guidance")
    public void set_guidance(Element _guidance) {
        this._guidance = _guidance;
    }

    /**
     * A group of population criteria for the measure.
     * 
     */
    @JsonProperty("group")
    public List<Measure_Group> getGroup() {
        return group;
    }

    /**
     * A group of population criteria for the measure.
     * 
     */
    @JsonProperty("group")
    public void setGroup(List<Measure_Group> group) {
        this.group = group;
    }

    /**
     * The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
     * 
     */
    @JsonProperty("supplementalData")
    public List<Measure_SupplementalData> getSupplementalData() {
        return supplementalData;
    }

    /**
     * The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
     * 
     */
    @JsonProperty("supplementalData")
    public void setSupplementalData(List<Measure_SupplementalData> supplementalData) {
        this.supplementalData = supplementalData;
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
        sb.append(Measure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("_version");
        sb.append('=');
        sb.append(((this._version == null)?"<null>":this._version));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("_title");
        sb.append('=');
        sb.append(((this._title == null)?"<null>":this._title));
        sb.append(',');
        sb.append("subtitle");
        sb.append('=');
        sb.append(((this.subtitle == null)?"<null>":this.subtitle));
        sb.append(',');
        sb.append("_subtitle");
        sb.append('=');
        sb.append(((this._subtitle == null)?"<null>":this._subtitle));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("experimental");
        sb.append('=');
        sb.append(((this.experimental == null)?"<null>":this.experimental));
        sb.append(',');
        sb.append("_experimental");
        sb.append('=');
        sb.append(((this._experimental == null)?"<null>":this._experimental));
        sb.append(',');
        sb.append("subjectCodeableConcept");
        sb.append('=');
        sb.append(((this.subjectCodeableConcept == null)?"<null>":this.subjectCodeableConcept));
        sb.append(',');
        sb.append("subjectReference");
        sb.append('=');
        sb.append(((this.subjectReference == null)?"<null>":this.subjectReference));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("_publisher");
        sb.append('=');
        sb.append(((this._publisher == null)?"<null>":this._publisher));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("useContext");
        sb.append('=');
        sb.append(((this.useContext == null)?"<null>":this.useContext));
        sb.append(',');
        sb.append("jurisdiction");
        sb.append('=');
        sb.append(((this.jurisdiction == null)?"<null>":this.jurisdiction));
        sb.append(',');
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("_purpose");
        sb.append('=');
        sb.append(((this._purpose == null)?"<null>":this._purpose));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        sb.append("_usage");
        sb.append('=');
        sb.append(((this._usage == null)?"<null>":this._usage));
        sb.append(',');
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null)?"<null>":this.copyright));
        sb.append(',');
        sb.append("_copyright");
        sb.append('=');
        sb.append(((this._copyright == null)?"<null>":this._copyright));
        sb.append(',');
        sb.append("approvalDate");
        sb.append('=');
        sb.append(((this.approvalDate == null)?"<null>":this.approvalDate));
        sb.append(',');
        sb.append("_approvalDate");
        sb.append('=');
        sb.append(((this._approvalDate == null)?"<null>":this._approvalDate));
        sb.append(',');
        sb.append("lastReviewDate");
        sb.append('=');
        sb.append(((this.lastReviewDate == null)?"<null>":this.lastReviewDate));
        sb.append(',');
        sb.append("_lastReviewDate");
        sb.append('=');
        sb.append(((this._lastReviewDate == null)?"<null>":this._lastReviewDate));
        sb.append(',');
        sb.append("effectivePeriod");
        sb.append('=');
        sb.append(((this.effectivePeriod == null)?"<null>":this.effectivePeriod));
        sb.append(',');
        sb.append("topic");
        sb.append('=');
        sb.append(((this.topic == null)?"<null>":this.topic));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("editor");
        sb.append('=');
        sb.append(((this.editor == null)?"<null>":this.editor));
        sb.append(',');
        sb.append("reviewer");
        sb.append('=');
        sb.append(((this.reviewer == null)?"<null>":this.reviewer));
        sb.append(',');
        sb.append("endorser");
        sb.append('=');
        sb.append(((this.endorser == null)?"<null>":this.endorser));
        sb.append(',');
        sb.append("relatedArtifact");
        sb.append('=');
        sb.append(((this.relatedArtifact == null)?"<null>":this.relatedArtifact));
        sb.append(',');
        sb.append("library");
        sb.append('=');
        sb.append(((this.library == null)?"<null>":this.library));
        sb.append(',');
        sb.append("disclaimer");
        sb.append('=');
        sb.append(((this.disclaimer == null)?"<null>":this.disclaimer));
        sb.append(',');
        sb.append("_disclaimer");
        sb.append('=');
        sb.append(((this._disclaimer == null)?"<null>":this._disclaimer));
        sb.append(',');
        sb.append("scoring");
        sb.append('=');
        sb.append(((this.scoring == null)?"<null>":this.scoring));
        sb.append(',');
        sb.append("compositeScoring");
        sb.append('=');
        sb.append(((this.compositeScoring == null)?"<null>":this.compositeScoring));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("riskAdjustment");
        sb.append('=');
        sb.append(((this.riskAdjustment == null)?"<null>":this.riskAdjustment));
        sb.append(',');
        sb.append("_riskAdjustment");
        sb.append('=');
        sb.append(((this._riskAdjustment == null)?"<null>":this._riskAdjustment));
        sb.append(',');
        sb.append("rateAggregation");
        sb.append('=');
        sb.append(((this.rateAggregation == null)?"<null>":this.rateAggregation));
        sb.append(',');
        sb.append("_rateAggregation");
        sb.append('=');
        sb.append(((this._rateAggregation == null)?"<null>":this._rateAggregation));
        sb.append(',');
        sb.append("rationale");
        sb.append('=');
        sb.append(((this.rationale == null)?"<null>":this.rationale));
        sb.append(',');
        sb.append("_rationale");
        sb.append('=');
        sb.append(((this._rationale == null)?"<null>":this._rationale));
        sb.append(',');
        sb.append("clinicalRecommendationStatement");
        sb.append('=');
        sb.append(((this.clinicalRecommendationStatement == null)?"<null>":this.clinicalRecommendationStatement));
        sb.append(',');
        sb.append("_clinicalRecommendationStatement");
        sb.append('=');
        sb.append(((this._clinicalRecommendationStatement == null)?"<null>":this._clinicalRecommendationStatement));
        sb.append(',');
        sb.append("improvementNotation");
        sb.append('=');
        sb.append(((this.improvementNotation == null)?"<null>":this.improvementNotation));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("_definition");
        sb.append('=');
        sb.append(((this._definition == null)?"<null>":this._definition));
        sb.append(',');
        sb.append("guidance");
        sb.append('=');
        sb.append(((this.guidance == null)?"<null>":this.guidance));
        sb.append(',');
        sb.append("_guidance");
        sb.append('=');
        sb.append(((this._guidance == null)?"<null>":this._guidance));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("supplementalData");
        sb.append('=');
        sb.append(((this.supplementalData == null)?"<null>":this.supplementalData));
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
        result = ((result* 31)+((this.copyright == null)? 0 :this.copyright.hashCode()));
        result = ((result* 31)+((this._approvalDate == null)? 0 :this._approvalDate.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.riskAdjustment == null)? 0 :this.riskAdjustment.hashCode()));
        result = ((result* 31)+((this._definition == null)? 0 :this._definition.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.endorser == null)? 0 :this.endorser.hashCode()));
        result = ((result* 31)+((this._disclaimer == null)? 0 :this._disclaimer.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.relatedArtifact == null)? 0 :this.relatedArtifact.hashCode()));
        result = ((result* 31)+((this._rationale == null)? 0 :this._rationale.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this.rateAggregation == null)? 0 :this.rateAggregation.hashCode()));
        result = ((result* 31)+((this._guidance == null)? 0 :this._guidance.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.compositeScoring == null)? 0 :this.compositeScoring.hashCode()));
        result = ((result* 31)+((this.supplementalData == null)? 0 :this.supplementalData.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._lastReviewDate == null)? 0 :this._lastReviewDate.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this._clinicalRecommendationStatement == null)? 0 :this._clinicalRecommendationStatement.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.lastReviewDate == null)? 0 :this.lastReviewDate.hashCode()));
        result = ((result* 31)+((this.subtitle == null)? 0 :this.subtitle.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.useContext == null)? 0 :this.useContext.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this._riskAdjustment == null)? 0 :this._riskAdjustment.hashCode()));
        result = ((result* 31)+((this.clinicalRecommendationStatement == null)? 0 :this.clinicalRecommendationStatement.hashCode()));
        result = ((result* 31)+((this.approvalDate == null)? 0 :this.approvalDate.hashCode()));
        result = ((result* 31)+((this.subjectCodeableConcept == null)? 0 :this.subjectCodeableConcept.hashCode()));
        result = ((result* 31)+((this._rateAggregation == null)? 0 :this._rateAggregation.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.improvementNotation == null)? 0 :this.improvementNotation.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        result = ((result* 31)+((this.library == null)? 0 :this.library.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        result = ((result* 31)+((this.disclaimer == null)? 0 :this.disclaimer.hashCode()));
        result = ((result* 31)+((this._usage == null)? 0 :this._usage.hashCode()));
        result = ((result* 31)+((this.editor == null)? 0 :this.editor.hashCode()));
        result = ((result* 31)+((this.scoring == null)? 0 :this.scoring.hashCode()));
        result = ((result* 31)+((this._subtitle == null)? 0 :this._subtitle.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.reviewer == null)? 0 :this.reviewer.hashCode()));
        result = ((result* 31)+((this.subjectReference == null)? 0 :this.subjectReference.hashCode()));
        result = ((result* 31)+((this.rationale == null)? 0 :this.rationale.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.guidance == null)? 0 :this.guidance.hashCode()));
        result = ((result* 31)+((this._publisher == null)? 0 :this._publisher.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Measure) == false) {
            return false;
        }
        Measure rhs = ((Measure) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this._approvalDate == rhs._approvalDate)||((this._approvalDate!= null)&&this._approvalDate.equals(rhs._approvalDate))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.riskAdjustment == rhs.riskAdjustment)||((this.riskAdjustment!= null)&&this.riskAdjustment.equals(rhs.riskAdjustment))))&&((this._definition == rhs._definition)||((this._definition!= null)&&this._definition.equals(rhs._definition))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.endorser == rhs.endorser)||((this.endorser!= null)&&this.endorser.equals(rhs.endorser))))&&((this._disclaimer == rhs._disclaimer)||((this._disclaimer!= null)&&this._disclaimer.equals(rhs._disclaimer))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.relatedArtifact == rhs.relatedArtifact)||((this.relatedArtifact!= null)&&this.relatedArtifact.equals(rhs.relatedArtifact))))&&((this._rationale == rhs._rationale)||((this._rationale!= null)&&this._rationale.equals(rhs._rationale))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this.rateAggregation == rhs.rateAggregation)||((this.rateAggregation!= null)&&this.rateAggregation.equals(rhs.rateAggregation))))&&((this._guidance == rhs._guidance)||((this._guidance!= null)&&this._guidance.equals(rhs._guidance))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.compositeScoring == rhs.compositeScoring)||((this.compositeScoring!= null)&&this.compositeScoring.equals(rhs.compositeScoring))))&&((this.supplementalData == rhs.supplementalData)||((this.supplementalData!= null)&&this.supplementalData.equals(rhs.supplementalData))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._lastReviewDate == rhs._lastReviewDate)||((this._lastReviewDate!= null)&&this._lastReviewDate.equals(rhs._lastReviewDate))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this._clinicalRecommendationStatement == rhs._clinicalRecommendationStatement)||((this._clinicalRecommendationStatement!= null)&&this._clinicalRecommendationStatement.equals(rhs._clinicalRecommendationStatement))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.lastReviewDate == rhs.lastReviewDate)||((this.lastReviewDate!= null)&&this.lastReviewDate.equals(rhs.lastReviewDate))))&&((this.subtitle == rhs.subtitle)||((this.subtitle!= null)&&this.subtitle.equals(rhs.subtitle))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this._riskAdjustment == rhs._riskAdjustment)||((this._riskAdjustment!= null)&&this._riskAdjustment.equals(rhs._riskAdjustment))))&&((this.clinicalRecommendationStatement == rhs.clinicalRecommendationStatement)||((this.clinicalRecommendationStatement!= null)&&this.clinicalRecommendationStatement.equals(rhs.clinicalRecommendationStatement))))&&((this.approvalDate == rhs.approvalDate)||((this.approvalDate!= null)&&this.approvalDate.equals(rhs.approvalDate))))&&((this.subjectCodeableConcept == rhs.subjectCodeableConcept)||((this.subjectCodeableConcept!= null)&&this.subjectCodeableConcept.equals(rhs.subjectCodeableConcept))))&&((this._rateAggregation == rhs._rateAggregation)||((this._rateAggregation!= null)&&this._rateAggregation.equals(rhs._rateAggregation))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.improvementNotation == rhs.improvementNotation)||((this.improvementNotation!= null)&&this.improvementNotation.equals(rhs.improvementNotation))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))))&&((this.library == rhs.library)||((this.library!= null)&&this.library.equals(rhs.library))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this.disclaimer == rhs.disclaimer)||((this.disclaimer!= null)&&this.disclaimer.equals(rhs.disclaimer))))&&((this._usage == rhs._usage)||((this._usage!= null)&&this._usage.equals(rhs._usage))))&&((this.editor == rhs.editor)||((this.editor!= null)&&this.editor.equals(rhs.editor))))&&((this.scoring == rhs.scoring)||((this.scoring!= null)&&this.scoring.equals(rhs.scoring))))&&((this._subtitle == rhs._subtitle)||((this._subtitle!= null)&&this._subtitle.equals(rhs._subtitle))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.reviewer == rhs.reviewer)||((this.reviewer!= null)&&this.reviewer.equals(rhs.reviewer))))&&((this.subjectReference == rhs.subjectReference)||((this.subjectReference!= null)&&this.subjectReference.equals(rhs.subjectReference))))&&((this.rationale == rhs.rationale)||((this.rationale!= null)&&this.rationale.equals(rhs.rationale))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.guidance == rhs.guidance)||((this.guidance!= null)&&this.guidance.equals(rhs.guidance))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * The status of this measure. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Measure.Status> CONSTANTS = new HashMap<String, Measure.Status>();

        static {
            for (Measure.Status c: values()) {
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
        public static Measure.Status fromValue(String value) {
            Measure.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
