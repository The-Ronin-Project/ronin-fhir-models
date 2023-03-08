
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
 * A Map of relationships between 2 structures that can be used to transform data.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "name",
    "_name",
    "extends",
    "_extends",
    "typeMode",
    "_typeMode",
    "documentation",
    "_documentation",
    "input",
    "rule"
})
@Generated("jsonschema2pojo")
public class StructureMap_Group {

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
    @JsonProperty("name")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("extends")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String _extends;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_extends")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element __extends;
    /**
     * If this is the default rule set to apply for the source type or this combination of types.
     * 
     */
    @JsonProperty("typeMode")
    @JsonPropertyDescription("If this is the default rule set to apply for the source type or this combination of types.")
    private StructureMap_Group.TypeMode typeMode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_typeMode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _typeMode;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("documentation")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String documentation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _documentation;
    /**
     * A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
     * (Required)
     * 
     */
    @JsonProperty("input")
    @JsonPropertyDescription("A name assigned to an instance of data. The instance must be provided when the mapping is invoked.")
    private List<StructureMap_Input> input = new ArrayList<StructureMap_Input>();
    /**
     * Transform Rule from source to target.
     * (Required)
     * 
     */
    @JsonProperty("rule")
    @JsonPropertyDescription("Transform Rule from source to target.")
    private List<StructureMap_Rule> rule = new ArrayList<StructureMap_Rule>();

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
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("extends")
    public String getExtends() {
        return _extends;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("extends")
    public void setExtends(String _extends) {
        this._extends = _extends;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_extends")
    public Element get_extends() {
        return __extends;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_extends")
    public void set_extends(Element __extends) {
        this.__extends = __extends;
    }

    /**
     * If this is the default rule set to apply for the source type or this combination of types.
     * 
     */
    @JsonProperty("typeMode")
    public StructureMap_Group.TypeMode getTypeMode() {
        return typeMode;
    }

    /**
     * If this is the default rule set to apply for the source type or this combination of types.
     * 
     */
    @JsonProperty("typeMode")
    public void setTypeMode(StructureMap_Group.TypeMode typeMode) {
        this.typeMode = typeMode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_typeMode")
    public Element get_typeMode() {
        return _typeMode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_typeMode")
    public void set_typeMode(Element _typeMode) {
        this._typeMode = _typeMode;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("documentation")
    public String getDocumentation() {
        return documentation;
    }

    /**
     * A sequence of Unicode characters
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
     * A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
     * (Required)
     * 
     */
    @JsonProperty("input")
    public List<StructureMap_Input> getInput() {
        return input;
    }

    /**
     * A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
     * (Required)
     * 
     */
    @JsonProperty("input")
    public void setInput(List<StructureMap_Input> input) {
        this.input = input;
    }

    /**
     * Transform Rule from source to target.
     * (Required)
     * 
     */
    @JsonProperty("rule")
    public List<StructureMap_Rule> getRule() {
        return rule;
    }

    /**
     * Transform Rule from source to target.
     * (Required)
     * 
     */
    @JsonProperty("rule")
    public void setRule(List<StructureMap_Rule> rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StructureMap_Group.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("_extends");
        sb.append('=');
        sb.append(((this._extends == null)?"<null>":this._extends));
        sb.append(',');
        sb.append("__extends");
        sb.append('=');
        sb.append(((this.__extends == null)?"<null>":this.__extends));
        sb.append(',');
        sb.append("typeMode");
        sb.append('=');
        sb.append(((this.typeMode == null)?"<null>":this.typeMode));
        sb.append(',');
        sb.append("_typeMode");
        sb.append('=');
        sb.append(((this._typeMode == null)?"<null>":this._typeMode));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("_documentation");
        sb.append('=');
        sb.append(((this._documentation == null)?"<null>":this._documentation));
        sb.append(',');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
        sb.append(',');
        sb.append("rule");
        sb.append('=');
        sb.append(((this.rule == null)?"<null>":this.rule));
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
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._extends == null)? 0 :this._extends.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this.rule == null)? 0 :this.rule.hashCode()));
        result = ((result* 31)+((this._typeMode == null)? 0 :this._typeMode.hashCode()));
        result = ((result* 31)+((this.typeMode == null)? 0 :this.typeMode.hashCode()));
        result = ((result* 31)+((this._documentation == null)? 0 :this._documentation.hashCode()));
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.__extends == null)? 0 :this.__extends.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StructureMap_Group) == false) {
            return false;
        }
        StructureMap_Group rhs = ((StructureMap_Group) other);
        return ((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._extends == rhs._extends)||((this._extends!= null)&&this._extends.equals(rhs._extends))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this.rule == rhs.rule)||((this.rule!= null)&&this.rule.equals(rhs.rule))))&&((this._typeMode == rhs._typeMode)||((this._typeMode!= null)&&this._typeMode.equals(rhs._typeMode))))&&((this.typeMode == rhs.typeMode)||((this.typeMode!= null)&&this.typeMode.equals(rhs.typeMode))))&&((this._documentation == rhs._documentation)||((this._documentation!= null)&&this._documentation.equals(rhs._documentation))))&&((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.__extends == rhs.__extends)||((this.__extends!= null)&&this.__extends.equals(rhs.__extends))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }


    /**
     * If this is the default rule set to apply for the source type or this combination of types.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TypeMode {

        NONE("none"),
        TYPES("types"),
        TYPE_AND_TYPES("type-and-types");
        private final String value;
        private final static Map<String, StructureMap_Group.TypeMode> CONSTANTS = new HashMap<String, StructureMap_Group.TypeMode>();

        static {
            for (StructureMap_Group.TypeMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TypeMode(String value) {
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
        public static StructureMap_Group.TypeMode fromValue(String value) {
            StructureMap_Group.TypeMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
