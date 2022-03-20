package com.ggs.pattern.p1_singleton.demo10;

import java.io.Serializable;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:08
 * @Description 序列化、反序列化破坏单例模式的解决办法
 * 在Singleton类中添加readResolve()方法，在反序列化时被反射调用，
 * 如果定义了该方法，就返回该方法的值，如果没有定义，ze'fan'hui
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //当调用反序列化时，会自动调用该方法，将该方法返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
