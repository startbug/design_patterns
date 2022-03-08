package com.ggs.pattern.decorator;

/**
 * @Author lianghaohui
 * @Date 2022/3/8 12:59
 * @Description 装饰者类(抽象装饰者角色)
 */
public abstract class Garnish extends FastFood {

    //声明开餐类的变量(聚合FastFood类，不在当前类中new，就是聚合;在类中new则是组合)
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
