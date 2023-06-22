package com.projectronin.fhir.generate

import com.fasterxml.jackson.databind.JsonNode
import com.sun.codemodel.JDefinedClass
import org.jsonschema2pojo.Schema
import org.jsonschema2pojo.rules.PropertyRule
import org.jsonschema2pojo.rules.RuleFactory

/**
 * Custom PropertyRule that allows us to prevent shadowing issues with Resources.
 */
class FhirPropertyRule(ruleFactory: RuleFactory) : PropertyRule(ruleFactory) {
    override fun apply(
        nodeName: String,
        node: JsonNode,
        parent: JsonNode,
        jclass: JDefinedClass,
        schema: Schema
    ): JDefinedClass {
        if (nodeName == "resourceType") {
            node.get("const")?.let {
                // If we have a resourceType with a const value, we are skipping it to prevent shadowing
                return jclass
            }
        }

        return super.apply(nodeName, node, parent, jclass, schema)
    }
}
