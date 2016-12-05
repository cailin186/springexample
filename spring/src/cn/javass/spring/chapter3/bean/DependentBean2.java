package cn.javass.spring.chapter3.bean;

import java.io.IOException;

public class DependentBean2 {
    
    ResourceBean resourceBean;
    


    //初始化方法
    public void init() throws IOException {
        System.out.println("DependentBean2也依赖resourcebean，dependentbean也依赖resourcebean他们俩谁先谁后被初始化");
    }
    //销毁方法
    public void destroy() throws IOException {
        System.out.println("DependentBean2也依赖resourcebean，dependentbean也依赖resourcebean他们俩谁先谁后被销毁？");
    }
    
    public void setResourceBean(ResourceBean resourceBean) {
        this.resourceBean = resourceBean;
    }
}
