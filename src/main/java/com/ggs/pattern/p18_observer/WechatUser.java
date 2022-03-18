package com.ggs.pattern.p18_observer;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 21:46
 * @Description 具体的观察者角色类
 */
public class WechatUser implements Observer {

    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "接收到订阅的内容：" + message);
    }

}
