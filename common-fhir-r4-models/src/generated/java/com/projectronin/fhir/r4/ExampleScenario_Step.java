
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Example of workflow instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "process",
    "pause",
    "_pause",
    "operation",
    "alternative"
})
@Generated("jsonschema2pojo")
public class ExampleScenario_Step {

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
     * Nested process.
     * 
     */
    @JsonProperty("process")
    @JsonPropertyDescription("Nested process.")
    private List<ExampleScenario_Process> process = new ArrayList<ExampleScenario_Process>();
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("pause")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean pause;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_pause")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _pause;
    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("Example of workflow instance.")
    private ExampleScenario_Operation operation;
    /**
     * Indicates an alternative step that can be taken instead of the operations on the base step in exceptional/atypical circumstances.
     * 
     */
    @JsonProperty("alternative")
    @JsonPropertyDescription("Indicates an alternative step that can be taken instead of the operations on the base step in exceptional/atypical circumstances.")
    private List<ExampleScenario_Alternative> alternative = new ArrayList<ExampleScenario_Alternative>();

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
     * Nested process.
     * 
     */
    @JsonProperty("process")
    public List<ExampleScenario_Process> getProcess() {
        return process;
    }

    /**
     * Nested process.
     * 
     */
    @JsonProperty("process")
    public void setProcess(List<ExampleScenario_Process> process) {
        this.process = process;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("pause")
    public Boolean getPause() {
        return pause;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("pause")
    public void setPause(Boolean pause) {
        this.pause = pause;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_pause")
    public Element get_pause() {
        return _pause;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_pause")
    public void set_pause(Element _pause) {
        this._pause = _pause;
    }

    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("operation")
    public ExampleScenario_Operation getOperation() {
        return operation;
    }

    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("operation")
    public void setOperation(ExampleScenario_Operation operation) {
        this.operation = operation;
    }

    /**
     * Indicates an alternative step that can be taken instead of the operations on the base step in exceptional/atypical circumstances.
     * 
     */
    @JsonProperty("alternative")
    public List<ExampleScenario_Alternative> getAlternative() {
        return alternative;
    }

    /**
     * Indicates an alternative step that can be taken instead of the operations on the base step in exceptional/atypical circumstances.
     * 
     */
    @JsonProperty("alternative")
    public void setAlternative(List<ExampleScenario_Alternative> alternative) {
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExampleScenario_Step.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("process");
        sb.append('=');
        sb.append(((this.process == null)?"<null>":this.process));
        sb.append(',');
        sb.append("pause");
        sb.append('=');
        sb.append(((this.pause == null)?"<null>":this.pause));
        sb.append(',');
        sb.append("_pause");
        sb.append('=');
        sb.append(((this._pause == null)?"<null>":this._pause));
        sb.append(',');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("alternative");
        sb.append('=');
        sb.append(((this.alternative == null)?"<null>":this.alternative));
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
        result = ((result* 31)+((this.process == null)? 0 :this.process.hashCode()));
        result = ((result* 31)+((this._pause == null)? 0 :this._pause.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.alternative == null)? 0 :this.alternative.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        result = ((result* 31)+((this.pause == null)? 0 :this.pause.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExampleScenario_Step) == false) {
            return false;
        }
        ExampleScenario_Step rhs = ((ExampleScenario_Step) other);
        return (((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.process == rhs.process)||((this.process!= null)&&this.process.equals(rhs.process))))&&((this._pause == rhs._pause)||((this._pause!= null)&&this._pause.equals(rhs._pause))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.alternative == rhs.alternative)||((this.alternative!= null)&&this.alternative.equals(rhs.alternative))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))))&&((this.pause == rhs.pause)||((this.pause!= null)&&this.pause.equals(rhs.pause))));
    }

}
