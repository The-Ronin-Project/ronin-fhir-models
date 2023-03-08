
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "initialFill",
    "dispenseInterval",
    "validityPeriod",
    "numberOfRepeatsAllowed",
    "_numberOfRepeatsAllowed",
    "quantity",
    "expectedSupplyDuration",
    "performer"
})
@Generated("jsonschema2pojo")
public class MedicationRequest_DispenseRequest {

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
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("initialFill")
    @JsonPropertyDescription("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.")
    private MedicationRequest_InitialFill initialFill;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("dispenseInterval")
    @JsonPropertyDescription("A length of time.")
    private Duration dispenseInterval;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("validityPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period validityPeriod;
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfRepeatsAllowed")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double numberOfRepeatsAllowed;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfRepeatsAllowed")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfRepeatsAllowed;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity quantity;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("expectedSupplyDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration expectedSupplyDuration;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference performer;

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
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("initialFill")
    public MedicationRequest_InitialFill getInitialFill() {
        return initialFill;
    }

    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called &quot;MedicationRequest&quot; rather than &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     * 
     */
    @JsonProperty("initialFill")
    public void setInitialFill(MedicationRequest_InitialFill initialFill) {
        this.initialFill = initialFill;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("dispenseInterval")
    public Duration getDispenseInterval() {
        return dispenseInterval;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("dispenseInterval")
    public void setDispenseInterval(Duration dispenseInterval) {
        this.dispenseInterval = dispenseInterval;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("validityPeriod")
    public Period getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Period validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfRepeatsAllowed")
    public Double getNumberOfRepeatsAllowed() {
        return numberOfRepeatsAllowed;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfRepeatsAllowed")
    public void setNumberOfRepeatsAllowed(Double numberOfRepeatsAllowed) {
        this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfRepeatsAllowed")
    public Element get_numberOfRepeatsAllowed() {
        return _numberOfRepeatsAllowed;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfRepeatsAllowed")
    public void set_numberOfRepeatsAllowed(Element _numberOfRepeatsAllowed) {
        this._numberOfRepeatsAllowed = _numberOfRepeatsAllowed;
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
     * A length of time.
     * 
     */
    @JsonProperty("expectedSupplyDuration")
    public Duration getExpectedSupplyDuration() {
        return expectedSupplyDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("expectedSupplyDuration")
    public void setExpectedSupplyDuration(Duration expectedSupplyDuration) {
        this.expectedSupplyDuration = expectedSupplyDuration;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public Reference getPerformer() {
        return performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(Reference performer) {
        this.performer = performer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicationRequest_DispenseRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("initialFill");
        sb.append('=');
        sb.append(((this.initialFill == null)?"<null>":this.initialFill));
        sb.append(',');
        sb.append("dispenseInterval");
        sb.append('=');
        sb.append(((this.dispenseInterval == null)?"<null>":this.dispenseInterval));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("numberOfRepeatsAllowed");
        sb.append('=');
        sb.append(((this.numberOfRepeatsAllowed == null)?"<null>":this.numberOfRepeatsAllowed));
        sb.append(',');
        sb.append("_numberOfRepeatsAllowed");
        sb.append('=');
        sb.append(((this._numberOfRepeatsAllowed == null)?"<null>":this._numberOfRepeatsAllowed));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("expectedSupplyDuration");
        sb.append('=');
        sb.append(((this.expectedSupplyDuration == null)?"<null>":this.expectedSupplyDuration));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
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
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.dispenseInterval == null)? 0 :this.dispenseInterval.hashCode()));
        result = ((result* 31)+((this._numberOfRepeatsAllowed == null)? 0 :this._numberOfRepeatsAllowed.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.numberOfRepeatsAllowed == null)? 0 :this.numberOfRepeatsAllowed.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.initialFill == null)? 0 :this.initialFill.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.expectedSupplyDuration == null)? 0 :this.expectedSupplyDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicationRequest_DispenseRequest) == false) {
            return false;
        }
        MedicationRequest_DispenseRequest rhs = ((MedicationRequest_DispenseRequest) other);
        return ((((((((((((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.dispenseInterval == rhs.dispenseInterval)||((this.dispenseInterval!= null)&&this.dispenseInterval.equals(rhs.dispenseInterval))))&&((this._numberOfRepeatsAllowed == rhs._numberOfRepeatsAllowed)||((this._numberOfRepeatsAllowed!= null)&&this._numberOfRepeatsAllowed.equals(rhs._numberOfRepeatsAllowed))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.numberOfRepeatsAllowed == rhs.numberOfRepeatsAllowed)||((this.numberOfRepeatsAllowed!= null)&&this.numberOfRepeatsAllowed.equals(rhs.numberOfRepeatsAllowed))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.initialFill == rhs.initialFill)||((this.initialFill!= null)&&this.initialFill.equals(rhs.initialFill))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.expectedSupplyDuration == rhs.expectedSupplyDuration)||((this.expectedSupplyDuration!= null)&&this.expectedSupplyDuration.equals(rhs.expectedSupplyDuration))));
    }

}
