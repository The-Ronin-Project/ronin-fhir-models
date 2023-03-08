
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "autocreate",
    "_autocreate",
    "autodelete",
    "_autodelete",
    "resource"
})
@Generated("jsonschema2pojo")
public class TestScript_Fixture {

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("autocreate")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean autocreate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_autocreate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _autocreate;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("autodelete")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean autodelete;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_autodelete")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _autodelete;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference resource;

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("autocreate")
    public Boolean getAutocreate() {
        return autocreate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("autocreate")
    public void setAutocreate(Boolean autocreate) {
        this.autocreate = autocreate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_autocreate")
    public Element get_autocreate() {
        return _autocreate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_autocreate")
    public void set_autocreate(Element _autocreate) {
        this._autocreate = _autocreate;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("autodelete")
    public Boolean getAutodelete() {
        return autodelete;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("autodelete")
    public void setAutodelete(Boolean autodelete) {
        this.autodelete = autodelete;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_autodelete")
    public Element get_autodelete() {
        return _autodelete;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_autodelete")
    public void set_autodelete(Element _autodelete) {
        this._autodelete = _autodelete;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("resource")
    public Reference getResource() {
        return resource;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("resource")
    public void setResource(Reference resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScript_Fixture.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("autocreate");
        sb.append('=');
        sb.append(((this.autocreate == null)?"<null>":this.autocreate));
        sb.append(',');
        sb.append("_autocreate");
        sb.append('=');
        sb.append(((this._autocreate == null)?"<null>":this._autocreate));
        sb.append(',');
        sb.append("autodelete");
        sb.append('=');
        sb.append(((this.autodelete == null)?"<null>":this.autodelete));
        sb.append(',');
        sb.append("_autodelete");
        sb.append('=');
        sb.append(((this._autodelete == null)?"<null>":this._autodelete));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
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
        result = ((result* 31)+((this._autocreate == null)? 0 :this._autocreate.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._autodelete == null)? 0 :this._autodelete.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.autocreate == null)? 0 :this.autocreate.hashCode()));
        result = ((result* 31)+((this.autodelete == null)? 0 :this.autodelete.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScript_Fixture) == false) {
            return false;
        }
        TestScript_Fixture rhs = ((TestScript_Fixture) other);
        return (((((((((this._autocreate == rhs._autocreate)||((this._autocreate!= null)&&this._autocreate.equals(rhs._autocreate)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._autodelete == rhs._autodelete)||((this._autodelete!= null)&&this._autodelete.equals(rhs._autodelete))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.autocreate == rhs.autocreate)||((this.autocreate!= null)&&this.autocreate.equals(rhs.autocreate))))&&((this.autodelete == rhs.autodelete)||((this.autodelete!= null)&&this.autodelete.equals(rhs.autodelete))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
