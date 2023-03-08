
package com.projectronin.fhir.r4;

import java.util.LinkedHashMap;
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
 * Base definition for all Resources
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "id",
    "meta",
    "implicitRules",
    "_implicitRules",
    "language",
    "_language"
})
@Generated("jsonschema2pojo")
public class Resource {

    /**
     * The type of resource
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("The type of resource")
    private String resourceType;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String id;
    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.")
    private Meta meta;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("implicitRules")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String implicitRules;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_implicitRules")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _implicitRules;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String language;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _language;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The type of resource
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The type of resource
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("implicitRules")
    public String getImplicitRules() {
        return implicitRules;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("implicitRules")
    public void setImplicitRules(String implicitRules) {
        this.implicitRules = implicitRules;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_implicitRules")
    public Element get_implicitRules() {
        return _implicitRules;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_implicitRules")
    public void set_implicitRules(Element _implicitRules) {
        this._implicitRules = _implicitRules;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    public Element get_language() {
        return _language;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    public void set_language(Element _language) {
        this._language = _language;
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
        sb.append(Resource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("implicitRules");
        sb.append('=');
        sb.append(((this.implicitRules == null)?"<null>":this.implicitRules));
        sb.append(',');
        sb.append("_implicitRules");
        sb.append('=');
        sb.append(((this._implicitRules == null)?"<null>":this._implicitRules));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("_language");
        sb.append('=');
        sb.append(((this._language == null)?"<null>":this._language));
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
        result = ((result* 31)+((this._language == null)? 0 :this._language.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        result = ((result* 31)+((this.implicitRules == null)? 0 :this.implicitRules.hashCode()));
        result = ((result* 31)+((this._implicitRules == null)? 0 :this._implicitRules.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return (((((((((this._language == rhs._language)||((this._language!= null)&&this._language.equals(rhs._language)))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))))&&((this.implicitRules == rhs.implicitRules)||((this.implicitRules!= null)&&this.implicitRules.equals(rhs.implicitRules))))&&((this._implicitRules == rhs._implicitRules)||((this._implicitRules!= null)&&this._implicitRules.equals(rhs._implicitRules))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
