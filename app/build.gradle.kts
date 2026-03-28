plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.p"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.p"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
}