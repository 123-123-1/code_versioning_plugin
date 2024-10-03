package com.example.code_versioning_plugin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VersionControl {
    public  static final String fileName = "codeVersion";
    public static final String copyFile = "temp";
    private static VersionControl instance;
    private Path proPath;
    public static VersionControl getInstance() {
        if (instance == null) {
            instance = new VersionControl();
        }
        return instance;
    }
    public static void init(Path pro)throws IOException{
          VersionControl instance = getInstance();
          if(instance.proPath!=pro){
              instance.settle();
              instance.proPath = pro;
          }
          if(!Files.exists(pro)){
              throw new IOException("项目文件不存在");
          }
          Path pluginFile = pro.resolve(fileName);
          if(!Files.exists(pluginFile)){
              Files.createDirectory(pluginFile);
          }
          Path copyCode =pluginFile.resolve(copyFile);
          if(!Files.exists(copyCode)){
              Files.createDirectory(pluginFile);
          }
    }
    public void settle(){

    }
}
