dependencyResolutionManagment{
    versionCatalogs{
        create("libs"){
            from(files("../libs.toml"))
        }
    }
}
rootProject.name="build-logic"