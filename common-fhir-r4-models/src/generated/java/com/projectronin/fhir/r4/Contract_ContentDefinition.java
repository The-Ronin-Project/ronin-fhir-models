
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "type",
    "subType",
    "publisher",
    "publicationDate",
    "_publicationDate",
    "publicationStatus",
    "_publicationStatus",
    "copyright",
    "_copyright"
})
@Generated("jsonschema2pojo")
public class Contract_ContentDefinition {

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
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept subType;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("publisher")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference publisher;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("publicationDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String publicationDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publicationDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _publicationDate;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("publicationStatus")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String publicationStatus;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publicationStatus")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _publicationStatus;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("copyright")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String copyright;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_copyright")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _copyright;

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
    @JsonProperty("subType")
    public CodeableConcept getSubType() {
        return subType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subType")
    public void setSubType(CodeableConcept subType) {
        this.subType = subType;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("publisher")
    public Reference getPublisher() {
        return publisher;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("publisher")
    public void setPublisher(Reference publisher) {
        this.publisher = publisher;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("publicationDate")
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("publicationDate")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publicationDate")
    public Element get_publicationDate() {
        return _publicationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publicationDate")
    public void set_publicationDate(Element _publicationDate) {
        this._publicationDate = _publicationDate;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("publicationStatus")
    public String getPublicationStatus() {
        return publicationStatus;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("publicationStatus")
    public void setPublicationStatus(String publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publicationStatus")
    public Element get_publicationStatus() {
        return _publicationStatus;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_publicationStatus")
    public void set_publicationStatus(Element _publicationStatus) {
        this._publicationStatus = _publicationStatus;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_copyright")
    public Element get_copyright() {
        return _copyright;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_copyright")
    public void set_copyright(Element _copyright) {
        this._copyright = _copyright;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contract_ContentDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("subType");
        sb.append('=');
        sb.append(((this.subType == null)?"<null>":this.subType));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("publicationDate");
        sb.append('=');
        sb.append(((this.publicationDate == null)?"<null>":this.publicationDate));
        sb.append(',');
        sb.append("_publicationDate");
        sb.append('=');
        sb.append(((this._publicationDate == null)?"<null>":this._publicationDate));
        sb.append(',');
        sb.append("publicationStatus");
        sb.append('=');
        sb.append(((this.publicationStatus == null)?"<null>":this.publicationStatus));
        sb.append(',');
        sb.append("_publicationStatus");
        sb.append('=');
        sb.append(((this._publicationStatus == null)?"<null>":this._publicationStatus));
        sb.append(',');
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null)?"<null>":this.copyright));
        sb.append(',');
        sb.append("_copyright");
        sb.append('=');
        sb.append(((this._copyright == null)?"<null>":this._copyright));
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
        result = ((result* 31)+((this.publicationStatus == null)? 0 :this.publicationStatus.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.copyright == null)? 0 :this.copyright.hashCode()));
        result = ((result* 31)+((this._publicationDate == null)? 0 :this._publicationDate.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.publicationDate == null)? 0 :this.publicationDate.hashCode()));
        result = ((result* 31)+((this._publicationStatus == null)? 0 :this._publicationStatus.hashCode()));
        result = ((result* 31)+((this._copyright == null)? 0 :this._copyright.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract_ContentDefinition) == false) {
            return false;
        }
        Contract_ContentDefinition rhs = ((Contract_ContentDefinition) other);
        return (((((((((((((this.publicationStatus == rhs.publicationStatus)||((this.publicationStatus!= null)&&this.publicationStatus.equals(rhs.publicationStatus)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this._publicationDate == rhs._publicationDate)||((this._publicationDate!= null)&&this._publicationDate.equals(rhs._publicationDate))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.publicationDate == rhs.publicationDate)||((this.publicationDate!= null)&&this.publicationDate.equals(rhs.publicationDate))))&&((this._publicationStatus == rhs._publicationStatus)||((this._publicationStatus!= null)&&this._publicationStatus.equals(rhs._publicationStatus))))&&((this._copyright == rhs._copyright)||((this._copyright!= null)&&this._copyright.equals(rhs._copyright))));
    }

}
