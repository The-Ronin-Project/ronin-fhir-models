
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
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "created",
    "_created",
    "patient",
    "encounter",
    "dateWritten",
    "_dateWritten",
    "prescriber",
    "lensSpecification"
})
@Generated("jsonschema2pojo")
public class VisionPrescription
    extends DomainResource
{

    /**
     * This is a VisionPrescription resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a VisionPrescription resource")
    private String resourceType;
    /**
     * A unique identifier assigned to this vision prescription.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique identifier assigned to this vision prescription.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
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
    @JsonProperty("dateWritten")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String dateWritten;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateWritten")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dateWritten;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("prescriber")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference prescriber;
    /**
     * Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.
     * (Required)
     * 
     */
    @JsonProperty("lensSpecification")
    @JsonPropertyDescription("Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.")
    private List<VisionPrescription_LensSpecification> lensSpecification = new ArrayList<VisionPrescription_LensSpecification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a VisionPrescription resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a VisionPrescription resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique identifier assigned to this vision prescription.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique identifier assigned to this vision prescription.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
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
    @JsonProperty("dateWritten")
    public String getDateWritten() {
        return dateWritten;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateWritten")
    public void setDateWritten(String dateWritten) {
        this.dateWritten = dateWritten;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateWritten")
    public Element get_dateWritten() {
        return _dateWritten;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateWritten")
    public void set_dateWritten(Element _dateWritten) {
        this._dateWritten = _dateWritten;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("prescriber")
    public Reference getPrescriber() {
        return prescriber;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("prescriber")
    public void setPrescriber(Reference prescriber) {
        this.prescriber = prescriber;
    }

    /**
     * Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.
     * (Required)
     * 
     */
    @JsonProperty("lensSpecification")
    public List<VisionPrescription_LensSpecification> getLensSpecification() {
        return lensSpecification;
    }

    /**
     * Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.
     * (Required)
     * 
     */
    @JsonProperty("lensSpecification")
    public void setLensSpecification(List<VisionPrescription_LensSpecification> lensSpecification) {
        this.lensSpecification = lensSpecification;
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
        sb.append(VisionPrescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("dateWritten");
        sb.append('=');
        sb.append(((this.dateWritten == null)?"<null>":this.dateWritten));
        sb.append(',');
        sb.append("_dateWritten");
        sb.append('=');
        sb.append(((this._dateWritten == null)?"<null>":this._dateWritten));
        sb.append(',');
        sb.append("prescriber");
        sb.append('=');
        sb.append(((this.prescriber == null)?"<null>":this.prescriber));
        sb.append(',');
        sb.append("lensSpecification");
        sb.append('=');
        sb.append(((this.lensSpecification == null)?"<null>":this.lensSpecification));
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
        result = ((result* 31)+((this.prescriber == null)? 0 :this.prescriber.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.lensSpecification == null)? 0 :this.lensSpecification.hashCode()));
        result = ((result* 31)+((this.dateWritten == null)? 0 :this.dateWritten.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this._dateWritten == null)? 0 :this._dateWritten.hashCode()));
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
        if ((other instanceof VisionPrescription) == false) {
            return false;
        }
        VisionPrescription rhs = ((VisionPrescription) other);
        return (((((((((((((super.equals(rhs)&&((this.prescriber == rhs.prescriber)||((this.prescriber!= null)&&this.prescriber.equals(rhs.prescriber))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.lensSpecification == rhs.lensSpecification)||((this.lensSpecification!= null)&&this.lensSpecification.equals(rhs.lensSpecification))))&&((this.dateWritten == rhs.dateWritten)||((this.dateWritten!= null)&&this.dateWritten.equals(rhs.dateWritten))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this._dateWritten == rhs._dateWritten)||((this._dateWritten!= null)&&this._dateWritten.equals(rhs._dateWritten))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
