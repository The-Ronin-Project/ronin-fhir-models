
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
 * Demographics and administrative information about a person independent of a specific health-related context.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "name",
    "telecom",
    "gender",
    "_gender",
    "birthDate",
    "_birthDate",
    "address",
    "photo",
    "managingOrganization",
    "active",
    "_active",
    "link"
})
@Generated("jsonschema2pojo")
public class Person
    extends DomainResource
{

    /**
     * This is a Person resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Person resource")
    private String resourceType;
    /**
     * Identifier for a person within a particular scope.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifier for a person within a particular scope.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
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
     * Administrative Gender.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("Administrative Gender.")
    private Person.Gender gender;
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
     * One or more addresses for the person.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("One or more addresses for the person.")
    private List<Address> address = new ArrayList<Address>();
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("photo")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment photo;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference managingOrganization;
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
     * Link to a resource that concerns the same actual person.
     * 
     */
    @JsonProperty("link")
    @JsonPropertyDescription("Link to a resource that concerns the same actual person.")
    private List<Person_Link> link = new ArrayList<Person_Link>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Person resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Person resource
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
     * Administrative Gender.
     * 
     */
    @JsonProperty("gender")
    public Person.Gender getGender() {
        return gender;
    }

    /**
     * Administrative Gender.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Person.Gender gender) {
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
     * One or more addresses for the person.
     * 
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * One or more addresses for the person.
     * 
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("photo")
    public Attachment getPhoto() {
        return photo;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("photo")
    public void setPhoto(Attachment photo) {
        this.photo = photo;
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
     * Link to a resource that concerns the same actual person.
     * 
     */
    @JsonProperty("link")
    public List<Person_Link> getLink() {
        return link;
    }

    /**
     * Link to a resource that concerns the same actual person.
     * 
     */
    @JsonProperty("link")
    public void setLink(List<Person_Link> link) {
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
        sb.append(Person.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("managingOrganization");
        sb.append('=');
        sb.append(((this.managingOrganization == null)?"<null>":this.managingOrganization));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("_active");
        sb.append('=');
        sb.append(((this._active == null)?"<null>":this._active));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this._birthDate == null)? 0 :this._birthDate.hashCode()));
        result = ((result* 31)+((this.managingOrganization == null)? 0 :this.managingOrganization.hashCode()));
        result = ((result* 31)+((this._gender == null)? 0 :this._gender.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this._active == null)? 0 :this._active.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Person) == false) {
            return false;
        }
        Person rhs = ((Person) other);
        return (((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this._birthDate == rhs._birthDate)||((this._birthDate!= null)&&this._birthDate.equals(rhs._birthDate))))&&((this.managingOrganization == rhs.managingOrganization)||((this.managingOrganization!= null)&&this.managingOrganization.equals(rhs.managingOrganization))))&&((this._gender == rhs._gender)||((this._gender!= null)&&this._gender.equals(rhs._gender))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * Administrative Gender.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Gender {

        MALE("male"),
        FEMALE("female"),
        OTHER("other"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Person.Gender> CONSTANTS = new HashMap<String, Person.Gender>();

        static {
            for (Person.Gender c: values()) {
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
        public static Person.Gender fromValue(String value) {
            Person.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
