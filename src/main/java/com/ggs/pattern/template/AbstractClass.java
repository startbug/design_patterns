package com.ggs.pattern.template;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 12:36
 * @Description 抽象类（定义模板方法和基本方法）
 */
public abstract class AbstractClass {

    //模板方法定义，定义了炒菜的完整步骤，不可被重写
    public final void cookProcess() {
        pourOll();
        heatOll();
        pourVegetable();
        pourSauce();
        fry();
    }

    //第一步
    public void pourOll() {
        System.out.println("倒油");
    }

    //第二步
    public void heatOll() {
        System.out.println("热油");
    }

    //第三步
    public abstract void pourVegetable();   //菜式

    //第四步
    public abstract void pourSauce();   //调料

    //第五步
    public void fry() {
        System.out.println("开始炒菜");
    }

}
