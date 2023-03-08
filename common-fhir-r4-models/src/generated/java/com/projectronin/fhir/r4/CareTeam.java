
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
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "category",
    "name",
    "_name",
    "subject",
    "encounter",
    "period",
    "participant",
    "reasonCode",
    "reasonReference",
    "managingOrganization",
    "telecom",
    "note"
})
@Generated("jsonschema2pojo")
public class CareTeam
    extends DomainResource
{

    /**
     * This is a CareTeam resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a CareTeam resource")
    private String resourceType;
    /**
     * Business identifiers assigned to this care team by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Business identifiers assigned to this care team by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * Indicates the current state of the care team.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Indicates the current state of the care team.")
    private CareTeam.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * Identifies all people and organizations who are expected to be involved in the care team.
     * 
     */
    @JsonProperty("participant")
    @JsonPropertyDescription("Identifies all people and organizations who are expected to be involved in the care team.")
    private List<CareTeam_Participant> participant = new ArrayList<CareTeam_Participant>();
    /**
     * Describes why the care team exists.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Describes why the care team exists.")
    private List<CodeableConcept> reasonCode = new ArrayList<CodeableConcept>();
    /**
     * Condition(s) that this care team addresses.
     * 
     */
    @JsonProperty("reasonReference")
    @JsonPropertyDescription("Condition(s) that this care team addresses.")
    private List<Reference> reasonReference = new ArrayList<Reference>();
    /**
     * The organization responsible for the care team.
     * 
     */
    @JsonProperty("managingOrganization")
    @JsonPropertyDescription("The organization responsible for the care team.")
    private List<Reference> managingOrganization = new ArrayList<Reference>();
    /**
     * A central contact detail for the care team (that applies to all members).
     * 
     */
    @JsonProperty("telecom")
    @JsonPropertyDescription("A central contact detail for the care team (that applies to all members).")
    private List<ContactPoint> telecom = new ArrayList<ContactPoint>();
    /**
     * Comments made about the CareTeam.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the CareTeam.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a CareTeam resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a CareTeam resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Business identifiers assigned to this care team by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Business identifiers assigned to this care team by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Indicates the current state of the care team.
     * 
     */
    @JsonProperty("status")
    public CareTeam.Status getStatus() {
        return status;
    }

    /**
     * Indicates the current state of the care team.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CareTeam.Status status) {
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
     * Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
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
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * Identifies all people and organizations who are expected to be involved in the care team.
     * 
     */
    @JsonProperty("participant")
    public List<CareTeam_Participant> getParticipant() {
        return participant;
    }

    /**
     * Identifies all people and organizations who are expected to be involved in the care team.
     * 
     */
    @JsonProperty("participant")
    public void setParticipant(List<CareTeam_Participant> participant) {
        this.participant = participant;
    }

    /**
     * Describes why the care team exists.
     * 
     */
    @JsonProperty("reasonCode")
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * Describes why the care team exists.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(List<CodeableConcept> reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Condition(s) that this care team addresses.
     * 
     */
    @JsonProperty("reasonReference")
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * Condition(s) that this care team addresses.
     * 
     */
    @JsonProperty("reasonReference")
    public void setReasonReference(List<Reference> reasonReference) {
        this.reasonReference = reasonReference;
    }

    /**
     * The organization responsible for the care team.
     * 
     */
    @JsonProperty("managingOrganization")
    public List<Reference> getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * The organization responsible for the care team.
     * 
     */
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(List<Reference> managingOrganization) {
        this.managingOrganization = managingOrganization;
    }

    /**
     * A central contact detail for the care team (that applies to all members).
     * 
     */
    @JsonProperty("telecom")
    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    /**
     * A central contact detail for the care team (that applies to all members).
     * 
     */
    @JsonProperty("telecom")
    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    /**
     * Comments made about the CareTeam.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the CareTeam.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
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
        sb.append(CareTeam.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("participant");
        sb.append('=');
        sb.append(((this.participant == null)?"<null>":this.participant));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonReference");
        sb.append('=');
        sb.append(((this.reasonReference == null)?"<null>":this.reasonReference));
        sb.append(',');
        sb.append("managingOrganization");
        sb.append('=');
        sb.append(((this.managingOrganization == null)?"<null>":this.managingOrganization));
        sb.append(',');
        sb.append("telecom");
        sb.append('=');
        sb.append(((this.telecom == null)?"<null>":this.telecom));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.reasonReference == null)? 0 :this.reasonReference.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.participant == null)? 0 :this.participant.hashCode()));
        result = ((result* 31)+((this.managingOrganization == null)? 0 :this.managingOrganization.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.telecom == null)? 0 :this.telecom.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
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
        if ((other instanceof CareTeam) == false) {
            return false;
        }
        CareTeam rhs = ((CareTeam) other);
        return (((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.reasonReference == rhs.reasonReference)||((this.reasonReference!= null)&&this.reasonReference.equals(rhs.reasonReference))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.participant == rhs.participant)||((this.participant!= null)&&this.participant.equals(rhs.participant))))&&((this.managingOrganization == rhs.managingOrganization)||((this.managingOrganization!= null)&&this.managingOrganization.equals(rhs.managingOrganization))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.telecom == rhs.telecom)||((this.telecom!= null)&&this.telecom.equals(rhs.telecom))))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Indicates the current state of the care team.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PROPOSED("proposed"),
        ACTIVE("active"),
        SUSPENDED("suspended"),
        INACTIVE("inactive"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, CareTeam.Status> CONSTANTS = new HashMap<String, CareTeam.Status>();

        static {
            for (CareTeam.Status c: values()) {
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
        public static CareTeam.Status fromValue(String value) {
            CareTeam.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
