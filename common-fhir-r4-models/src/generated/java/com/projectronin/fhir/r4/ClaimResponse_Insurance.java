
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "sequence",
    "_sequence",
    "focal",
    "_focal",
    "coverage",
    "businessArrangement",
    "_businessArrangement",
    "claimResponse"
})
@Generated("jsonschema2pojo")
public class ClaimResponse_Insurance {

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("focal")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean focal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_focal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _focal;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("coverage")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference coverage;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("businessArrangement")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String businessArrangement;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_businessArrangement")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _businessArrangement;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claimResponse")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference claimResponse;

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("focal")
    public Boolean getFocal() {
        return focal;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("focal")
    public void setFocal(Boolean focal) {
        this.focal = focal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_focal")
    public Element get_focal() {
        return _focal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_focal")
    public void set_focal(Element _focal) {
        this._focal = _focal;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("businessArrangement")
    public String getBusinessArrangement() {
        return businessArrangement;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("businessArrangement")
    public void setBusinessArrangement(String businessArrangement) {
        this.businessArrangement = businessArrangement;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_businessArrangement")
    public Element get_businessArrangement() {
        return _businessArrangement;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_businessArrangement")
    public void set_businessArrangement(Element _businessArrangement) {
        this._businessArrangement = _businessArrangement;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claimResponse")
    public Reference getClaimResponse() {
        return claimResponse;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("claimResponse")
    public void setClaimResponse(Reference claimResponse) {
        this.claimResponse = claimResponse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClaimResponse_Insurance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("focal");
        sb.append('=');
        sb.append(((this.focal == null)?"<null>":this.focal));
        sb.append(',');
        sb.append("_focal");
        sb.append('=');
        sb.append(((this._focal == null)?"<null>":this._focal));
        sb.append(',');
        sb.append("coverage");
        sb.append('=');
        sb.append(((this.coverage == null)?"<null>":this.coverage));
        sb.append(',');
        sb.append("businessArrangement");
        sb.append('=');
        sb.append(((this.businessArrangement == null)?"<null>":this.businessArrangement));
        sb.append(',');
        sb.append("_businessArrangement");
        sb.append('=');
        sb.append(((this._businessArrangement == null)?"<null>":this._businessArrangement));
        sb.append(',');
        sb.append("claimResponse");
        sb.append('=');
        sb.append(((this.claimResponse == null)?"<null>":this.claimResponse));
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
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.focal == null)? 0 :this.focal.hashCode()));
        result = ((result* 31)+((this.businessArrangement == null)? 0 :this.businessArrangement.hashCode()));
        result = ((result* 31)+((this.claimResponse == null)? 0 :this.claimResponse.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._businessArrangement == null)? 0 :this._businessArrangement.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._focal == null)? 0 :this._focal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimResponse_Insurance) == false) {
            return false;
        }
        ClaimResponse_Insurance rhs = ((ClaimResponse_Insurance) other);
        return ((((((((((((this.coverage == rhs.coverage)||((this.coverage!= null)&&this.coverage.equals(rhs.coverage)))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.focal == rhs.focal)||((this.focal!= null)&&this.focal.equals(rhs.focal))))&&((this.businessArrangement == rhs.businessArrangement)||((this.businessArrangement!= null)&&this.businessArrangement.equals(rhs.businessArrangement))))&&((this.claimResponse == rhs.claimResponse)||((this.claimResponse!= null)&&this.claimResponse.equals(rhs.claimResponse))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._businessArrangement == rhs._businessArrangement)||((this._businessArrangement!= null)&&this._businessArrangement.equals(rhs._businessArrangement))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._focal == rhs._focal)||((this._focal!= null)&&this._focal.equals(rhs._focal))));
    }

}