package com.ggs.pattern.p14_strategy;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:20
 * @Description 促销员(环境类)
 */
public class SalesMan {

    //聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //由促销员展示促销活动的用户
    public void salesManShow() {
        strategy.show();
    }

}
