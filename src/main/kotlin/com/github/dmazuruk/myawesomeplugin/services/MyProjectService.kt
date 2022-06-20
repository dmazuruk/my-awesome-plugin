package com.github.dmazuruk.myawesomeplugin.services

import com.intellij.openapi.project.Project
import com.github.dmazuruk.myawesomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
