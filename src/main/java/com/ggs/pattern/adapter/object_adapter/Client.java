package com.ggs.pattern.adapter.object_adapter;

/**
 * @Author lianghaohui
 * @Date 2022/3/7 23:43
 * @Description 对象适配器模式
 * 实现当前业务系统的业务接口，同时又将组件库中已经存在的组件聚合到适配器中
 * 例如计算机类只能使用SD卡，但是想要读取TF卡的数据
 * 那么就创建一个适配器类，实现SD卡接口，但是又继承与TF卡
 * 在SD卡的实现方法中调用TF的读取和写入方法
 * -----------------------------------------------------------
 * 注意：还有一个适配器模式是接口适配器模式，当不希望实现一个接口中所有的方法时，可以创建一个抽象类Adapter，
 * 实现所有的方法，方法体是空的的，不需要做其他事，然后我们继承该抽象类即可
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
        SDAdapterTFCard sdAdapterTFCard = new SDAdapterTFCard(new TDCardImpl());
        String msg1 = computer1.readSD(sdAdapterTFCard);
        System.out.println(msg1);
    }

}
