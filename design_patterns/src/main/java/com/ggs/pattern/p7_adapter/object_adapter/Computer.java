package com.ggs.pattern.p7_adapter.object_adapter;

/**
 * @Author lianghaohui
 * @Date 2022/3/7 23:42
 * @Description 计算机类
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card cannot be null");
        }
        return sdCard.readSD();
    }

}
