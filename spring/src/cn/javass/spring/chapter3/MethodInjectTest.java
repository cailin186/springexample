package cn.javass.spring.chapter3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;
import cn.javass.spring.chapter3.bean.Printer;



public class MethodInjectTest {
    
    @Test
    public void testLookup() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter3/lookupMethodInject.xml");
        System.out.println("=======singleton sayHello======");
        HelloApi helloApi0 = context.getBean("helloApi1", HelloApi.class);
        helloApi0.sayHello();
      
        
        HelloApi helloApi1= context.getBean("helloApi1", HelloApi.class);
        helloApi1.sayHello();
        
        //两个单例的bean是相等的对象
        System.out.println(helloApi0==helloApi1);
         //对于原型的bean每次获取都会被调用一次，因此他的初始化方法会被调用10次
         for(int i=0;i<10;i++){
             HelloApi helloApi2= context.getBean("helloApi2", HelloApi.class);
         }
         
         HelloApi inittest= context.getBean("inittest", HelloApi.class);
         inittest.sayHello();
         HelloApi inittest1= context.getBean("inittest1", HelloApi.class);
         
         context.close();
       
       
        //原型的和单例的对象是不一样的
//        System.out.println(helloApi2==helloApi1);
        
        
//        helloApi1 = context.getBean("helloApi1", HelloApi.class);
//        helloApi1.sayHello();
//        System.out.println("=======prototype sayHello======");
//        HelloApi helloApi2 = context.getBean("helloApi2", HelloApi.class);
//        helloApi2.sayHello();
//        helloApi2 = context.getBean("helloApi2", HelloApi.class);
//        helloApi2.sayHello();
    }
    
   // @Test
    public void testMethodReplacer() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter3/methodReplacerInject.xml");
        Printer printer = context.getBean("printer", Printer.class);
        printer.print("我将被替换");
    }
}

