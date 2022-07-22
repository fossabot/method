buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.android.tools.build:gradle:7.2.1")
        /** Tools **/
        classpath("com.github.ben-manes:gradle-versions-plugin:0.42.0") // Dependency Update Notice
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.21.0") // Code Analysis
        classpath("org.jlleitschuh.gradle.ktlint:org.jlleitschuh.gradle.ktlint.gradle.plugin:10.3.0") // Code Analysis + Formatting
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

//
// Tasks
//

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

tasks.register("setupGitHooks") {
    Runtime.getRuntime().exec("chmod -R +x .githook/")
    Runtime.getRuntime().exec("git config core.hooksPath .githook/")
}

//
// Lifecycle Hooks
//

gradle.taskGraph.afterTask {
 Runtime.getRuntime().exec("chmod -R +x .githook/")
 Runtime.getRuntime().exec("git config core.hooksPath .githook/")
}