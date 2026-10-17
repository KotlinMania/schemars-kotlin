// port-lint: tests json_schema_impls/atomic.rs
package io.github.kotlinmania.schemars.jsonschemaimpls

import io.github.kotlinmania.schemars.generate.SchemaGenerator
import kotlin.test.Test
import kotlin.test.assertEquals

class AtomicTest {
    @Test
    fun schemaForAtomics() {
        val generator = SchemaGenerator.default()
        assertEquals(BoolSchema.jsonSchema(generator), AtomicBoolSchema.jsonSchema(generator))
        assertEquals(I8Schema.jsonSchema(generator), AtomicI8Schema.jsonSchema(generator))
        assertEquals(I16Schema.jsonSchema(generator), AtomicI16Schema.jsonSchema(generator))
        assertEquals(I32Schema.jsonSchema(generator), AtomicI32Schema.jsonSchema(generator))
        assertEquals(I64Schema.jsonSchema(generator), AtomicI64Schema.jsonSchema(generator))
        assertEquals(IsizeSchema.jsonSchema(generator), AtomicIsizeSchema.jsonSchema(generator))
        assertEquals(U8Schema.jsonSchema(generator), AtomicU8Schema.jsonSchema(generator))
        assertEquals(U16Schema.jsonSchema(generator), AtomicU16Schema.jsonSchema(generator))
        assertEquals(U32Schema.jsonSchema(generator), AtomicU32Schema.jsonSchema(generator))
        assertEquals(U64Schema.jsonSchema(generator), AtomicU64Schema.jsonSchema(generator))
        assertEquals(UsizeSchema.jsonSchema(generator), AtomicUsizeSchema.jsonSchema(generator))
    }
}
