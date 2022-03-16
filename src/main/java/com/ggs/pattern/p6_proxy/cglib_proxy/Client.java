package com.ggs.pattern.p6_proxy.cglib_proxy;

import com.ggs.pattern.p6_proxy.jdk_proxy.TrainStation;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 23:32
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象，这个代理对象是被代理对象的子类对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true) {

        }
    }

}
