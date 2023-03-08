
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
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "product",
    "eye",
    "_eye",
    "sphere",
    "_sphere",
    "cylinder",
    "_cylinder",
    "axis",
    "_axis",
    "prism",
    "add",
    "_add",
    "power",
    "_power",
    "backCurve",
    "_backCurve",
    "diameter",
    "_diameter",
    "duration",
    "color",
    "_color",
    "brand",
    "_brand",
    "note"
})
@Generated("jsonschema2pojo")
public class VisionPrescription_LensSpecification {

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
     * (Required)
     * 
     */
    @JsonProperty("product")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept product;
    /**
     * The eye for which the lens specification applies.
     * 
     */
    @JsonProperty("eye")
    @JsonPropertyDescription("The eye for which the lens specification applies.")
    private VisionPrescription_LensSpecification.Eye eye;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_eye")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _eye;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("sphere")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double sphere;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sphere")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sphere;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("cylinder")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double cylinder;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cylinder")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _cylinder;
    /**
     * A whole number
     * 
     */
    @JsonProperty("axis")
    @JsonPropertyDescription("A whole number")
    private Double axis;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_axis")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _axis;
    /**
     * Allows for adjustment on two axis.
     * 
     */
    @JsonProperty("prism")
    @JsonPropertyDescription("Allows for adjustment on two axis.")
    private List<VisionPrescription_Prism> prism = new ArrayList<VisionPrescription_Prism>();
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("add")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double add;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_add")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _add;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("power")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double power;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_power")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _power;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("backCurve")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double backCurve;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_backCurve")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _backCurve;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("diameter")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double diameter;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_diameter")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _diameter;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity duration;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("color")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String color;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_color")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _color;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("brand")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String brand;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_brand")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _brand;
    /**
     * Notes for special requirements such as coatings and lens materials.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Notes for special requirements such as coatings and lens materials.")
    private List<Annotation> note = new ArrayList<Annotation>();

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
     * (Required)
     * 
     */
    @JsonProperty("product")
    public CodeableConcept getProduct() {
        return product;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("product")
    public void setProduct(CodeableConcept product) {
        this.product = product;
    }

    /**
     * The eye for which the lens specification applies.
     * 
     */
    @JsonProperty("eye")
    public VisionPrescription_LensSpecification.Eye getEye() {
        return eye;
    }

    /**
     * The eye for which the lens specification applies.
     * 
     */
    @JsonProperty("eye")
    public void setEye(VisionPrescription_LensSpecification.Eye eye) {
        this.eye = eye;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_eye")
    public Element get_eye() {
        return _eye;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_eye")
    public void set_eye(Element _eye) {
        this._eye = _eye;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("sphere")
    public Double getSphere() {
        return sphere;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("sphere")
    public void setSphere(Double sphere) {
        this.sphere = sphere;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sphere")
    public Element get_sphere() {
        return _sphere;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sphere")
    public void set_sphere(Element _sphere) {
        this._sphere = _sphere;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("cylinder")
    public Double getCylinder() {
        return cylinder;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("cylinder")
    public void setCylinder(Double cylinder) {
        this.cylinder = cylinder;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cylinder")
    public Element get_cylinder() {
        return _cylinder;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_cylinder")
    public void set_cylinder(Element _cylinder) {
        this._cylinder = _cylinder;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("axis")
    public Double getAxis() {
        return axis;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("axis")
    public void setAxis(Double axis) {
        this.axis = axis;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_axis")
    public Element get_axis() {
        return _axis;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_axis")
    public void set_axis(Element _axis) {
        this._axis = _axis;
    }

    /**
     * Allows for adjustment on two axis.
     * 
     */
    @JsonProperty("prism")
    public List<VisionPrescription_Prism> getPrism() {
        return prism;
    }

    /**
     * Allows for adjustment on two axis.
     * 
     */
    @JsonProperty("prism")
    public void setPrism(List<VisionPrescription_Prism> prism) {
        this.prism = prism;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("add")
    public Double getAdd() {
        return add;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("add")
    public void setAdd(Double add) {
        this.add = add;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_add")
    public Element get_add() {
        return _add;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_add")
    public void set_add(Element _add) {
        this._add = _add;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("power")
    public Double getPower() {
        return power;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("power")
    public void setPower(Double power) {
        this.power = power;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_power")
    public Element get_power() {
        return _power;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_power")
    public void set_power(Element _power) {
        this._power = _power;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("backCurve")
    public Double getBackCurve() {
        return backCurve;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("backCurve")
    public void setBackCurve(Double backCurve) {
        this.backCurve = backCurve;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_backCurve")
    public Element get_backCurve() {
        return _backCurve;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_backCurve")
    public void set_backCurve(Element _backCurve) {
        this._backCurve = _backCurve;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("diameter")
    public Double getDiameter() {
        return diameter;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("diameter")
    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_diameter")
    public Element get_diameter() {
        return _diameter;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_diameter")
    public void set_diameter(Element _diameter) {
        this._diameter = _diameter;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("duration")
    public Quantity getDuration() {
        return duration;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Quantity duration) {
        this.duration = duration;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_color")
    public Element get_color() {
        return _color;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_color")
    public void set_color(Element _color) {
        this._color = _color;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_brand")
    public Element get_brand() {
        return _brand;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_brand")
    public void set_brand(Element _brand) {
        this._brand = _brand;
    }

    /**
     * Notes for special requirements such as coatings and lens materials.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Notes for special requirements such as coatings and lens materials.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VisionPrescription_LensSpecification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("product");
        sb.append('=');
        sb.append(((this.product == null)?"<null>":this.product));
        sb.append(',');
        sb.append("eye");
        sb.append('=');
        sb.append(((this.eye == null)?"<null>":this.eye));
        sb.append(',');
        sb.append("_eye");
        sb.append('=');
        sb.append(((this._eye == null)?"<null>":this._eye));
        sb.append(',');
        sb.append("sphere");
        sb.append('=');
        sb.append(((this.sphere == null)?"<null>":this.sphere));
        sb.append(',');
        sb.append("_sphere");
        sb.append('=');
        sb.append(((this._sphere == null)?"<null>":this._sphere));
        sb.append(',');
        sb.append("cylinder");
        sb.append('=');
        sb.append(((this.cylinder == null)?"<null>":this.cylinder));
        sb.append(',');
        sb.append("_cylinder");
        sb.append('=');
        sb.append(((this._cylinder == null)?"<null>":this._cylinder));
        sb.append(',');
        sb.append("axis");
        sb.append('=');
        sb.append(((this.axis == null)?"<null>":this.axis));
        sb.append(',');
        sb.append("_axis");
        sb.append('=');
        sb.append(((this._axis == null)?"<null>":this._axis));
        sb.append(',');
        sb.append("prism");
        sb.append('=');
        sb.append(((this.prism == null)?"<null>":this.prism));
        sb.append(',');
        sb.append("add");
        sb.append('=');
        sb.append(((this.add == null)?"<null>":this.add));
        sb.append(',');
        sb.append("_add");
        sb.append('=');
        sb.append(((this._add == null)?"<null>":this._add));
        sb.append(',');
        sb.append("power");
        sb.append('=');
        sb.append(((this.power == null)?"<null>":this.power));
        sb.append(',');
        sb.append("_power");
        sb.append('=');
        sb.append(((this._power == null)?"<null>":this._power));
        sb.append(',');
        sb.append("backCurve");
        sb.append('=');
        sb.append(((this.backCurve == null)?"<null>":this.backCurve));
        sb.append(',');
        sb.append("_backCurve");
        sb.append('=');
        sb.append(((this._backCurve == null)?"<null>":this._backCurve));
        sb.append(',');
        sb.append("diameter");
        sb.append('=');
        sb.append(((this.diameter == null)?"<null>":this.diameter));
        sb.append(',');
        sb.append("_diameter");
        sb.append('=');
        sb.append(((this._diameter == null)?"<null>":this._diameter));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("_color");
        sb.append('=');
        sb.append(((this._color == null)?"<null>":this._color));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("_brand");
        sb.append('=');
        sb.append(((this._brand == null)?"<null>":this._brand));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._backCurve == null)? 0 :this._backCurve.hashCode()));
        result = ((result* 31)+((this.backCurve == null)? 0 :this.backCurve.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.axis == null)? 0 :this.axis.hashCode()));
        result = ((result* 31)+((this._add == null)? 0 :this._add.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this._diameter == null)? 0 :this._diameter.hashCode()));
        result = ((result* 31)+((this.diameter == null)? 0 :this.diameter.hashCode()));
        result = ((result* 31)+((this.sphere == null)? 0 :this.sphere.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.power == null)? 0 :this.power.hashCode()));
        result = ((result* 31)+((this.brand == null)? 0 :this.brand.hashCode()));
        result = ((result* 31)+((this._eye == null)? 0 :this._eye.hashCode()));
        result = ((result* 31)+((this.prism == null)? 0 :this.prism.hashCode()));
        result = ((result* 31)+((this.add == null)? 0 :this.add.hashCode()));
        result = ((result* 31)+((this.product == null)? 0 :this.product.hashCode()));
        result = ((result* 31)+((this._sphere == null)? 0 :this._sphere.hashCode()));
        result = ((result* 31)+((this._cylinder == null)? 0 :this._cylinder.hashCode()));
        result = ((result* 31)+((this._color == null)? 0 :this._color.hashCode()));
        result = ((result* 31)+((this._axis == null)? 0 :this._axis.hashCode()));
        result = ((result* 31)+((this.eye == null)? 0 :this.eye.hashCode()));
        result = ((result* 31)+((this.cylinder == null)? 0 :this.cylinder.hashCode()));
        result = ((result* 31)+((this._power == null)? 0 :this._power.hashCode()));
        result = ((result* 31)+((this._brand == null)? 0 :this._brand.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VisionPrescription_LensSpecification) == false) {
            return false;
        }
        VisionPrescription_LensSpecification rhs = ((VisionPrescription_LensSpecification) other);
        return ((((((((((((((((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._backCurve == rhs._backCurve)||((this._backCurve!= null)&&this._backCurve.equals(rhs._backCurve))))&&((this.backCurve == rhs.backCurve)||((this.backCurve!= null)&&this.backCurve.equals(rhs.backCurve))))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.axis == rhs.axis)||((this.axis!= null)&&this.axis.equals(rhs.axis))))&&((this._add == rhs._add)||((this._add!= null)&&this._add.equals(rhs._add))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this._diameter == rhs._diameter)||((this._diameter!= null)&&this._diameter.equals(rhs._diameter))))&&((this.diameter == rhs.diameter)||((this.diameter!= null)&&this.diameter.equals(rhs.diameter))))&&((this.sphere == rhs.sphere)||((this.sphere!= null)&&this.sphere.equals(rhs.sphere))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.power == rhs.power)||((this.power!= null)&&this.power.equals(rhs.power))))&&((this.brand == rhs.brand)||((this.brand!= null)&&this.brand.equals(rhs.brand))))&&((this._eye == rhs._eye)||((this._eye!= null)&&this._eye.equals(rhs._eye))))&&((this.prism == rhs.prism)||((this.prism!= null)&&this.prism.equals(rhs.prism))))&&((this.add == rhs.add)||((this.add!= null)&&this.add.equals(rhs.add))))&&((this.product == rhs.product)||((this.product!= null)&&this.product.equals(rhs.product))))&&((this._sphere == rhs._sphere)||((this._sphere!= null)&&this._sphere.equals(rhs._sphere))))&&((this._cylinder == rhs._cylinder)||((this._cylinder!= null)&&this._cylinder.equals(rhs._cylinder))))&&((this._color == rhs._color)||((this._color!= null)&&this._color.equals(rhs._color))))&&((this._axis == rhs._axis)||((this._axis!= null)&&this._axis.equals(rhs._axis))))&&((this.eye == rhs.eye)||((this.eye!= null)&&this.eye.equals(rhs.eye))))&&((this.cylinder == rhs.cylinder)||((this.cylinder!= null)&&this.cylinder.equals(rhs.cylinder))))&&((this._power == rhs._power)||((this._power!= null)&&this._power.equals(rhs._power))))&&((this._brand == rhs._brand)||((this._brand!= null)&&this._brand.equals(rhs._brand))));
    }


    /**
     * The eye for which the lens specification applies.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Eye {

        RIGHT("right"),
        LEFT("left");
        private final String value;
        private final static Map<String, VisionPrescription_LensSpecification.Eye> CONSTANTS = new HashMap<String, VisionPrescription_LensSpecification.Eye>();

        static {
            for (VisionPrescription_LensSpecification.Eye c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Eye(String value) {
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
        public static VisionPrescription_LensSpecification.Eye fromValue(String value) {
            VisionPrescription_LensSpecification.Eye constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
