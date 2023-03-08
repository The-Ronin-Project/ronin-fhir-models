
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
 * Raw data describing a biological sequence.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "_type",
    "standardSequence",
    "start",
    "_start",
    "end",
    "_end",
    "score",
    "method",
    "truthTP",
    "_truthTP",
    "queryTP",
    "_queryTP",
    "truthFN",
    "_truthFN",
    "queryFP",
    "_queryFP",
    "gtFP",
    "_gtFP",
    "precision",
    "_precision",
    "recall",
    "_recall",
    "fScore",
    "_fScore",
    "roc"
})
@Generated("jsonschema2pojo")
public class MolecularSequence_Quality {

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
     * INDEL / SNP / Undefined variant.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("INDEL / SNP / Undefined variant.")
    private MolecularSequence_Quality.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("standardSequence")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept standardSequence;
    /**
     * A whole number
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("A whole number")
    private Double start;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _start;
    /**
     * A whole number
     * 
     */
    @JsonProperty("end")
    @JsonPropertyDescription("A whole number")
    private Double end;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _end;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("score")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity score;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept method;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("truthTP")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double truthTP;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_truthTP")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _truthTP;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("queryTP")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double queryTP;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_queryTP")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _queryTP;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("truthFN")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double truthFN;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_truthFN")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _truthFN;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("queryFP")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double queryFP;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_queryFP")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _queryFP;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("gtFP")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double gtFP;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gtFP")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _gtFP;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("precision")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double precision;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precision")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _precision;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("recall")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double recall;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recall")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _recall;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("fScore")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double fScore;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fScore")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fScore;
    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("roc")
    @JsonPropertyDescription("Raw data describing a biological sequence.")
    private MolecularSequence_Roc roc;

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
     * INDEL / SNP / Undefined variant.
     * 
     */
    @JsonProperty("type")
    public MolecularSequence_Quality.Type getType() {
        return type;
    }

    /**
     * INDEL / SNP / Undefined variant.
     * 
     */
    @JsonProperty("type")
    public void setType(MolecularSequence_Quality.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("standardSequence")
    public CodeableConcept getStandardSequence() {
        return standardSequence;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("standardSequence")
    public void setStandardSequence(CodeableConcept standardSequence) {
        this.standardSequence = standardSequence;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("start")
    public Double getStart() {
        return start;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("start")
    public void setStart(Double start) {
        this.start = start;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    public Element get_start() {
        return _start;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_start")
    public void set_start(Element _start) {
        this._start = _start;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("end")
    public Double getEnd() {
        return end;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("end")
    public void setEnd(Double end) {
        this.end = end;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    public Element get_end() {
        return _end;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_end")
    public void set_end(Element _end) {
        this._end = _end;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("score")
    public Quantity getScore() {
        return score;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("score")
    public void setScore(Quantity score) {
        this.score = score;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public void setMethod(CodeableConcept method) {
        this.method = method;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("truthTP")
    public Double getTruthTP() {
        return truthTP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("truthTP")
    public void setTruthTP(Double truthTP) {
        this.truthTP = truthTP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_truthTP")
    public Element get_truthTP() {
        return _truthTP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_truthTP")
    public void set_truthTP(Element _truthTP) {
        this._truthTP = _truthTP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("queryTP")
    public Double getQueryTP() {
        return queryTP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("queryTP")
    public void setQueryTP(Double queryTP) {
        this.queryTP = queryTP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_queryTP")
    public Element get_queryTP() {
        return _queryTP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_queryTP")
    public void set_queryTP(Element _queryTP) {
        this._queryTP = _queryTP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("truthFN")
    public Double getTruthFN() {
        return truthFN;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("truthFN")
    public void setTruthFN(Double truthFN) {
        this.truthFN = truthFN;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_truthFN")
    public Element get_truthFN() {
        return _truthFN;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_truthFN")
    public void set_truthFN(Element _truthFN) {
        this._truthFN = _truthFN;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("queryFP")
    public Double getQueryFP() {
        return queryFP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("queryFP")
    public void setQueryFP(Double queryFP) {
        this.queryFP = queryFP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_queryFP")
    public Element get_queryFP() {
        return _queryFP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_queryFP")
    public void set_queryFP(Element _queryFP) {
        this._queryFP = _queryFP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("gtFP")
    public Double getGtFP() {
        return gtFP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("gtFP")
    public void setGtFP(Double gtFP) {
        this.gtFP = gtFP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gtFP")
    public Element get_gtFP() {
        return _gtFP;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gtFP")
    public void set_gtFP(Element _gtFP) {
        this._gtFP = _gtFP;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("precision")
    public Double getPrecision() {
        return precision;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("precision")
    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precision")
    public Element get_precision() {
        return _precision;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_precision")
    public void set_precision(Element _precision) {
        this._precision = _precision;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("recall")
    public Double getRecall() {
        return recall;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("recall")
    public void setRecall(Double recall) {
        this.recall = recall;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recall")
    public Element get_recall() {
        return _recall;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_recall")
    public void set_recall(Element _recall) {
        this._recall = _recall;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("fScore")
    public Double getfScore() {
        return fScore;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("fScore")
    public void setfScore(Double fScore) {
        this.fScore = fScore;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fScore")
    public Element get_fScore() {
        return _fScore;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fScore")
    public void set_fScore(Element _fScore) {
        this._fScore = _fScore;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("roc")
    public MolecularSequence_Roc getRoc() {
        return roc;
    }

    /**
     * Raw data describing a biological sequence.
     * 
     */
    @JsonProperty("roc")
    public void setRoc(MolecularSequence_Roc roc) {
        this.roc = roc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MolecularSequence_Quality.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("standardSequence");
        sb.append('=');
        sb.append(((this.standardSequence == null)?"<null>":this.standardSequence));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("_start");
        sb.append('=');
        sb.append(((this._start == null)?"<null>":this._start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        sb.append("_end");
        sb.append('=');
        sb.append(((this._end == null)?"<null>":this._end));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("truthTP");
        sb.append('=');
        sb.append(((this.truthTP == null)?"<null>":this.truthTP));
        sb.append(',');
        sb.append("_truthTP");
        sb.append('=');
        sb.append(((this._truthTP == null)?"<null>":this._truthTP));
        sb.append(',');
        sb.append("queryTP");
        sb.append('=');
        sb.append(((this.queryTP == null)?"<null>":this.queryTP));
        sb.append(',');
        sb.append("_queryTP");
        sb.append('=');
        sb.append(((this._queryTP == null)?"<null>":this._queryTP));
        sb.append(',');
        sb.append("truthFN");
        sb.append('=');
        sb.append(((this.truthFN == null)?"<null>":this.truthFN));
        sb.append(',');
        sb.append("_truthFN");
        sb.append('=');
        sb.append(((this._truthFN == null)?"<null>":this._truthFN));
        sb.append(',');
        sb.append("queryFP");
        sb.append('=');
        sb.append(((this.queryFP == null)?"<null>":this.queryFP));
        sb.append(',');
        sb.append("_queryFP");
        sb.append('=');
        sb.append(((this._queryFP == null)?"<null>":this._queryFP));
        sb.append(',');
        sb.append("gtFP");
        sb.append('=');
        sb.append(((this.gtFP == null)?"<null>":this.gtFP));
        sb.append(',');
        sb.append("_gtFP");
        sb.append('=');
        sb.append(((this._gtFP == null)?"<null>":this._gtFP));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("_precision");
        sb.append('=');
        sb.append(((this._precision == null)?"<null>":this._precision));
        sb.append(',');
        sb.append("recall");
        sb.append('=');
        sb.append(((this.recall == null)?"<null>":this.recall));
        sb.append(',');
        sb.append("_recall");
        sb.append('=');
        sb.append(((this._recall == null)?"<null>":this._recall));
        sb.append(',');
        sb.append("fScore");
        sb.append('=');
        sb.append(((this.fScore == null)?"<null>":this.fScore));
        sb.append(',');
        sb.append("_fScore");
        sb.append('=');
        sb.append(((this._fScore == null)?"<null>":this._fScore));
        sb.append(',');
        sb.append("roc");
        sb.append('=');
        sb.append(((this.roc == null)?"<null>":this.roc));
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
        result = ((result* 31)+((this.fScore == null)? 0 :this.fScore.hashCode()));
        result = ((result* 31)+((this._start == null)? 0 :this._start.hashCode()));
        result = ((result* 31)+((this._precision == null)? 0 :this._precision.hashCode()));
        result = ((result* 31)+((this._recall == null)? 0 :this._recall.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.gtFP == null)? 0 :this.gtFP.hashCode()));
        result = ((result* 31)+((this.precision == null)? 0 :this.precision.hashCode()));
        result = ((result* 31)+((this.roc == null)? 0 :this.roc.hashCode()));
        result = ((result* 31)+((this.queryTP == null)? 0 :this.queryTP.hashCode()));
        result = ((result* 31)+((this._queryFP == null)? 0 :this._queryFP.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.standardSequence == null)? 0 :this.standardSequence.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this._fScore == null)? 0 :this._fScore.hashCode()));
        result = ((result* 31)+((this.recall == null)? 0 :this.recall.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._queryTP == null)? 0 :this._queryTP.hashCode()));
        result = ((result* 31)+((this.queryFP == null)? 0 :this.queryFP.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.truthTP == null)? 0 :this.truthTP.hashCode()));
        result = ((result* 31)+((this._truthFN == null)? 0 :this._truthFN.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this._end == null)? 0 :this._end.hashCode()));
        result = ((result* 31)+((this.truthFN == null)? 0 :this.truthFN.hashCode()));
        result = ((result* 31)+((this._truthTP == null)? 0 :this._truthTP.hashCode()));
        result = ((result* 31)+((this._gtFP == null)? 0 :this._gtFP.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MolecularSequence_Quality) == false) {
            return false;
        }
        MolecularSequence_Quality rhs = ((MolecularSequence_Quality) other);
        return ((((((((((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.fScore == rhs.fScore)||((this.fScore!= null)&&this.fScore.equals(rhs.fScore))))&&((this._start == rhs._start)||((this._start!= null)&&this._start.equals(rhs._start))))&&((this._precision == rhs._precision)||((this._precision!= null)&&this._precision.equals(rhs._precision))))&&((this._recall == rhs._recall)||((this._recall!= null)&&this._recall.equals(rhs._recall))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.gtFP == rhs.gtFP)||((this.gtFP!= null)&&this.gtFP.equals(rhs.gtFP))))&&((this.precision == rhs.precision)||((this.precision!= null)&&this.precision.equals(rhs.precision))))&&((this.roc == rhs.roc)||((this.roc!= null)&&this.roc.equals(rhs.roc))))&&((this.queryTP == rhs.queryTP)||((this.queryTP!= null)&&this.queryTP.equals(rhs.queryTP))))&&((this._queryFP == rhs._queryFP)||((this._queryFP!= null)&&this._queryFP.equals(rhs._queryFP))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.standardSequence == rhs.standardSequence)||((this.standardSequence!= null)&&this.standardSequence.equals(rhs.standardSequence))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this._fScore == rhs._fScore)||((this._fScore!= null)&&this._fScore.equals(rhs._fScore))))&&((this.recall == rhs.recall)||((this.recall!= null)&&this.recall.equals(rhs.recall))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._queryTP == rhs._queryTP)||((this._queryTP!= null)&&this._queryTP.equals(rhs._queryTP))))&&((this.queryFP == rhs.queryFP)||((this.queryFP!= null)&&this.queryFP.equals(rhs.queryFP))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.truthTP == rhs.truthTP)||((this.truthTP!= null)&&this.truthTP.equals(rhs.truthTP))))&&((this._truthFN == rhs._truthFN)||((this._truthFN!= null)&&this._truthFN.equals(rhs._truthFN))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this._end == rhs._end)||((this._end!= null)&&this._end.equals(rhs._end))))&&((this.truthFN == rhs.truthFN)||((this.truthFN!= null)&&this.truthFN.equals(rhs.truthFN))))&&((this._truthTP == rhs._truthTP)||((this._truthTP!= null)&&this._truthTP.equals(rhs._truthTP))))&&((this._gtFP == rhs._gtFP)||((this._gtFP!= null)&&this._gtFP.equals(rhs._gtFP))));
    }


    /**
     * INDEL / SNP / Undefined variant.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        INDEL("indel"),
        SNP("snp"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, MolecularSequence_Quality.Type> CONSTANTS = new HashMap<String, MolecularSequence_Quality.Type>();

        static {
            for (MolecularSequence_Quality.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static MolecularSequence_Quality.Type fromValue(String value) {
            MolecularSequence_Quality.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
