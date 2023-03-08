
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
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "description",
    "_description",
    "exposureState",
    "_exposureState",
    "variantState",
    "riskEvidenceSynthesis"
})
@Generated("jsonschema2pojo")
public class EffectEvidenceSynthesis_ResultsByExposure {

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
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * Whether these results are for the exposure state or alternative exposure state.
     * 
     */
    @JsonProperty("exposureState")
    @JsonPropertyDescription("Whether these results are for the exposure state or alternative exposure state.")
    private EffectEvidenceSynthesis_ResultsByExposure.ExposureState exposureState;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exposureState")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _exposureState;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("variantState")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept variantState;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("riskEvidenceSynthesis")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference riskEvidenceSynthesis;

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
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * Whether these results are for the exposure state or alternative exposure state.
     * 
     */
    @JsonProperty("exposureState")
    public EffectEvidenceSynthesis_ResultsByExposure.ExposureState getExposureState() {
        return exposureState;
    }

    /**
     * Whether these results are for the exposure state or alternative exposure state.
     * 
     */
    @JsonProperty("exposureState")
    public void setExposureState(EffectEvidenceSynthesis_ResultsByExposure.ExposureState exposureState) {
        this.exposureState = exposureState;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exposureState")
    public Element get_exposureState() {
        return _exposureState;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_exposureState")
    public void set_exposureState(Element _exposureState) {
        this._exposureState = _exposureState;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("variantState")
    public CodeableConcept getVariantState() {
        return variantState;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("variantState")
    public void setVariantState(CodeableConcept variantState) {
        this.variantState = variantState;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("riskEvidenceSynthesis")
    public Reference getRiskEvidenceSynthesis() {
        return riskEvidenceSynthesis;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("riskEvidenceSynthesis")
    public void setRiskEvidenceSynthesis(Reference riskEvidenceSynthesis) {
        this.riskEvidenceSynthesis = riskEvidenceSynthesis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EffectEvidenceSynthesis_ResultsByExposure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("exposureState");
        sb.append('=');
        sb.append(((this.exposureState == null)?"<null>":this.exposureState));
        sb.append(',');
        sb.append("_exposureState");
        sb.append('=');
        sb.append(((this._exposureState == null)?"<null>":this._exposureState));
        sb.append(',');
        sb.append("variantState");
        sb.append('=');
        sb.append(((this.variantState == null)?"<null>":this.variantState));
        sb.append(',');
        sb.append("riskEvidenceSynthesis");
        sb.append('=');
        sb.append(((this.riskEvidenceSynthesis == null)?"<null>":this.riskEvidenceSynthesis));
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
        result = ((result* 31)+((this._exposureState == null)? 0 :this._exposureState.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.variantState == null)? 0 :this.variantState.hashCode()));
        result = ((result* 31)+((this.exposureState == null)? 0 :this.exposureState.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.riskEvidenceSynthesis == null)? 0 :this.riskEvidenceSynthesis.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EffectEvidenceSynthesis_ResultsByExposure) == false) {
            return false;
        }
        EffectEvidenceSynthesis_ResultsByExposure rhs = ((EffectEvidenceSynthesis_ResultsByExposure) other);
        return ((((((((((this._exposureState == rhs._exposureState)||((this._exposureState!= null)&&this._exposureState.equals(rhs._exposureState)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.variantState == rhs.variantState)||((this.variantState!= null)&&this.variantState.equals(rhs.variantState))))&&((this.exposureState == rhs.exposureState)||((this.exposureState!= null)&&this.exposureState.equals(rhs.exposureState))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.riskEvidenceSynthesis == rhs.riskEvidenceSynthesis)||((this.riskEvidenceSynthesis!= null)&&this.riskEvidenceSynthesis.equals(rhs.riskEvidenceSynthesis))));
    }


    /**
     * Whether these results are for the exposure state or alternative exposure state.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ExposureState {

        EXPOSURE("exposure"),
        EXPOSURE_ALTERNATIVE("exposure-alternative");
        private final String value;
        private final static Map<String, EffectEvidenceSynthesis_ResultsByExposure.ExposureState> CONSTANTS = new HashMap<String, EffectEvidenceSynthesis_ResultsByExposure.ExposureState>();

        static {
            for (EffectEvidenceSynthesis_ResultsByExposure.ExposureState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ExposureState(String value) {
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
        public static EffectEvidenceSynthesis_ResultsByExposure.ExposureState fromValue(String value) {
            EffectEvidenceSynthesis_ResultsByExposure.ExposureState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
