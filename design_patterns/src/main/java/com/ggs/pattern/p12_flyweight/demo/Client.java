package com.ggs.pattern.p12_flyweight.demo;

/**
 * @Author lianghaohui
 * @Date 2022/3/14 22:59
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox iBox = BoxFactory.getInstance().getShape("I");
        iBox.display("灰色");

        //获取L图形对象
        AbstractBox LBox = BoxFactory.getInstance().getShape("L");
        LBox.display("蓝色");

        //获取O图形对象
        AbstractBox OPurpleBox = BoxFactory.getInstance().getShape("O");
        OPurpleBox.display("紫色");

        //获取O图形对象
        AbstractBox ORedBox = BoxFactory.getInstance().getShape("O");
        OPurpleBox.display("红色");

        System.out.println(OPurpleBox == ORedBox);
    }

}
