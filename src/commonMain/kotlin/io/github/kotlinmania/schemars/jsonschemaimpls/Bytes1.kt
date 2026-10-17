// port-lint: source json_schema_impls/bytes1.rs
@file:OptIn(kotlin.experimental.ExperimentalObjCRefinement::class)

package io.github.kotlinmania.schemars.jsonschemaimpls

import io.github.kotlinmania.bytes.Bytes
import io.github.kotlinmania.bytes.BytesMut
import io.github.kotlinmania.schemars.JsonSchema
import io.github.kotlinmania.schemars.Schema
import io.github.kotlinmania.schemars.generate.SchemaGenerator
import io.github.kotlinmania.schemars.jsonSchema
import kotlin.native.HiddenFromObjC

object BytesSchema : JsonSchema {
    override fun schemaName(): String = "Bytes"

    override fun schemaId(): String = "bytes::Bytes"

    override fun jsonSchema(generator: SchemaGenerator): Schema {
        val ty: Any =
            when (generator.contract()) {
                io.github.kotlinmania.schemars.generate.Contract.Deserialize -> listOf("array", "string")
                io.github.kotlinmania.schemars.generate.Contract.Serialize -> "array"
            }
        return jsonSchema {
            this["type"] = ty
            this["items"] = generator.subschemaFor(U8Schema)
        }
    }
}

val BytesMutSchema: JsonSchema = BytesSchema

/** Return the schema implementation for a [Bytes] value. */
@HiddenFromObjC
fun Bytes.bytesJsonSchema(): JsonSchema = BytesSchema

/** Return the schema implementation for a [BytesMut] value. */
@HiddenFromObjC
fun BytesMut.bytesMutJsonSchema(): JsonSchema = BytesMutSchema
