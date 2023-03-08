
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
 * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "request",
    "outcome",
    "_outcome",
    "disposition",
    "_disposition",
    "created",
    "_created",
    "organization",
    "requestProvider"
})
@Generated("jsonschema2pojo")
public class EnrollmentResponse
    extends DomainResource
{

    /**
     * This is a EnrollmentResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a EnrollmentResponse resource")
    private String resourceType;
    /**
     * The Response business identifier.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("The Response business identifier.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String status;
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
    @JsonProperty("request")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference request;
    /**
     * Processing status: error, complete.
     * 
     */
    @JsonProperty("outcome")
    @JsonPropertyDescription("Processing status: error, complete.")
    private EnrollmentResponse.Outcome outcome;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _outcome;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String disposition;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _disposition;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String created;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _created;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference organization;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestProvider")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference requestProvider;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a EnrollmentResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a EnrollmentResponse resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The Response business identifier.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * The Response business identifier.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
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
    @JsonProperty("request")
    public Reference getRequest() {
        return request;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("request")
    public void setRequest(Reference request) {
        this.request = request;
    }

    /**
     * Processing status: error, complete.
     * 
     */
    @JsonProperty("outcome")
    public EnrollmentResponse.Outcome getOutcome() {
        return outcome;
    }

    /**
     * Processing status: error, complete.
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(EnrollmentResponse.Outcome outcome) {
        this.outcome = outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public Element get_outcome() {
        return _outcome;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_outcome")
    public void set_outcome(Element _outcome) {
        this._outcome = _outcome;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    public String getDisposition() {
        return disposition;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("disposition")
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public Element get_disposition() {
        return _disposition;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_disposition")
    public void set_disposition(Element _disposition) {
        this._disposition = _disposition;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public Element get_created() {
        return _created;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_created")
    public void set_created(Element _created) {
        this._created = _created;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    public Reference getOrganization() {
        return organization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(Reference organization) {
        this.organization = organization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestProvider")
    public Reference getRequestProvider() {
        return requestProvider;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("requestProvider")
    public void setRequestProvider(Reference requestProvider) {
        this.requestProvider = requestProvider;
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
        sb.append(EnrollmentResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
        sb.append(',');
        sb.append("_outcome");
        sb.append('=');
        sb.append(((this._outcome == null)?"<null>":this._outcome));
        sb.append(',');
        sb.append("disposition");
        sb.append('=');
        sb.append(((this.disposition == null)?"<null>":this.disposition));
        sb.append(',');
        sb.append("_disposition");
        sb.append('=');
        sb.append(((this._disposition == null)?"<null>":this._disposition));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("_created");
        sb.append('=');
        sb.append(((this._created == null)?"<null>":this._created));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("requestProvider");
        sb.append('=');
        sb.append(((this.requestProvider == null)?"<null>":this.requestProvider));
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
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this._outcome == null)? 0 :this._outcome.hashCode()));
        result = ((result* 31)+((this._disposition == null)? 0 :this._disposition.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.disposition == null)? 0 :this.disposition.hashCode()));
        result = ((result* 31)+((this.requestProvider == null)? 0 :this.requestProvider.hashCode()));
        result = ((result* 31)+((this._created == null)? 0 :this._created.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentResponse) == false) {
            return false;
        }
        EnrollmentResponse rhs = ((EnrollmentResponse) other);
        return ((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this._outcome == rhs._outcome)||((this._outcome!= null)&&this._outcome.equals(rhs._outcome))))&&((this._disposition == rhs._disposition)||((this._disposition!= null)&&this._disposition.equals(rhs._disposition))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.disposition == rhs.disposition)||((this.disposition!= null)&&this.disposition.equals(rhs.disposition))))&&((this.requestProvider == rhs.requestProvider)||((this.requestProvider!= null)&&this.requestProvider.equals(rhs.requestProvider))))&&((this._created == rhs._created)||((this._created!= null)&&this._created.equals(rhs._created))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Processing status: error, complete.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Outcome {

        QUEUED("queued"),
        COMPLETE("complete"),
        ERROR("error"),
        PARTIAL("partial");
        private final String value;
        private final static Map<String, EnrollmentResponse.Outcome> CONSTANTS = new HashMap<String, EnrollmentResponse.Outcome>();

        static {
            for (EnrollmentResponse.Outcome c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Outcome(String value) {
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
        public static EnrollmentResponse.Outcome fromValue(String value) {
            EnrollmentResponse.Outcome constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
