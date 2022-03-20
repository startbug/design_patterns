package com.ggs.pattern.p20_visitor;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:51
 * @Description 访问者模式
 * 定义：
 * 封装了一些作用与某种数据结构中的各种元素的操作，它可以在不改变这个数据结构的前提下定义作用于这些元素的新操作
 */
public class Client {

    public static void main(String[] args) {
        //创建Home对象
        Home home = new Home();

        //添加animal
        home.add(new Dog());
        home.add(new Cat());

        //创建主人对象
        Owner owner = new Owner();
        //让主人喂食所有的十五
        home.action(owner);

    }

}
