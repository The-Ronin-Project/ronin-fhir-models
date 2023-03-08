
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
 * A collection of error, warning, or information messages that result from a system action.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "severity",
    "_severity",
    "code",
    "_code",
    "details",
    "diagnostics",
    "_diagnostics",
    "location",
    "_location",
    "expression",
    "_expression"
})
@Generated("jsonschema2pojo")
public class OperationOutcome_Issue {

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
     * Indicates whether the issue indicates a variation from successful processing.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Indicates whether the issue indicates a variation from successful processing.")
    private OperationOutcome_Issue.Severity severity;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _severity;
    /**
     * Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.")
    private OperationOutcome_Issue.Code code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("details")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept details;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("diagnostics")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String diagnostics;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_diagnostics")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _diagnostics;
    /**
     * This element is deprecated because it is XML specific. It is replaced by issue.expression, which is format independent, and simpler to parse. 
     * 
     * For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be &quot;http.&quot; + the parameter name.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("This element is deprecated because it is XML specific. It is replaced by issue.expression, which is format independent, and simpler to parse. \n\nFor resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be \"http.\" + the parameter name.")
    private List<String> location = new ArrayList<String>();
    /**
     * Extensions for location
     * 
     */
    @JsonProperty("_location")
    @JsonPropertyDescription("Extensions for location")
    private List<Element> _location = new ArrayList<Element>();
    /**
     * A [simple subset of FHIRPath](fhirpath.html#simple) limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.
     * 
     */
    @JsonProperty("expression")
    @JsonPropertyDescription("A [simple subset of FHIRPath](fhirpath.html#simple) limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.")
    private List<String> expression = new ArrayList<String>();
    /**
     * Extensions for expression
     * 
     */
    @JsonProperty("_expression")
    @JsonPropertyDescription("Extensions for expression")
    private List<Element> _expression = new ArrayList<Element>();

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
     * Indicates whether the issue indicates a variation from successful processing.
     * 
     */
    @JsonProperty("severity")
    public OperationOutcome_Issue.Severity getSeverity() {
        return severity;
    }

    /**
     * Indicates whether the issue indicates a variation from successful processing.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(OperationOutcome_Issue.Severity severity) {
        this.severity = severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public Element get_severity() {
        return _severity;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_severity")
    public void set_severity(Element _severity) {
        this._severity = _severity;
    }

    /**
     * Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
     * 
     */
    @JsonProperty("code")
    public OperationOutcome_Issue.Code getCode() {
        return code;
    }

    /**
     * Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
     * 
     */
    @JsonProperty("code")
    public void setCode(OperationOutcome_Issue.Code code) {
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("details")
    public CodeableConcept getDetails() {
        return details;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("details")
    public void setDetails(CodeableConcept details) {
        this.details = details;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("diagnostics")
    public String getDiagnostics() {
        return diagnostics;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("diagnostics")
    public void setDiagnostics(String diagnostics) {
        this.diagnostics = diagnostics;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_diagnostics")
    public Element get_diagnostics() {
        return _diagnostics;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_diagnostics")
    public void set_diagnostics(Element _diagnostics) {
        this._diagnostics = _diagnostics;
    }

    /**
     * This element is deprecated because it is XML specific. It is replaced by issue.expression, which is format independent, and simpler to parse. 
     * 
     * For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be &quot;http.&quot; + the parameter name.
     * 
     */
    @JsonProperty("location")
    public List<String> getLocation() {
        return location;
    }

    /**
     * This element is deprecated because it is XML specific. It is replaced by issue.expression, which is format independent, and simpler to parse. 
     * 
     * For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be &quot;http.&quot; + the parameter name.
     * 
     */
    @JsonProperty("location")
    public void setLocation(List<String> location) {
        this.location = location;
    }

    /**
     * Extensions for location
     * 
     */
    @JsonProperty("_location")
    public List<Element> get_location() {
        return _location;
    }

    /**
     * Extensions for location
     * 
     */
    @JsonProperty("_location")
    public void set_location(List<Element> _location) {
        this._location = _location;
    }

    /**
     * A [simple subset of FHIRPath](fhirpath.html#simple) limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.
     * 
     */
    @JsonProperty("expression")
    public List<String> getExpression() {
        return expression;
    }

    /**
     * A [simple subset of FHIRPath](fhirpath.html#simple) limited to element names, repetition indicators and the default child accessor that identifies one of the elements in the resource that caused this issue to be raised.
     * 
     */
    @JsonProperty("expression")
    public void setExpression(List<String> expression) {
        this.expression = expression;
    }

    /**
     * Extensions for expression
     * 
     */
    @JsonProperty("_expression")
    public List<Element> get_expression() {
        return _expression;
    }

    /**
     * Extensions for expression
     * 
     */
    @JsonProperty("_expression")
    public void set_expression(List<Element> _expression) {
        this._expression = _expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperationOutcome_Issue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("_severity");
        sb.append('=');
        sb.append(((this._severity == null)?"<null>":this._severity));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
        sb.append(',');
        sb.append("details");
        sb.append('=');
        sb.append(((this.details == null)?"<null>":this.details));
        sb.append(',');
        sb.append("diagnostics");
        sb.append('=');
        sb.append(((this.diagnostics == null)?"<null>":this.diagnostics));
        sb.append(',');
        sb.append("_diagnostics");
        sb.append('=');
        sb.append(((this._diagnostics == null)?"<null>":this._diagnostics));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("_location");
        sb.append('=');
        sb.append(((this._location == null)?"<null>":this._location));
        sb.append(',');
        sb.append("expression");
        sb.append('=');
        sb.append(((this.expression == null)?"<null>":this.expression));
        sb.append(',');
        sb.append("_expression");
        sb.append('=');
        sb.append(((this._expression == null)?"<null>":this._expression));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this._location == null)? 0 :this._location.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._diagnostics == null)? 0 :this._diagnostics.hashCode()));
        result = ((result* 31)+((this._expression == null)? 0 :this._expression.hashCode()));
        result = ((result* 31)+((this.diagnostics == null)? 0 :this.diagnostics.hashCode()));
        result = ((result* 31)+((this.details == null)? 0 :this.details.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._severity == null)? 0 :this._severity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperationOutcome_Issue) == false) {
            return false;
        }
        OperationOutcome_Issue rhs = ((OperationOutcome_Issue) other);
        return (((((((((((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this._location == rhs._location)||((this._location!= null)&&this._location.equals(rhs._location))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._diagnostics == rhs._diagnostics)||((this._diagnostics!= null)&&this._diagnostics.equals(rhs._diagnostics))))&&((this._expression == rhs._expression)||((this._expression!= null)&&this._expression.equals(rhs._expression))))&&((this.diagnostics == rhs.diagnostics)||((this.diagnostics!= null)&&this.diagnostics.equals(rhs.diagnostics))))&&((this.details == rhs.details)||((this.details!= null)&&this.details.equals(rhs.details))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._severity == rhs._severity)||((this._severity!= null)&&this._severity.equals(rhs._severity))));
    }


    /**
     * Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Code {

        INVALID("invalid"),
        STRUCTURE("structure"),
        REQUIRED("required"),
        VALUE("value"),
        INVARIANT("invariant"),
        SECURITY("security"),
        LOGIN("login"),
        UNKNOWN("unknown"),
        EXPIRED("expired"),
        FORBIDDEN("forbidden"),
        SUPPRESSED("suppressed"),
        PROCESSING("processing"),
        NOT_SUPPORTED("not-supported"),
        DUPLICATE("duplicate"),
        MULTIPLE_MATCHES("multiple-matches"),
        NOT_FOUND("not-found"),
        DELETED("deleted"),
        TOO_LONG("too-long"),
        CODE_INVALID("code-invalid"),
        EXTENSION("extension"),
        TOO_COSTLY("too-costly"),
        BUSINESS_RULE("business-rule"),
        CONFLICT("conflict"),
        TRANSIENT("transient"),
        LOCK_ERROR("lock-error"),
        NO_STORE("no-store"),
        EXCEPTION("exception"),
        TIMEOUT("timeout"),
        INCOMPLETE("incomplete"),
        THROTTLED("throttled"),
        INFORMATIONAL("informational");
        private final String value;
        private final static Map<String, OperationOutcome_Issue.Code> CONSTANTS = new HashMap<String, OperationOutcome_Issue.Code>();

        static {
            for (OperationOutcome_Issue.Code c: values()) {
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
        public static OperationOutcome_Issue.Code fromValue(String value) {
            OperationOutcome_Issue.Code constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Indicates whether the issue indicates a variation from successful processing.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Severity {

        FATAL("fatal"),
        ERROR("error"),
        WARNING("warning"),
        INFORMATION("information");
        private final String value;
        private final static Map<String, OperationOutcome_Issue.Severity> CONSTANTS = new HashMap<String, OperationOutcome_Issue.Severity>();

        static {
            for (OperationOutcome_Issue.Severity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Severity(String value) {
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
        public static OperationOutcome_Issue.Severity fromValue(String value) {
            OperationOutcome_Issue.Severity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
