package com.projectronin.fhir.generate

import org.jsonschema2pojo.rules.EnumRule
import org.jsonschema2pojo.rules.RuleFactory

/**
 * Local implementation of the [EnumRule] ensuring some non-usable enums can be transformed.
 */
class FhirEnumRule(ruleFactory: RuleFactory) : EnumRule(ruleFactory) {
    private val mappings = mapOf(
        "<" to "LESS_THAN",
        "<=" to "LESS_THAN_OR_EQUAL",
        ">" to "GREATER_THAN",
        ">=" to "GREATER_THAN_OR_EQUAL",
        "=" to "EQUAL",
        "!=" to "NOT_EQUAL"
    )

    override fun getConstantName(nodeName: String?, customName: String?): String {
        val name = mappings[nodeName] ?: super.getConstantName(nodeName, customName)
        if (name.contains("__EMPTY__")) {
            println("EMPTY at $nodeName and $customName")
        }
        return name
    }
}
