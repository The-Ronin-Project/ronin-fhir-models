
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "encounter",
    "event",
    "period",
    "facilityType",
    "practiceSetting",
    "sourcePatientInfo",
    "related"
})
@Generated("jsonschema2pojo")
public class DocumentReference_Context {

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
     * Describes the clinical encounter or type of care that the document content is associated with.
     * 
     */
    @JsonProperty("encounter")
    @JsonPropertyDescription("Describes the clinical encounter or type of care that the document content is associated with.")
    private List<Reference> encounter = new ArrayList<Reference>();
    /**
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the type Code, such as a &quot;History and Physical Report&quot; in which the procedure being documented is necessarily a &quot;History and Physical&quot; act.
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the type Code, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act.")
    private List<CodeableConcept> event = new ArrayList<CodeableConcept>();
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("facilityType")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept facilityType;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("practiceSetting")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept practiceSetting;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourcePatientInfo")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference sourcePatientInfo;
    /**
     * Related identifiers or resources associated with the DocumentReference.
     * 
     */
    @JsonProperty("related")
    @JsonPropertyDescription("Related identifiers or resources associated with the DocumentReference.")
    private List<Reference> related = new ArrayList<Reference>();

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
     * Describes the clinical encounter or type of care that the document content is associated with.
     * 
     */
    @JsonProperty("encounter")
    public List<Reference> getEncounter() {
        return encounter;
    }

    /**
     * Describes the clinical encounter or type of care that the document content is associated with.
     * 
     */
    @JsonProperty("encounter")
    public void setEncounter(List<Reference> encounter) {
        this.encounter = encounter;
    }

    /**
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the type Code, such as a &quot;History and Physical Report&quot; in which the procedure being documented is necessarily a &quot;History and Physical&quot; act.
     * 
     */
    @JsonProperty("event")
    public List<CodeableConcept> getEvent() {
        return event;
    }

    /**
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the type Code, such as a &quot;History and Physical Report&quot; in which the procedure being documented is necessarily a &quot;History and Physical&quot; act.
     * 
     */
    @JsonProperty("event")
    public void setEvent(List<CodeableConcept> event) {
        this.event = event;
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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("facilityType")
    public CodeableConcept getFacilityType() {
        return facilityType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("facilityType")
    public void setFacilityType(CodeableConcept facilityType) {
        this.facilityType = facilityType;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("practiceSetting")
    public CodeableConcept getPracticeSetting() {
        return practiceSetting;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("practiceSetting")
    public void setPracticeSetting(CodeableConcept practiceSetting) {
        this.practiceSetting = practiceSetting;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourcePatientInfo")
    public Reference getSourcePatientInfo() {
        return sourcePatientInfo;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("sourcePatientInfo")
    public void setSourcePatientInfo(Reference sourcePatientInfo) {
        this.sourcePatientInfo = sourcePatientInfo;
    }

    /**
     * Related identifiers or resources associated with the DocumentReference.
     * 
     */
    @JsonProperty("related")
    public List<Reference> getRelated() {
        return related;
    }

    /**
     * Related identifiers or resources associated with the DocumentReference.
     * 
     */
    @JsonProperty("related")
    public void setRelated(List<Reference> related) {
        this.related = related;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentReference_Context.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("facilityType");
        sb.append('=');
        sb.append(((this.facilityType == null)?"<null>":this.facilityType));
        sb.append(',');
        sb.append("practiceSetting");
        sb.append('=');
        sb.append(((this.practiceSetting == null)?"<null>":this.practiceSetting));
        sb.append(',');
        sb.append("sourcePatientInfo");
        sb.append('=');
        sb.append(((this.sourcePatientInfo == null)?"<null>":this.sourcePatientInfo));
        sb.append(',');
        sb.append("related");
        sb.append('=');
        sb.append(((this.related == null)?"<null>":this.related));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.related == null)? 0 :this.related.hashCode()));
        result = ((result* 31)+((this.facilityType == null)? 0 :this.facilityType.hashCode()));
        result = ((result* 31)+((this.practiceSetting == null)? 0 :this.practiceSetting.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.sourcePatientInfo == null)? 0 :this.sourcePatientInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentReference_Context) == false) {
            return false;
        }
        DocumentReference_Context rhs = ((DocumentReference_Context) other);
        return (((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.related == rhs.related)||((this.related!= null)&&this.related.equals(rhs.related))))&&((this.facilityType == rhs.facilityType)||((this.facilityType!= null)&&this.facilityType.equals(rhs.facilityType))))&&((this.practiceSetting == rhs.practiceSetting)||((this.practiceSetting!= null)&&this.practiceSetting.equals(rhs.practiceSetting))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.sourcePatientInfo == rhs.sourcePatientInfo)||((this.sourcePatientInfo!= null)&&this.sourcePatientInfo.equals(rhs.sourcePatientInfo))));
    }

}
