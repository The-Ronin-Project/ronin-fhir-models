
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
    "context",
    "_context",
    "contextType",
    "_contextType",
    "element",
    "_element",
    "variable",
    "_variable",
    "listMode",
    "_listMode",
    "listRuleId",
    "_listRuleId",
    "transform",
    "_transform",
    "parameter"
})
@Generated("jsonschema2pojo")
public class StructureMap_Target {

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
    @JsonProperty("context")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String context;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_context")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _context;
    /**
     * How to interpret the context.
     * 
     */
    @JsonProperty("contextType")
    @JsonPropertyDescription("How to interpret the context.")
    private StructureMap_Target.ContextType contextType;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contextType")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _contextType;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("element")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String element;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_element")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _element;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("variable")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String variable;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variable")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _variable;
    /**
     * If field is a list, how to manage the list.
     * 
     */
    @JsonProperty("listMode")
    @JsonPropertyDescription("If field is a list, how to manage the list.")
    private List<ListMode> listMode = new ArrayList<ListMode>();
    /**
     * Extensions for listMode
     * 
     */
    @JsonProperty("_listMode")
    @JsonPropertyDescription("Extensions for listMode")
    private List<Element> _listMode = new ArrayList<Element>();
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("listRuleId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String listRuleId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_listRuleId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _listRuleId;
    /**
     * How the data is copied / created.
     * 
     */
    @JsonProperty("transform")
    @JsonPropertyDescription("How the data is copied / created.")
    private StructureMap_Target.Transform transform;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_transform")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _transform;
    /**
     * Parameters to the transform.
     * 
     */
    @JsonProperty("parameter")
    @JsonPropertyDescription("Parameters to the transform.")
    private List<StructureMap_Parameter> parameter = new ArrayList<StructureMap_Parameter>();

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
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_context")
    public Element get_context() {
        return _context;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_context")
    public void set_context(Element _context) {
        this._context = _context;
    }

    /**
     * How to interpret the context.
     * 
     */
    @JsonProperty("contextType")
    public StructureMap_Target.ContextType getContextType() {
        return contextType;
    }

    /**
     * How to interpret the context.
     * 
     */
    @JsonProperty("contextType")
    public void setContextType(StructureMap_Target.ContextType contextType) {
        this.contextType = contextType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contextType")
    public Element get_contextType() {
        return _contextType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contextType")
    public void set_contextType(Element _contextType) {
        this._contextType = _contextType;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("element")
    public String getElement() {
        return element;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("element")
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_element")
    public Element get_element() {
        return _element;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_element")
    public void set_element(Element _element) {
        this._element = _element;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("variable")
    public String getVariable() {
        return variable;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("variable")
    public void setVariable(String variable) {
        this.variable = variable;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variable")
    public Element get_variable() {
        return _variable;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variable")
    public void set_variable(Element _variable) {
        this._variable = _variable;
    }

    /**
     * If field is a list, how to manage the list.
     * 
     */
    @JsonProperty("listMode")
    public List<ListMode> getListMode() {
        return listMode;
    }

    /**
     * If field is a list, how to manage the list.
     * 
     */
    @JsonProperty("listMode")
    public void setListMode(List<ListMode> listMode) {
        this.listMode = listMode;
    }

    /**
     * Extensions for listMode
     * 
     */
    @JsonProperty("_listMode")
    public List<Element> get_listMode() {
        return _listMode;
    }

    /**
     * Extensions for listMode
     * 
     */
    @JsonProperty("_listMode")
    public void set_listMode(List<Element> _listMode) {
        this._listMode = _listMode;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("listRuleId")
    public String getListRuleId() {
        return listRuleId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("listRuleId")
    public void setListRuleId(String listRuleId) {
        this.listRuleId = listRuleId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_listRuleId")
    public Element get_listRuleId() {
        return _listRuleId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_listRuleId")
    public void set_listRuleId(Element _listRuleId) {
        this._listRuleId = _listRuleId;
    }

    /**
     * How the data is copied / created.
     * 
     */
    @JsonProperty("transform")
    public StructureMap_Target.Transform getTransform() {
        return transform;
    }

    /**
     * How the data is copied / created.
     * 
     */
    @JsonProperty("transform")
    public void setTransform(StructureMap_Target.Transform transform) {
        this.transform = transform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_transform")
    public Element get_transform() {
        return _transform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_transform")
    public void set_transform(Element _transform) {
        this._transform = _transform;
    }

    /**
     * Parameters to the transform.
     * 
     */
    @JsonProperty("parameter")
    public List<StructureMap_Parameter> getParameter() {
        return parameter;
    }

    /**
     * Parameters to the transform.
     * 
     */
    @JsonProperty("parameter")
    public void setParameter(List<StructureMap_Parameter> parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StructureMap_Target.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("_context");
        sb.append('=');
        sb.append(((this._context == null)?"<null>":this._context));
        sb.append(',');
        sb.append("contextType");
        sb.append('=');
        sb.append(((this.contextType == null)?"<null>":this.contextType));
        sb.append(',');
        sb.append("_contextType");
        sb.append('=');
        sb.append(((this._contextType == null)?"<null>":this._contextType));
        sb.append(',');
        sb.append("element");
        sb.append('=');
        sb.append(((this.element == null)?"<null>":this.element));
        sb.append(',');
        sb.append("_element");
        sb.append('=');
        sb.append(((this._element == null)?"<null>":this._element));
        sb.append(',');
        sb.append("variable");
        sb.append('=');
        sb.append(((this.variable == null)?"<null>":this.variable));
        sb.append(',');
        sb.append("_variable");
        sb.append('=');
        sb.append(((this._variable == null)?"<null>":this._variable));
        sb.append(',');
        sb.append("listMode");
        sb.append('=');
        sb.append(((this.listMode == null)?"<null>":this.listMode));
        sb.append(',');
        sb.append("_listMode");
        sb.append('=');
        sb.append(((this._listMode == null)?"<null>":this._listMode));
        sb.append(',');
        sb.append("listRuleId");
        sb.append('=');
        sb.append(((this.listRuleId == null)?"<null>":this.listRuleId));
        sb.append(',');
        sb.append("_listRuleId");
        sb.append('=');
        sb.append(((this._listRuleId == null)?"<null>":this._listRuleId));
        sb.append(',');
        sb.append("transform");
        sb.append('=');
        sb.append(((this.transform == null)?"<null>":this.transform));
        sb.append(',');
        sb.append("_transform");
        sb.append('=');
        sb.append(((this._transform == null)?"<null>":this._transform));
        sb.append(',');
        sb.append("parameter");
        sb.append('=');
        sb.append(((this.parameter == null)?"<null>":this.parameter));
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
        result = ((result* 31)+((this._contextType == null)? 0 :this._contextType.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.listRuleId == null)? 0 :this.listRuleId.hashCode()));
        result = ((result* 31)+((this._listRuleId == null)? 0 :this._listRuleId.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._element == null)? 0 :this._element.hashCode()));
        result = ((result* 31)+((this.listMode == null)? 0 :this.listMode.hashCode()));
        result = ((result* 31)+((this._variable == null)? 0 :this._variable.hashCode()));
        result = ((result* 31)+((this.transform == null)? 0 :this.transform.hashCode()));
        result = ((result* 31)+((this._transform == null)? 0 :this._transform.hashCode()));
        result = ((result* 31)+((this._context == null)? 0 :this._context.hashCode()));
        result = ((result* 31)+((this.contextType == null)? 0 :this.contextType.hashCode()));
        result = ((result* 31)+((this._listMode == null)? 0 :this._listMode.hashCode()));
        result = ((result* 31)+((this.parameter == null)? 0 :this.parameter.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.variable == null)? 0 :this.variable.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.element == null)? 0 :this.element.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StructureMap_Target) == false) {
            return false;
        }
        StructureMap_Target rhs = ((StructureMap_Target) other);
        return (((((((((((((((((((this._contextType == rhs._contextType)||((this._contextType!= null)&&this._contextType.equals(rhs._contextType)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.listRuleId == rhs.listRuleId)||((this.listRuleId!= null)&&this.listRuleId.equals(rhs.listRuleId))))&&((this._listRuleId == rhs._listRuleId)||((this._listRuleId!= null)&&this._listRuleId.equals(rhs._listRuleId))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._element == rhs._element)||((this._element!= null)&&this._element.equals(rhs._element))))&&((this.listMode == rhs.listMode)||((this.listMode!= null)&&this.listMode.equals(rhs.listMode))))&&((this._variable == rhs._variable)||((this._variable!= null)&&this._variable.equals(rhs._variable))))&&((this.transform == rhs.transform)||((this.transform!= null)&&this.transform.equals(rhs.transform))))&&((this._transform == rhs._transform)||((this._transform!= null)&&this._transform.equals(rhs._transform))))&&((this._context == rhs._context)||((this._context!= null)&&this._context.equals(rhs._context))))&&((this.contextType == rhs.contextType)||((this.contextType!= null)&&this.contextType.equals(rhs.contextType))))&&((this._listMode == rhs._listMode)||((this._listMode!= null)&&this._listMode.equals(rhs._listMode))))&&((this.parameter == rhs.parameter)||((this.parameter!= null)&&this.parameter.equals(rhs.parameter))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.variable == rhs.variable)||((this.variable!= null)&&this.variable.equals(rhs.variable))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.element == rhs.element)||((this.element!= null)&&this.element.equals(rhs.element))));
    }


    /**
     * How to interpret the context.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ContextType {

        TYPE("type"),
        VARIABLE("variable");
        private final String value;
        private final static Map<String, StructureMap_Target.ContextType> CONSTANTS = new HashMap<String, StructureMap_Target.ContextType>();

        static {
            for (StructureMap_Target.ContextType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ContextType(String value) {
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
        public static StructureMap_Target.ContextType fromValue(String value) {
            StructureMap_Target.ContextType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * How the data is copied / created.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Transform {

        CREATE("create"),
        COPY("copy"),
        TRUNCATE("truncate"),
        ESCAPE("escape"),
        CAST("cast"),
        APPEND("append"),
        TRANSLATE("translate"),
        REFERENCE("reference"),
        DATE_OP("dateOp"),
        UUID("uuid"),
        POINTER("pointer"),
        EVALUATE("evaluate"),
        CC("cc"),
        C("c"),
        QTY("qty"),
        ID("id"),
        CP("cp");
        private final String value;
        private final static Map<String, StructureMap_Target.Transform> CONSTANTS = new HashMap<String, StructureMap_Target.Transform>();

        static {
            for (StructureMap_Target.Transform c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Transform(String value) {
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
        public static StructureMap_Target.Transform fromValue(String value) {
            StructureMap_Target.Transform constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
