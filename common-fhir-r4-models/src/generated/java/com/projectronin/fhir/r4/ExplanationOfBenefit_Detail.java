
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "sequence",
    "_sequence",
    "revenue",
    "category",
    "productOrService",
    "modifier",
    "programCode",
    "quantity",
    "unitPrice",
    "factor",
    "_factor",
    "net",
    "udi",
    "noteNumber",
    "_noteNumber",
    "adjudication",
    "subDetail"
})
@Generated("jsonschema2pojo")
public class ExplanationOfBenefit_Detail {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("revenue")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept revenue;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept category;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("productOrService")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept productOrService;
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     * 
     */
    @JsonProperty("modifier")
    @JsonPropertyDescription("Item typification or modifiers codes to convey additional context for the product or service.")
    private List<CodeableConcept> modifier = new ArrayList<CodeableConcept>();
    /**
     * Identifies the program under which this may be recovered.
     * 
     */
    @JsonProperty("programCode")
    @JsonPropertyDescription("Identifies the program under which this may be recovered.")
    private List<CodeableConcept> programCode = new ArrayList<CodeableConcept>();
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money unitPrice;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double factor;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _factor;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money net;
    /**
     * Unique Device Identifiers associated with this line item.
     * 
     */
    @JsonProperty("udi")
    @JsonPropertyDescription("Unique Device Identifiers associated with this line item.")
    private List<Reference> udi = new ArrayList<Reference>();
    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    @JsonPropertyDescription("The numbers associated with notes below which apply to the adjudication of this item.")
    private List<Double> noteNumber = new ArrayList<Double>();
    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    @JsonPropertyDescription("Extensions for noteNumber")
    private List<Element> _noteNumber = new ArrayList<Element>();
    /**
     * The adjudication results.
     * 
     */
    @JsonProperty("adjudication")
    @JsonPropertyDescription("The adjudication results.")
    private List<ExplanationOfBenefit_Adjudication> adjudication = new ArrayList<ExplanationOfBenefit_Adjudication>();
    /**
     * Third-tier of goods and services.
     * 
     */
    @JsonProperty("subDetail")
    @JsonPropertyDescription("Third-tier of goods and services.")
    private List<ExplanationOfBenefit_SubDetail> subDetail = new ArrayList<ExplanationOfBenefit_SubDetail>();

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("revenue")
    public CodeableConcept getRevenue() {
        return revenue;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("revenue")
    public void setRevenue(CodeableConcept revenue) {
        this.revenue = revenue;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
        this.category = category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("productOrService")
    public CodeableConcept getProductOrService() {
        return productOrService;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
        this.productOrService = productOrService;
    }

    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     * 
     */
    @JsonProperty("modifier")
    public List<CodeableConcept> getModifier() {
        return modifier;
    }

    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     * 
     */
    @JsonProperty("modifier")
    public void setModifier(List<CodeableConcept> modifier) {
        this.modifier = modifier;
    }

    /**
     * Identifies the program under which this may be recovered.
     * 
     */
    @JsonProperty("programCode")
    public List<CodeableConcept> getProgramCode() {
        return programCode;
    }

    /**
     * Identifies the program under which this may be recovered.
     * 
     */
    @JsonProperty("programCode")
    public void setProgramCode(List<CodeableConcept> programCode) {
        this.programCode = programCode;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(Money unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public Double getFactor() {
        return factor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public void setFactor(Double factor) {
        this.factor = factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public Element get_factor() {
        return _factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public void set_factor(Element _factor) {
        this._factor = _factor;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    public Money getNet() {
        return net;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("net")
    public void setNet(Money net) {
        this.net = net;
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

    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    public List<Double> getNoteNumber() {
        return noteNumber;
    }

    /**
     * The numbers associated with notes below which apply to the adjudication of this item.
     * 
     */
    @JsonProperty("noteNumber")
    public void setNoteNumber(List<Double> noteNumber) {
        this.noteNumber = noteNumber;
    }

    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    public List<Element> get_noteNumber() {
        return _noteNumber;
    }

    /**
     * Extensions for noteNumber
     * 
     */
    @JsonProperty("_noteNumber")
    public void set_noteNumber(List<Element> _noteNumber) {
        this._noteNumber = _noteNumber;
    }

    /**
     * The adjudication results.
     * 
     */
    @JsonProperty("adjudication")
    public List<ExplanationOfBenefit_Adjudication> getAdjudication() {
        return adjudication;
    }

    /**
     * The adjudication results.
     * 
     */
    @JsonProperty("adjudication")
    public void setAdjudication(List<ExplanationOfBenefit_Adjudication> adjudication) {
        this.adjudication = adjudication;
    }

    /**
     * Third-tier of goods and services.
     * 
     */
    @JsonProperty("subDetail")
    public List<ExplanationOfBenefit_SubDetail> getSubDetail() {
        return subDetail;
    }

    /**
     * Third-tier of goods and services.
     * 
     */
    @JsonProperty("subDetail")
    public void setSubDetail(List<ExplanationOfBenefit_SubDetail> subDetail) {
        this.subDetail = subDetail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExplanationOfBenefit_Detail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("revenue");
        sb.append('=');
        sb.append(((this.revenue == null)?"<null>":this.revenue));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("productOrService");
        sb.append('=');
        sb.append(((this.productOrService == null)?"<null>":this.productOrService));
        sb.append(',');
        sb.append("modifier");
        sb.append('=');
        sb.append(((this.modifier == null)?"<null>":this.modifier));
        sb.append(',');
        sb.append("programCode");
        sb.append('=');
        sb.append(((this.programCode == null)?"<null>":this.programCode));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("factor");
        sb.append('=');
        sb.append(((this.factor == null)?"<null>":this.factor));
        sb.append(',');
        sb.append("_factor");
        sb.append('=');
        sb.append(((this._factor == null)?"<null>":this._factor));
        sb.append(',');
        sb.append("net");
        sb.append('=');
        sb.append(((this.net == null)?"<null>":this.net));
        sb.append(',');
        sb.append("udi");
        sb.append('=');
        sb.append(((this.udi == null)?"<null>":this.udi));
        sb.append(',');
        sb.append("noteNumber");
        sb.append('=');
        sb.append(((this.noteNumber == null)?"<null>":this.noteNumber));
        sb.append(',');
        sb.append("_noteNumber");
        sb.append('=');
        sb.append(((this._noteNumber == null)?"<null>":this._noteNumber));
        sb.append(',');
        sb.append("adjudication");
        sb.append('=');
        sb.append(((this.adjudication == null)?"<null>":this.adjudication));
        sb.append(',');
        sb.append("subDetail");
        sb.append('=');
        sb.append(((this.subDetail == null)?"<null>":this.subDetail));
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
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.programCode == null)? 0 :this.programCode.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.modifier == null)? 0 :this.modifier.hashCode()));
        result = ((result* 31)+((this.subDetail == null)? 0 :this.subDetail.hashCode()));
        result = ((result* 31)+((this.productOrService == null)? 0 :this.productOrService.hashCode()));
        result = ((result* 31)+((this._factor == null)? 0 :this._factor.hashCode()));
        result = ((result* 31)+((this.noteNumber == null)? 0 :this.noteNumber.hashCode()));
        result = ((result* 31)+((this._noteNumber == null)? 0 :this._noteNumber.hashCode()));
        result = ((result* 31)+((this.adjudication == null)? 0 :this.adjudication.hashCode()));
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this.revenue == null)? 0 :this.revenue.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.udi == null)? 0 :this.udi.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.factor == null)? 0 :this.factor.hashCode()));
        result = ((result* 31)+((this.net == null)? 0 :this.net.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExplanationOfBenefit_Detail) == false) {
            return false;
        }
        ExplanationOfBenefit_Detail rhs = ((ExplanationOfBenefit_Detail) other);
        return (((((((((((((((((((((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.programCode == rhs.programCode)||((this.programCode!= null)&&this.programCode.equals(rhs.programCode))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.modifier == rhs.modifier)||((this.modifier!= null)&&this.modifier.equals(rhs.modifier))))&&((this.subDetail == rhs.subDetail)||((this.subDetail!= null)&&this.subDetail.equals(rhs.subDetail))))&&((this.productOrService == rhs.productOrService)||((this.productOrService!= null)&&this.productOrService.equals(rhs.productOrService))))&&((this._factor == rhs._factor)||((this._factor!= null)&&this._factor.equals(rhs._factor))))&&((this.noteNumber == rhs.noteNumber)||((this.noteNumber!= null)&&this.noteNumber.equals(rhs.noteNumber))))&&((this._noteNumber == rhs._noteNumber)||((this._noteNumber!= null)&&this._noteNumber.equals(rhs._noteNumber))))&&((this.adjudication == rhs.adjudication)||((this.adjudication!= null)&&this.adjudication.equals(rhs.adjudication))))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this.revenue == rhs.revenue)||((this.revenue!= null)&&this.revenue.equals(rhs.revenue))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.udi == rhs.udi)||((this.udi!= null)&&this.udi.equals(rhs.udi))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.factor == rhs.factor)||((this.factor!= null)&&this.factor.equals(rhs.factor))))&&((this.net == rhs.net)||((this.net!= null)&&this.net.equals(rhs.net))));
    }

}
