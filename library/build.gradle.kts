plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    id("org.jetbrains.dokka") version "1.8.10"
    id("org.openapi.generator") version "6.5.0"
    `java-test-fixtures`
    `maven-publish`
}

group = "com.github.gabrielfeo"

java {
    withSourcesJar()
    withJavadocJar()
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

tasks.named<Jar>("javadocJar") {
    from(tasks.dokkaHtml)
}

publishing {
    publications {
        create<MavenPublication>("library") {
            artifactId = "library"
            from(components["java"])
        }
    }
}

testing {
    suites.withType<JvmTestSuite> {
        useKotlinTest()
    }
}

java {
    consistentResolution {
        useRuntimeClasspathVersions()
    }
}