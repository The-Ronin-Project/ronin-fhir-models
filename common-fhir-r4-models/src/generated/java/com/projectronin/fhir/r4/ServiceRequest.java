
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
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "basedOn",
    "replaces",
    "requisition",
    "status",
    "_status",
    "intent",
    "_intent",
    "category",
    "priority",
    "_priority",
    "doNotPerform",
    "_doNotPerform",
    "code",
    "orderDetail",
    "quantityQuantity",
    "quantityRatio",
    "quantityRange",
    "subject",
    "encounter",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrencePeriod",
    "occurrenceTiming",
    "asNeededBoolean",
    "_asNeededBoolean",
    "asNeededCodeableConcept",
    "authoredOn",
    "_authoredOn",
    "requester",
    "performerType",
    "performer",
    "locationCode",
    "locationReference",
    "reasonCode",
    "reasonReference",
    "insurance",
    "supportingInfo",
    "specimen",
    "bodySite",
    "note",
    "patientInstruction",
    "_patientInstruction",
    "relevantHistory"
})
@Generated("jsonschema2pojo")
public class ServiceRequest
    extends DomainResource
{

    /**
     * This is a ServiceRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ServiceRequest resource")
    private String resourceType;
    /**
     * Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * Plan/proposal/order fulfilled by this request.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("Plan/proposal/order fulfilled by this request.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * The request takes the place of the referenced completed or terminated request(s).
     * 
     */
    @JsonProperty("replaces")
    @JsonPropertyDescription("The request takes the place of the referenced completed or terminated request(s).")
    private List<Reference> replaces = new ArrayList<Reference>();
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("requisition")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier requisition;
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String intent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _intent;
    /**
     * A code that classifies the service for searching, sorting and display purposes (e.g. &quot;Surgical Procedure&quot;).
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A code that classifies the service for searching, sorting and display purposes (e.g. \"Surgical Procedure\").")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String priority;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _priority;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean doNotPerform;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doNotPerform;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * Additional details and instructions about the how the services are to be delivered.   For example, and order for a urinary catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional instructions specifying how the bandage should be applied.
     * 
     */
    @JsonProperty("orderDetail")
    @JsonPropertyDescription("Additional details and instructions about the how the services are to be delivered.   For example, and order for a urinary catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional instructions specifying how the bandage should be applied.")
    private List<CodeableConcept> orderDetail = new ArrayList<CodeableConcept>();
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantityQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantityQuantity;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("quantityRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio quantityRatio;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("quantityRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range quantityRange;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * The date/time at which the requested service should occur.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("The date/time at which the requested service should occur.")
    private String occurrenceDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurrenceDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period occurrencePeriod;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("occurrenceTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing occurrenceTiming;
    /**
     * If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example &quot;pain&quot;, &quot;on flare-up&quot;, etc.
     * 
     */
    @JsonProperty("asNeededBoolean")
    @JsonPropertyDescription("If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example \"pain\", \"on flare-up\", etc.")
    private Boolean asNeededBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_asNeededBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _asNeededBoolean;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("asNeededCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept asNeededCodeableConcept;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String authoredOn;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _authoredOn;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requester;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept performerType;
    /**
     * The desired performer for doing the requested service.  For example, the surgeon, dermatopathologist, endoscopist, etc.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("The desired performer for doing the requested service.  For example, the surgeon, dermatopathologist, endoscopist, etc.")
    private List<Reference> performer = new ArrayList<Reference>();
    /**
     * The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.
     * 
     */
    @JsonProperty("locationCode")
    @JsonPropertyDescription("The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.")
    private List<CodeableConcept> locationCode = new ArrayList<CodeableConcept>();
    /**
     * A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care center.
     * 
     */
    @JsonProperty("locationReference")
    @JsonPropertyDescription("A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care center.")
    private List<Reference> locationReference = new ArrayList<Reference>();
    /**
     * An explanation or justification for why this service is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in `supportingInfo`.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("An explanation or justification for why this service is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in `supportingInfo`.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource that provides a justification for why this service is being requested.   May relate to the resources referred to in `supportingInfo`.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource that provides a justification for why this service is being requested.   May relate to the resources referred to in `supportingInfo`.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.
     * 
     */
    @JsonProperty("insurance")
    @JsonPropertyDescription("Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.")
    private List<Reference> insurance = new ArrayList<Reference>();
    /**
     * Additional clinical information about the patient or specimen that may influence the services or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as &quot;ask at order entry questions (AOEs)&quot;.  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
     * 
     */
    @JsonProperty("supportingInfo")
    @JsonPropertyDescription("Additional clinical information about the patient or specimen that may influence the services or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as \"ask at order entry questions (AOEs)\".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.")
    private List<Reference> supportingInfo = new ArrayList<Reference>();
    /**
     * One or more specimens that the laboratory procedure will use.
     * 
     */
    @JsonProperty("specimen")
    @JsonPropertyDescription("One or more specimens that the laboratory procedure will use.")
    private List<Reference> specimen = new ArrayList<Reference>();
    /**
     * Anatomic location where the procedure should be performed. This is the target site.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("Anatomic location where the procedure should be performed. This is the target site.")
    private List<CodeableConcept> bodySite = new ArrayList<CodeableConcept>();
    /**
     * Any other notes and comments made about the service request. For example, internal billing notes.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Any other notes and comments made about the service request. For example, internal billing notes.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String patientInstruction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patientInstruction;
    /**
     * Key events in the history of the request.
     * 
     */
    @JsonProperty("relevantHistory")
    @JsonPropertyDescription("Key events in the history of the request.")
    private List<Reference> relevantHistory = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ServiceRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ServiceRequest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     * 
     */
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(List<String> instantiatesUri) {
        this.instantiatesUri = instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public List<Element> get_instantiatesUri() {
        return _instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public void set_instantiatesUri(List<Element> _instantiatesUri) {
        this._instantiatesUri = _instantiatesUri;
    }

    /**
     * Plan/proposal/order fulfilled by this request.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * Plan/proposal/order fulfilled by this request.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * The request takes the place of the referenced completed or terminated request(s).
     * 
     */
    @JsonProperty("replaces")
    public List<Reference> getReplaces() {
        return replaces;
    }

    /**
     * The request takes the place of the referenced completed or terminated request(s).
     * 
     */
    @JsonProperty("replaces")
    public void setReplaces(List<Reference> replaces) {
        this.replaces = replaces;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("requisition")
    public Identifier getRequisition() {
        return requisition;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("requisition")
    public void setRequisition(Identifier requisition) {
        this.requisition = requisition;
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public Element get_intent() {
        return _intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public void set_intent(Element _intent) {
        this._intent = _intent;
    }

    /**
     * A code that classifies the service for searching, sorting and display purposes (e.g. &quot;Surgical Procedure&quot;).
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A code that classifies the service for searching, sorting and display purposes (e.g. &quot;Surgical Procedure&quot;).
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public Element get_priority() {
        return _priority;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_priority")
    public void set_priority(Element _priority) {
        this._priority = _priority;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    public Boolean getDoNotPerform() {
        return doNotPerform;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Boolean doNotPerform) {
        this.doNotPerform = doNotPerform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    public Element get_doNotPerform() {
        return _doNotPerform;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doNotPerform")
    public void set_doNotPerform(Element _doNotPerform) {
        this._doNotPerform = _doNotPerform;
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
     * Additional details and instructions about the how the services are to be delivered.   For example, and order for a urinary catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional instructions specifying how the bandage should be applied.
     * 
     */
    @JsonProperty("orderDetail")
    public List<CodeableConcept> getOrderDetail() {
        return orderDetail;
    }

    /**
     * Additional details and instructions about the how the services are to be delivered.   For example, and order for a urinary catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional instructions specifying how the bandage should be applied.
     * 
     */
    @JsonProperty("orderDetail")
    public void setOrderDetail(List<CodeableConcept> orderDetail) {
        this.orderDetail = orderDetail;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantityQuantity")
    public Quantity getQuantityQuantity() {
        return quantityQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantityQuantity")
    public void setQuantityQuantity(Quantity quantityQuantity) {
        this.quantityQuantity = quantityQuantity;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("quantityRatio")
    public Ratio getQuantityRatio() {
        return quantityRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("quantityRatio")
    public void setQuantityRatio(Ratio quantityRatio) {
        this.quantityRatio = quantityRatio;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("quantityRange")
    public Range getQuantityRange() {
        return quantityRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("quantityRange")
    public void setQuantityRange(Range quantityRange) {
        this.quantityRange = quantityRange;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(Reference encounter) {
        this.encounter = encounter;
    }

    /**
     * The date/time at which the requested service should occur.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * The date/time at which the requested service should occur.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public Element get_occurrenceDateTime() {
        return _occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public void set_occurrenceDateTime(Element _occurrenceDateTime) {
        this._occurrenceDateTime = _occurrenceDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public Period getOccurrencePeriod() {
        return occurrencePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Period occurrencePeriod) {
        this.occurrencePeriod = occurrencePeriod;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("occurrenceTiming")
    public Timing getOccurrenceTiming() {
        return occurrenceTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Timing occurrenceTiming) {
        this.occurrenceTiming = occurrenceTiming;
    }

    /**
     * If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example &quot;pain&quot;, &quot;on flare-up&quot;, etc.
     * 
     */
    @JsonProperty("asNeededBoolean")
    public Boolean getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example &quot;pain&quot;, &quot;on flare-up&quot;, etc.
     * 
     */
    @JsonProperty("asNeededBoolean")
    public void setAsNeededBoolean(Boolean asNeededBoolean) {
        this.asNeededBoolean = asNeededBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_asNeededBoolean")
    public Element get_asNeededBoolean() {
        return _asNeededBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_asNeededBoolean")
    public void set_asNeededBoolean(Element _asNeededBoolean) {
        this._asNeededBoolean = _asNeededBoolean;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("asNeededCodeableConcept")
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("asNeededCodeableConcept")
    public void setAsNeededCodeableConcept(CodeableConcept asNeededCodeableConcept) {
        this.asNeededCodeableConcept = asNeededCodeableConcept;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    public String getAuthoredOn() {
        return authoredOn;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("authoredOn")
    public void setAuthoredOn(String authoredOn) {
        this.authoredOn = authoredOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    public Element get_authoredOn() {
        return _authoredOn;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authoredOn")
    public void set_authoredOn(Element _authoredOn) {
        this._authoredOn = _authoredOn;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    public Reference getRequester() {
        return requester;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requester")
    public void setRequester(Reference requester) {
        this.requester = requester;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerType")
    public CodeableConcept getPerformerType() {
        return performerType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerType")
    public void setPerformerType(CodeableConcept performerType) {
        this.performerType = performerType;
    }

    /**
     * The desired performer for doing the requested service.  For example, the surgeon, dermatopathologist, endoscopist, etc.
     * 
     */
    @JsonProperty("performer")
    public List<Reference> getPerformer() {
        return performer;
    }

    /**
     * The desired performer for doing the requested service.  For example, the surgeon, dermatopathologist, endoscopist, etc.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<Reference> performer) {
        this.performer = performer;
    }

    /**
     * The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.
     * 
     */
    @JsonProperty("locationCode")
    public List<CodeableConcept> getLocationCode() {
        return locationCode;
    }

    /**
     * The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.
     * 
     */
    @JsonProperty("locationCode")
    public void setLocationCode(List<CodeableConcept> locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care center.
     * 
     */
    @JsonProperty("locationReference")
    public List<Reference> getLocationReference() {
        return locationReference;
    }

    /**
     * A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care center.
     * 
     */
    @JsonProperty("locationReference")
    public void setLocationReference(List<Reference> locationReference) {
        this.locationReference = locationReference;
    }

    /**
     * An explanation or justification for why this service is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in `supportingInfo`.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * An explanation or justification for why this service is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in `supportingInfo`.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource that provides a justification for why this service is being requested.   May relate to the resources referred to in `supportingInfo`.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource that provides a justification for why this service is being requested.   May relate to the resources referred to in `supportingInfo`.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.
     * 
     */
    @JsonProperty("insurance")
    public List<Reference> getInsurance() {
        return insurance;
    }

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.
     * 
     */
    @JsonProperty("insurance")
    public void setInsurance(List<Reference> insurance) {
        this.insurance = insurance;
    }

    /**
     * Additional clinical information about the patient or specimen that may influence the services or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as &quot;ask at order entry questions (AOEs)&quot;.  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
     * 
     */
    @JsonProperty("supportingInfo")
    public List<Reference> getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Additional clinical information about the patient or specimen that may influence the services or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as &quot;ask at order entry questions (AOEs)&quot;.  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
     * 
     */
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(List<Reference> supportingInfo) {
        this.supportingInfo = supportingInfo;
    }

    /**
     * One or more specimens that the laboratory procedure will use.
     * 
     */
    @JsonProperty("specimen")
    public List<Reference> getSpecimen() {
        return specimen;
    }

    /**
     * One or more specimens that the laboratory procedure will use.
     * 
     */
    @JsonProperty("specimen")
    public void setSpecimen(List<Reference> specimen) {
        this.specimen = specimen;
    }

    /**
     * Anatomic location where the procedure should be performed. This is the target site.
     * 
     */
    @JsonProperty("bodySite")
    public List<CodeableConcept> getBodySite() {
        return bodySite;
    }

    /**
     * Anatomic location where the procedure should be performed. This is the target site.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(List<CodeableConcept> bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * Any other notes and comments made about the service request. For example, internal billing notes.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Any other notes and comments made about the service request. For example, internal billing notes.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    public String getPatientInstruction() {
        return patientInstruction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    public void setPatientInstruction(String patientInstruction) {
        this.patientInstruction = patientInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    public Element get_patientInstruction() {
        return _patientInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    public void set_patientInstruction(Element _patientInstruction) {
        this._patientInstruction = _patientInstruction;
    }

    /**
     * Key events in the history of the request.
     * 
     */
    @JsonProperty("relevantHistory")
    public List<Reference> getRelevantHistory() {
        return relevantHistory;
    }

    /**
     * Key events in the history of the request.
     * 
     */
    @JsonProperty("relevantHistory")
    public void setRelevantHistory(List<Reference> relevantHistory) {
        this.relevantHistory = relevantHistory;
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
        sb.append(ServiceRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("instantiatesCanonical");
        sb.append('=');
        sb.append(((this.instantiatesCanonical == null)?"<null>":this.instantiatesCanonical));
        sb.append(',');
        sb.append("instantiatesUri");
        sb.append('=');
        sb.append(((this.instantiatesUri == null)?"<null>":this.instantiatesUri));
        sb.append(',');
        sb.append("_instantiatesUri");
        sb.append('=');
        sb.append(((this._instantiatesUri == null)?"<null>":this._instantiatesUri));
        sb.append(',');
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("replaces");
        sb.append('=');
        sb.append(((this.replaces == null)?"<null>":this.replaces));
        sb.append(',');
        sb.append("requisition");
        sb.append('=');
        sb.append(((this.requisition == null)?"<null>":this.requisition));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("intent");
        sb.append('=');
        sb.append(((this.intent == null)?"<null>":this.intent));
        sb.append(',');
        sb.append("_intent");
        sb.append('=');
        sb.append(((this._intent == null)?"<null>":this._intent));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("_priority");
        sb.append('=');
        sb.append(((this._priority == null)?"<null>":this._priority));
        sb.append(',');
        sb.append("doNotPerform");
        sb.append('=');
        sb.append(((this.doNotPerform == null)?"<null>":this.doNotPerform));
        sb.append(',');
        sb.append("_doNotPerform");
        sb.append('=');
        sb.append(((this._doNotPerform == null)?"<null>":this._doNotPerform));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("orderDetail");
        sb.append('=');
        sb.append(((this.orderDetail == null)?"<null>":this.orderDetail));
        sb.append(',');
        sb.append("quantityQuantity");
        sb.append('=');
        sb.append(((this.quantityQuantity == null)?"<null>":this.quantityQuantity));
        sb.append(',');
        sb.append("quantityRatio");
        sb.append('=');
        sb.append(((this.quantityRatio == null)?"<null>":this.quantityRatio));
        sb.append(',');
        sb.append("quantityRange");
        sb.append('=');
        sb.append(((this.quantityRange == null)?"<null>":this.quantityRange));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("occurrenceDateTime");
        sb.append('=');
        sb.append(((this.occurrenceDateTime == null)?"<null>":this.occurrenceDateTime));
        sb.append(',');
        sb.append("_occurrenceDateTime");
        sb.append('=');
        sb.append(((this._occurrenceDateTime == null)?"<null>":this._occurrenceDateTime));
        sb.append(',');
        sb.append("occurrencePeriod");
        sb.append('=');
        sb.append(((this.occurrencePeriod == null)?"<null>":this.occurrencePeriod));
        sb.append(',');
        sb.append("occurrenceTiming");
        sb.append('=');
        sb.append(((this.occurrenceTiming == null)?"<null>":this.occurrenceTiming));
        sb.append(',');
        sb.append("asNeededBoolean");
        sb.append('=');
        sb.append(((this.asNeededBoolean == null)?"<null>":this.asNeededBoolean));
        sb.append(',');
        sb.append("_asNeededBoolean");
        sb.append('=');
        sb.append(((this._asNeededBoolean == null)?"<null>":this._asNeededBoolean));
        sb.append(',');
        sb.append("asNeededCodeableConcept");
        sb.append('=');
        sb.append(((this.asNeededCodeableConcept == null)?"<null>":this.asNeededCodeableConcept));
        sb.append(',');
        sb.append("authoredOn");
        sb.append('=');
        sb.append(((this.authoredOn == null)?"<null>":this.authoredOn));
        sb.append(',');
        sb.append("_authoredOn");
        sb.append('=');
        sb.append(((this._authoredOn == null)?"<null>":this._authoredOn));
        sb.append(',');
        sb.append("requester");
        sb.append('=');
        sb.append(((this.requester == null)?"<null>":this.requester));
        sb.append(',');
        sb.append("performerType");
        sb.append('=');
        sb.append(((this.performerType == null)?"<null>":this.performerType));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("locationCode");
        sb.append('=');
        sb.append(((this.locationCode == null)?"<null>":this.locationCode));
        sb.append(',');
        sb.append("locationReference");
        sb.append('=');
        sb.append(((this.locationReference == null)?"<null>":this.locationReference));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("insurance");
        sb.append('=');
        sb.append(((this.insurance == null)?"<null>":this.insurance));
        sb.append(',');
        sb.append("supportingInfo");
        sb.append('=');
        sb.append(((this.supportingInfo == null)?"<null>":this.supportingInfo));
        sb.append(',');
        sb.append("specimen");
        sb.append('=');
        sb.append(((this.specimen == null)?"<null>":this.specimen));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("patientInstruction");
        sb.append('=');
        sb.append(((this.patientInstruction == null)?"<null>":this.patientInstruction));
        sb.append(',');
        sb.append("_patientInstruction");
        sb.append('=');
        sb.append(((this._patientInstruction == null)?"<null>":this._patientInstruction));
        sb.append(',');
        sb.append("relevantHistory");
        sb.append('=');
        sb.append(((this.relevantHistory == null)?"<null>":this.relevantHistory));
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
        result = ((result* 31)+((this.requisition == null)? 0 :this.requisition.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.relevantHistory == null)? 0 :this.relevantHistory.hashCode()));
        result = ((result* 31)+((this.supportingInfo == null)? 0 :this.supportingInfo.hashCode()));
        result = ((result* 31)+((this.quantityQuantity == null)? 0 :this.quantityQuantity.hashCode()));
        result = ((result* 31)+((this.asNeededBoolean == null)? 0 :this.asNeededBoolean.hashCode()));
        result = ((result* 31)+((this.locationReference == null)? 0 :this.locationReference.hashCode()));
        result = ((result* 31)+((this.doNotPerform == null)? 0 :this.doNotPerform.hashCode()));
        result = ((result* 31)+((this.requester == null)? 0 :this.requester.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.occurrenceTiming == null)? 0 :this.occurrenceTiming.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.occurrencePeriod == null)? 0 :this.occurrencePeriod.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.locationCode == null)? 0 :this.locationCode.hashCode()));
        result = ((result* 31)+((this._asNeededBoolean == null)? 0 :this._asNeededBoolean.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.patientInstruction == null)? 0 :this.patientInstruction.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.specimen == null)? 0 :this.specimen.hashCode()));
        result = ((result* 31)+((this._patientInstruction == null)? 0 :this._patientInstruction.hashCode()));
        result = ((result* 31)+((this.quantityRatio == null)? 0 :this.quantityRatio.hashCode()));
        result = ((result* 31)+((this._intent == null)? 0 :this._intent.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this._doNotPerform == null)? 0 :this._doNotPerform.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.asNeededCodeableConcept == null)? 0 :this.asNeededCodeableConcept.hashCode()));
        result = ((result* 31)+((this._authoredOn == null)? 0 :this._authoredOn.hashCode()));
        result = ((result* 31)+((this.authoredOn == null)? 0 :this.authoredOn.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.replaces == null)? 0 :this.replaces.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.quantityRange == null)? 0 :this.quantityRange.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.intent == null)? 0 :this.intent.hashCode()));
        result = ((result* 31)+((this.performerType == null)? 0 :this.performerType.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.orderDetail == null)? 0 :this.orderDetail.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceRequest) == false) {
            return false;
        }
        ServiceRequest rhs = ((ServiceRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.insurance == rhs.insurance)||((this.insurance!= null)&&this.insurance.equals(rhs.insurance))))&&((this.requisition == rhs.requisition)||((this.requisition!= null)&&this.requisition.equals(rhs.requisition))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.relevantHistory == rhs.relevantHistory)||((this.relevantHistory!= null)&&this.relevantHistory.equals(rhs.relevantHistory))))&&((this.supportingInfo == rhs.supportingInfo)||((this.supportingInfo!= null)&&this.supportingInfo.equals(rhs.supportingInfo))))&&((this.quantityQuantity == rhs.quantityQuantity)||((this.quantityQuantity!= null)&&this.quantityQuantity.equals(rhs.quantityQuantity))))&&((this.asNeededBoolean == rhs.asNeededBoolean)||((this.asNeededBoolean!= null)&&this.asNeededBoolean.equals(rhs.asNeededBoolean))))&&((this.locationReference == rhs.locationReference)||((this.locationReference!= null)&&this.locationReference.equals(rhs.locationReference))))&&((this.doNotPerform == rhs.doNotPerform)||((this.doNotPerform!= null)&&this.doNotPerform.equals(rhs.doNotPerform))))&&((this.requester == rhs.requester)||((this.requester!= null)&&this.requester.equals(rhs.requester))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.occurrenceTiming == rhs.occurrenceTiming)||((this.occurrenceTiming!= null)&&this.occurrenceTiming.equals(rhs.occurrenceTiming))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.occurrencePeriod == rhs.occurrencePeriod)||((this.occurrencePeriod!= null)&&this.occurrencePeriod.equals(rhs.occurrencePeriod))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.locationCode == rhs.locationCode)||((this.locationCode!= null)&&this.locationCode.equals(rhs.locationCode))))&&((this._asNeededBoolean == rhs._asNeededBoolean)||((this._asNeededBoolean!= null)&&this._asNeededBoolean.equals(rhs._asNeededBoolean))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.patientInstruction == rhs.patientInstruction)||((this.patientInstruction!= null)&&this.patientInstruction.equals(rhs.patientInstruction))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.specimen == rhs.specimen)||((this.specimen!= null)&&this.specimen.equals(rhs.specimen))))&&((this._patientInstruction == rhs._patientInstruction)||((this._patientInstruction!= null)&&this._patientInstruction.equals(rhs._patientInstruction))))&&((this.quantityRatio == rhs.quantityRatio)||((this.quantityRatio!= null)&&this.quantityRatio.equals(rhs.quantityRatio))))&&((this._intent == rhs._intent)||((this._intent!= null)&&this._intent.equals(rhs._intent))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this._doNotPerform == rhs._doNotPerform)||((this._doNotPerform!= null)&&this._doNotPerform.equals(rhs._doNotPerform))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.asNeededCodeableConcept == rhs.asNeededCodeableConcept)||((this.asNeededCodeableConcept!= null)&&this.asNeededCodeableConcept.equals(rhs.asNeededCodeableConcept))))&&((this._authoredOn == rhs._authoredOn)||((this._authoredOn!= null)&&this._authoredOn.equals(rhs._authoredOn))))&&((this.authoredOn == rhs.authoredOn)||((this.authoredOn!= null)&&this.authoredOn.equals(rhs.authoredOn))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.replaces == rhs.replaces)||((this.replaces!= null)&&this.replaces.equals(rhs.replaces))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.quantityRange == rhs.quantityRange)||((this.quantityRange!= null)&&this.quantityRange.equals(rhs.quantityRange))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.intent == rhs.intent)||((this.intent!= null)&&this.intent.equals(rhs.intent))))&&((this.performerType == rhs.performerType)||((this.performerType!= null)&&this.performerType.equals(rhs.performerType))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.orderDetail == rhs.orderDetail)||((this.orderDetail!= null)&&this.orderDetail.equals(rhs.orderDetail))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
