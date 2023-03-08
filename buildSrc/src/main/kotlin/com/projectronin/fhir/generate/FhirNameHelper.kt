package com.projectronin.fhir.generate

import com.fasterxml.jackson.databind.JsonNode
import org.jsonschema2pojo.GenerationConfig
import org.jsonschema2pojo.util.NameHelper
import javax.lang.model.SourceVersion

/**
 * Local implementation of [NameHelper] to address generating names for primitives with prohibited names.
 */
class FhirNameHelper(generationConfig: GenerationConfig) : NameHelper(generationConfig) {
    override fun getPropertyName(jsonFieldName: String, node: JsonNode?): String? {
        var propertyName = getFieldName(jsonFieldName, node)
        propertyName = replaceIllegalCharacters(propertyName)
        propertyName = normalizeName(propertyName)
        propertyName = propertyName[0].toLowerCase() + propertyName.substring(1)

        if (propertyName.startsWith("_") && SourceVersion.isKeyword(propertyName.substring(1))) {
            propertyName = "_$propertyName"
        }

        if (SourceVersion.isKeyword(propertyName)) {
            propertyName = "_$propertyName"
        }
        if (SourceVersion.isKeyword(propertyName)) {
            propertyName += "_"
        }
        return propertyName
    }
}
