
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
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "name",
    "_name",
    "use",
    "_use",
    "min",
    "_min",
    "max",
    "_max",
    "documentation",
    "_documentation",
    "type",
    "_type",
    "targetProfile",
    "searchType",
    "_searchType",
    "binding",
    "referencedFrom",
    "part"
})
@Generated("jsonschema2pojo")
public class OperationDefinition_Parameter {

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
    @JsonProperty("name")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * Whether this is an input or an output parameter.
     * 
     */
    @JsonProperty("use")
    @JsonPropertyDescription("Whether this is an input or an output parameter.")
    private OperationDefinition_Parameter.Use use;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _use;
    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    @JsonPropertyDescription("A whole number")
    private Double min;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _min;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String max;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _max;
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
     * Used when the type is &quot;Reference&quot; or &quot;canonical&quot;, and identifies a profile structure or implementation Guide that applies to the target of the reference this parameter refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("targetProfile")
    @JsonPropertyDescription("Used when the type is \"Reference\" or \"canonical\", and identifies a profile structure or implementation Guide that applies to the target of the reference this parameter refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.")
    private List<String> targetProfile = new ArrayList<String>();
    /**
     * How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.
     * 
     */
    @JsonProperty("searchType")
    @JsonPropertyDescription("How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.")
    private OperationDefinition_Parameter.SearchType searchType;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_searchType")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _searchType;
    /**
     * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
     * 
     */
    @JsonProperty("binding")
    @JsonPropertyDescription("A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).")
    private OperationDefinition_Binding binding;
    /**
     * Identifies other resource parameters within the operation invocation that are expected to resolve to this resource.
     * 
     */
    @JsonProperty("referencedFrom")
    @JsonPropertyDescription("Identifies other resource parameters within the operation invocation that are expected to resolve to this resource.")
    private List<OperationDefinition_ReferencedFrom> referencedFrom = new ArrayList<OperationDefinition_ReferencedFrom>();
    /**
     * The parts of a nested Parameter.
     * 
     */
    @JsonProperty("part")
    @JsonPropertyDescription("The parts of a nested Parameter.")
    private List<OperationDefinition_Parameter> part = new ArrayList<OperationDefinition_Parameter>();

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
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
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
     * Whether this is an input or an output parameter.
     * 
     */
    @JsonProperty("use")
    public OperationDefinition_Parameter.Use getUse() {
        return use;
    }

    /**
     * Whether this is an input or an output parameter.
     * 
     */
    @JsonProperty("use")
    public void setUse(OperationDefinition_Parameter.Use use) {
        this.use = use;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    public Element get_use() {
        return _use;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    public void set_use(Element _use) {
        this._use = _use;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public Element get_min() {
        return _min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public void set_min(Element _min) {
        this._min = _min;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public Element get_max() {
        return _max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public void set_max(Element _max) {
        this._max = _max;
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
     * Used when the type is &quot;Reference&quot; or &quot;canonical&quot;, and identifies a profile structure or implementation Guide that applies to the target of the reference this parameter refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("targetProfile")
    public List<String> getTargetProfile() {
        return targetProfile;
    }

    /**
     * Used when the type is &quot;Reference&quot; or &quot;canonical&quot;, and identifies a profile structure or implementation Guide that applies to the target of the reference this parameter refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("targetProfile")
    public void setTargetProfile(List<String> targetProfile) {
        this.targetProfile = targetProfile;
    }

    /**
     * How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.
     * 
     */
    @JsonProperty("searchType")
    public OperationDefinition_Parameter.SearchType getSearchType() {
        return searchType;
    }

    /**
     * How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.
     * 
     */
    @JsonProperty("searchType")
    public void setSearchType(OperationDefinition_Parameter.SearchType searchType) {
        this.searchType = searchType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_searchType")
    public Element get_searchType() {
        return _searchType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_searchType")
    public void set_searchType(Element _searchType) {
        this._searchType = _searchType;
    }

    /**
     * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
     * 
     */
    @JsonProperty("binding")
    public OperationDefinition_Binding getBinding() {
        return binding;
    }

    /**
     * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
     * 
     */
    @JsonProperty("binding")
    public void setBinding(OperationDefinition_Binding binding) {
        this.binding = binding;
    }

    /**
     * Identifies other resource parameters within the operation invocation that are expected to resolve to this resource.
     * 
     */
    @JsonProperty("referencedFrom")
    public List<OperationDefinition_ReferencedFrom> getReferencedFrom() {
        return referencedFrom;
    }

    /**
     * Identifies other resource parameters within the operation invocation that are expected to resolve to this resource.
     * 
     */
    @JsonProperty("referencedFrom")
    public void setReferencedFrom(List<OperationDefinition_ReferencedFrom> referencedFrom) {
        this.referencedFrom = referencedFrom;
    }

    /**
     * The parts of a nested Parameter.
     * 
     */
    @JsonProperty("part")
    public List<OperationDefinition_Parameter> getPart() {
        return part;
    }

    /**
     * The parts of a nested Parameter.
     * 
     */
    @JsonProperty("part")
    public void setPart(List<OperationDefinition_Parameter> part) {
        this.part = part;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperationDefinition_Parameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("use");
        sb.append('=');
        sb.append(((this.use == null)?"<null>":this.use));
        sb.append(',');
        sb.append("_use");
        sb.append('=');
        sb.append(((this._use == null)?"<null>":this._use));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
        sb.append(',');
        sb.append("_min");
        sb.append('=');
        sb.append(((this._min == null)?"<null>":this._min));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("_max");
        sb.append('=');
        sb.append(((this._max == null)?"<null>":this._max));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("_documentation");
        sb.append('=');
        sb.append(((this._documentation == null)?"<null>":this._documentation));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("targetProfile");
        sb.append('=');
        sb.append(((this.targetProfile == null)?"<null>":this.targetProfile));
        sb.append(',');
        sb.append("searchType");
        sb.append('=');
        sb.append(((this.searchType == null)?"<null>":this.searchType));
        sb.append(',');
        sb.append("_searchType");
        sb.append('=');
        sb.append(((this._searchType == null)?"<null>":this._searchType));
        sb.append(',');
        sb.append("binding");
        sb.append('=');
        sb.append(((this.binding == null)?"<null>":this.binding));
        sb.append(',');
        sb.append("referencedFrom");
        sb.append('=');
        sb.append(((this.referencedFrom == null)?"<null>":this.referencedFrom));
        sb.append(',');
        sb.append("part");
        sb.append('=');
        sb.append(((this.part == null)?"<null>":this.part));
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
        result = ((result* 31)+((this._use == null)? 0 :this._use.hashCode()));
        result = ((result* 31)+((this._searchType == null)? 0 :this._searchType.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.searchType == null)? 0 :this.searchType.hashCode()));
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this.part == null)? 0 :this.part.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this._max == null)? 0 :this._max.hashCode()));
        result = ((result* 31)+((this.binding == null)? 0 :this.binding.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._documentation == null)? 0 :this._documentation.hashCode()));
        result = ((result* 31)+((this.referencedFrom == null)? 0 :this.referencedFrom.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.targetProfile == null)? 0 :this.targetProfile.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._min == null)? 0 :this._min.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperationDefinition_Parameter) == false) {
            return false;
        }
        OperationDefinition_Parameter rhs = ((OperationDefinition_Parameter) other);
        return ((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._use == rhs._use)||((this._use!= null)&&this._use.equals(rhs._use))))&&((this._searchType == rhs._searchType)||((this._searchType!= null)&&this._searchType.equals(rhs._searchType))))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.searchType == rhs.searchType)||((this.searchType!= null)&&this.searchType.equals(rhs.searchType))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this.part == rhs.part)||((this.part!= null)&&this.part.equals(rhs.part))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this._max == rhs._max)||((this._max!= null)&&this._max.equals(rhs._max))))&&((this.binding == rhs.binding)||((this.binding!= null)&&this.binding.equals(rhs.binding))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._documentation == rhs._documentation)||((this._documentation!= null)&&this._documentation.equals(rhs._documentation))))&&((this.referencedFrom == rhs.referencedFrom)||((this.referencedFrom!= null)&&this.referencedFrom.equals(rhs.referencedFrom))))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.targetProfile == rhs.targetProfile)||((this.targetProfile!= null)&&this.targetProfile.equals(rhs.targetProfile))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._min == rhs._min)||((this._min!= null)&&this._min.equals(rhs._min))));
    }


    /**
     * How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SearchType {

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
        private final static Map<String, OperationDefinition_Parameter.SearchType> CONSTANTS = new HashMap<String, OperationDefinition_Parameter.SearchType>();

        static {
            for (OperationDefinition_Parameter.SearchType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SearchType(String value) {
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
        public static OperationDefinition_Parameter.SearchType fromValue(String value) {
            OperationDefinition_Parameter.SearchType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Whether this is an input or an output parameter.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Use {

        IN("in"),
        OUT("out");
        private final String value;
        private final static Map<String, OperationDefinition_Parameter.Use> CONSTANTS = new HashMap<String, OperationDefinition_Parameter.Use>();

        static {
            for (OperationDefinition_Parameter.Use c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Use(String value) {
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
        public static OperationDefinition_Parameter.Use fromValue(String value) {
            OperationDefinition_Parameter.Use constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
