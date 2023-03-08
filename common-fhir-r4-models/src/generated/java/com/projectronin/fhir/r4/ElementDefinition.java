
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "path",
    "_path",
    "representation",
    "_representation",
    "sliceName",
    "_sliceName",
    "sliceIsConstraining",
    "_sliceIsConstraining",
    "label",
    "_label",
    "code",
    "slicing",
    "short",
    "_short",
    "definition",
    "_definition",
    "comment",
    "_comment",
    "requirements",
    "_requirements",
    "alias",
    "_alias",
    "min",
    "_min",
    "max",
    "_max",
    "base",
    "contentReference",
    "_contentReference",
    "type",
    "defaultValueBase64Binary",
    "_defaultValueBase64Binary",
    "defaultValueBoolean",
    "_defaultValueBoolean",
    "defaultValueCanonical",
    "_defaultValueCanonical",
    "defaultValueCode",
    "_defaultValueCode",
    "defaultValueDate",
    "_defaultValueDate",
    "defaultValueDateTime",
    "_defaultValueDateTime",
    "defaultValueDecimal",
    "_defaultValueDecimal",
    "defaultValueId",
    "_defaultValueId",
    "defaultValueInstant",
    "_defaultValueInstant",
    "defaultValueInteger",
    "_defaultValueInteger",
    "defaultValueMarkdown",
    "_defaultValueMarkdown",
    "defaultValueOid",
    "_defaultValueOid",
    "defaultValuePositiveInt",
    "_defaultValuePositiveInt",
    "defaultValueString",
    "_defaultValueString",
    "defaultValueTime",
    "_defaultValueTime",
    "defaultValueUnsignedInt",
    "_defaultValueUnsignedInt",
    "defaultValueUri",
    "_defaultValueUri",
    "defaultValueUrl",
    "_defaultValueUrl",
    "defaultValueUuid",
    "_defaultValueUuid",
    "defaultValueAddress",
    "defaultValueAge",
    "defaultValueAnnotation",
    "defaultValueAttachment",
    "defaultValueCodeableConcept",
    "defaultValueCoding",
    "defaultValueContactPoint",
    "defaultValueCount",
    "defaultValueDistance",
    "defaultValueDuration",
    "defaultValueHumanName",
    "defaultValueIdentifier",
    "defaultValueMoney",
    "defaultValuePeriod",
    "defaultValueQuantity",
    "defaultValueRange",
    "defaultValueRatio",
    "defaultValueReference",
    "defaultValueSampledData",
    "defaultValueSignature",
    "defaultValueTiming",
    "defaultValueContactDetail",
    "defaultValueContributor",
    "defaultValueDataRequirement",
    "defaultValueExpression",
    "defaultValueParameterDefinition",
    "defaultValueRelatedArtifact",
    "defaultValueTriggerDefinition",
    "defaultValueUsageContext",
    "defaultValueDosage",
    "defaultValueMeta",
    "meaningWhenMissing",
    "_meaningWhenMissing",
    "orderMeaning",
    "_orderMeaning",
    "fixedBase64Binary",
    "_fixedBase64Binary",
    "fixedBoolean",
    "_fixedBoolean",
    "fixedCanonical",
    "_fixedCanonical",
    "fixedCode",
    "_fixedCode",
    "fixedDate",
    "_fixedDate",
    "fixedDateTime",
    "_fixedDateTime",
    "fixedDecimal",
    "_fixedDecimal",
    "fixedId",
    "_fixedId",
    "fixedInstant",
    "_fixedInstant",
    "fixedInteger",
    "_fixedInteger",
    "fixedMarkdown",
    "_fixedMarkdown",
    "fixedOid",
    "_fixedOid",
    "fixedPositiveInt",
    "_fixedPositiveInt",
    "fixedString",
    "_fixedString",
    "fixedTime",
    "_fixedTime",
    "fixedUnsignedInt",
    "_fixedUnsignedInt",
    "fixedUri",
    "_fixedUri",
    "fixedUrl",
    "_fixedUrl",
    "fixedUuid",
    "_fixedUuid",
    "fixedAddress",
    "fixedAge",
    "fixedAnnotation",
    "fixedAttachment",
    "fixedCodeableConcept",
    "fixedCoding",
    "fixedContactPoint",
    "fixedCount",
    "fixedDistance",
    "fixedDuration",
    "fixedHumanName",
    "fixedIdentifier",
    "fixedMoney",
    "fixedPeriod",
    "fixedQuantity",
    "fixedRange",
    "fixedRatio",
    "fixedReference",
    "fixedSampledData",
    "fixedSignature",
    "fixedTiming",
    "fixedContactDetail",
    "fixedContributor",
    "fixedDataRequirement",
    "fixedExpression",
    "fixedParameterDefinition",
    "fixedRelatedArtifact",
    "fixedTriggerDefinition",
    "fixedUsageContext",
    "fixedDosage",
    "fixedMeta",
    "patternBase64Binary",
    "_patternBase64Binary",
    "patternBoolean",
    "_patternBoolean",
    "patternCanonical",
    "_patternCanonical",
    "patternCode",
    "_patternCode",
    "patternDate",
    "_patternDate",
    "patternDateTime",
    "_patternDateTime",
    "patternDecimal",
    "_patternDecimal",
    "patternId",
    "_patternId",
    "patternInstant",
    "_patternInstant",
    "patternInteger",
    "_patternInteger",
    "patternMarkdown",
    "_patternMarkdown",
    "patternOid",
    "_patternOid",
    "patternPositiveInt",
    "_patternPositiveInt",
    "patternString",
    "_patternString",
    "patternTime",
    "_patternTime",
    "patternUnsignedInt",
    "_patternUnsignedInt",
    "patternUri",
    "_patternUri",
    "patternUrl",
    "_patternUrl",
    "patternUuid",
    "_patternUuid",
    "patternAddress",
    "patternAge",
    "patternAnnotation",
    "patternAttachment",
    "patternCodeableConcept",
    "patternCoding",
    "patternContactPoint",
    "patternCount",
    "patternDistance",
    "patternDuration",
    "patternHumanName",
    "patternIdentifier",
    "patternMoney",
    "patternPeriod",
    "patternQuantity",
    "patternRange",
    "patternRatio",
    "patternReference",
    "patternSampledData",
    "patternSignature",
    "patternTiming",
    "patternContactDetail",
    "patternContributor",
    "patternDataRequirement",
    "patternExpression",
    "patternParameterDefinition",
    "patternRelatedArtifact",
    "patternTriggerDefinition",
    "patternUsageContext",
    "patternDosage",
    "patternMeta",
    "example",
    "minValueDate",
    "_minValueDate",
    "minValueDateTime",
    "_minValueDateTime",
    "minValueInstant",
    "_minValueInstant",
    "minValueTime",
    "_minValueTime",
    "minValueDecimal",
    "_minValueDecimal",
    "minValueInteger",
    "_minValueInteger",
    "minValuePositiveInt",
    "_minValuePositiveInt",
    "minValueUnsignedInt",
    "_minValueUnsignedInt",
    "minValueQuantity",
    "maxValueDate",
    "_maxValueDate",
    "maxValueDateTime",
    "_maxValueDateTime",
    "maxValueInstant",
    "_maxValueInstant",
    "maxValueTime",
    "_maxValueTime",
    "maxValueDecimal",
    "_maxValueDecimal",
    "maxValueInteger",
    "_maxValueInteger",
    "maxValuePositiveInt",
    "_maxValuePositiveInt",
    "maxValueUnsignedInt",
    "_maxValueUnsignedInt",
    "maxValueQuantity",
    "maxLength",
    "_maxLength",
    "condition",
    "_condition",
    "constraint",
    "mustSupport",
    "_mustSupport",
    "isModifier",
    "_isModifier",
    "isModifierReason",
    "_isModifierReason",
    "isSummary",
    "_isSummary",
    "binding",
    "mapping"
})
@Generated("jsonschema2pojo")
public class ElementDefinition {

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
    @JsonProperty("path")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String path;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _path;
    /**
     * Codes that define how this element is represented in instances, when the deviation varies from the normal case.
     * 
     */
    @JsonProperty("representation")
    @JsonPropertyDescription("Codes that define how this element is represented in instances, when the deviation varies from the normal case.")
    private List<Representation> representation = new ArrayList<Representation>();
    /**
     * Extensions for representation
     * 
     */
    @JsonProperty("_representation")
    @JsonPropertyDescription("Extensions for representation")
    private List<Element> _representation = new ArrayList<Element>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sliceName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String sliceName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sliceName;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("sliceIsConstraining")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean sliceIsConstraining;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceIsConstraining")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sliceIsConstraining;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String label;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _label;
    /**
     * A code that has the same meaning as the element in a particular terminology.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that has the same meaning as the element in a particular terminology.")
    private List<Coding> code = new ArrayList<Coding>();
    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("slicing")
    @JsonPropertyDescription("Captures constraints on each element within the resource, profile, or extension.")
    private ElementDefinition_Slicing slicing;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("short")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String _short;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_short")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element __short;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("definition")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String definition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _definition;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String comment;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _comment;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("requirements")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String requirements;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirements")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _requirements;
    /**
     * Identifies additional names by which this element might also be known.
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("Identifies additional names by which this element might also be known.")
    private List<String> alias = new ArrayList<String>();
    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    @JsonPropertyDescription("Extensions for alias")
    private List<Element> _alias = new ArrayList<Element>();
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("min")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double min;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _min;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String max;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _max;
    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("base")
    @JsonPropertyDescription("Captures constraints on each element within the resource, profile, or extension.")
    private ElementDefinition_Base base;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("contentReference")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String contentReference;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentReference")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _contentReference;
    /**
     * The data type or resource that the value of this element is permitted to be.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The data type or resource that the value of this element is permitted to be.")
    private List<ElementDefinition_Type> type = new ArrayList<ElementDefinition_Type>();
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueBase64Binary")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueBase64Binary;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBase64Binary")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueBase64Binary;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueBoolean")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private Boolean defaultValueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueBoolean;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueCanonical")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueCanonical;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueCode")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueCode;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDate")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueDate;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDateTime")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueDateTime;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDecimal")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private Double defaultValueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueDecimal;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueId")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueId;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueInstant")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueInstant;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueInteger")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private Double defaultValueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueInteger;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueMarkdown")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueMarkdown;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueMarkdown")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueMarkdown;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueOid")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueOid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueOid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueOid;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValuePositiveInt")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private Double defaultValuePositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValuePositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValuePositiveInt;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueString")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueString;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueTime")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueTime;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUnsignedInt")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private Double defaultValueUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueUnsignedInt;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUri")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueUri;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUrl")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueUrl;
    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUuid")
    @JsonPropertyDescription("The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').")
    private String defaultValueUuid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUuid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueUuid;
    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("defaultValueAddress")
    @JsonPropertyDescription("An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.")
    private Address defaultValueAddress;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("defaultValueAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age defaultValueAge;
    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("defaultValueAnnotation")
    @JsonPropertyDescription("A  text note which also  contains information about who made the statement and when.")
    private Annotation defaultValueAnnotation;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("defaultValueAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment defaultValueAttachment;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("defaultValueCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept defaultValueCodeableConcept;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("defaultValueCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding defaultValueCoding;
    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("defaultValueContactPoint")
    @JsonPropertyDescription("Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.")
    private ContactPoint defaultValueContactPoint;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("defaultValueCount")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Count defaultValueCount;
    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("defaultValueDistance")
    @JsonPropertyDescription("A length - a value with a unit that is a physical distance.")
    private Distance defaultValueDistance;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("defaultValueDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration defaultValueDuration;
    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("defaultValueHumanName")
    @JsonPropertyDescription("A human's name with the ability to identify parts and usage.")
    private HumanName defaultValueHumanName;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("defaultValueIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier defaultValueIdentifier;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("defaultValueMoney")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money defaultValueMoney;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("defaultValuePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period defaultValuePeriod;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("defaultValueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity defaultValueQuantity;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("defaultValueRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range defaultValueRange;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("defaultValueRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio defaultValueRatio;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("defaultValueReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference defaultValueReference;
    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("defaultValueSampledData")
    @JsonPropertyDescription("A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.")
    private SampledData defaultValueSampledData;
    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("defaultValueSignature")
    @JsonPropertyDescription("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.")
    private Signature defaultValueSignature;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("defaultValueTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing defaultValueTiming;
    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("defaultValueContactDetail")
    @JsonPropertyDescription("Specifies contact information for a person or organization.")
    private ContactDetail defaultValueContactDetail;
    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("defaultValueContributor")
    @JsonPropertyDescription("A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.")
    private Contributor defaultValueContributor;
    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("defaultValueDataRequirement")
    @JsonPropertyDescription("Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.")
    private DataRequirement defaultValueDataRequirement;
    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("defaultValueExpression")
    @JsonPropertyDescription("A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.")
    private Expression defaultValueExpression;
    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("defaultValueParameterDefinition")
    @JsonPropertyDescription("The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.")
    private ParameterDefinition defaultValueParameterDefinition;
    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("defaultValueRelatedArtifact")
    @JsonPropertyDescription("Related artifacts such as additional documentation, justification, or bibliographic references.")
    private RelatedArtifact defaultValueRelatedArtifact;
    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("defaultValueTriggerDefinition")
    @JsonPropertyDescription("A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.")
    private TriggerDefinition defaultValueTriggerDefinition;
    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("defaultValueUsageContext")
    @JsonPropertyDescription("Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).")
    private UsageContext defaultValueUsageContext;
    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("defaultValueDosage")
    @JsonPropertyDescription("Indicates how the medication is/was taken or should be taken by the patient.")
    private Dosage defaultValueDosage;
    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("defaultValueMeta")
    @JsonPropertyDescription("The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.")
    private Meta defaultValueMeta;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("meaningWhenMissing")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String meaningWhenMissing;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_meaningWhenMissing")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _meaningWhenMissing;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("orderMeaning")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String orderMeaning;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orderMeaning")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _orderMeaning;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedBase64Binary")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedBase64Binary;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedBase64Binary")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedBase64Binary;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedBoolean")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private Boolean fixedBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedBoolean;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedCanonical")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedCanonical;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedCode")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedCode;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDate")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedDate;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDateTime")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedDateTime;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDecimal")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private Double fixedDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedDecimal;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedId")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedId;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedInstant")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedInstant;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedInteger")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private Double fixedInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedInteger;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedMarkdown")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedMarkdown;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedMarkdown")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedMarkdown;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedOid")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedOid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedOid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedOid;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedPositiveInt")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private Double fixedPositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedPositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedPositiveInt;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedString")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedString;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedTime")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedTime;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUnsignedInt")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private Double fixedUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedUnsignedInt;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUri")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedUri;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUrl")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedUrl;
    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUuid")
    @JsonPropertyDescription("Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.")
    private String fixedUuid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUuid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fixedUuid;
    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("fixedAddress")
    @JsonPropertyDescription("An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.")
    private Address fixedAddress;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("fixedAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age fixedAge;
    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("fixedAnnotation")
    @JsonPropertyDescription("A  text note which also  contains information about who made the statement and when.")
    private Annotation fixedAnnotation;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("fixedAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment fixedAttachment;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fixedCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept fixedCodeableConcept;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("fixedCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding fixedCoding;
    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("fixedContactPoint")
    @JsonPropertyDescription("Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.")
    private ContactPoint fixedContactPoint;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("fixedCount")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Count fixedCount;
    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("fixedDistance")
    @JsonPropertyDescription("A length - a value with a unit that is a physical distance.")
    private Distance fixedDistance;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("fixedDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration fixedDuration;
    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("fixedHumanName")
    @JsonPropertyDescription("A human's name with the ability to identify parts and usage.")
    private HumanName fixedHumanName;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("fixedIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier fixedIdentifier;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("fixedMoney")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money fixedMoney;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("fixedPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period fixedPeriod;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("fixedQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity fixedQuantity;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("fixedRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range fixedRange;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("fixedRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio fixedRatio;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("fixedReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference fixedReference;
    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("fixedSampledData")
    @JsonPropertyDescription("A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.")
    private SampledData fixedSampledData;
    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("fixedSignature")
    @JsonPropertyDescription("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.")
    private Signature fixedSignature;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("fixedTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing fixedTiming;
    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("fixedContactDetail")
    @JsonPropertyDescription("Specifies contact information for a person or organization.")
    private ContactDetail fixedContactDetail;
    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("fixedContributor")
    @JsonPropertyDescription("A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.")
    private Contributor fixedContributor;
    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("fixedDataRequirement")
    @JsonPropertyDescription("Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.")
    private DataRequirement fixedDataRequirement;
    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("fixedExpression")
    @JsonPropertyDescription("A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.")
    private Expression fixedExpression;
    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("fixedParameterDefinition")
    @JsonPropertyDescription("The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.")
    private ParameterDefinition fixedParameterDefinition;
    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("fixedRelatedArtifact")
    @JsonPropertyDescription("Related artifacts such as additional documentation, justification, or bibliographic references.")
    private RelatedArtifact fixedRelatedArtifact;
    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("fixedTriggerDefinition")
    @JsonPropertyDescription("A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.")
    private TriggerDefinition fixedTriggerDefinition;
    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("fixedUsageContext")
    @JsonPropertyDescription("Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).")
    private UsageContext fixedUsageContext;
    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("fixedDosage")
    @JsonPropertyDescription("Indicates how the medication is/was taken or should be taken by the patient.")
    private Dosage fixedDosage;
    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("fixedMeta")
    @JsonPropertyDescription("The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.")
    private Meta fixedMeta;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternBase64Binary")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternBase64Binary;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternBase64Binary")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternBase64Binary;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternBoolean")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private Boolean patternBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternBoolean;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternCanonical")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternCanonical;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternCode")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternCode;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDate")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternDate;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDateTime")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternDateTime;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDecimal")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private Double patternDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternDecimal;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternId")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternId;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternInstant")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternInstant;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternInteger")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private Double patternInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternInteger;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternMarkdown")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternMarkdown;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternMarkdown")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternMarkdown;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternOid")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternOid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternOid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternOid;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternPositiveInt")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private Double patternPositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternPositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternPositiveInt;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternString")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternString;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternTime")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternTime;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUnsignedInt")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private Double patternUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternUnsignedInt;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUri")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternUri;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUrl")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternUrl;
    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUuid")
    @JsonPropertyDescription("Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  \n\nWhen pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.\n\nWhen pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.\n\nWhen pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,\n\n1. If primitive: it must match exactly the pattern value\n2. If a complex object: it must match (recursively) the pattern value\n3. If an array: it must match (recursively) the pattern value.")
    private String patternUuid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUuid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patternUuid;
    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("patternAddress")
    @JsonPropertyDescription("An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.")
    private Address patternAddress;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("patternAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age patternAge;
    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("patternAnnotation")
    @JsonPropertyDescription("A  text note which also  contains information about who made the statement and when.")
    private Annotation patternAnnotation;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("patternAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment patternAttachment;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("patternCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept patternCodeableConcept;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("patternCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding patternCoding;
    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("patternContactPoint")
    @JsonPropertyDescription("Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.")
    private ContactPoint patternContactPoint;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("patternCount")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Count patternCount;
    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("patternDistance")
    @JsonPropertyDescription("A length - a value with a unit that is a physical distance.")
    private Distance patternDistance;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("patternDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration patternDuration;
    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("patternHumanName")
    @JsonPropertyDescription("A human's name with the ability to identify parts and usage.")
    private HumanName patternHumanName;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("patternIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier patternIdentifier;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("patternMoney")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money patternMoney;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("patternPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period patternPeriod;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("patternQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity patternQuantity;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("patternRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range patternRange;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("patternRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio patternRatio;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patternReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patternReference;
    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("patternSampledData")
    @JsonPropertyDescription("A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.")
    private SampledData patternSampledData;
    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("patternSignature")
    @JsonPropertyDescription("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.")
    private Signature patternSignature;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("patternTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing patternTiming;
    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("patternContactDetail")
    @JsonPropertyDescription("Specifies contact information for a person or organization.")
    private ContactDetail patternContactDetail;
    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("patternContributor")
    @JsonPropertyDescription("A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.")
    private Contributor patternContributor;
    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("patternDataRequirement")
    @JsonPropertyDescription("Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.")
    private DataRequirement patternDataRequirement;
    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("patternExpression")
    @JsonPropertyDescription("A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.")
    private Expression patternExpression;
    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("patternParameterDefinition")
    @JsonPropertyDescription("The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.")
    private ParameterDefinition patternParameterDefinition;
    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("patternRelatedArtifact")
    @JsonPropertyDescription("Related artifacts such as additional documentation, justification, or bibliographic references.")
    private RelatedArtifact patternRelatedArtifact;
    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("patternTriggerDefinition")
    @JsonPropertyDescription("A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.")
    private TriggerDefinition patternTriggerDefinition;
    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("patternUsageContext")
    @JsonPropertyDescription("Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).")
    private UsageContext patternUsageContext;
    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("patternDosage")
    @JsonPropertyDescription("Indicates how the medication is/was taken or should be taken by the patient.")
    private Dosage patternDosage;
    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("patternMeta")
    @JsonPropertyDescription("The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.")
    private Meta patternMeta;
    /**
     * A sample value for this element demonstrating the type of information that would typically be found in the element.
     * 
     */
    @JsonProperty("example")
    @JsonPropertyDescription("A sample value for this element demonstrating the type of information that would typically be found in the element.")
    private List<ElementDefinition_Example> example = new ArrayList<ElementDefinition_Example>();
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDate")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String minValueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValueDate;
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDateTime")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String minValueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValueDateTime;
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueInstant")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String minValueInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValueInstant;
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueTime")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String minValueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValueTime;
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDecimal")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double minValueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValueDecimal;
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueInteger")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double minValueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValueInteger;
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValuePositiveInt")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double minValuePositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValuePositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValuePositiveInt;
    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueUnsignedInt")
    @JsonPropertyDescription("The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double minValueUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _minValueUnsignedInt;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("minValueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity minValueQuantity;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDate")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String maxValueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValueDate;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDateTime")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String maxValueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValueDateTime;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueInstant")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String maxValueInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValueInstant;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueTime")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private String maxValueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValueTime;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDecimal")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double maxValueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValueDecimal;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueInteger")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double maxValueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValueInteger;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValuePositiveInt")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double maxValuePositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValuePositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValuePositiveInt;
    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueUnsignedInt")
    @JsonPropertyDescription("The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.")
    private Double maxValueUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxValueUnsignedInt;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxValueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity maxValueQuantity;
    /**
     * A whole number
     * 
     */
    @JsonProperty("maxLength")
    @JsonPropertyDescription("A whole number")
    private Double maxLength;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxLength")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _maxLength;
    /**
     * A reference to an invariant that may make additional statements about the cardinality or value in the instance.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("A reference to an invariant that may make additional statements about the cardinality or value in the instance.")
    private List<String> condition = new ArrayList<String>();
    /**
     * Extensions for condition
     * 
     */
    @JsonProperty("_condition")
    @JsonPropertyDescription("Extensions for condition")
    private List<Element> _condition = new ArrayList<Element>();
    /**
     * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
     * 
     */
    @JsonProperty("constraint")
    @JsonPropertyDescription("Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.")
    private List<ElementDefinition_Constraint> constraint = new ArrayList<ElementDefinition_Constraint>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("mustSupport")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean mustSupport;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mustSupport")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _mustSupport;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isModifier")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean isModifier;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isModifier")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isModifier;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("isModifierReason")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String isModifierReason;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isModifierReason")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isModifierReason;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isSummary")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean isSummary;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isSummary")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _isSummary;
    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("binding")
    @JsonPropertyDescription("Captures constraints on each element within the resource, profile, or extension.")
    private ElementDefinition_Binding binding;
    /**
     * Identifies a concept from an external specification that roughly corresponds to this element.
     * 
     */
    @JsonProperty("mapping")
    @JsonPropertyDescription("Identifies a concept from an external specification that roughly corresponds to this element.")
    private List<ElementDefinition_Mapping> mapping = new ArrayList<ElementDefinition_Mapping>();

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
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public Element get_path() {
        return _path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public void set_path(Element _path) {
        this._path = _path;
    }

    /**
     * Codes that define how this element is represented in instances, when the deviation varies from the normal case.
     * 
     */
    @JsonProperty("representation")
    public List<Representation> getRepresentation() {
        return representation;
    }

    /**
     * Codes that define how this element is represented in instances, when the deviation varies from the normal case.
     * 
     */
    @JsonProperty("representation")
    public void setRepresentation(List<Representation> representation) {
        this.representation = representation;
    }

    /**
     * Extensions for representation
     * 
     */
    @JsonProperty("_representation")
    public List<Element> get_representation() {
        return _representation;
    }

    /**
     * Extensions for representation
     * 
     */
    @JsonProperty("_representation")
    public void set_representation(List<Element> _representation) {
        this._representation = _representation;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sliceName")
    public String getSliceName() {
        return sliceName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sliceName")
    public void setSliceName(String sliceName) {
        this.sliceName = sliceName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceName")
    public Element get_sliceName() {
        return _sliceName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceName")
    public void set_sliceName(Element _sliceName) {
        this._sliceName = _sliceName;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("sliceIsConstraining")
    public Boolean getSliceIsConstraining() {
        return sliceIsConstraining;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("sliceIsConstraining")
    public void setSliceIsConstraining(Boolean sliceIsConstraining) {
        this.sliceIsConstraining = sliceIsConstraining;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceIsConstraining")
    public Element get_sliceIsConstraining() {
        return _sliceIsConstraining;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceIsConstraining")
    public void set_sliceIsConstraining(Element _sliceIsConstraining) {
        this._sliceIsConstraining = _sliceIsConstraining;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    public Element get_label() {
        return _label;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    public void set_label(Element _label) {
        this._label = _label;
    }

    /**
     * A code that has the same meaning as the element in a particular terminology.
     * 
     */
    @JsonProperty("code")
    public List<Coding> getCode() {
        return code;
    }

    /**
     * A code that has the same meaning as the element in a particular terminology.
     * 
     */
    @JsonProperty("code")
    public void setCode(List<Coding> code) {
        this.code = code;
    }

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("slicing")
    public ElementDefinition_Slicing getSlicing() {
        return slicing;
    }

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("slicing")
    public void setSlicing(ElementDefinition_Slicing slicing) {
        this.slicing = slicing;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("short")
    public String getShort() {
        return _short;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("short")
    public void setShort(String _short) {
        this._short = _short;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_short")
    public Element get_short() {
        return __short;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_short")
    public void set_short(Element __short) {
        this.__short = __short;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definition")
    public Element get_definition() {
        return _definition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definition")
    public void set_definition(Element _definition) {
        this._definition = _definition;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public Element get_comment() {
        return _comment;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comment")
    public void set_comment(Element _comment) {
        this._comment = _comment;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("requirements")
    public String getRequirements() {
        return requirements;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("requirements")
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirements")
    public Element get_requirements() {
        return _requirements;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_requirements")
    public void set_requirements(Element _requirements) {
        this._requirements = _requirements;
    }

    /**
     * Identifies additional names by which this element might also be known.
     * 
     */
    @JsonProperty("alias")
    public List<String> getAlias() {
        return alias;
    }

    /**
     * Identifies additional names by which this element might also be known.
     * 
     */
    @JsonProperty("alias")
    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public List<Element> get_alias() {
        return _alias;
    }

    /**
     * Extensions for alias
     * 
     */
    @JsonProperty("_alias")
    public void set_alias(List<Element> _alias) {
        this._alias = _alias;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public Element get_min() {
        return _min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public void set_min(Element _min) {
        this._min = _min;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public Element get_max() {
        return _max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public void set_max(Element _max) {
        this._max = _max;
    }

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("base")
    public ElementDefinition_Base getBase() {
        return base;
    }

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("base")
    public void setBase(ElementDefinition_Base base) {
        this.base = base;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("contentReference")
    public String getContentReference() {
        return contentReference;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("contentReference")
    public void setContentReference(String contentReference) {
        this.contentReference = contentReference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentReference")
    public Element get_contentReference() {
        return _contentReference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentReference")
    public void set_contentReference(Element _contentReference) {
        this._contentReference = _contentReference;
    }

    /**
     * The data type or resource that the value of this element is permitted to be.
     * 
     */
    @JsonProperty("type")
    public List<ElementDefinition_Type> getType() {
        return type;
    }

    /**
     * The data type or resource that the value of this element is permitted to be.
     * 
     */
    @JsonProperty("type")
    public void setType(List<ElementDefinition_Type> type) {
        this.type = type;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueBase64Binary")
    public String getDefaultValueBase64Binary() {
        return defaultValueBase64Binary;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueBase64Binary")
    public void setDefaultValueBase64Binary(String defaultValueBase64Binary) {
        this.defaultValueBase64Binary = defaultValueBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBase64Binary")
    public Element get_defaultValueBase64Binary() {
        return _defaultValueBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBase64Binary")
    public void set_defaultValueBase64Binary(Element _defaultValueBase64Binary) {
        this._defaultValueBase64Binary = _defaultValueBase64Binary;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueBoolean")
    public Boolean getDefaultValueBoolean() {
        return defaultValueBoolean;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueBoolean")
    public void setDefaultValueBoolean(Boolean defaultValueBoolean) {
        this.defaultValueBoolean = defaultValueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBoolean")
    public Element get_defaultValueBoolean() {
        return _defaultValueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBoolean")
    public void set_defaultValueBoolean(Element _defaultValueBoolean) {
        this._defaultValueBoolean = _defaultValueBoolean;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueCanonical")
    public String getDefaultValueCanonical() {
        return defaultValueCanonical;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueCanonical")
    public void setDefaultValueCanonical(String defaultValueCanonical) {
        this.defaultValueCanonical = defaultValueCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCanonical")
    public Element get_defaultValueCanonical() {
        return _defaultValueCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCanonical")
    public void set_defaultValueCanonical(Element _defaultValueCanonical) {
        this._defaultValueCanonical = _defaultValueCanonical;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueCode")
    public String getDefaultValueCode() {
        return defaultValueCode;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueCode")
    public void setDefaultValueCode(String defaultValueCode) {
        this.defaultValueCode = defaultValueCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCode")
    public Element get_defaultValueCode() {
        return _defaultValueCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCode")
    public void set_defaultValueCode(Element _defaultValueCode) {
        this._defaultValueCode = _defaultValueCode;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDate")
    public String getDefaultValueDate() {
        return defaultValueDate;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDate")
    public void setDefaultValueDate(String defaultValueDate) {
        this.defaultValueDate = defaultValueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDate")
    public Element get_defaultValueDate() {
        return _defaultValueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDate")
    public void set_defaultValueDate(Element _defaultValueDate) {
        this._defaultValueDate = _defaultValueDate;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDateTime")
    public String getDefaultValueDateTime() {
        return defaultValueDateTime;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDateTime")
    public void setDefaultValueDateTime(String defaultValueDateTime) {
        this.defaultValueDateTime = defaultValueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDateTime")
    public Element get_defaultValueDateTime() {
        return _defaultValueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDateTime")
    public void set_defaultValueDateTime(Element _defaultValueDateTime) {
        this._defaultValueDateTime = _defaultValueDateTime;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDecimal")
    public Double getDefaultValueDecimal() {
        return defaultValueDecimal;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueDecimal")
    public void setDefaultValueDecimal(Double defaultValueDecimal) {
        this.defaultValueDecimal = defaultValueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDecimal")
    public Element get_defaultValueDecimal() {
        return _defaultValueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDecimal")
    public void set_defaultValueDecimal(Element _defaultValueDecimal) {
        this._defaultValueDecimal = _defaultValueDecimal;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueId")
    public String getDefaultValueId() {
        return defaultValueId;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueId")
    public void setDefaultValueId(String defaultValueId) {
        this.defaultValueId = defaultValueId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueId")
    public Element get_defaultValueId() {
        return _defaultValueId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueId")
    public void set_defaultValueId(Element _defaultValueId) {
        this._defaultValueId = _defaultValueId;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueInstant")
    public String getDefaultValueInstant() {
        return defaultValueInstant;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueInstant")
    public void setDefaultValueInstant(String defaultValueInstant) {
        this.defaultValueInstant = defaultValueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInstant")
    public Element get_defaultValueInstant() {
        return _defaultValueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInstant")
    public void set_defaultValueInstant(Element _defaultValueInstant) {
        this._defaultValueInstant = _defaultValueInstant;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueInteger")
    public Double getDefaultValueInteger() {
        return defaultValueInteger;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueInteger")
    public void setDefaultValueInteger(Double defaultValueInteger) {
        this.defaultValueInteger = defaultValueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInteger")
    public Element get_defaultValueInteger() {
        return _defaultValueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInteger")
    public void set_defaultValueInteger(Element _defaultValueInteger) {
        this._defaultValueInteger = _defaultValueInteger;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueMarkdown")
    public String getDefaultValueMarkdown() {
        return defaultValueMarkdown;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueMarkdown")
    public void setDefaultValueMarkdown(String defaultValueMarkdown) {
        this.defaultValueMarkdown = defaultValueMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueMarkdown")
    public Element get_defaultValueMarkdown() {
        return _defaultValueMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueMarkdown")
    public void set_defaultValueMarkdown(Element _defaultValueMarkdown) {
        this._defaultValueMarkdown = _defaultValueMarkdown;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueOid")
    public String getDefaultValueOid() {
        return defaultValueOid;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueOid")
    public void setDefaultValueOid(String defaultValueOid) {
        this.defaultValueOid = defaultValueOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueOid")
    public Element get_defaultValueOid() {
        return _defaultValueOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueOid")
    public void set_defaultValueOid(Element _defaultValueOid) {
        this._defaultValueOid = _defaultValueOid;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValuePositiveInt")
    public Double getDefaultValuePositiveInt() {
        return defaultValuePositiveInt;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValuePositiveInt")
    public void setDefaultValuePositiveInt(Double defaultValuePositiveInt) {
        this.defaultValuePositiveInt = defaultValuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValuePositiveInt")
    public Element get_defaultValuePositiveInt() {
        return _defaultValuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValuePositiveInt")
    public void set_defaultValuePositiveInt(Element _defaultValuePositiveInt) {
        this._defaultValuePositiveInt = _defaultValuePositiveInt;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueString")
    public String getDefaultValueString() {
        return defaultValueString;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueString")
    public void setDefaultValueString(String defaultValueString) {
        this.defaultValueString = defaultValueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueString")
    public Element get_defaultValueString() {
        return _defaultValueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueString")
    public void set_defaultValueString(Element _defaultValueString) {
        this._defaultValueString = _defaultValueString;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueTime")
    public String getDefaultValueTime() {
        return defaultValueTime;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueTime")
    public void setDefaultValueTime(String defaultValueTime) {
        this.defaultValueTime = defaultValueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueTime")
    public Element get_defaultValueTime() {
        return _defaultValueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueTime")
    public void set_defaultValueTime(Element _defaultValueTime) {
        this._defaultValueTime = _defaultValueTime;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUnsignedInt")
    public Double getDefaultValueUnsignedInt() {
        return defaultValueUnsignedInt;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUnsignedInt")
    public void setDefaultValueUnsignedInt(Double defaultValueUnsignedInt) {
        this.defaultValueUnsignedInt = defaultValueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUnsignedInt")
    public Element get_defaultValueUnsignedInt() {
        return _defaultValueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUnsignedInt")
    public void set_defaultValueUnsignedInt(Element _defaultValueUnsignedInt) {
        this._defaultValueUnsignedInt = _defaultValueUnsignedInt;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUri")
    public String getDefaultValueUri() {
        return defaultValueUri;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUri")
    public void setDefaultValueUri(String defaultValueUri) {
        this.defaultValueUri = defaultValueUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUri")
    public Element get_defaultValueUri() {
        return _defaultValueUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUri")
    public void set_defaultValueUri(Element _defaultValueUri) {
        this._defaultValueUri = _defaultValueUri;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUrl")
    public String getDefaultValueUrl() {
        return defaultValueUrl;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUrl")
    public void setDefaultValueUrl(String defaultValueUrl) {
        this.defaultValueUrl = defaultValueUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUrl")
    public Element get_defaultValueUrl() {
        return _defaultValueUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUrl")
    public void set_defaultValueUrl(Element _defaultValueUrl) {
        this._defaultValueUrl = _defaultValueUrl;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUuid")
    public String getDefaultValueUuid() {
        return defaultValueUuid;
    }

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     * 
     */
    @JsonProperty("defaultValueUuid")
    public void setDefaultValueUuid(String defaultValueUuid) {
        this.defaultValueUuid = defaultValueUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUuid")
    public Element get_defaultValueUuid() {
        return _defaultValueUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUuid")
    public void set_defaultValueUuid(Element _defaultValueUuid) {
        this._defaultValueUuid = _defaultValueUuid;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("defaultValueAddress")
    public Address getDefaultValueAddress() {
        return defaultValueAddress;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("defaultValueAddress")
    public void setDefaultValueAddress(Address defaultValueAddress) {
        this.defaultValueAddress = defaultValueAddress;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("defaultValueAge")
    public Age getDefaultValueAge() {
        return defaultValueAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("defaultValueAge")
    public void setDefaultValueAge(Age defaultValueAge) {
        this.defaultValueAge = defaultValueAge;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("defaultValueAnnotation")
    public Annotation getDefaultValueAnnotation() {
        return defaultValueAnnotation;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("defaultValueAnnotation")
    public void setDefaultValueAnnotation(Annotation defaultValueAnnotation) {
        this.defaultValueAnnotation = defaultValueAnnotation;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("defaultValueAttachment")
    public Attachment getDefaultValueAttachment() {
        return defaultValueAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("defaultValueAttachment")
    public void setDefaultValueAttachment(Attachment defaultValueAttachment) {
        this.defaultValueAttachment = defaultValueAttachment;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("defaultValueCodeableConcept")
    public CodeableConcept getDefaultValueCodeableConcept() {
        return defaultValueCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("defaultValueCodeableConcept")
    public void setDefaultValueCodeableConcept(CodeableConcept defaultValueCodeableConcept) {
        this.defaultValueCodeableConcept = defaultValueCodeableConcept;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("defaultValueCoding")
    public Coding getDefaultValueCoding() {
        return defaultValueCoding;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("defaultValueCoding")
    public void setDefaultValueCoding(Coding defaultValueCoding) {
        this.defaultValueCoding = defaultValueCoding;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("defaultValueContactPoint")
    public ContactPoint getDefaultValueContactPoint() {
        return defaultValueContactPoint;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("defaultValueContactPoint")
    public void setDefaultValueContactPoint(ContactPoint defaultValueContactPoint) {
        this.defaultValueContactPoint = defaultValueContactPoint;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("defaultValueCount")
    public Count getDefaultValueCount() {
        return defaultValueCount;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("defaultValueCount")
    public void setDefaultValueCount(Count defaultValueCount) {
        this.defaultValueCount = defaultValueCount;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("defaultValueDistance")
    public Distance getDefaultValueDistance() {
        return defaultValueDistance;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("defaultValueDistance")
    public void setDefaultValueDistance(Distance defaultValueDistance) {
        this.defaultValueDistance = defaultValueDistance;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("defaultValueDuration")
    public Duration getDefaultValueDuration() {
        return defaultValueDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("defaultValueDuration")
    public void setDefaultValueDuration(Duration defaultValueDuration) {
        this.defaultValueDuration = defaultValueDuration;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("defaultValueHumanName")
    public HumanName getDefaultValueHumanName() {
        return defaultValueHumanName;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("defaultValueHumanName")
    public void setDefaultValueHumanName(HumanName defaultValueHumanName) {
        this.defaultValueHumanName = defaultValueHumanName;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("defaultValueIdentifier")
    public Identifier getDefaultValueIdentifier() {
        return defaultValueIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("defaultValueIdentifier")
    public void setDefaultValueIdentifier(Identifier defaultValueIdentifier) {
        this.defaultValueIdentifier = defaultValueIdentifier;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("defaultValueMoney")
    public Money getDefaultValueMoney() {
        return defaultValueMoney;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("defaultValueMoney")
    public void setDefaultValueMoney(Money defaultValueMoney) {
        this.defaultValueMoney = defaultValueMoney;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("defaultValuePeriod")
    public Period getDefaultValuePeriod() {
        return defaultValuePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("defaultValuePeriod")
    public void setDefaultValuePeriod(Period defaultValuePeriod) {
        this.defaultValuePeriod = defaultValuePeriod;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("defaultValueQuantity")
    public Quantity getDefaultValueQuantity() {
        return defaultValueQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("defaultValueQuantity")
    public void setDefaultValueQuantity(Quantity defaultValueQuantity) {
        this.defaultValueQuantity = defaultValueQuantity;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("defaultValueRange")
    public Range getDefaultValueRange() {
        return defaultValueRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("defaultValueRange")
    public void setDefaultValueRange(Range defaultValueRange) {
        this.defaultValueRange = defaultValueRange;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("defaultValueRatio")
    public Ratio getDefaultValueRatio() {
        return defaultValueRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("defaultValueRatio")
    public void setDefaultValueRatio(Ratio defaultValueRatio) {
        this.defaultValueRatio = defaultValueRatio;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("defaultValueReference")
    public Reference getDefaultValueReference() {
        return defaultValueReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("defaultValueReference")
    public void setDefaultValueReference(Reference defaultValueReference) {
        this.defaultValueReference = defaultValueReference;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("defaultValueSampledData")
    public SampledData getDefaultValueSampledData() {
        return defaultValueSampledData;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("defaultValueSampledData")
    public void setDefaultValueSampledData(SampledData defaultValueSampledData) {
        this.defaultValueSampledData = defaultValueSampledData;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("defaultValueSignature")
    public Signature getDefaultValueSignature() {
        return defaultValueSignature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("defaultValueSignature")
    public void setDefaultValueSignature(Signature defaultValueSignature) {
        this.defaultValueSignature = defaultValueSignature;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("defaultValueTiming")
    public Timing getDefaultValueTiming() {
        return defaultValueTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("defaultValueTiming")
    public void setDefaultValueTiming(Timing defaultValueTiming) {
        this.defaultValueTiming = defaultValueTiming;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("defaultValueContactDetail")
    public ContactDetail getDefaultValueContactDetail() {
        return defaultValueContactDetail;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("defaultValueContactDetail")
    public void setDefaultValueContactDetail(ContactDetail defaultValueContactDetail) {
        this.defaultValueContactDetail = defaultValueContactDetail;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("defaultValueContributor")
    public Contributor getDefaultValueContributor() {
        return defaultValueContributor;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("defaultValueContributor")
    public void setDefaultValueContributor(Contributor defaultValueContributor) {
        this.defaultValueContributor = defaultValueContributor;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("defaultValueDataRequirement")
    public DataRequirement getDefaultValueDataRequirement() {
        return defaultValueDataRequirement;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("defaultValueDataRequirement")
    public void setDefaultValueDataRequirement(DataRequirement defaultValueDataRequirement) {
        this.defaultValueDataRequirement = defaultValueDataRequirement;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("defaultValueExpression")
    public Expression getDefaultValueExpression() {
        return defaultValueExpression;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("defaultValueExpression")
    public void setDefaultValueExpression(Expression defaultValueExpression) {
        this.defaultValueExpression = defaultValueExpression;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("defaultValueParameterDefinition")
    public ParameterDefinition getDefaultValueParameterDefinition() {
        return defaultValueParameterDefinition;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("defaultValueParameterDefinition")
    public void setDefaultValueParameterDefinition(ParameterDefinition defaultValueParameterDefinition) {
        this.defaultValueParameterDefinition = defaultValueParameterDefinition;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("defaultValueRelatedArtifact")
    public RelatedArtifact getDefaultValueRelatedArtifact() {
        return defaultValueRelatedArtifact;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("defaultValueRelatedArtifact")
    public void setDefaultValueRelatedArtifact(RelatedArtifact defaultValueRelatedArtifact) {
        this.defaultValueRelatedArtifact = defaultValueRelatedArtifact;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("defaultValueTriggerDefinition")
    public TriggerDefinition getDefaultValueTriggerDefinition() {
        return defaultValueTriggerDefinition;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("defaultValueTriggerDefinition")
    public void setDefaultValueTriggerDefinition(TriggerDefinition defaultValueTriggerDefinition) {
        this.defaultValueTriggerDefinition = defaultValueTriggerDefinition;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("defaultValueUsageContext")
    public UsageContext getDefaultValueUsageContext() {
        return defaultValueUsageContext;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("defaultValueUsageContext")
    public void setDefaultValueUsageContext(UsageContext defaultValueUsageContext) {
        this.defaultValueUsageContext = defaultValueUsageContext;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("defaultValueDosage")
    public Dosage getDefaultValueDosage() {
        return defaultValueDosage;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("defaultValueDosage")
    public void setDefaultValueDosage(Dosage defaultValueDosage) {
        this.defaultValueDosage = defaultValueDosage;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("defaultValueMeta")
    public Meta getDefaultValueMeta() {
        return defaultValueMeta;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("defaultValueMeta")
    public void setDefaultValueMeta(Meta defaultValueMeta) {
        this.defaultValueMeta = defaultValueMeta;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("meaningWhenMissing")
    public String getMeaningWhenMissing() {
        return meaningWhenMissing;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("meaningWhenMissing")
    public void setMeaningWhenMissing(String meaningWhenMissing) {
        this.meaningWhenMissing = meaningWhenMissing;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_meaningWhenMissing")
    public Element get_meaningWhenMissing() {
        return _meaningWhenMissing;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_meaningWhenMissing")
    public void set_meaningWhenMissing(Element _meaningWhenMissing) {
        this._meaningWhenMissing = _meaningWhenMissing;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("orderMeaning")
    public String getOrderMeaning() {
        return orderMeaning;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("orderMeaning")
    public void setOrderMeaning(String orderMeaning) {
        this.orderMeaning = orderMeaning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orderMeaning")
    public Element get_orderMeaning() {
        return _orderMeaning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orderMeaning")
    public void set_orderMeaning(Element _orderMeaning) {
        this._orderMeaning = _orderMeaning;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedBase64Binary")
    public String getFixedBase64Binary() {
        return fixedBase64Binary;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedBase64Binary")
    public void setFixedBase64Binary(String fixedBase64Binary) {
        this.fixedBase64Binary = fixedBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedBase64Binary")
    public Element get_fixedBase64Binary() {
        return _fixedBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedBase64Binary")
    public void set_fixedBase64Binary(Element _fixedBase64Binary) {
        this._fixedBase64Binary = _fixedBase64Binary;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedBoolean")
    public Boolean getFixedBoolean() {
        return fixedBoolean;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedBoolean")
    public void setFixedBoolean(Boolean fixedBoolean) {
        this.fixedBoolean = fixedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedBoolean")
    public Element get_fixedBoolean() {
        return _fixedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedBoolean")
    public void set_fixedBoolean(Element _fixedBoolean) {
        this._fixedBoolean = _fixedBoolean;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedCanonical")
    public String getFixedCanonical() {
        return fixedCanonical;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedCanonical")
    public void setFixedCanonical(String fixedCanonical) {
        this.fixedCanonical = fixedCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedCanonical")
    public Element get_fixedCanonical() {
        return _fixedCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedCanonical")
    public void set_fixedCanonical(Element _fixedCanonical) {
        this._fixedCanonical = _fixedCanonical;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedCode")
    public String getFixedCode() {
        return fixedCode;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedCode")
    public void setFixedCode(String fixedCode) {
        this.fixedCode = fixedCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedCode")
    public Element get_fixedCode() {
        return _fixedCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedCode")
    public void set_fixedCode(Element _fixedCode) {
        this._fixedCode = _fixedCode;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDate")
    public String getFixedDate() {
        return fixedDate;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDate")
    public void setFixedDate(String fixedDate) {
        this.fixedDate = fixedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDate")
    public Element get_fixedDate() {
        return _fixedDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDate")
    public void set_fixedDate(Element _fixedDate) {
        this._fixedDate = _fixedDate;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDateTime")
    public String getFixedDateTime() {
        return fixedDateTime;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDateTime")
    public void setFixedDateTime(String fixedDateTime) {
        this.fixedDateTime = fixedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDateTime")
    public Element get_fixedDateTime() {
        return _fixedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDateTime")
    public void set_fixedDateTime(Element _fixedDateTime) {
        this._fixedDateTime = _fixedDateTime;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDecimal")
    public Double getFixedDecimal() {
        return fixedDecimal;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedDecimal")
    public void setFixedDecimal(Double fixedDecimal) {
        this.fixedDecimal = fixedDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDecimal")
    public Element get_fixedDecimal() {
        return _fixedDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedDecimal")
    public void set_fixedDecimal(Element _fixedDecimal) {
        this._fixedDecimal = _fixedDecimal;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedId")
    public String getFixedId() {
        return fixedId;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedId")
    public void setFixedId(String fixedId) {
        this.fixedId = fixedId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedId")
    public Element get_fixedId() {
        return _fixedId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedId")
    public void set_fixedId(Element _fixedId) {
        this._fixedId = _fixedId;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedInstant")
    public String getFixedInstant() {
        return fixedInstant;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedInstant")
    public void setFixedInstant(String fixedInstant) {
        this.fixedInstant = fixedInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedInstant")
    public Element get_fixedInstant() {
        return _fixedInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedInstant")
    public void set_fixedInstant(Element _fixedInstant) {
        this._fixedInstant = _fixedInstant;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedInteger")
    public Double getFixedInteger() {
        return fixedInteger;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedInteger")
    public void setFixedInteger(Double fixedInteger) {
        this.fixedInteger = fixedInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedInteger")
    public Element get_fixedInteger() {
        return _fixedInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedInteger")
    public void set_fixedInteger(Element _fixedInteger) {
        this._fixedInteger = _fixedInteger;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedMarkdown")
    public String getFixedMarkdown() {
        return fixedMarkdown;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedMarkdown")
    public void setFixedMarkdown(String fixedMarkdown) {
        this.fixedMarkdown = fixedMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedMarkdown")
    public Element get_fixedMarkdown() {
        return _fixedMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedMarkdown")
    public void set_fixedMarkdown(Element _fixedMarkdown) {
        this._fixedMarkdown = _fixedMarkdown;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedOid")
    public String getFixedOid() {
        return fixedOid;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedOid")
    public void setFixedOid(String fixedOid) {
        this.fixedOid = fixedOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedOid")
    public Element get_fixedOid() {
        return _fixedOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedOid")
    public void set_fixedOid(Element _fixedOid) {
        this._fixedOid = _fixedOid;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedPositiveInt")
    public Double getFixedPositiveInt() {
        return fixedPositiveInt;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedPositiveInt")
    public void setFixedPositiveInt(Double fixedPositiveInt) {
        this.fixedPositiveInt = fixedPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedPositiveInt")
    public Element get_fixedPositiveInt() {
        return _fixedPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedPositiveInt")
    public void set_fixedPositiveInt(Element _fixedPositiveInt) {
        this._fixedPositiveInt = _fixedPositiveInt;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedString")
    public String getFixedString() {
        return fixedString;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedString")
    public void setFixedString(String fixedString) {
        this.fixedString = fixedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedString")
    public Element get_fixedString() {
        return _fixedString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedString")
    public void set_fixedString(Element _fixedString) {
        this._fixedString = _fixedString;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedTime")
    public String getFixedTime() {
        return fixedTime;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedTime")
    public void setFixedTime(String fixedTime) {
        this.fixedTime = fixedTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedTime")
    public Element get_fixedTime() {
        return _fixedTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedTime")
    public void set_fixedTime(Element _fixedTime) {
        this._fixedTime = _fixedTime;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUnsignedInt")
    public Double getFixedUnsignedInt() {
        return fixedUnsignedInt;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUnsignedInt")
    public void setFixedUnsignedInt(Double fixedUnsignedInt) {
        this.fixedUnsignedInt = fixedUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUnsignedInt")
    public Element get_fixedUnsignedInt() {
        return _fixedUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUnsignedInt")
    public void set_fixedUnsignedInt(Element _fixedUnsignedInt) {
        this._fixedUnsignedInt = _fixedUnsignedInt;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUri")
    public String getFixedUri() {
        return fixedUri;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUri")
    public void setFixedUri(String fixedUri) {
        this.fixedUri = fixedUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUri")
    public Element get_fixedUri() {
        return _fixedUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUri")
    public void set_fixedUri(Element _fixedUri) {
        this._fixedUri = _fixedUri;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUrl")
    public String getFixedUrl() {
        return fixedUrl;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUrl")
    public void setFixedUrl(String fixedUrl) {
        this.fixedUrl = fixedUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUrl")
    public Element get_fixedUrl() {
        return _fixedUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUrl")
    public void set_fixedUrl(Element _fixedUrl) {
        this._fixedUrl = _fixedUrl;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUuid")
    public String getFixedUuid() {
        return fixedUuid;
    }

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     * 
     */
    @JsonProperty("fixedUuid")
    public void setFixedUuid(String fixedUuid) {
        this.fixedUuid = fixedUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUuid")
    public Element get_fixedUuid() {
        return _fixedUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fixedUuid")
    public void set_fixedUuid(Element _fixedUuid) {
        this._fixedUuid = _fixedUuid;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("fixedAddress")
    public Address getFixedAddress() {
        return fixedAddress;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("fixedAddress")
    public void setFixedAddress(Address fixedAddress) {
        this.fixedAddress = fixedAddress;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("fixedAge")
    public Age getFixedAge() {
        return fixedAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("fixedAge")
    public void setFixedAge(Age fixedAge) {
        this.fixedAge = fixedAge;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("fixedAnnotation")
    public Annotation getFixedAnnotation() {
        return fixedAnnotation;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("fixedAnnotation")
    public void setFixedAnnotation(Annotation fixedAnnotation) {
        this.fixedAnnotation = fixedAnnotation;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("fixedAttachment")
    public Attachment getFixedAttachment() {
        return fixedAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("fixedAttachment")
    public void setFixedAttachment(Attachment fixedAttachment) {
        this.fixedAttachment = fixedAttachment;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fixedCodeableConcept")
    public CodeableConcept getFixedCodeableConcept() {
        return fixedCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("fixedCodeableConcept")
    public void setFixedCodeableConcept(CodeableConcept fixedCodeableConcept) {
        this.fixedCodeableConcept = fixedCodeableConcept;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("fixedCoding")
    public Coding getFixedCoding() {
        return fixedCoding;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("fixedCoding")
    public void setFixedCoding(Coding fixedCoding) {
        this.fixedCoding = fixedCoding;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("fixedContactPoint")
    public ContactPoint getFixedContactPoint() {
        return fixedContactPoint;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("fixedContactPoint")
    public void setFixedContactPoint(ContactPoint fixedContactPoint) {
        this.fixedContactPoint = fixedContactPoint;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("fixedCount")
    public Count getFixedCount() {
        return fixedCount;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("fixedCount")
    public void setFixedCount(Count fixedCount) {
        this.fixedCount = fixedCount;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("fixedDistance")
    public Distance getFixedDistance() {
        return fixedDistance;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("fixedDistance")
    public void setFixedDistance(Distance fixedDistance) {
        this.fixedDistance = fixedDistance;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("fixedDuration")
    public Duration getFixedDuration() {
        return fixedDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("fixedDuration")
    public void setFixedDuration(Duration fixedDuration) {
        this.fixedDuration = fixedDuration;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("fixedHumanName")
    public HumanName getFixedHumanName() {
        return fixedHumanName;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("fixedHumanName")
    public void setFixedHumanName(HumanName fixedHumanName) {
        this.fixedHumanName = fixedHumanName;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("fixedIdentifier")
    public Identifier getFixedIdentifier() {
        return fixedIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("fixedIdentifier")
    public void setFixedIdentifier(Identifier fixedIdentifier) {
        this.fixedIdentifier = fixedIdentifier;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("fixedMoney")
    public Money getFixedMoney() {
        return fixedMoney;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("fixedMoney")
    public void setFixedMoney(Money fixedMoney) {
        this.fixedMoney = fixedMoney;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("fixedPeriod")
    public Period getFixedPeriod() {
        return fixedPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("fixedPeriod")
    public void setFixedPeriod(Period fixedPeriod) {
        this.fixedPeriod = fixedPeriod;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("fixedQuantity")
    public Quantity getFixedQuantity() {
        return fixedQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("fixedQuantity")
    public void setFixedQuantity(Quantity fixedQuantity) {
        this.fixedQuantity = fixedQuantity;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("fixedRange")
    public Range getFixedRange() {
        return fixedRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("fixedRange")
    public void setFixedRange(Range fixedRange) {
        this.fixedRange = fixedRange;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("fixedRatio")
    public Ratio getFixedRatio() {
        return fixedRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("fixedRatio")
    public void setFixedRatio(Ratio fixedRatio) {
        this.fixedRatio = fixedRatio;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("fixedReference")
    public Reference getFixedReference() {
        return fixedReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("fixedReference")
    public void setFixedReference(Reference fixedReference) {
        this.fixedReference = fixedReference;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("fixedSampledData")
    public SampledData getFixedSampledData() {
        return fixedSampledData;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("fixedSampledData")
    public void setFixedSampledData(SampledData fixedSampledData) {
        this.fixedSampledData = fixedSampledData;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("fixedSignature")
    public Signature getFixedSignature() {
        return fixedSignature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("fixedSignature")
    public void setFixedSignature(Signature fixedSignature) {
        this.fixedSignature = fixedSignature;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("fixedTiming")
    public Timing getFixedTiming() {
        return fixedTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("fixedTiming")
    public void setFixedTiming(Timing fixedTiming) {
        this.fixedTiming = fixedTiming;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("fixedContactDetail")
    public ContactDetail getFixedContactDetail() {
        return fixedContactDetail;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("fixedContactDetail")
    public void setFixedContactDetail(ContactDetail fixedContactDetail) {
        this.fixedContactDetail = fixedContactDetail;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("fixedContributor")
    public Contributor getFixedContributor() {
        return fixedContributor;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("fixedContributor")
    public void setFixedContributor(Contributor fixedContributor) {
        this.fixedContributor = fixedContributor;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("fixedDataRequirement")
    public DataRequirement getFixedDataRequirement() {
        return fixedDataRequirement;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("fixedDataRequirement")
    public void setFixedDataRequirement(DataRequirement fixedDataRequirement) {
        this.fixedDataRequirement = fixedDataRequirement;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("fixedExpression")
    public Expression getFixedExpression() {
        return fixedExpression;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("fixedExpression")
    public void setFixedExpression(Expression fixedExpression) {
        this.fixedExpression = fixedExpression;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("fixedParameterDefinition")
    public ParameterDefinition getFixedParameterDefinition() {
        return fixedParameterDefinition;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("fixedParameterDefinition")
    public void setFixedParameterDefinition(ParameterDefinition fixedParameterDefinition) {
        this.fixedParameterDefinition = fixedParameterDefinition;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("fixedRelatedArtifact")
    public RelatedArtifact getFixedRelatedArtifact() {
        return fixedRelatedArtifact;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("fixedRelatedArtifact")
    public void setFixedRelatedArtifact(RelatedArtifact fixedRelatedArtifact) {
        this.fixedRelatedArtifact = fixedRelatedArtifact;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("fixedTriggerDefinition")
    public TriggerDefinition getFixedTriggerDefinition() {
        return fixedTriggerDefinition;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("fixedTriggerDefinition")
    public void setFixedTriggerDefinition(TriggerDefinition fixedTriggerDefinition) {
        this.fixedTriggerDefinition = fixedTriggerDefinition;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("fixedUsageContext")
    public UsageContext getFixedUsageContext() {
        return fixedUsageContext;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("fixedUsageContext")
    public void setFixedUsageContext(UsageContext fixedUsageContext) {
        this.fixedUsageContext = fixedUsageContext;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("fixedDosage")
    public Dosage getFixedDosage() {
        return fixedDosage;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("fixedDosage")
    public void setFixedDosage(Dosage fixedDosage) {
        this.fixedDosage = fixedDosage;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("fixedMeta")
    public Meta getFixedMeta() {
        return fixedMeta;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("fixedMeta")
    public void setFixedMeta(Meta fixedMeta) {
        this.fixedMeta = fixedMeta;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternBase64Binary")
    public String getPatternBase64Binary() {
        return patternBase64Binary;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternBase64Binary")
    public void setPatternBase64Binary(String patternBase64Binary) {
        this.patternBase64Binary = patternBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternBase64Binary")
    public Element get_patternBase64Binary() {
        return _patternBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternBase64Binary")
    public void set_patternBase64Binary(Element _patternBase64Binary) {
        this._patternBase64Binary = _patternBase64Binary;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternBoolean")
    public Boolean getPatternBoolean() {
        return patternBoolean;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternBoolean")
    public void setPatternBoolean(Boolean patternBoolean) {
        this.patternBoolean = patternBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternBoolean")
    public Element get_patternBoolean() {
        return _patternBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternBoolean")
    public void set_patternBoolean(Element _patternBoolean) {
        this._patternBoolean = _patternBoolean;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternCanonical")
    public String getPatternCanonical() {
        return patternCanonical;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternCanonical")
    public void setPatternCanonical(String patternCanonical) {
        this.patternCanonical = patternCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternCanonical")
    public Element get_patternCanonical() {
        return _patternCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternCanonical")
    public void set_patternCanonical(Element _patternCanonical) {
        this._patternCanonical = _patternCanonical;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternCode")
    public String getPatternCode() {
        return patternCode;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternCode")
    public void setPatternCode(String patternCode) {
        this.patternCode = patternCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternCode")
    public Element get_patternCode() {
        return _patternCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternCode")
    public void set_patternCode(Element _patternCode) {
        this._patternCode = _patternCode;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDate")
    public String getPatternDate() {
        return patternDate;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDate")
    public void setPatternDate(String patternDate) {
        this.patternDate = patternDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDate")
    public Element get_patternDate() {
        return _patternDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDate")
    public void set_patternDate(Element _patternDate) {
        this._patternDate = _patternDate;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDateTime")
    public String getPatternDateTime() {
        return patternDateTime;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDateTime")
    public void setPatternDateTime(String patternDateTime) {
        this.patternDateTime = patternDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDateTime")
    public Element get_patternDateTime() {
        return _patternDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDateTime")
    public void set_patternDateTime(Element _patternDateTime) {
        this._patternDateTime = _patternDateTime;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDecimal")
    public Double getPatternDecimal() {
        return patternDecimal;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternDecimal")
    public void setPatternDecimal(Double patternDecimal) {
        this.patternDecimal = patternDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDecimal")
    public Element get_patternDecimal() {
        return _patternDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternDecimal")
    public void set_patternDecimal(Element _patternDecimal) {
        this._patternDecimal = _patternDecimal;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternId")
    public String getPatternId() {
        return patternId;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternId")
    public void setPatternId(String patternId) {
        this.patternId = patternId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternId")
    public Element get_patternId() {
        return _patternId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternId")
    public void set_patternId(Element _patternId) {
        this._patternId = _patternId;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternInstant")
    public String getPatternInstant() {
        return patternInstant;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternInstant")
    public void setPatternInstant(String patternInstant) {
        this.patternInstant = patternInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternInstant")
    public Element get_patternInstant() {
        return _patternInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternInstant")
    public void set_patternInstant(Element _patternInstant) {
        this._patternInstant = _patternInstant;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternInteger")
    public Double getPatternInteger() {
        return patternInteger;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternInteger")
    public void setPatternInteger(Double patternInteger) {
        this.patternInteger = patternInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternInteger")
    public Element get_patternInteger() {
        return _patternInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternInteger")
    public void set_patternInteger(Element _patternInteger) {
        this._patternInteger = _patternInteger;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternMarkdown")
    public String getPatternMarkdown() {
        return patternMarkdown;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternMarkdown")
    public void setPatternMarkdown(String patternMarkdown) {
        this.patternMarkdown = patternMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternMarkdown")
    public Element get_patternMarkdown() {
        return _patternMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternMarkdown")
    public void set_patternMarkdown(Element _patternMarkdown) {
        this._patternMarkdown = _patternMarkdown;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternOid")
    public String getPatternOid() {
        return patternOid;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternOid")
    public void setPatternOid(String patternOid) {
        this.patternOid = patternOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternOid")
    public Element get_patternOid() {
        return _patternOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternOid")
    public void set_patternOid(Element _patternOid) {
        this._patternOid = _patternOid;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternPositiveInt")
    public Double getPatternPositiveInt() {
        return patternPositiveInt;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternPositiveInt")
    public void setPatternPositiveInt(Double patternPositiveInt) {
        this.patternPositiveInt = patternPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternPositiveInt")
    public Element get_patternPositiveInt() {
        return _patternPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternPositiveInt")
    public void set_patternPositiveInt(Element _patternPositiveInt) {
        this._patternPositiveInt = _patternPositiveInt;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternString")
    public String getPatternString() {
        return patternString;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternString")
    public void setPatternString(String patternString) {
        this.patternString = patternString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternString")
    public Element get_patternString() {
        return _patternString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternString")
    public void set_patternString(Element _patternString) {
        this._patternString = _patternString;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternTime")
    public String getPatternTime() {
        return patternTime;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternTime")
    public void setPatternTime(String patternTime) {
        this.patternTime = patternTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternTime")
    public Element get_patternTime() {
        return _patternTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternTime")
    public void set_patternTime(Element _patternTime) {
        this._patternTime = _patternTime;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUnsignedInt")
    public Double getPatternUnsignedInt() {
        return patternUnsignedInt;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUnsignedInt")
    public void setPatternUnsignedInt(Double patternUnsignedInt) {
        this.patternUnsignedInt = patternUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUnsignedInt")
    public Element get_patternUnsignedInt() {
        return _patternUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUnsignedInt")
    public void set_patternUnsignedInt(Element _patternUnsignedInt) {
        this._patternUnsignedInt = _patternUnsignedInt;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUri")
    public String getPatternUri() {
        return patternUri;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUri")
    public void setPatternUri(String patternUri) {
        this.patternUri = patternUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUri")
    public Element get_patternUri() {
        return _patternUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUri")
    public void set_patternUri(Element _patternUri) {
        this._patternUri = _patternUri;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUrl")
    public String getPatternUrl() {
        return patternUrl;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUrl")
    public void setPatternUrl(String patternUrl) {
        this.patternUrl = patternUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUrl")
    public Element get_patternUrl() {
        return _patternUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUrl")
    public void set_patternUrl(Element _patternUrl) {
        this._patternUrl = _patternUrl;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUuid")
    public String getPatternUuid() {
        return patternUuid;
    }

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
     * 
     * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
     * 
     * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
     * 
     * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
     * 
     *  1. If primitive: it must match exactly the pattern value
     *  2. If a complex object: it must match (recursively) the pattern value
     *  3. If an array: it must match (recursively) the pattern value.
     * 
     */
    @JsonProperty("patternUuid")
    public void setPatternUuid(String patternUuid) {
        this.patternUuid = patternUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUuid")
    public Element get_patternUuid() {
        return _patternUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patternUuid")
    public void set_patternUuid(Element _patternUuid) {
        this._patternUuid = _patternUuid;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("patternAddress")
    public Address getPatternAddress() {
        return patternAddress;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("patternAddress")
    public void setPatternAddress(Address patternAddress) {
        this.patternAddress = patternAddress;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("patternAge")
    public Age getPatternAge() {
        return patternAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("patternAge")
    public void setPatternAge(Age patternAge) {
        this.patternAge = patternAge;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("patternAnnotation")
    public Annotation getPatternAnnotation() {
        return patternAnnotation;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("patternAnnotation")
    public void setPatternAnnotation(Annotation patternAnnotation) {
        this.patternAnnotation = patternAnnotation;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("patternAttachment")
    public Attachment getPatternAttachment() {
        return patternAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("patternAttachment")
    public void setPatternAttachment(Attachment patternAttachment) {
        this.patternAttachment = patternAttachment;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("patternCodeableConcept")
    public CodeableConcept getPatternCodeableConcept() {
        return patternCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("patternCodeableConcept")
    public void setPatternCodeableConcept(CodeableConcept patternCodeableConcept) {
        this.patternCodeableConcept = patternCodeableConcept;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("patternCoding")
    public Coding getPatternCoding() {
        return patternCoding;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("patternCoding")
    public void setPatternCoding(Coding patternCoding) {
        this.patternCoding = patternCoding;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("patternContactPoint")
    public ContactPoint getPatternContactPoint() {
        return patternContactPoint;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("patternContactPoint")
    public void setPatternContactPoint(ContactPoint patternContactPoint) {
        this.patternContactPoint = patternContactPoint;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("patternCount")
    public Count getPatternCount() {
        return patternCount;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("patternCount")
    public void setPatternCount(Count patternCount) {
        this.patternCount = patternCount;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("patternDistance")
    public Distance getPatternDistance() {
        return patternDistance;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("patternDistance")
    public void setPatternDistance(Distance patternDistance) {
        this.patternDistance = patternDistance;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("patternDuration")
    public Duration getPatternDuration() {
        return patternDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("patternDuration")
    public void setPatternDuration(Duration patternDuration) {
        this.patternDuration = patternDuration;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("patternHumanName")
    public HumanName getPatternHumanName() {
        return patternHumanName;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("patternHumanName")
    public void setPatternHumanName(HumanName patternHumanName) {
        this.patternHumanName = patternHumanName;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("patternIdentifier")
    public Identifier getPatternIdentifier() {
        return patternIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("patternIdentifier")
    public void setPatternIdentifier(Identifier patternIdentifier) {
        this.patternIdentifier = patternIdentifier;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("patternMoney")
    public Money getPatternMoney() {
        return patternMoney;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("patternMoney")
    public void setPatternMoney(Money patternMoney) {
        this.patternMoney = patternMoney;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("patternPeriod")
    public Period getPatternPeriod() {
        return patternPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("patternPeriod")
    public void setPatternPeriod(Period patternPeriod) {
        this.patternPeriod = patternPeriod;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("patternQuantity")
    public Quantity getPatternQuantity() {
        return patternQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("patternQuantity")
    public void setPatternQuantity(Quantity patternQuantity) {
        this.patternQuantity = patternQuantity;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("patternRange")
    public Range getPatternRange() {
        return patternRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("patternRange")
    public void setPatternRange(Range patternRange) {
        this.patternRange = patternRange;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("patternRatio")
    public Ratio getPatternRatio() {
        return patternRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("patternRatio")
    public void setPatternRatio(Ratio patternRatio) {
        this.patternRatio = patternRatio;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patternReference")
    public Reference getPatternReference() {
        return patternReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("patternReference")
    public void setPatternReference(Reference patternReference) {
        this.patternReference = patternReference;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("patternSampledData")
    public SampledData getPatternSampledData() {
        return patternSampledData;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("patternSampledData")
    public void setPatternSampledData(SampledData patternSampledData) {
        this.patternSampledData = patternSampledData;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("patternSignature")
    public Signature getPatternSignature() {
        return patternSignature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("patternSignature")
    public void setPatternSignature(Signature patternSignature) {
        this.patternSignature = patternSignature;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("patternTiming")
    public Timing getPatternTiming() {
        return patternTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("patternTiming")
    public void setPatternTiming(Timing patternTiming) {
        this.patternTiming = patternTiming;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("patternContactDetail")
    public ContactDetail getPatternContactDetail() {
        return patternContactDetail;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("patternContactDetail")
    public void setPatternContactDetail(ContactDetail patternContactDetail) {
        this.patternContactDetail = patternContactDetail;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("patternContributor")
    public Contributor getPatternContributor() {
        return patternContributor;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("patternContributor")
    public void setPatternContributor(Contributor patternContributor) {
        this.patternContributor = patternContributor;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("patternDataRequirement")
    public DataRequirement getPatternDataRequirement() {
        return patternDataRequirement;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("patternDataRequirement")
    public void setPatternDataRequirement(DataRequirement patternDataRequirement) {
        this.patternDataRequirement = patternDataRequirement;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("patternExpression")
    public Expression getPatternExpression() {
        return patternExpression;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("patternExpression")
    public void setPatternExpression(Expression patternExpression) {
        this.patternExpression = patternExpression;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("patternParameterDefinition")
    public ParameterDefinition getPatternParameterDefinition() {
        return patternParameterDefinition;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("patternParameterDefinition")
    public void setPatternParameterDefinition(ParameterDefinition patternParameterDefinition) {
        this.patternParameterDefinition = patternParameterDefinition;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("patternRelatedArtifact")
    public RelatedArtifact getPatternRelatedArtifact() {
        return patternRelatedArtifact;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("patternRelatedArtifact")
    public void setPatternRelatedArtifact(RelatedArtifact patternRelatedArtifact) {
        this.patternRelatedArtifact = patternRelatedArtifact;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("patternTriggerDefinition")
    public TriggerDefinition getPatternTriggerDefinition() {
        return patternTriggerDefinition;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("patternTriggerDefinition")
    public void setPatternTriggerDefinition(TriggerDefinition patternTriggerDefinition) {
        this.patternTriggerDefinition = patternTriggerDefinition;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("patternUsageContext")
    public UsageContext getPatternUsageContext() {
        return patternUsageContext;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("patternUsageContext")
    public void setPatternUsageContext(UsageContext patternUsageContext) {
        this.patternUsageContext = patternUsageContext;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("patternDosage")
    public Dosage getPatternDosage() {
        return patternDosage;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("patternDosage")
    public void setPatternDosage(Dosage patternDosage) {
        this.patternDosage = patternDosage;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("patternMeta")
    public Meta getPatternMeta() {
        return patternMeta;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("patternMeta")
    public void setPatternMeta(Meta patternMeta) {
        this.patternMeta = patternMeta;
    }

    /**
     * A sample value for this element demonstrating the type of information that would typically be found in the element.
     * 
     */
    @JsonProperty("example")
    public List<ElementDefinition_Example> getExample() {
        return example;
    }

    /**
     * A sample value for this element demonstrating the type of information that would typically be found in the element.
     * 
     */
    @JsonProperty("example")
    public void setExample(List<ElementDefinition_Example> example) {
        this.example = example;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDate")
    public String getMinValueDate() {
        return minValueDate;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDate")
    public void setMinValueDate(String minValueDate) {
        this.minValueDate = minValueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDate")
    public Element get_minValueDate() {
        return _minValueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDate")
    public void set_minValueDate(Element _minValueDate) {
        this._minValueDate = _minValueDate;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDateTime")
    public String getMinValueDateTime() {
        return minValueDateTime;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDateTime")
    public void setMinValueDateTime(String minValueDateTime) {
        this.minValueDateTime = minValueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDateTime")
    public Element get_minValueDateTime() {
        return _minValueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDateTime")
    public void set_minValueDateTime(Element _minValueDateTime) {
        this._minValueDateTime = _minValueDateTime;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueInstant")
    public String getMinValueInstant() {
        return minValueInstant;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueInstant")
    public void setMinValueInstant(String minValueInstant) {
        this.minValueInstant = minValueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueInstant")
    public Element get_minValueInstant() {
        return _minValueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueInstant")
    public void set_minValueInstant(Element _minValueInstant) {
        this._minValueInstant = _minValueInstant;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueTime")
    public String getMinValueTime() {
        return minValueTime;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueTime")
    public void setMinValueTime(String minValueTime) {
        this.minValueTime = minValueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueTime")
    public Element get_minValueTime() {
        return _minValueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueTime")
    public void set_minValueTime(Element _minValueTime) {
        this._minValueTime = _minValueTime;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDecimal")
    public Double getMinValueDecimal() {
        return minValueDecimal;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueDecimal")
    public void setMinValueDecimal(Double minValueDecimal) {
        this.minValueDecimal = minValueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDecimal")
    public Element get_minValueDecimal() {
        return _minValueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueDecimal")
    public void set_minValueDecimal(Element _minValueDecimal) {
        this._minValueDecimal = _minValueDecimal;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueInteger")
    public Double getMinValueInteger() {
        return minValueInteger;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueInteger")
    public void setMinValueInteger(Double minValueInteger) {
        this.minValueInteger = minValueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueInteger")
    public Element get_minValueInteger() {
        return _minValueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueInteger")
    public void set_minValueInteger(Element _minValueInteger) {
        this._minValueInteger = _minValueInteger;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValuePositiveInt")
    public Double getMinValuePositiveInt() {
        return minValuePositiveInt;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValuePositiveInt")
    public void setMinValuePositiveInt(Double minValuePositiveInt) {
        this.minValuePositiveInt = minValuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValuePositiveInt")
    public Element get_minValuePositiveInt() {
        return _minValuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValuePositiveInt")
    public void set_minValuePositiveInt(Element _minValuePositiveInt) {
        this._minValuePositiveInt = _minValuePositiveInt;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueUnsignedInt")
    public Double getMinValueUnsignedInt() {
        return minValueUnsignedInt;
    }

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("minValueUnsignedInt")
    public void setMinValueUnsignedInt(Double minValueUnsignedInt) {
        this.minValueUnsignedInt = minValueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueUnsignedInt")
    public Element get_minValueUnsignedInt() {
        return _minValueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_minValueUnsignedInt")
    public void set_minValueUnsignedInt(Element _minValueUnsignedInt) {
        this._minValueUnsignedInt = _minValueUnsignedInt;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("minValueQuantity")
    public Quantity getMinValueQuantity() {
        return minValueQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("minValueQuantity")
    public void setMinValueQuantity(Quantity minValueQuantity) {
        this.minValueQuantity = minValueQuantity;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDate")
    public String getMaxValueDate() {
        return maxValueDate;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDate")
    public void setMaxValueDate(String maxValueDate) {
        this.maxValueDate = maxValueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDate")
    public Element get_maxValueDate() {
        return _maxValueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDate")
    public void set_maxValueDate(Element _maxValueDate) {
        this._maxValueDate = _maxValueDate;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDateTime")
    public String getMaxValueDateTime() {
        return maxValueDateTime;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDateTime")
    public void setMaxValueDateTime(String maxValueDateTime) {
        this.maxValueDateTime = maxValueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDateTime")
    public Element get_maxValueDateTime() {
        return _maxValueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDateTime")
    public void set_maxValueDateTime(Element _maxValueDateTime) {
        this._maxValueDateTime = _maxValueDateTime;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueInstant")
    public String getMaxValueInstant() {
        return maxValueInstant;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueInstant")
    public void setMaxValueInstant(String maxValueInstant) {
        this.maxValueInstant = maxValueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueInstant")
    public Element get_maxValueInstant() {
        return _maxValueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueInstant")
    public void set_maxValueInstant(Element _maxValueInstant) {
        this._maxValueInstant = _maxValueInstant;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueTime")
    public String getMaxValueTime() {
        return maxValueTime;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueTime")
    public void setMaxValueTime(String maxValueTime) {
        this.maxValueTime = maxValueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueTime")
    public Element get_maxValueTime() {
        return _maxValueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueTime")
    public void set_maxValueTime(Element _maxValueTime) {
        this._maxValueTime = _maxValueTime;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDecimal")
    public Double getMaxValueDecimal() {
        return maxValueDecimal;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueDecimal")
    public void setMaxValueDecimal(Double maxValueDecimal) {
        this.maxValueDecimal = maxValueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDecimal")
    public Element get_maxValueDecimal() {
        return _maxValueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueDecimal")
    public void set_maxValueDecimal(Element _maxValueDecimal) {
        this._maxValueDecimal = _maxValueDecimal;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueInteger")
    public Double getMaxValueInteger() {
        return maxValueInteger;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueInteger")
    public void setMaxValueInteger(Double maxValueInteger) {
        this.maxValueInteger = maxValueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueInteger")
    public Element get_maxValueInteger() {
        return _maxValueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueInteger")
    public void set_maxValueInteger(Element _maxValueInteger) {
        this._maxValueInteger = _maxValueInteger;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValuePositiveInt")
    public Double getMaxValuePositiveInt() {
        return maxValuePositiveInt;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValuePositiveInt")
    public void setMaxValuePositiveInt(Double maxValuePositiveInt) {
        this.maxValuePositiveInt = maxValuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValuePositiveInt")
    public Element get_maxValuePositiveInt() {
        return _maxValuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValuePositiveInt")
    public void set_maxValuePositiveInt(Element _maxValuePositiveInt) {
        this._maxValuePositiveInt = _maxValuePositiveInt;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueUnsignedInt")
    public Double getMaxValueUnsignedInt() {
        return maxValueUnsignedInt;
    }

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     * 
     */
    @JsonProperty("maxValueUnsignedInt")
    public void setMaxValueUnsignedInt(Double maxValueUnsignedInt) {
        this.maxValueUnsignedInt = maxValueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueUnsignedInt")
    public Element get_maxValueUnsignedInt() {
        return _maxValueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxValueUnsignedInt")
    public void set_maxValueUnsignedInt(Element _maxValueUnsignedInt) {
        this._maxValueUnsignedInt = _maxValueUnsignedInt;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxValueQuantity")
    public Quantity getMaxValueQuantity() {
        return maxValueQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxValueQuantity")
    public void setMaxValueQuantity(Quantity maxValueQuantity) {
        this.maxValueQuantity = maxValueQuantity;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("maxLength")
    public Double getMaxLength() {
        return maxLength;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("maxLength")
    public void setMaxLength(Double maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxLength")
    public Element get_maxLength() {
        return _maxLength;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_maxLength")
    public void set_maxLength(Element _maxLength) {
        this._maxLength = _maxLength;
    }

    /**
     * A reference to an invariant that may make additional statements about the cardinality or value in the instance.
     * 
     */
    @JsonProperty("condition")
    public List<String> getCondition() {
        return condition;
    }

    /**
     * A reference to an invariant that may make additional statements about the cardinality or value in the instance.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(List<String> condition) {
        this.condition = condition;
    }

    /**
     * Extensions for condition
     * 
     */
    @JsonProperty("_condition")
    public List<Element> get_condition() {
        return _condition;
    }

    /**
     * Extensions for condition
     * 
     */
    @JsonProperty("_condition")
    public void set_condition(List<Element> _condition) {
        this._condition = _condition;
    }

    /**
     * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
     * 
     */
    @JsonProperty("constraint")
    public List<ElementDefinition_Constraint> getConstraint() {
        return constraint;
    }

    /**
     * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
     * 
     */
    @JsonProperty("constraint")
    public void setConstraint(List<ElementDefinition_Constraint> constraint) {
        this.constraint = constraint;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("mustSupport")
    public Boolean getMustSupport() {
        return mustSupport;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("mustSupport")
    public void setMustSupport(Boolean mustSupport) {
        this.mustSupport = mustSupport;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mustSupport")
    public Element get_mustSupport() {
        return _mustSupport;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mustSupport")
    public void set_mustSupport(Element _mustSupport) {
        this._mustSupport = _mustSupport;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isModifier")
    public Boolean getIsModifier() {
        return isModifier;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isModifier")
    public void setIsModifier(Boolean isModifier) {
        this.isModifier = isModifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isModifier")
    public Element get_isModifier() {
        return _isModifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isModifier")
    public void set_isModifier(Element _isModifier) {
        this._isModifier = _isModifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("isModifierReason")
    public String getIsModifierReason() {
        return isModifierReason;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("isModifierReason")
    public void setIsModifierReason(String isModifierReason) {
        this.isModifierReason = isModifierReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isModifierReason")
    public Element get_isModifierReason() {
        return _isModifierReason;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isModifierReason")
    public void set_isModifierReason(Element _isModifierReason) {
        this._isModifierReason = _isModifierReason;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isSummary")
    public Boolean getIsSummary() {
        return isSummary;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("isSummary")
    public void setIsSummary(Boolean isSummary) {
        this.isSummary = isSummary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isSummary")
    public Element get_isSummary() {
        return _isSummary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_isSummary")
    public void set_isSummary(Element _isSummary) {
        this._isSummary = _isSummary;
    }

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("binding")
    public ElementDefinition_Binding getBinding() {
        return binding;
    }

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @JsonProperty("binding")
    public void setBinding(ElementDefinition_Binding binding) {
        this.binding = binding;
    }

    /**
     * Identifies a concept from an external specification that roughly corresponds to this element.
     * 
     */
    @JsonProperty("mapping")
    public List<ElementDefinition_Mapping> getMapping() {
        return mapping;
    }

    /**
     * Identifies a concept from an external specification that roughly corresponds to this element.
     * 
     */
    @JsonProperty("mapping")
    public void setMapping(List<ElementDefinition_Mapping> mapping) {
        this.mapping = mapping;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElementDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("_path");
        sb.append('=');
        sb.append(((this._path == null)?"<null>":this._path));
        sb.append(',');
        sb.append("representation");
        sb.append('=');
        sb.append(((this.representation == null)?"<null>":this.representation));
        sb.append(',');
        sb.append("_representation");
        sb.append('=');
        sb.append(((this._representation == null)?"<null>":this._representation));
        sb.append(',');
        sb.append("sliceName");
        sb.append('=');
        sb.append(((this.sliceName == null)?"<null>":this.sliceName));
        sb.append(',');
        sb.append("_sliceName");
        sb.append('=');
        sb.append(((this._sliceName == null)?"<null>":this._sliceName));
        sb.append(',');
        sb.append("sliceIsConstraining");
        sb.append('=');
        sb.append(((this.sliceIsConstraining == null)?"<null>":this.sliceIsConstraining));
        sb.append(',');
        sb.append("_sliceIsConstraining");
        sb.append('=');
        sb.append(((this._sliceIsConstraining == null)?"<null>":this._sliceIsConstraining));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("_label");
        sb.append('=');
        sb.append(((this._label == null)?"<null>":this._label));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("slicing");
        sb.append('=');
        sb.append(((this.slicing == null)?"<null>":this.slicing));
        sb.append(',');
        sb.append("_short");
        sb.append('=');
        sb.append(((this._short == null)?"<null>":this._short));
        sb.append(',');
        sb.append("__short");
        sb.append('=');
        sb.append(((this.__short == null)?"<null>":this.__short));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("_definition");
        sb.append('=');
        sb.append(((this._definition == null)?"<null>":this._definition));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("_comment");
        sb.append('=');
        sb.append(((this._comment == null)?"<null>":this._comment));
        sb.append(',');
        sb.append("requirements");
        sb.append('=');
        sb.append(((this.requirements == null)?"<null>":this.requirements));
        sb.append(',');
        sb.append("_requirements");
        sb.append('=');
        sb.append(((this._requirements == null)?"<null>":this._requirements));
        sb.append(',');
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("_alias");
        sb.append('=');
        sb.append(((this._alias == null)?"<null>":this._alias));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
        sb.append(',');
        sb.append("_min");
        sb.append('=');
        sb.append(((this._min == null)?"<null>":this._min));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("_max");
        sb.append('=');
        sb.append(((this._max == null)?"<null>":this._max));
        sb.append(',');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("contentReference");
        sb.append('=');
        sb.append(((this.contentReference == null)?"<null>":this.contentReference));
        sb.append(',');
        sb.append("_contentReference");
        sb.append('=');
        sb.append(((this._contentReference == null)?"<null>":this._contentReference));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("defaultValueBase64Binary");
        sb.append('=');
        sb.append(((this.defaultValueBase64Binary == null)?"<null>":this.defaultValueBase64Binary));
        sb.append(',');
        sb.append("_defaultValueBase64Binary");
        sb.append('=');
        sb.append(((this._defaultValueBase64Binary == null)?"<null>":this._defaultValueBase64Binary));
        sb.append(',');
        sb.append("defaultValueBoolean");
        sb.append('=');
        sb.append(((this.defaultValueBoolean == null)?"<null>":this.defaultValueBoolean));
        sb.append(',');
        sb.append("_defaultValueBoolean");
        sb.append('=');
        sb.append(((this._defaultValueBoolean == null)?"<null>":this._defaultValueBoolean));
        sb.append(',');
        sb.append("defaultValueCanonical");
        sb.append('=');
        sb.append(((this.defaultValueCanonical == null)?"<null>":this.defaultValueCanonical));
        sb.append(',');
        sb.append("_defaultValueCanonical");
        sb.append('=');
        sb.append(((this._defaultValueCanonical == null)?"<null>":this._defaultValueCanonical));
        sb.append(',');
        sb.append("defaultValueCode");
        sb.append('=');
        sb.append(((this.defaultValueCode == null)?"<null>":this.defaultValueCode));
        sb.append(',');
        sb.append("_defaultValueCode");
        sb.append('=');
        sb.append(((this._defaultValueCode == null)?"<null>":this._defaultValueCode));
        sb.append(',');
        sb.append("defaultValueDate");
        sb.append('=');
        sb.append(((this.defaultValueDate == null)?"<null>":this.defaultValueDate));
        sb.append(',');
        sb.append("_defaultValueDate");
        sb.append('=');
        sb.append(((this._defaultValueDate == null)?"<null>":this._defaultValueDate));
        sb.append(',');
        sb.append("defaultValueDateTime");
        sb.append('=');
        sb.append(((this.defaultValueDateTime == null)?"<null>":this.defaultValueDateTime));
        sb.append(',');
        sb.append("_defaultValueDateTime");
        sb.append('=');
        sb.append(((this._defaultValueDateTime == null)?"<null>":this._defaultValueDateTime));
        sb.append(',');
        sb.append("defaultValueDecimal");
        sb.append('=');
        sb.append(((this.defaultValueDecimal == null)?"<null>":this.defaultValueDecimal));
        sb.append(',');
        sb.append("_defaultValueDecimal");
        sb.append('=');
        sb.append(((this._defaultValueDecimal == null)?"<null>":this._defaultValueDecimal));
        sb.append(',');
        sb.append("defaultValueId");
        sb.append('=');
        sb.append(((this.defaultValueId == null)?"<null>":this.defaultValueId));
        sb.append(',');
        sb.append("_defaultValueId");
        sb.append('=');
        sb.append(((this._defaultValueId == null)?"<null>":this._defaultValueId));
        sb.append(',');
        sb.append("defaultValueInstant");
        sb.append('=');
        sb.append(((this.defaultValueInstant == null)?"<null>":this.defaultValueInstant));
        sb.append(',');
        sb.append("_defaultValueInstant");
        sb.append('=');
        sb.append(((this._defaultValueInstant == null)?"<null>":this._defaultValueInstant));
        sb.append(',');
        sb.append("defaultValueInteger");
        sb.append('=');
        sb.append(((this.defaultValueInteger == null)?"<null>":this.defaultValueInteger));
        sb.append(',');
        sb.append("_defaultValueInteger");
        sb.append('=');
        sb.append(((this._defaultValueInteger == null)?"<null>":this._defaultValueInteger));
        sb.append(',');
        sb.append("defaultValueMarkdown");
        sb.append('=');
        sb.append(((this.defaultValueMarkdown == null)?"<null>":this.defaultValueMarkdown));
        sb.append(',');
        sb.append("_defaultValueMarkdown");
        sb.append('=');
        sb.append(((this._defaultValueMarkdown == null)?"<null>":this._defaultValueMarkdown));
        sb.append(',');
        sb.append("defaultValueOid");
        sb.append('=');
        sb.append(((this.defaultValueOid == null)?"<null>":this.defaultValueOid));
        sb.append(',');
        sb.append("_defaultValueOid");
        sb.append('=');
        sb.append(((this._defaultValueOid == null)?"<null>":this._defaultValueOid));
        sb.append(',');
        sb.append("defaultValuePositiveInt");
        sb.append('=');
        sb.append(((this.defaultValuePositiveInt == null)?"<null>":this.defaultValuePositiveInt));
        sb.append(',');
        sb.append("_defaultValuePositiveInt");
        sb.append('=');
        sb.append(((this._defaultValuePositiveInt == null)?"<null>":this._defaultValuePositiveInt));
        sb.append(',');
        sb.append("defaultValueString");
        sb.append('=');
        sb.append(((this.defaultValueString == null)?"<null>":this.defaultValueString));
        sb.append(',');
        sb.append("_defaultValueString");
        sb.append('=');
        sb.append(((this._defaultValueString == null)?"<null>":this._defaultValueString));
        sb.append(',');
        sb.append("defaultValueTime");
        sb.append('=');
        sb.append(((this.defaultValueTime == null)?"<null>":this.defaultValueTime));
        sb.append(',');
        sb.append("_defaultValueTime");
        sb.append('=');
        sb.append(((this._defaultValueTime == null)?"<null>":this._defaultValueTime));
        sb.append(',');
        sb.append("defaultValueUnsignedInt");
        sb.append('=');
        sb.append(((this.defaultValueUnsignedInt == null)?"<null>":this.defaultValueUnsignedInt));
        sb.append(',');
        sb.append("_defaultValueUnsignedInt");
        sb.append('=');
        sb.append(((this._defaultValueUnsignedInt == null)?"<null>":this._defaultValueUnsignedInt));
        sb.append(',');
        sb.append("defaultValueUri");
        sb.append('=');
        sb.append(((this.defaultValueUri == null)?"<null>":this.defaultValueUri));
        sb.append(',');
        sb.append("_defaultValueUri");
        sb.append('=');
        sb.append(((this._defaultValueUri == null)?"<null>":this._defaultValueUri));
        sb.append(',');
        sb.append("defaultValueUrl");
        sb.append('=');
        sb.append(((this.defaultValueUrl == null)?"<null>":this.defaultValueUrl));
        sb.append(',');
        sb.append("_defaultValueUrl");
        sb.append('=');
        sb.append(((this._defaultValueUrl == null)?"<null>":this._defaultValueUrl));
        sb.append(',');
        sb.append("defaultValueUuid");
        sb.append('=');
        sb.append(((this.defaultValueUuid == null)?"<null>":this.defaultValueUuid));
        sb.append(',');
        sb.append("_defaultValueUuid");
        sb.append('=');
        sb.append(((this._defaultValueUuid == null)?"<null>":this._defaultValueUuid));
        sb.append(',');
        sb.append("defaultValueAddress");
        sb.append('=');
        sb.append(((this.defaultValueAddress == null)?"<null>":this.defaultValueAddress));
        sb.append(',');
        sb.append("defaultValueAge");
        sb.append('=');
        sb.append(((this.defaultValueAge == null)?"<null>":this.defaultValueAge));
        sb.append(',');
        sb.append("defaultValueAnnotation");
        sb.append('=');
        sb.append(((this.defaultValueAnnotation == null)?"<null>":this.defaultValueAnnotation));
        sb.append(',');
        sb.append("defaultValueAttachment");
        sb.append('=');
        sb.append(((this.defaultValueAttachment == null)?"<null>":this.defaultValueAttachment));
        sb.append(',');
        sb.append("defaultValueCodeableConcept");
        sb.append('=');
        sb.append(((this.defaultValueCodeableConcept == null)?"<null>":this.defaultValueCodeableConcept));
        sb.append(',');
        sb.append("defaultValueCoding");
        sb.append('=');
        sb.append(((this.defaultValueCoding == null)?"<null>":this.defaultValueCoding));
        sb.append(',');
        sb.append("defaultValueContactPoint");
        sb.append('=');
        sb.append(((this.defaultValueContactPoint == null)?"<null>":this.defaultValueContactPoint));
        sb.append(',');
        sb.append("defaultValueCount");
        sb.append('=');
        sb.append(((this.defaultValueCount == null)?"<null>":this.defaultValueCount));
        sb.append(',');
        sb.append("defaultValueDistance");
        sb.append('=');
        sb.append(((this.defaultValueDistance == null)?"<null>":this.defaultValueDistance));
        sb.append(',');
        sb.append("defaultValueDuration");
        sb.append('=');
        sb.append(((this.defaultValueDuration == null)?"<null>":this.defaultValueDuration));
        sb.append(',');
        sb.append("defaultValueHumanName");
        sb.append('=');
        sb.append(((this.defaultValueHumanName == null)?"<null>":this.defaultValueHumanName));
        sb.append(',');
        sb.append("defaultValueIdentifier");
        sb.append('=');
        sb.append(((this.defaultValueIdentifier == null)?"<null>":this.defaultValueIdentifier));
        sb.append(',');
        sb.append("defaultValueMoney");
        sb.append('=');
        sb.append(((this.defaultValueMoney == null)?"<null>":this.defaultValueMoney));
        sb.append(',');
        sb.append("defaultValuePeriod");
        sb.append('=');
        sb.append(((this.defaultValuePeriod == null)?"<null>":this.defaultValuePeriod));
        sb.append(',');
        sb.append("defaultValueQuantity");
        sb.append('=');
        sb.append(((this.defaultValueQuantity == null)?"<null>":this.defaultValueQuantity));
        sb.append(',');
        sb.append("defaultValueRange");
        sb.append('=');
        sb.append(((this.defaultValueRange == null)?"<null>":this.defaultValueRange));
        sb.append(',');
        sb.append("defaultValueRatio");
        sb.append('=');
        sb.append(((this.defaultValueRatio == null)?"<null>":this.defaultValueRatio));
        sb.append(',');
        sb.append("defaultValueReference");
        sb.append('=');
        sb.append(((this.defaultValueReference == null)?"<null>":this.defaultValueReference));
        sb.append(',');
        sb.append("defaultValueSampledData");
        sb.append('=');
        sb.append(((this.defaultValueSampledData == null)?"<null>":this.defaultValueSampledData));
        sb.append(',');
        sb.append("defaultValueSignature");
        sb.append('=');
        sb.append(((this.defaultValueSignature == null)?"<null>":this.defaultValueSignature));
        sb.append(',');
        sb.append("defaultValueTiming");
        sb.append('=');
        sb.append(((this.defaultValueTiming == null)?"<null>":this.defaultValueTiming));
        sb.append(',');
        sb.append("defaultValueContactDetail");
        sb.append('=');
        sb.append(((this.defaultValueContactDetail == null)?"<null>":this.defaultValueContactDetail));
        sb.append(',');
        sb.append("defaultValueContributor");
        sb.append('=');
        sb.append(((this.defaultValueContributor == null)?"<null>":this.defaultValueContributor));
        sb.append(',');
        sb.append("defaultValueDataRequirement");
        sb.append('=');
        sb.append(((this.defaultValueDataRequirement == null)?"<null>":this.defaultValueDataRequirement));
        sb.append(',');
        sb.append("defaultValueExpression");
        sb.append('=');
        sb.append(((this.defaultValueExpression == null)?"<null>":this.defaultValueExpression));
        sb.append(',');
        sb.append("defaultValueParameterDefinition");
        sb.append('=');
        sb.append(((this.defaultValueParameterDefinition == null)?"<null>":this.defaultValueParameterDefinition));
        sb.append(',');
        sb.append("defaultValueRelatedArtifact");
        sb.append('=');
        sb.append(((this.defaultValueRelatedArtifact == null)?"<null>":this.defaultValueRelatedArtifact));
        sb.append(',');
        sb.append("defaultValueTriggerDefinition");
        sb.append('=');
        sb.append(((this.defaultValueTriggerDefinition == null)?"<null>":this.defaultValueTriggerDefinition));
        sb.append(',');
        sb.append("defaultValueUsageContext");
        sb.append('=');
        sb.append(((this.defaultValueUsageContext == null)?"<null>":this.defaultValueUsageContext));
        sb.append(',');
        sb.append("defaultValueDosage");
        sb.append('=');
        sb.append(((this.defaultValueDosage == null)?"<null>":this.defaultValueDosage));
        sb.append(',');
        sb.append("defaultValueMeta");
        sb.append('=');
        sb.append(((this.defaultValueMeta == null)?"<null>":this.defaultValueMeta));
        sb.append(',');
        sb.append("meaningWhenMissing");
        sb.append('=');
        sb.append(((this.meaningWhenMissing == null)?"<null>":this.meaningWhenMissing));
        sb.append(',');
        sb.append("_meaningWhenMissing");
        sb.append('=');
        sb.append(((this._meaningWhenMissing == null)?"<null>":this._meaningWhenMissing));
        sb.append(',');
        sb.append("orderMeaning");
        sb.append('=');
        sb.append(((this.orderMeaning == null)?"<null>":this.orderMeaning));
        sb.append(',');
        sb.append("_orderMeaning");
        sb.append('=');
        sb.append(((this._orderMeaning == null)?"<null>":this._orderMeaning));
        sb.append(',');
        sb.append("fixedBase64Binary");
        sb.append('=');
        sb.append(((this.fixedBase64Binary == null)?"<null>":this.fixedBase64Binary));
        sb.append(',');
        sb.append("_fixedBase64Binary");
        sb.append('=');
        sb.append(((this._fixedBase64Binary == null)?"<null>":this._fixedBase64Binary));
        sb.append(',');
        sb.append("fixedBoolean");
        sb.append('=');
        sb.append(((this.fixedBoolean == null)?"<null>":this.fixedBoolean));
        sb.append(',');
        sb.append("_fixedBoolean");
        sb.append('=');
        sb.append(((this._fixedBoolean == null)?"<null>":this._fixedBoolean));
        sb.append(',');
        sb.append("fixedCanonical");
        sb.append('=');
        sb.append(((this.fixedCanonical == null)?"<null>":this.fixedCanonical));
        sb.append(',');
        sb.append("_fixedCanonical");
        sb.append('=');
        sb.append(((this._fixedCanonical == null)?"<null>":this._fixedCanonical));
        sb.append(',');
        sb.append("fixedCode");
        sb.append('=');
        sb.append(((this.fixedCode == null)?"<null>":this.fixedCode));
        sb.append(',');
        sb.append("_fixedCode");
        sb.append('=');
        sb.append(((this._fixedCode == null)?"<null>":this._fixedCode));
        sb.append(',');
        sb.append("fixedDate");
        sb.append('=');
        sb.append(((this.fixedDate == null)?"<null>":this.fixedDate));
        sb.append(',');
        sb.append("_fixedDate");
        sb.append('=');
        sb.append(((this._fixedDate == null)?"<null>":this._fixedDate));
        sb.append(',');
        sb.append("fixedDateTime");
        sb.append('=');
        sb.append(((this.fixedDateTime == null)?"<null>":this.fixedDateTime));
        sb.append(',');
        sb.append("_fixedDateTime");
        sb.append('=');
        sb.append(((this._fixedDateTime == null)?"<null>":this._fixedDateTime));
        sb.append(',');
        sb.append("fixedDecimal");
        sb.append('=');
        sb.append(((this.fixedDecimal == null)?"<null>":this.fixedDecimal));
        sb.append(',');
        sb.append("_fixedDecimal");
        sb.append('=');
        sb.append(((this._fixedDecimal == null)?"<null>":this._fixedDecimal));
        sb.append(',');
        sb.append("fixedId");
        sb.append('=');
        sb.append(((this.fixedId == null)?"<null>":this.fixedId));
        sb.append(',');
        sb.append("_fixedId");
        sb.append('=');
        sb.append(((this._fixedId == null)?"<null>":this._fixedId));
        sb.append(',');
        sb.append("fixedInstant");
        sb.append('=');
        sb.append(((this.fixedInstant == null)?"<null>":this.fixedInstant));
        sb.append(',');
        sb.append("_fixedInstant");
        sb.append('=');
        sb.append(((this._fixedInstant == null)?"<null>":this._fixedInstant));
        sb.append(',');
        sb.append("fixedInteger");
        sb.append('=');
        sb.append(((this.fixedInteger == null)?"<null>":this.fixedInteger));
        sb.append(',');
        sb.append("_fixedInteger");
        sb.append('=');
        sb.append(((this._fixedInteger == null)?"<null>":this._fixedInteger));
        sb.append(',');
        sb.append("fixedMarkdown");
        sb.append('=');
        sb.append(((this.fixedMarkdown == null)?"<null>":this.fixedMarkdown));
        sb.append(',');
        sb.append("_fixedMarkdown");
        sb.append('=');
        sb.append(((this._fixedMarkdown == null)?"<null>":this._fixedMarkdown));
        sb.append(',');
        sb.append("fixedOid");
        sb.append('=');
        sb.append(((this.fixedOid == null)?"<null>":this.fixedOid));
        sb.append(',');
        sb.append("_fixedOid");
        sb.append('=');
        sb.append(((this._fixedOid == null)?"<null>":this._fixedOid));
        sb.append(',');
        sb.append("fixedPositiveInt");
        sb.append('=');
        sb.append(((this.fixedPositiveInt == null)?"<null>":this.fixedPositiveInt));
        sb.append(',');
        sb.append("_fixedPositiveInt");
        sb.append('=');
        sb.append(((this._fixedPositiveInt == null)?"<null>":this._fixedPositiveInt));
        sb.append(',');
        sb.append("fixedString");
        sb.append('=');
        sb.append(((this.fixedString == null)?"<null>":this.fixedString));
        sb.append(',');
        sb.append("_fixedString");
        sb.append('=');
        sb.append(((this._fixedString == null)?"<null>":this._fixedString));
        sb.append(',');
        sb.append("fixedTime");
        sb.append('=');
        sb.append(((this.fixedTime == null)?"<null>":this.fixedTime));
        sb.append(',');
        sb.append("_fixedTime");
        sb.append('=');
        sb.append(((this._fixedTime == null)?"<null>":this._fixedTime));
        sb.append(',');
        sb.append("fixedUnsignedInt");
        sb.append('=');
        sb.append(((this.fixedUnsignedInt == null)?"<null>":this.fixedUnsignedInt));
        sb.append(',');
        sb.append("_fixedUnsignedInt");
        sb.append('=');
        sb.append(((this._fixedUnsignedInt == null)?"<null>":this._fixedUnsignedInt));
        sb.append(',');
        sb.append("fixedUri");
        sb.append('=');
        sb.append(((this.fixedUri == null)?"<null>":this.fixedUri));
        sb.append(',');
        sb.append("_fixedUri");
        sb.append('=');
        sb.append(((this._fixedUri == null)?"<null>":this._fixedUri));
        sb.append(',');
        sb.append("fixedUrl");
        sb.append('=');
        sb.append(((this.fixedUrl == null)?"<null>":this.fixedUrl));
        sb.append(',');
        sb.append("_fixedUrl");
        sb.append('=');
        sb.append(((this._fixedUrl == null)?"<null>":this._fixedUrl));
        sb.append(',');
        sb.append("fixedUuid");
        sb.append('=');
        sb.append(((this.fixedUuid == null)?"<null>":this.fixedUuid));
        sb.append(',');
        sb.append("_fixedUuid");
        sb.append('=');
        sb.append(((this._fixedUuid == null)?"<null>":this._fixedUuid));
        sb.append(',');
        sb.append("fixedAddress");
        sb.append('=');
        sb.append(((this.fixedAddress == null)?"<null>":this.fixedAddress));
        sb.append(',');
        sb.append("fixedAge");
        sb.append('=');
        sb.append(((this.fixedAge == null)?"<null>":this.fixedAge));
        sb.append(',');
        sb.append("fixedAnnotation");
        sb.append('=');
        sb.append(((this.fixedAnnotation == null)?"<null>":this.fixedAnnotation));
        sb.append(',');
        sb.append("fixedAttachment");
        sb.append('=');
        sb.append(((this.fixedAttachment == null)?"<null>":this.fixedAttachment));
        sb.append(',');
        sb.append("fixedCodeableConcept");
        sb.append('=');
        sb.append(((this.fixedCodeableConcept == null)?"<null>":this.fixedCodeableConcept));
        sb.append(',');
        sb.append("fixedCoding");
        sb.append('=');
        sb.append(((this.fixedCoding == null)?"<null>":this.fixedCoding));
        sb.append(',');
        sb.append("fixedContactPoint");
        sb.append('=');
        sb.append(((this.fixedContactPoint == null)?"<null>":this.fixedContactPoint));
        sb.append(',');
        sb.append("fixedCount");
        sb.append('=');
        sb.append(((this.fixedCount == null)?"<null>":this.fixedCount));
        sb.append(',');
        sb.append("fixedDistance");
        sb.append('=');
        sb.append(((this.fixedDistance == null)?"<null>":this.fixedDistance));
        sb.append(',');
        sb.append("fixedDuration");
        sb.append('=');
        sb.append(((this.fixedDuration == null)?"<null>":this.fixedDuration));
        sb.append(',');
        sb.append("fixedHumanName");
        sb.append('=');
        sb.append(((this.fixedHumanName == null)?"<null>":this.fixedHumanName));
        sb.append(',');
        sb.append("fixedIdentifier");
        sb.append('=');
        sb.append(((this.fixedIdentifier == null)?"<null>":this.fixedIdentifier));
        sb.append(',');
        sb.append("fixedMoney");
        sb.append('=');
        sb.append(((this.fixedMoney == null)?"<null>":this.fixedMoney));
        sb.append(',');
        sb.append("fixedPeriod");
        sb.append('=');
        sb.append(((this.fixedPeriod == null)?"<null>":this.fixedPeriod));
        sb.append(',');
        sb.append("fixedQuantity");
        sb.append('=');
        sb.append(((this.fixedQuantity == null)?"<null>":this.fixedQuantity));
        sb.append(',');
        sb.append("fixedRange");
        sb.append('=');
        sb.append(((this.fixedRange == null)?"<null>":this.fixedRange));
        sb.append(',');
        sb.append("fixedRatio");
        sb.append('=');
        sb.append(((this.fixedRatio == null)?"<null>":this.fixedRatio));
        sb.append(',');
        sb.append("fixedReference");
        sb.append('=');
        sb.append(((this.fixedReference == null)?"<null>":this.fixedReference));
        sb.append(',');
        sb.append("fixedSampledData");
        sb.append('=');
        sb.append(((this.fixedSampledData == null)?"<null>":this.fixedSampledData));
        sb.append(',');
        sb.append("fixedSignature");
        sb.append('=');
        sb.append(((this.fixedSignature == null)?"<null>":this.fixedSignature));
        sb.append(',');
        sb.append("fixedTiming");
        sb.append('=');
        sb.append(((this.fixedTiming == null)?"<null>":this.fixedTiming));
        sb.append(',');
        sb.append("fixedContactDetail");
        sb.append('=');
        sb.append(((this.fixedContactDetail == null)?"<null>":this.fixedContactDetail));
        sb.append(',');
        sb.append("fixedContributor");
        sb.append('=');
        sb.append(((this.fixedContributor == null)?"<null>":this.fixedContributor));
        sb.append(',');
        sb.append("fixedDataRequirement");
        sb.append('=');
        sb.append(((this.fixedDataRequirement == null)?"<null>":this.fixedDataRequirement));
        sb.append(',');
        sb.append("fixedExpression");
        sb.append('=');
        sb.append(((this.fixedExpression == null)?"<null>":this.fixedExpression));
        sb.append(',');
        sb.append("fixedParameterDefinition");
        sb.append('=');
        sb.append(((this.fixedParameterDefinition == null)?"<null>":this.fixedParameterDefinition));
        sb.append(',');
        sb.append("fixedRelatedArtifact");
        sb.append('=');
        sb.append(((this.fixedRelatedArtifact == null)?"<null>":this.fixedRelatedArtifact));
        sb.append(',');
        sb.append("fixedTriggerDefinition");
        sb.append('=');
        sb.append(((this.fixedTriggerDefinition == null)?"<null>":this.fixedTriggerDefinition));
        sb.append(',');
        sb.append("fixedUsageContext");
        sb.append('=');
        sb.append(((this.fixedUsageContext == null)?"<null>":this.fixedUsageContext));
        sb.append(',');
        sb.append("fixedDosage");
        sb.append('=');
        sb.append(((this.fixedDosage == null)?"<null>":this.fixedDosage));
        sb.append(',');
        sb.append("fixedMeta");
        sb.append('=');
        sb.append(((this.fixedMeta == null)?"<null>":this.fixedMeta));
        sb.append(',');
        sb.append("patternBase64Binary");
        sb.append('=');
        sb.append(((this.patternBase64Binary == null)?"<null>":this.patternBase64Binary));
        sb.append(',');
        sb.append("_patternBase64Binary");
        sb.append('=');
        sb.append(((this._patternBase64Binary == null)?"<null>":this._patternBase64Binary));
        sb.append(',');
        sb.append("patternBoolean");
        sb.append('=');
        sb.append(((this.patternBoolean == null)?"<null>":this.patternBoolean));
        sb.append(',');
        sb.append("_patternBoolean");
        sb.append('=');
        sb.append(((this._patternBoolean == null)?"<null>":this._patternBoolean));
        sb.append(',');
        sb.append("patternCanonical");
        sb.append('=');
        sb.append(((this.patternCanonical == null)?"<null>":this.patternCanonical));
        sb.append(',');
        sb.append("_patternCanonical");
        sb.append('=');
        sb.append(((this._patternCanonical == null)?"<null>":this._patternCanonical));
        sb.append(',');
        sb.append("patternCode");
        sb.append('=');
        sb.append(((this.patternCode == null)?"<null>":this.patternCode));
        sb.append(',');
        sb.append("_patternCode");
        sb.append('=');
        sb.append(((this._patternCode == null)?"<null>":this._patternCode));
        sb.append(',');
        sb.append("patternDate");
        sb.append('=');
        sb.append(((this.patternDate == null)?"<null>":this.patternDate));
        sb.append(',');
        sb.append("_patternDate");
        sb.append('=');
        sb.append(((this._patternDate == null)?"<null>":this._patternDate));
        sb.append(',');
        sb.append("patternDateTime");
        sb.append('=');
        sb.append(((this.patternDateTime == null)?"<null>":this.patternDateTime));
        sb.append(',');
        sb.append("_patternDateTime");
        sb.append('=');
        sb.append(((this._patternDateTime == null)?"<null>":this._patternDateTime));
        sb.append(',');
        sb.append("patternDecimal");
        sb.append('=');
        sb.append(((this.patternDecimal == null)?"<null>":this.patternDecimal));
        sb.append(',');
        sb.append("_patternDecimal");
        sb.append('=');
        sb.append(((this._patternDecimal == null)?"<null>":this._patternDecimal));
        sb.append(',');
        sb.append("patternId");
        sb.append('=');
        sb.append(((this.patternId == null)?"<null>":this.patternId));
        sb.append(',');
        sb.append("_patternId");
        sb.append('=');
        sb.append(((this._patternId == null)?"<null>":this._patternId));
        sb.append(',');
        sb.append("patternInstant");
        sb.append('=');
        sb.append(((this.patternInstant == null)?"<null>":this.patternInstant));
        sb.append(',');
        sb.append("_patternInstant");
        sb.append('=');
        sb.append(((this._patternInstant == null)?"<null>":this._patternInstant));
        sb.append(',');
        sb.append("patternInteger");
        sb.append('=');
        sb.append(((this.patternInteger == null)?"<null>":this.patternInteger));
        sb.append(',');
        sb.append("_patternInteger");
        sb.append('=');
        sb.append(((this._patternInteger == null)?"<null>":this._patternInteger));
        sb.append(',');
        sb.append("patternMarkdown");
        sb.append('=');
        sb.append(((this.patternMarkdown == null)?"<null>":this.patternMarkdown));
        sb.append(',');
        sb.append("_patternMarkdown");
        sb.append('=');
        sb.append(((this._patternMarkdown == null)?"<null>":this._patternMarkdown));
        sb.append(',');
        sb.append("patternOid");
        sb.append('=');
        sb.append(((this.patternOid == null)?"<null>":this.patternOid));
        sb.append(',');
        sb.append("_patternOid");
        sb.append('=');
        sb.append(((this._patternOid == null)?"<null>":this._patternOid));
        sb.append(',');
        sb.append("patternPositiveInt");
        sb.append('=');
        sb.append(((this.patternPositiveInt == null)?"<null>":this.patternPositiveInt));
        sb.append(',');
        sb.append("_patternPositiveInt");
        sb.append('=');
        sb.append(((this._patternPositiveInt == null)?"<null>":this._patternPositiveInt));
        sb.append(',');
        sb.append("patternString");
        sb.append('=');
        sb.append(((this.patternString == null)?"<null>":this.patternString));
        sb.append(',');
        sb.append("_patternString");
        sb.append('=');
        sb.append(((this._patternString == null)?"<null>":this._patternString));
        sb.append(',');
        sb.append("patternTime");
        sb.append('=');
        sb.append(((this.patternTime == null)?"<null>":this.patternTime));
        sb.append(',');
        sb.append("_patternTime");
        sb.append('=');
        sb.append(((this._patternTime == null)?"<null>":this._patternTime));
        sb.append(',');
        sb.append("patternUnsignedInt");
        sb.append('=');
        sb.append(((this.patternUnsignedInt == null)?"<null>":this.patternUnsignedInt));
        sb.append(',');
        sb.append("_patternUnsignedInt");
        sb.append('=');
        sb.append(((this._patternUnsignedInt == null)?"<null>":this._patternUnsignedInt));
        sb.append(',');
        sb.append("patternUri");
        sb.append('=');
        sb.append(((this.patternUri == null)?"<null>":this.patternUri));
        sb.append(',');
        sb.append("_patternUri");
        sb.append('=');
        sb.append(((this._patternUri == null)?"<null>":this._patternUri));
        sb.append(',');
        sb.append("patternUrl");
        sb.append('=');
        sb.append(((this.patternUrl == null)?"<null>":this.patternUrl));
        sb.append(',');
        sb.append("_patternUrl");
        sb.append('=');
        sb.append(((this._patternUrl == null)?"<null>":this._patternUrl));
        sb.append(',');
        sb.append("patternUuid");
        sb.append('=');
        sb.append(((this.patternUuid == null)?"<null>":this.patternUuid));
        sb.append(',');
        sb.append("_patternUuid");
        sb.append('=');
        sb.append(((this._patternUuid == null)?"<null>":this._patternUuid));
        sb.append(',');
        sb.append("patternAddress");
        sb.append('=');
        sb.append(((this.patternAddress == null)?"<null>":this.patternAddress));
        sb.append(',');
        sb.append("patternAge");
        sb.append('=');
        sb.append(((this.patternAge == null)?"<null>":this.patternAge));
        sb.append(',');
        sb.append("patternAnnotation");
        sb.append('=');
        sb.append(((this.patternAnnotation == null)?"<null>":this.patternAnnotation));
        sb.append(',');
        sb.append("patternAttachment");
        sb.append('=');
        sb.append(((this.patternAttachment == null)?"<null>":this.patternAttachment));
        sb.append(',');
        sb.append("patternCodeableConcept");
        sb.append('=');
        sb.append(((this.patternCodeableConcept == null)?"<null>":this.patternCodeableConcept));
        sb.append(',');
        sb.append("patternCoding");
        sb.append('=');
        sb.append(((this.patternCoding == null)?"<null>":this.patternCoding));
        sb.append(',');
        sb.append("patternContactPoint");
        sb.append('=');
        sb.append(((this.patternContactPoint == null)?"<null>":this.patternContactPoint));
        sb.append(',');
        sb.append("patternCount");
        sb.append('=');
        sb.append(((this.patternCount == null)?"<null>":this.patternCount));
        sb.append(',');
        sb.append("patternDistance");
        sb.append('=');
        sb.append(((this.patternDistance == null)?"<null>":this.patternDistance));
        sb.append(',');
        sb.append("patternDuration");
        sb.append('=');
        sb.append(((this.patternDuration == null)?"<null>":this.patternDuration));
        sb.append(',');
        sb.append("patternHumanName");
        sb.append('=');
        sb.append(((this.patternHumanName == null)?"<null>":this.patternHumanName));
        sb.append(',');
        sb.append("patternIdentifier");
        sb.append('=');
        sb.append(((this.patternIdentifier == null)?"<null>":this.patternIdentifier));
        sb.append(',');
        sb.append("patternMoney");
        sb.append('=');
        sb.append(((this.patternMoney == null)?"<null>":this.patternMoney));
        sb.append(',');
        sb.append("patternPeriod");
        sb.append('=');
        sb.append(((this.patternPeriod == null)?"<null>":this.patternPeriod));
        sb.append(',');
        sb.append("patternQuantity");
        sb.append('=');
        sb.append(((this.patternQuantity == null)?"<null>":this.patternQuantity));
        sb.append(',');
        sb.append("patternRange");
        sb.append('=');
        sb.append(((this.patternRange == null)?"<null>":this.patternRange));
        sb.append(',');
        sb.append("patternRatio");
        sb.append('=');
        sb.append(((this.patternRatio == null)?"<null>":this.patternRatio));
        sb.append(',');
        sb.append("patternReference");
        sb.append('=');
        sb.append(((this.patternReference == null)?"<null>":this.patternReference));
        sb.append(',');
        sb.append("patternSampledData");
        sb.append('=');
        sb.append(((this.patternSampledData == null)?"<null>":this.patternSampledData));
        sb.append(',');
        sb.append("patternSignature");
        sb.append('=');
        sb.append(((this.patternSignature == null)?"<null>":this.patternSignature));
        sb.append(',');
        sb.append("patternTiming");
        sb.append('=');
        sb.append(((this.patternTiming == null)?"<null>":this.patternTiming));
        sb.append(',');
        sb.append("patternContactDetail");
        sb.append('=');
        sb.append(((this.patternContactDetail == null)?"<null>":this.patternContactDetail));
        sb.append(',');
        sb.append("patternContributor");
        sb.append('=');
        sb.append(((this.patternContributor == null)?"<null>":this.patternContributor));
        sb.append(',');
        sb.append("patternDataRequirement");
        sb.append('=');
        sb.append(((this.patternDataRequirement == null)?"<null>":this.patternDataRequirement));
        sb.append(',');
        sb.append("patternExpression");
        sb.append('=');
        sb.append(((this.patternExpression == null)?"<null>":this.patternExpression));
        sb.append(',');
        sb.append("patternParameterDefinition");
        sb.append('=');
        sb.append(((this.patternParameterDefinition == null)?"<null>":this.patternParameterDefinition));
        sb.append(',');
        sb.append("patternRelatedArtifact");
        sb.append('=');
        sb.append(((this.patternRelatedArtifact == null)?"<null>":this.patternRelatedArtifact));
        sb.append(',');
        sb.append("patternTriggerDefinition");
        sb.append('=');
        sb.append(((this.patternTriggerDefinition == null)?"<null>":this.patternTriggerDefinition));
        sb.append(',');
        sb.append("patternUsageContext");
        sb.append('=');
        sb.append(((this.patternUsageContext == null)?"<null>":this.patternUsageContext));
        sb.append(',');
        sb.append("patternDosage");
        sb.append('=');
        sb.append(((this.patternDosage == null)?"<null>":this.patternDosage));
        sb.append(',');
        sb.append("patternMeta");
        sb.append('=');
        sb.append(((this.patternMeta == null)?"<null>":this.patternMeta));
        sb.append(',');
        sb.append("example");
        sb.append('=');
        sb.append(((this.example == null)?"<null>":this.example));
        sb.append(',');
        sb.append("minValueDate");
        sb.append('=');
        sb.append(((this.minValueDate == null)?"<null>":this.minValueDate));
        sb.append(',');
        sb.append("_minValueDate");
        sb.append('=');
        sb.append(((this._minValueDate == null)?"<null>":this._minValueDate));
        sb.append(',');
        sb.append("minValueDateTime");
        sb.append('=');
        sb.append(((this.minValueDateTime == null)?"<null>":this.minValueDateTime));
        sb.append(',');
        sb.append("_minValueDateTime");
        sb.append('=');
        sb.append(((this._minValueDateTime == null)?"<null>":this._minValueDateTime));
        sb.append(',');
        sb.append("minValueInstant");
        sb.append('=');
        sb.append(((this.minValueInstant == null)?"<null>":this.minValueInstant));
        sb.append(',');
        sb.append("_minValueInstant");
        sb.append('=');
        sb.append(((this._minValueInstant == null)?"<null>":this._minValueInstant));
        sb.append(',');
        sb.append("minValueTime");
        sb.append('=');
        sb.append(((this.minValueTime == null)?"<null>":this.minValueTime));
        sb.append(',');
        sb.append("_minValueTime");
        sb.append('=');
        sb.append(((this._minValueTime == null)?"<null>":this._minValueTime));
        sb.append(',');
        sb.append("minValueDecimal");
        sb.append('=');
        sb.append(((this.minValueDecimal == null)?"<null>":this.minValueDecimal));
        sb.append(',');
        sb.append("_minValueDecimal");
        sb.append('=');
        sb.append(((this._minValueDecimal == null)?"<null>":this._minValueDecimal));
        sb.append(',');
        sb.append("minValueInteger");
        sb.append('=');
        sb.append(((this.minValueInteger == null)?"<null>":this.minValueInteger));
        sb.append(',');
        sb.append("_minValueInteger");
        sb.append('=');
        sb.append(((this._minValueInteger == null)?"<null>":this._minValueInteger));
        sb.append(',');
        sb.append("minValuePositiveInt");
        sb.append('=');
        sb.append(((this.minValuePositiveInt == null)?"<null>":this.minValuePositiveInt));
        sb.append(',');
        sb.append("_minValuePositiveInt");
        sb.append('=');
        sb.append(((this._minValuePositiveInt == null)?"<null>":this._minValuePositiveInt));
        sb.append(',');
        sb.append("minValueUnsignedInt");
        sb.append('=');
        sb.append(((this.minValueUnsignedInt == null)?"<null>":this.minValueUnsignedInt));
        sb.append(',');
        sb.append("_minValueUnsignedInt");
        sb.append('=');
        sb.append(((this._minValueUnsignedInt == null)?"<null>":this._minValueUnsignedInt));
        sb.append(',');
        sb.append("minValueQuantity");
        sb.append('=');
        sb.append(((this.minValueQuantity == null)?"<null>":this.minValueQuantity));
        sb.append(',');
        sb.append("maxValueDate");
        sb.append('=');
        sb.append(((this.maxValueDate == null)?"<null>":this.maxValueDate));
        sb.append(',');
        sb.append("_maxValueDate");
        sb.append('=');
        sb.append(((this._maxValueDate == null)?"<null>":this._maxValueDate));
        sb.append(',');
        sb.append("maxValueDateTime");
        sb.append('=');
        sb.append(((this.maxValueDateTime == null)?"<null>":this.maxValueDateTime));
        sb.append(',');
        sb.append("_maxValueDateTime");
        sb.append('=');
        sb.append(((this._maxValueDateTime == null)?"<null>":this._maxValueDateTime));
        sb.append(',');
        sb.append("maxValueInstant");
        sb.append('=');
        sb.append(((this.maxValueInstant == null)?"<null>":this.maxValueInstant));
        sb.append(',');
        sb.append("_maxValueInstant");
        sb.append('=');
        sb.append(((this._maxValueInstant == null)?"<null>":this._maxValueInstant));
        sb.append(',');
        sb.append("maxValueTime");
        sb.append('=');
        sb.append(((this.maxValueTime == null)?"<null>":this.maxValueTime));
        sb.append(',');
        sb.append("_maxValueTime");
        sb.append('=');
        sb.append(((this._maxValueTime == null)?"<null>":this._maxValueTime));
        sb.append(',');
        sb.append("maxValueDecimal");
        sb.append('=');
        sb.append(((this.maxValueDecimal == null)?"<null>":this.maxValueDecimal));
        sb.append(',');
        sb.append("_maxValueDecimal");
        sb.append('=');
        sb.append(((this._maxValueDecimal == null)?"<null>":this._maxValueDecimal));
        sb.append(',');
        sb.append("maxValueInteger");
        sb.append('=');
        sb.append(((this.maxValueInteger == null)?"<null>":this.maxValueInteger));
        sb.append(',');
        sb.append("_maxValueInteger");
        sb.append('=');
        sb.append(((this._maxValueInteger == null)?"<null>":this._maxValueInteger));
        sb.append(',');
        sb.append("maxValuePositiveInt");
        sb.append('=');
        sb.append(((this.maxValuePositiveInt == null)?"<null>":this.maxValuePositiveInt));
        sb.append(',');
        sb.append("_maxValuePositiveInt");
        sb.append('=');
        sb.append(((this._maxValuePositiveInt == null)?"<null>":this._maxValuePositiveInt));
        sb.append(',');
        sb.append("maxValueUnsignedInt");
        sb.append('=');
        sb.append(((this.maxValueUnsignedInt == null)?"<null>":this.maxValueUnsignedInt));
        sb.append(',');
        sb.append("_maxValueUnsignedInt");
        sb.append('=');
        sb.append(((this._maxValueUnsignedInt == null)?"<null>":this._maxValueUnsignedInt));
        sb.append(',');
        sb.append("maxValueQuantity");
        sb.append('=');
        sb.append(((this.maxValueQuantity == null)?"<null>":this.maxValueQuantity));
        sb.append(',');
        sb.append("maxLength");
        sb.append('=');
        sb.append(((this.maxLength == null)?"<null>":this.maxLength));
        sb.append(',');
        sb.append("_maxLength");
        sb.append('=');
        sb.append(((this._maxLength == null)?"<null>":this._maxLength));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("_condition");
        sb.append('=');
        sb.append(((this._condition == null)?"<null>":this._condition));
        sb.append(',');
        sb.append("constraint");
        sb.append('=');
        sb.append(((this.constraint == null)?"<null>":this.constraint));
        sb.append(',');
        sb.append("mustSupport");
        sb.append('=');
        sb.append(((this.mustSupport == null)?"<null>":this.mustSupport));
        sb.append(',');
        sb.append("_mustSupport");
        sb.append('=');
        sb.append(((this._mustSupport == null)?"<null>":this._mustSupport));
        sb.append(',');
        sb.append("isModifier");
        sb.append('=');
        sb.append(((this.isModifier == null)?"<null>":this.isModifier));
        sb.append(',');
        sb.append("_isModifier");
        sb.append('=');
        sb.append(((this._isModifier == null)?"<null>":this._isModifier));
        sb.append(',');
        sb.append("isModifierReason");
        sb.append('=');
        sb.append(((this.isModifierReason == null)?"<null>":this.isModifierReason));
        sb.append(',');
        sb.append("_isModifierReason");
        sb.append('=');
        sb.append(((this._isModifierReason == null)?"<null>":this._isModifierReason));
        sb.append(',');
        sb.append("isSummary");
        sb.append('=');
        sb.append(((this.isSummary == null)?"<null>":this.isSummary));
        sb.append(',');
        sb.append("_isSummary");
        sb.append('=');
        sb.append(((this._isSummary == null)?"<null>":this._isSummary));
        sb.append(',');
        sb.append("binding");
        sb.append('=');
        sb.append(((this.binding == null)?"<null>":this.binding));
        sb.append(',');
        sb.append("mapping");
        sb.append('=');
        sb.append(((this.mapping == null)?"<null>":this.mapping));
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
        result = ((result* 31)+((this._fixedDate == null)? 0 :this._fixedDate.hashCode()));
        result = ((result* 31)+((this._minValueDate == null)? 0 :this._minValueDate.hashCode()));
        result = ((result* 31)+((this._minValuePositiveInt == null)? 0 :this._minValuePositiveInt.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.fixedInstant == null)? 0 :this.fixedInstant.hashCode()));
        result = ((result* 31)+((this._comment == null)? 0 :this._comment.hashCode()));
        result = ((result* 31)+((this._patternBoolean == null)? 0 :this._patternBoolean.hashCode()));
        result = ((result* 31)+((this.fixedId == null)? 0 :this.fixedId.hashCode()));
        result = ((result* 31)+((this._fixedUuid == null)? 0 :this._fixedUuid.hashCode()));
        result = ((result* 31)+((this.fixedSignature == null)? 0 :this.fixedSignature.hashCode()));
        result = ((result* 31)+((this._patternDateTime == null)? 0 :this._patternDateTime.hashCode()));
        result = ((result* 31)+((this._sliceIsConstraining == null)? 0 :this._sliceIsConstraining.hashCode()));
        result = ((result* 31)+((this.fixedDecimal == null)? 0 :this.fixedDecimal.hashCode()));
        result = ((result* 31)+((this._maxValueInstant == null)? 0 :this._maxValueInstant.hashCode()));
        result = ((result* 31)+((this.fixedQuantity == null)? 0 :this.fixedQuantity.hashCode()));
        result = ((result* 31)+((this.fixedExpression == null)? 0 :this.fixedExpression.hashCode()));
        result = ((result* 31)+((this.defaultValueMarkdown == null)? 0 :this.defaultValueMarkdown.hashCode()));
        result = ((result* 31)+((this.defaultValueAge == null)? 0 :this.defaultValueAge.hashCode()));
        result = ((result* 31)+((this.isModifier == null)? 0 :this.isModifier.hashCode()));
        result = ((result* 31)+((this._defaultValueDecimal == null)? 0 :this._defaultValueDecimal.hashCode()));
        result = ((result* 31)+((this._fixedId == null)? 0 :this._fixedId.hashCode()));
        result = ((result* 31)+((this.defaultValueDataRequirement == null)? 0 :this.defaultValueDataRequirement.hashCode()));
        result = ((result* 31)+((this.orderMeaning == null)? 0 :this.orderMeaning.hashCode()));
        result = ((result* 31)+((this.fixedDosage == null)? 0 :this.fixedDosage.hashCode()));
        result = ((result* 31)+((this.defaultValueParameterDefinition == null)? 0 :this.defaultValueParameterDefinition.hashCode()));
        result = ((result* 31)+((this.defaultValueReference == null)? 0 :this.defaultValueReference.hashCode()));
        result = ((result* 31)+((this.meaningWhenMissing == null)? 0 :this.meaningWhenMissing.hashCode()));
        result = ((result* 31)+((this.patternMoney == null)? 0 :this.patternMoney.hashCode()));
        result = ((result* 31)+((this.defaultValueDuration == null)? 0 :this.defaultValueDuration.hashCode()));
        result = ((result* 31)+((this.fixedAge == null)? 0 :this.fixedAge.hashCode()));
        result = ((result* 31)+((this.patternQuantity == null)? 0 :this.patternQuantity.hashCode()));
        result = ((result* 31)+((this._minValueInstant == null)? 0 :this._minValueInstant.hashCode()));
        result = ((result* 31)+((this.fixedCoding == null)? 0 :this.fixedCoding.hashCode()));
        result = ((result* 31)+((this.patternCoding == null)? 0 :this.patternCoding.hashCode()));
        result = ((result* 31)+((this.example == null)? 0 :this.example.hashCode()));
        result = ((result* 31)+((this.maxValueDecimal == null)? 0 :this.maxValueDecimal.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this.defaultValueContactPoint == null)? 0 :this.defaultValueContactPoint.hashCode()));
        result = ((result* 31)+((this.defaultValueHumanName == null)? 0 :this.defaultValueHumanName.hashCode()));
        result = ((result* 31)+((this.fixedSampledData == null)? 0 :this.fixedSampledData.hashCode()));
        result = ((result* 31)+((this.minValueDecimal == null)? 0 :this.minValueDecimal.hashCode()));
        result = ((result* 31)+((this.defaultValueCodeableConcept == null)? 0 :this.defaultValueCodeableConcept.hashCode()));
        result = ((result* 31)+((this._fixedBoolean == null)? 0 :this._fixedBoolean.hashCode()));
        result = ((result* 31)+((this.defaultValueDecimal == null)? 0 :this.defaultValueDecimal.hashCode()));
        result = ((result* 31)+((this.fixedContributor == null)? 0 :this.fixedContributor.hashCode()));
        result = ((result* 31)+((this.patternRelatedArtifact == null)? 0 :this.patternRelatedArtifact.hashCode()));
        result = ((result* 31)+((this.sliceIsConstraining == null)? 0 :this.sliceIsConstraining.hashCode()));
        result = ((result* 31)+((this._fixedMarkdown == null)? 0 :this._fixedMarkdown.hashCode()));
        result = ((result* 31)+((this.slicing == null)? 0 :this.slicing.hashCode()));
        result = ((result* 31)+((this.minValueTime == null)? 0 :this.minValueTime.hashCode()));
        result = ((result* 31)+((this.maxValueDateTime == null)? 0 :this.maxValueDateTime.hashCode()));
        result = ((result* 31)+((this.patternCanonical == null)? 0 :this.patternCanonical.hashCode()));
        result = ((result* 31)+((this._isSummary == null)? 0 :this._isSummary.hashCode()));
        result = ((result* 31)+((this._path == null)? 0 :this._path.hashCode()));
        result = ((result* 31)+((this.patternBoolean == null)? 0 :this.patternBoolean.hashCode()));
        result = ((result* 31)+((this.defaultValueCoding == null)? 0 :this.defaultValueCoding.hashCode()));
        result = ((result* 31)+((this.patternAge == null)? 0 :this.patternAge.hashCode()));
        result = ((result* 31)+((this._maxValueDecimal == null)? 0 :this._maxValueDecimal.hashCode()));
        result = ((result* 31)+((this._fixedCanonical == null)? 0 :this._fixedCanonical.hashCode()));
        result = ((result* 31)+((this._condition == null)? 0 :this._condition.hashCode()));
        result = ((result* 31)+((this.patternPeriod == null)? 0 :this.patternPeriod.hashCode()));
        result = ((result* 31)+((this.patternDataRequirement == null)? 0 :this.patternDataRequirement.hashCode()));
        result = ((result* 31)+((this._requirements == null)? 0 :this._requirements.hashCode()));
        result = ((result* 31)+((this.patternContributor == null)? 0 :this.patternContributor.hashCode()));
        result = ((result* 31)+((this._representation == null)? 0 :this._representation.hashCode()));
        result = ((result* 31)+((this.fixedDateTime == null)? 0 :this.fixedDateTime.hashCode()));
        result = ((result* 31)+((this.patternUri == null)? 0 :this.patternUri.hashCode()));
        result = ((result* 31)+((this.patternUrl == null)? 0 :this.patternUrl.hashCode()));
        result = ((result* 31)+((this.fixedUsageContext == null)? 0 :this.fixedUsageContext.hashCode()));
        result = ((result* 31)+((this._defaultValuePositiveInt == null)? 0 :this._defaultValuePositiveInt.hashCode()));
        result = ((result* 31)+((this.patternId == null)? 0 :this.patternId.hashCode()));
        result = ((result* 31)+((this._max == null)? 0 :this._max.hashCode()));
        result = ((result* 31)+((this._mustSupport == null)? 0 :this._mustSupport.hashCode()));
        result = ((result* 31)+((this.defaultValueSignature == null)? 0 :this.defaultValueSignature.hashCode()));
        result = ((result* 31)+((this.patternSampledData == null)? 0 :this.patternSampledData.hashCode()));
        result = ((result* 31)+((this.__short == null)? 0 :this.__short.hashCode()));
        result = ((result* 31)+((this.defaultValueInstant == null)? 0 :this.defaultValueInstant.hashCode()));
        result = ((result* 31)+((this._defaultValueDate == null)? 0 :this._defaultValueDate.hashCode()));
        result = ((result* 31)+((this._patternMarkdown == null)? 0 :this._patternMarkdown.hashCode()));
        result = ((result* 31)+((this.patternHumanName == null)? 0 :this.patternHumanName.hashCode()));
        result = ((result* 31)+((this._patternPositiveInt == null)? 0 :this._patternPositiveInt.hashCode()));
        result = ((result* 31)+((this._definition == null)? 0 :this._definition.hashCode()));
        result = ((result* 31)+((this.defaultValueUrl == null)? 0 :this.defaultValueUrl.hashCode()));
        result = ((result* 31)+((this.defaultValueUri == null)? 0 :this.defaultValueUri.hashCode()));
        result = ((result* 31)+((this._maxValueTime == null)? 0 :this._maxValueTime.hashCode()));
        result = ((result* 31)+((this.fixedAnnotation == null)? 0 :this.fixedAnnotation.hashCode()));
        result = ((result* 31)+((this._fixedDecimal == null)? 0 :this._fixedDecimal.hashCode()));
        result = ((result* 31)+((this._defaultValueId == null)? 0 :this._defaultValueId.hashCode()));
        result = ((result* 31)+((this._isModifierReason == null)? 0 :this._isModifierReason.hashCode()));
        result = ((result* 31)+((this.fixedIdentifier == null)? 0 :this.fixedIdentifier.hashCode()));
        result = ((result* 31)+((this.fixedReference == null)? 0 :this.fixedReference.hashCode()));
        result = ((result* 31)+((this._defaultValueUuid == null)? 0 :this._defaultValueUuid.hashCode()));
        result = ((result* 31)+((this.defaultValueUsageContext == null)? 0 :this.defaultValueUsageContext.hashCode()));
        result = ((result* 31)+((this.fixedAttachment == null)? 0 :this.fixedAttachment.hashCode()));
        result = ((result* 31)+((this._fixedUrl == null)? 0 :this._fixedUrl.hashCode()));
        result = ((result* 31)+((this.fixedTiming == null)? 0 :this.fixedTiming.hashCode()));
        result = ((result* 31)+((this._minValueDecimal == null)? 0 :this._minValueDecimal.hashCode()));
        result = ((result* 31)+((this.patternSignature == null)? 0 :this.patternSignature.hashCode()));
        result = ((result* 31)+((this._fixedUri == null)? 0 :this._fixedUri.hashCode()));
        result = ((result* 31)+((this.patternDateTime == null)? 0 :this.patternDateTime.hashCode()));
        result = ((result* 31)+((this._patternCode == null)? 0 :this._patternCode.hashCode()));
        result = ((result* 31)+((this.isModifierReason == null)? 0 :this.isModifierReason.hashCode()));
        result = ((result* 31)+((this._patternId == null)? 0 :this._patternId.hashCode()));
        result = ((result* 31)+((this._patternUuid == null)? 0 :this._patternUuid.hashCode()));
        result = ((result* 31)+((this._patternBase64Binary == null)? 0 :this._patternBase64Binary.hashCode()));
        result = ((result* 31)+((this._defaultValueMarkdown == null)? 0 :this._defaultValueMarkdown.hashCode()));
        result = ((result* 31)+((this.defaultValueRange == null)? 0 :this.defaultValueRange.hashCode()));
        result = ((result* 31)+((this.maxValueDate == null)? 0 :this.maxValueDate.hashCode()));
        result = ((result* 31)+((this.defaultValueUnsignedInt == null)? 0 :this.defaultValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.fixedContactPoint == null)? 0 :this.fixedContactPoint.hashCode()));
        result = ((result* 31)+((this.representation == null)? 0 :this.representation.hashCode()));
        result = ((result* 31)+((this.defaultValueTime == null)? 0 :this.defaultValueTime.hashCode()));
        result = ((result* 31)+((this.fixedInteger == null)? 0 :this.fixedInteger.hashCode()));
        result = ((result* 31)+((this._defaultValueBase64Binary == null)? 0 :this._defaultValueBase64Binary.hashCode()));
        result = ((result* 31)+((this.patternParameterDefinition == null)? 0 :this.patternParameterDefinition.hashCode()));
        result = ((result* 31)+((this.minValuePositiveInt == null)? 0 :this.minValuePositiveInt.hashCode()));
        result = ((result* 31)+((this.defaultValueDistance == null)? 0 :this.defaultValueDistance.hashCode()));
        result = ((result* 31)+((this._fixedString == null)? 0 :this._fixedString.hashCode()));
        result = ((result* 31)+((this.patternInstant == null)? 0 :this.patternInstant.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        result = ((result* 31)+((this.patternRange == null)? 0 :this.patternRange.hashCode()));
        result = ((result* 31)+((this.defaultValueCanonical == null)? 0 :this.defaultValueCanonical.hashCode()));
        result = ((result* 31)+((this.fixedPositiveInt == null)? 0 :this.fixedPositiveInt.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.fixedTime == null)? 0 :this.fixedTime.hashCode()));
        result = ((result* 31)+((this.defaultValueOid == null)? 0 :this.defaultValueOid.hashCode()));
        result = ((result* 31)+((this._patternInteger == null)? 0 :this._patternInteger.hashCode()));
        result = ((result* 31)+((this.fixedParameterDefinition == null)? 0 :this.fixedParameterDefinition.hashCode()));
        result = ((result* 31)+((this.minValueInteger == null)? 0 :this.minValueInteger.hashCode()));
        result = ((result* 31)+((this._alias == null)? 0 :this._alias.hashCode()));
        result = ((result* 31)+((this._defaultValueInstant == null)? 0 :this._defaultValueInstant.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this._patternDate == null)? 0 :this._patternDate.hashCode()));
        result = ((result* 31)+((this._minValueUnsignedInt == null)? 0 :this._minValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.fixedCanonical == null)? 0 :this.fixedCanonical.hashCode()));
        result = ((result* 31)+((this.patternTime == null)? 0 :this.patternTime.hashCode()));
        result = ((result* 31)+((this.base == null)? 0 :this.base.hashCode()));
        result = ((result* 31)+((this._contentReference == null)? 0 :this._contentReference.hashCode()));
        result = ((result* 31)+((this.defaultValueString == null)? 0 :this.defaultValueString.hashCode()));
        result = ((result* 31)+((this._patternInstant == null)? 0 :this._patternInstant.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.fixedCode == null)? 0 :this.fixedCode.hashCode()));
        result = ((result* 31)+((this.patternReference == null)? 0 :this.patternReference.hashCode()));
        result = ((result* 31)+((this.binding == null)? 0 :this.binding.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._maxValuePositiveInt == null)? 0 :this._maxValuePositiveInt.hashCode()));
        result = ((result* 31)+((this.fixedMarkdown == null)? 0 :this.fixedMarkdown.hashCode()));
        result = ((result* 31)+((this.defaultValueQuantity == null)? 0 :this.defaultValueQuantity.hashCode()));
        result = ((result* 31)+((this.fixedMeta == null)? 0 :this.fixedMeta.hashCode()));
        result = ((result* 31)+((this.fixedTriggerDefinition == null)? 0 :this.fixedTriggerDefinition.hashCode()));
        result = ((result* 31)+((this.fixedRelatedArtifact == null)? 0 :this.fixedRelatedArtifact.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._fixedOid == null)? 0 :this._fixedOid.hashCode()));
        result = ((result* 31)+((this.fixedContactDetail == null)? 0 :this.fixedContactDetail.hashCode()));
        result = ((result* 31)+((this._defaultValueInteger == null)? 0 :this._defaultValueInteger.hashCode()));
        result = ((result* 31)+((this._defaultValueUnsignedInt == null)? 0 :this._defaultValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.fixedBoolean == null)? 0 :this.fixedBoolean.hashCode()));
        result = ((result* 31)+((this.fixedOid == null)? 0 :this.fixedOid.hashCode()));
        result = ((result* 31)+((this.patternDuration == null)? 0 :this.patternDuration.hashCode()));
        result = ((result* 31)+((this.patternUsageContext == null)? 0 :this.patternUsageContext.hashCode()));
        result = ((result* 31)+((this.mapping == null)? 0 :this.mapping.hashCode()));
        result = ((result* 31)+((this.defaultValueExpression == null)? 0 :this.defaultValueExpression.hashCode()));
        result = ((result* 31)+((this.fixedRange == null)? 0 :this.fixedRange.hashCode()));
        result = ((result* 31)+((this._isModifier == null)? 0 :this._isModifier.hashCode()));
        result = ((result* 31)+((this.fixedAddress == null)? 0 :this.fixedAddress.hashCode()));
        result = ((result* 31)+((this.patternDate == null)? 0 :this.patternDate.hashCode()));
        result = ((result* 31)+((this.patternOid == null)? 0 :this.patternOid.hashCode()));
        result = ((result* 31)+((this.patternExpression == null)? 0 :this.patternExpression.hashCode()));
        result = ((result* 31)+((this._fixedTime == null)? 0 :this._fixedTime.hashCode()));
        result = ((result* 31)+((this.maxValueInteger == null)? 0 :this.maxValueInteger.hashCode()));
        result = ((result* 31)+((this.fixedDuration == null)? 0 :this.fixedDuration.hashCode()));
        result = ((result* 31)+((this.patternBase64Binary == null)? 0 :this.patternBase64Binary.hashCode()));
        result = ((result* 31)+((this.fixedPeriod == null)? 0 :this.fixedPeriod.hashCode()));
        result = ((result* 31)+((this.patternRatio == null)? 0 :this.patternRatio.hashCode()));
        result = ((result* 31)+((this.defaultValueDate == null)? 0 :this.defaultValueDate.hashCode()));
        result = ((result* 31)+((this._orderMeaning == null)? 0 :this._orderMeaning.hashCode()));
        result = ((result* 31)+((this.patternString == null)? 0 :this.patternString.hashCode()));
        result = ((result* 31)+((this._fixedBase64Binary == null)? 0 :this._fixedBase64Binary.hashCode()));
        result = ((result* 31)+((this.defaultValueContactDetail == null)? 0 :this.defaultValueContactDetail.hashCode()));
        result = ((result* 31)+((this.maxValuePositiveInt == null)? 0 :this.maxValuePositiveInt.hashCode()));
        result = ((result* 31)+((this._defaultValueCanonical == null)? 0 :this._defaultValueCanonical.hashCode()));
        result = ((result* 31)+((this._defaultValueBoolean == null)? 0 :this._defaultValueBoolean.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._patternUrl == null)? 0 :this._patternUrl.hashCode()));
        result = ((result* 31)+((this._patternUri == null)? 0 :this._patternUri.hashCode()));
        result = ((result* 31)+((this._fixedPositiveInt == null)? 0 :this._fixedPositiveInt.hashCode()));
        result = ((result* 31)+((this.minValueDate == null)? 0 :this.minValueDate.hashCode()));
        result = ((result* 31)+((this._defaultValueUrl == null)? 0 :this._defaultValueUrl.hashCode()));
        result = ((result* 31)+((this.minValueUnsignedInt == null)? 0 :this.minValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this._defaultValueCode == null)? 0 :this._defaultValueCode.hashCode()));
        result = ((result* 31)+((this.patternMarkdown == null)? 0 :this.patternMarkdown.hashCode()));
        result = ((result* 31)+((this.defaultValueTriggerDefinition == null)? 0 :this.defaultValueTriggerDefinition.hashCode()));
        result = ((result* 31)+((this._patternDecimal == null)? 0 :this._patternDecimal.hashCode()));
        result = ((result* 31)+((this.maxValueTime == null)? 0 :this.maxValueTime.hashCode()));
        result = ((result* 31)+((this.defaultValueAnnotation == null)? 0 :this.defaultValueAnnotation.hashCode()));
        result = ((result* 31)+((this.fixedMoney == null)? 0 :this.fixedMoney.hashCode()));
        result = ((result* 31)+((this._patternUnsignedInt == null)? 0 :this._patternUnsignedInt.hashCode()));
        result = ((result* 31)+((this.defaultValuePeriod == null)? 0 :this.defaultValuePeriod.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.patternAnnotation == null)? 0 :this.patternAnnotation.hashCode()));
        result = ((result* 31)+((this.defaultValuePositiveInt == null)? 0 :this.defaultValuePositiveInt.hashCode()));
        result = ((result* 31)+((this.fixedCodeableConcept == null)? 0 :this.fixedCodeableConcept.hashCode()));
        result = ((result* 31)+((this._defaultValueUri == null)? 0 :this._defaultValueUri.hashCode()));
        result = ((result* 31)+((this.fixedHumanName == null)? 0 :this.fixedHumanName.hashCode()));
        result = ((result* 31)+((this.fixedUnsignedInt == null)? 0 :this.fixedUnsignedInt.hashCode()));
        result = ((result* 31)+((this.constraint == null)? 0 :this.constraint.hashCode()));
        result = ((result* 31)+((this.patternInteger == null)? 0 :this.patternInteger.hashCode()));
        result = ((result* 31)+((this.patternDosage == null)? 0 :this.patternDosage.hashCode()));
        result = ((result* 31)+((this.defaultValueDosage == null)? 0 :this.defaultValueDosage.hashCode()));
        result = ((result* 31)+((this.maxValueInstant == null)? 0 :this.maxValueInstant.hashCode()));
        result = ((result* 31)+((this._patternString == null)? 0 :this._patternString.hashCode()));
        result = ((result* 31)+((this._maxValueDate == null)? 0 :this._maxValueDate.hashCode()));
        result = ((result* 31)+((this.patternUnsignedInt == null)? 0 :this.patternUnsignedInt.hashCode()));
        result = ((result* 31)+((this.patternDecimal == null)? 0 :this.patternDecimal.hashCode()));
        result = ((result* 31)+((this.minValueDateTime == null)? 0 :this.minValueDateTime.hashCode()));
        result = ((result* 31)+((this._patternCanonical == null)? 0 :this._patternCanonical.hashCode()));
        result = ((result* 31)+((this._fixedInteger == null)? 0 :this._fixedInteger.hashCode()));
        result = ((result* 31)+((this._maxValueInteger == null)? 0 :this._maxValueInteger.hashCode()));
        result = ((result* 31)+((this.fixedDistance == null)? 0 :this.fixedDistance.hashCode()));
        result = ((result* 31)+((this.patternAttachment == null)? 0 :this.patternAttachment.hashCode()));
        result = ((result* 31)+((this.defaultValueBoolean == null)? 0 :this.defaultValueBoolean.hashCode()));
        result = ((result* 31)+((this.defaultValueRatio == null)? 0 :this.defaultValueRatio.hashCode()));
        result = ((result* 31)+((this.patternAddress == null)? 0 :this.patternAddress.hashCode()));
        result = ((result* 31)+((this._defaultValueOid == null)? 0 :this._defaultValueOid.hashCode()));
        result = ((result* 31)+((this._maxValueUnsignedInt == null)? 0 :this._maxValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.defaultValueMeta == null)? 0 :this.defaultValueMeta.hashCode()));
        result = ((result* 31)+((this.defaultValueMoney == null)? 0 :this.defaultValueMoney.hashCode()));
        result = ((result* 31)+((this._defaultValueString == null)? 0 :this._defaultValueString.hashCode()));
        result = ((result* 31)+((this.fixedBase64Binary == null)? 0 :this.fixedBase64Binary.hashCode()));
        result = ((result* 31)+((this.defaultValueBase64Binary == null)? 0 :this.defaultValueBase64Binary.hashCode()));
        result = ((result* 31)+((this.defaultValueAddress == null)? 0 :this.defaultValueAddress.hashCode()));
        result = ((result* 31)+((this.defaultValueIdentifier == null)? 0 :this.defaultValueIdentifier.hashCode()));
        result = ((result* 31)+((this._patternOid == null)? 0 :this._patternOid.hashCode()));
        result = ((result* 31)+((this.patternContactPoint == null)? 0 :this.patternContactPoint.hashCode()));
        result = ((result* 31)+((this._defaultValueTime == null)? 0 :this._defaultValueTime.hashCode()));
        result = ((result* 31)+((this.minValueInstant == null)? 0 :this.minValueInstant.hashCode()));
        result = ((result* 31)+((this.defaultValueId == null)? 0 :this.defaultValueId.hashCode()));
        result = ((result* 31)+((this.isSummary == null)? 0 :this.isSummary.hashCode()));
        result = ((result* 31)+((this._sliceName == null)? 0 :this._sliceName.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.patternIdentifier == null)? 0 :this.patternIdentifier.hashCode()));
        result = ((result* 31)+((this.defaultValueAttachment == null)? 0 :this.defaultValueAttachment.hashCode()));
        result = ((result* 31)+((this.fixedCount == null)? 0 :this.fixedCount.hashCode()));
        result = ((result* 31)+((this.maxLength == null)? 0 :this.maxLength.hashCode()));
        result = ((result* 31)+((this._min == null)? 0 :this._min.hashCode()));
        result = ((result* 31)+((this.fixedUuid == null)? 0 :this.fixedUuid.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._meaningWhenMissing == null)? 0 :this._meaningWhenMissing.hashCode()));
        result = ((result* 31)+((this.fixedDate == null)? 0 :this.fixedDate.hashCode()));
        result = ((result* 31)+((this._fixedCode == null)? 0 :this._fixedCode.hashCode()));
        result = ((result* 31)+((this.maxValueUnsignedInt == null)? 0 :this.maxValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.defaultValueSampledData == null)? 0 :this.defaultValueSampledData.hashCode()));
        result = ((result* 31)+((this.patternMeta == null)? 0 :this.patternMeta.hashCode()));
        result = ((result* 31)+((this._defaultValueDateTime == null)? 0 :this._defaultValueDateTime.hashCode()));
        result = ((result* 31)+((this.defaultValueInteger == null)? 0 :this.defaultValueInteger.hashCode()));
        result = ((result* 31)+((this._fixedDateTime == null)? 0 :this._fixedDateTime.hashCode()));
        result = ((result* 31)+((this.patternTriggerDefinition == null)? 0 :this.patternTriggerDefinition.hashCode()));
        result = ((result* 31)+((this._label == null)? 0 :this._label.hashCode()));
        result = ((result* 31)+((this.maxValueQuantity == null)? 0 :this.maxValueQuantity.hashCode()));
        result = ((result* 31)+((this.defaultValueRelatedArtifact == null)? 0 :this.defaultValueRelatedArtifact.hashCode()));
        result = ((result* 31)+((this._fixedInstant == null)? 0 :this._fixedInstant.hashCode()));
        result = ((result* 31)+((this._patternTime == null)? 0 :this._patternTime.hashCode()));
        result = ((result* 31)+((this._maxValueDateTime == null)? 0 :this._maxValueDateTime.hashCode()));
        result = ((result* 31)+((this.defaultValueDateTime == null)? 0 :this.defaultValueDateTime.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.defaultValueUuid == null)? 0 :this.defaultValueUuid.hashCode()));
        result = ((result* 31)+((this._fixedUnsignedInt == null)? 0 :this._fixedUnsignedInt.hashCode()));
        result = ((result* 31)+((this._short == null)? 0 :this._short.hashCode()));
        result = ((result* 31)+((this._minValueDateTime == null)? 0 :this._minValueDateTime.hashCode()));
        result = ((result* 31)+((this.defaultValueCount == null)? 0 :this.defaultValueCount.hashCode()));
        result = ((result* 31)+((this.patternContactDetail == null)? 0 :this.patternContactDetail.hashCode()));
        result = ((result* 31)+((this.requirements == null)? 0 :this.requirements.hashCode()));
        result = ((result* 31)+((this.defaultValueContributor == null)? 0 :this.defaultValueContributor.hashCode()));
        result = ((result* 31)+((this.minValueQuantity == null)? 0 :this.minValueQuantity.hashCode()));
        result = ((result* 31)+((this.mustSupport == null)? 0 :this.mustSupport.hashCode()));
        result = ((result* 31)+((this.patternCode == null)? 0 :this.patternCode.hashCode()));
        result = ((result* 31)+((this.defaultValueTiming == null)? 0 :this.defaultValueTiming.hashCode()));
        result = ((result* 31)+((this._minValueTime == null)? 0 :this._minValueTime.hashCode()));
        result = ((result* 31)+((this.patternUuid == null)? 0 :this.patternUuid.hashCode()));
        result = ((result* 31)+((this.patternDistance == null)? 0 :this.patternDistance.hashCode()));
        result = ((result* 31)+((this.patternCodeableConcept == null)? 0 :this.patternCodeableConcept.hashCode()));
        result = ((result* 31)+((this._minValueInteger == null)? 0 :this._minValueInteger.hashCode()));
        result = ((result* 31)+((this.fixedUri == null)? 0 :this.fixedUri.hashCode()));
        result = ((result* 31)+((this.sliceName == null)? 0 :this.sliceName.hashCode()));
        result = ((result* 31)+((this.fixedUrl == null)? 0 :this.fixedUrl.hashCode()));
        result = ((result* 31)+((this.defaultValueCode == null)? 0 :this.defaultValueCode.hashCode()));
        result = ((result* 31)+((this.fixedDataRequirement == null)? 0 :this.fixedDataRequirement.hashCode()));
        result = ((result* 31)+((this.contentReference == null)? 0 :this.contentReference.hashCode()));
        result = ((result* 31)+((this.patternTiming == null)? 0 :this.patternTiming.hashCode()));
        result = ((result* 31)+((this.fixedString == null)? 0 :this.fixedString.hashCode()));
        result = ((result* 31)+((this.fixedRatio == null)? 0 :this.fixedRatio.hashCode()));
        result = ((result* 31)+((this._maxLength == null)? 0 :this._maxLength.hashCode()));
        result = ((result* 31)+((this.patternPositiveInt == null)? 0 :this.patternPositiveInt.hashCode()));
        result = ((result* 31)+((this.patternCount == null)? 0 :this.patternCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElementDefinition) == false) {
            return false;
        }
        ElementDefinition rhs = ((ElementDefinition) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this._fixedDate == rhs._fixedDate)||((this._fixedDate!= null)&&this._fixedDate.equals(rhs._fixedDate)))&&((this._minValueDate == rhs._minValueDate)||((this._minValueDate!= null)&&this._minValueDate.equals(rhs._minValueDate))))&&((this._minValuePositiveInt == rhs._minValuePositiveInt)||((this._minValuePositiveInt!= null)&&this._minValuePositiveInt.equals(rhs._minValuePositiveInt))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.fixedInstant == rhs.fixedInstant)||((this.fixedInstant!= null)&&this.fixedInstant.equals(rhs.fixedInstant))))&&((this._comment == rhs._comment)||((this._comment!= null)&&this._comment.equals(rhs._comment))))&&((this._patternBoolean == rhs._patternBoolean)||((this._patternBoolean!= null)&&this._patternBoolean.equals(rhs._patternBoolean))))&&((this.fixedId == rhs.fixedId)||((this.fixedId!= null)&&this.fixedId.equals(rhs.fixedId))))&&((this._fixedUuid == rhs._fixedUuid)||((this._fixedUuid!= null)&&this._fixedUuid.equals(rhs._fixedUuid))))&&((this.fixedSignature == rhs.fixedSignature)||((this.fixedSignature!= null)&&this.fixedSignature.equals(rhs.fixedSignature))))&&((this._patternDateTime == rhs._patternDateTime)||((this._patternDateTime!= null)&&this._patternDateTime.equals(rhs._patternDateTime))))&&((this._sliceIsConstraining == rhs._sliceIsConstraining)||((this._sliceIsConstraining!= null)&&this._sliceIsConstraining.equals(rhs._sliceIsConstraining))))&&((this.fixedDecimal == rhs.fixedDecimal)||((this.fixedDecimal!= null)&&this.fixedDecimal.equals(rhs.fixedDecimal))))&&((this._maxValueInstant == rhs._maxValueInstant)||((this._maxValueInstant!= null)&&this._maxValueInstant.equals(rhs._maxValueInstant))))&&((this.fixedQuantity == rhs.fixedQuantity)||((this.fixedQuantity!= null)&&this.fixedQuantity.equals(rhs.fixedQuantity))))&&((this.fixedExpression == rhs.fixedExpression)||((this.fixedExpression!= null)&&this.fixedExpression.equals(rhs.fixedExpression))))&&((this.defaultValueMarkdown == rhs.defaultValueMarkdown)||((this.defaultValueMarkdown!= null)&&this.defaultValueMarkdown.equals(rhs.defaultValueMarkdown))))&&((this.defaultValueAge == rhs.defaultValueAge)||((this.defaultValueAge!= null)&&this.defaultValueAge.equals(rhs.defaultValueAge))))&&((this.isModifier == rhs.isModifier)||((this.isModifier!= null)&&this.isModifier.equals(rhs.isModifier))))&&((this._defaultValueDecimal == rhs._defaultValueDecimal)||((this._defaultValueDecimal!= null)&&this._defaultValueDecimal.equals(rhs._defaultValueDecimal))))&&((this._fixedId == rhs._fixedId)||((this._fixedId!= null)&&this._fixedId.equals(rhs._fixedId))))&&((this.defaultValueDataRequirement == rhs.defaultValueDataRequirement)||((this.defaultValueDataRequirement!= null)&&this.defaultValueDataRequirement.equals(rhs.defaultValueDataRequirement))))&&((this.orderMeaning == rhs.orderMeaning)||((this.orderMeaning!= null)&&this.orderMeaning.equals(rhs.orderMeaning))))&&((this.fixedDosage == rhs.fixedDosage)||((this.fixedDosage!= null)&&this.fixedDosage.equals(rhs.fixedDosage))))&&((this.defaultValueParameterDefinition == rhs.defaultValueParameterDefinition)||((this.defaultValueParameterDefinition!= null)&&this.defaultValueParameterDefinition.equals(rhs.defaultValueParameterDefinition))))&&((this.defaultValueReference == rhs.defaultValueReference)||((this.defaultValueReference!= null)&&this.defaultValueReference.equals(rhs.defaultValueReference))))&&((this.meaningWhenMissing == rhs.meaningWhenMissing)||((this.meaningWhenMissing!= null)&&this.meaningWhenMissing.equals(rhs.meaningWhenMissing))))&&((this.patternMoney == rhs.patternMoney)||((this.patternMoney!= null)&&this.patternMoney.equals(rhs.patternMoney))))&&((this.defaultValueDuration == rhs.defaultValueDuration)||((this.defaultValueDuration!= null)&&this.defaultValueDuration.equals(rhs.defaultValueDuration))))&&((this.fixedAge == rhs.fixedAge)||((this.fixedAge!= null)&&this.fixedAge.equals(rhs.fixedAge))))&&((this.patternQuantity == rhs.patternQuantity)||((this.patternQuantity!= null)&&this.patternQuantity.equals(rhs.patternQuantity))))&&((this._minValueInstant == rhs._minValueInstant)||((this._minValueInstant!= null)&&this._minValueInstant.equals(rhs._minValueInstant))))&&((this.fixedCoding == rhs.fixedCoding)||((this.fixedCoding!= null)&&this.fixedCoding.equals(rhs.fixedCoding))))&&((this.patternCoding == rhs.patternCoding)||((this.patternCoding!= null)&&this.patternCoding.equals(rhs.patternCoding))))&&((this.example == rhs.example)||((this.example!= null)&&this.example.equals(rhs.example))))&&((this.maxValueDecimal == rhs.maxValueDecimal)||((this.maxValueDecimal!= null)&&this.maxValueDecimal.equals(rhs.maxValueDecimal))))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this.defaultValueContactPoint == rhs.defaultValueContactPoint)||((this.defaultValueContactPoint!= null)&&this.defaultValueContactPoint.equals(rhs.defaultValueContactPoint))))&&((this.defaultValueHumanName == rhs.defaultValueHumanName)||((this.defaultValueHumanName!= null)&&this.defaultValueHumanName.equals(rhs.defaultValueHumanName))))&&((this.fixedSampledData == rhs.fixedSampledData)||((this.fixedSampledData!= null)&&this.fixedSampledData.equals(rhs.fixedSampledData))))&&((this.minValueDecimal == rhs.minValueDecimal)||((this.minValueDecimal!= null)&&this.minValueDecimal.equals(rhs.minValueDecimal))))&&((this.defaultValueCodeableConcept == rhs.defaultValueCodeableConcept)||((this.defaultValueCodeableConcept!= null)&&this.defaultValueCodeableConcept.equals(rhs.defaultValueCodeableConcept))))&&((this._fixedBoolean == rhs._fixedBoolean)||((this._fixedBoolean!= null)&&this._fixedBoolean.equals(rhs._fixedBoolean))))&&((this.defaultValueDecimal == rhs.defaultValueDecimal)||((this.defaultValueDecimal!= null)&&this.defaultValueDecimal.equals(rhs.defaultValueDecimal))))&&((this.fixedContributor == rhs.fixedContributor)||((this.fixedContributor!= null)&&this.fixedContributor.equals(rhs.fixedContributor))))&&((this.patternRelatedArtifact == rhs.patternRelatedArtifact)||((this.patternRelatedArtifact!= null)&&this.patternRelatedArtifact.equals(rhs.patternRelatedArtifact))))&&((this.sliceIsConstraining == rhs.sliceIsConstraining)||((this.sliceIsConstraining!= null)&&this.sliceIsConstraining.equals(rhs.sliceIsConstraining))))&&((this._fixedMarkdown == rhs._fixedMarkdown)||((this._fixedMarkdown!= null)&&this._fixedMarkdown.equals(rhs._fixedMarkdown))))&&((this.slicing == rhs.slicing)||((this.slicing!= null)&&this.slicing.equals(rhs.slicing))))&&((this.minValueTime == rhs.minValueTime)||((this.minValueTime!= null)&&this.minValueTime.equals(rhs.minValueTime))))&&((this.maxValueDateTime == rhs.maxValueDateTime)||((this.maxValueDateTime!= null)&&this.maxValueDateTime.equals(rhs.maxValueDateTime))))&&((this.patternCanonical == rhs.patternCanonical)||((this.patternCanonical!= null)&&this.patternCanonical.equals(rhs.patternCanonical))))&&((this._isSummary == rhs._isSummary)||((this._isSummary!= null)&&this._isSummary.equals(rhs._isSummary))))&&((this._path == rhs._path)||((this._path!= null)&&this._path.equals(rhs._path))))&&((this.patternBoolean == rhs.patternBoolean)||((this.patternBoolean!= null)&&this.patternBoolean.equals(rhs.patternBoolean))))&&((this.defaultValueCoding == rhs.defaultValueCoding)||((this.defaultValueCoding!= null)&&this.defaultValueCoding.equals(rhs.defaultValueCoding))))&&((this.patternAge == rhs.patternAge)||((this.patternAge!= null)&&this.patternAge.equals(rhs.patternAge))))&&((this._maxValueDecimal == rhs._maxValueDecimal)||((this._maxValueDecimal!= null)&&this._maxValueDecimal.equals(rhs._maxValueDecimal))))&&((this._fixedCanonical == rhs._fixedCanonical)||((this._fixedCanonical!= null)&&this._fixedCanonical.equals(rhs._fixedCanonical))))&&((this._condition == rhs._condition)||((this._condition!= null)&&this._condition.equals(rhs._condition))))&&((this.patternPeriod == rhs.patternPeriod)||((this.patternPeriod!= null)&&this.patternPeriod.equals(rhs.patternPeriod))))&&((this.patternDataRequirement == rhs.patternDataRequirement)||((this.patternDataRequirement!= null)&&this.patternDataRequirement.equals(rhs.patternDataRequirement))))&&((this._requirements == rhs._requirements)||((this._requirements!= null)&&this._requirements.equals(rhs._requirements))))&&((this.patternContributor == rhs.patternContributor)||((this.patternContributor!= null)&&this.patternContributor.equals(rhs.patternContributor))))&&((this._representation == rhs._representation)||((this._representation!= null)&&this._representation.equals(rhs._representation))))&&((this.fixedDateTime == rhs.fixedDateTime)||((this.fixedDateTime!= null)&&this.fixedDateTime.equals(rhs.fixedDateTime))))&&((this.patternUri == rhs.patternUri)||((this.patternUri!= null)&&this.patternUri.equals(rhs.patternUri))))&&((this.patternUrl == rhs.patternUrl)||((this.patternUrl!= null)&&this.patternUrl.equals(rhs.patternUrl))))&&((this.fixedUsageContext == rhs.fixedUsageContext)||((this.fixedUsageContext!= null)&&this.fixedUsageContext.equals(rhs.fixedUsageContext))))&&((this._defaultValuePositiveInt == rhs._defaultValuePositiveInt)||((this._defaultValuePositiveInt!= null)&&this._defaultValuePositiveInt.equals(rhs._defaultValuePositiveInt))))&&((this.patternId == rhs.patternId)||((this.patternId!= null)&&this.patternId.equals(rhs.patternId))))&&((this._max == rhs._max)||((this._max!= null)&&this._max.equals(rhs._max))))&&((this._mustSupport == rhs._mustSupport)||((this._mustSupport!= null)&&this._mustSupport.equals(rhs._mustSupport))))&&((this.defaultValueSignature == rhs.defaultValueSignature)||((this.defaultValueSignature!= null)&&this.defaultValueSignature.equals(rhs.defaultValueSignature))))&&((this.patternSampledData == rhs.patternSampledData)||((this.patternSampledData!= null)&&this.patternSampledData.equals(rhs.patternSampledData))))&&((this.__short == rhs.__short)||((this.__short!= null)&&this.__short.equals(rhs.__short))))&&((this.defaultValueInstant == rhs.defaultValueInstant)||((this.defaultValueInstant!= null)&&this.defaultValueInstant.equals(rhs.defaultValueInstant))))&&((this._defaultValueDate == rhs._defaultValueDate)||((this._defaultValueDate!= null)&&this._defaultValueDate.equals(rhs._defaultValueDate))))&&((this._patternMarkdown == rhs._patternMarkdown)||((this._patternMarkdown!= null)&&this._patternMarkdown.equals(rhs._patternMarkdown))))&&((this.patternHumanName == rhs.patternHumanName)||((this.patternHumanName!= null)&&this.patternHumanName.equals(rhs.patternHumanName))))&&((this._patternPositiveInt == rhs._patternPositiveInt)||((this._patternPositiveInt!= null)&&this._patternPositiveInt.equals(rhs._patternPositiveInt))))&&((this._definition == rhs._definition)||((this._definition!= null)&&this._definition.equals(rhs._definition))))&&((this.defaultValueUrl == rhs.defaultValueUrl)||((this.defaultValueUrl!= null)&&this.defaultValueUrl.equals(rhs.defaultValueUrl))))&&((this.defaultValueUri == rhs.defaultValueUri)||((this.defaultValueUri!= null)&&this.defaultValueUri.equals(rhs.defaultValueUri))))&&((this._maxValueTime == rhs._maxValueTime)||((this._maxValueTime!= null)&&this._maxValueTime.equals(rhs._maxValueTime))))&&((this.fixedAnnotation == rhs.fixedAnnotation)||((this.fixedAnnotation!= null)&&this.fixedAnnotation.equals(rhs.fixedAnnotation))))&&((this._fixedDecimal == rhs._fixedDecimal)||((this._fixedDecimal!= null)&&this._fixedDecimal.equals(rhs._fixedDecimal))))&&((this._defaultValueId == rhs._defaultValueId)||((this._defaultValueId!= null)&&this._defaultValueId.equals(rhs._defaultValueId))))&&((this._isModifierReason == rhs._isModifierReason)||((this._isModifierReason!= null)&&this._isModifierReason.equals(rhs._isModifierReason))))&&((this.fixedIdentifier == rhs.fixedIdentifier)||((this.fixedIdentifier!= null)&&this.fixedIdentifier.equals(rhs.fixedIdentifier))))&&((this.fixedReference == rhs.fixedReference)||((this.fixedReference!= null)&&this.fixedReference.equals(rhs.fixedReference))))&&((this._defaultValueUuid == rhs._defaultValueUuid)||((this._defaultValueUuid!= null)&&this._defaultValueUuid.equals(rhs._defaultValueUuid))))&&((this.defaultValueUsageContext == rhs.defaultValueUsageContext)||((this.defaultValueUsageContext!= null)&&this.defaultValueUsageContext.equals(rhs.defaultValueUsageContext))))&&((this.fixedAttachment == rhs.fixedAttachment)||((this.fixedAttachment!= null)&&this.fixedAttachment.equals(rhs.fixedAttachment))))&&((this._fixedUrl == rhs._fixedUrl)||((this._fixedUrl!= null)&&this._fixedUrl.equals(rhs._fixedUrl))))&&((this.fixedTiming == rhs.fixedTiming)||((this.fixedTiming!= null)&&this.fixedTiming.equals(rhs.fixedTiming))))&&((this._minValueDecimal == rhs._minValueDecimal)||((this._minValueDecimal!= null)&&this._minValueDecimal.equals(rhs._minValueDecimal))))&&((this.patternSignature == rhs.patternSignature)||((this.patternSignature!= null)&&this.patternSignature.equals(rhs.patternSignature))))&&((this._fixedUri == rhs._fixedUri)||((this._fixedUri!= null)&&this._fixedUri.equals(rhs._fixedUri))))&&((this.patternDateTime == rhs.patternDateTime)||((this.patternDateTime!= null)&&this.patternDateTime.equals(rhs.patternDateTime))))&&((this._patternCode == rhs._patternCode)||((this._patternCode!= null)&&this._patternCode.equals(rhs._patternCode))))&&((this.isModifierReason == rhs.isModifierReason)||((this.isModifierReason!= null)&&this.isModifierReason.equals(rhs.isModifierReason))))&&((this._patternId == rhs._patternId)||((this._patternId!= null)&&this._patternId.equals(rhs._patternId))))&&((this._patternUuid == rhs._patternUuid)||((this._patternUuid!= null)&&this._patternUuid.equals(rhs._patternUuid))))&&((this._patternBase64Binary == rhs._patternBase64Binary)||((this._patternBase64Binary!= null)&&this._patternBase64Binary.equals(rhs._patternBase64Binary))))&&((this._defaultValueMarkdown == rhs._defaultValueMarkdown)||((this._defaultValueMarkdown!= null)&&this._defaultValueMarkdown.equals(rhs._defaultValueMarkdown))))&&((this.defaultValueRange == rhs.defaultValueRange)||((this.defaultValueRange!= null)&&this.defaultValueRange.equals(rhs.defaultValueRange))))&&((this.maxValueDate == rhs.maxValueDate)||((this.maxValueDate!= null)&&this.maxValueDate.equals(rhs.maxValueDate))))&&((this.defaultValueUnsignedInt == rhs.defaultValueUnsignedInt)||((this.defaultValueUnsignedInt!= null)&&this.defaultValueUnsignedInt.equals(rhs.defaultValueUnsignedInt))))&&((this.fixedContactPoint == rhs.fixedContactPoint)||((this.fixedContactPoint!= null)&&this.fixedContactPoint.equals(rhs.fixedContactPoint))))&&((this.representation == rhs.representation)||((this.representation!= null)&&this.representation.equals(rhs.representation))))&&((this.defaultValueTime == rhs.defaultValueTime)||((this.defaultValueTime!= null)&&this.defaultValueTime.equals(rhs.defaultValueTime))))&&((this.fixedInteger == rhs.fixedInteger)||((this.fixedInteger!= null)&&this.fixedInteger.equals(rhs.fixedInteger))))&&((this._defaultValueBase64Binary == rhs._defaultValueBase64Binary)||((this._defaultValueBase64Binary!= null)&&this._defaultValueBase64Binary.equals(rhs._defaultValueBase64Binary))))&&((this.patternParameterDefinition == rhs.patternParameterDefinition)||((this.patternParameterDefinition!= null)&&this.patternParameterDefinition.equals(rhs.patternParameterDefinition))))&&((this.minValuePositiveInt == rhs.minValuePositiveInt)||((this.minValuePositiveInt!= null)&&this.minValuePositiveInt.equals(rhs.minValuePositiveInt))))&&((this.defaultValueDistance == rhs.defaultValueDistance)||((this.defaultValueDistance!= null)&&this.defaultValueDistance.equals(rhs.defaultValueDistance))))&&((this._fixedString == rhs._fixedString)||((this._fixedString!= null)&&this._fixedString.equals(rhs._fixedString))))&&((this.patternInstant == rhs.patternInstant)||((this.patternInstant!= null)&&this.patternInstant.equals(rhs.patternInstant))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this.patternRange == rhs.patternRange)||((this.patternRange!= null)&&this.patternRange.equals(rhs.patternRange))))&&((this.defaultValueCanonical == rhs.defaultValueCanonical)||((this.defaultValueCanonical!= null)&&this.defaultValueCanonical.equals(rhs.defaultValueCanonical))))&&((this.fixedPositiveInt == rhs.fixedPositiveInt)||((this.fixedPositiveInt!= null)&&this.fixedPositiveInt.equals(rhs.fixedPositiveInt))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.fixedTime == rhs.fixedTime)||((this.fixedTime!= null)&&this.fixedTime.equals(rhs.fixedTime))))&&((this.defaultValueOid == rhs.defaultValueOid)||((this.defaultValueOid!= null)&&this.defaultValueOid.equals(rhs.defaultValueOid))))&&((this._patternInteger == rhs._patternInteger)||((this._patternInteger!= null)&&this._patternInteger.equals(rhs._patternInteger))))&&((this.fixedParameterDefinition == rhs.fixedParameterDefinition)||((this.fixedParameterDefinition!= null)&&this.fixedParameterDefinition.equals(rhs.fixedParameterDefinition))))&&((this.minValueInteger == rhs.minValueInteger)||((this.minValueInteger!= null)&&this.minValueInteger.equals(rhs.minValueInteger))))&&((this._alias == rhs._alias)||((this._alias!= null)&&this._alias.equals(rhs._alias))))&&((this._defaultValueInstant == rhs._defaultValueInstant)||((this._defaultValueInstant!= null)&&this._defaultValueInstant.equals(rhs._defaultValueInstant))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this._patternDate == rhs._patternDate)||((this._patternDate!= null)&&this._patternDate.equals(rhs._patternDate))))&&((this._minValueUnsignedInt == rhs._minValueUnsignedInt)||((this._minValueUnsignedInt!= null)&&this._minValueUnsignedInt.equals(rhs._minValueUnsignedInt))))&&((this.fixedCanonical == rhs.fixedCanonical)||((this.fixedCanonical!= null)&&this.fixedCanonical.equals(rhs.fixedCanonical))))&&((this.patternTime == rhs.patternTime)||((this.patternTime!= null)&&this.patternTime.equals(rhs.patternTime))))&&((this.base == rhs.base)||((this.base!= null)&&this.base.equals(rhs.base))))&&((this._contentReference == rhs._contentReference)||((this._contentReference!= null)&&this._contentReference.equals(rhs._contentReference))))&&((this.defaultValueString == rhs.defaultValueString)||((this.defaultValueString!= null)&&this.defaultValueString.equals(rhs.defaultValueString))))&&((this._patternInstant == rhs._patternInstant)||((this._patternInstant!= null)&&this._patternInstant.equals(rhs._patternInstant))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.fixedCode == rhs.fixedCode)||((this.fixedCode!= null)&&this.fixedCode.equals(rhs.fixedCode))))&&((this.patternReference == rhs.patternReference)||((this.patternReference!= null)&&this.patternReference.equals(rhs.patternReference))))&&((this.binding == rhs.binding)||((this.binding!= null)&&this.binding.equals(rhs.binding))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._maxValuePositiveInt == rhs._maxValuePositiveInt)||((this._maxValuePositiveInt!= null)&&this._maxValuePositiveInt.equals(rhs._maxValuePositiveInt))))&&((this.fixedMarkdown == rhs.fixedMarkdown)||((this.fixedMarkdown!= null)&&this.fixedMarkdown.equals(rhs.fixedMarkdown))))&&((this.defaultValueQuantity == rhs.defaultValueQuantity)||((this.defaultValueQuantity!= null)&&this.defaultValueQuantity.equals(rhs.defaultValueQuantity))))&&((this.fixedMeta == rhs.fixedMeta)||((this.fixedMeta!= null)&&this.fixedMeta.equals(rhs.fixedMeta))))&&((this.fixedTriggerDefinition == rhs.fixedTriggerDefinition)||((this.fixedTriggerDefinition!= null)&&this.fixedTriggerDefinition.equals(rhs.fixedTriggerDefinition))))&&((this.fixedRelatedArtifact == rhs.fixedRelatedArtifact)||((this.fixedRelatedArtifact!= null)&&this.fixedRelatedArtifact.equals(rhs.fixedRelatedArtifact))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._fixedOid == rhs._fixedOid)||((this._fixedOid!= null)&&this._fixedOid.equals(rhs._fixedOid))))&&((this.fixedContactDetail == rhs.fixedContactDetail)||((this.fixedContactDetail!= null)&&this.fixedContactDetail.equals(rhs.fixedContactDetail))))&&((this._defaultValueInteger == rhs._defaultValueInteger)||((this._defaultValueInteger!= null)&&this._defaultValueInteger.equals(rhs._defaultValueInteger))))&&((this._defaultValueUnsignedInt == rhs._defaultValueUnsignedInt)||((this._defaultValueUnsignedInt!= null)&&this._defaultValueUnsignedInt.equals(rhs._defaultValueUnsignedInt))))&&((this.fixedBoolean == rhs.fixedBoolean)||((this.fixedBoolean!= null)&&this.fixedBoolean.equals(rhs.fixedBoolean))))&&((this.fixedOid == rhs.fixedOid)||((this.fixedOid!= null)&&this.fixedOid.equals(rhs.fixedOid))))&&((this.patternDuration == rhs.patternDuration)||((this.patternDuration!= null)&&this.patternDuration.equals(rhs.patternDuration))))&&((this.patternUsageContext == rhs.patternUsageContext)||((this.patternUsageContext!= null)&&this.patternUsageContext.equals(rhs.patternUsageContext))))&&((this.mapping == rhs.mapping)||((this.mapping!= null)&&this.mapping.equals(rhs.mapping))))&&((this.defaultValueExpression == rhs.defaultValueExpression)||((this.defaultValueExpression!= null)&&this.defaultValueExpression.equals(rhs.defaultValueExpression))))&&((this.fixedRange == rhs.fixedRange)||((this.fixedRange!= null)&&this.fixedRange.equals(rhs.fixedRange))))&&((this._isModifier == rhs._isModifier)||((this._isModifier!= null)&&this._isModifier.equals(rhs._isModifier))))&&((this.fixedAddress == rhs.fixedAddress)||((this.fixedAddress!= null)&&this.fixedAddress.equals(rhs.fixedAddress))))&&((this.patternDate == rhs.patternDate)||((this.patternDate!= null)&&this.patternDate.equals(rhs.patternDate))))&&((this.patternOid == rhs.patternOid)||((this.patternOid!= null)&&this.patternOid.equals(rhs.patternOid))))&&((this.patternExpression == rhs.patternExpression)||((this.patternExpression!= null)&&this.patternExpression.equals(rhs.patternExpression))))&&((this._fixedTime == rhs._fixedTime)||((this._fixedTime!= null)&&this._fixedTime.equals(rhs._fixedTime))))&&((this.maxValueInteger == rhs.maxValueInteger)||((this.maxValueInteger!= null)&&this.maxValueInteger.equals(rhs.maxValueInteger))))&&((this.fixedDuration == rhs.fixedDuration)||((this.fixedDuration!= null)&&this.fixedDuration.equals(rhs.fixedDuration))))&&((this.patternBase64Binary == rhs.patternBase64Binary)||((this.patternBase64Binary!= null)&&this.patternBase64Binary.equals(rhs.patternBase64Binary))))&&((this.fixedPeriod == rhs.fixedPeriod)||((this.fixedPeriod!= null)&&this.fixedPeriod.equals(rhs.fixedPeriod))))&&((this.patternRatio == rhs.patternRatio)||((this.patternRatio!= null)&&this.patternRatio.equals(rhs.patternRatio))))&&((this.defaultValueDate == rhs.defaultValueDate)||((this.defaultValueDate!= null)&&this.defaultValueDate.equals(rhs.defaultValueDate))))&&((this._orderMeaning == rhs._orderMeaning)||((this._orderMeaning!= null)&&this._orderMeaning.equals(rhs._orderMeaning))))&&((this.patternString == rhs.patternString)||((this.patternString!= null)&&this.patternString.equals(rhs.patternString))))&&((this._fixedBase64Binary == rhs._fixedBase64Binary)||((this._fixedBase64Binary!= null)&&this._fixedBase64Binary.equals(rhs._fixedBase64Binary))))&&((this.defaultValueContactDetail == rhs.defaultValueContactDetail)||((this.defaultValueContactDetail!= null)&&this.defaultValueContactDetail.equals(rhs.defaultValueContactDetail))))&&((this.maxValuePositiveInt == rhs.maxValuePositiveInt)||((this.maxValuePositiveInt!= null)&&this.maxValuePositiveInt.equals(rhs.maxValuePositiveInt))))&&((this._defaultValueCanonical == rhs._defaultValueCanonical)||((this._defaultValueCanonical!= null)&&this._defaultValueCanonical.equals(rhs._defaultValueCanonical))))&&((this._defaultValueBoolean == rhs._defaultValueBoolean)||((this._defaultValueBoolean!= null)&&this._defaultValueBoolean.equals(rhs._defaultValueBoolean))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._patternUrl == rhs._patternUrl)||((this._patternUrl!= null)&&this._patternUrl.equals(rhs._patternUrl))))&&((this._patternUri == rhs._patternUri)||((this._patternUri!= null)&&this._patternUri.equals(rhs._patternUri))))&&((this._fixedPositiveInt == rhs._fixedPositiveInt)||((this._fixedPositiveInt!= null)&&this._fixedPositiveInt.equals(rhs._fixedPositiveInt))))&&((this.minValueDate == rhs.minValueDate)||((this.minValueDate!= null)&&this.minValueDate.equals(rhs.minValueDate))))&&((this._defaultValueUrl == rhs._defaultValueUrl)||((this._defaultValueUrl!= null)&&this._defaultValueUrl.equals(rhs._defaultValueUrl))))&&((this.minValueUnsignedInt == rhs.minValueUnsignedInt)||((this.minValueUnsignedInt!= null)&&this.minValueUnsignedInt.equals(rhs.minValueUnsignedInt))))&&((this._defaultValueCode == rhs._defaultValueCode)||((this._defaultValueCode!= null)&&this._defaultValueCode.equals(rhs._defaultValueCode))))&&((this.patternMarkdown == rhs.patternMarkdown)||((this.patternMarkdown!= null)&&this.patternMarkdown.equals(rhs.patternMarkdown))))&&((this.defaultValueTriggerDefinition == rhs.defaultValueTriggerDefinition)||((this.defaultValueTriggerDefinition!= null)&&this.defaultValueTriggerDefinition.equals(rhs.defaultValueTriggerDefinition))))&&((this._patternDecimal == rhs._patternDecimal)||((this._patternDecimal!= null)&&this._patternDecimal.equals(rhs._patternDecimal))))&&((this.maxValueTime == rhs.maxValueTime)||((this.maxValueTime!= null)&&this.maxValueTime.equals(rhs.maxValueTime))))&&((this.defaultValueAnnotation == rhs.defaultValueAnnotation)||((this.defaultValueAnnotation!= null)&&this.defaultValueAnnotation.equals(rhs.defaultValueAnnotation))))&&((this.fixedMoney == rhs.fixedMoney)||((this.fixedMoney!= null)&&this.fixedMoney.equals(rhs.fixedMoney))))&&((this._patternUnsignedInt == rhs._patternUnsignedInt)||((this._patternUnsignedInt!= null)&&this._patternUnsignedInt.equals(rhs._patternUnsignedInt))))&&((this.defaultValuePeriod == rhs.defaultValuePeriod)||((this.defaultValuePeriod!= null)&&this.defaultValuePeriod.equals(rhs.defaultValuePeriod))))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.patternAnnotation == rhs.patternAnnotation)||((this.patternAnnotation!= null)&&this.patternAnnotation.equals(rhs.patternAnnotation))))&&((this.defaultValuePositiveInt == rhs.defaultValuePositiveInt)||((this.defaultValuePositiveInt!= null)&&this.defaultValuePositiveInt.equals(rhs.defaultValuePositiveInt))))&&((this.fixedCodeableConcept == rhs.fixedCodeableConcept)||((this.fixedCodeableConcept!= null)&&this.fixedCodeableConcept.equals(rhs.fixedCodeableConcept))))&&((this._defaultValueUri == rhs._defaultValueUri)||((this._defaultValueUri!= null)&&this._defaultValueUri.equals(rhs._defaultValueUri))))&&((this.fixedHumanName == rhs.fixedHumanName)||((this.fixedHumanName!= null)&&this.fixedHumanName.equals(rhs.fixedHumanName))))&&((this.fixedUnsignedInt == rhs.fixedUnsignedInt)||((this.fixedUnsignedInt!= null)&&this.fixedUnsignedInt.equals(rhs.fixedUnsignedInt))))&&((this.constraint == rhs.constraint)||((this.constraint!= null)&&this.constraint.equals(rhs.constraint))))&&((this.patternInteger == rhs.patternInteger)||((this.patternInteger!= null)&&this.patternInteger.equals(rhs.patternInteger))))&&((this.patternDosage == rhs.patternDosage)||((this.patternDosage!= null)&&this.patternDosage.equals(rhs.patternDosage))))&&((this.defaultValueDosage == rhs.defaultValueDosage)||((this.defaultValueDosage!= null)&&this.defaultValueDosage.equals(rhs.defaultValueDosage))))&&((this.maxValueInstant == rhs.maxValueInstant)||((this.maxValueInstant!= null)&&this.maxValueInstant.equals(rhs.maxValueInstant))))&&((this._patternString == rhs._patternString)||((this._patternString!= null)&&this._patternString.equals(rhs._patternString))))&&((this._maxValueDate == rhs._maxValueDate)||((this._maxValueDate!= null)&&this._maxValueDate.equals(rhs._maxValueDate))))&&((this.patternUnsignedInt == rhs.patternUnsignedInt)||((this.patternUnsignedInt!= null)&&this.patternUnsignedInt.equals(rhs.patternUnsignedInt))))&&((this.patternDecimal == rhs.patternDecimal)||((this.patternDecimal!= null)&&this.patternDecimal.equals(rhs.patternDecimal))))&&((this.minValueDateTime == rhs.minValueDateTime)||((this.minValueDateTime!= null)&&this.minValueDateTime.equals(rhs.minValueDateTime))))&&((this._patternCanonical == rhs._patternCanonical)||((this._patternCanonical!= null)&&this._patternCanonical.equals(rhs._patternCanonical))))&&((this._fixedInteger == rhs._fixedInteger)||((this._fixedInteger!= null)&&this._fixedInteger.equals(rhs._fixedInteger))))&&((this._maxValueInteger == rhs._maxValueInteger)||((this._maxValueInteger!= null)&&this._maxValueInteger.equals(rhs._maxValueInteger))))&&((this.fixedDistance == rhs.fixedDistance)||((this.fixedDistance!= null)&&this.fixedDistance.equals(rhs.fixedDistance))))&&((this.patternAttachment == rhs.patternAttachment)||((this.patternAttachment!= null)&&this.patternAttachment.equals(rhs.patternAttachment))))&&((this.defaultValueBoolean == rhs.defaultValueBoolean)||((this.defaultValueBoolean!= null)&&this.defaultValueBoolean.equals(rhs.defaultValueBoolean))))&&((this.defaultValueRatio == rhs.defaultValueRatio)||((this.defaultValueRatio!= null)&&this.defaultValueRatio.equals(rhs.defaultValueRatio))))&&((this.patternAddress == rhs.patternAddress)||((this.patternAddress!= null)&&this.patternAddress.equals(rhs.patternAddress))))&&((this._defaultValueOid == rhs._defaultValueOid)||((this._defaultValueOid!= null)&&this._defaultValueOid.equals(rhs._defaultValueOid))))&&((this._maxValueUnsignedInt == rhs._maxValueUnsignedInt)||((this._maxValueUnsignedInt!= null)&&this._maxValueUnsignedInt.equals(rhs._maxValueUnsignedInt))))&&((this.defaultValueMeta == rhs.defaultValueMeta)||((this.defaultValueMeta!= null)&&this.defaultValueMeta.equals(rhs.defaultValueMeta))))&&((this.defaultValueMoney == rhs.defaultValueMoney)||((this.defaultValueMoney!= null)&&this.defaultValueMoney.equals(rhs.defaultValueMoney))))&&((this._defaultValueString == rhs._defaultValueString)||((this._defaultValueString!= null)&&this._defaultValueString.equals(rhs._defaultValueString))))&&((this.fixedBase64Binary == rhs.fixedBase64Binary)||((this.fixedBase64Binary!= null)&&this.fixedBase64Binary.equals(rhs.fixedBase64Binary))))&&((this.defaultValueBase64Binary == rhs.defaultValueBase64Binary)||((this.defaultValueBase64Binary!= null)&&this.defaultValueBase64Binary.equals(rhs.defaultValueBase64Binary))))&&((this.defaultValueAddress == rhs.defaultValueAddress)||((this.defaultValueAddress!= null)&&this.defaultValueAddress.equals(rhs.defaultValueAddress))))&&((this.defaultValueIdentifier == rhs.defaultValueIdentifier)||((this.defaultValueIdentifier!= null)&&this.defaultValueIdentifier.equals(rhs.defaultValueIdentifier))))&&((this._patternOid == rhs._patternOid)||((this._patternOid!= null)&&this._patternOid.equals(rhs._patternOid))))&&((this.patternContactPoint == rhs.patternContactPoint)||((this.patternContactPoint!= null)&&this.patternContactPoint.equals(rhs.patternContactPoint))))&&((this._defaultValueTime == rhs._defaultValueTime)||((this._defaultValueTime!= null)&&this._defaultValueTime.equals(rhs._defaultValueTime))))&&((this.minValueInstant == rhs.minValueInstant)||((this.minValueInstant!= null)&&this.minValueInstant.equals(rhs.minValueInstant))))&&((this.defaultValueId == rhs.defaultValueId)||((this.defaultValueId!= null)&&this.defaultValueId.equals(rhs.defaultValueId))))&&((this.isSummary == rhs.isSummary)||((this.isSummary!= null)&&this.isSummary.equals(rhs.isSummary))))&&((this._sliceName == rhs._sliceName)||((this._sliceName!= null)&&this._sliceName.equals(rhs._sliceName))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.patternIdentifier == rhs.patternIdentifier)||((this.patternIdentifier!= null)&&this.patternIdentifier.equals(rhs.patternIdentifier))))&&((this.defaultValueAttachment == rhs.defaultValueAttachment)||((this.defaultValueAttachment!= null)&&this.defaultValueAttachment.equals(rhs.defaultValueAttachment))))&&((this.fixedCount == rhs.fixedCount)||((this.fixedCount!= null)&&this.fixedCount.equals(rhs.fixedCount))))&&((this.maxLength == rhs.maxLength)||((this.maxLength!= null)&&this.maxLength.equals(rhs.maxLength))))&&((this._min == rhs._min)||((this._min!= null)&&this._min.equals(rhs._min))))&&((this.fixedUuid == rhs.fixedUuid)||((this.fixedUuid!= null)&&this.fixedUuid.equals(rhs.fixedUuid))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._meaningWhenMissing == rhs._meaningWhenMissing)||((this._meaningWhenMissing!= null)&&this._meaningWhenMissing.equals(rhs._meaningWhenMissing))))&&((this.fixedDate == rhs.fixedDate)||((this.fixedDate!= null)&&this.fixedDate.equals(rhs.fixedDate))))&&((this._fixedCode == rhs._fixedCode)||((this._fixedCode!= null)&&this._fixedCode.equals(rhs._fixedCode))))&&((this.maxValueUnsignedInt == rhs.maxValueUnsignedInt)||((this.maxValueUnsignedInt!= null)&&this.maxValueUnsignedInt.equals(rhs.maxValueUnsignedInt))))&&((this.defaultValueSampledData == rhs.defaultValueSampledData)||((this.defaultValueSampledData!= null)&&this.defaultValueSampledData.equals(rhs.defaultValueSampledData))))&&((this.patternMeta == rhs.patternMeta)||((this.patternMeta!= null)&&this.patternMeta.equals(rhs.patternMeta))))&&((this._defaultValueDateTime == rhs._defaultValueDateTime)||((this._defaultValueDateTime!= null)&&this._defaultValueDateTime.equals(rhs._defaultValueDateTime))))&&((this.defaultValueInteger == rhs.defaultValueInteger)||((this.defaultValueInteger!= null)&&this.defaultValueInteger.equals(rhs.defaultValueInteger))))&&((this._fixedDateTime == rhs._fixedDateTime)||((this._fixedDateTime!= null)&&this._fixedDateTime.equals(rhs._fixedDateTime))))&&((this.patternTriggerDefinition == rhs.patternTriggerDefinition)||((this.patternTriggerDefinition!= null)&&this.patternTriggerDefinition.equals(rhs.patternTriggerDefinition))))&&((this._label == rhs._label)||((this._label!= null)&&this._label.equals(rhs._label))))&&((this.maxValueQuantity == rhs.maxValueQuantity)||((this.maxValueQuantity!= null)&&this.maxValueQuantity.equals(rhs.maxValueQuantity))))&&((this.defaultValueRelatedArtifact == rhs.defaultValueRelatedArtifact)||((this.defaultValueRelatedArtifact!= null)&&this.defaultValueRelatedArtifact.equals(rhs.defaultValueRelatedArtifact))))&&((this._fixedInstant == rhs._fixedInstant)||((this._fixedInstant!= null)&&this._fixedInstant.equals(rhs._fixedInstant))))&&((this._patternTime == rhs._patternTime)||((this._patternTime!= null)&&this._patternTime.equals(rhs._patternTime))))&&((this._maxValueDateTime == rhs._maxValueDateTime)||((this._maxValueDateTime!= null)&&this._maxValueDateTime.equals(rhs._maxValueDateTime))))&&((this.defaultValueDateTime == rhs.defaultValueDateTime)||((this.defaultValueDateTime!= null)&&this.defaultValueDateTime.equals(rhs.defaultValueDateTime))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.defaultValueUuid == rhs.defaultValueUuid)||((this.defaultValueUuid!= null)&&this.defaultValueUuid.equals(rhs.defaultValueUuid))))&&((this._fixedUnsignedInt == rhs._fixedUnsignedInt)||((this._fixedUnsignedInt!= null)&&this._fixedUnsignedInt.equals(rhs._fixedUnsignedInt))))&&((this._short == rhs._short)||((this._short!= null)&&this._short.equals(rhs._short))))&&((this._minValueDateTime == rhs._minValueDateTime)||((this._minValueDateTime!= null)&&this._minValueDateTime.equals(rhs._minValueDateTime))))&&((this.defaultValueCount == rhs.defaultValueCount)||((this.defaultValueCount!= null)&&this.defaultValueCount.equals(rhs.defaultValueCount))))&&((this.patternContactDetail == rhs.patternContactDetail)||((this.patternContactDetail!= null)&&this.patternContactDetail.equals(rhs.patternContactDetail))))&&((this.requirements == rhs.requirements)||((this.requirements!= null)&&this.requirements.equals(rhs.requirements))))&&((this.defaultValueContributor == rhs.defaultValueContributor)||((this.defaultValueContributor!= null)&&this.defaultValueContributor.equals(rhs.defaultValueContributor))))&&((this.minValueQuantity == rhs.minValueQuantity)||((this.minValueQuantity!= null)&&this.minValueQuantity.equals(rhs.minValueQuantity))))&&((this.mustSupport == rhs.mustSupport)||((this.mustSupport!= null)&&this.mustSupport.equals(rhs.mustSupport))))&&((this.patternCode == rhs.patternCode)||((this.patternCode!= null)&&this.patternCode.equals(rhs.patternCode))))&&((this.defaultValueTiming == rhs.defaultValueTiming)||((this.defaultValueTiming!= null)&&this.defaultValueTiming.equals(rhs.defaultValueTiming))))&&((this._minValueTime == rhs._minValueTime)||((this._minValueTime!= null)&&this._minValueTime.equals(rhs._minValueTime))))&&((this.patternUuid == rhs.patternUuid)||((this.patternUuid!= null)&&this.patternUuid.equals(rhs.patternUuid))))&&((this.patternDistance == rhs.patternDistance)||((this.patternDistance!= null)&&this.patternDistance.equals(rhs.patternDistance))))&&((this.patternCodeableConcept == rhs.patternCodeableConcept)||((this.patternCodeableConcept!= null)&&this.patternCodeableConcept.equals(rhs.patternCodeableConcept))))&&((this._minValueInteger == rhs._minValueInteger)||((this._minValueInteger!= null)&&this._minValueInteger.equals(rhs._minValueInteger))))&&((this.fixedUri == rhs.fixedUri)||((this.fixedUri!= null)&&this.fixedUri.equals(rhs.fixedUri))))&&((this.sliceName == rhs.sliceName)||((this.sliceName!= null)&&this.sliceName.equals(rhs.sliceName))))&&((this.fixedUrl == rhs.fixedUrl)||((this.fixedUrl!= null)&&this.fixedUrl.equals(rhs.fixedUrl))))&&((this.defaultValueCode == rhs.defaultValueCode)||((this.defaultValueCode!= null)&&this.defaultValueCode.equals(rhs.defaultValueCode))))&&((this.fixedDataRequirement == rhs.fixedDataRequirement)||((this.fixedDataRequirement!= null)&&this.fixedDataRequirement.equals(rhs.fixedDataRequirement))))&&((this.contentReference == rhs.contentReference)||((this.contentReference!= null)&&this.contentReference.equals(rhs.contentReference))))&&((this.patternTiming == rhs.patternTiming)||((this.patternTiming!= null)&&this.patternTiming.equals(rhs.patternTiming))))&&((this.fixedString == rhs.fixedString)||((this.fixedString!= null)&&this.fixedString.equals(rhs.fixedString))))&&((this.fixedRatio == rhs.fixedRatio)||((this.fixedRatio!= null)&&this.fixedRatio.equals(rhs.fixedRatio))))&&((this._maxLength == rhs._maxLength)||((this._maxLength!= null)&&this._maxLength.equals(rhs._maxLength))))&&((this.patternPositiveInt == rhs.patternPositiveInt)||((this.patternPositiveInt!= null)&&this.patternPositiveInt.equals(rhs.patternPositiveInt))))&&((this.patternCount == rhs.patternCount)||((this.patternCount!= null)&&this.patternCount.equals(rhs.patternCount))));
    }

}
