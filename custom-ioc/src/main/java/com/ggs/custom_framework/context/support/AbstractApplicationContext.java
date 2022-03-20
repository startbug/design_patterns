package com.ggs.custom_framework.context.support;

import com.ggs.custom_framework.beans.factory.support.BeanDefinitionReader;
import com.ggs.custom_framework.beans.factory.support.BeanDefinitionRegistry;
import com.ggs.custom_framework.context.ApplicationContext;
import org.dom4j.DocumentException;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:51
 * @Description ApplicationContext接口的子实现类，用于立即加载
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定义用于存储bean对象的map容器
    protected Map<String, Object> singletonObjects = new HashMap<>();

    //声明配置文件的路径
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        //加载BeanDefinition对象
        beanDefinitionReader.loadDefinitions(configLocation);
        //初始化bean
        finishBeanInitialization();
    }

    //bean的初始化
    protected void finishBeanInitialization() throws Exception {
        //获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        //获取BeanDefinition对象
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            //进行bean的初始化
            getBean(beanName);
        }
    }

}
