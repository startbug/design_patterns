package com.ggs.pattern.adapter.class_adapter;

/**
 * @Author lianghaohui
 * @Date 2022/3/7 23:43
 * @Description 类适配器模式
 * 实现当前业务系统的业务接口，同时又继承组件库中已经存在的组件
 * 例如计算机类只能使用SD卡，但是想要读取TF卡的数据
 * 那么就创建一个适配器类，实现SD卡接口，但是又继承与TF卡
 * 在SD卡的实现方法中调用TF的读取和写入方法
 * ------------------------------------------------------------
 * 类适配器模式违背了合成服用原则，适配器类是客户类只有一个接口规范的情况下可用
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        String msg = computer.readSD(sdCard);
        System.out.println(msg);

        System.out.println("------------------------------------------------------");
        //从电脑中读取TF卡的数据,无法直接读取
        //定义适配器类
        Computer computer1 = new Computer();
        SDAdapterTFCard sdAdapterTFCard = new SDAdapterTFCard();
        String msg1 = computer1.readSD(sdAdapterTFCard);
        System.out.println(msg1);
    }

}
