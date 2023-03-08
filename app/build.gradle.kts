plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.recyclerviewwithmvvmhiltretrofit2"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "com.example.recyclerviewwithmvvmhiltretrofit2.utilities.CustomTestRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

dependencies {
    kapt(libs.room.compiler)
    kapt(libs.hilt.android.compiler)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.core.ktx)
    implementation(libs.fragment.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)
    implementation(libs.paging.runtime.ktx)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    implementation(libs.viewpager2)
    implementation(libs.work.runtime.ktx)
    implementation(libs.android.material)
    implementation(libs.gson)
    implementation(libs.logging.interceptor)
    implementation(libs.converter.gson)
    implementation(libs.retrofit)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.hilt.android)
    implementation(libs.profileinstaller)
    implementation(libs.tracing.ktx)

    // Compose
    implementation(libs.activity.compose)
    implementation(libs.constraintlayout.compose)
    implementation(libs.runtime)
    implementation(libs.ui)
    implementation(libs.foundation)
    implementation(libs.foundation.layout)
    implementation(libs.compose.material)
    implementation(libs.ui.viewbinding)
    implementation(libs.ui.tooling.preview)
    implementation(libs.runtime.livedata)
    implementation(libs.lifecycle.viewmodel.compose)
    implementation(libs.compose.theme.adapter)
    implementation(libs.coil.compose)
    debugImplementation(libs.ui.tooling)

    // Testing dependencies
    androidTestImplementation(libs.core.testing)
    androidTestImplementation(libs.espresso.contrib)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.espresso.intents)
    androidTestImplementation(libs.junit)
}