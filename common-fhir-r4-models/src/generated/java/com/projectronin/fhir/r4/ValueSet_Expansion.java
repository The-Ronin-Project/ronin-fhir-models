
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "identifier",
    "_identifier",
    "timestamp",
    "_timestamp",
    "total",
    "_total",
    "offset",
    "_offset",
    "parameter",
    "contains"
})
@Generated("jsonschema2pojo")
public class ValueSet_Expansion {

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String identifier;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_identifier")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _identifier;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String timestamp;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timestamp")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timestamp;
    /**
     * A whole number
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("A whole number")
    private Double total;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_total")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _total;
    /**
     * A whole number
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("A whole number")
    private Double offset;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_offset")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _offset;
    /**
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
     * 
     */
    @JsonProperty("parameter")
    @JsonPropertyDescription("A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.")
    private List<ValueSet_Parameter> parameter = new ArrayList<ValueSet_Parameter>();
    /**
     * The codes that are contained in the value set expansion.
     * 
     */
    @JsonProperty("contains")
    @JsonPropertyDescription("The codes that are contained in the value set expansion.")
    private List<ValueSet_Contains> contains = new ArrayList<ValueSet_Contains>();

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_identifier")
    public Element get_identifier() {
        return _identifier;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_identifier")
    public void set_identifier(Element _identifier) {
        this._identifier = _identifier;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timestamp")
    public Element get_timestamp() {
        return _timestamp;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timestamp")
    public void set_timestamp(Element _timestamp) {
        this._timestamp = _timestamp;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_total")
    public Element get_total() {
        return _total;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_total")
    public void set_total(Element _total) {
        this._total = _total;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("offset")
    public Double getOffset() {
        return offset;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_offset")
    public Element get_offset() {
        return _offset;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_offset")
    public void set_offset(Element _offset) {
        this._offset = _offset;
    }

    /**
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
     * 
     */
    @JsonProperty("parameter")
    public List<ValueSet_Parameter> getParameter() {
        return parameter;
    }

    /**
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
     * 
     */
    @JsonProperty("parameter")
    public void setParameter(List<ValueSet_Parameter> parameter) {
        this.parameter = parameter;
    }

    /**
     * The codes that are contained in the value set expansion.
     * 
     */
    @JsonProperty("contains")
    public List<ValueSet_Contains> getContains() {
        return contains;
    }

    /**
     * The codes that are contained in the value set expansion.
     * 
     */
    @JsonProperty("contains")
    public void setContains(List<ValueSet_Contains> contains) {
        this.contains = contains;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValueSet_Expansion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("_identifier");
        sb.append('=');
        sb.append(((this._identifier == null)?"<null>":this._identifier));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("_timestamp");
        sb.append('=');
        sb.append(((this._timestamp == null)?"<null>":this._timestamp));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("_total");
        sb.append('=');
        sb.append(((this._total == null)?"<null>":this._total));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("_offset");
        sb.append('=');
        sb.append(((this._offset == null)?"<null>":this._offset));
        sb.append(',');
        sb.append("parameter");
        sb.append('=');
        sb.append(((this.parameter == null)?"<null>":this.parameter));
        sb.append(',');
        sb.append("contains");
        sb.append('=');
        sb.append(((this.contains == null)?"<null>":this.contains));
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
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._identifier == null)? 0 :this._identifier.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.contains == null)? 0 :this.contains.hashCode()));
        result = ((result* 31)+((this._offset == null)? 0 :this._offset.hashCode()));
        result = ((result* 31)+((this._total == null)? 0 :this._total.hashCode()));
        result = ((result* 31)+((this.parameter == null)? 0 :this.parameter.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._timestamp == null)? 0 :this._timestamp.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueSet_Expansion) == false) {
            return false;
        }
        ValueSet_Expansion rhs = ((ValueSet_Expansion) other);
        return ((((((((((((((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._identifier == rhs._identifier)||((this._identifier!= null)&&this._identifier.equals(rhs._identifier))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.contains == rhs.contains)||((this.contains!= null)&&this.contains.equals(rhs.contains))))&&((this._offset == rhs._offset)||((this._offset!= null)&&this._offset.equals(rhs._offset))))&&((this._total == rhs._total)||((this._total!= null)&&this._total.equals(rhs._total))))&&((this.parameter == rhs.parameter)||((this.parameter!= null)&&this.parameter.equals(rhs.parameter))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._timestamp == rhs._timestamp)||((this._timestamp!= null)&&this._timestamp.equals(rhs._timestamp))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
