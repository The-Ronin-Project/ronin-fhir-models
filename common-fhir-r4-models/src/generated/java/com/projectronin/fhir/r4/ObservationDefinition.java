
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
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "category",
    "code",
    "identifier",
    "permittedDataType",
    "_permittedDataType",
    "multipleResultsAllowed",
    "_multipleResultsAllowed",
    "method",
    "preferredReportName",
    "_preferredReportName",
    "quantitativeDetails",
    "qualifiedInterval",
    "validCodedValueSet",
    "normalCodedValueSet",
    "abnormalCodedValueSet",
    "criticalCodedValueSet"
})
@Generated("jsonschema2pojo")
public class ObservationDefinition
    extends DomainResource
{

    /**
     * This is a ObservationDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ObservationDefinition resource")
    private String resourceType;
    /**
     * A code that classifies the general type of observation.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A code that classifies the general type of observation.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A unique identifier assigned to this ObservationDefinition artifact.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this ObservationDefinition artifact.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("permittedDataType")
    @JsonPropertyDescription("The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.")
    private List<PermittedDataType> permittedDataType = new ArrayList<PermittedDataType>();
    /**
     * Extensions for permittedDataType
     * 
     */
    @JsonProperty("_permittedDataType")
    @JsonPropertyDescription("Extensions for permittedDataType")
    private List<Element> _permittedDataType = new ArrayList<Element>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleResultsAllowed")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean multipleResultsAllowed;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleResultsAllowed")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _multipleResultsAllowed;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept method;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preferredReportName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String preferredReportName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preferredReportName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _preferredReportName;
    /**
     * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
     * 
     */
    @JsonProperty("quantitativeDetails")
    @JsonPropertyDescription("Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.")
    private ObservationDefinition_QuantitativeDetails quantitativeDetails;
    /**
     * Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("qualifiedInterval")
    @JsonPropertyDescription("Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.")
    private List<ObservationDefinition_QualifiedInterval> qualifiedInterval = new ArrayList<ObservationDefinition_QualifiedInterval>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("validCodedValueSet")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference validCodedValueSet;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("normalCodedValueSet")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference normalCodedValueSet;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("abnormalCodedValueSet")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference abnormalCodedValueSet;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("criticalCodedValueSet")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference criticalCodedValueSet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ObservationDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ObservationDefinition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A code that classifies the general type of observation.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A code that classifies the general type of observation.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    /**
     * A unique identifier assigned to this ObservationDefinition artifact.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this ObservationDefinition artifact.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("permittedDataType")
    public List<PermittedDataType> getPermittedDataType() {
        return permittedDataType;
    }

    /**
     * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("permittedDataType")
    public void setPermittedDataType(List<PermittedDataType> permittedDataType) {
        this.permittedDataType = permittedDataType;
    }

    /**
     * Extensions for permittedDataType
     * 
     */
    @JsonProperty("_permittedDataType")
    public List<Element> get_permittedDataType() {
        return _permittedDataType;
    }

    /**
     * Extensions for permittedDataType
     * 
     */
    @JsonProperty("_permittedDataType")
    public void set_permittedDataType(List<Element> _permittedDataType) {
        this._permittedDataType = _permittedDataType;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleResultsAllowed")
    public Boolean getMultipleResultsAllowed() {
        return multipleResultsAllowed;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("multipleResultsAllowed")
    public void setMultipleResultsAllowed(Boolean multipleResultsAllowed) {
        this.multipleResultsAllowed = multipleResultsAllowed;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleResultsAllowed")
    public Element get_multipleResultsAllowed() {
        return _multipleResultsAllowed;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleResultsAllowed")
    public void set_multipleResultsAllowed(Element _multipleResultsAllowed) {
        this._multipleResultsAllowed = _multipleResultsAllowed;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preferredReportName")
    public String getPreferredReportName() {
        return preferredReportName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("preferredReportName")
    public void setPreferredReportName(String preferredReportName) {
        this.preferredReportName = preferredReportName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preferredReportName")
    public Element get_preferredReportName() {
        return _preferredReportName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preferredReportName")
    public void set_preferredReportName(Element _preferredReportName) {
        this._preferredReportName = _preferredReportName;
    }

    /**
     * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
     * 
     */
    @JsonProperty("quantitativeDetails")
    public ObservationDefinition_QuantitativeDetails getQuantitativeDetails() {
        return quantitativeDetails;
    }

    /**
     * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
     * 
     */
    @JsonProperty("quantitativeDetails")
    public void setQuantitativeDetails(ObservationDefinition_QuantitativeDetails quantitativeDetails) {
        this.quantitativeDetails = quantitativeDetails;
    }

    /**
     * Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("qualifiedInterval")
    public List<ObservationDefinition_QualifiedInterval> getQualifiedInterval() {
        return qualifiedInterval;
    }

    /**
     * Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.
     * 
     */
    @JsonProperty("qualifiedInterval")
    public void setQualifiedInterval(List<ObservationDefinition_QualifiedInterval> qualifiedInterval) {
        this.qualifiedInterval = qualifiedInterval;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("validCodedValueSet")
    public Reference getValidCodedValueSet() {
        return validCodedValueSet;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("validCodedValueSet")
    public void setValidCodedValueSet(Reference validCodedValueSet) {
        this.validCodedValueSet = validCodedValueSet;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("normalCodedValueSet")
    public Reference getNormalCodedValueSet() {
        return normalCodedValueSet;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("normalCodedValueSet")
    public void setNormalCodedValueSet(Reference normalCodedValueSet) {
        this.normalCodedValueSet = normalCodedValueSet;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("abnormalCodedValueSet")
    public Reference getAbnormalCodedValueSet() {
        return abnormalCodedValueSet;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("abnormalCodedValueSet")
    public void setAbnormalCodedValueSet(Reference abnormalCodedValueSet) {
        this.abnormalCodedValueSet = abnormalCodedValueSet;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("criticalCodedValueSet")
    public Reference getCriticalCodedValueSet() {
        return criticalCodedValueSet;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("criticalCodedValueSet")
    public void setCriticalCodedValueSet(Reference criticalCodedValueSet) {
        this.criticalCodedValueSet = criticalCodedValueSet;
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
        sb.append(ObservationDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("permittedDataType");
        sb.append('=');
        sb.append(((this.permittedDataType == null)?"<null>":this.permittedDataType));
        sb.append(',');
        sb.append("_permittedDataType");
        sb.append('=');
        sb.append(((this._permittedDataType == null)?"<null>":this._permittedDataType));
        sb.append(',');
        sb.append("multipleResultsAllowed");
        sb.append('=');
        sb.append(((this.multipleResultsAllowed == null)?"<null>":this.multipleResultsAllowed));
        sb.append(',');
        sb.append("_multipleResultsAllowed");
        sb.append('=');
        sb.append(((this._multipleResultsAllowed == null)?"<null>":this._multipleResultsAllowed));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("preferredReportName");
        sb.append('=');
        sb.append(((this.preferredReportName == null)?"<null>":this.preferredReportName));
        sb.append(',');
        sb.append("_preferredReportName");
        sb.append('=');
        sb.append(((this._preferredReportName == null)?"<null>":this._preferredReportName));
        sb.append(',');
        sb.append("quantitativeDetails");
        sb.append('=');
        sb.append(((this.quantitativeDetails == null)?"<null>":this.quantitativeDetails));
        sb.append(',');
        sb.append("qualifiedInterval");
        sb.append('=');
        sb.append(((this.qualifiedInterval == null)?"<null>":this.qualifiedInterval));
        sb.append(',');
        sb.append("validCodedValueSet");
        sb.append('=');
        sb.append(((this.validCodedValueSet == null)?"<null>":this.validCodedValueSet));
        sb.append(',');
        sb.append("normalCodedValueSet");
        sb.append('=');
        sb.append(((this.normalCodedValueSet == null)?"<null>":this.normalCodedValueSet));
        sb.append(',');
        sb.append("abnormalCodedValueSet");
        sb.append('=');
        sb.append(((this.abnormalCodedValueSet == null)?"<null>":this.abnormalCodedValueSet));
        sb.append(',');
        sb.append("criticalCodedValueSet");
        sb.append('=');
        sb.append(((this.criticalCodedValueSet == null)?"<null>":this.criticalCodedValueSet));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.validCodedValueSet == null)? 0 :this.validCodedValueSet.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this._permittedDataType == null)? 0 :this._permittedDataType.hashCode()));
        result = ((result* 31)+((this.preferredReportName == null)? 0 :this.preferredReportName.hashCode()));
        result = ((result* 31)+((this.permittedDataType == null)? 0 :this.permittedDataType.hashCode()));
        result = ((result* 31)+((this.multipleResultsAllowed == null)? 0 :this.multipleResultsAllowed.hashCode()));
        result = ((result* 31)+((this.criticalCodedValueSet == null)? 0 :this.criticalCodedValueSet.hashCode()));
        result = ((result* 31)+((this.normalCodedValueSet == null)? 0 :this.normalCodedValueSet.hashCode()));
        result = ((result* 31)+((this._multipleResultsAllowed == null)? 0 :this._multipleResultsAllowed.hashCode()));
        result = ((result* 31)+((this.quantitativeDetails == null)? 0 :this.quantitativeDetails.hashCode()));
        result = ((result* 31)+((this.qualifiedInterval == null)? 0 :this.qualifiedInterval.hashCode()));
        result = ((result* 31)+((this._preferredReportName == null)? 0 :this._preferredReportName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.abnormalCodedValueSet == null)? 0 :this.abnormalCodedValueSet.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObservationDefinition) == false) {
            return false;
        }
        ObservationDefinition rhs = ((ObservationDefinition) other);
        return ((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.validCodedValueSet == rhs.validCodedValueSet)||((this.validCodedValueSet!= null)&&this.validCodedValueSet.equals(rhs.validCodedValueSet))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this._permittedDataType == rhs._permittedDataType)||((this._permittedDataType!= null)&&this._permittedDataType.equals(rhs._permittedDataType))))&&((this.preferredReportName == rhs.preferredReportName)||((this.preferredReportName!= null)&&this.preferredReportName.equals(rhs.preferredReportName))))&&((this.permittedDataType == rhs.permittedDataType)||((this.permittedDataType!= null)&&this.permittedDataType.equals(rhs.permittedDataType))))&&((this.multipleResultsAllowed == rhs.multipleResultsAllowed)||((this.multipleResultsAllowed!= null)&&this.multipleResultsAllowed.equals(rhs.multipleResultsAllowed))))&&((this.criticalCodedValueSet == rhs.criticalCodedValueSet)||((this.criticalCodedValueSet!= null)&&this.criticalCodedValueSet.equals(rhs.criticalCodedValueSet))))&&((this.normalCodedValueSet == rhs.normalCodedValueSet)||((this.normalCodedValueSet!= null)&&this.normalCodedValueSet.equals(rhs.normalCodedValueSet))))&&((this._multipleResultsAllowed == rhs._multipleResultsAllowed)||((this._multipleResultsAllowed!= null)&&this._multipleResultsAllowed.equals(rhs._multipleResultsAllowed))))&&((this.quantitativeDetails == rhs.quantitativeDetails)||((this.quantitativeDetails!= null)&&this.quantitativeDetails.equals(rhs.quantitativeDetails))))&&((this.qualifiedInterval == rhs.qualifiedInterval)||((this.qualifiedInterval!= null)&&this.qualifiedInterval.equals(rhs.qualifiedInterval))))&&((this._preferredReportName == rhs._preferredReportName)||((this._preferredReportName!= null)&&this._preferredReportName.equals(rhs._preferredReportName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.abnormalCodedValueSet == rhs.abnormalCodedValueSet)||((this.abnormalCodedValueSet!= null)&&this.abnormalCodedValueSet.equals(rhs.abnormalCodedValueSet))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
