package com.ggs.pattern.p7_adapter.object_adapter;

/**
 * @Author lianghaohui
 * @Date 2022/3/7 23:45
 * @Description
 */
public class SDAdapterTFCard implements SDCard {

    private TFCard tfCard;

    public SDAdapterTFCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
