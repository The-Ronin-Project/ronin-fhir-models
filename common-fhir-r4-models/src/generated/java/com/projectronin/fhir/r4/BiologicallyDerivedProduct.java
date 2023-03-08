
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "productCategory",
    "_productCategory",
    "productCode",
    "status",
    "_status",
    "request",
    "quantity",
    "_quantity",
    "parent",
    "collection",
    "processing",
    "manipulation",
    "storage"
})
@Generated("jsonschema2pojo")
public class BiologicallyDerivedProduct
    extends DomainResource
{

    /**
     * This is a BiologicallyDerivedProduct resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a BiologicallyDerivedProduct resource")
    private String resourceType;
    /**
     * This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Broad category of this product.
     * 
     */
    @JsonProperty("productCategory")
    @JsonPropertyDescription("Broad category of this product.")
    private BiologicallyDerivedProduct.ProductCategory productCategory;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_productCategory")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _productCategory;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCode")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept productCode;
    /**
     * Whether the product is currently available.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Whether the product is currently available.")
    private BiologicallyDerivedProduct.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * Procedure request to obtain this biologically derived product.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("Procedure request to obtain this biologically derived product.")
    private List<Reference> request = new ArrayList<Reference>();
    /**
     * A whole number
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("A whole number")
    private Double quantity;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_quantity")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _quantity;
    /**
     * Parent product (if any).
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("Parent product (if any).")
    private List<Reference> parent = new ArrayList<Reference>();
    /**
     * A material substance originating from a biological entity intended to be transplanted or infused
     * into another (possibly the same) biological entity.
     * 
     */
    @JsonProperty("collection")
    @JsonPropertyDescription("A material substance originating from a biological entity intended to be transplanted or infused\ninto another (possibly the same) biological entity.")
    private BiologicallyDerivedProduct_Collection collection;
    /**
     * Any processing of the product during collection that does not change the fundamental nature of the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
     * 
     */
    @JsonProperty("processing")
    @JsonPropertyDescription("Any processing of the product during collection that does not change the fundamental nature of the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.")
    private List<BiologicallyDerivedProduct_Processing> processing = new ArrayList<BiologicallyDerivedProduct_Processing>();
    /**
     * A material substance originating from a biological entity intended to be transplanted or infused
     * into another (possibly the same) biological entity.
     * 
     */
    @JsonProperty("manipulation")
    @JsonPropertyDescription("A material substance originating from a biological entity intended to be transplanted or infused\ninto another (possibly the same) biological entity.")
    private BiologicallyDerivedProduct_Manipulation manipulation;
    /**
     * Product storage.
     * 
     */
    @JsonProperty("storage")
    @JsonPropertyDescription("Product storage.")
    private List<BiologicallyDerivedProduct_Storage> storage = new ArrayList<BiologicallyDerivedProduct_Storage>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a BiologicallyDerivedProduct resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a BiologicallyDerivedProduct resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Broad category of this product.
     * 
     */
    @JsonProperty("productCategory")
    public BiologicallyDerivedProduct.ProductCategory getProductCategory() {
        return productCategory;
    }

    /**
     * Broad category of this product.
     * 
     */
    @JsonProperty("productCategory")
    public void setProductCategory(BiologicallyDerivedProduct.ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_productCategory")
    public Element get_productCategory() {
        return _productCategory;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_productCategory")
    public void set_productCategory(Element _productCategory) {
        this._productCategory = _productCategory;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCode")
    public CodeableConcept getProductCode() {
        return productCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("productCode")
    public void setProductCode(CodeableConcept productCode) {
        this.productCode = productCode;
    }

    /**
     * Whether the product is currently available.
     * 
     */
    @JsonProperty("status")
    public BiologicallyDerivedProduct.Status getStatus() {
        return status;
    }

    /**
     * Whether the product is currently available.
     * 
     */
    @JsonProperty("status")
    public void setStatus(BiologicallyDerivedProduct.Status status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * Procedure request to obtain this biologically derived product.
     * 
     */
    @JsonProperty("request")
    public List<Reference> getRequest() {
        return request;
    }

    /**
     * Procedure request to obtain this biologically derived product.
     * 
     */
    @JsonProperty("request")
    public void setRequest(List<Reference> request) {
        this.request = request;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_quantity")
    public Element get_quantity() {
        return _quantity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_quantity")
    public void set_quantity(Element _quantity) {
        this._quantity = _quantity;
    }

    /**
     * Parent product (if any).
     * 
     */
    @JsonProperty("parent")
    public List<Reference> getParent() {
        return parent;
    }

    /**
     * Parent product (if any).
     * 
     */
    @JsonProperty("parent")
    public void setParent(List<Reference> parent) {
        this.parent = parent;
    }

    /**
     * A material substance originating from a biological entity intended to be transplanted or infused
     * into another (possibly the same) biological entity.
     * 
     */
    @JsonProperty("collection")
    public BiologicallyDerivedProduct_Collection getCollection() {
        return collection;
    }

    /**
     * A material substance originating from a biological entity intended to be transplanted or infused
     * into another (possibly the same) biological entity.
     * 
     */
    @JsonProperty("collection")
    public void setCollection(BiologicallyDerivedProduct_Collection collection) {
        this.collection = collection;
    }

    /**
     * Any processing of the product during collection that does not change the fundamental nature of the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
     * 
     */
    @JsonProperty("processing")
    public List<BiologicallyDerivedProduct_Processing> getProcessing() {
        return processing;
    }

    /**
     * Any processing of the product during collection that does not change the fundamental nature of the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
     * 
     */
    @JsonProperty("processing")
    public void setProcessing(List<BiologicallyDerivedProduct_Processing> processing) {
        this.processing = processing;
    }

    /**
     * A material substance originating from a biological entity intended to be transplanted or infused
     * into another (possibly the same) biological entity.
     * 
     */
    @JsonProperty("manipulation")
    public BiologicallyDerivedProduct_Manipulation getManipulation() {
        return manipulation;
    }

    /**
     * A material substance originating from a biological entity intended to be transplanted or infused
     * into another (possibly the same) biological entity.
     * 
     */
    @JsonProperty("manipulation")
    public void setManipulation(BiologicallyDerivedProduct_Manipulation manipulation) {
        this.manipulation = manipulation;
    }

    /**
     * Product storage.
     * 
     */
    @JsonProperty("storage")
    public List<BiologicallyDerivedProduct_Storage> getStorage() {
        return storage;
    }

    /**
     * Product storage.
     * 
     */
    @JsonProperty("storage")
    public void setStorage(List<BiologicallyDerivedProduct_Storage> storage) {
        this.storage = storage;
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
        sb.append(BiologicallyDerivedProduct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("productCategory");
        sb.append('=');
        sb.append(((this.productCategory == null)?"<null>":this.productCategory));
        sb.append(',');
        sb.append("_productCategory");
        sb.append('=');
        sb.append(((this._productCategory == null)?"<null>":this._productCategory));
        sb.append(',');
        sb.append("productCode");
        sb.append('=');
        sb.append(((this.productCode == null)?"<null>":this.productCode));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("_quantity");
        sb.append('=');
        sb.append(((this._quantity == null)?"<null>":this._quantity));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("collection");
        sb.append('=');
        sb.append(((this.collection == null)?"<null>":this.collection));
        sb.append(',');
        sb.append("processing");
        sb.append('=');
        sb.append(((this.processing == null)?"<null>":this.processing));
        sb.append(',');
        sb.append("manipulation");
        sb.append('=');
        sb.append(((this.manipulation == null)?"<null>":this.manipulation));
        sb.append(',');
        sb.append("storage");
        sb.append('=');
        sb.append(((this.storage == null)?"<null>":this.storage));
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
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this._quantity == null)? 0 :this._quantity.hashCode()));
        result = ((result* 31)+((this.collection == null)? 0 :this.collection.hashCode()));
        result = ((result* 31)+((this.storage == null)? 0 :this.storage.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._productCategory == null)? 0 :this._productCategory.hashCode()));
        result = ((result* 31)+((this.productCategory == null)? 0 :this.productCategory.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.processing == null)? 0 :this.processing.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.manipulation == null)? 0 :this.manipulation.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BiologicallyDerivedProduct) == false) {
            return false;
        }
        BiologicallyDerivedProduct rhs = ((BiologicallyDerivedProduct) other);
        return ((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this._quantity == rhs._quantity)||((this._quantity!= null)&&this._quantity.equals(rhs._quantity))))&&((this.collection == rhs.collection)||((this.collection!= null)&&this.collection.equals(rhs.collection))))&&((this.storage == rhs.storage)||((this.storage!= null)&&this.storage.equals(rhs.storage))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._productCategory == rhs._productCategory)||((this._productCategory!= null)&&this._productCategory.equals(rhs._productCategory))))&&((this.productCategory == rhs.productCategory)||((this.productCategory!= null)&&this.productCategory.equals(rhs.productCategory))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.processing == rhs.processing)||((this.processing!= null)&&this.processing.equals(rhs.processing))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.manipulation == rhs.manipulation)||((this.manipulation!= null)&&this.manipulation.equals(rhs.manipulation))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Broad category of this product.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ProductCategory {

        ORGAN("organ"),
        TISSUE("tissue"),
        FLUID("fluid"),
        CELLS("cells"),
        BIOLOGICAL_AGENT("biologicalAgent");
        private final String value;
        private final static Map<String, BiologicallyDerivedProduct.ProductCategory> CONSTANTS = new HashMap<String, BiologicallyDerivedProduct.ProductCategory>();

        static {
            for (BiologicallyDerivedProduct.ProductCategory c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ProductCategory(String value) {
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
        public static BiologicallyDerivedProduct.ProductCategory fromValue(String value) {
            BiologicallyDerivedProduct.ProductCategory constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Whether the product is currently available.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        AVAILABLE("available"),
        UNAVAILABLE("unavailable");
        private final String value;
        private final static Map<String, BiologicallyDerivedProduct.Status> CONSTANTS = new HashMap<String, BiologicallyDerivedProduct.Status>();

        static {
            for (BiologicallyDerivedProduct.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static BiologicallyDerivedProduct.Status fromValue(String value) {
            BiologicallyDerivedProduct.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
