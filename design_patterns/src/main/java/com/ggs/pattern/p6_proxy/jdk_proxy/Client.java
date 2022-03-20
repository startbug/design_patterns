package com.ggs.pattern.p6_proxy.jdk_proxy;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 22:51
 * @Description jdk动态代理
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //3.调用卖票的方法
        proxyObject.sell();

        /**
         * 获取代理对象的类名
         * 启动arthas: java -jar arthas-boot.jar
         * 通过jad命令查看代理对象在内存中的代码
         * jad com.sun.proxy.$Proxy0
         * 详情查看：通过arthas分析内存中代理对象的代码.txt
         */

        System.out.println(proxyObject.getClass());

        //让程序一直运行
        while(true){

        }
    }
}
