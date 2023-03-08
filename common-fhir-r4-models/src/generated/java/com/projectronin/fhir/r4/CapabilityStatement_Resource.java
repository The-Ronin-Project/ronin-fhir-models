
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
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
    "id",
    "extension",
    "modifierExtension",
    "type",
    "_type",
    "profile",
    "supportedProfile",
    "documentation",
    "_documentation",
    "interaction",
    "versioning",
    "_versioning",
    "readHistory",
    "_readHistory",
    "updateCreate",
    "_updateCreate",
    "conditionalCreate",
    "_conditionalCreate",
    "conditionalRead",
    "_conditionalRead",
    "conditionalUpdate",
    "_conditionalUpdate",
    "conditionalDelete",
    "_conditionalDelete",
    "referencePolicy",
    "_referencePolicy",
    "searchInclude",
    "_searchInclude",
    "searchRevInclude",
    "_searchRevInclude",
    "searchParam",
    "operation"
})
@Generated("jsonschema2pojo")
public class CapabilityStatement_Resource {

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String id;
    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
    private List<Extension> extension = new ArrayList<Extension>();
    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).")
    private List<Extension> modifierExtension = new ArrayList<Extension>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
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
    @JsonProperty("profile")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String profile;
    /**
     * A list of profiles that represent different use cases supported by the system. For a server, &quot;supported by the system&quot; means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).
     * 
     */
    @JsonProperty("supportedProfile")
    @JsonPropertyDescription("A list of profiles that represent different use cases supported by the system. For a server, \"supported by the system\" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).")
    private List<String> supportedProfile = new ArrayList<String>();
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String documentation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _documentation;
    /**
     * Identifies a restful operation supported by the solution.
     * 
     */
    @JsonProperty("interaction")
    @JsonPropertyDescription("Identifies a restful operation supported by the solution.")
    private List<CapabilityStatement_Interaction> interaction = new ArrayList<CapabilityStatement_Interaction>();
    /**
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
     * 
     */
    @JsonProperty("versioning")
    @JsonPropertyDescription("This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.")
    private CapabilityStatement_Resource.Versioning versioning;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versioning")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _versioning;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("readHistory")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean readHistory;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readHistory")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _readHistory;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("updateCreate")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean updateCreate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_updateCreate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _updateCreate;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("conditionalCreate")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean conditionalCreate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalCreate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _conditionalCreate;
    /**
     * A code that indicates how the server supports conditional read.
     * 
     */
    @JsonProperty("conditionalRead")
    @JsonPropertyDescription("A code that indicates how the server supports conditional read.")
    private CapabilityStatement_Resource.ConditionalRead conditionalRead;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalRead")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _conditionalRead;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("conditionalUpdate")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean conditionalUpdate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalUpdate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _conditionalUpdate;
    /**
     * A code that indicates how the server supports conditional delete.
     * 
     */
    @JsonProperty("conditionalDelete")
    @JsonPropertyDescription("A code that indicates how the server supports conditional delete.")
    private CapabilityStatement_Resource.ConditionalDelete conditionalDelete;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalDelete")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _conditionalDelete;
    /**
     * A set of flags that defines how references are supported.
     * 
     */
    @JsonProperty("referencePolicy")
    @JsonPropertyDescription("A set of flags that defines how references are supported.")
    private List<ReferencePolicy> referencePolicy = new ArrayList<ReferencePolicy>();
    /**
     * Extensions for referencePolicy
     * 
     */
    @JsonProperty("_referencePolicy")
    @JsonPropertyDescription("Extensions for referencePolicy")
    private List<Element> _referencePolicy = new ArrayList<Element>();
    /**
     * A list of _include values supported by the server.
     * 
     */
    @JsonProperty("searchInclude")
    @JsonPropertyDescription("A list of _include values supported by the server.")
    private List<String> searchInclude = new ArrayList<String>();
    /**
     * Extensions for searchInclude
     * 
     */
    @JsonProperty("_searchInclude")
    @JsonPropertyDescription("Extensions for searchInclude")
    private List<Element> _searchInclude = new ArrayList<Element>();
    /**
     * A list of _revinclude (reverse include) values supported by the server.
     * 
     */
    @JsonProperty("searchRevInclude")
    @JsonPropertyDescription("A list of _revinclude (reverse include) values supported by the server.")
    private List<String> searchRevInclude = new ArrayList<String>();
    /**
     * Extensions for searchRevInclude
     * 
     */
    @JsonProperty("_searchRevInclude")
    @JsonPropertyDescription("Extensions for searchRevInclude")
    private List<Element> _searchRevInclude = new ArrayList<Element>();
    /**
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     * 
     */
    @JsonProperty("searchParam")
    @JsonPropertyDescription("Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.")
    private List<CapabilityStatement_SearchParam> searchParam = new ArrayList<CapabilityStatement_SearchParam>();
    /**
     * Definition of an operation or a named query together with its parameters and their meaning and type. Consult the definition of the operation for details about how to invoke the operation, and the parameters.
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("Definition of an operation or a named query together with its parameters and their meaning and type. Consult the definition of the operation for details about how to invoke the operation, and the parameters.")
    private List<CapabilityStatement_Operation> operation = new ArrayList<CapabilityStatement_Operation>();

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public List<Extension> getExtension() {
        return extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public List<Extension> getModifierExtension() {
        return modifierExtension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public void setModifierExtension(List<Extension> modifierExtension) {
        this.modifierExtension = modifierExtension;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
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
     * A list of profiles that represent different use cases supported by the system. For a server, &quot;supported by the system&quot; means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).
     * 
     */
    @JsonProperty("supportedProfile")
    public List<String> getSupportedProfile() {
        return supportedProfile;
    }

    /**
     * A list of profiles that represent different use cases supported by the system. For a server, &quot;supported by the system&quot; means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).
     * 
     */
    @JsonProperty("supportedProfile")
    public void setSupportedProfile(List<String> supportedProfile) {
        this.supportedProfile = supportedProfile;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    public String getDocumentation() {
        return documentation;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    public Element get_documentation() {
        return _documentation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    public void set_documentation(Element _documentation) {
        this._documentation = _documentation;
    }

    /**
     * Identifies a restful operation supported by the solution.
     * 
     */
    @JsonProperty("interaction")
    public List<CapabilityStatement_Interaction> getInteraction() {
        return interaction;
    }

    /**
     * Identifies a restful operation supported by the solution.
     * 
     */
    @JsonProperty("interaction")
    public void setInteraction(List<CapabilityStatement_Interaction> interaction) {
        this.interaction = interaction;
    }

    /**
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
     * 
     */
    @JsonProperty("versioning")
    public CapabilityStatement_Resource.Versioning getVersioning() {
        return versioning;
    }

    /**
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
     * 
     */
    @JsonProperty("versioning")
    public void setVersioning(CapabilityStatement_Resource.Versioning versioning) {
        this.versioning = versioning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versioning")
    public Element get_versioning() {
        return _versioning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versioning")
    public void set_versioning(Element _versioning) {
        this._versioning = _versioning;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("readHistory")
    public Boolean getReadHistory() {
        return readHistory;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("readHistory")
    public void setReadHistory(Boolean readHistory) {
        this.readHistory = readHistory;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readHistory")
    public Element get_readHistory() {
        return _readHistory;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readHistory")
    public void set_readHistory(Element _readHistory) {
        this._readHistory = _readHistory;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("updateCreate")
    public Boolean getUpdateCreate() {
        return updateCreate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("updateCreate")
    public void setUpdateCreate(Boolean updateCreate) {
        this.updateCreate = updateCreate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_updateCreate")
    public Element get_updateCreate() {
        return _updateCreate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_updateCreate")
    public void set_updateCreate(Element _updateCreate) {
        this._updateCreate = _updateCreate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("conditionalCreate")
    public Boolean getConditionalCreate() {
        return conditionalCreate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("conditionalCreate")
    public void setConditionalCreate(Boolean conditionalCreate) {
        this.conditionalCreate = conditionalCreate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalCreate")
    public Element get_conditionalCreate() {
        return _conditionalCreate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalCreate")
    public void set_conditionalCreate(Element _conditionalCreate) {
        this._conditionalCreate = _conditionalCreate;
    }

    /**
     * A code that indicates how the server supports conditional read.
     * 
     */
    @JsonProperty("conditionalRead")
    public CapabilityStatement_Resource.ConditionalRead getConditionalRead() {
        return conditionalRead;
    }

    /**
     * A code that indicates how the server supports conditional read.
     * 
     */
    @JsonProperty("conditionalRead")
    public void setConditionalRead(CapabilityStatement_Resource.ConditionalRead conditionalRead) {
        this.conditionalRead = conditionalRead;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalRead")
    public Element get_conditionalRead() {
        return _conditionalRead;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalRead")
    public void set_conditionalRead(Element _conditionalRead) {
        this._conditionalRead = _conditionalRead;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("conditionalUpdate")
    public Boolean getConditionalUpdate() {
        return conditionalUpdate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("conditionalUpdate")
    public void setConditionalUpdate(Boolean conditionalUpdate) {
        this.conditionalUpdate = conditionalUpdate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalUpdate")
    public Element get_conditionalUpdate() {
        return _conditionalUpdate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalUpdate")
    public void set_conditionalUpdate(Element _conditionalUpdate) {
        this._conditionalUpdate = _conditionalUpdate;
    }

    /**
     * A code that indicates how the server supports conditional delete.
     * 
     */
    @JsonProperty("conditionalDelete")
    public CapabilityStatement_Resource.ConditionalDelete getConditionalDelete() {
        return conditionalDelete;
    }

    /**
     * A code that indicates how the server supports conditional delete.
     * 
     */
    @JsonProperty("conditionalDelete")
    public void setConditionalDelete(CapabilityStatement_Resource.ConditionalDelete conditionalDelete) {
        this.conditionalDelete = conditionalDelete;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalDelete")
    public Element get_conditionalDelete() {
        return _conditionalDelete;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_conditionalDelete")
    public void set_conditionalDelete(Element _conditionalDelete) {
        this._conditionalDelete = _conditionalDelete;
    }

    /**
     * A set of flags that defines how references are supported.
     * 
     */
    @JsonProperty("referencePolicy")
    public List<ReferencePolicy> getReferencePolicy() {
        return referencePolicy;
    }

    /**
     * A set of flags that defines how references are supported.
     * 
     */
    @JsonProperty("referencePolicy")
    public void setReferencePolicy(List<ReferencePolicy> referencePolicy) {
        this.referencePolicy = referencePolicy;
    }

    /**
     * Extensions for referencePolicy
     * 
     */
    @JsonProperty("_referencePolicy")
    public List<Element> get_referencePolicy() {
        return _referencePolicy;
    }

    /**
     * Extensions for referencePolicy
     * 
     */
    @JsonProperty("_referencePolicy")
    public void set_referencePolicy(List<Element> _referencePolicy) {
        this._referencePolicy = _referencePolicy;
    }

    /**
     * A list of _include values supported by the server.
     * 
     */
    @JsonProperty("searchInclude")
    public List<String> getSearchInclude() {
        return searchInclude;
    }

    /**
     * A list of _include values supported by the server.
     * 
     */
    @JsonProperty("searchInclude")
    public void setSearchInclude(List<String> searchInclude) {
        this.searchInclude = searchInclude;
    }

    /**
     * Extensions for searchInclude
     * 
     */
    @JsonProperty("_searchInclude")
    public List<Element> get_searchInclude() {
        return _searchInclude;
    }

    /**
     * Extensions for searchInclude
     * 
     */
    @JsonProperty("_searchInclude")
    public void set_searchInclude(List<Element> _searchInclude) {
        this._searchInclude = _searchInclude;
    }

    /**
     * A list of _revinclude (reverse include) values supported by the server.
     * 
     */
    @JsonProperty("searchRevInclude")
    public List<String> getSearchRevInclude() {
        return searchRevInclude;
    }

    /**
     * A list of _revinclude (reverse include) values supported by the server.
     * 
     */
    @JsonProperty("searchRevInclude")
    public void setSearchRevInclude(List<String> searchRevInclude) {
        this.searchRevInclude = searchRevInclude;
    }

    /**
     * Extensions for searchRevInclude
     * 
     */
    @JsonProperty("_searchRevInclude")
    public List<Element> get_searchRevInclude() {
        return _searchRevInclude;
    }

    /**
     * Extensions for searchRevInclude
     * 
     */
    @JsonProperty("_searchRevInclude")
    public void set_searchRevInclude(List<Element> _searchRevInclude) {
        this._searchRevInclude = _searchRevInclude;
    }

    /**
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     * 
     */
    @JsonProperty("searchParam")
    public List<CapabilityStatement_SearchParam> getSearchParam() {
        return searchParam;
    }

    /**
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     * 
     */
    @JsonProperty("searchParam")
    public void setSearchParam(List<CapabilityStatement_SearchParam> searchParam) {
        this.searchParam = searchParam;
    }

    /**
     * Definition of an operation or a named query together with its parameters and their meaning and type. Consult the definition of the operation for details about how to invoke the operation, and the parameters.
     * 
     */
    @JsonProperty("operation")
    public List<CapabilityStatement_Operation> getOperation() {
        return operation;
    }

    /**
     * Definition of an operation or a named query together with its parameters and their meaning and type. Consult the definition of the operation for details about how to invoke the operation, and the parameters.
     * 
     */
    @JsonProperty("operation")
    public void setOperation(List<CapabilityStatement_Operation> operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CapabilityStatement_Resource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("modifierExtension");
        sb.append('=');
        sb.append(((this.modifierExtension == null)?"<null>":this.modifierExtension));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("supportedProfile");
        sb.append('=');
        sb.append(((this.supportedProfile == null)?"<null>":this.supportedProfile));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("_documentation");
        sb.append('=');
        sb.append(((this._documentation == null)?"<null>":this._documentation));
        sb.append(',');
        sb.append("interaction");
        sb.append('=');
        sb.append(((this.interaction == null)?"<null>":this.interaction));
        sb.append(',');
        sb.append("versioning");
        sb.append('=');
        sb.append(((this.versioning == null)?"<null>":this.versioning));
        sb.append(',');
        sb.append("_versioning");
        sb.append('=');
        sb.append(((this._versioning == null)?"<null>":this._versioning));
        sb.append(',');
        sb.append("readHistory");
        sb.append('=');
        sb.append(((this.readHistory == null)?"<null>":this.readHistory));
        sb.append(',');
        sb.append("_readHistory");
        sb.append('=');
        sb.append(((this._readHistory == null)?"<null>":this._readHistory));
        sb.append(',');
        sb.append("updateCreate");
        sb.append('=');
        sb.append(((this.updateCreate == null)?"<null>":this.updateCreate));
        sb.append(',');
        sb.append("_updateCreate");
        sb.append('=');
        sb.append(((this._updateCreate == null)?"<null>":this._updateCreate));
        sb.append(',');
        sb.append("conditionalCreate");
        sb.append('=');
        sb.append(((this.conditionalCreate == null)?"<null>":this.conditionalCreate));
        sb.append(',');
        sb.append("_conditionalCreate");
        sb.append('=');
        sb.append(((this._conditionalCreate == null)?"<null>":this._conditionalCreate));
        sb.append(',');
        sb.append("conditionalRead");
        sb.append('=');
        sb.append(((this.conditionalRead == null)?"<null>":this.conditionalRead));
        sb.append(',');
        sb.append("_conditionalRead");
        sb.append('=');
        sb.append(((this._conditionalRead == null)?"<null>":this._conditionalRead));
        sb.append(',');
        sb.append("conditionalUpdate");
        sb.append('=');
        sb.append(((this.conditionalUpdate == null)?"<null>":this.conditionalUpdate));
        sb.append(',');
        sb.append("_conditionalUpdate");
        sb.append('=');
        sb.append(((this._conditionalUpdate == null)?"<null>":this._conditionalUpdate));
        sb.append(',');
        sb.append("conditionalDelete");
        sb.append('=');
        sb.append(((this.conditionalDelete == null)?"<null>":this.conditionalDelete));
        sb.append(',');
        sb.append("_conditionalDelete");
        sb.append('=');
        sb.append(((this._conditionalDelete == null)?"<null>":this._conditionalDelete));
        sb.append(',');
        sb.append("referencePolicy");
        sb.append('=');
        sb.append(((this.referencePolicy == null)?"<null>":this.referencePolicy));
        sb.append(',');
        sb.append("_referencePolicy");
        sb.append('=');
        sb.append(((this._referencePolicy == null)?"<null>":this._referencePolicy));
        sb.append(',');
        sb.append("searchInclude");
        sb.append('=');
        sb.append(((this.searchInclude == null)?"<null>":this.searchInclude));
        sb.append(',');
        sb.append("_searchInclude");
        sb.append('=');
        sb.append(((this._searchInclude == null)?"<null>":this._searchInclude));
        sb.append(',');
        sb.append("searchRevInclude");
        sb.append('=');
        sb.append(((this.searchRevInclude == null)?"<null>":this.searchRevInclude));
        sb.append(',');
        sb.append("_searchRevInclude");
        sb.append('=');
        sb.append(((this._searchRevInclude == null)?"<null>":this._searchRevInclude));
        sb.append(',');
        sb.append("searchParam");
        sb.append('=');
        sb.append(((this.searchParam == null)?"<null>":this.searchParam));
        sb.append(',');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.versioning == null)? 0 :this.versioning.hashCode()));
        result = ((result* 31)+((this.conditionalCreate == null)? 0 :this.conditionalCreate.hashCode()));
        result = ((result* 31)+((this.searchParam == null)? 0 :this.searchParam.hashCode()));
        result = ((result* 31)+((this._readHistory == null)? 0 :this._readHistory.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._referencePolicy == null)? 0 :this._referencePolicy.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._versioning == null)? 0 :this._versioning.hashCode()));
        result = ((result* 31)+((this.supportedProfile == null)? 0 :this.supportedProfile.hashCode()));
        result = ((result* 31)+((this._documentation == null)? 0 :this._documentation.hashCode()));
        result = ((result* 31)+((this._conditionalRead == null)? 0 :this._conditionalRead.hashCode()));
        result = ((result* 31)+((this.conditionalUpdate == null)? 0 :this.conditionalUpdate.hashCode()));
        result = ((result* 31)+((this._conditionalDelete == null)? 0 :this._conditionalDelete.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._searchRevInclude == null)? 0 :this._searchRevInclude.hashCode()));
        result = ((result* 31)+((this.updateCreate == null)? 0 :this.updateCreate.hashCode()));
        result = ((result* 31)+((this._updateCreate == null)? 0 :this._updateCreate.hashCode()));
        result = ((result* 31)+((this.searchInclude == null)? 0 :this.searchInclude.hashCode()));
        result = ((result* 31)+((this.searchRevInclude == null)? 0 :this.searchRevInclude.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this._conditionalCreate == null)? 0 :this._conditionalCreate.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.referencePolicy == null)? 0 :this.referencePolicy.hashCode()));
        result = ((result* 31)+((this._searchInclude == null)? 0 :this._searchInclude.hashCode()));
        result = ((result* 31)+((this._conditionalUpdate == null)? 0 :this._conditionalUpdate.hashCode()));
        result = ((result* 31)+((this.readHistory == null)? 0 :this.readHistory.hashCode()));
        result = ((result* 31)+((this.conditionalDelete == null)? 0 :this.conditionalDelete.hashCode()));
        result = ((result* 31)+((this.conditionalRead == null)? 0 :this.conditionalRead.hashCode()));
        result = ((result* 31)+((this.interaction == null)? 0 :this.interaction.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapabilityStatement_Resource) == false) {
            return false;
        }
        CapabilityStatement_Resource rhs = ((CapabilityStatement_Resource) other);
        return (((((((((((((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.versioning == rhs.versioning)||((this.versioning!= null)&&this.versioning.equals(rhs.versioning))))&&((this.conditionalCreate == rhs.conditionalCreate)||((this.conditionalCreate!= null)&&this.conditionalCreate.equals(rhs.conditionalCreate))))&&((this.searchParam == rhs.searchParam)||((this.searchParam!= null)&&this.searchParam.equals(rhs.searchParam))))&&((this._readHistory == rhs._readHistory)||((this._readHistory!= null)&&this._readHistory.equals(rhs._readHistory))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._referencePolicy == rhs._referencePolicy)||((this._referencePolicy!= null)&&this._referencePolicy.equals(rhs._referencePolicy))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._versioning == rhs._versioning)||((this._versioning!= null)&&this._versioning.equals(rhs._versioning))))&&((this.supportedProfile == rhs.supportedProfile)||((this.supportedProfile!= null)&&this.supportedProfile.equals(rhs.supportedProfile))))&&((this._documentation == rhs._documentation)||((this._documentation!= null)&&this._documentation.equals(rhs._documentation))))&&((this._conditionalRead == rhs._conditionalRead)||((this._conditionalRead!= null)&&this._conditionalRead.equals(rhs._conditionalRead))))&&((this.conditionalUpdate == rhs.conditionalUpdate)||((this.conditionalUpdate!= null)&&this.conditionalUpdate.equals(rhs.conditionalUpdate))))&&((this._conditionalDelete == rhs._conditionalDelete)||((this._conditionalDelete!= null)&&this._conditionalDelete.equals(rhs._conditionalDelete))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._searchRevInclude == rhs._searchRevInclude)||((this._searchRevInclude!= null)&&this._searchRevInclude.equals(rhs._searchRevInclude))))&&((this.updateCreate == rhs.updateCreate)||((this.updateCreate!= null)&&this.updateCreate.equals(rhs.updateCreate))))&&((this._updateCreate == rhs._updateCreate)||((this._updateCreate!= null)&&this._updateCreate.equals(rhs._updateCreate))))&&((this.searchInclude == rhs.searchInclude)||((this.searchInclude!= null)&&this.searchInclude.equals(rhs.searchInclude))))&&((this.searchRevInclude == rhs.searchRevInclude)||((this.searchRevInclude!= null)&&this.searchRevInclude.equals(rhs.searchRevInclude))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this._conditionalCreate == rhs._conditionalCreate)||((this._conditionalCreate!= null)&&this._conditionalCreate.equals(rhs._conditionalCreate))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.referencePolicy == rhs.referencePolicy)||((this.referencePolicy!= null)&&this.referencePolicy.equals(rhs.referencePolicy))))&&((this._searchInclude == rhs._searchInclude)||((this._searchInclude!= null)&&this._searchInclude.equals(rhs._searchInclude))))&&((this._conditionalUpdate == rhs._conditionalUpdate)||((this._conditionalUpdate!= null)&&this._conditionalUpdate.equals(rhs._conditionalUpdate))))&&((this.readHistory == rhs.readHistory)||((this.readHistory!= null)&&this.readHistory.equals(rhs.readHistory))))&&((this.conditionalDelete == rhs.conditionalDelete)||((this.conditionalDelete!= null)&&this.conditionalDelete.equals(rhs.conditionalDelete))))&&((this.conditionalRead == rhs.conditionalRead)||((this.conditionalRead!= null)&&this.conditionalRead.equals(rhs.conditionalRead))))&&((this.interaction == rhs.interaction)||((this.interaction!= null)&&this.interaction.equals(rhs.interaction))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))));
    }


    /**
     * A code that indicates how the server supports conditional delete.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ConditionalDelete {

        NOT_SUPPORTED("not-supported"),
        SINGLE("single"),
        MULTIPLE("multiple");
        private final String value;
        private final static Map<String, CapabilityStatement_Resource.ConditionalDelete> CONSTANTS = new HashMap<String, CapabilityStatement_Resource.ConditionalDelete>();

        static {
            for (CapabilityStatement_Resource.ConditionalDelete c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ConditionalDelete(String value) {
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
        public static CapabilityStatement_Resource.ConditionalDelete fromValue(String value) {
            CapabilityStatement_Resource.ConditionalDelete constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * A code that indicates how the server supports conditional read.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ConditionalRead {

        NOT_SUPPORTED("not-supported"),
        MODIFIED_SINCE("modified-since"),
        NOT_MATCH("not-match"),
        FULL_SUPPORT("full-support");
        private final String value;
        private final static Map<String, CapabilityStatement_Resource.ConditionalRead> CONSTANTS = new HashMap<String, CapabilityStatement_Resource.ConditionalRead>();

        static {
            for (CapabilityStatement_Resource.ConditionalRead c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ConditionalRead(String value) {
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
        public static CapabilityStatement_Resource.ConditionalRead fromValue(String value) {
            CapabilityStatement_Resource.ConditionalRead constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Versioning {

        NO_VERSION("no-version"),
        VERSIONED("versioned"),
        VERSIONED_UPDATE("versioned-update");
        private final String value;
        private final static Map<String, CapabilityStatement_Resource.Versioning> CONSTANTS = new HashMap<String, CapabilityStatement_Resource.Versioning>();

        static {
            for (CapabilityStatement_Resource.Versioning c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Versioning(String value) {
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
        public static CapabilityStatement_Resource.Versioning fromValue(String value) {
            CapabilityStatement_Resource.Versioning constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
