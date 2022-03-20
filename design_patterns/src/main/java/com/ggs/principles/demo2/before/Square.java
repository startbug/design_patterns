package com.ggs.principles.demo2.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 22:55
 * @Description
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
