
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "productName",
    "_productName",
    "namePart",
    "countryLanguage"
})
@Generated("jsonschema2pojo")
public class MedicinalProduct_Name {

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
    @JsonProperty("productName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String productName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_productName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _productName;
    /**
     * Coding words or phrases of the name.
     * 
     */
    @JsonProperty("namePart")
    @JsonPropertyDescription("Coding words or phrases of the name.")
    private List<MedicinalProduct_NamePart> namePart = new ArrayList<MedicinalProduct_NamePart>();
    /**
     * Country where the name applies.
     * 
     */
    @JsonProperty("countryLanguage")
    @JsonPropertyDescription("Country where the name applies.")
    private List<MedicinalProduct_CountryLanguage> countryLanguage = new ArrayList<MedicinalProduct_CountryLanguage>();

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
    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_productName")
    public Element get_productName() {
        return _productName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_productName")
    public void set_productName(Element _productName) {
        this._productName = _productName;
    }

    /**
     * Coding words or phrases of the name.
     * 
     */
    @JsonProperty("namePart")
    public List<MedicinalProduct_NamePart> getNamePart() {
        return namePart;
    }

    /**
     * Coding words or phrases of the name.
     * 
     */
    @JsonProperty("namePart")
    public void setNamePart(List<MedicinalProduct_NamePart> namePart) {
        this.namePart = namePart;
    }

    /**
     * Country where the name applies.
     * 
     */
    @JsonProperty("countryLanguage")
    public List<MedicinalProduct_CountryLanguage> getCountryLanguage() {
        return countryLanguage;
    }

    /**
     * Country where the name applies.
     * 
     */
    @JsonProperty("countryLanguage")
    public void setCountryLanguage(List<MedicinalProduct_CountryLanguage> countryLanguage) {
        this.countryLanguage = countryLanguage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicinalProduct_Name.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("_productName");
        sb.append('=');
        sb.append(((this._productName == null)?"<null>":this._productName));
        sb.append(',');
        sb.append("namePart");
        sb.append('=');
        sb.append(((this.namePart == null)?"<null>":this.namePart));
        sb.append(',');
        sb.append("countryLanguage");
        sb.append('=');
        sb.append(((this.countryLanguage == null)?"<null>":this.countryLanguage));
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
        result = ((result* 31)+((this.countryLanguage == null)? 0 :this.countryLanguage.hashCode()));
        result = ((result* 31)+((this._productName == null)? 0 :this._productName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.namePart == null)? 0 :this.namePart.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProduct_Name) == false) {
            return false;
        }
        MedicinalProduct_Name rhs = ((MedicinalProduct_Name) other);
        return ((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.countryLanguage == rhs.countryLanguage)||((this.countryLanguage!= null)&&this.countryLanguage.equals(rhs.countryLanguage))))&&((this._productName == rhs._productName)||((this._productName!= null)&&this._productName.equals(rhs._productName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.namePart == rhs.namePart)||((this.namePart!= null)&&this.namePart.equals(rhs.namePart))))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))));
    }

}
