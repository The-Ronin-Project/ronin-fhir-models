
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
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
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
    "keyword",
    "fhirVersion",
    "_fhirVersion",
    "mapping",
    "kind",
    "_kind",
    "abstract",
    "_abstract",
    "context",
    "contextInvariant",
    "_contextInvariant",
    "type",
    "_type",
    "baseDefinition",
    "derivation",
    "_derivation",
    "snapshot",
    "differential"
})
@Generated("jsonschema2pojo")
public class StructureDefinition
    extends DomainResource
{

    /**
     * This is a StructureDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a StructureDefinition resource")
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
     * A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
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
     * The status of this structure definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this structure definition. Enables tracking the life-cycle of the content.")
    private StructureDefinition.Status status;
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate structure definition instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate structure definition instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the structure definition is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the structure definition is intended to be used.")
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
     * A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates nby describing the use of this structure definition, or the content it describes.
     * 
     */
    @JsonProperty("keyword")
    @JsonPropertyDescription("A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates nby describing the use of this structure definition, or the content it describes.")
    private List<Coding> keyword = new ArrayList<Coding>();
    /**
     * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.
     * 
     */
    @JsonProperty("fhirVersion")
    @JsonPropertyDescription("The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.")
    private StructureDefinition.FHIRVersion fhirVersion;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fhirVersion")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fhirVersion;
    /**
     * An external specification that the content is mapped to.
     * 
     */
    @JsonProperty("mapping")
    @JsonPropertyDescription("An external specification that the content is mapped to.")
    private List<StructureDefinition_Mapping> mapping = new ArrayList<StructureDefinition_Mapping>();
    /**
     * Defines the kind of structure that this definition is describing.
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("Defines the kind of structure that this definition is describing.")
    private StructureDefinition.Kind kind;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _kind;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("abstract")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean _abstract;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abstract")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element __abstract;
    /**
     * Identifies the types of resource or data type elements to which the extension can be applied.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("Identifies the types of resource or data type elements to which the extension can be applied.")
    private List<StructureDefinition_Context> context = new ArrayList<StructureDefinition_Context>();
    /**
     * A set of rules as FHIRPath Invariants about when the extension can be used (e.g. co-occurrence variants for the extension). All the rules must be true.
     * 
     */
    @JsonProperty("contextInvariant")
    @JsonPropertyDescription("A set of rules as FHIRPath Invariants about when the extension can be used (e.g. co-occurrence variants for the extension). All the rules must be true.")
    private List<String> contextInvariant = new ArrayList<String>();
    /**
     * Extensions for contextInvariant
     * 
     */
    @JsonProperty("_contextInvariant")
    @JsonPropertyDescription("Extensions for contextInvariant")
    private List<Element> _contextInvariant = new ArrayList<Element>();
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("baseDefinition")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String baseDefinition;
    /**
     * How the type relates to the baseDefinition.
     * 
     */
    @JsonProperty("derivation")
    @JsonPropertyDescription("How the type relates to the baseDefinition.")
    private StructureDefinition.Derivation derivation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_derivation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _derivation;
    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
     * 
     */
    @JsonProperty("snapshot")
    @JsonPropertyDescription("A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.")
    private StructureDefinition_Snapshot snapshot;
    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
     * 
     */
    @JsonProperty("differential")
    @JsonPropertyDescription("A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.")
    private StructureDefinition_Differential differential;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a StructureDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a StructureDefinition resource
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
     * A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
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
     * The status of this structure definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public StructureDefinition.Status getStatus() {
        return status;
    }

    /**
     * The status of this structure definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(StructureDefinition.Status status) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate structure definition instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate structure definition instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the structure definition is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the structure definition is intended to be used.
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
     * A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates nby describing the use of this structure definition, or the content it describes.
     * 
     */
    @JsonProperty("keyword")
    public List<Coding> getKeyword() {
        return keyword;
    }

    /**
     * A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates nby describing the use of this structure definition, or the content it describes.
     * 
     */
    @JsonProperty("keyword")
    public void setKeyword(List<Coding> keyword) {
        this.keyword = keyword;
    }

    /**
     * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.
     * 
     */
    @JsonProperty("fhirVersion")
    public StructureDefinition.FHIRVersion getFhirVersion() {
        return fhirVersion;
    }

    /**
     * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.
     * 
     */
    @JsonProperty("fhirVersion")
    public void setFhirVersion(StructureDefinition.FHIRVersion fhirVersion) {
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
     * An external specification that the content is mapped to.
     * 
     */
    @JsonProperty("mapping")
    public List<StructureDefinition_Mapping> getMapping() {
        return mapping;
    }

    /**
     * An external specification that the content is mapped to.
     * 
     */
    @JsonProperty("mapping")
    public void setMapping(List<StructureDefinition_Mapping> mapping) {
        this.mapping = mapping;
    }

    /**
     * Defines the kind of structure that this definition is describing.
     * 
     */
    @JsonProperty("kind")
    public StructureDefinition.Kind getKind() {
        return kind;
    }

    /**
     * Defines the kind of structure that this definition is describing.
     * 
     */
    @JsonProperty("kind")
    public void setKind(StructureDefinition.Kind kind) {
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("abstract")
    public Boolean getAbstract() {
        return _abstract;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("abstract")
    public void setAbstract(Boolean _abstract) {
        this._abstract = _abstract;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abstract")
    public Element get_abstract() {
        return __abstract;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abstract")
    public void set_abstract(Element __abstract) {
        this.__abstract = __abstract;
    }

    /**
     * Identifies the types of resource or data type elements to which the extension can be applied.
     * 
     */
    @JsonProperty("context")
    public List<StructureDefinition_Context> getContext() {
        return context;
    }

    /**
     * Identifies the types of resource or data type elements to which the extension can be applied.
     * 
     */
    @JsonProperty("context")
    public void setContext(List<StructureDefinition_Context> context) {
        this.context = context;
    }

    /**
     * A set of rules as FHIRPath Invariants about when the extension can be used (e.g. co-occurrence variants for the extension). All the rules must be true.
     * 
     */
    @JsonProperty("contextInvariant")
    public List<String> getContextInvariant() {
        return contextInvariant;
    }

    /**
     * A set of rules as FHIRPath Invariants about when the extension can be used (e.g. co-occurrence variants for the extension). All the rules must be true.
     * 
     */
    @JsonProperty("contextInvariant")
    public void setContextInvariant(List<String> contextInvariant) {
        this.contextInvariant = contextInvariant;
    }

    /**
     * Extensions for contextInvariant
     * 
     */
    @JsonProperty("_contextInvariant")
    public List<Element> get_contextInvariant() {
        return _contextInvariant;
    }

    /**
     * Extensions for contextInvariant
     * 
     */
    @JsonProperty("_contextInvariant")
    public void set_contextInvariant(List<Element> _contextInvariant) {
        this._contextInvariant = _contextInvariant;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("baseDefinition")
    public String getBaseDefinition() {
        return baseDefinition;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("baseDefinition")
    public void setBaseDefinition(String baseDefinition) {
        this.baseDefinition = baseDefinition;
    }

    /**
     * How the type relates to the baseDefinition.
     * 
     */
    @JsonProperty("derivation")
    public StructureDefinition.Derivation getDerivation() {
        return derivation;
    }

    /**
     * How the type relates to the baseDefinition.
     * 
     */
    @JsonProperty("derivation")
    public void setDerivation(StructureDefinition.Derivation derivation) {
        this.derivation = derivation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_derivation")
    public Element get_derivation() {
        return _derivation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_derivation")
    public void set_derivation(Element _derivation) {
        this._derivation = _derivation;
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
     * 
     */
    @JsonProperty("snapshot")
    public StructureDefinition_Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
     * 
     */
    @JsonProperty("snapshot")
    public void setSnapshot(StructureDefinition_Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
     * 
     */
    @JsonProperty("differential")
    public StructureDefinition_Differential getDifferential() {
        return differential;
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
     * 
     */
    @JsonProperty("differential")
    public void setDifferential(StructureDefinition_Differential differential) {
        this.differential = differential;
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
        sb.append(StructureDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("keyword");
        sb.append('=');
        sb.append(((this.keyword == null)?"<null>":this.keyword));
        sb.append(',');
        sb.append("fhirVersion");
        sb.append('=');
        sb.append(((this.fhirVersion == null)?"<null>":this.fhirVersion));
        sb.append(',');
        sb.append("_fhirVersion");
        sb.append('=');
        sb.append(((this._fhirVersion == null)?"<null>":this._fhirVersion));
        sb.append(',');
        sb.append("mapping");
        sb.append('=');
        sb.append(((this.mapping == null)?"<null>":this.mapping));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("_kind");
        sb.append('=');
        sb.append(((this._kind == null)?"<null>":this._kind));
        sb.append(',');
        sb.append("_abstract");
        sb.append('=');
        sb.append(((this._abstract == null)?"<null>":this._abstract));
        sb.append(',');
        sb.append("__abstract");
        sb.append('=');
        sb.append(((this.__abstract == null)?"<null>":this.__abstract));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("contextInvariant");
        sb.append('=');
        sb.append(((this.contextInvariant == null)?"<null>":this.contextInvariant));
        sb.append(',');
        sb.append("_contextInvariant");
        sb.append('=');
        sb.append(((this._contextInvariant == null)?"<null>":this._contextInvariant));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("baseDefinition");
        sb.append('=');
        sb.append(((this.baseDefinition == null)?"<null>":this.baseDefinition));
        sb.append(',');
        sb.append("derivation");
        sb.append('=');
        sb.append(((this.derivation == null)?"<null>":this.derivation));
        sb.append(',');
        sb.append("_derivation");
        sb.append('=');
        sb.append(((this._derivation == null)?"<null>":this._derivation));
        sb.append(',');
        sb.append("snapshot");
        sb.append('=');
        sb.append(((this.snapshot == null)?"<null>":this.snapshot));
        sb.append(',');
        sb.append("differential");
        sb.append('=');
        sb.append(((this.differential == null)?"<null>":this.differential));
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
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._contextInvariant == null)? 0 :this._contextInvariant.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this._fhirVersion == null)? 0 :this._fhirVersion.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        result = ((result* 31)+((this.differential == null)? 0 :this.differential.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.fhirVersion == null)? 0 :this.fhirVersion.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.keyword == null)? 0 :this.keyword.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this._kind == null)? 0 :this._kind.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.mapping == null)? 0 :this.mapping.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.baseDefinition == null)? 0 :this.baseDefinition.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._abstract == null)? 0 :this._abstract.hashCode()));
        result = ((result* 31)+((this.__abstract == null)? 0 :this.__abstract.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.derivation == null)? 0 :this.derivation.hashCode()));
        result = ((result* 31)+((this._publisher == null)? 0 :this._publisher.hashCode()));
        result = ((result* 31)+((this.contextInvariant == null)? 0 :this.contextInvariant.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.useContext == null)? 0 :this.useContext.hashCode()));
        result = ((result* 31)+((this._derivation == null)? 0 :this._derivation.hashCode()));
        result = ((result* 31)+((this.snapshot == null)? 0 :this.snapshot.hashCode()));
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
        if ((other instanceof StructureDefinition) == false) {
            return false;
        }
        StructureDefinition rhs = ((StructureDefinition) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._contextInvariant == rhs._contextInvariant)||((this._contextInvariant!= null)&&this._contextInvariant.equals(rhs._contextInvariant))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this._fhirVersion == rhs._fhirVersion)||((this._fhirVersion!= null)&&this._fhirVersion.equals(rhs._fhirVersion))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))))&&((this.differential == rhs.differential)||((this.differential!= null)&&this.differential.equals(rhs.differential))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.fhirVersion == rhs.fhirVersion)||((this.fhirVersion!= null)&&this.fhirVersion.equals(rhs.fhirVersion))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.keyword == rhs.keyword)||((this.keyword!= null)&&this.keyword.equals(rhs.keyword))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this._kind == rhs._kind)||((this._kind!= null)&&this._kind.equals(rhs._kind))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.mapping == rhs.mapping)||((this.mapping!= null)&&this.mapping.equals(rhs.mapping))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.baseDefinition == rhs.baseDefinition)||((this.baseDefinition!= null)&&this.baseDefinition.equals(rhs.baseDefinition))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._abstract == rhs._abstract)||((this._abstract!= null)&&this._abstract.equals(rhs._abstract))))&&((this.__abstract == rhs.__abstract)||((this.__abstract!= null)&&this.__abstract.equals(rhs.__abstract))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.derivation == rhs.derivation)||((this.derivation!= null)&&this.derivation.equals(rhs.derivation))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.contextInvariant == rhs.contextInvariant)||((this.contextInvariant!= null)&&this.contextInvariant.equals(rhs.contextInvariant))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this._derivation == rhs._derivation)||((this._derivation!= null)&&this._derivation.equals(rhs._derivation))))&&((this.snapshot == rhs.snapshot)||((this.snapshot!= null)&&this.snapshot.equals(rhs.snapshot))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * How the type relates to the baseDefinition.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Derivation {

        SPECIALIZATION("specialization"),
        CONSTRAINT("constraint");
        private final String value;
        private final static Map<String, StructureDefinition.Derivation> CONSTANTS = new HashMap<String, StructureDefinition.Derivation>();

        static {
            for (StructureDefinition.Derivation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Derivation(String value) {
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
        public static StructureDefinition.Derivation fromValue(String value) {
            StructureDefinition.Derivation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself). There is no default value.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FHIRVersion {

        _0_01("0.01"),
        _0_05("0.05"),
        _0_06("0.06"),
        _0_11("0.11"),
        _0_0_80("0.0.80"),
        _0_0_81("0.0.81"),
        _0_0_82("0.0.82"),
        _0_4_0("0.4.0"),
        _0_5_0("0.5.0"),
        _1_0_0("1.0.0"),
        _1_0_1("1.0.1"),
        _1_0_2("1.0.2"),
        _1_1_0("1.1.0"),
        _1_4_0("1.4.0"),
        _1_6_0("1.6.0"),
        _1_8_0("1.8.0"),
        _3_0_0("3.0.0"),
        _3_0_1("3.0.1"),
        _3_3_0("3.3.0"),
        _3_5_0("3.5.0"),
        _4_0_0("4.0.0"),
        _4_0_1("4.0.1");
        private final String value;
        private final static Map<String, StructureDefinition.FHIRVersion> CONSTANTS = new HashMap<String, StructureDefinition.FHIRVersion>();

        static {
            for (StructureDefinition.FHIRVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FHIRVersion(String value) {
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
        public static StructureDefinition.FHIRVersion fromValue(String value) {
            StructureDefinition.FHIRVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Defines the kind of structure that this definition is describing.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Kind {

        PRIMITIVE_TYPE("primitive-type"),
        COMPLEX_TYPE("complex-type"),
        RESOURCE("resource"),
        LOGICAL("logical");
        private final String value;
        private final static Map<String, StructureDefinition.Kind> CONSTANTS = new HashMap<String, StructureDefinition.Kind>();

        static {
            for (StructureDefinition.Kind c: values()) {
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
        public static StructureDefinition.Kind fromValue(String value) {
            StructureDefinition.Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The status of this structure definition. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, StructureDefinition.Status> CONSTANTS = new HashMap<String, StructureDefinition.Status>();

        static {
            for (StructureDefinition.Status c: values()) {
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
        public static StructureDefinition.Status fromValue(String value) {
            StructureDefinition.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
