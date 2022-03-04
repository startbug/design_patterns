package com.ggs.pattern.factory.simple_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:56
 * @Description 简单工厂模式
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        //声明Coffee类型的变量，根据不同的类型生成不同的coffee子类
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("没有该咖啡");
        }
        return coffee;
    }

}
