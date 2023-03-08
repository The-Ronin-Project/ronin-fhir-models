
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The manufactured item as contained in the packaged medicinal product.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "manufacturedDoseForm",
    "unitOfPresentation",
    "quantity",
    "manufacturer",
    "ingredient",
    "physicalCharacteristics",
    "otherCharacteristics"
})
@Generated("jsonschema2pojo")
public class MedicinalProductManufactured
    extends DomainResource
{

    /**
     * This is a MedicinalProductManufactured resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductManufactured resource")
    private String resourceType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("manufacturedDoseForm")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept manufacturedDoseForm;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfPresentation")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept unitOfPresentation;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * Manufacturer of the item (Note that this should be named &quot;manufacturer&quot; but it currently causes technical issues).
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("Manufacturer of the item (Note that this should be named \"manufacturer\" but it currently causes technical issues).")
    private List<Reference> manufacturer = new ArrayList<Reference>();
    /**
     * Ingredient.
     * 
     */
    @JsonProperty("ingredient")
    @JsonPropertyDescription("Ingredient.")
    private List<Reference> ingredient = new ArrayList<Reference>();
    /**
     * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
     * 
     */
    @JsonProperty("physicalCharacteristics")
    @JsonPropertyDescription("The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.")
    private ProdCharacteristic physicalCharacteristics;
    /**
     * Other codeable characteristics.
     * 
     */
    @JsonProperty("otherCharacteristics")
    @JsonPropertyDescription("Other codeable characteristics.")
    private List<CodeableConcept> otherCharacteristics = new ArrayList<CodeableConcept>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicinalProductManufactured resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductManufactured resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("manufacturedDoseForm")
    public CodeableConcept getManufacturedDoseForm() {
        return manufacturedDoseForm;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("manufacturedDoseForm")
    public void setManufacturedDoseForm(CodeableConcept manufacturedDoseForm) {
        this.manufacturedDoseForm = manufacturedDoseForm;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfPresentation")
    public CodeableConcept getUnitOfPresentation() {
        return unitOfPresentation;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfPresentation")
    public void setUnitOfPresentation(CodeableConcept unitOfPresentation) {
        this.unitOfPresentation = unitOfPresentation;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Manufacturer of the item (Note that this should be named &quot;manufacturer&quot; but it currently causes technical issues).
     * 
     */
    @JsonProperty("manufacturer")
    public List<Reference> getManufacturer() {
        return manufacturer;
    }

    /**
     * Manufacturer of the item (Note that this should be named &quot;manufacturer&quot; but it currently causes technical issues).
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(List<Reference> manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Ingredient.
     * 
     */
    @JsonProperty("ingredient")
    public List<Reference> getIngredient() {
        return ingredient;
    }

    /**
     * Ingredient.
     * 
     */
    @JsonProperty("ingredient")
    public void setIngredient(List<Reference> ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
     * 
     */
    @JsonProperty("physicalCharacteristics")
    public ProdCharacteristic getPhysicalCharacteristics() {
        return physicalCharacteristics;
    }

    /**
     * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
     * 
     */
    @JsonProperty("physicalCharacteristics")
    public void setPhysicalCharacteristics(ProdCharacteristic physicalCharacteristics) {
        this.physicalCharacteristics = physicalCharacteristics;
    }

    /**
     * Other codeable characteristics.
     * 
     */
    @JsonProperty("otherCharacteristics")
    public List<CodeableConcept> getOtherCharacteristics() {
        return otherCharacteristics;
    }

    /**
     * Other codeable characteristics.
     * 
     */
    @JsonProperty("otherCharacteristics")
    public void setOtherCharacteristics(List<CodeableConcept> otherCharacteristics) {
        this.otherCharacteristics = otherCharacteristics;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicinalProductManufactured.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("manufacturedDoseForm");
        sb.append('=');
        sb.append(((this.manufacturedDoseForm == null)?"<null>":this.manufacturedDoseForm));
        sb.append(',');
        sb.append("unitOfPresentation");
        sb.append('=');
        sb.append(((this.unitOfPresentation == null)?"<null>":this.unitOfPresentation));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("ingredient");
        sb.append('=');
        sb.append(((this.ingredient == null)?"<null>":this.ingredient));
        sb.append(',');
        sb.append("physicalCharacteristics");
        sb.append('=');
        sb.append(((this.physicalCharacteristics == null)?"<null>":this.physicalCharacteristics));
        sb.append(',');
        sb.append("otherCharacteristics");
        sb.append('=');
        sb.append(((this.otherCharacteristics == null)?"<null>":this.otherCharacteristics));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.otherCharacteristics == null)? 0 :this.otherCharacteristics.hashCode()));
        result = ((result* 31)+((this.unitOfPresentation == null)? 0 :this.unitOfPresentation.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.ingredient == null)? 0 :this.ingredient.hashCode()));
        result = ((result* 31)+((this.physicalCharacteristics == null)? 0 :this.physicalCharacteristics.hashCode()));
        result = ((result* 31)+((this.manufacturedDoseForm == null)? 0 :this.manufacturedDoseForm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.manufacturer == null)? 0 :this.manufacturer.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductManufactured) == false) {
            return false;
        }
        MedicinalProductManufactured rhs = ((MedicinalProductManufactured) other);
        return (((((((((super.equals(rhs)&&((this.otherCharacteristics == rhs.otherCharacteristics)||((this.otherCharacteristics!= null)&&this.otherCharacteristics.equals(rhs.otherCharacteristics))))&&((this.unitOfPresentation == rhs.unitOfPresentation)||((this.unitOfPresentation!= null)&&this.unitOfPresentation.equals(rhs.unitOfPresentation))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.ingredient == rhs.ingredient)||((this.ingredient!= null)&&this.ingredient.equals(rhs.ingredient))))&&((this.physicalCharacteristics == rhs.physicalCharacteristics)||((this.physicalCharacteristics!= null)&&this.physicalCharacteristics.equals(rhs.physicalCharacteristics))))&&((this.manufacturedDoseForm == rhs.manufacturedDoseForm)||((this.manufacturedDoseForm!= null)&&this.manufacturedDoseForm.equals(rhs.manufacturedDoseForm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))));
    }

}
