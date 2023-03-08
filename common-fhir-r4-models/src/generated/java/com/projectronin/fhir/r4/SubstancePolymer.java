
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
 * Todo.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "class",
    "geometry",
    "copolymerConnectivity",
    "modification",
    "_modification",
    "monomerSet",
    "repeat"
})
@Generated("jsonschema2pojo")
public class SubstancePolymer
    extends DomainResource
{

    /**
     * This is a SubstancePolymer resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a SubstancePolymer resource")
    private String resourceType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("class")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept _class;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("geometry")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept geometry;
    /**
     * Todo.
     * 
     */
    @JsonProperty("copolymerConnectivity")
    @JsonPropertyDescription("Todo.")
    private List<CodeableConcept> copolymerConnectivity = new ArrayList<CodeableConcept>();
    /**
     * Todo.
     * 
     */
    @JsonProperty("modification")
    @JsonPropertyDescription("Todo.")
    private List<String> modification = new ArrayList<String>();
    /**
     * Extensions for modification
     * 
     */
    @JsonProperty("_modification")
    @JsonPropertyDescription("Extensions for modification")
    private List<Element> _modification = new ArrayList<Element>();
    /**
     * Todo.
     * 
     */
    @JsonProperty("monomerSet")
    @JsonPropertyDescription("Todo.")
    private List<SubstancePolymer_MonomerSet> monomerSet = new ArrayList<SubstancePolymer_MonomerSet>();
    /**
     * Todo.
     * 
     */
    @JsonProperty("repeat")
    @JsonPropertyDescription("Todo.")
    private List<SubstancePolymer_Repeat> repeat = new ArrayList<SubstancePolymer_Repeat>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a SubstancePolymer resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a SubstancePolymer resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("class")
    public CodeableConcept getClass_() {
        return _class;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("class")
    public void setClass_(CodeableConcept _class) {
        this._class = _class;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("geometry")
    public CodeableConcept getGeometry() {
        return geometry;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("geometry")
    public void setGeometry(CodeableConcept geometry) {
        this.geometry = geometry;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("copolymerConnectivity")
    public List<CodeableConcept> getCopolymerConnectivity() {
        return copolymerConnectivity;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("copolymerConnectivity")
    public void setCopolymerConnectivity(List<CodeableConcept> copolymerConnectivity) {
        this.copolymerConnectivity = copolymerConnectivity;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("modification")
    public List<String> getModification() {
        return modification;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("modification")
    public void setModification(List<String> modification) {
        this.modification = modification;
    }

    /**
     * Extensions for modification
     * 
     */
    @JsonProperty("_modification")
    public List<Element> get_modification() {
        return _modification;
    }

    /**
     * Extensions for modification
     * 
     */
    @JsonProperty("_modification")
    public void set_modification(List<Element> _modification) {
        this._modification = _modification;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("monomerSet")
    public List<SubstancePolymer_MonomerSet> getMonomerSet() {
        return monomerSet;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("monomerSet")
    public void setMonomerSet(List<SubstancePolymer_MonomerSet> monomerSet) {
        this.monomerSet = monomerSet;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("repeat")
    public List<SubstancePolymer_Repeat> getRepeat() {
        return repeat;
    }

    /**
     * Todo.
     * 
     */
    @JsonProperty("repeat")
    public void setRepeat(List<SubstancePolymer_Repeat> repeat) {
        this.repeat = repeat;
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
        sb.append(SubstancePolymer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("geometry");
        sb.append('=');
        sb.append(((this.geometry == null)?"<null>":this.geometry));
        sb.append(',');
        sb.append("copolymerConnectivity");
        sb.append('=');
        sb.append(((this.copolymerConnectivity == null)?"<null>":this.copolymerConnectivity));
        sb.append(',');
        sb.append("modification");
        sb.append('=');
        sb.append(((this.modification == null)?"<null>":this.modification));
        sb.append(',');
        sb.append("_modification");
        sb.append('=');
        sb.append(((this._modification == null)?"<null>":this._modification));
        sb.append(',');
        sb.append("monomerSet");
        sb.append('=');
        sb.append(((this.monomerSet == null)?"<null>":this.monomerSet));
        sb.append(',');
        sb.append("repeat");
        sb.append('=');
        sb.append(((this.repeat == null)?"<null>":this.repeat));
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
        result = ((result* 31)+((this.monomerSet == null)? 0 :this.monomerSet.hashCode()));
        result = ((result* 31)+((this.copolymerConnectivity == null)? 0 :this.copolymerConnectivity.hashCode()));
        result = ((result* 31)+((this.repeat == null)? 0 :this.repeat.hashCode()));
        result = ((result* 31)+((this.geometry == null)? 0 :this.geometry.hashCode()));
        result = ((result* 31)+((this._modification == null)? 0 :this._modification.hashCode()));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.modification == null)? 0 :this.modification.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstancePolymer) == false) {
            return false;
        }
        SubstancePolymer rhs = ((SubstancePolymer) other);
        return (((((((((super.equals(rhs)&&((this.monomerSet == rhs.monomerSet)||((this.monomerSet!= null)&&this.monomerSet.equals(rhs.monomerSet))))&&((this.copolymerConnectivity == rhs.copolymerConnectivity)||((this.copolymerConnectivity!= null)&&this.copolymerConnectivity.equals(rhs.copolymerConnectivity))))&&((this.repeat == rhs.repeat)||((this.repeat!= null)&&this.repeat.equals(rhs.repeat))))&&((this.geometry == rhs.geometry)||((this.geometry!= null)&&this.geometry.equals(rhs.geometry))))&&((this._modification == rhs._modification)||((this._modification!= null)&&this._modification.equals(rhs._modification))))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.modification == rhs.modification)||((this.modification!= null)&&this.modification.equals(rhs.modification))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
