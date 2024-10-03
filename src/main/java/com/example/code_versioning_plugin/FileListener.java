package com.example.code_versioning_plugin;

import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.vfs.VirtualFile;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;



public class FileListener implements com.intellij.openapi.fileEditor.FileEditorManagerListener {
    @Override
    public void fileOpened(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
        // 文件打开时的逻辑

    }
}
