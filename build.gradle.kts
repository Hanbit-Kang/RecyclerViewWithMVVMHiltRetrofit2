buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.41")
        /*classpath(libs.gradle)
        classpath(libs.kotlin.gradle.plugin)
        classpath(libs.navigation.safe.args.gradle.plugin)
        classpath(libs.android.gradle.plugin)*/
    }
}

plugins {
    id("com.diffplug.spotless") version "6.4.1"
}

spotless {
    kotlin {
        target("**/*.kt")
        ktlint("0.40.0").userData(mapOf("max_line_length" to "100"))
    }
}