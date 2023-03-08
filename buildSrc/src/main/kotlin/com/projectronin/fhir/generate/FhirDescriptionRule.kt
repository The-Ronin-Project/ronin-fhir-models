package com.projectronin.fhir.generate

import com.fasterxml.jackson.databind.JsonNode
import com.sun.codemodel.JDocComment
import com.sun.codemodel.JDocCommentable
import org.apache.commons.text.StringEscapeUtils
import org.jsonschema2pojo.Schema
import org.jsonschema2pojo.rules.DescriptionRule

/**
 * Local implementation of the [DescriptionRule] ensuring documentation is properly formatted.
 */
class FhirDescriptionRule : DescriptionRule() {
    override fun apply(
        nodeName: String?,
        node: JsonNode,
        parent: JsonNode?,
        generatableType: JDocCommentable,
        schema: Schema?
    ): JDocComment {
        val javadoc = generatableType.javadoc()

        val descriptionText = StringEscapeUtils.escapeHtml4(node.asText())

        if (descriptionText.isNotBlank()) {
            val lines = descriptionText.split("/\r?\n/".toRegex())
            for (line in lines) {
                javadoc.append(line)
            }
        }

        return javadoc
    }
}
