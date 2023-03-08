
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
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "resource",
    "_resource",
    "label",
    "_label",
    "description",
    "_description",
    "accept",
    "_accept",
    "contentType",
    "_contentType",
    "destination",
    "_destination",
    "encodeRequestUrl",
    "_encodeRequestUrl",
    "method",
    "_method",
    "origin",
    "_origin",
    "params",
    "_params",
    "requestHeader",
    "requestId",
    "_requestId",
    "responseId",
    "_responseId",
    "sourceId",
    "_sourceId",
    "targetId",
    "_targetId",
    "url",
    "_url"
})
@Generated("jsonschema2pojo")
public class TestScript_Operation {

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
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding type;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String resource;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_resource")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _resource;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String label;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _label;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("accept")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String accept;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_accept")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _accept;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String contentType;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _contentType;
    /**
     * A whole number
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("A whole number")
    private Double destination;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_destination")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _destination;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("encodeRequestUrl")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean encodeRequestUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_encodeRequestUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _encodeRequestUrl;
    /**
     * The HTTP method the test engine MUST use for this operation regardless of any other operation details.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The HTTP method the test engine MUST use for this operation regardless of any other operation details.")
    private TestScript_Operation.Method method;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_method")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _method;
    /**
     * A whole number
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("A whole number")
    private Double origin;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_origin")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _origin;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String params;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_params")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _params;
    /**
     * Header elements would be used to set HTTP headers.
     * 
     */
    @JsonProperty("requestHeader")
    @JsonPropertyDescription("Header elements would be used to set HTTP headers.")
    private List<TestScript_RequestHeader> requestHeader = new ArrayList<TestScript_RequestHeader>();
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("requestId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String requestId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requestId;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("responseId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String responseId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_responseId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _responseId;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("sourceId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String sourceId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sourceId;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("targetId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String targetId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _targetId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("A sequence of Unicode characters")
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
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("type")
    public Coding getType() {
        return type;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("type")
    public void setType(Coding type) {
        this.type = type;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_resource")
    public Element get_resource() {
        return _resource;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_resource")
    public void set_resource(Element _resource) {
        this._resource = _resource;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    public Element get_label() {
        return _label;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    public void set_label(Element _label) {
        this._label = _label;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("accept")
    public String getAccept() {
        return accept;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("accept")
    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_accept")
    public Element get_accept() {
        return _accept;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_accept")
    public void set_accept(Element _accept) {
        this._accept = _accept;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    public Element get_contentType() {
        return _contentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    public void set_contentType(Element _contentType) {
        this._contentType = _contentType;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("destination")
    public Double getDestination() {
        return destination;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("destination")
    public void setDestination(Double destination) {
        this.destination = destination;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_destination")
    public Element get_destination() {
        return _destination;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_destination")
    public void set_destination(Element _destination) {
        this._destination = _destination;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("encodeRequestUrl")
    public Boolean getEncodeRequestUrl() {
        return encodeRequestUrl;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("encodeRequestUrl")
    public void setEncodeRequestUrl(Boolean encodeRequestUrl) {
        this.encodeRequestUrl = encodeRequestUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_encodeRequestUrl")
    public Element get_encodeRequestUrl() {
        return _encodeRequestUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_encodeRequestUrl")
    public void set_encodeRequestUrl(Element _encodeRequestUrl) {
        this._encodeRequestUrl = _encodeRequestUrl;
    }

    /**
     * The HTTP method the test engine MUST use for this operation regardless of any other operation details.
     * 
     */
    @JsonProperty("method")
    public TestScript_Operation.Method getMethod() {
        return method;
    }

    /**
     * The HTTP method the test engine MUST use for this operation regardless of any other operation details.
     * 
     */
    @JsonProperty("method")
    public void setMethod(TestScript_Operation.Method method) {
        this.method = method;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_method")
    public Element get_method() {
        return _method;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_method")
    public void set_method(Element _method) {
        this._method = _method;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("origin")
    public Double getOrigin() {
        return origin;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(Double origin) {
        this.origin = origin;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_origin")
    public Element get_origin() {
        return _origin;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_origin")
    public void set_origin(Element _origin) {
        this._origin = _origin;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("params")
    public String getParams() {
        return params;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("params")
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_params")
    public Element get_params() {
        return _params;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_params")
    public void set_params(Element _params) {
        this._params = _params;
    }

    /**
     * Header elements would be used to set HTTP headers.
     * 
     */
    @JsonProperty("requestHeader")
    public List<TestScript_RequestHeader> getRequestHeader() {
        return requestHeader;
    }

    /**
     * Header elements would be used to set HTTP headers.
     * 
     */
    @JsonProperty("requestHeader")
    public void setRequestHeader(List<TestScript_RequestHeader> requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestId")
    public Element get_requestId() {
        return _requestId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestId")
    public void set_requestId(Element _requestId) {
        this._requestId = _requestId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("responseId")
    public String getResponseId() {
        return responseId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("responseId")
    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_responseId")
    public Element get_responseId() {
        return _responseId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_responseId")
    public void set_responseId(Element _responseId) {
        this._responseId = _responseId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceId")
    public Element get_sourceId() {
        return _sourceId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceId")
    public void set_sourceId(Element _sourceId) {
        this._sourceId = _sourceId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("targetId")
    public String getTargetId() {
        return targetId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("targetId")
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetId")
    public Element get_targetId() {
        return _targetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetId")
    public void set_targetId(Element _targetId) {
        this._targetId = _targetId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * A sequence of Unicode characters
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScript_Operation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("_resource");
        sb.append('=');
        sb.append(((this._resource == null)?"<null>":this._resource));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("_label");
        sb.append('=');
        sb.append(((this._label == null)?"<null>":this._label));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("accept");
        sb.append('=');
        sb.append(((this.accept == null)?"<null>":this.accept));
        sb.append(',');
        sb.append("_accept");
        sb.append('=');
        sb.append(((this._accept == null)?"<null>":this._accept));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("_contentType");
        sb.append('=');
        sb.append(((this._contentType == null)?"<null>":this._contentType));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("_destination");
        sb.append('=');
        sb.append(((this._destination == null)?"<null>":this._destination));
        sb.append(',');
        sb.append("encodeRequestUrl");
        sb.append('=');
        sb.append(((this.encodeRequestUrl == null)?"<null>":this.encodeRequestUrl));
        sb.append(',');
        sb.append("_encodeRequestUrl");
        sb.append('=');
        sb.append(((this._encodeRequestUrl == null)?"<null>":this._encodeRequestUrl));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("_method");
        sb.append('=');
        sb.append(((this._method == null)?"<null>":this._method));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("_origin");
        sb.append('=');
        sb.append(((this._origin == null)?"<null>":this._origin));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("_params");
        sb.append('=');
        sb.append(((this._params == null)?"<null>":this._params));
        sb.append(',');
        sb.append("requestHeader");
        sb.append('=');
        sb.append(((this.requestHeader == null)?"<null>":this.requestHeader));
        sb.append(',');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("_requestId");
        sb.append('=');
        sb.append(((this._requestId == null)?"<null>":this._requestId));
        sb.append(',');
        sb.append("responseId");
        sb.append('=');
        sb.append(((this.responseId == null)?"<null>":this.responseId));
        sb.append(',');
        sb.append("_responseId");
        sb.append('=');
        sb.append(((this._responseId == null)?"<null>":this._responseId));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("_sourceId");
        sb.append('=');
        sb.append(((this._sourceId == null)?"<null>":this._sourceId));
        sb.append(',');
        sb.append("targetId");
        sb.append('=');
        sb.append(((this.targetId == null)?"<null>":this.targetId));
        sb.append(',');
        sb.append("_targetId");
        sb.append('=');
        sb.append(((this._targetId == null)?"<null>":this._targetId));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
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
        result = ((result* 31)+((this.sourceId == null)? 0 :this.sourceId.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.encodeRequestUrl == null)? 0 :this.encodeRequestUrl.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._sourceId == null)? 0 :this._sourceId.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._label == null)? 0 :this._label.hashCode()));
        result = ((result* 31)+((this._origin == null)? 0 :this._origin.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        result = ((result* 31)+((this._requestId == null)? 0 :this._requestId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.targetId == null)? 0 :this.targetId.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this._targetId == null)? 0 :this._targetId.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this._encodeRequestUrl == null)? 0 :this._encodeRequestUrl.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this._contentType == null)? 0 :this._contentType.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.accept == null)? 0 :this.accept.hashCode()));
        result = ((result* 31)+((this._accept == null)? 0 :this._accept.hashCode()));
        result = ((result* 31)+((this._method == null)? 0 :this._method.hashCode()));
        result = ((result* 31)+((this.requestHeader == null)? 0 :this.requestHeader.hashCode()));
        result = ((result* 31)+((this._responseId == null)? 0 :this._responseId.hashCode()));
        result = ((result* 31)+((this._resource == null)? 0 :this._resource.hashCode()));
        result = ((result* 31)+((this._destination == null)? 0 :this._destination.hashCode()));
        result = ((result* 31)+((this._params == null)? 0 :this._params.hashCode()));
        result = ((result* 31)+((this.responseId == null)? 0 :this.responseId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScript_Operation) == false) {
            return false;
        }
        TestScript_Operation rhs = ((TestScript_Operation) other);
        return ((((((((((((((((((((((((((((((((((((this.sourceId == rhs.sourceId)||((this.sourceId!= null)&&this.sourceId.equals(rhs.sourceId)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.encodeRequestUrl == rhs.encodeRequestUrl)||((this.encodeRequestUrl!= null)&&this.encodeRequestUrl.equals(rhs.encodeRequestUrl))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._sourceId == rhs._sourceId)||((this._sourceId!= null)&&this._sourceId.equals(rhs._sourceId))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._label == rhs._label)||((this._label!= null)&&this._label.equals(rhs._label))))&&((this._origin == rhs._origin)||((this._origin!= null)&&this._origin.equals(rhs._origin))))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))))&&((this._requestId == rhs._requestId)||((this._requestId!= null)&&this._requestId.equals(rhs._requestId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.targetId == rhs.targetId)||((this.targetId!= null)&&this.targetId.equals(rhs.targetId))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this._targetId == rhs._targetId)||((this._targetId!= null)&&this._targetId.equals(rhs._targetId))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this._encodeRequestUrl == rhs._encodeRequestUrl)||((this._encodeRequestUrl!= null)&&this._encodeRequestUrl.equals(rhs._encodeRequestUrl))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this._contentType == rhs._contentType)||((this._contentType!= null)&&this._contentType.equals(rhs._contentType))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.accept == rhs.accept)||((this.accept!= null)&&this.accept.equals(rhs.accept))))&&((this._accept == rhs._accept)||((this._accept!= null)&&this._accept.equals(rhs._accept))))&&((this._method == rhs._method)||((this._method!= null)&&this._method.equals(rhs._method))))&&((this.requestHeader == rhs.requestHeader)||((this.requestHeader!= null)&&this.requestHeader.equals(rhs.requestHeader))))&&((this._responseId == rhs._responseId)||((this._responseId!= null)&&this._responseId.equals(rhs._responseId))))&&((this._resource == rhs._resource)||((this._resource!= null)&&this._resource.equals(rhs._resource))))&&((this._destination == rhs._destination)||((this._destination!= null)&&this._destination.equals(rhs._destination))))&&((this._params == rhs._params)||((this._params!= null)&&this._params.equals(rhs._params))))&&((this.responseId == rhs.responseId)||((this.responseId!= null)&&this.responseId.equals(rhs.responseId))));
    }


    /**
     * The HTTP method the test engine MUST use for this operation regardless of any other operation details.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Method {

        DELETE("delete"),
        GET("get"),
        OPTIONS("options"),
        PATCH("patch"),
        POST("post"),
        PUT("put"),
        HEAD("head");
        private final String value;
        private final static Map<String, TestScript_Operation.Method> CONSTANTS = new HashMap<String, TestScript_Operation.Method>();

        static {
            for (TestScript_Operation.Method c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Method(String value) {
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
        public static TestScript_Operation.Method fromValue(String value) {
            TestScript_Operation.Method constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
