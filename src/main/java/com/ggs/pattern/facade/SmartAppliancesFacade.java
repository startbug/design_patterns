package com.ggs.pattern.facade;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 23:02
 * @Description 外观类, 用户主要和该类对象交互
 */
public class SmartAppliancesFacade {

    private Light light;
    private TV tv;
    private Air air;


    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.air = new Air();
    }

    //通过语音控制
    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的话!");
        }
    }

    //一键关闭
    private void off() {
        light.off();
        air.off();
        tv.off();
    }

    //一键开启
    private void on() {
        light.on();
        air.on();
        tv.on();
    }

}
