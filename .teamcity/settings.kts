package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script

object TestBc : BuildType({
    name = "Test_BC"
    val vcsRoot = GitVcsRoot({
        uuid = "vcs_python"
        id = "TestBc_VcsRoot"
        name = "Example of DSL VCS Root"
        url = "https://github.com/asgeek/webscraper-python.git"
    })

    vcs {
        root(vcsRoot)
    }

    steps {
        script {
            name = "test-build-step"
            scriptContent = "test.bat"
        }
    }
})
