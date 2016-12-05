package cn.javass.spring.chapter3;

import java.io.IOException;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class HelloApiInitAndDestoryTest2 implements HelloApi  {

    @Override
    public void sayHello() {
            System.out.println("我是实现者HelloApiInitAndDestoryTest:helloworld");
        
    }
    
  //初始化方法
    public void init() throws IOException {
        System.out.println("HelloApiInitAndDestoryTest被初始化了");
    }
    //销毁方法
    public void destroy() throws IOException {
        System.out.println("我是一个prototype的类型，我不会被销毁");
    }

}
