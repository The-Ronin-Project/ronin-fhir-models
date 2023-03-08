
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "sequence",
    "_sequence",
    "careTeamSequence",
    "_careTeamSequence",
    "diagnosisSequence",
    "_diagnosisSequence",
    "procedureSequence",
    "_procedureSequence",
    "informationSequence",
    "_informationSequence",
    "revenue",
    "category",
    "productOrService",
    "modifier",
    "programCode",
    "servicedDate",
    "_servicedDate",
    "servicedPeriod",
    "locationCodeableConcept",
    "locationAddress",
    "locationReference",
    "quantity",
    "unitPrice",
    "factor",
    "_factor",
    "net",
    "udi",
    "bodySite",
    "subSite",
    "encounter",
    "noteNumber",
    "_noteNumber",
    "adjudication",
    "detail"
})
@Generated("jsonschema2pojo")
public class ExplanationOfBenefit_Item {

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double sequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sequence;
    /**
     * Care team members related to this service or product.
     * 
     */
    @JsonProperty("careTeamSequence")
    @JsonPropertyDescription("Care team members related to this service or product.")
    private List<Double> careTeamSequence = new ArrayList<Double>();
    /**
     * Extensions for careTeamSequence
     * 
     */
    @JsonProperty("_careTeamSequence")
    @JsonPropertyDescription("Extensions for careTeamSequence")
    private List<Element> _careTeamSequence = new ArrayList<Element>();
    /**
     * Diagnoses applicable for this service or product.
     * 
     */
    @JsonProperty("diagnosisSequence")
    @JsonPropertyDescription("Diagnoses applicable for this service or product.")
    private List<Double> diagnosisSequence = new ArrayList<Double>();
    /**
     * Extensions for diagnosisSequence
     * 
     */
    @JsonProperty("_diagnosisSequence")
    @JsonPropertyDescription("Extensions for diagnosisSequence")
    private List<Element> _diagnosisSequence = new ArrayList<Element>();
    /**
     * Procedures applicable for this service or product.
     * 
     */
    @JsonProperty("procedureSequence")
    @JsonPropertyDescription("Procedures applicable for this service or product.")
    private List<Double> procedureSequence = new ArrayList<Double>();
    /**
     * Extensions for procedureSequence
     * 
     */
    @JsonProperty("_procedureSequence")
    @JsonPropertyDescription("Extensions for procedureSequence")
    private List<Element> _procedureSequence = new ArrayList<Element>();
    /**
     * Exceptions, special conditions and supporting information applicable for this service or product.
     * 
     */
    @JsonProperty("informationSequence")
    @JsonPropertyDescription("Exceptions, special conditions and supporting information applicable for this service or product.")
    private List<Double> informationSequence = new ArrayList<Double>();
    /**
     * Extensions for informationSequence
     * 
     */
    @JsonProperty("_informationSequence")
    @JsonPropertyDescription("Extensions for informationSequence")
    private List<Element> _informationSequence = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("revenue")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept revenue;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept category;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
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
     * Identifies the program under which this may be recovered.
     * 
     */
    @JsonProperty("programCode")
    @JsonPropertyDescription("Identifies the program under which this may be recovered.")
    private List<CodeableConcept> programCode = new ArrayList<CodeableConcept>();
    /**
     * The date or dates when the service or product was supplied, performed or completed.
     * 
     */
    @JsonProperty("servicedDate")
    @JsonPropertyDescription("The date or dates when the service or product was supplied, performed or completed.")
    private String servicedDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_servicedDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _servicedDate;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicedPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period servicedPeriod;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("locationCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept locationCodeableConcept;
    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("locationAddress")
    @JsonPropertyDescription("An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.")
    private Address locationAddress;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("locationReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference locationReference;
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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double factor;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _factor;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money net;
    /**
     * Unique Device Identifiers associated with this line item.
     * 
     */
    @JsonProperty("udi")
    @JsonPropertyDescription("Unique Device Identifiers associated with this line item.")
    private List<Reference> udi = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept bodySite;
    /**
     * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
     * 
     */
    @JsonProperty("subSite")
    @JsonPropertyDescription("A region or surface of the bodySite, e.g. limb region or tooth surface(s).")
    private List<CodeableConcept> subSite = new ArrayList<CodeableConcept>();
    /**
     * A billed item may include goods or services provided in multiple encounters.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A billed item may include goods or services provided in multiple encounters.")
    private List<Reference> encounter = new ArrayList<Reference>();
    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    @JsonPropertyDescription("The numbers associated with notes below which apply to the adjudication of this item.")
    private List<Double> noteNumber = new ArrayList<Double>();
    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    @JsonPropertyDescription("Extensions for noteNumber")
    private List<Element> _noteNumber = new ArrayList<Element>();
    /**
     * If this item is a group then the values here are a summary of the adjudication of the detail items. If this item is a simple product or service then this is the result of the adjudication of this item.
     * 
     */
    @JsonProperty("adjudication")
    @JsonPropertyDescription("If this item is a group then the values here are a summary of the adjudication of the detail items. If this item is a simple product or service then this is the result of the adjudication of this item.")
    private List<ExplanationOfBenefit_Adjudication> adjudication = new ArrayList<ExplanationOfBenefit_Adjudication>();
    /**
     * Second-tier of goods and services.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Second-tier of goods and services.")
    private List<ExplanationOfBenefit_Detail> detail = new ArrayList<ExplanationOfBenefit_Detail>();

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    public Double getSequence() {
        return sequence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public Element get_sequence() {
        return _sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public void set_sequence(Element _sequence) {
        this._sequence = _sequence;
    }

    /**
     * Care team members related to this service or product.
     * 
     */
    @JsonProperty("careTeamSequence")
    public List<Double> getCareTeamSequence() {
        return careTeamSequence;
    }

    /**
     * Care team members related to this service or product.
     * 
     */
    @JsonProperty("careTeamSequence")
    public void setCareTeamSequence(List<Double> careTeamSequence) {
        this.careTeamSequence = careTeamSequence;
    }

    /**
     * Extensions for careTeamSequence
     * 
     */
    @JsonProperty("_careTeamSequence")
    public List<Element> get_careTeamSequence() {
        return _careTeamSequence;
    }

    /**
     * Extensions for careTeamSequence
     * 
     */
    @JsonProperty("_careTeamSequence")
    public void set_careTeamSequence(List<Element> _careTeamSequence) {
        this._careTeamSequence = _careTeamSequence;
    }

    /**
     * Diagnoses applicable for this service or product.
     * 
     */
    @JsonProperty("diagnosisSequence")
    public List<Double> getDiagnosisSequence() {
        return diagnosisSequence;
    }

    /**
     * Diagnoses applicable for this service or product.
     * 
     */
    @JsonProperty("diagnosisSequence")
    public void setDiagnosisSequence(List<Double> diagnosisSequence) {
        this.diagnosisSequence = diagnosisSequence;
    }

    /**
     * Extensions for diagnosisSequence
     * 
     */
    @JsonProperty("_diagnosisSequence")
    public List<Element> get_diagnosisSequence() {
        return _diagnosisSequence;
    }

    /**
     * Extensions for diagnosisSequence
     * 
     */
    @JsonProperty("_diagnosisSequence")
    public void set_diagnosisSequence(List<Element> _diagnosisSequence) {
        this._diagnosisSequence = _diagnosisSequence;
    }

    /**
     * Procedures applicable for this service or product.
     * 
     */
    @JsonProperty("procedureSequence")
    public List<Double> getProcedureSequence() {
        return procedureSequence;
    }

    /**
     * Procedures applicable for this service or product.
     * 
     */
    @JsonProperty("procedureSequence")
    public void setProcedureSequence(List<Double> procedureSequence) {
        this.procedureSequence = procedureSequence;
    }

    /**
     * Extensions for procedureSequence
     * 
     */
    @JsonProperty("_procedureSequence")
    public List<Element> get_procedureSequence() {
        return _procedureSequence;
    }

    /**
     * Extensions for procedureSequence
     * 
     */
    @JsonProperty("_procedureSequence")
    public void set_procedureSequence(List<Element> _procedureSequence) {
        this._procedureSequence = _procedureSequence;
    }

    /**
     * Exceptions, special conditions and supporting information applicable for this service or product.
     * 
     */
    @JsonProperty("informationSequence")
    public List<Double> getInformationSequence() {
        return informationSequence;
    }

    /**
     * Exceptions, special conditions and supporting information applicable for this service or product.
     * 
     */
    @JsonProperty("informationSequence")
    public void setInformationSequence(List<Double> informationSequence) {
        this.informationSequence = informationSequence;
    }

    /**
     * Extensions for informationSequence
     * 
     */
    @JsonProperty("_informationSequence")
    public List<Element> get_informationSequence() {
        return _informationSequence;
    }

    /**
     * Extensions for informationSequence
     * 
     */
    @JsonProperty("_informationSequence")
    public void set_informationSequence(List<Element> _informationSequence) {
        this._informationSequence = _informationSequence;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("revenue")
    public CodeableConcept getRevenue() {
        return revenue;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("revenue")
    public void setRevenue(CodeableConcept revenue) {
        this.revenue = revenue;
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
     * (Required)
     * 
     */
    @JsonProperty("productOrService")
    public CodeableConcept getProductOrService() {
        return productOrService;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
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
     * Identifies the program under which this may be recovered.
     * 
     */
    @JsonProperty("programCode")
    public List<CodeableConcept> getProgramCode() {
        return programCode;
    }

    /**
     * Identifies the program under which this may be recovered.
     * 
     */
    @JsonProperty("programCode")
    public void setProgramCode(List<CodeableConcept> programCode) {
        this.programCode = programCode;
    }

    /**
     * The date or dates when the service or product was supplied, performed or completed.
     * 
     */
    @JsonProperty("servicedDate")
    public String getServicedDate() {
        return servicedDate;
    }

    /**
     * The date or dates when the service or product was supplied, performed or completed.
     * 
     */
    @JsonProperty("servicedDate")
    public void setServicedDate(String servicedDate) {
        this.servicedDate = servicedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_servicedDate")
    public Element get_servicedDate() {
        return _servicedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_servicedDate")
    public void set_servicedDate(Element _servicedDate) {
        this._servicedDate = _servicedDate;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicedPeriod")
    public Period getServicedPeriod() {
        return servicedPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Period servicedPeriod) {
        this.servicedPeriod = servicedPeriod;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("locationCodeableConcept")
    public CodeableConcept getLocationCodeableConcept() {
        return locationCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("locationCodeableConcept")
    public void setLocationCodeableConcept(CodeableConcept locationCodeableConcept) {
        this.locationCodeableConcept = locationCodeableConcept;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("locationAddress")
    public Address getLocationAddress() {
        return locationAddress;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("locationAddress")
    public void setLocationAddress(Address locationAddress) {
        this.locationAddress = locationAddress;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("locationReference")
    public Reference getLocationReference() {
        return locationReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("locationReference")
    public void setLocationReference(Reference locationReference) {
        this.locationReference = locationReference;
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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public Double getFactor() {
        return factor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public void setFactor(Double factor) {
        this.factor = factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public Element get_factor() {
        return _factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public void set_factor(Element _factor) {
        this._factor = _factor;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    public Money getNet() {
        return net;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    public void setNet(Money net) {
        this.net = net;
    }

    /**
     * Unique Device Identifiers associated with this line item.
     * 
     */
    @JsonProperty("udi")
    public List<Reference> getUdi() {
        return udi;
    }

    /**
     * Unique Device Identifiers associated with this line item.
     * 
     */
    @JsonProperty("udi")
    public void setUdi(List<Reference> udi) {
        this.udi = udi;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(CodeableConcept bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
     * 
     */
    @JsonProperty("subSite")
    public List<CodeableConcept> getSubSite() {
        return subSite;
    }

    /**
     * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
     * 
     */
    @JsonProperty("subSite")
    public void setSubSite(List<CodeableConcept> subSite) {
        this.subSite = subSite;
    }

    /**
     * A billed item may include goods or services provided in multiple encounters.
     * 
     */
    @JsonProperty("encounter")
    public List<Reference> getEncounter() {
        return encounter;
    }

    /**
     * A billed item may include goods or services provided in multiple encounters.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(List<Reference> encounter) {
        this.encounter = encounter;
    }

    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    public List<Double> getNoteNumber() {
        return noteNumber;
    }

    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    public void setNoteNumber(List<Double> noteNumber) {
        this.noteNumber = noteNumber;
    }

    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    public List<Element> get_noteNumber() {
        return _noteNumber;
    }

    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    public void set_noteNumber(List<Element> _noteNumber) {
        this._noteNumber = _noteNumber;
    }

    /**
     * If this item is a group then the values here are a summary of the adjudication of the detail items. If this item is a simple product or service then this is the result of the adjudication of this item.
     * 
     */
    @JsonProperty("adjudication")
    public List<ExplanationOfBenefit_Adjudication> getAdjudication() {
        return adjudication;
    }

    /**
     * If this item is a group then the values here are a summary of the adjudication of the detail items. If this item is a simple product or service then this is the result of the adjudication of this item.
     * 
     */
    @JsonProperty("adjudication")
    public void setAdjudication(List<ExplanationOfBenefit_Adjudication> adjudication) {
        this.adjudication = adjudication;
    }

    /**
     * Second-tier of goods and services.
     * 
     */
    @JsonProperty("detail")
    public List<ExplanationOfBenefit_Detail> getDetail() {
        return detail;
    }

    /**
     * Second-tier of goods and services.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(List<ExplanationOfBenefit_Detail> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExplanationOfBenefit_Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("sequence");
        sb.append('=');
        sb.append(((this.sequence == null)?"<null>":this.sequence));
        sb.append(',');
        sb.append("_sequence");
        sb.append('=');
        sb.append(((this._sequence == null)?"<null>":this._sequence));
        sb.append(',');
        sb.append("careTeamSequence");
        sb.append('=');
        sb.append(((this.careTeamSequence == null)?"<null>":this.careTeamSequence));
        sb.append(',');
        sb.append("_careTeamSequence");
        sb.append('=');
        sb.append(((this._careTeamSequence == null)?"<null>":this._careTeamSequence));
        sb.append(',');
        sb.append("diagnosisSequence");
        sb.append('=');
        sb.append(((this.diagnosisSequence == null)?"<null>":this.diagnosisSequence));
        sb.append(',');
        sb.append("_diagnosisSequence");
        sb.append('=');
        sb.append(((this._diagnosisSequence == null)?"<null>":this._diagnosisSequence));
        sb.append(',');
        sb.append("procedureSequence");
        sb.append('=');
        sb.append(((this.procedureSequence == null)?"<null>":this.procedureSequence));
        sb.append(',');
        sb.append("_procedureSequence");
        sb.append('=');
        sb.append(((this._procedureSequence == null)?"<null>":this._procedureSequence));
        sb.append(',');
        sb.append("informationSequence");
        sb.append('=');
        sb.append(((this.informationSequence == null)?"<null>":this.informationSequence));
        sb.append(',');
        sb.append("_informationSequence");
        sb.append('=');
        sb.append(((this._informationSequence == null)?"<null>":this._informationSequence));
        sb.append(',');
        sb.append("revenue");
        sb.append('=');
        sb.append(((this.revenue == null)?"<null>":this.revenue));
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
        sb.append("programCode");
        sb.append('=');
        sb.append(((this.programCode == null)?"<null>":this.programCode));
        sb.append(',');
        sb.append("servicedDate");
        sb.append('=');
        sb.append(((this.servicedDate == null)?"<null>":this.servicedDate));
        sb.append(',');
        sb.append("_servicedDate");
        sb.append('=');
        sb.append(((this._servicedDate == null)?"<null>":this._servicedDate));
        sb.append(',');
        sb.append("servicedPeriod");
        sb.append('=');
        sb.append(((this.servicedPeriod == null)?"<null>":this.servicedPeriod));
        sb.append(',');
        sb.append("locationCodeableConcept");
        sb.append('=');
        sb.append(((this.locationCodeableConcept == null)?"<null>":this.locationCodeableConcept));
        sb.append(',');
        sb.append("locationAddress");
        sb.append('=');
        sb.append(((this.locationAddress == null)?"<null>":this.locationAddress));
        sb.append(',');
        sb.append("locationReference");
        sb.append('=');
        sb.append(((this.locationReference == null)?"<null>":this.locationReference));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("factor");
        sb.append('=');
        sb.append(((this.factor == null)?"<null>":this.factor));
        sb.append(',');
        sb.append("_factor");
        sb.append('=');
        sb.append(((this._factor == null)?"<null>":this._factor));
        sb.append(',');
        sb.append("net");
        sb.append('=');
        sb.append(((this.net == null)?"<null>":this.net));
        sb.append(',');
        sb.append("udi");
        sb.append('=');
        sb.append(((this.udi == null)?"<null>":this.udi));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("subSite");
        sb.append('=');
        sb.append(((this.subSite == null)?"<null>":this.subSite));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("noteNumber");
        sb.append('=');
        sb.append(((this.noteNumber == null)?"<null>":this.noteNumber));
        sb.append(',');
        sb.append("_noteNumber");
        sb.append('=');
        sb.append(((this._noteNumber == null)?"<null>":this._noteNumber));
        sb.append(',');
        sb.append("adjudication");
        sb.append('=');
        sb.append(((this.adjudication == null)?"<null>":this.adjudication));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.modifier == null)? 0 :this.modifier.hashCode()));
        result = ((result* 31)+((this.productOrService == null)? 0 :this.productOrService.hashCode()));
        result = ((result* 31)+((this.locationAddress == null)? 0 :this.locationAddress.hashCode()));
        result = ((result* 31)+((this.servicedPeriod == null)? 0 :this.servicedPeriod.hashCode()));
        result = ((result* 31)+((this.noteNumber == null)? 0 :this.noteNumber.hashCode()));
        result = ((result* 31)+((this._noteNumber == null)? 0 :this._noteNumber.hashCode()));
        result = ((result* 31)+((this.adjudication == null)? 0 :this.adjudication.hashCode()));
        result = ((result* 31)+((this.informationSequence == null)? 0 :this.informationSequence.hashCode()));
        result = ((result* 31)+((this.revenue == null)? 0 :this.revenue.hashCode()));
        result = ((result* 31)+((this.locationCodeableConcept == null)? 0 :this.locationCodeableConcept.hashCode()));
        result = ((result* 31)+((this.diagnosisSequence == null)? 0 :this.diagnosisSequence.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.locationReference == null)? 0 :this.locationReference.hashCode()));
        result = ((result* 31)+((this.factor == null)? 0 :this.factor.hashCode()));
        result = ((result* 31)+((this.net == null)? 0 :this.net.hashCode()));
        result = ((result* 31)+((this._procedureSequence == null)? 0 :this._procedureSequence.hashCode()));
        result = ((result* 31)+((this._careTeamSequence == null)? 0 :this._careTeamSequence.hashCode()));
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this._informationSequence == null)? 0 :this._informationSequence.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.programCode == null)? 0 :this.programCode.hashCode()));
        result = ((result* 31)+((this.careTeamSequence == null)? 0 :this.careTeamSequence.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._factor == null)? 0 :this._factor.hashCode()));
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this.subSite == null)? 0 :this.subSite.hashCode()));
        result = ((result* 31)+((this._servicedDate == null)? 0 :this._servicedDate.hashCode()));
        result = ((result* 31)+((this._diagnosisSequence == null)? 0 :this._diagnosisSequence.hashCode()));
        result = ((result* 31)+((this.servicedDate == null)? 0 :this.servicedDate.hashCode()));
        result = ((result* 31)+((this.udi == null)? 0 :this.udi.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.procedureSequence == null)? 0 :this.procedureSequence.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExplanationOfBenefit_Item) == false) {
            return false;
        }
        ExplanationOfBenefit_Item rhs = ((ExplanationOfBenefit_Item) other);
        return ((((((((((((((((((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.modifier == rhs.modifier)||((this.modifier!= null)&&this.modifier.equals(rhs.modifier))))&&((this.productOrService == rhs.productOrService)||((this.productOrService!= null)&&this.productOrService.equals(rhs.productOrService))))&&((this.locationAddress == rhs.locationAddress)||((this.locationAddress!= null)&&this.locationAddress.equals(rhs.locationAddress))))&&((this.servicedPeriod == rhs.servicedPeriod)||((this.servicedPeriod!= null)&&this.servicedPeriod.equals(rhs.servicedPeriod))))&&((this.noteNumber == rhs.noteNumber)||((this.noteNumber!= null)&&this.noteNumber.equals(rhs.noteNumber))))&&((this._noteNumber == rhs._noteNumber)||((this._noteNumber!= null)&&this._noteNumber.equals(rhs._noteNumber))))&&((this.adjudication == rhs.adjudication)||((this.adjudication!= null)&&this.adjudication.equals(rhs.adjudication))))&&((this.informationSequence == rhs.informationSequence)||((this.informationSequence!= null)&&this.informationSequence.equals(rhs.informationSequence))))&&((this.revenue == rhs.revenue)||((this.revenue!= null)&&this.revenue.equals(rhs.revenue))))&&((this.locationCodeableConcept == rhs.locationCodeableConcept)||((this.locationCodeableConcept!= null)&&this.locationCodeableConcept.equals(rhs.locationCodeableConcept))))&&((this.diagnosisSequence == rhs.diagnosisSequence)||((this.diagnosisSequence!= null)&&this.diagnosisSequence.equals(rhs.diagnosisSequence))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.locationReference == rhs.locationReference)||((this.locationReference!= null)&&this.locationReference.equals(rhs.locationReference))))&&((this.factor == rhs.factor)||((this.factor!= null)&&this.factor.equals(rhs.factor))))&&((this.net == rhs.net)||((this.net!= null)&&this.net.equals(rhs.net))))&&((this._procedureSequence == rhs._procedureSequence)||((this._procedureSequence!= null)&&this._procedureSequence.equals(rhs._procedureSequence))))&&((this._careTeamSequence == rhs._careTeamSequence)||((this._careTeamSequence!= null)&&this._careTeamSequence.equals(rhs._careTeamSequence))))&&((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice))))&&((this._informationSequence == rhs._informationSequence)||((this._informationSequence!= null)&&this._informationSequence.equals(rhs._informationSequence))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.programCode == rhs.programCode)||((this.programCode!= null)&&this.programCode.equals(rhs.programCode))))&&((this.careTeamSequence == rhs.careTeamSequence)||((this.careTeamSequence!= null)&&this.careTeamSequence.equals(rhs.careTeamSequence))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._factor == rhs._factor)||((this._factor!= null)&&this._factor.equals(rhs._factor))))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this.subSite == rhs.subSite)||((this.subSite!= null)&&this.subSite.equals(rhs.subSite))))&&((this._servicedDate == rhs._servicedDate)||((this._servicedDate!= null)&&this._servicedDate.equals(rhs._servicedDate))))&&((this._diagnosisSequence == rhs._diagnosisSequence)||((this._diagnosisSequence!= null)&&this._diagnosisSequence.equals(rhs._diagnosisSequence))))&&((this.servicedDate == rhs.servicedDate)||((this.servicedDate!= null)&&this.servicedDate.equals(rhs.servicedDate))))&&((this.udi == rhs.udi)||((this.udi!= null)&&this.udi.equals(rhs.udi))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.procedureSequence == rhs.procedureSequence)||((this.procedureSequence!= null)&&this.procedureSequence.equals(rhs.procedureSequence))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
