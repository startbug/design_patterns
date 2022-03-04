package com.ggs.pattern.factory.static_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:57
 * @Description 静态工厂模式，不属于23种设计模式
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }

}
