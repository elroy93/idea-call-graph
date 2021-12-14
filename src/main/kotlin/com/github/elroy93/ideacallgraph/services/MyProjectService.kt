package com.github.elroy93.ideacallgraph.services

import com.intellij.openapi.project.Project
import com.github.elroy93.ideacallgraph.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
