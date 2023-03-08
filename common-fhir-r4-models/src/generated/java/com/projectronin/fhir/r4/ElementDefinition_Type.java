
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
 * Captures constraints on each element within the resource, profile, or extension.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "_code",
    "profile",
    "targetProfile",
    "aggregation",
    "_aggregation",
    "versioning",
    "_versioning"
})
@Generated("jsonschema2pojo")
public class ElementDefinition_Type {

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * Identifies a profile structure or implementation Guide that applies to the datatype this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the type SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("Identifies a profile structure or implementation Guide that applies to the datatype this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the type SHALL conform to at least one profile defined in the implementation guide.")
    private List<String> profile = new ArrayList<String>();
    /**
     * Used when the type is &quot;Reference&quot; or &quot;canonical&quot;, and identifies a profile structure or implementation Guide that applies to the target of the reference this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("targetProfile")
    @JsonPropertyDescription("Used when the type is \"Reference\" or \"canonical\", and identifies a profile structure or implementation Guide that applies to the target of the reference this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.")
    private List<String> targetProfile = new ArrayList<String>();
    /**
     * If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
     * 
     */
    @JsonProperty("aggregation")
    @JsonPropertyDescription("If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.")
    private List<Aggregation> aggregation = new ArrayList<Aggregation>();
    /**
     * Extensions for aggregation
     * 
     */
    @JsonProperty("_aggregation")
    @JsonPropertyDescription("Extensions for aggregation")
    private List<Element> _aggregation = new ArrayList<Element>();
    /**
     * Whether this reference needs to be version specific or version independent, or whether either can be used.
     * 
     */
    @JsonProperty("versioning")
    @JsonPropertyDescription("Whether this reference needs to be version specific or version independent, or whether either can be used.")
    private ElementDefinition_Type.Versioning versioning;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versioning")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _versioning;

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
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public Element get_code() {
        return _code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public void set_code(Element _code) {
        this._code = _code;
    }

    /**
     * Identifies a profile structure or implementation Guide that applies to the datatype this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the type SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("profile")
    public List<String> getProfile() {
        return profile;
    }

    /**
     * Identifies a profile structure or implementation Guide that applies to the datatype this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the type SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("profile")
    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

    /**
     * Used when the type is &quot;Reference&quot; or &quot;canonical&quot;, and identifies a profile structure or implementation Guide that applies to the target of the reference this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("targetProfile")
    public List<String> getTargetProfile() {
        return targetProfile;
    }

    /**
     * Used when the type is &quot;Reference&quot; or &quot;canonical&quot;, and identifies a profile structure or implementation Guide that applies to the target of the reference this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.
     * 
     */
    @JsonProperty("targetProfile")
    public void setTargetProfile(List<String> targetProfile) {
        this.targetProfile = targetProfile;
    }

    /**
     * If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
     * 
     */
    @JsonProperty("aggregation")
    public List<Aggregation> getAggregation() {
        return aggregation;
    }

    /**
     * If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
     * 
     */
    @JsonProperty("aggregation")
    public void setAggregation(List<Aggregation> aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * Extensions for aggregation
     * 
     */
    @JsonProperty("_aggregation")
    public List<Element> get_aggregation() {
        return _aggregation;
    }

    /**
     * Extensions for aggregation
     * 
     */
    @JsonProperty("_aggregation")
    public void set_aggregation(List<Element> _aggregation) {
        this._aggregation = _aggregation;
    }

    /**
     * Whether this reference needs to be version specific or version independent, or whether either can be used.
     * 
     */
    @JsonProperty("versioning")
    public ElementDefinition_Type.Versioning getVersioning() {
        return versioning;
    }

    /**
     * Whether this reference needs to be version specific or version independent, or whether either can be used.
     * 
     */
    @JsonProperty("versioning")
    public void setVersioning(ElementDefinition_Type.Versioning versioning) {
        this.versioning = versioning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versioning")
    public Element get_versioning() {
        return _versioning;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versioning")
    public void set_versioning(Element _versioning) {
        this._versioning = _versioning;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElementDefinition_Type.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("targetProfile");
        sb.append('=');
        sb.append(((this.targetProfile == null)?"<null>":this.targetProfile));
        sb.append(',');
        sb.append("aggregation");
        sb.append('=');
        sb.append(((this.aggregation == null)?"<null>":this.aggregation));
        sb.append(',');
        sb.append("_aggregation");
        sb.append('=');
        sb.append(((this._aggregation == null)?"<null>":this._aggregation));
        sb.append(',');
        sb.append("versioning");
        sb.append('=');
        sb.append(((this.versioning == null)?"<null>":this.versioning));
        sb.append(',');
        sb.append("_versioning");
        sb.append('=');
        sb.append(((this._versioning == null)?"<null>":this._versioning));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.versioning == null)? 0 :this.versioning.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this._aggregation == null)? 0 :this._aggregation.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.targetProfile == null)? 0 :this.targetProfile.hashCode()));
        result = ((result* 31)+((this.aggregation == null)? 0 :this.aggregation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._versioning == null)? 0 :this._versioning.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElementDefinition_Type) == false) {
            return false;
        }
        ElementDefinition_Type rhs = ((ElementDefinition_Type) other);
        return ((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.versioning == rhs.versioning)||((this.versioning!= null)&&this.versioning.equals(rhs.versioning))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this._aggregation == rhs._aggregation)||((this._aggregation!= null)&&this._aggregation.equals(rhs._aggregation))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.targetProfile == rhs.targetProfile)||((this.targetProfile!= null)&&this.targetProfile.equals(rhs.targetProfile))))&&((this.aggregation == rhs.aggregation)||((this.aggregation!= null)&&this.aggregation.equals(rhs.aggregation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._versioning == rhs._versioning)||((this._versioning!= null)&&this._versioning.equals(rhs._versioning))));
    }


    /**
     * Whether this reference needs to be version specific or version independent, or whether either can be used.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Versioning {

        EITHER("either"),
        INDEPENDENT("independent"),
        SPECIFIC("specific");
        private final String value;
        private final static Map<String, ElementDefinition_Type.Versioning> CONSTANTS = new HashMap<String, ElementDefinition_Type.Versioning>();

        static {
            for (ElementDefinition_Type.Versioning c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Versioning(String value) {
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
        public static ElementDefinition_Type.Versioning fromValue(String value) {
            ElementDefinition_Type.Versioning constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
