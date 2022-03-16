package com.ggs.pattern.p6_proxy.static_proxy;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 22:44
 * @Description 静态代理
 */
public class Client {

    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }

}
