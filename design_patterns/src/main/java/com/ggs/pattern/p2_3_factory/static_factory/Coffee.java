package com.ggs.pattern.p2_3_factory.static_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:44
 * @Description
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }

}
