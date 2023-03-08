
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
    "issued",
    "_issued",
    "applies",
    "topicCodeableConcept",
    "topicReference",
    "type",
    "subType",
    "text",
    "_text",
    "securityLabel",
    "offer",
    "asset",
    "action",
    "group"
})
@Generated("jsonschema2pojo")
public class Contract_Term {

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
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String issued;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _issued;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("applies")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period applies;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topicCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept topicCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topicReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference topicReference;
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
    @JsonProperty("subType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept subType;
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
     * Security labels that protect the handling of information about the term and its elements, which may be specifically identified..
     * 
     */
    @JsonProperty("securityLabel")
    @JsonPropertyDescription("Security labels that protect the handling of information about the term and its elements, which may be specifically identified..")
    private List<Contract_SecurityLabel> securityLabel = new ArrayList<Contract_SecurityLabel>();
    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     * (Required)
     * 
     */
    @JsonProperty("offer")
    @JsonPropertyDescription("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")
    private Contract_Offer offer;
    /**
     * Contract Term Asset List.
     * 
     */
    @JsonProperty("asset")
    @JsonPropertyDescription("Contract Term Asset List.")
    private List<Contract_Asset> asset = new ArrayList<Contract_Asset>();
    /**
     * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.")
    private List<Contract_Action> action = new ArrayList<Contract_Action>();
    /**
     * Nested group of Contract Provisions.
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Nested group of Contract Provisions.")
    private List<Contract_Term> group = new ArrayList<Contract_Term>();

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
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    public String getIssued() {
        return issued;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public Element get_issued() {
        return _issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public void set_issued(Element _issued) {
        this._issued = _issued;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("applies")
    public Period getApplies() {
        return applies;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("applies")
    public void setApplies(Period applies) {
        this.applies = applies;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topicCodeableConcept")
    public CodeableConcept getTopicCodeableConcept() {
        return topicCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("topicCodeableConcept")
    public void setTopicCodeableConcept(CodeableConcept topicCodeableConcept) {
        this.topicCodeableConcept = topicCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topicReference")
    public Reference getTopicReference() {
        return topicReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("topicReference")
    public void setTopicReference(Reference topicReference) {
        this.topicReference = topicReference;
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
    @JsonProperty("subType")
    public CodeableConcept getSubType() {
        return subType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subType")
    public void setSubType(CodeableConcept subType) {
        this.subType = subType;
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
     * Security labels that protect the handling of information about the term and its elements, which may be specifically identified..
     * 
     */
    @JsonProperty("securityLabel")
    public List<Contract_SecurityLabel> getSecurityLabel() {
        return securityLabel;
    }

    /**
     * Security labels that protect the handling of information about the term and its elements, which may be specifically identified..
     * 
     */
    @JsonProperty("securityLabel")
    public void setSecurityLabel(List<Contract_SecurityLabel> securityLabel) {
        this.securityLabel = securityLabel;
    }

    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     * (Required)
     * 
     */
    @JsonProperty("offer")
    public Contract_Offer getOffer() {
        return offer;
    }

    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     * (Required)
     * 
     */
    @JsonProperty("offer")
    public void setOffer(Contract_Offer offer) {
        this.offer = offer;
    }

    /**
     * Contract Term Asset List.
     * 
     */
    @JsonProperty("asset")
    public List<Contract_Asset> getAsset() {
        return asset;
    }

    /**
     * Contract Term Asset List.
     * 
     */
    @JsonProperty("asset")
    public void setAsset(List<Contract_Asset> asset) {
        this.asset = asset;
    }

    /**
     * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
     * 
     */
    @JsonProperty("action")
    public List<Contract_Action> getAction() {
        return action;
    }

    /**
     * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
     * 
     */
    @JsonProperty("action")
    public void setAction(List<Contract_Action> action) {
        this.action = action;
    }

    /**
     * Nested group of Contract Provisions.
     * 
     */
    @JsonProperty("group")
    public List<Contract_Term> getGroup() {
        return group;
    }

    /**
     * Nested group of Contract Provisions.
     * 
     */
    @JsonProperty("group")
    public void setGroup(List<Contract_Term> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contract_Term.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("issued");
        sb.append('=');
        sb.append(((this.issued == null)?"<null>":this.issued));
        sb.append(',');
        sb.append("_issued");
        sb.append('=');
        sb.append(((this._issued == null)?"<null>":this._issued));
        sb.append(',');
        sb.append("applies");
        sb.append('=');
        sb.append(((this.applies == null)?"<null>":this.applies));
        sb.append(',');
        sb.append("topicCodeableConcept");
        sb.append('=');
        sb.append(((this.topicCodeableConcept == null)?"<null>":this.topicCodeableConcept));
        sb.append(',');
        sb.append("topicReference");
        sb.append('=');
        sb.append(((this.topicReference == null)?"<null>":this.topicReference));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("subType");
        sb.append('=');
        sb.append(((this.subType == null)?"<null>":this.subType));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
        sb.append(',');
        sb.append("securityLabel");
        sb.append('=');
        sb.append(((this.securityLabel == null)?"<null>":this.securityLabel));
        sb.append(',');
        sb.append("offer");
        sb.append('=');
        sb.append(((this.offer == null)?"<null>":this.offer));
        sb.append(',');
        sb.append("asset");
        sb.append('=');
        sb.append(((this.asset == null)?"<null>":this.asset));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
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
        result = ((result* 31)+((this.securityLabel == null)? 0 :this.securityLabel.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.topicCodeableConcept == null)? 0 :this.topicCodeableConcept.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._issued == null)? 0 :this._issued.hashCode()));
        result = ((result* 31)+((this.offer == null)? 0 :this.offer.hashCode()));
        result = ((result* 31)+((this.applies == null)? 0 :this.applies.hashCode()));
        result = ((result* 31)+((this.topicReference == null)? 0 :this.topicReference.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.issued == null)? 0 :this.issued.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        result = ((result* 31)+((this.asset == null)? 0 :this.asset.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract_Term) == false) {
            return false;
        }
        Contract_Term rhs = ((Contract_Term) other);
        return (((((((((((((((((((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.securityLabel == rhs.securityLabel)||((this.securityLabel!= null)&&this.securityLabel.equals(rhs.securityLabel))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.topicCodeableConcept == rhs.topicCodeableConcept)||((this.topicCodeableConcept!= null)&&this.topicCodeableConcept.equals(rhs.topicCodeableConcept))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._issued == rhs._issued)||((this._issued!= null)&&this._issued.equals(rhs._issued))))&&((this.offer == rhs.offer)||((this.offer!= null)&&this.offer.equals(rhs.offer))))&&((this.applies == rhs.applies)||((this.applies!= null)&&this.applies.equals(rhs.applies))))&&((this.topicReference == rhs.topicReference)||((this.topicReference!= null)&&this.topicReference.equals(rhs.topicReference))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.issued == rhs.issued)||((this.issued!= null)&&this.issued.equals(rhs.issued))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))))&&((this.asset == rhs.asset)||((this.asset!= null)&&this.asset.equals(rhs.asset))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
