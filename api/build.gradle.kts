plugins {
    alias(libs.plugins.agp.lib)
    `maven-publish`
    signing
}

android {
    namespace = "io.github.libxposed.api"
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("proguard-rules.pro")
    }

    buildFeatures {
        androidResources = false
        buildConfig = false
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_21
        sourceCompatibility = JavaVersion.VERSION_21
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

publishing {
    publications {
        register<MavenPublication>("libxposed-api") {
            artifactId = "libxposed-api"
            group = "io.github.decryptable"
            version = "1.0.0"
            pom {
                name.set("libxposed-api")
                description.set("Modern Xposed API")
                url.set("https://github.com/decryptable/libxposed-api")
                licenses {
                    license {
                        name.set("Apache License 2.0")
                        url.set("https://github.com/decryptable/libxposed-api/blob/master/LICENSE")
                    }
                }
                developers {
                    developer {
                        name.set("decryptable")
                        url.set("https://decryptable.github.io")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/decryptable/libxposed-api.git")
                    url.set("https://github.com/decryptable/libxposed-api")
                }
            }
            afterEvaluate {
                from(components.getByName("release"))
            }
        }
    }
    repositories {
        mavenLocal()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/decryptable/libxposed-api")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

dependencies {
    compileOnly(libs.annotation)
    lintPublish(project(":checks"))
}
