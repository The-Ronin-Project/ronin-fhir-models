
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
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "basedOn",
    "partOf",
    "status",
    "_status",
    "type",
    "modality",
    "view",
    "subject",
    "encounter",
    "createdDateTime",
    "_createdDateTime",
    "createdPeriod",
    "issued",
    "_issued",
    "operator",
    "reasonCode",
    "bodySite",
    "deviceName",
    "_deviceName",
    "device",
    "height",
    "_height",
    "width",
    "_width",
    "frames",
    "_frames",
    "duration",
    "_duration",
    "content",
    "note"
})
@Generated("jsonschema2pojo")
public class Media
    extends DomainResource
{

    /**
     * This is a Media resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Media resource")
    private String resourceType;
    /**
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A procedure that is fulfilled in whole or in part by the creation of this media.
     * 
     */
    @JsonProperty("basedOn")
    @JsonPropertyDescription("A procedure that is fulfilled in whole or in part by the creation of this media.")
    private List<Reference> basedOn = new ArrayList<Reference>();
    /**
     * A larger event of which this particular event is a component or step.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A larger event of which this particular event is a component or step.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("modality")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept modality;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("view")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept view;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * The date and time(s) at which the media was collected.
     * 
     */
    @JsonProperty("createdDateTime")
    @JsonPropertyDescription("The date and time(s) at which the media was collected.")
    private String createdDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_createdDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _createdDateTime;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("createdPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period createdPeriod;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("issued")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String issued;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _issued;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference operator;
    /**
     * Describes why the event occurred in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Describes why the event occurred in coded or textual form.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept bodySite;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("deviceName")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String deviceName;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deviceName")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _deviceName;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference device;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("height")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double height;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_height")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _height;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("width")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double width;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_width")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _width;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frames")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double frames;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frames")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _frames;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double duration;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_duration")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _duration;
    /**
     * For referring to data content defined in other formats.
     * (Required)
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment content;
    /**
     * Comments made about the media by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the media by the performer, subject or other participants.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Media resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Media resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A procedure that is fulfilled in whole or in part by the creation of this media.
     * 
     */
    @JsonProperty("basedOn")
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * A procedure that is fulfilled in whole or in part by the creation of this media.
     * 
     */
    @JsonProperty("basedOn")
    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * A larger event of which this particular event is a component or step.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * A larger event of which this particular event is a component or step.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
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
    @JsonProperty("modality")
    public CodeableConcept getModality() {
        return modality;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("modality")
    public void setModality(CodeableConcept modality) {
        this.modality = modality;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("view")
    public CodeableConcept getView() {
        return view;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("view")
    public void setView(CodeableConcept view) {
        this.view = view;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(Reference encounter) {
        this.encounter = encounter;
    }

    /**
     * The date and time(s) at which the media was collected.
     * 
     */
    @JsonProperty("createdDateTime")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * The date and time(s) at which the media was collected.
     * 
     */
    @JsonProperty("createdDateTime")
    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_createdDateTime")
    public Element get_createdDateTime() {
        return _createdDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_createdDateTime")
    public void set_createdDateTime(Element _createdDateTime) {
        this._createdDateTime = _createdDateTime;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("createdPeriod")
    public Period getCreatedPeriod() {
        return createdPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("createdPeriod")
    public void setCreatedPeriod(Period createdPeriod) {
        this.createdPeriod = createdPeriod;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("issued")
    public String getIssued() {
        return issued;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("issued")
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public Element get_issued() {
        return _issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public void set_issued(Element _issued) {
        this._issued = _issued;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("operator")
    public Reference getOperator() {
        return operator;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("operator")
    public void setOperator(Reference operator) {
        this.operator = operator;
    }

    /**
     * Describes why the event occurred in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Describes why the event occurred in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("bodySite")
    public void setBodySite(CodeableConcept bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("deviceName")
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("deviceName")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deviceName")
    public Element get_deviceName() {
        return _deviceName;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deviceName")
    public void set_deviceName(Element _deviceName) {
        this._deviceName = _deviceName;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    public Reference getDevice() {
        return device;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("device")
    public void setDevice(Reference device) {
        this.device = device;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_height")
    public Element get_height() {
        return _height;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_height")
    public void set_height(Element _height) {
        this._height = _height;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_width")
    public Element get_width() {
        return _width;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_width")
    public void set_width(Element _width) {
        this._width = _width;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frames")
    public Double getFrames() {
        return frames;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frames")
    public void setFrames(Double frames) {
        this.frames = frames;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frames")
    public Element get_frames() {
        return _frames;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frames")
    public void set_frames(Element _frames) {
        this._frames = _frames;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_duration")
    public Element get_duration() {
        return _duration;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_duration")
    public void set_duration(Element _duration) {
        this._duration = _duration;
    }

    /**
     * For referring to data content defined in other formats.
     * (Required)
     * 
     */
    @JsonProperty("content")
    public Attachment getContent() {
        return content;
    }

    /**
     * For referring to data content defined in other formats.
     * (Required)
     * 
     */
    @JsonProperty("content")
    public void setContent(Attachment content) {
        this.content = content;
    }

    /**
     * Comments made about the media by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the media by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
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
        sb.append(Media.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("modality");
        sb.append('=');
        sb.append(((this.modality == null)?"<null>":this.modality));
        sb.append(',');
        sb.append("view");
        sb.append('=');
        sb.append(((this.view == null)?"<null>":this.view));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("createdDateTime");
        sb.append('=');
        sb.append(((this.createdDateTime == null)?"<null>":this.createdDateTime));
        sb.append(',');
        sb.append("_createdDateTime");
        sb.append('=');
        sb.append(((this._createdDateTime == null)?"<null>":this._createdDateTime));
        sb.append(',');
        sb.append("createdPeriod");
        sb.append('=');
        sb.append(((this.createdPeriod == null)?"<null>":this.createdPeriod));
        sb.append(',');
        sb.append("issued");
        sb.append('=');
        sb.append(((this.issued == null)?"<null>":this.issued));
        sb.append(',');
        sb.append("_issued");
        sb.append('=');
        sb.append(((this._issued == null)?"<null>":this._issued));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("bodySite");
        sb.append('=');
        sb.append(((this.bodySite == null)?"<null>":this.bodySite));
        sb.append(',');
        sb.append("deviceName");
        sb.append('=');
        sb.append(((this.deviceName == null)?"<null>":this.deviceName));
        sb.append(',');
        sb.append("_deviceName");
        sb.append('=');
        sb.append(((this._deviceName == null)?"<null>":this._deviceName));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("_height");
        sb.append('=');
        sb.append(((this._height == null)?"<null>":this._height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("_width");
        sb.append('=');
        sb.append(((this._width == null)?"<null>":this._width));
        sb.append(',');
        sb.append("frames");
        sb.append('=');
        sb.append(((this.frames == null)?"<null>":this.frames));
        sb.append(',');
        sb.append("_frames");
        sb.append('=');
        sb.append(((this._frames == null)?"<null>":this._frames));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("_duration");
        sb.append('=');
        sb.append(((this._duration == null)?"<null>":this._duration));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.modality == null)? 0 :this.modality.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.createdDateTime == null)? 0 :this.createdDateTime.hashCode()));
        result = ((result* 31)+((this._deviceName == null)? 0 :this._deviceName.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.deviceName == null)? 0 :this.deviceName.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.view == null)? 0 :this.view.hashCode()));
        result = ((result* 31)+((this._duration == null)? 0 :this._duration.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.issued == null)? 0 :this.issued.hashCode()));
        result = ((result* 31)+((this._width == null)? 0 :this._width.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.frames == null)? 0 :this.frames.hashCode()));
        result = ((result* 31)+((this._createdDateTime == null)? 0 :this._createdDateTime.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._issued == null)? 0 :this._issued.hashCode()));
        result = ((result* 31)+((this._height == null)? 0 :this._height.hashCode()));
        result = ((result* 31)+((this.createdPeriod == null)? 0 :this.createdPeriod.hashCode()));
        result = ((result* 31)+((this.bodySite == null)? 0 :this.bodySite.hashCode()));
        result = ((result* 31)+((this._frames == null)? 0 :this._frames.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Media) == false) {
            return false;
        }
        Media rhs = ((Media) other);
        return (((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.modality == rhs.modality)||((this.modality!= null)&&this.modality.equals(rhs.modality))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.createdDateTime == rhs.createdDateTime)||((this.createdDateTime!= null)&&this.createdDateTime.equals(rhs.createdDateTime))))&&((this._deviceName == rhs._deviceName)||((this._deviceName!= null)&&this._deviceName.equals(rhs._deviceName))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.deviceName == rhs.deviceName)||((this.deviceName!= null)&&this.deviceName.equals(rhs.deviceName))))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.view == rhs.view)||((this.view!= null)&&this.view.equals(rhs.view))))&&((this._duration == rhs._duration)||((this._duration!= null)&&this._duration.equals(rhs._duration))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.issued == rhs.issued)||((this.issued!= null)&&this.issued.equals(rhs.issued))))&&((this._width == rhs._width)||((this._width!= null)&&this._width.equals(rhs._width))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.frames == rhs.frames)||((this.frames!= null)&&this.frames.equals(rhs.frames))))&&((this._createdDateTime == rhs._createdDateTime)||((this._createdDateTime!= null)&&this._createdDateTime.equals(rhs._createdDateTime))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._issued == rhs._issued)||((this._issued!= null)&&this._issued.equals(rhs._issued))))&&((this._height == rhs._height)||((this._height!= null)&&this._height.equals(rhs._height))))&&((this.createdPeriod == rhs.createdPeriod)||((this.createdPeriod!= null)&&this.createdPeriod.equals(rhs.createdPeriod))))&&((this.bodySite == rhs.bodySite)||((this.bodySite!= null)&&this.bodySite.equals(rhs.bodySite))))&&((this._frames == rhs._frames)||((this._frames!= null)&&this._frames.equals(rhs._frames))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
