
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
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "title",
    "_title",
    "protocol",
    "partOf",
    "status",
    "_status",
    "primaryPurposeType",
    "phase",
    "category",
    "focus",
    "condition",
    "contact",
    "relatedArtifact",
    "keyword",
    "location",
    "description",
    "_description",
    "enrollment",
    "period",
    "sponsor",
    "principalInvestigator",
    "site",
    "reasonStopped",
    "note",
    "arm",
    "objective"
})
@Generated("jsonschema2pojo")
public class ResearchStudy
    extends DomainResource
{

    /**
     * This is a ResearchStudy resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a ResearchStudy resource")
    private String resourceType;
    /**
     * Identifiers assigned to this research study by the sponsor or other systems.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers assigned to this research study by the sponsor or other systems.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String title;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _title;
    /**
     * The set of steps expected to be performed as part of the execution of the study.
     * 
     */
    @JsonProperty("protocol")
    @JsonPropertyDescription("The set of steps expected to be performed as part of the execution of the study.")
    private List<Reference> protocol = new ArrayList<Reference>();
    /**
     * A larger research study of which this particular study is a component or step.
     * 
     */
    @JsonProperty("partOf")
    @JsonPropertyDescription("A larger research study of which this particular study is a component or step.")
    private List<Reference> partOf = new ArrayList<Reference>();
    /**
     * The current state of the study.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current state of the study.")
    private ResearchStudy.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("primaryPurposeType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept primaryPurposeType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept phase;
    /**
     * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.")
    private List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    /**
     * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
     * 
     */
    @JsonProperty("focus")
    @JsonPropertyDescription("The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.")
    private List<CodeableConcept> focus = new ArrayList<CodeableConcept>();
    /**
     * The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion &quot;healthy volunteer&quot;, but the target condition code would be a Lupus SNOMED code.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion \"healthy volunteer\", but the target condition code would be a Lupus SNOMED code.")
    private List<CodeableConcept> condition = new ArrayList<CodeableConcept>();
    /**
     * Contact details to assist a user in learning more about or engaging with the study.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Contact details to assist a user in learning more about or engaging with the study.")
    private List<ContactDetail> contact = new ArrayList<ContactDetail>();
    /**
     * Citations, references and other related documents.
     * 
     */
    @JsonProperty("relatedArtifact")
    @JsonPropertyDescription("Citations, references and other related documents.")
    private List<RelatedArtifact> relatedArtifact = new ArrayList<RelatedArtifact>();
    /**
     * Key terms to aid in searching for or filtering the study.
     * 
     */
    @JsonProperty("keyword")
    @JsonPropertyDescription("Key terms to aid in searching for or filtering the study.")
    private List<CodeableConcept> keyword = new ArrayList<CodeableConcept>();
    /**
     * Indicates a country, state or other region where the study is taking place.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("Indicates a country, state or other region where the study is taking place.")
    private List<CodeableConcept> location = new ArrayList<CodeableConcept>();
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
     * Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. &quot; 200 female Europeans between the ages of 20 and 45 with early onset diabetes&quot;.
     * 
     */
    @JsonProperty("enrollment")
    @JsonPropertyDescription("Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. \" 200 female Europeans between the ages of 20 and 45 with early onset diabetes\".")
    private List<Reference> enrollment = new ArrayList<Reference>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sponsor")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference sponsor;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("principalInvestigator")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference principalInvestigator;
    /**
     * A facility in which study activities are conducted.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("A facility in which study activities are conducted.")
    private List<Reference> site = new ArrayList<Reference>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reasonStopped")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept reasonStopped;
    /**
     * Comments made about the study by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the study by the performer, subject or other participants.")
    private List<Annotation> note = new ArrayList<Annotation>();
    /**
     * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     * 
     */
    @JsonProperty("arm")
    @JsonPropertyDescription("Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.")
    private List<ResearchStudy_Arm> arm = new ArrayList<ResearchStudy_Arm>();
    /**
     * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
     * 
     */
    @JsonProperty("objective")
    @JsonPropertyDescription("A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.")
    private List<ResearchStudy_Objective> objective = new ArrayList<ResearchStudy_Objective>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a ResearchStudy resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a ResearchStudy resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers assigned to this research study by the sponsor or other systems.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers assigned to this research study by the sponsor or other systems.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public Element get_title() {
        return _title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public void set_title(Element _title) {
        this._title = _title;
    }

    /**
     * The set of steps expected to be performed as part of the execution of the study.
     * 
     */
    @JsonProperty("protocol")
    public List<Reference> getProtocol() {
        return protocol;
    }

    /**
     * The set of steps expected to be performed as part of the execution of the study.
     * 
     */
    @JsonProperty("protocol")
    public void setProtocol(List<Reference> protocol) {
        this.protocol = protocol;
    }

    /**
     * A larger research study of which this particular study is a component or step.
     * 
     */
    @JsonProperty("partOf")
    public List<Reference> getPartOf() {
        return partOf;
    }

    /**
     * A larger research study of which this particular study is a component or step.
     * 
     */
    @JsonProperty("partOf")
    public void setPartOf(List<Reference> partOf) {
        this.partOf = partOf;
    }

    /**
     * The current state of the study.
     * 
     */
    @JsonProperty("status")
    public ResearchStudy.Status getStatus() {
        return status;
    }

    /**
     * The current state of the study.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ResearchStudy.Status status) {
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("primaryPurposeType")
    public CodeableConcept getPrimaryPurposeType() {
        return primaryPurposeType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("primaryPurposeType")
    public void setPrimaryPurposeType(CodeableConcept primaryPurposeType) {
        this.primaryPurposeType = primaryPurposeType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("phase")
    public CodeableConcept getPhase() {
        return phase;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("phase")
    public void setPhase(CodeableConcept phase) {
        this.phase = phase;
    }

    /**
     * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
     * 
     */
    @JsonProperty("category")
    public List<CodeableConcept> getCategory() {
        return category;
    }

    /**
     * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    /**
     * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
     * 
     */
    @JsonProperty("focus")
    public List<CodeableConcept> getFocus() {
        return focus;
    }

    /**
     * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
     * 
     */
    @JsonProperty("focus")
    public void setFocus(List<CodeableConcept> focus) {
        this.focus = focus;
    }

    /**
     * The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion &quot;healthy volunteer&quot;, but the target condition code would be a Lupus SNOMED code.
     * 
     */
    @JsonProperty("condition")
    public List<CodeableConcept> getCondition() {
        return condition;
    }

    /**
     * The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion &quot;healthy volunteer&quot;, but the target condition code would be a Lupus SNOMED code.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(List<CodeableConcept> condition) {
        this.condition = condition;
    }

    /**
     * Contact details to assist a user in learning more about or engaging with the study.
     * 
     */
    @JsonProperty("contact")
    public List<ContactDetail> getContact() {
        return contact;
    }

    /**
     * Contact details to assist a user in learning more about or engaging with the study.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<ContactDetail> contact) {
        this.contact = contact;
    }

    /**
     * Citations, references and other related documents.
     * 
     */
    @JsonProperty("relatedArtifact")
    public List<RelatedArtifact> getRelatedArtifact() {
        return relatedArtifact;
    }

    /**
     * Citations, references and other related documents.
     * 
     */
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(List<RelatedArtifact> relatedArtifact) {
        this.relatedArtifact = relatedArtifact;
    }

    /**
     * Key terms to aid in searching for or filtering the study.
     * 
     */
    @JsonProperty("keyword")
    public List<CodeableConcept> getKeyword() {
        return keyword;
    }

    /**
     * Key terms to aid in searching for or filtering the study.
     * 
     */
    @JsonProperty("keyword")
    public void setKeyword(List<CodeableConcept> keyword) {
        this.keyword = keyword;
    }

    /**
     * Indicates a country, state or other region where the study is taking place.
     * 
     */
    @JsonProperty("location")
    public List<CodeableConcept> getLocation() {
        return location;
    }

    /**
     * Indicates a country, state or other region where the study is taking place.
     * 
     */
    @JsonProperty("location")
    public void setLocation(List<CodeableConcept> location) {
        this.location = location;
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
     * Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. &quot; 200 female Europeans between the ages of 20 and 45 with early onset diabetes&quot;.
     * 
     */
    @JsonProperty("enrollment")
    public List<Reference> getEnrollment() {
        return enrollment;
    }

    /**
     * Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. &quot; 200 female Europeans between the ages of 20 and 45 with early onset diabetes&quot;.
     * 
     */
    @JsonProperty("enrollment")
    public void setEnrollment(List<Reference> enrollment) {
        this.enrollment = enrollment;
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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sponsor")
    public Reference getSponsor() {
        return sponsor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sponsor")
    public void setSponsor(Reference sponsor) {
        this.sponsor = sponsor;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("principalInvestigator")
    public Reference getPrincipalInvestigator() {
        return principalInvestigator;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("principalInvestigator")
    public void setPrincipalInvestigator(Reference principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
    }

    /**
     * A facility in which study activities are conducted.
     * 
     */
    @JsonProperty("site")
    public List<Reference> getSite() {
        return site;
    }

    /**
     * A facility in which study activities are conducted.
     * 
     */
    @JsonProperty("site")
    public void setSite(List<Reference> site) {
        this.site = site;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reasonStopped")
    public CodeableConcept getReasonStopped() {
        return reasonStopped;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("reasonStopped")
    public void setReasonStopped(CodeableConcept reasonStopped) {
        this.reasonStopped = reasonStopped;
    }

    /**
     * Comments made about the study by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the study by the performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    /**
     * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     * 
     */
    @JsonProperty("arm")
    public List<ResearchStudy_Arm> getArm() {
        return arm;
    }

    /**
     * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     * 
     */
    @JsonProperty("arm")
    public void setArm(List<ResearchStudy_Arm> arm) {
        this.arm = arm;
    }

    /**
     * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
     * 
     */
    @JsonProperty("objective")
    public List<ResearchStudy_Objective> getObjective() {
        return objective;
    }

    /**
     * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
     * 
     */
    @JsonProperty("objective")
    public void setObjective(List<ResearchStudy_Objective> objective) {
        this.objective = objective;
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
        sb.append(ResearchStudy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("_title");
        sb.append('=');
        sb.append(((this._title == null)?"<null>":this._title));
        sb.append(',');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null)?"<null>":this.protocol));
        sb.append(',');
        sb.append("partOf");
        sb.append('=');
        sb.append(((this.partOf == null)?"<null>":this.partOf));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("primaryPurposeType");
        sb.append('=');
        sb.append(((this.primaryPurposeType == null)?"<null>":this.primaryPurposeType));
        sb.append(',');
        sb.append("phase");
        sb.append('=');
        sb.append(((this.phase == null)?"<null>":this.phase));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("focus");
        sb.append('=');
        sb.append(((this.focus == null)?"<null>":this.focus));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("relatedArtifact");
        sb.append('=');
        sb.append(((this.relatedArtifact == null)?"<null>":this.relatedArtifact));
        sb.append(',');
        sb.append("keyword");
        sb.append('=');
        sb.append(((this.keyword == null)?"<null>":this.keyword));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_description");
        sb.append('=');
        sb.append(((this._description == null)?"<null>":this._description));
        sb.append(',');
        sb.append("enrollment");
        sb.append('=');
        sb.append(((this.enrollment == null)?"<null>":this.enrollment));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("sponsor");
        sb.append('=');
        sb.append(((this.sponsor == null)?"<null>":this.sponsor));
        sb.append(',');
        sb.append("principalInvestigator");
        sb.append('=');
        sb.append(((this.principalInvestigator == null)?"<null>":this.principalInvestigator));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("reasonStopped");
        sb.append('=');
        sb.append(((this.reasonStopped == null)?"<null>":this.reasonStopped));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("arm");
        sb.append('=');
        sb.append(((this.arm == null)?"<null>":this.arm));
        sb.append(',');
        sb.append("objective");
        sb.append('=');
        sb.append(((this.objective == null)?"<null>":this.objective));
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
        result = ((result* 31)+((this.partOf == null)? 0 :this.partOf.hashCode()));
        result = ((result* 31)+((this.sponsor == null)? 0 :this.sponsor.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.reasonStopped == null)? 0 :this.reasonStopped.hashCode()));
        result = ((result* 31)+((this.primaryPurposeType == null)? 0 :this.primaryPurposeType.hashCode()));
        result = ((result* 31)+((this.focus == null)? 0 :this.focus.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.objective == null)? 0 :this.objective.hashCode()));
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.keyword == null)? 0 :this.keyword.hashCode()));
        result = ((result* 31)+((this._description == null)? 0 :this._description.hashCode()));
        result = ((result* 31)+((this.arm == null)? 0 :this.arm.hashCode()));
        result = ((result* 31)+((this.principalInvestigator == null)? 0 :this.principalInvestigator.hashCode()));
        result = ((result* 31)+((this.phase == null)? 0 :this.phase.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.relatedArtifact == null)? 0 :this.relatedArtifact.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.enrollment == null)? 0 :this.enrollment.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
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
        if ((other instanceof ResearchStudy) == false) {
            return false;
        }
        ResearchStudy rhs = ((ResearchStudy) other);
        return (((((((((((((((((((((((((((((super.equals(rhs)&&((this.partOf == rhs.partOf)||((this.partOf!= null)&&this.partOf.equals(rhs.partOf))))&&((this.sponsor == rhs.sponsor)||((this.sponsor!= null)&&this.sponsor.equals(rhs.sponsor))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.reasonStopped == rhs.reasonStopped)||((this.reasonStopped!= null)&&this.reasonStopped.equals(rhs.reasonStopped))))&&((this.primaryPurposeType == rhs.primaryPurposeType)||((this.primaryPurposeType!= null)&&this.primaryPurposeType.equals(rhs.primaryPurposeType))))&&((this.focus == rhs.focus)||((this.focus!= null)&&this.focus.equals(rhs.focus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.objective == rhs.objective)||((this.objective!= null)&&this.objective.equals(rhs.objective))))&&((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.keyword == rhs.keyword)||((this.keyword!= null)&&this.keyword.equals(rhs.keyword))))&&((this._description == rhs._description)||((this._description!= null)&&this._description.equals(rhs._description))))&&((this.arm == rhs.arm)||((this.arm!= null)&&this.arm.equals(rhs.arm))))&&((this.principalInvestigator == rhs.principalInvestigator)||((this.principalInvestigator!= null)&&this.principalInvestigator.equals(rhs.principalInvestigator))))&&((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.relatedArtifact == rhs.relatedArtifact)||((this.relatedArtifact!= null)&&this.relatedArtifact.equals(rhs.relatedArtifact))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.enrollment == rhs.enrollment)||((this.enrollment!= null)&&this.enrollment.equals(rhs.enrollment))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The current state of the study.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        ADMINISTRATIVELY_COMPLETED("administratively-completed"),
        APPROVED("approved"),
        CLOSED_TO_ACCRUAL("closed-to-accrual"),
        CLOSED_TO_ACCRUAL_AND_INTERVENTION("closed-to-accrual-and-intervention"),
        COMPLETED("completed"),
        DISAPPROVED("disapproved"),
        IN_REVIEW("in-review"),
        TEMPORARILY_CLOSED_TO_ACCRUAL("temporarily-closed-to-accrual"),
        TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION("temporarily-closed-to-accrual-and-intervention"),
        WITHDRAWN("withdrawn");
        private final String value;
        private final static Map<String, ResearchStudy.Status> CONSTANTS = new HashMap<String, ResearchStudy.Status>();

        static {
            for (ResearchStudy.Status c: values()) {
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
        public static ResearchStudy.Status fromValue(String value) {
            ResearchStudy.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
