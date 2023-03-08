
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "rendering",
    "_rendering",
    "resource",
    "page",
    "image",
    "_image",
    "other",
    "_other"
})
@Generated("jsonschema2pojo")
public class ImplementationGuide_Manifest {

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
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("rendering")
    @JsonPropertyDescription("A URI that is a literal reference")
    private String rendering;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rendering")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _rendering;
    /**
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.")
    private List<ImplementationGuide_Resource1> resource = new ArrayList<ImplementationGuide_Resource1>();
    /**
     * Information about a page within the IG.
     * 
     */
    @JsonProperty("page")
    @JsonPropertyDescription("Information about a page within the IG.")
    private List<ImplementationGuide_Page1> page = new ArrayList<ImplementationGuide_Page1>();
    /**
     * Indicates a relative path to an image that exists within the IG.
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Indicates a relative path to an image that exists within the IG.")
    private List<String> image = new ArrayList<String>();
    /**
     * Extensions for image
     * 
     */
    @JsonProperty("_image")
    @JsonPropertyDescription("Extensions for image")
    private List<Element> _image = new ArrayList<Element>();
    /**
     * Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.
     * 
     */
    @JsonProperty("other")
    @JsonPropertyDescription("Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.")
    private List<String> other = new ArrayList<String>();
    /**
     * Extensions for other
     * 
     */
    @JsonProperty("_other")
    @JsonPropertyDescription("Extensions for other")
    private List<Element> _other = new ArrayList<Element>();

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
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("rendering")
    public String getRendering() {
        return rendering;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("rendering")
    public void setRendering(String rendering) {
        this.rendering = rendering;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rendering")
    public Element get_rendering() {
        return _rendering;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rendering")
    public void set_rendering(Element _rendering) {
        this._rendering = _rendering;
    }

    /**
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public List<ImplementationGuide_Resource1> getResource() {
        return resource;
    }

    /**
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public void setResource(List<ImplementationGuide_Resource1> resource) {
        this.resource = resource;
    }

    /**
     * Information about a page within the IG.
     * 
     */
    @JsonProperty("page")
    public List<ImplementationGuide_Page1> getPage() {
        return page;
    }

    /**
     * Information about a page within the IG.
     * 
     */
    @JsonProperty("page")
    public void setPage(List<ImplementationGuide_Page1> page) {
        this.page = page;
    }

    /**
     * Indicates a relative path to an image that exists within the IG.
     * 
     */
    @JsonProperty("image")
    public List<String> getImage() {
        return image;
    }

    /**
     * Indicates a relative path to an image that exists within the IG.
     * 
     */
    @JsonProperty("image")
    public void setImage(List<String> image) {
        this.image = image;
    }

    /**
     * Extensions for image
     * 
     */
    @JsonProperty("_image")
    public List<Element> get_image() {
        return _image;
    }

    /**
     * Extensions for image
     * 
     */
    @JsonProperty("_image")
    public void set_image(List<Element> _image) {
        this._image = _image;
    }

    /**
     * Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.
     * 
     */
    @JsonProperty("other")
    public List<String> getOther() {
        return other;
    }

    /**
     * Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.
     * 
     */
    @JsonProperty("other")
    public void setOther(List<String> other) {
        this.other = other;
    }

    /**
     * Extensions for other
     * 
     */
    @JsonProperty("_other")
    public List<Element> get_other() {
        return _other;
    }

    /**
     * Extensions for other
     * 
     */
    @JsonProperty("_other")
    public void set_other(List<Element> _other) {
        this._other = _other;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImplementationGuide_Manifest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("rendering");
        sb.append('=');
        sb.append(((this.rendering == null)?"<null>":this.rendering));
        sb.append(',');
        sb.append("_rendering");
        sb.append('=');
        sb.append(((this._rendering == null)?"<null>":this._rendering));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("page");
        sb.append('=');
        sb.append(((this.page == null)?"<null>":this.page));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("_image");
        sb.append('=');
        sb.append(((this._image == null)?"<null>":this._image));
        sb.append(',');
        sb.append("other");
        sb.append('=');
        sb.append(((this.other == null)?"<null>":this.other));
        sb.append(',');
        sb.append("_other");
        sb.append('=');
        sb.append(((this._other == null)?"<null>":this._other));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.other == null)? 0 :this.other.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.rendering == null)? 0 :this.rendering.hashCode()));
        result = ((result* 31)+((this._rendering == null)? 0 :this._rendering.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.page == null)? 0 :this.page.hashCode()));
        result = ((result* 31)+((this._image == null)? 0 :this._image.hashCode()));
        result = ((result* 31)+((this._other == null)? 0 :this._other.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImplementationGuide_Manifest) == false) {
            return false;
        }
        ImplementationGuide_Manifest rhs = ((ImplementationGuide_Manifest) other);
        return ((((((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.other == rhs.other)||((this.other!= null)&&this.other.equals(rhs.other))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.rendering == rhs.rendering)||((this.rendering!= null)&&this.rendering.equals(rhs.rendering))))&&((this._rendering == rhs._rendering)||((this._rendering!= null)&&this._rendering.equals(rhs._rendering))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.page == rhs.page)||((this.page!= null)&&this.page.equals(rhs.page))))&&((this._image == rhs._image)||((this._image!= null)&&this._image.equals(rhs._image))))&&((this._other == rhs._other)||((this._other!= null)&&this._other.equals(rhs._other))));
    }

}
