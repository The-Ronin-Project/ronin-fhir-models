
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
 * The ResearchElementDefinition resource describes a &quot;PICO&quot; element that knowledge (evidence, assertion, recommendation) is about.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "definitionCodeableConcept",
    "definitionCanonical",
    "_definitionCanonical",
    "definitionExpression",
    "definitionDataRequirement",
    "usageContext",
    "exclude",
    "_exclude",
    "unitOfMeasure",
    "studyEffectiveDescription",
    "_studyEffectiveDescription",
    "studyEffectiveDateTime",
    "_studyEffectiveDateTime",
    "studyEffectivePeriod",
    "studyEffectiveDuration",
    "studyEffectiveTiming",
    "studyEffectiveTimeFromStart",
    "studyEffectiveGroupMeasure",
    "_studyEffectiveGroupMeasure",
    "participantEffectiveDescription",
    "_participantEffectiveDescription",
    "participantEffectiveDateTime",
    "_participantEffectiveDateTime",
    "participantEffectivePeriod",
    "participantEffectiveDuration",
    "participantEffectiveTiming",
    "participantEffectiveTimeFromStart",
    "participantEffectiveGroupMeasure",
    "_participantEffectiveGroupMeasure"
})
@Generated("jsonschema2pojo")
public class ResearchElementDefinition_Characteristic {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("definitionCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept definitionCodeableConcept;
    /**
     * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
     * 
     */
    @JsonProperty("definitionCanonical")
    @JsonPropertyDescription("Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).")
    private String definitionCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definitionCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _definitionCanonical;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfMeasure")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept unitOfMeasure;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("studyEffectiveDescription")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String studyEffectiveDescription;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveDescription")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _studyEffectiveDescription;
    /**
     * Indicates what effective period the study covers.
     * 
     */
    @JsonProperty("studyEffectiveDateTime")
    @JsonPropertyDescription("Indicates what effective period the study covers.")
    private String studyEffectiveDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _studyEffectiveDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("studyEffectivePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period studyEffectivePeriod;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("studyEffectiveDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration studyEffectiveDuration;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("studyEffectiveTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing studyEffectiveTiming;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("studyEffectiveTimeFromStart")
    @JsonPropertyDescription("A length of time.")
    private Duration studyEffectiveTimeFromStart;
    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("studyEffectiveGroupMeasure")
    @JsonPropertyDescription("Indicates how elements are aggregated within the study effective period.")
    private ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure studyEffectiveGroupMeasure;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveGroupMeasure")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _studyEffectiveGroupMeasure;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("participantEffectiveDescription")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String participantEffectiveDescription;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveDescription")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _participantEffectiveDescription;
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
    @JsonProperty("participantEffectiveTimeFromStart")
    @JsonPropertyDescription("A length of time.")
    private Duration participantEffectiveTimeFromStart;
    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("participantEffectiveGroupMeasure")
    @JsonPropertyDescription("Indicates how elements are aggregated within the study effective period.")
    private ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure participantEffectiveGroupMeasure;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveGroupMeasure")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _participantEffectiveGroupMeasure;

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
     * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
     * 
     */
    @JsonProperty("definitionCanonical")
    public String getDefinitionCanonical() {
        return definitionCanonical;
    }

    /**
     * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfMeasure")
    public CodeableConcept getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(CodeableConcept unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("studyEffectiveDescription")
    public String getStudyEffectiveDescription() {
        return studyEffectiveDescription;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("studyEffectiveDescription")
    public void setStudyEffectiveDescription(String studyEffectiveDescription) {
        this.studyEffectiveDescription = studyEffectiveDescription;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveDescription")
    public Element get_studyEffectiveDescription() {
        return _studyEffectiveDescription;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveDescription")
    public void set_studyEffectiveDescription(Element _studyEffectiveDescription) {
        this._studyEffectiveDescription = _studyEffectiveDescription;
    }

    /**
     * Indicates what effective period the study covers.
     * 
     */
    @JsonProperty("studyEffectiveDateTime")
    public String getStudyEffectiveDateTime() {
        return studyEffectiveDateTime;
    }

    /**
     * Indicates what effective period the study covers.
     * 
     */
    @JsonProperty("studyEffectiveDateTime")
    public void setStudyEffectiveDateTime(String studyEffectiveDateTime) {
        this.studyEffectiveDateTime = studyEffectiveDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveDateTime")
    public Element get_studyEffectiveDateTime() {
        return _studyEffectiveDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveDateTime")
    public void set_studyEffectiveDateTime(Element _studyEffectiveDateTime) {
        this._studyEffectiveDateTime = _studyEffectiveDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("studyEffectivePeriod")
    public Period getStudyEffectivePeriod() {
        return studyEffectivePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("studyEffectivePeriod")
    public void setStudyEffectivePeriod(Period studyEffectivePeriod) {
        this.studyEffectivePeriod = studyEffectivePeriod;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("studyEffectiveDuration")
    public Duration getStudyEffectiveDuration() {
        return studyEffectiveDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("studyEffectiveDuration")
    public void setStudyEffectiveDuration(Duration studyEffectiveDuration) {
        this.studyEffectiveDuration = studyEffectiveDuration;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("studyEffectiveTiming")
    public Timing getStudyEffectiveTiming() {
        return studyEffectiveTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("studyEffectiveTiming")
    public void setStudyEffectiveTiming(Timing studyEffectiveTiming) {
        this.studyEffectiveTiming = studyEffectiveTiming;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("studyEffectiveTimeFromStart")
    public Duration getStudyEffectiveTimeFromStart() {
        return studyEffectiveTimeFromStart;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("studyEffectiveTimeFromStart")
    public void setStudyEffectiveTimeFromStart(Duration studyEffectiveTimeFromStart) {
        this.studyEffectiveTimeFromStart = studyEffectiveTimeFromStart;
    }

    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("studyEffectiveGroupMeasure")
    public ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure getStudyEffectiveGroupMeasure() {
        return studyEffectiveGroupMeasure;
    }

    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("studyEffectiveGroupMeasure")
    public void setStudyEffectiveGroupMeasure(ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure studyEffectiveGroupMeasure) {
        this.studyEffectiveGroupMeasure = studyEffectiveGroupMeasure;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveGroupMeasure")
    public Element get_studyEffectiveGroupMeasure() {
        return _studyEffectiveGroupMeasure;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_studyEffectiveGroupMeasure")
    public void set_studyEffectiveGroupMeasure(Element _studyEffectiveGroupMeasure) {
        this._studyEffectiveGroupMeasure = _studyEffectiveGroupMeasure;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("participantEffectiveDescription")
    public String getParticipantEffectiveDescription() {
        return participantEffectiveDescription;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("participantEffectiveDescription")
    public void setParticipantEffectiveDescription(String participantEffectiveDescription) {
        this.participantEffectiveDescription = participantEffectiveDescription;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveDescription")
    public Element get_participantEffectiveDescription() {
        return _participantEffectiveDescription;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveDescription")
    public void set_participantEffectiveDescription(Element _participantEffectiveDescription) {
        this._participantEffectiveDescription = _participantEffectiveDescription;
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
    @JsonProperty("participantEffectiveTimeFromStart")
    public Duration getParticipantEffectiveTimeFromStart() {
        return participantEffectiveTimeFromStart;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("participantEffectiveTimeFromStart")
    public void setParticipantEffectiveTimeFromStart(Duration participantEffectiveTimeFromStart) {
        this.participantEffectiveTimeFromStart = participantEffectiveTimeFromStart;
    }

    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("participantEffectiveGroupMeasure")
    public ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure getParticipantEffectiveGroupMeasure() {
        return participantEffectiveGroupMeasure;
    }

    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @JsonProperty("participantEffectiveGroupMeasure")
    public void setParticipantEffectiveGroupMeasure(ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure participantEffectiveGroupMeasure) {
        this.participantEffectiveGroupMeasure = participantEffectiveGroupMeasure;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveGroupMeasure")
    public Element get_participantEffectiveGroupMeasure() {
        return _participantEffectiveGroupMeasure;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_participantEffectiveGroupMeasure")
    public void set_participantEffectiveGroupMeasure(Element _participantEffectiveGroupMeasure) {
        this._participantEffectiveGroupMeasure = _participantEffectiveGroupMeasure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResearchElementDefinition_Characteristic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("definitionCodeableConcept");
        sb.append('=');
        sb.append(((this.definitionCodeableConcept == null)?"<null>":this.definitionCodeableConcept));
        sb.append(',');
        sb.append("definitionCanonical");
        sb.append('=');
        sb.append(((this.definitionCanonical == null)?"<null>":this.definitionCanonical));
        sb.append(',');
        sb.append("_definitionCanonical");
        sb.append('=');
        sb.append(((this._definitionCanonical == null)?"<null>":this._definitionCanonical));
        sb.append(',');
        sb.append("definitionExpression");
        sb.append('=');
        sb.append(((this.definitionExpression == null)?"<null>":this.definitionExpression));
        sb.append(',');
        sb.append("definitionDataRequirement");
        sb.append('=');
        sb.append(((this.definitionDataRequirement == null)?"<null>":this.definitionDataRequirement));
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
        sb.append("unitOfMeasure");
        sb.append('=');
        sb.append(((this.unitOfMeasure == null)?"<null>":this.unitOfMeasure));
        sb.append(',');
        sb.append("studyEffectiveDescription");
        sb.append('=');
        sb.append(((this.studyEffectiveDescription == null)?"<null>":this.studyEffectiveDescription));
        sb.append(',');
        sb.append("_studyEffectiveDescription");
        sb.append('=');
        sb.append(((this._studyEffectiveDescription == null)?"<null>":this._studyEffectiveDescription));
        sb.append(',');
        sb.append("studyEffectiveDateTime");
        sb.append('=');
        sb.append(((this.studyEffectiveDateTime == null)?"<null>":this.studyEffectiveDateTime));
        sb.append(',');
        sb.append("_studyEffectiveDateTime");
        sb.append('=');
        sb.append(((this._studyEffectiveDateTime == null)?"<null>":this._studyEffectiveDateTime));
        sb.append(',');
        sb.append("studyEffectivePeriod");
        sb.append('=');
        sb.append(((this.studyEffectivePeriod == null)?"<null>":this.studyEffectivePeriod));
        sb.append(',');
        sb.append("studyEffectiveDuration");
        sb.append('=');
        sb.append(((this.studyEffectiveDuration == null)?"<null>":this.studyEffectiveDuration));
        sb.append(',');
        sb.append("studyEffectiveTiming");
        sb.append('=');
        sb.append(((this.studyEffectiveTiming == null)?"<null>":this.studyEffectiveTiming));
        sb.append(',');
        sb.append("studyEffectiveTimeFromStart");
        sb.append('=');
        sb.append(((this.studyEffectiveTimeFromStart == null)?"<null>":this.studyEffectiveTimeFromStart));
        sb.append(',');
        sb.append("studyEffectiveGroupMeasure");
        sb.append('=');
        sb.append(((this.studyEffectiveGroupMeasure == null)?"<null>":this.studyEffectiveGroupMeasure));
        sb.append(',');
        sb.append("_studyEffectiveGroupMeasure");
        sb.append('=');
        sb.append(((this._studyEffectiveGroupMeasure == null)?"<null>":this._studyEffectiveGroupMeasure));
        sb.append(',');
        sb.append("participantEffectiveDescription");
        sb.append('=');
        sb.append(((this.participantEffectiveDescription == null)?"<null>":this.participantEffectiveDescription));
        sb.append(',');
        sb.append("_participantEffectiveDescription");
        sb.append('=');
        sb.append(((this._participantEffectiveDescription == null)?"<null>":this._participantEffectiveDescription));
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
        sb.append("participantEffectiveTimeFromStart");
        sb.append('=');
        sb.append(((this.participantEffectiveTimeFromStart == null)?"<null>":this.participantEffectiveTimeFromStart));
        sb.append(',');
        sb.append("participantEffectiveGroupMeasure");
        sb.append('=');
        sb.append(((this.participantEffectiveGroupMeasure == null)?"<null>":this.participantEffectiveGroupMeasure));
        sb.append(',');
        sb.append("_participantEffectiveGroupMeasure");
        sb.append('=');
        sb.append(((this._participantEffectiveGroupMeasure == null)?"<null>":this._participantEffectiveGroupMeasure));
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
        result = ((result* 31)+((this._participantEffectiveGroupMeasure == null)? 0 :this._participantEffectiveGroupMeasure.hashCode()));
        result = ((result* 31)+((this.definitionDataRequirement == null)? 0 :this.definitionDataRequirement.hashCode()));
        result = ((result* 31)+((this.participantEffectiveDateTime == null)? 0 :this.participantEffectiveDateTime.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._exclude == null)? 0 :this._exclude.hashCode()));
        result = ((result* 31)+((this.studyEffectiveDuration == null)? 0 :this.studyEffectiveDuration.hashCode()));
        result = ((result* 31)+((this._definitionCanonical == null)? 0 :this._definitionCanonical.hashCode()));
        result = ((result* 31)+((this.studyEffectiveTimeFromStart == null)? 0 :this.studyEffectiveTimeFromStart.hashCode()));
        result = ((result* 31)+((this.studyEffectiveGroupMeasure == null)? 0 :this.studyEffectiveGroupMeasure.hashCode()));
        result = ((result* 31)+((this.studyEffectiveDescription == null)? 0 :this.studyEffectiveDescription.hashCode()));
        result = ((result* 31)+((this._studyEffectiveGroupMeasure == null)? 0 :this._studyEffectiveGroupMeasure.hashCode()));
        result = ((result* 31)+((this.exclude == null)? 0 :this.exclude.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.participantEffectiveDescription == null)? 0 :this.participantEffectiveDescription.hashCode()));
        result = ((result* 31)+((this.studyEffectivePeriod == null)? 0 :this.studyEffectivePeriod.hashCode()));
        result = ((result* 31)+((this.studyEffectiveTiming == null)? 0 :this.studyEffectiveTiming.hashCode()));
        result = ((result* 31)+((this.unitOfMeasure == null)? 0 :this.unitOfMeasure.hashCode()));
        result = ((result* 31)+((this._studyEffectiveDateTime == null)? 0 :this._studyEffectiveDateTime.hashCode()));
        result = ((result* 31)+((this.studyEffectiveDateTime == null)? 0 :this.studyEffectiveDateTime.hashCode()));
        result = ((result* 31)+((this._studyEffectiveDescription == null)? 0 :this._studyEffectiveDescription.hashCode()));
        result = ((result* 31)+((this.participantEffectiveGroupMeasure == null)? 0 :this.participantEffectiveGroupMeasure.hashCode()));
        result = ((result* 31)+((this.definitionExpression == null)? 0 :this.definitionExpression.hashCode()));
        result = ((result* 31)+((this._participantEffectiveDescription == null)? 0 :this._participantEffectiveDescription.hashCode()));
        result = ((result* 31)+((this.participantEffectiveDuration == null)? 0 :this.participantEffectiveDuration.hashCode()));
        result = ((result* 31)+((this.participantEffectiveTimeFromStart == null)? 0 :this.participantEffectiveTimeFromStart.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResearchElementDefinition_Characteristic) == false) {
            return false;
        }
        ResearchElementDefinition_Characteristic rhs = ((ResearchElementDefinition_Characteristic) other);
        return (((((((((((((((((((((((((((((((((this.participantEffectiveTiming == rhs.participantEffectiveTiming)||((this.participantEffectiveTiming!= null)&&this.participantEffectiveTiming.equals(rhs.participantEffectiveTiming)))&&((this.definitionCodeableConcept == rhs.definitionCodeableConcept)||((this.definitionCodeableConcept!= null)&&this.definitionCodeableConcept.equals(rhs.definitionCodeableConcept))))&&((this.usageContext == rhs.usageContext)||((this.usageContext!= null)&&this.usageContext.equals(rhs.usageContext))))&&((this._participantEffectiveDateTime == rhs._participantEffectiveDateTime)||((this._participantEffectiveDateTime!= null)&&this._participantEffectiveDateTime.equals(rhs._participantEffectiveDateTime))))&&((this.participantEffectivePeriod == rhs.participantEffectivePeriod)||((this.participantEffectivePeriod!= null)&&this.participantEffectivePeriod.equals(rhs.participantEffectivePeriod))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.definitionCanonical == rhs.definitionCanonical)||((this.definitionCanonical!= null)&&this.definitionCanonical.equals(rhs.definitionCanonical))))&&((this._participantEffectiveGroupMeasure == rhs._participantEffectiveGroupMeasure)||((this._participantEffectiveGroupMeasure!= null)&&this._participantEffectiveGroupMeasure.equals(rhs._participantEffectiveGroupMeasure))))&&((this.definitionDataRequirement == rhs.definitionDataRequirement)||((this.definitionDataRequirement!= null)&&this.definitionDataRequirement.equals(rhs.definitionDataRequirement))))&&((this.participantEffectiveDateTime == rhs.participantEffectiveDateTime)||((this.participantEffectiveDateTime!= null)&&this.participantEffectiveDateTime.equals(rhs.participantEffectiveDateTime))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._exclude == rhs._exclude)||((this._exclude!= null)&&this._exclude.equals(rhs._exclude))))&&((this.studyEffectiveDuration == rhs.studyEffectiveDuration)||((this.studyEffectiveDuration!= null)&&this.studyEffectiveDuration.equals(rhs.studyEffectiveDuration))))&&((this._definitionCanonical == rhs._definitionCanonical)||((this._definitionCanonical!= null)&&this._definitionCanonical.equals(rhs._definitionCanonical))))&&((this.studyEffectiveTimeFromStart == rhs.studyEffectiveTimeFromStart)||((this.studyEffectiveTimeFromStart!= null)&&this.studyEffectiveTimeFromStart.equals(rhs.studyEffectiveTimeFromStart))))&&((this.studyEffectiveGroupMeasure == rhs.studyEffectiveGroupMeasure)||((this.studyEffectiveGroupMeasure!= null)&&this.studyEffectiveGroupMeasure.equals(rhs.studyEffectiveGroupMeasure))))&&((this.studyEffectiveDescription == rhs.studyEffectiveDescription)||((this.studyEffectiveDescription!= null)&&this.studyEffectiveDescription.equals(rhs.studyEffectiveDescription))))&&((this._studyEffectiveGroupMeasure == rhs._studyEffectiveGroupMeasure)||((this._studyEffectiveGroupMeasure!= null)&&this._studyEffectiveGroupMeasure.equals(rhs._studyEffectiveGroupMeasure))))&&((this.exclude == rhs.exclude)||((this.exclude!= null)&&this.exclude.equals(rhs.exclude))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.participantEffectiveDescription == rhs.participantEffectiveDescription)||((this.participantEffectiveDescription!= null)&&this.participantEffectiveDescription.equals(rhs.participantEffectiveDescription))))&&((this.studyEffectivePeriod == rhs.studyEffectivePeriod)||((this.studyEffectivePeriod!= null)&&this.studyEffectivePeriod.equals(rhs.studyEffectivePeriod))))&&((this.studyEffectiveTiming == rhs.studyEffectiveTiming)||((this.studyEffectiveTiming!= null)&&this.studyEffectiveTiming.equals(rhs.studyEffectiveTiming))))&&((this.unitOfMeasure == rhs.unitOfMeasure)||((this.unitOfMeasure!= null)&&this.unitOfMeasure.equals(rhs.unitOfMeasure))))&&((this._studyEffectiveDateTime == rhs._studyEffectiveDateTime)||((this._studyEffectiveDateTime!= null)&&this._studyEffectiveDateTime.equals(rhs._studyEffectiveDateTime))))&&((this.studyEffectiveDateTime == rhs.studyEffectiveDateTime)||((this.studyEffectiveDateTime!= null)&&this.studyEffectiveDateTime.equals(rhs.studyEffectiveDateTime))))&&((this._studyEffectiveDescription == rhs._studyEffectiveDescription)||((this._studyEffectiveDescription!= null)&&this._studyEffectiveDescription.equals(rhs._studyEffectiveDescription))))&&((this.participantEffectiveGroupMeasure == rhs.participantEffectiveGroupMeasure)||((this.participantEffectiveGroupMeasure!= null)&&this.participantEffectiveGroupMeasure.equals(rhs.participantEffectiveGroupMeasure))))&&((this.definitionExpression == rhs.definitionExpression)||((this.definitionExpression!= null)&&this.definitionExpression.equals(rhs.definitionExpression))))&&((this._participantEffectiveDescription == rhs._participantEffectiveDescription)||((this._participantEffectiveDescription!= null)&&this._participantEffectiveDescription.equals(rhs._participantEffectiveDescription))))&&((this.participantEffectiveDuration == rhs.participantEffectiveDuration)||((this.participantEffectiveDuration!= null)&&this.participantEffectiveDuration.equals(rhs.participantEffectiveDuration))))&&((this.participantEffectiveTimeFromStart == rhs.participantEffectiveTimeFromStart)||((this.participantEffectiveTimeFromStart!= null)&&this.participantEffectiveTimeFromStart.equals(rhs.participantEffectiveTimeFromStart))));
    }


    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ParticipantEffectiveGroupMeasure {

        MEAN("mean"),
        MEDIAN("median"),
        MEAN_OF_MEAN("mean-of-mean"),
        MEAN_OF_MEDIAN("mean-of-median"),
        MEDIAN_OF_MEAN("median-of-mean"),
        MEDIAN_OF_MEDIAN("median-of-median");
        private final String value;
        private final static Map<String, ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure> CONSTANTS = new HashMap<String, ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure>();

        static {
            for (ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ParticipantEffectiveGroupMeasure(String value) {
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
        public static ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure fromValue(String value) {
            ResearchElementDefinition_Characteristic.ParticipantEffectiveGroupMeasure constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Indicates how elements are aggregated within the study effective period.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum StudyEffectiveGroupMeasure {

        MEAN("mean"),
        MEDIAN("median"),
        MEAN_OF_MEAN("mean-of-mean"),
        MEAN_OF_MEDIAN("mean-of-median"),
        MEDIAN_OF_MEAN("median-of-mean"),
        MEDIAN_OF_MEDIAN("median-of-median");
        private final String value;
        private final static Map<String, ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure> CONSTANTS = new HashMap<String, ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure>();

        static {
            for (ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        StudyEffectiveGroupMeasure(String value) {
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
        public static ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure fromValue(String value) {
            ResearchElementDefinition_Characteristic.StudyEffectiveGroupMeasure constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
