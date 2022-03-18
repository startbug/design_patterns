package com.ggs.pattern.p19_mediator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:09
 * @Description 具体的同事类（租房者）
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介联系
    public void contact(String message) {
        //租房者和中介联系
        mediator.contact(message, this);
    }

    //获取信息的方法
    public void getMessage(String message) {
        System.out.println("租房者:" + name + "获取到的信息时:" + message);
    }

}
