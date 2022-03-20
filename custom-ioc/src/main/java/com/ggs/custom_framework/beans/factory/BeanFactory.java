package com.ggs.custom_framework.beans.factory;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:45
 * @Description IOC容器父接口
 */
public interface BeanFactory {

    Object getBean(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException, Exception;

    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;

}
