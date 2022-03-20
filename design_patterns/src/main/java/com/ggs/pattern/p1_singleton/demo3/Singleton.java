package com.ggs.pattern.p1_singleton.demo3;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 12:56
 * @Description 懒汉式 线程不安全
 * 首次使用才会创建对象,相对来说比懒汉式省内存
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton singleton;

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
