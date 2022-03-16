package com.ggs.pattern.p12_flyweight.demo;

import java.util.HashMap;

/**
 * @Author lianghaohui
 * @Date 2022/3/14 22:46
 * @Description 工厂类，将该类设计为单例
 * 静态内部类实例化单例对象
 * 构造方法通过flag参数，限制构造方法只允许调用一次，保证被实例化一次，除此之外，再调用构造方法，则抛出异常
 * readResolve方法，防止通过反序列化的方式实例化对象，破坏单例模式
 */
public class BoxFactory {

    private static boolean flag = false;

    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        synchronized (BoxFactory.class) {
            if (flag) {
                throw new RuntimeException("该类不可以手动实例化");
            }
            map = new HashMap<>();
            map.put("I", new IBox());
            map.put("L", new LBox());
            map.put("O", new OBox());
            flag = true;
        }
    }

    //根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }

    private static class BoxFactoryHandler {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public static BoxFactory getInstance() {
        return BoxFactoryHandler.INSTANCE;
    }

    public Object readResolve() {
        return BoxFactoryHandler.INSTANCE;
    }

}
