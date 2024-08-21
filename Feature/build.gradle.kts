plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("android-app-convention")
}
//apply<GradleConventionsPlugin>()
android {
    namespace = "com.example.feature"
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.amdroid.material)
    testImplementation(libs.junit)
    implementation(libs.test.junit)
    implementation(libs.esp.core)
}