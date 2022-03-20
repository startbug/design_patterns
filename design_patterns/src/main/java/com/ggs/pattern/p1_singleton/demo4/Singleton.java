package com.ggs.pattern.p1_singleton.demo4;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 13:02
 * @Description 双重检查锁
 */
public class Singleton {

    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
