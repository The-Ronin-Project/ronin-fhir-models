
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
    "number",
    "_number",
    "type",
    "_type",
    "name",
    "_name",
    "initiator",
    "_initiator",
    "receiver",
    "_receiver",
    "description",
    "_description",
    "initiatorActive",
    "_initiatorActive",
    "receiverActive",
    "_receiverActive",
    "request",
    "response"
})
@Generated("jsonschema2pojo")
public class ExampleScenario_Operation {

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String number;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_number")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _number;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
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
    @JsonProperty("initiator")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String initiator;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initiator")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _initiator;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("receiver")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String receiver;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receiver")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _receiver;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String description;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_description")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _description;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("initiatorActive")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean initiatorActive;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initiatorActive")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _initiatorActive;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("receiverActive")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean receiverActive;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receiverActive")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _receiverActive;
    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("Example of workflow instance.")
    private ExampleScenario_ContainedInstance request;
    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("Example of workflow instance.")
    private ExampleScenario_ContainedInstance response;

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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_number")
    public Element get_number() {
        return _number;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_number")
    public void set_number(Element _number) {
        this._number = _number;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
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
    @JsonProperty("initiator")
    public String getInitiator() {
        return initiator;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("initiator")
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initiator")
    public Element get_initiator() {
        return _initiator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initiator")
    public void set_initiator(Element _initiator) {
        this._initiator = _initiator;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("receiver")
    public String getReceiver() {
        return receiver;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("receiver")
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receiver")
    public Element get_receiver() {
        return _receiver;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receiver")
    public void set_receiver(Element _receiver) {
        this._receiver = _receiver;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
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
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("initiatorActive")
    public Boolean getInitiatorActive() {
        return initiatorActive;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("initiatorActive")
    public void setInitiatorActive(Boolean initiatorActive) {
        this.initiatorActive = initiatorActive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initiatorActive")
    public Element get_initiatorActive() {
        return _initiatorActive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_initiatorActive")
    public void set_initiatorActive(Element _initiatorActive) {
        this._initiatorActive = _initiatorActive;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("receiverActive")
    public Boolean getReceiverActive() {
        return receiverActive;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("receiverActive")
    public void setReceiverActive(Boolean receiverActive) {
        this.receiverActive = receiverActive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receiverActive")
    public Element get_receiverActive() {
        return _receiverActive;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_receiverActive")
    public void set_receiverActive(Element _receiverActive) {
        this._receiverActive = _receiverActive;
    }

    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("request")
    public ExampleScenario_ContainedInstance getRequest() {
        return request;
    }

    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("request")
    public void setRequest(ExampleScenario_ContainedInstance request) {
        this.request = request;
    }

    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("response")
    public ExampleScenario_ContainedInstance getResponse() {
        return response;
    }

    /**
     * Example of workflow instance.
     * 
     */
    @JsonProperty("response")
    public void setResponse(ExampleScenario_ContainedInstance response) {
        this.response = response;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExampleScenario_Operation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("_number");
        sb.append('=');
        sb.append(((this._number == null)?"<null>":this._number));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("initiator");
        sb.append('=');
        sb.append(((this.initiator == null)?"<null>":this.initiator));
        sb.append(',');
        sb.append("_initiator");
        sb.append('=');
        sb.append(((this._initiator == null)?"<null>":this._initiator));
        sb.append(',');
        sb.append("receiver");
        sb.append('=');
        sb.append(((this.receiver == null)?"<null>":this.receiver));
        sb.append(',');
        sb.append("_receiver");
        sb.append('=');
        sb.append(((this._receiver == null)?"<null>":this._receiver));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("initiatorActive");
        sb.append('=');
        sb.append(((this.initiatorActive == null)?"<null>":this.initiatorActive));
        sb.append(',');
        sb.append("_initiatorActive");
        sb.append('=');
        sb.append(((this._initiatorActive == null)?"<null>":this._initiatorActive));
        sb.append(',');
        sb.append("receiverActive");
        sb.append('=');
        sb.append(((this.receiverActive == null)?"<null>":this.receiverActive));
        sb.append(',');
        sb.append("_receiverActive");
        sb.append('=');
        sb.append(((this._receiverActive == null)?"<null>":this._receiverActive));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
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
        result = ((result* 31)+((this._number == null)? 0 :this._number.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.receiver == null)? 0 :this.receiver.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.initiator == null)? 0 :this.initiator.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.receiverActive == null)? 0 :this.receiverActive.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._initiator == null)? 0 :this._initiator.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.initiatorActive == null)? 0 :this.initiatorActive.hashCode()));
        result = ((result* 31)+((this._receiver == null)? 0 :this._receiver.hashCode()));
        result = ((result* 31)+((this._initiatorActive == null)? 0 :this._initiatorActive.hashCode()));
        result = ((result* 31)+((this._receiverActive == null)? 0 :this._receiverActive.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExampleScenario_Operation) == false) {
            return false;
        }
        ExampleScenario_Operation rhs = ((ExampleScenario_Operation) other);
        return ((((((((((((((((((((((this._number == rhs._number)||((this._number!= null)&&this._number.equals(rhs._number)))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.receiver == rhs.receiver)||((this.receiver!= null)&&this.receiver.equals(rhs.receiver))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.initiator == rhs.initiator)||((this.initiator!= null)&&this.initiator.equals(rhs.initiator))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.receiverActive == rhs.receiverActive)||((this.receiverActive!= null)&&this.receiverActive.equals(rhs.receiverActive))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._initiator == rhs._initiator)||((this._initiator!= null)&&this._initiator.equals(rhs._initiator))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.initiatorActive == rhs.initiatorActive)||((this.initiatorActive!= null)&&this.initiatorActive.equals(rhs.initiatorActive))))&&((this._receiver == rhs._receiver)||((this._receiver!= null)&&this._receiver.equals(rhs._receiver))))&&((this._initiatorActive == rhs._initiatorActive)||((this._initiatorActive!= null)&&this._initiatorActive.equals(rhs._initiatorActive))))&&((this._receiverActive == rhs._receiverActive)||((this._receiverActive!= null)&&this._receiverActive.equals(rhs._receiverActive))));
    }

}
