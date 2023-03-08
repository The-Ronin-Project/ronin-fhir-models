
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "coverage",
    "inforce",
    "_inforce",
    "benefitPeriod",
    "item"
})
@Generated("jsonschema2pojo")
public class CoverageEligibilityResponse_Insurance {

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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("coverage")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference coverage;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inforce")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean inforce;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inforce")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _inforce;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("benefitPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period benefitPeriod;
    /**
     * Benefits and optionally current balances, and authorization details by category or service.
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Benefits and optionally current balances, and authorization details by category or service.")
    private List<CoverageEligibilityResponse_Item> item = new ArrayList<CoverageEligibilityResponse_Item>();

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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("coverage")
    public Reference getCoverage() {
        return coverage;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("coverage")
    public void setCoverage(Reference coverage) {
        this.coverage = coverage;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inforce")
    public Boolean getInforce() {
        return inforce;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("inforce")
    public void setInforce(Boolean inforce) {
        this.inforce = inforce;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inforce")
    public Element get_inforce() {
        return _inforce;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_inforce")
    public void set_inforce(Element _inforce) {
        this._inforce = _inforce;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("benefitPeriod")
    public Period getBenefitPeriod() {
        return benefitPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("benefitPeriod")
    public void setBenefitPeriod(Period benefitPeriod) {
        this.benefitPeriod = benefitPeriod;
    }

    /**
     * Benefits and optionally current balances, and authorization details by category or service.
     * 
     */
    @JsonProperty("item")
    public List<CoverageEligibilityResponse_Item> getItem() {
        return item;
    }

    /**
     * Benefits and optionally current balances, and authorization details by category or service.
     * 
     */
    @JsonProperty("item")
    public void setItem(List<CoverageEligibilityResponse_Item> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoverageEligibilityResponse_Insurance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("coverage");
        sb.append('=');
        sb.append(((this.coverage == null)?"<null>":this.coverage));
        sb.append(',');
        sb.append("inforce");
        sb.append('=');
        sb.append(((this.inforce == null)?"<null>":this.inforce));
        sb.append(',');
        sb.append("_inforce");
        sb.append('=');
        sb.append(((this._inforce == null)?"<null>":this._inforce));
        sb.append(',');
        sb.append("benefitPeriod");
        sb.append('=');
        sb.append(((this.benefitPeriod == null)?"<null>":this.benefitPeriod));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
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
        result = ((result* 31)+((this.coverage == null)? 0 :this.coverage.hashCode()));
        result = ((result* 31)+((this.benefitPeriod == null)? 0 :this.benefitPeriod.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.inforce == null)? 0 :this.inforce.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this._inforce == null)? 0 :this._inforce.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoverageEligibilityResponse_Insurance) == false) {
            return false;
        }
        CoverageEligibilityResponse_Insurance rhs = ((CoverageEligibilityResponse_Insurance) other);
        return (((((((((this.coverage == rhs.coverage)||((this.coverage!= null)&&this.coverage.equals(rhs.coverage)))&&((this.benefitPeriod == rhs.benefitPeriod)||((this.benefitPeriod!= null)&&this.benefitPeriod.equals(rhs.benefitPeriod))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.inforce == rhs.inforce)||((this.inforce!= null)&&this.inforce.equals(rhs.inforce))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this._inforce == rhs._inforce)||((this._inforce!= null)&&this._inforce.equals(rhs._inforce))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
