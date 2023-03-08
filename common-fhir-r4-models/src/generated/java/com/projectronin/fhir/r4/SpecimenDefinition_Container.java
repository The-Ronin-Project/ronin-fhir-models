
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A kind of specimen with associated set of requirements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "material",
    "type",
    "cap",
    "description",
    "_description",
    "capacity",
    "minimumVolumeQuantity",
    "minimumVolumeString",
    "_minimumVolumeString",
    "additive",
    "preparation",
    "_preparation"
})
@Generated("jsonschema2pojo")
public class SpecimenDefinition_Container {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("material")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept material;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("cap")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept cap;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("capacity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity capacity;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("minimumVolumeQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity minimumVolumeQuantity;
    /**
     * The minimum volume to be conditioned in the container.
     * 
     */
    @JsonProperty("minimumVolumeString")
    @JsonPropertyDescription("The minimum volume to be conditioned in the container.")
    private String minimumVolumeString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minimumVolumeString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minimumVolumeString;
    /**
     * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
     * 
     */
    @JsonProperty("additive")
    @JsonPropertyDescription("Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.")
    private List<SpecimenDefinition_Additive> additive = new ArrayList<SpecimenDefinition_Additive>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preparation")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String preparation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preparation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _preparation;

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("material")
    public CodeableConcept getMaterial() {
        return material;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("material")
    public void setMaterial(CodeableConcept material) {
        this.material = material;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("cap")
    public CodeableConcept getCap() {
        return cap;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("cap")
    public void setCap(CodeableConcept cap) {
        this.cap = cap;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("capacity")
    public Quantity getCapacity() {
        return capacity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(Quantity capacity) {
        this.capacity = capacity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("minimumVolumeQuantity")
    public Quantity getMinimumVolumeQuantity() {
        return minimumVolumeQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("minimumVolumeQuantity")
    public void setMinimumVolumeQuantity(Quantity minimumVolumeQuantity) {
        this.minimumVolumeQuantity = minimumVolumeQuantity;
    }

    /**
     * The minimum volume to be conditioned in the container.
     * 
     */
    @JsonProperty("minimumVolumeString")
    public String getMinimumVolumeString() {
        return minimumVolumeString;
    }

    /**
     * The minimum volume to be conditioned in the container.
     * 
     */
    @JsonProperty("minimumVolumeString")
    public void setMinimumVolumeString(String minimumVolumeString) {
        this.minimumVolumeString = minimumVolumeString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minimumVolumeString")
    public Element get_minimumVolumeString() {
        return _minimumVolumeString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minimumVolumeString")
    public void set_minimumVolumeString(Element _minimumVolumeString) {
        this._minimumVolumeString = _minimumVolumeString;
    }

    /**
     * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
     * 
     */
    @JsonProperty("additive")
    public List<SpecimenDefinition_Additive> getAdditive() {
        return additive;
    }

    /**
     * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
     * 
     */
    @JsonProperty("additive")
    public void setAdditive(List<SpecimenDefinition_Additive> additive) {
        this.additive = additive;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preparation")
    public String getPreparation() {
        return preparation;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preparation")
    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preparation")
    public Element get_preparation() {
        return _preparation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preparation")
    public void set_preparation(Element _preparation) {
        this._preparation = _preparation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpecimenDefinition_Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("material");
        sb.append('=');
        sb.append(((this.material == null)?"<null>":this.material));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("cap");
        sb.append('=');
        sb.append(((this.cap == null)?"<null>":this.cap));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
        sb.append(',');
        sb.append("minimumVolumeQuantity");
        sb.append('=');
        sb.append(((this.minimumVolumeQuantity == null)?"<null>":this.minimumVolumeQuantity));
        sb.append(',');
        sb.append("minimumVolumeString");
        sb.append('=');
        sb.append(((this.minimumVolumeString == null)?"<null>":this.minimumVolumeString));
        sb.append(',');
        sb.append("_minimumVolumeString");
        sb.append('=');
        sb.append(((this._minimumVolumeString == null)?"<null>":this._minimumVolumeString));
        sb.append(',');
        sb.append("additive");
        sb.append('=');
        sb.append(((this.additive == null)?"<null>":this.additive));
        sb.append(',');
        sb.append("preparation");
        sb.append('=');
        sb.append(((this.preparation == null)?"<null>":this.preparation));
        sb.append(',');
        sb.append("_preparation");
        sb.append('=');
        sb.append(((this._preparation == null)?"<null>":this._preparation));
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
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._minimumVolumeString == null)? 0 :this._minimumVolumeString.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        result = ((result* 31)+((this.additive == null)? 0 :this.additive.hashCode()));
        result = ((result* 31)+((this.preparation == null)? 0 :this.preparation.hashCode()));
        result = ((result* 31)+((this.cap == null)? 0 :this.cap.hashCode()));
        result = ((result* 31)+((this.material == null)? 0 :this.material.hashCode()));
        result = ((result* 31)+((this.minimumVolumeString == null)? 0 :this.minimumVolumeString.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.minimumVolumeQuantity == null)? 0 :this.minimumVolumeQuantity.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._preparation == null)? 0 :this._preparation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecimenDefinition_Container) == false) {
            return false;
        }
        SpecimenDefinition_Container rhs = ((SpecimenDefinition_Container) other);
        return ((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._minimumVolumeString == rhs._minimumVolumeString)||((this._minimumVolumeString!= null)&&this._minimumVolumeString.equals(rhs._minimumVolumeString))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))))&&((this.additive == rhs.additive)||((this.additive!= null)&&this.additive.equals(rhs.additive))))&&((this.preparation == rhs.preparation)||((this.preparation!= null)&&this.preparation.equals(rhs.preparation))))&&((this.cap == rhs.cap)||((this.cap!= null)&&this.cap.equals(rhs.cap))))&&((this.material == rhs.material)||((this.material!= null)&&this.material.equals(rhs.material))))&&((this.minimumVolumeString == rhs.minimumVolumeString)||((this.minimumVolumeString!= null)&&this.minimumVolumeString.equals(rhs.minimumVolumeString))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.minimumVolumeQuantity == rhs.minimumVolumeQuantity)||((this.minimumVolumeQuantity!= null)&&this.minimumVolumeQuantity.equals(rhs.minimumVolumeQuantity))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._preparation == rhs._preparation)||((this._preparation!= null)&&this._preparation.equals(rhs._preparation))));
    }

}
