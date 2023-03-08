
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
 * A pharmaceutical product described in terms of its composition and dose form.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "administrableDoseForm",
    "unitOfPresentation",
    "ingredient",
    "device",
    "characteristics",
    "routeOfAdministration"
})
@Generated("jsonschema2pojo")
public class MedicinalProductPharmaceutical
    extends DomainResource
{

    /**
     * This is a MedicinalProductPharmaceutical resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductPharmaceutical resource")
    private String resourceType;
    /**
     * An identifier for the pharmaceutical medicinal product.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier for the pharmaceutical medicinal product.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("administrableDoseForm")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept administrableDoseForm;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfPresentation")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept unitOfPresentation;
    /**
     * Ingredient.
     * 
     */
    @JsonProperty("ingredient")
    @JsonPropertyDescription("Ingredient.")
    private List<Reference> ingredient = new ArrayList<Reference>();
    /**
     * Accompanying device.
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("Accompanying device.")
    private List<Reference> device = new ArrayList<Reference>();
    /**
     * Characteristics e.g. a products onset of action.
     * 
     */
    @JsonProperty("characteristics")
    @JsonPropertyDescription("Characteristics e.g. a products onset of action.")
    private List<MedicinalProductPharmaceutical_Characteristics> characteristics = new ArrayList<MedicinalProductPharmaceutical_Characteristics>();
    /**
     * The path by which the pharmaceutical product is taken into or makes contact with the body.
     * (Required)
     * 
     */
    @JsonProperty("routeOfAdministration")
    @JsonPropertyDescription("The path by which the pharmaceutical product is taken into or makes contact with the body.")
    private List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration = new ArrayList<MedicinalProductPharmaceutical_RouteOfAdministration>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicinalProductPharmaceutical resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductPharmaceutical resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier for the pharmaceutical medicinal product.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * An identifier for the pharmaceutical medicinal product.
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
    @JsonProperty("administrableDoseForm")
    public CodeableConcept getAdministrableDoseForm() {
        return administrableDoseForm;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("administrableDoseForm")
    public void setAdministrableDoseForm(CodeableConcept administrableDoseForm) {
        this.administrableDoseForm = administrableDoseForm;
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
     * Accompanying device.
     * 
     */
    @JsonProperty("device")
    public List<Reference> getDevice() {
        return device;
    }

    /**
     * Accompanying device.
     * 
     */
    @JsonProperty("device")
    public void setDevice(List<Reference> device) {
        this.device = device;
    }

    /**
     * Characteristics e.g. a products onset of action.
     * 
     */
    @JsonProperty("characteristics")
    public List<MedicinalProductPharmaceutical_Characteristics> getCharacteristics() {
        return characteristics;
    }

    /**
     * Characteristics e.g. a products onset of action.
     * 
     */
    @JsonProperty("characteristics")
    public void setCharacteristics(List<MedicinalProductPharmaceutical_Characteristics> characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * The path by which the pharmaceutical product is taken into or makes contact with the body.
     * (Required)
     * 
     */
    @JsonProperty("routeOfAdministration")
    public List<MedicinalProductPharmaceutical_RouteOfAdministration> getRouteOfAdministration() {
        return routeOfAdministration;
    }

    /**
     * The path by which the pharmaceutical product is taken into or makes contact with the body.
     * (Required)
     * 
     */
    @JsonProperty("routeOfAdministration")
    public void setRouteOfAdministration(List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
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
        sb.append(MedicinalProductPharmaceutical.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("administrableDoseForm");
        sb.append('=');
        sb.append(((this.administrableDoseForm == null)?"<null>":this.administrableDoseForm));
        sb.append(',');
        sb.append("unitOfPresentation");
        sb.append('=');
        sb.append(((this.unitOfPresentation == null)?"<null>":this.unitOfPresentation));
        sb.append(',');
        sb.append("ingredient");
        sb.append('=');
        sb.append(((this.ingredient == null)?"<null>":this.ingredient));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        sb.append("characteristics");
        sb.append('=');
        sb.append(((this.characteristics == null)?"<null>":this.characteristics));
        sb.append(',');
        sb.append("routeOfAdministration");
        sb.append('=');
        sb.append(((this.routeOfAdministration == null)?"<null>":this.routeOfAdministration));
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
        result = ((result* 31)+((this.characteristics == null)? 0 :this.characteristics.hashCode()));
        result = ((result* 31)+((this.administrableDoseForm == null)? 0 :this.administrableDoseForm.hashCode()));
        result = ((result* 31)+((this.unitOfPresentation == null)? 0 :this.unitOfPresentation.hashCode()));
        result = ((result* 31)+((this.ingredient == null)? 0 :this.ingredient.hashCode()));
        result = ((result* 31)+((this.routeOfAdministration == null)? 0 :this.routeOfAdministration.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductPharmaceutical) == false) {
            return false;
        }
        MedicinalProductPharmaceutical rhs = ((MedicinalProductPharmaceutical) other);
        return (((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.characteristics == rhs.characteristics)||((this.characteristics!= null)&&this.characteristics.equals(rhs.characteristics))))&&((this.administrableDoseForm == rhs.administrableDoseForm)||((this.administrableDoseForm!= null)&&this.administrableDoseForm.equals(rhs.administrableDoseForm))))&&((this.unitOfPresentation == rhs.unitOfPresentation)||((this.unitOfPresentation!= null)&&this.unitOfPresentation.equals(rhs.unitOfPresentation))))&&((this.ingredient == rhs.ingredient)||((this.ingredient!= null)&&this.ingredient.equals(rhs.ingredient))))&&((this.routeOfAdministration == rhs.routeOfAdministration)||((this.routeOfAdministration!= null)&&this.routeOfAdministration.equals(rhs.routeOfAdministration))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
