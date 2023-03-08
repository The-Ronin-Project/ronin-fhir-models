
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
    "identifier",
    "party",
    "topic",
    "type",
    "decision",
    "decisionMode",
    "answer",
    "text",
    "_text",
    "linkId",
    "_linkId",
    "securityLabelNumber",
    "_securityLabelNumber"
})
@Generated("jsonschema2pojo")
public class Contract_Offer {

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
     * Unique identifier for this particular Contract Provision.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique identifier for this particular Contract Provision.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Offer Recipient.
     * 
     */
    @JsonProperty("party")
    @JsonPropertyDescription("Offer Recipient.")
    private List<Contract_Party> party = new ArrayList<Contract_Party>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference topic;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("decision")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept decision;
    /**
     * How the decision about a Contract was conveyed.
     * 
     */
    @JsonProperty("decisionMode")
    @JsonPropertyDescription("How the decision about a Contract was conveyed.")
    private List<CodeableConcept> decisionMode = new ArrayList<CodeableConcept>();
    /**
     * Response to offer text.
     * 
     */
    @JsonProperty("answer")
    @JsonPropertyDescription("Response to offer text.")
    private List<Contract_Answer> answer = new ArrayList<Contract_Answer>();
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
     * The id of the clause or question text of the offer in the referenced questionnaire/response.
     * 
     */
    @JsonProperty("linkId")
    @JsonPropertyDescription("The id of the clause or question text of the offer in the referenced questionnaire/response.")
    private List<String> linkId = new ArrayList<String>();
    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    @JsonPropertyDescription("Extensions for linkId")
    private List<Element> _linkId = new ArrayList<Element>();
    /**
     * Security labels that protects the offer.
     * 
     */
    @JsonProperty("securityLabelNumber")
    @JsonPropertyDescription("Security labels that protects the offer.")
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
     * Unique identifier for this particular Contract Provision.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique identifier for this particular Contract Provision.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Offer Recipient.
     * 
     */
    @JsonProperty("party")
    public List<Contract_Party> getParty() {
        return party;
    }

    /**
     * Offer Recipient.
     * 
     */
    @JsonProperty("party")
    public void setParty(List<Contract_Party> party) {
        this.party = party;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topic")
    public Reference getTopic() {
        return topic;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topic")
    public void setTopic(Reference topic) {
        this.topic = topic;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("decision")
    public CodeableConcept getDecision() {
        return decision;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("decision")
    public void setDecision(CodeableConcept decision) {
        this.decision = decision;
    }

    /**
     * How the decision about a Contract was conveyed.
     * 
     */
    @JsonProperty("decisionMode")
    public List<CodeableConcept> getDecisionMode() {
        return decisionMode;
    }

    /**
     * How the decision about a Contract was conveyed.
     * 
     */
    @JsonProperty("decisionMode")
    public void setDecisionMode(List<CodeableConcept> decisionMode) {
        this.decisionMode = decisionMode;
    }

    /**
     * Response to offer text.
     * 
     */
    @JsonProperty("answer")
    public List<Contract_Answer> getAnswer() {
        return answer;
    }

    /**
     * Response to offer text.
     * 
     */
    @JsonProperty("answer")
    public void setAnswer(List<Contract_Answer> answer) {
        this.answer = answer;
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
     * The id of the clause or question text of the offer in the referenced questionnaire/response.
     * 
     */
    @JsonProperty("linkId")
    public List<String> getLinkId() {
        return linkId;
    }

    /**
     * The id of the clause or question text of the offer in the referenced questionnaire/response.
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
     * Security labels that protects the offer.
     * 
     */
    @JsonProperty("securityLabelNumber")
    public List<Double> getSecurityLabelNumber() {
        return securityLabelNumber;
    }

    /**
     * Security labels that protects the offer.
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
        sb.append(Contract_Offer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("party");
        sb.append('=');
        sb.append(((this.party == null)?"<null>":this.party));
        sb.append(',');
        sb.append("topic");
        sb.append('=');
        sb.append(((this.topic == null)?"<null>":this.topic));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("decision");
        sb.append('=');
        sb.append(((this.decision == null)?"<null>":this.decision));
        sb.append(',');
        sb.append("decisionMode");
        sb.append('=');
        sb.append(((this.decisionMode == null)?"<null>":this.decisionMode));
        sb.append(',');
        sb.append("answer");
        sb.append('=');
        sb.append(((this.answer == null)?"<null>":this.answer));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
        sb.append(',');
        sb.append("linkId");
        sb.append('=');
        sb.append(((this.linkId == null)?"<null>":this.linkId));
        sb.append(',');
        sb.append("_linkId");
        sb.append('=');
        sb.append(((this._linkId == null)?"<null>":this._linkId));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._linkId == null)? 0 :this._linkId.hashCode()));
        result = ((result* 31)+((this.decision == null)? 0 :this.decision.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.securityLabelNumber == null)? 0 :this.securityLabelNumber.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.linkId == null)? 0 :this.linkId.hashCode()));
        result = ((result* 31)+((this.answer == null)? 0 :this.answer.hashCode()));
        result = ((result* 31)+((this.decisionMode == null)? 0 :this.decisionMode.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this._securityLabelNumber == null)? 0 :this._securityLabelNumber.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        result = ((result* 31)+((this.party == null)? 0 :this.party.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract_Offer) == false) {
            return false;
        }
        Contract_Offer rhs = ((Contract_Offer) other);
        return (((((((((((((((((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._linkId == rhs._linkId)||((this._linkId!= null)&&this._linkId.equals(rhs._linkId))))&&((this.decision == rhs.decision)||((this.decision!= null)&&this.decision.equals(rhs.decision))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.securityLabelNumber == rhs.securityLabelNumber)||((this.securityLabelNumber!= null)&&this.securityLabelNumber.equals(rhs.securityLabelNumber))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.linkId == rhs.linkId)||((this.linkId!= null)&&this.linkId.equals(rhs.linkId))))&&((this.answer == rhs.answer)||((this.answer!= null)&&this.answer.equals(rhs.answer))))&&((this.decisionMode == rhs.decisionMode)||((this.decisionMode!= null)&&this.decisionMode.equals(rhs.decisionMode))))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this._securityLabelNumber == rhs._securityLabelNumber)||((this._securityLabelNumber!= null)&&this._securityLabelNumber.equals(rhs._securityLabelNumber))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))))&&((this.party == rhs.party)||((this.party!= null)&&this.party.equals(rhs.party))));
    }

}
