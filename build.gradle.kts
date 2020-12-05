plugins {
    java
    id("maven")
    kotlin("jvm") version "1.3.72"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "com.thoo.api"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}