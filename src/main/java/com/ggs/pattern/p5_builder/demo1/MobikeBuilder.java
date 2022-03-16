package com.ggs.pattern.p5_builder.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:23
 * @Description 具体的建造者
 */
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜座驾");
    }

    @Override
    public Bike createBike() {
        return bike;
    }

}
