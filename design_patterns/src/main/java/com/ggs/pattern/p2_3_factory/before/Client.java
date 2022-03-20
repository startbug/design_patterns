package com.ggs.pattern.p2_3_factory.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:48
 * @Description 没使用工厂设计模式
 * 在java，万物皆对象，这些对象都需要创建，如果创建的时候直接new该对象，就会对该对象耦合严重，
 * 加入我们需要更换对象，所有new对象的地方都需要修改一遍，这显然是违背了软件设计的开闭原则，
 * 如果我们使用工厂模式来生产对象，我们就只和工厂打交道就可以了，彻底和对象解耦，如果需要更换对象，
 * 只需要在工厂内更换对象即可，达到了对象解耦的目的，所以说，工厂模式最大的优点就是：解耦
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }

}
