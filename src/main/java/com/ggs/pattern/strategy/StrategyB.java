package com.ggs.pattern.strategy;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:18
 * @Description 具体策略类
 */
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
