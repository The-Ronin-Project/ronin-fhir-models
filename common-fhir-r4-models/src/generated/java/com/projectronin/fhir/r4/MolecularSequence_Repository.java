
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Raw data describing a biological sequence.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "_type",
    "url",
    "_url",
    "name",
    "_name",
    "datasetId",
    "_datasetId",
    "variantsetId",
    "_variantsetId",
    "readsetId",
    "_readsetId"
})
@Generated("jsonschema2pojo")
public class MolecularSequence_Repository {

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
     * Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.")
    private MolecularSequence_Repository.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String url;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _url;
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
    @JsonProperty("datasetId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String datasetId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_datasetId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _datasetId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("variantsetId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String variantsetId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variantsetId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _variantsetId;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("readsetId")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String readsetId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readsetId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _readsetId;

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
     * Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
     * 
     */
    @JsonProperty("type")
    public MolecularSequence_Repository.Type getType() {
        return type;
    }

    /**
     * Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
     * 
     */
    @JsonProperty("type")
    public void setType(MolecularSequence_Repository.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public Element get_url() {
        return _url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public void set_url(Element _url) {
        this._url = _url;
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
    @JsonProperty("datasetId")
    public String getDatasetId() {
        return datasetId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("datasetId")
    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_datasetId")
    public Element get_datasetId() {
        return _datasetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_datasetId")
    public void set_datasetId(Element _datasetId) {
        this._datasetId = _datasetId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("variantsetId")
    public String getVariantsetId() {
        return variantsetId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("variantsetId")
    public void setVariantsetId(String variantsetId) {
        this.variantsetId = variantsetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variantsetId")
    public Element get_variantsetId() {
        return _variantsetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_variantsetId")
    public void set_variantsetId(Element _variantsetId) {
        this._variantsetId = _variantsetId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("readsetId")
    public String getReadsetId() {
        return readsetId;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("readsetId")
    public void setReadsetId(String readsetId) {
        this.readsetId = readsetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readsetId")
    public Element get_readsetId() {
        return _readsetId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_readsetId")
    public void set_readsetId(Element _readsetId) {
        this._readsetId = _readsetId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MolecularSequence_Repository.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("datasetId");
        sb.append('=');
        sb.append(((this.datasetId == null)?"<null>":this.datasetId));
        sb.append(',');
        sb.append("_datasetId");
        sb.append('=');
        sb.append(((this._datasetId == null)?"<null>":this._datasetId));
        sb.append(',');
        sb.append("variantsetId");
        sb.append('=');
        sb.append(((this.variantsetId == null)?"<null>":this.variantsetId));
        sb.append(',');
        sb.append("_variantsetId");
        sb.append('=');
        sb.append(((this._variantsetId == null)?"<null>":this._variantsetId));
        sb.append(',');
        sb.append("readsetId");
        sb.append('=');
        sb.append(((this.readsetId == null)?"<null>":this.readsetId));
        sb.append(',');
        sb.append("_readsetId");
        sb.append('=');
        sb.append(((this._readsetId == null)?"<null>":this._readsetId));
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
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._variantsetId == null)? 0 :this._variantsetId.hashCode()));
        result = ((result* 31)+((this.readsetId == null)? 0 :this.readsetId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.datasetId == null)? 0 :this.datasetId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this.variantsetId == null)? 0 :this.variantsetId.hashCode()));
        result = ((result* 31)+((this._readsetId == null)? 0 :this._readsetId.hashCode()));
        result = ((result* 31)+((this._datasetId == null)? 0 :this._datasetId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MolecularSequence_Repository) == false) {
            return false;
        }
        MolecularSequence_Repository rhs = ((MolecularSequence_Repository) other);
        return ((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._variantsetId == rhs._variantsetId)||((this._variantsetId!= null)&&this._variantsetId.equals(rhs._variantsetId))))&&((this.readsetId == rhs.readsetId)||((this.readsetId!= null)&&this.readsetId.equals(rhs.readsetId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.datasetId == rhs.datasetId)||((this.datasetId!= null)&&this.datasetId.equals(rhs.datasetId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this.variantsetId == rhs.variantsetId)||((this.variantsetId!= null)&&this.variantsetId.equals(rhs.variantsetId))))&&((this._readsetId == rhs._readsetId)||((this._readsetId!= null)&&this._readsetId.equals(rhs._readsetId))))&&((this._datasetId == rhs._datasetId)||((this._datasetId!= null)&&this._datasetId.equals(rhs._datasetId))));
    }


    /**
     * Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        DIRECTLINK("directlink"),
        OPENAPI("openapi"),
        LOGIN("login"),
        OAUTH("oauth"),
        OTHER("other");
        private final String value;
        private final static Map<String, MolecularSequence_Repository.Type> CONSTANTS = new HashMap<String, MolecularSequence_Repository.Type>();

        static {
            for (MolecularSequence_Repository.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static MolecularSequence_Repository.Type fromValue(String value) {
            MolecularSequence_Repository.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
