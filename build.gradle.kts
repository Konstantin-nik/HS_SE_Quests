plugins {
    id("org.openapi.generator") version "7.2.0"
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

openApiGenerate {
    generatorName.set("kotlin-spring")
    inputSpec.set("$projectDir/specs/openapi.yaml")
    outputDir.set("$projectDir/generated")
    generateModelDocumentation.set(false)
    generateApiTests.set(false)
    generateModelTests.set(false)
    generateApiDocumentation.set(false)
}
