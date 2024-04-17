plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

sourceSets {
    val root = "src"
    val mainPath = "$root/main"
    val testPath = "$root/test"
    val resourcesPath = "$mainPath/resources"

    main {
        kotlin {
            srcDirs(mainPath)
            name
            resources {
                srcDirs(resourcesPath)
            }
        }
    }
    test {
        kotlin {
            srcDirs(testPath)
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}