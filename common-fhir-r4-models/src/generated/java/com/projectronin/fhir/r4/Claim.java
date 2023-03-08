
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
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
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
    "fundsReserve",
    "related",
    "prescription",
    "originalPrescription",
    "payee",
    "referral",
    "facility",
    "careTeam",
    "supportingInfo",
    "diagnosis",
    "procedure",
    "insurance",
    "accident",
    "item",
    "total"
})
@Generated("jsonschema2pojo")
public class Claim
    extends DomainResource
{

    /**
     * This is a Claim resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Claim resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this claim.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this claim.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
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
     * A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
     * 
     */
    @JsonProperty("use")
    @JsonPropertyDescription("A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.")
    private Claim.Use use;
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
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept priority;
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
    private List<Claim_Related> related = new ArrayList<Claim_Related>();
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
     * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
     * 
     */
    @JsonProperty("payee")
    @JsonPropertyDescription("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")
    private Claim_Payee payee;
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
     * The members of the team who provided the products and services.
     * 
     */
    @JsonProperty("careTeam")
    @JsonPropertyDescription("The members of the team who provided the products and services.")
    private List<Claim_CareTeam> careTeam = new ArrayList<Claim_CareTeam>();
    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    @JsonPropertyDescription("Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.")
    private List<Claim_SupportingInfo> supportingInfo = new ArrayList<Claim_SupportingInfo>();
    /**
     * Information about diagnoses relevant to the claim items.
     * 
     */
    @JsonProperty("diagnosis")
    @JsonPropertyDescription("Information about diagnoses relevant to the claim items.")
    private List<Claim_Diagnosis> diagnosis = new ArrayList<Claim_Diagnosis>();
    /**
     * Procedures performed on the patient relevant to the billing items with the claim.
     * 
     */
    @JsonProperty("procedure")
    @JsonPropertyDescription("Procedures performed on the patient relevant to the billing items with the claim.")
    private List<Claim_Procedure> procedure = new ArrayList<Claim_Procedure>();
    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * (Required)
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Financial instruments for reimbursement for the health care products and services specified on the claim.")
    private List<Claim_Insurance> insurance = new ArrayList<Claim_Insurance>();
    /**
     * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
     * 
     */
    @JsonProperty("accident")
    @JsonPropertyDescription("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")
    private Claim_Accident accident;
    /**
     * A claim line. Either a simple  product or service or a 'group' of details which can each be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("A claim line. Either a simple  product or service or a 'group' of details which can each be a simple items or groups of sub-details.")
    private List<Claim_Item> item = new ArrayList<Claim_Item>();
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Claim resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Claim resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this claim.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this claim.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
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
     * A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
     * 
     */
    @JsonProperty("use")
    public Claim.Use getUse() {
        return use;
    }

    /**
     * A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
     * 
     */
    @JsonProperty("use")
    public void setUse(Claim.Use use) {
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
     * 
     */
    @JsonProperty("insurer")
    public Reference getInsurer() {
        return insurer;
    }

    /**
     * A reference from one resource to another.
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
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
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
    public List<Claim_Related> getRelated() {
        return related;
    }

    /**
     * Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.
     * 
     */
    @JsonProperty("related")
    public void setRelated(List<Claim_Related> related) {
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
     * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
     * 
     */
    @JsonProperty("payee")
    public Claim_Payee getPayee() {
        return payee;
    }

    /**
     * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
     * 
     */
    @JsonProperty("payee")
    public void setPayee(Claim_Payee payee) {
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
     * The members of the team who provided the products and services.
     * 
     */
    @JsonProperty("careTeam")
    public List<Claim_CareTeam> getCareTeam() {
        return careTeam;
    }

    /**
     * The members of the team who provided the products and services.
     * 
     */
    @JsonProperty("careTeam")
    public void setCareTeam(List<Claim_CareTeam> careTeam) {
        this.careTeam = careTeam;
    }

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    public List<Claim_SupportingInfo> getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     * 
     */
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(List<Claim_SupportingInfo> supportingInfo) {
        this.supportingInfo = supportingInfo;
    }

    /**
     * Information about diagnoses relevant to the claim items.
     * 
     */
    @JsonProperty("diagnosis")
    public List<Claim_Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    /**
     * Information about diagnoses relevant to the claim items.
     * 
     */
    @JsonProperty("diagnosis")
    public void setDiagnosis(List<Claim_Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Procedures performed on the patient relevant to the billing items with the claim.
     * 
     */
    @JsonProperty("procedure")
    public List<Claim_Procedure> getProcedure() {
        return procedure;
    }

    /**
     * Procedures performed on the patient relevant to the billing items with the claim.
     * 
     */
    @JsonProperty("procedure")
    public void setProcedure(List<Claim_Procedure> procedure) {
        this.procedure = procedure;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * (Required)
     * 
     */
    @JsonProperty("insurance")
    public List<Claim_Insurance> getInsurance() {
        return insurance;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * (Required)
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<Claim_Insurance> insurance) {
        this.insurance = insurance;
    }

    /**
     * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
     * 
     */
    @JsonProperty("accident")
    public Claim_Accident getAccident() {
        return accident;
    }

    /**
     * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
     * 
     */
    @JsonProperty("accident")
    public void setAccident(Claim_Accident accident) {
        this.accident = accident;
    }

    /**
     * A claim line. Either a simple  product or service or a 'group' of details which can each be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    public List<Claim_Item> getItem() {
        return item;
    }

    /**
     * A claim line. Either a simple  product or service or a 'group' of details which can each be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<Claim_Item> item) {
        this.item = item;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("total")
    public Money getTotal() {
        return total;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("total")
    public void setTotal(Money total) {
        this.total = total;
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
        sb.append(Claim.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
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
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.accident == null)? 0 :this.accident.hashCode()));
        result = ((result* 31)+((this.payee == null)? 0 :this.payee.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.related == null)? 0 :this.related.hashCode()));
        result = ((result* 31)+((this.supportingInfo == null)? 0 :this.supportingInfo.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.fundsReserve == null)? 0 :this.fundsReserve.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.insurer == null)? 0 :this.insurer.hashCode()));
        result = ((result* 31)+((this.enterer == null)? 0 :this.enterer.hashCode()));
        result = ((result* 31)+((this.careTeam == null)? 0 :this.careTeam.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this._use == null)? 0 :this._use.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.diagnosis == null)? 0 :this.diagnosis.hashCode()));
        result = ((result* 31)+((this.originalPrescription == null)? 0 :this.originalPrescription.hashCode()));
        result = ((result* 31)+((this.procedure == null)? 0 :this.procedure.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.referral == null)? 0 :this.referral.hashCode()));
        result = ((result* 31)+((this.prescription == null)? 0 :this.prescription.hashCode()));
        result = ((result* 31)+((this.billablePeriod == null)? 0 :this.billablePeriod.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.facility == null)? 0 :this.facility.hashCode()));
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
        if ((other instanceof Claim) == false) {
            return false;
        }
        Claim rhs = ((Claim) other);
        return ((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.accident == rhs.accident)||((this.accident!= null)&&this.accident.equals(rhs.accident))))&&((this.payee == rhs.payee)||((this.payee!= null)&&this.payee.equals(rhs.payee))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.related == rhs.related)||((this.related!= null)&&this.related.equals(rhs.related))))&&((this.supportingInfo == rhs.supportingInfo)||((this.supportingInfo!= null)&&this.supportingInfo.equals(rhs.supportingInfo))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.fundsReserve == rhs.fundsReserve)||((this.fundsReserve!= null)&&this.fundsReserve.equals(rhs.fundsReserve))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.insurer == rhs.insurer)||((this.insurer!= null)&&this.insurer.equals(rhs.insurer))))&&((this.enterer == rhs.enterer)||((this.enterer!= null)&&this.enterer.equals(rhs.enterer))))&&((this.careTeam == rhs.careTeam)||((this.careTeam!= null)&&this.careTeam.equals(rhs.careTeam))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this._use == rhs._use)||((this._use!= null)&&this._use.equals(rhs._use))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.diagnosis == rhs.diagnosis)||((this.diagnosis!= null)&&this.diagnosis.equals(rhs.diagnosis))))&&((this.originalPrescription == rhs.originalPrescription)||((this.originalPrescription!= null)&&this.originalPrescription.equals(rhs.originalPrescription))))&&((this.procedure == rhs.procedure)||((this.procedure!= null)&&this.procedure.equals(rhs.procedure))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.referral == rhs.referral)||((this.referral!= null)&&this.referral.equals(rhs.referral))))&&((this.prescription == rhs.prescription)||((this.prescription!= null)&&this.prescription.equals(rhs.prescription))))&&((this.billablePeriod == rhs.billablePeriod)||((this.billablePeriod!= null)&&this.billablePeriod.equals(rhs.billablePeriod))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.facility == rhs.facility)||((this.facility!= null)&&this.facility.equals(rhs.facility))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Use {

        CLAIM("claim"),
        PREAUTHORIZATION("preauthorization"),
        PREDETERMINATION("predetermination");
        private final String value;
        private final static Map<String, Claim.Use> CONSTANTS = new HashMap<String, Claim.Use>();

        static {
            for (Claim.Use c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Use(String value) {
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
        public static Claim.Use fromValue(String value) {
            Claim.Use constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
