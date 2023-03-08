
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
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
    "id",
    "extension",
    "modifierExtension",
    "relationship",
    "name",
    "telecom",
    "address",
    "gender",
    "_gender",
    "organization",
    "period"
})
@Generated("jsonschema2pojo")
public class Patient_Contact {

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
     * The nature of the relationship between the patient and the contact person.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("The nature of the relationship between the patient and the contact person.")
    private List<CodeableConcept> relationship = new ArrayList<CodeableConcept>();
    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A human's name with the ability to identify parts and usage.")
    private HumanName name;
    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("A contact detail for the person, e.g. a telephone number or an email address.")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.")
    private Address address;
    /**
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.")
    private Patient_Contact.Gender gender;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_gender")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _gender;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference organization;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;

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
     * The nature of the relationship between the patient and the contact person.
     * 
     */
    @JsonProperty("relationship")
    public List<CodeableConcept> getRelationship() {
        return relationship;
    }

    /**
     * The nature of the relationship between the patient and the contact person.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(List<CodeableConcept> relationship) {
        this.relationship = relationship;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("name")
    public HumanName getName() {
        return name;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("name")
    public void setName(HumanName name) {
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
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public Patient_Contact.Gender getGender() {
        return gender;
    }

    /**
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Patient_Contact.Gender gender) {
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    public Reference getOrganization() {
        return organization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(Reference organization) {
        this.organization = organization;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Patient_Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this._gender == null)? 0 :this._gender.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Patient_Contact) == false) {
            return false;
        }
        Patient_Contact rhs = ((Patient_Contact) other);
        return ((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this._gender == rhs._gender)||((this._gender!= null)&&this._gender.equals(rhs._gender))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))));
    }


    /**
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Gender {

        MALE("male"),
        FEMALE("female"),
        OTHER("other"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Patient_Contact.Gender> CONSTANTS = new HashMap<String, Patient_Contact.Gender>();

        static {
            for (Patient_Contact.Gender c: values()) {
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
        public static Patient_Contact.Gender fromValue(String value) {
            Patient_Contact.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
