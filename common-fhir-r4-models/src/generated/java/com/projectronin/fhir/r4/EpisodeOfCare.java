
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
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "status",
    "_status",
    "statusHistory",
    "type",
    "diagnosis",
    "patient",
    "managingOrganization",
    "period",
    "referralRequest",
    "careManager",
    "team",
    "account"
})
@Generated("jsonschema2pojo")
public class EpisodeOfCare
    extends DomainResource
{

    /**
     * This is a EpisodeOfCare resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a EpisodeOfCare resource")
    private String resourceType;
    /**
     * The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("planned | waitlist | active | onhold | finished | cancelled.")
    private EpisodeOfCare.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
     * 
     */
    @JsonProperty("statusHistory")
    @JsonPropertyDescription("The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).")
    private List<EpisodeOfCare_StatusHistory> statusHistory = new ArrayList<EpisodeOfCare_StatusHistory>();
    /**
     * A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.")
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();
    /**
     * The list of diagnosis relevant to this episode of care.
     * 
     */
    @JsonProperty("diagnosis")
    @JsonPropertyDescription("The list of diagnosis relevant to this episode of care.")
    private List<EpisodeOfCare_Diagnosis> diagnosis = new ArrayList<EpisodeOfCare_Diagnosis>();
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference patient;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference managingOrganization;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
     * 
     */
    @JsonProperty("referralRequest")
    @JsonPropertyDescription("Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.")
    private List<Reference> referralRequest = new ArrayList<Reference>();
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("careManager")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference careManager;
    /**
     * The list of practitioners that may be facilitating this episode of care for specific purposes.
     * 
     */
    @JsonProperty("team")
    @JsonPropertyDescription("The list of practitioners that may be facilitating this episode of care for specific purposes.")
    private List<Reference> team = new ArrayList<Reference>();
    /**
     * The set of accounts that may be used for billing for this EpisodeOfCare.
     * 
     */
    @JsonProperty("account")
    @JsonPropertyDescription("The set of accounts that may be used for billing for this EpisodeOfCare.")
    private List<Reference> account = new ArrayList<Reference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a EpisodeOfCare resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a EpisodeOfCare resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     * 
     */
    @JsonProperty("status")
    public EpisodeOfCare.Status getStatus() {
        return status;
    }

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     * 
     */
    @JsonProperty("status")
    public void setStatus(EpisodeOfCare.Status status) {
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
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
     * 
     */
    @JsonProperty("statusHistory")
    public List<EpisodeOfCare_StatusHistory> getStatusHistory() {
        return statusHistory;
    }

    /**
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
     * 
     */
    @JsonProperty("statusHistory")
    public void setStatusHistory(List<EpisodeOfCare_StatusHistory> statusHistory) {
        this.statusHistory = statusHistory;
    }

    /**
     * A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
     * 
     */
    @JsonProperty("type")
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
     * 
     */
    @JsonProperty("type")
    public void setType(List<CodeableConcept> type) {
        this.type = type;
    }

    /**
     * The list of diagnosis relevant to this episode of care.
     * 
     */
    @JsonProperty("diagnosis")
    public List<EpisodeOfCare_Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    /**
     * The list of diagnosis relevant to this episode of care.
     * 
     */
    @JsonProperty("diagnosis")
    public void setDiagnosis(List<EpisodeOfCare_Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public Reference getPatient() {
        return patient;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
        this.patient = patient;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    public Reference getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Reference managingOrganization) {
        this.managingOrganization = managingOrganization;
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
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
     * 
     */
    @JsonProperty("referralRequest")
    public List<Reference> getReferralRequest() {
        return referralRequest;
    }

    /**
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
     * 
     */
    @JsonProperty("referralRequest")
    public void setReferralRequest(List<Reference> referralRequest) {
        this.referralRequest = referralRequest;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("careManager")
    public Reference getCareManager() {
        return careManager;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("careManager")
    public void setCareManager(Reference careManager) {
        this.careManager = careManager;
    }

    /**
     * The list of practitioners that may be facilitating this episode of care for specific purposes.
     * 
     */
    @JsonProperty("team")
    public List<Reference> getTeam() {
        return team;
    }

    /**
     * The list of practitioners that may be facilitating this episode of care for specific purposes.
     * 
     */
    @JsonProperty("team")
    public void setTeam(List<Reference> team) {
        this.team = team;
    }

    /**
     * The set of accounts that may be used for billing for this EpisodeOfCare.
     * 
     */
    @JsonProperty("account")
    public List<Reference> getAccount() {
        return account;
    }

    /**
     * The set of accounts that may be used for billing for this EpisodeOfCare.
     * 
     */
    @JsonProperty("account")
    public void setAccount(List<Reference> account) {
        this.account = account;
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
        sb.append(EpisodeOfCare.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("statusHistory");
        sb.append('=');
        sb.append(((this.statusHistory == null)?"<null>":this.statusHistory));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("diagnosis");
        sb.append('=');
        sb.append(((this.diagnosis == null)?"<null>":this.diagnosis));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("managingOrganization");
        sb.append('=');
        sb.append(((this.managingOrganization == null)?"<null>":this.managingOrganization));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("referralRequest");
        sb.append('=');
        sb.append(((this.referralRequest == null)?"<null>":this.referralRequest));
        sb.append(',');
        sb.append("careManager");
        sb.append('=');
        sb.append(((this.careManager == null)?"<null>":this.careManager));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.diagnosis == null)? 0 :this.diagnosis.hashCode()));
        result = ((result* 31)+((this.careManager == null)? 0 :this.careManager.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.statusHistory == null)? 0 :this.statusHistory.hashCode()));
        result = ((result* 31)+((this.managingOrganization == null)? 0 :this.managingOrganization.hashCode()));
        result = ((result* 31)+((this.referralRequest == null)? 0 :this.referralRequest.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
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
        if ((other instanceof EpisodeOfCare) == false) {
            return false;
        }
        EpisodeOfCare rhs = ((EpisodeOfCare) other);
        return (((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.diagnosis == rhs.diagnosis)||((this.diagnosis!= null)&&this.diagnosis.equals(rhs.diagnosis))))&&((this.careManager == rhs.careManager)||((this.careManager!= null)&&this.careManager.equals(rhs.careManager))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.statusHistory == rhs.statusHistory)||((this.statusHistory!= null)&&this.statusHistory.equals(rhs.statusHistory))))&&((this.managingOrganization == rhs.managingOrganization)||((this.managingOrganization!= null)&&this.managingOrganization.equals(rhs.managingOrganization))))&&((this.referralRequest == rhs.referralRequest)||((this.referralRequest!= null)&&this.referralRequest.equals(rhs.referralRequest))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PLANNED("planned"),
        WAITLIST("waitlist"),
        ACTIVE("active"),
        ONHOLD("onhold"),
        FINISHED("finished"),
        CANCELLED("cancelled"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, EpisodeOfCare.Status> CONSTANTS = new HashMap<String, EpisodeOfCare.Status>();

        static {
            for (EpisodeOfCare.Status c: values()) {
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
        public static EpisodeOfCare.Status fromValue(String value) {
            EpisodeOfCare.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
