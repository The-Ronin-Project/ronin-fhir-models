
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
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "actionId",
    "_actionId",
    "relationship",
    "_relationship",
    "offsetDuration",
    "offsetRange"
})
@Generated("jsonschema2pojo")
public class PlanDefinition_RelatedAction {

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
    @JsonProperty("actionId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String actionId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actionId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _actionId;
    /**
     * The relationship of this action to the related action.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("The relationship of this action to the related action.")
    private PlanDefinition_RelatedAction.Relationship relationship;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relationship")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _relationship;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("offsetDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration offsetDuration;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("offsetRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range offsetRange;

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
    @JsonProperty("actionId")
    public String getActionId() {
        return actionId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("actionId")
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actionId")
    public Element get_actionId() {
        return _actionId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actionId")
    public void set_actionId(Element _actionId) {
        this._actionId = _actionId;
    }

    /**
     * The relationship of this action to the related action.
     * 
     */
    @JsonProperty("relationship")
    public PlanDefinition_RelatedAction.Relationship getRelationship() {
        return relationship;
    }

    /**
     * The relationship of this action to the related action.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(PlanDefinition_RelatedAction.Relationship relationship) {
        this.relationship = relationship;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relationship")
    public Element get_relationship() {
        return _relationship;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relationship")
    public void set_relationship(Element _relationship) {
        this._relationship = _relationship;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("offsetDuration")
    public Duration getOffsetDuration() {
        return offsetDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("offsetDuration")
    public void setOffsetDuration(Duration offsetDuration) {
        this.offsetDuration = offsetDuration;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("offsetRange")
    public Range getOffsetRange() {
        return offsetRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("offsetRange")
    public void setOffsetRange(Range offsetRange) {
        this.offsetRange = offsetRange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlanDefinition_RelatedAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("actionId");
        sb.append('=');
        sb.append(((this.actionId == null)?"<null>":this.actionId));
        sb.append(',');
        sb.append("_actionId");
        sb.append('=');
        sb.append(((this._actionId == null)?"<null>":this._actionId));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("_relationship");
        sb.append('=');
        sb.append(((this._relationship == null)?"<null>":this._relationship));
        sb.append(',');
        sb.append("offsetDuration");
        sb.append('=');
        sb.append(((this.offsetDuration == null)?"<null>":this.offsetDuration));
        sb.append(',');
        sb.append("offsetRange");
        sb.append('=');
        sb.append(((this.offsetRange == null)?"<null>":this.offsetRange));
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
        result = ((result* 31)+((this._relationship == null)? 0 :this._relationship.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.actionId == null)? 0 :this.actionId.hashCode()));
        result = ((result* 31)+((this.offsetDuration == null)? 0 :this.offsetDuration.hashCode()));
        result = ((result* 31)+((this.offsetRange == null)? 0 :this.offsetRange.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this._actionId == null)? 0 :this._actionId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlanDefinition_RelatedAction) == false) {
            return false;
        }
        PlanDefinition_RelatedAction rhs = ((PlanDefinition_RelatedAction) other);
        return ((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._relationship == rhs._relationship)||((this._relationship!= null)&&this._relationship.equals(rhs._relationship))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.actionId == rhs.actionId)||((this.actionId!= null)&&this.actionId.equals(rhs.actionId))))&&((this.offsetDuration == rhs.offsetDuration)||((this.offsetDuration!= null)&&this.offsetDuration.equals(rhs.offsetDuration))))&&((this.offsetRange == rhs.offsetRange)||((this.offsetRange!= null)&&this.offsetRange.equals(rhs.offsetRange))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this._actionId == rhs._actionId)||((this._actionId!= null)&&this._actionId.equals(rhs._actionId))));
    }


    /**
     * The relationship of this action to the related action.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Relationship {

        BEFORE_START("before-start"),
        BEFORE("before"),
        BEFORE_END("before-end"),
        CONCURRENT_WITH_START("concurrent-with-start"),
        CONCURRENT("concurrent"),
        CONCURRENT_WITH_END("concurrent-with-end"),
        AFTER_START("after-start"),
        AFTER("after"),
        AFTER_END("after-end");
        private final String value;
        private final static Map<String, PlanDefinition_RelatedAction.Relationship> CONSTANTS = new HashMap<String, PlanDefinition_RelatedAction.Relationship>();

        static {
            for (PlanDefinition_RelatedAction.Relationship c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Relationship(String value) {
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
        public static PlanDefinition_RelatedAction.Relationship fromValue(String value) {
            PlanDefinition_RelatedAction.Relationship constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
