package com.ggs.pattern.p14_strategy;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:18
 * @Description 具体策略类
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
