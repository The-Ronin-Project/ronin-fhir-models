
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
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "linkId",
    "_linkId",
    "definition",
    "_definition",
    "code",
    "prefix",
    "_prefix",
    "text",
    "_text",
    "type",
    "_type",
    "enableWhen",
    "enableBehavior",
    "_enableBehavior",
    "required",
    "_required",
    "repeats",
    "_repeats",
    "readOnly",
    "_readOnly",
    "maxLength",
    "_maxLength",
    "answerValueSet",
    "answerOption",
    "initial",
    "item"
})
@Generated("jsonschema2pojo")
public class Questionnaire_Item {

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
    @JsonProperty("linkId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String linkId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_linkId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _linkId;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("definition")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String definition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_definition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _definition;
    /**
     * A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).")
    private List<Coding> code = new ArrayList<Coding>();
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
    @JsonProperty("text")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String text;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _text;
    /**
     * The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).")
    private Questionnaire_Item.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
     * 
     */
    @JsonProperty("enableWhen")
    @JsonPropertyDescription("A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.")
    private List<Questionnaire_EnableWhen> enableWhen = new ArrayList<Questionnaire_EnableWhen>();
    /**
     * Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
     * 
     */
    @JsonProperty("enableBehavior")
    @JsonPropertyDescription("Controls how multiple enableWhen values are interpreted -  whether all or any must be true.")
    private Questionnaire_Item.EnableBehavior enableBehavior;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_enableBehavior")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _enableBehavior;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean required;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_required")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _required;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("repeats")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean repeats;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repeats")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _repeats;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean readOnly;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readOnly")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _readOnly;
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("answerValueSet")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String answerValueSet;
    /**
     * One of the permitted answers for a &quot;choice&quot; or &quot;open-choice&quot; question.
     * 
     */
    @JsonProperty("answerOption")
    @JsonPropertyDescription("One of the permitted answers for a \"choice\" or \"open-choice\" question.")
    private List<Questionnaire_AnswerOption> answerOption = new ArrayList<Questionnaire_AnswerOption>();
    /**
     * One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.
     * 
     */
    @JsonProperty("initial")
    @JsonPropertyDescription("One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.")
    private List<Questionnaire_Initial> initial = new ArrayList<Questionnaire_Initial>();
    /**
     * Text, questions and other groups to be nested beneath a question or group.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Text, questions and other groups to be nested beneath a question or group.")
    private List<Questionnaire_Item> item = new ArrayList<Questionnaire_Item>();

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
    @JsonProperty("linkId")
    public String getLinkId() {
        return linkId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("linkId")
    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_linkId")
    public Element get_linkId() {
        return _linkId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_linkId")
    public void set_linkId(Element _linkId) {
        this._linkId = _linkId;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    /**
     * String of characters used to identify a name or a resource
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
     * A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
     * 
     */
    @JsonProperty("code")
    public List<Coding> getCode() {
        return code;
    }

    /**
     * A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
     * 
     */
    @JsonProperty("code")
    public void setCode(List<Coding> code) {
        this.code = code;
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
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    public Element get_text() {
        return _text;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    public void set_text(Element _text) {
        this._text = _text;
    }

    /**
     * The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
     * 
     */
    @JsonProperty("type")
    public Questionnaire_Item.Type getType() {
        return type;
    }

    /**
     * The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
     * 
     */
    @JsonProperty("type")
    public void setType(Questionnaire_Item.Type type) {
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
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
     * 
     */
    @JsonProperty("enableWhen")
    public List<Questionnaire_EnableWhen> getEnableWhen() {
        return enableWhen;
    }

    /**
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
     * 
     */
    @JsonProperty("enableWhen")
    public void setEnableWhen(List<Questionnaire_EnableWhen> enableWhen) {
        this.enableWhen = enableWhen;
    }

    /**
     * Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
     * 
     */
    @JsonProperty("enableBehavior")
    public Questionnaire_Item.EnableBehavior getEnableBehavior() {
        return enableBehavior;
    }

    /**
     * Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
     * 
     */
    @JsonProperty("enableBehavior")
    public void setEnableBehavior(Questionnaire_Item.EnableBehavior enableBehavior) {
        this.enableBehavior = enableBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_enableBehavior")
    public Element get_enableBehavior() {
        return _enableBehavior;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_enableBehavior")
    public void set_enableBehavior(Element _enableBehavior) {
        this._enableBehavior = _enableBehavior;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_required")
    public Element get_required() {
        return _required;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_required")
    public void set_required(Element _required) {
        this._required = _required;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("repeats")
    public Boolean getRepeats() {
        return repeats;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("repeats")
    public void setRepeats(Boolean repeats) {
        this.repeats = repeats;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repeats")
    public Element get_repeats() {
        return _repeats;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_repeats")
    public void set_repeats(Element _repeats) {
        this._repeats = _repeats;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readOnly")
    public Element get_readOnly() {
        return _readOnly;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readOnly")
    public void set_readOnly(Element _readOnly) {
        this._readOnly = _readOnly;
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("answerValueSet")
    public String getAnswerValueSet() {
        return answerValueSet;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("answerValueSet")
    public void setAnswerValueSet(String answerValueSet) {
        this.answerValueSet = answerValueSet;
    }

    /**
     * One of the permitted answers for a &quot;choice&quot; or &quot;open-choice&quot; question.
     * 
     */
    @JsonProperty("answerOption")
    public List<Questionnaire_AnswerOption> getAnswerOption() {
        return answerOption;
    }

    /**
     * One of the permitted answers for a &quot;choice&quot; or &quot;open-choice&quot; question.
     * 
     */
    @JsonProperty("answerOption")
    public void setAnswerOption(List<Questionnaire_AnswerOption> answerOption) {
        this.answerOption = answerOption;
    }

    /**
     * One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.
     * 
     */
    @JsonProperty("initial")
    public List<Questionnaire_Initial> getInitial() {
        return initial;
    }

    /**
     * One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.
     * 
     */
    @JsonProperty("initial")
    public void setInitial(List<Questionnaire_Initial> initial) {
        this.initial = initial;
    }

    /**
     * Text, questions and other groups to be nested beneath a question or group.
     * 
     */
    @JsonProperty("item")
    public List<Questionnaire_Item> getItem() {
        return item;
    }

    /**
     * Text, questions and other groups to be nested beneath a question or group.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<Questionnaire_Item> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Questionnaire_Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("linkId");
        sb.append('=');
        sb.append(((this.linkId == null)?"<null>":this.linkId));
        sb.append(',');
        sb.append("_linkId");
        sb.append('=');
        sb.append(((this._linkId == null)?"<null>":this._linkId));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("_definition");
        sb.append('=');
        sb.append(((this._definition == null)?"<null>":this._definition));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("_prefix");
        sb.append('=');
        sb.append(((this._prefix == null)?"<null>":this._prefix));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("enableWhen");
        sb.append('=');
        sb.append(((this.enableWhen == null)?"<null>":this.enableWhen));
        sb.append(',');
        sb.append("enableBehavior");
        sb.append('=');
        sb.append(((this.enableBehavior == null)?"<null>":this.enableBehavior));
        sb.append(',');
        sb.append("_enableBehavior");
        sb.append('=');
        sb.append(((this._enableBehavior == null)?"<null>":this._enableBehavior));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("_required");
        sb.append('=');
        sb.append(((this._required == null)?"<null>":this._required));
        sb.append(',');
        sb.append("repeats");
        sb.append('=');
        sb.append(((this.repeats == null)?"<null>":this.repeats));
        sb.append(',');
        sb.append("_repeats");
        sb.append('=');
        sb.append(((this._repeats == null)?"<null>":this._repeats));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("_readOnly");
        sb.append('=');
        sb.append(((this._readOnly == null)?"<null>":this._readOnly));
        sb.append(',');
        sb.append("maxLength");
        sb.append('=');
        sb.append(((this.maxLength == null)?"<null>":this.maxLength));
        sb.append(',');
        sb.append("_maxLength");
        sb.append('=');
        sb.append(((this._maxLength == null)?"<null>":this._maxLength));
        sb.append(',');
        sb.append("answerValueSet");
        sb.append('=');
        sb.append(((this.answerValueSet == null)?"<null>":this.answerValueSet));
        sb.append(',');
        sb.append("answerOption");
        sb.append('=');
        sb.append(((this.answerOption == null)?"<null>":this.answerOption));
        sb.append(',');
        sb.append("initial");
        sb.append('=');
        sb.append(((this.initial == null)?"<null>":this.initial));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
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
        result = ((result* 31)+((this.repeats == null)? 0 :this.repeats.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.enableWhen == null)? 0 :this.enableWhen.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._required == null)? 0 :this._required.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        result = ((result* 31)+((this._definition == null)? 0 :this._definition.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this._linkId == null)? 0 :this._linkId.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.initial == null)? 0 :this.initial.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this._readOnly == null)? 0 :this._readOnly.hashCode()));
        result = ((result* 31)+((this._enableBehavior == null)? 0 :this._enableBehavior.hashCode()));
        result = ((result* 31)+((this._repeats == null)? 0 :this._repeats.hashCode()));
        result = ((result* 31)+((this.linkId == null)? 0 :this.linkId.hashCode()));
        result = ((result* 31)+((this._prefix == null)? 0 :this._prefix.hashCode()));
        result = ((result* 31)+((this.enableBehavior == null)? 0 :this.enableBehavior.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        result = ((result* 31)+((this.answerValueSet == null)? 0 :this.answerValueSet.hashCode()));
        result = ((result* 31)+((this.answerOption == null)? 0 :this.answerOption.hashCode()));
        result = ((result* 31)+((this.maxLength == null)? 0 :this.maxLength.hashCode()));
        result = ((result* 31)+((this._maxLength == null)? 0 :this._maxLength.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Questionnaire_Item) == false) {
            return false;
        }
        Questionnaire_Item rhs = ((Questionnaire_Item) other);
        return ((((((((((((((((((((((((((((((this.repeats == rhs.repeats)||((this.repeats!= null)&&this.repeats.equals(rhs.repeats)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.enableWhen == rhs.enableWhen)||((this.enableWhen!= null)&&this.enableWhen.equals(rhs.enableWhen))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._required == rhs._required)||((this._required!= null)&&this._required.equals(rhs._required))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))))&&((this._definition == rhs._definition)||((this._definition!= null)&&this._definition.equals(rhs._definition))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this._linkId == rhs._linkId)||((this._linkId!= null)&&this._linkId.equals(rhs._linkId))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.initial == rhs.initial)||((this.initial!= null)&&this.initial.equals(rhs.initial))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this._readOnly == rhs._readOnly)||((this._readOnly!= null)&&this._readOnly.equals(rhs._readOnly))))&&((this._enableBehavior == rhs._enableBehavior)||((this._enableBehavior!= null)&&this._enableBehavior.equals(rhs._enableBehavior))))&&((this._repeats == rhs._repeats)||((this._repeats!= null)&&this._repeats.equals(rhs._repeats))))&&((this.linkId == rhs.linkId)||((this.linkId!= null)&&this.linkId.equals(rhs.linkId))))&&((this._prefix == rhs._prefix)||((this._prefix!= null)&&this._prefix.equals(rhs._prefix))))&&((this.enableBehavior == rhs.enableBehavior)||((this.enableBehavior!= null)&&this.enableBehavior.equals(rhs.enableBehavior))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))))&&((this.answerValueSet == rhs.answerValueSet)||((this.answerValueSet!= null)&&this.answerValueSet.equals(rhs.answerValueSet))))&&((this.answerOption == rhs.answerOption)||((this.answerOption!= null)&&this.answerOption.equals(rhs.answerOption))))&&((this.maxLength == rhs.maxLength)||((this.maxLength!= null)&&this.maxLength.equals(rhs.maxLength))))&&((this._maxLength == rhs._maxLength)||((this._maxLength!= null)&&this._maxLength.equals(rhs._maxLength))));
    }


    /**
     * Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EnableBehavior {

        ALL("all"),
        ANY("any");
        private final String value;
        private final static Map<String, Questionnaire_Item.EnableBehavior> CONSTANTS = new HashMap<String, Questionnaire_Item.EnableBehavior>();

        static {
            for (Questionnaire_Item.EnableBehavior c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EnableBehavior(String value) {
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
        public static Questionnaire_Item.EnableBehavior fromValue(String value) {
            Questionnaire_Item.EnableBehavior constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        GROUP("group"),
        DISPLAY("display"),
        BOOLEAN("boolean"),
        DECIMAL("decimal"),
        INTEGER("integer"),
        DATE("date"),
        DATE_TIME("dateTime"),
        TIME("time"),
        STRING("string"),
        TEXT("text"),
        URL("url"),
        CHOICE("choice"),
        OPEN_CHOICE("open-choice"),
        ATTACHMENT("attachment"),
        REFERENCE("reference"),
        QUANTITY("quantity");
        private final String value;
        private final static Map<String, Questionnaire_Item.Type> CONSTANTS = new HashMap<String, Questionnaire_Item.Type>();

        static {
            for (Questionnaire_Item.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Questionnaire_Item.Type fromValue(String value) {
            Questionnaire_Item.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
