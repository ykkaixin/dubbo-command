package com.github.ykkaixin.dubbocommand.services

import com.intellij.openapi.project.Project
import com.github.ykkaixin.dubbocommand.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
