
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
 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "patient",
    "relationship",
    "name",
    "telecom",
    "gender",
    "_gender",
    "birthDate",
    "_birthDate",
    "address",
    "photo",
    "period",
    "communication"
})
@Generated("jsonschema2pojo")
public class RelatedPerson
    extends DomainResource
{

    /**
     * This is a RelatedPerson resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a RelatedPerson resource")
    private String resourceType;
    /**
     * Identifier for a person within a particular scope.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier for a person within a particular scope.")
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
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * The nature of the relationship between a patient and the related person.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("The nature of the relationship between a patient and the related person.")
    private List<CodeableConcept> relationship = new ArrayList<CodeableConcept>();
    /**
     * A name associated with the person.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A name associated with the person.")
    private List<HumanName> name = new ArrayList<HumanName>();
    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("A contact detail for the person, e.g. a telephone number or an email address.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.")
    private RelatedPerson.Gender gender;
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
     * Address where the related person can be contacted or visited.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Address where the related person can be contacted or visited.")
    private List<Address> address = new ArrayList<Address>();
    /**
     * Image of the person.
     * 
     */
    @JsonProperty("photo")
    @JsonPropertyDescription("Image of the person.")
    private List<Attachment> photo = new ArrayList<Attachment>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A language which may be used to communicate with about the patient's health.
     * 
     */
    @JsonProperty("communication")
    @JsonPropertyDescription("A language which may be used to communicate with about the patient's health.")
    private List<RelatedPerson_Communication> communication = new ArrayList<RelatedPerson_Communication>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a RelatedPerson resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a RelatedPerson resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifier for a person within a particular scope.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifier for a person within a particular scope.
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
     * The nature of the relationship between a patient and the related person.
     * 
     */
    @JsonProperty("relationship")
    public List<CodeableConcept> getRelationship() {
        return relationship;
    }

    /**
     * The nature of the relationship between a patient and the related person.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(List<CodeableConcept> relationship) {
        this.relationship = relationship;
    }

    /**
     * A name associated with the person.
     * 
     */
    @JsonProperty("name")
    public List<HumanName> getName() {
        return name;
    }

    /**
     * A name associated with the person.
     * 
     */
    @JsonProperty("name")
    public void setName(List<HumanName> name) {
        this.name = name;
    }

    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public RelatedPerson.Gender getGender() {
        return gender;
    }

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public void setGender(RelatedPerson.Gender gender) {
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
     * Address where the related person can be contacted or visited.
     * 
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Address where the related person can be contacted or visited.
     * 
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * Image of the person.
     * 
     */
    @JsonProperty("photo")
    public List<Attachment> getPhoto() {
        return photo;
    }

    /**
     * Image of the person.
     * 
     */
    @JsonProperty("photo")
    public void setPhoto(List<Attachment> photo) {
        this.photo = photo;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * A language which may be used to communicate with about the patient's health.
     * 
     */
    @JsonProperty("communication")
    public List<RelatedPerson_Communication> getCommunication() {
        return communication;
    }

    /**
     * A language which may be used to communicate with about the patient's health.
     * 
     */
    @JsonProperty("communication")
    public void setCommunication(List<RelatedPerson_Communication> communication) {
        this.communication = communication;
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
        sb.append(RelatedPerson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
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
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("communication");
        sb.append('=');
        sb.append(((this.communication == null)?"<null>":this.communication));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this._birthDate == null)? 0 :this._birthDate.hashCode()));
        result = ((result* 31)+((this._gender == null)? 0 :this._gender.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this.communication == null)? 0 :this.communication.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedPerson) == false) {
            return false;
        }
        RelatedPerson rhs = ((RelatedPerson) other);
        return (((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this._birthDate == rhs._birthDate)||((this._birthDate!= null)&&this._birthDate.equals(rhs._birthDate))))&&((this._gender == rhs._gender)||((this._gender!= null)&&this._gender.equals(rhs._gender))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.communication == rhs.communication)||((this.communication!= null)&&this.communication.equals(rhs.communication))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Gender {

        MALE("male"),
        FEMALE("female"),
        OTHER("other"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, RelatedPerson.Gender> CONSTANTS = new HashMap<String, RelatedPerson.Gender>();

        static {
            for (RelatedPerson.Gender c: values()) {
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
        public static RelatedPerson.Gender fromValue(String value) {
            RelatedPerson.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
