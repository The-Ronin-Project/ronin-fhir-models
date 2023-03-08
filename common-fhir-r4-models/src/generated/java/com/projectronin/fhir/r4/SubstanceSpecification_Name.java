
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "name",
    "_name",
    "type",
    "status",
    "preferred",
    "_preferred",
    "language",
    "domain",
    "jurisdiction",
    "synonym",
    "translation",
    "official",
    "source"
})
@Generated("jsonschema2pojo")
public class SubstanceSpecification_Name {

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept type;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept status;
    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("preferred")
    @JsonPropertyDescription("Value of \"true\" or \"false\"")
    private Boolean preferred;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preferred")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _preferred;
    /**
     * Language of the name.
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("Language of the name.")
    private List<CodeableConcept> language = new ArrayList<CodeableConcept>();
    /**
     * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.")
    private List<CodeableConcept> domain = new ArrayList<CodeableConcept>();
    /**
     * The jurisdiction where this name applies.
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("The jurisdiction where this name applies.")
    private List<CodeableConcept> jurisdiction = new ArrayList<CodeableConcept>();
    /**
     * A synonym of this name.
     * 
     */
    @JsonProperty("synonym")
    @JsonPropertyDescription("A synonym of this name.")
    private List<SubstanceSpecification_Name> synonym = new ArrayList<SubstanceSpecification_Name>();
    /**
     * A translation for this name.
     * 
     */
    @JsonProperty("translation")
    @JsonPropertyDescription("A translation for this name.")
    private List<SubstanceSpecification_Name> translation = new ArrayList<SubstanceSpecification_Name>();
    /**
     * Details of the official nature of this name.
     * 
     */
    @JsonProperty("official")
    @JsonPropertyDescription("Details of the official nature of this name.")
    private List<SubstanceSpecification_Official> official = new ArrayList<SubstanceSpecification_Official>();
    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Supporting literature.")
    private List<Reference> source = new ArrayList<Reference>();

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
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
        this.type = type;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    public CodeableConcept getStatus() {
        return status;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("status")
    public void setStatus(CodeableConcept status) {
        this.status = status;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("preferred")
    public Boolean getPreferred() {
        return preferred;
    }

    /**
     * Value of &quot;true&quot; or &quot;false&quot;
     * 
     */
    @JsonProperty("preferred")
    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preferred")
    public Element get_preferred() {
        return _preferred;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_preferred")
    public void set_preferred(Element _preferred) {
        this._preferred = _preferred;
    }

    /**
     * Language of the name.
     * 
     */
    @JsonProperty("language")
    public List<CodeableConcept> getLanguage() {
        return language;
    }

    /**
     * Language of the name.
     * 
     */
    @JsonProperty("language")
    public void setLanguage(List<CodeableConcept> language) {
        this.language = language;
    }

    /**
     * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.
     * 
     */
    @JsonProperty("domain")
    public List<CodeableConcept> getDomain() {
        return domain;
    }

    /**
     * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(List<CodeableConcept> domain) {
        this.domain = domain;
    }

    /**
     * The jurisdiction where this name applies.
     * 
     */
    @JsonProperty("jurisdiction")
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * The jurisdiction where this name applies.
     * 
     */
    @JsonProperty("jurisdiction")
    public void setJurisdiction(List<CodeableConcept> jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    /**
     * A synonym of this name.
     * 
     */
    @JsonProperty("synonym")
    public List<SubstanceSpecification_Name> getSynonym() {
        return synonym;
    }

    /**
     * A synonym of this name.
     * 
     */
    @JsonProperty("synonym")
    public void setSynonym(List<SubstanceSpecification_Name> synonym) {
        this.synonym = synonym;
    }

    /**
     * A translation for this name.
     * 
     */
    @JsonProperty("translation")
    public List<SubstanceSpecification_Name> getTranslation() {
        return translation;
    }

    /**
     * A translation for this name.
     * 
     */
    @JsonProperty("translation")
    public void setTranslation(List<SubstanceSpecification_Name> translation) {
        this.translation = translation;
    }

    /**
     * Details of the official nature of this name.
     * 
     */
    @JsonProperty("official")
    public List<SubstanceSpecification_Official> getOfficial() {
        return official;
    }

    /**
     * Details of the official nature of this name.
     * 
     */
    @JsonProperty("official")
    public void setOfficial(List<SubstanceSpecification_Official> official) {
        this.official = official;
    }

    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    public List<Reference> getSource() {
        return source;
    }

    /**
     * Supporting literature.
     * 
     */
    @JsonProperty("source")
    public void setSource(List<Reference> source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubstanceSpecification_Name.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("preferred");
        sb.append('=');
        sb.append(((this.preferred == null)?"<null>":this.preferred));
        sb.append(',');
        sb.append("_preferred");
        sb.append('=');
        sb.append(((this._preferred == null)?"<null>":this._preferred));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("jurisdiction");
        sb.append('=');
        sb.append(((this.jurisdiction == null)?"<null>":this.jurisdiction));
        sb.append(',');
        sb.append("synonym");
        sb.append('=');
        sb.append(((this.synonym == null)?"<null>":this.synonym));
        sb.append(',');
        sb.append("translation");
        sb.append('=');
        sb.append(((this.translation == null)?"<null>":this.translation));
        sb.append(',');
        sb.append("official");
        sb.append('=');
        sb.append(((this.official == null)?"<null>":this.official));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this._preferred == null)? 0 :this._preferred.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.official == null)? 0 :this.official.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.synonym == null)? 0 :this.synonym.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.translation == null)? 0 :this.translation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.preferred == null)? 0 :this.preferred.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubstanceSpecification_Name) == false) {
            return false;
        }
        SubstanceSpecification_Name rhs = ((SubstanceSpecification_Name) other);
        return (((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._preferred == rhs._preferred)||((this._preferred!= null)&&this._preferred.equals(rhs._preferred))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.official == rhs.official)||((this.official!= null)&&this.official.equals(rhs.official))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.synonym == rhs.synonym)||((this.synonym!= null)&&this.synonym.equals(rhs.synonym))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.translation == rhs.translation)||((this.translation!= null)&&this.translation.equals(rhs.translation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.preferred == rhs.preferred)||((this.preferred!= null)&&this.preferred.equals(rhs.preferred))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
