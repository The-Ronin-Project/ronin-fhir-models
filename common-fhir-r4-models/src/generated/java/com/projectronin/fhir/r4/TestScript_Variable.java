
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "name",
    "_name",
    "defaultValue",
    "_defaultValue",
    "description",
    "_description",
    "expression",
    "_expression",
    "headerField",
    "_headerField",
    "hint",
    "_hint",
    "path",
    "_path",
    "sourceId",
    "_sourceId"
})
@Generated("jsonschema2pojo")
public class TestScript_Variable {

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
    @JsonProperty("defaultValue")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String defaultValue;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValue")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValue;
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
    @JsonProperty("hint")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String hint;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hint")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _hint;
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
    @JsonProperty("defaultValue")
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("defaultValue")
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValue")
    public Element get_defaultValue() {
        return _defaultValue;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValue")
    public void set_defaultValue(Element _defaultValue) {
        this._defaultValue = _defaultValue;
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
    @JsonProperty("hint")
    public String getHint() {
        return hint;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("hint")
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hint")
    public Element get_hint() {
        return _hint;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hint")
    public void set_hint(Element _hint) {
        this._hint = _hint;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScript_Variable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("defaultValue");
        sb.append('=');
        sb.append(((this.defaultValue == null)?"<null>":this.defaultValue));
        sb.append(',');
        sb.append("_defaultValue");
        sb.append('=');
        sb.append(((this._defaultValue == null)?"<null>":this._defaultValue));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
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
        sb.append("hint");
        sb.append('=');
        sb.append(((this.hint == null)?"<null>":this.hint));
        sb.append(',');
        sb.append("_hint");
        sb.append('=');
        sb.append(((this._hint == null)?"<null>":this._hint));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("_path");
        sb.append('=');
        sb.append(((this._path == null)?"<null>":this._path));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("_sourceId");
        sb.append('=');
        sb.append(((this._sourceId == null)?"<null>":this._sourceId));
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
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.defaultValue == null)? 0 :this.defaultValue.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._sourceId == null)? 0 :this._sourceId.hashCode()));
        result = ((result* 31)+((this._path == null)? 0 :this._path.hashCode()));
        result = ((result* 31)+((this._hint == null)? 0 :this._hint.hashCode()));
        result = ((result* 31)+((this._expression == null)? 0 :this._expression.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this._headerField == null)? 0 :this._headerField.hashCode()));
        result = ((result* 31)+((this.hint == null)? 0 :this.hint.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._defaultValue == null)? 0 :this._defaultValue.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScript_Variable) == false) {
            return false;
        }
        TestScript_Variable rhs = ((TestScript_Variable) other);
        return ((((((((((((((((((((this.sourceId == rhs.sourceId)||((this.sourceId!= null)&&this.sourceId.equals(rhs.sourceId)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.headerField == rhs.headerField)||((this.headerField!= null)&&this.headerField.equals(rhs.headerField))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.defaultValue == rhs.defaultValue)||((this.defaultValue!= null)&&this.defaultValue.equals(rhs.defaultValue))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._sourceId == rhs._sourceId)||((this._sourceId!= null)&&this._sourceId.equals(rhs._sourceId))))&&((this._path == rhs._path)||((this._path!= null)&&this._path.equals(rhs._path))))&&((this._hint == rhs._hint)||((this._hint!= null)&&this._hint.equals(rhs._hint))))&&((this._expression == rhs._expression)||((this._expression!= null)&&this._expression.equals(rhs._expression))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this._headerField == rhs._headerField)||((this._headerField!= null)&&this._headerField.equals(rhs._headerField))))&&((this.hint == rhs.hint)||((this.hint!= null)&&this.hint.equals(rhs.hint))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._defaultValue == rhs._defaultValue)||((this._defaultValue!= null)&&this._defaultValue.equals(rhs._defaultValue))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))));
    }

}
