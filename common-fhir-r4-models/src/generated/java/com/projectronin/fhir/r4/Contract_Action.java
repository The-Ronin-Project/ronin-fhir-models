
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "doNotPerform",
    "_doNotPerform",
    "type",
    "subject",
    "intent",
    "linkId",
    "_linkId",
    "status",
    "context",
    "contextLinkId",
    "_contextLinkId",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "occurrencePeriod",
    "occurrenceTiming",
    "requester",
    "requesterLinkId",
    "_requesterLinkId",
    "performerType",
    "performerRole",
    "performer",
    "performerLinkId",
    "_performerLinkId",
    "reasonCode",
    "reasonReference",
    "reason",
    "_reason",
    "reasonLinkId",
    "_reasonLinkId",
    "note",
    "securityLabelNumber",
    "_securityLabelNumber"
})
@Generated("jsonschema2pojo")
public class Contract_Action {

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
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * Entity of the action.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("Entity of the action.")
    private List<Contract_Subject> subject = new ArrayList<Contract_Subject>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("intent")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept intent;
    /**
     * Id [identifier??] of the clause or question text related to this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    @JsonPropertyDescription("Id [identifier??] of the clause or question text related to this action in the referenced form or QuestionnaireResponse.")
    private List<String> linkId = new ArrayList<String>();
    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    @JsonPropertyDescription("Extensions for linkId")
    private List<Element> _linkId = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept status;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference context;
    /**
     * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("contextLinkId")
    @JsonPropertyDescription("Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.")
    private List<String> contextLinkId = new ArrayList<String>();
    /**
     * Extensions for contextLinkId
     * 
     */
    @JsonProperty("_contextLinkId")
    @JsonPropertyDescription("Extensions for contextLinkId")
    private List<Element> _contextLinkId = new ArrayList<Element>();
    /**
     * When action happens.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("When action happens.")
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
     * Who or what initiated the action and has responsibility for its activation.
     * 
     */
    @JsonProperty("requester")
    @JsonPropertyDescription("Who or what initiated the action and has responsibility for its activation.")
    private List<Reference> requester = new ArrayList<Reference>();
    /**
     * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("requesterLinkId")
    @JsonPropertyDescription("Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.")
    private List<String> requesterLinkId = new ArrayList<String>();
    /**
     * Extensions for requesterLinkId
     * 
     */
    @JsonProperty("_requesterLinkId")
    @JsonPropertyDescription("Extensions for requesterLinkId")
    private List<Element> _requesterLinkId = new ArrayList<Element>();
    /**
     * The type of individual that is desired or required to perform or not perform the action.
     * 
     */
    @JsonProperty("performerType")
    @JsonPropertyDescription("The type of individual that is desired or required to perform or not perform the action.")
    private List<CodeableConcept> performerType = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerRole")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept performerRole;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference performer;
    /**
     * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("performerLinkId")
    @JsonPropertyDescription("Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.")
    private List<String> performerLinkId = new ArrayList<String>();
    /**
     * Extensions for performerLinkId
     * 
     */
    @JsonProperty("_performerLinkId")
    @JsonPropertyDescription("Extensions for performerLinkId")
    private List<Element> _performerLinkId = new ArrayList<Element>();
    /**
     * Rationale for the action to be performed or not performed. Describes why the action is permitted or prohibited.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Rationale for the action to be performed or not performed. Describes why the action is permitted or prohibited.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource whose existence justifies permitting or not permitting this action.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource whose existence justifies permitting or not permitting this action.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Describes why the action is to be performed or not performed in textual form.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Describes why the action is to be performed or not performed in textual form.")
    private List<String> reason = new ArrayList<String>();
    /**
     * Extensions for reason
     * 
     */
    @JsonProperty("_reason")
    @JsonPropertyDescription("Extensions for reason")
    private List<Element> _reason = new ArrayList<Element>();
    /**
     * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("reasonLinkId")
    @JsonPropertyDescription("Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.")
    private List<String> reasonLinkId = new ArrayList<String>();
    /**
     * Extensions for reasonLinkId
     * 
     */
    @JsonProperty("_reasonLinkId")
    @JsonPropertyDescription("Extensions for reasonLinkId")
    private List<Element> _reasonLinkId = new ArrayList<Element>();
    /**
     * Comments made about the term action made by the requester, performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the term action made by the requester, performer, subject or other participants.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Security labels that protects the action.
     * 
     */
    @JsonProperty("securityLabelNumber")
    @JsonPropertyDescription("Security labels that protects the action.")
    private List<Double> securityLabelNumber = new ArrayList<Double>();
    /**
     * Extensions for securityLabelNumber
     * 
     */
    @JsonProperty("_securityLabelNumber")
    @JsonPropertyDescription("Extensions for securityLabelNumber")
    private List<Element> _securityLabelNumber = new ArrayList<Element>();

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
     * Entity of the action.
     * 
     */
    @JsonProperty("subject")
    public List<Contract_Subject> getSubject() {
        return subject;
    }

    /**
     * Entity of the action.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(List<Contract_Subject> subject) {
        this.subject = subject;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("intent")
    public CodeableConcept getIntent() {
        return intent;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("intent")
    public void setIntent(CodeableConcept intent) {
        this.intent = intent;
    }

    /**
     * Id [identifier??] of the clause or question text related to this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    public List<String> getLinkId() {
        return linkId;
    }

    /**
     * Id [identifier??] of the clause or question text related to this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    public void setLinkId(List<String> linkId) {
        this.linkId = linkId;
    }

    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    public List<Element> get_linkId() {
        return _linkId;
    }

    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    public void set_linkId(List<Element> _linkId) {
        this._linkId = _linkId;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public CodeableConcept getStatus() {
        return status;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(CodeableConcept status) {
        this.status = status;
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
     * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("contextLinkId")
    public List<String> getContextLinkId() {
        return contextLinkId;
    }

    /**
     * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("contextLinkId")
    public void setContextLinkId(List<String> contextLinkId) {
        this.contextLinkId = contextLinkId;
    }

    /**
     * Extensions for contextLinkId
     * 
     */
    @JsonProperty("_contextLinkId")
    public List<Element> get_contextLinkId() {
        return _contextLinkId;
    }

    /**
     * Extensions for contextLinkId
     * 
     */
    @JsonProperty("_contextLinkId")
    public void set_contextLinkId(List<Element> _contextLinkId) {
        this._contextLinkId = _contextLinkId;
    }

    /**
     * When action happens.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * When action happens.
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
     * Who or what initiated the action and has responsibility for its activation.
     * 
     */
    @JsonProperty("requester")
    public List<Reference> getRequester() {
        return requester;
    }

    /**
     * Who or what initiated the action and has responsibility for its activation.
     * 
     */
    @JsonProperty("requester")
    public void setRequester(List<Reference> requester) {
        this.requester = requester;
    }

    /**
     * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("requesterLinkId")
    public List<String> getRequesterLinkId() {
        return requesterLinkId;
    }

    /**
     * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("requesterLinkId")
    public void setRequesterLinkId(List<String> requesterLinkId) {
        this.requesterLinkId = requesterLinkId;
    }

    /**
     * Extensions for requesterLinkId
     * 
     */
    @JsonProperty("_requesterLinkId")
    public List<Element> get_requesterLinkId() {
        return _requesterLinkId;
    }

    /**
     * Extensions for requesterLinkId
     * 
     */
    @JsonProperty("_requesterLinkId")
    public void set_requesterLinkId(List<Element> _requesterLinkId) {
        this._requesterLinkId = _requesterLinkId;
    }

    /**
     * The type of individual that is desired or required to perform or not perform the action.
     * 
     */
    @JsonProperty("performerType")
    public List<CodeableConcept> getPerformerType() {
        return performerType;
    }

    /**
     * The type of individual that is desired or required to perform or not perform the action.
     * 
     */
    @JsonProperty("performerType")
    public void setPerformerType(List<CodeableConcept> performerType) {
        this.performerType = performerType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerRole")
    public CodeableConcept getPerformerRole() {
        return performerRole;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("performerRole")
    public void setPerformerRole(CodeableConcept performerRole) {
        this.performerRole = performerRole;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public Reference getPerformer() {
        return performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(Reference performer) {
        this.performer = performer;
    }

    /**
     * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("performerLinkId")
    public List<String> getPerformerLinkId() {
        return performerLinkId;
    }

    /**
     * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("performerLinkId")
    public void setPerformerLinkId(List<String> performerLinkId) {
        this.performerLinkId = performerLinkId;
    }

    /**
     * Extensions for performerLinkId
     * 
     */
    @JsonProperty("_performerLinkId")
    public List<Element> get_performerLinkId() {
        return _performerLinkId;
    }

    /**
     * Extensions for performerLinkId
     * 
     */
    @JsonProperty("_performerLinkId")
    public void set_performerLinkId(List<Element> _performerLinkId) {
        this._performerLinkId = _performerLinkId;
    }

    /**
     * Rationale for the action to be performed or not performed. Describes why the action is permitted or prohibited.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Rationale for the action to be performed or not performed. Describes why the action is permitted or prohibited.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource whose existence justifies permitting or not permitting this action.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource whose existence justifies permitting or not permitting this action.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Describes why the action is to be performed or not performed in textual form.
     * 
     */
    @JsonProperty("reason")
    public List<String> getReason() {
        return reason;
    }

    /**
     * Describes why the action is to be performed or not performed in textual form.
     * 
     */
    @JsonProperty("reason")
    public void setReason(List<String> reason) {
        this.reason = reason;
    }

    /**
     * Extensions for reason
     * 
     */
    @JsonProperty("_reason")
    public List<Element> get_reason() {
        return _reason;
    }

    /**
     * Extensions for reason
     * 
     */
    @JsonProperty("_reason")
    public void set_reason(List<Element> _reason) {
        this._reason = _reason;
    }

    /**
     * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("reasonLinkId")
    public List<String> getReasonLinkId() {
        return reasonLinkId;
    }

    /**
     * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("reasonLinkId")
    public void setReasonLinkId(List<String> reasonLinkId) {
        this.reasonLinkId = reasonLinkId;
    }

    /**
     * Extensions for reasonLinkId
     * 
     */
    @JsonProperty("_reasonLinkId")
    public List<Element> get_reasonLinkId() {
        return _reasonLinkId;
    }

    /**
     * Extensions for reasonLinkId
     * 
     */
    @JsonProperty("_reasonLinkId")
    public void set_reasonLinkId(List<Element> _reasonLinkId) {
        this._reasonLinkId = _reasonLinkId;
    }

    /**
     * Comments made about the term action made by the requester, performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the term action made by the requester, performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Security labels that protects the action.
     * 
     */
    @JsonProperty("securityLabelNumber")
    public List<Double> getSecurityLabelNumber() {
        return securityLabelNumber;
    }

    /**
     * Security labels that protects the action.
     * 
     */
    @JsonProperty("securityLabelNumber")
    public void setSecurityLabelNumber(List<Double> securityLabelNumber) {
        this.securityLabelNumber = securityLabelNumber;
    }

    /**
     * Extensions for securityLabelNumber
     * 
     */
    @JsonProperty("_securityLabelNumber")
    public List<Element> get_securityLabelNumber() {
        return _securityLabelNumber;
    }

    /**
     * Extensions for securityLabelNumber
     * 
     */
    @JsonProperty("_securityLabelNumber")
    public void set_securityLabelNumber(List<Element> _securityLabelNumber) {
        this._securityLabelNumber = _securityLabelNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contract_Action.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("doNotPerform");
        sb.append('=');
        sb.append(((this.doNotPerform == null)?"<null>":this.doNotPerform));
        sb.append(',');
        sb.append("_doNotPerform");
        sb.append('=');
        sb.append(((this._doNotPerform == null)?"<null>":this._doNotPerform));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("intent");
        sb.append('=');
        sb.append(((this.intent == null)?"<null>":this.intent));
        sb.append(',');
        sb.append("linkId");
        sb.append('=');
        sb.append(((this.linkId == null)?"<null>":this.linkId));
        sb.append(',');
        sb.append("_linkId");
        sb.append('=');
        sb.append(((this._linkId == null)?"<null>":this._linkId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("contextLinkId");
        sb.append('=');
        sb.append(((this.contextLinkId == null)?"<null>":this.contextLinkId));
        sb.append(',');
        sb.append("_contextLinkId");
        sb.append('=');
        sb.append(((this._contextLinkId == null)?"<null>":this._contextLinkId));
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
        sb.append("requester");
        sb.append('=');
        sb.append(((this.requester == null)?"<null>":this.requester));
        sb.append(',');
        sb.append("requesterLinkId");
        sb.append('=');
        sb.append(((this.requesterLinkId == null)?"<null>":this.requesterLinkId));
        sb.append(',');
        sb.append("_requesterLinkId");
        sb.append('=');
        sb.append(((this._requesterLinkId == null)?"<null>":this._requesterLinkId));
        sb.append(',');
        sb.append("performerType");
        sb.append('=');
        sb.append(((this.performerType == null)?"<null>":this.performerType));
        sb.append(',');
        sb.append("performerRole");
        sb.append('=');
        sb.append(((this.performerRole == null)?"<null>":this.performerRole));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("performerLinkId");
        sb.append('=');
        sb.append(((this.performerLinkId == null)?"<null>":this.performerLinkId));
        sb.append(',');
        sb.append("_performerLinkId");
        sb.append('=');
        sb.append(((this._performerLinkId == null)?"<null>":this._performerLinkId));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("_reason");
        sb.append('=');
        sb.append(((this._reason == null)?"<null>":this._reason));
        sb.append(',');
        sb.append("reasonLinkId");
        sb.append('=');
        sb.append(((this.reasonLinkId == null)?"<null>":this.reasonLinkId));
        sb.append(',');
        sb.append("_reasonLinkId");
        sb.append('=');
        sb.append(((this._reasonLinkId == null)?"<null>":this._reasonLinkId));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("securityLabelNumber");
        sb.append('=');
        sb.append(((this.securityLabelNumber == null)?"<null>":this.securityLabelNumber));
        sb.append(',');
        sb.append("_securityLabelNumber");
        sb.append('=');
        sb.append(((this._securityLabelNumber == null)?"<null>":this._securityLabelNumber));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.performerLinkId == null)? 0 :this.performerLinkId.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.contextLinkId == null)? 0 :this.contextLinkId.hashCode()));
        result = ((result* 31)+((this._contextLinkId == null)? 0 :this._contextLinkId.hashCode()));
        result = ((result* 31)+((this._reason == null)? 0 :this._reason.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this._securityLabelNumber == null)? 0 :this._securityLabelNumber.hashCode()));
        result = ((result* 31)+((this.doNotPerform == null)? 0 :this.doNotPerform.hashCode()));
        result = ((result* 31)+((this._doNotPerform == null)? 0 :this._doNotPerform.hashCode()));
        result = ((result* 31)+((this.requester == null)? 0 :this.requester.hashCode()));
        result = ((result* 31)+((this._linkId == null)? 0 :this._linkId.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.performerRole == null)? 0 :this.performerRole.hashCode()));
        result = ((result* 31)+((this.securityLabelNumber == null)? 0 :this.securityLabelNumber.hashCode()));
        result = ((result* 31)+((this.occurrenceTiming == null)? 0 :this.occurrenceTiming.hashCode()));
        result = ((result* 31)+((this.intent == null)? 0 :this.intent.hashCode()));
        result = ((result* 31)+((this.performerType == null)? 0 :this.performerType.hashCode()));
        result = ((result* 31)+((this.requesterLinkId == null)? 0 :this.requesterLinkId.hashCode()));
        result = ((result* 31)+((this._performerLinkId == null)? 0 :this._performerLinkId.hashCode()));
        result = ((result* 31)+((this._requesterLinkId == null)? 0 :this._requesterLinkId.hashCode()));
        result = ((result* 31)+((this.linkId == null)? 0 :this.linkId.hashCode()));
        result = ((result* 31)+((this.occurrencePeriod == null)? 0 :this.occurrencePeriod.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonLinkId == null)? 0 :this.reasonLinkId.hashCode()));
        result = ((result* 31)+((this._reasonLinkId == null)? 0 :this._reasonLinkId.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract_Action) == false) {
            return false;
        }
        Contract_Action rhs = ((Contract_Action) other);
        return ((((((((((((((((((((((((((((((((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.performerLinkId == rhs.performerLinkId)||((this.performerLinkId!= null)&&this.performerLinkId.equals(rhs.performerLinkId))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.contextLinkId == rhs.contextLinkId)||((this.contextLinkId!= null)&&this.contextLinkId.equals(rhs.contextLinkId))))&&((this._contextLinkId == rhs._contextLinkId)||((this._contextLinkId!= null)&&this._contextLinkId.equals(rhs._contextLinkId))))&&((this._reason == rhs._reason)||((this._reason!= null)&&this._reason.equals(rhs._reason))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this._securityLabelNumber == rhs._securityLabelNumber)||((this._securityLabelNumber!= null)&&this._securityLabelNumber.equals(rhs._securityLabelNumber))))&&((this.doNotPerform == rhs.doNotPerform)||((this.doNotPerform!= null)&&this.doNotPerform.equals(rhs.doNotPerform))))&&((this._doNotPerform == rhs._doNotPerform)||((this._doNotPerform!= null)&&this._doNotPerform.equals(rhs._doNotPerform))))&&((this.requester == rhs.requester)||((this.requester!= null)&&this.requester.equals(rhs.requester))))&&((this._linkId == rhs._linkId)||((this._linkId!= null)&&this._linkId.equals(rhs._linkId))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.performerRole == rhs.performerRole)||((this.performerRole!= null)&&this.performerRole.equals(rhs.performerRole))))&&((this.securityLabelNumber == rhs.securityLabelNumber)||((this.securityLabelNumber!= null)&&this.securityLabelNumber.equals(rhs.securityLabelNumber))))&&((this.occurrenceTiming == rhs.occurrenceTiming)||((this.occurrenceTiming!= null)&&this.occurrenceTiming.equals(rhs.occurrenceTiming))))&&((this.intent == rhs.intent)||((this.intent!= null)&&this.intent.equals(rhs.intent))))&&((this.performerType == rhs.performerType)||((this.performerType!= null)&&this.performerType.equals(rhs.performerType))))&&((this.requesterLinkId == rhs.requesterLinkId)||((this.requesterLinkId!= null)&&this.requesterLinkId.equals(rhs.requesterLinkId))))&&((this._performerLinkId == rhs._performerLinkId)||((this._performerLinkId!= null)&&this._performerLinkId.equals(rhs._performerLinkId))))&&((this._requesterLinkId == rhs._requesterLinkId)||((this._requesterLinkId!= null)&&this._requesterLinkId.equals(rhs._requesterLinkId))))&&((this.linkId == rhs.linkId)||((this.linkId!= null)&&this.linkId.equals(rhs.linkId))))&&((this.occurrencePeriod == rhs.occurrencePeriod)||((this.occurrencePeriod!= null)&&this.occurrencePeriod.equals(rhs.occurrencePeriod))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this.reasonLinkId == rhs.reasonLinkId)||((this.reasonLinkId!= null)&&this.reasonLinkId.equals(rhs.reasonLinkId))))&&((this._reasonLinkId == rhs._reasonLinkId)||((this._reasonLinkId!= null)&&this._reasonLinkId.equals(rhs._reasonLinkId))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
