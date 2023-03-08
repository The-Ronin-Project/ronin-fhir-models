
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
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "nameUrl",
    "_nameUrl",
    "nameReference",
    "title",
    "_title",
    "generation",
    "_generation",
    "page"
})
@Generated("jsonschema2pojo")
public class ImplementationGuide_Page {

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
     * The source address for the page.
     * 
     */
    @JsonProperty("nameUrl")
    @JsonPropertyDescription("The source address for the page.")
    private String nameUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nameUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _nameUrl;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("nameReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference nameReference;
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
     * A code that indicates how the page is generated.
     * 
     */
    @JsonProperty("generation")
    @JsonPropertyDescription("A code that indicates how the page is generated.")
    private ImplementationGuide_Page.Generation generation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_generation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _generation;
    /**
     * Nested Pages/Sections under this page.
     * 
     */
    @JsonProperty("page")
    @JsonPropertyDescription("Nested Pages/Sections under this page.")
    private List<ImplementationGuide_Page> page = new ArrayList<ImplementationGuide_Page>();

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
     * The source address for the page.
     * 
     */
    @JsonProperty("nameUrl")
    public String getNameUrl() {
        return nameUrl;
    }

    /**
     * The source address for the page.
     * 
     */
    @JsonProperty("nameUrl")
    public void setNameUrl(String nameUrl) {
        this.nameUrl = nameUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nameUrl")
    public Element get_nameUrl() {
        return _nameUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_nameUrl")
    public void set_nameUrl(Element _nameUrl) {
        this._nameUrl = _nameUrl;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("nameReference")
    public Reference getNameReference() {
        return nameReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("nameReference")
    public void setNameReference(Reference nameReference) {
        this.nameReference = nameReference;
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
     * A code that indicates how the page is generated.
     * 
     */
    @JsonProperty("generation")
    public ImplementationGuide_Page.Generation getGeneration() {
        return generation;
    }

    /**
     * A code that indicates how the page is generated.
     * 
     */
    @JsonProperty("generation")
    public void setGeneration(ImplementationGuide_Page.Generation generation) {
        this.generation = generation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_generation")
    public Element get_generation() {
        return _generation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_generation")
    public void set_generation(Element _generation) {
        this._generation = _generation;
    }

    /**
     * Nested Pages/Sections under this page.
     * 
     */
    @JsonProperty("page")
    public List<ImplementationGuide_Page> getPage() {
        return page;
    }

    /**
     * Nested Pages/Sections under this page.
     * 
     */
    @JsonProperty("page")
    public void setPage(List<ImplementationGuide_Page> page) {
        this.page = page;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImplementationGuide_Page.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("nameUrl");
        sb.append('=');
        sb.append(((this.nameUrl == null)?"<null>":this.nameUrl));
        sb.append(',');
        sb.append("_nameUrl");
        sb.append('=');
        sb.append(((this._nameUrl == null)?"<null>":this._nameUrl));
        sb.append(',');
        sb.append("nameReference");
        sb.append('=');
        sb.append(((this.nameReference == null)?"<null>":this.nameReference));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("_title");
        sb.append('=');
        sb.append(((this._title == null)?"<null>":this._title));
        sb.append(',');
        sb.append("generation");
        sb.append('=');
        sb.append(((this.generation == null)?"<null>":this.generation));
        sb.append(',');
        sb.append("_generation");
        sb.append('=');
        sb.append(((this._generation == null)?"<null>":this._generation));
        sb.append(',');
        sb.append("page");
        sb.append('=');
        sb.append(((this.page == null)?"<null>":this.page));
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
        result = ((result* 31)+((this.generation == null)? 0 :this.generation.hashCode()));
        result = ((result* 31)+((this._generation == null)? 0 :this._generation.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.nameReference == null)? 0 :this.nameReference.hashCode()));
        result = ((result* 31)+((this.nameUrl == null)? 0 :this.nameUrl.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._nameUrl == null)? 0 :this._nameUrl.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.page == null)? 0 :this.page.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImplementationGuide_Page) == false) {
            return false;
        }
        ImplementationGuide_Page rhs = ((ImplementationGuide_Page) other);
        return ((((((((((((this.generation == rhs.generation)||((this.generation!= null)&&this.generation.equals(rhs.generation)))&&((this._generation == rhs._generation)||((this._generation!= null)&&this._generation.equals(rhs._generation))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.nameReference == rhs.nameReference)||((this.nameReference!= null)&&this.nameReference.equals(rhs.nameReference))))&&((this.nameUrl == rhs.nameUrl)||((this.nameUrl!= null)&&this.nameUrl.equals(rhs.nameUrl))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._nameUrl == rhs._nameUrl)||((this._nameUrl!= null)&&this._nameUrl.equals(rhs._nameUrl))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.page == rhs.page)||((this.page!= null)&&this.page.equals(rhs.page))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }


    /**
     * A code that indicates how the page is generated.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Generation {

        HTML("html"),
        MARKDOWN("markdown"),
        XML("xml"),
        GENERATED("generated");
        private final String value;
        private final static Map<String, ImplementationGuide_Page.Generation> CONSTANTS = new HashMap<String, ImplementationGuide_Page.Generation>();

        static {
            for (ImplementationGuide_Page.Generation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Generation(String value) {
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
        public static ImplementationGuide_Page.Generation fromValue(String value) {
            ImplementationGuide_Page.Generation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
