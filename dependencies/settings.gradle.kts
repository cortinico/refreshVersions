import de.fayard.versions.bootstrapRefreshVersions

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}

buildscript {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
    }
    dependencies.classpath("de.fayard:refreshVersions:0.9.1")
}

bootstrapRefreshVersions()

plugins {
    id("com.gradle.enterprise").version("3.1.1")
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlways()
    }
}

rootProject.name = "dependencies"