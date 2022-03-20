package com.ggs.pattern.p7_adapter.class_adapter;

/**
 * 适配者类的接口
 */
public interface TFCard {

    //从TF卡中读取数据
    String readTF();

    //往TF卡中写入数据
    void writeTF(String msg);

}