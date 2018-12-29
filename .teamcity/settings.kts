package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script

object TestBc : BuildType({
    name = "Test_BC"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "test-build-step"
            scriptContent = "test.bat"
        }
    }
})
