
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
 * Describes a measurement, calculation or setting capability of a medical device.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "type",
    "unit",
    "source",
    "parent",
    "operationalStatus",
    "_operationalStatus",
    "color",
    "_color",
    "category",
    "_category",
    "measurementPeriod",
    "calibration"
})
@Generated("jsonschema2pojo")
public class DeviceMetric
    extends DomainResource
{

    /**
     * This is a DeviceMetric resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a DeviceMetric resource")
    private String resourceType;
    /**
     * Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("unit")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept unit;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference source;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference parent;
    /**
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * 
     */
    @JsonProperty("operationalStatus")
    @JsonPropertyDescription("Indicates current operational state of the device. For example: On, Off, Standby, etc.")
    private DeviceMetric.OperationalStatus operationalStatus;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operationalStatus")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _operationalStatus;
    /**
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * 
     */
    @JsonProperty("color")
    @JsonPropertyDescription("Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.")
    private DeviceMetric.Color color;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_color")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _color;
    /**
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.")
    private DeviceMetric.Category category;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_category")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _category;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("measurementPeriod")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing measurementPeriod;
    /**
     * Describes the calibrations that have been performed or that are required to be performed.
     * 
     */
    @JsonProperty("calibration")
    @JsonPropertyDescription("Describes the calibrations that have been performed or that are required to be performed.")
    private List<DeviceMetric_Calibration> calibration = new ArrayList<DeviceMetric_Calibration>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a DeviceMetric resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a DeviceMetric resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public Reference getSource() {
        return source;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("source")
    public void setSource(Reference source) {
        this.source = source;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    public Reference getParent() {
        return parent;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("parent")
    public void setParent(Reference parent) {
        this.parent = parent;
    }

    /**
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * 
     */
    @JsonProperty("operationalStatus")
    public DeviceMetric.OperationalStatus getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * 
     */
    @JsonProperty("operationalStatus")
    public void setOperationalStatus(DeviceMetric.OperationalStatus operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operationalStatus")
    public Element get_operationalStatus() {
        return _operationalStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_operationalStatus")
    public void set_operationalStatus(Element _operationalStatus) {
        this._operationalStatus = _operationalStatus;
    }

    /**
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * 
     */
    @JsonProperty("color")
    public DeviceMetric.Color getColor() {
        return color;
    }

    /**
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * 
     */
    @JsonProperty("color")
    public void setColor(DeviceMetric.Color color) {
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
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * 
     */
    @JsonProperty("category")
    public DeviceMetric.Category getCategory() {
        return category;
    }

    /**
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * 
     */
    @JsonProperty("category")
    public void setCategory(DeviceMetric.Category category) {
        this.category = category;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_category")
    public Element get_category() {
        return _category;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_category")
    public void set_category(Element _category) {
        this._category = _category;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("measurementPeriod")
    public Timing getMeasurementPeriod() {
        return measurementPeriod;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("measurementPeriod")
    public void setMeasurementPeriod(Timing measurementPeriod) {
        this.measurementPeriod = measurementPeriod;
    }

    /**
     * Describes the calibrations that have been performed or that are required to be performed.
     * 
     */
    @JsonProperty("calibration")
    public List<DeviceMetric_Calibration> getCalibration() {
        return calibration;
    }

    /**
     * Describes the calibrations that have been performed or that are required to be performed.
     * 
     */
    @JsonProperty("calibration")
    public void setCalibration(List<DeviceMetric_Calibration> calibration) {
        this.calibration = calibration;
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
        sb.append(DeviceMetric.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("operationalStatus");
        sb.append('=');
        sb.append(((this.operationalStatus == null)?"<null>":this.operationalStatus));
        sb.append(',');
        sb.append("_operationalStatus");
        sb.append('=');
        sb.append(((this._operationalStatus == null)?"<null>":this._operationalStatus));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("_color");
        sb.append('=');
        sb.append(((this._color == null)?"<null>":this._color));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("_category");
        sb.append('=');
        sb.append(((this._category == null)?"<null>":this._category));
        sb.append(',');
        sb.append("measurementPeriod");
        sb.append('=');
        sb.append(((this.measurementPeriod == null)?"<null>":this.measurementPeriod));
        sb.append(',');
        sb.append("calibration");
        sb.append('=');
        sb.append(((this.calibration == null)?"<null>":this.calibration));
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
        result = ((result* 31)+((this.operationalStatus == null)? 0 :this.operationalStatus.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this._operationalStatus == null)? 0 :this._operationalStatus.hashCode()));
        result = ((result* 31)+((this.measurementPeriod == null)? 0 :this.measurementPeriod.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this._color == null)? 0 :this._color.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this._category == null)? 0 :this._category.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.calibration == null)? 0 :this.calibration.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceMetric) == false) {
            return false;
        }
        DeviceMetric rhs = ((DeviceMetric) other);
        return (((((((((((((((super.equals(rhs)&&((this.operationalStatus == rhs.operationalStatus)||((this.operationalStatus!= null)&&this.operationalStatus.equals(rhs.operationalStatus))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this._operationalStatus == rhs._operationalStatus)||((this._operationalStatus!= null)&&this._operationalStatus.equals(rhs._operationalStatus))))&&((this.measurementPeriod == rhs.measurementPeriod)||((this.measurementPeriod!= null)&&this.measurementPeriod.equals(rhs.measurementPeriod))))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this._color == rhs._color)||((this._color!= null)&&this._color.equals(rhs._color))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this._category == rhs._category)||((this._category!= null)&&this._category.equals(rhs._category))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.calibration == rhs.calibration)||((this.calibration!= null)&&this.calibration.equals(rhs.calibration))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Category {

        MEASUREMENT("measurement"),
        SETTING("setting"),
        CALCULATION("calculation"),
        UNSPECIFIED("unspecified");
        private final String value;
        private final static Map<String, DeviceMetric.Category> CONSTANTS = new HashMap<String, DeviceMetric.Category>();

        static {
            for (DeviceMetric.Category c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Category(String value) {
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
        public static DeviceMetric.Category fromValue(String value) {
            DeviceMetric.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Color {

        BLACK("black"),
        RED("red"),
        GREEN("green"),
        YELLOW("yellow"),
        BLUE("blue"),
        MAGENTA("magenta"),
        CYAN("cyan"),
        WHITE("white");
        private final String value;
        private final static Map<String, DeviceMetric.Color> CONSTANTS = new HashMap<String, DeviceMetric.Color>();

        static {
            for (DeviceMetric.Color c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Color(String value) {
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
        public static DeviceMetric.Color fromValue(String value) {
            DeviceMetric.Color constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OperationalStatus {

        ON("on"),
        OFF("off"),
        STANDBY("standby"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, DeviceMetric.OperationalStatus> CONSTANTS = new HashMap<String, DeviceMetric.OperationalStatus>();

        static {
            for (DeviceMetric.OperationalStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OperationalStatus(String value) {
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
        public static DeviceMetric.OperationalStatus fromValue(String value) {
            DeviceMetric.OperationalStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
