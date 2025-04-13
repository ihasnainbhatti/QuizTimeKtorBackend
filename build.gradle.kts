
plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.ktor)
    alias(libs.plugins.kotlin.plugin.serialization)
}

group = "com.nainnie"
version = "0.0.1"

application {
    mainClass = "io.ktor.server.netty.EngineMain"

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
}
//kotlin {
//    jvmToolchain(11) // <--- 👈 Add this block
//    ///
//}
dependencies {
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.host.common)
    implementation(libs.ktor.server.status.pages)
    implementation(libs.ktor.server.resources)
    implementation(libs.ktor.server.content.negotiation)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.server.netty)
    implementation(libs.logback.classic)
    testImplementation(libs.ktor.server.test.host)
    testImplementation(libs.kotlin.test.junit)
    // MongoDB Kotlin driver dependency
    implementation("org.mongodb:mongodb-driver-kotlin-coroutine:4.10.2")
    implementation("io.ktor:ktor-server-request-validation:3.1.2")
    implementation("io.ktor:ktor-server-call-logging:3.1.2")
    implementation(libs.koin.ktor)
    implementation(libs.koin.logger.slf4j)
}
