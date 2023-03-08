
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "level",
    "_level",
    "from",
    "_from",
    "to",
    "_to"
})
@Generated("jsonschema2pojo")
public class EffectEvidenceSynthesis_PrecisionEstimate {

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
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double level;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_level")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _level;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("from")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double from;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_from")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _from;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("to")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double to;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_to")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _to;

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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("level")
    public Double getLevel() {
        return level;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("level")
    public void setLevel(Double level) {
        this.level = level;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_level")
    public Element get_level() {
        return _level;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_level")
    public void set_level(Element _level) {
        this._level = _level;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("from")
    public Double getFrom() {
        return from;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("from")
    public void setFrom(Double from) {
        this.from = from;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_from")
    public Element get_from() {
        return _from;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_from")
    public void set_from(Element _from) {
        this._from = _from;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("to")
    public Double getTo() {
        return to;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("to")
    public void setTo(Double to) {
        this.to = to;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_to")
    public Element get_to() {
        return _to;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_to")
    public void set_to(Element _to) {
        this._to = _to;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EffectEvidenceSynthesis_PrecisionEstimate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("_level");
        sb.append('=');
        sb.append(((this._level == null)?"<null>":this._level));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("_from");
        sb.append('=');
        sb.append(((this._from == null)?"<null>":this._from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
        sb.append(',');
        sb.append("_to");
        sb.append('=');
        sb.append(((this._to == null)?"<null>":this._to));
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
        result = ((result* 31)+((this._from == null)? 0 :this._from.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._level == null)? 0 :this._level.hashCode()));
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
        result = ((result* 31)+((this._to == null)? 0 :this._to.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EffectEvidenceSynthesis_PrecisionEstimate) == false) {
            return false;
        }
        EffectEvidenceSynthesis_PrecisionEstimate rhs = ((EffectEvidenceSynthesis_PrecisionEstimate) other);
        return (((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._from == rhs._from)||((this._from!= null)&&this._from.equals(rhs._from))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._level == rhs._level)||((this._level!= null)&&this._level.equals(rhs._level))))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))))&&((this._to == rhs._to)||((this._to!= null)&&this._to.equals(rhs._to))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
