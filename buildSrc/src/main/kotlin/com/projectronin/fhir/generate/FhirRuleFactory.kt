package com.projectronin.fhir.generate

import com.sun.codemodel.JClassContainer
import com.sun.codemodel.JDefinedClass
import com.sun.codemodel.JDocComment
import com.sun.codemodel.JDocCommentable
import com.sun.codemodel.JType
import org.jsonschema2pojo.rules.Rule
import org.jsonschema2pojo.rules.RuleFactory
import org.jsonschema2pojo.util.NameHelper

/**
 * Local implementation of [RuleFactory] to address some shortcomings within the default rules for generation.
 */
class FhirRuleFactory : RuleFactory() {
    override fun getEnumRule(): Rule<JClassContainer, JType> {
        return FhirEnumRule(this)
    }

    override fun getDescriptionRule(): Rule<JDocCommentable, JDocComment> {
        return FhirDescriptionRule()
    }

    override fun getNameHelper(): NameHelper {
        return FhirNameHelper(generationConfig)
    }

    override fun getPropertyRule(): Rule<JDefinedClass, JDefinedClass> {
        return FhirPropertyRule(this)
    }
}
