package com.ggs.pattern.p12_flyweight.demo;

/**
 * @Author lianghaohui
 * @Date 2022/3/14 22:43
 * @Description 抽象享元角色
 */
public abstract class AbstractBox {

    //获取图形的方法
    public abstract String getShape();

    //显示图形及颜色
    public void display(String color) {
        System.out.println("方块形状:" + getShape() + ",颜色" + color);
    }

}
