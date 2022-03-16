package com.ggs.pattern.strategy;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:18
 * @Description 具体策略类
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下的商品");
    }
}
