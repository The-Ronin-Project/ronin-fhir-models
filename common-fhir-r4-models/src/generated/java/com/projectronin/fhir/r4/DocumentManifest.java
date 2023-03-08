
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
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "masterIdentifier",
    "identifier",
    "status",
    "_status",
    "type",
    "subject",
    "created",
    "_created",
    "author",
    "recipient",
    "source",
    "_source",
    "description",
    "_description",
    "content",
    "related"
})
@Generated("jsonschema2pojo")
public class DocumentManifest
    extends DomainResource
{

    /**
     * This is a DocumentManifest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a DocumentManifest resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("masterIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier masterIdentifier;
    /**
     * Other identifiers associated with the document manifest, including version independent  identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Other identifiers associated with the document manifest, including version independent  identifiers.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The status of this document manifest.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this document manifest.")
    private DocumentManifest.Status status;
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
    @JsonProperty("created")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String created;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _created;
    /**
     * Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.")
    private List<Reference> author = new ArrayList<Reference>();
    /**
     * A patient, practitioner, or organization for which this set of documents is intended.
     * 
     */
    @JsonProperty("recipient")
    @JsonPropertyDescription("A patient, practitioner, or organization for which this set of documents is intended.")
    private List<Reference> recipient = new ArrayList<Reference>();
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
     * The list of Resources that consist of the parts of this manifest.
     * (Required)
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("The list of Resources that consist of the parts of this manifest.")
    private List<Reference> content = new ArrayList<Reference>();
    /**
     * Related identifiers or resources associated with the DocumentManifest.
     * 
     */
    @JsonProperty("related")
    @JsonPropertyDescription("Related identifiers or resources associated with the DocumentManifest.")
    private List<DocumentManifest_Related> related = new ArrayList<DocumentManifest_Related>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a DocumentManifest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a DocumentManifest resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("masterIdentifier")
    public Identifier getMasterIdentifier() {
        return masterIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("masterIdentifier")
    public void setMasterIdentifier(Identifier masterIdentifier) {
        this.masterIdentifier = masterIdentifier;
    }

    /**
     * Other identifiers associated with the document manifest, including version independent  identifiers.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Other identifiers associated with the document manifest, including version independent  identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The status of this document manifest.
     * 
     */
    @JsonProperty("status")
    public DocumentManifest.Status getStatus() {
        return status;
    }

    /**
     * The status of this document manifest.
     * 
     */
    @JsonProperty("status")
    public void setStatus(DocumentManifest.Status status) {
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
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public Element get_created() {
        return _created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public void set_created(Element _created) {
        this._created = _created;
    }

    /**
     * Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.
     * 
     */
    @JsonProperty("author")
    public List<Reference> getAuthor() {
        return author;
    }

    /**
     * Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(List<Reference> author) {
        this.author = author;
    }

    /**
     * A patient, practitioner, or organization for which this set of documents is intended.
     * 
     */
    @JsonProperty("recipient")
    public List<Reference> getRecipient() {
        return recipient;
    }

    /**
     * A patient, practitioner, or organization for which this set of documents is intended.
     * 
     */
    @JsonProperty("recipient")
    public void setRecipient(List<Reference> recipient) {
        this.recipient = recipient;
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
     * The list of Resources that consist of the parts of this manifest.
     * (Required)
     * 
     */
    @JsonProperty("content")
    public List<Reference> getContent() {
        return content;
    }

    /**
     * The list of Resources that consist of the parts of this manifest.
     * (Required)
     * 
     */
    @JsonProperty("content")
    public void setContent(List<Reference> content) {
        this.content = content;
    }

    /**
     * Related identifiers or resources associated with the DocumentManifest.
     * 
     */
    @JsonProperty("related")
    public List<DocumentManifest_Related> getRelated() {
        return related;
    }

    /**
     * Related identifiers or resources associated with the DocumentManifest.
     * 
     */
    @JsonProperty("related")
    public void setRelated(List<DocumentManifest_Related> related) {
        this.related = related;
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
        sb.append(DocumentManifest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("masterIdentifier");
        sb.append('=');
        sb.append(((this.masterIdentifier == null)?"<null>":this.masterIdentifier));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
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
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("recipient");
        sb.append('=');
        sb.append(((this.recipient == null)?"<null>":this.recipient));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("_source");
        sb.append('=');
        sb.append(((this._source == null)?"<null>":this._source));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("related");
        sb.append('=');
        sb.append(((this.related == null)?"<null>":this.related));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.masterIdentifier == null)? 0 :this.masterIdentifier.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.related == null)? 0 :this.related.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.recipient == null)? 0 :this.recipient.hashCode()));
        result = ((result* 31)+((this._source == null)? 0 :this._source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
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
        if ((other instanceof DocumentManifest) == false) {
            return false;
        }
        DocumentManifest rhs = ((DocumentManifest) other);
        return ((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.masterIdentifier == rhs.masterIdentifier)||((this.masterIdentifier!= null)&&this.masterIdentifier.equals(rhs.masterIdentifier))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.related == rhs.related)||((this.related!= null)&&this.related.equals(rhs.related))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.recipient == rhs.recipient)||((this.recipient!= null)&&this.recipient.equals(rhs.recipient))))&&((this._source == rhs._source)||((this._source!= null)&&this._source.equals(rhs._source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The status of this document manifest.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        CURRENT("current"),
        SUPERSEDED("superseded"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, DocumentManifest.Status> CONSTANTS = new HashMap<String, DocumentManifest.Status>();

        static {
            for (DocumentManifest.Status c: values()) {
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
        public static DocumentManifest.Status fromValue(String value) {
            DocumentManifest.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
