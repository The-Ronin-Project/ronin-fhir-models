
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "property",
    "_property",
    "system",
    "value",
    "_value",
    "display",
    "_display"
})
@Generated("jsonschema2pojo")
public class ConceptMap_DependsOn {

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
    @JsonProperty("property")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String property;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_property")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _property;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String system;
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
    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("property")
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_property")
    public Element get_property() {
        return _property;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_property")
    public void set_property(Element _property) {
        this._property = _property;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConceptMap_DependsOn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("_property");
        sb.append('=');
        sb.append(((this._property == null)?"<null>":this._property));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("_value");
        sb.append('=');
        sb.append(((this._value == null)?"<null>":this._value));
        sb.append(',');
        sb.append("display");
        sb.append('=');
        sb.append(((this.display == null)?"<null>":this.display));
        sb.append(',');
        sb.append("_display");
        sb.append('=');
        sb.append(((this._display == null)?"<null>":this._display));
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
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._property == null)? 0 :this._property.hashCode()));
        result = ((result* 31)+((this.display == null)? 0 :this.display.hashCode()));
        result = ((result* 31)+((this._display == null)? 0 :this._display.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this._value == null)? 0 :this._value.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConceptMap_DependsOn) == false) {
            return false;
        }
        ConceptMap_DependsOn rhs = ((ConceptMap_DependsOn) other);
        return (((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._property == rhs._property)||((this._property!= null)&&this._property.equals(rhs._property))))&&((this.display == rhs.display)||((this.display!= null)&&this.display.equals(rhs.display))))&&((this._display == rhs._display)||((this._display!= null)&&this._display.equals(rhs._display))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this._value == rhs._value)||((this._value!= null)&&this._value.equals(rhs._value))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
