
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
    "url",
    "mode",
    "_mode",
    "alias",
    "_alias",
    "documentation",
    "_documentation"
})
@Generated("jsonschema2pojo")
public class StructureMap_Structure {

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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String url;
    /**
     * How the referenced structure is used in this mapping.
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("How the referenced structure is used in this mapping.")
    private StructureMap_Structure.Mode mode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _mode;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String alias;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_alias")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _alias;
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * How the referenced structure is used in this mapping.
     * 
     */
    @JsonProperty("mode")
    public StructureMap_Structure.Mode getMode() {
        return mode;
    }

    /**
     * How the referenced structure is used in this mapping.
     * 
     */
    @JsonProperty("mode")
    public void setMode(StructureMap_Structure.Mode mode) {
        this.mode = mode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    public Element get_mode() {
        return _mode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    public void set_mode(Element _mode) {
        this._mode = _mode;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_alias")
    public Element get_alias() {
        return _alias;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_alias")
    public void set_alias(Element _alias) {
        this._alias = _alias;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StructureMap_Structure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("_mode");
        sb.append('=');
        sb.append(((this._mode == null)?"<null>":this._mode));
        sb.append(',');
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("_alias");
        sb.append('=');
        sb.append(((this._alias == null)?"<null>":this._alias));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("_documentation");
        sb.append('=');
        sb.append(((this._documentation == null)?"<null>":this._documentation));
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
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this._documentation == null)? 0 :this._documentation.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._alias == null)? 0 :this._alias.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._mode == null)? 0 :this._mode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StructureMap_Structure) == false) {
            return false;
        }
        StructureMap_Structure rhs = ((StructureMap_Structure) other);
        return (((((((((((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode)))&&((this._documentation == rhs._documentation)||((this._documentation!= null)&&this._documentation.equals(rhs._documentation))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._alias == rhs._alias)||((this._alias!= null)&&this._alias.equals(rhs._alias))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._mode == rhs._mode)||((this._mode!= null)&&this._mode.equals(rhs._mode))));
    }


    /**
     * How the referenced structure is used in this mapping.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Mode {

        SOURCE("source"),
        QUERIED("queried"),
        TARGET("target"),
        PRODUCED("produced");
        private final String value;
        private final static Map<String, StructureMap_Structure.Mode> CONSTANTS = new HashMap<String, StructureMap_Structure.Mode>();

        static {
            for (StructureMap_Structure.Mode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Mode(String value) {
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
        public static StructureMap_Structure.Mode fromValue(String value) {
            StructureMap_Structure.Mode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
