// port-lint: tests transform.rs
package io.github.kotlinmania.schemars.transform

import io.github.kotlinmania.schemars.MetaSchemas
import io.github.kotlinmania.schemars.jsonSchema
import kotlin.test.Test
import kotlin.test.assertEquals

class TransformTest {
    @Test
    fun restrictFormats() {
        val schema =
            jsonSchema {
                this["\$schema"] = MetaSchemas.DRAFT2020_12
                this["anyOf"] =
                    listOf(
                        mapOf("format" to "uuid"),
                        mapOf("\$schema" to MetaSchemas.DRAFT07, "format" to "uuid"),
                        mapOf("\$schema" to "http://unknown", "format" to "uuid"),
                        mapOf("format" to "date"),
                        mapOf("\$schema" to MetaSchemas.DRAFT07, "format" to "date"),
                        mapOf("\$schema" to "http://unknown", "format" to "date"),
                        mapOf("format" to "custom1"),
                        mapOf("\$schema" to MetaSchemas.DRAFT07, "format" to "custom1"),
                        mapOf("\$schema" to "http://unknown", "format" to "custom1"),
                        mapOf("format" to "custom2"),
                        mapOf("\$schema" to MetaSchemas.DRAFT07, "format" to "custom2"),
                        mapOf("\$schema" to "http://unknown", "format" to "custom2"),
                    )
            }

        val transform = RestrictFormats()
        transform.allowedFormats = setOf("custom1")
        transform.transform(schema)

        val expected =
            jsonSchema {
                this["\$schema"] = MetaSchemas.DRAFT2020_12
                this["anyOf"] =
                    listOf(
                        mapOf("format" to "uuid"),
                        mapOf("\$schema" to MetaSchemas.DRAFT07),
                        mapOf("\$schema" to "http://unknown", "format" to "uuid"),
                        mapOf("format" to "date"),
                        mapOf("\$schema" to MetaSchemas.DRAFT07, "format" to "date"),
                        mapOf("\$schema" to "http://unknown", "format" to "date"),
                        mapOf("format" to "custom1"),
                        mapOf("\$schema" to MetaSchemas.DRAFT07, "format" to "custom1"),
                        mapOf("\$schema" to "http://unknown", "format" to "custom1"),
                        emptyMap<String, Any>(),
                        mapOf("\$schema" to MetaSchemas.DRAFT07),
                        mapOf("\$schema" to "http://unknown", "format" to "custom2"),
                    )
            }

        assertEquals(expected, schema)
    }
}
