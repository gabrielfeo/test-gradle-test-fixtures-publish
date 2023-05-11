plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    id("java")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest()
        }
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("com.github.gabrielfeo:test-gradle-test-fixtures-publish:SNAPSHOT")
    testImplementation(testFixtures("com.github.gabrielfeo:test-gradle-test-fixtures-publish:SNAPSHOT"))
}
