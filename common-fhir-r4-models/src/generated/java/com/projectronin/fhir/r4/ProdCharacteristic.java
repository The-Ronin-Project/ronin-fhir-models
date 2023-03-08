
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "height",
    "width",
    "depth",
    "weight",
    "nominalVolume",
    "externalDiameter",
    "shape",
    "_shape",
    "color",
    "_color",
    "imprint",
    "_imprint",
    "image",
    "scoring"
})
@Generated("jsonschema2pojo")
public class ProdCharacteristic {

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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("height")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity height;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("width")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity width;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("depth")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity depth;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity weight;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("nominalVolume")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity nominalVolume;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("externalDiameter")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity externalDiameter;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("shape")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String shape;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_shape")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _shape;
    /**
     * Where applicable, the color can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
     * 
     */
    @JsonProperty("color")
    @JsonPropertyDescription("Where applicable, the color can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.")
    private List<String> color = new ArrayList<String>();
    /**
     * Extensions for color
     * 
     */
    @JsonProperty("_color")
    @JsonPropertyDescription("Extensions for color")
    private List<Element> _color = new ArrayList<Element>();
    /**
     * Where applicable, the imprint can be specified as text.
     * 
     */
    @JsonProperty("imprint")
    @JsonPropertyDescription("Where applicable, the imprint can be specified as text.")
    private List<String> imprint = new ArrayList<String>();
    /**
     * Extensions for imprint
     * 
     */
    @JsonProperty("_imprint")
    @JsonPropertyDescription("Extensions for imprint")
    private List<Element> _imprint = new ArrayList<Element>();
    /**
     * Where applicable, the image can be provided The format of the image attachment shall be specified by regional implementations.
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Where applicable, the image can be provided The format of the image attachment shall be specified by regional implementations.")
    private List<Attachment> image = new ArrayList<Attachment>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scoring")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept scoring;

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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("height")
    public Quantity getHeight() {
        return height;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("height")
    public void setHeight(Quantity height) {
        this.height = height;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("width")
    public Quantity getWidth() {
        return width;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("width")
    public void setWidth(Quantity width) {
        this.width = width;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("depth")
    public Quantity getDepth() {
        return depth;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("depth")
    public void setDepth(Quantity depth) {
        this.depth = depth;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("weight")
    public Quantity getWeight() {
        return weight;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Quantity weight) {
        this.weight = weight;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("nominalVolume")
    public Quantity getNominalVolume() {
        return nominalVolume;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("nominalVolume")
    public void setNominalVolume(Quantity nominalVolume) {
        this.nominalVolume = nominalVolume;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("externalDiameter")
    public Quantity getExternalDiameter() {
        return externalDiameter;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("externalDiameter")
    public void setExternalDiameter(Quantity externalDiameter) {
        this.externalDiameter = externalDiameter;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("shape")
    public String getShape() {
        return shape;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("shape")
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_shape")
    public Element get_shape() {
        return _shape;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_shape")
    public void set_shape(Element _shape) {
        this._shape = _shape;
    }

    /**
     * Where applicable, the color can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
     * 
     */
    @JsonProperty("color")
    public List<String> getColor() {
        return color;
    }

    /**
     * Where applicable, the color can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
     * 
     */
    @JsonProperty("color")
    public void setColor(List<String> color) {
        this.color = color;
    }

    /**
     * Extensions for color
     * 
     */
    @JsonProperty("_color")
    public List<Element> get_color() {
        return _color;
    }

    /**
     * Extensions for color
     * 
     */
    @JsonProperty("_color")
    public void set_color(List<Element> _color) {
        this._color = _color;
    }

    /**
     * Where applicable, the imprint can be specified as text.
     * 
     */
    @JsonProperty("imprint")
    public List<String> getImprint() {
        return imprint;
    }

    /**
     * Where applicable, the imprint can be specified as text.
     * 
     */
    @JsonProperty("imprint")
    public void setImprint(List<String> imprint) {
        this.imprint = imprint;
    }

    /**
     * Extensions for imprint
     * 
     */
    @JsonProperty("_imprint")
    public List<Element> get_imprint() {
        return _imprint;
    }

    /**
     * Extensions for imprint
     * 
     */
    @JsonProperty("_imprint")
    public void set_imprint(List<Element> _imprint) {
        this._imprint = _imprint;
    }

    /**
     * Where applicable, the image can be provided The format of the image attachment shall be specified by regional implementations.
     * 
     */
    @JsonProperty("image")
    public List<Attachment> getImage() {
        return image;
    }

    /**
     * Where applicable, the image can be provided The format of the image attachment shall be specified by regional implementations.
     * 
     */
    @JsonProperty("image")
    public void setImage(List<Attachment> image) {
        this.image = image;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scoring")
    public CodeableConcept getScoring() {
        return scoring;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("scoring")
    public void setScoring(CodeableConcept scoring) {
        this.scoring = scoring;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProdCharacteristic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("depth");
        sb.append('=');
        sb.append(((this.depth == null)?"<null>":this.depth));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("nominalVolume");
        sb.append('=');
        sb.append(((this.nominalVolume == null)?"<null>":this.nominalVolume));
        sb.append(',');
        sb.append("externalDiameter");
        sb.append('=');
        sb.append(((this.externalDiameter == null)?"<null>":this.externalDiameter));
        sb.append(',');
        sb.append("shape");
        sb.append('=');
        sb.append(((this.shape == null)?"<null>":this.shape));
        sb.append(',');
        sb.append("_shape");
        sb.append('=');
        sb.append(((this._shape == null)?"<null>":this._shape));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("_color");
        sb.append('=');
        sb.append(((this._color == null)?"<null>":this._color));
        sb.append(',');
        sb.append("imprint");
        sb.append('=');
        sb.append(((this.imprint == null)?"<null>":this.imprint));
        sb.append(',');
        sb.append("_imprint");
        sb.append('=');
        sb.append(((this._imprint == null)?"<null>":this._imprint));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("scoring");
        sb.append('=');
        sb.append(((this.scoring == null)?"<null>":this.scoring));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.scoring == null)? 0 :this.scoring.hashCode()));
        result = ((result* 31)+((this._shape == null)? 0 :this._shape.hashCode()));
        result = ((result* 31)+((this.shape == null)? 0 :this.shape.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.externalDiameter == null)? 0 :this.externalDiameter.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._color == null)? 0 :this._color.hashCode()));
        result = ((result* 31)+((this.imprint == null)? 0 :this.imprint.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.nominalVolume == null)? 0 :this.nominalVolume.hashCode()));
        result = ((result* 31)+((this.depth == null)? 0 :this.depth.hashCode()));
        result = ((result* 31)+((this._imprint == null)? 0 :this._imprint.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProdCharacteristic) == false) {
            return false;
        }
        ProdCharacteristic rhs = ((ProdCharacteristic) other);
        return ((((((((((((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.scoring == rhs.scoring)||((this.scoring!= null)&&this.scoring.equals(rhs.scoring))))&&((this._shape == rhs._shape)||((this._shape!= null)&&this._shape.equals(rhs._shape))))&&((this.shape == rhs.shape)||((this.shape!= null)&&this.shape.equals(rhs.shape))))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.externalDiameter == rhs.externalDiameter)||((this.externalDiameter!= null)&&this.externalDiameter.equals(rhs.externalDiameter))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._color == rhs._color)||((this._color!= null)&&this._color.equals(rhs._color))))&&((this.imprint == rhs.imprint)||((this.imprint!= null)&&this.imprint.equals(rhs.imprint))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.nominalVolume == rhs.nominalVolume)||((this.nominalVolume!= null)&&this.nominalVolume.equals(rhs.nominalVolume))))&&((this.depth == rhs.depth)||((this.depth!= null)&&this.depth.equals(rhs.depth))))&&((this._imprint == rhs._imprint)||((this._imprint!= null)&&this._imprint.equals(rhs._imprint))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
