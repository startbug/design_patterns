package com.ggs.pattern.p1_singleton.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 12:50
 * @Description 饿汉式: 静态成员变量
 */
public class Singleton {

    //1.私有构造方法
    private Singleton() {
    }

    //2.在本类中创建该类对象
    private static Singleton instance = new Singleton();

    //3.提供一个公共的访问方式
    public static Singleton getInstance() {
        return instance;
    }

}
