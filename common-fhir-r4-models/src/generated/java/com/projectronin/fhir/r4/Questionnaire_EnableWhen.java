
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
    "question",
    "_question",
    "operator",
    "_operator",
    "answerBoolean",
    "_answerBoolean",
    "answerDecimal",
    "_answerDecimal",
    "answerInteger",
    "_answerInteger",
    "answerDate",
    "_answerDate",
    "answerDateTime",
    "_answerDateTime",
    "answerTime",
    "_answerTime",
    "answerString",
    "_answerString",
    "answerCoding",
    "answerQuantity",
    "answerReference"
})
@Generated("jsonschema2pojo")
public class Questionnaire_EnableWhen {

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
    @JsonProperty("question")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String question;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_question")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _question;
    /**
     * Specifies the criteria by which the question is enabled.
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("Specifies the criteria by which the question is enabled.")
    private Questionnaire_EnableWhen.Operator operator;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operator")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _operator;
    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerBoolean")
    @JsonPropertyDescription("A value that the referenced question is tested using the specified operator in order for the item to be enabled.")
    private Boolean answerBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _answerBoolean;
    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDecimal")
    @JsonPropertyDescription("A value that the referenced question is tested using the specified operator in order for the item to be enabled.")
    private Double answerDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _answerDecimal;
    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerInteger")
    @JsonPropertyDescription("A value that the referenced question is tested using the specified operator in order for the item to be enabled.")
    private Double answerInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _answerInteger;
    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDate")
    @JsonPropertyDescription("A value that the referenced question is tested using the specified operator in order for the item to be enabled.")
    private String answerDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _answerDate;
    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDateTime")
    @JsonPropertyDescription("A value that the referenced question is tested using the specified operator in order for the item to be enabled.")
    private String answerDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _answerDateTime;
    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerTime")
    @JsonPropertyDescription("A value that the referenced question is tested using the specified operator in order for the item to be enabled.")
    private String answerTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _answerTime;
    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerString")
    @JsonPropertyDescription("A value that the referenced question is tested using the specified operator in order for the item to be enabled.")
    private String answerString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _answerString;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("answerCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding answerCoding;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("answerQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity answerQuantity;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("answerReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference answerReference;

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
    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_question")
    public Element get_question() {
        return _question;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_question")
    public void set_question(Element _question) {
        this._question = _question;
    }

    /**
     * Specifies the criteria by which the question is enabled.
     * 
     */
    @JsonProperty("operator")
    public Questionnaire_EnableWhen.Operator getOperator() {
        return operator;
    }

    /**
     * Specifies the criteria by which the question is enabled.
     * 
     */
    @JsonProperty("operator")
    public void setOperator(Questionnaire_EnableWhen.Operator operator) {
        this.operator = operator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operator")
    public Element get_operator() {
        return _operator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operator")
    public void set_operator(Element _operator) {
        this._operator = _operator;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerBoolean")
    public Boolean getAnswerBoolean() {
        return answerBoolean;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerBoolean")
    public void setAnswerBoolean(Boolean answerBoolean) {
        this.answerBoolean = answerBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerBoolean")
    public Element get_answerBoolean() {
        return _answerBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerBoolean")
    public void set_answerBoolean(Element _answerBoolean) {
        this._answerBoolean = _answerBoolean;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDecimal")
    public Double getAnswerDecimal() {
        return answerDecimal;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDecimal")
    public void setAnswerDecimal(Double answerDecimal) {
        this.answerDecimal = answerDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDecimal")
    public Element get_answerDecimal() {
        return _answerDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDecimal")
    public void set_answerDecimal(Element _answerDecimal) {
        this._answerDecimal = _answerDecimal;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerInteger")
    public Double getAnswerInteger() {
        return answerInteger;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerInteger")
    public void setAnswerInteger(Double answerInteger) {
        this.answerInteger = answerInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerInteger")
    public Element get_answerInteger() {
        return _answerInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerInteger")
    public void set_answerInteger(Element _answerInteger) {
        this._answerInteger = _answerInteger;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDate")
    public String getAnswerDate() {
        return answerDate;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDate")
    public void setAnswerDate(String answerDate) {
        this.answerDate = answerDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDate")
    public Element get_answerDate() {
        return _answerDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDate")
    public void set_answerDate(Element _answerDate) {
        this._answerDate = _answerDate;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDateTime")
    public String getAnswerDateTime() {
        return answerDateTime;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerDateTime")
    public void setAnswerDateTime(String answerDateTime) {
        this.answerDateTime = answerDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDateTime")
    public Element get_answerDateTime() {
        return _answerDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerDateTime")
    public void set_answerDateTime(Element _answerDateTime) {
        this._answerDateTime = _answerDateTime;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerTime")
    public String getAnswerTime() {
        return answerTime;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerTime")
    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerTime")
    public Element get_answerTime() {
        return _answerTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerTime")
    public void set_answerTime(Element _answerTime) {
        this._answerTime = _answerTime;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerString")
    public String getAnswerString() {
        return answerString;
    }

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     * 
     */
    @JsonProperty("answerString")
    public void setAnswerString(String answerString) {
        this.answerString = answerString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerString")
    public Element get_answerString() {
        return _answerString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_answerString")
    public void set_answerString(Element _answerString) {
        this._answerString = _answerString;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("answerCoding")
    public Coding getAnswerCoding() {
        return answerCoding;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("answerCoding")
    public void setAnswerCoding(Coding answerCoding) {
        this.answerCoding = answerCoding;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("answerQuantity")
    public Quantity getAnswerQuantity() {
        return answerQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("answerQuantity")
    public void setAnswerQuantity(Quantity answerQuantity) {
        this.answerQuantity = answerQuantity;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("answerReference")
    public Reference getAnswerReference() {
        return answerReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("answerReference")
    public void setAnswerReference(Reference answerReference) {
        this.answerReference = answerReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Questionnaire_EnableWhen.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("_question");
        sb.append('=');
        sb.append(((this._question == null)?"<null>":this._question));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("_operator");
        sb.append('=');
        sb.append(((this._operator == null)?"<null>":this._operator));
        sb.append(',');
        sb.append("answerBoolean");
        sb.append('=');
        sb.append(((this.answerBoolean == null)?"<null>":this.answerBoolean));
        sb.append(',');
        sb.append("_answerBoolean");
        sb.append('=');
        sb.append(((this._answerBoolean == null)?"<null>":this._answerBoolean));
        sb.append(',');
        sb.append("answerDecimal");
        sb.append('=');
        sb.append(((this.answerDecimal == null)?"<null>":this.answerDecimal));
        sb.append(',');
        sb.append("_answerDecimal");
        sb.append('=');
        sb.append(((this._answerDecimal == null)?"<null>":this._answerDecimal));
        sb.append(',');
        sb.append("answerInteger");
        sb.append('=');
        sb.append(((this.answerInteger == null)?"<null>":this.answerInteger));
        sb.append(',');
        sb.append("_answerInteger");
        sb.append('=');
        sb.append(((this._answerInteger == null)?"<null>":this._answerInteger));
        sb.append(',');
        sb.append("answerDate");
        sb.append('=');
        sb.append(((this.answerDate == null)?"<null>":this.answerDate));
        sb.append(',');
        sb.append("_answerDate");
        sb.append('=');
        sb.append(((this._answerDate == null)?"<null>":this._answerDate));
        sb.append(',');
        sb.append("answerDateTime");
        sb.append('=');
        sb.append(((this.answerDateTime == null)?"<null>":this.answerDateTime));
        sb.append(',');
        sb.append("_answerDateTime");
        sb.append('=');
        sb.append(((this._answerDateTime == null)?"<null>":this._answerDateTime));
        sb.append(',');
        sb.append("answerTime");
        sb.append('=');
        sb.append(((this.answerTime == null)?"<null>":this.answerTime));
        sb.append(',');
        sb.append("_answerTime");
        sb.append('=');
        sb.append(((this._answerTime == null)?"<null>":this._answerTime));
        sb.append(',');
        sb.append("answerString");
        sb.append('=');
        sb.append(((this.answerString == null)?"<null>":this.answerString));
        sb.append(',');
        sb.append("_answerString");
        sb.append('=');
        sb.append(((this._answerString == null)?"<null>":this._answerString));
        sb.append(',');
        sb.append("answerCoding");
        sb.append('=');
        sb.append(((this.answerCoding == null)?"<null>":this.answerCoding));
        sb.append(',');
        sb.append("answerQuantity");
        sb.append('=');
        sb.append(((this.answerQuantity == null)?"<null>":this.answerQuantity));
        sb.append(',');
        sb.append("answerReference");
        sb.append('=');
        sb.append(((this.answerReference == null)?"<null>":this.answerReference));
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
        result = ((result* 31)+((this.answerQuantity == null)? 0 :this.answerQuantity.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._question == null)? 0 :this._question.hashCode()));
        result = ((result* 31)+((this.answerDateTime == null)? 0 :this.answerDateTime.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.answerDate == null)? 0 :this.answerDate.hashCode()));
        result = ((result* 31)+((this.answerTime == null)? 0 :this.answerTime.hashCode()));
        result = ((result* 31)+((this._answerTime == null)? 0 :this._answerTime.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._answerDecimal == null)? 0 :this._answerDecimal.hashCode()));
        result = ((result* 31)+((this._answerBoolean == null)? 0 :this._answerBoolean.hashCode()));
        result = ((result* 31)+((this._operator == null)? 0 :this._operator.hashCode()));
        result = ((result* 31)+((this._answerDate == null)? 0 :this._answerDate.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.answerInteger == null)? 0 :this.answerInteger.hashCode()));
        result = ((result* 31)+((this.answerDecimal == null)? 0 :this.answerDecimal.hashCode()));
        result = ((result* 31)+((this.answerString == null)? 0 :this.answerString.hashCode()));
        result = ((result* 31)+((this._answerString == null)? 0 :this._answerString.hashCode()));
        result = ((result* 31)+((this.answerCoding == null)? 0 :this.answerCoding.hashCode()));
        result = ((result* 31)+((this.answerReference == null)? 0 :this.answerReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._answerInteger == null)? 0 :this._answerInteger.hashCode()));
        result = ((result* 31)+((this.answerBoolean == null)? 0 :this.answerBoolean.hashCode()));
        result = ((result* 31)+((this._answerDateTime == null)? 0 :this._answerDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Questionnaire_EnableWhen) == false) {
            return false;
        }
        Questionnaire_EnableWhen rhs = ((Questionnaire_EnableWhen) other);
        return (((((((((((((((((((((((((this.answerQuantity == rhs.answerQuantity)||((this.answerQuantity!= null)&&this.answerQuantity.equals(rhs.answerQuantity)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._question == rhs._question)||((this._question!= null)&&this._question.equals(rhs._question))))&&((this.answerDateTime == rhs.answerDateTime)||((this.answerDateTime!= null)&&this.answerDateTime.equals(rhs.answerDateTime))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.answerDate == rhs.answerDate)||((this.answerDate!= null)&&this.answerDate.equals(rhs.answerDate))))&&((this.answerTime == rhs.answerTime)||((this.answerTime!= null)&&this.answerTime.equals(rhs.answerTime))))&&((this._answerTime == rhs._answerTime)||((this._answerTime!= null)&&this._answerTime.equals(rhs._answerTime))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._answerDecimal == rhs._answerDecimal)||((this._answerDecimal!= null)&&this._answerDecimal.equals(rhs._answerDecimal))))&&((this._answerBoolean == rhs._answerBoolean)||((this._answerBoolean!= null)&&this._answerBoolean.equals(rhs._answerBoolean))))&&((this._operator == rhs._operator)||((this._operator!= null)&&this._operator.equals(rhs._operator))))&&((this._answerDate == rhs._answerDate)||((this._answerDate!= null)&&this._answerDate.equals(rhs._answerDate))))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.answerInteger == rhs.answerInteger)||((this.answerInteger!= null)&&this.answerInteger.equals(rhs.answerInteger))))&&((this.answerDecimal == rhs.answerDecimal)||((this.answerDecimal!= null)&&this.answerDecimal.equals(rhs.answerDecimal))))&&((this.answerString == rhs.answerString)||((this.answerString!= null)&&this.answerString.equals(rhs.answerString))))&&((this._answerString == rhs._answerString)||((this._answerString!= null)&&this._answerString.equals(rhs._answerString))))&&((this.answerCoding == rhs.answerCoding)||((this.answerCoding!= null)&&this.answerCoding.equals(rhs.answerCoding))))&&((this.answerReference == rhs.answerReference)||((this.answerReference!= null)&&this.answerReference.equals(rhs.answerReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._answerInteger == rhs._answerInteger)||((this._answerInteger!= null)&&this._answerInteger.equals(rhs._answerInteger))))&&((this.answerBoolean == rhs.answerBoolean)||((this.answerBoolean!= null)&&this.answerBoolean.equals(rhs.answerBoolean))))&&((this._answerDateTime == rhs._answerDateTime)||((this._answerDateTime!= null)&&this._answerDateTime.equals(rhs._answerDateTime))));
    }


    /**
     * Specifies the criteria by which the question is enabled.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Operator {

        EXISTS("exists"),
        EQUAL("="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        LESS_THAN("<"),
        GREATER_THAN_OR_EQUAL(">="),
        LESS_THAN_OR_EQUAL("<=");
        private final String value;
        private final static Map<String, Questionnaire_EnableWhen.Operator> CONSTANTS = new HashMap<String, Questionnaire_EnableWhen.Operator>();

        static {
            for (Questionnaire_EnableWhen.Operator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Operator(String value) {
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
        public static Questionnaire_EnableWhen.Operator fromValue(String value) {
            Questionnaire_EnableWhen.Operator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
