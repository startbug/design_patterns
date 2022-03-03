package com.ggs.principles.demo2.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:06
 * @Description 正方形
 */
public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }
}
