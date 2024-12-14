plugins {
    kotlin("jvm") version libs.versions.kotlin.get()
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlin.coroutines.core)
    implementation(libs.slf4j.api)
    implementation(libs.slf4j.simple)
    implementation(libs.slf4j.simple)
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
