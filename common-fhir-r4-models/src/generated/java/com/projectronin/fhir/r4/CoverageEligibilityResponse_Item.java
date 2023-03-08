
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
    "category",
    "productOrService",
    "modifier",
    "provider",
    "excluded",
    "_excluded",
    "name",
    "_name",
    "description",
    "_description",
    "network",
    "unit",
    "term",
    "benefit",
    "authorizationRequired",
    "_authorizationRequired",
    "authorizationSupporting",
    "authorizationUrl",
    "_authorizationUrl"
})
@Generated("jsonschema2pojo")
public class CoverageEligibilityResponse_Item {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept category;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference provider;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("excluded")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean excluded;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_excluded")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _excluded;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
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
    @JsonProperty("network")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept network;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unit")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept unit;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept term;
    /**
     * Benefits used to date.
     * 
     */
    @JsonProperty("benefit")
    @JsonPropertyDescription("Benefits used to date.")
    private List<CoverageEligibilityResponse_Benefit> benefit = new ArrayList<CoverageEligibilityResponse_Benefit>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("authorizationRequired")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean authorizationRequired;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorizationRequired")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _authorizationRequired;
    /**
     * Codes or comments regarding information or actions associated with the preauthorization.
     * 
     */
    @JsonProperty("authorizationSupporting")
    @JsonPropertyDescription("Codes or comments regarding information or actions associated with the preauthorization.")
    private List<CodeableConcept> authorizationSupporting = new ArrayList<CodeableConcept>();
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("authorizationUrl")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String authorizationUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorizationUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _authorizationUrl;

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
     * 
     */
    @JsonProperty("productOrService")
    public CodeableConcept getProductOrService() {
        return productOrService;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public Reference getProvider() {
        return provider;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
        this.provider = provider;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("excluded")
    public Boolean getExcluded() {
        return excluded;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("excluded")
    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_excluded")
    public Element get_excluded() {
        return _excluded;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_excluded")
    public void set_excluded(Element _excluded) {
        this._excluded = _excluded;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
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
    @JsonProperty("network")
    public CodeableConcept getNetwork() {
        return network;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("network")
    public void setNetwork(CodeableConcept network) {
        this.network = network;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unit")
    public CodeableConcept getUnit() {
        return unit;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unit")
    public void setUnit(CodeableConcept unit) {
        this.unit = unit;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("term")
    public CodeableConcept getTerm() {
        return term;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("term")
    public void setTerm(CodeableConcept term) {
        this.term = term;
    }

    /**
     * Benefits used to date.
     * 
     */
    @JsonProperty("benefit")
    public List<CoverageEligibilityResponse_Benefit> getBenefit() {
        return benefit;
    }

    /**
     * Benefits used to date.
     * 
     */
    @JsonProperty("benefit")
    public void setBenefit(List<CoverageEligibilityResponse_Benefit> benefit) {
        this.benefit = benefit;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("authorizationRequired")
    public Boolean getAuthorizationRequired() {
        return authorizationRequired;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("authorizationRequired")
    public void setAuthorizationRequired(Boolean authorizationRequired) {
        this.authorizationRequired = authorizationRequired;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorizationRequired")
    public Element get_authorizationRequired() {
        return _authorizationRequired;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorizationRequired")
    public void set_authorizationRequired(Element _authorizationRequired) {
        this._authorizationRequired = _authorizationRequired;
    }

    /**
     * Codes or comments regarding information or actions associated with the preauthorization.
     * 
     */
    @JsonProperty("authorizationSupporting")
    public List<CodeableConcept> getAuthorizationSupporting() {
        return authorizationSupporting;
    }

    /**
     * Codes or comments regarding information or actions associated with the preauthorization.
     * 
     */
    @JsonProperty("authorizationSupporting")
    public void setAuthorizationSupporting(List<CodeableConcept> authorizationSupporting) {
        this.authorizationSupporting = authorizationSupporting;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("authorizationUrl")
    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("authorizationUrl")
    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorizationUrl")
    public Element get_authorizationUrl() {
        return _authorizationUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorizationUrl")
    public void set_authorizationUrl(Element _authorizationUrl) {
        this._authorizationUrl = _authorizationUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoverageEligibilityResponse_Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("excluded");
        sb.append('=');
        sb.append(((this.excluded == null)?"<null>":this.excluded));
        sb.append(',');
        sb.append("_excluded");
        sb.append('=');
        sb.append(((this._excluded == null)?"<null>":this._excluded));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("benefit");
        sb.append('=');
        sb.append(((this.benefit == null)?"<null>":this.benefit));
        sb.append(',');
        sb.append("authorizationRequired");
        sb.append('=');
        sb.append(((this.authorizationRequired == null)?"<null>":this.authorizationRequired));
        sb.append(',');
        sb.append("_authorizationRequired");
        sb.append('=');
        sb.append(((this._authorizationRequired == null)?"<null>":this._authorizationRequired));
        sb.append(',');
        sb.append("authorizationSupporting");
        sb.append('=');
        sb.append(((this.authorizationSupporting == null)?"<null>":this.authorizationSupporting));
        sb.append(',');
        sb.append("authorizationUrl");
        sb.append('=');
        sb.append(((this.authorizationUrl == null)?"<null>":this.authorizationUrl));
        sb.append(',');
        sb.append("_authorizationUrl");
        sb.append('=');
        sb.append(((this._authorizationUrl == null)?"<null>":this._authorizationUrl));
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
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.modifier == null)? 0 :this.modifier.hashCode()));
        result = ((result* 31)+((this._excluded == null)? 0 :this._excluded.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.authorizationSupporting == null)? 0 :this.authorizationSupporting.hashCode()));
        result = ((result* 31)+((this.productOrService == null)? 0 :this.productOrService.hashCode()));
        result = ((result* 31)+((this.benefit == null)? 0 :this.benefit.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.excluded == null)? 0 :this.excluded.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.authorizationUrl == null)? 0 :this.authorizationUrl.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.authorizationRequired == null)? 0 :this.authorizationRequired.hashCode()));
        result = ((result* 31)+((this._authorizationRequired == null)? 0 :this._authorizationRequired.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._authorizationUrl == null)? 0 :this._authorizationUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoverageEligibilityResponse_Item) == false) {
            return false;
        }
        CoverageEligibilityResponse_Item rhs = ((CoverageEligibilityResponse_Item) other);
        return (((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.modifier == rhs.modifier)||((this.modifier!= null)&&this.modifier.equals(rhs.modifier))))&&((this._excluded == rhs._excluded)||((this._excluded!= null)&&this._excluded.equals(rhs._excluded))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.authorizationSupporting == rhs.authorizationSupporting)||((this.authorizationSupporting!= null)&&this.authorizationSupporting.equals(rhs.authorizationSupporting))))&&((this.productOrService == rhs.productOrService)||((this.productOrService!= null)&&this.productOrService.equals(rhs.productOrService))))&&((this.benefit == rhs.benefit)||((this.benefit!= null)&&this.benefit.equals(rhs.benefit))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.excluded == rhs.excluded)||((this.excluded!= null)&&this.excluded.equals(rhs.excluded))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.authorizationUrl == rhs.authorizationUrl)||((this.authorizationUrl!= null)&&this.authorizationUrl.equals(rhs.authorizationUrl))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.authorizationRequired == rhs.authorizationRequired)||((this.authorizationRequired!= null)&&this.authorizationRequired.equals(rhs.authorizationRequired))))&&((this._authorizationRequired == rhs._authorizationRequired)||((this._authorizationRequired!= null)&&this._authorizationRequired.equals(rhs._authorizationRequired))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._authorizationUrl == rhs._authorizationUrl)||((this._authorizationUrl!= null)&&this._authorizationUrl.equals(rhs._authorizationUrl))));
    }

}
