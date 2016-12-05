package cn.javass.spring.chapter2;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class HelloImpl2 implements HelloApi {

    private String message,message1;
    
    public HelloImpl2() {
        this.message = "Hello World!";
    }

    public HelloImpl2(String message) {
        this.message = message;
    }
    public HelloImpl2(String message,String message1) {
        this.message = message+message1;
    }
    
    @Override
    public void sayHello() {
        System.out.println(message);
    }
    
}
