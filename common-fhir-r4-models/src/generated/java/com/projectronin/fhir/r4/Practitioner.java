
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
 * A person who is directly or indirectly involved in the provisioning of healthcare.
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
    "address",
    "gender",
    "_gender",
    "birthDate",
    "_birthDate",
    "photo",
    "qualification",
    "communication"
})
@Generated("jsonschema2pojo")
public class Practitioner
    extends DomainResource
{

    /**
     * This is a Practitioner resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Practitioner resource")
    private String resourceType;
    /**
     * An identifier that applies to this person in this role.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier that applies to this person in this role.")
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
     * The name(s) associated with the practitioner.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name(s) associated with the practitioner.")
    private List<HumanName> name = new ArrayList<HumanName>();
    /**
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("A contact detail for the practitioner, e.g. a telephone number or an email address.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * Address(es) of the practitioner that are not role specific (typically home address). Work addresses are not typically entered in this property as they are usually role dependent.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Address(es) of the practitioner that are not role specific (typically home address). \rWork addresses are not typically entered in this property as they are usually role dependent.")
    private List<Address> address = new ArrayList<Address>();
    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.")
    private Practitioner.Gender gender;
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
     * Image of the person.
     * 
     */
    @JsonProperty("photo")
    @JsonPropertyDescription("Image of the person.")
    private List<Attachment> photo = new ArrayList<Attachment>();
    /**
     * The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner.  For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certian locality.
     * 
     */
    @JsonProperty("qualification")
    @JsonPropertyDescription("The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner.  For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certian locality.")
    private List<Practitioner_Qualification> qualification = new ArrayList<Practitioner_Qualification>();
    /**
     * A language the practitioner can use in patient communication.
     * 
     */
    @JsonProperty("communication")
    @JsonPropertyDescription("A language the practitioner can use in patient communication.")
    private List<CodeableConcept> communication = new ArrayList<CodeableConcept>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Practitioner resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Practitioner resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier that applies to this person in this role.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * An identifier that applies to this person in this role.
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
     * The name(s) associated with the practitioner.
     * 
     */
    @JsonProperty("name")
    public List<HumanName> getName() {
        return name;
    }

    /**
     * The name(s) associated with the practitioner.
     * 
     */
    @JsonProperty("name")
    public void setName(List<HumanName> name) {
        this.name = name;
    }

    /**
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * Address(es) of the practitioner that are not role specific (typically home address). Work addresses are not typically entered in this property as they are usually role dependent.
     * 
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Address(es) of the practitioner that are not role specific (typically home address). Work addresses are not typically entered in this property as they are usually role dependent.
     * 
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public Practitioner.Gender getGender() {
        return gender;
    }

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Practitioner.Gender gender) {
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
     * The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner.  For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certian locality.
     * 
     */
    @JsonProperty("qualification")
    public List<Practitioner_Qualification> getQualification() {
        return qualification;
    }

    /**
     * The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner.  For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certian locality.
     * 
     */
    @JsonProperty("qualification")
    public void setQualification(List<Practitioner_Qualification> qualification) {
        this.qualification = qualification;
    }

    /**
     * A language the practitioner can use in patient communication.
     * 
     */
    @JsonProperty("communication")
    public List<CodeableConcept> getCommunication() {
        return communication;
    }

    /**
     * A language the practitioner can use in patient communication.
     * 
     */
    @JsonProperty("communication")
    public void setCommunication(List<CodeableConcept> communication) {
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
        sb.append(Practitioner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("qualification");
        sb.append('=');
        sb.append(((this.qualification == null)?"<null>":this.qualification));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this._birthDate == null)? 0 :this._birthDate.hashCode()));
        result = ((result* 31)+((this.qualification == null)? 0 :this.qualification.hashCode()));
        result = ((result* 31)+((this._gender == null)? 0 :this._gender.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof Practitioner) == false) {
            return false;
        }
        Practitioner rhs = ((Practitioner) other);
        return (((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this._birthDate == rhs._birthDate)||((this._birthDate!= null)&&this._birthDate.equals(rhs._birthDate))))&&((this.qualification == rhs.qualification)||((this.qualification!= null)&&this.qualification.equals(rhs.qualification))))&&((this._gender == rhs._gender)||((this._gender!= null)&&this._gender.equals(rhs._gender))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.communication == rhs.communication)||((this.communication!= null)&&this.communication.equals(rhs.communication))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
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
        private final static Map<String, Practitioner.Gender> CONSTANTS = new HashMap<String, Practitioner.Gender>();

        static {
            for (Practitioner.Gender c: values()) {
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
        public static Practitioner.Gender fromValue(String value) {
            Practitioner.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
