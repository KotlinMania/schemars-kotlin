// port-lint: tests tests/integration/indexmap.rs
package io.github.kotlinmania.schemars.jsonschemaimpls

import io.github.kotlinmania.schemars.Value
import io.github.kotlinmania.schemars.generate.SchemaGenerator
import kotlin.test.Test
import kotlin.test.assertEquals

class Indexmap2Test {
    @Test
    fun indexMapSchemaMatchesMapSchema() {
        val schema =
            IndexMapSchema<String, Boolean>(StrSchema, BoolSchema)
                .jsonSchema(SchemaGenerator.default())
                .serialize() as Value.Object

        assertEquals(Value.Str("object"), schema.entries["type"])
        val additionalProperties = schema.entries["additionalProperties"] as Value.Object
        assertEquals(Value.Str("boolean"), additionalProperties.entries["type"])
    }

    @Test
    fun indexSetSchemaMatchesSetSchema() {
        val schema =
            IndexSetSchema<String>(StrSchema)
                .jsonSchema(SchemaGenerator.default())
                .serialize() as Value.Object

        assertEquals(Value.Str("array"), schema.entries["type"])
        assertEquals(Value.Bool(true), schema.entries["uniqueItems"])
    }
}

