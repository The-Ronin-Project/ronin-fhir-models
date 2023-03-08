
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Raw data describing a biological sequence.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "score",
    "_score",
    "numTP",
    "_numTP",
    "numFP",
    "_numFP",
    "numFN",
    "_numFN",
    "precision",
    "_precision",
    "sensitivity",
    "_sensitivity",
    "fMeasure",
    "_fMeasure"
})
@Generated("jsonschema2pojo")
public class MolecularSequence_Roc {

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
     * Invidual data point representing the GQ (genotype quality) score threshold.
     * 
     */
    @JsonProperty("score")
    @JsonPropertyDescription("Invidual data point representing the GQ (genotype quality) score threshold.")
    private List<Double> score = new ArrayList<Double>();
    /**
     * Extensions for score
     * 
     */
    @JsonProperty("_score")
    @JsonPropertyDescription("Extensions for score")
    private List<Element> _score = new ArrayList<Element>();
    /**
     * The number of true positives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numTP")
    @JsonPropertyDescription("The number of true positives if the GQ score threshold was set to \"score\" field value.")
    private List<Double> numTP = new ArrayList<Double>();
    /**
     * Extensions for numTP
     * 
     */
    @JsonProperty("_numTP")
    @JsonPropertyDescription("Extensions for numTP")
    private List<Element> _numTP = new ArrayList<Element>();
    /**
     * The number of false positives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numFP")
    @JsonPropertyDescription("The number of false positives if the GQ score threshold was set to \"score\" field value.")
    private List<Double> numFP = new ArrayList<Double>();
    /**
     * Extensions for numFP
     * 
     */
    @JsonProperty("_numFP")
    @JsonPropertyDescription("Extensions for numFP")
    private List<Element> _numFP = new ArrayList<Element>();
    /**
     * The number of false negatives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numFN")
    @JsonPropertyDescription("The number of false negatives if the GQ score threshold was set to \"score\" field value.")
    private List<Double> numFN = new ArrayList<Double>();
    /**
     * Extensions for numFN
     * 
     */
    @JsonProperty("_numFN")
    @JsonPropertyDescription("Extensions for numFN")
    private List<Element> _numFN = new ArrayList<Element>();
    /**
     * Calculated precision if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("precision")
    @JsonPropertyDescription("Calculated precision if the GQ score threshold was set to \"score\" field value.")
    private List<Double> precision = new ArrayList<Double>();
    /**
     * Extensions for precision
     * 
     */
    @JsonProperty("_precision")
    @JsonPropertyDescription("Extensions for precision")
    private List<Element> _precision = new ArrayList<Element>();
    /**
     * Calculated sensitivity if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("sensitivity")
    @JsonPropertyDescription("Calculated sensitivity if the GQ score threshold was set to \"score\" field value.")
    private List<Double> sensitivity = new ArrayList<Double>();
    /**
     * Extensions for sensitivity
     * 
     */
    @JsonProperty("_sensitivity")
    @JsonPropertyDescription("Extensions for sensitivity")
    private List<Element> _sensitivity = new ArrayList<Element>();
    /**
     * Calculated fScore if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("fMeasure")
    @JsonPropertyDescription("Calculated fScore if the GQ score threshold was set to \"score\" field value.")
    private List<Double> fMeasure = new ArrayList<Double>();
    /**
     * Extensions for fMeasure
     * 
     */
    @JsonProperty("_fMeasure")
    @JsonPropertyDescription("Extensions for fMeasure")
    private List<Element> _fMeasure = new ArrayList<Element>();

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
     * Invidual data point representing the GQ (genotype quality) score threshold.
     * 
     */
    @JsonProperty("score")
    public List<Double> getScore() {
        return score;
    }

    /**
     * Invidual data point representing the GQ (genotype quality) score threshold.
     * 
     */
    @JsonProperty("score")
    public void setScore(List<Double> score) {
        this.score = score;
    }

    /**
     * Extensions for score
     * 
     */
    @JsonProperty("_score")
    public List<Element> get_score() {
        return _score;
    }

    /**
     * Extensions for score
     * 
     */
    @JsonProperty("_score")
    public void set_score(List<Element> _score) {
        this._score = _score;
    }

    /**
     * The number of true positives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numTP")
    public List<Double> getNumTP() {
        return numTP;
    }

    /**
     * The number of true positives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numTP")
    public void setNumTP(List<Double> numTP) {
        this.numTP = numTP;
    }

    /**
     * Extensions for numTP
     * 
     */
    @JsonProperty("_numTP")
    public List<Element> get_numTP() {
        return _numTP;
    }

    /**
     * Extensions for numTP
     * 
     */
    @JsonProperty("_numTP")
    public void set_numTP(List<Element> _numTP) {
        this._numTP = _numTP;
    }

    /**
     * The number of false positives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numFP")
    public List<Double> getNumFP() {
        return numFP;
    }

    /**
     * The number of false positives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numFP")
    public void setNumFP(List<Double> numFP) {
        this.numFP = numFP;
    }

    /**
     * Extensions for numFP
     * 
     */
    @JsonProperty("_numFP")
    public List<Element> get_numFP() {
        return _numFP;
    }

    /**
     * Extensions for numFP
     * 
     */
    @JsonProperty("_numFP")
    public void set_numFP(List<Element> _numFP) {
        this._numFP = _numFP;
    }

    /**
     * The number of false negatives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numFN")
    public List<Double> getNumFN() {
        return numFN;
    }

    /**
     * The number of false negatives if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("numFN")
    public void setNumFN(List<Double> numFN) {
        this.numFN = numFN;
    }

    /**
     * Extensions for numFN
     * 
     */
    @JsonProperty("_numFN")
    public List<Element> get_numFN() {
        return _numFN;
    }

    /**
     * Extensions for numFN
     * 
     */
    @JsonProperty("_numFN")
    public void set_numFN(List<Element> _numFN) {
        this._numFN = _numFN;
    }

    /**
     * Calculated precision if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("precision")
    public List<Double> getPrecision() {
        return precision;
    }

    /**
     * Calculated precision if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("precision")
    public void setPrecision(List<Double> precision) {
        this.precision = precision;
    }

    /**
     * Extensions for precision
     * 
     */
    @JsonProperty("_precision")
    public List<Element> get_precision() {
        return _precision;
    }

    /**
     * Extensions for precision
     * 
     */
    @JsonProperty("_precision")
    public void set_precision(List<Element> _precision) {
        this._precision = _precision;
    }

    /**
     * Calculated sensitivity if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("sensitivity")
    public List<Double> getSensitivity() {
        return sensitivity;
    }

    /**
     * Calculated sensitivity if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("sensitivity")
    public void setSensitivity(List<Double> sensitivity) {
        this.sensitivity = sensitivity;
    }

    /**
     * Extensions for sensitivity
     * 
     */
    @JsonProperty("_sensitivity")
    public List<Element> get_sensitivity() {
        return _sensitivity;
    }

    /**
     * Extensions for sensitivity
     * 
     */
    @JsonProperty("_sensitivity")
    public void set_sensitivity(List<Element> _sensitivity) {
        this._sensitivity = _sensitivity;
    }

    /**
     * Calculated fScore if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("fMeasure")
    public List<Double> getfMeasure() {
        return fMeasure;
    }

    /**
     * Calculated fScore if the GQ score threshold was set to &quot;score&quot; field value.
     * 
     */
    @JsonProperty("fMeasure")
    public void setfMeasure(List<Double> fMeasure) {
        this.fMeasure = fMeasure;
    }

    /**
     * Extensions for fMeasure
     * 
     */
    @JsonProperty("_fMeasure")
    public List<Element> get_fMeasure() {
        return _fMeasure;
    }

    /**
     * Extensions for fMeasure
     * 
     */
    @JsonProperty("_fMeasure")
    public void set_fMeasure(List<Element> _fMeasure) {
        this._fMeasure = _fMeasure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MolecularSequence_Roc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("_score");
        sb.append('=');
        sb.append(((this._score == null)?"<null>":this._score));
        sb.append(',');
        sb.append("numTP");
        sb.append('=');
        sb.append(((this.numTP == null)?"<null>":this.numTP));
        sb.append(',');
        sb.append("_numTP");
        sb.append('=');
        sb.append(((this._numTP == null)?"<null>":this._numTP));
        sb.append(',');
        sb.append("numFP");
        sb.append('=');
        sb.append(((this.numFP == null)?"<null>":this.numFP));
        sb.append(',');
        sb.append("_numFP");
        sb.append('=');
        sb.append(((this._numFP == null)?"<null>":this._numFP));
        sb.append(',');
        sb.append("numFN");
        sb.append('=');
        sb.append(((this.numFN == null)?"<null>":this.numFN));
        sb.append(',');
        sb.append("_numFN");
        sb.append('=');
        sb.append(((this._numFN == null)?"<null>":this._numFN));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("_precision");
        sb.append('=');
        sb.append(((this._precision == null)?"<null>":this._precision));
        sb.append(',');
        sb.append("sensitivity");
        sb.append('=');
        sb.append(((this.sensitivity == null)?"<null>":this.sensitivity));
        sb.append(',');
        sb.append("_sensitivity");
        sb.append('=');
        sb.append(((this._sensitivity == null)?"<null>":this._sensitivity));
        sb.append(',');
        sb.append("fMeasure");
        sb.append('=');
        sb.append(((this.fMeasure == null)?"<null>":this.fMeasure));
        sb.append(',');
        sb.append("_fMeasure");
        sb.append('=');
        sb.append(((this._fMeasure == null)?"<null>":this._fMeasure));
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
        result = ((result* 31)+((this._numTP == null)? 0 :this._numTP.hashCode()));
        result = ((result* 31)+((this._precision == null)? 0 :this._precision.hashCode()));
        result = ((result* 31)+((this.numTP == null)? 0 :this.numTP.hashCode()));
        result = ((result* 31)+((this.fMeasure == null)? 0 :this.fMeasure.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.precision == null)? 0 :this.precision.hashCode()));
        result = ((result* 31)+((this.numFN == null)? 0 :this.numFN.hashCode()));
        result = ((result* 31)+((this._score == null)? 0 :this._score.hashCode()));
        result = ((result* 31)+((this._numFN == null)? 0 :this._numFN.hashCode()));
        result = ((result* 31)+((this._numFP == null)? 0 :this._numFP.hashCode()));
        result = ((result* 31)+((this._sensitivity == null)? 0 :this._sensitivity.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.numFP == null)? 0 :this.numFP.hashCode()));
        result = ((result* 31)+((this._fMeasure == null)? 0 :this._fMeasure.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.sensitivity == null)? 0 :this.sensitivity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MolecularSequence_Roc) == false) {
            return false;
        }
        MolecularSequence_Roc rhs = ((MolecularSequence_Roc) other);
        return ((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._numTP == rhs._numTP)||((this._numTP!= null)&&this._numTP.equals(rhs._numTP))))&&((this._precision == rhs._precision)||((this._precision!= null)&&this._precision.equals(rhs._precision))))&&((this.numTP == rhs.numTP)||((this.numTP!= null)&&this.numTP.equals(rhs.numTP))))&&((this.fMeasure == rhs.fMeasure)||((this.fMeasure!= null)&&this.fMeasure.equals(rhs.fMeasure))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.precision == rhs.precision)||((this.precision!= null)&&this.precision.equals(rhs.precision))))&&((this.numFN == rhs.numFN)||((this.numFN!= null)&&this.numFN.equals(rhs.numFN))))&&((this._score == rhs._score)||((this._score!= null)&&this._score.equals(rhs._score))))&&((this._numFN == rhs._numFN)||((this._numFN!= null)&&this._numFN.equals(rhs._numFN))))&&((this._numFP == rhs._numFP)||((this._numFP!= null)&&this._numFP.equals(rhs._numFP))))&&((this._sensitivity == rhs._sensitivity)||((this._sensitivity!= null)&&this._sensitivity.equals(rhs._sensitivity))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.numFP == rhs.numFP)||((this.numFP!= null)&&this.numFP.equals(rhs.numFP))))&&((this._fMeasure == rhs._fMeasure)||((this._fMeasure!= null)&&this._fMeasure.equals(rhs._fMeasure))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.sensitivity == rhs.sensitivity)||((this.sensitivity!= null)&&this.sensitivity.equals(rhs.sensitivity))));
    }

}
