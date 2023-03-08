
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
 * Captures constraints on each element within the resource, profile, or extension.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "key",
    "_key",
    "requirements",
    "_requirements",
    "severity",
    "_severity",
    "human",
    "_human",
    "expression",
    "_expression",
    "xpath",
    "_xpath",
    "source"
})
@Generated("jsonschema2pojo")
public class ElementDefinition_Constraint {

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String key;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_key")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _key;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requirements")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String requirements;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirements")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requirements;
    /**
     * Identifies the impact constraint violation has on the conformance of the instance.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Identifies the impact constraint violation has on the conformance of the instance.")
    private ElementDefinition_Constraint.Severity severity;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _severity;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("human")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String human;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_human")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _human;
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String source;

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_key")
    public Element get_key() {
        return _key;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_key")
    public void set_key(Element _key) {
        this._key = _key;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requirements")
    public String getRequirements() {
        return requirements;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("requirements")
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirements")
    public Element get_requirements() {
        return _requirements;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirements")
    public void set_requirements(Element _requirements) {
        this._requirements = _requirements;
    }

    /**
     * Identifies the impact constraint violation has on the conformance of the instance.
     * 
     */
    @JsonProperty("severity")
    public ElementDefinition_Constraint.Severity getSeverity() {
        return severity;
    }

    /**
     * Identifies the impact constraint violation has on the conformance of the instance.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(ElementDefinition_Constraint.Severity severity) {
        this.severity = severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public Element get_severity() {
        return _severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public void set_severity(Element _severity) {
        this._severity = _severity;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("human")
    public String getHuman() {
        return human;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("human")
    public void setHuman(String human) {
        this.human = human;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_human")
    public Element get_human() {
        return _human;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_human")
    public void set_human(Element _human) {
        this._human = _human;
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElementDefinition_Constraint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("_key");
        sb.append('=');
        sb.append(((this._key == null)?"<null>":this._key));
        sb.append(',');
        sb.append("requirements");
        sb.append('=');
        sb.append(((this.requirements == null)?"<null>":this.requirements));
        sb.append(',');
        sb.append("_requirements");
        sb.append('=');
        sb.append(((this._requirements == null)?"<null>":this._requirements));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("_severity");
        sb.append('=');
        sb.append(((this._severity == null)?"<null>":this._severity));
        sb.append(',');
        sb.append("human");
        sb.append('=');
        sb.append(((this.human == null)?"<null>":this.human));
        sb.append(',');
        sb.append("_human");
        sb.append('=');
        sb.append(((this._human == null)?"<null>":this._human));
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.requirements == null)? 0 :this.requirements.hashCode()));
        result = ((result* 31)+((this._human == null)? 0 :this._human.hashCode()));
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this._key == null)? 0 :this._key.hashCode()));
        result = ((result* 31)+((this._expression == null)? 0 :this._expression.hashCode()));
        result = ((result* 31)+((this.xpath == null)? 0 :this.xpath.hashCode()));
        result = ((result* 31)+((this._xpath == null)? 0 :this._xpath.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._requirements == null)? 0 :this._requirements.hashCode()));
        result = ((result* 31)+((this.human == null)? 0 :this.human.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this._severity == null)? 0 :this._severity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElementDefinition_Constraint) == false) {
            return false;
        }
        ElementDefinition_Constraint rhs = ((ElementDefinition_Constraint) other);
        return (((((((((((((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.requirements == rhs.requirements)||((this.requirements!= null)&&this.requirements.equals(rhs.requirements))))&&((this._human == rhs._human)||((this._human!= null)&&this._human.equals(rhs._human))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this._key == rhs._key)||((this._key!= null)&&this._key.equals(rhs._key))))&&((this._expression == rhs._expression)||((this._expression!= null)&&this._expression.equals(rhs._expression))))&&((this.xpath == rhs.xpath)||((this.xpath!= null)&&this.xpath.equals(rhs.xpath))))&&((this._xpath == rhs._xpath)||((this._xpath!= null)&&this._xpath.equals(rhs._xpath))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._requirements == rhs._requirements)||((this._requirements!= null)&&this._requirements.equals(rhs._requirements))))&&((this.human == rhs.human)||((this.human!= null)&&this.human.equals(rhs.human))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this._severity == rhs._severity)||((this._severity!= null)&&this._severity.equals(rhs._severity))));
    }


    /**
     * Identifies the impact constraint violation has on the conformance of the instance.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Severity {

        ERROR("error"),
        WARNING("warning");
        private final String value;
        private final static Map<String, ElementDefinition_Constraint.Severity> CONSTANTS = new HashMap<String, ElementDefinition_Constraint.Severity>();

        static {
            for (ElementDefinition_Constraint.Severity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Severity(String value) {
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
        public static ElementDefinition_Constraint.Severity fromValue(String value) {
            ElementDefinition_Constraint.Severity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
