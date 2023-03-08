
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
 * Catalog entries are wrappers that contextualize items included in a catalog.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "relationtype",
    "_relationtype",
    "item"
})
@Generated("jsonschema2pojo")
public class CatalogEntry_RelatedEntry {

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
     * The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.
     * 
     */
    @JsonProperty("relationtype")
    @JsonPropertyDescription("The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.")
    private CatalogEntry_RelatedEntry.Relationtype relationtype;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relationtype")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _relationtype;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference item;

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
     * The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.
     * 
     */
    @JsonProperty("relationtype")
    public CatalogEntry_RelatedEntry.Relationtype getRelationtype() {
        return relationtype;
    }

    /**
     * The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.
     * 
     */
    @JsonProperty("relationtype")
    public void setRelationtype(CatalogEntry_RelatedEntry.Relationtype relationtype) {
        this.relationtype = relationtype;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relationtype")
    public Element get_relationtype() {
        return _relationtype;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_relationtype")
    public void set_relationtype(Element _relationtype) {
        this._relationtype = _relationtype;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("item")
    public Reference getItem() {
        return item;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("item")
    public void setItem(Reference item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatalogEntry_RelatedEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("relationtype");
        sb.append('=');
        sb.append(((this.relationtype == null)?"<null>":this.relationtype));
        sb.append(',');
        sb.append("_relationtype");
        sb.append('=');
        sb.append(((this._relationtype == null)?"<null>":this._relationtype));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
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
        result = ((result* 31)+((this._relationtype == null)? 0 :this._relationtype.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.relationtype == null)? 0 :this.relationtype.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogEntry_RelatedEntry) == false) {
            return false;
        }
        CatalogEntry_RelatedEntry rhs = ((CatalogEntry_RelatedEntry) other);
        return (((((((this._relationtype == rhs._relationtype)||((this._relationtype!= null)&&this._relationtype.equals(rhs._relationtype)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.relationtype == rhs.relationtype)||((this.relationtype!= null)&&this.relationtype.equals(rhs.relationtype))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))));
    }


    /**
     * The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Relationtype {

        TRIGGERS("triggers"),
        IS_REPLACED_BY("is-replaced-by");
        private final String value;
        private final static Map<String, CatalogEntry_RelatedEntry.Relationtype> CONSTANTS = new HashMap<String, CatalogEntry_RelatedEntry.Relationtype>();

        static {
            for (CatalogEntry_RelatedEntry.Relationtype c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Relationtype(String value) {
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
        public static CatalogEntry_RelatedEntry.Relationtype fromValue(String value) {
            CatalogEntry_RelatedEntry.Relationtype constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
