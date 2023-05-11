plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    `java-test-fixtures`
    `maven-publish`
}

group = "com.github.gabrielfeo"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("library") {
            artifactId = "library"
            from(components["java"])
        }
    }
}
