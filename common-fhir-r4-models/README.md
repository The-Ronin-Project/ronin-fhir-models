# common-fhir-r4-models

This project contains the JSON Schema and generated Java models of the FHIR R4 spec.

# Generating Java models

If any changes are made to the schema files, ensure that the Java models are regenerated. This can be done explicitly
with ``./gradlew generateJsonSchema2Pojo`` or ``./gradlew build``

# Schema Details

This schema is a manually manipulated version of
the [JSON Schema provided by HL7](https://hl7.org/fhir/r4/downloads.html). HL7 provides the schema in a single large
format that is difficult to review and process. This project dissects that larger file into a series of simplified
files, focused on 2 areas: [core components](v1/core) and [resources](v1).

## Modifications

Besides dissecting the schema, there are a few modifications made that are of note.

* The `id` primitive regex was updated to remove the 64 character maximum limit. This is necessary to support the
  Ronin-ized IDs as well as to avoid issues with non-compliant vendors, i.e. Epic.
* The `ResourceList` definition was removed, and 2 new base [resource](v1/core/resource.schema.json) schemas were
  provided to simplify the models, allow for inheritance in the generated models, and provide support for validation
  without requiring the full FHIR model to be available.
    * This has some minor side-effects. Namely, if a Bundle entry or a `contained` element within a DomainResource does
      not match the details of the specific resource it represents, the JSON Schema validation is not able to identify
      this. These should not be cases that we are currently concerned with.
* All of the inheritance based changes above required both an `allOf` and an `extends` definition. `allOf` is used by
  the schema validation, while `extends` is used by the code generation.
* The use of `allOf` also required the `additionalProperties` field of all top-level Resources to be switched
  to `unevaluatedProperties`

## Test Examples

The test examples were taken directly from HL7 from downloads provided in the same place as the original schema. There
were a few that needed to be modified to correct issues with the examples:

* All SpecimenXXXX examples were actually listed as SpecimenSpecification.
* The DocumentReference example was actually a Bundle containing a DocumentReference. Only that entry was maintained in
  the file.
