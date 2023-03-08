
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
 * Information about a medication that is used to support knowledge.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "code",
    "status",
    "_status",
    "manufacturer",
    "doseForm",
    "amount",
    "synonym",
    "_synonym",
    "relatedMedicationKnowledge",
    "associatedMedication",
    "productType",
    "monograph",
    "ingredient",
    "preparationInstruction",
    "_preparationInstruction",
    "intendedRoute",
    "cost",
    "monitoringProgram",
    "administrationGuidelines",
    "medicineClassification",
    "packaging",
    "drugCharacteristic",
    "contraindication",
    "regulatory",
    "kinetics"
})
@Generated("jsonschema2pojo")
public class MedicationKnowledge
    extends DomainResource
{

    /**
     * This is a MedicationKnowledge resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicationKnowledge resource")
    private String resourceType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference manufacturer;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("doseForm")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept doseForm;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity amount;
    /**
     * Additional names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.
     * 
     */
    @JsonProperty("synonym")
    @JsonPropertyDescription("Additional names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.")
    private List<String> synonym = new ArrayList<String>();
    /**
     * Extensions for synonym
     * 
     */
    @JsonProperty("_synonym")
    @JsonPropertyDescription("Extensions for synonym")
    private List<Element> _synonym = new ArrayList<Element>();
    /**
     * Associated or related knowledge about a medication.
     * 
     */
    @JsonProperty("relatedMedicationKnowledge")
    @JsonPropertyDescription("Associated or related knowledge about a medication.")
    private List<MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge = new ArrayList<MedicationKnowledge_RelatedMedicationKnowledge>();
    /**
     * Associated or related medications.  For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor).
     * 
     */
    @JsonProperty("associatedMedication")
    @JsonPropertyDescription("Associated or related medications.  For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor).")
    private List<Reference> associatedMedication = new ArrayList<Reference>();
    /**
     * Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).
     * 
     */
    @JsonProperty("productType")
    @JsonPropertyDescription("Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).")
    private List<CodeableConcept> productType = new ArrayList<CodeableConcept>();
    /**
     * Associated documentation about the medication.
     * 
     */
    @JsonProperty("monograph")
    @JsonPropertyDescription("Associated documentation about the medication.")
    private List<MedicationKnowledge_Monograph> monograph = new ArrayList<MedicationKnowledge_Monograph>();
    /**
     * Identifies a particular constituent of interest in the product.
     * 
     */
    @JsonProperty("ingredient")
    @JsonPropertyDescription("Identifies a particular constituent of interest in the product.")
    private List<MedicationKnowledge_Ingredient> ingredient = new ArrayList<MedicationKnowledge_Ingredient>();
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("preparationInstruction")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String preparationInstruction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preparationInstruction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _preparationInstruction;
    /**
     * The intended or approved route of administration.
     * 
     */
    @JsonProperty("intendedRoute")
    @JsonPropertyDescription("The intended or approved route of administration.")
    private List<CodeableConcept> intendedRoute = new ArrayList<CodeableConcept>();
    /**
     * The price of the medication.
     * 
     */
    @JsonProperty("cost")
    @JsonPropertyDescription("The price of the medication.")
    private List<MedicationKnowledge_Cost> cost = new ArrayList<MedicationKnowledge_Cost>();
    /**
     * The program under which the medication is reviewed.
     * 
     */
    @JsonProperty("monitoringProgram")
    @JsonPropertyDescription("The program under which the medication is reviewed.")
    private List<MedicationKnowledge_MonitoringProgram> monitoringProgram = new ArrayList<MedicationKnowledge_MonitoringProgram>();
    /**
     * Guidelines for the administration of the medication.
     * 
     */
    @JsonProperty("administrationGuidelines")
    @JsonPropertyDescription("Guidelines for the administration of the medication.")
    private List<MedicationKnowledge_AdministrationGuidelines> administrationGuidelines = new ArrayList<MedicationKnowledge_AdministrationGuidelines>();
    /**
     * Categorization of the medication within a formulary or classification system.
     * 
     */
    @JsonProperty("medicineClassification")
    @JsonPropertyDescription("Categorization of the medication within a formulary or classification system.")
    private List<MedicationKnowledge_MedicineClassification> medicineClassification = new ArrayList<MedicationKnowledge_MedicineClassification>();
    /**
     * Information about a medication that is used to support knowledge.
     * 
     */
    @JsonProperty("packaging")
    @JsonPropertyDescription("Information about a medication that is used to support knowledge.")
    private MedicationKnowledge_Packaging packaging;
    /**
     * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
     * 
     */
    @JsonProperty("drugCharacteristic")
    @JsonPropertyDescription("Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.")
    private List<MedicationKnowledge_DrugCharacteristic> drugCharacteristic = new ArrayList<MedicationKnowledge_DrugCharacteristic>();
    /**
     * Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).
     * 
     */
    @JsonProperty("contraindication")
    @JsonPropertyDescription("Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).")
    private List<Reference> contraindication = new ArrayList<Reference>();
    /**
     * Regulatory information about a medication.
     * 
     */
    @JsonProperty("regulatory")
    @JsonPropertyDescription("Regulatory information about a medication.")
    private List<MedicationKnowledge_Regulatory> regulatory = new ArrayList<MedicationKnowledge_Regulatory>();
    /**
     * The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
     * 
     */
    @JsonProperty("kinetics")
    @JsonPropertyDescription("The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.")
    private List<MedicationKnowledge_Kinetics> kinetics = new ArrayList<MedicationKnowledge_Kinetics>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicationKnowledge resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicationKnowledge resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturer")
    public Reference getManufacturer() {
        return manufacturer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(Reference manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("doseForm")
    public CodeableConcept getDoseForm() {
        return doseForm;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("doseForm")
    public void setDoseForm(CodeableConcept doseForm) {
        this.doseForm = doseForm;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amount")
    public Quantity getAmount() {
        return amount;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Quantity amount) {
        this.amount = amount;
    }

    /**
     * Additional names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.
     * 
     */
    @JsonProperty("synonym")
    public List<String> getSynonym() {
        return synonym;
    }

    /**
     * Additional names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.
     * 
     */
    @JsonProperty("synonym")
    public void setSynonym(List<String> synonym) {
        this.synonym = synonym;
    }

    /**
     * Extensions for synonym
     * 
     */
    @JsonProperty("_synonym")
    public List<Element> get_synonym() {
        return _synonym;
    }

    /**
     * Extensions for synonym
     * 
     */
    @JsonProperty("_synonym")
    public void set_synonym(List<Element> _synonym) {
        this._synonym = _synonym;
    }

    /**
     * Associated or related knowledge about a medication.
     * 
     */
    @JsonProperty("relatedMedicationKnowledge")
    public List<MedicationKnowledge_RelatedMedicationKnowledge> getRelatedMedicationKnowledge() {
        return relatedMedicationKnowledge;
    }

    /**
     * Associated or related knowledge about a medication.
     * 
     */
    @JsonProperty("relatedMedicationKnowledge")
    public void setRelatedMedicationKnowledge(List<MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge) {
        this.relatedMedicationKnowledge = relatedMedicationKnowledge;
    }

    /**
     * Associated or related medications.  For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor).
     * 
     */
    @JsonProperty("associatedMedication")
    public List<Reference> getAssociatedMedication() {
        return associatedMedication;
    }

    /**
     * Associated or related medications.  For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor).
     * 
     */
    @JsonProperty("associatedMedication")
    public void setAssociatedMedication(List<Reference> associatedMedication) {
        this.associatedMedication = associatedMedication;
    }

    /**
     * Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).
     * 
     */
    @JsonProperty("productType")
    public List<CodeableConcept> getProductType() {
        return productType;
    }

    /**
     * Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).
     * 
     */
    @JsonProperty("productType")
    public void setProductType(List<CodeableConcept> productType) {
        this.productType = productType;
    }

    /**
     * Associated documentation about the medication.
     * 
     */
    @JsonProperty("monograph")
    public List<MedicationKnowledge_Monograph> getMonograph() {
        return monograph;
    }

    /**
     * Associated documentation about the medication.
     * 
     */
    @JsonProperty("monograph")
    public void setMonograph(List<MedicationKnowledge_Monograph> monograph) {
        this.monograph = monograph;
    }

    /**
     * Identifies a particular constituent of interest in the product.
     * 
     */
    @JsonProperty("ingredient")
    public List<MedicationKnowledge_Ingredient> getIngredient() {
        return ingredient;
    }

    /**
     * Identifies a particular constituent of interest in the product.
     * 
     */
    @JsonProperty("ingredient")
    public void setIngredient(List<MedicationKnowledge_Ingredient> ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("preparationInstruction")
    public String getPreparationInstruction() {
        return preparationInstruction;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("preparationInstruction")
    public void setPreparationInstruction(String preparationInstruction) {
        this.preparationInstruction = preparationInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preparationInstruction")
    public Element get_preparationInstruction() {
        return _preparationInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preparationInstruction")
    public void set_preparationInstruction(Element _preparationInstruction) {
        this._preparationInstruction = _preparationInstruction;
    }

    /**
     * The intended or approved route of administration.
     * 
     */
    @JsonProperty("intendedRoute")
    public List<CodeableConcept> getIntendedRoute() {
        return intendedRoute;
    }

    /**
     * The intended or approved route of administration.
     * 
     */
    @JsonProperty("intendedRoute")
    public void setIntendedRoute(List<CodeableConcept> intendedRoute) {
        this.intendedRoute = intendedRoute;
    }

    /**
     * The price of the medication.
     * 
     */
    @JsonProperty("cost")
    public List<MedicationKnowledge_Cost> getCost() {
        return cost;
    }

    /**
     * The price of the medication.
     * 
     */
    @JsonProperty("cost")
    public void setCost(List<MedicationKnowledge_Cost> cost) {
        this.cost = cost;
    }

    /**
     * The program under which the medication is reviewed.
     * 
     */
    @JsonProperty("monitoringProgram")
    public List<MedicationKnowledge_MonitoringProgram> getMonitoringProgram() {
        return monitoringProgram;
    }

    /**
     * The program under which the medication is reviewed.
     * 
     */
    @JsonProperty("monitoringProgram")
    public void setMonitoringProgram(List<MedicationKnowledge_MonitoringProgram> monitoringProgram) {
        this.monitoringProgram = monitoringProgram;
    }

    /**
     * Guidelines for the administration of the medication.
     * 
     */
    @JsonProperty("administrationGuidelines")
    public List<MedicationKnowledge_AdministrationGuidelines> getAdministrationGuidelines() {
        return administrationGuidelines;
    }

    /**
     * Guidelines for the administration of the medication.
     * 
     */
    @JsonProperty("administrationGuidelines")
    public void setAdministrationGuidelines(List<MedicationKnowledge_AdministrationGuidelines> administrationGuidelines) {
        this.administrationGuidelines = administrationGuidelines;
    }

    /**
     * Categorization of the medication within a formulary or classification system.
     * 
     */
    @JsonProperty("medicineClassification")
    public List<MedicationKnowledge_MedicineClassification> getMedicineClassification() {
        return medicineClassification;
    }

    /**
     * Categorization of the medication within a formulary or classification system.
     * 
     */
    @JsonProperty("medicineClassification")
    public void setMedicineClassification(List<MedicationKnowledge_MedicineClassification> medicineClassification) {
        this.medicineClassification = medicineClassification;
    }

    /**
     * Information about a medication that is used to support knowledge.
     * 
     */
    @JsonProperty("packaging")
    public MedicationKnowledge_Packaging getPackaging() {
        return packaging;
    }

    /**
     * Information about a medication that is used to support knowledge.
     * 
     */
    @JsonProperty("packaging")
    public void setPackaging(MedicationKnowledge_Packaging packaging) {
        this.packaging = packaging;
    }

    /**
     * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
     * 
     */
    @JsonProperty("drugCharacteristic")
    public List<MedicationKnowledge_DrugCharacteristic> getDrugCharacteristic() {
        return drugCharacteristic;
    }

    /**
     * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
     * 
     */
    @JsonProperty("drugCharacteristic")
    public void setDrugCharacteristic(List<MedicationKnowledge_DrugCharacteristic> drugCharacteristic) {
        this.drugCharacteristic = drugCharacteristic;
    }

    /**
     * Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).
     * 
     */
    @JsonProperty("contraindication")
    public List<Reference> getContraindication() {
        return contraindication;
    }

    /**
     * Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).
     * 
     */
    @JsonProperty("contraindication")
    public void setContraindication(List<Reference> contraindication) {
        this.contraindication = contraindication;
    }

    /**
     * Regulatory information about a medication.
     * 
     */
    @JsonProperty("regulatory")
    public List<MedicationKnowledge_Regulatory> getRegulatory() {
        return regulatory;
    }

    /**
     * Regulatory information about a medication.
     * 
     */
    @JsonProperty("regulatory")
    public void setRegulatory(List<MedicationKnowledge_Regulatory> regulatory) {
        this.regulatory = regulatory;
    }

    /**
     * The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
     * 
     */
    @JsonProperty("kinetics")
    public List<MedicationKnowledge_Kinetics> getKinetics() {
        return kinetics;
    }

    /**
     * The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
     * 
     */
    @JsonProperty("kinetics")
    public void setKinetics(List<MedicationKnowledge_Kinetics> kinetics) {
        this.kinetics = kinetics;
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
        sb.append(MedicationKnowledge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("doseForm");
        sb.append('=');
        sb.append(((this.doseForm == null)?"<null>":this.doseForm));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("synonym");
        sb.append('=');
        sb.append(((this.synonym == null)?"<null>":this.synonym));
        sb.append(',');
        sb.append("_synonym");
        sb.append('=');
        sb.append(((this._synonym == null)?"<null>":this._synonym));
        sb.append(',');
        sb.append("relatedMedicationKnowledge");
        sb.append('=');
        sb.append(((this.relatedMedicationKnowledge == null)?"<null>":this.relatedMedicationKnowledge));
        sb.append(',');
        sb.append("associatedMedication");
        sb.append('=');
        sb.append(((this.associatedMedication == null)?"<null>":this.associatedMedication));
        sb.append(',');
        sb.append("productType");
        sb.append('=');
        sb.append(((this.productType == null)?"<null>":this.productType));
        sb.append(',');
        sb.append("monograph");
        sb.append('=');
        sb.append(((this.monograph == null)?"<null>":this.monograph));
        sb.append(',');
        sb.append("ingredient");
        sb.append('=');
        sb.append(((this.ingredient == null)?"<null>":this.ingredient));
        sb.append(',');
        sb.append("preparationInstruction");
        sb.append('=');
        sb.append(((this.preparationInstruction == null)?"<null>":this.preparationInstruction));
        sb.append(',');
        sb.append("_preparationInstruction");
        sb.append('=');
        sb.append(((this._preparationInstruction == null)?"<null>":this._preparationInstruction));
        sb.append(',');
        sb.append("intendedRoute");
        sb.append('=');
        sb.append(((this.intendedRoute == null)?"<null>":this.intendedRoute));
        sb.append(',');
        sb.append("cost");
        sb.append('=');
        sb.append(((this.cost == null)?"<null>":this.cost));
        sb.append(',');
        sb.append("monitoringProgram");
        sb.append('=');
        sb.append(((this.monitoringProgram == null)?"<null>":this.monitoringProgram));
        sb.append(',');
        sb.append("administrationGuidelines");
        sb.append('=');
        sb.append(((this.administrationGuidelines == null)?"<null>":this.administrationGuidelines));
        sb.append(',');
        sb.append("medicineClassification");
        sb.append('=');
        sb.append(((this.medicineClassification == null)?"<null>":this.medicineClassification));
        sb.append(',');
        sb.append("packaging");
        sb.append('=');
        sb.append(((this.packaging == null)?"<null>":this.packaging));
        sb.append(',');
        sb.append("drugCharacteristic");
        sb.append('=');
        sb.append(((this.drugCharacteristic == null)?"<null>":this.drugCharacteristic));
        sb.append(',');
        sb.append("contraindication");
        sb.append('=');
        sb.append(((this.contraindication == null)?"<null>":this.contraindication));
        sb.append(',');
        sb.append("regulatory");
        sb.append('=');
        sb.append(((this.regulatory == null)?"<null>":this.regulatory));
        sb.append(',');
        sb.append("kinetics");
        sb.append('=');
        sb.append(((this.kinetics == null)?"<null>":this.kinetics));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._synonym == null)? 0 :this._synonym.hashCode()));
        result = ((result* 31)+((this.regulatory == null)? 0 :this.regulatory.hashCode()));
        result = ((result* 31)+((this.medicineClassification == null)? 0 :this.medicineClassification.hashCode()));
        result = ((result* 31)+((this.associatedMedication == null)? 0 :this.associatedMedication.hashCode()));
        result = ((result* 31)+((this.manufacturer == null)? 0 :this.manufacturer.hashCode()));
        result = ((result* 31)+((this._preparationInstruction == null)? 0 :this._preparationInstruction.hashCode()));
        result = ((result* 31)+((this.synonym == null)? 0 :this.synonym.hashCode()));
        result = ((result* 31)+((this.relatedMedicationKnowledge == null)? 0 :this.relatedMedicationKnowledge.hashCode()));
        result = ((result* 31)+((this.productType == null)? 0 :this.productType.hashCode()));
        result = ((result* 31)+((this.administrationGuidelines == null)? 0 :this.administrationGuidelines.hashCode()));
        result = ((result* 31)+((this.contraindication == null)? 0 :this.contraindication.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.intendedRoute == null)? 0 :this.intendedRoute.hashCode()));
        result = ((result* 31)+((this.ingredient == null)? 0 :this.ingredient.hashCode()));
        result = ((result* 31)+((this.cost == null)? 0 :this.cost.hashCode()));
        result = ((result* 31)+((this.preparationInstruction == null)? 0 :this.preparationInstruction.hashCode()));
        result = ((result* 31)+((this.packaging == null)? 0 :this.packaging.hashCode()));
        result = ((result* 31)+((this.monitoringProgram == null)? 0 :this.monitoringProgram.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.drugCharacteristic == null)? 0 :this.drugCharacteristic.hashCode()));
        result = ((result* 31)+((this.doseForm == null)? 0 :this.doseForm.hashCode()));
        result = ((result* 31)+((this.monograph == null)? 0 :this.monograph.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.kinetics == null)? 0 :this.kinetics.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicationKnowledge) == false) {
            return false;
        }
        MedicationKnowledge rhs = ((MedicationKnowledge) other);
        return (((((((((((((((((((((((((((super.equals(rhs)&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._synonym == rhs._synonym)||((this._synonym!= null)&&this._synonym.equals(rhs._synonym))))&&((this.regulatory == rhs.regulatory)||((this.regulatory!= null)&&this.regulatory.equals(rhs.regulatory))))&&((this.medicineClassification == rhs.medicineClassification)||((this.medicineClassification!= null)&&this.medicineClassification.equals(rhs.medicineClassification))))&&((this.associatedMedication == rhs.associatedMedication)||((this.associatedMedication!= null)&&this.associatedMedication.equals(rhs.associatedMedication))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))))&&((this._preparationInstruction == rhs._preparationInstruction)||((this._preparationInstruction!= null)&&this._preparationInstruction.equals(rhs._preparationInstruction))))&&((this.synonym == rhs.synonym)||((this.synonym!= null)&&this.synonym.equals(rhs.synonym))))&&((this.relatedMedicationKnowledge == rhs.relatedMedicationKnowledge)||((this.relatedMedicationKnowledge!= null)&&this.relatedMedicationKnowledge.equals(rhs.relatedMedicationKnowledge))))&&((this.productType == rhs.productType)||((this.productType!= null)&&this.productType.equals(rhs.productType))))&&((this.administrationGuidelines == rhs.administrationGuidelines)||((this.administrationGuidelines!= null)&&this.administrationGuidelines.equals(rhs.administrationGuidelines))))&&((this.contraindication == rhs.contraindication)||((this.contraindication!= null)&&this.contraindication.equals(rhs.contraindication))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.intendedRoute == rhs.intendedRoute)||((this.intendedRoute!= null)&&this.intendedRoute.equals(rhs.intendedRoute))))&&((this.ingredient == rhs.ingredient)||((this.ingredient!= null)&&this.ingredient.equals(rhs.ingredient))))&&((this.cost == rhs.cost)||((this.cost!= null)&&this.cost.equals(rhs.cost))))&&((this.preparationInstruction == rhs.preparationInstruction)||((this.preparationInstruction!= null)&&this.preparationInstruction.equals(rhs.preparationInstruction))))&&((this.packaging == rhs.packaging)||((this.packaging!= null)&&this.packaging.equals(rhs.packaging))))&&((this.monitoringProgram == rhs.monitoringProgram)||((this.monitoringProgram!= null)&&this.monitoringProgram.equals(rhs.monitoringProgram))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.drugCharacteristic == rhs.drugCharacteristic)||((this.drugCharacteristic!= null)&&this.drugCharacteristic.equals(rhs.drugCharacteristic))))&&((this.doseForm == rhs.doseForm)||((this.doseForm!= null)&&this.doseForm.equals(rhs.doseForm))))&&((this.monograph == rhs.monograph)||((this.monograph!= null)&&this.monograph.equals(rhs.monograph))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.kinetics == rhs.kinetics)||((this.kinetics!= null)&&this.kinetics.equals(rhs.kinetics))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
