package com.ggs.pattern.p5_builder.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:20
 * @Description 产品类 包含车座，车架等组件
 */
public class Bike {

    private String frame;

    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
