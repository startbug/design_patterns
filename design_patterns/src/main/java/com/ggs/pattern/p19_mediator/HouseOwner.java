package com.ggs.pattern.p19_mediator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:12
 * @Description 具体同事类
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //获取信息的方法
    public void getMessage(String message) {
        System.out.println("房东:" + name + "获取到的信息时:" + message);
    }

    //和中介联系
    public void contact(String message) {
        //房东和中介联系
        mediator.contact(message, this);
    }

}
