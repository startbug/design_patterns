package com.ggs.pattern.p2_3_factory.abstract_factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 21:49
 * @Description 抽象工厂模式
 * 工厂专门生产某一大类的产品
 * 例如苹果公司生产笔记本，手机，iPad等等多种产品
 */
public class Client {

    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }

}
