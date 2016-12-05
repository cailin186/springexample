package cn.javass.spring.chapter3;

import java.io.IOException;

import org.apache.derby.impl.tools.sysinfo.Main;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;
/**
 * 通过spring的InitializingBean,DisposableBean实现初始化
 * @author Administrator
 *
 */
public class HelloApiInitByspringBean implements HelloApi,InitializingBean,DisposableBean  {

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
        System.out.println("我是一个singleton的类型，我会被销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("所有的属性全部ok了"
                + "");
        
    }
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter3/lookupMethodInject.xml");
        context.getBean("initByspring");
    }

}
