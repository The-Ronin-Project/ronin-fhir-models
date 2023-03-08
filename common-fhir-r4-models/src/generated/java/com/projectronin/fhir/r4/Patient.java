
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
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "name",
    "telecom",
    "gender",
    "_gender",
    "birthDate",
    "_birthDate",
    "deceasedBoolean",
    "_deceasedBoolean",
    "deceasedDateTime",
    "_deceasedDateTime",
    "address",
    "maritalStatus",
    "multipleBirthBoolean",
    "_multipleBirthBoolean",
    "multipleBirthInteger",
    "_multipleBirthInteger",
    "photo",
    "contact",
    "communication",
    "generalPractitioner",
    "managingOrganization",
    "link"
})
@Generated("jsonschema2pojo")
public class Patient
    extends DomainResource
{

    /**
     * This is a Patient resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Patient resource")
    private String resourceType;
    /**
     * An identifier for this patient.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier for this patient.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean active;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _active;
    /**
     * A name associated with the individual.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A name associated with the individual.")
    private List<HumanName> name = new ArrayList<HumanName>();
    /**
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.")
    private Patient.Gender gender;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gender")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _gender;
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String birthDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_birthDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _birthDate;
    /**
     * Indicates if the individual is deceased or not.
     * 
     */
    @JsonProperty("deceasedBoolean")
    @JsonPropertyDescription("Indicates if the individual is deceased or not.")
    private Boolean deceasedBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _deceasedBoolean;
    /**
     * Indicates if the individual is deceased or not.
     * 
     */
    @JsonProperty("deceasedDateTime")
    @JsonPropertyDescription("Indicates if the individual is deceased or not.")
    private String deceasedDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _deceasedDateTime;
    /**
     * An address for the individual.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("An address for the individual.")
    private List<Address> address = new ArrayList<Address>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("maritalStatus")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept maritalStatus;
    /**
     * Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
     * 
     */
    @JsonProperty("multipleBirthBoolean")
    @JsonPropertyDescription("Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).")
    private Boolean multipleBirthBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleBirthBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _multipleBirthBoolean;
    /**
     * Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
     * 
     */
    @JsonProperty("multipleBirthInteger")
    @JsonPropertyDescription("Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).")
    private Double multipleBirthInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleBirthInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _multipleBirthInteger;
    /**
     * Image of the patient.
     * 
     */
    @JsonProperty("photo")
    @JsonPropertyDescription("Image of the patient.")
    private List<Attachment> photo = new ArrayList<Attachment>();
    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("A contact party (e.g. guardian, partner, friend) for the patient.")
    private List<Patient_Contact> contact = new ArrayList<Patient_Contact>();
    /**
     * A language which may be used to communicate with the patient about his or her health.
     * 
     */
    @JsonProperty("communication")
    @JsonPropertyDescription("A language which may be used to communicate with the patient about his or her health.")
    private List<Patient_Communication> communication = new ArrayList<Patient_Communication>();
    /**
     * Patient's nominated care provider.
     * 
     */
    @JsonProperty("generalPractitioner")
    @JsonPropertyDescription("Patient's nominated care provider.")
    private List<Reference> generalPractitioner = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference managingOrganization;
    /**
     * Link to another patient resource that concerns the same actual patient.
     * 
     */
    @JsonProperty("link")
    @JsonPropertyDescription("Link to another patient resource that concerns the same actual patient.")
    private List<Patient_Link> link = new ArrayList<Patient_Link>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Patient resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Patient resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier for this patient.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * An identifier for this patient.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    public Element get_active() {
        return _active;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_active")
    public void set_active(Element _active) {
        this._active = _active;
    }

    /**
     * A name associated with the individual.
     * 
     */
    @JsonProperty("name")
    public List<HumanName> getName() {
        return name;
    }

    /**
     * A name associated with the individual.
     * 
     */
    @JsonProperty("name")
    public void setName(List<HumanName> name) {
        this.name = name;
    }

    /**
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public Patient.Gender getGender() {
        return gender;
    }

    /**
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Patient.Gender gender) {
        this.gender = gender;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gender")
    public Element get_gender() {
        return _gender;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gender")
    public void set_gender(Element _gender) {
        this._gender = _gender;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_birthDate")
    public Element get_birthDate() {
        return _birthDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_birthDate")
    public void set_birthDate(Element _birthDate) {
        this._birthDate = _birthDate;
    }

    /**
     * Indicates if the individual is deceased or not.
     * 
     */
    @JsonProperty("deceasedBoolean")
    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    /**
     * Indicates if the individual is deceased or not.
     * 
     */
    @JsonProperty("deceasedBoolean")
    public void setDeceasedBoolean(Boolean deceasedBoolean) {
        this.deceasedBoolean = deceasedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedBoolean")
    public Element get_deceasedBoolean() {
        return _deceasedBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedBoolean")
    public void set_deceasedBoolean(Element _deceasedBoolean) {
        this._deceasedBoolean = _deceasedBoolean;
    }

    /**
     * Indicates if the individual is deceased or not.
     * 
     */
    @JsonProperty("deceasedDateTime")
    public String getDeceasedDateTime() {
        return deceasedDateTime;
    }

    /**
     * Indicates if the individual is deceased or not.
     * 
     */
    @JsonProperty("deceasedDateTime")
    public void setDeceasedDateTime(String deceasedDateTime) {
        this.deceasedDateTime = deceasedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedDateTime")
    public Element get_deceasedDateTime() {
        return _deceasedDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_deceasedDateTime")
    public void set_deceasedDateTime(Element _deceasedDateTime) {
        this._deceasedDateTime = _deceasedDateTime;
    }

    /**
     * An address for the individual.
     * 
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * An address for the individual.
     * 
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("maritalStatus")
    public CodeableConcept getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("maritalStatus")
    public void setMaritalStatus(CodeableConcept maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
     * 
     */
    @JsonProperty("multipleBirthBoolean")
    public Boolean getMultipleBirthBoolean() {
        return multipleBirthBoolean;
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
     * 
     */
    @JsonProperty("multipleBirthBoolean")
    public void setMultipleBirthBoolean(Boolean multipleBirthBoolean) {
        this.multipleBirthBoolean = multipleBirthBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleBirthBoolean")
    public Element get_multipleBirthBoolean() {
        return _multipleBirthBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleBirthBoolean")
    public void set_multipleBirthBoolean(Element _multipleBirthBoolean) {
        this._multipleBirthBoolean = _multipleBirthBoolean;
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
     * 
     */
    @JsonProperty("multipleBirthInteger")
    public Double getMultipleBirthInteger() {
        return multipleBirthInteger;
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
     * 
     */
    @JsonProperty("multipleBirthInteger")
    public void setMultipleBirthInteger(Double multipleBirthInteger) {
        this.multipleBirthInteger = multipleBirthInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleBirthInteger")
    public Element get_multipleBirthInteger() {
        return _multipleBirthInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_multipleBirthInteger")
    public void set_multipleBirthInteger(Element _multipleBirthInteger) {
        this._multipleBirthInteger = _multipleBirthInteger;
    }

    /**
     * Image of the patient.
     * 
     */
    @JsonProperty("photo")
    public List<Attachment> getPhoto() {
        return photo;
    }

    /**
     * Image of the patient.
     * 
     */
    @JsonProperty("photo")
    public void setPhoto(List<Attachment> photo) {
        this.photo = photo;
    }

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     * 
     */
    @JsonProperty("contact")
    public List<Patient_Contact> getContact() {
        return contact;
    }

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<Patient_Contact> contact) {
        this.contact = contact;
    }

    /**
     * A language which may be used to communicate with the patient about his or her health.
     * 
     */
    @JsonProperty("communication")
    public List<Patient_Communication> getCommunication() {
        return communication;
    }

    /**
     * A language which may be used to communicate with the patient about his or her health.
     * 
     */
    @JsonProperty("communication")
    public void setCommunication(List<Patient_Communication> communication) {
        this.communication = communication;
    }

    /**
     * Patient's nominated care provider.
     * 
     */
    @JsonProperty("generalPractitioner")
    public List<Reference> getGeneralPractitioner() {
        return generalPractitioner;
    }

    /**
     * Patient's nominated care provider.
     * 
     */
    @JsonProperty("generalPractitioner")
    public void setGeneralPractitioner(List<Reference> generalPractitioner) {
        this.generalPractitioner = generalPractitioner;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    public Reference getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Reference managingOrganization) {
        this.managingOrganization = managingOrganization;
    }

    /**
     * Link to another patient resource that concerns the same actual patient.
     * 
     */
    @JsonProperty("link")
    public List<Patient_Link> getLink() {
        return link;
    }

    /**
     * Link to another patient resource that concerns the same actual patient.
     * 
     */
    @JsonProperty("link")
    public void setLink(List<Patient_Link> link) {
        this.link = link;
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
        sb.append(Patient.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("_active");
        sb.append('=');
        sb.append(((this._active == null)?"<null>":this._active));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("telecom");
        sb.append('=');
        sb.append(((this.telecom == null)?"<null>":this.telecom));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("_gender");
        sb.append('=');
        sb.append(((this._gender == null)?"<null>":this._gender));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("_birthDate");
        sb.append('=');
        sb.append(((this._birthDate == null)?"<null>":this._birthDate));
        sb.append(',');
        sb.append("deceasedBoolean");
        sb.append('=');
        sb.append(((this.deceasedBoolean == null)?"<null>":this.deceasedBoolean));
        sb.append(',');
        sb.append("_deceasedBoolean");
        sb.append('=');
        sb.append(((this._deceasedBoolean == null)?"<null>":this._deceasedBoolean));
        sb.append(',');
        sb.append("deceasedDateTime");
        sb.append('=');
        sb.append(((this.deceasedDateTime == null)?"<null>":this.deceasedDateTime));
        sb.append(',');
        sb.append("_deceasedDateTime");
        sb.append('=');
        sb.append(((this._deceasedDateTime == null)?"<null>":this._deceasedDateTime));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("maritalStatus");
        sb.append('=');
        sb.append(((this.maritalStatus == null)?"<null>":this.maritalStatus));
        sb.append(',');
        sb.append("multipleBirthBoolean");
        sb.append('=');
        sb.append(((this.multipleBirthBoolean == null)?"<null>":this.multipleBirthBoolean));
        sb.append(',');
        sb.append("_multipleBirthBoolean");
        sb.append('=');
        sb.append(((this._multipleBirthBoolean == null)?"<null>":this._multipleBirthBoolean));
        sb.append(',');
        sb.append("multipleBirthInteger");
        sb.append('=');
        sb.append(((this.multipleBirthInteger == null)?"<null>":this.multipleBirthInteger));
        sb.append(',');
        sb.append("_multipleBirthInteger");
        sb.append('=');
        sb.append(((this._multipleBirthInteger == null)?"<null>":this._multipleBirthInteger));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("communication");
        sb.append('=');
        sb.append(((this.communication == null)?"<null>":this.communication));
        sb.append(',');
        sb.append("generalPractitioner");
        sb.append('=');
        sb.append(((this.generalPractitioner == null)?"<null>":this.generalPractitioner));
        sb.append(',');
        sb.append("managingOrganization");
        sb.append('=');
        sb.append(((this.managingOrganization == null)?"<null>":this.managingOrganization));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
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
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this._deceasedDateTime == null)? 0 :this._deceasedDateTime.hashCode()));
        result = ((result* 31)+((this._multipleBirthInteger == null)? 0 :this._multipleBirthInteger.hashCode()));
        result = ((result* 31)+((this._gender == null)? 0 :this._gender.hashCode()));
        result = ((result* 31)+((this.deceasedDateTime == null)? 0 :this.deceasedDateTime.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.generalPractitioner == null)? 0 :this.generalPractitioner.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this.communication == null)? 0 :this.communication.hashCode()));
        result = ((result* 31)+((this._deceasedBoolean == null)? 0 :this._deceasedBoolean.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.multipleBirthBoolean == null)? 0 :this.multipleBirthBoolean.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this._birthDate == null)? 0 :this._birthDate.hashCode()));
        result = ((result* 31)+((this.deceasedBoolean == null)? 0 :this.deceasedBoolean.hashCode()));
        result = ((result* 31)+((this.managingOrganization == null)? 0 :this.managingOrganization.hashCode()));
        result = ((result* 31)+((this.multipleBirthInteger == null)? 0 :this.multipleBirthInteger.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this._multipleBirthBoolean == null)? 0 :this._multipleBirthBoolean.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maritalStatus == null)? 0 :this.maritalStatus.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Patient) == false) {
            return false;
        }
        Patient rhs = ((Patient) other);
        return (((((((((((((((((((((((((((super.equals(rhs)&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link))))&&((this._deceasedDateTime == rhs._deceasedDateTime)||((this._deceasedDateTime!= null)&&this._deceasedDateTime.equals(rhs._deceasedDateTime))))&&((this._multipleBirthInteger == rhs._multipleBirthInteger)||((this._multipleBirthInteger!= null)&&this._multipleBirthInteger.equals(rhs._multipleBirthInteger))))&&((this._gender == rhs._gender)||((this._gender!= null)&&this._gender.equals(rhs._gender))))&&((this.deceasedDateTime == rhs.deceasedDateTime)||((this.deceasedDateTime!= null)&&this.deceasedDateTime.equals(rhs.deceasedDateTime))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.generalPractitioner == rhs.generalPractitioner)||((this.generalPractitioner!= null)&&this.generalPractitioner.equals(rhs.generalPractitioner))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.communication == rhs.communication)||((this.communication!= null)&&this.communication.equals(rhs.communication))))&&((this._deceasedBoolean == rhs._deceasedBoolean)||((this._deceasedBoolean!= null)&&this._deceasedBoolean.equals(rhs._deceasedBoolean))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.multipleBirthBoolean == rhs.multipleBirthBoolean)||((this.multipleBirthBoolean!= null)&&this.multipleBirthBoolean.equals(rhs.multipleBirthBoolean))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this._birthDate == rhs._birthDate)||((this._birthDate!= null)&&this._birthDate.equals(rhs._birthDate))))&&((this.deceasedBoolean == rhs.deceasedBoolean)||((this.deceasedBoolean!= null)&&this.deceasedBoolean.equals(rhs.deceasedBoolean))))&&((this.managingOrganization == rhs.managingOrganization)||((this.managingOrganization!= null)&&this.managingOrganization.equals(rhs.managingOrganization))))&&((this.multipleBirthInteger == rhs.multipleBirthInteger)||((this.multipleBirthInteger!= null)&&this.multipleBirthInteger.equals(rhs.multipleBirthInteger))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this._multipleBirthBoolean == rhs._multipleBirthBoolean)||((this._multipleBirthBoolean!= null)&&this._multipleBirthBoolean.equals(rhs._multipleBirthBoolean))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maritalStatus == rhs.maritalStatus)||((this.maritalStatus!= null)&&this.maritalStatus.equals(rhs.maritalStatus))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Gender {

        MALE("male"),
        FEMALE("female"),
        OTHER("other"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Patient.Gender> CONSTANTS = new HashMap<String, Patient.Gender>();

        static {
            for (Patient.Gender c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Gender(String value) {
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
        public static Patient.Gender fromValue(String value) {
            Patient.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
