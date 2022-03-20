package com.ggs.pattern.p2_3_factory.abstract_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 21:48
 * @Description 意大利风味甜品工厂
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
