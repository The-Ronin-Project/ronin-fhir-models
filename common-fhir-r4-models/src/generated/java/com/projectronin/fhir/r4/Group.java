
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
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "active",
    "_active",
    "type",
    "_type",
    "actual",
    "_actual",
    "code",
    "name",
    "_name",
    "quantity",
    "_quantity",
    "managingEntity",
    "characteristic",
    "member"
})
@Generated("jsonschema2pojo")
public class Group
    extends DomainResource
{

    /**
     * This is a Group resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Group resource")
    private String resourceType;
    /**
     * A unique business identifier for this group.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("A unique business identifier for this group.")
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
     * Identifies the broad classification of the kind of resources the group includes.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Identifies the broad classification of the kind of resources the group includes.")
    private Group.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("actual")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean actual;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actual")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _actual;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept code;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double quantity;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_quantity")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _quantity;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingEntity")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference managingEntity;
    /**
     * Identifies traits whose presence r absence is shared by members of the group.
     * 
     */
    @JsonProperty("characteristic")
    @JsonPropertyDescription("Identifies traits whose presence r absence is shared by members of the group.")
    private List<Group_Characteristic> characteristic = new ArrayList<Group_Characteristic>();
    /**
     * Identifies the resource instances that are members of the group.
     * 
     */
    @JsonProperty("member")
    @JsonPropertyDescription("Identifies the resource instances that are members of the group.")
    private List<Group_Member> member = new ArrayList<Group_Member>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Group resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Group resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A unique business identifier for this group.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * A unique business identifier for this group.
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
     * Identifies the broad classification of the kind of resources the group includes.
     * 
     */
    @JsonProperty("type")
    public Group.Type getType() {
        return type;
    }

    /**
     * Identifies the broad classification of the kind of resources the group includes.
     * 
     */
    @JsonProperty("type")
    public void setType(Group.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("actual")
    public Boolean getActual() {
        return actual;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("actual")
    public void setActual(Boolean actual) {
        this.actual = actual;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actual")
    public Element get_actual() {
        return _actual;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_actual")
    public void set_actual(Element _actual) {
        this._actual = _actual;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_quantity")
    public Element get_quantity() {
        return _quantity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_quantity")
    public void set_quantity(Element _quantity) {
        this._quantity = _quantity;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingEntity")
    public Reference getManagingEntity() {
        return managingEntity;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingEntity")
    public void setManagingEntity(Reference managingEntity) {
        this.managingEntity = managingEntity;
    }

    /**
     * Identifies traits whose presence r absence is shared by members of the group.
     * 
     */
    @JsonProperty("characteristic")
    public List<Group_Characteristic> getCharacteristic() {
        return characteristic;
    }

    /**
     * Identifies traits whose presence r absence is shared by members of the group.
     * 
     */
    @JsonProperty("characteristic")
    public void setCharacteristic(List<Group_Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * Identifies the resource instances that are members of the group.
     * 
     */
    @JsonProperty("member")
    public List<Group_Member> getMember() {
        return member;
    }

    /**
     * Identifies the resource instances that are members of the group.
     * 
     */
    @JsonProperty("member")
    public void setMember(List<Group_Member> member) {
        this.member = member;
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
        sb.append(Group.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("actual");
        sb.append('=');
        sb.append(((this.actual == null)?"<null>":this.actual));
        sb.append(',');
        sb.append("_actual");
        sb.append('=');
        sb.append(((this._actual == null)?"<null>":this._actual));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("_quantity");
        sb.append('=');
        sb.append(((this._quantity == null)?"<null>":this._quantity));
        sb.append(',');
        sb.append("managingEntity");
        sb.append('=');
        sb.append(((this.managingEntity == null)?"<null>":this.managingEntity));
        sb.append(',');
        sb.append("characteristic");
        sb.append('=');
        sb.append(((this.characteristic == null)?"<null>":this.characteristic));
        sb.append(',');
        sb.append("member");
        sb.append('=');
        sb.append(((this.member == null)?"<null>":this.member));
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
        result = ((result* 31)+((this.actual == null)? 0 :this.actual.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this._quantity == null)? 0 :this._quantity.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.characteristic == null)? 0 :this.characteristic.hashCode()));
        result = ((result* 31)+((this.managingEntity == null)? 0 :this.managingEntity.hashCode()));
        result = ((result* 31)+((this._actual == null)? 0 :this._actual.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.member == null)? 0 :this.member.hashCode()));
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
        if ((other instanceof Group) == false) {
            return false;
        }
        Group rhs = ((Group) other);
        return (((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.actual == rhs.actual)||((this.actual!= null)&&this.actual.equals(rhs.actual))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this._quantity == rhs._quantity)||((this._quantity!= null)&&this._quantity.equals(rhs._quantity))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.characteristic == rhs.characteristic)||((this.characteristic!= null)&&this.characteristic.equals(rhs.characteristic))))&&((this.managingEntity == rhs.managingEntity)||((this.managingEntity!= null)&&this.managingEntity.equals(rhs.managingEntity))))&&((this._actual == rhs._actual)||((this._actual!= null)&&this._actual.equals(rhs._actual))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.member == rhs.member)||((this.member!= null)&&this.member.equals(rhs.member))))&&((this._active == rhs._active)||((this._active!= null)&&this._active.equals(rhs._active))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }


    /**
     * Identifies the broad classification of the kind of resources the group includes.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PERSON("person"),
        ANIMAL("animal"),
        PRACTITIONER("practitioner"),
        DEVICE("device"),
        MEDICATION("medication"),
        SUBSTANCE("substance");
        private final String value;
        private final static Map<String, Group.Type> CONSTANTS = new HashMap<String, Group.Type>();

        static {
            for (Group.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Group.Type fromValue(String value) {
            Group.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
