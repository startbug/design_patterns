package com.ggs.pattern.p5_builder.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:21
 * @Description 抽象建造者
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
