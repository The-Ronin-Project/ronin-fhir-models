
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
    "label",
    "_label",
    "description",
    "_description",
    "direction",
    "_direction",
    "compareToSourceId",
    "_compareToSourceId",
    "compareToSourceExpression",
    "_compareToSourceExpression",
    "compareToSourcePath",
    "_compareToSourcePath",
    "contentType",
    "_contentType",
    "expression",
    "_expression",
    "headerField",
    "_headerField",
    "minimumId",
    "_minimumId",
    "navigationLinks",
    "_navigationLinks",
    "operator",
    "_operator",
    "path",
    "_path",
    "requestMethod",
    "_requestMethod",
    "requestURL",
    "_requestURL",
    "resource",
    "_resource",
    "response",
    "_response",
    "responseCode",
    "_responseCode",
    "sourceId",
    "_sourceId",
    "validateProfileId",
    "_validateProfileId",
    "value",
    "_value",
    "warningOnly",
    "_warningOnly"
})
@Generated("jsonschema2pojo")
public class TestScript_Assert {

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
     * The direction to use for the assertion.
     * 
     */
    @JsonProperty("direction")
    @JsonPropertyDescription("The direction to use for the assertion.")
    private TestScript_Assert.Direction direction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_direction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _direction;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourceId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String compareToSourceId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourceId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _compareToSourceId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourceExpression")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String compareToSourceExpression;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourceExpression")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _compareToSourceExpression;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourcePath")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String compareToSourcePath;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourcePath")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _compareToSourcePath;
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
    @JsonProperty("headerField")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String headerField;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_headerField")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _headerField;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("minimumId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String minimumId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minimumId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minimumId;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("navigationLinks")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean navigationLinks;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_navigationLinks")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _navigationLinks;
    /**
     * The operator type defines the conditional behavior of the assert. If not defined, the default is equals.
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("The operator type defines the conditional behavior of the assert. If not defined, the default is equals.")
    private TestScript_Assert.Operator operator;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operator")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _operator;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String path;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _path;
    /**
     * The request method or HTTP operation code to compare against that used by the client system under test.
     * 
     */
    @JsonProperty("requestMethod")
    @JsonPropertyDescription("The request method or HTTP operation code to compare against that used by the client system under test.")
    private TestScript_Assert.RequestMethod requestMethod;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestMethod")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requestMethod;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requestURL")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String requestURL;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestURL")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requestURL;
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
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.")
    private TestScript_Assert.Response response;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_response")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _response;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("responseCode")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String responseCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_responseCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _responseCode;
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
    @JsonProperty("validateProfileId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String validateProfileId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validateProfileId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _validateProfileId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String value;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _value;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("warningOnly")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean warningOnly;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_warningOnly")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _warningOnly;

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
     * The direction to use for the assertion.
     * 
     */
    @JsonProperty("direction")
    public TestScript_Assert.Direction getDirection() {
        return direction;
    }

    /**
     * The direction to use for the assertion.
     * 
     */
    @JsonProperty("direction")
    public void setDirection(TestScript_Assert.Direction direction) {
        this.direction = direction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_direction")
    public Element get_direction() {
        return _direction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_direction")
    public void set_direction(Element _direction) {
        this._direction = _direction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourceId")
    public String getCompareToSourceId() {
        return compareToSourceId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourceId")
    public void setCompareToSourceId(String compareToSourceId) {
        this.compareToSourceId = compareToSourceId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourceId")
    public Element get_compareToSourceId() {
        return _compareToSourceId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourceId")
    public void set_compareToSourceId(Element _compareToSourceId) {
        this._compareToSourceId = _compareToSourceId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourceExpression")
    public String getCompareToSourceExpression() {
        return compareToSourceExpression;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourceExpression")
    public void setCompareToSourceExpression(String compareToSourceExpression) {
        this.compareToSourceExpression = compareToSourceExpression;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourceExpression")
    public Element get_compareToSourceExpression() {
        return _compareToSourceExpression;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourceExpression")
    public void set_compareToSourceExpression(Element _compareToSourceExpression) {
        this._compareToSourceExpression = _compareToSourceExpression;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourcePath")
    public String getCompareToSourcePath() {
        return compareToSourcePath;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("compareToSourcePath")
    public void setCompareToSourcePath(String compareToSourcePath) {
        this.compareToSourcePath = compareToSourcePath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourcePath")
    public Element get_compareToSourcePath() {
        return _compareToSourcePath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compareToSourcePath")
    public void set_compareToSourcePath(Element _compareToSourcePath) {
        this._compareToSourcePath = _compareToSourcePath;
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
    @JsonProperty("headerField")
    public String getHeaderField() {
        return headerField;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("headerField")
    public void setHeaderField(String headerField) {
        this.headerField = headerField;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_headerField")
    public Element get_headerField() {
        return _headerField;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_headerField")
    public void set_headerField(Element _headerField) {
        this._headerField = _headerField;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("minimumId")
    public String getMinimumId() {
        return minimumId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("minimumId")
    public void setMinimumId(String minimumId) {
        this.minimumId = minimumId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minimumId")
    public Element get_minimumId() {
        return _minimumId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minimumId")
    public void set_minimumId(Element _minimumId) {
        this._minimumId = _minimumId;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("navigationLinks")
    public Boolean getNavigationLinks() {
        return navigationLinks;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("navigationLinks")
    public void setNavigationLinks(Boolean navigationLinks) {
        this.navigationLinks = navigationLinks;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_navigationLinks")
    public Element get_navigationLinks() {
        return _navigationLinks;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_navigationLinks")
    public void set_navigationLinks(Element _navigationLinks) {
        this._navigationLinks = _navigationLinks;
    }

    /**
     * The operator type defines the conditional behavior of the assert. If not defined, the default is equals.
     * 
     */
    @JsonProperty("operator")
    public TestScript_Assert.Operator getOperator() {
        return operator;
    }

    /**
     * The operator type defines the conditional behavior of the assert. If not defined, the default is equals.
     * 
     */
    @JsonProperty("operator")
    public void setOperator(TestScript_Assert.Operator operator) {
        this.operator = operator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operator")
    public Element get_operator() {
        return _operator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operator")
    public void set_operator(Element _operator) {
        this._operator = _operator;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public Element get_path() {
        return _path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public void set_path(Element _path) {
        this._path = _path;
    }

    /**
     * The request method or HTTP operation code to compare against that used by the client system under test.
     * 
     */
    @JsonProperty("requestMethod")
    public TestScript_Assert.RequestMethod getRequestMethod() {
        return requestMethod;
    }

    /**
     * The request method or HTTP operation code to compare against that used by the client system under test.
     * 
     */
    @JsonProperty("requestMethod")
    public void setRequestMethod(TestScript_Assert.RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestMethod")
    public Element get_requestMethod() {
        return _requestMethod;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestMethod")
    public void set_requestMethod(Element _requestMethod) {
        this._requestMethod = _requestMethod;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requestURL")
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requestURL")
    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestURL")
    public Element get_requestURL() {
        return _requestURL;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requestURL")
    public void set_requestURL(Element _requestURL) {
        this._requestURL = _requestURL;
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
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
     * 
     */
    @JsonProperty("response")
    public TestScript_Assert.Response getResponse() {
        return response;
    }

    /**
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
     * 
     */
    @JsonProperty("response")
    public void setResponse(TestScript_Assert.Response response) {
        this.response = response;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_response")
    public Element get_response() {
        return _response;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_response")
    public void set_response(Element _response) {
        this._response = _response;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("responseCode")
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("responseCode")
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_responseCode")
    public Element get_responseCode() {
        return _responseCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_responseCode")
    public void set_responseCode(Element _responseCode) {
        this._responseCode = _responseCode;
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
    @JsonProperty("validateProfileId")
    public String getValidateProfileId() {
        return validateProfileId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("validateProfileId")
    public void setValidateProfileId(String validateProfileId) {
        this.validateProfileId = validateProfileId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validateProfileId")
    public Element get_validateProfileId() {
        return _validateProfileId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validateProfileId")
    public void set_validateProfileId(Element _validateProfileId) {
        this._validateProfileId = _validateProfileId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public Element get_value() {
        return _value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public void set_value(Element _value) {
        this._value = _value;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("warningOnly")
    public Boolean getWarningOnly() {
        return warningOnly;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("warningOnly")
    public void setWarningOnly(Boolean warningOnly) {
        this.warningOnly = warningOnly;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_warningOnly")
    public Element get_warningOnly() {
        return _warningOnly;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_warningOnly")
    public void set_warningOnly(Element _warningOnly) {
        this._warningOnly = _warningOnly;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScript_Assert.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null)?"<null>":this.direction));
        sb.append(',');
        sb.append("_direction");
        sb.append('=');
        sb.append(((this._direction == null)?"<null>":this._direction));
        sb.append(',');
        sb.append("compareToSourceId");
        sb.append('=');
        sb.append(((this.compareToSourceId == null)?"<null>":this.compareToSourceId));
        sb.append(',');
        sb.append("_compareToSourceId");
        sb.append('=');
        sb.append(((this._compareToSourceId == null)?"<null>":this._compareToSourceId));
        sb.append(',');
        sb.append("compareToSourceExpression");
        sb.append('=');
        sb.append(((this.compareToSourceExpression == null)?"<null>":this.compareToSourceExpression));
        sb.append(',');
        sb.append("_compareToSourceExpression");
        sb.append('=');
        sb.append(((this._compareToSourceExpression == null)?"<null>":this._compareToSourceExpression));
        sb.append(',');
        sb.append("compareToSourcePath");
        sb.append('=');
        sb.append(((this.compareToSourcePath == null)?"<null>":this.compareToSourcePath));
        sb.append(',');
        sb.append("_compareToSourcePath");
        sb.append('=');
        sb.append(((this._compareToSourcePath == null)?"<null>":this._compareToSourcePath));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("_contentType");
        sb.append('=');
        sb.append(((this._contentType == null)?"<null>":this._contentType));
        sb.append(',');
        sb.append("expression");
        sb.append('=');
        sb.append(((this.expression == null)?"<null>":this.expression));
        sb.append(',');
        sb.append("_expression");
        sb.append('=');
        sb.append(((this._expression == null)?"<null>":this._expression));
        sb.append(',');
        sb.append("headerField");
        sb.append('=');
        sb.append(((this.headerField == null)?"<null>":this.headerField));
        sb.append(',');
        sb.append("_headerField");
        sb.append('=');
        sb.append(((this._headerField == null)?"<null>":this._headerField));
        sb.append(',');
        sb.append("minimumId");
        sb.append('=');
        sb.append(((this.minimumId == null)?"<null>":this.minimumId));
        sb.append(',');
        sb.append("_minimumId");
        sb.append('=');
        sb.append(((this._minimumId == null)?"<null>":this._minimumId));
        sb.append(',');
        sb.append("navigationLinks");
        sb.append('=');
        sb.append(((this.navigationLinks == null)?"<null>":this.navigationLinks));
        sb.append(',');
        sb.append("_navigationLinks");
        sb.append('=');
        sb.append(((this._navigationLinks == null)?"<null>":this._navigationLinks));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("_operator");
        sb.append('=');
        sb.append(((this._operator == null)?"<null>":this._operator));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("_path");
        sb.append('=');
        sb.append(((this._path == null)?"<null>":this._path));
        sb.append(',');
        sb.append("requestMethod");
        sb.append('=');
        sb.append(((this.requestMethod == null)?"<null>":this.requestMethod));
        sb.append(',');
        sb.append("_requestMethod");
        sb.append('=');
        sb.append(((this._requestMethod == null)?"<null>":this._requestMethod));
        sb.append(',');
        sb.append("requestURL");
        sb.append('=');
        sb.append(((this.requestURL == null)?"<null>":this.requestURL));
        sb.append(',');
        sb.append("_requestURL");
        sb.append('=');
        sb.append(((this._requestURL == null)?"<null>":this._requestURL));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("_resource");
        sb.append('=');
        sb.append(((this._resource == null)?"<null>":this._resource));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("_response");
        sb.append('=');
        sb.append(((this._response == null)?"<null>":this._response));
        sb.append(',');
        sb.append("responseCode");
        sb.append('=');
        sb.append(((this.responseCode == null)?"<null>":this.responseCode));
        sb.append(',');
        sb.append("_responseCode");
        sb.append('=');
        sb.append(((this._responseCode == null)?"<null>":this._responseCode));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("_sourceId");
        sb.append('=');
        sb.append(((this._sourceId == null)?"<null>":this._sourceId));
        sb.append(',');
        sb.append("validateProfileId");
        sb.append('=');
        sb.append(((this.validateProfileId == null)?"<null>":this.validateProfileId));
        sb.append(',');
        sb.append("_validateProfileId");
        sb.append('=');
        sb.append(((this._validateProfileId == null)?"<null>":this._validateProfileId));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("_value");
        sb.append('=');
        sb.append(((this._value == null)?"<null>":this._value));
        sb.append(',');
        sb.append("warningOnly");
        sb.append('=');
        sb.append(((this.warningOnly == null)?"<null>":this.warningOnly));
        sb.append(',');
        sb.append("_warningOnly");
        sb.append('=');
        sb.append(((this._warningOnly == null)?"<null>":this._warningOnly));
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
        result = ((result* 31)+((this.headerField == null)? 0 :this.headerField.hashCode()));
        result = ((result* 31)+((this.minimumId == null)? 0 :this.minimumId.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.requestMethod == null)? 0 :this.requestMethod.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._sourceId == null)? 0 :this._sourceId.hashCode()));
        result = ((result* 31)+((this._operator == null)? 0 :this._operator.hashCode()));
        result = ((result* 31)+((this._responseCode == null)? 0 :this._responseCode.hashCode()));
        result = ((result* 31)+((this._label == null)? 0 :this._label.hashCode()));
        result = ((result* 31)+((this._compareToSourceId == null)? 0 :this._compareToSourceId.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.responseCode == null)? 0 :this.responseCode.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this._navigationLinks == null)? 0 :this._navigationLinks.hashCode()));
        result = ((result* 31)+((this.requestURL == null)? 0 :this.requestURL.hashCode()));
        result = ((result* 31)+((this._warningOnly == null)? 0 :this._warningOnly.hashCode()));
        result = ((result* 31)+((this.validateProfileId == null)? 0 :this.validateProfileId.hashCode()));
        result = ((result* 31)+((this._minimumId == null)? 0 :this._minimumId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.direction == null)? 0 :this.direction.hashCode()));
        result = ((result* 31)+((this.compareToSourceId == null)? 0 :this.compareToSourceId.hashCode()));
        result = ((result* 31)+((this._direction == null)? 0 :this._direction.hashCode()));
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.compareToSourcePath == null)? 0 :this.compareToSourcePath.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this._path == null)? 0 :this._path.hashCode()));
        result = ((result* 31)+((this._requestURL == null)? 0 :this._requestURL.hashCode()));
        result = ((result* 31)+((this.compareToSourceExpression == null)? 0 :this.compareToSourceExpression.hashCode()));
        result = ((result* 31)+((this._contentType == null)? 0 :this._contentType.hashCode()));
        result = ((result* 31)+((this._expression == null)? 0 :this._expression.hashCode()));
        result = ((result* 31)+((this.navigationLinks == null)? 0 :this.navigationLinks.hashCode()));
        result = ((result* 31)+((this._requestMethod == null)? 0 :this._requestMethod.hashCode()));
        result = ((result* 31)+((this._compareToSourcePath == null)? 0 :this._compareToSourcePath.hashCode()));
        result = ((result* 31)+((this._headerField == null)? 0 :this._headerField.hashCode()));
        result = ((result* 31)+((this._validateProfileId == null)? 0 :this._validateProfileId.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this._compareToSourceExpression == null)? 0 :this._compareToSourceExpression.hashCode()));
        result = ((result* 31)+((this._value == null)? 0 :this._value.hashCode()));
        result = ((result* 31)+((this.warningOnly == null)? 0 :this.warningOnly.hashCode()));
        result = ((result* 31)+((this._response == null)? 0 :this._response.hashCode()));
        result = ((result* 31)+((this._resource == null)? 0 :this._resource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScript_Assert) == false) {
            return false;
        }
        TestScript_Assert rhs = ((TestScript_Assert) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.sourceId == rhs.sourceId)||((this.sourceId!= null)&&this.sourceId.equals(rhs.sourceId)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.headerField == rhs.headerField)||((this.headerField!= null)&&this.headerField.equals(rhs.headerField))))&&((this.minimumId == rhs.minimumId)||((this.minimumId!= null)&&this.minimumId.equals(rhs.minimumId))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.requestMethod == rhs.requestMethod)||((this.requestMethod!= null)&&this.requestMethod.equals(rhs.requestMethod))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._sourceId == rhs._sourceId)||((this._sourceId!= null)&&this._sourceId.equals(rhs._sourceId))))&&((this._operator == rhs._operator)||((this._operator!= null)&&this._operator.equals(rhs._operator))))&&((this._responseCode == rhs._responseCode)||((this._responseCode!= null)&&this._responseCode.equals(rhs._responseCode))))&&((this._label == rhs._label)||((this._label!= null)&&this._label.equals(rhs._label))))&&((this._compareToSourceId == rhs._compareToSourceId)||((this._compareToSourceId!= null)&&this._compareToSourceId.equals(rhs._compareToSourceId))))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.responseCode == rhs.responseCode)||((this.responseCode!= null)&&this.responseCode.equals(rhs.responseCode))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this._navigationLinks == rhs._navigationLinks)||((this._navigationLinks!= null)&&this._navigationLinks.equals(rhs._navigationLinks))))&&((this.requestURL == rhs.requestURL)||((this.requestURL!= null)&&this.requestURL.equals(rhs.requestURL))))&&((this._warningOnly == rhs._warningOnly)||((this._warningOnly!= null)&&this._warningOnly.equals(rhs._warningOnly))))&&((this.validateProfileId == rhs.validateProfileId)||((this.validateProfileId!= null)&&this.validateProfileId.equals(rhs.validateProfileId))))&&((this._minimumId == rhs._minimumId)||((this._minimumId!= null)&&this._minimumId.equals(rhs._minimumId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.direction == rhs.direction)||((this.direction!= null)&&this.direction.equals(rhs.direction))))&&((this.compareToSourceId == rhs.compareToSourceId)||((this.compareToSourceId!= null)&&this.compareToSourceId.equals(rhs.compareToSourceId))))&&((this._direction == rhs._direction)||((this._direction!= null)&&this._direction.equals(rhs._direction))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.compareToSourcePath == rhs.compareToSourcePath)||((this.compareToSourcePath!= null)&&this.compareToSourcePath.equals(rhs.compareToSourcePath))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this._path == rhs._path)||((this._path!= null)&&this._path.equals(rhs._path))))&&((this._requestURL == rhs._requestURL)||((this._requestURL!= null)&&this._requestURL.equals(rhs._requestURL))))&&((this.compareToSourceExpression == rhs.compareToSourceExpression)||((this.compareToSourceExpression!= null)&&this.compareToSourceExpression.equals(rhs.compareToSourceExpression))))&&((this._contentType == rhs._contentType)||((this._contentType!= null)&&this._contentType.equals(rhs._contentType))))&&((this._expression == rhs._expression)||((this._expression!= null)&&this._expression.equals(rhs._expression))))&&((this.navigationLinks == rhs.navigationLinks)||((this.navigationLinks!= null)&&this.navigationLinks.equals(rhs.navigationLinks))))&&((this._requestMethod == rhs._requestMethod)||((this._requestMethod!= null)&&this._requestMethod.equals(rhs._requestMethod))))&&((this._compareToSourcePath == rhs._compareToSourcePath)||((this._compareToSourcePath!= null)&&this._compareToSourcePath.equals(rhs._compareToSourcePath))))&&((this._headerField == rhs._headerField)||((this._headerField!= null)&&this._headerField.equals(rhs._headerField))))&&((this._validateProfileId == rhs._validateProfileId)||((this._validateProfileId!= null)&&this._validateProfileId.equals(rhs._validateProfileId))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this._compareToSourceExpression == rhs._compareToSourceExpression)||((this._compareToSourceExpression!= null)&&this._compareToSourceExpression.equals(rhs._compareToSourceExpression))))&&((this._value == rhs._value)||((this._value!= null)&&this._value.equals(rhs._value))))&&((this.warningOnly == rhs.warningOnly)||((this.warningOnly!= null)&&this.warningOnly.equals(rhs.warningOnly))))&&((this._response == rhs._response)||((this._response!= null)&&this._response.equals(rhs._response))))&&((this._resource == rhs._resource)||((this._resource!= null)&&this._resource.equals(rhs._resource))));
    }


    /**
     * The direction to use for the assertion.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Direction {

        RESPONSE("response"),
        REQUEST("request");
        private final String value;
        private final static Map<String, TestScript_Assert.Direction> CONSTANTS = new HashMap<String, TestScript_Assert.Direction>();

        static {
            for (TestScript_Assert.Direction c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Direction(String value) {
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
        public static TestScript_Assert.Direction fromValue(String value) {
            TestScript_Assert.Direction constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The operator type defines the conditional behavior of the assert. If not defined, the default is equals.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Operator {

        EQUALS("equals"),
        NOT_EQUALS("notEquals"),
        IN("in"),
        NOT_IN("notIn"),
        GREATER_THAN("greaterThan"),
        LESS_THAN("lessThan"),
        EMPTY("empty"),
        NOT_EMPTY("notEmpty"),
        CONTAINS("contains"),
        NOT_CONTAINS("notContains"),
        EVAL("eval");
        private final String value;
        private final static Map<String, TestScript_Assert.Operator> CONSTANTS = new HashMap<String, TestScript_Assert.Operator>();

        static {
            for (TestScript_Assert.Operator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Operator(String value) {
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
        public static TestScript_Assert.Operator fromValue(String value) {
            TestScript_Assert.Operator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The request method or HTTP operation code to compare against that used by the client system under test.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RequestMethod {

        DELETE("delete"),
        GET("get"),
        OPTIONS("options"),
        PATCH("patch"),
        POST("post"),
        PUT("put"),
        HEAD("head");
        private final String value;
        private final static Map<String, TestScript_Assert.RequestMethod> CONSTANTS = new HashMap<String, TestScript_Assert.RequestMethod>();

        static {
            for (TestScript_Assert.RequestMethod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RequestMethod(String value) {
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
        public static TestScript_Assert.RequestMethod fromValue(String value) {
            TestScript_Assert.RequestMethod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Response {

        OKAY("okay"),
        CREATED("created"),
        NO_CONTENT("noContent"),
        NOT_MODIFIED("notModified"),
        BAD("bad"),
        FORBIDDEN("forbidden"),
        NOT_FOUND("notFound"),
        METHOD_NOT_ALLOWED("methodNotAllowed"),
        CONFLICT("conflict"),
        GONE("gone"),
        PRECONDITION_FAILED("preconditionFailed"),
        UNPROCESSABLE("unprocessable");
        private final String value;
        private final static Map<String, TestScript_Assert.Response> CONSTANTS = new HashMap<String, TestScript_Assert.Response>();

        static {
            for (TestScript_Assert.Response c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Response(String value) {
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
        public static TestScript_Assert.Response fromValue(String value) {
            TestScript_Assert.Response constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
