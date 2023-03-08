
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "hierarchical",
    "_hierarchical",
    "paging",
    "_paging",
    "incomplete",
    "_incomplete",
    "parameter",
    "textFilter",
    "_textFilter"
})
@Generated("jsonschema2pojo")
public class TerminologyCapabilities_Expansion {

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("hierarchical")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean hierarchical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hierarchical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _hierarchical;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("paging")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean paging;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paging")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _paging;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("incomplete")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean incomplete;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_incomplete")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _incomplete;
    /**
     * Supported expansion parameter.
     * 
     */
    @JsonProperty("parameter")
    @JsonPropertyDescription("Supported expansion parameter.")
    private List<TerminologyCapabilities_Parameter> parameter = new ArrayList<TerminologyCapabilities_Parameter>();
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("textFilter")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String textFilter;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_textFilter")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _textFilter;

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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("hierarchical")
    public Boolean getHierarchical() {
        return hierarchical;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("hierarchical")
    public void setHierarchical(Boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hierarchical")
    public Element get_hierarchical() {
        return _hierarchical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hierarchical")
    public void set_hierarchical(Element _hierarchical) {
        this._hierarchical = _hierarchical;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("paging")
    public Boolean getPaging() {
        return paging;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("paging")
    public void setPaging(Boolean paging) {
        this.paging = paging;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paging")
    public Element get_paging() {
        return _paging;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_paging")
    public void set_paging(Element _paging) {
        this._paging = _paging;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("incomplete")
    public Boolean getIncomplete() {
        return incomplete;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("incomplete")
    public void setIncomplete(Boolean incomplete) {
        this.incomplete = incomplete;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_incomplete")
    public Element get_incomplete() {
        return _incomplete;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_incomplete")
    public void set_incomplete(Element _incomplete) {
        this._incomplete = _incomplete;
    }

    /**
     * Supported expansion parameter.
     * 
     */
    @JsonProperty("parameter")
    public List<TerminologyCapabilities_Parameter> getParameter() {
        return parameter;
    }

    /**
     * Supported expansion parameter.
     * 
     */
    @JsonProperty("parameter")
    public void setParameter(List<TerminologyCapabilities_Parameter> parameter) {
        this.parameter = parameter;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("textFilter")
    public String getTextFilter() {
        return textFilter;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("textFilter")
    public void setTextFilter(String textFilter) {
        this.textFilter = textFilter;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_textFilter")
    public Element get_textFilter() {
        return _textFilter;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_textFilter")
    public void set_textFilter(Element _textFilter) {
        this._textFilter = _textFilter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TerminologyCapabilities_Expansion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("hierarchical");
        sb.append('=');
        sb.append(((this.hierarchical == null)?"<null>":this.hierarchical));
        sb.append(',');
        sb.append("_hierarchical");
        sb.append('=');
        sb.append(((this._hierarchical == null)?"<null>":this._hierarchical));
        sb.append(',');
        sb.append("paging");
        sb.append('=');
        sb.append(((this.paging == null)?"<null>":this.paging));
        sb.append(',');
        sb.append("_paging");
        sb.append('=');
        sb.append(((this._paging == null)?"<null>":this._paging));
        sb.append(',');
        sb.append("incomplete");
        sb.append('=');
        sb.append(((this.incomplete == null)?"<null>":this.incomplete));
        sb.append(',');
        sb.append("_incomplete");
        sb.append('=');
        sb.append(((this._incomplete == null)?"<null>":this._incomplete));
        sb.append(',');
        sb.append("parameter");
        sb.append('=');
        sb.append(((this.parameter == null)?"<null>":this.parameter));
        sb.append(',');
        sb.append("textFilter");
        sb.append('=');
        sb.append(((this.textFilter == null)?"<null>":this.textFilter));
        sb.append(',');
        sb.append("_textFilter");
        sb.append('=');
        sb.append(((this._textFilter == null)?"<null>":this._textFilter));
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
        result = ((result* 31)+((this.textFilter == null)? 0 :this.textFilter.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.incomplete == null)? 0 :this.incomplete.hashCode()));
        result = ((result* 31)+((this._hierarchical == null)? 0 :this._hierarchical.hashCode()));
        result = ((result* 31)+((this._textFilter == null)? 0 :this._textFilter.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.hierarchical == null)? 0 :this.hierarchical.hashCode()));
        result = ((result* 31)+((this._incomplete == null)? 0 :this._incomplete.hashCode()));
        result = ((result* 31)+((this.parameter == null)? 0 :this.parameter.hashCode()));
        result = ((result* 31)+((this.paging == null)? 0 :this.paging.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._paging == null)? 0 :this._paging.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TerminologyCapabilities_Expansion) == false) {
            return false;
        }
        TerminologyCapabilities_Expansion rhs = ((TerminologyCapabilities_Expansion) other);
        return (((((((((((((this.textFilter == rhs.textFilter)||((this.textFilter!= null)&&this.textFilter.equals(rhs.textFilter)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.incomplete == rhs.incomplete)||((this.incomplete!= null)&&this.incomplete.equals(rhs.incomplete))))&&((this._hierarchical == rhs._hierarchical)||((this._hierarchical!= null)&&this._hierarchical.equals(rhs._hierarchical))))&&((this._textFilter == rhs._textFilter)||((this._textFilter!= null)&&this._textFilter.equals(rhs._textFilter))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.hierarchical == rhs.hierarchical)||((this.hierarchical!= null)&&this.hierarchical.equals(rhs.hierarchical))))&&((this._incomplete == rhs._incomplete)||((this._incomplete!= null)&&this._incomplete.equals(rhs._incomplete))))&&((this.parameter == rhs.parameter)||((this.parameter!= null)&&this.parameter.equals(rhs.parameter))))&&((this.paging == rhs.paging)||((this.paging!= null)&&this.paging.equals(rhs.paging))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._paging == rhs._paging)||((this._paging!= null)&&this._paging.equals(rhs._paging))));
    }

}
