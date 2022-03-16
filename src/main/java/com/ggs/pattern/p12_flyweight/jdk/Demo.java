package com.ggs.pattern.p12_flyweight.jdk;

/**
 * @Author lianghaohui
 * @Date 2022/3/14 23:09
 * @Description 享元模式在JDK中的应用
 * Integer类使用了享元模式
 */
public class Demo {

    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("i1和i2对象是同一个对象?" + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i3和i4对象是同一个对象?" + (i3 == i4));
    }

}
