package com.ggs.pattern.singleton.demo6;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 23:05
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }

}
