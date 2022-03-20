package com.ggs.custom_framework.beans.factory.support;

import com.ggs.custom_framework.beans.BeanDefinition;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:26
 * @Description 注册表对象
 */
public interface BeanDefinitionRegistry {

    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition definition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName);

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName);

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();


}
