
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "title",
    "_title",
    "code",
    "author",
    "focus",
    "text",
    "mode",
    "_mode",
    "orderedBy",
    "entry",
    "emptyReason",
    "section"
})
@Generated("jsonschema2pojo")
public class Composition_Section {

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
    @JsonProperty("title")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String title;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _title;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * Identifies who is responsible for the information in this section, not necessarily who typed it in.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("Identifies who is responsible for the information in this section, not necessarily who typed it in.")
    private List<Reference> author = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("focus")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference focus;
    /**
     * A human-readable summary of the resource conveying the essential clinical and business information for the resource.
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("A human-readable summary of the resource conveying the essential clinical and business information for the resource.")
    private Narrative text;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String mode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _mode;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("orderedBy")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept orderedBy;
    /**
     * A reference to the actual resource from which the narrative in the section is derived.
     * 
     */
    @JsonProperty("entry")
    @JsonPropertyDescription("A reference to the actual resource from which the narrative in the section is derived.")
    private List<Reference> entry = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("emptyReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept emptyReason;
    /**
     * A nested sub-section within this section.
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("A nested sub-section within this section.")
    private List<Composition_Section> section = new ArrayList<Composition_Section>();

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
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public Element get_title() {
        return _title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public void set_title(Element _title) {
        this._title = _title;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    /**
     * Identifies who is responsible for the information in this section, not necessarily who typed it in.
     * 
     */
    @JsonProperty("author")
    public List<Reference> getAuthor() {
        return author;
    }

    /**
     * Identifies who is responsible for the information in this section, not necessarily who typed it in.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(List<Reference> author) {
        this.author = author;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("focus")
    public Reference getFocus() {
        return focus;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("focus")
    public void setFocus(Reference focus) {
        this.focus = focus;
    }

    /**
     * A human-readable summary of the resource conveying the essential clinical and business information for the resource.
     * 
     */
    @JsonProperty("text")
    public Narrative getText() {
        return text;
    }

    /**
     * A human-readable summary of the resource conveying the essential clinical and business information for the resource.
     * 
     */
    @JsonProperty("text")
    public void setText(Narrative text) {
        this.text = text;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("mode")
    public void setMode(String mode) {
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("orderedBy")
    public CodeableConcept getOrderedBy() {
        return orderedBy;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("orderedBy")
    public void setOrderedBy(CodeableConcept orderedBy) {
        this.orderedBy = orderedBy;
    }

    /**
     * A reference to the actual resource from which the narrative in the section is derived.
     * 
     */
    @JsonProperty("entry")
    public List<Reference> getEntry() {
        return entry;
    }

    /**
     * A reference to the actual resource from which the narrative in the section is derived.
     * 
     */
    @JsonProperty("entry")
    public void setEntry(List<Reference> entry) {
        this.entry = entry;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("emptyReason")
    public CodeableConcept getEmptyReason() {
        return emptyReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("emptyReason")
    public void setEmptyReason(CodeableConcept emptyReason) {
        this.emptyReason = emptyReason;
    }

    /**
     * A nested sub-section within this section.
     * 
     */
    @JsonProperty("section")
    public List<Composition_Section> getSection() {
        return section;
    }

    /**
     * A nested sub-section within this section.
     * 
     */
    @JsonProperty("section")
    public void setSection(List<Composition_Section> section) {
        this.section = section;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Composition_Section.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("_title");
        sb.append('=');
        sb.append(((this._title == null)?"<null>":this._title));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("focus");
        sb.append('=');
        sb.append(((this.focus == null)?"<null>":this.focus));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("_mode");
        sb.append('=');
        sb.append(((this._mode == null)?"<null>":this._mode));
        sb.append(',');
        sb.append("orderedBy");
        sb.append('=');
        sb.append(((this.orderedBy == null)?"<null>":this.orderedBy));
        sb.append(',');
        sb.append("entry");
        sb.append('=');
        sb.append(((this.entry == null)?"<null>":this.entry));
        sb.append(',');
        sb.append("emptyReason");
        sb.append('=');
        sb.append(((this.emptyReason == null)?"<null>":this.emptyReason));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
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
        result = ((result* 31)+((this.emptyReason == null)? 0 :this.emptyReason.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.focus == null)? 0 :this.focus.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._mode == null)? 0 :this._mode.hashCode()));
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this.entry == null)? 0 :this.entry.hashCode()));
        result = ((result* 31)+((this.orderedBy == null)? 0 :this.orderedBy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Composition_Section) == false) {
            return false;
        }
        Composition_Section rhs = ((Composition_Section) other);
        return ((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.emptyReason == rhs.emptyReason)||((this.emptyReason!= null)&&this.emptyReason.equals(rhs.emptyReason))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.focus == rhs.focus)||((this.focus!= null)&&this.focus.equals(rhs.focus))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._mode == rhs._mode)||((this._mode!= null)&&this._mode.equals(rhs._mode))))&&((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode))))&&((this.entry == rhs.entry)||((this.entry!= null)&&this.entry.equals(rhs.entry))))&&((this.orderedBy == rhs.orderedBy)||((this.orderedBy!= null)&&this.orderedBy.equals(rhs.orderedBy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))));
    }

}
