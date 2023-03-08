
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
 * This resource provides the adjudication details from the processing of a Claim resource.
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
    "created",
    "_created",
    "insurer",
    "requestor",
    "request",
    "outcome",
    "_outcome",
    "disposition",
    "_disposition",
    "preAuthRef",
    "_preAuthRef",
    "preAuthPeriod",
    "payeeType",
    "item",
    "addItem",
    "adjudication",
    "total",
    "payment",
    "fundsReserve",
    "formCode",
    "form",
    "processNote",
    "communicationRequest",
    "insurance",
    "error"
})
@Generated("jsonschema2pojo")
public class ClaimResponse
    extends DomainResource
{

    /**
     * This is a ClaimResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ClaimResponse resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this claim response.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this claim response.")
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
     * (Required)
     * 
     */
    @JsonProperty("insurer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference insurer;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestor")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requestor;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference request;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preAuthRef")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String preAuthRef;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preAuthRef")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _preAuthRef;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("preAuthPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period preAuthPeriod;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("payeeType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept payeeType;
    /**
     * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.")
    private List<ClaimResponse_Item> item = new ArrayList<ClaimResponse_Item>();
    /**
     * The first-tier service adjudications for payor added product or service lines.
     * 
     */
    @JsonProperty("addItem")
    @JsonPropertyDescription("The first-tier service adjudications for payor added product or service lines.")
    private List<ClaimResponse_AddItem> addItem = new ArrayList<ClaimResponse_AddItem>();
    /**
     * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
     * 
     */
    @JsonProperty("adjudication")
    @JsonPropertyDescription("The adjudication results which are presented at the header level rather than at the line-item or add-item levels.")
    private List<ClaimResponse_Adjudication> adjudication = new ArrayList<ClaimResponse_Adjudication>();
    /**
     * Categorized monetary totals for the adjudication.
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("Categorized monetary totals for the adjudication.")
    private List<ClaimResponse_Total> total = new ArrayList<ClaimResponse_Total>();
    /**
     * This resource provides the adjudication details from the processing of a Claim resource.
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("This resource provides the adjudication details from the processing of a Claim resource.")
    private ClaimResponse_Payment payment;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fundsReserve")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept fundsReserve;
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
    private List<ClaimResponse_ProcessNote> processNote = new ArrayList<ClaimResponse_ProcessNote>();
    /**
     * Request for additional supporting or authorizing information.
     * 
     */
    @JsonProperty("communicationRequest")
    @JsonPropertyDescription("Request for additional supporting or authorizing information.")
    private List<Reference> communicationRequest = new ArrayList<Reference>();
    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Financial instruments for reimbursement for the health care products and services specified on the claim.")
    private List<ClaimResponse_Insurance> insurance = new ArrayList<ClaimResponse_Insurance>();
    /**
     * Errors encountered during the processing of the adjudication.
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("Errors encountered during the processing of the adjudication.")
    private List<ClaimResponse_Error> error = new ArrayList<ClaimResponse_Error>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ClaimResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ClaimResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this claim response.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this claim response.
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
     * 
     */
    @JsonProperty("requestor")
    public Reference getRequestor() {
        return requestor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestor")
    public void setRequestor(Reference requestor) {
        this.requestor = requestor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    public Reference getRequest() {
        return request;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    public void setRequest(Reference request) {
        this.request = request;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preAuthRef")
    public String getPreAuthRef() {
        return preAuthRef;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(String preAuthRef) {
        this.preAuthRef = preAuthRef;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preAuthRef")
    public Element get_preAuthRef() {
        return _preAuthRef;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preAuthRef")
    public void set_preAuthRef(Element _preAuthRef) {
        this._preAuthRef = _preAuthRef;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("preAuthPeriod")
    public Period getPreAuthPeriod() {
        return preAuthPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("preAuthPeriod")
    public void setPreAuthPeriod(Period preAuthPeriod) {
        this.preAuthPeriod = preAuthPeriod;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("payeeType")
    public CodeableConcept getPayeeType() {
        return payeeType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("payeeType")
    public void setPayeeType(CodeableConcept payeeType) {
        this.payeeType = payeeType;
    }

    /**
     * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    public List<ClaimResponse_Item> getItem() {
        return item;
    }

    /**
     * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<ClaimResponse_Item> item) {
        this.item = item;
    }

    /**
     * The first-tier service adjudications for payor added product or service lines.
     * 
     */
    @JsonProperty("addItem")
    public List<ClaimResponse_AddItem> getAddItem() {
        return addItem;
    }

    /**
     * The first-tier service adjudications for payor added product or service lines.
     * 
     */
    @JsonProperty("addItem")
    public void setAddItem(List<ClaimResponse_AddItem> addItem) {
        this.addItem = addItem;
    }

    /**
     * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
     * 
     */
    @JsonProperty("adjudication")
    public List<ClaimResponse_Adjudication> getAdjudication() {
        return adjudication;
    }

    /**
     * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
     * 
     */
    @JsonProperty("adjudication")
    public void setAdjudication(List<ClaimResponse_Adjudication> adjudication) {
        this.adjudication = adjudication;
    }

    /**
     * Categorized monetary totals for the adjudication.
     * 
     */
    @JsonProperty("total")
    public List<ClaimResponse_Total> getTotal() {
        return total;
    }

    /**
     * Categorized monetary totals for the adjudication.
     * 
     */
    @JsonProperty("total")
    public void setTotal(List<ClaimResponse_Total> total) {
        this.total = total;
    }

    /**
     * This resource provides the adjudication details from the processing of a Claim resource.
     * 
     */
    @JsonProperty("payment")
    public ClaimResponse_Payment getPayment() {
        return payment;
    }

    /**
     * This resource provides the adjudication details from the processing of a Claim resource.
     * 
     */
    @JsonProperty("payment")
    public void setPayment(ClaimResponse_Payment payment) {
        this.payment = payment;
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
    public List<ClaimResponse_ProcessNote> getProcessNote() {
        return processNote;
    }

    /**
     * A note that describes or explains adjudication results in a human readable form.
     * 
     */
    @JsonProperty("processNote")
    public void setProcessNote(List<ClaimResponse_ProcessNote> processNote) {
        this.processNote = processNote;
    }

    /**
     * Request for additional supporting or authorizing information.
     * 
     */
    @JsonProperty("communicationRequest")
    public List<Reference> getCommunicationRequest() {
        return communicationRequest;
    }

    /**
     * Request for additional supporting or authorizing information.
     * 
     */
    @JsonProperty("communicationRequest")
    public void setCommunicationRequest(List<Reference> communicationRequest) {
        this.communicationRequest = communicationRequest;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * 
     */
    @JsonProperty("insurance")
    public List<ClaimResponse_Insurance> getInsurance() {
        return insurance;
    }

    /**
     * Financial instruments for reimbursement for the health care products and services specified on the claim.
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<ClaimResponse_Insurance> insurance) {
        this.insurance = insurance;
    }

    /**
     * Errors encountered during the processing of the adjudication.
     * 
     */
    @JsonProperty("error")
    public List<ClaimResponse_Error> getError() {
        return error;
    }

    /**
     * Errors encountered during the processing of the adjudication.
     * 
     */
    @JsonProperty("error")
    public void setError(List<ClaimResponse_Error> error) {
        this.error = error;
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
        sb.append(ClaimResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("insurer");
        sb.append('=');
        sb.append(((this.insurer == null)?"<null>":this.insurer));
        sb.append(',');
        sb.append("requestor");
        sb.append('=');
        sb.append(((this.requestor == null)?"<null>":this.requestor));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
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
        sb.append("preAuthPeriod");
        sb.append('=');
        sb.append(((this.preAuthPeriod == null)?"<null>":this.preAuthPeriod));
        sb.append(',');
        sb.append("payeeType");
        sb.append('=');
        sb.append(((this.payeeType == null)?"<null>":this.payeeType));
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
        sb.append("fundsReserve");
        sb.append('=');
        sb.append(((this.fundsReserve == null)?"<null>":this.fundsReserve));
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
        sb.append("communicationRequest");
        sb.append('=');
        sb.append(((this.communicationRequest == null)?"<null>":this.communicationRequest));
        sb.append(',');
        sb.append("insurance");
        sb.append('=');
        sb.append(((this.insurance == null)?"<null>":this.insurance));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
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
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this.payeeType == null)? 0 :this.payeeType.hashCode()));
        result = ((result* 31)+((this._outcome == null)? 0 :this._outcome.hashCode()));
        result = ((result* 31)+((this.preAuthRef == null)? 0 :this.preAuthRef.hashCode()));
        result = ((result* 31)+((this._disposition == null)? 0 :this._disposition.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.processNote == null)? 0 :this.processNote.hashCode()));
        result = ((result* 31)+((this.adjudication == null)? 0 :this.adjudication.hashCode()));
        result = ((result* 31)+((this.addItem == null)? 0 :this.addItem.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.fundsReserve == null)? 0 :this.fundsReserve.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.insurer == null)? 0 :this.insurer.hashCode()));
        result = ((result* 31)+((this.communicationRequest == null)? 0 :this.communicationRequest.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.preAuthPeriod == null)? 0 :this.preAuthPeriod.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this._use == null)? 0 :this._use.hashCode()));
        result = ((result* 31)+((this.formCode == null)? 0 :this.formCode.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.requestor == null)? 0 :this.requestor.hashCode()));
        result = ((result* 31)+((this.disposition == null)? 0 :this.disposition.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this._preAuthRef == null)? 0 :this._preAuthRef.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof ClaimResponse) == false) {
            return false;
        }
        ClaimResponse rhs = ((ClaimResponse) other);
        return (((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this.payeeType == rhs.payeeType)||((this.payeeType!= null)&&this.payeeType.equals(rhs.payeeType))))&&((this._outcome == rhs._outcome)||((this._outcome!= null)&&this._outcome.equals(rhs._outcome))))&&((this.preAuthRef == rhs.preAuthRef)||((this.preAuthRef!= null)&&this.preAuthRef.equals(rhs.preAuthRef))))&&((this._disposition == rhs._disposition)||((this._disposition!= null)&&this._disposition.equals(rhs._disposition))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.processNote == rhs.processNote)||((this.processNote!= null)&&this.processNote.equals(rhs.processNote))))&&((this.adjudication == rhs.adjudication)||((this.adjudication!= null)&&this.adjudication.equals(rhs.adjudication))))&&((this.addItem == rhs.addItem)||((this.addItem!= null)&&this.addItem.equals(rhs.addItem))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.fundsReserve == rhs.fundsReserve)||((this.fundsReserve!= null)&&this.fundsReserve.equals(rhs.fundsReserve))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.insurer == rhs.insurer)||((this.insurer!= null)&&this.insurer.equals(rhs.insurer))))&&((this.communicationRequest == rhs.communicationRequest)||((this.communicationRequest!= null)&&this.communicationRequest.equals(rhs.communicationRequest))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.preAuthPeriod == rhs.preAuthPeriod)||((this.preAuthPeriod!= null)&&this.preAuthPeriod.equals(rhs.preAuthPeriod))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this._use == rhs._use)||((this._use!= null)&&this._use.equals(rhs._use))))&&((this.formCode == rhs.formCode)||((this.formCode!= null)&&this.formCode.equals(rhs.formCode))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.requestor == rhs.requestor)||((this.requestor!= null)&&this.requestor.equals(rhs.requestor))))&&((this.disposition == rhs.disposition)||((this.disposition!= null)&&this.disposition.equals(rhs.disposition))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this._preAuthRef == rhs._preAuthRef)||((this._preAuthRef!= null)&&this._preAuthRef.equals(rhs._preAuthRef))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
