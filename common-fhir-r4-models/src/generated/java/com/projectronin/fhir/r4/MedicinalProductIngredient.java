
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
 * An ingredient of a manufactured item or pharmaceutical product.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "role",
    "allergenicIndicator",
    "_allergenicIndicator",
    "manufacturer",
    "specifiedSubstance",
    "substance"
})
@Generated("jsonschema2pojo")
public class MedicinalProductIngredient
    extends DomainResource
{

    /**
     * This is a MedicinalProductIngredient resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductIngredient resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept role;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allergenicIndicator")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean allergenicIndicator;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allergenicIndicator")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _allergenicIndicator;
    /**
     * Manufacturer of this Ingredient.
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("Manufacturer of this Ingredient.")
    private List<Reference> manufacturer = new ArrayList<Reference>();
    /**
     * A specified substance that comprises this ingredient.
     * 
     */
    @JsonProperty("specifiedSubstance")
    @JsonPropertyDescription("A specified substance that comprises this ingredient.")
    private List<MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance = new ArrayList<MedicinalProductIngredient_SpecifiedSubstance>();
    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     * 
     */
    @JsonProperty("substance")
    @JsonPropertyDescription("An ingredient of a manufactured item or pharmaceutical product.")
    private MedicinalProductIngredient_Substance substance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicinalProductIngredient resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductIngredient resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("role")
    public CodeableConcept getRole() {
        return role;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("role")
    public void setRole(CodeableConcept role) {
        this.role = role;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allergenicIndicator")
    public Boolean getAllergenicIndicator() {
        return allergenicIndicator;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("allergenicIndicator")
    public void setAllergenicIndicator(Boolean allergenicIndicator) {
        this.allergenicIndicator = allergenicIndicator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allergenicIndicator")
    public Element get_allergenicIndicator() {
        return _allergenicIndicator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_allergenicIndicator")
    public void set_allergenicIndicator(Element _allergenicIndicator) {
        this._allergenicIndicator = _allergenicIndicator;
    }

    /**
     * Manufacturer of this Ingredient.
     * 
     */
    @JsonProperty("manufacturer")
    public List<Reference> getManufacturer() {
        return manufacturer;
    }

    /**
     * Manufacturer of this Ingredient.
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(List<Reference> manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * A specified substance that comprises this ingredient.
     * 
     */
    @JsonProperty("specifiedSubstance")
    public List<MedicinalProductIngredient_SpecifiedSubstance> getSpecifiedSubstance() {
        return specifiedSubstance;
    }

    /**
     * A specified substance that comprises this ingredient.
     * 
     */
    @JsonProperty("specifiedSubstance")
    public void setSpecifiedSubstance(List<MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance) {
        this.specifiedSubstance = specifiedSubstance;
    }

    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     * 
     */
    @JsonProperty("substance")
    public MedicinalProductIngredient_Substance getSubstance() {
        return substance;
    }

    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     * 
     */
    @JsonProperty("substance")
    public void setSubstance(MedicinalProductIngredient_Substance substance) {
        this.substance = substance;
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
        sb.append(MedicinalProductIngredient.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("allergenicIndicator");
        sb.append('=');
        sb.append(((this.allergenicIndicator == null)?"<null>":this.allergenicIndicator));
        sb.append(',');
        sb.append("_allergenicIndicator");
        sb.append('=');
        sb.append(((this._allergenicIndicator == null)?"<null>":this._allergenicIndicator));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("specifiedSubstance");
        sb.append('=');
        sb.append(((this.specifiedSubstance == null)?"<null>":this.specifiedSubstance));
        sb.append(',');
        sb.append("substance");
        sb.append('=');
        sb.append(((this.substance == null)?"<null>":this.substance));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.substance == null)? 0 :this.substance.hashCode()));
        result = ((result* 31)+((this._allergenicIndicator == null)? 0 :this._allergenicIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.allergenicIndicator == null)? 0 :this.allergenicIndicator.hashCode()));
        result = ((result* 31)+((this.specifiedSubstance == null)? 0 :this.specifiedSubstance.hashCode()));
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
        if ((other instanceof MedicinalProductIngredient) == false) {
            return false;
        }
        MedicinalProductIngredient rhs = ((MedicinalProductIngredient) other);
        return (((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.substance == rhs.substance)||((this.substance!= null)&&this.substance.equals(rhs.substance))))&&((this._allergenicIndicator == rhs._allergenicIndicator)||((this._allergenicIndicator!= null)&&this._allergenicIndicator.equals(rhs._allergenicIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.allergenicIndicator == rhs.allergenicIndicator)||((this.allergenicIndicator!= null)&&this.allergenicIndicator.equals(rhs.allergenicIndicator))))&&((this.specifiedSubstance == rhs.specifiedSubstance)||((this.specifiedSubstance!= null)&&this.specifiedSubstance.equals(rhs.specifiedSubstance))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))));
    }

}
