package com.ggs.pattern.p20_visitor.extension.demo3;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:30
 * @Description
 */
public class Execute {

    public void execute(Animal a) {
        System.out.println("Animal~");
    }

    public void execute(Dog a) {
        System.out.println("Dog~");
    }

    public void execute(Cat c) {
        System.out.println("Cat~");
    }

}
