
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A medicinal product in a container or package.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "identifier",
    "type",
    "quantity",
    "material",
    "alternateMaterial",
    "device",
    "manufacturedItem",
    "packageItem",
    "physicalCharacteristics",
    "otherCharacteristics",
    "shelfLifeStorage",
    "manufacturer"
})
@Generated("jsonschema2pojo")
public class MedicinalProductPackaged_PackageItem {

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
     * Including possibly Data Carrier Identifier.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Including possibly Data Carrier Identifier.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * Material type of the package item.
     * 
     */
    @JsonProperty("material")
    @JsonPropertyDescription("Material type of the package item.")
    private List<CodeableConcept> material = new ArrayList<CodeableConcept>();
    /**
     * A possible alternate material for the packaging.
     * 
     */
    @JsonProperty("alternateMaterial")
    @JsonPropertyDescription("A possible alternate material for the packaging.")
    private List<CodeableConcept> alternateMaterial = new ArrayList<CodeableConcept>();
    /**
     * A device accompanying a medicinal product.
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("A device accompanying a medicinal product.")
    private List<Reference> device = new ArrayList<Reference>();
    /**
     * The manufactured item as contained in the packaged medicinal product.
     * 
     */
    @JsonProperty("manufacturedItem")
    @JsonPropertyDescription("The manufactured item as contained in the packaged medicinal product.")
    private List<Reference> manufacturedItem = new ArrayList<Reference>();
    /**
     * Allows containers within containers.
     * 
     */
    @JsonProperty("packageItem")
    @JsonPropertyDescription("Allows containers within containers.")
    private List<MedicinalProductPackaged_PackageItem> packageItem = new ArrayList<MedicinalProductPackaged_PackageItem>();
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
    /**
     * Shelf Life and storage information.
     * 
     */
    @JsonProperty("shelfLifeStorage")
    @JsonPropertyDescription("Shelf Life and storage information.")
    private List<ProductShelfLife> shelfLifeStorage = new ArrayList<ProductShelfLife>();
    /**
     * Manufacturer of this Package Item.
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("Manufacturer of this Package Item.")
    private List<Reference> manufacturer = new ArrayList<Reference>();

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
     * Including possibly Data Carrier Identifier.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Including possibly Data Carrier Identifier.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
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
     * Material type of the package item.
     * 
     */
    @JsonProperty("material")
    public List<CodeableConcept> getMaterial() {
        return material;
    }

    /**
     * Material type of the package item.
     * 
     */
    @JsonProperty("material")
    public void setMaterial(List<CodeableConcept> material) {
        this.material = material;
    }

    /**
     * A possible alternate material for the packaging.
     * 
     */
    @JsonProperty("alternateMaterial")
    public List<CodeableConcept> getAlternateMaterial() {
        return alternateMaterial;
    }

    /**
     * A possible alternate material for the packaging.
     * 
     */
    @JsonProperty("alternateMaterial")
    public void setAlternateMaterial(List<CodeableConcept> alternateMaterial) {
        this.alternateMaterial = alternateMaterial;
    }

    /**
     * A device accompanying a medicinal product.
     * 
     */
    @JsonProperty("device")
    public List<Reference> getDevice() {
        return device;
    }

    /**
     * A device accompanying a medicinal product.
     * 
     */
    @JsonProperty("device")
    public void setDevice(List<Reference> device) {
        this.device = device;
    }

    /**
     * The manufactured item as contained in the packaged medicinal product.
     * 
     */
    @JsonProperty("manufacturedItem")
    public List<Reference> getManufacturedItem() {
        return manufacturedItem;
    }

    /**
     * The manufactured item as contained in the packaged medicinal product.
     * 
     */
    @JsonProperty("manufacturedItem")
    public void setManufacturedItem(List<Reference> manufacturedItem) {
        this.manufacturedItem = manufacturedItem;
    }

    /**
     * Allows containers within containers.
     * 
     */
    @JsonProperty("packageItem")
    public List<MedicinalProductPackaged_PackageItem> getPackageItem() {
        return packageItem;
    }

    /**
     * Allows containers within containers.
     * 
     */
    @JsonProperty("packageItem")
    public void setPackageItem(List<MedicinalProductPackaged_PackageItem> packageItem) {
        this.packageItem = packageItem;
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

    /**
     * Shelf Life and storage information.
     * 
     */
    @JsonProperty("shelfLifeStorage")
    public List<ProductShelfLife> getShelfLifeStorage() {
        return shelfLifeStorage;
    }

    /**
     * Shelf Life and storage information.
     * 
     */
    @JsonProperty("shelfLifeStorage")
    public void setShelfLifeStorage(List<ProductShelfLife> shelfLifeStorage) {
        this.shelfLifeStorage = shelfLifeStorage;
    }

    /**
     * Manufacturer of this Package Item.
     * 
     */
    @JsonProperty("manufacturer")
    public List<Reference> getManufacturer() {
        return manufacturer;
    }

    /**
     * Manufacturer of this Package Item.
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(List<Reference> manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicinalProductPackaged_PackageItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("material");
        sb.append('=');
        sb.append(((this.material == null)?"<null>":this.material));
        sb.append(',');
        sb.append("alternateMaterial");
        sb.append('=');
        sb.append(((this.alternateMaterial == null)?"<null>":this.alternateMaterial));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        sb.append("manufacturedItem");
        sb.append('=');
        sb.append(((this.manufacturedItem == null)?"<null>":this.manufacturedItem));
        sb.append(',');
        sb.append("packageItem");
        sb.append('=');
        sb.append(((this.packageItem == null)?"<null>":this.packageItem));
        sb.append(',');
        sb.append("physicalCharacteristics");
        sb.append('=');
        sb.append(((this.physicalCharacteristics == null)?"<null>":this.physicalCharacteristics));
        sb.append(',');
        sb.append("otherCharacteristics");
        sb.append('=');
        sb.append(((this.otherCharacteristics == null)?"<null>":this.otherCharacteristics));
        sb.append(',');
        sb.append("shelfLifeStorage");
        sb.append('=');
        sb.append(((this.shelfLifeStorage == null)?"<null>":this.shelfLifeStorage));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.otherCharacteristics == null)? 0 :this.otherCharacteristics.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.manufacturedItem == null)? 0 :this.manufacturedItem.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.physicalCharacteristics == null)? 0 :this.physicalCharacteristics.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.manufacturer == null)? 0 :this.manufacturer.hashCode()));
        result = ((result* 31)+((this.packageItem == null)? 0 :this.packageItem.hashCode()));
        result = ((result* 31)+((this.material == null)? 0 :this.material.hashCode()));
        result = ((result* 31)+((this.shelfLifeStorage == null)? 0 :this.shelfLifeStorage.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.alternateMaterial == null)? 0 :this.alternateMaterial.hashCode()));
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductPackaged_PackageItem) == false) {
            return false;
        }
        MedicinalProductPackaged_PackageItem rhs = ((MedicinalProductPackaged_PackageItem) other);
        return ((((((((((((((((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.otherCharacteristics == rhs.otherCharacteristics)||((this.otherCharacteristics!= null)&&this.otherCharacteristics.equals(rhs.otherCharacteristics))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.manufacturedItem == rhs.manufacturedItem)||((this.manufacturedItem!= null)&&this.manufacturedItem.equals(rhs.manufacturedItem))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.physicalCharacteristics == rhs.physicalCharacteristics)||((this.physicalCharacteristics!= null)&&this.physicalCharacteristics.equals(rhs.physicalCharacteristics))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))))&&((this.packageItem == rhs.packageItem)||((this.packageItem!= null)&&this.packageItem.equals(rhs.packageItem))))&&((this.material == rhs.material)||((this.material!= null)&&this.material.equals(rhs.material))))&&((this.shelfLifeStorage == rhs.shelfLifeStorage)||((this.shelfLifeStorage!= null)&&this.shelfLifeStorage.equals(rhs.shelfLifeStorage))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.alternateMaterial == rhs.alternateMaterial)||((this.alternateMaterial!= null)&&this.alternateMaterial.equals(rhs.alternateMaterial))))&&((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device))));
    }

}
