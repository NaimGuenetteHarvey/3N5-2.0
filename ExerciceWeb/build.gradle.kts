plugins {
    kotlin("jvm") version "2.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.17.2") // version la plus récente au moment
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}