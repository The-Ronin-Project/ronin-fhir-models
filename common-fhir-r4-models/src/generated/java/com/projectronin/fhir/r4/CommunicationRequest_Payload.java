
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "contentString",
    "_contentString",
    "contentAttachment",
    "contentReference"
})
@Generated("jsonschema2pojo")
public class CommunicationRequest_Payload {

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
     * The communicated content (or for multi-part communications, one portion of the communication).
     * 
     */
    @JsonProperty("contentString")
    @JsonPropertyDescription("The communicated content (or for multi-part communications, one portion of the communication).")
    private String contentString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _contentString;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("contentAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment contentAttachment;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("contentReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference contentReference;

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
     * The communicated content (or for multi-part communications, one portion of the communication).
     * 
     */
    @JsonProperty("contentString")
    public String getContentString() {
        return contentString;
    }

    /**
     * The communicated content (or for multi-part communications, one portion of the communication).
     * 
     */
    @JsonProperty("contentString")
    public void setContentString(String contentString) {
        this.contentString = contentString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentString")
    public Element get_contentString() {
        return _contentString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentString")
    public void set_contentString(Element _contentString) {
        this._contentString = _contentString;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("contentAttachment")
    public Attachment getContentAttachment() {
        return contentAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("contentAttachment")
    public void setContentAttachment(Attachment contentAttachment) {
        this.contentAttachment = contentAttachment;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("contentReference")
    public Reference getContentReference() {
        return contentReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("contentReference")
    public void setContentReference(Reference contentReference) {
        this.contentReference = contentReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommunicationRequest_Payload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("contentString");
        sb.append('=');
        sb.append(((this.contentString == null)?"<null>":this.contentString));
        sb.append(',');
        sb.append("_contentString");
        sb.append('=');
        sb.append(((this._contentString == null)?"<null>":this._contentString));
        sb.append(',');
        sb.append("contentAttachment");
        sb.append('=');
        sb.append(((this.contentAttachment == null)?"<null>":this.contentAttachment));
        sb.append(',');
        sb.append("contentReference");
        sb.append('=');
        sb.append(((this.contentReference == null)?"<null>":this.contentReference));
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
        result = ((result* 31)+((this._contentString == null)? 0 :this._contentString.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.contentReference == null)? 0 :this.contentReference.hashCode()));
        result = ((result* 31)+((this.contentString == null)? 0 :this.contentString.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.contentAttachment == null)? 0 :this.contentAttachment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommunicationRequest_Payload) == false) {
            return false;
        }
        CommunicationRequest_Payload rhs = ((CommunicationRequest_Payload) other);
        return ((((((((this._contentString == rhs._contentString)||((this._contentString!= null)&&this._contentString.equals(rhs._contentString)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.contentReference == rhs.contentReference)||((this.contentReference!= null)&&this.contentReference.equals(rhs.contentReference))))&&((this.contentString == rhs.contentString)||((this.contentString!= null)&&this.contentString.equals(rhs.contentString))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.contentAttachment == rhs.contentAttachment)||((this.contentAttachment!= null)&&this.contentAttachment.equals(rhs.contentAttachment))));
    }

}
