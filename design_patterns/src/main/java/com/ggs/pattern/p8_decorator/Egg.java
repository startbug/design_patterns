package com.ggs.pattern.p8_decorator;

/**
 * @Author lianghaohui
 * @Date 2022/3/8 13:02
 * @Description 鸡蛋类(具体的装饰者角色)
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        //计算价格
        return super.getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
