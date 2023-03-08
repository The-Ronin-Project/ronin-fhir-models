
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "baseFormulaType",
    "baseFormulaProductName",
    "_baseFormulaProductName",
    "additiveType",
    "additiveProductName",
    "_additiveProductName",
    "caloricDensity",
    "routeofAdministration",
    "administration",
    "maxVolumeToDeliver",
    "administrationInstruction",
    "_administrationInstruction"
})
@Generated("jsonschema2pojo")
public class NutritionOrder_EnteralFormula {

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
    @JsonProperty("baseFormulaType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept baseFormulaType;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("baseFormulaProductName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String baseFormulaProductName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_baseFormulaProductName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _baseFormulaProductName;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("additiveType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept additiveType;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("additiveProductName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String additiveProductName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_additiveProductName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _additiveProductName;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("caloricDensity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity caloricDensity;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("routeofAdministration")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept routeofAdministration;
    /**
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * 
     */
    @JsonProperty("administration")
    @JsonPropertyDescription("Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.")
    private List<NutritionOrder_Administration> administration = new ArrayList<NutritionOrder_Administration>();
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxVolumeToDeliver")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity maxVolumeToDeliver;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("administrationInstruction")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String administrationInstruction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_administrationInstruction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _administrationInstruction;

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
    @JsonProperty("baseFormulaType")
    public CodeableConcept getBaseFormulaType() {
        return baseFormulaType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("baseFormulaType")
    public void setBaseFormulaType(CodeableConcept baseFormulaType) {
        this.baseFormulaType = baseFormulaType;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("baseFormulaProductName")
    public String getBaseFormulaProductName() {
        return baseFormulaProductName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("baseFormulaProductName")
    public void setBaseFormulaProductName(String baseFormulaProductName) {
        this.baseFormulaProductName = baseFormulaProductName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_baseFormulaProductName")
    public Element get_baseFormulaProductName() {
        return _baseFormulaProductName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_baseFormulaProductName")
    public void set_baseFormulaProductName(Element _baseFormulaProductName) {
        this._baseFormulaProductName = _baseFormulaProductName;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("additiveType")
    public CodeableConcept getAdditiveType() {
        return additiveType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("additiveType")
    public void setAdditiveType(CodeableConcept additiveType) {
        this.additiveType = additiveType;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("additiveProductName")
    public String getAdditiveProductName() {
        return additiveProductName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("additiveProductName")
    public void setAdditiveProductName(String additiveProductName) {
        this.additiveProductName = additiveProductName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_additiveProductName")
    public Element get_additiveProductName() {
        return _additiveProductName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_additiveProductName")
    public void set_additiveProductName(Element _additiveProductName) {
        this._additiveProductName = _additiveProductName;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("caloricDensity")
    public Quantity getCaloricDensity() {
        return caloricDensity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("caloricDensity")
    public void setCaloricDensity(Quantity caloricDensity) {
        this.caloricDensity = caloricDensity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("routeofAdministration")
    public CodeableConcept getRouteofAdministration() {
        return routeofAdministration;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("routeofAdministration")
    public void setRouteofAdministration(CodeableConcept routeofAdministration) {
        this.routeofAdministration = routeofAdministration;
    }

    /**
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * 
     */
    @JsonProperty("administration")
    public List<NutritionOrder_Administration> getAdministration() {
        return administration;
    }

    /**
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * 
     */
    @JsonProperty("administration")
    public void setAdministration(List<NutritionOrder_Administration> administration) {
        this.administration = administration;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxVolumeToDeliver")
    public Quantity getMaxVolumeToDeliver() {
        return maxVolumeToDeliver;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxVolumeToDeliver")
    public void setMaxVolumeToDeliver(Quantity maxVolumeToDeliver) {
        this.maxVolumeToDeliver = maxVolumeToDeliver;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("administrationInstruction")
    public String getAdministrationInstruction() {
        return administrationInstruction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("administrationInstruction")
    public void setAdministrationInstruction(String administrationInstruction) {
        this.administrationInstruction = administrationInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_administrationInstruction")
    public Element get_administrationInstruction() {
        return _administrationInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_administrationInstruction")
    public void set_administrationInstruction(Element _administrationInstruction) {
        this._administrationInstruction = _administrationInstruction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NutritionOrder_EnteralFormula.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("baseFormulaType");
        sb.append('=');
        sb.append(((this.baseFormulaType == null)?"<null>":this.baseFormulaType));
        sb.append(',');
        sb.append("baseFormulaProductName");
        sb.append('=');
        sb.append(((this.baseFormulaProductName == null)?"<null>":this.baseFormulaProductName));
        sb.append(',');
        sb.append("_baseFormulaProductName");
        sb.append('=');
        sb.append(((this._baseFormulaProductName == null)?"<null>":this._baseFormulaProductName));
        sb.append(',');
        sb.append("additiveType");
        sb.append('=');
        sb.append(((this.additiveType == null)?"<null>":this.additiveType));
        sb.append(',');
        sb.append("additiveProductName");
        sb.append('=');
        sb.append(((this.additiveProductName == null)?"<null>":this.additiveProductName));
        sb.append(',');
        sb.append("_additiveProductName");
        sb.append('=');
        sb.append(((this._additiveProductName == null)?"<null>":this._additiveProductName));
        sb.append(',');
        sb.append("caloricDensity");
        sb.append('=');
        sb.append(((this.caloricDensity == null)?"<null>":this.caloricDensity));
        sb.append(',');
        sb.append("routeofAdministration");
        sb.append('=');
        sb.append(((this.routeofAdministration == null)?"<null>":this.routeofAdministration));
        sb.append(',');
        sb.append("administration");
        sb.append('=');
        sb.append(((this.administration == null)?"<null>":this.administration));
        sb.append(',');
        sb.append("maxVolumeToDeliver");
        sb.append('=');
        sb.append(((this.maxVolumeToDeliver == null)?"<null>":this.maxVolumeToDeliver));
        sb.append(',');
        sb.append("administrationInstruction");
        sb.append('=');
        sb.append(((this.administrationInstruction == null)?"<null>":this.administrationInstruction));
        sb.append(',');
        sb.append("_administrationInstruction");
        sb.append('=');
        sb.append(((this._administrationInstruction == null)?"<null>":this._administrationInstruction));
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
        result = ((result* 31)+((this.administrationInstruction == null)? 0 :this.administrationInstruction.hashCode()));
        result = ((result* 31)+((this.administration == null)? 0 :this.administration.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._additiveProductName == null)? 0 :this._additiveProductName.hashCode()));
        result = ((result* 31)+((this.maxVolumeToDeliver == null)? 0 :this.maxVolumeToDeliver.hashCode()));
        result = ((result* 31)+((this._administrationInstruction == null)? 0 :this._administrationInstruction.hashCode()));
        result = ((result* 31)+((this.routeofAdministration == null)? 0 :this.routeofAdministration.hashCode()));
        result = ((result* 31)+((this.baseFormulaProductName == null)? 0 :this.baseFormulaProductName.hashCode()));
        result = ((result* 31)+((this.additiveType == null)? 0 :this.additiveType.hashCode()));
        result = ((result* 31)+((this.baseFormulaType == null)? 0 :this.baseFormulaType.hashCode()));
        result = ((result* 31)+((this.caloricDensity == null)? 0 :this.caloricDensity.hashCode()));
        result = ((result* 31)+((this.additiveProductName == null)? 0 :this.additiveProductName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._baseFormulaProductName == null)? 0 :this._baseFormulaProductName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NutritionOrder_EnteralFormula) == false) {
            return false;
        }
        NutritionOrder_EnteralFormula rhs = ((NutritionOrder_EnteralFormula) other);
        return ((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.administrationInstruction == rhs.administrationInstruction)||((this.administrationInstruction!= null)&&this.administrationInstruction.equals(rhs.administrationInstruction))))&&((this.administration == rhs.administration)||((this.administration!= null)&&this.administration.equals(rhs.administration))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._additiveProductName == rhs._additiveProductName)||((this._additiveProductName!= null)&&this._additiveProductName.equals(rhs._additiveProductName))))&&((this.maxVolumeToDeliver == rhs.maxVolumeToDeliver)||((this.maxVolumeToDeliver!= null)&&this.maxVolumeToDeliver.equals(rhs.maxVolumeToDeliver))))&&((this._administrationInstruction == rhs._administrationInstruction)||((this._administrationInstruction!= null)&&this._administrationInstruction.equals(rhs._administrationInstruction))))&&((this.routeofAdministration == rhs.routeofAdministration)||((this.routeofAdministration!= null)&&this.routeofAdministration.equals(rhs.routeofAdministration))))&&((this.baseFormulaProductName == rhs.baseFormulaProductName)||((this.baseFormulaProductName!= null)&&this.baseFormulaProductName.equals(rhs.baseFormulaProductName))))&&((this.additiveType == rhs.additiveType)||((this.additiveType!= null)&&this.additiveType.equals(rhs.additiveType))))&&((this.baseFormulaType == rhs.baseFormulaType)||((this.baseFormulaType!= null)&&this.baseFormulaType.equals(rhs.baseFormulaType))))&&((this.caloricDensity == rhs.caloricDensity)||((this.caloricDensity!= null)&&this.caloricDensity.equals(rhs.caloricDensity))))&&((this.additiveProductName == rhs.additiveProductName)||((this.additiveProductName!= null)&&this.additiveProductName.equals(rhs.additiveProductName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._baseFormulaProductName == rhs._baseFormulaProductName)||((this._baseFormulaProductName!= null)&&this._baseFormulaProductName.equals(rhs._baseFormulaProductName))));
    }

}
