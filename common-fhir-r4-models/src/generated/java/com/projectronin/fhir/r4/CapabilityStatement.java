
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
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "url",
    "_url",
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
    "kind",
    "_kind",
    "instantiates",
    "imports",
    "software",
    "implementation",
    "fhirVersion",
    "_fhirVersion",
    "format",
    "_format",
    "patchFormat",
    "_patchFormat",
    "implementationGuide",
    "rest",
    "messaging",
    "document"
})
@Generated("jsonschema2pojo")
public class CapabilityStatement
    extends DomainResource
{

    /**
     * This is a CapabilityStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a CapabilityStatement resource")
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
     * The status of this capability statement. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this capability statement. Enables tracking the life-cycle of the content.")
    private CapabilityStatement.Status status;
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate capability statement instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate capability statement instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the capability statement is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the capability statement is intended to be used.")
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
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).")
    private CapabilityStatement.Kind kind;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _kind;
    /**
     * Reference to a canonical URL of another CapabilityStatement that this software implements. This capability statement is a published API description that corresponds to a business service. The server may actually implement a subset of the capability statement it claims to implement, so the capability statement must specify the full capability details.
     * 
     */
    @JsonProperty("instantiates")
    @JsonPropertyDescription("Reference to a canonical URL of another CapabilityStatement that this software implements. This capability statement is a published API description that corresponds to a business service. The server may actually implement a subset of the capability statement it claims to implement, so the capability statement must specify the full capability details.")
    private List<String> instantiates = new ArrayList<String>();
    /**
     * Reference to a canonical URL of another CapabilityStatement that this software adds to. The capability statement automatically includes everything in the other statement, and it is not duplicated, though the server may repeat the same resources, interactions and operations to add additional details to them.
     * 
     */
    @JsonProperty("imports")
    @JsonPropertyDescription("Reference to a canonical URL of another CapabilityStatement that this software adds to. The capability statement automatically includes everything in the other statement, and it is not duplicated, though the server may repeat the same resources, interactions and operations to add additional details to them.")
    private List<String> imports = new ArrayList<String>();
    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("software")
    @JsonPropertyDescription("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")
    private CapabilityStatement_Software software;
    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("implementation")
    @JsonPropertyDescription("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")
    private CapabilityStatement_Implementation implementation;
    /**
     * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.
     * 
     */
    @JsonProperty("fhirVersion")
    @JsonPropertyDescription("The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.")
    private com.projectronin.fhir.r4.StructureDefinition.FHIRVersion fhirVersion;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fhirVersion")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fhirVersion;
    /**
     * A list of the formats supported by this implementation using their content types.
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("A list of the formats supported by this implementation using their content types.")
    private List<String> format = new ArrayList<String>();
    /**
     * Extensions for format
     * 
     */
    @JsonProperty("_format")
    @JsonPropertyDescription("Extensions for format")
    private List<Element> _format = new ArrayList<Element>();
    /**
     * A list of the patch formats supported by this implementation using their content types.
     * 
     */
    @JsonProperty("patchFormat")
    @JsonPropertyDescription("A list of the patch formats supported by this implementation using their content types.")
    private List<String> patchFormat = new ArrayList<String>();
    /**
     * Extensions for patchFormat
     * 
     */
    @JsonProperty("_patchFormat")
    @JsonPropertyDescription("Extensions for patchFormat")
    private List<Element> _patchFormat = new ArrayList<Element>();
    /**
     * A list of implementation guides that the server does (or should) support in their entirety.
     * 
     */
    @JsonProperty("implementationGuide")
    @JsonPropertyDescription("A list of implementation guides that the server does (or should) support in their entirety.")
    private List<String> implementationGuide = new ArrayList<String>();
    /**
     * A definition of the restful capabilities of the solution, if any.
     * 
     */
    @JsonProperty("rest")
    @JsonPropertyDescription("A definition of the restful capabilities of the solution, if any.")
    private List<CapabilityStatement_Rest> rest = new ArrayList<CapabilityStatement_Rest>();
    /**
     * A description of the messaging capabilities of the solution.
     * 
     */
    @JsonProperty("messaging")
    @JsonPropertyDescription("A description of the messaging capabilities of the solution.")
    private List<CapabilityStatement_Messaging> messaging = new ArrayList<CapabilityStatement_Messaging>();
    /**
     * A document definition.
     * 
     */
    @JsonProperty("document")
    @JsonPropertyDescription("A document definition.")
    private List<CapabilityStatement_Document> document = new ArrayList<CapabilityStatement_Document>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a CapabilityStatement resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a CapabilityStatement resource
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
     * The status of this capability statement. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public CapabilityStatement.Status getStatus() {
        return status;
    }

    /**
     * The status of this capability statement. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CapabilityStatement.Status status) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate capability statement instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate capability statement instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the capability statement is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the capability statement is intended to be used.
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
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
     * 
     */
    @JsonProperty("kind")
    public CapabilityStatement.Kind getKind() {
        return kind;
    }

    /**
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
     * 
     */
    @JsonProperty("kind")
    public void setKind(CapabilityStatement.Kind kind) {
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
     * Reference to a canonical URL of another CapabilityStatement that this software implements. This capability statement is a published API description that corresponds to a business service. The server may actually implement a subset of the capability statement it claims to implement, so the capability statement must specify the full capability details.
     * 
     */
    @JsonProperty("instantiates")
    public List<String> getInstantiates() {
        return instantiates;
    }

    /**
     * Reference to a canonical URL of another CapabilityStatement that this software implements. This capability statement is a published API description that corresponds to a business service. The server may actually implement a subset of the capability statement it claims to implement, so the capability statement must specify the full capability details.
     * 
     */
    @JsonProperty("instantiates")
    public void setInstantiates(List<String> instantiates) {
        this.instantiates = instantiates;
    }

    /**
     * Reference to a canonical URL of another CapabilityStatement that this software adds to. The capability statement automatically includes everything in the other statement, and it is not duplicated, though the server may repeat the same resources, interactions and operations to add additional details to them.
     * 
     */
    @JsonProperty("imports")
    public List<String> getImports() {
        return imports;
    }

    /**
     * Reference to a canonical URL of another CapabilityStatement that this software adds to. The capability statement automatically includes everything in the other statement, and it is not duplicated, though the server may repeat the same resources, interactions and operations to add additional details to them.
     * 
     */
    @JsonProperty("imports")
    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("software")
    public CapabilityStatement_Software getSoftware() {
        return software;
    }

    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("software")
    public void setSoftware(CapabilityStatement_Software software) {
        this.software = software;
    }

    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("implementation")
    public CapabilityStatement_Implementation getImplementation() {
        return implementation;
    }

    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("implementation")
    public void setImplementation(CapabilityStatement_Implementation implementation) {
        this.implementation = implementation;
    }

    /**
     * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.
     * 
     */
    @JsonProperty("fhirVersion")
    public com.projectronin.fhir.r4.StructureDefinition.FHIRVersion getFhirVersion() {
        return fhirVersion;
    }

    /**
     * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.
     * 
     */
    @JsonProperty("fhirVersion")
    public void setFhirVersion(com.projectronin.fhir.r4.StructureDefinition.FHIRVersion fhirVersion) {
        this.fhirVersion = fhirVersion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fhirVersion")
    public Element get_fhirVersion() {
        return _fhirVersion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fhirVersion")
    public void set_fhirVersion(Element _fhirVersion) {
        this._fhirVersion = _fhirVersion;
    }

    /**
     * A list of the formats supported by this implementation using their content types.
     * 
     */
    @JsonProperty("format")
    public List<String> getFormat() {
        return format;
    }

    /**
     * A list of the formats supported by this implementation using their content types.
     * 
     */
    @JsonProperty("format")
    public void setFormat(List<String> format) {
        this.format = format;
    }

    /**
     * Extensions for format
     * 
     */
    @JsonProperty("_format")
    public List<Element> get_format() {
        return _format;
    }

    /**
     * Extensions for format
     * 
     */
    @JsonProperty("_format")
    public void set_format(List<Element> _format) {
        this._format = _format;
    }

    /**
     * A list of the patch formats supported by this implementation using their content types.
     * 
     */
    @JsonProperty("patchFormat")
    public List<String> getPatchFormat() {
        return patchFormat;
    }

    /**
     * A list of the patch formats supported by this implementation using their content types.
     * 
     */
    @JsonProperty("patchFormat")
    public void setPatchFormat(List<String> patchFormat) {
        this.patchFormat = patchFormat;
    }

    /**
     * Extensions for patchFormat
     * 
     */
    @JsonProperty("_patchFormat")
    public List<Element> get_patchFormat() {
        return _patchFormat;
    }

    /**
     * Extensions for patchFormat
     * 
     */
    @JsonProperty("_patchFormat")
    public void set_patchFormat(List<Element> _patchFormat) {
        this._patchFormat = _patchFormat;
    }

    /**
     * A list of implementation guides that the server does (or should) support in their entirety.
     * 
     */
    @JsonProperty("implementationGuide")
    public List<String> getImplementationGuide() {
        return implementationGuide;
    }

    /**
     * A list of implementation guides that the server does (or should) support in their entirety.
     * 
     */
    @JsonProperty("implementationGuide")
    public void setImplementationGuide(List<String> implementationGuide) {
        this.implementationGuide = implementationGuide;
    }

    /**
     * A definition of the restful capabilities of the solution, if any.
     * 
     */
    @JsonProperty("rest")
    public List<CapabilityStatement_Rest> getRest() {
        return rest;
    }

    /**
     * A definition of the restful capabilities of the solution, if any.
     * 
     */
    @JsonProperty("rest")
    public void setRest(List<CapabilityStatement_Rest> rest) {
        this.rest = rest;
    }

    /**
     * A description of the messaging capabilities of the solution.
     * 
     */
    @JsonProperty("messaging")
    public List<CapabilityStatement_Messaging> getMessaging() {
        return messaging;
    }

    /**
     * A description of the messaging capabilities of the solution.
     * 
     */
    @JsonProperty("messaging")
    public void setMessaging(List<CapabilityStatement_Messaging> messaging) {
        this.messaging = messaging;
    }

    /**
     * A document definition.
     * 
     */
    @JsonProperty("document")
    public List<CapabilityStatement_Document> getDocument() {
        return document;
    }

    /**
     * A document definition.
     * 
     */
    @JsonProperty("document")
    public void setDocument(List<CapabilityStatement_Document> document) {
        this.document = document;
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
        sb.append(CapabilityStatement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("_kind");
        sb.append('=');
        sb.append(((this._kind == null)?"<null>":this._kind));
        sb.append(',');
        sb.append("instantiates");
        sb.append('=');
        sb.append(((this.instantiates == null)?"<null>":this.instantiates));
        sb.append(',');
        sb.append("imports");
        sb.append('=');
        sb.append(((this.imports == null)?"<null>":this.imports));
        sb.append(',');
        sb.append("software");
        sb.append('=');
        sb.append(((this.software == null)?"<null>":this.software));
        sb.append(',');
        sb.append("implementation");
        sb.append('=');
        sb.append(((this.implementation == null)?"<null>":this.implementation));
        sb.append(',');
        sb.append("fhirVersion");
        sb.append('=');
        sb.append(((this.fhirVersion == null)?"<null>":this.fhirVersion));
        sb.append(',');
        sb.append("_fhirVersion");
        sb.append('=');
        sb.append(((this._fhirVersion == null)?"<null>":this._fhirVersion));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("_format");
        sb.append('=');
        sb.append(((this._format == null)?"<null>":this._format));
        sb.append(',');
        sb.append("patchFormat");
        sb.append('=');
        sb.append(((this.patchFormat == null)?"<null>":this.patchFormat));
        sb.append(',');
        sb.append("_patchFormat");
        sb.append('=');
        sb.append(((this._patchFormat == null)?"<null>":this._patchFormat));
        sb.append(',');
        sb.append("implementationGuide");
        sb.append('=');
        sb.append(((this.implementationGuide == null)?"<null>":this.implementationGuide));
        sb.append(',');
        sb.append("rest");
        sb.append('=');
        sb.append(((this.rest == null)?"<null>":this.rest));
        sb.append(',');
        sb.append("messaging");
        sb.append('=');
        sb.append(((this.messaging == null)?"<null>":this.messaging));
        sb.append(',');
        sb.append("document");
        sb.append('=');
        sb.append(((this.document == null)?"<null>":this.document));
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
        result = ((result* 31)+((this.instantiates == null)? 0 :this.instantiates.hashCode()));
        result = ((result* 31)+((this.copyright == null)? 0 :this.copyright.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.software == null)? 0 :this.software.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.document == null)? 0 :this.document.hashCode()));
        result = ((result* 31)+((this._fhirVersion == null)? 0 :this._fhirVersion.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        result = ((result* 31)+((this._patchFormat == null)? 0 :this._patchFormat.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.fhirVersion == null)? 0 :this.fhirVersion.hashCode()));
        result = ((result* 31)+((this._format == null)? 0 :this._format.hashCode()));
        result = ((result* 31)+((this.patchFormat == null)? 0 :this.patchFormat.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this._kind == null)? 0 :this._kind.hashCode()));
        result = ((result* 31)+((this.rest == null)? 0 :this.rest.hashCode()));
        result = ((result* 31)+((this.imports == null)? 0 :this.imports.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.implementation == null)? 0 :this.implementation.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.messaging == null)? 0 :this.messaging.hashCode()));
        result = ((result* 31)+((this.implementationGuide == null)? 0 :this.implementationGuide.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
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
        if ((other instanceof CapabilityStatement) == false) {
            return false;
        }
        CapabilityStatement rhs = ((CapabilityStatement) other);
        return (((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.instantiates == rhs.instantiates)||((this.instantiates!= null)&&this.instantiates.equals(rhs.instantiates))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.software == rhs.software)||((this.software!= null)&&this.software.equals(rhs.software))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.document == rhs.document)||((this.document!= null)&&this.document.equals(rhs.document))))&&((this._fhirVersion == rhs._fhirVersion)||((this._fhirVersion!= null)&&this._fhirVersion.equals(rhs._fhirVersion))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))))&&((this._patchFormat == rhs._patchFormat)||((this._patchFormat!= null)&&this._patchFormat.equals(rhs._patchFormat))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.fhirVersion == rhs.fhirVersion)||((this.fhirVersion!= null)&&this.fhirVersion.equals(rhs.fhirVersion))))&&((this._format == rhs._format)||((this._format!= null)&&this._format.equals(rhs._format))))&&((this.patchFormat == rhs.patchFormat)||((this.patchFormat!= null)&&this.patchFormat.equals(rhs.patchFormat))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this._kind == rhs._kind)||((this._kind!= null)&&this._kind.equals(rhs._kind))))&&((this.rest == rhs.rest)||((this.rest!= null)&&this.rest.equals(rhs.rest))))&&((this.imports == rhs.imports)||((this.imports!= null)&&this.imports.equals(rhs.imports))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.implementation == rhs.implementation)||((this.implementation!= null)&&this.implementation.equals(rhs.implementation))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.messaging == rhs.messaging)||((this.messaging!= null)&&this.messaging.equals(rhs.messaging))))&&((this.implementationGuide == rhs.implementationGuide)||((this.implementationGuide!= null)&&this.implementationGuide.equals(rhs.implementationGuide))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Kind {

        INSTANCE("instance"),
        CAPABILITY("capability"),
        REQUIREMENTS("requirements");
        private final String value;
        private final static Map<String, CapabilityStatement.Kind> CONSTANTS = new HashMap<String, CapabilityStatement.Kind>();

        static {
            for (CapabilityStatement.Kind c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Kind(String value) {
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
        public static CapabilityStatement.Kind fromValue(String value) {
            CapabilityStatement.Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The status of this capability statement. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, CapabilityStatement.Status> CONSTANTS = new HashMap<String, CapabilityStatement.Status>();

        static {
            for (CapabilityStatement.Status c: values()) {
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
        public static CapabilityStatement.Status fromValue(String value) {
            CapabilityStatement.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
