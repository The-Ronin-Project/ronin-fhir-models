
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "vaccineCode",
    "targetDisease",
    "contraindicatedVaccineCode",
    "forecastStatus",
    "forecastReason",
    "dateCriterion",
    "description",
    "_description",
    "series",
    "_series",
    "doseNumberPositiveInt",
    "_doseNumberPositiveInt",
    "doseNumberString",
    "_doseNumberString",
    "seriesDosesPositiveInt",
    "_seriesDosesPositiveInt",
    "seriesDosesString",
    "_seriesDosesString",
    "supportingImmunization",
    "supportingPatientInformation"
})
@Generated("jsonschema2pojo")
public class ImmunizationRecommendation_Recommendation {

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
     * Vaccine(s) or vaccine group that pertain to the recommendation.
     * 
     */
    @JsonProperty("vaccineCode")
    @JsonPropertyDescription("Vaccine(s) or vaccine group that pertain to the recommendation.")
    private List<CodeableConcept> vaccineCode = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("targetDisease")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept targetDisease;
    /**
     * Vaccine(s) which should not be used to fulfill the recommendation.
     * 
     */
    @JsonProperty("contraindicatedVaccineCode")
    @JsonPropertyDescription("Vaccine(s) which should not be used to fulfill the recommendation.")
    private List<CodeableConcept> contraindicatedVaccineCode = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("forecastStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept forecastStatus;
    /**
     * The reason for the assigned forecast status.
     * 
     */
    @JsonProperty("forecastReason")
    @JsonPropertyDescription("The reason for the assigned forecast status.")
    private List<CodeableConcept> forecastReason = new ArrayList<CodeableConcept>();
    /**
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * 
     */
    @JsonProperty("dateCriterion")
    @JsonPropertyDescription("Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.")
    private List<ImmunizationRecommendation_DateCriterion> dateCriterion = new ArrayList<ImmunizationRecommendation_DateCriterion>();
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
     * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    @JsonPropertyDescription("Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).")
    private Double doseNumberPositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_doseNumberPositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _doseNumberPositiveInt;
    /**
     * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).
     * 
     */
    @JsonProperty("doseNumberString")
    @JsonPropertyDescription("Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).")
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
     * Immunization event history and/or evaluation that supports the status and recommendation.
     * 
     */
    @JsonProperty("supportingImmunization")
    @JsonPropertyDescription("Immunization event history and/or evaluation that supports the status and recommendation.")
    private List<Reference> supportingImmunization = new ArrayList<Reference>();
    /**
     * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
     * 
     */
    @JsonProperty("supportingPatientInformation")
    @JsonPropertyDescription("Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.")
    private List<Reference> supportingPatientInformation = new ArrayList<Reference>();

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
     * Vaccine(s) or vaccine group that pertain to the recommendation.
     * 
     */
    @JsonProperty("vaccineCode")
    public List<CodeableConcept> getVaccineCode() {
        return vaccineCode;
    }

    /**
     * Vaccine(s) or vaccine group that pertain to the recommendation.
     * 
     */
    @JsonProperty("vaccineCode")
    public void setVaccineCode(List<CodeableConcept> vaccineCode) {
        this.vaccineCode = vaccineCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("targetDisease")
    public CodeableConcept getTargetDisease() {
        return targetDisease;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("targetDisease")
    public void setTargetDisease(CodeableConcept targetDisease) {
        this.targetDisease = targetDisease;
    }

    /**
     * Vaccine(s) which should not be used to fulfill the recommendation.
     * 
     */
    @JsonProperty("contraindicatedVaccineCode")
    public List<CodeableConcept> getContraindicatedVaccineCode() {
        return contraindicatedVaccineCode;
    }

    /**
     * Vaccine(s) which should not be used to fulfill the recommendation.
     * 
     */
    @JsonProperty("contraindicatedVaccineCode")
    public void setContraindicatedVaccineCode(List<CodeableConcept> contraindicatedVaccineCode) {
        this.contraindicatedVaccineCode = contraindicatedVaccineCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("forecastStatus")
    public CodeableConcept getForecastStatus() {
        return forecastStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("forecastStatus")
    public void setForecastStatus(CodeableConcept forecastStatus) {
        this.forecastStatus = forecastStatus;
    }

    /**
     * The reason for the assigned forecast status.
     * 
     */
    @JsonProperty("forecastReason")
    public List<CodeableConcept> getForecastReason() {
        return forecastReason;
    }

    /**
     * The reason for the assigned forecast status.
     * 
     */
    @JsonProperty("forecastReason")
    public void setForecastReason(List<CodeableConcept> forecastReason) {
        this.forecastReason = forecastReason;
    }

    /**
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * 
     */
    @JsonProperty("dateCriterion")
    public List<ImmunizationRecommendation_DateCriterion> getDateCriterion() {
        return dateCriterion;
    }

    /**
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * 
     */
    @JsonProperty("dateCriterion")
    public void setDateCriterion(List<ImmunizationRecommendation_DateCriterion> dateCriterion) {
        this.dateCriterion = dateCriterion;
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
     * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).
     * 
     */
    @JsonProperty("doseNumberPositiveInt")
    public Double getDoseNumberPositiveInt() {
        return doseNumberPositiveInt;
    }

    /**
     * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).
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
     * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).
     * 
     */
    @JsonProperty("doseNumberString")
    public String getDoseNumberString() {
        return doseNumberString;
    }

    /**
     * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose).
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

    /**
     * Immunization event history and/or evaluation that supports the status and recommendation.
     * 
     */
    @JsonProperty("supportingImmunization")
    public List<Reference> getSupportingImmunization() {
        return supportingImmunization;
    }

    /**
     * Immunization event history and/or evaluation that supports the status and recommendation.
     * 
     */
    @JsonProperty("supportingImmunization")
    public void setSupportingImmunization(List<Reference> supportingImmunization) {
        this.supportingImmunization = supportingImmunization;
    }

    /**
     * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
     * 
     */
    @JsonProperty("supportingPatientInformation")
    public List<Reference> getSupportingPatientInformation() {
        return supportingPatientInformation;
    }

    /**
     * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
     * 
     */
    @JsonProperty("supportingPatientInformation")
    public void setSupportingPatientInformation(List<Reference> supportingPatientInformation) {
        this.supportingPatientInformation = supportingPatientInformation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImmunizationRecommendation_Recommendation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("vaccineCode");
        sb.append('=');
        sb.append(((this.vaccineCode == null)?"<null>":this.vaccineCode));
        sb.append(',');
        sb.append("targetDisease");
        sb.append('=');
        sb.append(((this.targetDisease == null)?"<null>":this.targetDisease));
        sb.append(',');
        sb.append("contraindicatedVaccineCode");
        sb.append('=');
        sb.append(((this.contraindicatedVaccineCode == null)?"<null>":this.contraindicatedVaccineCode));
        sb.append(',');
        sb.append("forecastStatus");
        sb.append('=');
        sb.append(((this.forecastStatus == null)?"<null>":this.forecastStatus));
        sb.append(',');
        sb.append("forecastReason");
        sb.append('=');
        sb.append(((this.forecastReason == null)?"<null>":this.forecastReason));
        sb.append(',');
        sb.append("dateCriterion");
        sb.append('=');
        sb.append(((this.dateCriterion == null)?"<null>":this.dateCriterion));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("_series");
        sb.append('=');
        sb.append(((this._series == null)?"<null>":this._series));
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
        sb.append("supportingImmunization");
        sb.append('=');
        sb.append(((this.supportingImmunization == null)?"<null>":this.supportingImmunization));
        sb.append(',');
        sb.append("supportingPatientInformation");
        sb.append('=');
        sb.append(((this.supportingPatientInformation == null)?"<null>":this.supportingPatientInformation));
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
        result = ((result* 31)+((this.supportingImmunization == null)? 0 :this.supportingImmunization.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.forecastReason == null)? 0 :this.forecastReason.hashCode()));
        result = ((result* 31)+((this.seriesDosesPositiveInt == null)? 0 :this.seriesDosesPositiveInt.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._series == null)? 0 :this._series.hashCode()));
        result = ((result* 31)+((this.forecastStatus == null)? 0 :this.forecastStatus.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.seriesDosesString == null)? 0 :this.seriesDosesString.hashCode()));
        result = ((result* 31)+((this.supportingPatientInformation == null)? 0 :this.supportingPatientInformation.hashCode()));
        result = ((result* 31)+((this._seriesDosesPositiveInt == null)? 0 :this._seriesDosesPositiveInt.hashCode()));
        result = ((result* 31)+((this._seriesDosesString == null)? 0 :this._seriesDosesString.hashCode()));
        result = ((result* 31)+((this.doseNumberString == null)? 0 :this.doseNumberString.hashCode()));
        result = ((result* 31)+((this.contraindicatedVaccineCode == null)? 0 :this.contraindicatedVaccineCode.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this._doseNumberPositiveInt == null)? 0 :this._doseNumberPositiveInt.hashCode()));
        result = ((result* 31)+((this.doseNumberPositiveInt == null)? 0 :this.doseNumberPositiveInt.hashCode()));
        result = ((result* 31)+((this.targetDisease == null)? 0 :this.targetDisease.hashCode()));
        result = ((result* 31)+((this._doseNumberString == null)? 0 :this._doseNumberString.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.vaccineCode == null)? 0 :this.vaccineCode.hashCode()));
        result = ((result* 31)+((this.dateCriterion == null)? 0 :this.dateCriterion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImmunizationRecommendation_Recommendation) == false) {
            return false;
        }
        ImmunizationRecommendation_Recommendation rhs = ((ImmunizationRecommendation_Recommendation) other);
        return ((((((((((((((((((((((((this.supportingImmunization == rhs.supportingImmunization)||((this.supportingImmunization!= null)&&this.supportingImmunization.equals(rhs.supportingImmunization)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.forecastReason == rhs.forecastReason)||((this.forecastReason!= null)&&this.forecastReason.equals(rhs.forecastReason))))&&((this.seriesDosesPositiveInt == rhs.seriesDosesPositiveInt)||((this.seriesDosesPositiveInt!= null)&&this.seriesDosesPositiveInt.equals(rhs.seriesDosesPositiveInt))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._series == rhs._series)||((this._series!= null)&&this._series.equals(rhs._series))))&&((this.forecastStatus == rhs.forecastStatus)||((this.forecastStatus!= null)&&this.forecastStatus.equals(rhs.forecastStatus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.seriesDosesString == rhs.seriesDosesString)||((this.seriesDosesString!= null)&&this.seriesDosesString.equals(rhs.seriesDosesString))))&&((this.supportingPatientInformation == rhs.supportingPatientInformation)||((this.supportingPatientInformation!= null)&&this.supportingPatientInformation.equals(rhs.supportingPatientInformation))))&&((this._seriesDosesPositiveInt == rhs._seriesDosesPositiveInt)||((this._seriesDosesPositiveInt!= null)&&this._seriesDosesPositiveInt.equals(rhs._seriesDosesPositiveInt))))&&((this._seriesDosesString == rhs._seriesDosesString)||((this._seriesDosesString!= null)&&this._seriesDosesString.equals(rhs._seriesDosesString))))&&((this.doseNumberString == rhs.doseNumberString)||((this.doseNumberString!= null)&&this.doseNumberString.equals(rhs.doseNumberString))))&&((this.contraindicatedVaccineCode == rhs.contraindicatedVaccineCode)||((this.contraindicatedVaccineCode!= null)&&this.contraindicatedVaccineCode.equals(rhs.contraindicatedVaccineCode))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this._doseNumberPositiveInt == rhs._doseNumberPositiveInt)||((this._doseNumberPositiveInt!= null)&&this._doseNumberPositiveInt.equals(rhs._doseNumberPositiveInt))))&&((this.doseNumberPositiveInt == rhs.doseNumberPositiveInt)||((this.doseNumberPositiveInt!= null)&&this.doseNumberPositiveInt.equals(rhs.doseNumberPositiveInt))))&&((this.targetDisease == rhs.targetDisease)||((this.targetDisease!= null)&&this.targetDisease.equals(rhs.targetDisease))))&&((this._doseNumberString == rhs._doseNumberString)||((this._doseNumberString!= null)&&this._doseNumberString.equals(rhs._doseNumberString))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.vaccineCode == rhs.vaccineCode)||((this.vaccineCode!= null)&&this.vaccineCode.equals(rhs.vaccineCode))))&&((this.dateCriterion == rhs.dateCriterion)||((this.dateCriterion!= null)&&this.dateCriterion.equals(rhs.dateCriterion))));
    }

}
