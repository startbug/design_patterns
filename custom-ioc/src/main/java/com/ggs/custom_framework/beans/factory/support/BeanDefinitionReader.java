package com.ggs.custom_framework.beans.factory.support;

import org.dom4j.DocumentException;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:32
 * @Description 用来解析配置文件的，接口只是定义规范
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();

    //加载配置文件并在注册表中进行注册
    void loadDefinitions(String configLocation) throws DocumentException;

}
