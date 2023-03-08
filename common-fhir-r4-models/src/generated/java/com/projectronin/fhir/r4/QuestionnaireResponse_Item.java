
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
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
    "text",
    "_text",
    "answer",
    "item"
})
@Generated("jsonschema2pojo")
public class QuestionnaireResponse_Item {

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
     * The respondent's answer(s) to the question.
     * 
     */
    @JsonProperty("answer")
    @JsonPropertyDescription("The respondent's answer(s) to the question.")
    private List<QuestionnaireResponse_Answer> answer = new ArrayList<QuestionnaireResponse_Answer>();
    /**
     * Questions or sub-groups nested beneath a question or group.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Questions or sub-groups nested beneath a question or group.")
    private List<QuestionnaireResponse_Item> item = new ArrayList<QuestionnaireResponse_Item>();

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
     * The respondent's answer(s) to the question.
     * 
     */
    @JsonProperty("answer")
    public List<QuestionnaireResponse_Answer> getAnswer() {
        return answer;
    }

    /**
     * The respondent's answer(s) to the question.
     * 
     */
    @JsonProperty("answer")
    public void setAnswer(List<QuestionnaireResponse_Answer> answer) {
        this.answer = answer;
    }

    /**
     * Questions or sub-groups nested beneath a question or group.
     * 
     */
    @JsonProperty("item")
    public List<QuestionnaireResponse_Item> getItem() {
        return item;
    }

    /**
     * Questions or sub-groups nested beneath a question or group.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<QuestionnaireResponse_Item> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuestionnaireResponse_Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
        sb.append(',');
        sb.append("answer");
        sb.append('=');
        sb.append(((this.answer == null)?"<null>":this.answer));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._linkId == null)? 0 :this._linkId.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.linkId == null)? 0 :this.linkId.hashCode()));
        result = ((result* 31)+((this.answer == null)? 0 :this.answer.hashCode()));
        result = ((result* 31)+((this._definition == null)? 0 :this._definition.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuestionnaireResponse_Item) == false) {
            return false;
        }
        QuestionnaireResponse_Item rhs = ((QuestionnaireResponse_Item) other);
        return ((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._linkId == rhs._linkId)||((this._linkId!= null)&&this._linkId.equals(rhs._linkId))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.linkId == rhs.linkId)||((this.linkId!= null)&&this.linkId.equals(rhs.linkId))))&&((this.answer == rhs.answer)||((this.answer!= null)&&this.answer.equals(rhs.answer))))&&((this._definition == rhs._definition)||((this._definition!= null)&&this._definition.equals(rhs._definition))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))));
    }

}
