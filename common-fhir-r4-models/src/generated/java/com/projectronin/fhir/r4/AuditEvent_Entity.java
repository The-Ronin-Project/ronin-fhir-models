
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "what",
    "type",
    "role",
    "lifecycle",
    "securityLabel",
    "name",
    "_name",
    "description",
    "_description",
    "query",
    "_query",
    "detail"
})
@Generated("jsonschema2pojo")
public class AuditEvent_Entity {

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("what")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference what;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding type;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding role;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("lifecycle")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding lifecycle;
    /**
     * Security labels for the identified entity.
     * 
     */
    @JsonProperty("securityLabel")
    @JsonPropertyDescription("Security labels for the identified entity.")
    private List<Coding> securityLabel = new ArrayList<Coding>();
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("query")
    @JsonPropertyDescription("A stream of bytes")
    private String query;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_query")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _query;
    /**
     * Tagged value pairs for conveying additional information about the entity.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Tagged value pairs for conveying additional information about the entity.")
    private List<AuditEvent_Detail> detail = new ArrayList<AuditEvent_Detail>();

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("what")
    public Reference getWhat() {
        return what;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("what")
    public void setWhat(Reference what) {
        this.what = what;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("type")
    public Coding getType() {
        return type;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("type")
    public void setType(Coding type) {
        this.type = type;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("role")
    public Coding getRole() {
        return role;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("role")
    public void setRole(Coding role) {
        this.role = role;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("lifecycle")
    public Coding getLifecycle() {
        return lifecycle;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("lifecycle")
    public void setLifecycle(Coding lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * Security labels for the identified entity.
     * 
     */
    @JsonProperty("securityLabel")
    public List<Coding> getSecurityLabel() {
        return securityLabel;
    }

    /**
     * Security labels for the identified entity.
     * 
     */
    @JsonProperty("securityLabel")
    public void setSecurityLabel(List<Coding> securityLabel) {
        this.securityLabel = securityLabel;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public Element get_description() {
        return _description;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    public void set_description(Element _description) {
        this._description = _description;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_query")
    public Element get_query() {
        return _query;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_query")
    public void set_query(Element _query) {
        this._query = _query;
    }

    /**
     * Tagged value pairs for conveying additional information about the entity.
     * 
     */
    @JsonProperty("detail")
    public List<AuditEvent_Detail> getDetail() {
        return detail;
    }

    /**
     * Tagged value pairs for conveying additional information about the entity.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(List<AuditEvent_Detail> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuditEvent_Entity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("what");
        sb.append('=');
        sb.append(((this.what == null)?"<null>":this.what));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("lifecycle");
        sb.append('=');
        sb.append(((this.lifecycle == null)?"<null>":this.lifecycle));
        sb.append(',');
        sb.append("securityLabel");
        sb.append('=');
        sb.append(((this.securityLabel == null)?"<null>":this.securityLabel));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("_query");
        sb.append('=');
        sb.append(((this._query == null)?"<null>":this._query));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this._query == null)? 0 :this._query.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.securityLabel == null)? 0 :this.securityLabel.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.lifecycle == null)? 0 :this.lifecycle.hashCode()));
        result = ((result* 31)+((this.what == null)? 0 :this.what.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuditEvent_Entity) == false) {
            return false;
        }
        AuditEvent_Entity rhs = ((AuditEvent_Entity) other);
        return ((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._query == rhs._query)||((this._query!= null)&&this._query.equals(rhs._query))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.securityLabel == rhs.securityLabel)||((this.securityLabel!= null)&&this.securityLabel.equals(rhs.securityLabel))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.lifecycle == rhs.lifecycle)||((this.lifecycle!= null)&&this.lifecycle.equals(rhs.lifecycle))))&&((this.what == rhs.what)||((this.what!= null)&&this.what.equals(rhs.what))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))));
    }

}
