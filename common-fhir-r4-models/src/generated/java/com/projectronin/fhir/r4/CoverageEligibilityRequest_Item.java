
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "supportingInfoSequence",
    "_supportingInfoSequence",
    "category",
    "productOrService",
    "modifier",
    "provider",
    "quantity",
    "unitPrice",
    "facility",
    "diagnosis",
    "detail"
})
@Generated("jsonschema2pojo")
public class CoverageEligibilityRequest_Item {

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
     * Exceptions, special conditions and supporting information applicable for this service or product line.
     * 
     */
    @JsonProperty("supportingInfoSequence")
    @JsonPropertyDescription("Exceptions, special conditions and supporting information applicable for this service or product line.")
    private List<Double> supportingInfoSequence = new ArrayList<Double>();
    /**
     * Extensions for supportingInfoSequence
     * 
     */
    @JsonProperty("_supportingInfoSequence")
    @JsonPropertyDescription("Extensions for supportingInfoSequence")
    private List<Element> _supportingInfoSequence = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept category;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productOrService")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept productOrService;
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     * 
     */
    @JsonProperty("modifier")
    @JsonPropertyDescription("Item typification or modifiers codes to convey additional context for the product or service.")
    private List<CodeableConcept> modifier = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference provider;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money unitPrice;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("facility")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference facility;
    /**
     * Patient diagnosis for which care is sought.
     * 
     */
    @JsonProperty("diagnosis")
    @JsonPropertyDescription("Patient diagnosis for which care is sought.")
    private List<CoverageEligibilityRequest_Diagnosis> diagnosis = new ArrayList<CoverageEligibilityRequest_Diagnosis>();
    /**
     * The plan/proposal/order describing the proposed service in detail.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The plan/proposal/order describing the proposed service in detail.")
    private List<Reference> detail = new ArrayList<Reference>();

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
     * Exceptions, special conditions and supporting information applicable for this service or product line.
     * 
     */
    @JsonProperty("supportingInfoSequence")
    public List<Double> getSupportingInfoSequence() {
        return supportingInfoSequence;
    }

    /**
     * Exceptions, special conditions and supporting information applicable for this service or product line.
     * 
     */
    @JsonProperty("supportingInfoSequence")
    public void setSupportingInfoSequence(List<Double> supportingInfoSequence) {
        this.supportingInfoSequence = supportingInfoSequence;
    }

    /**
     * Extensions for supportingInfoSequence
     * 
     */
    @JsonProperty("_supportingInfoSequence")
    public List<Element> get_supportingInfoSequence() {
        return _supportingInfoSequence;
    }

    /**
     * Extensions for supportingInfoSequence
     * 
     */
    @JsonProperty("_supportingInfoSequence")
    public void set_supportingInfoSequence(List<Element> _supportingInfoSequence) {
        this._supportingInfoSequence = _supportingInfoSequence;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
        this.category = category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productOrService")
    public CodeableConcept getProductOrService() {
        return productOrService;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
        this.productOrService = productOrService;
    }

    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     * 
     */
    @JsonProperty("modifier")
    public List<CodeableConcept> getModifier() {
        return modifier;
    }

    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     * 
     */
    @JsonProperty("modifier")
    public void setModifier(List<CodeableConcept> modifier) {
        this.modifier = modifier;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public Reference getProvider() {
        return provider;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
        this.provider = provider;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(Money unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("facility")
    public Reference getFacility() {
        return facility;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("facility")
    public void setFacility(Reference facility) {
        this.facility = facility;
    }

    /**
     * Patient diagnosis for which care is sought.
     * 
     */
    @JsonProperty("diagnosis")
    public List<CoverageEligibilityRequest_Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    /**
     * Patient diagnosis for which care is sought.
     * 
     */
    @JsonProperty("diagnosis")
    public void setDiagnosis(List<CoverageEligibilityRequest_Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * The plan/proposal/order describing the proposed service in detail.
     * 
     */
    @JsonProperty("detail")
    public List<Reference> getDetail() {
        return detail;
    }

    /**
     * The plan/proposal/order describing the proposed service in detail.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(List<Reference> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoverageEligibilityRequest_Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("supportingInfoSequence");
        sb.append('=');
        sb.append(((this.supportingInfoSequence == null)?"<null>":this.supportingInfoSequence));
        sb.append(',');
        sb.append("_supportingInfoSequence");
        sb.append('=');
        sb.append(((this._supportingInfoSequence == null)?"<null>":this._supportingInfoSequence));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("productOrService");
        sb.append('=');
        sb.append(((this.productOrService == null)?"<null>":this.productOrService));
        sb.append(',');
        sb.append("modifier");
        sb.append('=');
        sb.append(((this.modifier == null)?"<null>":this.modifier));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("facility");
        sb.append('=');
        sb.append(((this.facility == null)?"<null>":this.facility));
        sb.append(',');
        sb.append("diagnosis");
        sb.append('=');
        sb.append(((this.diagnosis == null)?"<null>":this.diagnosis));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._supportingInfoSequence == null)? 0 :this._supportingInfoSequence.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.modifier == null)? 0 :this.modifier.hashCode()));
        result = ((result* 31)+((this.diagnosis == null)? 0 :this.diagnosis.hashCode()));
        result = ((result* 31)+((this.productOrService == null)? 0 :this.productOrService.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.supportingInfoSequence == null)? 0 :this.supportingInfoSequence.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.facility == null)? 0 :this.facility.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoverageEligibilityRequest_Item) == false) {
            return false;
        }
        CoverageEligibilityRequest_Item rhs = ((CoverageEligibilityRequest_Item) other);
        return (((((((((((((((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._supportingInfoSequence == rhs._supportingInfoSequence)||((this._supportingInfoSequence!= null)&&this._supportingInfoSequence.equals(rhs._supportingInfoSequence))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.modifier == rhs.modifier)||((this.modifier!= null)&&this.modifier.equals(rhs.modifier))))&&((this.diagnosis == rhs.diagnosis)||((this.diagnosis!= null)&&this.diagnosis.equals(rhs.diagnosis))))&&((this.productOrService == rhs.productOrService)||((this.productOrService!= null)&&this.productOrService.equals(rhs.productOrService))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.supportingInfoSequence == rhs.supportingInfoSequence)||((this.supportingInfoSequence!= null)&&this.supportingInfoSequence.equals(rhs.supportingInfoSequence))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.facility == rhs.facility)||((this.facility!= null)&&this.facility.equals(rhs.facility))));
    }

}
