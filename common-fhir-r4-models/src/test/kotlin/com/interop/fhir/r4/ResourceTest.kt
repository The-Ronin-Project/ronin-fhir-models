package com.interop.fhir.r4

import com.projectronin.fhir.r4.DomainResource
import com.projectronin.fhir.r4.Observation
import com.projectronin.fhir.r4.Resource
import io.github.classgraph.ClassGraph
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import kotlin.reflect.full.declaredMemberProperties

class ResourceTest {
    @Test
    fun `explicit resourceType shadowing`() {
        val observation: Any = Observation().apply {
            resourceType = "Observation"
        }

        val observationResourceType = (observation as Observation).resourceType
        val resourceResourceType = (observation as Resource).resourceType
        assertEquals(observationResourceType, resourceResourceType)
    }

    @Test
    fun `no resourceType is shadowed`() {
        val instances = ClassGraph().acceptPackages("com.projectronin.fhir.r4").enableClassInfo().scan().use {
            it.getSubclasses(Resource::class.java).standardClasses.filter { c -> c.name != DomainResource::class.java.name }
                .map { c ->
                    c.loadClass().getDeclaredConstructor().newInstance()
                }
        }
        instances.forEach(::checkType)
    }

    private fun checkType(subresource: Any) {
        val resourceType = subresource::class.declaredMemberProperties.find { it.name == "resourceType" }
        assertNull(
            resourceType,
            "ResourceType defined in ${subresource.javaClass} which shadows the Resource definition"
        )
    }
}
