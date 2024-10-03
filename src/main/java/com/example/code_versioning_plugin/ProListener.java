package com.example.code_versioning_plugin;


import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Path;

public class ProListener implements com.intellij.openapi.project.ProjectManagerListener{

    //项目打开时初始化
    public void projectOpened(@NotNull Project pro) {
         Path proDir = Path.of(pro.getBasePath());
        try {
            VersionControl.init(proDir);
        } catch (IOException e) {
            System.out.println("Error initializing version control : " +e.getMessage());
        }
    }


    //项目关闭时的操作
    public void projectClosed(@NotNull Project pro) {
        VersionControl.getInstance().settle();
    }
}