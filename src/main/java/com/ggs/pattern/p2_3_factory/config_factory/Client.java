package com.ggs.pattern.p2_3_factory.config_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 22:06
 * @Description 模式扩展
 * 简单工厂+配置文件接触耦合
 * 在共擦汗给你类中加载配置文件中的全类名，并存储起来，使用的时候直接获取即可
 */
public class Client {

    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
//        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }

}
