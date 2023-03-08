
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "requestIdentifier",
    "identifier",
    "moduleUri",
    "_moduleUri",
    "moduleCanonical",
    "_moduleCanonical",
    "moduleCodeableConcept",
    "status",
    "_status",
    "subject",
    "encounter",
    "occurrenceDateTime",
    "_occurrenceDateTime",
    "performer",
    "reasonCode",
    "reasonReference",
    "note",
    "evaluationMessage",
    "outputParameters",
    "result",
    "dataRequirement"
})
@Generated("jsonschema2pojo")
public class GuidanceResponse
    extends DomainResource
{

    /**
     * This is a GuidanceResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a GuidanceResponse resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("requestIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier requestIdentifier;
    /**
     * Allows a service to provide  unique, business identifiers for the response.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Allows a service to provide  unique, business identifiers for the response.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
     * 
     */
    @JsonProperty("moduleUri")
    @JsonPropertyDescription("An identifier, CodeableConcept or canonical reference to the guidance that was requested.")
    private String moduleUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_moduleUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _moduleUri;
    /**
     * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
     * 
     */
    @JsonProperty("moduleCanonical")
    @JsonPropertyDescription("An identifier, CodeableConcept or canonical reference to the guidance that was requested.")
    private String moduleCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_moduleCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _moduleCanonical;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("moduleCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept moduleCodeableConcept;
    /**
     * The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.")
    private GuidanceResponse.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subject;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String occurrenceDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _occurrenceDateTime;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference performer;
    /**
     * Describes the reason for the guidance response in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Describes the reason for the guidance response in coded or textual form.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * Provides a mechanism to communicate additional information about the response.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Provides a mechanism to communicate additional information about the response.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
     * 
     */
    @JsonProperty("evaluationMessage")
    @JsonPropertyDescription("Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.")
    private List<Reference> evaluationMessage = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("outputParameters")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference outputParameters;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("result")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference result;
    /**
     * If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
     * 
     */
    @JsonProperty("dataRequirement")
    @JsonPropertyDescription("If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.")
    private List<DataRequirement> dataRequirement = new ArrayList<DataRequirement>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a GuidanceResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a GuidanceResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("requestIdentifier")
    public Identifier getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("requestIdentifier")
    public void setRequestIdentifier(Identifier requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * Allows a service to provide  unique, business identifiers for the response.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Allows a service to provide  unique, business identifiers for the response.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
     * 
     */
    @JsonProperty("moduleUri")
    public String getModuleUri() {
        return moduleUri;
    }

    /**
     * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
     * 
     */
    @JsonProperty("moduleUri")
    public void setModuleUri(String moduleUri) {
        this.moduleUri = moduleUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_moduleUri")
    public Element get_moduleUri() {
        return _moduleUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_moduleUri")
    public void set_moduleUri(Element _moduleUri) {
        this._moduleUri = _moduleUri;
    }

    /**
     * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
     * 
     */
    @JsonProperty("moduleCanonical")
    public String getModuleCanonical() {
        return moduleCanonical;
    }

    /**
     * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
     * 
     */
    @JsonProperty("moduleCanonical")
    public void setModuleCanonical(String moduleCanonical) {
        this.moduleCanonical = moduleCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_moduleCanonical")
    public Element get_moduleCanonical() {
        return _moduleCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_moduleCanonical")
    public void set_moduleCanonical(Element _moduleCanonical) {
        this._moduleCanonical = _moduleCanonical;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("moduleCodeableConcept")
    public CodeableConcept getModuleCodeableConcept() {
        return moduleCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("moduleCodeableConcept")
    public void setModuleCodeableConcept(CodeableConcept moduleCodeableConcept) {
        this.moduleCodeableConcept = moduleCodeableConcept;
    }

    /**
     * The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
     * 
     */
    @JsonProperty("status")
    public GuidanceResponse.Status getStatus() {
        return status;
    }

    /**
     * The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
     * 
     */
    @JsonProperty("status")
    public void setStatus(GuidanceResponse.Status status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public Reference getSubject() {
        return subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(Reference encounter) {
        this.encounter = encounter;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public Element get_occurrenceDateTime() {
        return _occurrenceDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_occurrenceDateTime")
    public void set_occurrenceDateTime(Element _occurrenceDateTime) {
        this._occurrenceDateTime = _occurrenceDateTime;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public Reference getPerformer() {
        return performer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("performer")
    public void setPerformer(Reference performer) {
        this.performer = performer;
    }

    /**
     * Describes the reason for the guidance response in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Describes the reason for the guidance response in coded or textual form.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * Provides a mechanism to communicate additional information about the response.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Provides a mechanism to communicate additional information about the response.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
     * 
     */
    @JsonProperty("evaluationMessage")
    public List<Reference> getEvaluationMessage() {
        return evaluationMessage;
    }

    /**
     * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
     * 
     */
    @JsonProperty("evaluationMessage")
    public void setEvaluationMessage(List<Reference> evaluationMessage) {
        this.evaluationMessage = evaluationMessage;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("outputParameters")
    public Reference getOutputParameters() {
        return outputParameters;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("outputParameters")
    public void setOutputParameters(Reference outputParameters) {
        this.outputParameters = outputParameters;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("result")
    public Reference getResult() {
        return result;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("result")
    public void setResult(Reference result) {
        this.result = result;
    }

    /**
     * If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
     * 
     */
    @JsonProperty("dataRequirement")
    public List<DataRequirement> getDataRequirement() {
        return dataRequirement;
    }

    /**
     * If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
     * 
     */
    @JsonProperty("dataRequirement")
    public void setDataRequirement(List<DataRequirement> dataRequirement) {
        this.dataRequirement = dataRequirement;
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
        sb.append(GuidanceResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("requestIdentifier");
        sb.append('=');
        sb.append(((this.requestIdentifier == null)?"<null>":this.requestIdentifier));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("moduleUri");
        sb.append('=');
        sb.append(((this.moduleUri == null)?"<null>":this.moduleUri));
        sb.append(',');
        sb.append("_moduleUri");
        sb.append('=');
        sb.append(((this._moduleUri == null)?"<null>":this._moduleUri));
        sb.append(',');
        sb.append("moduleCanonical");
        sb.append('=');
        sb.append(((this.moduleCanonical == null)?"<null>":this.moduleCanonical));
        sb.append(',');
        sb.append("_moduleCanonical");
        sb.append('=');
        sb.append(((this._moduleCanonical == null)?"<null>":this._moduleCanonical));
        sb.append(',');
        sb.append("moduleCodeableConcept");
        sb.append('=');
        sb.append(((this.moduleCodeableConcept == null)?"<null>":this.moduleCodeableConcept));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("occurrenceDateTime");
        sb.append('=');
        sb.append(((this.occurrenceDateTime == null)?"<null>":this.occurrenceDateTime));
        sb.append(',');
        sb.append("_occurrenceDateTime");
        sb.append('=');
        sb.append(((this._occurrenceDateTime == null)?"<null>":this._occurrenceDateTime));
        sb.append(',');
        sb.append("performer");
        sb.append('=');
        sb.append(((this.performer == null)?"<null>":this.performer));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("evaluationMessage");
        sb.append('=');
        sb.append(((this.evaluationMessage == null)?"<null>":this.evaluationMessage));
        sb.append(',');
        sb.append("outputParameters");
        sb.append('=');
        sb.append(((this.outputParameters == null)?"<null>":this.outputParameters));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("dataRequirement");
        sb.append('=');
        sb.append(((this.dataRequirement == null)?"<null>":this.dataRequirement));
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
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.performer == null)? 0 :this.performer.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.moduleCodeableConcept == null)? 0 :this.moduleCodeableConcept.hashCode()));
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.evaluationMessage == null)? 0 :this.evaluationMessage.hashCode()));
        result = ((result* 31)+((this.moduleCanonical == null)? 0 :this.moduleCanonical.hashCode()));
        result = ((result* 31)+((this._moduleCanonical == null)? 0 :this._moduleCanonical.hashCode()));
        result = ((result* 31)+((this.dataRequirement == null)? 0 :this.dataRequirement.hashCode()));
        result = ((result* 31)+((this.requestIdentifier == null)? 0 :this.requestIdentifier.hashCode()));
        result = ((result* 31)+((this.occurrenceDateTime == null)? 0 :this.occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this._occurrenceDateTime == null)? 0 :this._occurrenceDateTime.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.moduleUri == null)? 0 :this.moduleUri.hashCode()));
        result = ((result* 31)+((this._moduleUri == null)? 0 :this._moduleUri.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.outputParameters == null)? 0 :this.outputParameters.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GuidanceResponse) == false) {
            return false;
        }
        GuidanceResponse rhs = ((GuidanceResponse) other);
        return (((((((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.performer == rhs.performer)||((this.performer!= null)&&this.performer.equals(rhs.performer))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.moduleCodeableConcept == rhs.moduleCodeableConcept)||((this.moduleCodeableConcept!= null)&&this.moduleCodeableConcept.equals(rhs.moduleCodeableConcept))))&&((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result))))&&((this.evaluationMessage == rhs.evaluationMessage)||((this.evaluationMessage!= null)&&this.evaluationMessage.equals(rhs.evaluationMessage))))&&((this.moduleCanonical == rhs.moduleCanonical)||((this.moduleCanonical!= null)&&this.moduleCanonical.equals(rhs.moduleCanonical))))&&((this._moduleCanonical == rhs._moduleCanonical)||((this._moduleCanonical!= null)&&this._moduleCanonical.equals(rhs._moduleCanonical))))&&((this.dataRequirement == rhs.dataRequirement)||((this.dataRequirement!= null)&&this.dataRequirement.equals(rhs.dataRequirement))))&&((this.requestIdentifier == rhs.requestIdentifier)||((this.requestIdentifier!= null)&&this.requestIdentifier.equals(rhs.requestIdentifier))))&&((this.occurrenceDateTime == rhs.occurrenceDateTime)||((this.occurrenceDateTime!= null)&&this.occurrenceDateTime.equals(rhs.occurrenceDateTime))))&&((this._occurrenceDateTime == rhs._occurrenceDateTime)||((this._occurrenceDateTime!= null)&&this._occurrenceDateTime.equals(rhs._occurrenceDateTime))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.moduleUri == rhs.moduleUri)||((this.moduleUri!= null)&&this.moduleUri.equals(rhs.moduleUri))))&&((this._moduleUri == rhs._moduleUri)||((this._moduleUri!= null)&&this._moduleUri.equals(rhs._moduleUri))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.outputParameters == rhs.outputParameters)||((this.outputParameters!= null)&&this.outputParameters.equals(rhs.outputParameters))));
    }


    /**
     * The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        SUCCESS("success"),
        DATA_REQUESTED("data-requested"),
        DATA_REQUIRED("data-required"),
        IN_PROGRESS("in-progress"),
        FAILURE("failure"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, GuidanceResponse.Status> CONSTANTS = new HashMap<String, GuidanceResponse.Status>();

        static {
            for (GuidanceResponse.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static GuidanceResponse.Status fromValue(String value) {
            GuidanceResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
