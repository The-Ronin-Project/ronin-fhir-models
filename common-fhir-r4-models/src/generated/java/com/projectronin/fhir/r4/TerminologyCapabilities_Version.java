
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "_code",
    "isDefault",
    "_isDefault",
    "compositional",
    "_compositional",
    "language",
    "_language",
    "filter",
    "property",
    "_property"
})
@Generated("jsonschema2pojo")
public class TerminologyCapabilities_Version {

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
    @JsonProperty("code")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDefault")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean isDefault;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDefault")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isDefault;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("compositional")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean compositional;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compositional")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _compositional;
    /**
     * Language Displays supported.
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("Language Displays supported.")
    private List<String> language = new ArrayList<String>();
    /**
     * Extensions for language
     * 
     */
    @JsonProperty("_language")
    @JsonPropertyDescription("Extensions for language")
    private List<Element> _language = new ArrayList<Element>();
    /**
     * Filter Properties supported.
     * 
     */
    @JsonProperty("filter")
    @JsonPropertyDescription("Filter Properties supported.")
    private List<TerminologyCapabilities_Filter> filter = new ArrayList<TerminologyCapabilities_Filter>();
    /**
     * Properties supported for $lookup.
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("Properties supported for $lookup.")
    private List<String> property = new ArrayList<String>();
    /**
     * Extensions for property
     * 
     */
    @JsonProperty("_property")
    @JsonPropertyDescription("Extensions for property")
    private List<Element> _property = new ArrayList<Element>();

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
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * A sequence of Unicode characters
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDefault")
    public Element get_isDefault() {
        return _isDefault;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isDefault")
    public void set_isDefault(Element _isDefault) {
        this._isDefault = _isDefault;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("compositional")
    public Boolean getCompositional() {
        return compositional;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("compositional")
    public void setCompositional(Boolean compositional) {
        this.compositional = compositional;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compositional")
    public Element get_compositional() {
        return _compositional;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_compositional")
    public void set_compositional(Element _compositional) {
        this._compositional = _compositional;
    }

    /**
     * Language Displays supported.
     * 
     */
    @JsonProperty("language")
    public List<String> getLanguage() {
        return language;
    }

    /**
     * Language Displays supported.
     * 
     */
    @JsonProperty("language")
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    /**
     * Extensions for language
     * 
     */
    @JsonProperty("_language")
    public List<Element> get_language() {
        return _language;
    }

    /**
     * Extensions for language
     * 
     */
    @JsonProperty("_language")
    public void set_language(List<Element> _language) {
        this._language = _language;
    }

    /**
     * Filter Properties supported.
     * 
     */
    @JsonProperty("filter")
    public List<TerminologyCapabilities_Filter> getFilter() {
        return filter;
    }

    /**
     * Filter Properties supported.
     * 
     */
    @JsonProperty("filter")
    public void setFilter(List<TerminologyCapabilities_Filter> filter) {
        this.filter = filter;
    }

    /**
     * Properties supported for $lookup.
     * 
     */
    @JsonProperty("property")
    public List<String> getProperty() {
        return property;
    }

    /**
     * Properties supported for $lookup.
     * 
     */
    @JsonProperty("property")
    public void setProperty(List<String> property) {
        this.property = property;
    }

    /**
     * Extensions for property
     * 
     */
    @JsonProperty("_property")
    public List<Element> get_property() {
        return _property;
    }

    /**
     * Extensions for property
     * 
     */
    @JsonProperty("_property")
    public void set_property(List<Element> _property) {
        this._property = _property;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TerminologyCapabilities_Version.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("isDefault");
        sb.append('=');
        sb.append(((this.isDefault == null)?"<null>":this.isDefault));
        sb.append(',');
        sb.append("_isDefault");
        sb.append('=');
        sb.append(((this._isDefault == null)?"<null>":this._isDefault));
        sb.append(',');
        sb.append("compositional");
        sb.append('=');
        sb.append(((this.compositional == null)?"<null>":this.compositional));
        sb.append(',');
        sb.append("_compositional");
        sb.append('=');
        sb.append(((this._compositional == null)?"<null>":this._compositional));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("_language");
        sb.append('=');
        sb.append(((this._language == null)?"<null>":this._language));
        sb.append(',');
        sb.append("filter");
        sb.append('=');
        sb.append(((this.filter == null)?"<null>":this.filter));
        sb.append(',');
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("_property");
        sb.append('=');
        sb.append(((this._property == null)?"<null>":this._property));
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
        result = ((result* 31)+((this._language == null)? 0 :this._language.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._compositional == null)? 0 :this._compositional.hashCode()));
        result = ((result* 31)+((this._property == null)? 0 :this._property.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.filter == null)? 0 :this.filter.hashCode()));
        result = ((result* 31)+((this.isDefault == null)? 0 :this.isDefault.hashCode()));
        result = ((result* 31)+((this.compositional == null)? 0 :this.compositional.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._isDefault == null)? 0 :this._isDefault.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TerminologyCapabilities_Version) == false) {
            return false;
        }
        TerminologyCapabilities_Version rhs = ((TerminologyCapabilities_Version) other);
        return (((((((((((((((this._language == rhs._language)||((this._language!= null)&&this._language.equals(rhs._language)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._compositional == rhs._compositional)||((this._compositional!= null)&&this._compositional.equals(rhs._compositional))))&&((this._property == rhs._property)||((this._property!= null)&&this._property.equals(rhs._property))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.filter == rhs.filter)||((this.filter!= null)&&this.filter.equals(rhs.filter))))&&((this.isDefault == rhs.isDefault)||((this.isDefault!= null)&&this.isDefault.equals(rhs.isDefault))))&&((this.compositional == rhs.compositional)||((this.compositional!= null)&&this.compositional.equals(rhs.compositional))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._isDefault == rhs._isDefault)||((this._isDefault!= null)&&this._isDefault.equals(rhs._isDefault))));
    }

}
