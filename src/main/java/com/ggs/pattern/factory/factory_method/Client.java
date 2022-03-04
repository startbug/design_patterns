package com.ggs.pattern.factory.factory_method;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 1:18
 * @Description 当需要添加新的咖啡，只需要创建对应的Coffee对象和生产咖啡的工厂对象即可
 * 不需要修改原有的代码，符合开闭原则
 * 工厂方法模式是简单工厂模式的进一步抽象
 * 优点
 * 1.用户只需要知道具体工厂的名称就可以得到所要的产品，无需知道产品的具体创建过程
 * 2.在系统增加新的产品的时候，只需要添加具体产品类和对应的具体工厂类，无需对原工厂进行任何修改，满足开闭原则；
 * 缺点
 * 1.每添加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        LatteCoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        coffeeStore.setCoffeeFactory(latteCoffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }

}
