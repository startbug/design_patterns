package com.ggs.pattern.builder.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:26
 * @Description 具体的建造者
 */
public class OfobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("Ofo车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Ofo座架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
