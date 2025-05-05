plugins {
    id("java-library")
}

group = "com.spderman333"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.fasterxml.jackson.core:jackson-core:2.19.0-rc2")
}

tasks.test {
    useJUnitPlatform()
}