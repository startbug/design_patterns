package com.ggs.pattern.p7_adapter.class_adapter;

/**
 * @Author lianghaohui
 * @Date 2022/3/7 23:45
 * @Description
 */
public class SDAdapterTFCard extends TDCardImpl implements SDCard {


    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return super.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        super.writeTF(msg);
    }
}
