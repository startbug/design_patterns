package com.ggs.pattern.p8_decorator;

/**
 * @Author lianghaohui
 * @Date 2022/3/8 13:05
 * @Description 培根类(具体的装饰者角色)
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
