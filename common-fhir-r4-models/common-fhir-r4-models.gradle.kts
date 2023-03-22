import com.projectronin.fhir.generate.FhirRuleFactory

plugins {
    kotlin("jvm") version "1.8.0"
    id("org.jsonschema2pojo") version "1.2.1"
    id("com.projectronin.event.contract") version "1.0.0"

    `maven-publish`

    id("org.jlleitschuh.gradle.ktlint") version "11.3.1"
    id("com.dipien.releaseshub.gradle.plugin") version "4.0.0"
    id("pl.allegro.tech.build.axion-release") version "1.15.0"
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-annotations:2.14.2")
}

events {
    specVersion = com.networknt.schema.SpecVersion.VersionFlag.V6

    ignoredValidationKeywords = listOf("extends")
}

jsonSchema2Pojo {
    sourceFiles = fileTree("${project.projectDir}/v1") {
        include("*-v1.schema.json")
    }
    targetDirectory = file("src/generated/java")
    targetPackage = "com.projectronin.fhir.r4"
    setCustomRuleFactory(FhirRuleFactory::class.java)
    propertyWordDelimiters[2] = ' '
    removeOldOutput = true
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

// Java/Kotlin versioning
java {
    sourceCompatibility = JavaVersion.VERSION_11
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        freeCompilerArgs.set(listOf("-Xjsr305=strict"))
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}

scmVersion {
    tag {
        initialVersion(pl.allegro.tech.build.axion.release.domain.properties.TagProperties.InitialVersionSupplier { _, _ -> "1.0.0" })
        prefix.set("")
    }
    versionCreator { versionFromTag, position ->
        val supportedHeads = setOf("HEAD", "master", "main")
        if (!supportedHeads.contains(position.branch)) {
            val jiraBranchRegex = Regex("(\\w+)-(\\d+)-(.+)")
            val match = jiraBranchRegex.matchEntire(position.branch)
            val branchExtension = match?.let {
                val (project, number, _) = it.destructured
                "$project$number"
            } ?: position.branch

            "$versionFromTag-$branchExtension"
        } else {
            versionFromTag
        }
    }
}

version = scmVersion.version

tasks.jar {
    from(project.projectDir) {
        into("schema")
        include("v*/**/*.schema.json")
        exclude("**/examples")
    }
}

publishing {
    repositories {
        maven {
            name = "nexus"
            credentials {
                username = System.getenv("NEXUS_USER")
                password = System.getenv("NEXUS_TOKEN")
            }
            url = if (project.version.toString().endsWith("SNAPSHOT")) {
                uri("https://repo.devops.projectronin.io/repository/maven-snapshots/")
            } else {
                uri("https://repo.devops.projectronin.io/repository/maven-releases/")
            }
        }
    }
    publications {
        create<MavenPublication>("library") {
            from(components["java"])
        }
    }
}
