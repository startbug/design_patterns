package com.ggs.pattern.p2_3_factory.static_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:56
 * @Description 静态工厂模式，将工厂对象的方法设置为静态
 * 就不需要创建工厂对象，直接通过类名即可调用
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
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
