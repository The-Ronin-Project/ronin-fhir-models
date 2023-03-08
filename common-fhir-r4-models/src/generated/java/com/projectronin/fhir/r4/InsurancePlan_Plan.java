
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Details of a Health Insurance product/plan provided by an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "identifier",
    "type",
    "coverageArea",
    "network",
    "generalCost",
    "specificCost"
})
@Generated("jsonschema2pojo")
public class InsurancePlan_Plan {

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
     * Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * The geographic region in which a health insurance plan's benefits apply.
     * 
     */
    @JsonProperty("coverageArea")
    @JsonPropertyDescription("The geographic region in which a health insurance plan's benefits apply.")
    private List<Reference> coverageArea = new ArrayList<Reference>();
    /**
     * Reference to the network that providing the type of coverage.
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("Reference to the network that providing the type of coverage.")
    private List<Reference> network = new ArrayList<Reference>();
    /**
     * Overall costs associated with the plan.
     * 
     */
    @JsonProperty("generalCost")
    @JsonPropertyDescription("Overall costs associated with the plan.")
    private List<InsurancePlan_GeneralCost> generalCost = new ArrayList<InsurancePlan_GeneralCost>();
    /**
     * Costs associated with the coverage provided by the product.
     * 
     */
    @JsonProperty("specificCost")
    @JsonPropertyDescription("Costs associated with the coverage provided by the product.")
    private List<InsurancePlan_SpecificCost> specificCost = new ArrayList<InsurancePlan_SpecificCost>();

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
     * Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
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
     * The geographic region in which a health insurance plan's benefits apply.
     * 
     */
    @JsonProperty("coverageArea")
    public List<Reference> getCoverageArea() {
        return coverageArea;
    }

    /**
     * The geographic region in which a health insurance plan's benefits apply.
     * 
     */
    @JsonProperty("coverageArea")
    public void setCoverageArea(List<Reference> coverageArea) {
        this.coverageArea = coverageArea;
    }

    /**
     * Reference to the network that providing the type of coverage.
     * 
     */
    @JsonProperty("network")
    public List<Reference> getNetwork() {
        return network;
    }

    /**
     * Reference to the network that providing the type of coverage.
     * 
     */
    @JsonProperty("network")
    public void setNetwork(List<Reference> network) {
        this.network = network;
    }

    /**
     * Overall costs associated with the plan.
     * 
     */
    @JsonProperty("generalCost")
    public List<InsurancePlan_GeneralCost> getGeneralCost() {
        return generalCost;
    }

    /**
     * Overall costs associated with the plan.
     * 
     */
    @JsonProperty("generalCost")
    public void setGeneralCost(List<InsurancePlan_GeneralCost> generalCost) {
        this.generalCost = generalCost;
    }

    /**
     * Costs associated with the coverage provided by the product.
     * 
     */
    @JsonProperty("specificCost")
    public List<InsurancePlan_SpecificCost> getSpecificCost() {
        return specificCost;
    }

    /**
     * Costs associated with the coverage provided by the product.
     * 
     */
    @JsonProperty("specificCost")
    public void setSpecificCost(List<InsurancePlan_SpecificCost> specificCost) {
        this.specificCost = specificCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InsurancePlan_Plan.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("coverageArea");
        sb.append('=');
        sb.append(((this.coverageArea == null)?"<null>":this.coverageArea));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
        sb.append(',');
        sb.append("generalCost");
        sb.append('=');
        sb.append(((this.generalCost == null)?"<null>":this.generalCost));
        sb.append(',');
        sb.append("specificCost");
        sb.append('=');
        sb.append(((this.specificCost == null)?"<null>":this.specificCost));
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
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.specificCost == null)? 0 :this.specificCost.hashCode()));
        result = ((result* 31)+((this.coverageArea == null)? 0 :this.coverageArea.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.generalCost == null)? 0 :this.generalCost.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InsurancePlan_Plan) == false) {
            return false;
        }
        InsurancePlan_Plan rhs = ((InsurancePlan_Plan) other);
        return ((((((((((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.specificCost == rhs.specificCost)||((this.specificCost!= null)&&this.specificCost.equals(rhs.specificCost))))&&((this.coverageArea == rhs.coverageArea)||((this.coverageArea!= null)&&this.coverageArea.equals(rhs.coverageArea))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.generalCost == rhs.generalCost)||((this.generalCost!= null)&&this.generalCost.equals(rhs.generalCost))));
    }

}
