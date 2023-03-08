
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
 * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "masterIdentifier",
    "identifier",
    "status",
    "_status",
    "docStatus",
    "_docStatus",
    "type",
    "category",
    "subject",
    "date",
    "_date",
    "author",
    "authenticator",
    "custodian",
    "relatesTo",
    "description",
    "_description",
    "securityLabel",
    "content",
    "context"
})
@Generated("jsonschema2pojo")
public class DocumentReference
    extends DomainResource
{

    /**
     * This is a DocumentReference resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a DocumentReference resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("masterIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier masterIdentifier;
    /**
     * Other identifiers associated with the document, including version independent identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Other identifiers associated with the document, including version independent identifiers.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The status of this document reference.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this document reference.")
    private DocumentReference.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("docStatus")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String docStatus;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_docStatus")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _docStatus;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String date;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _date;
    /**
     * Identifies who is responsible for adding the information to the document.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("Identifies who is responsible for adding the information to the document.")
    private List<Reference> author = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authenticator")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference authenticator;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("custodian")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference custodian;
    /**
     * Relationships that this document has with other document references that already exist.
     * 
     */
    @JsonProperty("relatesTo")
    @JsonPropertyDescription("Relationships that this document has with other document references that already exist.")
    private List<DocumentReference_RelatesTo> relatesTo = new ArrayList<DocumentReference_RelatesTo>();
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
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the &quot;reference&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
     * 
     */
    @JsonProperty("securityLabel")
    @JsonPropertyDescription("A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.")
    private List<CodeableConcept> securityLabel = new ArrayList<CodeableConcept>();
    /**
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     * (Required)
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("The document and format referenced. There may be multiple content element repetitions, each with a different format.")
    private List<DocumentReference_Content> content = new ArrayList<DocumentReference_Content>();
    /**
     * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.")
    private DocumentReference_Context context;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a DocumentReference resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a DocumentReference resource
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
     * Other identifiers associated with the document, including version independent identifiers.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Other identifiers associated with the document, including version independent identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The status of this document reference.
     * 
     */
    @JsonProperty("status")
    public DocumentReference.Status getStatus() {
        return status;
    }

    /**
     * The status of this document reference.
     * 
     */
    @JsonProperty("status")
    public void setStatus(DocumentReference.Status status) {
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("docStatus")
    public String getDocStatus() {
        return docStatus;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("docStatus")
    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_docStatus")
    public Element get_docStatus() {
        return _docStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_docStatus")
    public void set_docStatus(Element _docStatus) {
        this._docStatus = _docStatus;
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
     * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
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
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public Element get_date() {
        return _date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public void set_date(Element _date) {
        this._date = _date;
    }

    /**
     * Identifies who is responsible for adding the information to the document.
     * 
     */
    @JsonProperty("author")
    public List<Reference> getAuthor() {
        return author;
    }

    /**
     * Identifies who is responsible for adding the information to the document.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(List<Reference> author) {
        this.author = author;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authenticator")
    public Reference getAuthenticator() {
        return authenticator;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authenticator")
    public void setAuthenticator(Reference authenticator) {
        this.authenticator = authenticator;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("custodian")
    public Reference getCustodian() {
        return custodian;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("custodian")
    public void setCustodian(Reference custodian) {
        this.custodian = custodian;
    }

    /**
     * Relationships that this document has with other document references that already exist.
     * 
     */
    @JsonProperty("relatesTo")
    public List<DocumentReference_RelatesTo> getRelatesTo() {
        return relatesTo;
    }

    /**
     * Relationships that this document has with other document references that already exist.
     * 
     */
    @JsonProperty("relatesTo")
    public void setRelatesTo(List<DocumentReference_RelatesTo> relatesTo) {
        this.relatesTo = relatesTo;
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
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the &quot;reference&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
     * 
     */
    @JsonProperty("securityLabel")
    public List<CodeableConcept> getSecurityLabel() {
        return securityLabel;
    }

    /**
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the &quot;reference&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
     * 
     */
    @JsonProperty("securityLabel")
    public void setSecurityLabel(List<CodeableConcept> securityLabel) {
        this.securityLabel = securityLabel;
    }

    /**
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     * (Required)
     * 
     */
    @JsonProperty("content")
    public List<DocumentReference_Content> getContent() {
        return content;
    }

    /**
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     * (Required)
     * 
     */
    @JsonProperty("content")
    public void setContent(List<DocumentReference_Content> content) {
        this.content = content;
    }

    /**
     * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
     * 
     */
    @JsonProperty("context")
    public DocumentReference_Context getContext() {
        return context;
    }

    /**
     * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
     * 
     */
    @JsonProperty("context")
    public void setContext(DocumentReference_Context context) {
        this.context = context;
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
        sb.append(DocumentReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("docStatus");
        sb.append('=');
        sb.append(((this.docStatus == null)?"<null>":this.docStatus));
        sb.append(',');
        sb.append("_docStatus");
        sb.append('=');
        sb.append(((this._docStatus == null)?"<null>":this._docStatus));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("authenticator");
        sb.append('=');
        sb.append(((this.authenticator == null)?"<null>":this.authenticator));
        sb.append(',');
        sb.append("custodian");
        sb.append('=');
        sb.append(((this.custodian == null)?"<null>":this.custodian));
        sb.append(',');
        sb.append("relatesTo");
        sb.append('=');
        sb.append(((this.relatesTo == null)?"<null>":this.relatesTo));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("securityLabel");
        sb.append('=');
        sb.append(((this.securityLabel == null)?"<null>":this.securityLabel));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.custodian == null)? 0 :this.custodian.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.securityLabel == null)? 0 :this.securityLabel.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.masterIdentifier == null)? 0 :this.masterIdentifier.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this._docStatus == null)? 0 :this._docStatus.hashCode()));
        result = ((result* 31)+((this.docStatus == null)? 0 :this.docStatus.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.relatesTo == null)? 0 :this.relatesTo.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.authenticator == null)? 0 :this.authenticator.hashCode()));
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
        if ((other instanceof DocumentReference) == false) {
            return false;
        }
        DocumentReference rhs = ((DocumentReference) other);
        return ((((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.custodian == rhs.custodian)||((this.custodian!= null)&&this.custodian.equals(rhs.custodian))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.securityLabel == rhs.securityLabel)||((this.securityLabel!= null)&&this.securityLabel.equals(rhs.securityLabel))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.masterIdentifier == rhs.masterIdentifier)||((this.masterIdentifier!= null)&&this.masterIdentifier.equals(rhs.masterIdentifier))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this._docStatus == rhs._docStatus)||((this._docStatus!= null)&&this._docStatus.equals(rhs._docStatus))))&&((this.docStatus == rhs.docStatus)||((this.docStatus!= null)&&this.docStatus.equals(rhs.docStatus))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.relatesTo == rhs.relatesTo)||((this.relatesTo!= null)&&this.relatesTo.equals(rhs.relatesTo))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.authenticator == rhs.authenticator)||((this.authenticator!= null)&&this.authenticator.equals(rhs.authenticator))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The status of this document reference.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        CURRENT("current"),
        SUPERSEDED("superseded"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, DocumentReference.Status> CONSTANTS = new HashMap<String, DocumentReference.Status>();

        static {
            for (DocumentReference.Status c: values()) {
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
        public static DocumentReference.Status fromValue(String value) {
            DocumentReference.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
