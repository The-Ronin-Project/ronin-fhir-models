
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "uid",
    "_uid",
    "number",
    "_number",
    "modality",
    "description",
    "_description",
    "numberOfInstances",
    "_numberOfInstances",
    "endpoint",
    "bodySite",
    "laterality",
    "specimen",
    "started",
    "_started",
    "performer",
    "instance"
})
@Generated("jsonschema2pojo")
public class ImagingStudy_Series {

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String uid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_uid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _uid;
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double number;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_number")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _number;
    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("modality")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding modality;
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
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfInstances")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double numberOfInstances;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfInstances")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _numberOfInstances;
    /**
     * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.connectionType.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.connectionType.")
    private List<Reference> endpoint = new ArrayList<Reference>();
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding bodySite;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("laterality")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding laterality;
    /**
     * The specimen imaged, e.g., for whole slide imaging of a biopsy.
     * 
     */
    @JsonProperty("specimen")
    @JsonPropertyDescription("The specimen imaged, e.g., for whole slide imaging of a biopsy.")
    private List<Reference> specimen = new ArrayList<Reference>();
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("started")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String started;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_started")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _started;
    /**
     * Indicates who or what performed the series and how they were involved.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("Indicates who or what performed the series and how they were involved.")
    private List<ImagingStudy_Performer> performer = new ArrayList<ImagingStudy_Performer>();
    /**
     * A single SOP instance within the series, e.g. an image, or presentation state.
     * 
     */
    @JsonProperty("instance")
    @JsonPropertyDescription("A single SOP instance within the series, e.g. an image, or presentation state.")
    private List<ImagingStudy_Instance> instance = new ArrayList<ImagingStudy_Instance>();

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_uid")
    public Element get_uid() {
        return _uid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_uid")
    public void set_uid(Element _uid) {
        this._uid = _uid;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("number")
    public Double getNumber() {
        return number;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("number")
    public void setNumber(Double number) {
        this.number = number;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_number")
    public Element get_number() {
        return _number;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_number")
    public void set_number(Element _number) {
        this._number = _number;
    }

    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("modality")
    public Coding getModality() {
        return modality;
    }

    /**
     * A reference to a code defined by a terminology system.
     * (Required)
     * 
     */
    @JsonProperty("modality")
    public void setModality(Coding modality) {
        this.modality = modality;
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
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfInstances")
    public Double getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("numberOfInstances")
    public void setNumberOfInstances(Double numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfInstances")
    public Element get_numberOfInstances() {
        return _numberOfInstances;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_numberOfInstances")
    public void set_numberOfInstances(Element _numberOfInstances) {
        this._numberOfInstances = _numberOfInstances;
    }

    /**
     * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.connectionType.
     * 
     */
    @JsonProperty("endpoint")
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.connectionType.
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(List<Reference> endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("bodySite")
    public Coding getBodySite() {
        return bodySite;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(Coding bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("laterality")
    public Coding getLaterality() {
        return laterality;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("laterality")
    public void setLaterality(Coding laterality) {
        this.laterality = laterality;
    }

    /**
     * The specimen imaged, e.g., for whole slide imaging of a biopsy.
     * 
     */
    @JsonProperty("specimen")
    public List<Reference> getSpecimen() {
        return specimen;
    }

    /**
     * The specimen imaged, e.g., for whole slide imaging of a biopsy.
     * 
     */
    @JsonProperty("specimen")
    public void setSpecimen(List<Reference> specimen) {
        this.specimen = specimen;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("started")
    public String getStarted() {
        return started;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("started")
    public void setStarted(String started) {
        this.started = started;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_started")
    public Element get_started() {
        return _started;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_started")
    public void set_started(Element _started) {
        this._started = _started;
    }

    /**
     * Indicates who or what performed the series and how they were involved.
     * 
     */
    @JsonProperty("performer")
    public List<ImagingStudy_Performer> getPerformer() {
        return performer;
    }

    /**
     * Indicates who or what performed the series and how they were involved.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(List<ImagingStudy_Performer> performer) {
        this.performer = performer;
    }

    /**
     * A single SOP instance within the series, e.g. an image, or presentation state.
     * 
     */
    @JsonProperty("instance")
    public List<ImagingStudy_Instance> getInstance() {
        return instance;
    }

    /**
     * A single SOP instance within the series, e.g. an image, or presentation state.
     * 
     */
    @JsonProperty("instance")
    public void setInstance(List<ImagingStudy_Instance> instance) {
        this.instance = instance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImagingStudy_Series.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("_uid");
        sb.append('=');
        sb.append(((this._uid == null)?"<null>":this._uid));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("_number");
        sb.append('=');
        sb.append(((this._number == null)?"<null>":this._number));
        sb.append(',');
        sb.append("modality");
        sb.append('=');
        sb.append(((this.modality == null)?"<null>":this.modality));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("numberOfInstances");
        sb.append('=');
        sb.append(((this.numberOfInstances == null)?"<null>":this.numberOfInstances));
        sb.append(',');
        sb.append("_numberOfInstances");
        sb.append('=');
        sb.append(((this._numberOfInstances == null)?"<null>":this._numberOfInstances));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("laterality");
        sb.append('=');
        sb.append(((this.laterality == null)?"<null>":this.laterality));
        sb.append(',');
        sb.append("specimen");
        sb.append('=');
        sb.append(((this.specimen == null)?"<null>":this.specimen));
        sb.append(',');
        sb.append("started");
        sb.append('=');
        sb.append(((this.started == null)?"<null>":this.started));
        sb.append(',');
        sb.append("_started");
        sb.append('=');
        sb.append(((this._started == null)?"<null>":this._started));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("instance");
        sb.append('=');
        sb.append(((this.instance == null)?"<null>":this.instance));
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
        result = ((result* 31)+((this._number == null)? 0 :this._number.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.modality == null)? 0 :this.modality.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.instance == null)? 0 :this.instance.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.started == null)? 0 :this.started.hashCode()));
        result = ((result* 31)+((this.laterality == null)? 0 :this.laterality.hashCode()));
        result = ((result* 31)+((this._numberOfInstances == null)? 0 :this._numberOfInstances.hashCode()));
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.numberOfInstances == null)? 0 :this.numberOfInstances.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this.specimen == null)? 0 :this.specimen.hashCode()));
        result = ((result* 31)+((this._started == null)? 0 :this._started.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this._uid == null)? 0 :this._uid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagingStudy_Series) == false) {
            return false;
        }
        ImagingStudy_Series rhs = ((ImagingStudy_Series) other);
        return (((((((((((((((((((((this._number == rhs._number)||((this._number!= null)&&this._number.equals(rhs._number)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.modality == rhs.modality)||((this.modality!= null)&&this.modality.equals(rhs.modality))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.instance == rhs.instance)||((this.instance!= null)&&this.instance.equals(rhs.instance))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.started == rhs.started)||((this.started!= null)&&this.started.equals(rhs.started))))&&((this.laterality == rhs.laterality)||((this.laterality!= null)&&this.laterality.equals(rhs.laterality))))&&((this._numberOfInstances == rhs._numberOfInstances)||((this._numberOfInstances!= null)&&this._numberOfInstances.equals(rhs._numberOfInstances))))&&((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.numberOfInstances == rhs.numberOfInstances)||((this.numberOfInstances!= null)&&this.numberOfInstances.equals(rhs.numberOfInstances))))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this.specimen == rhs.specimen)||((this.specimen!= null)&&this.specimen.equals(rhs.specimen))))&&((this._started == rhs._started)||((this._started!= null)&&this._started.equals(rhs._started))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this._uid == rhs._uid)||((this._uid!= null)&&this._uid.equals(rhs._uid))));
    }

}
