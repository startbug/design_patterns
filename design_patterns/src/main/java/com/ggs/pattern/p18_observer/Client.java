package com.ggs.pattern.p18_observer;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 21:41
 * @Description 观察者模式
 */
public class Client {

    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        //用户订阅公众号
        subscriptionSubject.attach(new WechatUser("Saber"));
        subscriptionSubject.attach(new WechatUser("士郎"));
        subscriptionSubject.attach(new WechatUser("远坂凛"));

        //公众号发布消息
        subscriptionSubject.notify("Fate Stay Night！Unlimited Blade Work");
    }

}
