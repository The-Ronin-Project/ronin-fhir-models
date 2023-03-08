
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
    "fhirVersion",
    "_fhirVersion",
    "name",
    "_name",
    "description",
    "_description",
    "exampleBoolean",
    "_exampleBoolean",
    "exampleCanonical",
    "_exampleCanonical",
    "groupingId",
    "_groupingId"
})
@Generated("jsonschema2pojo")
public class ImplementationGuide_Resource {

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
     * Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.
     * 
     */
    @JsonProperty("fhirVersion")
    @JsonPropertyDescription("Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.")
    private List<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion> fhirVersion = new ArrayList<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion>();
    /**
     * Extensions for fhirVersion
     * 
     */
    @JsonProperty("_fhirVersion")
    @JsonPropertyDescription("Extensions for fhirVersion")
    private List<Element> _fhirVersion = new ArrayList<Element>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("groupingId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String groupingId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupingId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _groupingId;

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
     * Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.
     * 
     */
    @JsonProperty("fhirVersion")
    public List<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion> getFhirVersion() {
        return fhirVersion;
    }

    /**
     * Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.
     * 
     */
    @JsonProperty("fhirVersion")
    public void setFhirVersion(List<com.projectronin.fhir.r4.StructureDefinition.FHIRVersion> fhirVersion) {
        this.fhirVersion = fhirVersion;
    }

    /**
     * Extensions for fhirVersion
     * 
     */
    @JsonProperty("_fhirVersion")
    public List<Element> get_fhirVersion() {
        return _fhirVersion;
    }

    /**
     * Extensions for fhirVersion
     * 
     */
    @JsonProperty("_fhirVersion")
    public void set_fhirVersion(List<Element> _fhirVersion) {
        this._fhirVersion = _fhirVersion;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("groupingId")
    public String getGroupingId() {
        return groupingId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("groupingId")
    public void setGroupingId(String groupingId) {
        this.groupingId = groupingId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupingId")
    public Element get_groupingId() {
        return _groupingId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupingId")
    public void set_groupingId(Element _groupingId) {
        this._groupingId = _groupingId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImplementationGuide_Resource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("fhirVersion");
        sb.append('=');
        sb.append(((this.fhirVersion == null)?"<null>":this.fhirVersion));
        sb.append(',');
        sb.append("_fhirVersion");
        sb.append('=');
        sb.append(((this._fhirVersion == null)?"<null>":this._fhirVersion));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
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
        sb.append("groupingId");
        sb.append('=');
        sb.append(((this.groupingId == null)?"<null>":this.groupingId));
        sb.append(',');
        sb.append("_groupingId");
        sb.append('=');
        sb.append(((this._groupingId == null)?"<null>":this._groupingId));
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
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._groupingId == null)? 0 :this._groupingId.hashCode()));
        result = ((result* 31)+((this.groupingId == null)? 0 :this.groupingId.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._fhirVersion == null)? 0 :this._fhirVersion.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._exampleCanonical == null)? 0 :this._exampleCanonical.hashCode()));
        result = ((result* 31)+((this._exampleBoolean == null)? 0 :this._exampleBoolean.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.exampleCanonical == null)? 0 :this.exampleCanonical.hashCode()));
        result = ((result* 31)+((this.fhirVersion == null)? 0 :this.fhirVersion.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.exampleBoolean == null)? 0 :this.exampleBoolean.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImplementationGuide_Resource) == false) {
            return false;
        }
        ImplementationGuide_Resource rhs = ((ImplementationGuide_Resource) other);
        return (((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._groupingId == rhs._groupingId)||((this._groupingId!= null)&&this._groupingId.equals(rhs._groupingId))))&&((this.groupingId == rhs.groupingId)||((this.groupingId!= null)&&this.groupingId.equals(rhs.groupingId))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._fhirVersion == rhs._fhirVersion)||((this._fhirVersion!= null)&&this._fhirVersion.equals(rhs._fhirVersion))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._exampleCanonical == rhs._exampleCanonical)||((this._exampleCanonical!= null)&&this._exampleCanonical.equals(rhs._exampleCanonical))))&&((this._exampleBoolean == rhs._exampleBoolean)||((this._exampleBoolean!= null)&&this._exampleBoolean.equals(rhs._exampleBoolean))))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.exampleCanonical == rhs.exampleCanonical)||((this.exampleCanonical!= null)&&this.exampleCanonical.equals(rhs.exampleCanonical))))&&((this.fhirVersion == rhs.fhirVersion)||((this.fhirVersion!= null)&&this.fhirVersion.equals(rhs.fhirVersion))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.exampleBoolean == rhs.exampleBoolean)||((this.exampleBoolean!= null)&&this.exampleBoolean.equals(rhs.exampleBoolean))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))));
    }

}
