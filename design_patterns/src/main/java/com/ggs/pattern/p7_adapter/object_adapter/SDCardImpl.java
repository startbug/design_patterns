package com.ggs.pattern.p7_adapter.object_adapter;

/**
 * @Author lianghaohui
 * @Date 2022/3/7 23:41
 * @Description
 */
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello world";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }

}
