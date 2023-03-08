
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "_instantiatesUri",
    "instantiates",
    "_instantiates",
    "status",
    "_status",
    "intent",
    "_intent",
    "patient",
    "encounter",
    "dateTime",
    "_dateTime",
    "orderer",
    "allergyIntolerance",
    "foodPreferenceModifier",
    "excludeFoodModifier",
    "oralDiet",
    "supplement",
    "enteralFormula",
    "note"
})
@Generated("jsonschema2pojo")
public class NutritionOrder
    extends DomainResource
{

    /**
     * This is a NutritionOrder resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a NutritionOrder resource")
    private String resourceType;
    /**
     * Identifiers assigned to this order by the order sender or by the order receiver.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("Identifiers assigned to this order by the order sender or by the order receiver.")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    @JsonPropertyDescription("The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.")
    private List<String> instantiatesCanonical = new ArrayList<String>();
    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiatesUri")
    @JsonPropertyDescription("The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.")
    private List<String> instantiatesUri = new ArrayList<String>();
    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    @JsonPropertyDescription("Extensions for instantiatesUri")
    private List<Element> _instantiatesUri = new ArrayList<Element>();
    /**
     * The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiates")
    @JsonPropertyDescription("The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.")
    private List<String> instantiates = new ArrayList<String>();
    /**
     * Extensions for instantiates
     * 
     */
    @JsonProperty("_instantiates")
    @JsonPropertyDescription("Extensions for instantiates")
    private List<Element> _instantiates = new ArrayList<Element>();
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String intent;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _intent;
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
    @JsonProperty("encounter")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference encounter;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateTime")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String dateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dateTime;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("orderer")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference orderer;
    /**
     * A link to a record of allergies or intolerances  which should be included in the nutrition order.
     * 
     */
    @JsonProperty("allergyIntolerance")
    @JsonPropertyDescription("A link to a record of allergies or intolerances  which should be included in the nutrition order.")
    private List<Reference> allergyIntolerance = new ArrayList<Reference>();
    /**
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * 
     */
    @JsonProperty("foodPreferenceModifier")
    @JsonPropertyDescription("This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.")
    private List<CodeableConcept> foodPreferenceModifier = new ArrayList<CodeableConcept>();
    /**
     * This modifier is used to convey Order-specific modifier about the type of oral food or oral fluids that should not be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * 
     */
    @JsonProperty("excludeFoodModifier")
    @JsonPropertyDescription("This modifier is used to convey Order-specific modifier about the type of oral food or oral fluids that should not be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient\u2019s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.")
    private List<CodeableConcept> excludeFoodModifier = new ArrayList<CodeableConcept>();
    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     * 
     */
    @JsonProperty("oralDiet")
    @JsonPropertyDescription("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")
    private NutritionOrder_OralDiet oralDiet;
    /**
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * 
     */
    @JsonProperty("supplement")
    @JsonPropertyDescription("Oral nutritional products given in order to add further nutritional value to the patient's diet.")
    private List<NutritionOrder_Supplement> supplement = new ArrayList<NutritionOrder_Supplement>();
    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     * 
     */
    @JsonProperty("enteralFormula")
    @JsonPropertyDescription("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")
    private NutritionOrder_EnteralFormula enteralFormula;
    /**
     * Comments made about the {{title}} by the requester, performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Comments made about the {{title}} by the requester, performer, subject or other participants.")
    private List<Annotation> note = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a NutritionOrder resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a NutritionOrder resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Identifiers assigned to this order by the order sender or by the order receiver.
     * 
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Identifiers assigned to this order by the order sender or by the order receiver.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public List<String> getInstantiatesCanonical() {
        return instantiatesCanonical;
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) {
        this.instantiatesCanonical = instantiatesCanonical;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiatesUri")
    public List<String> getInstantiatesUri() {
        return instantiatesUri;
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(List<String> instantiatesUri) {
        this.instantiatesUri = instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public List<Element> get_instantiatesUri() {
        return _instantiatesUri;
    }

    /**
     * Extensions for instantiatesUri
     * 
     */
    @JsonProperty("_instantiatesUri")
    public void set_instantiatesUri(List<Element> _instantiatesUri) {
        this._instantiatesUri = _instantiatesUri;
    }

    /**
     * The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiates")
    public List<String> getInstantiates() {
        return instantiates;
    }

    /**
     * The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
     * 
     */
    @JsonProperty("instantiates")
    public void setInstantiates(List<String> instantiates) {
        this.instantiates = instantiates;
    }

    /**
     * Extensions for instantiates
     * 
     */
    @JsonProperty("_instantiates")
    public List<Element> get_instantiates() {
        return _instantiates;
    }

    /**
     * Extensions for instantiates
     * 
     */
    @JsonProperty("_instantiates")
    public void set_instantiates(List<Element> _instantiates) {
        this._instantiates = _instantiates;
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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public Element get_intent() {
        return _intent;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_intent")
    public void set_intent(Element _intent) {
        this._intent = _intent;
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
    @JsonProperty("dateTime")
    public String getDateTime() {
        return dateTime;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("dateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateTime")
    public Element get_dateTime() {
        return _dateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dateTime")
    public void set_dateTime(Element _dateTime) {
        this._dateTime = _dateTime;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("orderer")
    public Reference getOrderer() {
        return orderer;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("orderer")
    public void setOrderer(Reference orderer) {
        this.orderer = orderer;
    }

    /**
     * A link to a record of allergies or intolerances  which should be included in the nutrition order.
     * 
     */
    @JsonProperty("allergyIntolerance")
    public List<Reference> getAllergyIntolerance() {
        return allergyIntolerance;
    }

    /**
     * A link to a record of allergies or intolerances  which should be included in the nutrition order.
     * 
     */
    @JsonProperty("allergyIntolerance")
    public void setAllergyIntolerance(List<Reference> allergyIntolerance) {
        this.allergyIntolerance = allergyIntolerance;
    }

    /**
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * 
     */
    @JsonProperty("foodPreferenceModifier")
    public List<CodeableConcept> getFoodPreferenceModifier() {
        return foodPreferenceModifier;
    }

    /**
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * 
     */
    @JsonProperty("foodPreferenceModifier")
    public void setFoodPreferenceModifier(List<CodeableConcept> foodPreferenceModifier) {
        this.foodPreferenceModifier = foodPreferenceModifier;
    }

    /**
     * This modifier is used to convey Order-specific modifier about the type of oral food or oral fluids that should not be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * 
     */
    @JsonProperty("excludeFoodModifier")
    public List<CodeableConcept> getExcludeFoodModifier() {
        return excludeFoodModifier;
    }

    /**
     * This modifier is used to convey Order-specific modifier about the type of oral food or oral fluids that should not be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * 
     */
    @JsonProperty("excludeFoodModifier")
    public void setExcludeFoodModifier(List<CodeableConcept> excludeFoodModifier) {
        this.excludeFoodModifier = excludeFoodModifier;
    }

    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     * 
     */
    @JsonProperty("oralDiet")
    public NutritionOrder_OralDiet getOralDiet() {
        return oralDiet;
    }

    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     * 
     */
    @JsonProperty("oralDiet")
    public void setOralDiet(NutritionOrder_OralDiet oralDiet) {
        this.oralDiet = oralDiet;
    }

    /**
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * 
     */
    @JsonProperty("supplement")
    public List<NutritionOrder_Supplement> getSupplement() {
        return supplement;
    }

    /**
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * 
     */
    @JsonProperty("supplement")
    public void setSupplement(List<NutritionOrder_Supplement> supplement) {
        this.supplement = supplement;
    }

    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     * 
     */
    @JsonProperty("enteralFormula")
    public NutritionOrder_EnteralFormula getEnteralFormula() {
        return enteralFormula;
    }

    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     * 
     */
    @JsonProperty("enteralFormula")
    public void setEnteralFormula(NutritionOrder_EnteralFormula enteralFormula) {
        this.enteralFormula = enteralFormula;
    }

    /**
     * Comments made about the {{title}} by the requester, performer, subject or other participants.
     * 
     */
    @JsonProperty("note")
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * Comments made about the {{title}} by the requester, performer, subject or other participants.
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
        sb.append(NutritionOrder.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("instantiatesCanonical");
        sb.append('=');
        sb.append(((this.instantiatesCanonical == null)?"<null>":this.instantiatesCanonical));
        sb.append(',');
        sb.append("instantiatesUri");
        sb.append('=');
        sb.append(((this.instantiatesUri == null)?"<null>":this.instantiatesUri));
        sb.append(',');
        sb.append("_instantiatesUri");
        sb.append('=');
        sb.append(((this._instantiatesUri == null)?"<null>":this._instantiatesUri));
        sb.append(',');
        sb.append("instantiates");
        sb.append('=');
        sb.append(((this.instantiates == null)?"<null>":this.instantiates));
        sb.append(',');
        sb.append("_instantiates");
        sb.append('=');
        sb.append(((this._instantiates == null)?"<null>":this._instantiates));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("intent");
        sb.append('=');
        sb.append(((this.intent == null)?"<null>":this.intent));
        sb.append(',');
        sb.append("_intent");
        sb.append('=');
        sb.append(((this._intent == null)?"<null>":this._intent));
        sb.append(',');
        sb.append("patient");
        sb.append('=');
        sb.append(((this.patient == null)?"<null>":this.patient));
        sb.append(',');
        sb.append("encounter");
        sb.append('=');
        sb.append(((this.encounter == null)?"<null>":this.encounter));
        sb.append(',');
        sb.append("dateTime");
        sb.append('=');
        sb.append(((this.dateTime == null)?"<null>":this.dateTime));
        sb.append(',');
        sb.append("_dateTime");
        sb.append('=');
        sb.append(((this._dateTime == null)?"<null>":this._dateTime));
        sb.append(',');
        sb.append("orderer");
        sb.append('=');
        sb.append(((this.orderer == null)?"<null>":this.orderer));
        sb.append(',');
        sb.append("allergyIntolerance");
        sb.append('=');
        sb.append(((this.allergyIntolerance == null)?"<null>":this.allergyIntolerance));
        sb.append(',');
        sb.append("foodPreferenceModifier");
        sb.append('=');
        sb.append(((this.foodPreferenceModifier == null)?"<null>":this.foodPreferenceModifier));
        sb.append(',');
        sb.append("excludeFoodModifier");
        sb.append('=');
        sb.append(((this.excludeFoodModifier == null)?"<null>":this.excludeFoodModifier));
        sb.append(',');
        sb.append("oralDiet");
        sb.append('=');
        sb.append(((this.oralDiet == null)?"<null>":this.oralDiet));
        sb.append(',');
        sb.append("supplement");
        sb.append('=');
        sb.append(((this.supplement == null)?"<null>":this.supplement));
        sb.append(',');
        sb.append("enteralFormula");
        sb.append('=');
        sb.append(((this.enteralFormula == null)?"<null>":this.enteralFormula));
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
        result = ((result* 31)+((this._instantiates == null)? 0 :this._instantiates.hashCode()));
        result = ((result* 31)+((this.dateTime == null)? 0 :this.dateTime.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.instantiates == null)? 0 :this.instantiates.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.oralDiet == null)? 0 :this.oralDiet.hashCode()));
        result = ((result* 31)+((this.enteralFormula == null)? 0 :this.enteralFormula.hashCode()));
        result = ((result* 31)+((this.excludeFoodModifier == null)? 0 :this.excludeFoodModifier.hashCode()));
        result = ((result* 31)+((this._instantiatesUri == null)? 0 :this._instantiatesUri.hashCode()));
        result = ((result* 31)+((this.encounter == null)? 0 :this.encounter.hashCode()));
        result = ((result* 31)+((this.instantiatesCanonical == null)? 0 :this.instantiatesCanonical.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this.intent == null)? 0 :this.intent.hashCode()));
        result = ((result* 31)+((this.instantiatesUri == null)? 0 :this.instantiatesUri.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.supplement == null)? 0 :this.supplement.hashCode()));
        result = ((result* 31)+((this.orderer == null)? 0 :this.orderer.hashCode()));
        result = ((result* 31)+((this._intent == null)? 0 :this._intent.hashCode()));
        result = ((result* 31)+((this._dateTime == null)? 0 :this._dateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.allergyIntolerance == null)? 0 :this.allergyIntolerance.hashCode()));
        result = ((result* 31)+((this.foodPreferenceModifier == null)? 0 :this.foodPreferenceModifier.hashCode()));
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
        if ((other instanceof NutritionOrder) == false) {
            return false;
        }
        NutritionOrder rhs = ((NutritionOrder) other);
        return ((((((((((((((((((((((((super.equals(rhs)&&((this._instantiates == rhs._instantiates)||((this._instantiates!= null)&&this._instantiates.equals(rhs._instantiates))))&&((this.dateTime == rhs.dateTime)||((this.dateTime!= null)&&this.dateTime.equals(rhs.dateTime))))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.instantiates == rhs.instantiates)||((this.instantiates!= null)&&this.instantiates.equals(rhs.instantiates))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.oralDiet == rhs.oralDiet)||((this.oralDiet!= null)&&this.oralDiet.equals(rhs.oralDiet))))&&((this.enteralFormula == rhs.enteralFormula)||((this.enteralFormula!= null)&&this.enteralFormula.equals(rhs.enteralFormula))))&&((this.excludeFoodModifier == rhs.excludeFoodModifier)||((this.excludeFoodModifier!= null)&&this.excludeFoodModifier.equals(rhs.excludeFoodModifier))))&&((this._instantiatesUri == rhs._instantiatesUri)||((this._instantiatesUri!= null)&&this._instantiatesUri.equals(rhs._instantiatesUri))))&&((this.encounter == rhs.encounter)||((this.encounter!= null)&&this.encounter.equals(rhs.encounter))))&&((this.instantiatesCanonical == rhs.instantiatesCanonical)||((this.instantiatesCanonical!= null)&&this.instantiatesCanonical.equals(rhs.instantiatesCanonical))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this.intent == rhs.intent)||((this.intent!= null)&&this.intent.equals(rhs.intent))))&&((this.instantiatesUri == rhs.instantiatesUri)||((this.instantiatesUri!= null)&&this.instantiatesUri.equals(rhs.instantiatesUri))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.supplement == rhs.supplement)||((this.supplement!= null)&&this.supplement.equals(rhs.supplement))))&&((this.orderer == rhs.orderer)||((this.orderer!= null)&&this.orderer.equals(rhs.orderer))))&&((this._intent == rhs._intent)||((this._intent!= null)&&this._intent.equals(rhs._intent))))&&((this._dateTime == rhs._dateTime)||((this._dateTime!= null)&&this._dateTime.equals(rhs._dateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.allergyIntolerance == rhs.allergyIntolerance)||((this.allergyIntolerance!= null)&&this.allergyIntolerance.equals(rhs.allergyIntolerance))))&&((this.foodPreferenceModifier == rhs.foodPreferenceModifier)||((this.foodPreferenceModifier!= null)&&this.foodPreferenceModifier.equals(rhs.foodPreferenceModifier))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
