
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
 * A record of a healthcare consumer&rsquo;s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "_type",
    "period",
    "actor",
    "action",
    "securityLabel",
    "purpose",
    "class",
    "code",
    "dataPeriod",
    "data",
    "provision"
})
@Generated("jsonschema2pojo")
public class Consent_Provision {

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
     * Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.")
    private Consent_Provision.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
     * 
     */
    @JsonProperty("actor")
    @JsonPropertyDescription("Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').")
    private List<Consent_Actor> actor = new ArrayList<Consent_Actor>();
    /**
     * Actions controlled by this Rule.
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("Actions controlled by this Rule.")
    private List<CodeableConcept> action = new ArrayList<CodeableConcept>();
    /**
     * A security label, comprised of 0..* security label fields (Privacy tags), which define which resources are controlled by this exception.
     * 
     */
    @JsonProperty("securityLabel")
    @JsonPropertyDescription("A security label, comprised of 0..* security label fields (Privacy tags), which define which resources are controlled by this exception.")
    private List<Coding> securityLabel = new ArrayList<Coding>();
    /**
     * The context of the activities a user is taking - why the user is accessing the data - that are controlled by this rule.
     * 
     */
    @JsonProperty("purpose")
    @JsonPropertyDescription("The context of the activities a user is taking - why the user is accessing the data - that are controlled by this rule.")
    private List<Coding> purpose = new ArrayList<Coding>();
    /**
     * The class of information covered by this rule. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.
     * 
     */
    @JsonProperty("class")
    @JsonPropertyDescription("The class of information covered by this rule. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.")
    private List<Coding> _class = new ArrayList<Coding>();
    /**
     * If this code is found in an instance, then the rule applies.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("If this code is found in an instance, then the rule applies.")
    private List<CodeableConcept> code = new ArrayList<CodeableConcept>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("dataPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period dataPeriod;
    /**
     * The resources controlled by this rule if specific resources are referenced.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("The resources controlled by this rule if specific resources are referenced.")
    private List<Consent_Data> data = new ArrayList<Consent_Data>();
    /**
     * Rules which provide exceptions to the base rule or subrules.
     * 
     */
    @JsonProperty("provision")
    @JsonPropertyDescription("Rules which provide exceptions to the base rule or subrules.")
    private List<Consent_Provision> provision = new ArrayList<Consent_Provision>();

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
     * Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.
     * 
     */
    @JsonProperty("type")
    public Consent_Provision.Type getType() {
        return type;
    }

    /**
     * Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.
     * 
     */
    @JsonProperty("type")
    public void setType(Consent_Provision.Type type) {
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
     * 
     */
    @JsonProperty("actor")
    public List<Consent_Actor> getActor() {
        return actor;
    }

    /**
     * Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
     * 
     */
    @JsonProperty("actor")
    public void setActor(List<Consent_Actor> actor) {
        this.actor = actor;
    }

    /**
     * Actions controlled by this Rule.
     * 
     */
    @JsonProperty("action")
    public List<CodeableConcept> getAction() {
        return action;
    }

    /**
     * Actions controlled by this Rule.
     * 
     */
    @JsonProperty("action")
    public void setAction(List<CodeableConcept> action) {
        this.action = action;
    }

    /**
     * A security label, comprised of 0..* security label fields (Privacy tags), which define which resources are controlled by this exception.
     * 
     */
    @JsonProperty("securityLabel")
    public List<Coding> getSecurityLabel() {
        return securityLabel;
    }

    /**
     * A security label, comprised of 0..* security label fields (Privacy tags), which define which resources are controlled by this exception.
     * 
     */
    @JsonProperty("securityLabel")
    public void setSecurityLabel(List<Coding> securityLabel) {
        this.securityLabel = securityLabel;
    }

    /**
     * The context of the activities a user is taking - why the user is accessing the data - that are controlled by this rule.
     * 
     */
    @JsonProperty("purpose")
    public List<Coding> getPurpose() {
        return purpose;
    }

    /**
     * The context of the activities a user is taking - why the user is accessing the data - that are controlled by this rule.
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(List<Coding> purpose) {
        this.purpose = purpose;
    }

    /**
     * The class of information covered by this rule. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.
     * 
     */
    @JsonProperty("class")
    public List<Coding> getClass_() {
        return _class;
    }

    /**
     * The class of information covered by this rule. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.
     * 
     */
    @JsonProperty("class")
    public void setClass_(List<Coding> _class) {
        this._class = _class;
    }

    /**
     * If this code is found in an instance, then the rule applies.
     * 
     */
    @JsonProperty("code")
    public List<CodeableConcept> getCode() {
        return code;
    }

    /**
     * If this code is found in an instance, then the rule applies.
     * 
     */
    @JsonProperty("code")
    public void setCode(List<CodeableConcept> code) {
        this.code = code;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("dataPeriod")
    public Period getDataPeriod() {
        return dataPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("dataPeriod")
    public void setDataPeriod(Period dataPeriod) {
        this.dataPeriod = dataPeriod;
    }

    /**
     * The resources controlled by this rule if specific resources are referenced.
     * 
     */
    @JsonProperty("data")
    public List<Consent_Data> getData() {
        return data;
    }

    /**
     * The resources controlled by this rule if specific resources are referenced.
     * 
     */
    @JsonProperty("data")
    public void setData(List<Consent_Data> data) {
        this.data = data;
    }

    /**
     * Rules which provide exceptions to the base rule or subrules.
     * 
     */
    @JsonProperty("provision")
    public List<Consent_Provision> getProvision() {
        return provision;
    }

    /**
     * Rules which provide exceptions to the base rule or subrules.
     * 
     */
    @JsonProperty("provision")
    public void setProvision(List<Consent_Provision> provision) {
        this.provision = provision;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Consent_Provision.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("actor");
        sb.append('=');
        sb.append(((this.actor == null)?"<null>":this.actor));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("securityLabel");
        sb.append('=');
        sb.append(((this.securityLabel == null)?"<null>":this.securityLabel));
        sb.append(',');
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("dataPeriod");
        sb.append('=');
        sb.append(((this.dataPeriod == null)?"<null>":this.dataPeriod));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("provision");
        sb.append('=');
        sb.append(((this.provision == null)?"<null>":this.provision));
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
        result = ((result* 31)+((this.dataPeriod == null)? 0 :this.dataPeriod.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.securityLabel == null)? 0 :this.securityLabel.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.actor == null)? 0 :this.actor.hashCode()));
        result = ((result* 31)+((this.provision == null)? 0 :this.provision.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Consent_Provision) == false) {
            return false;
        }
        Consent_Provision rhs = ((Consent_Provision) other);
        return ((((((((((((((((this.dataPeriod == rhs.dataPeriod)||((this.dataPeriod!= null)&&this.dataPeriod.equals(rhs.dataPeriod)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.securityLabel == rhs.securityLabel)||((this.securityLabel!= null)&&this.securityLabel.equals(rhs.securityLabel))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.actor == rhs.actor)||((this.actor!= null)&&this.actor.equals(rhs.actor))))&&((this.provision == rhs.provision)||((this.provision!= null)&&this.provision.equals(rhs.provision))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))));
    }


    /**
     * Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        DENY("deny"),
        PERMIT("permit");
        private final String value;
        private final static Map<String, Consent_Provision.Type> CONSTANTS = new HashMap<String, Consent_Provision.Type>();

        static {
            for (Consent_Provision.Type c: values()) {
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
        public static Consent_Provision.Type fromValue(String value) {
            Consent_Provision.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
