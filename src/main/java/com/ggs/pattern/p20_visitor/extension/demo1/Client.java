package com.ggs.pattern.p20_visitor.extension.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:28
 * @Description
 * 动态分派(Dynamic Dispatch)
 * 发生在运行时期，动态分派动态地置换掉某个方法。Java通过方法的重写支持动态分派。
 */
public class Client {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.execute();

        Animal b = new Cat();
        b.execute();
    }

}
