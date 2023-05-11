rootProject.name = "root"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(
    ":library",
    ":sample",
)
