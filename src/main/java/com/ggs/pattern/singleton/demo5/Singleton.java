package com.ggs.pattern.singleton.demo5;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 22:55
 * @Description 懒汉式
 * 静态内部类单例模式中实例由于内部类创建，由于JVM在加载外部类的过程中，是不会加载静态内部类，
 * 只有静态内部类的属性/方法被调用时才会被加载，并初始化其静态属性，静态属性由于被static修饰，
 * 保证只会被实例化一次，并且严格保证实例化顺序
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
