
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A medicinal product in a container or package.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "subject",
    "description",
    "_description",
    "legalStatusOfSupply",
    "marketingStatus",
    "marketingAuthorization",
    "manufacturer",
    "batchIdentifier",
    "packageItem"
})
@Generated("jsonschema2pojo")
public class MedicinalProductPackaged
    extends DomainResource
{

    /**
     * This is a MedicinalProductPackaged resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductPackaged resource")
    private String resourceType;
    /**
     * Unique identifier.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique identifier.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The product with this is a pack for.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The product with this is a pack for.")
    private List<Reference> subject = new ArrayList<Reference>();
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalStatusOfSupply")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept legalStatusOfSupply;
    /**
     * Marketing information.
     * 
     */
    @JsonProperty("marketingStatus")
    @JsonPropertyDescription("Marketing information.")
    private List<MarketingStatus> marketingStatus = new ArrayList<MarketingStatus>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("marketingAuthorization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference marketingAuthorization;
    /**
     * Manufacturer of this Package Item.
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("Manufacturer of this Package Item.")
    private List<Reference> manufacturer = new ArrayList<Reference>();
    /**
     * Batch numbering.
     * 
     */
    @JsonProperty("batchIdentifier")
    @JsonPropertyDescription("Batch numbering.")
    private List<MedicinalProductPackaged_BatchIdentifier> batchIdentifier = new ArrayList<MedicinalProductPackaged_BatchIdentifier>();
    /**
     * A packaging item, as a contained for medicine, possibly with other packaging items within.
     * (Required)
     * 
     */
    @JsonProperty("packageItem")
    @JsonPropertyDescription("A packaging item, as a contained for medicine, possibly with other packaging items within.")
    private List<MedicinalProductPackaged_PackageItem> packageItem = new ArrayList<MedicinalProductPackaged_PackageItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicinalProductPackaged resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductPackaged resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique identifier.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique identifier.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The product with this is a pack for.
     * 
     */
    @JsonProperty("subject")
    public List<Reference> getSubject() {
        return subject;
    }

    /**
     * The product with this is a pack for.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(List<Reference> subject) {
        this.subject = subject;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalStatusOfSupply")
    public CodeableConcept getLegalStatusOfSupply() {
        return legalStatusOfSupply;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalStatusOfSupply")
    public void setLegalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
        this.legalStatusOfSupply = legalStatusOfSupply;
    }

    /**
     * Marketing information.
     * 
     */
    @JsonProperty("marketingStatus")
    public List<MarketingStatus> getMarketingStatus() {
        return marketingStatus;
    }

    /**
     * Marketing information.
     * 
     */
    @JsonProperty("marketingStatus")
    public void setMarketingStatus(List<MarketingStatus> marketingStatus) {
        this.marketingStatus = marketingStatus;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("marketingAuthorization")
    public Reference getMarketingAuthorization() {
        return marketingAuthorization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("marketingAuthorization")
    public void setMarketingAuthorization(Reference marketingAuthorization) {
        this.marketingAuthorization = marketingAuthorization;
    }

    /**
     * Manufacturer of this Package Item.
     * 
     */
    @JsonProperty("manufacturer")
    public List<Reference> getManufacturer() {
        return manufacturer;
    }

    /**
     * Manufacturer of this Package Item.
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(List<Reference> manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Batch numbering.
     * 
     */
    @JsonProperty("batchIdentifier")
    public List<MedicinalProductPackaged_BatchIdentifier> getBatchIdentifier() {
        return batchIdentifier;
    }

    /**
     * Batch numbering.
     * 
     */
    @JsonProperty("batchIdentifier")
    public void setBatchIdentifier(List<MedicinalProductPackaged_BatchIdentifier> batchIdentifier) {
        this.batchIdentifier = batchIdentifier;
    }

    /**
     * A packaging item, as a contained for medicine, possibly with other packaging items within.
     * (Required)
     * 
     */
    @JsonProperty("packageItem")
    public List<MedicinalProductPackaged_PackageItem> getPackageItem() {
        return packageItem;
    }

    /**
     * A packaging item, as a contained for medicine, possibly with other packaging items within.
     * (Required)
     * 
     */
    @JsonProperty("packageItem")
    public void setPackageItem(List<MedicinalProductPackaged_PackageItem> packageItem) {
        this.packageItem = packageItem;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicinalProductPackaged.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("legalStatusOfSupply");
        sb.append('=');
        sb.append(((this.legalStatusOfSupply == null)?"<null>":this.legalStatusOfSupply));
        sb.append(',');
        sb.append("marketingStatus");
        sb.append('=');
        sb.append(((this.marketingStatus == null)?"<null>":this.marketingStatus));
        sb.append(',');
        sb.append("marketingAuthorization");
        sb.append('=');
        sb.append(((this.marketingAuthorization == null)?"<null>":this.marketingAuthorization));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("batchIdentifier");
        sb.append('=');
        sb.append(((this.batchIdentifier == null)?"<null>":this.batchIdentifier));
        sb.append(',');
        sb.append("packageItem");
        sb.append('=');
        sb.append(((this.packageItem == null)?"<null>":this.packageItem));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.packageItem == null)? 0 :this.packageItem.hashCode()));
        result = ((result* 31)+((this.legalStatusOfSupply == null)? 0 :this.legalStatusOfSupply.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.marketingAuthorization == null)? 0 :this.marketingAuthorization.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.batchIdentifier == null)? 0 :this.batchIdentifier.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.marketingStatus == null)? 0 :this.marketingStatus.hashCode()));
        result = ((result* 31)+((this.manufacturer == null)? 0 :this.manufacturer.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductPackaged) == false) {
            return false;
        }
        MedicinalProductPackaged rhs = ((MedicinalProductPackaged) other);
        return ((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.packageItem == rhs.packageItem)||((this.packageItem!= null)&&this.packageItem.equals(rhs.packageItem))))&&((this.legalStatusOfSupply == rhs.legalStatusOfSupply)||((this.legalStatusOfSupply!= null)&&this.legalStatusOfSupply.equals(rhs.legalStatusOfSupply))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.marketingAuthorization == rhs.marketingAuthorization)||((this.marketingAuthorization!= null)&&this.marketingAuthorization.equals(rhs.marketingAuthorization))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.batchIdentifier == rhs.batchIdentifier)||((this.batchIdentifier!= null)&&this.batchIdentifier.equals(rhs.batchIdentifier))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.marketingStatus == rhs.marketingStatus)||((this.marketingStatus!= null)&&this.marketingStatus.equals(rhs.marketingStatus))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))));
    }

}
