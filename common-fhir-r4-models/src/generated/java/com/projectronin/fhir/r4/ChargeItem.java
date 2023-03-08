
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
 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "definitionUri",
    "_definitionUri",
    "definitionCanonical",
    "status",
    "_status",
    "partOf",
    "code",
    "subject",
    "context",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrencePeriod",
    "occurrenceTiming",
    "performer",
    "performingOrganization",
    "requestingOrganization",
    "costCenter",
    "quantity",
    "bodysite",
    "factorOverride",
    "_factorOverride",
    "priceOverride",
    "overrideReason",
    "_overrideReason",
    "enterer",
    "enteredDate",
    "_enteredDate",
    "reason",
    "service",
    "productReference",
    "productCodeableConcept",
    "account",
    "note",
    "supportingInformation"
})
@Generated("jsonschema2pojo")
public class ChargeItem
    extends DomainResource
{

    /**
     * This is a ChargeItem resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ChargeItem resource")
    private String resourceType;
    /**
     * Identifiers assigned to this event performer or other systems.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers assigned to this event performer or other systems.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * References the (external) source of pricing information, rules of application for the code this ChargeItem uses.
     * 
     */
    @JsonProperty("definitionUri")
    @JsonPropertyDescription("References the (external) source of pricing information, rules of application for the code this ChargeItem uses.")
    private List<String> definitionUri = new ArrayList<String>();
    /**
     * Extensions for definitionUri
     * 
     */
    @JsonProperty("_definitionUri")
    @JsonPropertyDescription("Extensions for definitionUri")
    private List<Element> _definitionUri = new ArrayList<Element>();
    /**
     * References the source of pricing information, rules of application for the code this ChargeItem uses.
     * 
     */
    @JsonProperty("definitionCanonical")
    @JsonPropertyDescription("References the source of pricing information, rules of application for the code this ChargeItem uses.")
    private List<String> definitionCanonical = new ArrayList<String>();
    /**
     * The current state of the ChargeItem.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current state of the ChargeItem.")
    private ChargeItem.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * ChargeItems can be grouped to larger ChargeItems covering the whole set.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("ChargeItems can be grouped to larger ChargeItems covering the whole set.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
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
    @JsonProperty("context")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference context;
    /**
     * Date/time(s) or duration when the charged service was applied.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("Date/time(s) or duration when the charged service was applied.")
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
     * Indicates who or what performed or participated in the charged service.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Indicates who or what performed or participated in the charged service.")
    private List<ChargeItem_Performer> performer = new ArrayList<ChargeItem_Performer>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference performingOrganization;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requestingOrganization;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("costCenter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference costCenter;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * The anatomical location where the related service has been applied.
     * 
     */
    @JsonProperty("bodysite")
    @JsonPropertyDescription("The anatomical location where the related service has been applied.")
    private List<CodeableConcept> bodysite = new ArrayList<CodeableConcept>();
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factorOverride")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double factorOverride;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factorOverride")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _factorOverride;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("priceOverride")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money priceOverride;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("overrideReason")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String overrideReason;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_overrideReason")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _overrideReason;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("enterer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference enterer;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("enteredDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String enteredDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_enteredDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _enteredDate;
    /**
     * Describes why the event occurred in coded or textual form.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Describes why the event occurred in coded or textual form.")
    private List<CodeableConcept> reason = new ArrayList<CodeableConcept>();
    /**
     * Indicated the rendered service that caused this charge.
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("Indicated the rendered service that caused this charge.")
    private List<Reference> service = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("productReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference productReference;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept productCodeableConcept;
    /**
     * Account into which this ChargeItems belongs.
     * 
     */
    @JsonProperty("account")
    @JsonPropertyDescription("Account into which this ChargeItems belongs.")
    private List<Reference> account = new ArrayList<Reference>();
    /**
     * Comments made about the event by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the event by the performer, subject or other participants.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Further information supporting this charge.
     * 
     */
    @JsonProperty("supportingInformation")
    @JsonPropertyDescription("Further information supporting this charge.")
    private List<Reference> supportingInformation = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ChargeItem resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ChargeItem resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers assigned to this event performer or other systems.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers assigned to this event performer or other systems.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * References the (external) source of pricing information, rules of application for the code this ChargeItem uses.
     * 
     */
    @JsonProperty("definitionUri")
    public List<String> getDefinitionUri() {
        return definitionUri;
    }

    /**
     * References the (external) source of pricing information, rules of application for the code this ChargeItem uses.
     * 
     */
    @JsonProperty("definitionUri")
    public void setDefinitionUri(List<String> definitionUri) {
        this.definitionUri = definitionUri;
    }

    /**
     * Extensions for definitionUri
     * 
     */
    @JsonProperty("_definitionUri")
    public List<Element> get_definitionUri() {
        return _definitionUri;
    }

    /**
     * Extensions for definitionUri
     * 
     */
    @JsonProperty("_definitionUri")
    public void set_definitionUri(List<Element> _definitionUri) {
        this._definitionUri = _definitionUri;
    }

    /**
     * References the source of pricing information, rules of application for the code this ChargeItem uses.
     * 
     */
    @JsonProperty("definitionCanonical")
    public List<String> getDefinitionCanonical() {
        return definitionCanonical;
    }

    /**
     * References the source of pricing information, rules of application for the code this ChargeItem uses.
     * 
     */
    @JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(List<String> definitionCanonical) {
        this.definitionCanonical = definitionCanonical;
    }

    /**
     * The current state of the ChargeItem.
     * 
     */
    @JsonProperty("status")
    public ChargeItem.Status getStatus() {
        return status;
    }

    /**
     * The current state of the ChargeItem.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ChargeItem.Status status) {
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
     * ChargeItems can be grouped to larger ChargeItems covering the whole set.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * ChargeItems can be grouped to larger ChargeItems covering the whole set.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
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
    @JsonProperty("context")
    public Reference getContext() {
        return context;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("context")
    public void setContext(Reference context) {
        this.context = context;
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
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
     * Indicates who or what performed or participated in the charged service.
     * 
     */
    @JsonProperty("performer")
    public List<ChargeItem_Performer> getPerformer() {
        return performer;
    }

    /**
     * Indicates who or what performed or participated in the charged service.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<ChargeItem_Performer> performer) {
        this.performer = performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performingOrganization")
    public Reference getPerformingOrganization() {
        return performingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performingOrganization")
    public void setPerformingOrganization(Reference performingOrganization) {
        this.performingOrganization = performingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestingOrganization")
    public Reference getRequestingOrganization() {
        return requestingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestingOrganization")
    public void setRequestingOrganization(Reference requestingOrganization) {
        this.requestingOrganization = requestingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("costCenter")
    public Reference getCostCenter() {
        return costCenter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("costCenter")
    public void setCostCenter(Reference costCenter) {
        this.costCenter = costCenter;
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
     * The anatomical location where the related service has been applied.
     * 
     */
    @JsonProperty("bodysite")
    public List<CodeableConcept> getBodysite() {
        return bodysite;
    }

    /**
     * The anatomical location where the related service has been applied.
     * 
     */
    @JsonProperty("bodysite")
    public void setBodysite(List<CodeableConcept> bodysite) {
        this.bodysite = bodysite;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factorOverride")
    public Double getFactorOverride() {
        return factorOverride;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factorOverride")
    public void setFactorOverride(Double factorOverride) {
        this.factorOverride = factorOverride;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factorOverride")
    public Element get_factorOverride() {
        return _factorOverride;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factorOverride")
    public void set_factorOverride(Element _factorOverride) {
        this._factorOverride = _factorOverride;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("priceOverride")
    public Money getPriceOverride() {
        return priceOverride;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("priceOverride")
    public void setPriceOverride(Money priceOverride) {
        this.priceOverride = priceOverride;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("overrideReason")
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("overrideReason")
    public void setOverrideReason(String overrideReason) {
        this.overrideReason = overrideReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_overrideReason")
    public Element get_overrideReason() {
        return _overrideReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_overrideReason")
    public void set_overrideReason(Element _overrideReason) {
        this._overrideReason = _overrideReason;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("enteredDate")
    public String getEnteredDate() {
        return enteredDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("enteredDate")
    public void setEnteredDate(String enteredDate) {
        this.enteredDate = enteredDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_enteredDate")
    public Element get_enteredDate() {
        return _enteredDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_enteredDate")
    public void set_enteredDate(Element _enteredDate) {
        this._enteredDate = _enteredDate;
    }

    /**
     * Describes why the event occurred in coded or textual form.
     * 
     */
    @JsonProperty("reason")
    public List<CodeableConcept> getReason() {
        return reason;
    }

    /**
     * Describes why the event occurred in coded or textual form.
     * 
     */
    @JsonProperty("reason")
    public void setReason(List<CodeableConcept> reason) {
        this.reason = reason;
    }

    /**
     * Indicated the rendered service that caused this charge.
     * 
     */
    @JsonProperty("service")
    public List<Reference> getService() {
        return service;
    }

    /**
     * Indicated the rendered service that caused this charge.
     * 
     */
    @JsonProperty("service")
    public void setService(List<Reference> service) {
        this.service = service;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("productReference")
    public Reference getProductReference() {
        return productReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("productReference")
    public void setProductReference(Reference productReference) {
        this.productReference = productReference;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCodeableConcept")
    public CodeableConcept getProductCodeableConcept() {
        return productCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(CodeableConcept productCodeableConcept) {
        this.productCodeableConcept = productCodeableConcept;
    }

    /**
     * Account into which this ChargeItems belongs.
     * 
     */
    @JsonProperty("account")
    public List<Reference> getAccount() {
        return account;
    }

    /**
     * Account into which this ChargeItems belongs.
     * 
     */
    @JsonProperty("account")
    public void setAccount(List<Reference> account) {
        this.account = account;
    }

    /**
     * Comments made about the event by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the event by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Further information supporting this charge.
     * 
     */
    @JsonProperty("supportingInformation")
    public List<Reference> getSupportingInformation() {
        return supportingInformation;
    }

    /**
     * Further information supporting this charge.
     * 
     */
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(List<Reference> supportingInformation) {
        this.supportingInformation = supportingInformation;
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
        sb.append(ChargeItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("definitionUri");
        sb.append('=');
        sb.append(((this.definitionUri == null)?"<null>":this.definitionUri));
        sb.append(',');
        sb.append("_definitionUri");
        sb.append('=');
        sb.append(((this._definitionUri == null)?"<null>":this._definitionUri));
        sb.append(',');
        sb.append("definitionCanonical");
        sb.append('=');
        sb.append(((this.definitionCanonical == null)?"<null>":this.definitionCanonical));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
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
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("performingOrganization");
        sb.append('=');
        sb.append(((this.performingOrganization == null)?"<null>":this.performingOrganization));
        sb.append(',');
        sb.append("requestingOrganization");
        sb.append('=');
        sb.append(((this.requestingOrganization == null)?"<null>":this.requestingOrganization));
        sb.append(',');
        sb.append("costCenter");
        sb.append('=');
        sb.append(((this.costCenter == null)?"<null>":this.costCenter));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("bodysite");
        sb.append('=');
        sb.append(((this.bodysite == null)?"<null>":this.bodysite));
        sb.append(',');
        sb.append("factorOverride");
        sb.append('=');
        sb.append(((this.factorOverride == null)?"<null>":this.factorOverride));
        sb.append(',');
        sb.append("_factorOverride");
        sb.append('=');
        sb.append(((this._factorOverride == null)?"<null>":this._factorOverride));
        sb.append(',');
        sb.append("priceOverride");
        sb.append('=');
        sb.append(((this.priceOverride == null)?"<null>":this.priceOverride));
        sb.append(',');
        sb.append("overrideReason");
        sb.append('=');
        sb.append(((this.overrideReason == null)?"<null>":this.overrideReason));
        sb.append(',');
        sb.append("_overrideReason");
        sb.append('=');
        sb.append(((this._overrideReason == null)?"<null>":this._overrideReason));
        sb.append(',');
        sb.append("enterer");
        sb.append('=');
        sb.append(((this.enterer == null)?"<null>":this.enterer));
        sb.append(',');
        sb.append("enteredDate");
        sb.append('=');
        sb.append(((this.enteredDate == null)?"<null>":this.enteredDate));
        sb.append(',');
        sb.append("_enteredDate");
        sb.append('=');
        sb.append(((this._enteredDate == null)?"<null>":this._enteredDate));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("productReference");
        sb.append('=');
        sb.append(((this.productReference == null)?"<null>":this.productReference));
        sb.append(',');
        sb.append("productCodeableConcept");
        sb.append('=');
        sb.append(((this.productCodeableConcept == null)?"<null>":this.productCodeableConcept));
        sb.append(',');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("supportingInformation");
        sb.append('=');
        sb.append(((this.supportingInformation == null)?"<null>":this.supportingInformation));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.definitionCanonical == null)? 0 :this.definitionCanonical.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.overrideReason == null)? 0 :this.overrideReason.hashCode()));
        result = ((result* 31)+((this._enteredDate == null)? 0 :this._enteredDate.hashCode()));
        result = ((result* 31)+((this.productReference == null)? 0 :this.productReference.hashCode()));
        result = ((result* 31)+((this.definitionUri == null)? 0 :this.definitionUri.hashCode()));
        result = ((result* 31)+((this.performingOrganization == null)? 0 :this.performingOrganization.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.enterer == null)? 0 :this.enterer.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this._factorOverride == null)? 0 :this._factorOverride.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.factorOverride == null)? 0 :this.factorOverride.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.bodysite == null)? 0 :this.bodysite.hashCode()));
        result = ((result* 31)+((this.costCenter == null)? 0 :this.costCenter.hashCode()));
        result = ((result* 31)+((this.priceOverride == null)? 0 :this.priceOverride.hashCode()));
        result = ((result* 31)+((this.enteredDate == null)? 0 :this.enteredDate.hashCode()));
        result = ((result* 31)+((this.supportingInformation == null)? 0 :this.supportingInformation.hashCode()));
        result = ((result* 31)+((this.occurrenceTiming == null)? 0 :this.occurrenceTiming.hashCode()));
        result = ((result* 31)+((this._overrideReason == null)? 0 :this._overrideReason.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.occurrencePeriod == null)? 0 :this.occurrencePeriod.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this._definitionUri == null)? 0 :this._definitionUri.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.requestingOrganization == null)? 0 :this.requestingOrganization.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.productCodeableConcept == null)? 0 :this.productCodeableConcept.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargeItem) == false) {
            return false;
        }
        ChargeItem rhs = ((ChargeItem) other);
        return (((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.definitionCanonical == rhs.definitionCanonical)||((this.definitionCanonical!= null)&&this.definitionCanonical.equals(rhs.definitionCanonical))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.overrideReason == rhs.overrideReason)||((this.overrideReason!= null)&&this.overrideReason.equals(rhs.overrideReason))))&&((this._enteredDate == rhs._enteredDate)||((this._enteredDate!= null)&&this._enteredDate.equals(rhs._enteredDate))))&&((this.productReference == rhs.productReference)||((this.productReference!= null)&&this.productReference.equals(rhs.productReference))))&&((this.definitionUri == rhs.definitionUri)||((this.definitionUri!= null)&&this.definitionUri.equals(rhs.definitionUri))))&&((this.performingOrganization == rhs.performingOrganization)||((this.performingOrganization!= null)&&this.performingOrganization.equals(rhs.performingOrganization))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.enterer == rhs.enterer)||((this.enterer!= null)&&this.enterer.equals(rhs.enterer))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this._factorOverride == rhs._factorOverride)||((this._factorOverride!= null)&&this._factorOverride.equals(rhs._factorOverride))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.factorOverride == rhs.factorOverride)||((this.factorOverride!= null)&&this.factorOverride.equals(rhs.factorOverride))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.bodysite == rhs.bodysite)||((this.bodysite!= null)&&this.bodysite.equals(rhs.bodysite))))&&((this.costCenter == rhs.costCenter)||((this.costCenter!= null)&&this.costCenter.equals(rhs.costCenter))))&&((this.priceOverride == rhs.priceOverride)||((this.priceOverride!= null)&&this.priceOverride.equals(rhs.priceOverride))))&&((this.enteredDate == rhs.enteredDate)||((this.enteredDate!= null)&&this.enteredDate.equals(rhs.enteredDate))))&&((this.supportingInformation == rhs.supportingInformation)||((this.supportingInformation!= null)&&this.supportingInformation.equals(rhs.supportingInformation))))&&((this.occurrenceTiming == rhs.occurrenceTiming)||((this.occurrenceTiming!= null)&&this.occurrenceTiming.equals(rhs.occurrenceTiming))))&&((this._overrideReason == rhs._overrideReason)||((this._overrideReason!= null)&&this._overrideReason.equals(rhs._overrideReason))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.occurrencePeriod == rhs.occurrencePeriod)||((this.occurrencePeriod!= null)&&this.occurrencePeriod.equals(rhs.occurrencePeriod))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this._definitionUri == rhs._definitionUri)||((this._definitionUri!= null)&&this._definitionUri.equals(rhs._definitionUri))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this.requestingOrganization == rhs.requestingOrganization)||((this.requestingOrganization!= null)&&this.requestingOrganization.equals(rhs.requestingOrganization))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.productCodeableConcept == rhs.productCodeableConcept)||((this.productCodeableConcept!= null)&&this.productCodeableConcept.equals(rhs.productCodeableConcept))));
    }


    /**
     * The current state of the ChargeItem.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PLANNED("planned"),
        BILLABLE("billable"),
        NOT_BILLABLE("not-billable"),
        ABORTED("aborted"),
        BILLED("billed"),
        ENTERED_IN_ERROR("entered-in-error"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, ChargeItem.Status> CONSTANTS = new HashMap<String, ChargeItem.Status>();

        static {
            for (ChargeItem.Status c: values()) {
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
        public static ChargeItem.Status fromValue(String value) {
            ChargeItem.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
