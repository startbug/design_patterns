package com.ggs.pattern.factory.factory_method;


/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:47
 * @Description 解决了咖啡店(CoffeeStore)和具体的咖啡(Coffee)的耦合
 * 但是又出现了工厂对象和商品对象的耦合
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setCoffeeFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        //创建咖啡
        Coffee coffee = factory.createCoffee();
        //加料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
