package com.ggs.pattern.adapter.class_adapter;

/**
 * @Author lianghaohui
 * @Date 2022/3/7 23:39
 * @Description
 */
public class TDCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard read msg: hello world";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg:" + msg);
    }
}
