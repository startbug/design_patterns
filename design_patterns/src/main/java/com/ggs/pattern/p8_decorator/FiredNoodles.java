package com.ggs.pattern.p8_decorator;

/**
 * @Author lianghaohui
 * @Date 2022/3/8 12:58
 * @Description 炒面(具体构件角色)
 */
public class FiredNoodles extends FastFood {

    public FiredNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
