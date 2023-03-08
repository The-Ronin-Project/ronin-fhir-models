
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "source",
    "_source",
    "sourceVersion",
    "_sourceVersion",
    "target",
    "_target",
    "targetVersion",
    "_targetVersion",
    "element",
    "unmapped"
})
@Generated("jsonschema2pojo")
public class ConceptMap_Group {

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String source;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_source")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _source;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sourceVersion")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String sourceVersion;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceVersion")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sourceVersion;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String target;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_target")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _target;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("targetVersion")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String targetVersion;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetVersion")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _targetVersion;
    /**
     * Mappings for an individual concept in the source to one or more concepts in the target.
     * (Required)
     * 
     */
    @JsonProperty("element")
    @JsonPropertyDescription("Mappings for an individual concept in the source to one or more concepts in the target.")
    private List<ConceptMap_Element> element = new ArrayList<ConceptMap_Element>();
    /**
     * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
     * 
     */
    @JsonProperty("unmapped")
    @JsonPropertyDescription("A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.")
    private ConceptMap_Unmapped unmapped;

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_source")
    public Element get_source() {
        return _source;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_source")
    public void set_source(Element _source) {
        this._source = _source;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sourceVersion")
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sourceVersion")
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceVersion")
    public Element get_sourceVersion() {
        return _sourceVersion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceVersion")
    public void set_sourceVersion(Element _sourceVersion) {
        this._sourceVersion = _sourceVersion;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_target")
    public Element get_target() {
        return _target;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_target")
    public void set_target(Element _target) {
        this._target = _target;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("targetVersion")
    public String getTargetVersion() {
        return targetVersion;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("targetVersion")
    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetVersion")
    public Element get_targetVersion() {
        return _targetVersion;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetVersion")
    public void set_targetVersion(Element _targetVersion) {
        this._targetVersion = _targetVersion;
    }

    /**
     * Mappings for an individual concept in the source to one or more concepts in the target.
     * (Required)
     * 
     */
    @JsonProperty("element")
    public List<ConceptMap_Element> getElement() {
        return element;
    }

    /**
     * Mappings for an individual concept in the source to one or more concepts in the target.
     * (Required)
     * 
     */
    @JsonProperty("element")
    public void setElement(List<ConceptMap_Element> element) {
        this.element = element;
    }

    /**
     * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
     * 
     */
    @JsonProperty("unmapped")
    public ConceptMap_Unmapped getUnmapped() {
        return unmapped;
    }

    /**
     * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
     * 
     */
    @JsonProperty("unmapped")
    public void setUnmapped(ConceptMap_Unmapped unmapped) {
        this.unmapped = unmapped;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConceptMap_Group.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("_source");
        sb.append('=');
        sb.append(((this._source == null)?"<null>":this._source));
        sb.append(',');
        sb.append("sourceVersion");
        sb.append('=');
        sb.append(((this.sourceVersion == null)?"<null>":this.sourceVersion));
        sb.append(',');
        sb.append("_sourceVersion");
        sb.append('=');
        sb.append(((this._sourceVersion == null)?"<null>":this._sourceVersion));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("_target");
        sb.append('=');
        sb.append(((this._target == null)?"<null>":this._target));
        sb.append(',');
        sb.append("targetVersion");
        sb.append('=');
        sb.append(((this.targetVersion == null)?"<null>":this.targetVersion));
        sb.append(',');
        sb.append("_targetVersion");
        sb.append('=');
        sb.append(((this._targetVersion == null)?"<null>":this._targetVersion));
        sb.append(',');
        sb.append("element");
        sb.append('=');
        sb.append(((this.element == null)?"<null>":this.element));
        sb.append(',');
        sb.append("unmapped");
        sb.append('=');
        sb.append(((this.unmapped == null)?"<null>":this.unmapped));
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
        result = ((result* 31)+((this.sourceVersion == null)? 0 :this.sourceVersion.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.unmapped == null)? 0 :this.unmapped.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this.targetVersion == null)? 0 :this.targetVersion.hashCode()));
        result = ((result* 31)+((this._source == null)? 0 :this._source.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._sourceVersion == null)? 0 :this._sourceVersion.hashCode()));
        result = ((result* 31)+((this._target == null)? 0 :this._target.hashCode()));
        result = ((result* 31)+((this._targetVersion == null)? 0 :this._targetVersion.hashCode()));
        result = ((result* 31)+((this.element == null)? 0 :this.element.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConceptMap_Group) == false) {
            return false;
        }
        ConceptMap_Group rhs = ((ConceptMap_Group) other);
        return ((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.sourceVersion == rhs.sourceVersion)||((this.sourceVersion!= null)&&this.sourceVersion.equals(rhs.sourceVersion))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.unmapped == rhs.unmapped)||((this.unmapped!= null)&&this.unmapped.equals(rhs.unmapped))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this.targetVersion == rhs.targetVersion)||((this.targetVersion!= null)&&this.targetVersion.equals(rhs.targetVersion))))&&((this._source == rhs._source)||((this._source!= null)&&this._source.equals(rhs._source))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._sourceVersion == rhs._sourceVersion)||((this._sourceVersion!= null)&&this._sourceVersion.equals(rhs._sourceVersion))))&&((this._target == rhs._target)||((this._target!= null)&&this._target.equals(rhs._target))))&&((this._targetVersion == rhs._targetVersion)||((this._targetVersion!= null)&&this._targetVersion.equals(rhs._targetVersion))))&&((this.element == rhs.element)||((this.element!= null)&&this.element.equals(rhs.element))));
    }

}
