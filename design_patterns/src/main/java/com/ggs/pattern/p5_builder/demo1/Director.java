package com.ggs.pattern.p5_builder.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:27
 * @Description 指挥者，调用builder
 * Builder和Director可以合并到一起，将construct方法放到Builder中，简化结构
 * 但是这也加重了抽象建造者的职责，不太符合单一职责原则
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
