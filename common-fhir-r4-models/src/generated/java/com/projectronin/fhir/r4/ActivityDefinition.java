
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
 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
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
    "kind",
    "_kind",
    "profile",
    "code",
    "intent",
    "_intent",
    "priority",
    "_priority",
    "doNotPerform",
    "_doNotPerform",
    "timingTiming",
    "timingDateTime",
    "_timingDateTime",
    "timingAge",
    "timingPeriod",
    "timingRange",
    "timingDuration",
    "location",
    "participant",
    "productReference",
    "productCodeableConcept",
    "quantity",
    "dosage",
    "bodySite",
    "specimenRequirement",
    "observationRequirement",
    "observationResultRequirement",
    "transform",
    "dynamicValue"
})
@Generated("jsonschema2pojo")
public class ActivityDefinition
    extends DomainResource
{

    /**
     * This is a ActivityDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ActivityDefinition resource")
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
     * A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
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
     * The status of this activity definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this activity definition. Enables tracking the life-cycle of the content.")
    private ActivityDefinition.Status status;
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate activity definition instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate activity definition instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the activity definition is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the activity definition is intended to be used.")
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
     * Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.")
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
     * A reference to a Library resource containing any formal logic used by the activity definition.
     * 
     */
    @JsonProperty("library")
    @JsonPropertyDescription("A reference to a Library resource containing any formal logic used by the activity definition.")
    private List<String> library = new ArrayList<String>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String kind;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _kind;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String profile;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String intent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _intent;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String priority;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _priority;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean doNotPerform;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doNotPerform;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing timingTiming;
    /**
     * The period, timing or frequency upon which the described activity is to occur.
     * 
     */
    @JsonProperty("timingDateTime")
    @JsonPropertyDescription("The period, timing or frequency upon which the described activity is to occur.")
    private String timingDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timingDateTime;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("timingAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age timingAge;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period timingPeriod;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("timingRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range timingRange;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("timingDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration timingDuration;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * Indicates who should participate in performing the action described.
     * 
     */
    @JsonProperty("participant")
    @JsonPropertyDescription("Indicates who should participate in performing the action described.")
    private List<ActivityDefinition_Participant> participant = new ArrayList<ActivityDefinition_Participant>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("productReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference productReference;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept productCodeableConcept;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.
     * 
     */
    @JsonProperty("dosage")
    @JsonPropertyDescription("Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.")
    private List<Dosage> dosage = new ArrayList<Dosage>();
    /**
     * Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).")
    private List<CodeableConcept> bodySite = new ArrayList<CodeableConcept>();
    /**
     * Defines specimen requirements for the action to be performed, such as required specimens for a lab test.
     * 
     */
    @JsonProperty("specimenRequirement")
    @JsonPropertyDescription("Defines specimen requirements for the action to be performed, such as required specimens for a lab test.")
    private List<Reference> specimenRequirement = new ArrayList<Reference>();
    /**
     * Defines observation requirements for the action to be performed, such as body weight or surface area.
     * 
     */
    @JsonProperty("observationRequirement")
    @JsonPropertyDescription("Defines observation requirements for the action to be performed, such as body weight or surface area.")
    private List<Reference> observationRequirement = new ArrayList<Reference>();
    /**
     * Defines the observations that are expected to be produced by the action.
     * 
     */
    @JsonProperty("observationResultRequirement")
    @JsonPropertyDescription("Defines the observations that are expected to be produced by the action.")
    private List<Reference> observationResultRequirement = new ArrayList<Reference>();
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("transform")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String transform;
    /**
     * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the request resource that would contain the result.
     * 
     */
    @JsonProperty("dynamicValue")
    @JsonPropertyDescription("Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the request resource that would contain the result.")
    private List<ActivityDefinition_DynamicValue> dynamicValue = new ArrayList<ActivityDefinition_DynamicValue>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ActivityDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ActivityDefinition resource
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
     * A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
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
     * The status of this activity definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public ActivityDefinition.Status getStatus() {
        return status;
    }

    /**
     * The status of this activity definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ActivityDefinition.Status status) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate activity definition instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate activity definition instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the activity definition is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the activity definition is intended to be used.
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
     * Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.
     * 
     */
    @JsonProperty("topic")
    public List<CodeableConcept> getTopic() {
        return topic;
    }

    /**
     * Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.
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
     * A reference to a Library resource containing any formal logic used by the activity definition.
     * 
     */
    @JsonProperty("library")
    public List<String> getLibrary() {
        return library;
    }

    /**
     * A reference to a Library resource containing any formal logic used by the activity definition.
     * 
     */
    @JsonProperty("library")
    public void setLibrary(List<String> library) {
        this.library = library;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    public Element get_kind() {
        return _kind;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    public void set_kind(Element _kind) {
        this._kind = _kind;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public Element get_intent() {
        return _intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public void set_intent(Element _intent) {
        this._intent = _intent;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public Element get_priority() {
        return _priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public void set_priority(Element _priority) {
        this._priority = _priority;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    public Boolean getDoNotPerform() {
        return doNotPerform;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Boolean doNotPerform) {
        this.doNotPerform = doNotPerform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    public Element get_doNotPerform() {
        return _doNotPerform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    public void set_doNotPerform(Element _doNotPerform) {
        this._doNotPerform = _doNotPerform;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public Timing getTimingTiming() {
        return timingTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public void setTimingTiming(Timing timingTiming) {
        this.timingTiming = timingTiming;
    }

    /**
     * The period, timing or frequency upon which the described activity is to occur.
     * 
     */
    @JsonProperty("timingDateTime")
    public String getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * The period, timing or frequency upon which the described activity is to occur.
     * 
     */
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(String timingDateTime) {
        this.timingDateTime = timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public Element get_timingDateTime() {
        return _timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public void set_timingDateTime(Element _timingDateTime) {
        this._timingDateTime = _timingDateTime;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("timingAge")
    public Age getTimingAge() {
        return timingAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("timingAge")
    public void setTimingAge(Age timingAge) {
        this.timingAge = timingAge;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Period timingPeriod) {
        this.timingPeriod = timingPeriod;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("timingRange")
    public Range getTimingRange() {
        return timingRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("timingRange")
    public void setTimingRange(Range timingRange) {
        this.timingRange = timingRange;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("timingDuration")
    public Duration getTimingDuration() {
        return timingDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("timingDuration")
    public void setTimingDuration(Duration timingDuration) {
        this.timingDuration = timingDuration;
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
     * Indicates who should participate in performing the action described.
     * 
     */
    @JsonProperty("participant")
    public List<ActivityDefinition_Participant> getParticipant() {
        return participant;
    }

    /**
     * Indicates who should participate in performing the action described.
     * 
     */
    @JsonProperty("participant")
    public void setParticipant(List<ActivityDefinition_Participant> participant) {
        this.participant = participant;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("productReference")
    public Reference getProductReference() {
        return productReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("productReference")
    public void setProductReference(Reference productReference) {
        this.productReference = productReference;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCodeableConcept")
    public CodeableConcept getProductCodeableConcept() {
        return productCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(CodeableConcept productCodeableConcept) {
        this.productCodeableConcept = productCodeableConcept;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.
     * 
     */
    @JsonProperty("dosage")
    public List<Dosage> getDosage() {
        return dosage;
    }

    /**
     * Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.
     * 
     */
    @JsonProperty("dosage")
    public void setDosage(List<Dosage> dosage) {
        this.dosage = dosage;
    }

    /**
     * Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
     * 
     */
    @JsonProperty("bodySite")
    public List<CodeableConcept> getBodySite() {
        return bodySite;
    }

    /**
     * Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(List<CodeableConcept> bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * Defines specimen requirements for the action to be performed, such as required specimens for a lab test.
     * 
     */
    @JsonProperty("specimenRequirement")
    public List<Reference> getSpecimenRequirement() {
        return specimenRequirement;
    }

    /**
     * Defines specimen requirements for the action to be performed, such as required specimens for a lab test.
     * 
     */
    @JsonProperty("specimenRequirement")
    public void setSpecimenRequirement(List<Reference> specimenRequirement) {
        this.specimenRequirement = specimenRequirement;
    }

    /**
     * Defines observation requirements for the action to be performed, such as body weight or surface area.
     * 
     */
    @JsonProperty("observationRequirement")
    public List<Reference> getObservationRequirement() {
        return observationRequirement;
    }

    /**
     * Defines observation requirements for the action to be performed, such as body weight or surface area.
     * 
     */
    @JsonProperty("observationRequirement")
    public void setObservationRequirement(List<Reference> observationRequirement) {
        this.observationRequirement = observationRequirement;
    }

    /**
     * Defines the observations that are expected to be produced by the action.
     * 
     */
    @JsonProperty("observationResultRequirement")
    public List<Reference> getObservationResultRequirement() {
        return observationResultRequirement;
    }

    /**
     * Defines the observations that are expected to be produced by the action.
     * 
     */
    @JsonProperty("observationResultRequirement")
    public void setObservationResultRequirement(List<Reference> observationResultRequirement) {
        this.observationResultRequirement = observationResultRequirement;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("transform")
    public String getTransform() {
        return transform;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("transform")
    public void setTransform(String transform) {
        this.transform = transform;
    }

    /**
     * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the request resource that would contain the result.
     * 
     */
    @JsonProperty("dynamicValue")
    public List<ActivityDefinition_DynamicValue> getDynamicValue() {
        return dynamicValue;
    }

    /**
     * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the request resource that would contain the result.
     * 
     */
    @JsonProperty("dynamicValue")
    public void setDynamicValue(List<ActivityDefinition_DynamicValue> dynamicValue) {
        this.dynamicValue = dynamicValue;
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
        sb.append(ActivityDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("_kind");
        sb.append('=');
        sb.append(((this._kind == null)?"<null>":this._kind));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("intent");
        sb.append('=');
        sb.append(((this.intent == null)?"<null>":this.intent));
        sb.append(',');
        sb.append("_intent");
        sb.append('=');
        sb.append(((this._intent == null)?"<null>":this._intent));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("_priority");
        sb.append('=');
        sb.append(((this._priority == null)?"<null>":this._priority));
        sb.append(',');
        sb.append("doNotPerform");
        sb.append('=');
        sb.append(((this.doNotPerform == null)?"<null>":this.doNotPerform));
        sb.append(',');
        sb.append("_doNotPerform");
        sb.append('=');
        sb.append(((this._doNotPerform == null)?"<null>":this._doNotPerform));
        sb.append(',');
        sb.append("timingTiming");
        sb.append('=');
        sb.append(((this.timingTiming == null)?"<null>":this.timingTiming));
        sb.append(',');
        sb.append("timingDateTime");
        sb.append('=');
        sb.append(((this.timingDateTime == null)?"<null>":this.timingDateTime));
        sb.append(',');
        sb.append("_timingDateTime");
        sb.append('=');
        sb.append(((this._timingDateTime == null)?"<null>":this._timingDateTime));
        sb.append(',');
        sb.append("timingAge");
        sb.append('=');
        sb.append(((this.timingAge == null)?"<null>":this.timingAge));
        sb.append(',');
        sb.append("timingPeriod");
        sb.append('=');
        sb.append(((this.timingPeriod == null)?"<null>":this.timingPeriod));
        sb.append(',');
        sb.append("timingRange");
        sb.append('=');
        sb.append(((this.timingRange == null)?"<null>":this.timingRange));
        sb.append(',');
        sb.append("timingDuration");
        sb.append('=');
        sb.append(((this.timingDuration == null)?"<null>":this.timingDuration));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("participant");
        sb.append('=');
        sb.append(((this.participant == null)?"<null>":this.participant));
        sb.append(',');
        sb.append("productReference");
        sb.append('=');
        sb.append(((this.productReference == null)?"<null>":this.productReference));
        sb.append(',');
        sb.append("productCodeableConcept");
        sb.append('=');
        sb.append(((this.productCodeableConcept == null)?"<null>":this.productCodeableConcept));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("dosage");
        sb.append('=');
        sb.append(((this.dosage == null)?"<null>":this.dosage));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("specimenRequirement");
        sb.append('=');
        sb.append(((this.specimenRequirement == null)?"<null>":this.specimenRequirement));
        sb.append(',');
        sb.append("observationRequirement");
        sb.append('=');
        sb.append(((this.observationRequirement == null)?"<null>":this.observationRequirement));
        sb.append(',');
        sb.append("observationResultRequirement");
        sb.append('=');
        sb.append(((this.observationResultRequirement == null)?"<null>":this.observationResultRequirement));
        sb.append(',');
        sb.append("transform");
        sb.append('=');
        sb.append(((this.transform == null)?"<null>":this.transform));
        sb.append(',');
        sb.append("dynamicValue");
        sb.append('=');
        sb.append(((this.dynamicValue == null)?"<null>":this.dynamicValue));
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
        result = ((result* 31)+((this.productReference == null)? 0 :this.productReference.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.participant == null)? 0 :this.participant.hashCode()));
        result = ((result* 31)+((this.observationResultRequirement == null)? 0 :this.observationResultRequirement.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.endorser == null)? 0 :this.endorser.hashCode()));
        result = ((result* 31)+((this.timingAge == null)? 0 :this.timingAge.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.doNotPerform == null)? 0 :this.doNotPerform.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this.timingDuration == null)? 0 :this.timingDuration.hashCode()));
        result = ((result* 31)+((this._kind == null)? 0 :this._kind.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.relatedArtifact == null)? 0 :this.relatedArtifact.hashCode()));
        result = ((result* 31)+((this.effectivePeriod == null)? 0 :this.effectivePeriod.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._lastReviewDate == null)? 0 :this._lastReviewDate.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.timingRange == null)? 0 :this.timingRange.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.lastReviewDate == null)? 0 :this.lastReviewDate.hashCode()));
        result = ((result* 31)+((this.subtitle == null)? 0 :this.subtitle.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.useContext == null)? 0 :this.useContext.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.productCodeableConcept == null)? 0 :this.productCodeableConcept.hashCode()));
        result = ((result* 31)+((this.dosage == null)? 0 :this.dosage.hashCode()));
        result = ((result* 31)+((this.approvalDate == null)? 0 :this.approvalDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._timingDateTime == null)? 0 :this._timingDateTime.hashCode()));
        result = ((result* 31)+((this.subjectCodeableConcept == null)? 0 :this.subjectCodeableConcept.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.specimenRequirement == null)? 0 :this.specimenRequirement.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        result = ((result* 31)+((this.transform == null)? 0 :this.transform.hashCode()));
        result = ((result* 31)+((this.library == null)? 0 :this.library.hashCode()));
        result = ((result* 31)+((this.dynamicValue == null)? 0 :this.dynamicValue.hashCode()));
        result = ((result* 31)+((this._intent == null)? 0 :this._intent.hashCode()));
        result = ((result* 31)+((this._doNotPerform == null)? 0 :this._doNotPerform.hashCode()));
        result = ((result* 31)+((this._usage == null)? 0 :this._usage.hashCode()));
        result = ((result* 31)+((this.editor == null)? 0 :this.editor.hashCode()));
        result = ((result* 31)+((this._subtitle == null)? 0 :this._subtitle.hashCode()));
        result = ((result* 31)+((this.timingTiming == null)? 0 :this.timingTiming.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.timingPeriod == null)? 0 :this.timingPeriod.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.reviewer == null)? 0 :this.reviewer.hashCode()));
        result = ((result* 31)+((this.subjectReference == null)? 0 :this.subjectReference.hashCode()));
        result = ((result* 31)+((this.intent == null)? 0 :this.intent.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.observationRequirement == null)? 0 :this.observationRequirement.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this._publisher == null)? 0 :this._publisher.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.timingDateTime == null)? 0 :this.timingDateTime.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActivityDefinition) == false) {
            return false;
        }
        ActivityDefinition rhs = ((ActivityDefinition) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this._approvalDate == rhs._approvalDate)||((this._approvalDate!= null)&&this._approvalDate.equals(rhs._approvalDate))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.productReference == rhs.productReference)||((this.productReference!= null)&&this.productReference.equals(rhs.productReference))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.participant == rhs.participant)||((this.participant!= null)&&this.participant.equals(rhs.participant))))&&((this.observationResultRequirement == rhs.observationResultRequirement)||((this.observationResultRequirement!= null)&&this.observationResultRequirement.equals(rhs.observationResultRequirement))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.endorser == rhs.endorser)||((this.endorser!= null)&&this.endorser.equals(rhs.endorser))))&&((this.timingAge == rhs.timingAge)||((this.timingAge!= null)&&this.timingAge.equals(rhs.timingAge))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.doNotPerform == rhs.doNotPerform)||((this.doNotPerform!= null)&&this.doNotPerform.equals(rhs.doNotPerform))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this.timingDuration == rhs.timingDuration)||((this.timingDuration!= null)&&this.timingDuration.equals(rhs.timingDuration))))&&((this._kind == rhs._kind)||((this._kind!= null)&&this._kind.equals(rhs._kind))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.relatedArtifact == rhs.relatedArtifact)||((this.relatedArtifact!= null)&&this.relatedArtifact.equals(rhs.relatedArtifact))))&&((this.effectivePeriod == rhs.effectivePeriod)||((this.effectivePeriod!= null)&&this.effectivePeriod.equals(rhs.effectivePeriod))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._lastReviewDate == rhs._lastReviewDate)||((this._lastReviewDate!= null)&&this._lastReviewDate.equals(rhs._lastReviewDate))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.timingRange == rhs.timingRange)||((this.timingRange!= null)&&this.timingRange.equals(rhs.timingRange))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.lastReviewDate == rhs.lastReviewDate)||((this.lastReviewDate!= null)&&this.lastReviewDate.equals(rhs.lastReviewDate))))&&((this.subtitle == rhs.subtitle)||((this.subtitle!= null)&&this.subtitle.equals(rhs.subtitle))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.productCodeableConcept == rhs.productCodeableConcept)||((this.productCodeableConcept!= null)&&this.productCodeableConcept.equals(rhs.productCodeableConcept))))&&((this.dosage == rhs.dosage)||((this.dosage!= null)&&this.dosage.equals(rhs.dosage))))&&((this.approvalDate == rhs.approvalDate)||((this.approvalDate!= null)&&this.approvalDate.equals(rhs.approvalDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._timingDateTime == rhs._timingDateTime)||((this._timingDateTime!= null)&&this._timingDateTime.equals(rhs._timingDateTime))))&&((this.subjectCodeableConcept == rhs.subjectCodeableConcept)||((this.subjectCodeableConcept!= null)&&this.subjectCodeableConcept.equals(rhs.subjectCodeableConcept))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.specimenRequirement == rhs.specimenRequirement)||((this.specimenRequirement!= null)&&this.specimenRequirement.equals(rhs.specimenRequirement))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))))&&((this.transform == rhs.transform)||((this.transform!= null)&&this.transform.equals(rhs.transform))))&&((this.library == rhs.library)||((this.library!= null)&&this.library.equals(rhs.library))))&&((this.dynamicValue == rhs.dynamicValue)||((this.dynamicValue!= null)&&this.dynamicValue.equals(rhs.dynamicValue))))&&((this._intent == rhs._intent)||((this._intent!= null)&&this._intent.equals(rhs._intent))))&&((this._doNotPerform == rhs._doNotPerform)||((this._doNotPerform!= null)&&this._doNotPerform.equals(rhs._doNotPerform))))&&((this._usage == rhs._usage)||((this._usage!= null)&&this._usage.equals(rhs._usage))))&&((this.editor == rhs.editor)||((this.editor!= null)&&this.editor.equals(rhs.editor))))&&((this._subtitle == rhs._subtitle)||((this._subtitle!= null)&&this._subtitle.equals(rhs._subtitle))))&&((this.timingTiming == rhs.timingTiming)||((this.timingTiming!= null)&&this.timingTiming.equals(rhs.timingTiming))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.timingPeriod == rhs.timingPeriod)||((this.timingPeriod!= null)&&this.timingPeriod.equals(rhs.timingPeriod))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.reviewer == rhs.reviewer)||((this.reviewer!= null)&&this.reviewer.equals(rhs.reviewer))))&&((this.subjectReference == rhs.subjectReference)||((this.subjectReference!= null)&&this.subjectReference.equals(rhs.subjectReference))))&&((this.intent == rhs.intent)||((this.intent!= null)&&this.intent.equals(rhs.intent))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.observationRequirement == rhs.observationRequirement)||((this.observationRequirement!= null)&&this.observationRequirement.equals(rhs.observationRequirement))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.timingDateTime == rhs.timingDateTime)||((this.timingDateTime!= null)&&this.timingDateTime.equals(rhs.timingDateTime))));
    }


    /**
     * The status of this activity definition. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, ActivityDefinition.Status> CONSTANTS = new HashMap<String, ActivityDefinition.Status>();

        static {
            for (ActivityDefinition.Status c: values()) {
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
        public static ActivityDefinition.Status fromValue(String value) {
            ActivityDefinition.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
