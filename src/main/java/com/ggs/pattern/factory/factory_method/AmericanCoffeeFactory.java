package com.ggs.pattern.factory.factory_method;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 1:16
 * @Description 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

}
