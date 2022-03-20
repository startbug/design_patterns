package com.ggs.pattern.p1_singleton.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 12:52
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        //创建Singleton类对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
