package com.ggs.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 21:59
 * @Description
 */
public class CoffeeFactory {

    //加载配置文件
    private static Map<String, Coffee> map = new HashMap<>();

    static {
        InputStream is = null;
        try {
            Properties properties = new Properties();
            is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(is);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                Class<?> clazz = Class.forName(className);
                Constructor<?> constructor = clazz.getConstructor();
                Coffee coffee = (Coffee) constructor.newInstance();
                map.put((String) key, coffee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Coffee createCoffee(String name) {
        Coffee coffee = map.get(name);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
