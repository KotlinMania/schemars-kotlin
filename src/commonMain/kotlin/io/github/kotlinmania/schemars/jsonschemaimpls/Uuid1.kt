// port-lint: source json_schema_impls/uuid1.rs
@file:OptIn(kotlin.experimental.ExperimentalObjCRefinement::class)

package io.github.kotlinmania.schemars.jsonschemaimpls

import io.github.kotlinmania.schemars.JsonSchema
import io.github.kotlinmania.schemars.Schema
import io.github.kotlinmania.schemars.generate.SchemaGenerator
import io.github.kotlinmania.schemars.jsonSchema
import io.github.kotlinmania.uuid.Uuid
import kotlin.native.HiddenFromObjC

object UuidSchema : JsonSchema {
    override fun inlineSchema(): Boolean = true

    override fun schemaName(): String = "Uuid"

    override fun schemaId(): String = "uuid::Uuid"

    override fun jsonSchema(generator: SchemaGenerator): Schema =
        jsonSchema {
            this["type"] = "string"
            this["format"] = "uuid"
        }
}

/** Return the schema implementation for a [Uuid] value. */
@HiddenFromObjC
fun Uuid.uuidJsonSchema(): JsonSchema = UuidSchema
