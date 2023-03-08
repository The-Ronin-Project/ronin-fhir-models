
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
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
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
    "derivedFrom",
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
    "code",
    "_code",
    "base",
    "_base",
    "type",
    "_type",
    "expression",
    "_expression",
    "xpath",
    "_xpath",
    "xpathUsage",
    "_xpathUsage",
    "target",
    "_target",
    "multipleOr",
    "_multipleOr",
    "multipleAnd",
    "_multipleAnd",
    "comparator",
    "_comparator",
    "modifier",
    "_modifier",
    "chain",
    "_chain",
    "component"
})
@Generated("jsonschema2pojo")
public class SearchParameter
    extends DomainResource
{

    /**
     * This is a SearchParameter resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SearchParameter resource")
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("derivedFrom")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String derivedFrom;
    /**
     * The status of this search parameter. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this search parameter. Enables tracking the life-cycle of the content.")
    private SearchParameter.Status status;
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate search parameter instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate search parameter instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the search parameter is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the search parameter is intended to be used.")
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
     * The base resource type(s) that this search parameter can be used against.
     * 
     */
    @JsonProperty("base")
    @JsonPropertyDescription("The base resource type(s) that this search parameter can be used against.")
    private List<String> base = new ArrayList<String>();
    /**
     * Extensions for base
     * 
     */
    @JsonProperty("_base")
    @JsonPropertyDescription("Extensions for base")
    private List<Element> _base = new ArrayList<Element>();
    /**
     * The type of value that a search parameter may contain, and how the content is interpreted.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of value that a search parameter may contain, and how the content is interpreted.")
    private SearchParameter.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("expression")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String expression;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expression")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _expression;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("xpath")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String xpath;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_xpath")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _xpath;
    /**
     * How the search parameter relates to the set of elements returned by evaluating the xpath query.
     * 
     */
    @JsonProperty("xpathUsage")
    @JsonPropertyDescription("How the search parameter relates to the set of elements returned by evaluating the xpath query.")
    private SearchParameter.XpathUsage xpathUsage;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_xpathUsage")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _xpathUsage;
    /**
     * Types of resource (if a resource is referenced).
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Types of resource (if a resource is referenced).")
    private List<String> target = new ArrayList<String>();
    /**
     * Extensions for target
     * 
     */
    @JsonProperty("_target")
    @JsonPropertyDescription("Extensions for target")
    private List<Element> _target = new ArrayList<Element>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleOr")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean multipleOr;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleOr")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _multipleOr;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleAnd")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean multipleAnd;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleAnd")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _multipleAnd;
    /**
     * Comparators supported for the search parameter.
     * 
     */
    @JsonProperty("comparator")
    @JsonPropertyDescription("Comparators supported for the search parameter.")
    private List<Comparator> comparator = new ArrayList<Comparator>();
    /**
     * Extensions for comparator
     * 
     */
    @JsonProperty("_comparator")
    @JsonPropertyDescription("Extensions for comparator")
    private List<Element> _comparator = new ArrayList<Element>();
    /**
     * A modifier supported for the search parameter.
     * 
     */
    @JsonProperty("modifier")
    @JsonPropertyDescription("A modifier supported for the search parameter.")
    private List<Modifier> modifier = new ArrayList<Modifier>();
    /**
     * Extensions for modifier
     * 
     */
    @JsonProperty("_modifier")
    @JsonPropertyDescription("Extensions for modifier")
    private List<Element> _modifier = new ArrayList<Element>();
    /**
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type.
     * 
     */
    @JsonProperty("chain")
    @JsonPropertyDescription("Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type.")
    private List<String> chain = new ArrayList<String>();
    /**
     * Extensions for chain
     * 
     */
    @JsonProperty("_chain")
    @JsonPropertyDescription("Extensions for chain")
    private List<Element> _chain = new ArrayList<Element>();
    /**
     * Used to define the parts of a composite search parameter.
     * 
     */
    @JsonProperty("component")
    @JsonPropertyDescription("Used to define the parts of a composite search parameter.")
    private List<SearchParameter_Component> component = new ArrayList<SearchParameter_Component>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SearchParameter resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SearchParameter resource
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("derivedFrom")
    public String getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    /**
     * The status of this search parameter. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public SearchParameter.Status getStatus() {
        return status;
    }

    /**
     * The status of this search parameter. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(SearchParameter.Status status) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate search parameter instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate search parameter instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the search parameter is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the search parameter is intended to be used.
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
     * The base resource type(s) that this search parameter can be used against.
     * 
     */
    @JsonProperty("base")
    public List<String> getBase() {
        return base;
    }

    /**
     * The base resource type(s) that this search parameter can be used against.
     * 
     */
    @JsonProperty("base")
    public void setBase(List<String> base) {
        this.base = base;
    }

    /**
     * Extensions for base
     * 
     */
    @JsonProperty("_base")
    public List<Element> get_base() {
        return _base;
    }

    /**
     * Extensions for base
     * 
     */
    @JsonProperty("_base")
    public void set_base(List<Element> _base) {
        this._base = _base;
    }

    /**
     * The type of value that a search parameter may contain, and how the content is interpreted.
     * 
     */
    @JsonProperty("type")
    public SearchParameter.Type getType() {
        return type;
    }

    /**
     * The type of value that a search parameter may contain, and how the content is interpreted.
     * 
     */
    @JsonProperty("type")
    public void setType(SearchParameter.Type type) {
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("expression")
    public String getExpression() {
        return expression;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expression")
    public Element get_expression() {
        return _expression;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_expression")
    public void set_expression(Element _expression) {
        this._expression = _expression;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("xpath")
    public String getXpath() {
        return xpath;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("xpath")
    public void setXpath(String xpath) {
        this.xpath = xpath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_xpath")
    public Element get_xpath() {
        return _xpath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_xpath")
    public void set_xpath(Element _xpath) {
        this._xpath = _xpath;
    }

    /**
     * How the search parameter relates to the set of elements returned by evaluating the xpath query.
     * 
     */
    @JsonProperty("xpathUsage")
    public SearchParameter.XpathUsage getXpathUsage() {
        return xpathUsage;
    }

    /**
     * How the search parameter relates to the set of elements returned by evaluating the xpath query.
     * 
     */
    @JsonProperty("xpathUsage")
    public void setXpathUsage(SearchParameter.XpathUsage xpathUsage) {
        this.xpathUsage = xpathUsage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_xpathUsage")
    public Element get_xpathUsage() {
        return _xpathUsage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_xpathUsage")
    public void set_xpathUsage(Element _xpathUsage) {
        this._xpathUsage = _xpathUsage;
    }

    /**
     * Types of resource (if a resource is referenced).
     * 
     */
    @JsonProperty("target")
    public List<String> getTarget() {
        return target;
    }

    /**
     * Types of resource (if a resource is referenced).
     * 
     */
    @JsonProperty("target")
    public void setTarget(List<String> target) {
        this.target = target;
    }

    /**
     * Extensions for target
     * 
     */
    @JsonProperty("_target")
    public List<Element> get_target() {
        return _target;
    }

    /**
     * Extensions for target
     * 
     */
    @JsonProperty("_target")
    public void set_target(List<Element> _target) {
        this._target = _target;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleOr")
    public Boolean getMultipleOr() {
        return multipleOr;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleOr")
    public void setMultipleOr(Boolean multipleOr) {
        this.multipleOr = multipleOr;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleOr")
    public Element get_multipleOr() {
        return _multipleOr;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleOr")
    public void set_multipleOr(Element _multipleOr) {
        this._multipleOr = _multipleOr;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleAnd")
    public Boolean getMultipleAnd() {
        return multipleAnd;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleAnd")
    public void setMultipleAnd(Boolean multipleAnd) {
        this.multipleAnd = multipleAnd;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleAnd")
    public Element get_multipleAnd() {
        return _multipleAnd;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleAnd")
    public void set_multipleAnd(Element _multipleAnd) {
        this._multipleAnd = _multipleAnd;
    }

    /**
     * Comparators supported for the search parameter.
     * 
     */
    @JsonProperty("comparator")
    public List<Comparator> getComparator() {
        return comparator;
    }

    /**
     * Comparators supported for the search parameter.
     * 
     */
    @JsonProperty("comparator")
    public void setComparator(List<Comparator> comparator) {
        this.comparator = comparator;
    }

    /**
     * Extensions for comparator
     * 
     */
    @JsonProperty("_comparator")
    public List<Element> get_comparator() {
        return _comparator;
    }

    /**
     * Extensions for comparator
     * 
     */
    @JsonProperty("_comparator")
    public void set_comparator(List<Element> _comparator) {
        this._comparator = _comparator;
    }

    /**
     * A modifier supported for the search parameter.
     * 
     */
    @JsonProperty("modifier")
    public List<Modifier> getModifier() {
        return modifier;
    }

    /**
     * A modifier supported for the search parameter.
     * 
     */
    @JsonProperty("modifier")
    public void setModifier(List<Modifier> modifier) {
        this.modifier = modifier;
    }

    /**
     * Extensions for modifier
     * 
     */
    @JsonProperty("_modifier")
    public List<Element> get_modifier() {
        return _modifier;
    }

    /**
     * Extensions for modifier
     * 
     */
    @JsonProperty("_modifier")
    public void set_modifier(List<Element> _modifier) {
        this._modifier = _modifier;
    }

    /**
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type.
     * 
     */
    @JsonProperty("chain")
    public List<String> getChain() {
        return chain;
    }

    /**
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type.
     * 
     */
    @JsonProperty("chain")
    public void setChain(List<String> chain) {
        this.chain = chain;
    }

    /**
     * Extensions for chain
     * 
     */
    @JsonProperty("_chain")
    public List<Element> get_chain() {
        return _chain;
    }

    /**
     * Extensions for chain
     * 
     */
    @JsonProperty("_chain")
    public void set_chain(List<Element> _chain) {
        this._chain = _chain;
    }

    /**
     * Used to define the parts of a composite search parameter.
     * 
     */
    @JsonProperty("component")
    public List<SearchParameter_Component> getComponent() {
        return component;
    }

    /**
     * Used to define the parts of a composite search parameter.
     * 
     */
    @JsonProperty("component")
    public void setComponent(List<SearchParameter_Component> component) {
        this.component = component;
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
        sb.append(SearchParameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("derivedFrom");
        sb.append('=');
        sb.append(((this.derivedFrom == null)?"<null>":this.derivedFrom));
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("_base");
        sb.append('=');
        sb.append(((this._base == null)?"<null>":this._base));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("expression");
        sb.append('=');
        sb.append(((this.expression == null)?"<null>":this.expression));
        sb.append(',');
        sb.append("_expression");
        sb.append('=');
        sb.append(((this._expression == null)?"<null>":this._expression));
        sb.append(',');
        sb.append("xpath");
        sb.append('=');
        sb.append(((this.xpath == null)?"<null>":this.xpath));
        sb.append(',');
        sb.append("_xpath");
        sb.append('=');
        sb.append(((this._xpath == null)?"<null>":this._xpath));
        sb.append(',');
        sb.append("xpathUsage");
        sb.append('=');
        sb.append(((this.xpathUsage == null)?"<null>":this.xpathUsage));
        sb.append(',');
        sb.append("_xpathUsage");
        sb.append('=');
        sb.append(((this._xpathUsage == null)?"<null>":this._xpathUsage));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("_target");
        sb.append('=');
        sb.append(((this._target == null)?"<null>":this._target));
        sb.append(',');
        sb.append("multipleOr");
        sb.append('=');
        sb.append(((this.multipleOr == null)?"<null>":this.multipleOr));
        sb.append(',');
        sb.append("_multipleOr");
        sb.append('=');
        sb.append(((this._multipleOr == null)?"<null>":this._multipleOr));
        sb.append(',');
        sb.append("multipleAnd");
        sb.append('=');
        sb.append(((this.multipleAnd == null)?"<null>":this.multipleAnd));
        sb.append(',');
        sb.append("_multipleAnd");
        sb.append('=');
        sb.append(((this._multipleAnd == null)?"<null>":this._multipleAnd));
        sb.append(',');
        sb.append("comparator");
        sb.append('=');
        sb.append(((this.comparator == null)?"<null>":this.comparator));
        sb.append(',');
        sb.append("_comparator");
        sb.append('=');
        sb.append(((this._comparator == null)?"<null>":this._comparator));
        sb.append(',');
        sb.append("modifier");
        sb.append('=');
        sb.append(((this.modifier == null)?"<null>":this.modifier));
        sb.append(',');
        sb.append("_modifier");
        sb.append('=');
        sb.append(((this._modifier == null)?"<null>":this._modifier));
        sb.append(',');
        sb.append("chain");
        sb.append('=');
        sb.append(((this.chain == null)?"<null>":this.chain));
        sb.append(',');
        sb.append("_chain");
        sb.append('=');
        sb.append(((this._chain == null)?"<null>":this._chain));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
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
        result = ((result* 31)+((this._chain == null)? 0 :this._chain.hashCode()));
        result = ((result* 31)+((this._modifier == null)? 0 :this._modifier.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.modifier == null)? 0 :this.modifier.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this._multipleAnd == null)? 0 :this._multipleAnd.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this._xpathUsage == null)? 0 :this._xpathUsage.hashCode()));
        result = ((result* 31)+((this.multipleAnd == null)? 0 :this.multipleAnd.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this._purpose == null)? 0 :this._purpose.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.useContext == null)? 0 :this.useContext.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.xpath == null)? 0 :this.xpath.hashCode()));
        result = ((result* 31)+((this.derivedFrom == null)? 0 :this.derivedFrom.hashCode()));
        result = ((result* 31)+((this._base == null)? 0 :this._base.hashCode()));
        result = ((result* 31)+((this.xpathUsage == null)? 0 :this.xpathUsage.hashCode()));
        result = ((result* 31)+((this._target == null)? 0 :this._target.hashCode()));
        result = ((result* 31)+((this.chain == null)? 0 :this.chain.hashCode()));
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._expression == null)? 0 :this._expression.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this._comparator == null)? 0 :this._comparator.hashCode()));
        result = ((result* 31)+((this.comparator == null)? 0 :this.comparator.hashCode()));
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.multipleOr == null)? 0 :this.multipleOr.hashCode()));
        result = ((result* 31)+((this._xpath == null)? 0 :this._xpath.hashCode()));
        result = ((result* 31)+((this._multipleOr == null)? 0 :this._multipleOr.hashCode()));
        result = ((result* 31)+((this._publisher == null)? 0 :this._publisher.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.base == null)? 0 :this.base.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchParameter) == false) {
            return false;
        }
        SearchParameter rhs = ((SearchParameter) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this._chain == rhs._chain)||((this._chain!= null)&&this._chain.equals(rhs._chain))))&&((this._modifier == rhs._modifier)||((this._modifier!= null)&&this._modifier.equals(rhs._modifier))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.modifier == rhs.modifier)||((this.modifier!= null)&&this.modifier.equals(rhs.modifier))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this._multipleAnd == rhs._multipleAnd)||((this._multipleAnd!= null)&&this._multipleAnd.equals(rhs._multipleAnd))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this._xpathUsage == rhs._xpathUsage)||((this._xpathUsage!= null)&&this._xpathUsage.equals(rhs._xpathUsage))))&&((this.multipleAnd == rhs.multipleAnd)||((this.multipleAnd!= null)&&this.multipleAnd.equals(rhs.multipleAnd))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this._purpose == rhs._purpose)||((this._purpose!= null)&&this._purpose.equals(rhs._purpose))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.xpath == rhs.xpath)||((this.xpath!= null)&&this.xpath.equals(rhs.xpath))))&&((this.derivedFrom == rhs.derivedFrom)||((this.derivedFrom!= null)&&this.derivedFrom.equals(rhs.derivedFrom))))&&((this._base == rhs._base)||((this._base!= null)&&this._base.equals(rhs._base))))&&((this.xpathUsage == rhs.xpathUsage)||((this.xpathUsage!= null)&&this.xpathUsage.equals(rhs.xpathUsage))))&&((this._target == rhs._target)||((this._target!= null)&&this._target.equals(rhs._target))))&&((this.chain == rhs.chain)||((this.chain!= null)&&this.chain.equals(rhs.chain))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._expression == rhs._expression)||((this._expression!= null)&&this._expression.equals(rhs._expression))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this._comparator == rhs._comparator)||((this._comparator!= null)&&this._comparator.equals(rhs._comparator))))&&((this.comparator == rhs.comparator)||((this.comparator!= null)&&this.comparator.equals(rhs.comparator))))&&((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component))))&&((this.multipleOr == rhs.multipleOr)||((this.multipleOr!= null)&&this.multipleOr.equals(rhs.multipleOr))))&&((this._xpath == rhs._xpath)||((this._xpath!= null)&&this._xpath.equals(rhs._xpath))))&&((this._multipleOr == rhs._multipleOr)||((this._multipleOr!= null)&&this._multipleOr.equals(rhs._multipleOr))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.base == rhs.base)||((this.base!= null)&&this.base.equals(rhs.base))));
    }


    /**
     * The status of this search parameter. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, SearchParameter.Status> CONSTANTS = new HashMap<String, SearchParameter.Status>();

        static {
            for (SearchParameter.Status c: values()) {
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
        public static SearchParameter.Status fromValue(String value) {
            SearchParameter.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The type of value that a search parameter may contain, and how the content is interpreted.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        NUMBER("number"),
        DATE("date"),
        STRING("string"),
        TOKEN("token"),
        REFERENCE("reference"),
        COMPOSITE("composite"),
        QUANTITY("quantity"),
        URI("uri"),
        SPECIAL("special");
        private final String value;
        private final static Map<String, SearchParameter.Type> CONSTANTS = new HashMap<String, SearchParameter.Type>();

        static {
            for (SearchParameter.Type c: values()) {
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
        public static SearchParameter.Type fromValue(String value) {
            SearchParameter.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * How the search parameter relates to the set of elements returned by evaluating the xpath query.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum XpathUsage {

        NORMAL("normal"),
        PHONETIC("phonetic"),
        NEARBY("nearby"),
        DISTANCE("distance"),
        OTHER("other");
        private final String value;
        private final static Map<String, SearchParameter.XpathUsage> CONSTANTS = new HashMap<String, SearchParameter.XpathUsage>();

        static {
            for (SearchParameter.XpathUsage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        XpathUsage(String value) {
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
        public static SearchParameter.XpathUsage fromValue(String value) {
            SearchParameter.XpathUsage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
