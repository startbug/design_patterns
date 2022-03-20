package com.ggs.pattern.p13_template;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 12:42
 * @Description 模板方法模式
 * 优点
 * 1.提高代码的复用性
 *  将相同部分的代码放在抽象的父类中，而讲不通的代码放入到不同的子类中
 * 2.实现反向控制
 *  通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为，实现反向控制，符合开闭原则
 *
 */
public class Client {

    public static void main(String[] args) {
        //炒包菜
        AbstractClass chaocai = new ConcreteClass_BaoCai();
//        AbstractClass chaocai = new ConcreteClass_CaiXin();

        chaocai.cookProcess();
    }

}
