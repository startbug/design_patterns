package com.ggs.pattern.factory.abstract_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 21:47
 * @Description 美式风味的甜品工厂
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
