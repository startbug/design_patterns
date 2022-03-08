package com.ggs.pattern.decorator;

/**
 * @Author lianghaohui
 * @Date 2022/3/8 12:57
 * @Description 炒饭(具体构件角色)
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭"); //10块钱的炒饭
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
