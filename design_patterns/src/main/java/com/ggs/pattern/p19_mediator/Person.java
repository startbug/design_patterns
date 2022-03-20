package com.ggs.pattern.p19_mediator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:08
 * @Description 抽象同事类
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}
