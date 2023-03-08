
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
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
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
    "experimental",
    "_experimental",
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
    "copyright",
    "_copyright",
    "caseSensitive",
    "_caseSensitive",
    "valueSet",
    "hierarchyMeaning",
    "_hierarchyMeaning",
    "compositional",
    "_compositional",
    "versionNeeded",
    "_versionNeeded",
    "content",
    "_content",
    "supplements",
    "count",
    "_count",
    "filter",
    "property",
    "concept"
})
@Generated("jsonschema2pojo")
public class CodeSystem
    extends DomainResource
{

    /**
     * This is a CodeSystem resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a CodeSystem resource")
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
     * A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.")
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
     * The date (and optionally time) when the code system resource was created or revised.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The date (and optionally time) when the code system resource was created or revised.")
    private CodeSystem.Status status;
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate code system instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate code system instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the code system is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the code system is intended to be used.")
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("caseSensitive")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean caseSensitive;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_caseSensitive")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _caseSensitive;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("valueSet")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String valueSet;
    /**
     * The meaning of the hierarchy of concepts as represented in this resource.
     * 
     */
    @JsonProperty("hierarchyMeaning")
    @JsonPropertyDescription("The meaning of the hierarchy of concepts as represented in this resource.")
    private CodeSystem.HierarchyMeaning hierarchyMeaning;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hierarchyMeaning")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _hierarchyMeaning;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("compositional")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean compositional;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compositional")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _compositional;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("versionNeeded")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean versionNeeded;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versionNeeded")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _versionNeeded;
    /**
     * The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.")
    private CodeSystem.Content content;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_content")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _content;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("supplements")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String supplements;
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double count;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_count")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _count;
    /**
     * A filter that can be used in a value set compose statement when selecting concepts using a filter.
     * 
     */
    @JsonProperty("filter")
    @JsonPropertyDescription("A filter that can be used in a value set compose statement when selecting concepts using a filter.")
    private List<CodeSystem_Filter> filter = new ArrayList<CodeSystem_Filter>();
    /**
     * A property defines an additional slot through which additional information can be provided about a concept.
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("A property defines an additional slot through which additional information can be provided about a concept.")
    private List<CodeSystem_Property> property = new ArrayList<CodeSystem_Property>();
    /**
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.
     * 
     */
    @JsonProperty("concept")
    @JsonPropertyDescription("Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.")
    private List<CodeSystem_Concept> concept = new ArrayList<CodeSystem_Concept>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a CodeSystem resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a CodeSystem resource
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
     * A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
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
     * The date (and optionally time) when the code system resource was created or revised.
     * 
     */
    @JsonProperty("status")
    public CodeSystem.Status getStatus() {
        return status;
    }

    /**
     * The date (and optionally time) when the code system resource was created or revised.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CodeSystem.Status status) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate code system instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate code system instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the code system is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the code system is intended to be used.
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("caseSensitive")
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("caseSensitive")
    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_caseSensitive")
    public Element get_caseSensitive() {
        return _caseSensitive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_caseSensitive")
    public void set_caseSensitive(Element _caseSensitive) {
        this._caseSensitive = _caseSensitive;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("valueSet")
    public String getValueSet() {
        return valueSet;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("valueSet")
    public void setValueSet(String valueSet) {
        this.valueSet = valueSet;
    }

    /**
     * The meaning of the hierarchy of concepts as represented in this resource.
     * 
     */
    @JsonProperty("hierarchyMeaning")
    public CodeSystem.HierarchyMeaning getHierarchyMeaning() {
        return hierarchyMeaning;
    }

    /**
     * The meaning of the hierarchy of concepts as represented in this resource.
     * 
     */
    @JsonProperty("hierarchyMeaning")
    public void setHierarchyMeaning(CodeSystem.HierarchyMeaning hierarchyMeaning) {
        this.hierarchyMeaning = hierarchyMeaning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hierarchyMeaning")
    public Element get_hierarchyMeaning() {
        return _hierarchyMeaning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hierarchyMeaning")
    public void set_hierarchyMeaning(Element _hierarchyMeaning) {
        this._hierarchyMeaning = _hierarchyMeaning;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("compositional")
    public Boolean getCompositional() {
        return compositional;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("compositional")
    public void setCompositional(Boolean compositional) {
        this.compositional = compositional;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compositional")
    public Element get_compositional() {
        return _compositional;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compositional")
    public void set_compositional(Element _compositional) {
        this._compositional = _compositional;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("versionNeeded")
    public Boolean getVersionNeeded() {
        return versionNeeded;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("versionNeeded")
    public void setVersionNeeded(Boolean versionNeeded) {
        this.versionNeeded = versionNeeded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versionNeeded")
    public Element get_versionNeeded() {
        return _versionNeeded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versionNeeded")
    public void set_versionNeeded(Element _versionNeeded) {
        this._versionNeeded = _versionNeeded;
    }

    /**
     * The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
     * 
     */
    @JsonProperty("content")
    public CodeSystem.Content getContent() {
        return content;
    }

    /**
     * The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
     * 
     */
    @JsonProperty("content")
    public void setContent(CodeSystem.Content content) {
        this.content = content;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_content")
    public Element get_content() {
        return _content;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_content")
    public void set_content(Element _content) {
        this._content = _content;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("supplements")
    public String getSupplements() {
        return supplements;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("supplements")
    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("count")
    public Double getCount() {
        return count;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("count")
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_count")
    public Element get_count() {
        return _count;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_count")
    public void set_count(Element _count) {
        this._count = _count;
    }

    /**
     * A filter that can be used in a value set compose statement when selecting concepts using a filter.
     * 
     */
    @JsonProperty("filter")
    public List<CodeSystem_Filter> getFilter() {
        return filter;
    }

    /**
     * A filter that can be used in a value set compose statement when selecting concepts using a filter.
     * 
     */
    @JsonProperty("filter")
    public void setFilter(List<CodeSystem_Filter> filter) {
        this.filter = filter;
    }

    /**
     * A property defines an additional slot through which additional information can be provided about a concept.
     * 
     */
    @JsonProperty("property")
    public List<CodeSystem_Property> getProperty() {
        return property;
    }

    /**
     * A property defines an additional slot through which additional information can be provided about a concept.
     * 
     */
    @JsonProperty("property")
    public void setProperty(List<CodeSystem_Property> property) {
        this.property = property;
    }

    /**
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.
     * 
     */
    @JsonProperty("concept")
    public List<CodeSystem_Concept> getConcept() {
        return concept;
    }

    /**
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.
     * 
     */
    @JsonProperty("concept")
    public void setConcept(List<CodeSystem_Concept> concept) {
        this.concept = concept;
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
        sb.append(CodeSystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("experimental");
        sb.append('=');
        sb.append(((this.experimental == null)?"<null>":this.experimental));
        sb.append(',');
        sb.append("_experimental");
        sb.append('=');
        sb.append(((this._experimental == null)?"<null>":this._experimental));
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
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null)?"<null>":this.copyright));
        sb.append(',');
        sb.append("_copyright");
        sb.append('=');
        sb.append(((this._copyright == null)?"<null>":this._copyright));
        sb.append(',');
        sb.append("caseSensitive");
        sb.append('=');
        sb.append(((this.caseSensitive == null)?"<null>":this.caseSensitive));
        sb.append(',');
        sb.append("_caseSensitive");
        sb.append('=');
        sb.append(((this._caseSensitive == null)?"<null>":this._caseSensitive));
        sb.append(',');
        sb.append("valueSet");
        sb.append('=');
        sb.append(((this.valueSet == null)?"<null>":this.valueSet));
        sb.append(',');
        sb.append("hierarchyMeaning");
        sb.append('=');
        sb.append(((this.hierarchyMeaning == null)?"<null>":this.hierarchyMeaning));
        sb.append(',');
        sb.append("_hierarchyMeaning");
        sb.append('=');
        sb.append(((this._hierarchyMeaning == null)?"<null>":this._hierarchyMeaning));
        sb.append(',');
        sb.append("compositional");
        sb.append('=');
        sb.append(((this.compositional == null)?"<null>":this.compositional));
        sb.append(',');
        sb.append("_compositional");
        sb.append('=');
        sb.append(((this._compositional == null)?"<null>":this._compositional));
        sb.append(',');
        sb.append("versionNeeded");
        sb.append('=');
        sb.append(((this.versionNeeded == null)?"<null>":this.versionNeeded));
        sb.append(',');
        sb.append("_versionNeeded");
        sb.append('=');
        sb.append(((this._versionNeeded == null)?"<null>":this._versionNeeded));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("_content");
        sb.append('=');
        sb.append(((this._content == null)?"<null>":this._content));
        sb.append(',');
        sb.append("supplements");
        sb.append('=');
        sb.append(((this.supplements == null)?"<null>":this.supplements));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("_count");
        sb.append('=');
        sb.append(((this._count == null)?"<null>":this._count));
        sb.append(',');
        sb.append("filter");
        sb.append('=');
        sb.append(((this.filter == null)?"<null>":this.filter));
        sb.append(',');
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("concept");
        sb.append('=');
        sb.append(((this.concept == null)?"<null>":this.concept));
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
        result = ((result* 31)+((this.valueSet == null)? 0 :this.valueSet.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.concept == null)? 0 :this.concept.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.hierarchyMeaning == null)? 0 :this.hierarchyMeaning.hashCode()));
        result = ((result* 31)+((this._count == null)? 0 :this._count.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.caseSensitive == null)? 0 :this.caseSensitive.hashCode()));
        result = ((result* 31)+((this._compositional == null)? 0 :this._compositional.hashCode()));
        result = ((result* 31)+((this.versionNeeded == null)? 0 :this.versionNeeded.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this._caseSensitive == null)? 0 :this._caseSensitive.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.filter == null)? 0 :this.filter.hashCode()));
        result = ((result* 31)+((this.supplements == null)? 0 :this.supplements.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.compositional == null)? 0 :this.compositional.hashCode()));
        result = ((result* 31)+((this._versionNeeded == null)? 0 :this._versionNeeded.hashCode()));
        result = ((result* 31)+((this._hierarchyMeaning == null)? 0 :this._hierarchyMeaning.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this._publisher == null)? 0 :this._publisher.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._content == null)? 0 :this._content.hashCode()));
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
        if ((other instanceof CodeSystem) == false) {
            return false;
        }
        CodeSystem rhs = ((CodeSystem) other);
        return (((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this.valueSet == rhs.valueSet)||((this.valueSet!= null)&&this.valueSet.equals(rhs.valueSet))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.concept == rhs.concept)||((this.concept!= null)&&this.concept.equals(rhs.concept))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.hierarchyMeaning == rhs.hierarchyMeaning)||((this.hierarchyMeaning!= null)&&this.hierarchyMeaning.equals(rhs.hierarchyMeaning))))&&((this._count == rhs._count)||((this._count!= null)&&this._count.equals(rhs._count))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.caseSensitive == rhs.caseSensitive)||((this.caseSensitive!= null)&&this.caseSensitive.equals(rhs.caseSensitive))))&&((this._compositional == rhs._compositional)||((this._compositional!= null)&&this._compositional.equals(rhs._compositional))))&&((this.versionNeeded == rhs.versionNeeded)||((this.versionNeeded!= null)&&this.versionNeeded.equals(rhs.versionNeeded))))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this._caseSensitive == rhs._caseSensitive)||((this._caseSensitive!= null)&&this._caseSensitive.equals(rhs._caseSensitive))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.filter == rhs.filter)||((this.filter!= null)&&this.filter.equals(rhs.filter))))&&((this.supplements == rhs.supplements)||((this.supplements!= null)&&this.supplements.equals(rhs.supplements))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.compositional == rhs.compositional)||((this.compositional!= null)&&this.compositional.equals(rhs.compositional))))&&((this._versionNeeded == rhs._versionNeeded)||((this._versionNeeded!= null)&&this._versionNeeded.equals(rhs._versionNeeded))))&&((this._hierarchyMeaning == rhs._hierarchyMeaning)||((this._hierarchyMeaning!= null)&&this._hierarchyMeaning.equals(rhs._hierarchyMeaning))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._content == rhs._content)||((this._content!= null)&&this._content.equals(rhs._content))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Content {

        NOT_PRESENT("not-present"),
        EXAMPLE("example"),
        FRAGMENT("fragment"),
        COMPLETE("complete"),
        SUPPLEMENT("supplement");
        private final String value;
        private final static Map<String, CodeSystem.Content> CONSTANTS = new HashMap<String, CodeSystem.Content>();

        static {
            for (CodeSystem.Content c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Content(String value) {
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
        public static CodeSystem.Content fromValue(String value) {
            CodeSystem.Content constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The meaning of the hierarchy of concepts as represented in this resource.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum HierarchyMeaning {

        GROUPED_BY("grouped-by"),
        IS_A("is-a"),
        PART_OF("part-of"),
        CLASSIFIED_WITH("classified-with");
        private final String value;
        private final static Map<String, CodeSystem.HierarchyMeaning> CONSTANTS = new HashMap<String, CodeSystem.HierarchyMeaning>();

        static {
            for (CodeSystem.HierarchyMeaning c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        HierarchyMeaning(String value) {
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
        public static CodeSystem.HierarchyMeaning fromValue(String value) {
            CodeSystem.HierarchyMeaning constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The date (and optionally time) when the code system resource was created or revised.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, CodeSystem.Status> CONSTANTS = new HashMap<String, CodeSystem.Status>();

        static {
            for (CodeSystem.Status c: values()) {
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
        public static CodeSystem.Status fromValue(String value) {
            CodeSystem.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
