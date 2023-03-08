
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
    "scope",
    "type",
    "typeReference",
    "subtype",
    "relationship",
    "context",
    "condition",
    "_condition",
    "periodType",
    "period",
    "usePeriod",
    "text",
    "_text",
    "linkId",
    "_linkId",
    "answer",
    "securityLabelNumber",
    "_securityLabelNumber",
    "valuedItem"
})
@Generated("jsonschema2pojo")
public class Contract_Asset {

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
    @JsonProperty("scope")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept scope;
    /**
     * Target entity type about which the term may be concerned.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Target entity type about which the term may be concerned.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * Associated entities.
     * 
     */
    @JsonProperty("typeReference")
    @JsonPropertyDescription("Associated entities.")
    private List<Reference> typeReference = new ArrayList<Reference>();
    /**
     * May be a subtype or part of an offered asset.
     * 
     */
    @JsonProperty("subtype")
    @JsonPropertyDescription("May be a subtype or part of an offered asset.")
    private List<CodeableConcept> subtype = new ArrayList<CodeableConcept>();
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding relationship;
    /**
     * Circumstance of the asset.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("Circumstance of the asset.")
    private List<Contract_Context> context = new ArrayList<Contract_Context>();
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
     * Type of Asset availability for use or ownership.
     * 
     */
    @JsonProperty("periodType")
    @JsonPropertyDescription("Type of Asset availability for use or ownership.")
    private List<CodeableConcept> periodType = new ArrayList<CodeableConcept>();
    /**
     * Asset relevant contractual time period.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Asset relevant contractual time period.")
    private List<Period> period = new ArrayList<Period>();
    /**
     * Time period of asset use.
     * 
     */
    @JsonProperty("usePeriod")
    @JsonPropertyDescription("Time period of asset use.")
    private List<Period> usePeriod = new ArrayList<Period>();
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
     * Id [identifier??] of the clause or question text about the asset in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    @JsonPropertyDescription("Id [identifier??] of the clause or question text about the asset in the referenced form or QuestionnaireResponse.")
    private List<String> linkId = new ArrayList<String>();
    /**
     * Extensions for linkId
     * 
     */
    @JsonProperty("_linkId")
    @JsonPropertyDescription("Extensions for linkId")
    private List<Element> _linkId = new ArrayList<Element>();
    /**
     * Response to assets.
     * 
     */
    @JsonProperty("answer")
    @JsonPropertyDescription("Response to assets.")
    private List<Contract_Answer> answer = new ArrayList<Contract_Answer>();
    /**
     * Security labels that protects the asset.
     * 
     */
    @JsonProperty("securityLabelNumber")
    @JsonPropertyDescription("Security labels that protects the asset.")
    private List<Double> securityLabelNumber = new ArrayList<Double>();
    /**
     * Extensions for securityLabelNumber
     * 
     */
    @JsonProperty("_securityLabelNumber")
    @JsonPropertyDescription("Extensions for securityLabelNumber")
    private List<Element> _securityLabelNumber = new ArrayList<Element>();
    /**
     * Contract Valued Item List.
     * 
     */
    @JsonProperty("valuedItem")
    @JsonPropertyDescription("Contract Valued Item List.")
    private List<Contract_ValuedItem> valuedItem = new ArrayList<Contract_ValuedItem>();

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
    @JsonProperty("scope")
    public CodeableConcept getScope() {
        return scope;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scope")
    public void setScope(CodeableConcept scope) {
        this.scope = scope;
    }

    /**
     * Target entity type about which the term may be concerned.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * Target entity type about which the term may be concerned.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * Associated entities.
     * 
     */
    @JsonProperty("typeReference")
    public List<Reference> getTypeReference() {
        return typeReference;
    }

    /**
     * Associated entities.
     * 
     */
    @JsonProperty("typeReference")
    public void setTypeReference(List<Reference> typeReference) {
        this.typeReference = typeReference;
    }

    /**
     * May be a subtype or part of an offered asset.
     * 
     */
    @JsonProperty("subtype")
    public List<CodeableConcept> getSubtype() {
        return subtype;
    }

    /**
     * May be a subtype or part of an offered asset.
     * 
     */
    @JsonProperty("subtype")
    public void setSubtype(List<CodeableConcept> subtype) {
        this.subtype = subtype;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("relationship")
    public Coding getRelationship() {
        return relationship;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(Coding relationship) {
        this.relationship = relationship;
    }

    /**
     * Circumstance of the asset.
     * 
     */
    @JsonProperty("context")
    public List<Contract_Context> getContext() {
        return context;
    }

    /**
     * Circumstance of the asset.
     * 
     */
    @JsonProperty("context")
    public void setContext(List<Contract_Context> context) {
        this.context = context;
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
     * Type of Asset availability for use or ownership.
     * 
     */
    @JsonProperty("periodType")
    public List<CodeableConcept> getPeriodType() {
        return periodType;
    }

    /**
     * Type of Asset availability for use or ownership.
     * 
     */
    @JsonProperty("periodType")
    public void setPeriodType(List<CodeableConcept> periodType) {
        this.periodType = periodType;
    }

    /**
     * Asset relevant contractual time period.
     * 
     */
    @JsonProperty("period")
    public List<Period> getPeriod() {
        return period;
    }

    /**
     * Asset relevant contractual time period.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(List<Period> period) {
        this.period = period;
    }

    /**
     * Time period of asset use.
     * 
     */
    @JsonProperty("usePeriod")
    public List<Period> getUsePeriod() {
        return usePeriod;
    }

    /**
     * Time period of asset use.
     * 
     */
    @JsonProperty("usePeriod")
    public void setUsePeriod(List<Period> usePeriod) {
        this.usePeriod = usePeriod;
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
     * Id [identifier??] of the clause or question text about the asset in the referenced form or QuestionnaireResponse.
     * 
     */
    @JsonProperty("linkId")
    public List<String> getLinkId() {
        return linkId;
    }

    /**
     * Id [identifier??] of the clause or question text about the asset in the referenced form or QuestionnaireResponse.
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
     * Response to assets.
     * 
     */
    @JsonProperty("answer")
    public List<Contract_Answer> getAnswer() {
        return answer;
    }

    /**
     * Response to assets.
     * 
     */
    @JsonProperty("answer")
    public void setAnswer(List<Contract_Answer> answer) {
        this.answer = answer;
    }

    /**
     * Security labels that protects the asset.
     * 
     */
    @JsonProperty("securityLabelNumber")
    public List<Double> getSecurityLabelNumber() {
        return securityLabelNumber;
    }

    /**
     * Security labels that protects the asset.
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

    /**
     * Contract Valued Item List.
     * 
     */
    @JsonProperty("valuedItem")
    public List<Contract_ValuedItem> getValuedItem() {
        return valuedItem;
    }

    /**
     * Contract Valued Item List.
     * 
     */
    @JsonProperty("valuedItem")
    public void setValuedItem(List<Contract_ValuedItem> valuedItem) {
        this.valuedItem = valuedItem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contract_Asset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("typeReference");
        sb.append('=');
        sb.append(((this.typeReference == null)?"<null>":this.typeReference));
        sb.append(',');
        sb.append("subtype");
        sb.append('=');
        sb.append(((this.subtype == null)?"<null>":this.subtype));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("_condition");
        sb.append('=');
        sb.append(((this._condition == null)?"<null>":this._condition));
        sb.append(',');
        sb.append("periodType");
        sb.append('=');
        sb.append(((this.periodType == null)?"<null>":this.periodType));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("usePeriod");
        sb.append('=');
        sb.append(((this.usePeriod == null)?"<null>":this.usePeriod));
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
        sb.append("answer");
        sb.append('=');
        sb.append(((this.answer == null)?"<null>":this.answer));
        sb.append(',');
        sb.append("securityLabelNumber");
        sb.append('=');
        sb.append(((this.securityLabelNumber == null)?"<null>":this.securityLabelNumber));
        sb.append(',');
        sb.append("_securityLabelNumber");
        sb.append('=');
        sb.append(((this._securityLabelNumber == null)?"<null>":this._securityLabelNumber));
        sb.append(',');
        sb.append("valuedItem");
        sb.append('=');
        sb.append(((this.valuedItem == null)?"<null>":this.valuedItem));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._linkId == null)? 0 :this._linkId.hashCode()));
        result = ((result* 31)+((this.usePeriod == null)? 0 :this.usePeriod.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.securityLabelNumber == null)? 0 :this.securityLabelNumber.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.periodType == null)? 0 :this.periodType.hashCode()));
        result = ((result* 31)+((this.linkId == null)? 0 :this.linkId.hashCode()));
        result = ((result* 31)+((this.answer == null)? 0 :this.answer.hashCode()));
        result = ((result* 31)+((this.subtype == null)? 0 :this.subtype.hashCode()));
        result = ((result* 31)+((this._condition == null)? 0 :this._condition.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.typeReference == null)? 0 :this.typeReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this._securityLabelNumber == null)? 0 :this._securityLabelNumber.hashCode()));
        result = ((result* 31)+((this.valuedItem == null)? 0 :this.valuedItem.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract_Asset) == false) {
            return false;
        }
        Contract_Asset rhs = ((Contract_Asset) other);
        return (((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._linkId == rhs._linkId)||((this._linkId!= null)&&this._linkId.equals(rhs._linkId))))&&((this.usePeriod == rhs.usePeriod)||((this.usePeriod!= null)&&this.usePeriod.equals(rhs.usePeriod))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.securityLabelNumber == rhs.securityLabelNumber)||((this.securityLabelNumber!= null)&&this.securityLabelNumber.equals(rhs.securityLabelNumber))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.periodType == rhs.periodType)||((this.periodType!= null)&&this.periodType.equals(rhs.periodType))))&&((this.linkId == rhs.linkId)||((this.linkId!= null)&&this.linkId.equals(rhs.linkId))))&&((this.answer == rhs.answer)||((this.answer!= null)&&this.answer.equals(rhs.answer))))&&((this.subtype == rhs.subtype)||((this.subtype!= null)&&this.subtype.equals(rhs.subtype))))&&((this._condition == rhs._condition)||((this._condition!= null)&&this._condition.equals(rhs._condition))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.typeReference == rhs.typeReference)||((this.typeReference!= null)&&this.typeReference.equals(rhs.typeReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this._securityLabelNumber == rhs._securityLabelNumber)||((this._securityLabelNumber!= null)&&this._securityLabelNumber.equals(rhs._securityLabelNumber))))&&((this.valuedItem == rhs.valuedItem)||((this.valuedItem!= null)&&this.valuedItem.equals(rhs.valuedItem))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))));
    }

}
