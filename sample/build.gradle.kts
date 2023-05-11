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
    // mavenLocal()
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("com.github.gabrielfeo:test-gradle-test-fixtures-publish:main-SNAPSHOT")
    testImplementation(testFixtures("com.github.gabrielfeo:test-gradle-test-fixtures-publish:main-SNAPSHOT"))
}
