
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
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "category",
    "_category",
    "range",
    "context",
    "appliesTo",
    "gender",
    "_gender",
    "age",
    "gestationalAge",
    "condition",
    "_condition"
})
@Generated("jsonschema2pojo")
public class ObservationDefinition_QualifiedInterval {

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
     * The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.")
    private ObservationDefinition_QualifiedInterval.Category category;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_category")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _category;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("range")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range range;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept context;
    /**
     * Codes to indicate the target population this reference range applies to.
     * 
     */
    @JsonProperty("appliesTo")
    @JsonPropertyDescription("Codes to indicate the target population this reference range applies to.")
    private List<CodeableConcept> appliesTo = new ArrayList<CodeableConcept>();
    /**
     * Sex of the population the range applies to.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("Sex of the population the range applies to.")
    private ObservationDefinition_QualifiedInterval.Gender gender;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gender")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _gender;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("age")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range age;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("gestationalAge")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range gestationalAge;
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
     * The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("category")
    public ObservationDefinition_QualifiedInterval.Category getCategory() {
        return category;
    }

    /**
     * The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("category")
    public void setCategory(ObservationDefinition_QualifiedInterval.Category category) {
        this.category = category;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_category")
    public Element get_category() {
        return _category;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_category")
    public void set_category(Element _category) {
        this._category = _category;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("range")
    public Range getRange() {
        return range;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("range")
    public void setRange(Range range) {
        this.range = range;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("context")
    public CodeableConcept getContext() {
        return context;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("context")
    public void setContext(CodeableConcept context) {
        this.context = context;
    }

    /**
     * Codes to indicate the target population this reference range applies to.
     * 
     */
    @JsonProperty("appliesTo")
    public List<CodeableConcept> getAppliesTo() {
        return appliesTo;
    }

    /**
     * Codes to indicate the target population this reference range applies to.
     * 
     */
    @JsonProperty("appliesTo")
    public void setAppliesTo(List<CodeableConcept> appliesTo) {
        this.appliesTo = appliesTo;
    }

    /**
     * Sex of the population the range applies to.
     * 
     */
    @JsonProperty("gender")
    public ObservationDefinition_QualifiedInterval.Gender getGender() {
        return gender;
    }

    /**
     * Sex of the population the range applies to.
     * 
     */
    @JsonProperty("gender")
    public void setGender(ObservationDefinition_QualifiedInterval.Gender gender) {
        this.gender = gender;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gender")
    public Element get_gender() {
        return _gender;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gender")
    public void set_gender(Element _gender) {
        this._gender = _gender;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("age")
    public Range getAge() {
        return age;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("age")
    public void setAge(Range age) {
        this.age = age;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("gestationalAge")
    public Range getGestationalAge() {
        return gestationalAge;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("gestationalAge")
    public void setGestationalAge(Range gestationalAge) {
        this.gestationalAge = gestationalAge;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObservationDefinition_QualifiedInterval.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("_category");
        sb.append('=');
        sb.append(((this._category == null)?"<null>":this._category));
        sb.append(',');
        sb.append("range");
        sb.append('=');
        sb.append(((this.range == null)?"<null>":this.range));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("appliesTo");
        sb.append('=');
        sb.append(((this.appliesTo == null)?"<null>":this.appliesTo));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("_gender");
        sb.append('=');
        sb.append(((this._gender == null)?"<null>":this._gender));
        sb.append(',');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
        sb.append(',');
        sb.append("gestationalAge");
        sb.append('=');
        sb.append(((this.gestationalAge == null)?"<null>":this.gestationalAge));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("_condition");
        sb.append('=');
        sb.append(((this._condition == null)?"<null>":this._condition));
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
        result = ((result* 31)+((this.gestationalAge == null)? 0 :this.gestationalAge.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.range == null)? 0 :this.range.hashCode()));
        result = ((result* 31)+((this.appliesTo == null)? 0 :this.appliesTo.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this._gender == null)? 0 :this._gender.hashCode()));
        result = ((result* 31)+((this._condition == null)? 0 :this._condition.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this._category == null)? 0 :this._category.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.age == null)? 0 :this.age.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObservationDefinition_QualifiedInterval) == false) {
            return false;
        }
        ObservationDefinition_QualifiedInterval rhs = ((ObservationDefinition_QualifiedInterval) other);
        return (((((((((((((((this.gestationalAge == rhs.gestationalAge)||((this.gestationalAge!= null)&&this.gestationalAge.equals(rhs.gestationalAge)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.range == rhs.range)||((this.range!= null)&&this.range.equals(rhs.range))))&&((this.appliesTo == rhs.appliesTo)||((this.appliesTo!= null)&&this.appliesTo.equals(rhs.appliesTo))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this._gender == rhs._gender)||((this._gender!= null)&&this._gender.equals(rhs._gender))))&&((this._condition == rhs._condition)||((this._condition!= null)&&this._condition.equals(rhs._condition))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this._category == rhs._category)||((this._category!= null)&&this._category.equals(rhs._category))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.age == rhs.age)||((this.age!= null)&&this.age.equals(rhs.age))));
    }


    /**
     * The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Category {

        REFERENCE("reference"),
        CRITICAL("critical"),
        ABSOLUTE("absolute");
        private final String value;
        private final static Map<String, ObservationDefinition_QualifiedInterval.Category> CONSTANTS = new HashMap<String, ObservationDefinition_QualifiedInterval.Category>();

        static {
            for (ObservationDefinition_QualifiedInterval.Category c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Category(String value) {
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
        public static ObservationDefinition_QualifiedInterval.Category fromValue(String value) {
            ObservationDefinition_QualifiedInterval.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Sex of the population the range applies to.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Gender {

        MALE("male"),
        FEMALE("female"),
        OTHER("other"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, ObservationDefinition_QualifiedInterval.Gender> CONSTANTS = new HashMap<String, ObservationDefinition_QualifiedInterval.Gender>();

        static {
            for (ObservationDefinition_QualifiedInterval.Gender c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Gender(String value) {
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
        public static ObservationDefinition_QualifiedInterval.Gender fromValue(String value) {
            ObservationDefinition_QualifiedInterval.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
