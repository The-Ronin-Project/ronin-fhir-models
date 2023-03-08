
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "kind",
    "_kind",
    "instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "code",
    "reasonCode",
    "reasonReference",
    "goal",
    "status",
    "_status",
    "statusReason",
    "doNotPerform",
    "_doNotPerform",
    "scheduledTiming",
    "scheduledPeriod",
    "scheduledString",
    "_scheduledString",
    "location",
    "performer",
    "productCodeableConcept",
    "productReference",
    "dailyAmount",
    "quantity",
    "description",
    "_description"
})
@Generated("jsonschema2pojo")
public class CarePlan_Detail {

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String kind;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _kind;
    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates another resource, such as the health condition(s), whose existence justifies this request and drove the inclusion of this particular activity as part of the plan.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates another resource, such as the health condition(s), whose existence justifies this request and drove the inclusion of this particular activity as part of the plan.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
     * 
     */
    @JsonProperty("goal")
    @JsonPropertyDescription("Internal reference that identifies the goals that this activity is intended to contribute towards meeting.")
    private List<Reference> goal = new ArrayList<Reference>();
    /**
     * Identifies what progress is being made for the specific activity.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Identifies what progress is being made for the specific activity.")
    private CarePlan_Detail.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("statusReason")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept statusReason;
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
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("scheduledTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing scheduledTiming;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("scheduledPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period scheduledPeriod;
    /**
     * The period, timing or frequency upon which the described activity is to occur.
     * 
     */
    @JsonProperty("scheduledString")
    @JsonPropertyDescription("The period, timing or frequency upon which the described activity is to occur.")
    private String scheduledString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_scheduledString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _scheduledString;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference location;
    /**
     * Identifies who's expected to be involved in the activity.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Identifies who's expected to be involved in the activity.")
    private List<Reference> performer = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept productCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("productReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference productReference;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("dailyAmount")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity dailyAmount;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    public Element get_kind() {
        return _kind;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_kind")
    public void set_kind(Element _kind) {
        this._kind = _kind;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
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
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates another resource, such as the health condition(s), whose existence justifies this request and drove the inclusion of this particular activity as part of the plan.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates another resource, such as the health condition(s), whose existence justifies this request and drove the inclusion of this particular activity as part of the plan.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
     * 
     */
    @JsonProperty("goal")
    public List<Reference> getGoal() {
        return goal;
    }

    /**
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
     * 
     */
    @JsonProperty("goal")
    public void setGoal(List<Reference> goal) {
        this.goal = goal;
    }

    /**
     * Identifies what progress is being made for the specific activity.
     * 
     */
    @JsonProperty("status")
    public CarePlan_Detail.Status getStatus() {
        return status;
    }

    /**
     * Identifies what progress is being made for the specific activity.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CarePlan_Detail.Status status) {
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
     * 
     */
    @JsonProperty("statusReason")
    public CodeableConcept getStatusReason() {
        return statusReason;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(CodeableConcept statusReason) {
        this.statusReason = statusReason;
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
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("scheduledTiming")
    public Timing getScheduledTiming() {
        return scheduledTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("scheduledTiming")
    public void setScheduledTiming(Timing scheduledTiming) {
        this.scheduledTiming = scheduledTiming;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("scheduledPeriod")
    public Period getScheduledPeriod() {
        return scheduledPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("scheduledPeriod")
    public void setScheduledPeriod(Period scheduledPeriod) {
        this.scheduledPeriod = scheduledPeriod;
    }

    /**
     * The period, timing or frequency upon which the described activity is to occur.
     * 
     */
    @JsonProperty("scheduledString")
    public String getScheduledString() {
        return scheduledString;
    }

    /**
     * The period, timing or frequency upon which the described activity is to occur.
     * 
     */
    @JsonProperty("scheduledString")
    public void setScheduledString(String scheduledString) {
        this.scheduledString = scheduledString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_scheduledString")
    public Element get_scheduledString() {
        return _scheduledString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_scheduledString")
    public void set_scheduledString(Element _scheduledString) {
        this._scheduledString = _scheduledString;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public Reference getLocation() {
        return location;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("location")
    public void setLocation(Reference location) {
        this.location = location;
    }

    /**
     * Identifies who's expected to be involved in the activity.
     * 
     */
    @JsonProperty("performer")
    public List<Reference> getPerformer() {
        return performer;
    }

    /**
     * Identifies who's expected to be involved in the activity.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<Reference> performer) {
        this.performer = performer;
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("dailyAmount")
    public Quantity getDailyAmount() {
        return dailyAmount;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("dailyAmount")
    public void setDailyAmount(Quantity dailyAmount) {
        this.dailyAmount = dailyAmount;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CarePlan_Detail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("_kind");
        sb.append('=');
        sb.append(((this._kind == null)?"<null>":this._kind));
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("goal");
        sb.append('=');
        sb.append(((this.goal == null)?"<null>":this.goal));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("doNotPerform");
        sb.append('=');
        sb.append(((this.doNotPerform == null)?"<null>":this.doNotPerform));
        sb.append(',');
        sb.append("_doNotPerform");
        sb.append('=');
        sb.append(((this._doNotPerform == null)?"<null>":this._doNotPerform));
        sb.append(',');
        sb.append("scheduledTiming");
        sb.append('=');
        sb.append(((this.scheduledTiming == null)?"<null>":this.scheduledTiming));
        sb.append(',');
        sb.append("scheduledPeriod");
        sb.append('=');
        sb.append(((this.scheduledPeriod == null)?"<null>":this.scheduledPeriod));
        sb.append(',');
        sb.append("scheduledString");
        sb.append('=');
        sb.append(((this.scheduledString == null)?"<null>":this.scheduledString));
        sb.append(',');
        sb.append("_scheduledString");
        sb.append('=');
        sb.append(((this._scheduledString == null)?"<null>":this._scheduledString));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("productCodeableConcept");
        sb.append('=');
        sb.append(((this.productCodeableConcept == null)?"<null>":this.productCodeableConcept));
        sb.append(',');
        sb.append("productReference");
        sb.append('=');
        sb.append(((this.productReference == null)?"<null>":this.productReference));
        sb.append(',');
        sb.append("dailyAmount");
        sb.append('=');
        sb.append(((this.dailyAmount == null)?"<null>":this.dailyAmount));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.productReference == null)? 0 :this.productReference.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this._scheduledString == null)? 0 :this._scheduledString.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.scheduledTiming == null)? 0 :this.scheduledTiming.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.doNotPerform == null)? 0 :this.doNotPerform.hashCode()));
        result = ((result* 31)+((this._doNotPerform == null)? 0 :this._doNotPerform.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._kind == null)? 0 :this._kind.hashCode()));
        result = ((result* 31)+((this.goal == null)? 0 :this.goal.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.scheduledString == null)? 0 :this.scheduledString.hashCode()));
        result = ((result* 31)+((this.scheduledPeriod == null)? 0 :this.scheduledPeriod.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.dailyAmount == null)? 0 :this.dailyAmount.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.productCodeableConcept == null)? 0 :this.productCodeableConcept.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarePlan_Detail) == false) {
            return false;
        }
        CarePlan_Detail rhs = ((CarePlan_Detail) other);
        return ((((((((((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.productReference == rhs.productReference)||((this.productReference!= null)&&this.productReference.equals(rhs.productReference))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this._scheduledString == rhs._scheduledString)||((this._scheduledString!= null)&&this._scheduledString.equals(rhs._scheduledString))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.scheduledTiming == rhs.scheduledTiming)||((this.scheduledTiming!= null)&&this.scheduledTiming.equals(rhs.scheduledTiming))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.doNotPerform == rhs.doNotPerform)||((this.doNotPerform!= null)&&this.doNotPerform.equals(rhs.doNotPerform))))&&((this._doNotPerform == rhs._doNotPerform)||((this._doNotPerform!= null)&&this._doNotPerform.equals(rhs._doNotPerform))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._kind == rhs._kind)||((this._kind!= null)&&this._kind.equals(rhs._kind))))&&((this.goal == rhs.goal)||((this.goal!= null)&&this.goal.equals(rhs.goal))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.scheduledString == rhs.scheduledString)||((this.scheduledString!= null)&&this.scheduledString.equals(rhs.scheduledString))))&&((this.scheduledPeriod == rhs.scheduledPeriod)||((this.scheduledPeriod!= null)&&this.scheduledPeriod.equals(rhs.scheduledPeriod))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.dailyAmount == rhs.dailyAmount)||((this.dailyAmount!= null)&&this.dailyAmount.equals(rhs.dailyAmount))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.productCodeableConcept == rhs.productCodeableConcept)||((this.productCodeableConcept!= null)&&this.productCodeableConcept.equals(rhs.productCodeableConcept))));
    }


    /**
     * Identifies what progress is being made for the specific activity.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        NOT_STARTED("not-started"),
        SCHEDULED("scheduled"),
        IN_PROGRESS("in-progress"),
        ON_HOLD("on-hold"),
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        STOPPED("stopped"),
        UNKNOWN("unknown"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, CarePlan_Detail.Status> CONSTANTS = new HashMap<String, CarePlan_Detail.Status>();

        static {
            for (CarePlan_Detail.Status c: values()) {
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
        public static CarePlan_Detail.Status fromValue(String value) {
            CarePlan_Detail.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
