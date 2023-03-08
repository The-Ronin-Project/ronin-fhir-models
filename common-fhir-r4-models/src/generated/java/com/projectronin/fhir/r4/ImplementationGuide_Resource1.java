
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
    "reference",
    "exampleBoolean",
    "_exampleBoolean",
    "exampleCanonical",
    "_exampleCanonical",
    "relativePath",
    "_relativePath"
})
@Generated("jsonschema2pojo")
public class ImplementationGuide_Resource1 {

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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference reference;
    /**
     * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.
     * 
     */
    @JsonProperty("exampleBoolean")
    @JsonPropertyDescription("If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.")
    private Boolean exampleBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exampleBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _exampleBoolean;
    /**
     * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.
     * 
     */
    @JsonProperty("exampleCanonical")
    @JsonPropertyDescription("If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.")
    private String exampleCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exampleCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _exampleCanonical;
    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("relativePath")
    @JsonPropertyDescription("A URI that is a literal reference")
    private String relativePath;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relativePath")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _relativePath;

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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("reference")
    public Reference getReference() {
        return reference;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("reference")
    public void setReference(Reference reference) {
        this.reference = reference;
    }

    /**
     * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.
     * 
     */
    @JsonProperty("exampleBoolean")
    public Boolean getExampleBoolean() {
        return exampleBoolean;
    }

    /**
     * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.
     * 
     */
    @JsonProperty("exampleBoolean")
    public void setExampleBoolean(Boolean exampleBoolean) {
        this.exampleBoolean = exampleBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exampleBoolean")
    public Element get_exampleBoolean() {
        return _exampleBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exampleBoolean")
    public void set_exampleBoolean(Element _exampleBoolean) {
        this._exampleBoolean = _exampleBoolean;
    }

    /**
     * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.
     * 
     */
    @JsonProperty("exampleCanonical")
    public String getExampleCanonical() {
        return exampleCanonical;
    }

    /**
     * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.
     * 
     */
    @JsonProperty("exampleCanonical")
    public void setExampleCanonical(String exampleCanonical) {
        this.exampleCanonical = exampleCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exampleCanonical")
    public Element get_exampleCanonical() {
        return _exampleCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exampleCanonical")
    public void set_exampleCanonical(Element _exampleCanonical) {
        this._exampleCanonical = _exampleCanonical;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("relativePath")
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("relativePath")
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relativePath")
    public Element get_relativePath() {
        return _relativePath;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relativePath")
    public void set_relativePath(Element _relativePath) {
        this._relativePath = _relativePath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImplementationGuide_Resource1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("exampleBoolean");
        sb.append('=');
        sb.append(((this.exampleBoolean == null)?"<null>":this.exampleBoolean));
        sb.append(',');
        sb.append("_exampleBoolean");
        sb.append('=');
        sb.append(((this._exampleBoolean == null)?"<null>":this._exampleBoolean));
        sb.append(',');
        sb.append("exampleCanonical");
        sb.append('=');
        sb.append(((this.exampleCanonical == null)?"<null>":this.exampleCanonical));
        sb.append(',');
        sb.append("_exampleCanonical");
        sb.append('=');
        sb.append(((this._exampleCanonical == null)?"<null>":this._exampleCanonical));
        sb.append(',');
        sb.append("relativePath");
        sb.append('=');
        sb.append(((this.relativePath == null)?"<null>":this.relativePath));
        sb.append(',');
        sb.append("_relativePath");
        sb.append('=');
        sb.append(((this._relativePath == null)?"<null>":this._relativePath));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.exampleCanonical == null)? 0 :this.exampleCanonical.hashCode()));
        result = ((result* 31)+((this.relativePath == null)? 0 :this.relativePath.hashCode()));
        result = ((result* 31)+((this._relativePath == null)? 0 :this._relativePath.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.exampleBoolean == null)? 0 :this.exampleBoolean.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._exampleCanonical == null)? 0 :this._exampleCanonical.hashCode()));
        result = ((result* 31)+((this._exampleBoolean == null)? 0 :this._exampleBoolean.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImplementationGuide_Resource1) == false) {
            return false;
        }
        ImplementationGuide_Resource1 rhs = ((ImplementationGuide_Resource1) other);
        return (((((((((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.exampleCanonical == rhs.exampleCanonical)||((this.exampleCanonical!= null)&&this.exampleCanonical.equals(rhs.exampleCanonical))))&&((this.relativePath == rhs.relativePath)||((this.relativePath!= null)&&this.relativePath.equals(rhs.relativePath))))&&((this._relativePath == rhs._relativePath)||((this._relativePath!= null)&&this._relativePath.equals(rhs._relativePath))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.exampleBoolean == rhs.exampleBoolean)||((this.exampleBoolean!= null)&&this.exampleBoolean.equals(rhs.exampleBoolean))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._exampleCanonical == rhs._exampleCanonical)||((this._exampleCanonical!= null)&&this._exampleCanonical.equals(rhs._exampleCanonical))))&&((this._exampleBoolean == rhs._exampleBoolean)||((this._exampleBoolean!= null)&&this._exampleBoolean.equals(rhs._exampleBoolean))));
    }

}
