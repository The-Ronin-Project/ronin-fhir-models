
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
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
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
    "copyright",
    "_copyright",
    "packageId",
    "_packageId",
    "license",
    "_license",
    "fhirVersion",
    "_fhirVersion",
    "dependsOn",
    "global",
    "definition",
    "manifest"
})
@Generated("jsonschema2pojo")
public class ImplementationGuide
    extends DomainResource
{

    /**
     * This is a ImplementationGuide resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ImplementationGuide resource")
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
     * The status of this implementation guide. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this implementation guide. Enables tracking the life-cycle of the content.")
    private ImplementationGuide.Status status;
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.
     * 
     */
    @JsonProperty("useContext")
    @JsonPropertyDescription("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.")
    private List<UsageContext> useContext = new ArrayList<UsageContext>();
    /**
     * A legal or geographic region in which the implementation guide is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("A legal or geographic region in which the implementation guide is intended to be used.")
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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("packageId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String packageId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_packageId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _packageId;
    /**
     * The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.
     * 
     */
    @JsonProperty("license")
    @JsonPropertyDescription("The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.")
    private ImplementationGuide.License license;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_license")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _license;
    /**
     * The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.
     * 
     */
    @JsonProperty("fhirVersion")
    @JsonPropertyDescription("The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.")
    private List<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion> fhirVersion = new ArrayList<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion>();
    /**
     * Extensions for fhirVersion
     * 
     */
    @JsonProperty("_fhirVersion")
    @JsonPropertyDescription("Extensions for fhirVersion")
    private List<Element> _fhirVersion = new ArrayList<Element>();
    /**
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
     * 
     */
    @JsonProperty("dependsOn")
    @JsonPropertyDescription("Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.")
    private List<ImplementationGuide_DependsOn> dependsOn = new ArrayList<ImplementationGuide_DependsOn>();
    /**
     * A set of profiles that all resources covered by this implementation guide must conform to.
     * 
     */
    @JsonProperty("global")
    @JsonPropertyDescription("A set of profiles that all resources covered by this implementation guide must conform to.")
    private List<ImplementationGuide_Global> global = new ArrayList<ImplementationGuide_Global>();
    /**
     * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
     * 
     */
    @JsonProperty("definition")
    @JsonPropertyDescription("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.")
    private ImplementationGuide_Definition definition;
    /**
     * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
     * 
     */
    @JsonProperty("manifest")
    @JsonPropertyDescription("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.")
    private ImplementationGuide_Manifest manifest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ImplementationGuide resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ImplementationGuide resource
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
     * The status of this implementation guide. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public ImplementationGuide.Status getStatus() {
        return status;
    }

    /**
     * The status of this implementation guide. Enables tracking the life-cycle of the content.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ImplementationGuide.Status status) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.
     * 
     */
    @JsonProperty("useContext")
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.
     * 
     */
    @JsonProperty("useContext")
    public void setUseContext(List<UsageContext> useContext) {
        this.useContext = useContext;
    }

    /**
     * A legal or geographic region in which the implementation guide is intended to be used.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * A legal or geographic region in which the implementation guide is intended to be used.
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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("packageId")
    public String getPackageId() {
        return packageId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("packageId")
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_packageId")
    public Element get_packageId() {
        return _packageId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_packageId")
    public void set_packageId(Element _packageId) {
        this._packageId = _packageId;
    }

    /**
     * The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.
     * 
     */
    @JsonProperty("license")
    public ImplementationGuide.License getLicense() {
        return license;
    }

    /**
     * The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.
     * 
     */
    @JsonProperty("license")
    public void setLicense(ImplementationGuide.License license) {
        this.license = license;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_license")
    public Element get_license() {
        return _license;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_license")
    public void set_license(Element _license) {
        this._license = _license;
    }

    /**
     * The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.
     * 
     */
    @JsonProperty("fhirVersion")
    public List<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion> getFhirVersion() {
        return fhirVersion;
    }

    /**
     * The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.
     * 
     */
    @JsonProperty("fhirVersion")
    public void setFhirVersion(List<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion> fhirVersion) {
        this.fhirVersion = fhirVersion;
    }

    /**
     * Extensions for fhirVersion
     * 
     */
    @JsonProperty("_fhirVersion")
    public List<Element> get_fhirVersion() {
        return _fhirVersion;
    }

    /**
     * Extensions for fhirVersion
     * 
     */
    @JsonProperty("_fhirVersion")
    public void set_fhirVersion(List<Element> _fhirVersion) {
        this._fhirVersion = _fhirVersion;
    }

    /**
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
     * 
     */
    @JsonProperty("dependsOn")
    public List<ImplementationGuide_DependsOn> getDependsOn() {
        return dependsOn;
    }

    /**
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
     * 
     */
    @JsonProperty("dependsOn")
    public void setDependsOn(List<ImplementationGuide_DependsOn> dependsOn) {
        this.dependsOn = dependsOn;
    }

    /**
     * A set of profiles that all resources covered by this implementation guide must conform to.
     * 
     */
    @JsonProperty("global")
    public List<ImplementationGuide_Global> getGlobal() {
        return global;
    }

    /**
     * A set of profiles that all resources covered by this implementation guide must conform to.
     * 
     */
    @JsonProperty("global")
    public void setGlobal(List<ImplementationGuide_Global> global) {
        this.global = global;
    }

    /**
     * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
     * 
     */
    @JsonProperty("definition")
    public ImplementationGuide_Definition getDefinition() {
        return definition;
    }

    /**
     * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
     * 
     */
    @JsonProperty("definition")
    public void setDefinition(ImplementationGuide_Definition definition) {
        this.definition = definition;
    }

    /**
     * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
     * 
     */
    @JsonProperty("manifest")
    public ImplementationGuide_Manifest getManifest() {
        return manifest;
    }

    /**
     * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
     * 
     */
    @JsonProperty("manifest")
    public void setManifest(ImplementationGuide_Manifest manifest) {
        this.manifest = manifest;
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
        sb.append(ImplementationGuide.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null)?"<null>":this.copyright));
        sb.append(',');
        sb.append("_copyright");
        sb.append('=');
        sb.append(((this._copyright == null)?"<null>":this._copyright));
        sb.append(',');
        sb.append("packageId");
        sb.append('=');
        sb.append(((this.packageId == null)?"<null>":this.packageId));
        sb.append(',');
        sb.append("_packageId");
        sb.append('=');
        sb.append(((this._packageId == null)?"<null>":this._packageId));
        sb.append(',');
        sb.append("license");
        sb.append('=');
        sb.append(((this.license == null)?"<null>":this.license));
        sb.append(',');
        sb.append("_license");
        sb.append('=');
        sb.append(((this._license == null)?"<null>":this._license));
        sb.append(',');
        sb.append("fhirVersion");
        sb.append('=');
        sb.append(((this.fhirVersion == null)?"<null>":this.fhirVersion));
        sb.append(',');
        sb.append("_fhirVersion");
        sb.append('=');
        sb.append(((this._fhirVersion == null)?"<null>":this._fhirVersion));
        sb.append(',');
        sb.append("dependsOn");
        sb.append('=');
        sb.append(((this.dependsOn == null)?"<null>":this.dependsOn));
        sb.append(',');
        sb.append("global");
        sb.append('=');
        sb.append(((this.global == null)?"<null>":this.global));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("manifest");
        sb.append('=');
        sb.append(((this.manifest == null)?"<null>":this.manifest));
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
        result = ((result* 31)+((this._license == null)? 0 :this._license.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._experimental == null)? 0 :this._experimental.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this._fhirVersion == null)? 0 :this._fhirVersion.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.experimental == null)? 0 :this.experimental.hashCode()));
        result = ((result* 31)+((this.global == null)? 0 :this.global.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.fhirVersion == null)? 0 :this.fhirVersion.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.dependsOn == null)? 0 :this.dependsOn.hashCode()));
        result = ((result* 31)+((this.manifest == null)? 0 :this.manifest.hashCode()));
        result = ((result* 31)+((this.packageId == null)? 0 :this.packageId.hashCode()));
        result = ((result* 31)+((this._packageId == null)? 0 :this._packageId.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.license == null)? 0 :this.license.hashCode()));
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
        if ((other instanceof ImplementationGuide) == false) {
            return false;
        }
        ImplementationGuide rhs = ((ImplementationGuide) other);
        return (((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this._license == rhs._license)||((this._license!= null)&&this._license.equals(rhs._license))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._experimental == rhs._experimental)||((this._experimental!= null)&&this._experimental.equals(rhs._experimental))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this._fhirVersion == rhs._fhirVersion)||((this._fhirVersion!= null)&&this._fhirVersion.equals(rhs._fhirVersion))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.experimental == rhs.experimental)||((this.experimental!= null)&&this.experimental.equals(rhs.experimental))))&&((this.global == rhs.global)||((this.global!= null)&&this.global.equals(rhs.global))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.fhirVersion == rhs.fhirVersion)||((this.fhirVersion!= null)&&this.fhirVersion.equals(rhs.fhirVersion))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.dependsOn == rhs.dependsOn)||((this.dependsOn!= null)&&this.dependsOn.equals(rhs.dependsOn))))&&((this.manifest == rhs.manifest)||((this.manifest!= null)&&this.manifest.equals(rhs.manifest))))&&((this.packageId == rhs.packageId)||((this.packageId!= null)&&this.packageId.equals(rhs.packageId))))&&((this._packageId == rhs._packageId)||((this._packageId!= null)&&this._packageId.equals(rhs._packageId))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.license == rhs.license)||((this.license!= null)&&this.license.equals(rhs.license))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this._publisher == rhs._publisher)||((this._publisher!= null)&&this._publisher.equals(rhs._publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useContext == rhs.useContext)||((this.useContext!= null)&&this.useContext.equals(rhs.useContext))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum License {

        NOT_OPEN_SOURCE("not-open-source"),
        _0_BSD("0BSD"),
        AAL("AAL"),
        ABSTYLES("Abstyles"),
        ADOBE_2006("Adobe-2006"),
        ADOBE_GLYPH("Adobe-Glyph"),
        ADSL("ADSL"),
        AFL_1_1("AFL-1.1"),
        AFL_1_2("AFL-1.2"),
        AFL_2_0("AFL-2.0"),
        AFL_2_1("AFL-2.1"),
        AFL_3_0("AFL-3.0"),
        AFMPARSE("Afmparse"),
        AGPL_1_0_ONLY("AGPL-1.0-only"),
        AGPL_1_0_OR_LATER("AGPL-1.0-or-later"),
        AGPL_3_0_ONLY("AGPL-3.0-only"),
        AGPL_3_0_OR_LATER("AGPL-3.0-or-later"),
        ALADDIN("Aladdin"),
        AMDPLPA("AMDPLPA"),
        AML("AML"),
        AMPAS("AMPAS"),
        ANTLR_PD("ANTLR-PD"),
        APACHE_1_0("Apache-1.0"),
        APACHE_1_1("Apache-1.1"),
        APACHE_2_0("Apache-2.0"),
        APAFML("APAFML"),
        APL_1_0("APL-1.0"),
        APSL_1_0("APSL-1.0"),
        APSL_1_1("APSL-1.1"),
        APSL_1_2("APSL-1.2"),
        APSL_2_0("APSL-2.0"),
        ARTISTIC_1_0_CL_8("Artistic-1.0-cl8"),
        ARTISTIC_1_0_PERL("Artistic-1.0-Perl"),
        ARTISTIC_1_0("Artistic-1.0"),
        ARTISTIC_2_0("Artistic-2.0"),
        BAHYPH("Bahyph"),
        BARR("Barr"),
        BEERWARE("Beerware"),
        BIT_TORRENT_1_0("BitTorrent-1.0"),
        BIT_TORRENT_1_1("BitTorrent-1.1"),
        BORCEUX("Borceux"),
        BSD_1_CLAUSE("BSD-1-Clause"),
        BSD_2_CLAUSE_FREE_BSD("BSD-2-Clause-FreeBSD"),
        BSD_2_CLAUSE_NET_BSD("BSD-2-Clause-NetBSD"),
        BSD_2_CLAUSE_PATENT("BSD-2-Clause-Patent"),
        BSD_2_CLAUSE("BSD-2-Clause"),
        BSD_3_CLAUSE_ATTRIBUTION("BSD-3-Clause-Attribution"),
        BSD_3_CLAUSE_CLEAR("BSD-3-Clause-Clear"),
        BSD_3_CLAUSE_LBNL("BSD-3-Clause-LBNL"),
        BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014("BSD-3-Clause-No-Nuclear-License-2014"),
        BSD_3_CLAUSE_NO_NUCLEAR_LICENSE("BSD-3-Clause-No-Nuclear-License"),
        BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY("BSD-3-Clause-No-Nuclear-Warranty"),
        BSD_3_CLAUSE("BSD-3-Clause"),
        BSD_4_CLAUSE_UC("BSD-4-Clause-UC"),
        BSD_4_CLAUSE("BSD-4-Clause"),
        BSD_PROTECTION("BSD-Protection"),
        BSD_SOURCE_CODE("BSD-Source-Code"),
        BSL_1_0("BSL-1.0"),
        BZIP_2_1_0_5("bzip2-1.0.5"),
        BZIP_2_1_0_6("bzip2-1.0.6"),
        CALDERA("Caldera"),
        CATOSL_1_1("CATOSL-1.1"),
        CC_BY_1_0("CC-BY-1.0"),
        CC_BY_2_0("CC-BY-2.0"),
        CC_BY_2_5("CC-BY-2.5"),
        CC_BY_3_0("CC-BY-3.0"),
        CC_BY_4_0("CC-BY-4.0"),
        CC_BY_NC_1_0("CC-BY-NC-1.0"),
        CC_BY_NC_2_0("CC-BY-NC-2.0"),
        CC_BY_NC_2_5("CC-BY-NC-2.5"),
        CC_BY_NC_3_0("CC-BY-NC-3.0"),
        CC_BY_NC_4_0("CC-BY-NC-4.0"),
        CC_BY_NC_ND_1_0("CC-BY-NC-ND-1.0"),
        CC_BY_NC_ND_2_0("CC-BY-NC-ND-2.0"),
        CC_BY_NC_ND_2_5("CC-BY-NC-ND-2.5"),
        CC_BY_NC_ND_3_0("CC-BY-NC-ND-3.0"),
        CC_BY_NC_ND_4_0("CC-BY-NC-ND-4.0"),
        CC_BY_NC_SA_1_0("CC-BY-NC-SA-1.0"),
        CC_BY_NC_SA_2_0("CC-BY-NC-SA-2.0"),
        CC_BY_NC_SA_2_5("CC-BY-NC-SA-2.5"),
        CC_BY_NC_SA_3_0("CC-BY-NC-SA-3.0"),
        CC_BY_NC_SA_4_0("CC-BY-NC-SA-4.0"),
        CC_BY_ND_1_0("CC-BY-ND-1.0"),
        CC_BY_ND_2_0("CC-BY-ND-2.0"),
        CC_BY_ND_2_5("CC-BY-ND-2.5"),
        CC_BY_ND_3_0("CC-BY-ND-3.0"),
        CC_BY_ND_4_0("CC-BY-ND-4.0"),
        CC_BY_SA_1_0("CC-BY-SA-1.0"),
        CC_BY_SA_2_0("CC-BY-SA-2.0"),
        CC_BY_SA_2_5("CC-BY-SA-2.5"),
        CC_BY_SA_3_0("CC-BY-SA-3.0"),
        CC_BY_SA_4_0("CC-BY-SA-4.0"),
        CC_0_1_0("CC0-1.0"),
        CDDL_1_0("CDDL-1.0"),
        CDDL_1_1("CDDL-1.1"),
        CDLA_PERMISSIVE_1_0("CDLA-Permissive-1.0"),
        CDLA_SHARING_1_0("CDLA-Sharing-1.0"),
        CECILL_1_0("CECILL-1.0"),
        CECILL_1_1("CECILL-1.1"),
        CECILL_2_0("CECILL-2.0"),
        CECILL_2_1("CECILL-2.1"),
        CECILL_B("CECILL-B"),
        CECILL_C("CECILL-C"),
        CL_ARTISTIC("ClArtistic"),
        CNRI_JYTHON("CNRI-Jython"),
        CNRI_PYTHON_GPL_COMPATIBLE("CNRI-Python-GPL-Compatible"),
        CNRI_PYTHON("CNRI-Python"),
        CONDOR_1_1("Condor-1.1"),
        CPAL_1_0("CPAL-1.0"),
        CPL_1_0("CPL-1.0"),
        CPOL_1_02("CPOL-1.02"),
        CROSSWORD("Crossword"),
        CRYSTAL_STACKER("CrystalStacker"),
        CUA_OPL_1_0("CUA-OPL-1.0"),
        CUBE("Cube"),
        CURL("curl"),
        D_FSL_1_0("D-FSL-1.0"),
        DIFFMARK("diffmark"),
        DOC("DOC"),
        DOTSEQN("Dotseqn"),
        DSDP("DSDP"),
        DVIPDFM("dvipdfm"),
        ECL_1_0("ECL-1.0"),
        ECL_2_0("ECL-2.0"),
        EFL_1_0("EFL-1.0"),
        EFL_2_0("EFL-2.0"),
        E_GENIX("eGenix"),
        ENTESSA("Entessa"),
        EPL_1_0("EPL-1.0"),
        EPL_2_0("EPL-2.0"),
        ERL_PL_1_1("ErlPL-1.1"),
        EU_DATAGRID("EUDatagrid"),
        EUPL_1_0("EUPL-1.0"),
        EUPL_1_1("EUPL-1.1"),
        EUPL_1_2("EUPL-1.2"),
        EUROSYM("Eurosym"),
        FAIR("Fair"),
        FRAMEWORX_1_0("Frameworx-1.0"),
        FREE_IMAGE("FreeImage"),
        FSFAP("FSFAP"),
        FSFUL("FSFUL"),
        FSFULLR("FSFULLR"),
        FTL("FTL"),
        GFDL_1_1_ONLY("GFDL-1.1-only"),
        GFDL_1_1_OR_LATER("GFDL-1.1-or-later"),
        GFDL_1_2_ONLY("GFDL-1.2-only"),
        GFDL_1_2_OR_LATER("GFDL-1.2-or-later"),
        GFDL_1_3_ONLY("GFDL-1.3-only"),
        GFDL_1_3_OR_LATER("GFDL-1.3-or-later"),
        GIFTWARE("Giftware"),
        GL_2_PS("GL2PS"),
        GLIDE("Glide"),
        GLULXE("Glulxe"),
        GNUPLOT("gnuplot"),
        GPL_1_0_ONLY("GPL-1.0-only"),
        GPL_1_0_OR_LATER("GPL-1.0-or-later"),
        GPL_2_0_ONLY("GPL-2.0-only"),
        GPL_2_0_OR_LATER("GPL-2.0-or-later"),
        GPL_3_0_ONLY("GPL-3.0-only"),
        GPL_3_0_OR_LATER("GPL-3.0-or-later"),
        G_SOAP_1_3_B("gSOAP-1.3b"),
        HASKELL_REPORT("HaskellReport"),
        HPND("HPND"),
        IBM_PIBS("IBM-pibs"),
        ICU("ICU"),
        IJG("IJG"),
        IMAGE_MAGICK("ImageMagick"),
        I_MATIX("iMatix"),
        IMLIB_2("Imlib2"),
        INFO_ZIP("Info-ZIP"),
        INTEL_ACPI("Intel-ACPI"),
        INTEL("Intel"),
        INTERBASE_1_0("Interbase-1.0"),
        IPA("IPA"),
        IPL_1_0("IPL-1.0"),
        ISC("ISC"),
        JAS_PER_2_0("JasPer-2.0"),
        JSON("JSON"),
        LAL_1_2("LAL-1.2"),
        LAL_1_3("LAL-1.3"),
        LATEX_2_E("Latex2e"),
        LEPTONICA("Leptonica"),
        LGPL_2_0_ONLY("LGPL-2.0-only"),
        LGPL_2_0_OR_LATER("LGPL-2.0-or-later"),
        LGPL_2_1_ONLY("LGPL-2.1-only"),
        LGPL_2_1_OR_LATER("LGPL-2.1-or-later"),
        LGPL_3_0_ONLY("LGPL-3.0-only"),
        LGPL_3_0_OR_LATER("LGPL-3.0-or-later"),
        LGPLLR("LGPLLR"),
        LIBPNG("Libpng"),
        LIBTIFF("libtiff"),
        LI_LI_Q_P_1_1("LiLiQ-P-1.1"),
        LI_LI_Q_R_1_1("LiLiQ-R-1.1"),
        LI_LI_Q_RPLUS_1_1("LiLiQ-Rplus-1.1"),
        LINUX_OPEN_IB("Linux-OpenIB"),
        LPL_1_0("LPL-1.0"),
        LPL_1_02("LPL-1.02"),
        LPPL_1_0("LPPL-1.0"),
        LPPL_1_1("LPPL-1.1"),
        LPPL_1_2("LPPL-1.2"),
        LPPL_1_3_A("LPPL-1.3a"),
        LPPL_1_3_C("LPPL-1.3c"),
        MAKE_INDEX("MakeIndex"),
        MIR_OS("MirOS"),
        MIT_0("MIT-0"),
        MIT_ADVERTISING("MIT-advertising"),
        MIT_CMU("MIT-CMU"),
        MIT_ENNA("MIT-enna"),
        MIT_FEH("MIT-feh"),
        MIT("MIT"),
        MITNFA("MITNFA"),
        MOTOSOTO("Motosoto"),
        MPICH_2("mpich2"),
        MPL_1_0("MPL-1.0"),
        MPL_1_1("MPL-1.1"),
        MPL_2_0_NO_COPYLEFT_EXCEPTION("MPL-2.0-no-copyleft-exception"),
        MPL_2_0("MPL-2.0"),
        MS_PL("MS-PL"),
        MS_RL("MS-RL"),
        MTLL("MTLL"),
        MULTICS("Multics"),
        MUP("Mup"),
        NASA_1_3("NASA-1.3"),
        NAUMEN("Naumen"),
        NBPL_1_0("NBPL-1.0"),
        NCSA("NCSA"),
        NET_SNMP("Net-SNMP"),
        NET_CDF("NetCDF"),
        NEWSLETR("Newsletr"),
        NGPL("NGPL"),
        NLOD_1_0("NLOD-1.0"),
        NLPL("NLPL"),
        NOKIA("Nokia"),
        NOSL("NOSL"),
        NOWEB("Noweb"),
        NPL_1_0("NPL-1.0"),
        NPL_1_1("NPL-1.1"),
        NPOSL_3_0("NPOSL-3.0"),
        NRL("NRL"),
        NTP("NTP"),
        OCCT_PL("OCCT-PL"),
        OCLC_2_0("OCLC-2.0"),
        O_DB_L_1_0("ODbL-1.0"),
        OFL_1_0("OFL-1.0"),
        OFL_1_1("OFL-1.1"),
        OGTSL("OGTSL"),
        OLDAP_1_1("OLDAP-1.1"),
        OLDAP_1_2("OLDAP-1.2"),
        OLDAP_1_3("OLDAP-1.3"),
        OLDAP_1_4("OLDAP-1.4"),
        OLDAP_2_0_1("OLDAP-2.0.1"),
        OLDAP_2_0("OLDAP-2.0"),
        OLDAP_2_1("OLDAP-2.1"),
        OLDAP_2_2_1("OLDAP-2.2.1"),
        OLDAP_2_2_2("OLDAP-2.2.2"),
        OLDAP_2_2("OLDAP-2.2"),
        OLDAP_2_3("OLDAP-2.3"),
        OLDAP_2_4("OLDAP-2.4"),
        OLDAP_2_5("OLDAP-2.5"),
        OLDAP_2_6("OLDAP-2.6"),
        OLDAP_2_7("OLDAP-2.7"),
        OLDAP_2_8("OLDAP-2.8"),
        OML("OML"),
        OPEN_SSL("OpenSSL"),
        OPL_1_0("OPL-1.0"),
        OSET_PL_2_1("OSET-PL-2.1"),
        OSL_1_0("OSL-1.0"),
        OSL_1_1("OSL-1.1"),
        OSL_2_0("OSL-2.0"),
        OSL_2_1("OSL-2.1"),
        OSL_3_0("OSL-3.0"),
        PDDL_1_0("PDDL-1.0"),
        PHP_3_0("PHP-3.0"),
        PHP_3_01("PHP-3.01"),
        PLEXUS("Plexus"),
        POSTGRE_SQL("PostgreSQL"),
        PSFRAG("psfrag"),
        PSUTILS("psutils"),
        PYTHON_2_0("Python-2.0"),
        QHULL("Qhull"),
        QPL_1_0("QPL-1.0"),
        RDISC("Rdisc"),
        R_HE_COS_1_1("RHeCos-1.1"),
        RPL_1_1("RPL-1.1"),
        RPL_1_5("RPL-1.5"),
        RPSL_1_0("RPSL-1.0"),
        RSA_MD("RSA-MD"),
        RSCPL("RSCPL"),
        RUBY("Ruby"),
        SAX_PD("SAX-PD"),
        SAXPATH("Saxpath"),
        SCEA("SCEA"),
        SENDMAIL("Sendmail"),
        SGI_B_1_0("SGI-B-1.0"),
        SGI_B_1_1("SGI-B-1.1"),
        SGI_B_2_0("SGI-B-2.0"),
        SIM_PL_2_0("SimPL-2.0"),
        SISSL_1_2("SISSL-1.2"),
        SISSL("SISSL"),
        SLEEPYCAT("Sleepycat"),
        SMLNJ("SMLNJ"),
        SMPPL("SMPPL"),
        SNIA("SNIA"),
        SPENCER_86("Spencer-86"),
        SPENCER_94("Spencer-94"),
        SPENCER_99("Spencer-99"),
        SPL_1_0("SPL-1.0"),
        SUGAR_CRM_1_1_3("SugarCRM-1.1.3"),
        SWL("SWL"),
        TCL("TCL"),
        TCP_WRAPPERS("TCP-wrappers"),
        T_MATE("TMate"),
        TORQUE_1_1("TORQUE-1.1"),
        TOSL("TOSL"),
        UNICODE_DFS_2015("Unicode-DFS-2015"),
        UNICODE_DFS_2016("Unicode-DFS-2016"),
        UNICODE_TOU("Unicode-TOU"),
        UNLICENSE("Unlicense"),
        UPL_1_0("UPL-1.0"),
        VIM("Vim"),
        VOSTROM("VOSTROM"),
        VSL_1_0("VSL-1.0"),
        W_3_C_19980720("W3C-19980720"),
        W_3_C_20150513("W3C-20150513"),
        W_3_C("W3C"),
        WATCOM_1_0("Watcom-1.0"),
        WSUIPA("Wsuipa"),
        WTFPL("WTFPL"),
        X_11("X11"),
        XEROX("Xerox"),
        X_FREE_86_1_1("XFree86-1.1"),
        XINETD("xinetd"),
        XNET("Xnet"),
        XPP("xpp"),
        X_SKAT("XSkat"),
        YPL_1_0("YPL-1.0"),
        YPL_1_1("YPL-1.1"),
        ZED("Zed"),
        ZEND_2_0("Zend-2.0"),
        ZIMBRA_1_3("Zimbra-1.3"),
        ZIMBRA_1_4("Zimbra-1.4"),
        ZLIB_ACKNOWLEDGEMENT("zlib-acknowledgement"),
        ZLIB("Zlib"),
        ZPL_1_1("ZPL-1.1"),
        ZPL_2_0("ZPL-2.0"),
        ZPL_2_1("ZPL-2.1");
        private final String value;
        private final static Map<String, ImplementationGuide.License> CONSTANTS = new HashMap<String, ImplementationGuide.License>();

        static {
            for (ImplementationGuide.License c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        License(String value) {
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
        public static ImplementationGuide.License fromValue(String value) {
            ImplementationGuide.License constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The status of this implementation guide. Enables tracking the life-cycle of the content.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, ImplementationGuide.Status> CONSTANTS = new HashMap<String, ImplementationGuide.Status>();

        static {
            for (ImplementationGuide.Status c: values()) {
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
        public static ImplementationGuide.Status fromValue(String value) {
            ImplementationGuide.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
