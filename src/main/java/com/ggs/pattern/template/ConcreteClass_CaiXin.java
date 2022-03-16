package com.ggs.pattern.template;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 12:40
 * @Description 炒菜心类
 */
public class ConcreteClass_CaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("放菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("放辣椒");
    }
}
