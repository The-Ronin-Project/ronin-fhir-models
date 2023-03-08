plugins {
    kotlin("jvm") version "1.8.0"
}

repositories {
    maven {
        url = uri("https://repo.devops.projectronin.io/repository/maven-snapshots/")
        mavenContent {
            snapshotsOnly()
        }
    }
    maven {
        url = uri("https://repo.devops.projectronin.io/repository/maven-releases/")
        mavenContent {
            releasesOnly()
        }
    }
    maven {
        url = uri("https://repo.devops.projectronin.io/repository/maven-public/")
        mavenContent {
            releasesOnly()
        }
    }
    mavenLocal()
}

dependencies {
    implementation("org.jsonschema2pojo:jsonschema2pojo-core:1.1.3")
    implementation("org.apache.commons:commons-text:1.10.0")
}
