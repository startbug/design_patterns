package com.ggs.pattern.factory.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:47
 * @Description
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        //声明Coffee类型的变量，根据不同的类型生成不同的coffee子类
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("lattee".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("没有该咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
