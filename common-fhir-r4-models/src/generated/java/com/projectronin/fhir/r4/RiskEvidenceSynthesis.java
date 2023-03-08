
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
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
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
    "status",
    "_status",
    "date",
    "_date",
    "publisher",
    "_publisher",
    "contact",
    "description",
    "_description",
    "note",
    "useContext",
    "jurisdiction",
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
    "synthesisType",
    "studyType",
    "population",
    "exposure",
    "outcome",
    "sampleSize",
    "riskEstimate",
    "certainty"
})
@Generated("jsonschema2pojo")
public class RiskEvidenceSynthesis
    extends DomainResource
{

    /**
     * This is a RiskEvidenceSynthesis resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a RiskEvidenceSynthesis resource")
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
     * A formal identifier that is used to identify this risk evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A formal identifier that is used to identify this risk evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.")
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
     * The status of this risk evidence synthesis. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this risk evidence synthesis. Enables tracking the life-cycle of the content.")
    private RiskEvidenceSynthesis.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
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
     * A human-readable string to clarify or explain concepts about the resource.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("A human-readable string to clarify or explain concepts about the resource.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate risk evidence synthesis instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate risk evidence synthesis instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the risk evidence synthesis is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the risk evidence synthesis is intended to be used.")
    private List<CodeableConcept> jurisdiction = new ArrayList<CodeableConcept>();
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
     * Descriptive topics related to the content of the RiskEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("Descriptive topics related to the content of the RiskEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.")
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("synthesisType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept synthesisType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("studyType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept studyType;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("population")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference population;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("exposure")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference exposure;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference outcome;
    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
     * 
     */
    @JsonProperty("sampleSize")
    @JsonPropertyDescription("The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.")
    private RiskEvidenceSynthesis_SampleSize sampleSize;
    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
     * 
     */
    @JsonProperty("riskEstimate")
    @JsonPropertyDescription("The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.")
    private RiskEvidenceSynthesis_RiskEstimate riskEstimate;
    /**
     * A description of the certainty of the risk estimate.
     * 
     */
    @JsonProperty("certainty")
    @JsonPropertyDescription("A description of the certainty of the risk estimate.")
    private List<RiskEvidenceSynthesis_Certainty> certainty = new ArrayList<RiskEvidenceSynthesis_Certainty>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a RiskEvidenceSynthesis resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a RiskEvidenceSynthesis resource
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
     * A formal identifier that is used to identify this risk evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A formal identifier that is used to identify this risk evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.
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
     * The status of this risk evidence synthesis. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public RiskEvidenceSynthesis.Status getStatus() {
        return status;
    }

    /**
     * The status of this risk evidence synthesis. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(RiskEvidenceSynthesis.Status status) {
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
     * A human-readable string to clarify or explain concepts about the resource.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * A human-readable string to clarify or explain concepts about the resource.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate risk evidence synthesis instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate risk evidence synthesis instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the risk evidence synthesis is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the risk evidence synthesis is intended to be used.
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
     * Descriptive topics related to the content of the RiskEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
     * 
     */
    @JsonProperty("topic")
    public List<CodeableConcept> getTopic() {
        return topic;
    }

    /**
     * Descriptive topics related to the content of the RiskEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("synthesisType")
    public CodeableConcept getSynthesisType() {
        return synthesisType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("synthesisType")
    public void setSynthesisType(CodeableConcept synthesisType) {
        this.synthesisType = synthesisType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("studyType")
    public CodeableConcept getStudyType() {
        return studyType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("studyType")
    public void setStudyType(CodeableConcept studyType) {
        this.studyType = studyType;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("population")
    public Reference getPopulation() {
        return population;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("population")
    public void setPopulation(Reference population) {
        this.population = population;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("exposure")
    public Reference getExposure() {
        return exposure;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("exposure")
    public void setExposure(Reference exposure) {
        this.exposure = exposure;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("outcome")
    public Reference getOutcome() {
        return outcome;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(Reference outcome) {
        this.outcome = outcome;
    }

    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
     * 
     */
    @JsonProperty("sampleSize")
    public RiskEvidenceSynthesis_SampleSize getSampleSize() {
        return sampleSize;
    }

    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
     * 
     */
    @JsonProperty("sampleSize")
    public void setSampleSize(RiskEvidenceSynthesis_SampleSize sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
     * 
     */
    @JsonProperty("riskEstimate")
    public RiskEvidenceSynthesis_RiskEstimate getRiskEstimate() {
        return riskEstimate;
    }

    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
     * 
     */
    @JsonProperty("riskEstimate")
    public void setRiskEstimate(RiskEvidenceSynthesis_RiskEstimate riskEstimate) {
        this.riskEstimate = riskEstimate;
    }

    /**
     * A description of the certainty of the risk estimate.
     * 
     */
    @JsonProperty("certainty")
    public List<RiskEvidenceSynthesis_Certainty> getCertainty() {
        return certainty;
    }

    /**
     * A description of the certainty of the risk estimate.
     * 
     */
    @JsonProperty("certainty")
    public void setCertainty(List<RiskEvidenceSynthesis_Certainty> certainty) {
        this.certainty = certainty;
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
        sb.append(RiskEvidenceSynthesis.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
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
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("useContext");
        sb.append('=');
        sb.append(((this.useContext == null)?"<null>":this.useContext));
        sb.append(',');
        sb.append("jurisdiction");
        sb.append('=');
        sb.append(((this.jurisdiction == null)?"<null>":this.jurisdiction));
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
        sb.append("synthesisType");
        sb.append('=');
        sb.append(((this.synthesisType == null)?"<null>":this.synthesisType));
        sb.append(',');
        sb.append("studyType");
        sb.append('=');
        sb.append(((this.studyType == null)?"<null>":this.studyType));
        sb.append(',');
        sb.append("population");
        sb.append('=');
        sb.append(((this.population == null)?"<null>":this.population));
        sb.append(',');
        sb.append("exposure");
        sb.append('=');
        sb.append(((this.exposure == null)?"<null>":this.exposure));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("sampleSize");
        sb.append('=');
        sb.append(((this.sampleSize == null)?"<null>":this.sampleSize));
        sb.append(',');
        sb.append("riskEstimate");
        sb.append('=');
        sb.append(((this.riskEstimate == null)?"<null>":this.riskEstimate));
        sb.append(',');
        sb.append("certainty");
        sb.append('=');
        sb.append(((this.certainty == null)?"<null>":this.certainty));
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
        result = ((result* 31)+((this.copyright == null)? 0 :this.copyright.hashCode()));
        result = ((result* 31)+((this._approvalDate == null)? 0 :this._approvalDate.hashCode()));
        result = ((result* 31)+((this.approvalDate == null)? 0 :this.approvalDate.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.sampleSize == null)? 0 :this.sampleSize.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        result = ((result* 31)+((this.studyType == null)? 0 :this.studyType.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.endorser == null)? 0 :this.endorser.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.riskEstimate == null)? 0 :this.riskEstimate.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.editor == null)? 0 :this.editor.hashCode()));
        result = ((result* 31)+((this.relatedArtifact == null)? 0 :this.relatedArtifact.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.certainty == null)? 0 :this.certainty.hashCode()));
        result = ((result* 31)+((this.reviewer == null)? 0 :this.reviewer.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._lastReviewDate == null)? 0 :this._lastReviewDate.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.population == null)? 0 :this.population.hashCode()));
        result = ((result* 31)+((this.exposure == null)? 0 :this.exposure.hashCode()));
        result = ((result* 31)+((this.lastReviewDate == null)? 0 :this.lastReviewDate.hashCode()));
        result = ((result* 31)+((this.synthesisType == null)? 0 :this.synthesisType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this._publisher == null)? 0 :this._publisher.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.useContext == null)? 0 :this.useContext.hashCode()));
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
        if ((other instanceof RiskEvidenceSynthesis) == false) {
            return false;
        }
        RiskEvidenceSynthesis rhs = ((RiskEvidenceSynthesis) other);
        return ((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this._approvalDate == rhs._approvalDate)||((this._approvalDate!= null)&&this._approvalDate.equals(rhs._approvalDate))))&&((this.approvalDate == rhs.approvalDate)||((this.approvalDate!= null)&&this.approvalDate.equals(rhs.approvalDate))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.sampleSize == rhs.sampleSize)||((this.sampleSize!= null)&&this.sampleSize.equals(rhs.sampleSize))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))))&&((this.studyType == rhs.studyType)||((this.studyType!= null)&&this.studyType.equals(rhs.studyType))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.endorser == rhs.endorser)||((this.endorser!= null)&&this.endorser.equals(rhs.endorser))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.riskEstimate == rhs.riskEstimate)||((this.riskEstimate!= null)&&this.riskEstimate.equals(rhs.riskEstimate))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.editor == rhs.editor)||((this.editor!= null)&&this.editor.equals(rhs.editor))))&&((this.relatedArtifact == rhs.relatedArtifact)||((this.relatedArtifact!= null)&&this.relatedArtifact.equals(rhs.relatedArtifact))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.certainty == rhs.certainty)||((this.certainty!= null)&&this.certainty.equals(rhs.certainty))))&&((this.reviewer == rhs.reviewer)||((this.reviewer!= null)&&this.reviewer.equals(rhs.reviewer))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._lastReviewDate == rhs._lastReviewDate)||((this._lastReviewDate!= null)&&this._lastReviewDate.equals(rhs._lastReviewDate))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.population == rhs.population)||((this.population!= null)&&this.population.equals(rhs.population))))&&((this.exposure == rhs.exposure)||((this.exposure!= null)&&this.exposure.equals(rhs.exposure))))&&((this.lastReviewDate == rhs.lastReviewDate)||((this.lastReviewDate!= null)&&this.lastReviewDate.equals(rhs.lastReviewDate))))&&((this.synthesisType == rhs.synthesisType)||((this.synthesisType!= null)&&this.synthesisType.equals(rhs.synthesisType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The status of this risk evidence synthesis. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, RiskEvidenceSynthesis.Status> CONSTANTS = new HashMap<String, RiskEvidenceSynthesis.Status>();

        static {
            for (RiskEvidenceSynthesis.Status c: values()) {
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
        public static RiskEvidenceSynthesis.Status fromValue(String value) {
            RiskEvidenceSynthesis.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
