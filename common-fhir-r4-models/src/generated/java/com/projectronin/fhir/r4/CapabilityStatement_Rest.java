
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
    "mode",
    "_mode",
    "documentation",
    "_documentation",
    "security",
    "resource",
    "interaction",
    "searchParam",
    "operation",
    "compartment"
})
@Generated("jsonschema2pojo")
public class CapabilityStatement_Rest {

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
     * Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.")
    private CapabilityStatement_Rest.Mode mode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _mode;
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
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("security")
    @JsonPropertyDescription("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")
    private CapabilityStatement_Security security;
    /**
     * A specification of the restful capabilities of the solution for a specific resource type.
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("A specification of the restful capabilities of the solution for a specific resource type.")
    private List<CapabilityStatement_Resource> resource = new ArrayList<CapabilityStatement_Resource>();
    /**
     * A specification of restful operations supported by the system.
     * 
     */
    @JsonProperty("interaction")
    @JsonPropertyDescription("A specification of restful operations supported by the system.")
    private List<CapabilityStatement_Interaction1> interaction = new ArrayList<CapabilityStatement_Interaction1>();
    /**
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     * 
     */
    @JsonProperty("searchParam")
    @JsonPropertyDescription("Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.")
    private List<CapabilityStatement_SearchParam> searchParam = new ArrayList<CapabilityStatement_SearchParam>();
    /**
     * Definition of an operation or a named query together with its parameters and their meaning and type.
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("Definition of an operation or a named query together with its parameters and their meaning and type.")
    private List<CapabilityStatement_Operation> operation = new ArrayList<CapabilityStatement_Operation>();
    /**
     * An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL .
     * 
     */
    @JsonProperty("compartment")
    @JsonPropertyDescription("An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL .")
    private List<String> compartment = new ArrayList<String>();

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
     * Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
     * 
     */
    @JsonProperty("mode")
    public CapabilityStatement_Rest.Mode getMode() {
        return mode;
    }

    /**
     * Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
     * 
     */
    @JsonProperty("mode")
    public void setMode(CapabilityStatement_Rest.Mode mode) {
        this.mode = mode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    public Element get_mode() {
        return _mode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_mode")
    public void set_mode(Element _mode) {
        this._mode = _mode;
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

    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("security")
    public CapabilityStatement_Security getSecurity() {
        return security;
    }

    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     * 
     */
    @JsonProperty("security")
    public void setSecurity(CapabilityStatement_Security security) {
        this.security = security;
    }

    /**
     * A specification of the restful capabilities of the solution for a specific resource type.
     * 
     */
    @JsonProperty("resource")
    public List<CapabilityStatement_Resource> getResource() {
        return resource;
    }

    /**
     * A specification of the restful capabilities of the solution for a specific resource type.
     * 
     */
    @JsonProperty("resource")
    public void setResource(List<CapabilityStatement_Resource> resource) {
        this.resource = resource;
    }

    /**
     * A specification of restful operations supported by the system.
     * 
     */
    @JsonProperty("interaction")
    public List<CapabilityStatement_Interaction1> getInteraction() {
        return interaction;
    }

    /**
     * A specification of restful operations supported by the system.
     * 
     */
    @JsonProperty("interaction")
    public void setInteraction(List<CapabilityStatement_Interaction1> interaction) {
        this.interaction = interaction;
    }

    /**
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     * 
     */
    @JsonProperty("searchParam")
    public List<CapabilityStatement_SearchParam> getSearchParam() {
        return searchParam;
    }

    /**
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     * 
     */
    @JsonProperty("searchParam")
    public void setSearchParam(List<CapabilityStatement_SearchParam> searchParam) {
        this.searchParam = searchParam;
    }

    /**
     * Definition of an operation or a named query together with its parameters and their meaning and type.
     * 
     */
    @JsonProperty("operation")
    public List<CapabilityStatement_Operation> getOperation() {
        return operation;
    }

    /**
     * Definition of an operation or a named query together with its parameters and their meaning and type.
     * 
     */
    @JsonProperty("operation")
    public void setOperation(List<CapabilityStatement_Operation> operation) {
        this.operation = operation;
    }

    /**
     * An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL .
     * 
     */
    @JsonProperty("compartment")
    public List<String> getCompartment() {
        return compartment;
    }

    /**
     * An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL .
     * 
     */
    @JsonProperty("compartment")
    public void setCompartment(List<String> compartment) {
        this.compartment = compartment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CapabilityStatement_Rest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("_mode");
        sb.append('=');
        sb.append(((this._mode == null)?"<null>":this._mode));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("_documentation");
        sb.append('=');
        sb.append(((this._documentation == null)?"<null>":this._documentation));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("interaction");
        sb.append('=');
        sb.append(((this.interaction == null)?"<null>":this.interaction));
        sb.append(',');
        sb.append("searchParam");
        sb.append('=');
        sb.append(((this.searchParam == null)?"<null>":this.searchParam));
        sb.append(',');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("compartment");
        sb.append('=');
        sb.append(((this.compartment == null)?"<null>":this.compartment));
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
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.searchParam == null)? 0 :this.searchParam.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        result = ((result* 31)+((this._mode == null)? 0 :this._mode.hashCode()));
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this._documentation == null)? 0 :this._documentation.hashCode()));
        result = ((result* 31)+((this.security == null)? 0 :this.security.hashCode()));
        result = ((result* 31)+((this.interaction == null)? 0 :this.interaction.hashCode()));
        result = ((result* 31)+((this.compartment == null)? 0 :this.compartment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapabilityStatement_Rest) == false) {
            return false;
        }
        CapabilityStatement_Rest rhs = ((CapabilityStatement_Rest) other);
        return ((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.searchParam == rhs.searchParam)||((this.searchParam!= null)&&this.searchParam.equals(rhs.searchParam))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))))&&((this._mode == rhs._mode)||((this._mode!= null)&&this._mode.equals(rhs._mode))))&&((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode))))&&((this._documentation == rhs._documentation)||((this._documentation!= null)&&this._documentation.equals(rhs._documentation))))&&((this.security == rhs.security)||((this.security!= null)&&this.security.equals(rhs.security))))&&((this.interaction == rhs.interaction)||((this.interaction!= null)&&this.interaction.equals(rhs.interaction))))&&((this.compartment == rhs.compartment)||((this.compartment!= null)&&this.compartment.equals(rhs.compartment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))));
    }


    /**
     * Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Mode {

        CLIENT("client"),
        SERVER("server");
        private final String value;
        private final static Map<String, CapabilityStatement_Rest.Mode> CONSTANTS = new HashMap<String, CapabilityStatement_Rest.Mode>();

        static {
            for (CapabilityStatement_Rest.Mode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Mode(String value) {
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
        public static CapabilityStatement_Rest.Mode fromValue(String value) {
            CapabilityStatement_Rest.Mode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
