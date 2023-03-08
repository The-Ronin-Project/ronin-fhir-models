
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "sequence",
    "_sequence",
    "type",
    "date",
    "_date",
    "procedureCodeableConcept",
    "procedureReference",
    "udi"
})
@Generated("jsonschema2pojo")
public class Claim_Procedure {

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double sequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sequence;
    /**
     * When the condition was observed or the relative ranking.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("When the condition was observed or the relative ranking.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String date;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _date;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("procedureCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept procedureCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("procedureReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference procedureReference;
    /**
     * Unique Device Identifiers associated with this line item.
     * 
     */
    @JsonProperty("udi")
    @JsonPropertyDescription("Unique Device Identifiers associated with this line item.")
    private List<Reference> udi = new ArrayList<Reference>();

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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    public Double getSequence() {
        return sequence;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("sequence")
    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public Element get_sequence() {
        return _sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public void set_sequence(Element _sequence) {
        this._sequence = _sequence;
    }

    /**
     * When the condition was observed or the relative ranking.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * When the condition was observed or the relative ranking.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public Element get_date() {
        return _date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public void set_date(Element _date) {
        this._date = _date;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("procedureCodeableConcept")
    public CodeableConcept getProcedureCodeableConcept() {
        return procedureCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("procedureCodeableConcept")
    public void setProcedureCodeableConcept(CodeableConcept procedureCodeableConcept) {
        this.procedureCodeableConcept = procedureCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("procedureReference")
    public Reference getProcedureReference() {
        return procedureReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("procedureReference")
    public void setProcedureReference(Reference procedureReference) {
        this.procedureReference = procedureReference;
    }

    /**
     * Unique Device Identifiers associated with this line item.
     * 
     */
    @JsonProperty("udi")
    public List<Reference> getUdi() {
        return udi;
    }

    /**
     * Unique Device Identifiers associated with this line item.
     * 
     */
    @JsonProperty("udi")
    public void setUdi(List<Reference> udi) {
        this.udi = udi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Claim_Procedure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("sequence");
        sb.append('=');
        sb.append(((this.sequence == null)?"<null>":this.sequence));
        sb.append(',');
        sb.append("_sequence");
        sb.append('=');
        sb.append(((this._sequence == null)?"<null>":this._sequence));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("procedureCodeableConcept");
        sb.append('=');
        sb.append(((this.procedureCodeableConcept == null)?"<null>":this.procedureCodeableConcept));
        sb.append(',');
        sb.append("procedureReference");
        sb.append('=');
        sb.append(((this.procedureReference == null)?"<null>":this.procedureReference));
        sb.append(',');
        sb.append("udi");
        sb.append('=');
        sb.append(((this.udi == null)?"<null>":this.udi));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this.procedureCodeableConcept == null)? 0 :this.procedureCodeableConcept.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.procedureReference == null)? 0 :this.procedureReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.udi == null)? 0 :this.udi.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Claim_Procedure) == false) {
            return false;
        }
        Claim_Procedure rhs = ((Claim_Procedure) other);
        return ((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this.procedureCodeableConcept == rhs.procedureCodeableConcept)||((this.procedureCodeableConcept!= null)&&this.procedureCodeableConcept.equals(rhs.procedureCodeableConcept))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.procedureReference == rhs.procedureReference)||((this.procedureReference!= null)&&this.procedureReference.equals(rhs.procedureReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.udi == rhs.udi)||((this.udi!= null)&&this.udi.equals(rhs.udi))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
