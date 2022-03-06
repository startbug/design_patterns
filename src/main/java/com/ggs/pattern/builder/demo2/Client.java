package com.ggs.pattern.builder.demo2;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:55
 * @Description 建造者模式 Builder实现实体类的创建
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = Phone.builder().cpu("英特尔")
                .memory("金士顿")
                .motherboard("华硕主板")
                .screen("惠普显示器")
                .build();
        System.out.println(phone);
    }

}
