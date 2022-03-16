package com.ggs.pattern.p6_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 22:47
 * @Description 获取代理对象的工厂类
 * 代理对象也实现对应的接口
 */
public class ProxyFactory {
    //目标对象
    private TrainStation trainStation = new TrainStation();

    //获取代理对象的方法
    public SellTickets getProxyObject() {
        /**
         * ClassLoader loader: 类加载器，用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces: 代理类对象的接口的字节码对象
         * InvocationHandler h: 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * proxy: 代理对象，和proxyObject对象是同一个对象，在invoke方法中基本不用
                     * method: 对接口中的方法进行封装的method对象
                     * args: 调用方法的实际参数
                     * 返回值: 方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke方法执行了");
                        System.out.println("收取代理费用(jdk动态代理)");
                        Object obj = method.invoke(trainStation, args);
                        return obj;

                    }
                }
        );
        return proxyObject;
    }
}
