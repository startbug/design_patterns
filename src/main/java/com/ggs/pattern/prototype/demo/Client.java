package com.ggs.pattern.prototype.demo;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 0:26
 * @Description
 * 克隆后的对象和new出来的对象不是同一个
 * clone对象的时候，也不是调用构造方法创建的
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        //克隆对象
        Realizetype clone = realizetype.clone();

        System.out.println(realizetype);
        System.out.println(clone);

    }

}
