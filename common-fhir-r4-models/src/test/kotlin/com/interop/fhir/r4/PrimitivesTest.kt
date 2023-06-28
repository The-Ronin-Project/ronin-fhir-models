package com.interop.fhir.r4

import com.projectronin.fhir.r4.Bundle
import com.projectronin.fhir.r4.CodeSystem_Property1
import com.projectronin.fhir.r4.ImmunizationEvaluation
import com.projectronin.fhir.r4.Observation
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import kotlin.reflect.KClassifier
import kotlin.reflect.KProperty1

class PrimitivesTest {
    @Test
    fun `integer-based primitives are represented as Integers`() {
        // integer
        assertEquals(Int::class, getType(Observation::valueInteger))
        // positiveInt
        assertEquals(Int::class, getType(ImmunizationEvaluation::doseNumberPositiveInt))
        // unsignedInt
        assertEquals(Int::class, getType(Bundle::total))
    }

    @Test
    fun `number-based primitives are represented as BigDecimals`() {
        // decimal
        assertEquals(BigDecimal::class, getType(CodeSystem_Property1::valueDecimal))
    }

    private fun getType(property: KProperty1<*, *>): KClassifier? {
        return property.returnType.classifier
    }
}
