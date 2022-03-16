package com.ggs.pattern.p1_singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 23:34
 * @Description 随便哪一个除了枚举外的单例实现
 * 通过反射破坏单例模式
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();
        Singleton instance3 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(instance3);
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1 == instance3);
        System.out.println(singleton2 == instance3);
    }

}
