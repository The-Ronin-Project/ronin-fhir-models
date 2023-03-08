
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "type",
    "subType",
    "use",
    "_use",
    "patient",
    "billablePeriod",
    "created",
    "_created",
    "enterer",
    "insurer",
    "provider",
    "priority",
    "fundsReserveRequested",
    "fundsReserve",
    "related",
    "prescription",
    "originalPrescription",
    "payee",
    "referral",
    "facility",
    "claim",
    "claimResponse",
    "outcome",
    "_outcome",
    "disposition",
    "_disposition",
    "preAuthRef",
    "_preAuthRef",
    "preAuthRefPeriod",
    "careTeam",
    "supportingInfo",
    "diagnosis",
    "procedure",
    "precedence",
    "_precedence",
    "insurance",
    "accident",
    "item",
    "addItem",
    "adjudication",
    "total",
    "payment",
    "formCode",
    "form",
    "processNote",
    "benefitPeriod",
    "benefitBalance"
})
@Generated("jsonschema2pojo")
public class ExplanationOfBenefit
    extends DomainResource
{

    /**
     * This is a ExplanationOfBenefit resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ExplanationOfBenefit resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this explanation of benefit.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this explanation of benefit.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The status of the resource instance.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the resource instance.")
    private ExplanationOfBenefit.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept subType;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("use")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String use;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _use;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("billablePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period billablePeriod;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String created;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _created;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference enterer;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference insurer;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference provider;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept priority;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundsReserveRequested")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept fundsReserveRequested;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundsReserve")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept fundsReserve;
    /**
     * Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.
     * 
     */
    @JsonProperty("related")
    @JsonPropertyDescription("Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.")
    private List<ExplanationOfBenefit_Related> related = new ArrayList<ExplanationOfBenefit_Related>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("prescription")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference prescription;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("originalPrescription")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference originalPrescription;
    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("payee")
    @JsonPropertyDescription("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")
    private ExplanationOfBenefit_Payee payee;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referral")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference referral;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("facility")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference facility;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claim")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference claim;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claimResponse")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference claimResponse;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String outcome;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _outcome;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String disposition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _disposition;
    /**
     * Reference from the Insurer which is used in later communications which refers to this adjudication.
     * 
     */
    @JsonProperty("preAuthRef")
    @JsonPropertyDescription("Reference from the Insurer which is used in later communications which refers to this adjudication.")
    private List<String> preAuthRef = new ArrayList<String>();
    /**
     * Extensions for preAuthRef
     * 
     */
    @JsonProperty("_preAuthRef")
    @JsonPropertyDescription("Extensions for preAuthRef")
    private List<Element> _preAuthRef = new ArrayList<Element>();
    /**
     * The timeframe during which the supplied preauthorization reference may be quoted on claims to obtain the adjudication as provided.
     * 
     */
    @JsonProperty("preAuthRefPeriod")
    @JsonPropertyDescription("The timeframe during which the supplied preauthorization reference may be quoted on claims to obtain the adjudication as provided.")
    private List<Period> preAuthRefPeriod = new ArrayList<Period>();
    /**
     * The members of the team who provided the products and services.
     * 
     */
    @JsonProperty("careTeam")
    @JsonPropertyDescription("The members of the team who provided the products and services.")
    private List<ExplanationOfBenefit_CareTeam> careTeam = new ArrayList<ExplanationOfBenefit_CareTeam>();
    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    @JsonPropertyDescription("Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.")
    private List<ExplanationOfBenefit_SupportingInfo> supportingInfo = new ArrayList<ExplanationOfBenefit_SupportingInfo>();
    /**
     * Information about diagnoses relevant to the claim items.
     * 
     */
    @JsonProperty("diagnosis")
    @JsonPropertyDescription("Information about diagnoses relevant to the claim items.")
    private List<ExplanationOfBenefit_Diagnosis> diagnosis = new ArrayList<ExplanationOfBenefit_Diagnosis>();
    /**
     * Procedures performed on the patient relevant to the billing items with the claim.
     * 
     */
    @JsonProperty("procedure")
    @JsonPropertyDescription("Procedures performed on the patient relevant to the billing items with the claim.")
    private List<ExplanationOfBenefit_Procedure> procedure = new ArrayList<ExplanationOfBenefit_Procedure>();
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("precedence")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double precedence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precedence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _precedence;
    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * (Required)
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Financial instruments for reimbursement for the health care products and services specified on the claim.")
    private List<ExplanationOfBenefit_Insurance> insurance = new ArrayList<ExplanationOfBenefit_Insurance>();
    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("accident")
    @JsonPropertyDescription("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")
    private ExplanationOfBenefit_Accident accident;
    /**
     * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.")
    private List<ExplanationOfBenefit_Item> item = new ArrayList<ExplanationOfBenefit_Item>();
    /**
     * The first-tier service adjudications for payor added product or service lines.
     * 
     */
    @JsonProperty("addItem")
    @JsonPropertyDescription("The first-tier service adjudications for payor added product or service lines.")
    private List<ExplanationOfBenefit_AddItem> addItem = new ArrayList<ExplanationOfBenefit_AddItem>();
    /**
     * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
     * 
     */
    @JsonProperty("adjudication")
    @JsonPropertyDescription("The adjudication results which are presented at the header level rather than at the line-item or add-item levels.")
    private List<ExplanationOfBenefit_Adjudication> adjudication = new ArrayList<ExplanationOfBenefit_Adjudication>();
    /**
     * Categorized monetary totals for the adjudication.
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("Categorized monetary totals for the adjudication.")
    private List<ExplanationOfBenefit_Total> total = new ArrayList<ExplanationOfBenefit_Total>();
    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")
    private ExplanationOfBenefit_Payment payment;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("formCode")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept formCode;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("form")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment form;
    /**
     * A note that describes or explains adjudication results in a human readable form.
     * 
     */
    @JsonProperty("processNote")
    @JsonPropertyDescription("A note that describes or explains adjudication results in a human readable form.")
    private List<ExplanationOfBenefit_ProcessNote> processNote = new ArrayList<ExplanationOfBenefit_ProcessNote>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("benefitPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period benefitPeriod;
    /**
     * Balance by Benefit Category.
     * 
     */
    @JsonProperty("benefitBalance")
    @JsonPropertyDescription("Balance by Benefit Category.")
    private List<ExplanationOfBenefit_BenefitBalance> benefitBalance = new ArrayList<ExplanationOfBenefit_BenefitBalance>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ExplanationOfBenefit resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ExplanationOfBenefit resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this explanation of benefit.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this explanation of benefit.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The status of the resource instance.
     * 
     */
    @JsonProperty("status")
    public ExplanationOfBenefit.Status getStatus() {
        return status;
    }

    /**
     * The status of the resource instance.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ExplanationOfBenefit.Status status) {
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subType")
    public CodeableConcept getSubType() {
        return subType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subType")
    public void setSubType(CodeableConcept subType) {
        this.subType = subType;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("use")
    public String getUse() {
        return use;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("use")
    public void setUse(String use) {
        this.use = use;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    public Element get_use() {
        return _use;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    public void set_use(Element _use) {
        this._use = _use;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("billablePeriod")
    public Period getBillablePeriod() {
        return billablePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("billablePeriod")
    public void setBillablePeriod(Period billablePeriod) {
        this.billablePeriod = billablePeriod;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public Element get_created() {
        return _created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public void set_created(Element _created) {
        this._created = _created;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    public Reference getEnterer() {
        return enterer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    public void setEnterer(Reference enterer) {
        this.enterer = enterer;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    public Reference getInsurer() {
        return insurer;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    public void setInsurer(Reference insurer) {
        this.insurer = insurer;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public Reference getProvider() {
        return provider;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
        this.provider = provider;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(CodeableConcept priority) {
        this.priority = priority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundsReserveRequested")
    public CodeableConcept getFundsReserveRequested() {
        return fundsReserveRequested;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundsReserveRequested")
    public void setFundsReserveRequested(CodeableConcept fundsReserveRequested) {
        this.fundsReserveRequested = fundsReserveRequested;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundsReserve")
    public CodeableConcept getFundsReserve() {
        return fundsReserve;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundsReserve")
    public void setFundsReserve(CodeableConcept fundsReserve) {
        this.fundsReserve = fundsReserve;
    }

    /**
     * Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.
     * 
     */
    @JsonProperty("related")
    public List<ExplanationOfBenefit_Related> getRelated() {
        return related;
    }

    /**
     * Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.
     * 
     */
    @JsonProperty("related")
    public void setRelated(List<ExplanationOfBenefit_Related> related) {
        this.related = related;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("prescription")
    public Reference getPrescription() {
        return prescription;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("prescription")
    public void setPrescription(Reference prescription) {
        this.prescription = prescription;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("originalPrescription")
    public Reference getOriginalPrescription() {
        return originalPrescription;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("originalPrescription")
    public void setOriginalPrescription(Reference originalPrescription) {
        this.originalPrescription = originalPrescription;
    }

    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("payee")
    public ExplanationOfBenefit_Payee getPayee() {
        return payee;
    }

    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("payee")
    public void setPayee(ExplanationOfBenefit_Payee payee) {
        this.payee = payee;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referral")
    public Reference getReferral() {
        return referral;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("referral")
    public void setReferral(Reference referral) {
        this.referral = referral;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claim")
    public Reference getClaim() {
        return claim;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claim")
    public void setClaim(Reference claim) {
        this.claim = claim;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claimResponse")
    public Reference getClaimResponse() {
        return claimResponse;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claimResponse")
    public void setClaimResponse(Reference claimResponse) {
        this.claimResponse = claimResponse;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("outcome")
    public String getOutcome() {
        return outcome;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public Element get_outcome() {
        return _outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public void set_outcome(Element _outcome) {
        this._outcome = _outcome;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    public String getDisposition() {
        return disposition;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public Element get_disposition() {
        return _disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public void set_disposition(Element _disposition) {
        this._disposition = _disposition;
    }

    /**
     * Reference from the Insurer which is used in later communications which refers to this adjudication.
     * 
     */
    @JsonProperty("preAuthRef")
    public List<String> getPreAuthRef() {
        return preAuthRef;
    }

    /**
     * Reference from the Insurer which is used in later communications which refers to this adjudication.
     * 
     */
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(List<String> preAuthRef) {
        this.preAuthRef = preAuthRef;
    }

    /**
     * Extensions for preAuthRef
     * 
     */
    @JsonProperty("_preAuthRef")
    public List<Element> get_preAuthRef() {
        return _preAuthRef;
    }

    /**
     * Extensions for preAuthRef
     * 
     */
    @JsonProperty("_preAuthRef")
    public void set_preAuthRef(List<Element> _preAuthRef) {
        this._preAuthRef = _preAuthRef;
    }

    /**
     * The timeframe during which the supplied preauthorization reference may be quoted on claims to obtain the adjudication as provided.
     * 
     */
    @JsonProperty("preAuthRefPeriod")
    public List<Period> getPreAuthRefPeriod() {
        return preAuthRefPeriod;
    }

    /**
     * The timeframe during which the supplied preauthorization reference may be quoted on claims to obtain the adjudication as provided.
     * 
     */
    @JsonProperty("preAuthRefPeriod")
    public void setPreAuthRefPeriod(List<Period> preAuthRefPeriod) {
        this.preAuthRefPeriod = preAuthRefPeriod;
    }

    /**
     * The members of the team who provided the products and services.
     * 
     */
    @JsonProperty("careTeam")
    public List<ExplanationOfBenefit_CareTeam> getCareTeam() {
        return careTeam;
    }

    /**
     * The members of the team who provided the products and services.
     * 
     */
    @JsonProperty("careTeam")
    public void setCareTeam(List<ExplanationOfBenefit_CareTeam> careTeam) {
        this.careTeam = careTeam;
    }

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    public List<ExplanationOfBenefit_SupportingInfo> getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(List<ExplanationOfBenefit_SupportingInfo> supportingInfo) {
        this.supportingInfo = supportingInfo;
    }

    /**
     * Information about diagnoses relevant to the claim items.
     * 
     */
    @JsonProperty("diagnosis")
    public List<ExplanationOfBenefit_Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    /**
     * Information about diagnoses relevant to the claim items.
     * 
     */
    @JsonProperty("diagnosis")
    public void setDiagnosis(List<ExplanationOfBenefit_Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Procedures performed on the patient relevant to the billing items with the claim.
     * 
     */
    @JsonProperty("procedure")
    public List<ExplanationOfBenefit_Procedure> getProcedure() {
        return procedure;
    }

    /**
     * Procedures performed on the patient relevant to the billing items with the claim.
     * 
     */
    @JsonProperty("procedure")
    public void setProcedure(List<ExplanationOfBenefit_Procedure> procedure) {
        this.procedure = procedure;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("precedence")
    public Double getPrecedence() {
        return precedence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("precedence")
    public void setPrecedence(Double precedence) {
        this.precedence = precedence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precedence")
    public Element get_precedence() {
        return _precedence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precedence")
    public void set_precedence(Element _precedence) {
        this._precedence = _precedence;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * (Required)
     * 
     */
    @JsonProperty("insurance")
    public List<ExplanationOfBenefit_Insurance> getInsurance() {
        return insurance;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * (Required)
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<ExplanationOfBenefit_Insurance> insurance) {
        this.insurance = insurance;
    }

    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("accident")
    public ExplanationOfBenefit_Accident getAccident() {
        return accident;
    }

    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("accident")
    public void setAccident(ExplanationOfBenefit_Accident accident) {
        this.accident = accident;
    }

    /**
     * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    public List<ExplanationOfBenefit_Item> getItem() {
        return item;
    }

    /**
     * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<ExplanationOfBenefit_Item> item) {
        this.item = item;
    }

    /**
     * The first-tier service adjudications for payor added product or service lines.
     * 
     */
    @JsonProperty("addItem")
    public List<ExplanationOfBenefit_AddItem> getAddItem() {
        return addItem;
    }

    /**
     * The first-tier service adjudications for payor added product or service lines.
     * 
     */
    @JsonProperty("addItem")
    public void setAddItem(List<ExplanationOfBenefit_AddItem> addItem) {
        this.addItem = addItem;
    }

    /**
     * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
     * 
     */
    @JsonProperty("adjudication")
    public List<ExplanationOfBenefit_Adjudication> getAdjudication() {
        return adjudication;
    }

    /**
     * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
     * 
     */
    @JsonProperty("adjudication")
    public void setAdjudication(List<ExplanationOfBenefit_Adjudication> adjudication) {
        this.adjudication = adjudication;
    }

    /**
     * Categorized monetary totals for the adjudication.
     * 
     */
    @JsonProperty("total")
    public List<ExplanationOfBenefit_Total> getTotal() {
        return total;
    }

    /**
     * Categorized monetary totals for the adjudication.
     * 
     */
    @JsonProperty("total")
    public void setTotal(List<ExplanationOfBenefit_Total> total) {
        this.total = total;
    }

    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("payment")
    public ExplanationOfBenefit_Payment getPayment() {
        return payment;
    }

    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     * 
     */
    @JsonProperty("payment")
    public void setPayment(ExplanationOfBenefit_Payment payment) {
        this.payment = payment;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("formCode")
    public CodeableConcept getFormCode() {
        return formCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("formCode")
    public void setFormCode(CodeableConcept formCode) {
        this.formCode = formCode;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("form")
    public Attachment getForm() {
        return form;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("form")
    public void setForm(Attachment form) {
        this.form = form;
    }

    /**
     * A note that describes or explains adjudication results in a human readable form.
     * 
     */
    @JsonProperty("processNote")
    public List<ExplanationOfBenefit_ProcessNote> getProcessNote() {
        return processNote;
    }

    /**
     * A note that describes or explains adjudication results in a human readable form.
     * 
     */
    @JsonProperty("processNote")
    public void setProcessNote(List<ExplanationOfBenefit_ProcessNote> processNote) {
        this.processNote = processNote;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("benefitPeriod")
    public Period getBenefitPeriod() {
        return benefitPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("benefitPeriod")
    public void setBenefitPeriod(Period benefitPeriod) {
        this.benefitPeriod = benefitPeriod;
    }

    /**
     * Balance by Benefit Category.
     * 
     */
    @JsonProperty("benefitBalance")
    public List<ExplanationOfBenefit_BenefitBalance> getBenefitBalance() {
        return benefitBalance;
    }

    /**
     * Balance by Benefit Category.
     * 
     */
    @JsonProperty("benefitBalance")
    public void setBenefitBalance(List<ExplanationOfBenefit_BenefitBalance> benefitBalance) {
        this.benefitBalance = benefitBalance;
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
        sb.append(ExplanationOfBenefit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("subType");
        sb.append('=');
        sb.append(((this.subType == null)?"<null>":this.subType));
        sb.append(',');
        sb.append("use");
        sb.append('=');
        sb.append(((this.use == null)?"<null>":this.use));
        sb.append(',');
        sb.append("_use");
        sb.append('=');
        sb.append(((this._use == null)?"<null>":this._use));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("billablePeriod");
        sb.append('=');
        sb.append(((this.billablePeriod == null)?"<null>":this.billablePeriod));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("enterer");
        sb.append('=');
        sb.append(((this.enterer == null)?"<null>":this.enterer));
        sb.append(',');
        sb.append("insurer");
        sb.append('=');
        sb.append(((this.insurer == null)?"<null>":this.insurer));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("fundsReserveRequested");
        sb.append('=');
        sb.append(((this.fundsReserveRequested == null)?"<null>":this.fundsReserveRequested));
        sb.append(',');
        sb.append("fundsReserve");
        sb.append('=');
        sb.append(((this.fundsReserve == null)?"<null>":this.fundsReserve));
        sb.append(',');
        sb.append("related");
        sb.append('=');
        sb.append(((this.related == null)?"<null>":this.related));
        sb.append(',');
        sb.append("prescription");
        sb.append('=');
        sb.append(((this.prescription == null)?"<null>":this.prescription));
        sb.append(',');
        sb.append("originalPrescription");
        sb.append('=');
        sb.append(((this.originalPrescription == null)?"<null>":this.originalPrescription));
        sb.append(',');
        sb.append("payee");
        sb.append('=');
        sb.append(((this.payee == null)?"<null>":this.payee));
        sb.append(',');
        sb.append("referral");
        sb.append('=');
        sb.append(((this.referral == null)?"<null>":this.referral));
        sb.append(',');
        sb.append("facility");
        sb.append('=');
        sb.append(((this.facility == null)?"<null>":this.facility));
        sb.append(',');
        sb.append("claim");
        sb.append('=');
        sb.append(((this.claim == null)?"<null>":this.claim));
        sb.append(',');
        sb.append("claimResponse");
        sb.append('=');
        sb.append(((this.claimResponse == null)?"<null>":this.claimResponse));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("_outcome");
        sb.append('=');
        sb.append(((this._outcome == null)?"<null>":this._outcome));
        sb.append(',');
        sb.append("disposition");
        sb.append('=');
        sb.append(((this.disposition == null)?"<null>":this.disposition));
        sb.append(',');
        sb.append("_disposition");
        sb.append('=');
        sb.append(((this._disposition == null)?"<null>":this._disposition));
        sb.append(',');
        sb.append("preAuthRef");
        sb.append('=');
        sb.append(((this.preAuthRef == null)?"<null>":this.preAuthRef));
        sb.append(',');
        sb.append("_preAuthRef");
        sb.append('=');
        sb.append(((this._preAuthRef == null)?"<null>":this._preAuthRef));
        sb.append(',');
        sb.append("preAuthRefPeriod");
        sb.append('=');
        sb.append(((this.preAuthRefPeriod == null)?"<null>":this.preAuthRefPeriod));
        sb.append(',');
        sb.append("careTeam");
        sb.append('=');
        sb.append(((this.careTeam == null)?"<null>":this.careTeam));
        sb.append(',');
        sb.append("supportingInfo");
        sb.append('=');
        sb.append(((this.supportingInfo == null)?"<null>":this.supportingInfo));
        sb.append(',');
        sb.append("diagnosis");
        sb.append('=');
        sb.append(((this.diagnosis == null)?"<null>":this.diagnosis));
        sb.append(',');
        sb.append("procedure");
        sb.append('=');
        sb.append(((this.procedure == null)?"<null>":this.procedure));
        sb.append(',');
        sb.append("precedence");
        sb.append('=');
        sb.append(((this.precedence == null)?"<null>":this.precedence));
        sb.append(',');
        sb.append("_precedence");
        sb.append('=');
        sb.append(((this._precedence == null)?"<null>":this._precedence));
        sb.append(',');
        sb.append("insurance");
        sb.append('=');
        sb.append(((this.insurance == null)?"<null>":this.insurance));
        sb.append(',');
        sb.append("accident");
        sb.append('=');
        sb.append(((this.accident == null)?"<null>":this.accident));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("addItem");
        sb.append('=');
        sb.append(((this.addItem == null)?"<null>":this.addItem));
        sb.append(',');
        sb.append("adjudication");
        sb.append('=');
        sb.append(((this.adjudication == null)?"<null>":this.adjudication));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("formCode");
        sb.append('=');
        sb.append(((this.formCode == null)?"<null>":this.formCode));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("processNote");
        sb.append('=');
        sb.append(((this.processNote == null)?"<null>":this.processNote));
        sb.append(',');
        sb.append("benefitPeriod");
        sb.append('=');
        sb.append(((this.benefitPeriod == null)?"<null>":this.benefitPeriod));
        sb.append(',');
        sb.append("benefitBalance");
        sb.append('=');
        sb.append(((this.benefitBalance == null)?"<null>":this.benefitBalance));
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
        result = ((result* 31)+((this.insurance == null)? 0 :this.insurance.hashCode()));
        result = ((result* 31)+((this.benefitPeriod == null)? 0 :this.benefitPeriod.hashCode()));
        result = ((result* 31)+((this.claimResponse == null)? 0 :this.claimResponse.hashCode()));
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this._outcome == null)? 0 :this._outcome.hashCode()));
        result = ((result* 31)+((this.preAuthRef == null)? 0 :this.preAuthRef.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.precedence == null)? 0 :this.precedence.hashCode()));
        result = ((result* 31)+((this.processNote == null)? 0 :this.processNote.hashCode()));
        result = ((result* 31)+((this.payee == null)? 0 :this.payee.hashCode()));
        result = ((result* 31)+((this.supportingInfo == null)? 0 :this.supportingInfo.hashCode()));
        result = ((result* 31)+((this.enterer == null)? 0 :this.enterer.hashCode()));
        result = ((result* 31)+((this.claim == null)? 0 :this.claim.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.careTeam == null)? 0 :this.careTeam.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.diagnosis == null)? 0 :this.diagnosis.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.preAuthRefPeriod == null)? 0 :this.preAuthRefPeriod.hashCode()));
        result = ((result* 31)+((this.billablePeriod == null)? 0 :this.billablePeriod.hashCode()));
        result = ((result* 31)+((this._preAuthRef == null)? 0 :this._preAuthRef.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.benefitBalance == null)? 0 :this.benefitBalance.hashCode()));
        result = ((result* 31)+((this._disposition == null)? 0 :this._disposition.hashCode()));
        result = ((result* 31)+((this._precedence == null)? 0 :this._precedence.hashCode()));
        result = ((result* 31)+((this.accident == null)? 0 :this.accident.hashCode()));
        result = ((result* 31)+((this.adjudication == null)? 0 :this.adjudication.hashCode()));
        result = ((result* 31)+((this.addItem == null)? 0 :this.addItem.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.related == null)? 0 :this.related.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.fundsReserveRequested == null)? 0 :this.fundsReserveRequested.hashCode()));
        result = ((result* 31)+((this.fundsReserve == null)? 0 :this.fundsReserve.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.insurer == null)? 0 :this.insurer.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this._use == null)? 0 :this._use.hashCode()));
        result = ((result* 31)+((this.formCode == null)? 0 :this.formCode.hashCode()));
        result = ((result* 31)+((this.originalPrescription == null)? 0 :this.originalPrescription.hashCode()));
        result = ((result* 31)+((this.procedure == null)? 0 :this.procedure.hashCode()));
        result = ((result* 31)+((this.disposition == null)? 0 :this.disposition.hashCode()));
        result = ((result* 31)+((this.referral == null)? 0 :this.referral.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.prescription == null)? 0 :this.prescription.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.facility == null)? 0 :this.facility.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExplanationOfBenefit) == false) {
            return false;
        }
        ExplanationOfBenefit rhs = ((ExplanationOfBenefit) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.benefitPeriod == rhs.benefitPeriod)||((this.benefitPeriod!= null)&&this.benefitPeriod.equals(rhs.benefitPeriod))))&&((this.claimResponse == rhs.claimResponse)||((this.claimResponse!= null)&&this.claimResponse.equals(rhs.claimResponse))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this._outcome == rhs._outcome)||((this._outcome!= null)&&this._outcome.equals(rhs._outcome))))&&((this.preAuthRef == rhs.preAuthRef)||((this.preAuthRef!= null)&&this.preAuthRef.equals(rhs.preAuthRef))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.precedence == rhs.precedence)||((this.precedence!= null)&&this.precedence.equals(rhs.precedence))))&&((this.processNote == rhs.processNote)||((this.processNote!= null)&&this.processNote.equals(rhs.processNote))))&&((this.payee == rhs.payee)||((this.payee!= null)&&this.payee.equals(rhs.payee))))&&((this.supportingInfo == rhs.supportingInfo)||((this.supportingInfo!= null)&&this.supportingInfo.equals(rhs.supportingInfo))))&&((this.enterer == rhs.enterer)||((this.enterer!= null)&&this.enterer.equals(rhs.enterer))))&&((this.claim == rhs.claim)||((this.claim!= null)&&this.claim.equals(rhs.claim))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.careTeam == rhs.careTeam)||((this.careTeam!= null)&&this.careTeam.equals(rhs.careTeam))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.diagnosis == rhs.diagnosis)||((this.diagnosis!= null)&&this.diagnosis.equals(rhs.diagnosis))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.preAuthRefPeriod == rhs.preAuthRefPeriod)||((this.preAuthRefPeriod!= null)&&this.preAuthRefPeriod.equals(rhs.preAuthRefPeriod))))&&((this.billablePeriod == rhs.billablePeriod)||((this.billablePeriod!= null)&&this.billablePeriod.equals(rhs.billablePeriod))))&&((this._preAuthRef == rhs._preAuthRef)||((this._preAuthRef!= null)&&this._preAuthRef.equals(rhs._preAuthRef))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.benefitBalance == rhs.benefitBalance)||((this.benefitBalance!= null)&&this.benefitBalance.equals(rhs.benefitBalance))))&&((this._disposition == rhs._disposition)||((this._disposition!= null)&&this._disposition.equals(rhs._disposition))))&&((this._precedence == rhs._precedence)||((this._precedence!= null)&&this._precedence.equals(rhs._precedence))))&&((this.accident == rhs.accident)||((this.accident!= null)&&this.accident.equals(rhs.accident))))&&((this.adjudication == rhs.adjudication)||((this.adjudication!= null)&&this.adjudication.equals(rhs.adjudication))))&&((this.addItem == rhs.addItem)||((this.addItem!= null)&&this.addItem.equals(rhs.addItem))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.related == rhs.related)||((this.related!= null)&&this.related.equals(rhs.related))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.fundsReserveRequested == rhs.fundsReserveRequested)||((this.fundsReserveRequested!= null)&&this.fundsReserveRequested.equals(rhs.fundsReserveRequested))))&&((this.fundsReserve == rhs.fundsReserve)||((this.fundsReserve!= null)&&this.fundsReserve.equals(rhs.fundsReserve))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.insurer == rhs.insurer)||((this.insurer!= null)&&this.insurer.equals(rhs.insurer))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this._use == rhs._use)||((this._use!= null)&&this._use.equals(rhs._use))))&&((this.formCode == rhs.formCode)||((this.formCode!= null)&&this.formCode.equals(rhs.formCode))))&&((this.originalPrescription == rhs.originalPrescription)||((this.originalPrescription!= null)&&this.originalPrescription.equals(rhs.originalPrescription))))&&((this.procedure == rhs.procedure)||((this.procedure!= null)&&this.procedure.equals(rhs.procedure))))&&((this.disposition == rhs.disposition)||((this.disposition!= null)&&this.disposition.equals(rhs.disposition))))&&((this.referral == rhs.referral)||((this.referral!= null)&&this.referral.equals(rhs.referral))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.prescription == rhs.prescription)||((this.prescription!= null)&&this.prescription.equals(rhs.prescription))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.facility == rhs.facility)||((this.facility!= null)&&this.facility.equals(rhs.facility))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * The status of the resource instance.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        CANCELLED("cancelled"),
        DRAFT("draft"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, ExplanationOfBenefit.Status> CONSTANTS = new HashMap<String, ExplanationOfBenefit.Status>();

        static {
            for (ExplanationOfBenefit.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ExplanationOfBenefit.Status fromValue(String value) {
            ExplanationOfBenefit.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
