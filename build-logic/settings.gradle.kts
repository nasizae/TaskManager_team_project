dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.toml"))
        }
    }
}
rootProject.name = "build-logic"