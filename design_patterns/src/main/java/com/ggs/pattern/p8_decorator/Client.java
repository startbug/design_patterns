package com.ggs.pattern.p8_decorator;

/**
 * @Author lianghaohui
 * @Date 2022/3/8 13:06
 * @Description 装饰者模式
 * 1.可以带来比继承更加灵活的扩展功能，使用更加方便，可以通过组合不同的装饰者对象来获取具有不同行为状态的
 * 多样化的结果。装饰者模式比继承更具良好的扩展性，完美遵循开闭原则，继承是静态的附加责任，装饰着是动态的附加责任。
 * 2.装饰类和被装饰类可以独立发展，不会互相耦合，装饰模式是继承的一个替代模式，做装饰模式可以动态扩展一个类的功能
 */
public class Client {

    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("--------------------加鸡蛋------------------------");
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("--------------------加鸡蛋------------------------");
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("--------------------加培根------------------------");
        food = new Bacon(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");
    }

}
