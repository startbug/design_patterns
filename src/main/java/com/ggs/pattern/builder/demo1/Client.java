package com.ggs.pattern.builder.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:27
 * @Description
 */
public class Client {

    public static void main(String[] args) {
//        Director director = new Director(new OfobikeBuilder());
        Director director = new Director(new MobikeBuilder());
        Bike construct = director.construct();
        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());
    }

}
