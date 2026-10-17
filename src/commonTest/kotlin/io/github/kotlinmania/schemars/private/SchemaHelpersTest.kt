package io.github.kotlinmania.schemars.private

import io.github.kotlinmania.schemars.generate.SchemaGenerator
import io.github.kotlinmania.schemars.jsonschemaimpls.I8Schema
import io.github.kotlinmania.schemars.jsonschemaimpls.OptionSchema
import io.github.kotlinmania.schemars.jsonschemaimpls.ResultSchema
import io.github.kotlinmania.schemars.jsonschemaimpls.U8Schema
import kotlin.test.Test
import kotlin.test.assertEquals

class SchemaHelpersTest {
    @Test
    fun nestedOptionSchemas() {
        val optionType = OptionSchema(ResultSchema(I8Schema, U8Schema))
        val nestedOptionType = OptionSchema(OptionSchema(OptionSchema(ResultSchema(I8Schema, U8Schema))))

        val optionSchema = SchemaGenerator.default().rootSchemaFor(optionType)
        optionSchema.remove("title")

        val nestedOptionSchema = SchemaGenerator.default().rootSchemaFor(nestedOptionType)
        nestedOptionSchema.remove("title")

        assertEquals(optionSchema, nestedOptionSchema)
    }
}
