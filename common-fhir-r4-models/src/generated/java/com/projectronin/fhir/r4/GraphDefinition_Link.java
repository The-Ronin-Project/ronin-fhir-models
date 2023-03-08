
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "path",
    "_path",
    "sliceName",
    "_sliceName",
    "min",
    "_min",
    "max",
    "_max",
    "description",
    "_description",
    "target"
})
@Generated("jsonschema2pojo")
public class GraphDefinition_Link {

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String path;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _path;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sliceName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String sliceName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sliceName;
    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    @JsonPropertyDescription("A whole number")
    private Double min;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _min;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String max;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _max;
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
     * Potential target for the link.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Potential target for the link.")
    private List<GraphDefinition_Target> target = new ArrayList<GraphDefinition_Target>();

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public Element get_path() {
        return _path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public void set_path(Element _path) {
        this._path = _path;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sliceName")
    public String getSliceName() {
        return sliceName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sliceName")
    public void setSliceName(String sliceName) {
        this.sliceName = sliceName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceName")
    public Element get_sliceName() {
        return _sliceName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sliceName")
    public void set_sliceName(Element _sliceName) {
        this._sliceName = _sliceName;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public Element get_min() {
        return _min;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_min")
    public void set_min(Element _min) {
        this._min = _min;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public Element get_max() {
        return _max;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_max")
    public void set_max(Element _max) {
        this._max = _max;
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
     * Potential target for the link.
     * 
     */
    @JsonProperty("target")
    public List<GraphDefinition_Target> getTarget() {
        return target;
    }

    /**
     * Potential target for the link.
     * 
     */
    @JsonProperty("target")
    public void setTarget(List<GraphDefinition_Target> target) {
        this.target = target;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GraphDefinition_Link.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("_path");
        sb.append('=');
        sb.append(((this._path == null)?"<null>":this._path));
        sb.append(',');
        sb.append("sliceName");
        sb.append('=');
        sb.append(((this.sliceName == null)?"<null>":this.sliceName));
        sb.append(',');
        sb.append("_sliceName");
        sb.append('=');
        sb.append(((this._sliceName == null)?"<null>":this._sliceName));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
        sb.append(',');
        sb.append("_min");
        sb.append('=');
        sb.append(((this._min == null)?"<null>":this._min));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("_max");
        sb.append('=');
        sb.append(((this._max == null)?"<null>":this._max));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
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
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._max == null)? 0 :this._max.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._path == null)? 0 :this._path.hashCode()));
        result = ((result* 31)+((this._sliceName == null)? 0 :this._sliceName.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.sliceName == null)? 0 :this.sliceName.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._min == null)? 0 :this._min.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphDefinition_Link) == false) {
            return false;
        }
        GraphDefinition_Link rhs = ((GraphDefinition_Link) other);
        return (((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._max == rhs._max)||((this._max!= null)&&this._max.equals(rhs._max))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._path == rhs._path)||((this._path!= null)&&this._path.equals(rhs._path))))&&((this._sliceName == rhs._sliceName)||((this._sliceName!= null)&&this._sliceName.equals(rhs._sliceName))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.sliceName == rhs.sliceName)||((this.sliceName!= null)&&this.sliceName.equals(rhs.sliceName))))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._min == rhs._min)||((this._min!= null)&&this._min.equals(rhs._min))));
    }

}
