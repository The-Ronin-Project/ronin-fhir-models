
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
 * A Map of relationships between 2 structures that can be used to transform data.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "context",
    "_context",
    "min",
    "_min",
    "max",
    "_max",
    "type",
    "_type",
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
    "element",
    "_element",
    "listMode",
    "_listMode",
    "variable",
    "_variable",
    "condition",
    "_condition",
    "check",
    "_check",
    "logMessage",
    "_logMessage"
})
@Generated("jsonschema2pojo")
public class StructureMap_Source {

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String context;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_context")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _context;
    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    @JsonPropertyDescription("A whole number")
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueBase64Binary")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueBase64Binary;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBase64Binary")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueBase64Binary;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueBoolean")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private Boolean defaultValueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueBoolean;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueCanonical")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueCanonical;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueCode")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueCode;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueDate")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueDate;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueDateTime")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueDateTime;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueDecimal")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private Double defaultValueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueDecimal;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueId")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueId;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueInstant")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueInstant;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueInteger")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private Double defaultValueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueInteger;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueMarkdown")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueMarkdown;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueMarkdown")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueMarkdown;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueOid")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueOid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueOid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueOid;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValuePositiveInt")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private Double defaultValuePositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValuePositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValuePositiveInt;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueString")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueString;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueTime")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueTime;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUnsignedInt")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private Double defaultValueUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueUnsignedInt;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUri")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueUri;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUrl")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
    private String defaultValueUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_defaultValueUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _defaultValueUrl;
    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUuid")
    @JsonPropertyDescription("A value to use if there is no existing value in the source object.")
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("element")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String element;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_element")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _element;
    /**
     * How to handle the list mode for this element.
     * 
     */
    @JsonProperty("listMode")
    @JsonPropertyDescription("How to handle the list mode for this element.")
    private StructureMap_Source.ListMode listMode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_listMode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _listMode;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("variable")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String variable;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variable")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _variable;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String condition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_condition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _condition;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("check")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String check;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_check")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _check;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("logMessage")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String logMessage;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_logMessage")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _logMessage;

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_context")
    public Element get_context() {
        return _context;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_context")
    public void set_context(Element _context) {
        this._context = _context;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    /**
     * A whole number
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueBase64Binary")
    public String getDefaultValueBase64Binary() {
        return defaultValueBase64Binary;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueBoolean")
    public Boolean getDefaultValueBoolean() {
        return defaultValueBoolean;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueCanonical")
    public String getDefaultValueCanonical() {
        return defaultValueCanonical;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueCode")
    public String getDefaultValueCode() {
        return defaultValueCode;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueDate")
    public String getDefaultValueDate() {
        return defaultValueDate;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueDateTime")
    public String getDefaultValueDateTime() {
        return defaultValueDateTime;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueDecimal")
    public Double getDefaultValueDecimal() {
        return defaultValueDecimal;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueId")
    public String getDefaultValueId() {
        return defaultValueId;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueInstant")
    public String getDefaultValueInstant() {
        return defaultValueInstant;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueInteger")
    public Double getDefaultValueInteger() {
        return defaultValueInteger;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueMarkdown")
    public String getDefaultValueMarkdown() {
        return defaultValueMarkdown;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueOid")
    public String getDefaultValueOid() {
        return defaultValueOid;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValuePositiveInt")
    public Double getDefaultValuePositiveInt() {
        return defaultValuePositiveInt;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueString")
    public String getDefaultValueString() {
        return defaultValueString;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueTime")
    public String getDefaultValueTime() {
        return defaultValueTime;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUnsignedInt")
    public Double getDefaultValueUnsignedInt() {
        return defaultValueUnsignedInt;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUri")
    public String getDefaultValueUri() {
        return defaultValueUri;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUrl")
    public String getDefaultValueUrl() {
        return defaultValueUrl;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A value to use if there is no existing value in the source object.
     * 
     */
    @JsonProperty("defaultValueUuid")
    public String getDefaultValueUuid() {
        return defaultValueUuid;
    }

    /**
     * A value to use if there is no existing value in the source object.
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("element")
    public String getElement() {
        return element;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("element")
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_element")
    public Element get_element() {
        return _element;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_element")
    public void set_element(Element _element) {
        this._element = _element;
    }

    /**
     * How to handle the list mode for this element.
     * 
     */
    @JsonProperty("listMode")
    public StructureMap_Source.ListMode getListMode() {
        return listMode;
    }

    /**
     * How to handle the list mode for this element.
     * 
     */
    @JsonProperty("listMode")
    public void setListMode(StructureMap_Source.ListMode listMode) {
        this.listMode = listMode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_listMode")
    public Element get_listMode() {
        return _listMode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_listMode")
    public void set_listMode(Element _listMode) {
        this._listMode = _listMode;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("variable")
    public String getVariable() {
        return variable;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("variable")
    public void setVariable(String variable) {
        this.variable = variable;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variable")
    public Element get_variable() {
        return _variable;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variable")
    public void set_variable(Element _variable) {
        this._variable = _variable;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_condition")
    public Element get_condition() {
        return _condition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_condition")
    public void set_condition(Element _condition) {
        this._condition = _condition;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("check")
    public String getCheck() {
        return check;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("check")
    public void setCheck(String check) {
        this.check = check;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_check")
    public Element get_check() {
        return _check;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_check")
    public void set_check(Element _check) {
        this._check = _check;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("logMessage")
    public String getLogMessage() {
        return logMessage;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("logMessage")
    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_logMessage")
    public Element get_logMessage() {
        return _logMessage;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_logMessage")
    public void set_logMessage(Element _logMessage) {
        this._logMessage = _logMessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StructureMap_Source.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("_context");
        sb.append('=');
        sb.append(((this._context == null)?"<null>":this._context));
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
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
        sb.append("element");
        sb.append('=');
        sb.append(((this.element == null)?"<null>":this.element));
        sb.append(',');
        sb.append("_element");
        sb.append('=');
        sb.append(((this._element == null)?"<null>":this._element));
        sb.append(',');
        sb.append("listMode");
        sb.append('=');
        sb.append(((this.listMode == null)?"<null>":this.listMode));
        sb.append(',');
        sb.append("_listMode");
        sb.append('=');
        sb.append(((this._listMode == null)?"<null>":this._listMode));
        sb.append(',');
        sb.append("variable");
        sb.append('=');
        sb.append(((this.variable == null)?"<null>":this.variable));
        sb.append(',');
        sb.append("_variable");
        sb.append('=');
        sb.append(((this._variable == null)?"<null>":this._variable));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("_condition");
        sb.append('=');
        sb.append(((this._condition == null)?"<null>":this._condition));
        sb.append(',');
        sb.append("check");
        sb.append('=');
        sb.append(((this.check == null)?"<null>":this.check));
        sb.append(',');
        sb.append("_check");
        sb.append('=');
        sb.append(((this._check == null)?"<null>":this._check));
        sb.append(',');
        sb.append("logMessage");
        sb.append('=');
        sb.append(((this.logMessage == null)?"<null>":this.logMessage));
        sb.append(',');
        sb.append("_logMessage");
        sb.append('=');
        sb.append(((this._logMessage == null)?"<null>":this._logMessage));
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
        result = ((result* 31)+((this._logMessage == null)? 0 :this._logMessage.hashCode()));
        result = ((result* 31)+((this.defaultValueDosage == null)? 0 :this.defaultValueDosage.hashCode()));
        result = ((result* 31)+((this.defaultValueString == null)? 0 :this.defaultValueString.hashCode()));
        result = ((result* 31)+((this._defaultValuePositiveInt == null)? 0 :this._defaultValuePositiveInt.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._max == null)? 0 :this._max.hashCode()));
        result = ((result* 31)+((this.defaultValueSignature == null)? 0 :this.defaultValueSignature.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.defaultValueInstant == null)? 0 :this.defaultValueInstant.hashCode()));
        result = ((result* 31)+((this._defaultValueDate == null)? 0 :this._defaultValueDate.hashCode()));
        result = ((result* 31)+((this.defaultValueBoolean == null)? 0 :this.defaultValueBoolean.hashCode()));
        result = ((result* 31)+((this.defaultValueQuantity == null)? 0 :this.defaultValueQuantity.hashCode()));
        result = ((result* 31)+((this.defaultValueUrl == null)? 0 :this.defaultValueUrl.hashCode()));
        result = ((result* 31)+((this.defaultValueRatio == null)? 0 :this.defaultValueRatio.hashCode()));
        result = ((result* 31)+((this.defaultValueUri == null)? 0 :this.defaultValueUri.hashCode()));
        result = ((result* 31)+((this._defaultValueOid == null)? 0 :this._defaultValueOid.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.defaultValueMeta == null)? 0 :this.defaultValueMeta.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._defaultValueInteger == null)? 0 :this._defaultValueInteger.hashCode()));
        result = ((result* 31)+((this._defaultValueUnsignedInt == null)? 0 :this._defaultValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.defaultValueMoney == null)? 0 :this.defaultValueMoney.hashCode()));
        result = ((result* 31)+((this._defaultValueString == null)? 0 :this._defaultValueString.hashCode()));
        result = ((result* 31)+((this.element == null)? 0 :this.element.hashCode()));
        result = ((result* 31)+((this.defaultValueBase64Binary == null)? 0 :this.defaultValueBase64Binary.hashCode()));
        result = ((result* 31)+((this.defaultValueAddress == null)? 0 :this.defaultValueAddress.hashCode()));
        result = ((result* 31)+((this.defaultValueIdentifier == null)? 0 :this.defaultValueIdentifier.hashCode()));
        result = ((result* 31)+((this._defaultValueId == null)? 0 :this._defaultValueId.hashCode()));
        result = ((result* 31)+((this.defaultValueMarkdown == null)? 0 :this.defaultValueMarkdown.hashCode()));
        result = ((result* 31)+((this.defaultValueAge == null)? 0 :this.defaultValueAge.hashCode()));
        result = ((result* 31)+((this.defaultValueExpression == null)? 0 :this.defaultValueExpression.hashCode()));
        result = ((result* 31)+((this._defaultValueTime == null)? 0 :this._defaultValueTime.hashCode()));
        result = ((result* 31)+((this._defaultValueDecimal == null)? 0 :this._defaultValueDecimal.hashCode()));
        result = ((result* 31)+((this.defaultValueId == null)? 0 :this.defaultValueId.hashCode()));
        result = ((result* 31)+((this.check == null)? 0 :this.check.hashCode()));
        result = ((result* 31)+((this._defaultValueUuid == null)? 0 :this._defaultValueUuid.hashCode()));
        result = ((result* 31)+((this._variable == null)? 0 :this._variable.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.defaultValueUsageContext == null)? 0 :this.defaultValueUsageContext.hashCode()));
        result = ((result* 31)+((this.defaultValueDataRequirement == null)? 0 :this.defaultValueDataRequirement.hashCode()));
        result = ((result* 31)+((this._context == null)? 0 :this._context.hashCode()));
        result = ((result* 31)+((this.defaultValueDate == null)? 0 :this.defaultValueDate.hashCode()));
        result = ((result* 31)+((this.defaultValueParameterDefinition == null)? 0 :this.defaultValueParameterDefinition.hashCode()));
        result = ((result* 31)+((this.defaultValueAttachment == null)? 0 :this.defaultValueAttachment.hashCode()));
        result = ((result* 31)+((this.defaultValueReference == null)? 0 :this.defaultValueReference.hashCode()));
        result = ((result* 31)+((this.defaultValueContactDetail == null)? 0 :this.defaultValueContactDetail.hashCode()));
        result = ((result* 31)+((this._min == null)? 0 :this._min.hashCode()));
        result = ((result* 31)+((this._defaultValueCanonical == null)? 0 :this._defaultValueCanonical.hashCode()));
        result = ((result* 31)+((this._defaultValueBoolean == null)? 0 :this._defaultValueBoolean.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.defaultValueDuration == null)? 0 :this.defaultValueDuration.hashCode()));
        result = ((result* 31)+((this._defaultValueMarkdown == null)? 0 :this._defaultValueMarkdown.hashCode()));
        result = ((result* 31)+((this.defaultValueRange == null)? 0 :this.defaultValueRange.hashCode()));
        result = ((result* 31)+((this.defaultValueSampledData == null)? 0 :this.defaultValueSampledData.hashCode()));
        result = ((result* 31)+((this.logMessage == null)? 0 :this.logMessage.hashCode()));
        result = ((result* 31)+((this.defaultValueUnsignedInt == null)? 0 :this.defaultValueUnsignedInt.hashCode()));
        result = ((result* 31)+((this._check == null)? 0 :this._check.hashCode()));
        result = ((result* 31)+((this._defaultValueDateTime == null)? 0 :this._defaultValueDateTime.hashCode()));
        result = ((result* 31)+((this.defaultValueInteger == null)? 0 :this.defaultValueInteger.hashCode()));
        result = ((result* 31)+((this._defaultValueUrl == null)? 0 :this._defaultValueUrl.hashCode()));
        result = ((result* 31)+((this.defaultValueTime == null)? 0 :this.defaultValueTime.hashCode()));
        result = ((result* 31)+((this._defaultValueCode == null)? 0 :this._defaultValueCode.hashCode()));
        result = ((result* 31)+((this._element == null)? 0 :this._element.hashCode()));
        result = ((result* 31)+((this._defaultValueBase64Binary == null)? 0 :this._defaultValueBase64Binary.hashCode()));
        result = ((result* 31)+((this.listMode == null)? 0 :this.listMode.hashCode()));
        result = ((result* 31)+((this.defaultValueRelatedArtifact == null)? 0 :this.defaultValueRelatedArtifact.hashCode()));
        result = ((result* 31)+((this.defaultValueTriggerDefinition == null)? 0 :this.defaultValueTriggerDefinition.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this.defaultValueContactPoint == null)? 0 :this.defaultValueContactPoint.hashCode()));
        result = ((result* 31)+((this.defaultValueHumanName == null)? 0 :this.defaultValueHumanName.hashCode()));
        result = ((result* 31)+((this.defaultValueDateTime == null)? 0 :this.defaultValueDateTime.hashCode()));
        result = ((result* 31)+((this.defaultValueDistance == null)? 0 :this.defaultValueDistance.hashCode()));
        result = ((result* 31)+((this._listMode == null)? 0 :this._listMode.hashCode()));
        result = ((result* 31)+((this.defaultValueCodeableConcept == null)? 0 :this.defaultValueCodeableConcept.hashCode()));
        result = ((result* 31)+((this.defaultValueDecimal == null)? 0 :this.defaultValueDecimal.hashCode()));
        result = ((result* 31)+((this.defaultValueUuid == null)? 0 :this.defaultValueUuid.hashCode()));
        result = ((result* 31)+((this.defaultValueAnnotation == null)? 0 :this.defaultValueAnnotation.hashCode()));
        result = ((result* 31)+((this.defaultValueCount == null)? 0 :this.defaultValueCount.hashCode()));
        result = ((result* 31)+((this.defaultValueCanonical == null)? 0 :this.defaultValueCanonical.hashCode()));
        result = ((result* 31)+((this.defaultValuePeriod == null)? 0 :this.defaultValuePeriod.hashCode()));
        result = ((result* 31)+((this.defaultValueContributor == null)? 0 :this.defaultValueContributor.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.defaultValueTiming == null)? 0 :this.defaultValueTiming.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.defaultValuePositiveInt == null)? 0 :this.defaultValuePositiveInt.hashCode()));
        result = ((result* 31)+((this.defaultValueOid == null)? 0 :this.defaultValueOid.hashCode()));
        result = ((result* 31)+((this.defaultValueCoding == null)? 0 :this.defaultValueCoding.hashCode()));
        result = ((result* 31)+((this._defaultValueUri == null)? 0 :this._defaultValueUri.hashCode()));
        result = ((result* 31)+((this.defaultValueCode == null)? 0 :this.defaultValueCode.hashCode()));
        result = ((result* 31)+((this._condition == null)? 0 :this._condition.hashCode()));
        result = ((result* 31)+((this.variable == null)? 0 :this.variable.hashCode()));
        result = ((result* 31)+((this._defaultValueInstant == null)? 0 :this._defaultValueInstant.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StructureMap_Source) == false) {
            return false;
        }
        StructureMap_Source rhs = ((StructureMap_Source) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this._logMessage == rhs._logMessage)||((this._logMessage!= null)&&this._logMessage.equals(rhs._logMessage)))&&((this.defaultValueDosage == rhs.defaultValueDosage)||((this.defaultValueDosage!= null)&&this.defaultValueDosage.equals(rhs.defaultValueDosage))))&&((this.defaultValueString == rhs.defaultValueString)||((this.defaultValueString!= null)&&this.defaultValueString.equals(rhs.defaultValueString))))&&((this._defaultValuePositiveInt == rhs._defaultValuePositiveInt)||((this._defaultValuePositiveInt!= null)&&this._defaultValuePositiveInt.equals(rhs._defaultValuePositiveInt))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._max == rhs._max)||((this._max!= null)&&this._max.equals(rhs._max))))&&((this.defaultValueSignature == rhs.defaultValueSignature)||((this.defaultValueSignature!= null)&&this.defaultValueSignature.equals(rhs.defaultValueSignature))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.defaultValueInstant == rhs.defaultValueInstant)||((this.defaultValueInstant!= null)&&this.defaultValueInstant.equals(rhs.defaultValueInstant))))&&((this._defaultValueDate == rhs._defaultValueDate)||((this._defaultValueDate!= null)&&this._defaultValueDate.equals(rhs._defaultValueDate))))&&((this.defaultValueBoolean == rhs.defaultValueBoolean)||((this.defaultValueBoolean!= null)&&this.defaultValueBoolean.equals(rhs.defaultValueBoolean))))&&((this.defaultValueQuantity == rhs.defaultValueQuantity)||((this.defaultValueQuantity!= null)&&this.defaultValueQuantity.equals(rhs.defaultValueQuantity))))&&((this.defaultValueUrl == rhs.defaultValueUrl)||((this.defaultValueUrl!= null)&&this.defaultValueUrl.equals(rhs.defaultValueUrl))))&&((this.defaultValueRatio == rhs.defaultValueRatio)||((this.defaultValueRatio!= null)&&this.defaultValueRatio.equals(rhs.defaultValueRatio))))&&((this.defaultValueUri == rhs.defaultValueUri)||((this.defaultValueUri!= null)&&this.defaultValueUri.equals(rhs.defaultValueUri))))&&((this._defaultValueOid == rhs._defaultValueOid)||((this._defaultValueOid!= null)&&this._defaultValueOid.equals(rhs._defaultValueOid))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.defaultValueMeta == rhs.defaultValueMeta)||((this.defaultValueMeta!= null)&&this.defaultValueMeta.equals(rhs.defaultValueMeta))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._defaultValueInteger == rhs._defaultValueInteger)||((this._defaultValueInteger!= null)&&this._defaultValueInteger.equals(rhs._defaultValueInteger))))&&((this._defaultValueUnsignedInt == rhs._defaultValueUnsignedInt)||((this._defaultValueUnsignedInt!= null)&&this._defaultValueUnsignedInt.equals(rhs._defaultValueUnsignedInt))))&&((this.defaultValueMoney == rhs.defaultValueMoney)||((this.defaultValueMoney!= null)&&this.defaultValueMoney.equals(rhs.defaultValueMoney))))&&((this._defaultValueString == rhs._defaultValueString)||((this._defaultValueString!= null)&&this._defaultValueString.equals(rhs._defaultValueString))))&&((this.element == rhs.element)||((this.element!= null)&&this.element.equals(rhs.element))))&&((this.defaultValueBase64Binary == rhs.defaultValueBase64Binary)||((this.defaultValueBase64Binary!= null)&&this.defaultValueBase64Binary.equals(rhs.defaultValueBase64Binary))))&&((this.defaultValueAddress == rhs.defaultValueAddress)||((this.defaultValueAddress!= null)&&this.defaultValueAddress.equals(rhs.defaultValueAddress))))&&((this.defaultValueIdentifier == rhs.defaultValueIdentifier)||((this.defaultValueIdentifier!= null)&&this.defaultValueIdentifier.equals(rhs.defaultValueIdentifier))))&&((this._defaultValueId == rhs._defaultValueId)||((this._defaultValueId!= null)&&this._defaultValueId.equals(rhs._defaultValueId))))&&((this.defaultValueMarkdown == rhs.defaultValueMarkdown)||((this.defaultValueMarkdown!= null)&&this.defaultValueMarkdown.equals(rhs.defaultValueMarkdown))))&&((this.defaultValueAge == rhs.defaultValueAge)||((this.defaultValueAge!= null)&&this.defaultValueAge.equals(rhs.defaultValueAge))))&&((this.defaultValueExpression == rhs.defaultValueExpression)||((this.defaultValueExpression!= null)&&this.defaultValueExpression.equals(rhs.defaultValueExpression))))&&((this._defaultValueTime == rhs._defaultValueTime)||((this._defaultValueTime!= null)&&this._defaultValueTime.equals(rhs._defaultValueTime))))&&((this._defaultValueDecimal == rhs._defaultValueDecimal)||((this._defaultValueDecimal!= null)&&this._defaultValueDecimal.equals(rhs._defaultValueDecimal))))&&((this.defaultValueId == rhs.defaultValueId)||((this.defaultValueId!= null)&&this.defaultValueId.equals(rhs.defaultValueId))))&&((this.check == rhs.check)||((this.check!= null)&&this.check.equals(rhs.check))))&&((this._defaultValueUuid == rhs._defaultValueUuid)||((this._defaultValueUuid!= null)&&this._defaultValueUuid.equals(rhs._defaultValueUuid))))&&((this._variable == rhs._variable)||((this._variable!= null)&&this._variable.equals(rhs._variable))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.defaultValueUsageContext == rhs.defaultValueUsageContext)||((this.defaultValueUsageContext!= null)&&this.defaultValueUsageContext.equals(rhs.defaultValueUsageContext))))&&((this.defaultValueDataRequirement == rhs.defaultValueDataRequirement)||((this.defaultValueDataRequirement!= null)&&this.defaultValueDataRequirement.equals(rhs.defaultValueDataRequirement))))&&((this._context == rhs._context)||((this._context!= null)&&this._context.equals(rhs._context))))&&((this.defaultValueDate == rhs.defaultValueDate)||((this.defaultValueDate!= null)&&this.defaultValueDate.equals(rhs.defaultValueDate))))&&((this.defaultValueParameterDefinition == rhs.defaultValueParameterDefinition)||((this.defaultValueParameterDefinition!= null)&&this.defaultValueParameterDefinition.equals(rhs.defaultValueParameterDefinition))))&&((this.defaultValueAttachment == rhs.defaultValueAttachment)||((this.defaultValueAttachment!= null)&&this.defaultValueAttachment.equals(rhs.defaultValueAttachment))))&&((this.defaultValueReference == rhs.defaultValueReference)||((this.defaultValueReference!= null)&&this.defaultValueReference.equals(rhs.defaultValueReference))))&&((this.defaultValueContactDetail == rhs.defaultValueContactDetail)||((this.defaultValueContactDetail!= null)&&this.defaultValueContactDetail.equals(rhs.defaultValueContactDetail))))&&((this._min == rhs._min)||((this._min!= null)&&this._min.equals(rhs._min))))&&((this._defaultValueCanonical == rhs._defaultValueCanonical)||((this._defaultValueCanonical!= null)&&this._defaultValueCanonical.equals(rhs._defaultValueCanonical))))&&((this._defaultValueBoolean == rhs._defaultValueBoolean)||((this._defaultValueBoolean!= null)&&this._defaultValueBoolean.equals(rhs._defaultValueBoolean))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.defaultValueDuration == rhs.defaultValueDuration)||((this.defaultValueDuration!= null)&&this.defaultValueDuration.equals(rhs.defaultValueDuration))))&&((this._defaultValueMarkdown == rhs._defaultValueMarkdown)||((this._defaultValueMarkdown!= null)&&this._defaultValueMarkdown.equals(rhs._defaultValueMarkdown))))&&((this.defaultValueRange == rhs.defaultValueRange)||((this.defaultValueRange!= null)&&this.defaultValueRange.equals(rhs.defaultValueRange))))&&((this.defaultValueSampledData == rhs.defaultValueSampledData)||((this.defaultValueSampledData!= null)&&this.defaultValueSampledData.equals(rhs.defaultValueSampledData))))&&((this.logMessage == rhs.logMessage)||((this.logMessage!= null)&&this.logMessage.equals(rhs.logMessage))))&&((this.defaultValueUnsignedInt == rhs.defaultValueUnsignedInt)||((this.defaultValueUnsignedInt!= null)&&this.defaultValueUnsignedInt.equals(rhs.defaultValueUnsignedInt))))&&((this._check == rhs._check)||((this._check!= null)&&this._check.equals(rhs._check))))&&((this._defaultValueDateTime == rhs._defaultValueDateTime)||((this._defaultValueDateTime!= null)&&this._defaultValueDateTime.equals(rhs._defaultValueDateTime))))&&((this.defaultValueInteger == rhs.defaultValueInteger)||((this.defaultValueInteger!= null)&&this.defaultValueInteger.equals(rhs.defaultValueInteger))))&&((this._defaultValueUrl == rhs._defaultValueUrl)||((this._defaultValueUrl!= null)&&this._defaultValueUrl.equals(rhs._defaultValueUrl))))&&((this.defaultValueTime == rhs.defaultValueTime)||((this.defaultValueTime!= null)&&this.defaultValueTime.equals(rhs.defaultValueTime))))&&((this._defaultValueCode == rhs._defaultValueCode)||((this._defaultValueCode!= null)&&this._defaultValueCode.equals(rhs._defaultValueCode))))&&((this._element == rhs._element)||((this._element!= null)&&this._element.equals(rhs._element))))&&((this._defaultValueBase64Binary == rhs._defaultValueBase64Binary)||((this._defaultValueBase64Binary!= null)&&this._defaultValueBase64Binary.equals(rhs._defaultValueBase64Binary))))&&((this.listMode == rhs.listMode)||((this.listMode!= null)&&this.listMode.equals(rhs.listMode))))&&((this.defaultValueRelatedArtifact == rhs.defaultValueRelatedArtifact)||((this.defaultValueRelatedArtifact!= null)&&this.defaultValueRelatedArtifact.equals(rhs.defaultValueRelatedArtifact))))&&((this.defaultValueTriggerDefinition == rhs.defaultValueTriggerDefinition)||((this.defaultValueTriggerDefinition!= null)&&this.defaultValueTriggerDefinition.equals(rhs.defaultValueTriggerDefinition))))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this.defaultValueContactPoint == rhs.defaultValueContactPoint)||((this.defaultValueContactPoint!= null)&&this.defaultValueContactPoint.equals(rhs.defaultValueContactPoint))))&&((this.defaultValueHumanName == rhs.defaultValueHumanName)||((this.defaultValueHumanName!= null)&&this.defaultValueHumanName.equals(rhs.defaultValueHumanName))))&&((this.defaultValueDateTime == rhs.defaultValueDateTime)||((this.defaultValueDateTime!= null)&&this.defaultValueDateTime.equals(rhs.defaultValueDateTime))))&&((this.defaultValueDistance == rhs.defaultValueDistance)||((this.defaultValueDistance!= null)&&this.defaultValueDistance.equals(rhs.defaultValueDistance))))&&((this._listMode == rhs._listMode)||((this._listMode!= null)&&this._listMode.equals(rhs._listMode))))&&((this.defaultValueCodeableConcept == rhs.defaultValueCodeableConcept)||((this.defaultValueCodeableConcept!= null)&&this.defaultValueCodeableConcept.equals(rhs.defaultValueCodeableConcept))))&&((this.defaultValueDecimal == rhs.defaultValueDecimal)||((this.defaultValueDecimal!= null)&&this.defaultValueDecimal.equals(rhs.defaultValueDecimal))))&&((this.defaultValueUuid == rhs.defaultValueUuid)||((this.defaultValueUuid!= null)&&this.defaultValueUuid.equals(rhs.defaultValueUuid))))&&((this.defaultValueAnnotation == rhs.defaultValueAnnotation)||((this.defaultValueAnnotation!= null)&&this.defaultValueAnnotation.equals(rhs.defaultValueAnnotation))))&&((this.defaultValueCount == rhs.defaultValueCount)||((this.defaultValueCount!= null)&&this.defaultValueCount.equals(rhs.defaultValueCount))))&&((this.defaultValueCanonical == rhs.defaultValueCanonical)||((this.defaultValueCanonical!= null)&&this.defaultValueCanonical.equals(rhs.defaultValueCanonical))))&&((this.defaultValuePeriod == rhs.defaultValuePeriod)||((this.defaultValuePeriod!= null)&&this.defaultValuePeriod.equals(rhs.defaultValuePeriod))))&&((this.defaultValueContributor == rhs.defaultValueContributor)||((this.defaultValueContributor!= null)&&this.defaultValueContributor.equals(rhs.defaultValueContributor))))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.defaultValueTiming == rhs.defaultValueTiming)||((this.defaultValueTiming!= null)&&this.defaultValueTiming.equals(rhs.defaultValueTiming))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.defaultValuePositiveInt == rhs.defaultValuePositiveInt)||((this.defaultValuePositiveInt!= null)&&this.defaultValuePositiveInt.equals(rhs.defaultValuePositiveInt))))&&((this.defaultValueOid == rhs.defaultValueOid)||((this.defaultValueOid!= null)&&this.defaultValueOid.equals(rhs.defaultValueOid))))&&((this.defaultValueCoding == rhs.defaultValueCoding)||((this.defaultValueCoding!= null)&&this.defaultValueCoding.equals(rhs.defaultValueCoding))))&&((this._defaultValueUri == rhs._defaultValueUri)||((this._defaultValueUri!= null)&&this._defaultValueUri.equals(rhs._defaultValueUri))))&&((this.defaultValueCode == rhs.defaultValueCode)||((this.defaultValueCode!= null)&&this.defaultValueCode.equals(rhs.defaultValueCode))))&&((this._condition == rhs._condition)||((this._condition!= null)&&this._condition.equals(rhs._condition))))&&((this.variable == rhs.variable)||((this.variable!= null)&&this.variable.equals(rhs.variable))))&&((this._defaultValueInstant == rhs._defaultValueInstant)||((this._defaultValueInstant!= null)&&this._defaultValueInstant.equals(rhs._defaultValueInstant))));
    }


    /**
     * How to handle the list mode for this element.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ListMode {

        FIRST("first"),
        NOT_FIRST("not_first"),
        LAST("last"),
        NOT_LAST("not_last"),
        ONLY_ONE("only_one");
        private final String value;
        private final static Map<String, StructureMap_Source.ListMode> CONSTANTS = new HashMap<String, StructureMap_Source.ListMode>();

        static {
            for (StructureMap_Source.ListMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ListMode(String value) {
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
        public static StructureMap_Source.ListMode fromValue(String value) {
            StructureMap_Source.ListMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
