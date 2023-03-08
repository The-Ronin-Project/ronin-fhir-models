
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
 * A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "contentType",
    "_contentType",
    "securityContext",
    "data",
    "_data"
})
@Generated("jsonschema2pojo")
public class Binary
    extends Resource
{

    /**
     * This is a Binary resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Binary resource")
    private String resourceType;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String contentType;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _contentType;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference securityContext;
    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("A stream of bytes")
    private String data;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_data")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a Binary resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a Binary resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    public Element get_contentType() {
        return _contentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    public void set_contentType(Element _contentType) {
        this._contentType = _contentType;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("securityContext")
    public Reference getSecurityContext() {
        return securityContext;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(Reference securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_data")
    public Element get_data() {
        return _data;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_data")
    public void set_data(Element _data) {
        this._data = _data;
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
        sb.append(Binary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("_contentType");
        sb.append('=');
        sb.append(((this._contentType == null)?"<null>":this._contentType));
        sb.append(',');
        sb.append("securityContext");
        sb.append('=');
        sb.append(((this.securityContext == null)?"<null>":this.securityContext));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("_data");
        sb.append('=');
        sb.append(((this._data == null)?"<null>":this._data));
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
        result = ((result* 31)+((this._data == null)? 0 :this._data.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this._contentType == null)? 0 :this._contentType.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Binary) == false) {
            return false;
        }
        Binary rhs = ((Binary) other);
        return (((((((super.equals(rhs)&&((this._data == rhs._data)||((this._data!= null)&&this._data.equals(rhs._data))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this._contentType == rhs._contentType)||((this._contentType!= null)&&this._contentType.equals(rhs._contentType))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
