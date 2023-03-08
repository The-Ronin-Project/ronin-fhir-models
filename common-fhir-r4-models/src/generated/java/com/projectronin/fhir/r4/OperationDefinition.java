
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
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
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
    "kind",
    "_kind",
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
    "affectsState",
    "_affectsState",
    "code",
    "_code",
    "comment",
    "_comment",
    "base",
    "resource",
    "_resource",
    "system",
    "_system",
    "type",
    "_type",
    "instance",
    "_instance",
    "inputProfile",
    "outputProfile",
    "parameter",
    "overload"
})
@Generated("jsonschema2pojo")
public class OperationDefinition
    extends DomainResource
{

    /**
     * This is a OperationDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a OperationDefinition resource")
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
     * The status of this operation definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this operation definition. Enables tracking the life-cycle of the content.")
    private OperationDefinition.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * Whether this is an operation or a named query.
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("Whether this is an operation or a named query.")
    private OperationDefinition.Kind kind;
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate operation definition instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate operation definition instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the operation definition is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the operation definition is intended to be used.")
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("affectsState")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean affectsState;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_affectsState")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _affectsState;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String comment;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _comment;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("base")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String base;
    /**
     * The types on which this operation can be executed.
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("The types on which this operation can be executed.")
    private List<String> resource = new ArrayList<String>();
    /**
     * Extensions for resource
     * 
     */
    @JsonProperty("_resource")
    @JsonPropertyDescription("Extensions for resource")
    private List<Element> _resource = new ArrayList<Element>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean system;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _system;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("instance")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean instance;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instance")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _instance;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("inputProfile")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String inputProfile;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("outputProfile")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String outputProfile;
    /**
     * The parameters for the operation/query.
     * 
     */
    @JsonProperty("parameter")
    @JsonPropertyDescription("The parameters for the operation/query.")
    private List<OperationDefinition_Parameter> parameter = new ArrayList<OperationDefinition_Parameter>();
    /**
     * Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.
     * 
     */
    @JsonProperty("overload")
    @JsonPropertyDescription("Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.")
    private List<OperationDefinition_Overload> overload = new ArrayList<OperationDefinition_Overload>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a OperationDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a OperationDefinition resource
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
     * The status of this operation definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public OperationDefinition.Status getStatus() {
        return status;
    }

    /**
     * The status of this operation definition. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(OperationDefinition.Status status) {
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
     * Whether this is an operation or a named query.
     * 
     */
    @JsonProperty("kind")
    public OperationDefinition.Kind getKind() {
        return kind;
    }

    /**
     * Whether this is an operation or a named query.
     * 
     */
    @JsonProperty("kind")
    public void setKind(OperationDefinition.Kind kind) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate operation definition instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate operation definition instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the operation definition is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the operation definition is intended to be used.
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("affectsState")
    public Boolean getAffectsState() {
        return affectsState;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("affectsState")
    public void setAffectsState(Boolean affectsState) {
        this.affectsState = affectsState;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_affectsState")
    public Element get_affectsState() {
        return _affectsState;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_affectsState")
    public void set_affectsState(Element _affectsState) {
        this._affectsState = _affectsState;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public Element get_code() {
        return _code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public void set_code(Element _code) {
        this._code = _code;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public Element get_comment() {
        return _comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public void set_comment(Element _comment) {
        this._comment = _comment;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * The types on which this operation can be executed.
     * 
     */
    @JsonProperty("resource")
    public List<String> getResource() {
        return resource;
    }

    /**
     * The types on which this operation can be executed.
     * 
     */
    @JsonProperty("resource")
    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    /**
     * Extensions for resource
     * 
     */
    @JsonProperty("_resource")
    public List<Element> get_resource() {
        return _resource;
    }

    /**
     * Extensions for resource
     * 
     */
    @JsonProperty("_resource")
    public void set_resource(List<Element> _resource) {
        this._resource = _resource;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("system")
    public Boolean getSystem() {
        return system;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("system")
    public void setSystem(Boolean system) {
        this.system = system;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    public Element get_system() {
        return _system;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    public void set_system(Element _system) {
        this._system = _system;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("type")
    public Boolean getType() {
        return type;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("type")
    public void setType(Boolean type) {
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("instance")
    public Boolean getInstance() {
        return instance;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("instance")
    public void setInstance(Boolean instance) {
        this.instance = instance;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instance")
    public Element get_instance() {
        return _instance;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instance")
    public void set_instance(Element _instance) {
        this._instance = _instance;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("inputProfile")
    public String getInputProfile() {
        return inputProfile;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("inputProfile")
    public void setInputProfile(String inputProfile) {
        this.inputProfile = inputProfile;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("outputProfile")
    public String getOutputProfile() {
        return outputProfile;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("outputProfile")
    public void setOutputProfile(String outputProfile) {
        this.outputProfile = outputProfile;
    }

    /**
     * The parameters for the operation/query.
     * 
     */
    @JsonProperty("parameter")
    public List<OperationDefinition_Parameter> getParameter() {
        return parameter;
    }

    /**
     * The parameters for the operation/query.
     * 
     */
    @JsonProperty("parameter")
    public void setParameter(List<OperationDefinition_Parameter> parameter) {
        this.parameter = parameter;
    }

    /**
     * Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.
     * 
     */
    @JsonProperty("overload")
    public List<OperationDefinition_Overload> getOverload() {
        return overload;
    }

    /**
     * Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.
     * 
     */
    @JsonProperty("overload")
    public void setOverload(List<OperationDefinition_Overload> overload) {
        this.overload = overload;
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
        sb.append(OperationDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("_kind");
        sb.append('=');
        sb.append(((this._kind == null)?"<null>":this._kind));
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
        sb.append("affectsState");
        sb.append('=');
        sb.append(((this.affectsState == null)?"<null>":this.affectsState));
        sb.append(',');
        sb.append("_affectsState");
        sb.append('=');
        sb.append(((this._affectsState == null)?"<null>":this._affectsState));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
        sb.append(',');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("_resource");
        sb.append('=');
        sb.append(((this._resource == null)?"<null>":this._resource));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("_system");
        sb.append('=');
        sb.append(((this._system == null)?"<null>":this._system));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("instance");
        sb.append('=');
        sb.append(((this.instance == null)?"<null>":this.instance));
        sb.append(',');
        sb.append("_instance");
        sb.append('=');
        sb.append(((this._instance == null)?"<null>":this._instance));
        sb.append(',');
        sb.append("inputProfile");
        sb.append('=');
        sb.append(((this.inputProfile == null)?"<null>":this.inputProfile));
        sb.append(',');
        sb.append("outputProfile");
        sb.append('=');
        sb.append(((this.outputProfile == null)?"<null>":this.outputProfile));
        sb.append(',');
        sb.append("parameter");
        sb.append('=');
        sb.append(((this.parameter == null)?"<null>":this.parameter));
        sb.append(',');
        sb.append("overload");
        sb.append('=');
        sb.append(((this.overload == null)?"<null>":this.overload));
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
        result = ((result* 31)+((this._system == null)? 0 :this._system.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.instance == null)? 0 :this.instance.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._instance == null)? 0 :this._instance.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.parameter == null)? 0 :this.parameter.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this._kind == null)? 0 :this._kind.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.inputProfile == null)? 0 :this.inputProfile.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.affectsState == null)? 0 :this.affectsState.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.overload == null)? 0 :this.overload.hashCode()));
        result = ((result* 31)+((this._affectsState == null)? 0 :this._affectsState.hashCode()));
        result = ((result* 31)+((this.outputProfile == null)? 0 :this.outputProfile.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this._publisher == null)? 0 :this._publisher.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.useContext == null)? 0 :this.useContext.hashCode()));
        result = ((result* 31)+((this._resource == null)? 0 :this._resource.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.base == null)? 0 :this.base.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperationDefinition) == false) {
            return false;
        }
        OperationDefinition rhs = ((OperationDefinition) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this._system == rhs._system)||((this._system!= null)&&this._system.equals(rhs._system))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.instance == rhs.instance)||((this.instance!= null)&&this.instance.equals(rhs.instance))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._instance == rhs._instance)||((this._instance!= null)&&this._instance.equals(rhs._instance))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.parameter == rhs.parameter)||((this.parameter!= null)&&this.parameter.equals(rhs.parameter))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this._kind == rhs._kind)||((this._kind!= null)&&this._kind.equals(rhs._kind))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.inputProfile == rhs.inputProfile)||((this.inputProfile!= null)&&this.inputProfile.equals(rhs.inputProfile))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.affectsState == rhs.affectsState)||((this.affectsState!= null)&&this.affectsState.equals(rhs.affectsState))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.overload == rhs.overload)||((this.overload!= null)&&this.overload.equals(rhs.overload))))&&((this._affectsState == rhs._affectsState)||((this._affectsState!= null)&&this._affectsState.equals(rhs._affectsState))))&&((this.outputProfile == rhs.outputProfile)||((this.outputProfile!= null)&&this.outputProfile.equals(rhs.outputProfile))))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this._resource == rhs._resource)||((this._resource!= null)&&this._resource.equals(rhs._resource))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.base == rhs.base)||((this.base!= null)&&this.base.equals(rhs.base))));
    }


    /**
     * Whether this is an operation or a named query.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Kind {

        OPERATION("operation"),
        QUERY("query");
        private final String value;
        private final static Map<String, OperationDefinition.Kind> CONSTANTS = new HashMap<String, OperationDefinition.Kind>();

        static {
            for (OperationDefinition.Kind c: values()) {
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
        public static OperationDefinition.Kind fromValue(String value) {
            OperationDefinition.Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The status of this operation definition. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, OperationDefinition.Status> CONSTANTS = new HashMap<String, OperationDefinition.Status>();

        static {
            for (OperationDefinition.Status c: values()) {
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
        public static OperationDefinition.Status fromValue(String value) {
            OperationDefinition.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
