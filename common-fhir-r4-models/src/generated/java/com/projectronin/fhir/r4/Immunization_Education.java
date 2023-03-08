
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "documentType",
    "_documentType",
    "reference",
    "_reference",
    "publicationDate",
    "_publicationDate",
    "presentationDate",
    "_presentationDate"
})
@Generated("jsonschema2pojo")
public class Immunization_Education {

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("documentType")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String documentType;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentType")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _documentType;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String reference;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reference")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _reference;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("presentationDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String presentationDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_presentationDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _presentationDate;

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("documentType")
    public String getDocumentType() {
        return documentType;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("documentType")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentType")
    public Element get_documentType() {
        return _documentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentType")
    public void set_documentType(Element _documentType) {
        this._documentType = _documentType;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reference")
    public Element get_reference() {
        return _reference;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_reference")
    public void set_reference(Element _reference) {
        this._reference = _reference;
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
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("presentationDate")
    public String getPresentationDate() {
        return presentationDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("presentationDate")
    public void setPresentationDate(String presentationDate) {
        this.presentationDate = presentationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_presentationDate")
    public Element get_presentationDate() {
        return _presentationDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_presentationDate")
    public void set_presentationDate(Element _presentationDate) {
        this._presentationDate = _presentationDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Immunization_Education.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("documentType");
        sb.append('=');
        sb.append(((this.documentType == null)?"<null>":this.documentType));
        sb.append(',');
        sb.append("_documentType");
        sb.append('=');
        sb.append(((this._documentType == null)?"<null>":this._documentType));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("_reference");
        sb.append('=');
        sb.append(((this._reference == null)?"<null>":this._reference));
        sb.append(',');
        sb.append("publicationDate");
        sb.append('=');
        sb.append(((this.publicationDate == null)?"<null>":this.publicationDate));
        sb.append(',');
        sb.append("_publicationDate");
        sb.append('=');
        sb.append(((this._publicationDate == null)?"<null>":this._publicationDate));
        sb.append(',');
        sb.append("presentationDate");
        sb.append('=');
        sb.append(((this.presentationDate == null)?"<null>":this.presentationDate));
        sb.append(',');
        sb.append("_presentationDate");
        sb.append('=');
        sb.append(((this._presentationDate == null)?"<null>":this._presentationDate));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this._reference == null)? 0 :this._reference.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._publicationDate == null)? 0 :this._publicationDate.hashCode()));
        result = ((result* 31)+((this._documentType == null)? 0 :this._documentType.hashCode()));
        result = ((result* 31)+((this.documentType == null)? 0 :this.documentType.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.presentationDate == null)? 0 :this.presentationDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._presentationDate == null)? 0 :this._presentationDate.hashCode()));
        result = ((result* 31)+((this.publicationDate == null)? 0 :this.publicationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Immunization_Education) == false) {
            return false;
        }
        Immunization_Education rhs = ((Immunization_Education) other);
        return ((((((((((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this._reference == rhs._reference)||((this._reference!= null)&&this._reference.equals(rhs._reference))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._publicationDate == rhs._publicationDate)||((this._publicationDate!= null)&&this._publicationDate.equals(rhs._publicationDate))))&&((this._documentType == rhs._documentType)||((this._documentType!= null)&&this._documentType.equals(rhs._documentType))))&&((this.documentType == rhs.documentType)||((this.documentType!= null)&&this.documentType.equals(rhs.documentType))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.presentationDate == rhs.presentationDate)||((this.presentationDate!= null)&&this.presentationDate.equals(rhs.presentationDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._presentationDate == rhs._presentationDate)||((this._presentationDate!= null)&&this._presentationDate.equals(rhs._presentationDate))))&&((this.publicationDate == rhs.publicationDate)||((this.publicationDate!= null)&&this.publicationDate.equals(rhs.publicationDate))));
    }

}
