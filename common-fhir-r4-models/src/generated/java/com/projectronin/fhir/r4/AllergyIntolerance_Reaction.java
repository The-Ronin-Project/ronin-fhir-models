
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
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "substance",
    "manifestation",
    "description",
    "_description",
    "onset",
    "_onset",
    "severity",
    "_severity",
    "exposureRoute",
    "note"
})
@Generated("jsonschema2pojo")
public class AllergyIntolerance_Reaction {

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
    @JsonProperty("substance")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept substance;
    /**
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
     * (Required)
     * 
     */
    @JsonProperty("manifestation")
    @JsonPropertyDescription("Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.")
    private List<CodeableConcept> manifestation = new ArrayList<CodeableConcept>();
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("onset")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String onset;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onset")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _onset;
    /**
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.")
    private AllergyIntolerance_Reaction.Severity severity;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _severity;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("exposureRoute")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept exposureRoute;
    /**
     * Additional text about the adverse reaction event not captured in other fields.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Additional text about the adverse reaction event not captured in other fields.")
    private List<Annotation> note = new ArrayList<Annotation>();

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
    @JsonProperty("substance")
    public CodeableConcept getSubstance() {
        return substance;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("substance")
    public void setSubstance(CodeableConcept substance) {
        this.substance = substance;
    }

    /**
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
     * (Required)
     * 
     */
    @JsonProperty("manifestation")
    public List<CodeableConcept> getManifestation() {
        return manifestation;
    }

    /**
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
     * (Required)
     * 
     */
    @JsonProperty("manifestation")
    public void setManifestation(List<CodeableConcept> manifestation) {
        this.manifestation = manifestation;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("onset")
    public String getOnset() {
        return onset;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("onset")
    public void setOnset(String onset) {
        this.onset = onset;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onset")
    public Element get_onset() {
        return _onset;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_onset")
    public void set_onset(Element _onset) {
        this._onset = _onset;
    }

    /**
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
     * 
     */
    @JsonProperty("severity")
    public AllergyIntolerance_Reaction.Severity getSeverity() {
        return severity;
    }

    /**
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(AllergyIntolerance_Reaction.Severity severity) {
        this.severity = severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public Element get_severity() {
        return _severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public void set_severity(Element _severity) {
        this._severity = _severity;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("exposureRoute")
    public CodeableConcept getExposureRoute() {
        return exposureRoute;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("exposureRoute")
    public void setExposureRoute(CodeableConcept exposureRoute) {
        this.exposureRoute = exposureRoute;
    }

    /**
     * Additional text about the adverse reaction event not captured in other fields.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Additional text about the adverse reaction event not captured in other fields.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AllergyIntolerance_Reaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("substance");
        sb.append('=');
        sb.append(((this.substance == null)?"<null>":this.substance));
        sb.append(',');
        sb.append("manifestation");
        sb.append('=');
        sb.append(((this.manifestation == null)?"<null>":this.manifestation));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("onset");
        sb.append('=');
        sb.append(((this.onset == null)?"<null>":this.onset));
        sb.append(',');
        sb.append("_onset");
        sb.append('=');
        sb.append(((this._onset == null)?"<null>":this._onset));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("_severity");
        sb.append('=');
        sb.append(((this._severity == null)?"<null>":this._severity));
        sb.append(',');
        sb.append("exposureRoute");
        sb.append('=');
        sb.append(((this.exposureRoute == null)?"<null>":this.exposureRoute));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.manifestation == null)? 0 :this.manifestation.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.substance == null)? 0 :this.substance.hashCode()));
        result = ((result* 31)+((this._onset == null)? 0 :this._onset.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.onset == null)? 0 :this.onset.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._severity == null)? 0 :this._severity.hashCode()));
        result = ((result* 31)+((this.exposureRoute == null)? 0 :this.exposureRoute.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllergyIntolerance_Reaction) == false) {
            return false;
        }
        AllergyIntolerance_Reaction rhs = ((AllergyIntolerance_Reaction) other);
        return ((((((((((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.manifestation == rhs.manifestation)||((this.manifestation!= null)&&this.manifestation.equals(rhs.manifestation))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.substance == rhs.substance)||((this.substance!= null)&&this.substance.equals(rhs.substance))))&&((this._onset == rhs._onset)||((this._onset!= null)&&this._onset.equals(rhs._onset))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.onset == rhs.onset)||((this.onset!= null)&&this.onset.equals(rhs.onset))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._severity == rhs._severity)||((this._severity!= null)&&this._severity.equals(rhs._severity))))&&((this.exposureRoute == rhs.exposureRoute)||((this.exposureRoute!= null)&&this.exposureRoute.equals(rhs.exposureRoute))));
    }


    /**
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Severity {

        MILD("mild"),
        MODERATE("moderate"),
        SEVERE("severe");
        private final String value;
        private final static Map<String, AllergyIntolerance_Reaction.Severity> CONSTANTS = new HashMap<String, AllergyIntolerance_Reaction.Severity>();

        static {
            for (AllergyIntolerance_Reaction.Severity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Severity(String value) {
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
        public static AllergyIntolerance_Reaction.Severity fromValue(String value) {
            AllergyIntolerance_Reaction.Severity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
