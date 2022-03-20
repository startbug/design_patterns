package com.ggs.custom_framework.context.support;

import com.ggs.custom_framework.beans.BeanDefinition;
import com.ggs.custom_framework.beans.MutablePropertyValues;
import com.ggs.custom_framework.beans.PropertyValue;
import com.ggs.custom_framework.beans.factory.support.BeanDefinitionRegistry;
import com.ggs.custom_framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.ggs.custom_framework.utils.CustomStringUtils;

import java.lang.reflect.Method;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:57
 * @Description IOC容器具体的子实现类，用于加载类路径下的xml格式的配置文件
 * 1.在构造方法中，创建BeanDefinition对象
 * 2.在构造方法中，调用refresh()方法，用于进行配置文件加载、创建bean对象并存储到容器中
 * 3.重写父接口中getBean()方法，并实现依赖注入
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {
        }
    }

    //根据Bean对象的名称获取bean对象
    @Override
    public Object getBean(String name) throws Exception {
        //判断对象容器中是否包含指定名称的bean对象，如果包含，直接返回即可，如果不包含，需要自行创建
        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }
        //获取beanDefinition
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        //获取bean信息中的className,反射生成对象
        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        obj = clazz.newInstance();

        //进行依赖注入操作
        MutablePropertyValues mutablePropertyValues = beanDefinition.getMutablePropertyValues();

        for (PropertyValue propertyValue : mutablePropertyValues) {
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if (ref != null && ref != "") {
                //获取依赖的Bean对象
                Object bean = getBean(ref);
                String setterMethodByFieldName = CustomStringUtils.getSetterMethodByFieldName(propertyName);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.getName().equals(setterMethodByFieldName)) {
                        //获取到set方法，将属性注入到obj对象中
                        method.invoke(obj, bean);
                        break;
                    }
                }
            }
            if (value != null && value != "") {
                String setterMethodByFieldName = CustomStringUtils.getSetterMethodByFieldName(propertyName);
                Method declaredMethod = clazz.getDeclaredMethod(setterMethodByFieldName, String.class);
                //获取到set方法，将属性注入到obj对象中
                declaredMethod.invoke(obj, value);
            }
        }

        //在返回beanObject对象之后，将对象存入到Map容器中
        singletonObjects.put(name, obj);
        return obj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean == null) {
            return null;
        }
        //校验类型并强转
        return clazz.cast(bean);
    }

}
