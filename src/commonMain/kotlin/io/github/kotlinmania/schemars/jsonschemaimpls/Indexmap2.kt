// port-lint: source json_schema_impls/indexmap2.rs
@file:OptIn(kotlin.experimental.ExperimentalObjCRefinement::class)

package io.github.kotlinmania.schemars.jsonschemaimpls

import io.github.kotlinmania.indexmap.IndexMap
import io.github.kotlinmania.indexmap.IndexSet
import io.github.kotlinmania.schemars.JsonSchema
import kotlin.native.HiddenFromObjC

/*
 *
 * schema is identical to BTreeMap's. Same for IndexSet -> BTreeSet.
 */

/** `IndexMap<K, V>` schema, identical to the ordered-map schema. */
@HiddenFromObjC
class IndexMapSchema<K, V>(
    key: JsonSchema,
    value: JsonSchema,
    val instance: IndexMap<K, V>? = null,
) : JsonSchema by MapSchema(key, value)

/** `IndexSet<T>` schema, identical to the ordered-set schema. */
@HiddenFromObjC
class IndexSetSchema<T>(
    inner: JsonSchema,
    val instance: IndexSet<T>? = null,
) : JsonSchema by SetSchema(inner)
