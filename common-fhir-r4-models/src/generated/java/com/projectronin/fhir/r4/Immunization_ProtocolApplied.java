
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "series",
    "_series",
    "authority",
    "targetDisease",
    "doseNumberPositiveInt",
    "_doseNumberPositiveInt",
    "doseNumberString",
    "_doseNumberString",
    "seriesDosesPositiveInt",
    "_seriesDosesPositiveInt",
    "seriesDosesString",
    "_seriesDosesString"
})
@Generated("jsonschema2pojo")
public class Immunization_ProtocolApplied {

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
    @JsonProperty("series")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String series;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_series")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _series;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authority")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference authority;
    /**
     * The vaccine preventable disease the dose is being administered against.
     * 
     */
    @JsonProperty("targetDisease")
    @JsonPropertyDescription("The vaccine preventable disease the dose is being administered against.")
    private List<CodeableConcept> targetDisease = new ArrayList<CodeableConcept>();
    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    @JsonPropertyDescription("Nominal position in a series.")
    private Double doseNumberPositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberPositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doseNumberPositiveInt;
    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberString")
    @JsonPropertyDescription("Nominal position in a series.")
    private String doseNumberString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doseNumberString;
    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesPositiveInt")
    @JsonPropertyDescription("The recommended number of doses to achieve immunity.")
    private Double seriesDosesPositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesPositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _seriesDosesPositiveInt;
    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesString")
    @JsonPropertyDescription("The recommended number of doses to achieve immunity.")
    private String seriesDosesString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _seriesDosesString;

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
    @JsonProperty("series")
    public String getSeries() {
        return series;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("series")
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_series")
    public Element get_series() {
        return _series;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_series")
    public void set_series(Element _series) {
        this._series = _series;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authority")
    public Reference getAuthority() {
        return authority;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authority")
    public void setAuthority(Reference authority) {
        this.authority = authority;
    }

    /**
     * The vaccine preventable disease the dose is being administered against.
     * 
     */
    @JsonProperty("targetDisease")
    public List<CodeableConcept> getTargetDisease() {
        return targetDisease;
    }

    /**
     * The vaccine preventable disease the dose is being administered against.
     * 
     */
    @JsonProperty("targetDisease")
    public void setTargetDisease(List<CodeableConcept> targetDisease) {
        this.targetDisease = targetDisease;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    public Double getDoseNumberPositiveInt() {
        return doseNumberPositiveInt;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    public void setDoseNumberPositiveInt(Double doseNumberPositiveInt) {
        this.doseNumberPositiveInt = doseNumberPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberPositiveInt")
    public Element get_doseNumberPositiveInt() {
        return _doseNumberPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberPositiveInt")
    public void set_doseNumberPositiveInt(Element _doseNumberPositiveInt) {
        this._doseNumberPositiveInt = _doseNumberPositiveInt;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberString")
    public String getDoseNumberString() {
        return doseNumberString;
    }

    /**
     * Nominal position in a series.
     * 
     */
    @JsonProperty("doseNumberString")
    public void setDoseNumberString(String doseNumberString) {
        this.doseNumberString = doseNumberString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberString")
    public Element get_doseNumberString() {
        return _doseNumberString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberString")
    public void set_doseNumberString(Element _doseNumberString) {
        this._doseNumberString = _doseNumberString;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesPositiveInt")
    public Double getSeriesDosesPositiveInt() {
        return seriesDosesPositiveInt;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesPositiveInt")
    public void setSeriesDosesPositiveInt(Double seriesDosesPositiveInt) {
        this.seriesDosesPositiveInt = seriesDosesPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesPositiveInt")
    public Element get_seriesDosesPositiveInt() {
        return _seriesDosesPositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesPositiveInt")
    public void set_seriesDosesPositiveInt(Element _seriesDosesPositiveInt) {
        this._seriesDosesPositiveInt = _seriesDosesPositiveInt;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesString")
    public String getSeriesDosesString() {
        return seriesDosesString;
    }

    /**
     * The recommended number of doses to achieve immunity.
     * 
     */
    @JsonProperty("seriesDosesString")
    public void setSeriesDosesString(String seriesDosesString) {
        this.seriesDosesString = seriesDosesString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesString")
    public Element get_seriesDosesString() {
        return _seriesDosesString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_seriesDosesString")
    public void set_seriesDosesString(Element _seriesDosesString) {
        this._seriesDosesString = _seriesDosesString;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Immunization_ProtocolApplied.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("_series");
        sb.append('=');
        sb.append(((this._series == null)?"<null>":this._series));
        sb.append(',');
        sb.append("authority");
        sb.append('=');
        sb.append(((this.authority == null)?"<null>":this.authority));
        sb.append(',');
        sb.append("targetDisease");
        sb.append('=');
        sb.append(((this.targetDisease == null)?"<null>":this.targetDisease));
        sb.append(',');
        sb.append("doseNumberPositiveInt");
        sb.append('=');
        sb.append(((this.doseNumberPositiveInt == null)?"<null>":this.doseNumberPositiveInt));
        sb.append(',');
        sb.append("_doseNumberPositiveInt");
        sb.append('=');
        sb.append(((this._doseNumberPositiveInt == null)?"<null>":this._doseNumberPositiveInt));
        sb.append(',');
        sb.append("doseNumberString");
        sb.append('=');
        sb.append(((this.doseNumberString == null)?"<null>":this.doseNumberString));
        sb.append(',');
        sb.append("_doseNumberString");
        sb.append('=');
        sb.append(((this._doseNumberString == null)?"<null>":this._doseNumberString));
        sb.append(',');
        sb.append("seriesDosesPositiveInt");
        sb.append('=');
        sb.append(((this.seriesDosesPositiveInt == null)?"<null>":this.seriesDosesPositiveInt));
        sb.append(',');
        sb.append("_seriesDosesPositiveInt");
        sb.append('=');
        sb.append(((this._seriesDosesPositiveInt == null)?"<null>":this._seriesDosesPositiveInt));
        sb.append(',');
        sb.append("seriesDosesString");
        sb.append('=');
        sb.append(((this.seriesDosesString == null)?"<null>":this.seriesDosesString));
        sb.append(',');
        sb.append("_seriesDosesString");
        sb.append('=');
        sb.append(((this._seriesDosesString == null)?"<null>":this._seriesDosesString));
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
        result = ((result* 31)+((this.seriesDosesPositiveInt == null)? 0 :this.seriesDosesPositiveInt.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._series == null)? 0 :this._series.hashCode()));
        result = ((result* 31)+((this.seriesDosesString == null)? 0 :this.seriesDosesString.hashCode()));
        result = ((result* 31)+((this._seriesDosesPositiveInt == null)? 0 :this._seriesDosesPositiveInt.hashCode()));
        result = ((result* 31)+((this._seriesDosesString == null)? 0 :this._seriesDosesString.hashCode()));
        result = ((result* 31)+((this.doseNumberString == null)? 0 :this.doseNumberString.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this._doseNumberPositiveInt == null)? 0 :this._doseNumberPositiveInt.hashCode()));
        result = ((result* 31)+((this.authority == null)? 0 :this.authority.hashCode()));
        result = ((result* 31)+((this.doseNumberPositiveInt == null)? 0 :this.doseNumberPositiveInt.hashCode()));
        result = ((result* 31)+((this.targetDisease == null)? 0 :this.targetDisease.hashCode()));
        result = ((result* 31)+((this._doseNumberString == null)? 0 :this._doseNumberString.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Immunization_ProtocolApplied) == false) {
            return false;
        }
        Immunization_ProtocolApplied rhs = ((Immunization_ProtocolApplied) other);
        return ((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.seriesDosesPositiveInt == rhs.seriesDosesPositiveInt)||((this.seriesDosesPositiveInt!= null)&&this.seriesDosesPositiveInt.equals(rhs.seriesDosesPositiveInt))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._series == rhs._series)||((this._series!= null)&&this._series.equals(rhs._series))))&&((this.seriesDosesString == rhs.seriesDosesString)||((this.seriesDosesString!= null)&&this.seriesDosesString.equals(rhs.seriesDosesString))))&&((this._seriesDosesPositiveInt == rhs._seriesDosesPositiveInt)||((this._seriesDosesPositiveInt!= null)&&this._seriesDosesPositiveInt.equals(rhs._seriesDosesPositiveInt))))&&((this._seriesDosesString == rhs._seriesDosesString)||((this._seriesDosesString!= null)&&this._seriesDosesString.equals(rhs._seriesDosesString))))&&((this.doseNumberString == rhs.doseNumberString)||((this.doseNumberString!= null)&&this.doseNumberString.equals(rhs.doseNumberString))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this._doseNumberPositiveInt == rhs._doseNumberPositiveInt)||((this._doseNumberPositiveInt!= null)&&this._doseNumberPositiveInt.equals(rhs._doseNumberPositiveInt))))&&((this.authority == rhs.authority)||((this.authority!= null)&&this.authority.equals(rhs.authority))))&&((this.doseNumberPositiveInt == rhs.doseNumberPositiveInt)||((this.doseNumberPositiveInt!= null)&&this.doseNumberPositiveInt.equals(rhs.doseNumberPositiveInt))))&&((this.targetDisease == rhs.targetDisease)||((this.targetDisease!= null)&&this.targetDisease.equals(rhs.targetDisease))))&&((this._doseNumberString == rhs._doseNumberString)||((this._doseNumberString!= null)&&this._doseNumberString.equals(rhs._doseNumberString))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
