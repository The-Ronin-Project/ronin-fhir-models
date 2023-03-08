
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
 * Catalog entries are wrappers that contextualize items included in a catalog.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "type",
    "orderable",
    "_orderable",
    "referencedItem",
    "additionalIdentifier",
    "classification",
    "status",
    "_status",
    "validityPeriod",
    "validTo",
    "_validTo",
    "lastUpdated",
    "_lastUpdated",
    "additionalCharacteristic",
    "additionalClassification",
    "relatedEntry"
})
@Generated("jsonschema2pojo")
public class CatalogEntry
    extends DomainResource
{

    /**
     * This is a CatalogEntry resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a CatalogEntry resource")
    private String resourceType;
    /**
     * Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("orderable")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean orderable;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orderable")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _orderable;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("referencedItem")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference referencedItem;
    /**
     * Used in supporting related concepts, e.g. NDC to RxNorm.
     * 
     */
    @JsonProperty("additionalIdentifier")
    @JsonPropertyDescription("Used in supporting related concepts, e.g. NDC to RxNorm.")
    private List<Identifier> additionalIdentifier = new ArrayList<Identifier>();
    /**
     * Classes of devices, or ATC for medication.
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("Classes of devices, or ATC for medication.")
    private List<CodeableConcept> classification = new ArrayList<CodeableConcept>();
    /**
     * Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.")
    private CatalogEntry.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("validityPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period validityPeriod;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("validTo")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String validTo;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validTo")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _validTo;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastUpdated")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String lastUpdated;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastUpdated")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lastUpdated;
    /**
     * Used for examplefor Out of Formulary, or any specifics.
     * 
     */
    @JsonProperty("additionalCharacteristic")
    @JsonPropertyDescription("Used for examplefor Out of Formulary, or any specifics.")
    private List<CodeableConcept> additionalCharacteristic = new ArrayList<CodeableConcept>();
    /**
     * User for example for ATC classification, or.
     * 
     */
    @JsonProperty("additionalClassification")
    @JsonPropertyDescription("User for example for ATC classification, or.")
    private List<CodeableConcept> additionalClassification = new ArrayList<CodeableConcept>();
    /**
     * Used for example, to point to a substance, or to a device used to administer a medication.
     * 
     */
    @JsonProperty("relatedEntry")
    @JsonPropertyDescription("Used for example, to point to a substance, or to a device used to administer a medication.")
    private List<CatalogEntry_RelatedEntry> relatedEntry = new ArrayList<CatalogEntry_RelatedEntry>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a CatalogEntry resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a CatalogEntry resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("orderable")
    public Boolean getOrderable() {
        return orderable;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("orderable")
    public void setOrderable(Boolean orderable) {
        this.orderable = orderable;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orderable")
    public Element get_orderable() {
        return _orderable;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_orderable")
    public void set_orderable(Element _orderable) {
        this._orderable = _orderable;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("referencedItem")
    public Reference getReferencedItem() {
        return referencedItem;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("referencedItem")
    public void setReferencedItem(Reference referencedItem) {
        this.referencedItem = referencedItem;
    }

    /**
     * Used in supporting related concepts, e.g. NDC to RxNorm.
     * 
     */
    @JsonProperty("additionalIdentifier")
    public List<Identifier> getAdditionalIdentifier() {
        return additionalIdentifier;
    }

    /**
     * Used in supporting related concepts, e.g. NDC to RxNorm.
     * 
     */
    @JsonProperty("additionalIdentifier")
    public void setAdditionalIdentifier(List<Identifier> additionalIdentifier) {
        this.additionalIdentifier = additionalIdentifier;
    }

    /**
     * Classes of devices, or ATC for medication.
     * 
     */
    @JsonProperty("classification")
    public List<CodeableConcept> getClassification() {
        return classification;
    }

    /**
     * Classes of devices, or ATC for medication.
     * 
     */
    @JsonProperty("classification")
    public void setClassification(List<CodeableConcept> classification) {
        this.classification = classification;
    }

    /**
     * Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
     * 
     */
    @JsonProperty("status")
    public CatalogEntry.Status getStatus() {
        return status;
    }

    /**
     * Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CatalogEntry.Status status) {
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("validTo")
    public String getValidTo() {
        return validTo;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("validTo")
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validTo")
    public Element get_validTo() {
        return _validTo;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_validTo")
    public void set_validTo(Element _validTo) {
        this._validTo = _validTo;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastUpdated")
    public Element get_lastUpdated() {
        return _lastUpdated;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastUpdated")
    public void set_lastUpdated(Element _lastUpdated) {
        this._lastUpdated = _lastUpdated;
    }

    /**
     * Used for examplefor Out of Formulary, or any specifics.
     * 
     */
    @JsonProperty("additionalCharacteristic")
    public List<CodeableConcept> getAdditionalCharacteristic() {
        return additionalCharacteristic;
    }

    /**
     * Used for examplefor Out of Formulary, or any specifics.
     * 
     */
    @JsonProperty("additionalCharacteristic")
    public void setAdditionalCharacteristic(List<CodeableConcept> additionalCharacteristic) {
        this.additionalCharacteristic = additionalCharacteristic;
    }

    /**
     * User for example for ATC classification, or.
     * 
     */
    @JsonProperty("additionalClassification")
    public List<CodeableConcept> getAdditionalClassification() {
        return additionalClassification;
    }

    /**
     * User for example for ATC classification, or.
     * 
     */
    @JsonProperty("additionalClassification")
    public void setAdditionalClassification(List<CodeableConcept> additionalClassification) {
        this.additionalClassification = additionalClassification;
    }

    /**
     * Used for example, to point to a substance, or to a device used to administer a medication.
     * 
     */
    @JsonProperty("relatedEntry")
    public List<CatalogEntry_RelatedEntry> getRelatedEntry() {
        return relatedEntry;
    }

    /**
     * Used for example, to point to a substance, or to a device used to administer a medication.
     * 
     */
    @JsonProperty("relatedEntry")
    public void setRelatedEntry(List<CatalogEntry_RelatedEntry> relatedEntry) {
        this.relatedEntry = relatedEntry;
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
        sb.append(CatalogEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("orderable");
        sb.append('=');
        sb.append(((this.orderable == null)?"<null>":this.orderable));
        sb.append(',');
        sb.append("_orderable");
        sb.append('=');
        sb.append(((this._orderable == null)?"<null>":this._orderable));
        sb.append(',');
        sb.append("referencedItem");
        sb.append('=');
        sb.append(((this.referencedItem == null)?"<null>":this.referencedItem));
        sb.append(',');
        sb.append("additionalIdentifier");
        sb.append('=');
        sb.append(((this.additionalIdentifier == null)?"<null>":this.additionalIdentifier));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("validTo");
        sb.append('=');
        sb.append(((this.validTo == null)?"<null>":this.validTo));
        sb.append(',');
        sb.append("_validTo");
        sb.append('=');
        sb.append(((this._validTo == null)?"<null>":this._validTo));
        sb.append(',');
        sb.append("lastUpdated");
        sb.append('=');
        sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
        sb.append(',');
        sb.append("_lastUpdated");
        sb.append('=');
        sb.append(((this._lastUpdated == null)?"<null>":this._lastUpdated));
        sb.append(',');
        sb.append("additionalCharacteristic");
        sb.append('=');
        sb.append(((this.additionalCharacteristic == null)?"<null>":this.additionalCharacteristic));
        sb.append(',');
        sb.append("additionalClassification");
        sb.append('=');
        sb.append(((this.additionalClassification == null)?"<null>":this.additionalClassification));
        sb.append(',');
        sb.append("relatedEntry");
        sb.append('=');
        sb.append(((this.relatedEntry == null)?"<null>":this.relatedEntry));
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
        result = ((result* 31)+((this._validTo == null)? 0 :this._validTo.hashCode()));
        result = ((result* 31)+((this.additionalClassification == null)? 0 :this.additionalClassification.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.relatedEntry == null)? 0 :this.relatedEntry.hashCode()));
        result = ((result* 31)+((this.orderable == null)? 0 :this.orderable.hashCode()));
        result = ((result* 31)+((this._orderable == null)? 0 :this._orderable.hashCode()));
        result = ((result* 31)+((this._lastUpdated == null)? 0 :this._lastUpdated.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.additionalIdentifier == null)? 0 :this.additionalIdentifier.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.additionalCharacteristic == null)? 0 :this.additionalCharacteristic.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.referencedItem == null)? 0 :this.referencedItem.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.validTo == null)? 0 :this.validTo.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogEntry) == false) {
            return false;
        }
        CatalogEntry rhs = ((CatalogEntry) other);
        return (((((((((((((((((((super.equals(rhs)&&((this._validTo == rhs._validTo)||((this._validTo!= null)&&this._validTo.equals(rhs._validTo))))&&((this.additionalClassification == rhs.additionalClassification)||((this.additionalClassification!= null)&&this.additionalClassification.equals(rhs.additionalClassification))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.relatedEntry == rhs.relatedEntry)||((this.relatedEntry!= null)&&this.relatedEntry.equals(rhs.relatedEntry))))&&((this.orderable == rhs.orderable)||((this.orderable!= null)&&this.orderable.equals(rhs.orderable))))&&((this._orderable == rhs._orderable)||((this._orderable!= null)&&this._orderable.equals(rhs._orderable))))&&((this._lastUpdated == rhs._lastUpdated)||((this._lastUpdated!= null)&&this._lastUpdated.equals(rhs._lastUpdated))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.additionalIdentifier == rhs.additionalIdentifier)||((this.additionalIdentifier!= null)&&this.additionalIdentifier.equals(rhs.additionalIdentifier))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod))))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&((this.additionalCharacteristic == rhs.additionalCharacteristic)||((this.additionalCharacteristic!= null)&&this.additionalCharacteristic.equals(rhs.additionalCharacteristic))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.referencedItem == rhs.referencedItem)||((this.referencedItem!= null)&&this.referencedItem.equals(rhs.referencedItem))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.validTo == rhs.validTo)||((this.validTo!= null)&&this.validTo.equals(rhs.validTo))));
    }


    /**
     * Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("draft"),
        ACTIVE("active"),
        RETIRED("retired"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, CatalogEntry.Status> CONSTANTS = new HashMap<String, CatalogEntry.Status>();

        static {
            for (CatalogEntry.Status c: values()) {
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
        public static CatalogEntry.Status fromValue(String value) {
            CatalogEntry.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
