
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "system",
    "_system",
    "abstract",
    "_abstract",
    "inactive",
    "_inactive",
    "version",
    "_version",
    "code",
    "_code",
    "display",
    "_display",
    "designation",
    "contains"
})
@Generated("jsonschema2pojo")
public class ValueSet_Contains {

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String system;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _system;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("abstract")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean _abstract;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abstract")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element __abstract;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inactive")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean inactive;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inactive")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _inactive;
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("display")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String display;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_display")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _display;
    /**
     * Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation.
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation.")
    private List<ValueSet_Designation> designation = new ArrayList<ValueSet_Designation>();
    /**
     * Other codes and entries contained under this entry in the hierarchy.
     * 
     */
    @JsonProperty("contains")
    @JsonPropertyDescription("Other codes and entries contained under this entry in the hierarchy.")
    private List<ValueSet_Contains> contains = new ArrayList<ValueSet_Contains>();

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    public Element get_system() {
        return _system;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    public void set_system(Element _system) {
        this._system = _system;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("abstract")
    public Boolean getAbstract() {
        return _abstract;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("abstract")
    public void setAbstract(Boolean _abstract) {
        this._abstract = _abstract;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abstract")
    public Element get_abstract() {
        return __abstract;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_abstract")
    public void set_abstract(Element __abstract) {
        this.__abstract = __abstract;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inactive")
    public Boolean getInactive() {
        return inactive;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inactive")
    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inactive")
    public Element get_inactive() {
        return _inactive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inactive")
    public void set_inactive(Element _inactive) {
        this._inactive = _inactive;
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public Element get_code() {
        return _code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public void set_code(Element _code) {
        this._code = _code;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_display")
    public Element get_display() {
        return _display;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_display")
    public void set_display(Element _display) {
        this._display = _display;
    }

    /**
     * Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation.
     * 
     */
    @JsonProperty("designation")
    public List<ValueSet_Designation> getDesignation() {
        return designation;
    }

    /**
     * Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation.
     * 
     */
    @JsonProperty("designation")
    public void setDesignation(List<ValueSet_Designation> designation) {
        this.designation = designation;
    }

    /**
     * Other codes and entries contained under this entry in the hierarchy.
     * 
     */
    @JsonProperty("contains")
    public List<ValueSet_Contains> getContains() {
        return contains;
    }

    /**
     * Other codes and entries contained under this entry in the hierarchy.
     * 
     */
    @JsonProperty("contains")
    public void setContains(List<ValueSet_Contains> contains) {
        this.contains = contains;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValueSet_Contains.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("_system");
        sb.append('=');
        sb.append(((this._system == null)?"<null>":this._system));
        sb.append(',');
        sb.append("_abstract");
        sb.append('=');
        sb.append(((this._abstract == null)?"<null>":this._abstract));
        sb.append(',');
        sb.append("__abstract");
        sb.append('=');
        sb.append(((this.__abstract == null)?"<null>":this.__abstract));
        sb.append(',');
        sb.append("inactive");
        sb.append('=');
        sb.append(((this.inactive == null)?"<null>":this.inactive));
        sb.append(',');
        sb.append("_inactive");
        sb.append('=');
        sb.append(((this._inactive == null)?"<null>":this._inactive));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("_version");
        sb.append('=');
        sb.append(((this._version == null)?"<null>":this._version));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("display");
        sb.append('=');
        sb.append(((this.display == null)?"<null>":this.display));
        sb.append(',');
        sb.append("_display");
        sb.append('=');
        sb.append(((this._display == null)?"<null>":this._display));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("contains");
        sb.append('=');
        sb.append(((this.contains == null)?"<null>":this.contains));
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
        result = ((result* 31)+((this._system == null)? 0 :this._system.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.display == null)? 0 :this.display.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this._abstract == null)? 0 :this._abstract.hashCode()));
        result = ((result* 31)+((this.__abstract == null)? 0 :this.__abstract.hashCode()));
        result = ((result* 31)+((this.contains == null)? 0 :this.contains.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.inactive == null)? 0 :this.inactive.hashCode()));
        result = ((result* 31)+((this._inactive == null)? 0 :this._inactive.hashCode()));
        result = ((result* 31)+((this._display == null)? 0 :this._display.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        result = ((result* 31)+((this._version == null)? 0 :this._version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueSet_Contains) == false) {
            return false;
        }
        ValueSet_Contains rhs = ((ValueSet_Contains) other);
        return ((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._system == rhs._system)||((this._system!= null)&&this._system.equals(rhs._system))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.display == rhs.display)||((this.display!= null)&&this.display.equals(rhs.display))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this._abstract == rhs._abstract)||((this._abstract!= null)&&this._abstract.equals(rhs._abstract))))&&((this.__abstract == rhs.__abstract)||((this.__abstract!= null)&&this.__abstract.equals(rhs.__abstract))))&&((this.contains == rhs.contains)||((this.contains!= null)&&this.contains.equals(rhs.contains))))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.inactive == rhs.inactive)||((this.inactive!= null)&&this.inactive.equals(rhs.inactive))))&&((this._inactive == rhs._inactive)||((this._inactive!= null)&&this._inactive.equals(rhs._inactive))))&&((this._display == rhs._display)||((this._display!= null)&&this._display.equals(rhs._display))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this._version == rhs._version)||((this._version!= null)&&this._version.equals(rhs._version))));
    }

}
