
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "url",
    "_url",
    "version",
    "_version",
    "status",
    "_status",
    "legalState",
    "instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "contentDerivative",
    "issued",
    "_issued",
    "applies",
    "expirationType",
    "subject",
    "authority",
    "domain",
    "site",
    "name",
    "_name",
    "title",
    "_title",
    "subtitle",
    "_subtitle",
    "alias",
    "_alias",
    "author",
    "scope",
    "topicCodeableConcept",
    "topicReference",
    "type",
    "subType",
    "contentDefinition",
    "term",
    "supportingInfo",
    "relevantHistory",
    "signer",
    "friendly",
    "legal",
    "rule",
    "legallyBindingAttachment",
    "legallyBindingReference"
})
@Generated("jsonschema2pojo")
public class Contract
    extends DomainResource
{

    /**
     * This is a Contract resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Contract resource")
    private String resourceType;
    /**
     * Unique identifier for this Contract or a derivative that references a Source Contract.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique identifier for this Contract or a derivative that references a Source Contract.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String status;
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
    @JsonProperty("legalState")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept legalState;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference instantiatesCanonical;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String instantiatesUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _instantiatesUri;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("contentDerivative")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept contentDerivative;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String issued;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _issued;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("applies")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period applies;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("expirationType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept expirationType;
    /**
     * The target entity impacted by or of interest to parties to the agreement.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The target entity impacted by or of interest to parties to the agreement.")
    private List<Reference> subject = new ArrayList<Reference>();
    /**
     * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
     * 
     */
    @JsonProperty("authority")
    @JsonPropertyDescription("A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.")
    private List<Reference> authority = new ArrayList<Reference>();
    /**
     * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.")
    private List<Reference> domain = new ArrayList<Reference>();
    /**
     * Sites in which the contract is complied with,  exercised, or in force.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("Sites in which the contract is complied with,  exercised, or in force.")
    private List<Reference> site = new ArrayList<Reference>();
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
     * Alternative representation of the title for this Contract definition, derivative, or instance in any legal state., e.g., a domain specific contract number related to legislation.
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("Alternative representation of the title for this Contract definition, derivative, or instance in any legal state., e.g., a domain specific contract number related to legislation.")
    private List<String> alias = new ArrayList<String>();
    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    @JsonPropertyDescription("Extensions for alias")
    private List<Element> _alias = new ArrayList<Element>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference author;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept scope;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topicCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept topicCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topicReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference topicReference;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the context of the Contract's scope.
     * 
     */
    @JsonProperty("subType")
    @JsonPropertyDescription("Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the context of the Contract's scope.")
    private List<CodeableConcept> subType = new ArrayList<CodeableConcept>();
    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     * 
     */
    @JsonProperty("contentDefinition")
    @JsonPropertyDescription("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")
    private Contract_ContentDefinition contentDefinition;
    /**
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.")
    private List<Contract_Term> term = new ArrayList<Contract_Term>();
    /**
     * Information that may be needed by/relevant to the performer in their execution of this term action.
     * 
     */
    @JsonProperty("supportingInfo")
    @JsonPropertyDescription("Information that may be needed by/relevant to the performer in their execution of this term action.")
    private List<Reference> supportingInfo = new ArrayList<Reference>();
    /**
     * Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract.  The Provence.entity indicates the target that was changed in the update. http://build.fhir.org/provenance-definitions.html#Provenance.entity.
     * 
     */
    @JsonProperty("relevantHistory")
    @JsonPropertyDescription("Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract.  The Provence.entity indicates the target that was changed in the update. http://build.fhir.org/provenance-definitions.html#Provenance.entity.")
    private List<Reference> relevantHistory = new ArrayList<Reference>();
    /**
     * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
     * 
     */
    @JsonProperty("signer")
    @JsonPropertyDescription("Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.")
    private List<Contract_Signer> signer = new ArrayList<Contract_Signer>();
    /**
     * The &quot;patient friendly language&quot; versionof the Contract in whole or in parts. &quot;Patient friendly language&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * 
     */
    @JsonProperty("friendly")
    @JsonPropertyDescription("The \"patient friendly language\" versionof the Contract in whole or in parts. \"Patient friendly language\" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.")
    private List<Contract_Friendly> friendly = new ArrayList<Contract_Friendly>();
    /**
     * List of Legal expressions or representations of this Contract.
     * 
     */
    @JsonProperty("legal")
    @JsonPropertyDescription("List of Legal expressions or representations of this Contract.")
    private List<Contract_Legal> legal = new ArrayList<Contract_Legal>();
    /**
     * List of Computable Policy Rule Language Representations of this Contract.
     * 
     */
    @JsonProperty("rule")
    @JsonPropertyDescription("List of Computable Policy Rule Language Representations of this Contract.")
    private List<Contract_Rule> rule = new ArrayList<Contract_Rule>();
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("legallyBindingAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment legallyBindingAttachment;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("legallyBindingReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference legallyBindingReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Contract resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Contract resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique identifier for this Contract or a derivative that references a Source Contract.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique identifier for this Contract or a derivative that references a Source Contract.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
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
    @JsonProperty("legalState")
    public CodeableConcept getLegalState() {
        return legalState;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalState")
    public void setLegalState(CodeableConcept legalState) {
        this.legalState = legalState;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public Reference getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Reference instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("instantiatesUri")
    public String getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(String instantiatesUri) {
        this.instantiatesUri = instantiatesUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instantiatesUri")
    public Element get_instantiatesUri() {
        return _instantiatesUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_instantiatesUri")
    public void set_instantiatesUri(Element _instantiatesUri) {
        this._instantiatesUri = _instantiatesUri;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("contentDerivative")
    public CodeableConcept getContentDerivative() {
        return contentDerivative;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("contentDerivative")
    public void setContentDerivative(CodeableConcept contentDerivative) {
        this.contentDerivative = contentDerivative;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    public String getIssued() {
        return issued;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public Element get_issued() {
        return _issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public void set_issued(Element _issued) {
        this._issued = _issued;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("applies")
    public Period getApplies() {
        return applies;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("applies")
    public void setApplies(Period applies) {
        this.applies = applies;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("expirationType")
    public CodeableConcept getExpirationType() {
        return expirationType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("expirationType")
    public void setExpirationType(CodeableConcept expirationType) {
        this.expirationType = expirationType;
    }

    /**
     * The target entity impacted by or of interest to parties to the agreement.
     * 
     */
    @JsonProperty("subject")
    public List<Reference> getSubject() {
        return subject;
    }

    /**
     * The target entity impacted by or of interest to parties to the agreement.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(List<Reference> subject) {
        this.subject = subject;
    }

    /**
     * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
     * 
     */
    @JsonProperty("authority")
    public List<Reference> getAuthority() {
        return authority;
    }

    /**
     * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
     * 
     */
    @JsonProperty("authority")
    public void setAuthority(List<Reference> authority) {
        this.authority = authority;
    }

    /**
     * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
     * 
     */
    @JsonProperty("domain")
    public List<Reference> getDomain() {
        return domain;
    }

    /**
     * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(List<Reference> domain) {
        this.domain = domain;
    }

    /**
     * Sites in which the contract is complied with,  exercised, or in force.
     * 
     */
    @JsonProperty("site")
    public List<Reference> getSite() {
        return site;
    }

    /**
     * Sites in which the contract is complied with,  exercised, or in force.
     * 
     */
    @JsonProperty("site")
    public void setSite(List<Reference> site) {
        this.site = site;
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
     * Alternative representation of the title for this Contract definition, derivative, or instance in any legal state., e.g., a domain specific contract number related to legislation.
     * 
     */
    @JsonProperty("alias")
    public List<String> getAlias() {
        return alias;
    }

    /**
     * Alternative representation of the title for this Contract definition, derivative, or instance in any legal state., e.g., a domain specific contract number related to legislation.
     * 
     */
    @JsonProperty("alias")
    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public List<Element> get_alias() {
        return _alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public void set_alias(List<Element> _alias) {
        this._alias = _alias;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    public Reference getAuthor() {
        return author;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Reference author) {
        this.author = author;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scope")
    public CodeableConcept getScope() {
        return scope;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scope")
    public void setScope(CodeableConcept scope) {
        this.scope = scope;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topicCodeableConcept")
    public CodeableConcept getTopicCodeableConcept() {
        return topicCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topicCodeableConcept")
    public void setTopicCodeableConcept(CodeableConcept topicCodeableConcept) {
        this.topicCodeableConcept = topicCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topicReference")
    public Reference getTopicReference() {
        return topicReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topicReference")
    public void setTopicReference(Reference topicReference) {
        this.topicReference = topicReference;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the context of the Contract's scope.
     * 
     */
    @JsonProperty("subType")
    public List<CodeableConcept> getSubType() {
        return subType;
    }

    /**
     * Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the context of the Contract's scope.
     * 
     */
    @JsonProperty("subType")
    public void setSubType(List<CodeableConcept> subType) {
        this.subType = subType;
    }

    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     * 
     */
    @JsonProperty("contentDefinition")
    public Contract_ContentDefinition getContentDefinition() {
        return contentDefinition;
    }

    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     * 
     */
    @JsonProperty("contentDefinition")
    public void setContentDefinition(Contract_ContentDefinition contentDefinition) {
        this.contentDefinition = contentDefinition;
    }

    /**
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * 
     */
    @JsonProperty("term")
    public List<Contract_Term> getTerm() {
        return term;
    }

    /**
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * 
     */
    @JsonProperty("term")
    public void setTerm(List<Contract_Term> term) {
        this.term = term;
    }

    /**
     * Information that may be needed by/relevant to the performer in their execution of this term action.
     * 
     */
    @JsonProperty("supportingInfo")
    public List<Reference> getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Information that may be needed by/relevant to the performer in their execution of this term action.
     * 
     */
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(List<Reference> supportingInfo) {
        this.supportingInfo = supportingInfo;
    }

    /**
     * Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract.  The Provence.entity indicates the target that was changed in the update. http://build.fhir.org/provenance-definitions.html#Provenance.entity.
     * 
     */
    @JsonProperty("relevantHistory")
    public List<Reference> getRelevantHistory() {
        return relevantHistory;
    }

    /**
     * Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract.  The Provence.entity indicates the target that was changed in the update. http://build.fhir.org/provenance-definitions.html#Provenance.entity.
     * 
     */
    @JsonProperty("relevantHistory")
    public void setRelevantHistory(List<Reference> relevantHistory) {
        this.relevantHistory = relevantHistory;
    }

    /**
     * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
     * 
     */
    @JsonProperty("signer")
    public List<Contract_Signer> getSigner() {
        return signer;
    }

    /**
     * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
     * 
     */
    @JsonProperty("signer")
    public void setSigner(List<Contract_Signer> signer) {
        this.signer = signer;
    }

    /**
     * The &quot;patient friendly language&quot; versionof the Contract in whole or in parts. &quot;Patient friendly language&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * 
     */
    @JsonProperty("friendly")
    public List<Contract_Friendly> getFriendly() {
        return friendly;
    }

    /**
     * The &quot;patient friendly language&quot; versionof the Contract in whole or in parts. &quot;Patient friendly language&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * 
     */
    @JsonProperty("friendly")
    public void setFriendly(List<Contract_Friendly> friendly) {
        this.friendly = friendly;
    }

    /**
     * List of Legal expressions or representations of this Contract.
     * 
     */
    @JsonProperty("legal")
    public List<Contract_Legal> getLegal() {
        return legal;
    }

    /**
     * List of Legal expressions or representations of this Contract.
     * 
     */
    @JsonProperty("legal")
    public void setLegal(List<Contract_Legal> legal) {
        this.legal = legal;
    }

    /**
     * List of Computable Policy Rule Language Representations of this Contract.
     * 
     */
    @JsonProperty("rule")
    public List<Contract_Rule> getRule() {
        return rule;
    }

    /**
     * List of Computable Policy Rule Language Representations of this Contract.
     * 
     */
    @JsonProperty("rule")
    public void setRule(List<Contract_Rule> rule) {
        this.rule = rule;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("legallyBindingAttachment")
    public Attachment getLegallyBindingAttachment() {
        return legallyBindingAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("legallyBindingAttachment")
    public void setLegallyBindingAttachment(Attachment legallyBindingAttachment) {
        this.legallyBindingAttachment = legallyBindingAttachment;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("legallyBindingReference")
    public Reference getLegallyBindingReference() {
        return legallyBindingReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("legallyBindingReference")
    public void setLegallyBindingReference(Reference legallyBindingReference) {
        this.legallyBindingReference = legallyBindingReference;
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
        sb.append(Contract.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("legalState");
        sb.append('=');
        sb.append(((this.legalState == null)?"<null>":this.legalState));
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
        sb.append("contentDerivative");
        sb.append('=');
        sb.append(((this.contentDerivative == null)?"<null>":this.contentDerivative));
        sb.append(',');
        sb.append("issued");
        sb.append('=');
        sb.append(((this.issued == null)?"<null>":this.issued));
        sb.append(',');
        sb.append("_issued");
        sb.append('=');
        sb.append(((this._issued == null)?"<null>":this._issued));
        sb.append(',');
        sb.append("applies");
        sb.append('=');
        sb.append(((this.applies == null)?"<null>":this.applies));
        sb.append(',');
        sb.append("expirationType");
        sb.append('=');
        sb.append(((this.expirationType == null)?"<null>":this.expirationType));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("authority");
        sb.append('=');
        sb.append(((this.authority == null)?"<null>":this.authority));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
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
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("_alias");
        sb.append('=');
        sb.append(((this._alias == null)?"<null>":this._alias));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("topicCodeableConcept");
        sb.append('=');
        sb.append(((this.topicCodeableConcept == null)?"<null>":this.topicCodeableConcept));
        sb.append(',');
        sb.append("topicReference");
        sb.append('=');
        sb.append(((this.topicReference == null)?"<null>":this.topicReference));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("subType");
        sb.append('=');
        sb.append(((this.subType == null)?"<null>":this.subType));
        sb.append(',');
        sb.append("contentDefinition");
        sb.append('=');
        sb.append(((this.contentDefinition == null)?"<null>":this.contentDefinition));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("supportingInfo");
        sb.append('=');
        sb.append(((this.supportingInfo == null)?"<null>":this.supportingInfo));
        sb.append(',');
        sb.append("relevantHistory");
        sb.append('=');
        sb.append(((this.relevantHistory == null)?"<null>":this.relevantHistory));
        sb.append(',');
        sb.append("signer");
        sb.append('=');
        sb.append(((this.signer == null)?"<null>":this.signer));
        sb.append(',');
        sb.append("friendly");
        sb.append('=');
        sb.append(((this.friendly == null)?"<null>":this.friendly));
        sb.append(',');
        sb.append("legal");
        sb.append('=');
        sb.append(((this.legal == null)?"<null>":this.legal));
        sb.append(',');
        sb.append("rule");
        sb.append('=');
        sb.append(((this.rule == null)?"<null>":this.rule));
        sb.append(',');
        sb.append("legallyBindingAttachment");
        sb.append('=');
        sb.append(((this.legallyBindingAttachment == null)?"<null>":this.legallyBindingAttachment));
        sb.append(',');
        sb.append("legallyBindingReference");
        sb.append('=');
        sb.append(((this.legallyBindingReference == null)?"<null>":this.legallyBindingReference));
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
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.friendly == null)? 0 :this.friendly.hashCode()));
        result = ((result* 31)+((this.rule == null)? 0 :this.rule.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.relevantHistory == null)? 0 :this.relevantHistory.hashCode()));
        result = ((result* 31)+((this.topicReference == null)? 0 :this.topicReference.hashCode()));
        result = ((result* 31)+((this.supportingInfo == null)? 0 :this.supportingInfo.hashCode()));
        result = ((result* 31)+((this.contentDefinition == null)? 0 :this.contentDefinition.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.legal == null)? 0 :this.legal.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this.issued == null)? 0 :this.issued.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this.contentDerivative == null)? 0 :this.contentDerivative.hashCode()));
        result = ((result* 31)+((this.signer == null)? 0 :this.signer.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.expirationType == null)? 0 :this.expirationType.hashCode()));
        result = ((result* 31)+((this._subtitle == null)? 0 :this._subtitle.hashCode()));
        result = ((result* 31)+((this.legallyBindingAttachment == null)? 0 :this.legallyBindingAttachment.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.topicCodeableConcept == null)? 0 :this.topicCodeableConcept.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this._issued == null)? 0 :this._issued.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.applies == null)? 0 :this.applies.hashCode()));
        result = ((result* 31)+((this._alias == null)? 0 :this._alias.hashCode()));
        result = ((result* 31)+((this.authority == null)? 0 :this.authority.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.subtitle == null)? 0 :this.subtitle.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.legalState == null)? 0 :this.legalState.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.legallyBindingReference == null)? 0 :this.legallyBindingReference.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract) == false) {
            return false;
        }
        Contract rhs = ((Contract) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.friendly == rhs.friendly)||((this.friendly!= null)&&this.friendly.equals(rhs.friendly))))&&((this.rule == rhs.rule)||((this.rule!= null)&&this.rule.equals(rhs.rule))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.relevantHistory == rhs.relevantHistory)||((this.relevantHistory!= null)&&this.relevantHistory.equals(rhs.relevantHistory))))&&((this.topicReference == rhs.topicReference)||((this.topicReference!= null)&&this.topicReference.equals(rhs.topicReference))))&&((this.supportingInfo == rhs.supportingInfo)||((this.supportingInfo!= null)&&this.supportingInfo.equals(rhs.supportingInfo))))&&((this.contentDefinition == rhs.contentDefinition)||((this.contentDefinition!= null)&&this.contentDefinition.equals(rhs.contentDefinition))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.legal == rhs.legal)||((this.legal!= null)&&this.legal.equals(rhs.legal))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this.issued == rhs.issued)||((this.issued!= null)&&this.issued.equals(rhs.issued))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this.contentDerivative == rhs.contentDerivative)||((this.contentDerivative!= null)&&this.contentDerivative.equals(rhs.contentDerivative))))&&((this.signer == rhs.signer)||((this.signer!= null)&&this.signer.equals(rhs.signer))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.expirationType == rhs.expirationType)||((this.expirationType!= null)&&this.expirationType.equals(rhs.expirationType))))&&((this._subtitle == rhs._subtitle)||((this._subtitle!= null)&&this._subtitle.equals(rhs._subtitle))))&&((this.legallyBindingAttachment == rhs.legallyBindingAttachment)||((this.legallyBindingAttachment!= null)&&this.legallyBindingAttachment.equals(rhs.legallyBindingAttachment))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.topicCodeableConcept == rhs.topicCodeableConcept)||((this.topicCodeableConcept!= null)&&this.topicCodeableConcept.equals(rhs.topicCodeableConcept))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this._issued == rhs._issued)||((this._issued!= null)&&this._issued.equals(rhs._issued))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.applies == rhs.applies)||((this.applies!= null)&&this.applies.equals(rhs.applies))))&&((this._alias == rhs._alias)||((this._alias!= null)&&this._alias.equals(rhs._alias))))&&((this.authority == rhs.authority)||((this.authority!= null)&&this.authority.equals(rhs.authority))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.subtitle == rhs.subtitle)||((this.subtitle!= null)&&this.subtitle.equals(rhs.subtitle))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.legalState == rhs.legalState)||((this.legalState!= null)&&this.legalState.equals(rhs.legalState))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.legallyBindingReference == rhs.legallyBindingReference)||((this.legallyBindingReference!= null)&&this.legallyBindingReference.equals(rhs.legallyBindingReference))));
    }

}
