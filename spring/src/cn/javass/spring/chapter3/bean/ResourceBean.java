package cn.javass.spring.chapter3.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourceBean {
    
    private FileOutputStream fos;
    
    private File file;
    
    //初始化方法
    public void init() {
        System.out.println("ResourceBean被dependentbean依赖，开始执行初始化操作，谁先被初始化？");
        //加载资源,在此只是演示
//        System.out.println("ResourceBean被dependentbean依赖，执行一些预操作");
        try {
            this.fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    //销毁资源方法
    public void destroy() {
        System.out.println("ResourceBean被dependentbean依赖，要被销毁了，谁在前谁在后");
        //释放资源
//        System.out.println("ResourceBean被dependentbean依赖，执行一些清理操作");
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public FileOutputStream getFos() {
        return fos;
    }
    
    public void setFile(File file) {
        this.file = file;
    }
}
