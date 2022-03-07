package com.ggs.pattern.proxy.cglib_proxy;

import com.ggs.pattern.proxy.jdk_proxy.TrainStation;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 23:29
 * @Description 代理对象工厂，用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        //1.创建Enhancer对象，类似于jdk中的Proxy对象
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("方法执行了");
        System.out.println("收取中间代理费(cglib代理)");
        //要调用目标对象的方法
        Object obj = method.invoke(trainStation, objects);
        return obj;
    }
}
