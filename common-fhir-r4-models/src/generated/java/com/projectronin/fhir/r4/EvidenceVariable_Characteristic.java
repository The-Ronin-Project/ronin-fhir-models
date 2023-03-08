
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
 * The EvidenceVariable resource describes a &quot;PICO&quot; element that knowledge (evidence, assertion, recommendation) is about.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "description",
    "_description",
    "definitionReference",
    "definitionCanonical",
    "_definitionCanonical",
    "definitionCodeableConcept",
    "definitionExpression",
    "definitionDataRequirement",
    "definitionTriggerDefinition",
    "usageContext",
    "exclude",
    "_exclude",
    "participantEffectiveDateTime",
    "_participantEffectiveDateTime",
    "participantEffectivePeriod",
    "participantEffectiveDuration",
    "participantEffectiveTiming",
    "timeFromStart",
    "groupMeasure",
    "_groupMeasure"
})
@Generated("jsonschema2pojo")
public class EvidenceVariable_Characteristic {

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definitionReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference definitionReference;
    /**
     * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
     * 
     */
    @JsonProperty("definitionCanonical")
    @JsonPropertyDescription("Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).")
    private String definitionCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _definitionCanonical;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("definitionCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept definitionCodeableConcept;
    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("definitionExpression")
    @JsonPropertyDescription("A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.")
    private Expression definitionExpression;
    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("definitionDataRequirement")
    @JsonPropertyDescription("Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.")
    private DataRequirement definitionDataRequirement;
    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("definitionTriggerDefinition")
    @JsonPropertyDescription("A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.")
    private TriggerDefinition definitionTriggerDefinition;
    /**
     * Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.
     * 
     */
    @JsonProperty("usageContext")
    @JsonPropertyDescription("Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.")
    private List<UsageContext> usageContext = new ArrayList<UsageContext>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("exclude")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean exclude;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exclude")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _exclude;
    /**
     * Indicates what effective period the study covers.
     * 
     */
    @JsonProperty("participantEffectiveDateTime")
    @JsonPropertyDescription("Indicates what effective period the study covers.")
    private String participantEffectiveDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _participantEffectiveDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("participantEffectivePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period participantEffectivePeriod;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("participantEffectiveDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration participantEffectiveDuration;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("participantEffectiveTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing participantEffectiveTiming;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("timeFromStart")
    @JsonPropertyDescription("A length of time.")
    private Duration timeFromStart;
    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("groupMeasure")
    @JsonPropertyDescription("Indicates how elements are aggregated within the study effective period.")
    private EvidenceVariable_Characteristic.GroupMeasure groupMeasure;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupMeasure")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _groupMeasure;

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

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definitionReference")
    public Reference getDefinitionReference() {
        return definitionReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("definitionReference")
    public void setDefinitionReference(Reference definitionReference) {
        this.definitionReference = definitionReference;
    }

    /**
     * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
     * 
     */
    @JsonProperty("definitionCanonical")
    public String getDefinitionCanonical() {
        return definitionCanonical;
    }

    /**
     * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
     * 
     */
    @JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(String definitionCanonical) {
        this.definitionCanonical = definitionCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionCanonical")
    public Element get_definitionCanonical() {
        return _definitionCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionCanonical")
    public void set_definitionCanonical(Element _definitionCanonical) {
        this._definitionCanonical = _definitionCanonical;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("definitionCodeableConcept")
    public CodeableConcept getDefinitionCodeableConcept() {
        return definitionCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("definitionCodeableConcept")
    public void setDefinitionCodeableConcept(CodeableConcept definitionCodeableConcept) {
        this.definitionCodeableConcept = definitionCodeableConcept;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("definitionExpression")
    public Expression getDefinitionExpression() {
        return definitionExpression;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("definitionExpression")
    public void setDefinitionExpression(Expression definitionExpression) {
        this.definitionExpression = definitionExpression;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("definitionDataRequirement")
    public DataRequirement getDefinitionDataRequirement() {
        return definitionDataRequirement;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("definitionDataRequirement")
    public void setDefinitionDataRequirement(DataRequirement definitionDataRequirement) {
        this.definitionDataRequirement = definitionDataRequirement;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("definitionTriggerDefinition")
    public TriggerDefinition getDefinitionTriggerDefinition() {
        return definitionTriggerDefinition;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("definitionTriggerDefinition")
    public void setDefinitionTriggerDefinition(TriggerDefinition definitionTriggerDefinition) {
        this.definitionTriggerDefinition = definitionTriggerDefinition;
    }

    /**
     * Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.
     * 
     */
    @JsonProperty("usageContext")
    public List<UsageContext> getUsageContext() {
        return usageContext;
    }

    /**
     * Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.
     * 
     */
    @JsonProperty("usageContext")
    public void setUsageContext(List<UsageContext> usageContext) {
        this.usageContext = usageContext;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("exclude")
    public Boolean getExclude() {
        return exclude;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("exclude")
    public void setExclude(Boolean exclude) {
        this.exclude = exclude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exclude")
    public Element get_exclude() {
        return _exclude;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exclude")
    public void set_exclude(Element _exclude) {
        this._exclude = _exclude;
    }

    /**
     * Indicates what effective period the study covers.
     * 
     */
    @JsonProperty("participantEffectiveDateTime")
    public String getParticipantEffectiveDateTime() {
        return participantEffectiveDateTime;
    }

    /**
     * Indicates what effective period the study covers.
     * 
     */
    @JsonProperty("participantEffectiveDateTime")
    public void setParticipantEffectiveDateTime(String participantEffectiveDateTime) {
        this.participantEffectiveDateTime = participantEffectiveDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveDateTime")
    public Element get_participantEffectiveDateTime() {
        return _participantEffectiveDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveDateTime")
    public void set_participantEffectiveDateTime(Element _participantEffectiveDateTime) {
        this._participantEffectiveDateTime = _participantEffectiveDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("participantEffectivePeriod")
    public Period getParticipantEffectivePeriod() {
        return participantEffectivePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("participantEffectivePeriod")
    public void setParticipantEffectivePeriod(Period participantEffectivePeriod) {
        this.participantEffectivePeriod = participantEffectivePeriod;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("participantEffectiveDuration")
    public Duration getParticipantEffectiveDuration() {
        return participantEffectiveDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("participantEffectiveDuration")
    public void setParticipantEffectiveDuration(Duration participantEffectiveDuration) {
        this.participantEffectiveDuration = participantEffectiveDuration;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("participantEffectiveTiming")
    public Timing getParticipantEffectiveTiming() {
        return participantEffectiveTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("participantEffectiveTiming")
    public void setParticipantEffectiveTiming(Timing participantEffectiveTiming) {
        this.participantEffectiveTiming = participantEffectiveTiming;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("timeFromStart")
    public Duration getTimeFromStart() {
        return timeFromStart;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("timeFromStart")
    public void setTimeFromStart(Duration timeFromStart) {
        this.timeFromStart = timeFromStart;
    }

    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("groupMeasure")
    public EvidenceVariable_Characteristic.GroupMeasure getGroupMeasure() {
        return groupMeasure;
    }

    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("groupMeasure")
    public void setGroupMeasure(EvidenceVariable_Characteristic.GroupMeasure groupMeasure) {
        this.groupMeasure = groupMeasure;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupMeasure")
    public Element get_groupMeasure() {
        return _groupMeasure;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupMeasure")
    public void set_groupMeasure(Element _groupMeasure) {
        this._groupMeasure = _groupMeasure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EvidenceVariable_Characteristic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("definitionReference");
        sb.append('=');
        sb.append(((this.definitionReference == null)?"<null>":this.definitionReference));
        sb.append(',');
        sb.append("definitionCanonical");
        sb.append('=');
        sb.append(((this.definitionCanonical == null)?"<null>":this.definitionCanonical));
        sb.append(',');
        sb.append("_definitionCanonical");
        sb.append('=');
        sb.append(((this._definitionCanonical == null)?"<null>":this._definitionCanonical));
        sb.append(',');
        sb.append("definitionCodeableConcept");
        sb.append('=');
        sb.append(((this.definitionCodeableConcept == null)?"<null>":this.definitionCodeableConcept));
        sb.append(',');
        sb.append("definitionExpression");
        sb.append('=');
        sb.append(((this.definitionExpression == null)?"<null>":this.definitionExpression));
        sb.append(',');
        sb.append("definitionDataRequirement");
        sb.append('=');
        sb.append(((this.definitionDataRequirement == null)?"<null>":this.definitionDataRequirement));
        sb.append(',');
        sb.append("definitionTriggerDefinition");
        sb.append('=');
        sb.append(((this.definitionTriggerDefinition == null)?"<null>":this.definitionTriggerDefinition));
        sb.append(',');
        sb.append("usageContext");
        sb.append('=');
        sb.append(((this.usageContext == null)?"<null>":this.usageContext));
        sb.append(',');
        sb.append("exclude");
        sb.append('=');
        sb.append(((this.exclude == null)?"<null>":this.exclude));
        sb.append(',');
        sb.append("_exclude");
        sb.append('=');
        sb.append(((this._exclude == null)?"<null>":this._exclude));
        sb.append(',');
        sb.append("participantEffectiveDateTime");
        sb.append('=');
        sb.append(((this.participantEffectiveDateTime == null)?"<null>":this.participantEffectiveDateTime));
        sb.append(',');
        sb.append("_participantEffectiveDateTime");
        sb.append('=');
        sb.append(((this._participantEffectiveDateTime == null)?"<null>":this._participantEffectiveDateTime));
        sb.append(',');
        sb.append("participantEffectivePeriod");
        sb.append('=');
        sb.append(((this.participantEffectivePeriod == null)?"<null>":this.participantEffectivePeriod));
        sb.append(',');
        sb.append("participantEffectiveDuration");
        sb.append('=');
        sb.append(((this.participantEffectiveDuration == null)?"<null>":this.participantEffectiveDuration));
        sb.append(',');
        sb.append("participantEffectiveTiming");
        sb.append('=');
        sb.append(((this.participantEffectiveTiming == null)?"<null>":this.participantEffectiveTiming));
        sb.append(',');
        sb.append("timeFromStart");
        sb.append('=');
        sb.append(((this.timeFromStart == null)?"<null>":this.timeFromStart));
        sb.append(',');
        sb.append("groupMeasure");
        sb.append('=');
        sb.append(((this.groupMeasure == null)?"<null>":this.groupMeasure));
        sb.append(',');
        sb.append("_groupMeasure");
        sb.append('=');
        sb.append(((this._groupMeasure == null)?"<null>":this._groupMeasure));
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
        result = ((result* 31)+((this.participantEffectiveTiming == null)? 0 :this.participantEffectiveTiming.hashCode()));
        result = ((result* 31)+((this.definitionCodeableConcept == null)? 0 :this.definitionCodeableConcept.hashCode()));
        result = ((result* 31)+((this.usageContext == null)? 0 :this.usageContext.hashCode()));
        result = ((result* 31)+((this._participantEffectiveDateTime == null)? 0 :this._participantEffectiveDateTime.hashCode()));
        result = ((result* 31)+((this.participantEffectivePeriod == null)? 0 :this.participantEffectivePeriod.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.definitionCanonical == null)? 0 :this.definitionCanonical.hashCode()));
        result = ((result* 31)+((this.definitionDataRequirement == null)? 0 :this.definitionDataRequirement.hashCode()));
        result = ((result* 31)+((this.participantEffectiveDateTime == null)? 0 :this.participantEffectiveDateTime.hashCode()));
        result = ((result* 31)+((this.timeFromStart == null)? 0 :this.timeFromStart.hashCode()));
        result = ((result* 31)+((this.groupMeasure == null)? 0 :this.groupMeasure.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.definitionReference == null)? 0 :this.definitionReference.hashCode()));
        result = ((result* 31)+((this._groupMeasure == null)? 0 :this._groupMeasure.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._exclude == null)? 0 :this._exclude.hashCode()));
        result = ((result* 31)+((this._definitionCanonical == null)? 0 :this._definitionCanonical.hashCode()));
        result = ((result* 31)+((this.definitionExpression == null)? 0 :this.definitionExpression.hashCode()));
        result = ((result* 31)+((this.definitionTriggerDefinition == null)? 0 :this.definitionTriggerDefinition.hashCode()));
        result = ((result* 31)+((this.exclude == null)? 0 :this.exclude.hashCode()));
        result = ((result* 31)+((this.participantEffectiveDuration == null)? 0 :this.participantEffectiveDuration.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EvidenceVariable_Characteristic) == false) {
            return false;
        }
        EvidenceVariable_Characteristic rhs = ((EvidenceVariable_Characteristic) other);
        return ((((((((((((((((((((((((this.participantEffectiveTiming == rhs.participantEffectiveTiming)||((this.participantEffectiveTiming!= null)&&this.participantEffectiveTiming.equals(rhs.participantEffectiveTiming)))&&((this.definitionCodeableConcept == rhs.definitionCodeableConcept)||((this.definitionCodeableConcept!= null)&&this.definitionCodeableConcept.equals(rhs.definitionCodeableConcept))))&&((this.usageContext == rhs.usageContext)||((this.usageContext!= null)&&this.usageContext.equals(rhs.usageContext))))&&((this._participantEffectiveDateTime == rhs._participantEffectiveDateTime)||((this._participantEffectiveDateTime!= null)&&this._participantEffectiveDateTime.equals(rhs._participantEffectiveDateTime))))&&((this.participantEffectivePeriod == rhs.participantEffectivePeriod)||((this.participantEffectivePeriod!= null)&&this.participantEffectivePeriod.equals(rhs.participantEffectivePeriod))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.definitionCanonical == rhs.definitionCanonical)||((this.definitionCanonical!= null)&&this.definitionCanonical.equals(rhs.definitionCanonical))))&&((this.definitionDataRequirement == rhs.definitionDataRequirement)||((this.definitionDataRequirement!= null)&&this.definitionDataRequirement.equals(rhs.definitionDataRequirement))))&&((this.participantEffectiveDateTime == rhs.participantEffectiveDateTime)||((this.participantEffectiveDateTime!= null)&&this.participantEffectiveDateTime.equals(rhs.participantEffectiveDateTime))))&&((this.timeFromStart == rhs.timeFromStart)||((this.timeFromStart!= null)&&this.timeFromStart.equals(rhs.timeFromStart))))&&((this.groupMeasure == rhs.groupMeasure)||((this.groupMeasure!= null)&&this.groupMeasure.equals(rhs.groupMeasure))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.definitionReference == rhs.definitionReference)||((this.definitionReference!= null)&&this.definitionReference.equals(rhs.definitionReference))))&&((this._groupMeasure == rhs._groupMeasure)||((this._groupMeasure!= null)&&this._groupMeasure.equals(rhs._groupMeasure))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._exclude == rhs._exclude)||((this._exclude!= null)&&this._exclude.equals(rhs._exclude))))&&((this._definitionCanonical == rhs._definitionCanonical)||((this._definitionCanonical!= null)&&this._definitionCanonical.equals(rhs._definitionCanonical))))&&((this.definitionExpression == rhs.definitionExpression)||((this.definitionExpression!= null)&&this.definitionExpression.equals(rhs.definitionExpression))))&&((this.definitionTriggerDefinition == rhs.definitionTriggerDefinition)||((this.definitionTriggerDefinition!= null)&&this.definitionTriggerDefinition.equals(rhs.definitionTriggerDefinition))))&&((this.exclude == rhs.exclude)||((this.exclude!= null)&&this.exclude.equals(rhs.exclude))))&&((this.participantEffectiveDuration == rhs.participantEffectiveDuration)||((this.participantEffectiveDuration!= null)&&this.participantEffectiveDuration.equals(rhs.participantEffectiveDuration))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))));
    }


    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum GroupMeasure {

        MEAN("mean"),
        MEDIAN("median"),
        MEAN_OF_MEAN("mean-of-mean"),
        MEAN_OF_MEDIAN("mean-of-median"),
        MEDIAN_OF_MEAN("median-of-mean"),
        MEDIAN_OF_MEDIAN("median-of-median");
        private final String value;
        private final static Map<String, EvidenceVariable_Characteristic.GroupMeasure> CONSTANTS = new HashMap<String, EvidenceVariable_Characteristic.GroupMeasure>();

        static {
            for (EvidenceVariable_Characteristic.GroupMeasure c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        GroupMeasure(String value) {
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
        public static EvidenceVariable_Characteristic.GroupMeasure fromValue(String value) {
            EvidenceVariable_Characteristic.GroupMeasure constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
