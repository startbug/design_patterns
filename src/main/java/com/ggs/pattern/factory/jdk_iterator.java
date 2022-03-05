package com.ggs.pattern.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 22:11
 * @Description 单列集合获取迭代器的方法就是用到了工厂方法模式
 * Collection接口是抽象工厂类，ArrayList是具体的工厂类
 * Iterator接口是抽象产品类，ArrayList中的私有内部类Itr是具体的产品类
 * 在具体工厂中调用iterator()创建具体的产品对象
 * 1.DateFormat类中的getInstance()方法使用的是工厂模式
 * 2.Calendar类中的getInstance()方法使用的是工厂模式
 */
public class jdk_iterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("艾伦");
        list.add("Elsa");
        list.add("凛");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }


    }

}
