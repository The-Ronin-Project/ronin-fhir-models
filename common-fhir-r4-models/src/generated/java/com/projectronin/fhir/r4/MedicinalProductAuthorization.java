
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
 * The regulatory authorization of a medicinal product.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "subject",
    "country",
    "jurisdiction",
    "status",
    "statusDate",
    "_statusDate",
    "restoreDate",
    "_restoreDate",
    "validityPeriod",
    "dataExclusivityPeriod",
    "dateOfFirstAuthorization",
    "_dateOfFirstAuthorization",
    "internationalBirthDate",
    "_internationalBirthDate",
    "legalBasis",
    "jurisdictionalAuthorization",
    "holder",
    "regulator",
    "procedure"
})
@Generated("jsonschema2pojo")
public class MedicinalProductAuthorization
    extends DomainResource
{

    /**
     * This is a MedicinalProductAuthorization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a MedicinalProductAuthorization resource")
    private String resourceType;
    /**
     * Business identifier for the marketing authorization, as assigned by a regulator.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifier for the marketing authorization, as assigned by a regulator.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * The country in which the marketing authorization has been granted.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country in which the marketing authorization has been granted.")
    private List<CodeableConcept> country = new ArrayList<CodeableConcept>();
    /**
     * Jurisdiction within a country.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("Jurisdiction within a country.")
    private List<CodeableConcept> jurisdiction = new ArrayList<CodeableConcept>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept status;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String statusDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _statusDate;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("restoreDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String restoreDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_restoreDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _restoreDate;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("validityPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period validityPeriod;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("dataExclusivityPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period dataExclusivityPeriod;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateOfFirstAuthorization")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String dateOfFirstAuthorization;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateOfFirstAuthorization")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dateOfFirstAuthorization;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("internationalBirthDate")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String internationalBirthDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_internationalBirthDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _internationalBirthDate;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalBasis")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept legalBasis;
    /**
     * Authorization in areas within a country.
     * 
     */
    @JsonProperty("jurisdictionalAuthorization")
    @JsonPropertyDescription("Authorization in areas within a country.")
    private List<MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization = new ArrayList<MedicinalProductAuthorization_JurisdictionalAuthorization>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("holder")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference holder;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("regulator")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference regulator;
    /**
     * The regulatory authorization of a medicinal product.
     * 
     */
    @JsonProperty("procedure")
    @JsonPropertyDescription("The regulatory authorization of a medicinal product.")
    private MedicinalProductAuthorization_Procedure procedure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a MedicinalProductAuthorization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a MedicinalProductAuthorization resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifier for the marketing authorization, as assigned by a regulator.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifier for the marketing authorization, as assigned by a regulator.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
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
     * The country in which the marketing authorization has been granted.
     * 
     */
    @JsonProperty("country")
    public List<CodeableConcept> getCountry() {
        return country;
    }

    /**
     * The country in which the marketing authorization has been granted.
     * 
     */
    @JsonProperty("country")
    public void setCountry(List<CodeableConcept> country) {
        this.country = country;
    }

    /**
     * Jurisdiction within a country.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Jurisdiction within a country.
     * 
     */
    @JsonProperty("jurisdiction")
    public void setJurisdiction(List<CodeableConcept> jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    public CodeableConcept getStatus() {
        return status;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CodeableConcept status) {
        this.status = status;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    public String getStatusDate() {
        return statusDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusDate")
    public Element get_statusDate() {
        return _statusDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_statusDate")
    public void set_statusDate(Element _statusDate) {
        this._statusDate = _statusDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("restoreDate")
    public String getRestoreDate() {
        return restoreDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("restoreDate")
    public void setRestoreDate(String restoreDate) {
        this.restoreDate = restoreDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_restoreDate")
    public Element get_restoreDate() {
        return _restoreDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_restoreDate")
    public void set_restoreDate(Element _restoreDate) {
        this._restoreDate = _restoreDate;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("validityPeriod")
    public Period getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Period validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("dataExclusivityPeriod")
    public Period getDataExclusivityPeriod() {
        return dataExclusivityPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("dataExclusivityPeriod")
    public void setDataExclusivityPeriod(Period dataExclusivityPeriod) {
        this.dataExclusivityPeriod = dataExclusivityPeriod;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateOfFirstAuthorization")
    public String getDateOfFirstAuthorization() {
        return dateOfFirstAuthorization;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateOfFirstAuthorization")
    public void setDateOfFirstAuthorization(String dateOfFirstAuthorization) {
        this.dateOfFirstAuthorization = dateOfFirstAuthorization;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateOfFirstAuthorization")
    public Element get_dateOfFirstAuthorization() {
        return _dateOfFirstAuthorization;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateOfFirstAuthorization")
    public void set_dateOfFirstAuthorization(Element _dateOfFirstAuthorization) {
        this._dateOfFirstAuthorization = _dateOfFirstAuthorization;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("internationalBirthDate")
    public String getInternationalBirthDate() {
        return internationalBirthDate;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("internationalBirthDate")
    public void setInternationalBirthDate(String internationalBirthDate) {
        this.internationalBirthDate = internationalBirthDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_internationalBirthDate")
    public Element get_internationalBirthDate() {
        return _internationalBirthDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_internationalBirthDate")
    public void set_internationalBirthDate(Element _internationalBirthDate) {
        this._internationalBirthDate = _internationalBirthDate;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalBasis")
    public CodeableConcept getLegalBasis() {
        return legalBasis;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("legalBasis")
    public void setLegalBasis(CodeableConcept legalBasis) {
        this.legalBasis = legalBasis;
    }

    /**
     * Authorization in areas within a country.
     * 
     */
    @JsonProperty("jurisdictionalAuthorization")
    public List<MedicinalProductAuthorization_JurisdictionalAuthorization> getJurisdictionalAuthorization() {
        return jurisdictionalAuthorization;
    }

    /**
     * Authorization in areas within a country.
     * 
     */
    @JsonProperty("jurisdictionalAuthorization")
    public void setJurisdictionalAuthorization(List<MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization) {
        this.jurisdictionalAuthorization = jurisdictionalAuthorization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("holder")
    public Reference getHolder() {
        return holder;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("holder")
    public void setHolder(Reference holder) {
        this.holder = holder;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("regulator")
    public Reference getRegulator() {
        return regulator;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("regulator")
    public void setRegulator(Reference regulator) {
        this.regulator = regulator;
    }

    /**
     * The regulatory authorization of a medicinal product.
     * 
     */
    @JsonProperty("procedure")
    public MedicinalProductAuthorization_Procedure getProcedure() {
        return procedure;
    }

    /**
     * The regulatory authorization of a medicinal product.
     * 
     */
    @JsonProperty("procedure")
    public void setProcedure(MedicinalProductAuthorization_Procedure procedure) {
        this.procedure = procedure;
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
        sb.append(MedicinalProductAuthorization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("jurisdiction");
        sb.append('=');
        sb.append(((this.jurisdiction == null)?"<null>":this.jurisdiction));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("_statusDate");
        sb.append('=');
        sb.append(((this._statusDate == null)?"<null>":this._statusDate));
        sb.append(',');
        sb.append("restoreDate");
        sb.append('=');
        sb.append(((this.restoreDate == null)?"<null>":this.restoreDate));
        sb.append(',');
        sb.append("_restoreDate");
        sb.append('=');
        sb.append(((this._restoreDate == null)?"<null>":this._restoreDate));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("dataExclusivityPeriod");
        sb.append('=');
        sb.append(((this.dataExclusivityPeriod == null)?"<null>":this.dataExclusivityPeriod));
        sb.append(',');
        sb.append("dateOfFirstAuthorization");
        sb.append('=');
        sb.append(((this.dateOfFirstAuthorization == null)?"<null>":this.dateOfFirstAuthorization));
        sb.append(',');
        sb.append("_dateOfFirstAuthorization");
        sb.append('=');
        sb.append(((this._dateOfFirstAuthorization == null)?"<null>":this._dateOfFirstAuthorization));
        sb.append(',');
        sb.append("internationalBirthDate");
        sb.append('=');
        sb.append(((this.internationalBirthDate == null)?"<null>":this.internationalBirthDate));
        sb.append(',');
        sb.append("_internationalBirthDate");
        sb.append('=');
        sb.append(((this._internationalBirthDate == null)?"<null>":this._internationalBirthDate));
        sb.append(',');
        sb.append("legalBasis");
        sb.append('=');
        sb.append(((this.legalBasis == null)?"<null>":this.legalBasis));
        sb.append(',');
        sb.append("jurisdictionalAuthorization");
        sb.append('=');
        sb.append(((this.jurisdictionalAuthorization == null)?"<null>":this.jurisdictionalAuthorization));
        sb.append(',');
        sb.append("holder");
        sb.append('=');
        sb.append(((this.holder == null)?"<null>":this.holder));
        sb.append(',');
        sb.append("regulator");
        sb.append('=');
        sb.append(((this.regulator == null)?"<null>":this.regulator));
        sb.append(',');
        sb.append("procedure");
        sb.append('=');
        sb.append(((this.procedure == null)?"<null>":this.procedure));
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
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this._statusDate == null)? 0 :this._statusDate.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.dateOfFirstAuthorization == null)? 0 :this.dateOfFirstAuthorization.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.internationalBirthDate == null)? 0 :this.internationalBirthDate.hashCode()));
        result = ((result* 31)+((this.legalBasis == null)? 0 :this.legalBasis.hashCode()));
        result = ((result* 31)+((this.holder == null)? 0 :this.holder.hashCode()));
        result = ((result* 31)+((this.procedure == null)? 0 :this.procedure.hashCode()));
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.jurisdictionalAuthorization == null)? 0 :this.jurisdictionalAuthorization.hashCode()));
        result = ((result* 31)+((this._restoreDate == null)? 0 :this._restoreDate.hashCode()));
        result = ((result* 31)+((this.dataExclusivityPeriod == null)? 0 :this.dataExclusivityPeriod.hashCode()));
        result = ((result* 31)+((this.regulator == null)? 0 :this.regulator.hashCode()));
        result = ((result* 31)+((this._dateOfFirstAuthorization == null)? 0 :this._dateOfFirstAuthorization.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._internationalBirthDate == null)? 0 :this._internationalBirthDate.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.restoreDate == null)? 0 :this.restoreDate.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicinalProductAuthorization) == false) {
            return false;
        }
        MedicinalProductAuthorization rhs = ((MedicinalProductAuthorization) other);
        return ((((((((((((((((((((((super.equals(rhs)&&((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate))))&&((this._statusDate == rhs._statusDate)||((this._statusDate!= null)&&this._statusDate.equals(rhs._statusDate))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.dateOfFirstAuthorization == rhs.dateOfFirstAuthorization)||((this.dateOfFirstAuthorization!= null)&&this.dateOfFirstAuthorization.equals(rhs.dateOfFirstAuthorization))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.internationalBirthDate == rhs.internationalBirthDate)||((this.internationalBirthDate!= null)&&this.internationalBirthDate.equals(rhs.internationalBirthDate))))&&((this.legalBasis == rhs.legalBasis)||((this.legalBasis!= null)&&this.legalBasis.equals(rhs.legalBasis))))&&((this.holder == rhs.holder)||((this.holder!= null)&&this.holder.equals(rhs.holder))))&&((this.procedure == rhs.procedure)||((this.procedure!= null)&&this.procedure.equals(rhs.procedure))))&&((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod))))&&((this.jurisdictionalAuthorization == rhs.jurisdictionalAuthorization)||((this.jurisdictionalAuthorization!= null)&&this.jurisdictionalAuthorization.equals(rhs.jurisdictionalAuthorization))))&&((this._restoreDate == rhs._restoreDate)||((this._restoreDate!= null)&&this._restoreDate.equals(rhs._restoreDate))))&&((this.dataExclusivityPeriod == rhs.dataExclusivityPeriod)||((this.dataExclusivityPeriod!= null)&&this.dataExclusivityPeriod.equals(rhs.dataExclusivityPeriod))))&&((this.regulator == rhs.regulator)||((this.regulator!= null)&&this.regulator.equals(rhs.regulator))))&&((this._dateOfFirstAuthorization == rhs._dateOfFirstAuthorization)||((this._dateOfFirstAuthorization!= null)&&this._dateOfFirstAuthorization.equals(rhs._dateOfFirstAuthorization))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._internationalBirthDate == rhs._internationalBirthDate)||((this._internationalBirthDate!= null)&&this._internationalBirthDate.equals(rhs._internationalBirthDate))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.restoreDate == rhs.restoreDate)||((this.restoreDate!= null)&&this.restoreDate.equals(rhs.restoreDate))));
    }

}
