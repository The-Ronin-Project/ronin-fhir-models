
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "maternalOrganismId",
    "_maternalOrganismId",
    "maternalOrganismName",
    "_maternalOrganismName",
    "paternalOrganismId",
    "_paternalOrganismId",
    "paternalOrganismName",
    "_paternalOrganismName",
    "hybridType"
})
@Generated("jsonschema2pojo")
public class SubstanceSourceMaterial_Hybrid {

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
    @JsonProperty("maternalOrganismId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String maternalOrganismId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maternalOrganismId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maternalOrganismId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("maternalOrganismName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String maternalOrganismName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maternalOrganismName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maternalOrganismName;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("paternalOrganismId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String paternalOrganismId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paternalOrganismId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _paternalOrganismId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("paternalOrganismName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String paternalOrganismName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paternalOrganismName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _paternalOrganismName;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("hybridType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept hybridType;

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
    @JsonProperty("maternalOrganismId")
    public String getMaternalOrganismId() {
        return maternalOrganismId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("maternalOrganismId")
    public void setMaternalOrganismId(String maternalOrganismId) {
        this.maternalOrganismId = maternalOrganismId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maternalOrganismId")
    public Element get_maternalOrganismId() {
        return _maternalOrganismId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maternalOrganismId")
    public void set_maternalOrganismId(Element _maternalOrganismId) {
        this._maternalOrganismId = _maternalOrganismId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("maternalOrganismName")
    public String getMaternalOrganismName() {
        return maternalOrganismName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("maternalOrganismName")
    public void setMaternalOrganismName(String maternalOrganismName) {
        this.maternalOrganismName = maternalOrganismName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maternalOrganismName")
    public Element get_maternalOrganismName() {
        return _maternalOrganismName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maternalOrganismName")
    public void set_maternalOrganismName(Element _maternalOrganismName) {
        this._maternalOrganismName = _maternalOrganismName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("paternalOrganismId")
    public String getPaternalOrganismId() {
        return paternalOrganismId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("paternalOrganismId")
    public void setPaternalOrganismId(String paternalOrganismId) {
        this.paternalOrganismId = paternalOrganismId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paternalOrganismId")
    public Element get_paternalOrganismId() {
        return _paternalOrganismId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paternalOrganismId")
    public void set_paternalOrganismId(Element _paternalOrganismId) {
        this._paternalOrganismId = _paternalOrganismId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("paternalOrganismName")
    public String getPaternalOrganismName() {
        return paternalOrganismName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("paternalOrganismName")
    public void setPaternalOrganismName(String paternalOrganismName) {
        this.paternalOrganismName = paternalOrganismName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paternalOrganismName")
    public Element get_paternalOrganismName() {
        return _paternalOrganismName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paternalOrganismName")
    public void set_paternalOrganismName(Element _paternalOrganismName) {
        this._paternalOrganismName = _paternalOrganismName;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("hybridType")
    public CodeableConcept getHybridType() {
        return hybridType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("hybridType")
    public void setHybridType(CodeableConcept hybridType) {
        this.hybridType = hybridType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceSourceMaterial_Hybrid.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("maternalOrganismId");
        sb.append('=');
        sb.append(((this.maternalOrganismId == null)?"<null>":this.maternalOrganismId));
        sb.append(',');
        sb.append("_maternalOrganismId");
        sb.append('=');
        sb.append(((this._maternalOrganismId == null)?"<null>":this._maternalOrganismId));
        sb.append(',');
        sb.append("maternalOrganismName");
        sb.append('=');
        sb.append(((this.maternalOrganismName == null)?"<null>":this.maternalOrganismName));
        sb.append(',');
        sb.append("_maternalOrganismName");
        sb.append('=');
        sb.append(((this._maternalOrganismName == null)?"<null>":this._maternalOrganismName));
        sb.append(',');
        sb.append("paternalOrganismId");
        sb.append('=');
        sb.append(((this.paternalOrganismId == null)?"<null>":this.paternalOrganismId));
        sb.append(',');
        sb.append("_paternalOrganismId");
        sb.append('=');
        sb.append(((this._paternalOrganismId == null)?"<null>":this._paternalOrganismId));
        sb.append(',');
        sb.append("paternalOrganismName");
        sb.append('=');
        sb.append(((this.paternalOrganismName == null)?"<null>":this.paternalOrganismName));
        sb.append(',');
        sb.append("_paternalOrganismName");
        sb.append('=');
        sb.append(((this._paternalOrganismName == null)?"<null>":this._paternalOrganismName));
        sb.append(',');
        sb.append("hybridType");
        sb.append('=');
        sb.append(((this.hybridType == null)?"<null>":this.hybridType));
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
        result = ((result* 31)+((this.maternalOrganismName == null)? 0 :this.maternalOrganismName.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.maternalOrganismId == null)? 0 :this.maternalOrganismId.hashCode()));
        result = ((result* 31)+((this._maternalOrganismName == null)? 0 :this._maternalOrganismName.hashCode()));
        result = ((result* 31)+((this._paternalOrganismName == null)? 0 :this._paternalOrganismName.hashCode()));
        result = ((result* 31)+((this.paternalOrganismId == null)? 0 :this.paternalOrganismId.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.paternalOrganismName == null)? 0 :this.paternalOrganismName.hashCode()));
        result = ((result* 31)+((this.hybridType == null)? 0 :this.hybridType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._maternalOrganismId == null)? 0 :this._maternalOrganismId.hashCode()));
        result = ((result* 31)+((this._paternalOrganismId == null)? 0 :this._paternalOrganismId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSourceMaterial_Hybrid) == false) {
            return false;
        }
        SubstanceSourceMaterial_Hybrid rhs = ((SubstanceSourceMaterial_Hybrid) other);
        return (((((((((((((this.maternalOrganismName == rhs.maternalOrganismName)||((this.maternalOrganismName!= null)&&this.maternalOrganismName.equals(rhs.maternalOrganismName)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.maternalOrganismId == rhs.maternalOrganismId)||((this.maternalOrganismId!= null)&&this.maternalOrganismId.equals(rhs.maternalOrganismId))))&&((this._maternalOrganismName == rhs._maternalOrganismName)||((this._maternalOrganismName!= null)&&this._maternalOrganismName.equals(rhs._maternalOrganismName))))&&((this._paternalOrganismName == rhs._paternalOrganismName)||((this._paternalOrganismName!= null)&&this._paternalOrganismName.equals(rhs._paternalOrganismName))))&&((this.paternalOrganismId == rhs.paternalOrganismId)||((this.paternalOrganismId!= null)&&this.paternalOrganismId.equals(rhs.paternalOrganismId))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.paternalOrganismName == rhs.paternalOrganismName)||((this.paternalOrganismName!= null)&&this.paternalOrganismName.equals(rhs.paternalOrganismName))))&&((this.hybridType == rhs.hybridType)||((this.hybridType!= null)&&this.hybridType.equals(rhs.hybridType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._maternalOrganismId == rhs._maternalOrganismId)||((this._maternalOrganismId!= null)&&this._maternalOrganismId.equals(rhs._maternalOrganismId))))&&((this._paternalOrganismId == rhs._paternalOrganismId)||((this._paternalOrganismId!= null)&&this._paternalOrganismId.equals(rhs._paternalOrganismId))));
    }

}
