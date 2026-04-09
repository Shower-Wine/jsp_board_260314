plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // Source: https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Source: https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.44")
    annotationProcessor("org.projectlombok:lombok:1.18.44")
}

tasks.test {
    useJUnitPlatform()
}