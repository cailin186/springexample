package cn.javass.spring.chapter3;


import cn.javass.spring.chapter2.helloworld.HelloApi;
import cn.javass.spring.chapter3.bean.Printer;

public abstract class HelloImpl5 implements HelloApi {
    
    private Printer printer;
    
    @Override
    public void sayHello() {
        printer.print("setter");
        createPrototypePrinter().print("prototype");
        createSingletonPrinter().print("singleton");
    }
    
    public abstract Printer createPrototypePrinter();
        

    public Printer createSingletonPrinter() {
        System.out.println("该方法不会被执行，如果输出就错了");
        return new Printer();
    }
    
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
    //初始化方法
    public void init(){
        System.out.println("我被初始化了");
    }
    //销毁方法
    public void destroy()  {
        System.out.println("我要被销毁了");
      
    }
}
