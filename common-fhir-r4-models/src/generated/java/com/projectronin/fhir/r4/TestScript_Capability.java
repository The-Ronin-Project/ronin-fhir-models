
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
    "required",
    "_required",
    "validated",
    "_validated",
    "description",
    "_description",
    "origin",
    "_origin",
    "destination",
    "_destination",
    "link",
    "_link",
    "capabilities"
})
@Generated("jsonschema2pojo")
public class TestScript_Capability {

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
    @JsonProperty("required")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean required;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_required")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _required;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("validated")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean validated;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validated")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _validated;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * Which origin server these requirements apply to.
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("Which origin server these requirements apply to.")
    private List<Double> origin = new ArrayList<Double>();
    /**
     * Extensions for origin
     * 
     */
    @JsonProperty("_origin")
    @JsonPropertyDescription("Extensions for origin")
    private List<Element> _origin = new ArrayList<Element>();
    /**
     * A whole number
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("A whole number")
    private Double destination;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_destination")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _destination;
    /**
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * 
     */
    @JsonProperty("link")
    @JsonPropertyDescription("Links to the FHIR specification that describes this interaction and the resources involved in more detail.")
    private List<String> link = new ArrayList<String>();
    /**
     * Extensions for link
     * 
     */
    @JsonProperty("_link")
    @JsonPropertyDescription("Extensions for link")
    private List<Element> _link = new ArrayList<Element>();
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("capabilities")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String capabilities;

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
    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_required")
    public Element get_required() {
        return _required;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_required")
    public void set_required(Element _required) {
        this._required = _required;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("validated")
    public Boolean getValidated() {
        return validated;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("validated")
    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validated")
    public Element get_validated() {
        return _validated;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validated")
    public void set_validated(Element _validated) {
        this._validated = _validated;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * Which origin server these requirements apply to.
     * 
     */
    @JsonProperty("origin")
    public List<Double> getOrigin() {
        return origin;
    }

    /**
     * Which origin server these requirements apply to.
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(List<Double> origin) {
        this.origin = origin;
    }

    /**
     * Extensions for origin
     * 
     */
    @JsonProperty("_origin")
    public List<Element> get_origin() {
        return _origin;
    }

    /**
     * Extensions for origin
     * 
     */
    @JsonProperty("_origin")
    public void set_origin(List<Element> _origin) {
        this._origin = _origin;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("destination")
    public Double getDestination() {
        return destination;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("destination")
    public void setDestination(Double destination) {
        this.destination = destination;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_destination")
    public Element get_destination() {
        return _destination;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_destination")
    public void set_destination(Element _destination) {
        this._destination = _destination;
    }

    /**
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * 
     */
    @JsonProperty("link")
    public List<String> getLink() {
        return link;
    }

    /**
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * 
     */
    @JsonProperty("link")
    public void setLink(List<String> link) {
        this.link = link;
    }

    /**
     * Extensions for link
     * 
     */
    @JsonProperty("_link")
    public List<Element> get_link() {
        return _link;
    }

    /**
     * Extensions for link
     * 
     */
    @JsonProperty("_link")
    public void set_link(List<Element> _link) {
        this._link = _link;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("capabilities")
    public String getCapabilities() {
        return capabilities;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * (Required)
     * 
     */
    @JsonProperty("capabilities")
    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScript_Capability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("_required");
        sb.append('=');
        sb.append(((this._required == null)?"<null>":this._required));
        sb.append(',');
        sb.append("validated");
        sb.append('=');
        sb.append(((this.validated == null)?"<null>":this.validated));
        sb.append(',');
        sb.append("_validated");
        sb.append('=');
        sb.append(((this._validated == null)?"<null>":this._validated));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("_origin");
        sb.append('=');
        sb.append(((this._origin == null)?"<null>":this._origin));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("_destination");
        sb.append('=');
        sb.append(((this._destination == null)?"<null>":this._destination));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("_link");
        sb.append('=');
        sb.append(((this._link == null)?"<null>":this._link));
        sb.append(',');
        sb.append("capabilities");
        sb.append('=');
        sb.append(((this.capabilities == null)?"<null>":this.capabilities));
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
        result = ((result* 31)+((this.capabilities == null)? 0 :this.capabilities.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this._required == null)? 0 :this._required.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        result = ((result* 31)+((this.validated == null)? 0 :this.validated.hashCode()));
        result = ((result* 31)+((this._validated == null)? 0 :this._validated.hashCode()));
        result = ((result* 31)+((this._origin == null)? 0 :this._origin.hashCode()));
        result = ((result* 31)+((this._link == null)? 0 :this._link.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._destination == null)? 0 :this._destination.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScript_Capability) == false) {
            return false;
        }
        TestScript_Capability rhs = ((TestScript_Capability) other);
        return (((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.capabilities == rhs.capabilities)||((this.capabilities!= null)&&this.capabilities.equals(rhs.capabilities))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this._required == rhs._required)||((this._required!= null)&&this._required.equals(rhs._required))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))))&&((this.validated == rhs.validated)||((this.validated!= null)&&this.validated.equals(rhs.validated))))&&((this._validated == rhs._validated)||((this._validated!= null)&&this._validated.equals(rhs._validated))))&&((this._origin == rhs._origin)||((this._origin!= null)&&this._origin.equals(rhs._origin))))&&((this._link == rhs._link)||((this._link!= null)&&this._link.equals(rhs._link))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._destination == rhs._destination)||((this._destination!= null)&&this._destination.equals(rhs._destination))));
    }

}
