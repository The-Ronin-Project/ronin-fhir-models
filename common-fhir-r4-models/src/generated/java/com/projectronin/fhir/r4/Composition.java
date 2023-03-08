
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
 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "type",
    "category",
    "subject",
    "encounter",
    "date",
    "_date",
    "author",
    "title",
    "_title",
    "confidentiality",
    "_confidentiality",
    "attester",
    "custodian",
    "relatesTo",
    "event",
    "section"
})
@Generated("jsonschema2pojo")
public class Composition
    extends DomainResource
{

    /**
     * This is a Composition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Composition resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.")
    private Composition.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String date;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _date;
    /**
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     * (Required)
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("Identifies who is responsible for the information in the composition, not necessarily who typed it in.")
    private List<Reference> author = new ArrayList<Reference>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String title;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _title;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("confidentiality")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String confidentiality;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_confidentiality")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _confidentiality;
    /**
     * A participant who has attested to the accuracy of the composition/document.
     * 
     */
    @JsonProperty("attester")
    @JsonPropertyDescription("A participant who has attested to the accuracy of the composition/document.")
    private List<Composition_Attester> attester = new ArrayList<Composition_Attester>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("custodian")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference custodian;
    /**
     * Relationships that this composition has with other compositions or documents that already exist.
     * 
     */
    @JsonProperty("relatesTo")
    @JsonPropertyDescription("Relationships that this composition has with other compositions or documents that already exist.")
    private List<Composition_RelatesTo> relatesTo = new ArrayList<Composition_RelatesTo>();
    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being documented.
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("The clinical service, such as a colonoscopy or an appendectomy, being documented.")
    private List<Composition_Event> event = new ArrayList<Composition_Event>();
    /**
     * The root of the sections that make up the composition.
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("The root of the sections that make up the composition.")
    private List<Composition_Section> section = new ArrayList<Composition_Section>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Composition resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Composition resource
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
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     * 
     */
    @JsonProperty("status")
    public Composition.Status getStatus() {
        return status;
    }

    /**
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Composition.Status status) {
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
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
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
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     * (Required)
     * 
     */
    @JsonProperty("author")
    public List<Reference> getAuthor() {
        return author;
    }

    /**
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     * (Required)
     * 
     */
    @JsonProperty("author")
    public void setAuthor(List<Reference> author) {
        this.author = author;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public Element get_title() {
        return _title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public void set_title(Element _title) {
        this._title = _title;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("confidentiality")
    public String getConfidentiality() {
        return confidentiality;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("confidentiality")
    public void setConfidentiality(String confidentiality) {
        this.confidentiality = confidentiality;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_confidentiality")
    public Element get_confidentiality() {
        return _confidentiality;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_confidentiality")
    public void set_confidentiality(Element _confidentiality) {
        this._confidentiality = _confidentiality;
    }

    /**
     * A participant who has attested to the accuracy of the composition/document.
     * 
     */
    @JsonProperty("attester")
    public List<Composition_Attester> getAttester() {
        return attester;
    }

    /**
     * A participant who has attested to the accuracy of the composition/document.
     * 
     */
    @JsonProperty("attester")
    public void setAttester(List<Composition_Attester> attester) {
        this.attester = attester;
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
     * Relationships that this composition has with other compositions or documents that already exist.
     * 
     */
    @JsonProperty("relatesTo")
    public List<Composition_RelatesTo> getRelatesTo() {
        return relatesTo;
    }

    /**
     * Relationships that this composition has with other compositions or documents that already exist.
     * 
     */
    @JsonProperty("relatesTo")
    public void setRelatesTo(List<Composition_RelatesTo> relatesTo) {
        this.relatesTo = relatesTo;
    }

    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being documented.
     * 
     */
    @JsonProperty("event")
    public List<Composition_Event> getEvent() {
        return event;
    }

    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being documented.
     * 
     */
    @JsonProperty("event")
    public void setEvent(List<Composition_Event> event) {
        this.event = event;
    }

    /**
     * The root of the sections that make up the composition.
     * 
     */
    @JsonProperty("section")
    public List<Composition_Section> getSection() {
        return section;
    }

    /**
     * The root of the sections that make up the composition.
     * 
     */
    @JsonProperty("section")
    public void setSection(List<Composition_Section> section) {
        this.section = section;
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
        sb.append(Composition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
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
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("_title");
        sb.append('=');
        sb.append(((this._title == null)?"<null>":this._title));
        sb.append(',');
        sb.append("confidentiality");
        sb.append('=');
        sb.append(((this.confidentiality == null)?"<null>":this.confidentiality));
        sb.append(',');
        sb.append("_confidentiality");
        sb.append('=');
        sb.append(((this._confidentiality == null)?"<null>":this._confidentiality));
        sb.append(',');
        sb.append("attester");
        sb.append('=');
        sb.append(((this.attester == null)?"<null>":this.attester));
        sb.append(',');
        sb.append("custodian");
        sb.append('=');
        sb.append(((this.custodian == null)?"<null>":this.custodian));
        sb.append(',');
        sb.append("relatesTo");
        sb.append('=');
        sb.append(((this.relatesTo == null)?"<null>":this.relatesTo));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
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
        result = ((result* 31)+((this._confidentiality == null)? 0 :this._confidentiality.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.confidentiality == null)? 0 :this.confidentiality.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.attester == null)? 0 :this.attester.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.relatesTo == null)? 0 :this.relatesTo.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
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
        if ((other instanceof Composition) == false) {
            return false;
        }
        Composition rhs = ((Composition) other);
        return (((((((((((((((((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.custodian == rhs.custodian)||((this.custodian!= null)&&this.custodian.equals(rhs.custodian))))&&((this._confidentiality == rhs._confidentiality)||((this._confidentiality!= null)&&this._confidentiality.equals(rhs._confidentiality))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.confidentiality == rhs.confidentiality)||((this.confidentiality!= null)&&this.confidentiality.equals(rhs.confidentiality))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.attester == rhs.attester)||((this.attester!= null)&&this.attester.equals(rhs.attester))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.relatesTo == rhs.relatesTo)||((this.relatesTo!= null)&&this.relatesTo.equals(rhs.relatesTo))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PRELIMINARY("preliminary"),
        FINAL("final"),
        AMENDED("amended"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, Composition.Status> CONSTANTS = new HashMap<String, Composition.Status>();

        static {
            for (Composition.Status c: values()) {
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
        public static Composition.Status fromValue(String value) {
            Composition.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
