package com.ggs.pattern.p2_3_factory.factory_method;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 1:16
 * @Description 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
