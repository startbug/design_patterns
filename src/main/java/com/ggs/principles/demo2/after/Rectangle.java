package com.ggs.principles.demo2.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:07
 * @Description 长方形类
 */
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
