
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
 * A sample to be used for analysis.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "accessionIdentifier",
    "status",
    "_status",
    "type",
    "subject",
    "receivedTime",
    "_receivedTime",
    "parent",
    "request",
    "collection",
    "processing",
    "container",
    "condition",
    "note"
})
@Generated("jsonschema2pojo")
public class Specimen
    extends DomainResource
{

    /**
     * This is a Specimen resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Specimen resource")
    private String resourceType;
    /**
     * Id for specimen.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Id for specimen.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("accessionIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier accessionIdentifier;
    /**
     * The availability of the specimen.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The availability of the specimen.")
    private Specimen.Status status;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("receivedTime")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String receivedTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receivedTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _receivedTime;
    /**
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.")
    private List<Reference> parent = new ArrayList<Reference>();
    /**
     * Details concerning a service request that required a specimen to be collected.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("Details concerning a service request that required a specimen to be collected.")
    private List<Reference> request = new ArrayList<Reference>();
    /**
     * A sample to be used for analysis.
     * 
     */
    @JsonProperty("collection")
    @JsonPropertyDescription("A sample to be used for analysis.")
    private Specimen_Collection collection;
    /**
     * Details concerning processing and processing steps for the specimen.
     * 
     */
    @JsonProperty("processing")
    @JsonPropertyDescription("Details concerning processing and processing steps for the specimen.")
    private List<Specimen_Processing> processing = new ArrayList<Specimen_Processing>();
    /**
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * 
     */
    @JsonProperty("container")
    @JsonPropertyDescription("The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.")
    private List<Specimen_Container> container = new ArrayList<Specimen_Container>();
    /**
     * A mode or state of being that describes the nature of the specimen.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("A mode or state of being that describes the nature of the specimen.")
    private List<CodeableConcept> condition = new ArrayList<CodeableConcept>();
    /**
     * To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Specimen resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Specimen resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Id for specimen.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Id for specimen.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("accessionIdentifier")
    public Identifier getAccessionIdentifier() {
        return accessionIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("accessionIdentifier")
    public void setAccessionIdentifier(Identifier accessionIdentifier) {
        this.accessionIdentifier = accessionIdentifier;
    }

    /**
     * The availability of the specimen.
     * 
     */
    @JsonProperty("status")
    public Specimen.Status getStatus() {
        return status;
    }

    /**
     * The availability of the specimen.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Specimen.Status status) {
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("receivedTime")
    public String getReceivedTime() {
        return receivedTime;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("receivedTime")
    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receivedTime")
    public Element get_receivedTime() {
        return _receivedTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receivedTime")
    public void set_receivedTime(Element _receivedTime) {
        this._receivedTime = _receivedTime;
    }

    /**
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     * 
     */
    @JsonProperty("parent")
    public List<Reference> getParent() {
        return parent;
    }

    /**
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     * 
     */
    @JsonProperty("parent")
    public void setParent(List<Reference> parent) {
        this.parent = parent;
    }

    /**
     * Details concerning a service request that required a specimen to be collected.
     * 
     */
    @JsonProperty("request")
    public List<Reference> getRequest() {
        return request;
    }

    /**
     * Details concerning a service request that required a specimen to be collected.
     * 
     */
    @JsonProperty("request")
    public void setRequest(List<Reference> request) {
        this.request = request;
    }

    /**
     * A sample to be used for analysis.
     * 
     */
    @JsonProperty("collection")
    public Specimen_Collection getCollection() {
        return collection;
    }

    /**
     * A sample to be used for analysis.
     * 
     */
    @JsonProperty("collection")
    public void setCollection(Specimen_Collection collection) {
        this.collection = collection;
    }

    /**
     * Details concerning processing and processing steps for the specimen.
     * 
     */
    @JsonProperty("processing")
    public List<Specimen_Processing> getProcessing() {
        return processing;
    }

    /**
     * Details concerning processing and processing steps for the specimen.
     * 
     */
    @JsonProperty("processing")
    public void setProcessing(List<Specimen_Processing> processing) {
        this.processing = processing;
    }

    /**
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * 
     */
    @JsonProperty("container")
    public List<Specimen_Container> getContainer() {
        return container;
    }

    /**
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * 
     */
    @JsonProperty("container")
    public void setContainer(List<Specimen_Container> container) {
        this.container = container;
    }

    /**
     * A mode or state of being that describes the nature of the specimen.
     * 
     */
    @JsonProperty("condition")
    public List<CodeableConcept> getCondition() {
        return condition;
    }

    /**
     * A mode or state of being that describes the nature of the specimen.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(List<CodeableConcept> condition) {
        this.condition = condition;
    }

    /**
     * To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
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
        sb.append(Specimen.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("accessionIdentifier");
        sb.append('=');
        sb.append(((this.accessionIdentifier == null)?"<null>":this.accessionIdentifier));
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
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("receivedTime");
        sb.append('=');
        sb.append(((this.receivedTime == null)?"<null>":this.receivedTime));
        sb.append(',');
        sb.append("_receivedTime");
        sb.append('=');
        sb.append(((this._receivedTime == null)?"<null>":this._receivedTime));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("collection");
        sb.append('=');
        sb.append(((this.collection == null)?"<null>":this.collection));
        sb.append(',');
        sb.append("processing");
        sb.append('=');
        sb.append(((this.processing == null)?"<null>":this.processing));
        sb.append(',');
        sb.append("container");
        sb.append('=');
        sb.append(((this.container == null)?"<null>":this.container));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
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
        result = ((result* 31)+((this.container == null)? 0 :this.container.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.accessionIdentifier == null)? 0 :this.accessionIdentifier.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.collection == null)? 0 :this.collection.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this._receivedTime == null)? 0 :this._receivedTime.hashCode()));
        result = ((result* 31)+((this.receivedTime == null)? 0 :this.receivedTime.hashCode()));
        result = ((result* 31)+((this.processing == null)? 0 :this.processing.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof Specimen) == false) {
            return false;
        }
        Specimen rhs = ((Specimen) other);
        return (((((((((((((((((super.equals(rhs)&&((this.container == rhs.container)||((this.container!= null)&&this.container.equals(rhs.container))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.accessionIdentifier == rhs.accessionIdentifier)||((this.accessionIdentifier!= null)&&this.accessionIdentifier.equals(rhs.accessionIdentifier))))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.collection == rhs.collection)||((this.collection!= null)&&this.collection.equals(rhs.collection))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this._receivedTime == rhs._receivedTime)||((this._receivedTime!= null)&&this._receivedTime.equals(rhs._receivedTime))))&&((this.receivedTime == rhs.receivedTime)||((this.receivedTime!= null)&&this.receivedTime.equals(rhs.receivedTime))))&&((this.processing == rhs.processing)||((this.processing!= null)&&this.processing.equals(rhs.processing))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The availability of the specimen.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        AVAILABLE("available"),
        UNAVAILABLE("unavailable"),
        UNSATISFACTORY("unsatisfactory"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, Specimen.Status> CONSTANTS = new HashMap<String, Specimen.Status>();

        static {
            for (Specimen.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static Specimen.Status fromValue(String value) {
            Specimen.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
