pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

    }
}

rootProject.name = "My Audio Player"
include(":app")
include(":app:extensions")
include(":lib:extensions")
include(":lib:icons_pack")
include(":lib:mediaplayer")
include(":lib:utils")
