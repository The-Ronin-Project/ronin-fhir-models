
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
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "code",
    "_code",
    "documentation",
    "_documentation"
})
@Generated("jsonschema2pojo")
public class CapabilityStatement_Interaction1 {

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
     * A coded identifier of the operation, supported by the system.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A coded identifier of the operation, supported by the system.")
    private CapabilityStatement_Interaction1 .Code code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String documentation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _documentation;

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
     * A coded identifier of the operation, supported by the system.
     * 
     */
    @JsonProperty("code")
    public CapabilityStatement_Interaction1 .Code getCode() {
        return code;
    }

    /**
     * A coded identifier of the operation, supported by the system.
     * 
     */
    @JsonProperty("code")
    public void setCode(CapabilityStatement_Interaction1 .Code code) {
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
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    public String getDocumentation() {
        return documentation;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("documentation")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    public Element get_documentation() {
        return _documentation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_documentation")
    public void set_documentation(Element _documentation) {
        this._documentation = _documentation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CapabilityStatement_Interaction1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("_documentation");
        sb.append('=');
        sb.append(((this._documentation == null)?"<null>":this._documentation));
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
        result = ((result* 31)+((this._documentation == null)? 0 :this._documentation.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapabilityStatement_Interaction1) == false) {
            return false;
        }
        CapabilityStatement_Interaction1 rhs = ((CapabilityStatement_Interaction1) other);
        return ((((((((this._documentation == rhs._documentation)||((this._documentation!= null)&&this._documentation.equals(rhs._documentation)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }


    /**
     * A coded identifier of the operation, supported by the system.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Code {

        TRANSACTION("transaction"),
        BATCH("batch"),
        SEARCH_SYSTEM("search-system"),
        HISTORY_SYSTEM("history-system");
        private final String value;
        private final static Map<String, CapabilityStatement_Interaction1 .Code> CONSTANTS = new HashMap<String, CapabilityStatement_Interaction1 .Code>();

        static {
            for (CapabilityStatement_Interaction1 .Code c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Code(String value) {
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
        public static CapabilityStatement_Interaction1 .Code fromValue(String value) {
            CapabilityStatement_Interaction1 .Code constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
