# Immediate Actions - High-Value Files

Based on AST analysis, here are the concrete next steps.

## Summary

- **Files Present:** 31/34 (91.2%)
- **Function parity:** 177/209 matched (target 316) — 84.7%
- **Class/type parity:** 24/33 matched (target 67) — 72.7%
- **Combined symbol parity:** 201/242 matched (target 383) — 83.1%
- **Average inline-code cosine:** 0.21 (function body across 31 matched files)
- **Average documentation cosine:** 0.17 (doc text across 31 matched files)
- **Cheat-zeroed Files:** 7
- **Critical Issues:** 28 files with <0.60 function similarity
- **Needs Review:** 0 files with 0.60-0.84 function similarity
- **Excellent:** 3 files with >=0.85 function similarity

## Priority 1: Fix Incomplete High-Dependency Files

No incomplete high-dependency files detected.

## Priority 2: Port Missing High-Value Files

Critical missing files (>10 dependencies):

No missing high-value files detected.

## Detailed Work Items

Every matched file is listed below with function and type symbol parity.

### 1. schema

- **Target:** `schemars.Schema [ZERO]`
- **Similarity:** 0.00
- **Dependents:** 2
- **Priority Score:** 2104110.0
- **Functions:** 29/38 matched (target 52)
- **Missing functions:** `eq`, `eq`, `eq`, `eq`, `eq`, `eq`, `try_from`, `try_from`, `from`
- **Types:** 2/3 matched (target 9)
- **Missing types:** `Error`

### 2. generate

- **Target:** `generate.Generate`
- **Similarity:** 0.17
- **Dependents:** 0
- **Priority Score:** 145208.3
- **Functions:** 33/45 matched (target 39)
- **Missing functions:** `clone`, `from`, `is`, `downcast_ref`, `downcast_mut`, `downcast`, `_as_any`, `_as_any_mut`, `_into_any`, `fmt`, `_assert_send`, `assert`
- **Types:** 5/7 matched (target 6)
- **Missing types:** `CowStr`, `GenTransform`

### 3. ser

- **Target:** `schemars.Ser`
- **Similarity:** 0.11
- **Dependents:** 0
- **Priority Score:** 134108.9
- **Functions:** 24/31 matched (target 44)
- **Missing functions:** `end`, `end`, `end`, `end`, `end`, `end`, `end`
- **Types:** 4/10 matched (target 5)
- **Missing types:** `Ok`, `Error`, `SerializeTupleStruct`, `SerializeTupleVariant`, `SerializeStruct`, `SerializeStructVariant`

### 4. transform

- **Target:** `transform.Transform`
- **Similarity:** 0.24
- **Dependents:** 0
- **Priority Score:** 23007.6
- **Functions:** 16/18 matched (target 20)
- **Missing functions:** `default`, `default`
- **Types:** 12/12 matched (target 13)
- **Missing types:** _none_
- **Tests:** 1/1 matched

### 5. _private.rustdoc

- **Target:** `private.Rustdoc`
- **Similarity:** 0.15
- **Dependents:** 0
- **Priority Score:** 20608.5
- **Functions:** 4/6 matched (target 5)
- **Missing functions:** `subslice`, `to_utf8`
- **Types:** 0/0 matched
- **Missing types:** _none_

### 6. json_schema_impls.core

- **Target:** `jsonschemaimpls.Core`
- **Similarity:** 0.15
- **Dependents:** 0
- **Priority Score:** 1408.5
- **Functions:** 14/14 matched (target 15)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 5)
- **Missing types:** _none_

### 7. json_schema_impls.ffi

- **Target:** `jsonschemaimpls.Ffi`
- **Similarity:** 0.15
- **Dependents:** 0
- **Priority Score:** 608.5
- **Functions:** 6/6 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 2)
- **Missing types:** _none_

### 8. json_schema_impls.chrono04

- **Target:** `jsonschemaimpls.Chrono04`
- **Similarity:** 0.18
- **Dependents:** 0
- **Priority Score:** 608.2
- **Functions:** 6/6 matched (target 13)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 2)
- **Missing types:** _none_

### 9. json_schema_impls.std_time

- **Target:** `jsonschemaimpls.StdTime`
- **Similarity:** 0.19
- **Dependents:** 0
- **Priority Score:** 608.1
- **Functions:** 6/6 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 2)
- **Missing types:** _none_

### 10. encoding

- **Target:** `schemars.Encoding`
- **Similarity:** 0.14
- **Dependents:** 0
- **Priority Score:** 508.6
- **Functions:** 5/5 matched (target 6)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_
- **Tests:** 2/2 matched

### 11. json_schema_impls.maps

- **Target:** `jsonschemaimpls.Maps`
- **Similarity:** 0.16
- **Dependents:** 0
- **Priority Score:** 408.4
- **Functions:** 3/3 matched (target 5)
- **Missing functions:** _none_
- **Types:** 1/1 matched (target 2)
- **Missing types:** _none_

### 12. json_schema_impls.serdejson

- **Target:** `jsonschemaimpls.SerdeJson`
- **Similarity:** 0.20
- **Dependents:** 0
- **Priority Score:** 408.0
- **Functions:** 4/4 matched (target 6)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 2)
- **Missing types:** _none_

### 13. json_schema_impls.either1

- **Target:** `jsonschemaimpls.Either1`
- **Similarity:** 0.05
- **Dependents:** 0
- **Priority Score:** 309.5
- **Functions:** 3/3 matched (target 5)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 14. json_schema_impls.bytes1

- **Target:** `jsonschemaimpls.Bytes1`
- **Similarity:** 0.13
- **Dependents:** 0
- **Priority Score:** 308.7
- **Functions:** 3/3 matched (target 5)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 15. json_schema_impls.semver1

- **Target:** `jsonschemaimpls.Semver1`
- **Similarity:** 0.14
- **Dependents:** 0
- **Priority Score:** 308.6
- **Functions:** 3/3 matched (target 4)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 16. json_schema_impls.array

- **Target:** `jsonschemaimpls.Array`
- **Similarity:** 0.20
- **Dependents:** 0
- **Priority Score:** 308.0
- **Functions:** 3/3 matched (target 8)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 2)
- **Missing types:** _none_

### 17. json_schema_impls.uuid1

- **Target:** `jsonschemaimpls.Uuid1`
- **Similarity:** 0.20
- **Dependents:** 0
- **Priority Score:** 308.0
- **Functions:** 3/3 matched (target 5)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 18. json_schema_impls.url2

- **Target:** `jsonschemaimpls.Url2`
- **Similarity:** 0.20
- **Dependents:** 0
- **Priority Score:** 308.0
- **Functions:** 3/3 matched (target 4)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 19. json_schema_impls.primitives

- **Target:** `jsonschemaimpls.Primitives`
- **Similarity:** 0.21
- **Dependents:** 0
- **Priority Score:** 307.9
- **Functions:** 3/3 matched (target 24)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 20. _private.regex_syntax

- **Target:** `private.RegexSyntax`
- **Similarity:** 0.43
- **Dependents:** 0
- **Priority Score:** 305.7
- **Functions:** 3/3 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 21. json_schema_impls.arrayvec07

- **Target:** `jsonschemaimpls.Arrayvec07`
- **Similarity:** 0.18
- **Dependents:** 0
- **Priority Score:** 208.2
- **Functions:** 2/2 matched (target 3)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 22. json_schema_impls.atomic

- **Target:** `jsonschemaimpls.Atomic`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 110.0
- **Functions:** 1/1 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_
- **Tests:** 1/1 matched

### 23. json_schema_impls.jiff02

- **Target:** `jsonschemaimpls.Jiff02 [ZERO]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched (target 5)
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 24. json_schema_impls.decimal

- **Target:** `jsonschemaimpls.Decimal [ZERO]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched (target 4)
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 25. json_schema_impls.tuple

- **Target:** `jsonschemaimpls.Tuple [ZERO]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched (target 4)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 26. json_schema_impls.nonzero

- **Target:** `jsonschemaimpls.Nonzero [ZERO]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched (target 10)
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 27. macros

- **Target:** `schemars.Macros [ZERO]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched (target 6)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 28. json_schema_impls.sequences

- **Target:** `jsonschemaimpls.Sequences [ZERO]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched (target 8)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 2)
- **Missing types:** _none_

### 29. json_schema_impls.wrapper

- **Target:** `jsonschemaimpls.Wrapper`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 0.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 30. consts

- **Target:** `schemars.Consts`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 0.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 31. json_schema_impls.indexmap2

- **Target:** `jsonschemaimpls.Indexmap2`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 0.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 2)
- **Missing types:** _none_

## Success Criteria

For each file to be considered "complete":
- **Similarity ≥ 0.85** (Excellent threshold)
- All public APIs ported
- All tests ported
- Documentation ported
- port-lint header present

## Reexport / Wiring Modules

These files match `reexport_modules` patterns in `.ast_distance_config.json`. They are filtered out of
normal priority and missing-file ladders because they are wiring
modules, not direct logic ports. Consult them for call-site routing;
do not treat them as the next implementation target by default.

### Missing

| Source | Expected target | Deps | Source path | Expected path |
|--------|-----------------|------|-------------|---------------|
| `_private.mod` | `private.Mod` | 0 | `_private/mod.rs` | `private/Mod.kt` |
| `json_schema_impls.mod` | `jsonschemaimpls.Mod` | 0 | `json_schema_impls/mod.rs` | `jsonschemaimpls/Mod.kt` |
| `lib` | `Lib` | 0 | `lib.rs` | `Lib.kt` |

