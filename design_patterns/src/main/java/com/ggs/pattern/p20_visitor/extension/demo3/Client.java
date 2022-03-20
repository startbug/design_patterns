package com.ggs.pattern.p20_visitor.extension.demo3;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:28
 * @Description ，双分派：
 * 所谓双分派技术就是在选择一个方法的时候，不仅仅要根据消息接收者（receiver）的运行时区别，
 * 还要根据参数的运行时区别。
 */
public class Client {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        //accept执行的是具体实现类的方法，
        //具体的方法又调用了execute的方法，传入自身对象，
        //execute中会根据this对象的类型去执行对应的重载方法
        //重写，动态分配   重载：静态分配
        Execute execute = new Execute();
        a.accept(execute);
        a1.accept(execute);
        a2.accept(execute);

    }

}
