
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "_code",
    "display",
    "_display",
    "definition",
    "_definition",
    "designation",
    "property",
    "concept"
})
@Generated("jsonschema2pojo")
public class CodeSystem_Concept {

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("definition")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String definition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _definition;
    /**
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.")
    private List<CodeSystem_Designation> designation = new ArrayList<CodeSystem_Designation>();
    /**
     * A property value for this concept.
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("A property value for this concept.")
    private List<CodeSystem_Property1> property = new ArrayList<CodeSystem_Property1>();
    /**
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.
     * 
     */
    @JsonProperty("concept")
    @JsonPropertyDescription("Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.")
    private List<CodeSystem_Concept> concept = new ArrayList<CodeSystem_Concept>();

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definition")
    public Element get_definition() {
        return _definition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definition")
    public void set_definition(Element _definition) {
        this._definition = _definition;
    }

    /**
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * 
     */
    @JsonProperty("designation")
    public List<CodeSystem_Designation> getDesignation() {
        return designation;
    }

    /**
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * 
     */
    @JsonProperty("designation")
    public void setDesignation(List<CodeSystem_Designation> designation) {
        this.designation = designation;
    }

    /**
     * A property value for this concept.
     * 
     */
    @JsonProperty("property")
    public List<CodeSystem_Property1> getProperty() {
        return property;
    }

    /**
     * A property value for this concept.
     * 
     */
    @JsonProperty("property")
    public void setProperty(List<CodeSystem_Property1> property) {
        this.property = property;
    }

    /**
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.
     * 
     */
    @JsonProperty("concept")
    public List<CodeSystem_Concept> getConcept() {
        return concept;
    }

    /**
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.
     * 
     */
    @JsonProperty("concept")
    public void setConcept(List<CodeSystem_Concept> concept) {
        this.concept = concept;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CodeSystem_Concept.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("display");
        sb.append('=');
        sb.append(((this.display == null)?"<null>":this.display));
        sb.append(',');
        sb.append("_display");
        sb.append('=');
        sb.append(((this._display == null)?"<null>":this._display));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("_definition");
        sb.append('=');
        sb.append(((this._definition == null)?"<null>":this._definition));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("property");
        sb.append('=');
        sb.append(((this.property == null)?"<null>":this.property));
        sb.append(',');
        sb.append("concept");
        sb.append('=');
        sb.append(((this.concept == null)?"<null>":this.concept));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this._definition == null)? 0 :this._definition.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.display == null)? 0 :this.display.hashCode()));
        result = ((result* 31)+((this._display == null)? 0 :this._display.hashCode()));
        result = ((result* 31)+((this.concept == null)? 0 :this.concept.hashCode()));
        result = ((result* 31)+((this.property == null)? 0 :this.property.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeSystem_Concept) == false) {
            return false;
        }
        CodeSystem_Concept rhs = ((CodeSystem_Concept) other);
        return (((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this._definition == rhs._definition)||((this._definition!= null)&&this._definition.equals(rhs._definition))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.display == rhs.display)||((this.display!= null)&&this.display.equals(rhs.display))))&&((this._display == rhs._display)||((this._display!= null)&&this._display.equals(rhs._display))))&&((this.concept == rhs.concept)||((this.concept!= null)&&this.concept.equals(rhs.concept))))&&((this.property == rhs.property)||((this.property!= null)&&this.property.equals(rhs.property))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))));
    }

}
