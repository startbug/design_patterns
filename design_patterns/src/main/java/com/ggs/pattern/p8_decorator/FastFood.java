package com.ggs.pattern.p8_decorator;

/**
 * @Author lianghaohui
 * @Date 2022/3/8 12:55
 * @Description 快餐类(抽象构件角色)
 */
public abstract class FastFood {

    private float price; //价格
    private String desc; //描述

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //计算总价
    public abstract float cost();
}
