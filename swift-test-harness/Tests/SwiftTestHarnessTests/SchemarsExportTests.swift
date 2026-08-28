import Testing
import Schemars
import ExportedKotlinPackages

typealias SchemaSettings = ExportedKotlinPackages.io.github.kotlinmania.schemars.generate.SchemaSettings

@Suite("Schemars Swift Export Tests")
struct SchemarsExportTests {
    @Test("Swift module loads cleanly")
    func testSwiftModuleLoads() {
        #expect(Bool(true), "Schemars swift module imported cleanly")
    }

    @Test("Schema from Bool")
    func testSchemaFromBool() {
        let schemaTrue = Schema.Companion.shared.from(b: true)
        #expect(schemaTrue.asBool() == true)

        let schemaFalse = Schema.Companion.shared.from(b: false)
        #expect(schemaFalse.asBool() == false)
    }

    @Test("Schema Default")
    func testSchemaDefault() {
        let schema = Schema.Companion.shared.default()
        #expect(schema.asBool() == nil, "Default schema is an object, so asBool() should be nil")
    }

    @Test("Schema Settings")
    func testSchemaSettings() {
        let settings = SchemaSettings.Companion.shared.draft07()
        #expect(settings.inlineSubschemas == false)
        #expect(settings.untaggedEnumVariantTitles == false)
        #expect(settings.definitionsPath == "/definitions")
    }
}
