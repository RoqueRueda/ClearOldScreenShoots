plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "com.roque.rueda.clear.old.screen.shoots"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}