
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
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "prefix",
    "_prefix",
    "title",
    "_title",
    "description",
    "_description",
    "textEquivalent",
    "_textEquivalent",
    "priority",
    "_priority",
    "code",
    "reason",
    "documentation",
    "goalId",
    "_goalId",
    "subjectCodeableConcept",
    "subjectReference",
    "trigger",
    "condition",
    "input",
    "output",
    "relatedAction",
    "timingDateTime",
    "_timingDateTime",
    "timingAge",
    "timingPeriod",
    "timingDuration",
    "timingRange",
    "timingTiming",
    "participant",
    "type",
    "groupingBehavior",
    "_groupingBehavior",
    "selectionBehavior",
    "_selectionBehavior",
    "requiredBehavior",
    "_requiredBehavior",
    "precheckBehavior",
    "_precheckBehavior",
    "cardinalityBehavior",
    "_cardinalityBehavior",
    "definitionCanonical",
    "_definitionCanonical",
    "definitionUri",
    "_definitionUri",
    "transform",
    "dynamicValue",
    "action"
})
@Generated("jsonschema2pojo")
public class PlanDefinition_Action {

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
    @JsonProperty("prefix")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String prefix;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_prefix")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _prefix;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String title;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _title;
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
    @JsonProperty("textEquivalent")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String textEquivalent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_textEquivalent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _textEquivalent;
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
     * A code that provides meaning for the action or action group. For example, a section may have a LOINC code for the section of a documentation template.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that provides meaning for the action or action group. For example, a section may have a LOINC code for the section of a documentation template.")
    private List<CodeableConcept> code = new ArrayList<CodeableConcept>();
    /**
     * A description of why this action is necessary or appropriate.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("A description of why this action is necessary or appropriate.")
    private List<CodeableConcept> reason = new ArrayList<CodeableConcept>();
    /**
     * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
     * 
     */
    @JsonProperty("documentation")
    @JsonPropertyDescription("Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.")
    private List<RelatedArtifact> documentation = new ArrayList<RelatedArtifact>();
    /**
     * Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.
     * 
     */
    @JsonProperty("goalId")
    @JsonPropertyDescription("Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.")
    private List<String> goalId = new ArrayList<String>();
    /**
     * Extensions for goalId
     * 
     */
    @JsonProperty("_goalId")
    @JsonPropertyDescription("Extensions for goalId")
    private List<Element> _goalId = new ArrayList<Element>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept subjectCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subjectReference;
    /**
     * A description of when the action should be triggered.
     * 
     */
    @JsonProperty("trigger")
    @JsonPropertyDescription("A description of when the action should be triggered.")
    private List<TriggerDefinition> trigger = new ArrayList<TriggerDefinition>();
    /**
     * An expression that describes applicability criteria or start/stop conditions for the action.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("An expression that describes applicability criteria or start/stop conditions for the action.")
    private List<PlanDefinition_Condition> condition = new ArrayList<PlanDefinition_Condition>();
    /**
     * Defines input data requirements for the action.
     * 
     */
    @JsonProperty("input")
    @JsonPropertyDescription("Defines input data requirements for the action.")
    private List<DataRequirement> input = new ArrayList<DataRequirement>();
    /**
     * Defines the outputs of the action, if any.
     * 
     */
    @JsonProperty("output")
    @JsonPropertyDescription("Defines the outputs of the action, if any.")
    private List<DataRequirement> output = new ArrayList<DataRequirement>();
    /**
     * A relationship to another action such as &quot;before&quot; or &quot;30-60 minutes after start of&quot;.
     * 
     */
    @JsonProperty("relatedAction")
    @JsonPropertyDescription("A relationship to another action such as \"before\" or \"30-60 minutes after start of\".")
    private List<PlanDefinition_RelatedAction> relatedAction = new ArrayList<PlanDefinition_RelatedAction>();
    /**
     * An optional value describing when the action should be performed.
     * 
     */
    @JsonProperty("timingDateTime")
    @JsonPropertyDescription("An optional value describing when the action should be performed.")
    private String timingDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timingDateTime;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("timingAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age timingAge;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period timingPeriod;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("timingDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration timingDuration;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("timingRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range timingRange;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing timingTiming;
    /**
     * Indicates who should participate in performing the action described.
     * 
     */
    @JsonProperty("participant")
    @JsonPropertyDescription("Indicates who should participate in performing the action described.")
    private List<PlanDefinition_Participant> participant = new ArrayList<PlanDefinition_Participant>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * Defines the grouping behavior for the action and its children.
     * 
     */
    @JsonProperty("groupingBehavior")
    @JsonPropertyDescription("Defines the grouping behavior for the action and its children.")
    private PlanDefinition_Action.GroupingBehavior groupingBehavior;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupingBehavior")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _groupingBehavior;
    /**
     * Defines the selection behavior for the action and its children.
     * 
     */
    @JsonProperty("selectionBehavior")
    @JsonPropertyDescription("Defines the selection behavior for the action and its children.")
    private PlanDefinition_Action.SelectionBehavior selectionBehavior;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_selectionBehavior")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _selectionBehavior;
    /**
     * Defines the required behavior for the action.
     * 
     */
    @JsonProperty("requiredBehavior")
    @JsonPropertyDescription("Defines the required behavior for the action.")
    private PlanDefinition_Action.RequiredBehavior requiredBehavior;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requiredBehavior")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requiredBehavior;
    /**
     * Defines whether the action should usually be preselected.
     * 
     */
    @JsonProperty("precheckBehavior")
    @JsonPropertyDescription("Defines whether the action should usually be preselected.")
    private PlanDefinition_Action.PrecheckBehavior precheckBehavior;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precheckBehavior")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _precheckBehavior;
    /**
     * Defines whether the action can be selected multiple times.
     * 
     */
    @JsonProperty("cardinalityBehavior")
    @JsonPropertyDescription("Defines whether the action can be selected multiple times.")
    private PlanDefinition_Action.CardinalityBehavior cardinalityBehavior;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cardinalityBehavior")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _cardinalityBehavior;
    /**
     * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
     * 
     */
    @JsonProperty("definitionCanonical")
    @JsonPropertyDescription("A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.")
    private String definitionCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _definitionCanonical;
    /**
     * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
     * 
     */
    @JsonProperty("definitionUri")
    @JsonPropertyDescription("A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.")
    private String definitionUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _definitionUri;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("transform")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String transform;
    /**
     * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
     * 
     */
    @JsonProperty("dynamicValue")
    @JsonPropertyDescription("Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.")
    private List<PlanDefinition_DynamicValue> dynamicValue = new ArrayList<PlanDefinition_DynamicValue>();
    /**
     * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.")
    private List<PlanDefinition_Action> action = new ArrayList<PlanDefinition_Action>();

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
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_prefix")
    public Element get_prefix() {
        return _prefix;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_prefix")
    public void set_prefix(Element _prefix) {
        this._prefix = _prefix;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public Element get_title() {
        return _title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public void set_title(Element _title) {
        this._title = _title;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("textEquivalent")
    public String getTextEquivalent() {
        return textEquivalent;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("textEquivalent")
    public void setTextEquivalent(String textEquivalent) {
        this.textEquivalent = textEquivalent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_textEquivalent")
    public Element get_textEquivalent() {
        return _textEquivalent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_textEquivalent")
    public void set_textEquivalent(Element _textEquivalent) {
        this._textEquivalent = _textEquivalent;
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
     * A code that provides meaning for the action or action group. For example, a section may have a LOINC code for the section of a documentation template.
     * 
     */
    @JsonProperty("code")
    public List<CodeableConcept> getCode() {
        return code;
    }

    /**
     * A code that provides meaning for the action or action group. For example, a section may have a LOINC code for the section of a documentation template.
     * 
     */
    @JsonProperty("code")
    public void setCode(List<CodeableConcept> code) {
        this.code = code;
    }

    /**
     * A description of why this action is necessary or appropriate.
     * 
     */
    @JsonProperty("reason")
    public List<CodeableConcept> getReason() {
        return reason;
    }

    /**
     * A description of why this action is necessary or appropriate.
     * 
     */
    @JsonProperty("reason")
    public void setReason(List<CodeableConcept> reason) {
        this.reason = reason;
    }

    /**
     * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
     * 
     */
    @JsonProperty("documentation")
    public List<RelatedArtifact> getDocumentation() {
        return documentation;
    }

    /**
     * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
     * 
     */
    @JsonProperty("documentation")
    public void setDocumentation(List<RelatedArtifact> documentation) {
        this.documentation = documentation;
    }

    /**
     * Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.
     * 
     */
    @JsonProperty("goalId")
    public List<String> getGoalId() {
        return goalId;
    }

    /**
     * Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.
     * 
     */
    @JsonProperty("goalId")
    public void setGoalId(List<String> goalId) {
        this.goalId = goalId;
    }

    /**
     * Extensions for goalId
     * 
     */
    @JsonProperty("_goalId")
    public List<Element> get_goalId() {
        return _goalId;
    }

    /**
     * Extensions for goalId
     * 
     */
    @JsonProperty("_goalId")
    public void set_goalId(List<Element> _goalId) {
        this._goalId = _goalId;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    public CodeableConcept getSubjectCodeableConcept() {
        return subjectCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
        this.subjectCodeableConcept = subjectCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    public Reference getSubjectReference() {
        return subjectReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    public void setSubjectReference(Reference subjectReference) {
        this.subjectReference = subjectReference;
    }

    /**
     * A description of when the action should be triggered.
     * 
     */
    @JsonProperty("trigger")
    public List<TriggerDefinition> getTrigger() {
        return trigger;
    }

    /**
     * A description of when the action should be triggered.
     * 
     */
    @JsonProperty("trigger")
    public void setTrigger(List<TriggerDefinition> trigger) {
        this.trigger = trigger;
    }

    /**
     * An expression that describes applicability criteria or start/stop conditions for the action.
     * 
     */
    @JsonProperty("condition")
    public List<PlanDefinition_Condition> getCondition() {
        return condition;
    }

    /**
     * An expression that describes applicability criteria or start/stop conditions for the action.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(List<PlanDefinition_Condition> condition) {
        this.condition = condition;
    }

    /**
     * Defines input data requirements for the action.
     * 
     */
    @JsonProperty("input")
    public List<DataRequirement> getInput() {
        return input;
    }

    /**
     * Defines input data requirements for the action.
     * 
     */
    @JsonProperty("input")
    public void setInput(List<DataRequirement> input) {
        this.input = input;
    }

    /**
     * Defines the outputs of the action, if any.
     * 
     */
    @JsonProperty("output")
    public List<DataRequirement> getOutput() {
        return output;
    }

    /**
     * Defines the outputs of the action, if any.
     * 
     */
    @JsonProperty("output")
    public void setOutput(List<DataRequirement> output) {
        this.output = output;
    }

    /**
     * A relationship to another action such as &quot;before&quot; or &quot;30-60 minutes after start of&quot;.
     * 
     */
    @JsonProperty("relatedAction")
    public List<PlanDefinition_RelatedAction> getRelatedAction() {
        return relatedAction;
    }

    /**
     * A relationship to another action such as &quot;before&quot; or &quot;30-60 minutes after start of&quot;.
     * 
     */
    @JsonProperty("relatedAction")
    public void setRelatedAction(List<PlanDefinition_RelatedAction> relatedAction) {
        this.relatedAction = relatedAction;
    }

    /**
     * An optional value describing when the action should be performed.
     * 
     */
    @JsonProperty("timingDateTime")
    public String getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * An optional value describing when the action should be performed.
     * 
     */
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(String timingDateTime) {
        this.timingDateTime = timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public Element get_timingDateTime() {
        return _timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public void set_timingDateTime(Element _timingDateTime) {
        this._timingDateTime = _timingDateTime;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("timingAge")
    public Age getTimingAge() {
        return timingAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("timingAge")
    public void setTimingAge(Age timingAge) {
        this.timingAge = timingAge;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Period timingPeriod) {
        this.timingPeriod = timingPeriod;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("timingDuration")
    public Duration getTimingDuration() {
        return timingDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("timingDuration")
    public void setTimingDuration(Duration timingDuration) {
        this.timingDuration = timingDuration;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("timingRange")
    public Range getTimingRange() {
        return timingRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("timingRange")
    public void setTimingRange(Range timingRange) {
        this.timingRange = timingRange;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public Timing getTimingTiming() {
        return timingTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public void setTimingTiming(Timing timingTiming) {
        this.timingTiming = timingTiming;
    }

    /**
     * Indicates who should participate in performing the action described.
     * 
     */
    @JsonProperty("participant")
    public List<PlanDefinition_Participant> getParticipant() {
        return participant;
    }

    /**
     * Indicates who should participate in performing the action described.
     * 
     */
    @JsonProperty("participant")
    public void setParticipant(List<PlanDefinition_Participant> participant) {
        this.participant = participant;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * Defines the grouping behavior for the action and its children.
     * 
     */
    @JsonProperty("groupingBehavior")
    public PlanDefinition_Action.GroupingBehavior getGroupingBehavior() {
        return groupingBehavior;
    }

    /**
     * Defines the grouping behavior for the action and its children.
     * 
     */
    @JsonProperty("groupingBehavior")
    public void setGroupingBehavior(PlanDefinition_Action.GroupingBehavior groupingBehavior) {
        this.groupingBehavior = groupingBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupingBehavior")
    public Element get_groupingBehavior() {
        return _groupingBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_groupingBehavior")
    public void set_groupingBehavior(Element _groupingBehavior) {
        this._groupingBehavior = _groupingBehavior;
    }

    /**
     * Defines the selection behavior for the action and its children.
     * 
     */
    @JsonProperty("selectionBehavior")
    public PlanDefinition_Action.SelectionBehavior getSelectionBehavior() {
        return selectionBehavior;
    }

    /**
     * Defines the selection behavior for the action and its children.
     * 
     */
    @JsonProperty("selectionBehavior")
    public void setSelectionBehavior(PlanDefinition_Action.SelectionBehavior selectionBehavior) {
        this.selectionBehavior = selectionBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_selectionBehavior")
    public Element get_selectionBehavior() {
        return _selectionBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_selectionBehavior")
    public void set_selectionBehavior(Element _selectionBehavior) {
        this._selectionBehavior = _selectionBehavior;
    }

    /**
     * Defines the required behavior for the action.
     * 
     */
    @JsonProperty("requiredBehavior")
    public PlanDefinition_Action.RequiredBehavior getRequiredBehavior() {
        return requiredBehavior;
    }

    /**
     * Defines the required behavior for the action.
     * 
     */
    @JsonProperty("requiredBehavior")
    public void setRequiredBehavior(PlanDefinition_Action.RequiredBehavior requiredBehavior) {
        this.requiredBehavior = requiredBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requiredBehavior")
    public Element get_requiredBehavior() {
        return _requiredBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requiredBehavior")
    public void set_requiredBehavior(Element _requiredBehavior) {
        this._requiredBehavior = _requiredBehavior;
    }

    /**
     * Defines whether the action should usually be preselected.
     * 
     */
    @JsonProperty("precheckBehavior")
    public PlanDefinition_Action.PrecheckBehavior getPrecheckBehavior() {
        return precheckBehavior;
    }

    /**
     * Defines whether the action should usually be preselected.
     * 
     */
    @JsonProperty("precheckBehavior")
    public void setPrecheckBehavior(PlanDefinition_Action.PrecheckBehavior precheckBehavior) {
        this.precheckBehavior = precheckBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precheckBehavior")
    public Element get_precheckBehavior() {
        return _precheckBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precheckBehavior")
    public void set_precheckBehavior(Element _precheckBehavior) {
        this._precheckBehavior = _precheckBehavior;
    }

    /**
     * Defines whether the action can be selected multiple times.
     * 
     */
    @JsonProperty("cardinalityBehavior")
    public PlanDefinition_Action.CardinalityBehavior getCardinalityBehavior() {
        return cardinalityBehavior;
    }

    /**
     * Defines whether the action can be selected multiple times.
     * 
     */
    @JsonProperty("cardinalityBehavior")
    public void setCardinalityBehavior(PlanDefinition_Action.CardinalityBehavior cardinalityBehavior) {
        this.cardinalityBehavior = cardinalityBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cardinalityBehavior")
    public Element get_cardinalityBehavior() {
        return _cardinalityBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cardinalityBehavior")
    public void set_cardinalityBehavior(Element _cardinalityBehavior) {
        this._cardinalityBehavior = _cardinalityBehavior;
    }

    /**
     * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
     * 
     */
    @JsonProperty("definitionCanonical")
    public String getDefinitionCanonical() {
        return definitionCanonical;
    }

    /**
     * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
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
     * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
     * 
     */
    @JsonProperty("definitionUri")
    public String getDefinitionUri() {
        return definitionUri;
    }

    /**
     * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
     * 
     */
    @JsonProperty("definitionUri")
    public void setDefinitionUri(String definitionUri) {
        this.definitionUri = definitionUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionUri")
    public Element get_definitionUri() {
        return _definitionUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionUri")
    public void set_definitionUri(Element _definitionUri) {
        this._definitionUri = _definitionUri;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("transform")
    public String getTransform() {
        return transform;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("transform")
    public void setTransform(String transform) {
        this.transform = transform;
    }

    /**
     * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
     * 
     */
    @JsonProperty("dynamicValue")
    public List<PlanDefinition_DynamicValue> getDynamicValue() {
        return dynamicValue;
    }

    /**
     * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
     * 
     */
    @JsonProperty("dynamicValue")
    public void setDynamicValue(List<PlanDefinition_DynamicValue> dynamicValue) {
        this.dynamicValue = dynamicValue;
    }

    /**
     * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
     * 
     */
    @JsonProperty("action")
    public List<PlanDefinition_Action> getAction() {
        return action;
    }

    /**
     * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
     * 
     */
    @JsonProperty("action")
    public void setAction(List<PlanDefinition_Action> action) {
        this.action = action;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlanDefinition_Action.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("_prefix");
        sb.append('=');
        sb.append(((this._prefix == null)?"<null>":this._prefix));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("_title");
        sb.append('=');
        sb.append(((this._title == null)?"<null>":this._title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("textEquivalent");
        sb.append('=');
        sb.append(((this.textEquivalent == null)?"<null>":this.textEquivalent));
        sb.append(',');
        sb.append("_textEquivalent");
        sb.append('=');
        sb.append(((this._textEquivalent == null)?"<null>":this._textEquivalent));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("_priority");
        sb.append('=');
        sb.append(((this._priority == null)?"<null>":this._priority));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("goalId");
        sb.append('=');
        sb.append(((this.goalId == null)?"<null>":this.goalId));
        sb.append(',');
        sb.append("_goalId");
        sb.append('=');
        sb.append(((this._goalId == null)?"<null>":this._goalId));
        sb.append(',');
        sb.append("subjectCodeableConcept");
        sb.append('=');
        sb.append(((this.subjectCodeableConcept == null)?"<null>":this.subjectCodeableConcept));
        sb.append(',');
        sb.append("subjectReference");
        sb.append('=');
        sb.append(((this.subjectReference == null)?"<null>":this.subjectReference));
        sb.append(',');
        sb.append("trigger");
        sb.append('=');
        sb.append(((this.trigger == null)?"<null>":this.trigger));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
        sb.append(',');
        sb.append("output");
        sb.append('=');
        sb.append(((this.output == null)?"<null>":this.output));
        sb.append(',');
        sb.append("relatedAction");
        sb.append('=');
        sb.append(((this.relatedAction == null)?"<null>":this.relatedAction));
        sb.append(',');
        sb.append("timingDateTime");
        sb.append('=');
        sb.append(((this.timingDateTime == null)?"<null>":this.timingDateTime));
        sb.append(',');
        sb.append("_timingDateTime");
        sb.append('=');
        sb.append(((this._timingDateTime == null)?"<null>":this._timingDateTime));
        sb.append(',');
        sb.append("timingAge");
        sb.append('=');
        sb.append(((this.timingAge == null)?"<null>":this.timingAge));
        sb.append(',');
        sb.append("timingPeriod");
        sb.append('=');
        sb.append(((this.timingPeriod == null)?"<null>":this.timingPeriod));
        sb.append(',');
        sb.append("timingDuration");
        sb.append('=');
        sb.append(((this.timingDuration == null)?"<null>":this.timingDuration));
        sb.append(',');
        sb.append("timingRange");
        sb.append('=');
        sb.append(((this.timingRange == null)?"<null>":this.timingRange));
        sb.append(',');
        sb.append("timingTiming");
        sb.append('=');
        sb.append(((this.timingTiming == null)?"<null>":this.timingTiming));
        sb.append(',');
        sb.append("participant");
        sb.append('=');
        sb.append(((this.participant == null)?"<null>":this.participant));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("groupingBehavior");
        sb.append('=');
        sb.append(((this.groupingBehavior == null)?"<null>":this.groupingBehavior));
        sb.append(',');
        sb.append("_groupingBehavior");
        sb.append('=');
        sb.append(((this._groupingBehavior == null)?"<null>":this._groupingBehavior));
        sb.append(',');
        sb.append("selectionBehavior");
        sb.append('=');
        sb.append(((this.selectionBehavior == null)?"<null>":this.selectionBehavior));
        sb.append(',');
        sb.append("_selectionBehavior");
        sb.append('=');
        sb.append(((this._selectionBehavior == null)?"<null>":this._selectionBehavior));
        sb.append(',');
        sb.append("requiredBehavior");
        sb.append('=');
        sb.append(((this.requiredBehavior == null)?"<null>":this.requiredBehavior));
        sb.append(',');
        sb.append("_requiredBehavior");
        sb.append('=');
        sb.append(((this._requiredBehavior == null)?"<null>":this._requiredBehavior));
        sb.append(',');
        sb.append("precheckBehavior");
        sb.append('=');
        sb.append(((this.precheckBehavior == null)?"<null>":this.precheckBehavior));
        sb.append(',');
        sb.append("_precheckBehavior");
        sb.append('=');
        sb.append(((this._precheckBehavior == null)?"<null>":this._precheckBehavior));
        sb.append(',');
        sb.append("cardinalityBehavior");
        sb.append('=');
        sb.append(((this.cardinalityBehavior == null)?"<null>":this.cardinalityBehavior));
        sb.append(',');
        sb.append("_cardinalityBehavior");
        sb.append('=');
        sb.append(((this._cardinalityBehavior == null)?"<null>":this._cardinalityBehavior));
        sb.append(',');
        sb.append("definitionCanonical");
        sb.append('=');
        sb.append(((this.definitionCanonical == null)?"<null>":this.definitionCanonical));
        sb.append(',');
        sb.append("_definitionCanonical");
        sb.append('=');
        sb.append(((this._definitionCanonical == null)?"<null>":this._definitionCanonical));
        sb.append(',');
        sb.append("definitionUri");
        sb.append('=');
        sb.append(((this.definitionUri == null)?"<null>":this.definitionUri));
        sb.append(',');
        sb.append("_definitionUri");
        sb.append('=');
        sb.append(((this._definitionUri == null)?"<null>":this._definitionUri));
        sb.append(',');
        sb.append("transform");
        sb.append('=');
        sb.append(((this.transform == null)?"<null>":this.transform));
        sb.append(',');
        sb.append("dynamicValue");
        sb.append('=');
        sb.append(((this.dynamicValue == null)?"<null>":this.dynamicValue));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
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
        result = ((result* 31)+((this.cardinalityBehavior == null)? 0 :this.cardinalityBehavior.hashCode()));
        result = ((result* 31)+((this.goalId == null)? 0 :this.goalId.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.definitionUri == null)? 0 :this.definitionUri.hashCode()));
        result = ((result* 31)+((this.groupingBehavior == null)? 0 :this.groupingBehavior.hashCode()));
        result = ((result* 31)+((this.participant == null)? 0 :this.participant.hashCode()));
        result = ((result* 31)+((this.output == null)? 0 :this.output.hashCode()));
        result = ((result* 31)+((this._definitionCanonical == null)? 0 :this._definitionCanonical.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.timingAge == null)? 0 :this.timingAge.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.timingDuration == null)? 0 :this.timingDuration.hashCode()));
        result = ((result* 31)+((this._precheckBehavior == null)? 0 :this._precheckBehavior.hashCode()));
        result = ((result* 31)+((this.textEquivalent == null)? 0 :this.textEquivalent.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        result = ((result* 31)+((this.requiredBehavior == null)? 0 :this.requiredBehavior.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.timingRange == null)? 0 :this.timingRange.hashCode()));
        result = ((result* 31)+((this._prefix == null)? 0 :this._prefix.hashCode()));
        result = ((result* 31)+((this.precheckBehavior == null)? 0 :this.precheckBehavior.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.definitionCanonical == null)? 0 :this.definitionCanonical.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._timingDateTime == null)? 0 :this._timingDateTime.hashCode()));
        result = ((result* 31)+((this.subjectCodeableConcept == null)? 0 :this.subjectCodeableConcept.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._selectionBehavior == null)? 0 :this._selectionBehavior.hashCode()));
        result = ((result* 31)+((this._goalId == null)? 0 :this._goalId.hashCode()));
        result = ((result* 31)+((this._cardinalityBehavior == null)? 0 :this._cardinalityBehavior.hashCode()));
        result = ((result* 31)+((this.transform == null)? 0 :this.transform.hashCode()));
        result = ((result* 31)+((this.dynamicValue == null)? 0 :this.dynamicValue.hashCode()));
        result = ((result* 31)+((this._groupingBehavior == null)? 0 :this._groupingBehavior.hashCode()));
        result = ((result* 31)+((this._textEquivalent == null)? 0 :this._textEquivalent.hashCode()));
        result = ((result* 31)+((this._requiredBehavior == null)? 0 :this._requiredBehavior.hashCode()));
        result = ((result* 31)+((this.relatedAction == null)? 0 :this.relatedAction.hashCode()));
        result = ((result* 31)+((this.timingTiming == null)? 0 :this.timingTiming.hashCode()));
        result = ((result* 31)+((this.timingPeriod == null)? 0 :this.timingPeriod.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.trigger == null)? 0 :this.trigger.hashCode()));
        result = ((result* 31)+((this.subjectReference == null)? 0 :this.subjectReference.hashCode()));
        result = ((result* 31)+((this._priority == null)? 0 :this._priority.hashCode()));
        result = ((result* 31)+((this.selectionBehavior == null)? 0 :this.selectionBehavior.hashCode()));
        result = ((result* 31)+((this._definitionUri == null)? 0 :this._definitionUri.hashCode()));
        result = ((result* 31)+((this.timingDateTime == null)? 0 :this.timingDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlanDefinition_Action) == false) {
            return false;
        }
        PlanDefinition_Action rhs = ((PlanDefinition_Action) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.cardinalityBehavior == rhs.cardinalityBehavior)||((this.cardinalityBehavior!= null)&&this.cardinalityBehavior.equals(rhs.cardinalityBehavior))))&&((this.goalId == rhs.goalId)||((this.goalId!= null)&&this.goalId.equals(rhs.goalId))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.definitionUri == rhs.definitionUri)||((this.definitionUri!= null)&&this.definitionUri.equals(rhs.definitionUri))))&&((this.groupingBehavior == rhs.groupingBehavior)||((this.groupingBehavior!= null)&&this.groupingBehavior.equals(rhs.groupingBehavior))))&&((this.participant == rhs.participant)||((this.participant!= null)&&this.participant.equals(rhs.participant))))&&((this.output == rhs.output)||((this.output!= null)&&this.output.equals(rhs.output))))&&((this._definitionCanonical == rhs._definitionCanonical)||((this._definitionCanonical!= null)&&this._definitionCanonical.equals(rhs._definitionCanonical))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.timingAge == rhs.timingAge)||((this.timingAge!= null)&&this.timingAge.equals(rhs.timingAge))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.timingDuration == rhs.timingDuration)||((this.timingDuration!= null)&&this.timingDuration.equals(rhs.timingDuration))))&&((this._precheckBehavior == rhs._precheckBehavior)||((this._precheckBehavior!= null)&&this._precheckBehavior.equals(rhs._precheckBehavior))))&&((this.textEquivalent == rhs.textEquivalent)||((this.textEquivalent!= null)&&this.textEquivalent.equals(rhs.textEquivalent))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input))))&&((this.requiredBehavior == rhs.requiredBehavior)||((this.requiredBehavior!= null)&&this.requiredBehavior.equals(rhs.requiredBehavior))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.timingRange == rhs.timingRange)||((this.timingRange!= null)&&this.timingRange.equals(rhs.timingRange))))&&((this._prefix == rhs._prefix)||((this._prefix!= null)&&this._prefix.equals(rhs._prefix))))&&((this.precheckBehavior == rhs.precheckBehavior)||((this.precheckBehavior!= null)&&this.precheckBehavior.equals(rhs.precheckBehavior))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.definitionCanonical == rhs.definitionCanonical)||((this.definitionCanonical!= null)&&this.definitionCanonical.equals(rhs.definitionCanonical))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._timingDateTime == rhs._timingDateTime)||((this._timingDateTime!= null)&&this._timingDateTime.equals(rhs._timingDateTime))))&&((this.subjectCodeableConcept == rhs.subjectCodeableConcept)||((this.subjectCodeableConcept!= null)&&this.subjectCodeableConcept.equals(rhs.subjectCodeableConcept))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._selectionBehavior == rhs._selectionBehavior)||((this._selectionBehavior!= null)&&this._selectionBehavior.equals(rhs._selectionBehavior))))&&((this._goalId == rhs._goalId)||((this._goalId!= null)&&this._goalId.equals(rhs._goalId))))&&((this._cardinalityBehavior == rhs._cardinalityBehavior)||((this._cardinalityBehavior!= null)&&this._cardinalityBehavior.equals(rhs._cardinalityBehavior))))&&((this.transform == rhs.transform)||((this.transform!= null)&&this.transform.equals(rhs.transform))))&&((this.dynamicValue == rhs.dynamicValue)||((this.dynamicValue!= null)&&this.dynamicValue.equals(rhs.dynamicValue))))&&((this._groupingBehavior == rhs._groupingBehavior)||((this._groupingBehavior!= null)&&this._groupingBehavior.equals(rhs._groupingBehavior))))&&((this._textEquivalent == rhs._textEquivalent)||((this._textEquivalent!= null)&&this._textEquivalent.equals(rhs._textEquivalent))))&&((this._requiredBehavior == rhs._requiredBehavior)||((this._requiredBehavior!= null)&&this._requiredBehavior.equals(rhs._requiredBehavior))))&&((this.relatedAction == rhs.relatedAction)||((this.relatedAction!= null)&&this.relatedAction.equals(rhs.relatedAction))))&&((this.timingTiming == rhs.timingTiming)||((this.timingTiming!= null)&&this.timingTiming.equals(rhs.timingTiming))))&&((this.timingPeriod == rhs.timingPeriod)||((this.timingPeriod!= null)&&this.timingPeriod.equals(rhs.timingPeriod))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.trigger == rhs.trigger)||((this.trigger!= null)&&this.trigger.equals(rhs.trigger))))&&((this.subjectReference == rhs.subjectReference)||((this.subjectReference!= null)&&this.subjectReference.equals(rhs.subjectReference))))&&((this._priority == rhs._priority)||((this._priority!= null)&&this._priority.equals(rhs._priority))))&&((this.selectionBehavior == rhs.selectionBehavior)||((this.selectionBehavior!= null)&&this.selectionBehavior.equals(rhs.selectionBehavior))))&&((this._definitionUri == rhs._definitionUri)||((this._definitionUri!= null)&&this._definitionUri.equals(rhs._definitionUri))))&&((this.timingDateTime == rhs.timingDateTime)||((this.timingDateTime!= null)&&this.timingDateTime.equals(rhs.timingDateTime))));
    }


    /**
     * Defines whether the action can be selected multiple times.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CardinalityBehavior {

        SINGLE("single"),
        MULTIPLE("multiple");
        private final String value;
        private final static Map<String, PlanDefinition_Action.CardinalityBehavior> CONSTANTS = new HashMap<String, PlanDefinition_Action.CardinalityBehavior>();

        static {
            for (PlanDefinition_Action.CardinalityBehavior c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CardinalityBehavior(String value) {
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
        public static PlanDefinition_Action.CardinalityBehavior fromValue(String value) {
            PlanDefinition_Action.CardinalityBehavior constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Defines the grouping behavior for the action and its children.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum GroupingBehavior {

        VISUAL_GROUP("visual-group"),
        LOGICAL_GROUP("logical-group"),
        SENTENCE_GROUP("sentence-group");
        private final String value;
        private final static Map<String, PlanDefinition_Action.GroupingBehavior> CONSTANTS = new HashMap<String, PlanDefinition_Action.GroupingBehavior>();

        static {
            for (PlanDefinition_Action.GroupingBehavior c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        GroupingBehavior(String value) {
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
        public static PlanDefinition_Action.GroupingBehavior fromValue(String value) {
            PlanDefinition_Action.GroupingBehavior constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Defines whether the action should usually be preselected.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PrecheckBehavior {

        YES("yes"),
        NO("no");
        private final String value;
        private final static Map<String, PlanDefinition_Action.PrecheckBehavior> CONSTANTS = new HashMap<String, PlanDefinition_Action.PrecheckBehavior>();

        static {
            for (PlanDefinition_Action.PrecheckBehavior c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PrecheckBehavior(String value) {
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
        public static PlanDefinition_Action.PrecheckBehavior fromValue(String value) {
            PlanDefinition_Action.PrecheckBehavior constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Defines the required behavior for the action.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RequiredBehavior {

        MUST("must"),
        COULD("could"),
        MUST_UNLESS_DOCUMENTED("must-unless-documented");
        private final String value;
        private final static Map<String, PlanDefinition_Action.RequiredBehavior> CONSTANTS = new HashMap<String, PlanDefinition_Action.RequiredBehavior>();

        static {
            for (PlanDefinition_Action.RequiredBehavior c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RequiredBehavior(String value) {
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
        public static PlanDefinition_Action.RequiredBehavior fromValue(String value) {
            PlanDefinition_Action.RequiredBehavior constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Defines the selection behavior for the action and its children.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SelectionBehavior {

        ANY("any"),
        ALL("all"),
        ALL_OR_NONE("all-or-none"),
        EXACTLY_ONE("exactly-one"),
        AT_MOST_ONE("at-most-one"),
        ONE_OR_MORE("one-or-more");
        private final String value;
        private final static Map<String, PlanDefinition_Action.SelectionBehavior> CONSTANTS = new HashMap<String, PlanDefinition_Action.SelectionBehavior>();

        static {
            for (PlanDefinition_Action.SelectionBehavior c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SelectionBehavior(String value) {
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
        public static PlanDefinition_Action.SelectionBehavior fromValue(String value) {
            PlanDefinition_Action.SelectionBehavior constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}