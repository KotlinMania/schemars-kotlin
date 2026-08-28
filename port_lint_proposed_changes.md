# port-lint Proposed Changes

**Generated:** 2026-08-28
**Source:** tmp/schemars/src
**Target:** src/commonMain/kotlin/io/github/kotlinmania/schemars

These are review proposals only. They are emitted when a Rust -> Kotlin pair matches only after fallback normalization, so the existing `port-lint` header is not an exact provenance match.

| Target file | Current header | Proposed header | Source path | Reason |
|-------------|----------------|-----------------|-------------|--------|
| `src/commonMain/kotlin/io/github/kotlinmania/schemars/Consts.kt` | `// port-lint: source src/consts.rs` | `// port-lint: source consts.rs` | `consts.rs` | `port-lint provenance header matched only after fallback normalization: 'src/consts.rs' vs expected 'consts.rs'` |
