
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes validation requirements, source(s), status and dates for one or more elements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "who",
    "onBehalfOf",
    "communicationMethod",
    "date",
    "_date",
    "sourceIdentityCertificate",
    "_sourceIdentityCertificate",
    "proxyIdentityCertificate",
    "_proxyIdentityCertificate",
    "proxySignature",
    "sourceSignature"
})
@Generated("jsonschema2pojo")
public class VerificationResult_Attestation {

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference who;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("onBehalfOf")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference onBehalfOf;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("communicationMethod")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept communicationMethod;
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.")
    private String date;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _date;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sourceIdentityCertificate")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String sourceIdentityCertificate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceIdentityCertificate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sourceIdentityCertificate;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("proxyIdentityCertificate")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String proxyIdentityCertificate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_proxyIdentityCertificate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _proxyIdentityCertificate;
    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("proxySignature")
    @JsonPropertyDescription("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.")
    private Signature proxySignature;
    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("sourceSignature")
    @JsonPropertyDescription("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.")
    private Signature sourceSignature;

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    public Reference getWho() {
        return who;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("who")
    public void setWho(Reference who) {
        this.who = who;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("onBehalfOf")
    public Reference getOnBehalfOf() {
        return onBehalfOf;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Reference onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("communicationMethod")
    public CodeableConcept getCommunicationMethod() {
        return communicationMethod;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("communicationMethod")
    public void setCommunicationMethod(CodeableConcept communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public Element get_date() {
        return _date;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_date")
    public void set_date(Element _date) {
        this._date = _date;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sourceIdentityCertificate")
    public String getSourceIdentityCertificate() {
        return sourceIdentityCertificate;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("sourceIdentityCertificate")
    public void setSourceIdentityCertificate(String sourceIdentityCertificate) {
        this.sourceIdentityCertificate = sourceIdentityCertificate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceIdentityCertificate")
    public Element get_sourceIdentityCertificate() {
        return _sourceIdentityCertificate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sourceIdentityCertificate")
    public void set_sourceIdentityCertificate(Element _sourceIdentityCertificate) {
        this._sourceIdentityCertificate = _sourceIdentityCertificate;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("proxyIdentityCertificate")
    public String getProxyIdentityCertificate() {
        return proxyIdentityCertificate;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("proxyIdentityCertificate")
    public void setProxyIdentityCertificate(String proxyIdentityCertificate) {
        this.proxyIdentityCertificate = proxyIdentityCertificate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_proxyIdentityCertificate")
    public Element get_proxyIdentityCertificate() {
        return _proxyIdentityCertificate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_proxyIdentityCertificate")
    public void set_proxyIdentityCertificate(Element _proxyIdentityCertificate) {
        this._proxyIdentityCertificate = _proxyIdentityCertificate;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("proxySignature")
    public Signature getProxySignature() {
        return proxySignature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("proxySignature")
    public void setProxySignature(Signature proxySignature) {
        this.proxySignature = proxySignature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("sourceSignature")
    public Signature getSourceSignature() {
        return sourceSignature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("sourceSignature")
    public void setSourceSignature(Signature sourceSignature) {
        this.sourceSignature = sourceSignature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VerificationResult_Attestation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("who");
        sb.append('=');
        sb.append(((this.who == null)?"<null>":this.who));
        sb.append(',');
        sb.append("onBehalfOf");
        sb.append('=');
        sb.append(((this.onBehalfOf == null)?"<null>":this.onBehalfOf));
        sb.append(',');
        sb.append("communicationMethod");
        sb.append('=');
        sb.append(((this.communicationMethod == null)?"<null>":this.communicationMethod));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("_date");
        sb.append('=');
        sb.append(((this._date == null)?"<null>":this._date));
        sb.append(',');
        sb.append("sourceIdentityCertificate");
        sb.append('=');
        sb.append(((this.sourceIdentityCertificate == null)?"<null>":this.sourceIdentityCertificate));
        sb.append(',');
        sb.append("_sourceIdentityCertificate");
        sb.append('=');
        sb.append(((this._sourceIdentityCertificate == null)?"<null>":this._sourceIdentityCertificate));
        sb.append(',');
        sb.append("proxyIdentityCertificate");
        sb.append('=');
        sb.append(((this.proxyIdentityCertificate == null)?"<null>":this.proxyIdentityCertificate));
        sb.append(',');
        sb.append("_proxyIdentityCertificate");
        sb.append('=');
        sb.append(((this._proxyIdentityCertificate == null)?"<null>":this._proxyIdentityCertificate));
        sb.append(',');
        sb.append("proxySignature");
        sb.append('=');
        sb.append(((this.proxySignature == null)?"<null>":this.proxySignature));
        sb.append(',');
        sb.append("sourceSignature");
        sb.append('=');
        sb.append(((this.sourceSignature == null)?"<null>":this.sourceSignature));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.sourceIdentityCertificate == null)? 0 :this.sourceIdentityCertificate.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.communicationMethod == null)? 0 :this.communicationMethod.hashCode()));
        result = ((result* 31)+((this._date == null)? 0 :this._date.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.onBehalfOf == null)? 0 :this.onBehalfOf.hashCode()));
        result = ((result* 31)+((this.proxySignature == null)? 0 :this.proxySignature.hashCode()));
        result = ((result* 31)+((this.sourceSignature == null)? 0 :this.sourceSignature.hashCode()));
        result = ((result* 31)+((this._proxyIdentityCertificate == null)? 0 :this._proxyIdentityCertificate.hashCode()));
        result = ((result* 31)+((this.proxyIdentityCertificate == null)? 0 :this.proxyIdentityCertificate.hashCode()));
        result = ((result* 31)+((this._sourceIdentityCertificate == null)? 0 :this._sourceIdentityCertificate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.who == null)? 0 :this.who.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerificationResult_Attestation) == false) {
            return false;
        }
        VerificationResult_Attestation rhs = ((VerificationResult_Attestation) other);
        return (((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.sourceIdentityCertificate == rhs.sourceIdentityCertificate)||((this.sourceIdentityCertificate!= null)&&this.sourceIdentityCertificate.equals(rhs.sourceIdentityCertificate))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.communicationMethod == rhs.communicationMethod)||((this.communicationMethod!= null)&&this.communicationMethod.equals(rhs.communicationMethod))))&&((this._date == rhs._date)||((this._date!= null)&&this._date.equals(rhs._date))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.onBehalfOf == rhs.onBehalfOf)||((this.onBehalfOf!= null)&&this.onBehalfOf.equals(rhs.onBehalfOf))))&&((this.proxySignature == rhs.proxySignature)||((this.proxySignature!= null)&&this.proxySignature.equals(rhs.proxySignature))))&&((this.sourceSignature == rhs.sourceSignature)||((this.sourceSignature!= null)&&this.sourceSignature.equals(rhs.sourceSignature))))&&((this._proxyIdentityCertificate == rhs._proxyIdentityCertificate)||((this._proxyIdentityCertificate!= null)&&this._proxyIdentityCertificate.equals(rhs._proxyIdentityCertificate))))&&((this.proxyIdentityCertificate == rhs.proxyIdentityCertificate)||((this.proxyIdentityCertificate!= null)&&this.proxyIdentityCertificate.equals(rhs.proxyIdentityCertificate))))&&((this._sourceIdentityCertificate == rhs._sourceIdentityCertificate)||((this._sourceIdentityCertificate!= null)&&this._sourceIdentityCertificate.equals(rhs._sourceIdentityCertificate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.who == rhs.who)||((this.who!= null)&&this.who.equals(rhs.who))));
    }

}
