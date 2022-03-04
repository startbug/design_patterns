package com.ggs.pattern.singleton.demo5;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 23:00
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
