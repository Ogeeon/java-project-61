plugins {
    application
    jacoco
    checkstyle
    id("com.github.ben-manes.versions") version "0.50.0"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass = "hexlet.code.App"
}

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
    }
}
