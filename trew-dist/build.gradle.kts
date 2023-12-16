plugins {
    id("project.publishing-conventions")
}

repositories {
    maven("https://repo.unnamed.team/repository/unnamed-public/")
}

dependencies {
    api(project(":api"))
    api(libs.inject.trew)
}