package com.ggs.pattern.p1_singleton.demo2;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 12:53
 * @Description 饿汉式： 静态代码块
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

}
