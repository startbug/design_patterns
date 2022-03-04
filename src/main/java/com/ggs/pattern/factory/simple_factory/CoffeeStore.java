package com.ggs.pattern.factory.simple_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:47
 * @Description 解决了咖啡店(CoffeeStore)和具体的咖啡(Coffee)的耦合
 * 但是又出现了工厂对象和商品对象的耦合
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
