
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
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "type",
    "domain",
    "combinedPharmaceuticalDoseForm",
    "legalStatusOfSupply",
    "additionalMonitoringIndicator",
    "specialMeasures",
    "_specialMeasures",
    "paediatricUseIndicator",
    "productClassification",
    "marketingStatus",
    "pharmaceuticalProduct",
    "packagedMedicinalProduct",
    "attachedDocument",
    "masterFile",
    "contact",
    "clinicalTrial",
    "name",
    "crossReference",
    "manufacturingBusinessOperation",
    "specialDesignation"
})
@Generated("jsonschema2pojo")
public class MedicinalProduct
    extends DomainResource
{

    /**
     * This is a MedicinalProduct resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProduct resource")
    private String resourceType;
    /**
     * Business identifier for this product. Could be an MPID.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifier for this product. Could be an MPID.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding domain;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("combinedPharmaceuticalDoseForm")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept combinedPharmaceuticalDoseForm;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalStatusOfSupply")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept legalStatusOfSupply;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("additionalMonitoringIndicator")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept additionalMonitoringIndicator;
    /**
     * Whether the Medicinal Product is subject to special measures for regulatory reasons.
     * 
     */
    @JsonProperty("specialMeasures")
    @JsonPropertyDescription("Whether the Medicinal Product is subject to special measures for regulatory reasons.")
    private List<String> specialMeasures = new ArrayList<String>();
    /**
     * Extensions for specialMeasures
     * 
     */
    @JsonProperty("_specialMeasures")
    @JsonPropertyDescription("Extensions for specialMeasures")
    private List<Element> _specialMeasures = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("paediatricUseIndicator")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept paediatricUseIndicator;
    /**
     * Allows the product to be classified by various systems.
     * 
     */
    @JsonProperty("productClassification")
    @JsonPropertyDescription("Allows the product to be classified by various systems.")
    private List<CodeableConcept> productClassification = new ArrayList<CodeableConcept>();
    /**
     * Marketing status of the medicinal product, in contrast to marketing authorizaton.
     * 
     */
    @JsonProperty("marketingStatus")
    @JsonPropertyDescription("Marketing status of the medicinal product, in contrast to marketing authorizaton.")
    private List<MarketingStatus> marketingStatus = new ArrayList<MarketingStatus>();
    /**
     * Pharmaceutical aspects of product.
     * 
     */
    @JsonProperty("pharmaceuticalProduct")
    @JsonPropertyDescription("Pharmaceutical aspects of product.")
    private List<Reference> pharmaceuticalProduct = new ArrayList<Reference>();
    /**
     * Package representation for the product.
     * 
     */
    @JsonProperty("packagedMedicinalProduct")
    @JsonPropertyDescription("Package representation for the product.")
    private List<Reference> packagedMedicinalProduct = new ArrayList<Reference>();
    /**
     * Supporting documentation, typically for regulatory submission.
     * 
     */
    @JsonProperty("attachedDocument")
    @JsonPropertyDescription("Supporting documentation, typically for regulatory submission.")
    private List<Reference> attachedDocument = new ArrayList<Reference>();
    /**
     * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
     * 
     */
    @JsonProperty("masterFile")
    @JsonPropertyDescription("A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).")
    private List<Reference> masterFile = new ArrayList<Reference>();
    /**
     * A product specific contact, person (in a role), or an organization.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("A product specific contact, person (in a role), or an organization.")
    private List<Reference> contact = new ArrayList<Reference>();
    /**
     * Clinical trials or studies that this product is involved in.
     * 
     */
    @JsonProperty("clinicalTrial")
    @JsonPropertyDescription("Clinical trials or studies that this product is involved in.")
    private List<Reference> clinicalTrial = new ArrayList<Reference>();
    /**
     * The product's name, including full name and possibly coded parts.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The product's name, including full name and possibly coded parts.")
    private List<MedicinalProduct_Name> name = new ArrayList<MedicinalProduct_Name>();
    /**
     * Reference to another product, e.g. for linking authorised to investigational product.
     * 
     */
    @JsonProperty("crossReference")
    @JsonPropertyDescription("Reference to another product, e.g. for linking authorised to investigational product.")
    private List<Identifier> crossReference = new ArrayList<Identifier>();
    /**
     * An operation applied to the product, for manufacturing or adminsitrative purpose.
     * 
     */
    @JsonProperty("manufacturingBusinessOperation")
    @JsonPropertyDescription("An operation applied to the product, for manufacturing or adminsitrative purpose.")
    private List<MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation = new ArrayList<MedicinalProduct_ManufacturingBusinessOperation>();
    /**
     * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
     * 
     */
    @JsonProperty("specialDesignation")
    @JsonPropertyDescription("Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.")
    private List<MedicinalProduct_SpecialDesignation> specialDesignation = new ArrayList<MedicinalProduct_SpecialDesignation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicinalProduct resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProduct resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifier for this product. Could be an MPID.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifier for this product. Could be an MPID.
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
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("domain")
    public Coding getDomain() {
        return domain;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(Coding domain) {
        this.domain = domain;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("combinedPharmaceuticalDoseForm")
    public CodeableConcept getCombinedPharmaceuticalDoseForm() {
        return combinedPharmaceuticalDoseForm;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("combinedPharmaceuticalDoseForm")
    public void setCombinedPharmaceuticalDoseForm(CodeableConcept combinedPharmaceuticalDoseForm) {
        this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalStatusOfSupply")
    public CodeableConcept getLegalStatusOfSupply() {
        return legalStatusOfSupply;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalStatusOfSupply")
    public void setLegalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
        this.legalStatusOfSupply = legalStatusOfSupply;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("additionalMonitoringIndicator")
    public CodeableConcept getAdditionalMonitoringIndicator() {
        return additionalMonitoringIndicator;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("additionalMonitoringIndicator")
    public void setAdditionalMonitoringIndicator(CodeableConcept additionalMonitoringIndicator) {
        this.additionalMonitoringIndicator = additionalMonitoringIndicator;
    }

    /**
     * Whether the Medicinal Product is subject to special measures for regulatory reasons.
     * 
     */
    @JsonProperty("specialMeasures")
    public List<String> getSpecialMeasures() {
        return specialMeasures;
    }

    /**
     * Whether the Medicinal Product is subject to special measures for regulatory reasons.
     * 
     */
    @JsonProperty("specialMeasures")
    public void setSpecialMeasures(List<String> specialMeasures) {
        this.specialMeasures = specialMeasures;
    }

    /**
     * Extensions for specialMeasures
     * 
     */
    @JsonProperty("_specialMeasures")
    public List<Element> get_specialMeasures() {
        return _specialMeasures;
    }

    /**
     * Extensions for specialMeasures
     * 
     */
    @JsonProperty("_specialMeasures")
    public void set_specialMeasures(List<Element> _specialMeasures) {
        this._specialMeasures = _specialMeasures;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("paediatricUseIndicator")
    public CodeableConcept getPaediatricUseIndicator() {
        return paediatricUseIndicator;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("paediatricUseIndicator")
    public void setPaediatricUseIndicator(CodeableConcept paediatricUseIndicator) {
        this.paediatricUseIndicator = paediatricUseIndicator;
    }

    /**
     * Allows the product to be classified by various systems.
     * 
     */
    @JsonProperty("productClassification")
    public List<CodeableConcept> getProductClassification() {
        return productClassification;
    }

    /**
     * Allows the product to be classified by various systems.
     * 
     */
    @JsonProperty("productClassification")
    public void setProductClassification(List<CodeableConcept> productClassification) {
        this.productClassification = productClassification;
    }

    /**
     * Marketing status of the medicinal product, in contrast to marketing authorizaton.
     * 
     */
    @JsonProperty("marketingStatus")
    public List<MarketingStatus> getMarketingStatus() {
        return marketingStatus;
    }

    /**
     * Marketing status of the medicinal product, in contrast to marketing authorizaton.
     * 
     */
    @JsonProperty("marketingStatus")
    public void setMarketingStatus(List<MarketingStatus> marketingStatus) {
        this.marketingStatus = marketingStatus;
    }

    /**
     * Pharmaceutical aspects of product.
     * 
     */
    @JsonProperty("pharmaceuticalProduct")
    public List<Reference> getPharmaceuticalProduct() {
        return pharmaceuticalProduct;
    }

    /**
     * Pharmaceutical aspects of product.
     * 
     */
    @JsonProperty("pharmaceuticalProduct")
    public void setPharmaceuticalProduct(List<Reference> pharmaceuticalProduct) {
        this.pharmaceuticalProduct = pharmaceuticalProduct;
    }

    /**
     * Package representation for the product.
     * 
     */
    @JsonProperty("packagedMedicinalProduct")
    public List<Reference> getPackagedMedicinalProduct() {
        return packagedMedicinalProduct;
    }

    /**
     * Package representation for the product.
     * 
     */
    @JsonProperty("packagedMedicinalProduct")
    public void setPackagedMedicinalProduct(List<Reference> packagedMedicinalProduct) {
        this.packagedMedicinalProduct = packagedMedicinalProduct;
    }

    /**
     * Supporting documentation, typically for regulatory submission.
     * 
     */
    @JsonProperty("attachedDocument")
    public List<Reference> getAttachedDocument() {
        return attachedDocument;
    }

    /**
     * Supporting documentation, typically for regulatory submission.
     * 
     */
    @JsonProperty("attachedDocument")
    public void setAttachedDocument(List<Reference> attachedDocument) {
        this.attachedDocument = attachedDocument;
    }

    /**
     * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
     * 
     */
    @JsonProperty("masterFile")
    public List<Reference> getMasterFile() {
        return masterFile;
    }

    /**
     * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
     * 
     */
    @JsonProperty("masterFile")
    public void setMasterFile(List<Reference> masterFile) {
        this.masterFile = masterFile;
    }

    /**
     * A product specific contact, person (in a role), or an organization.
     * 
     */
    @JsonProperty("contact")
    public List<Reference> getContact() {
        return contact;
    }

    /**
     * A product specific contact, person (in a role), or an organization.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<Reference> contact) {
        this.contact = contact;
    }

    /**
     * Clinical trials or studies that this product is involved in.
     * 
     */
    @JsonProperty("clinicalTrial")
    public List<Reference> getClinicalTrial() {
        return clinicalTrial;
    }

    /**
     * Clinical trials or studies that this product is involved in.
     * 
     */
    @JsonProperty("clinicalTrial")
    public void setClinicalTrial(List<Reference> clinicalTrial) {
        this.clinicalTrial = clinicalTrial;
    }

    /**
     * The product's name, including full name and possibly coded parts.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public List<MedicinalProduct_Name> getName() {
        return name;
    }

    /**
     * The product's name, including full name and possibly coded parts.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(List<MedicinalProduct_Name> name) {
        this.name = name;
    }

    /**
     * Reference to another product, e.g. for linking authorised to investigational product.
     * 
     */
    @JsonProperty("crossReference")
    public List<Identifier> getCrossReference() {
        return crossReference;
    }

    /**
     * Reference to another product, e.g. for linking authorised to investigational product.
     * 
     */
    @JsonProperty("crossReference")
    public void setCrossReference(List<Identifier> crossReference) {
        this.crossReference = crossReference;
    }

    /**
     * An operation applied to the product, for manufacturing or adminsitrative purpose.
     * 
     */
    @JsonProperty("manufacturingBusinessOperation")
    public List<MedicinalProduct_ManufacturingBusinessOperation> getManufacturingBusinessOperation() {
        return manufacturingBusinessOperation;
    }

    /**
     * An operation applied to the product, for manufacturing or adminsitrative purpose.
     * 
     */
    @JsonProperty("manufacturingBusinessOperation")
    public void setManufacturingBusinessOperation(List<MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation) {
        this.manufacturingBusinessOperation = manufacturingBusinessOperation;
    }

    /**
     * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
     * 
     */
    @JsonProperty("specialDesignation")
    public List<MedicinalProduct_SpecialDesignation> getSpecialDesignation() {
        return specialDesignation;
    }

    /**
     * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
     * 
     */
    @JsonProperty("specialDesignation")
    public void setSpecialDesignation(List<MedicinalProduct_SpecialDesignation> specialDesignation) {
        this.specialDesignation = specialDesignation;
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
        sb.append(MedicinalProduct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("combinedPharmaceuticalDoseForm");
        sb.append('=');
        sb.append(((this.combinedPharmaceuticalDoseForm == null)?"<null>":this.combinedPharmaceuticalDoseForm));
        sb.append(',');
        sb.append("legalStatusOfSupply");
        sb.append('=');
        sb.append(((this.legalStatusOfSupply == null)?"<null>":this.legalStatusOfSupply));
        sb.append(',');
        sb.append("additionalMonitoringIndicator");
        sb.append('=');
        sb.append(((this.additionalMonitoringIndicator == null)?"<null>":this.additionalMonitoringIndicator));
        sb.append(',');
        sb.append("specialMeasures");
        sb.append('=');
        sb.append(((this.specialMeasures == null)?"<null>":this.specialMeasures));
        sb.append(',');
        sb.append("_specialMeasures");
        sb.append('=');
        sb.append(((this._specialMeasures == null)?"<null>":this._specialMeasures));
        sb.append(',');
        sb.append("paediatricUseIndicator");
        sb.append('=');
        sb.append(((this.paediatricUseIndicator == null)?"<null>":this.paediatricUseIndicator));
        sb.append(',');
        sb.append("productClassification");
        sb.append('=');
        sb.append(((this.productClassification == null)?"<null>":this.productClassification));
        sb.append(',');
        sb.append("marketingStatus");
        sb.append('=');
        sb.append(((this.marketingStatus == null)?"<null>":this.marketingStatus));
        sb.append(',');
        sb.append("pharmaceuticalProduct");
        sb.append('=');
        sb.append(((this.pharmaceuticalProduct == null)?"<null>":this.pharmaceuticalProduct));
        sb.append(',');
        sb.append("packagedMedicinalProduct");
        sb.append('=');
        sb.append(((this.packagedMedicinalProduct == null)?"<null>":this.packagedMedicinalProduct));
        sb.append(',');
        sb.append("attachedDocument");
        sb.append('=');
        sb.append(((this.attachedDocument == null)?"<null>":this.attachedDocument));
        sb.append(',');
        sb.append("masterFile");
        sb.append('=');
        sb.append(((this.masterFile == null)?"<null>":this.masterFile));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("clinicalTrial");
        sb.append('=');
        sb.append(((this.clinicalTrial == null)?"<null>":this.clinicalTrial));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("crossReference");
        sb.append('=');
        sb.append(((this.crossReference == null)?"<null>":this.crossReference));
        sb.append(',');
        sb.append("manufacturingBusinessOperation");
        sb.append('=');
        sb.append(((this.manufacturingBusinessOperation == null)?"<null>":this.manufacturingBusinessOperation));
        sb.append(',');
        sb.append("specialDesignation");
        sb.append('=');
        sb.append(((this.specialDesignation == null)?"<null>":this.specialDesignation));
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
        result = ((result* 31)+((this.attachedDocument == null)? 0 :this.attachedDocument.hashCode()));
        result = ((result* 31)+((this.manufacturingBusinessOperation == null)? 0 :this.manufacturingBusinessOperation.hashCode()));
        result = ((result* 31)+((this.additionalMonitoringIndicator == null)? 0 :this.additionalMonitoringIndicator.hashCode()));
        result = ((result* 31)+((this.pharmaceuticalProduct == null)? 0 :this.pharmaceuticalProduct.hashCode()));
        result = ((result* 31)+((this.crossReference == null)? 0 :this.crossReference.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.packagedMedicinalProduct == null)? 0 :this.packagedMedicinalProduct.hashCode()));
        result = ((result* 31)+((this._specialMeasures == null)? 0 :this._specialMeasures.hashCode()));
        result = ((result* 31)+((this.marketingStatus == null)? 0 :this.marketingStatus.hashCode()));
        result = ((result* 31)+((this.specialMeasures == null)? 0 :this.specialMeasures.hashCode()));
        result = ((result* 31)+((this.masterFile == null)? 0 :this.masterFile.hashCode()));
        result = ((result* 31)+((this.productClassification == null)? 0 :this.productClassification.hashCode()));
        result = ((result* 31)+((this.legalStatusOfSupply == null)? 0 :this.legalStatusOfSupply.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.specialDesignation == null)? 0 :this.specialDesignation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paediatricUseIndicator == null)? 0 :this.paediatricUseIndicator.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.combinedPharmaceuticalDoseForm == null)? 0 :this.combinedPharmaceuticalDoseForm.hashCode()));
        result = ((result* 31)+((this.clinicalTrial == null)? 0 :this.clinicalTrial.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProduct) == false) {
            return false;
        }
        MedicinalProduct rhs = ((MedicinalProduct) other);
        return (((((((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.attachedDocument == rhs.attachedDocument)||((this.attachedDocument!= null)&&this.attachedDocument.equals(rhs.attachedDocument))))&&((this.manufacturingBusinessOperation == rhs.manufacturingBusinessOperation)||((this.manufacturingBusinessOperation!= null)&&this.manufacturingBusinessOperation.equals(rhs.manufacturingBusinessOperation))))&&((this.additionalMonitoringIndicator == rhs.additionalMonitoringIndicator)||((this.additionalMonitoringIndicator!= null)&&this.additionalMonitoringIndicator.equals(rhs.additionalMonitoringIndicator))))&&((this.pharmaceuticalProduct == rhs.pharmaceuticalProduct)||((this.pharmaceuticalProduct!= null)&&this.pharmaceuticalProduct.equals(rhs.pharmaceuticalProduct))))&&((this.crossReference == rhs.crossReference)||((this.crossReference!= null)&&this.crossReference.equals(rhs.crossReference))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.packagedMedicinalProduct == rhs.packagedMedicinalProduct)||((this.packagedMedicinalProduct!= null)&&this.packagedMedicinalProduct.equals(rhs.packagedMedicinalProduct))))&&((this._specialMeasures == rhs._specialMeasures)||((this._specialMeasures!= null)&&this._specialMeasures.equals(rhs._specialMeasures))))&&((this.marketingStatus == rhs.marketingStatus)||((this.marketingStatus!= null)&&this.marketingStatus.equals(rhs.marketingStatus))))&&((this.specialMeasures == rhs.specialMeasures)||((this.specialMeasures!= null)&&this.specialMeasures.equals(rhs.specialMeasures))))&&((this.masterFile == rhs.masterFile)||((this.masterFile!= null)&&this.masterFile.equals(rhs.masterFile))))&&((this.productClassification == rhs.productClassification)||((this.productClassification!= null)&&this.productClassification.equals(rhs.productClassification))))&&((this.legalStatusOfSupply == rhs.legalStatusOfSupply)||((this.legalStatusOfSupply!= null)&&this.legalStatusOfSupply.equals(rhs.legalStatusOfSupply))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.specialDesignation == rhs.specialDesignation)||((this.specialDesignation!= null)&&this.specialDesignation.equals(rhs.specialDesignation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paediatricUseIndicator == rhs.paediatricUseIndicator)||((this.paediatricUseIndicator!= null)&&this.paediatricUseIndicator.equals(rhs.paediatricUseIndicator))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.combinedPharmaceuticalDoseForm == rhs.combinedPharmaceuticalDoseForm)||((this.combinedPharmaceuticalDoseForm!= null)&&this.combinedPharmaceuticalDoseForm.equals(rhs.combinedPharmaceuticalDoseForm))))&&((this.clinicalTrial == rhs.clinicalTrial)||((this.clinicalTrial!= null)&&this.clinicalTrial.equals(rhs.clinicalTrial))));
    }

}
